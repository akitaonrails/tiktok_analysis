package X;

import Y.AgS288S0100000_7;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01k5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestSheet$initObserver$1$1", f = "LiveInviteGuestSheet.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C419101k5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveInviteGuestSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C419101k5(LiveInviteGuestSheet liveInviteGuestSheet, InterfaceC1364105Vn<? super C419101k5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveInviteGuestSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C419101k5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveInviteGuestSheet@3253.initObserver$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = ((LiveInviteGuestViewModel) this.LLILLJJLI.LLJLLL.getValue()).LLILLJJLI;
            AgS288S0100000_7 agS288S0100000_7 = new AgS288S0100000_7(this.LLILLJJLI, 8);
            this.LL = 1;
            if (anonymousClass0951.collect(agS288S0100000_7, this) == objLJFF) {
                C1C7U.LIZIZ("LiveInviteGuestSheet@3253.initObserver$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
