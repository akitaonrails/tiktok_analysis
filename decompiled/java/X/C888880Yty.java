package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.engine.MessageRequestNoticeEngine$triggerShow$1$1$2$1", f = "MessageRequestNoticeEngine.kt", l = {}, m = "invokeSuspend")
public final class C888880Yty extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C888890Ytz LL;
    public final /* synthetic */ InterfaceC888860Ytw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C888880Yty(C888890Ytz c888890Ytz, InterfaceC888860Ytw interfaceC888860Ytw, InterfaceC1364105Vn<? super C888880Yty> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c888890Ytz;
        this.LLILLJJLI = interfaceC888860Ytw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C888880Yty(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager supportFragmentManager;
        C1C7U.LIZ("MessageRequestNoticeEngine@fb1d.triggerShow$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C888890Ytz c888890Ytz = this.LL;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c888890Ytz.LIZIZ);
        Fragment fragment = c888890Ytz.LIZ;
        if (fragment != null && !fragment.isDetached() && c888890Ytz.LIZ.getHost() != null && !c888890Ytz.LIZ.isRemoving() && c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && !supportFragmentManager.LJLJJI() && !c19egLIZIZ.isDestroyed() && !c19egLIZIZ.isFinishing()) {
            this.LLILLJJLI.LJII(this.LL.LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestNoticeEngine@fb1d.triggerShow$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
