package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchProsConsJSBRequestModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui.SearchProsConsPanelFragment;

/* JADX INFO: renamed from: X.0DV6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DV6 {
    public static void LIZ(FragmentManager fragmentManager, SearchProsConsJSBRequestModel searchProsConsJSBRequestModel) {
        SearchProsConsPanelFragment searchProsConsPanelFragment = new SearchProsConsPanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, ":model", searchProsConsJSBRequestModel);
        searchProsConsPanelFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) C1389340mG4.LIZLLL()) * 0.75d)));
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJI = searchProsConsPanelFragment;
        tuxSheet.show(fragmentManager, "SRAProsConsPanel");
    }
}
