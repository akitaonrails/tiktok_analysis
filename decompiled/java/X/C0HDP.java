package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment$saveUserSelection$1", f = "SocialAvatarReviewFragment.kt", l = {590, 593}, m = "invokeSuspend")
public final class C0HDP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0HDR LL;
    public int LLILLJJLI;
    public final /* synthetic */ SocialAvatarReviewFragment LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDP(SocialAvatarReviewFragment socialAvatarReviewFragment, boolean z, boolean z2, InterfaceC1364105Vn<? super C0HDP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = socialAvatarReviewFragment;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDP(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarReviewFragment@1d80.saveUserSelection$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (C0HDR e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0HDI c0hdi = new C0HDI(e, this.LLILLL, null);
            this.LL = e;
            this.LLILLJJLI = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c0hdi) == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.saveUserSelection$1");
                return objLJFF;
            }
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    e = this.LL;
                    C155000ia.LIZIZ(obj);
                    C0HYP.LIZ.getClass();
                    C0HYP.LJ().erase("review_page_preloading_times");
                    this.LLILLL.LLJLIL.set(false);
                    C0HWW c0hww = C0HWW.LIZ;
                    String message = e.getMessage();
                    c0hww.getClass();
                    C0HWW.LJIJI("fail_to_save", message);
                    C0HDS c0hds = C0HDS.LIZ;
                    String message2 = e.getMessage();
                    String str = ((C0HNI) this.LLILLL.UR().getState()).LLJILJIL;
                    boolean z = this.LLILZ;
                    boolean zVR = this.LLILLL.VR();
                    Boolean bool = ((C0HNI) this.LLILLL.UR().getState()).LL;
                    c0hds.getClass();
                    C0HDS.LIZ(message2, str, bool, z, zVR);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLL.isAdded()) {
                SocialAvatarReviewFragment socialAvatarReviewFragment = this.LLILLL;
                Context contextRequireContext = socialAvatarReviewFragment.requireContext();
                boolean z2 = this.LLILZ;
                boolean z3 = this.LLILZIL;
                this.LLILLJJLI = 1;
                Object objLJ = C2296808zG.LJ(new C0HDN(socialAvatarReviewFragment, z3, z2, contextRequireContext, null), this);
                if (objLJ != C099R.LJFF()) {
                    objLJ = Unit.LIZ;
                }
                if (objLJ == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.saveUserSelection$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.saveUserSelection$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
