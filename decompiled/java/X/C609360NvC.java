package X;

import com.ss.android.ugc.aweme.experiment.LSContentSettings;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.poi.collect.IPoiCollectService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609360NvC implements IPoiCollectService {
    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final boolean canShowWantTogoCollection() {
        C609370NvD.LIZ.getClass();
        int i = C609370NvD.LIZIZ().getInt(C609370NvD.LIZ("want_togo_collect_count"), 0);
        Integer num = LSContentSettings.LIZ().wantTogoExitCount;
        if (i >= (num != null ? num.intValue() : 3)) {
            if (System.currentTimeMillis() - C609370NvD.LIZIZ().getLong(C609370NvD.LIZ("want_togo_last_collect_time"), System.currentTimeMillis()) > (LSContentSettings.LIZ().wantTogoCountExitFrequency != null ? r0.intValue() : 604800) * LSPassThroughRecordSizeConfig.DEFAULT) {
                C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("want_togo_collect_count"), 0);
            }
        }
        int i2 = C609370NvD.LIZIZ().getInt(C609370NvD.LIZ("want_togo_collect_count"), 0);
        Integer num2 = LSContentSettings.LIZ().wantTogoExitCount;
        return i2 < (num2 != null ? num2.intValue() : 3);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final void onWantToGoClick() {
        C609370NvD.LIZ.getClass();
        C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("want_togo_collect_count"), 0);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final void onWantToGoShow() {
        C609370NvD.LIZ.getClass();
        C609370NvD.LIZIZ().storeLong(C609370NvD.LIZ("want_togo_last_collect_time"), System.currentTimeMillis());
        if (System.currentTimeMillis() - C609370NvD.LIZIZ().getLong(C609370NvD.LIZ("want_togo_first_collect_time"), 0L) > (LSContentSettings.LIZ().wantTogoCountExitFrequency != null ? r0.intValue() : 604800) * LSPassThroughRecordSizeConfig.DEFAULT) {
            C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("want_togo_collect_count"), 1);
        } else {
            C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("want_togo_collect_count"), C609370NvD.LIZIZ().getInt(C609370NvD.LIZ("want_togo_collect_count"), 0) + 1);
        }
        if (C609370NvD.LIZIZ().getInt(C609370NvD.LIZ("want_togo_collect_count"), 0) == 1) {
            C609370NvD.LIZIZ().storeLong(C609370NvD.LIZ("want_togo_first_collect_time"), System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    public final void onCollectionDelete(String str) {
        String string;
        C609370NvD.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ls_collection_bottom_button", true, false) && (string = C609370NvD.LIZIZ().getString(C609370NvD.LIZ("button_collection_id"), null)) != null && Intrinsics.LJFF(string, str)) {
            C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("button_show_count"), 0);
            C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("button_collect_count"), 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    @Override // com.ss.android.ugc.aweme.poi.collect.IPoiCollectService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoAddToCollection(java.lang.Boolean r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609360NvC.onVideoAddToCollection(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
