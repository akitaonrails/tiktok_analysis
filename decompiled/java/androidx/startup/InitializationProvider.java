package androidx.startup;

import X.C08TN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2362209Nk;
import X.C2363009Ns;
import X.C2363109Nt;
import X.C786410Ut5;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C08TN.LIZ().LJ("ProcessLifecycleOwnerInitializer", false);
        Context context = getContext();
        if (context == null) {
            throw new C2363009Ns("Context cannot be null");
        }
        if (C786410Ut5.N3(context) != null) {
            C2363109Nt c2363109NtLIZJ = C2363109Nt.LIZJ(context);
            c2363109NtLIZJ.getClass();
            try {
                try {
                    Trace.beginSection("Startup");
                    c2363109NtLIZJ.LIZ(c2363109NtLIZJ.LIZJ.getPackageManager().getProviderInfo(new ComponentName(c2363109NtLIZJ.LIZJ.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                    Trace.endSection();
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C2363009Ns(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
        C08TN.LIZ().LJI("ProcessLifecycleOwnerInitializer");
        return true;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2 = uri;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "androidx/startup/InitializationProvider", "query", this, new Object[]{uri2, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dTF6Tg0zW9KSRkMgVwaRduCMRhqVa/DZgLWTVnZKX5Z95IR43ayk", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return (Cursor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                uri2 = (Uri) obj;
            }
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            Object obj4 = objArr[3];
            Object obj5 = objArr[4];
        }
        C2362209Nk.LIZ(uri2, "query");
        throw new IllegalStateException("Not allowed.");
    }
}
