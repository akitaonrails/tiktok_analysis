package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.08ZN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.album.ClipboardLocalFileUtilsKt$copyToLocalFile$2", f = "ClipboardLocalFileUtils.kt", l = {}, m = "invokeSuspend")
public final class C08ZN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C07WI>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZN(Context context, Uri uri, String str, InterfaceC1364105Vn<? super C08ZN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = uri;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZN(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C07WI> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        C1C7U.LIZ("ClipboardLocalFileUtilsKt@380.copyToLocalFile$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C07WI c07wi = null;
        try {
            InputStream inputStreamLJ = C09NT.LJ(this.LL.getContentResolver(), this.LLILLJJLI);
            if (inputStreamLJ == null) {
                C1C7U.LIZIZ("ClipboardLocalFileUtilsKt@380.copyToLocalFile$2");
                return null;
            }
            String type = this.LL.getContentResolver().getType(this.LLILLJJLI);
            boolean z2 = false;
            if (type != null && u.LJJIIJZLJL(type, "image/", false)) {
                z = true;
            } else {
                z = false;
            }
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
            if (extensionFromMimeType == null) {
                extensionFromMimeType = "jpg";
            }
            File fileW2 = C786410Ut5.w2(this.LL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append('_');
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append('.');
            sbLIZ.append(extensionFromMimeType);
            C0VSJ c0vsj = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ));
            try {
                C0VSV c0vsv = new C0VSV(c0vsj);
                try {
                    C2106208My.LIZ(inputStreamLJ, c0vsv);
                    C2107108Nh.LIZ(c0vsv, null);
                    C2107108Nh.LIZ(inputStreamLJ, null);
                    Uri uriFromFile = Uri.fromFile(c0vsj);
                    if (z) {
                        z2 = true;
                    }
                    c07wi = new C07WI(z2, uriFromFile);
                } finally {
                    th = th;
                    try {
                        try {
                        } catch (Throwable th) {
                            while (true) {
                            }
                        }
                    } catch (Throwable th2) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(inputStreamLJ, th);
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("ClipboardLocalFileUtilsKt@380.copyToLocalFile$2");
        return c07wi;
    }
}
