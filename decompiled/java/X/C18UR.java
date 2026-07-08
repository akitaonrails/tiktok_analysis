package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.send.service.IMSendMessageService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18UR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.component.AiChatMessageActionComponent$sendMessage$1", f = "AiChatMessageActionComponent.kt", l = {159}, m = "invokeSuspend")
public final class C18UR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMSendMessageService LLILLJJLI;
    public final /* synthetic */ C18UJ LLILLL;
    public final /* synthetic */ C18UQ LLILZ;
    public final /* synthetic */ C18UZ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18UR(IMSendMessageService iMSendMessageService, C18UJ c18uj, C18UQ c18uq, C18UZ c18uz, InterfaceC1364105Vn<? super C18UR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMSendMessageService;
        this.LLILLL = c18uj;
        this.LLILZ = c18uq;
        this.LLILZIL = c18uz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18UR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatMessageActionComponent@634.sendMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMSendMessageService iMSendMessageService = this.LLILLJJLI;
            C21301918Xx c21301918Xx = new C21301918Xx(this.LLILLL.LIZLLL, this.LLILZ, this.LLILZIL, new C18UU(this.LLILZ));
            this.LL = 1;
            if (iMSendMessageService.LIZIZ(c21301918Xx, this) == objLJFF) {
                C1C7U.LIZIZ("AiChatMessageActionComponent@634.sendMessage$1");
                return objLJFF;
            }
        }
        C18UQ c18uq = this.LLILZ;
        C18UT c18utLJIIIZ = c18uq.LJIIIZ();
        if (c18utLJIIIZ != null) {
            c18utLJIIIZ.LIZIZ = C18UV.SAVE_DB;
            C21290818Tq.LIZJ("AiChatSendMessageStageTracker", "onEndParams2Message");
            c18utLJIIIZ.LJFF = Long.valueOf(SystemClock.uptimeMillis());
        }
        c18uq.LJIIJ(true, C18UV.SAVE_DB, true, null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatMessageActionComponent@634.sendMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
