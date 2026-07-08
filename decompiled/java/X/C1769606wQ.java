package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06wQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769606wQ implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onProgress$0(C1769606wQ c1769606wQ, float f) {
    }

    public static final void onProgress$1(C1769606wQ c1769606wQ, float f) {
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

    public static final void onCanceled$0(C1769606wQ c1769606wQ) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769606wQ.l1;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
    }

    public static final void onCanceled$1(C1769606wQ c1769606wQ) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769606wQ.l1;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC20236714Gf.resumeWith(bool);
    }

    public static final void LIZ$0(C1769606wQ c1769606wQ, Bitmap bitmap) {
        ((C118300cf) c1769606wQ.l0).element++;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769606wQ.l1;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
    }

    public static final void LIZ$1(C1769606wQ c1769606wQ, Bitmap bitmap) {
        C1331660kl2.LIZJ().LJI(bitmap, UriProtector.parse((String) ListProtector.get((List) c1769606wQ.l0, 0)));
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769606wQ.l1;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC20236714Gf.resumeWith(bool);
    }

    public static final void onFailed$0(C1769606wQ c1769606wQ, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadImage onFailed throwable:");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769606wQ.l1;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
    }

    public static final void onFailed$1(C1769606wQ c1769606wQ, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769606wQ.l1;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC20236714Gf.resumeWith(bool);
    }

    public C1769606wQ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
