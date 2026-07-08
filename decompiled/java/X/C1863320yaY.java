package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoMessageReadResponse;
import defpackage.r2;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0yaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$dispatchMsgRead$1", f = "MessageOperatorHandler.kt", l = {3548}, m = "invokeSuspend")
public final class C1863320yaY extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public SubConversationConfig LL;
    public u2 LLILLJJLI;
    public C1863280yaU LLILLL;
    public Message LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ r2 LLIZ;
    public final /* synthetic */ SubConversationConfig LLIZLLLIL;
    public final /* synthetic */ u2 LLJ;
    public final /* synthetic */ C1863280yaU LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863320yaY(r2 r2Var, SubConversationConfig subConversationConfig, u2 u2Var, C1863280yaU c1863280yaU, InterfaceC1364105Vn<? super C1863320yaY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLIZ = r2Var;
        this.LLIZLLLIL = subConversationConfig;
        this.LLJ = u2Var;
        this.LLJI = c1863280yaU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863320yaY(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Message message;
        SubConversationConfig subConversationConfig;
        u2 u2Var;
        C1863280yaU c1863280yaU;
        long j;
        Boolean boolValueOf;
        long j2;
        Object objLJJ = obj;
        C1C7U.LIZ("MessageOperatorHandler@b589.dispatchMsgRead$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        if (i != 0) {
            if (i == 1) {
                j2 = this.LLILZIL;
                message = this.LLILZ;
                c1863280yaU = this.LLILLL;
                u2Var = this.LLILLJJLI;
                subConversationConfig = this.LL;
                C155000ia.LIZIZ(objLJJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJ);
            r2 r2Var = this.LLIZ;
            message = r2Var.LIZJ;
            subConversationConfig = this.LLIZLLLIL;
            u2Var = this.LLJ;
            c1863280yaU = this.LLJI;
            if (subConversationConfig.subConversationId.length() != 0 && !C1861740yY0.LIZ(subConversationConfig.subConversationId) && !message.isPush) {
                j = message.subServerSeq;
            } else {
                j = message.serverSeq;
            }
            String str = null;
            if (C123100dR.LIZ(subConversationConfig.subConversationId)) {
                boolValueOf = Boolean.valueOf(message.isPush);
            } else {
                boolValueOf = null;
            }
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            String str2 = u2Var.LIZIZ;
            if (C123100dR.LIZ(subConversationConfig.subConversationId) && subConversationConfig.status != 0) {
                str = subConversationConfig.subConversationId;
            }
            String str3 = message.msgId;
            String str4 = r2Var.LIZ().LJ;
            this.LL = subConversationConfig;
            this.LLILLJJLI = u2Var;
            this.LLILLL = c1863280yaU;
            this.LLILZ = message;
            this.LLILZIL = j;
            this.LLILZLL = 1;
            j2 = j;
            objLJJ = c1863980ybc.LJJ(str2, str, j, str3, str4, boolValueOf, this);
            if (objLJJ == objLJFF) {
                C1C7U.LIZIZ("MessageOperatorHandler@b589.dispatchMsgRead$1");
                return objLJFF;
            }
        }
        long j3 = ((TakoMessageReadResponse) objLJJ).msgSeqId;
        C801390Vc9 c801390Vc9 = (C801390Vc9) C13LP.LJJJLL(c1863280yaU.LJI.LIZ().LJIILIIL(u2Var.LIZIZ, subConversationConfig.subConversationId));
        if (c801390Vc9 != null) {
            long jMax = Math.max(j3, c801390Vc9.LJ);
            c1863280yaU.LJI.LIZ().LJII(jMax, u2Var.LIZIZ, subConversationConfig.subConversationId);
            subConversationConfig.readCursor = jMax;
        }
        if (subConversationConfig.readCursor < j2 && message.LIZ) {
            message.LIZ = false;
        }
        c1863280yaU.LJJJLIIL(message, false, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.dispatchMsgRead$1");
        return unit;
    }
}
