package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Q5V, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.mob.SearchVideoMob$sendVideoAutoPlayEvent$1$15", f = "SearchVideoMob.kt", l = {}, m = "invokeSuspend")
public final class C0Q5V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C684600QtG LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C664340Q4a LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Q5V(C684600QtG c684600QtG, Aweme aweme, C664340Q4a c664340Q4a, InterfaceC1364105Vn<? super C0Q5V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c684600QtG;
        this.LLILLJJLI = aweme;
        this.LLILLL = c664340Q4a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Q5V(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        boolean z;
        String str;
        String str2;
        String str3;
        Aweme awemeLJII;
        boolean z2;
        boolean z3;
        String str4;
        C1C7U.LIZ("SearchVideoMob@8552.sendVideoAutoPlayEvent$1$15");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LJIILJJIL();
        C664340Q4a c664340Q4a = this.LLILLL;
        c664340Q4a.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sentCaptionVideoPlayEventEvent aweme: ");
        Aweme awemeLJII2 = c664340Q4a.LJII();
        if (awemeLJII2 != null) {
            aid = awemeLJII2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        String strLJI = c664340Q4a.LJI();
        ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
        Aweme awemeLJII3 = c664340Q4a.LJII();
        C0Q5W.LIZ.getClass();
        boolean z4 = false;
        ICaptionKevaService iCaptionKevaService = (ICaptionKevaService) PluggableExtentionKt.pluggableSpi$default(ICaptionKevaService.class, false, false, false, 14, null);
        boolean z5 = true;
        if (iCaptionKevaService != null && iCaptionKevaService.LJIIJJI() == 1) {
            z4 = true;
        }
        if (z4 && c664340Q4a.LJIILIIL()) {
            z = true;
        } else {
            z = false;
        }
        C653660PkS c653660PkSLJIIIZ = c664340Q4a.LJIIIZ();
        String str5 = "";
        if (c653660PkSLJIIIZ == null || (str = c653660PkSLJIIIZ.LIZLLL) == null) {
            str = "";
        }
        C653660PkS c653660PkSLJIIIZ2 = c664340Q4a.LJIIIZ();
        if (c653660PkSLJIIIZ2 == null || (str2 = c653660PkSLJIIIZ2.LJFF) == null) {
            str2 = "";
        }
        C653660PkS c653660PkSLJIIIZ3 = c664340Q4a.LJIIIZ();
        if (c653660PkSLJIIIZ3 == null || (str3 = c653660PkSLJIIIZ3.LJIIJ) == null) {
            str3 = "";
        }
        iCLAPerfETServiceLIZ.LIZIZ(awemeLJII3, new C0Q5X(z, new C017B(str2, str3, str), strLJI));
        C664340Q4a c664340Q4a2 = this.LLILLL;
        if (c664340Q4a2.LJIILIIL() && !Intrinsics.LJFF(C664340Q4a.LLJJI, c664340Q4a2.LJII()) && (awemeLJII = c664340Q4a2.LJII()) != null) {
            C664340Q4a.LLJJI = awemeLJII;
            ICLAPerfETService iCLAPerfETServiceLIZ2 = C1485670olR.LIZ();
            C160B c160b = C160B.EXPANDED;
            C653660PkS c653660PkSLJIIIZ4 = c664340Q4a2.LJIIIZ();
            if (c653660PkSLJIIIZ4 != null && (str4 = c653660PkSLJIIIZ4.LJIIIIZZ) != null) {
                str5 = str4;
            }
            iCLAPerfETServiceLIZ2.LJIJJ(awemeLJII, c160b, true, null, str5);
            C1485670olR.LIZ().LJIJJLI(awemeLJII.getAid());
            C161N c161n = C161N.LIZIZ;
            String strLLIIZ = c161n.LLIIZ();
            C661490Px5 c661490Px5 = c664340Q4a2.LL;
            if (c661490Px5 != null && c661490Px5.LJJIII && c161n.LLIIIL(awemeLJII, strLLIIZ) && !c161n.LJIIJ(awemeLJII, strLLIIZ)) {
                z2 = true;
            } else {
                z2 = false;
            }
            C661490Px5 c661490Px52 = c664340Q4a2.LL;
            if (c661490Px52 == null || !c661490Px52.LJJIII || z2) {
                CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(awemeLJII);
                C661490Px5 c661490Px53 = c664340Q4a2.LL;
                if (c661490Px53 != null) {
                    z3 = c661490Px53.LJJIII;
                } else {
                    z3 = false;
                }
                C0Q6K.LIZIZ(awemeLJII, captionItemModelLJIIIIZZ, false, !z3, 4);
            }
            C661490Px5 c661490Px54 = c664340Q4a2.LL;
            if (c661490Px54 != null && c661490Px54.LJJIII) {
                CaptionItemModel captionItemModelLIZLLL = C20702515zj.LIZLLL(awemeLJII);
                if (captionItemModelLIZLLL == null) {
                    captionItemModelLIZLLL = c161n.LJII(awemeLJII, strLLIIZ);
                } else {
                    z5 = false;
                }
                C0Q6K.LIZIZ(awemeLJII, captionItemModelLIZLLL, z5, false, 8);
            }
        }
        this.LLILLL.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoMob@8552.sendVideoAutoPlayEvent$1$15");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
