package X;

import Y.AAListenerS269S0200000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fG4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120260fG4 {
    public final boolean LIZ;
    public ImageView LIZIZ;
    public final RectF LIZJ = new RectF();
    public final RectF LIZLLL = new RectF();
    public final float LJ = 1.0f;
    public float LJFF;
    public final AnimatorSet LJI;
    public final C1120290fG7 LJII;

    public C1120260fG4(C1120250fG3 c1120250fG3, Bitmap bitmap, PointF pointF, PointF pointF2, PointF pointF3, boolean z) {
        C1120290fG7 c1120290fG7LIZIZ;
        long jNextInt;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap2;
        this.LIZ = z;
        this.LJFF = 1.0f;
        int iLIZIZ = C814420VxA.LIZIZ((c1120250fG3.getTotalDurationOptimization() / LSPassThroughRecordSizeConfig.DEFAULT) * 60);
        ImageView imageViewLIZIZ = c1120250fG3.LLJJJ.LIZIZ();
        this.LIZIZ = imageViewLIZIZ;
        if (imageViewLIZIZ == null) {
            ImageView imageView = new ImageView(c1120250fG3.getContext());
            this.LIZIZ = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            int i = C1120240fG2.LLJJIJI;
            c1120250fG3.addView(imageView, new ViewGroup.LayoutParams(i, i));
        }
        ImageView imageView2 = this.LIZIZ;
        if (imageView2 != null) {
            if (c1120250fG3.LLJJJJLIIL) {
                Drawable drawable = imageView2.getDrawable();
                if (!(drawable instanceof BitmapDrawable) || (bitmapDrawable = (BitmapDrawable) drawable) == null || (bitmap2 = bitmapDrawable.getBitmap()) == null || bitmap2.isRecycled() || !Intrinsics.LJFF(bitmap2, bitmap)) {
                    imageView2.setImageBitmap(bitmap);
                }
            } else {
                imageView2.setImageBitmap(bitmap);
            }
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            int i2 = C1120240fG2.LLJJIJI;
            layoutParams.height = i2;
            imageView2.getLayoutParams().width = i2;
        }
        if (z) {
            c1120290fG7LIZIZ = c1120250fG3.LLJJIJIL.LIZIZ();
        } else {
            c1120290fG7LIZIZ = c1120250fG3.LLJJIJIIJIL.LIZIZ();
        }
        this.LJII = c1120290fG7LIZIZ == null ? new C1120290fG7(pointF, pointF3, pointF2, iLIZIZ) : c1120290fG7LIZIZ;
        int visibility = c1120250fG3.getVisibility();
        c1120250fG3.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1120250fG3);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        C1120340fGC c1120340fGCLIZ = C1120300fG8.LIZ(0, iLIZIZ - 1);
        c1120340fGCLIZ.LIZ(c1120250fG3.LLJL.LIZJ);
        c1120340fGCLIZ.setDuration(c1120250fG3.getTotalDurationOptimization());
        c1120340fGCLIZ.addUpdateListener(new AUListenerS266S0100000_17(this, 21));
        c1120340fGCLIZ.addListener(new AAListenerS269S0200000_17(this, c1120250fG3, 5));
        c1120340fGCLIZ.addListener(new AAListenerS269S0200000_17(this, c1120250fG3, 4));
        arrayList.add(c1120340fGCLIZ);
        this.LJFF = 1.0f;
        if (!c1120250fG3.LLJL.LJ) {
            C1120340fGC c1120340fGCLIZ2 = C1120300fG8.LIZ(c1120250fG3.getAppearAlphaStart(), c1120250fG3.getAppearAlphaEnd());
            c1120340fGCLIZ2.LIZ(c1120250fG3.LLJL.LIZJ);
            c1120340fGCLIZ2.setDuration(c1120250fG3.getIconAlphaDurationOptimization());
            c1120340fGCLIZ2.addUpdateListener(new AUListenerS266S0100000_17(this, 22));
            arrayList.add(c1120340fGCLIZ2);
            int totalDurationOptimization = (int) (c1120250fG3.getTotalDurationOptimization() / 3.0f);
            int totalDurationOptimization2 = (int) (c1120250fG3.getTotalDurationOptimization() * 0.55f);
            if (totalDurationOptimization < totalDurationOptimization2) {
                jNextInt = AbstractC19994813Le.Default.nextInt(totalDurationOptimization, totalDurationOptimization2);
            } else {
                jNextInt = totalDurationOptimization2;
            }
            C1120340fGC c1120340fGCLIZ3 = C1120300fG8.LIZ(c1120250fG3.getDisappearAlphaStart(), c1120250fG3.getDisappearAlphaEnd());
            c1120340fGCLIZ3.LIZ(c1120250fG3.LLJL.LIZJ);
            c1120340fGCLIZ3.setDuration(c1120250fG3.getTotalDurationOptimization() - jNextInt);
            c1120340fGCLIZ3.setStartDelay(jNextInt);
            c1120340fGCLIZ3.addUpdateListener(new AUListenerS266S0100000_17(this, 23));
            arrayList.add(c1120340fGCLIZ3);
        } else {
            ImageView imageView3 = this.LIZIZ;
            if (imageView3 != null) {
                C786410Ut5.V4(imageView3, c1120250fG3.LJFF(255) / 255.0f);
            }
        }
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.LJI = animatorSet;
    }
}
