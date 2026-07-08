package X;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12Yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775012Yq implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C19775012Yq c19775012Yq) {
    }

    public static final void onCanceled$1(C19775012Yq c19775012Yq) {
    }

    public static final void onFailed$0(C19775012Yq c19775012Yq, Throwable th) {
    }

    public static final void onFailed$1(C19775012Yq c19775012Yq, Throwable th) {
    }

    public static final void onProgress$0(C19775012Yq c19775012Yq, float f) {
    }

    public static final void onProgress$1(C19775012Yq c19775012Yq, float f) {
    }

    public static final void onProgress$2(C19775012Yq c19775012Yq, float f) {
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

    public static final void onCanceled$2(C19775012Yq c19775012Yq) {
        ((Function0) c19775012Yq.l0).invoke();
    }

    public C19775012Yq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C19775012Yq c19775012Yq, Bitmap bitmap) {
        ((Function1) c19775012Yq.l0).invoke(bitmap);
    }

    public static final void LIZ$1(C19775012Yq c19775012Yq, Bitmap bitmap) {
        ((Function1) c19775012Yq.l0).invoke(bitmap);
    }

    public static final void LIZ$2(C19775012Yq c19775012Yq, Bitmap bitmap) {
        ((Function0) c19775012Yq.l0).invoke();
    }

    public static final void onFailed$2(C19775012Yq c19775012Yq, Throwable th) {
        ((Function0) c19775012Yq.l0).invoke();
    }
}
