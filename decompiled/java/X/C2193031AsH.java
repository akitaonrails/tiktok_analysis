package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.1AsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepo$onInteraction$9", f = "SearchCSIProfileBannerRepo.kt", l = {388}, m = "invokeSuspend")
public final class C2193031AsH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2252321DDq LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2193081AsM LLILLL;
    public final /* synthetic */ C19720512Dr LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2193031AsH(C2193081AsM c2193081AsM, C19720512Dr c19720512Dr, InterfaceC1364105Vn<? super C2193031AsH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2193081AsM;
        this.LLILZ = c19720512Dr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2193031AsH(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDq;
        C1C7U.LIZ("SearchCSIProfileBannerRepo@2d36.onInteraction$9");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        C2193061AsK c2193061AsKLIZJ = null;
        if (i != 0) {
            if (i == 1) {
                c2252321DDq = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2193061AsK c2193061AsK = (C2193061AsK) this.LLILLL.LJFF.getValue();
            if (c2193061AsK != null) {
                if (Intrinsics.LJFF(c2193061AsK.LIZ.LJ, this.LLILZ.LJ)) {
                    c2193061AsK.LJ = true;
                    C2193061AsK.LJIIIIZZ.add(Integer.valueOf(c2193061AsK.LIZ.hashCode()));
                }
            }
            c2252321DDq = this.LLILLL.LJFF;
            C2193041AsI c2193041AsI = C2193081AsM.LJIIIIZZ.LIZ;
            if (c2193041AsI == null || (c2193061AsKLIZJ = c2193041AsI.LIZJ()) == null) {
                C2193081AsM c2193081AsM = this.LLILLL;
                C2159008d2 c2159008d2 = new C2159008d2(0, false, null, 15);
                this.LL = c2252321DDq;
                this.LLILLJJLI = 1;
                obj = c2193081AsM.LIZLLL(c2159008d2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchCSIProfileBannerRepo@2d36.onInteraction$9");
                    return objLJFF;
                }
            }
            c2252321DDq.setValue(c2193061AsKLIZJ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchCSIProfileBannerRepo@2d36.onInteraction$9");
            return unit;
        }
        C2193041AsI c2193041AsI2 = (C2193041AsI) obj;
        if (c2193041AsI2 != null) {
            c2193061AsKLIZJ = c2193041AsI2.LIZJ();
        }
        C2193061AsK c2193061AsKLIZJ2 = c2193061AsKLIZJ;
        c2252321DDq.setValue(c2193061AsKLIZJ2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepo@2d36.onInteraction$9");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
