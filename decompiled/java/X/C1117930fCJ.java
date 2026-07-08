package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fCJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117930fCJ extends C1119660fF6 {
    public C1117930fCJ(C1117940fCK c1117940fCK) {
        super(c1117940fCK);
        if (this.LIZ != null && !TextUtils.isEmpty(c1117940fCK.LJIJJ)) {
            View viewSd = C786410Ut5.Sd(R.layout.gzv, C786410Ut5.ne(this.LIZ), null);
            ImageView imageView = (ImageView) viewSd.findViewById(R.id.xyp);
            TextView textView = (TextView) viewSd.findViewById(R.id.xyt);
            ImageModel imageModel = c1117940fCK.LJJIIJZLJL;
            if (imageModel != null) {
                C1126570fQF.LIZLLL(imageView, imageModel, imageView.getLayoutParams().width, imageView.getLayoutParams().height, R.drawable.exe, null, 80);
            }
            textView.setText(c1117940fCK.LJIJJ);
            this.LJIILJJIL = c1117940fCK.LJIJJ;
            this.LIZJ = viewSd;
        }
    }
}
