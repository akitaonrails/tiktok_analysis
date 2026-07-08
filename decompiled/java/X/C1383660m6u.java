package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tools.performance.api.services.IVEVideoStreamDownloadService;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0m6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383660m6u {
    public static final C1383660m6u LIZ = new C1383660m6u();

    public static final void LIZIZ(List<String> list, String str, String str2, AbstractC1383520m6g abstractC1383520m6g) {
        List<String> listSubList;
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            listSubList = list.subList(1, list.size());
        } else {
            listSubList = C13BV.INSTANCE;
        }
        C1401800maA c1401800maA = new C1401800maA(abstractC1383520m6g, 1);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with((String) ListProtector.get(list, 0));
        abstractC2199801B7qWith.LJIIIIZZ = listSubList;
        abstractC2199801B7qWith.LIZJ = str2;
        abstractC2199801B7qWith.LJ = str;
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIJJ = 3;
        abstractC2199801B7qWith.LJIIJ = "duet_react_video";
        abstractC2199801B7qWith.LJJ = downloadServiceManager.isAutoRemoveListener();
        abstractC2199801B7qWith.LJIIL = c1401800maA;
        abstractC2199801B7qWith.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(final com.ss.android.ugc.aweme.feed.model.Aweme r20, final java.util.List r21, final java.lang.String r22, final java.lang.String r23, final X.C1383540m6i r24, final boolean r25) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1383660m6u.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, java.lang.String, java.lang.String, X.0m6i, boolean):void");
    }

    public static void LIZJ(Aweme aweme, final List list, final String str, final String str2, final String str3, final AbstractC1383520m6g abstractC1383520m6g) {
        final String str4;
        if (list.isEmpty()) {
            str4 = "";
        } else {
            str4 = (String) ListProtector.get(list, 0);
        }
        final C013C c013c = new C013C();
        C2426709f7.LIZ("duet");
        C1483340ohg.LJIIJJI(aweme, str3, true, false, new InterfaceC1475840oVa() { // from class: X.0m6s
            @Override // X.InterfaceC1475840oVa
            public final /* synthetic */ void LIZ(long j, long j2) {
            }

            @Override // X.InterfaceC1475840oVa
            public final void LIZIZ(int i) {
                C201955140j.LIZ("DuetVideoDownloader - copy video cache: error");
                C2426709f7.LIZ("duet");
                C1383660m6u.LIZIZ(list, str, str2, abstractC1383520m6g);
            }

            @Override // X.InterfaceC1475840oVa
            public final void onCopyComplete(boolean z, int i, String str5) {
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DuetVideoDownloader - copy video cache: success, isDuplicateCall: ");
                    sbLIZ.append(c013c.element);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (!c013c.element) {
                        C0VSJ c0vsj = new C0VSJ(str3);
                        AbstractC1383520m6g abstractC1383520m6g2 = abstractC1383520m6g;
                        if (abstractC1383520m6g2 != null) {
                            c0vsj.length();
                            c0vsj.length();
                            abstractC1383520m6g2.LIZJ(100);
                        }
                        AbstractC1383520m6g abstractC1383520m6g3 = abstractC1383520m6g;
                        if (abstractC1383520m6g3 != null) {
                            abstractC1383520m6g3.LIZLLL(str4, str3);
                        }
                    }
                    c013c.element = true;
                    return;
                }
                C201955140j.LIZ("DuetVideoDownloader - copy video cache: fail");
                C2426709f7.LIZ("duet");
                C1383660m6u.LIZIZ(list, str, str2, abstractC1383520m6g);
            }
        });
    }

    public static void LIZLLL(Aweme aweme, List list, String str, String str2, String str3, AbstractC1383520m6g abstractC1383520m6g, C1156790gCz c1156790gCz) {
        boolean z;
        boolean z2;
        IVEVideoStreamDownloadService iVEVideoStreamDownloadService = (IVEVideoStreamDownloadService) PluggableExtentionKt.pluggableSpi$default(IVEVideoStreamDownloadService.class, false, false, false, 14, null);
        boolean z3 = false;
        if (iVEVideoStreamDownloadService != null && str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2) && !list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VEVideoStream DuetVideoDownloader - use stream download externalSegment=");
            sbLIZ.append(c1156790gCz);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            iVEVideoStreamDownloadService.LIZLLL(list, str, str2, new C1383680m6w(abstractC1383520m6g, new C1383650m6t(new AtomicBoolean(false), aweme, list, str, str2, str3, abstractC1383520m6g)), c1156790gCz, C1383720m70.LIZ().downloadNetLevel);
            return;
        }
        StringBuilder sb = new StringBuilder("VEVideoStream DuetVideoDownloader - stream service unavailable, fallback to legacy service=");
        if (iVEVideoStreamDownloadService != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" filePathBlank=");
        if (str != null && !a0.LJJJIL(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        sb.append(z2);
        sb.append(" fileNameBlank=");
        if (str2 == null || a0.LJJJIL(str2)) {
            z3 = true;
        }
        sb.append(z3);
        sb.append(" urlsEmpty=");
        sb.append(list.isEmpty());
        C201955140j.LIZ(sb.toString());
        LIZJ(aweme, list, str, str2, str3, abstractC1383520m6g);
    }
}
