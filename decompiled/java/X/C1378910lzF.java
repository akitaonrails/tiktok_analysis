package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent;

/* JADX INFO: renamed from: X.0lzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378910lzF {
    public final Activity LIZ;
    public final Context LIZIZ;
    public final MinisViewModel LIZJ;
    public final SchemaParserData LIZLLL;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJ;
    public final InterfaceC1378810lz5 LJFF;
    public TuxSheet LJI;

    /* JADX WARN: Removed duplicated region for block: B:120:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0376 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1378910lzF.LIZ():void");
    }

    public final void LIZIZ() {
        SingleLiveEvent<NetworkResponse<MinisMetaResp>> singleLiveEvent;
        NetworkResponse<MinisMetaResp> value;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, "//minis_internal/report_page");
        MinisViewModel minisViewModel = this.LIZJ;
        smartRouteBuildRoute.withParam("MinisData", (minisViewModel == null || (singleLiveEvent = minisViewModel.LLILLJJLI) == null || (value = singleLiveEvent.getValue()) == null) ? null : value.data);
        smartRouteBuildRoute.open();
        TuxSheet tuxSheet = this.LJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    public static void LIZJ(String str) {
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJII("tm_more_functional_panel_icon_click", str);
    }

    public C1378910lzF(C19EG c19eg, C19EG c19eg2, MinisViewModel minisViewModel, SchemaParserData schemaParserData, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, InterfaceC1378810lz5 interfaceC1378810lz5) {
        this.LIZ = c19eg;
        this.LIZIZ = c19eg2;
        this.LIZJ = minisViewModel;
        this.LIZLLL = schemaParserData;
        this.LJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.LJFF = interfaceC1378810lz5;
    }
}
