package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0t3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650880t3u {
    public static final JSONObject LIZ(C1DRG c1drg) {
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ((ViewModelProvider) c1drg.LJII(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.LL;
        if (shortVideoContext == null) {
            return new C543670LTx().LJ();
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("creation_id", shortVideoContext.getCreationId());
        c543670LTx.LIZ.put("shoot_way", shortVideoContext.shootWay);
        String str = "1";
        c543670LTx.LIZ.put("route", "1");
        if (!shortVideoContextViewModel.vQ2()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c543670LTx.LIZ.put("is_photo", str);
        c543670LTx.LIZ.put("position", "shoot_page");
        return c543670LTx.LJ();
    }
}
