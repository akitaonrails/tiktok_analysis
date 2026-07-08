package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: renamed from: X.0mJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391770mJz extends AbstractC1391830mK5 {
    public final Drawable LJ;
    public final Rect LJFF;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        C1CRB c1crb = new C1CRB(this.LIZ, null, 6);
        C1CRC c1crc = new C1CRC(-1);
        Rect rect = this.LJFF;
        c1crb.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        C786410Ut5.Z6(c1crb, c1crc);
        c1crb.setBackground(new ColorDrawable(this.LIZLLL));
        AppCompatImageView appCompatImageView = new AppCompatImageView(c1crb.getContext());
        Drawable drawable = this.LJ;
        if (drawable != null) {
            double intrinsicHeight = ((double) drawable.getIntrinsicHeight()) / ((double) drawable.getIntrinsicWidth());
            C1CRC c1crc2 = new C1CRC(-1);
            Context context = appCompatImageView.getContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("this.width * ");
            sbLIZ.append(intrinsicHeight);
            c1crc2.LJII = C2230281CQw.LIZ(context, C2188811AlT.LIZIZ(sbLIZ), "layout_height");
            C786410Ut5.h6(appCompatImageView, c1crc2);
            appCompatImageView.setImageDrawable(drawable);
        }
        c1crb.addView(appCompatImageView);
        return c1crb;
    }

    public C1391770mJz(Context context, Drawable drawable, Rect rect) {
        super(context, 0);
        this.LJFF = new Rect(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        this.LJFF = rect;
        this.LJ = drawable;
    }
}
