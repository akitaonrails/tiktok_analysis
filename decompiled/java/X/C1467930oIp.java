package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import java.util.Hashtable;

/* JADX INFO: renamed from: X.0oIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467930oIp implements AVMDLFetcherMakerInterface {
    public static final Hashtable<String, C1467920oIo> LIZIZ = new Hashtable<>();
    public final Context LIZ;

    public C1467930oIp() {
    }

    public C1467930oIp(Context context) {
        this.LIZ = context;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface
    public final AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFetcher rawKey ");
        sbLIZ.append(str);
        sbLIZ.append(", fileKey ");
        sbLIZ.append(str2);
        sbLIZ.append(", oldURL ");
        sbLIZ.append(str3);
        C1471660oOq.LIZJ("FetcherMaker", C2188811AlT.LIZIZ(sbLIZ));
        C1467920oIo c1467920oIo = LIZIZ.get(str);
        if (c1467920oIo == null) {
            C1471660oOq.LIZJ("FetcherMaker", "getFetcher FetcherBase is null");
            return null;
        }
        String str4 = c1467920oIo.LIZ;
        String str5 = c1467920oIo.LIZIZ;
        int i2 = c1467920oIo.LIZJ;
        if (TextUtils.isEmpty(str5) || (i2 != 3 && TextUtils.isEmpty(str4))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getFetcher FetcherBase is error ");
            sbLIZ2.append(c1467920oIo);
            C1471660oOq.LIZJ("FetcherMaker", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        C1468840oKI c1468840oKI = new C1468840oKI(this.LIZ, str5, str4);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("return fetcher to mdl ");
        sbLIZ3.append(c1468840oKI);
        C1471660oOq.LIZJ("FetcherMaker", C2188811AlT.LIZIZ(sbLIZ3));
        return c1468840oKI;
    }
}
