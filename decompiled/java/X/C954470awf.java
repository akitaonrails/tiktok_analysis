package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import tikcast.linkmic.common.CohostStreamConfig;
import tikcast.linkmic.common.ContentPosition;

/* JADX INFO: renamed from: X.0awf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954470awf {
    public long LIZ;
    public long LIZIZ;
    public String LIZJ = "";

    public final long LIZIZ() {
        C954460awe c954460aweLLILL;
        CohostStreamConfig cohostStreamConfig;
        String str;
        C954460awe c954460awe = null;
        if (this.LIZ != 0 && (c954460aweLLILL = C915980Zwa.LJII().LLILL(this.LIZ)) != null && (cohostStreamConfig = c954460aweLLILL.LJJI) != null && (str = cohostStreamConfig.screenShareStreamId) != null && str.length() != 0) {
            long j = this.LIZIZ;
            long j2 = this.LIZ;
            if (j != j2) {
                return j2;
            }
        }
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LLILZLL(true).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C954460awe next = it2.next();
            C954460awe c954460awe2 = next;
            if (c954460awe2.LJ != C950220apo.LJFF() && c954460awe2.LJJI != null) {
                c954460awe = next;
                break;
            }
        }
        C954460awe c954460awe3 = c954460awe;
        if (c954460awe3 != null) {
            return c954460awe3.LJ;
        }
        return 0L;
    }

    public static boolean LIZJ() {
        C954460awe next;
        CohostStreamConfig cohostStreamConfig;
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LLILZLL(true).iterator();
        do {
            if (!it2.hasNext()) {
                return false;
            }
            next = it2.next();
            cohostStreamConfig = next.LJJI;
        } while (!C500260Jjc.LJJIIZ(cohostStreamConfig != null ? cohostStreamConfig.screenShareStreamId : null));
        return next != null;
    }

    public static int LIZ(String str) {
        ContentPosition contentPosition;
        if (str.length() == 0) {
            return EnumC954790axB.UNKNOWN.getType();
        }
        C954460awe c954460aweLJZ = C915980Zwa.LJII().LJZ(str);
        if (c954460aweLJZ != null && (contentPosition = c954460aweLJZ.LJJIFFI) != null) {
            return contentPosition.contentType;
        }
        return EnumC954790axB.LIVE_STUDIO_STREAM_LANDSCAPE.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void LIZLLL(long j, long j2) {
        String str;
        String str2;
        CohostStreamConfig cohostStreamConfig;
        CohostStreamConfig cohostStreamConfig2;
        String str3;
        C955440ayE c955440ayE = new C955440ayE();
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != 0) {
            ?? LJ = 0;
            String str4 = "";
            if (j == 0) {
                if (j2 != 0) {
                    C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(j2);
                    if (c954460aweLLILL != null && (cohostStreamConfig2 = c954460aweLLILL.LJJI) != null && (str3 = cohostStreamConfig2.screenShareStreamId) != null) {
                        str4 = str3;
                    }
                    this.LIZIZ = j2;
                    this.LIZJ = str4;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("subscribeAuxStreamWithStreamId start, newStreamId = ");
                    sbLIZ.append(str4);
                    C20441214yg.LJIIIZ("AuxStreamManager", C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC954180awCLJIIIZ.LJIIIZ(0, str4);
                    InterfaceC960800b6s.LLLLIIIILLL.LJFF(Boolean.TRUE);
                    c955440ayE.LJIIL(str4, "stream_id", true);
                    AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "start_time", Long.valueOf(SystemClock.uptimeMillis()), true);
                    c955440ayE.LJIJJLI("load_aux_stream");
                    return;
                }
            } else {
                if (j2 == 0) {
                    this.LIZIZ = 0L;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("unsubscribeAuxStreamWithStreamId start, unsubscribe streamId = ");
                    sbLIZ2.append(this.LIZJ);
                    sbLIZ2.append(", unsubscribe userId = ");
                    sbLIZ2.append(j);
                    C20441214yg.LJIIIZ("AuxStreamManager", C2188811AlT.LIZIZ(sbLIZ2));
                    interfaceC954180awCLJIIIZ.LJFF(this.LIZJ);
                    c955440ayE.LJIIL(this.LIZJ, "stream_id", true);
                    AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "start_time", Long.valueOf(SystemClock.uptimeMillis()), true);
                    c955440ayE.LJIJJLI("unsubscribe_aux_stream");
                    InterfaceC960800b6s.LLLLIIIILLL.LJFF(Boolean.FALSE);
                    this.LIZJ = "";
                    return;
                }
                if (j != j2) {
                    String str5 = this.LIZJ;
                    C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(j2);
                    if (c954460aweLLILL2 == null || (cohostStreamConfig = c954460aweLLILL2.LJJI) == null || (str = cohostStreamConfig.screenShareStreamId) == null) {
                        str = "";
                    }
                    InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ2 != null) {
                        C954460awe c954460aweLLILL3 = C915980Zwa.LJII().LLILL(j2);
                        if (c954460aweLLILL3 != null && (str2 = c954460aweLLILL3.LJIIJJI) != null) {
                            str4 = str2;
                        }
                        LJ = interfaceC954180awCLJIIIZ2.LJ(str4);
                    }
                    this.LIZIZ = j2;
                    this.LIZJ = str;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("replaceSubscribeAuxStreamWithStreamId start, previous streamId = ");
                    sbLIZ3.append(str5);
                    sbLIZ3.append(", previous user id = ");
                    sbLIZ3.append(j);
                    sbLIZ3.append(" new streamId = ");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" new UserId = ");
                    sbLIZ3.append(j2);
                    sbLIZ3.append(", isMute = ");
                    sbLIZ3.append((boolean) LJ);
                    C20441214yg.LJIIIZ("AuxStreamManager", C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC954180awCLJIIIZ.LJIJ(LJ, str5, str);
                    c955440ayE.LJJJI(str5, str);
                    return;
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("switchAuxStreamWithStreamConfig oldStreamUserId = ");
            sbLIZ4.append(j);
            sbLIZ4.append(" newStreamUserId = ");
            sbLIZ4.append(j2);
            C20441214yg.LJ("AuxStreamManager", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final void LJ(String str, String str2) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LLILZLL(true).iterator();
        int i = 0;
        while (it2.hasNext()) {
            String str3 = it2.next().LJIIJJI;
            linkedHashMap.put(str3, new MicPositionContentInfo(i, EnumC954790axB.UNKNOWN.getType(), str3));
            i++;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str4 = null;
        if (z) {
            C954460awe c954460aweLJZ = C915980Zwa.LJII().LJZ(str);
            if (c954460aweLJZ != null) {
                str4 = c954460aweLJZ.LJIIJJI;
            }
            linkedHashMap.put(str, new MicPositionContentInfo(i, LIZ(str), str4));
        } else if (this.LIZJ.length() > 0) {
            C954460awe c954460aweLJZ2 = C915980Zwa.LJII().LJZ(this.LIZJ);
            if (c954460aweLJZ2 != null) {
                str4 = c954460aweLJZ2.LJIIJJI;
            }
            String str5 = this.LIZJ;
            linkedHashMap.put(str5, new MicPositionContentInfo(i, LIZ(str5), str4));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAuxStreamPositionInfo");
        sbLIZ.append(" source = ");
        sbLIZ.append(str2);
        sbLIZ.append(" subscribedStreamId = ");
        sbLIZ.append(str);
        sbLIZ.append(" positionInfoMap: ");
        sbLIZ.append(linkedHashMap);
        C20441214yg.LJIIIZ("AuxStreamManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC954180awCLJIIIZ.LJIIZILJ(linkedHashMap);
        }
    }
}
