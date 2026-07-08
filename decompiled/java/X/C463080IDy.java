package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.ui.SearchHelpPostCardContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0IDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C463080IDy implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$1(C463080IDy c463080IDy) {
    }

    public static final void onCanceled$3(C463080IDy c463080IDy) {
    }

    public static final void onFailed$1(C463080IDy c463080IDy, Throwable th) {
    }

    public static final void onFailed$3(C463080IDy c463080IDy, Throwable th) {
    }

    public static final void onProgress$0(C463080IDy c463080IDy, float f) {
    }

    public static final void onProgress$1(C463080IDy c463080IDy, float f) {
    }

    public static final void onProgress$2(C463080IDy c463080IDy, float f) {
    }

    public static final void onProgress$3(C463080IDy c463080IDy, float f) {
    }

    public static final void onProgress$4(C463080IDy c463080IDy, float f) {
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
            case 3:
                LIZ$3(this, bitmap);
                break;
            case 4:
                LIZ$4(this, bitmap);
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
            case 3:
                onCanceled$3(this);
                break;
            case 4:
                onCanceled$4(this);
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
            case 3:
                onFailed$3(this, th);
                break;
            case 4:
                onFailed$4(this, th);
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
            case 3:
                onProgress$3(this, f);
                break;
            case 4:
                onProgress$4(this, f);
                break;
        }
    }

    public static final void onCanceled$0(C463080IDy c463080IDy) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c463080IDy.l0;
        C098200Yq c098200Yq = new C098200Yq(new Exception("Load failed"));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public static final void onCanceled$2(C463080IDy c463080IDy) {
        ((Function1) c463080IDy.l0).invoke(null);
    }

    public static final void onCanceled$4(C463080IDy c463080IDy) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c463080IDy.l0;
        C098200Yq c098200Yq = new C098200Yq(new Exception("Load failed"));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public C463080IDy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C463080IDy c463080IDy, Bitmap bitmap) {
        if (bitmap != null) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c463080IDy.l0;
            C189200o6.m2constructorimpl(bitmap);
            interfaceC20236714Gf.resumeWith(bitmap);
        } else {
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c463080IDy.l0;
            C098200Yq c098200Yq = new C098200Yq(new Exception("Load failed"));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf2.resumeWith(c098200Yq);
        }
    }

    public static final void LIZ$1(C463080IDy c463080IDy, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        ((ImageView) ((View) c463080IDy.l0).findViewById(R.id.lj8)).setImageBitmap(bitmap);
    }

    public static final void LIZ$2(C463080IDy c463080IDy, Bitmap bitmap) {
        ((Function1) c463080IDy.l0).invoke(bitmap);
    }

    public static final void LIZ$3(C463080IDy c463080IDy, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(((SearchHelpPostCardContentAssem) c463080IDy.l0).getContentView().getContext().getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
            C418580GbA.LLJL = C418440Gaw.LIZIZ(6);
            ViewGroup viewGroup = ((SearchHelpPostCardContentAssem) c463080IDy.l0).LLJJLIIIJLLLLLLLZ;
            if (viewGroup != null) {
                viewGroup.setBackground(bitmapDrawable);
            }
        }
    }

    public static final void LIZ$4(C463080IDy c463080IDy, Bitmap bitmap) {
        if (bitmap != null) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c463080IDy.l0;
            C189200o6.m2constructorimpl(bitmap);
            interfaceC20236714Gf.resumeWith(bitmap);
        } else {
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c463080IDy.l0;
            C098200Yq c098200Yq = new C098200Yq(new Exception("Load failed"));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf2.resumeWith(c098200Yq);
        }
    }

    public static final void onFailed$0(C463080IDy c463080IDy, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c463080IDy.l0;
        C098200Yq c098200Yq = new C098200Yq(new Exception("Load failed"));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public static final void onFailed$2(C463080IDy c463080IDy, Throwable th) {
        ((Function1) c463080IDy.l0).invoke(null);
    }

    public static final void onFailed$4(C463080IDy c463080IDy, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c463080IDy.l0;
        C098200Yq c098200Yq = new C098200Yq(new Exception("Load failed"));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }
}
