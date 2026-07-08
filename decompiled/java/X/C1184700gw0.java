package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiSlashContextAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184700gw0 implements InterfaceC1184310gvN, InterfaceC1141530foN {
    public final Fragment LL;
    public final InterfaceC665370Q7z LLILLJJLI;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        Boolean boolValueOf;
        if (Intrinsics.LJFF(c262100zr.LIZ, "closeReviewSubmitPage")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "originalPostSource", "")) == null) {
                strLJFF = "";
            }
            AbstractC1189550h3p abstractC1189550h3p = (AbstractC1189550h3p) C1189520h3m.class.newInstance();
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            String strLJFF2 = null;
            if (interfaceC1107590evd2 != null) {
                boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd2, "isSubmitReviewSuccess", false));
            } else {
                boolValueOf = null;
            }
            if (abstractC1189550h3p.LIZIZ(strLJFF) && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null) {
                    strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "poiID", "");
                }
                C1440005kM.LIZ(new C586460MzM(strLJFF2));
                Fragment fragment = this.LL;
                if (fragment != null) {
                    C1184850gwF.LIZ.getClass();
                    C1184850gwF.LIZIZ(fragment);
                }
            }
        }
    }

    public C1184700gw0(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = fragment;
        this.LLILLJJLI = interfaceC665370Q7z;
    }

    @Override // X.InterfaceC1184310gvN
    public final void LIZ(EnumC1184160gv8 enumC1184160gv8, C1185600gxS c1185600gxS, PoiListApi.PoiDetailResponse poiDetailResponse) {
        Context context;
        C1185410gx9 c1185410gx9;
        String str;
        String initialPoiId;
        String initialPoiFromGroupId;
        String initialEnterFrom;
        String initialEnterMethod;
        String enterMethod;
        String enterFrom;
        String fromGroupId;
        PoiCurrentSessionInfo poiCurrentSessionInfoA50;
        Fragment fragment = this.LL;
        if (fragment == null || (context = fragment.getContext()) == null || poiDetailResponse == null) {
            return;
        }
        PoiListApi.PoiReviewEntrance poiReviewEntrance = poiDetailResponse.getPoiReviewEntrance();
        if (poiReviewEntrance != null && Intrinsics.LJFF(poiReviewEntrance.postFrequencyControl, Boolean.TRUE)) {
            C1184850gwF c1184850gwF = C1184850gwF.LIZ;
            Fragment fragment2 = this.LL;
            c1184850gwF.getClass();
            C1184850gwF.LIZ(fragment2);
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            c1185430gxB.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7z);
            c1185040gwY.getClass();
            C1185040gwY.LIZIZ("ttls_poi_review_submit_limit_toast_show", linkedHashMap, null);
            return;
        }
        String str2 = null;
        if (c1185600gxS != null) {
            c1185410gx9 = c1185600gxS.LJFF;
        } else {
            c1185410gx9 = null;
        }
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        if (c1185600gxS != null) {
            str = c1185600gxS.LIZ;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (c1185410gx9 == null || (initialPoiId = c1185410gx9.getInitialPoiId()) == null) {
            initialPoiId = "";
        }
        if (c1185410gx9 == null || (initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId()) == null) {
            initialPoiFromGroupId = "";
        }
        if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        if (c1185410gx9 == null || (initialEnterMethod = c1185410gx9.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        if (c1185410gx9 == null || (enterMethod = c1185410gx9.getEnterMethod()) == null) {
            enterMethod = "";
        }
        if (c1185410gx9 == null || (enterFrom = c1185410gx9.getEnterFrom()) == null) {
            enterFrom = "";
        }
        if (c1185410gx9 != null) {
            fromGroupId = c1185410gx9.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        IPoiSlashContextAbility iPoiSlashContextAbility = (IPoiSlashContextAbility) C1558520qew.LIZ(this.LLILLJJLI, IPoiSlashContextAbility.class, null);
        if (iPoiSlashContextAbility != null && (poiCurrentSessionInfoA50 = iPoiSlashContextAbility.a50()) != null) {
            str2 = poiCurrentSessionInfoA50.poiSessionId;
        }
        C1186070gyD.LIZLLL(c1186070gyD, context, str, poiDetailResponse, initialPoiId, initialPoiFromGroupId, initialEnterFrom, initialEnterMethod, enterMethod, enterFrom, "click_write_review", fromGroupId, new AwS562S0100000_18(this, 2494), str2, this.LLILLJJLI, PageFinder.via(this.LL));
    }
}
