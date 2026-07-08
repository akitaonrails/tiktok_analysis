package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS19S1100100_6;
import njp.a;

/* JADX INFO: renamed from: X.0HBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel$openEditStoryPage$2", f = "SocialAvatarEditViewModel.kt", l = {430, 445}, m = "invokeSuspend")
public final class C436970HBn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ SocialAvatarEditViewModel LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C436970HBn(SocialAvatarEditViewModel socialAvatarEditViewModel, C19EG c19eg, String str, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C436970HBn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = socialAvatarEditViewModel;
        this.LLILZ = c19eg;
        this.LLILZIL = str;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436970HBn(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jElapsedRealtime;
        Object objLJI = obj;
        C1C7U.LIZ("SocialAvatarEditViewModel@c2d3.openEditStoryPage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.openEditStoryPage$2");
                    return objLJI;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jElapsedRealtime = this.LL;
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            SocialAvatarEditViewModel socialAvatarEditViewModel = this.LLILLL;
            C19EG c19eg = this.LLILZ;
            this.LL = jElapsedRealtime;
            this.LLILLJJLI = 1;
            socialAvatarEditViewModel.getClass();
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C436920HBi(socialAvatarEditViewModel, c19eg, true, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.openEditStoryPage$2");
                return objLJFF;
            }
        }
        C436980HBo c436980HBo = (C436980HBo) objLJI;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (c436980HBo.LIZLLL != null && c436980HBo.LIZ != null && c436980HBo.LIZIZ != null && c436980HBo.LIZJ != null) {
            SocialAvatarEditViewModel socialAvatarEditViewModel2 = this.LLILLL;
            Bundle bundleVQ2 = socialAvatarEditViewModel2.vQ2(c436980HBo, new AwS19S1100100_6(this.LLILZIL, socialAvatarEditViewModel2, jElapsedRealtime2, 0));
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C436990HBp c436990HBp = new C436990HBp(this.LLILZ, bundleVQ2, c436980HBo, this.LLILZLL, null);
            this.LLILLJJLI = 2;
            objLJI = C23250099c.LJI(this, abstractC2238408pq, c436990HBp);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.openEditStoryPage$2");
                return objLJFF;
            }
            C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.openEditStoryPage$2");
            return objLJI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("One of the images is null ");
        sbLIZ.append(c436980HBo);
        throw new C0HDR(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
