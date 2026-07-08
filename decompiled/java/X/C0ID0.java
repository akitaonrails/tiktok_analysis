package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: X.0ID0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID0 extends AbstractC1335900krs {
    public final int $t;

    public static final void Ad$0(C0ID0 c0id0, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$1(C0ID0 c0id0, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$2(C0ID0 c0id0, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$3(C0ID0 c0id0, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void cm$0(C0ID0 c0id0, Uri uri, View view, Throwable th) {
    }

    public static final void cm$1(C0ID0 c0id0, Uri uri, View view, Throwable th) {
    }

    public static final void cm$3(C0ID0 c0id0, Uri uri, View view, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                C1575440r6E.LIZIZ("vibe_feed_summary_cover_loading_failed", null);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C0ID0(int i) {
        this.$t = i;
    }
}
