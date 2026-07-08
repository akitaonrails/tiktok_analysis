package X;

import android.text.TextUtils;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.bytedance.vcloud.strategy.drm.SessionConfig;
import com.bytedance.vcloud.strategy.drm.SessionEntry;

/* JADX INFO: renamed from: X.1ENe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2280281ENe {
    public static final C2280281ENe LIZJ = new C2280281ENe();
    public C1285300jYG LIZ;
    public volatile InterfaceC2280271ENd LIZIZ;

    public final void LIZ(C1285300jYG c1285300jYG) {
        if (c1285300jYG == null) {
            return;
        }
        if (this.LIZIZ == null) {
            C1285320jYI.LIZ(null, "AJMediaDrmManager", "drm closeDrm LiveWidevineServiceProvider is null");
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drm closeDrm, pssh=");
            sbLIZ.append(c1285300jYG.LIZJ);
            C1285320jYI.LIZIZ(null, "AJMediaDrmManager", C2188811AlT.LIZIZ(sbLIZ));
            String str = c1285300jYG.LIZJ;
            if (!TextUtils.isEmpty(str)) {
                StrategyCenter.getInstance().releaseLiveWidevineSessionEntry(str);
            }
        }
        c1285300jYG.LIZ = null;
        c1285300jYG.LIZIZ = null;
        c1285300jYG.LIZJ = null;
        c1285300jYG.LIZLLL = null;
        this.LIZ = null;
    }

    public final C1285300jYG LIZIZ(C2280261ENc c2280261ENc) {
        byte[] bArr;
        if (!c2280261ENc.LIZ()) {
            C1285320jYI.LIZ(null, "AJMediaDrmManager", "drm getDrm failed: invalid config");
            return null;
        }
        if (this.LIZIZ == null) {
            C1285320jYI.LIZ(null, "AJMediaDrmManager", "drm getDrm failed: LiveWidevineServiceProvider is null");
            return null;
        }
        if (c2280261ENc.LIZ()) {
            SessionEntry sessionEntryCreateLiveWidevineSessionEntry = StrategyCenter.getInstance().createLiveWidevineSessionEntry(new SessionConfig(c2280261ENc.LIZ, null, null, c2280261ENc.LIZIZ, c2280261ENc.LIZJ, c2280261ENc.LIZLLL));
            if (sessionEntryCreateLiveWidevineSessionEntry != null && sessionEntryCreateLiveWidevineSessionEntry.isValid()) {
                C2280291ENf c2280291ENf = new C2280291ENf(sessionEntryCreateLiveWidevineSessionEntry.mediaDrm, sessionEntryCreateLiveWidevineSessionEntry.sessionId, sessionEntryCreateLiveWidevineSessionEntry.mediaCrypto, sessionEntryCreateLiveWidevineSessionEntry.securityLevel, sessionEntryCreateLiveWidevineSessionEntry);
                if (c2280291ENf.LIZ != null && (bArr = c2280291ENf.LIZIZ) != null && bArr.length > 0 && c2280291ENf.LIZJ != null && c2280291ENf.LJ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("drm getDrm created, pssh=");
                    sbLIZ.append(c2280261ENc.LIZJ);
                    C1285320jYI.LIZIZ(null, "AJMediaDrmManager", C2188811AlT.LIZIZ(sbLIZ));
                    String str = c2280261ENc.LIZJ;
                    C1285300jYG c1285300jYG = new C1285300jYG(c2280291ENf.LIZ);
                    c1285300jYG.LIZIZ = c2280291ENf.LIZJ;
                    c1285300jYG.LIZJ = str;
                    c1285300jYG.LIZLLL = c2280291ENf.LIZLLL;
                    this.LIZ = c1285300jYG;
                    return c1285300jYG;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("drm getDrm create invalid session, pssh=");
                sbLIZ2.append(c2280261ENc.LIZJ);
                sbLIZ2.append(", widevineCode=");
                sbLIZ2.append(0);
                C1285320jYI.LIZ(null, "AJMediaDrmManager", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
        }
        C1285320jYI.LIZ(null, "AJMediaDrmManager", "drm getDrm create returned null");
        return null;
    }
}
