package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0nCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425670nCf extends AbstractC1664490tPr<C1425680nCg, C1425700nCi> {
    public View LLJJJIL;
    public View LLJJJJ;
    public ImageView LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public C1427240nFC LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(993));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        TextView textView;
        C1361400lX0 c1361400lX0LJFF;
        Integer numLIZJ;
        C1425580nCW c1425580nCW = C1425580nCW.LIZIZ;
        setTheme(c1425580nCW.LIZLLL());
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.epj, viewGroup, false);
        C1427240nFC c1427240nFC = null;
        if ((viewTd instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewTd) != null) {
            C426750GoL.LJIIIZ(viewGroup2, null, Integer.valueOf(ScreenUtils.getStatusBarHeight(C0CHQ.LIZ)), null, null, false, 29);
            viewGroup2.getLayoutParams().height = LLLLILI().LIZ.LIZ;
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.y9s);
            this.LLJJJJJIL = imageView;
            if (imageView != null && (c1361400lX0LJFF = c1425580nCW.LJFF(getSceneContext())) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.fuv, c1361400lX0LJFF)) != null) {
                final int iIntValue = numLIZJ.intValue();
                imageView.setImageDrawable(new AbstractC415370GQl(iIntValue) { // from class: X.0GHU
                    public final Paint LJ;
                    public final C415290GQd LJFF;
                    public final Paint LJI;
                    public final C415290GQd LJII;
                    public final Paint LJIIIIZZ;
                    public final C415290GQd LJIIIZ;
                    public final Paint LJIIJ;
                    public final C415290GQd LJIIJJI;
                    public final Paint LJIIL;
                    public final C415290GQd LJIILIIL;

                    {
                        this.LIZJ.LJIIIZ(26.2604f, 0.5f);
                        this.LIZJ.LJFF(29.0173f, 0.500236f, 31.2526f, 2.73522f, 31.2526f, 5.49219f);
                        this.LIZJ.LJFF(31.2526f, 8.24915f, 29.0173f, 10.4841f, 26.2604f, 10.4844f);
                        this.LIZJ.LJII(25.7985f);
                        this.LIZJ.LJIIIIZZ(32.7653f, 16.6016f);
                        this.LIZJ.LJII(28.8649f);
                        this.LIZJ.LJIIIIZZ(21.776f, 10.4844f);
                        this.LIZJ.LJII(20.6969f);
                        this.LIZJ.LJIJI(16.6016f);
                        this.LIZJ.LJII(17.6969f);
                        this.LIZJ.LJIJI(0.5f);
                        this.LIZJ.LJII(26.2604f);
                        this.LIZJ.LJ();
                        this.LIZJ.LJIIIZ(20.4703f, 2.99414f);
                        this.LIZJ.LJIJI(8.08984f);
                        this.LIZJ.LJII(25.985f);
                        this.LIZJ.LJFF(26.4927f, 8.08982f, 26.9816f, 7.89686f, 27.3522f, 7.5498f);
                        this.LIZJ.LJIIIIZZ(28.3268f, 6.63672f);
                        this.LIZJ.LJFF(28.9595f, 6.04404f, 28.9595f, 5.03995f, 28.3268f, 4.44727f);
                        this.LIZJ.LJIIIIZZ(27.3522f, 3.53418f);
                        this.LIZJ.LJFF(26.9816f, 3.18712f, 26.4927f, 2.99416f, 25.985f, 2.99414f);
                        this.LIZJ.LJII(20.4703f);
                        this.LIZJ.LJ();
                        this.LIZJ.LJIJ(Path.FillType.WINDING);
                        this.LIZIZ.setStyle(Paint.Style.FILL);
                        this.LIZIZ.setColor(iIntValue);
                        this.LIZ.add(this.LIZIZ);
                        Paint paint = new Paint();
                        this.LJ = paint;
                        C415290GQd c415290GQd = new C415290GQd();
                        this.LJFF = c415290GQd;
                        c415290GQd.LJIIIZ(72.778f, 3.74707f);
                        c415290GQd.LJII(68.8483f);
                        c415290GQd.LJIJI(16.751f);
                        c415290GQd.LJII(65.6266f);
                        c415290GQd.LJIJI(3.74707f);
                        c415290GQd.LJII(61.6969f);
                        c415290GQd.LJIJI(0.5f);
                        c415290GQd.LJII(72.778f);
                        c415290GQd.LJIJI(3.74707f);
                        c415290GQd.LJ();
                        c415290GQd.LJIJ(Path.FillType.WINDING);
                        paint.setStyle(Paint.Style.FILL);
                        paint.setColor(iIntValue);
                        this.LIZ.add(paint);
                        Paint paint2 = new Paint();
                        this.LJI = paint2;
                        C415290GQd c415290GQd2 = new C415290GQd();
                        this.LJII = c415290GQd2;
                        c415290GQd2.LJIIIZ(47.444f, 16.5003f);
                        c415290GQd2.LJIIIIZZ(52.4848f, 0.419922f);
                        c415290GQd2.LJII(57.115f);
                        c415290GQd2.LJIIIIZZ(62.1558f, 16.5003f);
                        c415290GQd2.LJII(59.259f);
                        c415290GQd2.LJIIIIZZ(57.5712f, 10.8664f);
                        c415290GQd2.LJII(52.0286f);
                        c415290GQd2.LJIIIIZZ(50.3407f, 16.5003f);
                        c415290GQd2.LJII(47.444f);
                        c415290GQd2.LJ();
                        c415290GQd2.LJIIIZ(52.7128f, 8.58554f);
                        c415290GQd2.LJII(56.8869f);
                        c415290GQd2.LJIIIIZZ(55.2877f, 3.24304f);
                        c415290GQd2.LJFF(55.1455f, 2.7683f, 54.4736f, 2.76729f, 54.3301f, 3.2416f);
                        c415290GQd2.LJIIIIZZ(52.7128f, 8.58554f);
                        c415290GQd2.LJ();
                        c415290GQd2.LJIJ(Path.FillType.WINDING);
                        paint2.setStyle(Paint.Style.FILL);
                        paint2.setColor(iIntValue);
                        this.LIZ.add(paint2);
                        Paint paint3 = new Paint();
                        this.LJIIIIZZ = paint3;
                        C415290GQd c415290GQd3 = new C415290GQd();
                        this.LJIIIZ = c415290GQd3;
                        c415290GQd3.LJIIIZ(86.5032f, 3.50293f);
                        c415290GQd3.LJII(78.0793f);
                        c415290GQd3.LJIJI(6.80078f);
                        c415290GQd3.LJII(84.2385f);
                        c415290GQd3.LJIJI(9.65918f);
                        c415290GQd3.LJII(78.0793f);
                        c415290GQd3.LJIJI(13.6221f);
                        c415290GQd3.LJII(87.9895f);
                        c415290GQd3.LJIJI(16.6523f);
                        c415290GQd3.LJII(75.0754f);
                        c415290GQd3.LJIJI(13.6221f);
                        c415290GQd3.LJII(75.0764f);
                        c415290GQd3.LJIJI(9.65918f);
                        c415290GQd3.LJII(75.0754f);
                        c415290GQd3.LJIJI(6.80078f);
                        c415290GQd3.LJII(75.0764f);
                        c415290GQd3.LJIJI(3.50293f);
                        c415290GQd3.LJII(75.0754f);
                        c415290GQd3.LJIJI(0.5f);
                        c415290GQd3.LJII(86.5032f);
                        c415290GQd3.LJIJI(3.50293f);
                        c415290GQd3.LJ();
                        c415290GQd3.LJIJ(Path.FillType.WINDING);
                        paint3.setStyle(Paint.Style.FILL);
                        paint3.setColor(iIntValue);
                        this.LIZ.add(paint3);
                        Paint paint4 = new Paint();
                        this.LJIIJ = paint4;
                        C415290GQd c415290GQd4 = new C415290GQd();
                        this.LJIIJJI = c415290GQd4;
                        c415290GQd4.LJIIIZ(45.6969f, 3.5f);
                        c415290GQd4.LJII(37.7008f);
                        c415290GQd4.LJIJI(6.5f);
                        c415290GQd4.LJII(43.6969f);
                        c415290GQd4.LJIJI(9.5f);
                        c415290GQd4.LJII(37.7008f);
                        c415290GQd4.LJIJI(13.5f);
                        c415290GQd4.LJII(45.6969f);
                        c415290GQd4.LJIJI(16.5f);
                        c415290GQd4.LJII(34.6969f);
                        c415290GQd4.LJIJI(13.5f);
                        c415290GQd4.LJII(34.6979f);
                        c415290GQd4.LJIJI(9.5f);
                        c415290GQd4.LJII(34.6969f);
                        c415290GQd4.LJIJI(6.5f);
                        c415290GQd4.LJII(34.6979f);
                        c415290GQd4.LJIJI(3.5f);
                        c415290GQd4.LJII(34.6969f);
                        c415290GQd4.LJIJI(0.5f);
                        c415290GQd4.LJII(45.6969f);
                        c415290GQd4.LJIJI(3.5f);
                        c415290GQd4.LJ();
                        c415290GQd4.LJIJ(Path.FillType.WINDING);
                        paint4.setStyle(Paint.Style.FILL);
                        paint4.setColor(iIntValue);
                        this.LIZ.add(paint4);
                        Paint paint5 = new Paint();
                        this.LJIIL = paint5;
                        C415290GQd c415290GQd5 = new C415290GQd();
                        this.LJIILIIL = c415290GQd5;
                        c415290GQd5.LJIIIZ(8.5f, 0.0f);
                        c415290GQd5.LJFF(11.066f, 0.0f, 13.3643f, 1.13883f, 14.9229f, 2.93652f);
                        c415290GQd5.LJIIIIZZ(12.6562f, 4.89941f);
                        c415290GQd5.LJFF(11.6478f, 3.73638f, 10.1601f, 3.0001f, 8.5f, 3.0f);
                        c415290GQd5.LJFF(5.46243f, 3.0f, 3.0f, 5.46243f, 3.0f, 8.5f);
                        c415290GQd5.LJFF(3.00018f, 11.5374f, 5.46254f, 14.0f, 8.5f, 14.0f);
                        c415290GQd5.LJFF(10.1603f, 13.9999f, 11.6478f, 13.263f, 12.6562f, 12.0996f);
                        c415290GQd5.LJIIIIZZ(14.9229f, 14.0625f);
                        c415290GQd5.LJFF(13.3643f, 15.8605f, 11.0663f, 17.0f, 8.5f, 17.0f);
                        c415290GQd5.LJFF(3.80558f, 17.0f, 0.0f, 13.1944f, 0.0f, 8.5f);
                        c415290GQd5.LJFF(0.0f, 3.80558f, 3.80558f, 0.0f, 8.5f, 0.0f);
                        c415290GQd5.LJ();
                        c415290GQd5.LJIJ(Path.FillType.WINDING);
                        paint5.setStyle(Paint.Style.FILL);
                        paint5.setColor(iIntValue);
                        this.LIZ.add(paint5);
                    }

                    @Override // X.AbstractC415370GQl
                    public final void LIZ(Canvas canvas) {
                        LIZIZ(88.0f, 17.0f, canvas);
                        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
                        canvas.drawPath(this.LJFF.LIZ, this.LJ);
                        canvas.drawPath(this.LJII.LIZ, this.LJI);
                        canvas.drawPath(this.LJIIIZ.LIZ, this.LJIIIIZZ);
                        canvas.drawPath(this.LJIIJJI.LIZ, this.LJIIJ);
                        canvas.drawPath(this.LJIILIIL.LIZ, this.LJIIL);
                    }
                });
            }
            if (!((Boolean) this.LLJLIL.getValue()).booleanValue()) {
                View viewFindViewById = viewGroup2.findViewById(R.id.y9m);
                this.LLJJJIL = viewFindViewById;
                if (viewFindViewById != null && (textView = (TextView) viewFindViewById.findViewById(R.id.y9o)) != null) {
                    if (C288810BTr.LIZ()) {
                        textView.setText(2131829658);
                    } else if (((Number) C0BE2.LIZ.getValue()).intValue() == 1) {
                        textView.setText(2131833379);
                    }
                }
            }
            View view = this.LLJJJIL;
            if (view != null) {
                C786410Ut5.I7(new C1466570oGd(this, 14), view);
            }
            View viewFindViewById2 = viewGroup2.findViewById(R.id.gu6);
            this.LLJL = viewFindViewById2;
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new C1466570oGd(this, 15), viewFindViewById2);
            }
            this.LLJJJJLIIL = viewGroup2.findViewById(R.id.xie);
            this.LLJJL = viewGroup2.findViewById(R.id.xig);
            C1427240nFC c1427240nFC2 = (C1427240nFC) viewGroup2.findViewById(R.id.xih);
            if (c1427240nFC2 != null) {
                c1427240nFC2.setTuxFont(61);
                c1427240nFC2.setTextSizeSp(13.0f);
                c1427240nFC2.setTextColorAttr(R.attr.a1p);
                if (C298960Bni.LIZ()) {
                    c1427240nFC2.setText(getString(2131850056));
                }
                c1427240nFC = c1427240nFC2;
            }
            this.LLJJLIIIJLLLLLLLZ = c1427240nFC;
            View view2 = this.LLJJL;
            if (view2 != null) {
                C786410Ut5.I7(new C1466570oGd(this, 12), view2);
            }
            View view3 = this.LLJJJJLIIL;
            if (view3 != null) {
                C786410Ut5.I7(new C1466570oGd(this, 13), view3);
            }
            View viewFindViewById3 = viewGroup2.findViewById(R.id.f7d);
            this.LLJJJJ = viewFindViewById3;
            if (viewFindViewById3 != null) {
                C786410Ut5.I7(new C1466570oGd(this, 16), viewFindViewById3);
            }
            return viewGroup2;
        }
        return new FrameLayout(requireSceneContext());
    }
}
