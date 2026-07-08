package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;

/* JADX INFO: renamed from: X.12MX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12MX {
    public final List<EnumC1850560yFy> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final CreativeInfo LJI;

    public C12MX() {
        throw null;
    }

    public C12MX(List list, String str, String str2, String str3, String str4, String str5, CreativeInfo creativeInfo, int i) {
        CreativeInfo creativeInfo2 = creativeInfo;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        creativeInfo2 = (i & 64) != 0 ? new CreativeInfo(null, 0, null, 7, null) : creativeInfo2;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = creativeInfo2;
    }
}
