package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.fly_main_color.FlyMainColor;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C463060IDw implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onProgress$0(C463060IDw c463060IDw, float f) {
    }

    public static final void onProgress$1(C463060IDw c463060IDw, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
        }
    }

    public static final void onCanceled$0(C463060IDw c463060IDw) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c463060IDw.l1;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onCanceled$1(C463060IDw c463060IDw) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c463060IDw.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
        C20340514iR.LJI("downloadIcon cancel");
    }

    public static final void LIZ$0(C463060IDw c463060IDw, Bitmap bitmap) {
        if (bitmap == null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c463060IDw.l1;
            C189200o6.m2constructorimpl(null);
            interfaceC1364105Vn.resumeWith(null);
            return;
        }
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, new Rect(0, 0, bitmap.getWidth(), 20)));
        c204674156yLIZ.LJFF(16.0f);
        c204674156yLIZ.LJ(0.0056f, 0.4f, 0.13f, 0.95f, 0.99f);
        int i = c204674156yLIZ.LIZ()[0];
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        int i2 = C0H1B.LIZ[((C0H1C) c463060IDw.l0).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                if (fArr[2] > 0.4f) {
                    fArr[2] = 0.4f;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            fArr[2] = 0.6f;
        }
        InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c463060IDw.l1;
        Integer numValueOf = Integer.valueOf(Color.HSVToColor(fArr));
        C189200o6.m2constructorimpl(numValueOf);
        interfaceC1364105Vn2.resumeWith(numValueOf);
    }

    public static final void LIZ$1(C463060IDw c463060IDw, Bitmap bitmap) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c463060IDw.l0;
        Pair pair = new Pair(((Pair) c463060IDw.l1).getFirst(), new BitmapDrawable(bitmap));
        C189200o6.m2constructorimpl(pair);
        interfaceC1364105Vn.resumeWith(pair);
        C20340514iR.LJI("downloadIcon success");
    }

    public static final void onFailed$0(C463060IDw c463060IDw, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c463060IDw.l1;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFailed$1(C463060IDw c463060IDw, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c463060IDw.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
        C20340514iR.LJI("downloadIcon failed");
    }

    public C463060IDw(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
