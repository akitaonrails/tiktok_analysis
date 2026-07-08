package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.GroupInvitationImpl$checkGroupTypeForLite$1$onFailure$1$1", f = "GroupInvitationImpl.kt", l = {}, m = "invokeSuspend")
public final class C1230220i7Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ViewGroup LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;
    public final /* synthetic */ GroupInvitePopupResponse LLILLL;
    public final /* synthetic */ InterfaceC1230230i7R LLILZ;
    public final /* synthetic */ WeakReference<Function0<Unit>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230220i7Q(ViewGroup viewGroup, C0Y8T c0y8t, GroupInvitePopupResponse groupInvitePopupResponse, InterfaceC1230230i7R interfaceC1230230i7R, WeakReference<Function0<Unit>> weakReference, InterfaceC1364105Vn<? super C1230220i7Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewGroup;
        this.LLILLJJLI = c0y8t;
        this.LLILLL = groupInvitePopupResponse;
        this.LLILZ = interfaceC1230230i7R;
        this.LLILZIL = weakReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230220i7Q(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupInvitationImpl@19a2.checkGroupTypeForLite$1$onFailure$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
        ViewGroup viewGroup = this.LL;
        C0Y8T c0y8t = this.LLILLJJLI;
        GroupInvitePopupResponse groupInvitePopupResponse = this.LLILLL;
        InterfaceC1230230i7R interfaceC1230230i7R = this.LLILZ;
        WeakReference<Function0<Unit>> weakReference = this.LLILZIL;
        c1230440i7m.getClass();
        C1230440i7m.LJFF(viewGroup, c0y8t, groupInvitePopupResponse, interfaceC1230230i7R, weakReference);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupInvitationImpl@19a2.checkGroupTypeForLite$1$onFailure$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
