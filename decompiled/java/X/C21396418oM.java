package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.xelements.LynxUILive;

/* JADX INFO: renamed from: X.18oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21396418oM extends FrameLayout {
    public final LynxUILive LL;
    public final ImageView LLILLJJLI;

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.LL.player$spark_base_release().LIZIZ();
        }
    }

    public final void setScaleType(String str) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3143043) {
                if (iHashCode != 94852023) {
                    if (iHashCode == 951526612 && str.equals("contain")) {
                        scaleType = ImageView.ScaleType.CENTER_INSIDE;
                    }
                } else if (str.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
            } else if (str.equals("fill")) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
        }
        this.LLILLJJLI.setScaleType(scaleType);
    }

    public C21396418oM(Context context, LynxUILive lynxUILive) {
        super(context);
        this.LL = lynxUILive;
        ImageView imageView = new ImageView(context);
        C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C786410Ut5.LJZI(8, imageView);
        this.LLILLJJLI = imageView;
    }
}
