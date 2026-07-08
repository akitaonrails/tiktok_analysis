package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0ltU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375340ltU {
    public static UrlModel LIZIZ(CreateAwemeResponse createAwemeResponse) {
        UrlModel cover;
        Aweme aweme = createAwemeResponse.aweme;
        AVUploadSaveModel aVUploadSaveModel = createAwemeResponse.mSaveModel;
        String imageModeCoverPathNoWatermark = null;
        if (LIZJ(aweme)) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            if (aVUploadSaveModel != null) {
                imageModeCoverPathNoWatermark = aVUploadSaveModel.getImageModeCoverPathNoWatermark();
            }
            sbLIZ.append(imageModeCoverPathNoWatermark);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(arrayList);
            return urlModel;
        }
        Video video = aweme.getVideo();
        if (video == null || (cover = video.getCover()) == null) {
            return null;
        }
        return cover;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme.getAwemeType() != 150 && !C710930Rud.LJII(aweme)) {
            return false;
        }
        return true;
    }

    public static Drawable LIZ(Context context, int i, int i2, int i3, int i4) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(50));
        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = i2;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context);
        stateListDrawable.addState(new int[]{-16842912}, layerDrawableLJIILIIL);
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, tuxIconDrawableLIZ2);
        stateListDrawable.addState(new int[0], layerDrawableLJIILIIL);
        return stateListDrawable;
    }
}
