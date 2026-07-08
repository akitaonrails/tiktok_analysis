package X;

import com.bytedance.applog.AppLog;

/* JADX INFO: renamed from: X.0Vgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804330Vgt {
    public final EnumC805430Vif LIZ;
    public final EnumC804170Vgd LIZIZ;
    public String LIZJ;
    public final long LIZLLL;
    public final C00CI LJ;

    public C804330Vgt(EnumC805430Vif enumC805430Vif, EnumC804170Vgd enumC804170Vgd) {
        this(enumC805430Vif, enumC804170Vgd, null, 0L, 28);
    }

    public C804330Vgt(EnumC805430Vif enumC805430Vif, EnumC804170Vgd enumC804170Vgd, String str, long j, int i) {
        C00CI c00ci;
        if ((i & 4) != 0 && (str = AppLog.getSessionId()) == null) {
            str = "";
        }
        j = (i & 8) != 0 ? System.currentTimeMillis() - C0VX9.LIZJ() : j;
        if ((i & 16) != 0) {
            c00ci = C00CI.NONE_SAMPLE;
        } else {
            c00ci = null;
        }
        this.LIZ = enumC805430Vif;
        this.LIZIZ = enumC804170Vgd;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = c00ci;
    }
}
