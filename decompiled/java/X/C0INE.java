package X;

import Y.AComparatorS506S0100000_7;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0INE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0INE {
    public static final String LIZIZ() {
        String strD0;
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str == null) {
            str = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        return (interfaceC480510IsrLIZIZ == null || (strD0 = interfaceC480510IsrLIZIZ.d0()) == null) ? "" : strD0;
    }

    public static final String LIZJ() {
        String currentResolution;
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str == null) {
            str = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        return (interfaceC480510IsrLIZIZ == null || (currentResolution = interfaceC480510IsrLIZIZ.getCurrentResolution()) == null) ? "" : currentResolution;
    }

    public static final String LIZLLL() {
        String strS0;
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str == null) {
            str = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        return (interfaceC480510IsrLIZIZ == null || (strS0 = interfaceC480510IsrLIZIZ.s0()) == null) ? "" : strS0;
    }

    public static final boolean LJFF() {
        String str = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag;
        if (str == null) {
            str = "";
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        return C500260Jjc.LJJJI(interfaceC480510IsrLIZIZ != null ? Boolean.valueOf(interfaceC480510IsrLIZIZ.h0()) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fb, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01fc, code lost:
    
        if (r3 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01fe, code lost:
    
        r0 = r3.multiStreamUrl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0200, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0202, code lost:
    
        r0.LJI(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r3 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r0 = r3.multiStreamUrl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        r0 = r0.qualityList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        r5 = new java.util.ArrayList();
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if (r2.hasNext() == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (X.C0IN9.LJ(r1) == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        r5.add(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d4 A[EDGE_INSN: B:270:0x02d4->B:189:0x02d4 BREAK  A[LOOP:2: B:160:0x024f->B:272:?]] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.C0INF> LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r14) {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0INE.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel):java.util.List");
    }

    public static final String LJ(List<C0INF> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            Iterator<C0INF> it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().LIZ);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static final void LJI(List<C0INF> list) {
        String str = C0IMN.LIZ;
        List listLJIIJJI = C1697810uHb.LJIIJJI("auto", "origin", C0IMN.LIZIZ, C0IMN.LIZ, "uhd_60", "uhd", "hd_60", "hd", "sd", "ld");
        if (list != null) {
            C08XD.LJJ(list, new AComparatorS506S0100000_7(listLJIIJJI, 0));
        }
    }
}
