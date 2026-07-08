package X;

import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19858012mo {
    public final String LIZ;
    public String LIZIZ;
    public final Set<Integer> LIZJ = new LinkedHashSet();
    public final /* synthetic */ AbsDownloadService LIZLLL;

    public C19858012mo(AbsDownloadService absDownloadService, String str) {
        this.LIZLLL = absDownloadService;
        this.LIZ = str;
    }

    public final void LIZ(String str, String str2) {
        if (!Intrinsics.LJFF(str, this.LIZ)) {
            return;
        }
        Set<Integer> set = this.LIZJ;
        AbsDownloadService absDownloadService = this.LIZLLL;
        Iterator<Integer> it2 = set.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            List list = (List) ((LinkedHashMap) absDownloadService.LLILLJJLI).get(Integer.valueOf(iIntValue));
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    try {
                        ((InterfaceC19858112mp) it3.next()).LJJI(str, str2);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        this.LIZJ.clear();
        this.LIZIZ = str2;
    }
}
