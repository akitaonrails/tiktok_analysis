package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04Jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1077104Jd implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onCanceled$0(C1077104Jd c1077104Jd) {
    }

    public static final void onCanceled$1(C1077104Jd c1077104Jd) {
    }

    public static final void onFailed$0(C1077104Jd c1077104Jd, Throwable th) {
    }

    public static final void onFailed$1(C1077104Jd c1077104Jd, Throwable th) {
    }

    public static final void onProgress$0(C1077104Jd c1077104Jd, float f) {
    }

    public static final void onProgress$1(C1077104Jd c1077104Jd, float f) {
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

    public static final void LIZ$0(C1077104Jd c1077104Jd, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        Function1 function1 = (Function1) c1077104Jd.l0;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable(((C10332042g) c1077104Jd.l1).getContext().getResources(), bitmap);
        } else {
            bitmapDrawable = null;
        }
        function1.invoke(bitmapDrawable);
    }

    public static final void LIZ$1(C1077104Jd c1077104Jd, Bitmap bitmap) {
        Object c098200Yq;
        C03IN c03in = (C03IN) c1077104Jd.l0;
        try {
            c098200Yq = new BitmapDrawable(c03in.getResources(), C03IN.LIZJ(c03in.getTagRadius(), bitmap, c03in));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Drawable drawableLIZLLL = (Drawable) c098200Yq;
        if (drawableLIZLLL == null) {
            drawableLIZLLL = C03IN.LIZLLL((C03IN) c1077104Jd.l0, ((C812103Ff) c1077104Jd.l1).LIZ);
        }
        c03in.setBackground(drawableLIZLLL);
    }

    public C1077104Jd(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
