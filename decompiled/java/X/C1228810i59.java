package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0i59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228810i59 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final long LJI;
    public final EnumC1230500i7s LJII;
    public final EnumC1228830i5B LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final Map<String, String> LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final List<EnumC1219960hqs> LJIILLIIL;
    public final List<EnumC1219960hqs> LJIIZILJ;
    public final InterfaceC1631620sYq<C0Y8T, Function0<Unit>, GroupPreviewDisplayMeta, Unit> LJIJ;
    public final boolean LJIJI;
    public final InterfaceC1228860i5E LJIJJ;
    public final C1229270i5t LJIJJLI;

    public final String toString() {
        return "GroupListPanelParam(enterFrom=" + this.LIZ + ", enterMethod=" + this.LIZIZ + ", targetId=" + this.LIZJ + ", isFullScreen=" + this.LIZLLL + ", disableMask=" + this.LJ + ", groupCategory=" + this.LJFF + ", landingConvShortId=" + this.LJI + ", joinGroupSource=" + this.LJII + ", groupListScene=" + this.LJIIIIZZ + ", enableCreateGroup=" + this.LJIIIZ + ", useUnifiedGroupCreation=" + this.LJIIJ + ", eventTracking=" + this.LJIIJJI + ", enterChatFullScreen=" + this.LJIIL + ", quickChatViewType=" + this.LJIILIIL + ", trafficType=" + this.LJIILJJIL + ", groupType=" + this.LJIILL + ", businessTypes=" + this.LJIILLIIL + ", excludeBusinessTypes=" + this.LJIIZILJ + ", groupSelectNotify=" + this.LJIJ + ", closeListAfterCreateGroupSuccess=" + this.LJIJI + ", panelCallback=" + this.LJIJJ + ", panelUIConfig=" + this.LJIJJLI + ')';
    }

    public static C1228810i59 LIZ(C1228810i59 c1228810i59, String str, boolean z, boolean z2, String str2, Map map, int i, String str3, String str4, List list) {
        String str5 = c1228810i59.LIZ;
        String str6 = c1228810i59.LIZIZ;
        long j = c1228810i59.LJI;
        EnumC1230500i7s enumC1230500i7s = c1228810i59.LJII;
        EnumC1228830i5B enumC1228830i5B = c1228810i59.LJIIIIZZ;
        boolean z3 = c1228810i59.LJIIIZ;
        boolean z4 = c1228810i59.LJIIJ;
        boolean z5 = c1228810i59.LJIIL;
        List<EnumC1219960hqs> list2 = c1228810i59.LJIIZILJ;
        InterfaceC1631620sYq<C0Y8T, Function0<Unit>, GroupPreviewDisplayMeta, Unit> interfaceC1631620sYq = c1228810i59.LJIJ;
        boolean z6 = c1228810i59.LJIJI;
        InterfaceC1228860i5E interfaceC1228860i5E = c1228810i59.LJIJJ;
        C1229270i5t c1229270i5t = c1228810i59.LJIJJLI;
        c1228810i59.getClass();
        return new C1228810i59(str5, str6, str, z, z2, str2, j, enumC1230500i7s, enumC1228830i5B, z3, z4, map, z5, i, str3, str4, list, list2, interfaceC1631620sYq, z6, interfaceC1228860i5E, c1229270i5t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1228810i59(String str, String str2, String str3, boolean z, boolean z2, String str4, long j, EnumC1230500i7s enumC1230500i7s, EnumC1228830i5B enumC1228830i5B, Map map, int i, String str5, String str6, List list, List list2, InterfaceC1631620sYq interfaceC1631620sYq, boolean z3, InterfaceC1228860i5E interfaceC1228860i5E, C1229270i5t c1229270i5t, int i2) {
        boolean z4;
        boolean z5;
        boolean z6;
        InterfaceC1228860i5E interfaceC1228860i5E2 = interfaceC1228860i5E;
        boolean z7 = z3;
        InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
        List list3 = list;
        C1229270i5t c1229270i5t2 = c1229270i5t;
        String str7 = str5;
        int i3 = i;
        List list4 = list2;
        EnumC1228830i5B enumC1228830i5B2 = enumC1228830i5B;
        EnumC1230500i7s enumC1230500i7s2 = enumC1230500i7s;
        long j2 = j;
        Map mapLJ = map;
        String strLIZIZ = str3;
        boolean z8 = z2;
        boolean z9 = z;
        String str8 = str4;
        String str9 = str2;
        String str10 = (i2 & 1) != 0 ? "" : str;
        str9 = (i2 & 2) != 0 ? "" : str9;
        strLIZIZ = (i2 & 4) != 0 ? C461720I8s.LIZIZ() : strLIZIZ;
        z9 = (i2 & 8) != 0 ? true : z9;
        z8 = (i2 & 16) != 0 ? false : z8;
        str8 = (i2 & 32) != 0 ? "" : str8;
        j2 = (i2 & 64) != 0 ? 0L : j2;
        enumC1230500i7s2 = (i2 & 128) != 0 ? null : enumC1230500i7s2;
        enumC1228830i5B2 = (i2 & 256) != 0 ? EnumC1228830i5B.DEFAULT : enumC1228830i5B2;
        if ((i2 & 512) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i2 & 1024) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        mapLJ = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C2097608Jq.LJ() : mapLJ;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z6 = z9;
        } else {
            z6 = false;
        }
        this(str10, str9, strLIZIZ, z9, z8, str8, j2, enumC1230500i7s2, enumC1228830i5B2, z4, z5, mapLJ, z6, (i2 & 8192) != 0 ? 1 : i3, (i2 & 16384) != 0 ? "" : str7, (32768 & i2) == 0 ? str6 : "", (65536 & i2) != 0 ? C13LQ.LJJLL(EnumC1219960hqs.values()) : list3, (131072 & i2) != 0 ? C13BV.INSTANCE : list4, (262144 & i2) != 0 ? null : interfaceC1631620sYq2, (524288 & i2) != 0 ? false : z7, (1048576 & i2) != 0 ? null : interfaceC1228860i5E2, (i2 & 2097152) != 0 ? new C1229270i5t(0, false, null, null, null, null, 0, null, 1023) : c1229270i5t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1228810i59(String str, String str2, String str3, boolean z, boolean z2, String str4, long j, EnumC1230500i7s enumC1230500i7s, EnumC1228830i5B enumC1228830i5B, boolean z3, boolean z4, Map<String, String> map, boolean z5, int i, String str5, String str6, List<? extends EnumC1219960hqs> list, List<? extends EnumC1219960hqs> list2, InterfaceC1631620sYq<? super C0Y8T, ? super Function0<Unit>, ? super GroupPreviewDisplayMeta, Unit> interfaceC1631620sYq, boolean z6, InterfaceC1228860i5E interfaceC1228860i5E, C1229270i5t c1229270i5t) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = str4;
        this.LJI = j;
        this.LJII = enumC1230500i7s;
        this.LJIIIIZZ = enumC1228830i5B;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        this.LJIIJJI = map;
        this.LJIIL = z5;
        this.LJIILIIL = i;
        this.LJIILJJIL = str5;
        this.LJIILL = str6;
        this.LJIILLIIL = list;
        this.LJIIZILJ = list2;
        this.LJIJ = interfaceC1631620sYq;
        this.LJIJI = z6;
        this.LJIJJ = interfaceC1228860i5E;
        this.LJIJJLI = c1229270i5t;
    }
}
