package X;

import android.graphics.Bitmap;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.01zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C517601zy implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onCanceled$0(C517601zy c517601zy) {
    }

    public static final void onCanceled$1(C517601zy c517601zy) {
    }

    public static final void onFailed$0(C517601zy c517601zy, Throwable th) {
    }

    public static final void onProgress$0(C517601zy c517601zy, float f) {
    }

    public static final void onProgress$1(C517601zy c517601zy, float f) {
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

    public static final void LIZ$0(C517601zy c517601zy, Bitmap bitmap) {
        if (bitmap != null) {
            ((LinearLayout) c517601zy.l1).setBackground(new C443530HaJ(((C1370860lmG) c517601zy.l0).getContext().getResources(), bitmap));
        }
    }

    public static final void LIZ$1(C517601zy c517601zy, Bitmap bitmap) {
        if (!((C013C) c517601zy.l0).element) {
            if (bitmap != null) {
                InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c517601zy.l1;
                C189200o6.m2constructorimpl(bitmap);
                interfaceC1364105Vn.resumeWith(bitmap);
            } else {
                InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c517601zy.l1;
                C098200Yq c098200Yq = new C098200Yq(new Exception("Bitmap is null"));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn2.resumeWith(c098200Yq);
            }
            ((C013C) c517601zy.l0).element = true;
        }
    }

    public static final void onFailed$1(C517601zy c517601zy, Throwable th) {
        if (!((C013C) c517601zy.l0).element) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c517601zy.l1;
            if (th == null) {
                th = new Exception("Failed to download bitmap; exception is null");
            }
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn.resumeWith(c098200Yq);
            ((C013C) c517601zy.l0).element = true;
        }
    }

    public C517601zy(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
