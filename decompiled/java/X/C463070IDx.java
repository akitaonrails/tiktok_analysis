package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: renamed from: X.0IDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C463070IDx implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onCanceled$0(C463070IDx c463070IDx) {
    }

    public static final void onCanceled$1(C463070IDx c463070IDx) {
    }

    public static final void onFailed$0(C463070IDx c463070IDx, Throwable th) {
    }

    public static final void onFailed$1(C463070IDx c463070IDx, Throwable th) {
    }

    public static final void onProgress$0(C463070IDx c463070IDx, float f) {
    }

    public static final void onProgress$1(C463070IDx c463070IDx, float f) {
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

    public static final void LIZ$0(C463070IDx c463070IDx, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(((Context) c463070IDx.l0).getResources(), bitmap);
        C0HAH c0hah = C0HAH.LIZ;
        TuxTextView tuxTextView = (TuxTextView) c463070IDx.l1;
        Image image = (Image) c463070IDx.l2;
        c0hah.getClass();
        C0HAH.LIZJ(tuxTextView, bitmapDrawable, image);
    }

    public static final void LIZ$1(C463070IDx c463070IDx, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(((Context) c463070IDx.l0).getResources(), bitmap);
        C0HAJ c0haj = C0HAJ.LIZ;
        TuxTextView tuxTextView = (TuxTextView) c463070IDx.l1;
        Image image = (Image) c463070IDx.l2;
        c0haj.getClass();
        C0HAJ.LIZIZ(tuxTextView, bitmapDrawable, image);
    }

    public C463070IDx(Context context, TuxTextView tuxTextView, Image image, int i) {
        this.$t = i;
        this.l0 = context;
        this.l1 = tuxTextView;
        this.l2 = image;
    }
}
