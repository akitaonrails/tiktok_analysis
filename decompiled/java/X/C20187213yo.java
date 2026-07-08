package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEFileDownloader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20187213yo {
    public static final C20187213yo LIZ = new C20187213yo();
    public static final Map<String, VEFileDownloader> LIZIZ = Collections.synchronizedMap(new HashMap());
    public static final Set<AbstractC20187113yn> LIZJ = new CopyOnWriteArraySet();
    public static final Set<String> LIZLLL = new LinkedHashSet();

    static {
        C1524805y2.LIZ(AFwS219S0000000_30.get$arr$(212));
    }

    public static void LIZIZ(String str) {
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPreDownload url=");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c201962140q, "EditMusicStream", C2188811AlT.LIZIZ(sbLIZ));
        Map<String, VEFileDownloader> map = LIZIZ;
        VEFileDownloader vEFileDownloader = map.get(str);
        if (vEFileDownloader != null) {
            vEFileDownloader.destroyFileDownload();
        }
        map.remove(str);
    }

    public static String LIZ(String str, String str2) {
        boolean z;
        String mD5FileName;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            if (C298110BmL.LIZ()) {
                mD5FileName = C1490520otG.LJFF().LJ(str, str2);
            } else {
                mD5FileName = TEVideoUtils.getMD5FileName(C1490520otG.LJFF().LIZ(), str);
            }
            if (mD5FileName == null || !new C0VSJ(mD5FileName).exists()) {
                return null;
            }
            C201962140q c201962140q = C201962140q.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFilePathWithUrl url=");
            sbLIZ.append(str);
            sbLIZ.append(" path=");
            sbLIZ.append(mD5FileName);
            C201955140j.LIZLLL(c201962140q, "EditMusicStream", C2188811AlT.LIZIZ(sbLIZ));
            return mD5FileName;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }
}
