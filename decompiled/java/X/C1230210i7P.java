package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.GroupInvitationImpl$checkGroupTypeForLite$1$onFailure$1", f = "GroupInvitationImpl.kt", l = {348}, m = "invokeSuspend")
public final class C1230210i7P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;
    public final /* synthetic */ GroupInvitePopupResponse LLILZ;
    public final /* synthetic */ InterfaceC1230230i7R LLILZIL;
    public final /* synthetic */ WeakReference<Function0<Unit>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230210i7P(String str, ViewGroup viewGroup, GroupInvitePopupResponse groupInvitePopupResponse, InterfaceC1230230i7R interfaceC1230230i7R, WeakReference<Function0<Unit>> weakReference, InterfaceC1364105Vn<? super C1230210i7P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = viewGroup;
        this.LLILZ = groupInvitePopupResponse;
        this.LLILZIL = interfaceC1230230i7R;
        this.LLILZLL = weakReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1230210i7P(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupInvitationImpl@19a2.checkGroupTypeForLite$1$onFailure$1");
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
            C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LLILLJJLI);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1230220i7Q c1230220i7Q = new C1230220i7Q(this.LLILLL, c0y8tLJIL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1230220i7Q) == objLJFF) {
                C1C7U.LIZIZ("GroupInvitationImpl@19a2.checkGroupTypeForLite$1$onFailure$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupInvitationImpl@19a2.checkGroupTypeForLite$1$onFailure$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
