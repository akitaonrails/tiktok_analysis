package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: renamed from: X.0mK1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391790mK1 extends AbstractC1391830mK5 {
    public final Drawable LJ;
    public int LJFF;
    public final int LJI;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        C1CRB c1crb = new C1CRB(this.LIZ, null, 6);
        C1CRC c1crc = new C1CRC(-1);
        c1crb.setPadding(0, this.LJFF, 0, this.LJI);
        C786410Ut5.Z6(c1crb, c1crc);
        c1crb.setBackground(new ColorDrawable(this.LIZLLL));
        AppCompatImageView appCompatImageView = new AppCompatImageView(c1crb.getContext());
        Drawable drawableLIZ = this.LJ;
        if (drawableLIZ != null || (drawableLIZ = C14MI.LIZ(appCompatImageView.getContext(), 0)) != null) {
            double intrinsicHeight = ((double) drawableLIZ.getIntrinsicHeight()) / ((double) drawableLIZ.getIntrinsicWidth());
            C1CRC c1crc2 = new C1CRC(-1);
            Context context = appCompatImageView.getContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("this.width * ");
            sbLIZ.append(intrinsicHeight);
            c1crc2.LJII = C2230281CQw.LIZ(context, C2188811AlT.LIZIZ(sbLIZ), "layout_height");
            C786410Ut5.h6(appCompatImageView, c1crc2);
            appCompatImageView.setImageDrawable(drawableLIZ);
        }
        c1crb.addView(appCompatImageView);
        return c1crb;
    }

    public C1391790mK1(Context context, Drawable drawable) {
        super(context, 0);
        this.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        this.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LJ = drawable;
    }
}
