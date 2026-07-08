package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0deZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058570deZ {
    public static final int LIZ = C341940Daq.LIZ(56.0d);

    public static void LIZ(View view, SharePackage sharePackage) {
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.opq);
        ImageView imageView = (ImageView) view.findViewById(R.id.luv);
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(C418440Gaw.LIZIZ(4));
        String str = sharePackage.itemType;
        if (Intrinsics.LJFF(str, "good_window")) {
            ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
            int i = LIZ;
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.f7(remoteImageView, layoutParams);
            c1331100kk8.LIZIZ = true;
            C786410Ut5.LJZI(0, imageView);
            remoteImageView.getHierarchy().LJJIII(c1331100kk8);
            return;
        }
        if (!Intrinsics.LJFF(str, "good")) {
            return;
        }
        imageView.setImageResource(R.drawable.cb3);
        C786410Ut5.LJZI(0, imageView);
        remoteImageView.getHierarchy().LJJIII(c1331100kk8);
    }
}
