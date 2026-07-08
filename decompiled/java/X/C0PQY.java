package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PQY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQY implements Runnable {
    public final int LL;
    public final int LLILLJJLI;
    public final List<? extends SearchMixFeed> LLILLL;
    public final long LLILZ;
    public final boolean LLILZIL;
    public final List<C589710NAz> LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:200:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PQY.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ImagePrefetchHelper$PrefetchImageRunnable@5af2.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImagePrefetchHelper$PrefetchImageRunnable@5af2.run");
    }

    public static String LIZJ(List list) {
        if (list != null && !list.isEmpty()) {
            return (String) ListProtector.get(list, 0);
        }
        return "";
    }

    public static void LIZIZ(C0PQY c0pqy, String str, EnumC644580PQa enumC644580PQa, String str2, int i) {
        int i2;
        if ((i & 2) != 0) {
            enumC644580PQa = null;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        int i3 = 0;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            i3 = -1;
        }
        c0pqy.getClass();
        C0PQZ.LIZ.getClass();
        C589710NAz c589710NAzLIZJ = C0PQZ.LIZJ(str, enumC644580PQa, str2, i2, i3);
        if (C644600PQc.LIZJ() && c589710NAzLIZJ != null) {
            ((ArrayList) c0pqy.LLILZLL).add(c589710NAzLIZJ);
        }
    }

    public C0PQY(boolean z, List list, int i, long j, int i2, int i3) {
        j = (i3 & 8) != 0 ? 0L : j;
        z = (i3 & 16) != 0 ? false : z;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = list;
        this.LLILZ = j;
        this.LLILZIL = z;
        this.LLILZLL = new ArrayList();
    }
}
