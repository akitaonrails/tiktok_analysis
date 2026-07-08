package X;

import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Rmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705950Rmb {
    public static void LIZ(SmartImageView smartImageView) {
        int iIntValue;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_video_slash;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(smartImageView.getContext());
        smartImageView.setScaleType(ImageView.ScaleType.CENTER);
        smartImageView.setImageDrawable(tuxIconDrawableLIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, smartImageView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        smartImageView.setBackgroundColor(iIntValue);
    }

    public static int LIZIZ(List list) {
        UserStory userStory;
        if (list != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (C729510SjV.LJJIJIL(aweme) && (userStory = aweme.getUserStory()) != null && !userStory.isPostStyle()) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        return -1;
    }
}
