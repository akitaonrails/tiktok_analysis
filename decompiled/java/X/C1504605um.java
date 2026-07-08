package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ext.MessageSafetyExtKt$updateUnmask$1", f = "MessageSafetyExt.kt", l = {104}, m = "invokeSuspend")
public final class C1504605um extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1504605um(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C1504605um> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1504605um(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int inboxType;
        C1C7U.LIZ("MessageSafetyExtKt@bd8d.updateUnmask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C869590Y9l c869590Y9l = this.LLILLJJLI;
                this.LL = 1;
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId());
                TikTokImApi tikTokImApiLIZJ = C1477105qL.LIZJ();
                if (c0y8tLIZ != null) {
                    inboxType = c0y8tLIZ.getInboxType();
                } else {
                    inboxType = -1;
                }
                Object objUnmask = tikTokImApiLIZJ.unmask(inboxType, c869590Y9l.getConversationType(), c869590Y9l.getConversationId(), c869590Y9l.getConversationShortId(), c869590Y9l.getMsgId(), 3, this);
                if (objUnmask != C099R.LJFF()) {
                    objUnmask = Unit.LIZ;
                }
                if (objUnmask == objLJFF) {
                    C1C7U.LIZIZ("MessageSafetyExtKt@bd8d.updateUnmask$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageSafetyExtKt@bd8d.updateUnmask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
