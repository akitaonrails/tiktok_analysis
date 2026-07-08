package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.088z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20699088z {
    public static final EnumC20699088z INSTANCE;
    public static final /* synthetic */ EnumC20699088z[] LLILLJJLI;
    public AnonymousClass0890 LL;

    static {
        EnumC20699088z enumC20699088z = new EnumC20699088z();
        INSTANCE = enumC20699088z;
        LLILLJJLI = new EnumC20699088z[]{enumC20699088z};
        new HashMap();
    }

    public static EnumC20699088z[] values() {
        return (EnumC20699088z[]) LLILLJJLI.clone();
    }

    public void destroy() {
        AnonymousClass0890 anonymousClass0890 = this.LL;
        if (anonymousClass0890 != null) {
            synchronized (anonymousClass0890.LIZJ) {
                try {
                    ((LinkedList) anonymousClass0890.LIZJ).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static EnumC20699088z valueOf(String str) {
        return (EnumC20699088z) C08FF.LIZ(EnumC20699088z.class, str);
    }

    public void addUncaughtExceptionConsumer(AnonymousClass0897 anonymousClass0897) {
        if (this.LL == null) {
            AnonymousClass0890 anonymousClass0890 = new AnonymousClass0890();
            this.LL = anonymousClass0890;
            if (!anonymousClass0890.LIZ) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                anonymousClass0890.LIZIZ = defaultUncaughtExceptionHandler;
                if (defaultUncaughtExceptionHandler != anonymousClass0890) {
                    Thread.setDefaultUncaughtExceptionHandler(anonymousClass0890);
                } else {
                    anonymousClass0890.LIZIZ = null;
                }
                anonymousClass0890.LIZ = true;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init mConsumeExceptionHandler:");
        sbLIZ.append(this.LL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        AnonymousClass0891 anonymousClass0891 = AnonymousClass0891.INFO;
        AnonymousClass0892.LIZIZ("UncaughtExceptionPlugin", strLIZIZ, anonymousClass0891);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("add consumer:");
        sbLIZ2.append(anonymousClass0897);
        AnonymousClass0892.LIZIZ("UncaughtExceptionPlugin", C2188811AlT.LIZIZ(sbLIZ2), anonymousClass0891);
        AnonymousClass0890 anonymousClass08902 = this.LL;
        synchronized (anonymousClass08902.LIZJ) {
            try {
                ((LinkedList) anonymousClass08902.LIZJ).add(anonymousClass0897);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void removeUncaughtExceptionConsumer(AnonymousClass0897 anonymousClass0897) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove consumer:");
        sbLIZ.append(anonymousClass0897);
        AnonymousClass0892.LIZIZ("UncaughtExceptionPlugin", C2188811AlT.LIZIZ(sbLIZ), AnonymousClass0891.INFO);
        AnonymousClass0890 anonymousClass0890 = this.LL;
        synchronized (anonymousClass0890.LIZJ) {
            try {
                ((LinkedList) anonymousClass0890.LIZJ).remove(anonymousClass0897);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void init(Application application, AnonymousClass0899 anonymousClass0899, AnonymousClass0891 anonymousClass0891) {
        if (anonymousClass0899 != null) {
            AnonymousClass0892.LIZJ = anonymousClass0899;
        }
        if (anonymousClass0891 != null) {
            AnonymousClass0892.LIZ = anonymousClass0891;
            if (anonymousClass0891 == AnonymousClass0891.DEBUG) {
                AnonymousClass0892.LIZIZ = true;
            }
        }
    }
}
