package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.08n6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2221408n6 extends C2221808nA {
    public final int LJIIIZ;

    @Override // X.AbstractC2220208mu
    public final byte[] LJII() throws IOException {
        int i;
        File canonicalFile = this.LJII.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            Context context = this.LIZLLL;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    i = C786410Ut5.Y3(packageManager, context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    i = 0;
                } catch (RuntimeException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    i = 0;
                }
            } else {
                i = 0;
            }
            parcelObtain.writeInt(i);
            if ((this.LJIIIZ & 1) == 0) {
                parcelObtain.writeByte((byte) 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                return bArrMarshall;
            }
            String str = this.LIZLLL.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                byte[] bArrMarshall2 = parcelObtain.marshall();
                parcelObtain.recycle();
                return bArrMarshall2;
            }
            File canonicalFile2 = new C0VSJ(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                parcelObtain.writeByte((byte) 1);
                byte[] bArrMarshall3 = parcelObtain.marshall();
                parcelObtain.recycle();
                return bArrMarshall3;
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile2.getPath());
            parcelObtain.writeLong(canonicalFile2.lastModified());
            byte[] bArrMarshall4 = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // X.AbstractC2220208mu
    public final AbstractC2220508mx LJIIJJI() {
        return new C2221708n9(this, this);
    }

    public C2221408n6(Context context, C0VSJ c0vsj, String str) {
        super(context, str, c0vsj);
        this.LJIIIZ = 1;
    }
}
