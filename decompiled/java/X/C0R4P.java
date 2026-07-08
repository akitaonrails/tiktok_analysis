package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0R4P, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4P implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C0R4P c0r4p) {
    }

    public static final void onFailed$0(C0R4P c0r4p, Throwable th) {
    }

    public static final void onProgress$0(C0R4P c0r4p, float f) {
    }

    public static final void onProgress$1(C0R4P c0r4p, float f) {
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

    public static final void onCanceled$1(C0R4P c0r4p) {
        C099F c099f = ((C0QAZ) c0r4p.l0).LLJLLL;
        if (c099f != null) {
            c099f.LJJLIIIJILLIZJL(Unit.LIZ);
        }
    }

    public C0R4P(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C0R4P c0r4p, Bitmap bitmap) {
        if (bitmap != null) {
            C678140Qiq c678140Qiq = (C678140Qiq) c0r4p.l0;
            if (c678140Qiq.LJIIIZ) {
                C0HA4 c0ha4 = c678140Qiq.LIZJ;
                if (c0ha4 == null) {
                    c0ha4 = null;
                }
                c0ha4.setBackground(new BitmapDrawable(bitmap));
            }
        }
    }

    public static final void LIZ$1(C0R4P c0r4p, Bitmap bitmap) {
        C099F c099f = ((C0QAZ) c0r4p.l0).LLJLLL;
        if (c099f != null) {
            c099f.LJJLIIIJILLIZJL(Unit.LIZ);
        }
    }

    public static final void onFailed$1(C0R4P c0r4p, Throwable th) {
        C099F c099f = ((C0QAZ) c0r4p.l0).LLJLLL;
        if (c099f != null) {
            c099f.LJJLIIIJILLIZJL(Unit.LIZ);
        }
    }
}
