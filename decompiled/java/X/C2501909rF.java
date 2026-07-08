package X;

import Y.AfS139S0200000_3;
import Y.AkS468S0100000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501909rF implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onProgress$0(C2501909rF c2501909rF, float f) {
    }

    public static final void onProgress$1(C2501909rF c2501909rF, float f) {
    }

    public static final void onProgress$2(C2501909rF c2501909rF, float f) {
    }

    public static final void onProgress$3(C2501909rF c2501909rF, float f) {
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
        }
    }

    public static final void onCanceled$0(C2501909rF c2501909rF) {
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    public static final void onCanceled$1(C2501909rF c2501909rF) {
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    public static final void onCanceled$2(C2501909rF c2501909rF) {
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    public static final void onCanceled$3(C2501909rF c2501909rF) {
        C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.attr.zn);
        c1331670kl3LJFF.LJJ((SmartImageView) c2501909rF.l0);
        C786410Ut5.h3(c1331670kl3LJFF);
        Function1 function1 = (Function1) c2501909rF.l1;
        if (function1 != null) {
            function1.invoke(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(C2501909rF c2501909rF, Bitmap bitmap) {
        ((C259800zU) c2501909rF.l0).element = bitmap;
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$1(C2501909rF c2501909rF, Bitmap bitmap) {
        ((C259800zU) c2501909rF.l0).element = bitmap;
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$2(C2501909rF c2501909rF, Bitmap bitmap) {
        ((C259800zU) c2501909rF.l0).element = bitmap;
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    public static final void LIZ$3(C2501909rF c2501909rF, Bitmap bitmap) {
        C11NZ.LJJJJZ(bitmap).LJL(C11S5.LIZ()).LJJJJZI(new AkS468S0100000_3((SmartImageView) c2501909rF.l0, 20)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS139S0200000_3(c2501909rF.l0, (Context) c2501909rF.l1, (Function1<? super Drawable, Unit>) 10));
    }

    public static final void onFailed$0(C2501909rF c2501909rF, Throwable th) {
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    public static final void onFailed$1(C2501909rF c2501909rF, Throwable th) {
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    public static final void onFailed$2(C2501909rF c2501909rF, Throwable th) {
        ((CountDownLatch) c2501909rF.l1).countDown();
    }

    public static final void onFailed$3(C2501909rF c2501909rF, Throwable th) {
        C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.attr.zn);
        c1331670kl3LJFF.LJJ((SmartImageView) c2501909rF.l0);
        C786410Ut5.h3(c1331670kl3LJFF);
        Function1 function1 = (Function1) c2501909rF.l1;
        if (function1 != null) {
            function1.invoke(1);
        }
    }

    public C2501909rF(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
