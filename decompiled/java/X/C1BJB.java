package X;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.1BJB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJB implements C1BK7 {
    public final OutputStream LIZ;
    public final C1BJC LIZIZ;
    public boolean LIZJ = true;
    public final boolean LIZLLL;

    public final void LJII() throws IOException {
        if (this.LIZLLL) {
            this.LIZ.write("&".getBytes(Charsets.UTF_8));
        } else {
            LJFF("--%s", GraphRequest.LJIIIIZZ);
        }
    }

    @Override // X.C1BK7
    public final void LIZ(String str, String str2) {
        LIZJ(str, null, null);
        LJFF("%s", str2);
        LJII();
        if (this.LIZIZ != null) {
            Intrinsics.LJIIJJI(str, "    ");
            C1BJC.LIZIZ();
        }
    }

    public final void LIZIZ(String str, Object... objArr) {
        if (!this.LIZLLL) {
            if (this.LIZJ) {
                OutputStream outputStream = this.LIZ;
                Charset charset = Charsets.UTF_8;
                outputStream.write("--".getBytes(charset));
                OutputStream outputStream2 = this.LIZ;
                String str2 = GraphRequest.LJIIIIZZ;
                if (str2 != null) {
                    outputStream2.write(str2.getBytes(charset));
                    this.LIZ.write("\r\n".getBytes(charset));
                    this.LIZJ = false;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            OutputStream outputStream3 = this.LIZ;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String strJ4 = C786410Ut5.j4(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Charset charset2 = Charsets.UTF_8;
            if (strJ4 != null) {
                outputStream3.write(strJ4.getBytes(charset2));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        OutputStream outputStream4 = this.LIZ;
        Locale locale = Locale.US;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
        outputStream4.write(URLEncoder.encode(C786410Ut5.k4(locale, str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)), "UTF-8").getBytes(Charsets.UTF_8));
    }

    public final void LJFF(String str, Object... objArr) {
        LIZIZ(str, Arrays.copyOf(objArr, objArr.length));
        if (!this.LIZLLL) {
            LIZIZ("\r\n", new Object[0]);
        }
    }

    public C1BJB(OutputStream outputStream, C1BJC c1bjc, boolean z) {
        this.LIZ = outputStream;
        this.LIZIZ = c1bjc;
        this.LIZLLL = z;
    }

    public final void LIZJ(String str, String str2, String str3) {
        if (!this.LIZLLL) {
            LIZIZ("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                LIZIZ("; filename=\"%s\"", str2);
            }
            LJFF("", new Object[0]);
            if (str3 != null) {
                LJFF("%s: %s", "Content-Type", str3);
            }
            LJFF("", new Object[0]);
            return;
        }
        OutputStream outputStream = this.LIZ;
        String strJ4 = C786410Ut5.j4("%s=", Arrays.copyOf(new Object[]{str}, 1));
        Charset charset = Charsets.UTF_8;
        if (strJ4 != null) {
            outputStream.write(strJ4.getBytes(charset));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final void LIZLLL(Uri uri, String str, String str2) throws Throwable {
        int iLJFF;
        long j;
        if (str2 == null) {
            str2 = "content/unknown";
        }
        LIZJ(str, str, str2);
        if (this.LIZ instanceof C1BJD) {
            Cursor cursorLJJJ = null;
            try {
                cursorLJJJ = C2204961BRm.LJJJ(FacebookSdk.LIZJ().getContentResolver(), uri, null, null, null, null, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloaN5G2vOGI=", new String[]{"019e5"}));
                if (cursorLJJJ == null) {
                    j = 0;
                } else {
                    int columnIndex = cursorLJJJ.getColumnIndex("_size");
                    cursorLJJJ.moveToFirst();
                    j = cursorLJJJ.getLong(columnIndex);
                    cursorLJJJ.close();
                }
                ((C1BJD) this.LIZ).LIZIZ(j);
                iLJFF = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (cursorLJJJ != null) {
                    cursorLJJJ.close();
                }
                throw th;
            }
        } else {
            iLJFF = C0W7Q.LJFF(C09NT.LJ(FacebookSdk.LIZJ().getContentResolver(), uri), this.LIZ);
        }
        LJFF("", new Object[0]);
        LJII();
        if (this.LIZIZ != null) {
            Intrinsics.LJIIJJI(str, "    ");
            C786410Ut5.k4(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iLJFF)}, 1));
            C1BJC.LIZIZ();
        }
    }

    public final void LJ(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws Throwable {
        int iLJFF;
        if (str2 == null) {
            str2 = "content/unknown";
        }
        LIZJ(str, str, str2);
        OutputStream outputStream = this.LIZ;
        if (outputStream instanceof C1BJD) {
            ((C1BJD) outputStream).LIZIZ(parcelFileDescriptor.getStatSize());
            iLJFF = 0;
        } else {
            iLJFF = C0W7Q.LJFF(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.LIZ);
        }
        LJFF("", new Object[0]);
        LJII();
        if (this.LIZIZ != null) {
            Intrinsics.LJIIJJI(str, "    ");
            C786410Ut5.k4(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iLJFF)}, 1));
            C1BJC.LIZIZ();
        }
    }

    public final void LJI(String str, Object obj, GraphRequest graphRequest) {
        Closeable closeable = this.LIZ;
        if (closeable instanceof C1BKL) {
            ((C1BKL) closeable).LIZ(graphRequest);
        }
        String str2 = GraphRequest.LJIIIIZZ;
        if (C1BJA.LJ(obj)) {
            LIZ(str, C1BJA.LJI(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            LIZJ(str, str, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, this.LIZ);
            LJFF("", new Object[0]);
            LJII();
            if (this.LIZIZ == null) {
                return;
            }
            Intrinsics.LJIIJJI(str, "    ");
            C1BJC.LIZIZ();
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            LIZJ(str, str, "content/unknown");
            this.LIZ.write(bArr);
            LJFF("", new Object[0]);
            LJII();
            if (this.LIZIZ == null) {
                return;
            }
            Intrinsics.LJIIJJI(str, "    ");
            C786410Ut5.k4(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            C1BJC.LIZIZ();
            return;
        }
        if (obj instanceof Uri) {
            LIZLLL((Uri) obj, str, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            LJ(str, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (obj instanceof GraphRequest.ParcelableResourceWithMimeType) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = (GraphRequest.ParcelableResourceWithMimeType) obj;
            RESOURCE resource = parcelableResourceWithMimeType.resource;
            String str3 = parcelableResourceWithMimeType.mimeType;
            if (resource instanceof ParcelFileDescriptor) {
                LJ(str, (ParcelFileDescriptor) resource, str3);
                return;
            } else {
                if (resource instanceof Uri) {
                    LIZLLL((Uri) resource, str, str3);
                    return;
                }
                throw new IllegalArgumentException("value is not a supported type.");
            }
        }
        throw new IllegalArgumentException("value is not a supported type.");
    }
}
