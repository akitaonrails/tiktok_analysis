package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12YP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YP implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(C12YP c12yp, DialogInterface dialogInterface) {
        String str;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) c12yp.l0;
        if (((C013C) c12yp.l1).element && ecTakePhotoActivity != null) {
            PhotoSearchEnterParams photoSearchEnterParams = ecTakePhotoActivity.LLJJL;
            Pair[] pairArr = new Pair[2];
            if (photoSearchEnterParams == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) == null) {
                str = "";
            }
            pairArr[0] = new Pair("current_page", str);
            pairArr[1] = new Pair("click_type", "close");
            C675940QfI.LIZJ("photo_search_guidance_click", photoSearchEnterParams, new AwS608S0100000_29(C2097608Jq.LJIIJ(pairArr), (Map<String, String>) 513));
        }
    }

    public static final void onDismiss$1(C12YP c12yp, DialogInterface dialogInterface) {
        EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) c12yp.l0;
        if (((C013C) c12yp.l1).element && ecTakePhotoActivity != null) {
            C675940QfI.LIZJ("photo_search_help_panel_click", ecTakePhotoActivity.LLJJL, new AwS608S0100000_29(C2097608Jq.LJIIJ(new Pair("click_type", "close")), (Map<String, String>) 512));
        }
    }

    public C12YP(EcTakePhotoActivity ecTakePhotoActivity, C013C c013c, int i) {
        this.$t = i;
        this.l0 = ecTakePhotoActivity;
        this.l1 = c013c;
    }
}
