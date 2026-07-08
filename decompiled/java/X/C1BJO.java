package X;

import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: X.1BJO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BJO extends RuntimeException {
    public static final C1BKB Companion = new Object() { // from class: X.1BKB
    };
    public static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public C1BJO() {
    }

    public C1BJO(final String str) {
        super(str);
        Random random = new Random();
        if (str != null && FacebookSdk.LJII() && random.nextInt(100) > 50) {
            C1BJN.LIZ(new C1BKH() { // from class: X.1BJs
                @Override // X.C1BKH
                public final void LIZ(boolean z) {
                    C1BJO.m118lambda$semisugar$_init_$lambda0$0(str, z);
                }
            }, C1EPD.ErrorReport);
        }
    }

    public C1BJO(Throwable th) {
        super(th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1BJO(String str, Object... objArr) {
        String strJ4;
        if (str == null) {
            strJ4 = null;
        } else {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            strJ4 = C786410Ut5.j4(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        this(strJ4);
    }

    /* JADX INFO: renamed from: lambda$semisugar$_init_$lambda-0$0, reason: not valid java name */
    public static void m118lambda$semisugar$_init_$lambda0$0(String str, boolean z) {
    }

    public C1BJO(String str, Throwable th) {
        super(str, th);
    }
}
