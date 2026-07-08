package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpdateUserSettings;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.ccl.net.FetchConversationResponse;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS574S0100000_30;
import njp.a;

/* JADX INFO: renamed from: X.0yaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$initTako$6", f = "MessageOperatorHandler.kt", l = {366, 377}, m = "invokeSuspend")
public final class C1863330yaZ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public ConversationInfo LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1863280yaU LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863330yaZ(C1863280yaU c1863280yaU, C013C c013c, InterfaceC1364105Vn<? super C1863330yaZ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = c1863280yaU;
        this.LLILZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1863330yaZ(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ConversationInfo conversationInfo;
        boolean zBooleanValue;
        String str;
        String str2;
        UpdateUserSettings updateUserSettings;
        Boolean bool;
        Object objLJI = obj;
        C1C7U.LIZ("MessageOperatorHandler@b589.initTako$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    conversationInfo = this.LL;
                    C155000ia.LIZIZ(objLJI);
                    String str3 = C1863280yaU.LJIILLIIL;
                    C1870240yli.LIZ(new AwS574S0100000_30(conversationInfo, 203), false);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.initTako$6");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            C1863280yaU c1863280yaU = this.LLILLL;
            long j = c1863280yaU.LIZLLL;
            int i2 = c1863280yaU.LJ;
            this.LLILLJJLI = 1;
            objLJI = c1863980ybc.LJI(i2, j, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("MessageOperatorHandler@b589.initTako$6");
                return objLJFF;
            }
        }
        conversationInfo = ((FetchConversationResponse) objLJI).conversation;
        C013C c013c = this.LLILZ;
        if (conversationInfo != null && (updateUserSettings = conversationInfo.conversationUserSettings) != null && (bool = updateUserSettings.enableImageRecord) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c013c.element = zBooleanValue;
        if (conversationInfo != null) {
            str = conversationInfo.conversationId;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (conversationInfo != null) {
                str2 = conversationInfo.conversationId;
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str2, this.LLILLL.LJII.LIZIZ)) {
                this.LLILLL.LJI.clearAllTables();
                C1863280yaU c1863280yaU2 = this.LLILLL;
                c1863280yaU2.LJII = new u2(false, null, 0L, 0L, null, false, false, 0, false, false, false, false, null, 0L, 0, 32766);
                c1863280yaU2.LJIIJ = C09IR.LIZIZ(1, 1, null, 4);
                C1863280yaU c1863280yaU3 = this.LLILLL;
                this.LL = conversationInfo;
                this.LLILLJJLI = 2;
                if (c1863280yaU3.LJJLIIIJJIZ(this, AFwS271S0000000_28.get$arr$(434), false) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.initTako$6");
                    return objLJFF;
                }
                String str32 = C1863280yaU.LJIILLIIL;
                C1870240yli.LIZ(new AwS574S0100000_30(conversationInfo, 203), false);
            } else {
                String str4 = C1863280yaU.LJIILLIIL;
                C1870240yli.LIZ(AFwS219S0000000_30.get$arr$(104), false);
            }
        } else {
            String str5 = C1863280yaU.LJIILLIIL;
            C1870240yli.LIZ(AFwS219S0000000_30.get$arr$(105), false);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.initTako$6");
        return unit2;
    }
}
