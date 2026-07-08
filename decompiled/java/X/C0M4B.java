package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0M4B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4B {
    public final CreativeInfo LIZ;
    public final boolean LIZIZ;
    public final List<String> LIZJ;
    public final boolean LIZLLL;

    public C0M4B(CreativeInfo creativeInfo, boolean z, List list, int i) {
        this(creativeInfo, (i & 2) != 0 ? false : z, (List<String>) ((i & 4) != 0 ? C13BV.INSTANCE : list), false);
    }

    public C0M4B(CreativeInfo creativeInfo, boolean z, List<String> list, boolean z2) {
        this.LIZ = creativeInfo;
        this.LIZIZ = z;
        this.LIZJ = list;
        this.LIZLLL = z2;
    }
}
