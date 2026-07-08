package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.mapmode.PoiMapModeFilterFragment;

/* JADX INFO: renamed from: X.0gfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174470gfV {
    public static TuxSheet LIZ(int i, C1174460gfU c1174460gfU) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "map_mode_filter_data", c1174460gfU);
        PoiMapModeFilterFragment poiMapModeFilterFragment = new PoiMapModeFilterFragment();
        poiMapModeFilterFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = i;
        tuxSheet.LLJJIJI = poiMapModeFilterFragment;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLLL = false;
        return tuxSheet;
    }
}
