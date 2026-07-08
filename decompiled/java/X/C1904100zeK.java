package X;

import Y.ARunnableS97S0200000_28;
import android.view.View;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0zeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904100zeK {
    public static final C1904100zeK LIZ = new C1904100zeK();
    public static long LIZIZ = -1;
    public static volatile C1904120zeM LIZJ = new C1904120zeM();
    public static final List<EnumC1904110zeL> LIZLLL;

    static {
        EnumC1904110zeL.LLILLL.getClass();
        List<EnumC1904110zeL> listLJLI = C13LQ.LJLI(EnumC1904110zeL.values());
        if (!DmNoticeProxyImpl.LIZJ().LIZIZ()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJLI) {
                if (obj == EnumC1904110zeL.LLILZLL) {
                    arrayList.add(obj);
                }
            }
            listLJLI = arrayList;
        }
        LIZLLL = listLJLI;
    }

    public static void LIZIZ() {
        if (LIZIZ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
            LIZIZ = -1L;
            if (jCurrentTimeMillis > 0) {
                C1440005kM.LIZ(new AnonymousClass0358(false, jCurrentTimeMillis));
            }
        }
    }

    public static void LIZ(C1598650rhf c1598650rhf) {
        EnumC1904110zeL enumC1904110zeL;
        C1904150zeP.LIZ.getClass();
        if (C1904150zeP.LIZIZ.get() && !LIZJ.LIZLLL) {
            EnumC1904110zeL.LLILLL.getClass();
            if (c1598650rhf instanceof InterfaceC1598970riB) {
                enumC1904110zeL = EnumC1904110zeL.LLILZ;
            } else if (c1598650rhf instanceof C1903510zdN) {
                enumC1904110zeL = EnumC1904110zeL.LLILZIL;
            } else if (!(c1598650rhf instanceof C0Z32)) {
                return;
            } else {
                enumC1904110zeL = EnumC1904110zeL.LLILZLL;
            }
            if (enumC1904110zeL != null && (!enumC1904110zeL.LL)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("observeVHModuleDraw ");
                sbLIZ.append(enumC1904110zeL);
                C0W4Y.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                enumC1904110zeL.LL = true;
                View view = c1598650rhf.itemView;
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS97S0200000_28(view, enumC1904110zeL, 0));
            }
        }
    }
}
