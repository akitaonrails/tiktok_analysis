package X;

import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTypefaceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0es4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105380es4 {
    public final DataChannel LIZ;
    public final ViewGroup LIZIZ;
    public final int LIZJ;
    public final ImageView LIZLLL;
    public final C16F5 LJ;
    public final C0GSX LJFF;
    public final boolean LJI;
    public C1105460esC LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;

    public C1105380es4(DataChannel dataChannel, C1091250eVH c1091250eVH, int i) {
        Typeface typefaceLIZIZ;
        this.LIZ = dataChannel;
        this.LIZIZ = c1091250eVH;
        this.LIZJ = i;
        this.LIZLLL = (ImageView) c1091250eVH.findViewById(R.id.l9a);
        C16F5 c16f5 = (C16F5) c1091250eVH.findViewById(R.id.z_3);
        C786410Ut5.LLJJJJ((C16F5) c1091250eVH.findViewById(R.id.z_2), 8);
        C786410Ut5.LLJJJJ(c16f5, 0);
        this.LJ = c16f5;
        C0GSX c0gsx = (C0GSX) c1091250eVH.findViewById(R.id.b_u);
        this.LJFF = c0gsx;
        this.LJI = !(dataChannel != null ? C500260Jjc.LJIIZILJ(dataChannel) : false);
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezq, C1834150xpV.LJII(c1091250eVH.getContext()));
        this.LJIIIIZZ = C20736316Cj.LIZJ(R.attr.eqq, c0gsx);
        this.LJIIIZ = C20736316Cj.LIZIZ(R.attr.eqr, c0gsx.getContext());
        this.LJIIJ = C20736316Cj.LIZIZ(R.attr.eqt, c0gsx.getContext());
        this.LJIIJJI = C20736316Cj.LIZIZ(R.attr.equ, c0gsx.getContext());
        this.LJIIL = C20736316Cj.LIZIZ(R.attr.exr, c0gsx.getContext());
        this.LJIILIIL = C20736316Cj.LIZIZ(R.attr.eqs, c0gsx.getContext());
        this.LJIILJJIL = C20736316Cj.LIZIZ(R.attr.eqv, c0gsx.getContext());
        this.LJIILL = C20736316Cj.LIZIZ(R.attr.ep6, C1834150xpV.LJII(c1091250eVH.getContext()));
        LiveMainFrameworkUpdateTypefaceSetting liveMainFrameworkUpdateTypefaceSetting = LiveMainFrameworkUpdateTypefaceSetting.INSTANCE;
        if (liveMainFrameworkUpdateTypefaceSetting.enable()) {
            typefaceLIZIZ = C1119920fFW.LIZIZ(OppoPermissionPopupMaskDelayExp.DEFAULT, 70);
        } else {
            typefaceLIZIZ = null;
        }
        c16f5.setTextColor(iLIZIZ);
        if (liveMainFrameworkUpdateTypefaceSetting.enable()) {
            if (typefaceLIZIZ != null) {
                c16f5.setTypeface(typefaceLIZIZ);
            }
        } else {
            c16f5.setTypeface(C1119920fFW.LIZIZ(OppoPermissionPopupMaskDelayExp.DEFAULT, 70));
        }
        c16f5.setLetterSpacing(-0.04f);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1105460esC r25, boolean r26, final boolean r27) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1105380es4.LIZ(X.0esC, boolean, boolean):void");
    }

    public static void LIZIZ(C1105380es4 c1105380es4, int i, int i2, float f, int i3) {
        boolean z;
        if ((i3 & 4) != 0) {
            f = (int) C497740JfY.LIZIZ(2.0f);
        }
        if ((i3 & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        C0GSX c0gsx = c1105380es4.LJFF;
        int visibility = c0gsx.getVisibility();
        c0gsx.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0gsx);
        c1105380es4.LJFF.setStrokeWidth(f);
        c1105380es4.LJFF.setIsBorder(z);
        c1105380es4.LJFF.LIZ(i, i2);
    }
}
