package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;

/* JADX INFO: renamed from: X.0csw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029040csw implements InterfaceC1029150ct7 {
    public final CommonAdData LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C1029040csw() {
        this(null, null, null, null, 15);
    }

    public C1029040csw(CommonAdData commonAdData, String str, String str2, String str3, int i) {
        commonAdData = (i & 1) != 0 ? null : commonAdData;
        str = (i & 2) != 0 ? "" : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        this.LIZ = commonAdData;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
