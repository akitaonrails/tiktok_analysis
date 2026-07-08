package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.tako.botpage.toptitle.TopTitleAssem;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.SevenSheetTopTitleAssem;

/* JADX INFO: renamed from: X.0yd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864890yd5 implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C1864890yd5 c1864890yd5) {
    }

    public static final void onCanceled$1(C1864890yd5 c1864890yd5) {
    }

    public static final void onCanceled$2(C1864890yd5 c1864890yd5) {
    }

    public static final void onFailed$0(C1864890yd5 c1864890yd5, Throwable th) {
    }

    public static final void onFailed$1(C1864890yd5 c1864890yd5, Throwable th) {
    }

    public static final void onFailed$2(C1864890yd5 c1864890yd5, Throwable th) {
    }

    public static final void onProgress$0(C1864890yd5 c1864890yd5, float f) {
    }

    public static final void onProgress$1(C1864890yd5 c1864890yd5, float f) {
    }

    public static final void onProgress$2(C1864890yd5 c1864890yd5, float f) {
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
            case 2:
                LIZ$2(this, bitmap);
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
            case 2:
                onCanceled$2(this);
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
            case 2:
                onFailed$2(this, th);
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
            case 2:
                onProgress$2(this, f);
                break;
        }
    }

    public C1864890yd5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1864890yd5 c1864890yd5, Bitmap bitmap) {
        ((ImageView) c1864890yd5.l0).setImageBitmap(bitmap);
    }

    public static final void LIZ$1(C1864890yd5 c1864890yd5, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        C1295960jpS c1295960jpSKp = ((SevenSheetTopTitleAssem) c1864890yd5.l0).kp();
        if (c1295960jpSKp != null) {
            c1295960jpSKp.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        C1295960jpS c1295960jpSKp2 = ((SevenSheetTopTitleAssem) c1864890yd5.l0).kp();
        if (c1295960jpSKp2 != null) {
            c1295960jpSKp2.setImageBitmap(bitmap);
        }
        ((SevenSheetTopTitleAssem) c1864890yd5.l0).sp(bitmap, null);
    }

    public static final void LIZ$2(C1864890yd5 c1864890yd5, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        C1295960jpS c1295960jpSMp = ((TopTitleAssem) c1864890yd5.l0).mp();
        if (c1295960jpSMp != null) {
            c1295960jpSMp.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        C1295960jpS c1295960jpSMp2 = ((TopTitleAssem) c1864890yd5.l0).mp();
        if (c1295960jpSMp2 != null) {
            c1295960jpSMp2.setImageBitmap(bitmap);
        }
        ((TopTitleAssem) c1864890yd5.l0).sp(bitmap, null);
    }
}
