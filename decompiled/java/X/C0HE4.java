package X;

import android.widget.LinearLayout;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HE4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarSocialAvatarHelper$addButtons$1", f = "EnlargeAvatarSocialAvatarHelper.kt", l = {381, 385}, m = "invokeSuspend")
public final class C0HE4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C442840HYc LL;
    public int LLILLJJLI;
    public final /* synthetic */ C442840HYc LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ LinearLayout LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HE4(C442840HYc c442840HYc, boolean z, LinearLayout linearLayout, InterfaceC1364105Vn<? super C0HE4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c442840HYc;
        this.LLILZ = z;
        this.LLILZIL = linearLayout;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HE4(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C442840HYc c442840HYc;
        C1C7U.LIZ("EnlargeAvatarSocialAvatarHelper@38b.addButtons$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.addButtons$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c442840HYc = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c442840HYc = this.LLILLL;
            ISocialAvatarService iSocialAvatarService = (ISocialAvatarService) c442840HYc.LJIIJ.getValue();
            this.LL = c442840HYc;
            this.LLILLJJLI = 1;
            obj = iSocialAvatarService.LJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.addButtons$1");
                return objLJFF;
            }
        }
        c442840HYc.LJIILJJIL = (Integer) obj;
        C0HWW c0hww = C0HWW.LIZ;
        boolean z = this.LLILZ;
        C442840HYc c442840HYc2 = this.LLILLL;
        String str = c442840HYc2.LIZJ.LIZ;
        String strLJFF = c442840HYc2.LJFF();
        String strLJ = this.LLILLL.LJ();
        c0hww.getClass();
        C0HWW.LJIIJ("show", str, strLJFF, strLJ, z);
        if (this.LLILLL.LJIIJ() && C0HZE.LIZIZ.LJIILJJIL()) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0H5D c0h5d = new C0H5D(this.LLILZIL, this.LLILLL, null);
            this.LL = null;
            this.LLILLJJLI = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c0h5d) == objLJFF) {
                C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.addButtons$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.addButtons$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
