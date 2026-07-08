package X;

import com.lynx.base.log.LynxLog;
import com.lynx.tasm.core.resource.LynxResourceLoader;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299710jvV extends AbstractC1299750jvZ {
    public final long LIZJ;
    public final WeakReference<LynxResourceLoader> LIZLLL;

    public C1299710jvV(LynxResourceLoader lynxResourceLoader, String str, long j) {
        super(str);
        this.LIZLLL = new WeakReference<>(lynxResourceLoader);
        this.LIZJ = j;
    }

    public final void LIZIZ(String str, byte[] bArr, boolean z) {
        String str2;
        if (!LIZ()) {
            return;
        }
        int i = 30301;
        String str3 = null;
        if (z) {
            LynxLog.i("LynxResourceLoader", "loadExternalResourceAsync onSuccess.");
            if (bArr != null && bArr.length != 0) {
                i = 0;
                str2 = null;
            } else {
                str2 = "get null data for provider.";
            }
            LynxResourceLoader.LIZIZ(this.LIZJ, i, str2, bArr);
            if (i == 0) {
                return;
            }
        } else {
            long j = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            str2 = "Error when fetch script";
            sbLIZ.append("Error when fetch script");
            sbLIZ.append(": ");
            sbLIZ.append(str);
            LynxResourceLoader.LIZIZ(j, 30301, C2188811AlT.LIZIZ(sbLIZ), null);
            str3 = str;
        }
        LynxResourceLoader lynxResourceLoader = this.LIZLLL.get();
        if (lynxResourceLoader != null) {
            C1289620jfE.LIZJ(new RunnableC1299740jvY(lynxResourceLoader, i, "loadExternalResource", str2, str3, this.LIZIZ));
        }
    }
}
