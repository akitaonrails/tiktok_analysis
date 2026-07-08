package X;

import android.graphics.Bitmap;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoComponent;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738980Sym implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C738980Sym c738980Sym) {
    }

    public static final void onCanceled$1(C738980Sym c738980Sym) {
    }

    public static final void onCanceled$2(C738980Sym c738980Sym) {
    }

    public static final void onFailed$1(C738980Sym c738980Sym, Throwable th) {
    }

    public static final void onFailed$2(C738980Sym c738980Sym, Throwable th) {
    }

    public static final void onProgress$0(C738980Sym c738980Sym, float f) {
    }

    public static final void onProgress$1(C738980Sym c738980Sym, float f) {
    }

    public static final void onProgress$2(C738980Sym c738980Sym, float f) {
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

    public C738980Sym(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C738980Sym c738980Sym, Bitmap bitmap) {
        Function2 function2 = (Function2) c738980Sym.l0;
        if (function2 != null) {
            function2.invoke(bitmap, null);
        }
    }

    public static final void LIZ$1(C738980Sym c738980Sym, Bitmap bitmap) {
        if (bitmap != null) {
            ((TuxTag) c738980Sym.l0).setTagIconBitmap(bitmap);
        }
    }

    public static final void LIZ$2(C738980Sym c738980Sym, Bitmap bitmap) {
        ((StoryPhotoComponent) c738980Sym.l0).LLJLLL = bitmap;
    }

    public static final void onFailed$0(C738980Sym c738980Sym, Throwable th) {
        Function2 function2 = (Function2) c738980Sym.l0;
        if (function2 != null) {
            function2.invoke(null, th);
        }
    }
}
