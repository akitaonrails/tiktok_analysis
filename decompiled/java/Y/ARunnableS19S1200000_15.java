package Y;

import X.AbstractC1143290frD;
import X.AbstractC962030b8r;
import X.C01EI;
import X.C01EL;
import X.C0UZL;
import X.C1143300frE;
import X.C1300300jwS;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C933980aPc;
import X.C940400aZy;
import X.C941690ac3;
import X.C941820acG;
import X.C955440ayE;
import X.C960940b76;
import X.C961440b7u;
import X.C961660b8G;
import X.C973720bRi;
import X.EnumC941710ac5;
import X.EnumC961090b7L;
import X.InterfaceC774130UYh;
import X.InterfaceC986180blo;
import android.view.ViewGroup;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS19S1200000_15 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str = this.s0;
        C961660b8G c961660b8G = (C961660b8G) this.l1;
        long j = c961660b8G.LIZ;
        long j2 = C960940b76.LIZ;
        long j3 = j - j2;
        long j4 = c961660b8G.LIZIZ;
        long j5 = j4 - j;
        long j6 = c961660b8G.LIZJ;
        long j7 = j6 - j4;
        long j8 = c961660b8G.LIZLLL;
        C955440ayE c955440ayE = new C955440ayE();
        EnumC961090b7L enumC961090b7L = (EnumC961090b7L) this.l2;
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "section_name", str, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "launch_to_create_duration", Long.valueOf(j3), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "create_to_request_duration", Long.valueOf(j5), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "request_to_response_duration", Long.valueOf(j7), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "response_to_parse_duration", 1L, true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "parse_to_show_duration", Long.valueOf(j8 - j6), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "total_duration", Long.valueOf(j8 - j2), true);
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "cache_source", C961440b7u.LIZ(enumC961090b7L), true);
        c955440ayE.LJIJJLI("invite_list_section_render");
    }

    public final void LIZ$1() {
        C1300300jwS c1300300jwS = C1300300jwS.LIZ;
        final String str = this.s0;
        C973720bRi c973720bRi = (C973720bRi) this.l1;
        final InterfaceC986180blo interfaceC986180blo = (InterfaceC986180blo) this.l2;
        c1300300jwS.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playAnchorAudio: filePath ");
        sbLIZ.append(str);
        sbLIZ.append(" avPlayer is null ");
        sbLIZ.append(C1300300jwS.LIZIZ == null);
        C20441214yg.LJIIIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1300300jwS.LJII(c973720bRi);
            InterfaceC774130UYh interfaceC774130UYh = C1300300jwS.LIZIZ;
            if (interfaceC774130UYh == null) {
                C1300300jwS.LIZ(interfaceC986180blo, null, "Anchor: avPlayer is null");
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startPlay: isAnchor filePath ");
            sbLIZ2.append(str);
            C20441214yg.LIZIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC774130UYh.setDataSource(C497740JfY.LJII(), str);
            interfaceC774130UYh.prepare();
            interfaceC774130UYh.setMixerEnable(false);
            interfaceC774130UYh.setEventListener(new C0UZL() { // from class: X.0bln
                @Override // X.C0UZL, X.InterfaceC1276300jJk
                public final void onProgress(InterfaceC774130UYh interfaceC774130UYh2, long j) {
                }

                @Override // X.InterfaceC1276300jJk
                public final void onCompletion(InterfaceC774130UYh interfaceC774130UYh2) {
                    C20441214yg.LJ("AICommentaryPlayer", "avplayer onCompletion");
                    C1300300jwS c1300300jwS2 = C1300300jwS.LIZ;
                    InterfaceC986180blo interfaceC986180blo2 = interfaceC986180blo;
                    String str2 = str;
                    c1300300jwS2.getClass();
                    C1300300jwS.LIZ(interfaceC986180blo2, str2, null);
                }

                @Override // X.C0UZL, X.InterfaceC1276300jJk
                public final void onPause(InterfaceC774130UYh interfaceC774130UYh2, int i) {
                    C20441214yg.LJ("AICommentaryPlayer", "avplayer onPause");
                }

                @Override // X.InterfaceC1276300jJk
                public final void onStarted(InterfaceC774130UYh interfaceC774130UYh2, int i) {
                    C20441214yg.LJ("AICommentaryPlayer", "avplayer onstart");
                    interfaceC986180blo.onStart();
                }

                @Override // X.InterfaceC1276300jJk
                public final void onStop(InterfaceC774130UYh interfaceC774130UYh2, int i) {
                    C20441214yg.LJ("AICommentaryPlayer", "avplayer onStop");
                    C1300300jwS c1300300jwS2 = C1300300jwS.LIZ;
                    InterfaceC986180blo interfaceC986180blo2 = interfaceC986180blo;
                    String str2 = str;
                    c1300300jwS2.getClass();
                    C1300300jwS.LIZ(interfaceC986180blo2, str2, "Anchor: avplayer onStop");
                }

                @Override // X.C0UZL, X.InterfaceC783280Uo2
                public final void onError(InterfaceC774130UYh interfaceC774130UYh2, int i, Exception exc) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("avplayer error = ");
                    sbLIZ3.append(i);
                    sbLIZ3.append(", p2 = ");
                    sbLIZ3.append(exc);
                    C20441214yg.LJ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                    C1300300jwS c1300300jwS2 = C1300300jwS.LIZ;
                    InterfaceC986180blo interfaceC986180blo2 = interfaceC986180blo;
                    String str2 = str;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Anchor: avplayer error = ");
                    sbLIZ4.append(i);
                    sbLIZ4.append(", p2 = ");
                    sbLIZ4.append(exc);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    c1300300jwS2.getClass();
                    C1300300jwS.LIZ(interfaceC986180blo2, str2, strLIZIZ);
                }
            });
            interfaceC774130UYh.setVolume(SettingsManager.INSTANCE.getFloatValue("live_match_ai_commentary_anchor_volume", 1.0f));
            interfaceC774130UYh.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Anchor: play Exception ");
            sbLIZ3.append(e);
            C1300300jwS.LIZ(interfaceC986180blo, null, C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("playAnchorAudio: e ");
            sbLIZ4.append(e);
            C20441214yg.LJIIIZ("AICommentaryPlayer", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final void LIZ$2() {
        if (((C941690ac3) this.l1).LLILZLL) {
            C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
            String strLIZ = C01EI.LIZ(74, "MutexTask");
            c1143300frELJIIJJI.getClass();
            AbstractC1143290frD.LJI(strLIZ, "onStateChange return, task hasFinish");
            return;
        }
        C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
        String strLIZ2 = C01EI.LIZ(58, "MutexTask");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChange, ability=");
        sbLIZ.append(this.s0);
        sbLIZ.append(", abilityState=");
        sbLIZ.append((C01EL) this.l2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI2.getClass();
        AbstractC1143290frD.LJI(strLIZ2, strLIZIZ);
        if (((C01EL) this.l2) == C01EL.END) {
            ((C941690ac3) this.l1).LLILZ.remove(this.s0);
            if (C941820acG.LIZ(((C941690ac3) this.l1).LL)) {
                ((C941690ac3) this.l1).LIZ(EnumC941710ac5.SUCCESS);
            }
        }
    }

    public static final void run$0(ARunnableS19S1200000_15 aRunnableS19S1200000_15) {
        boolean zLIZ;
        C1C7U.LIZ("CoHostInviteListPreloader@4914.triggerRenderEvent$1");
        try {
            aRunnableS19S1200000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CoHostInviteListPreloader@4914.triggerRenderEvent$1");
    }

    public static final void run$1(ARunnableS19S1200000_15 aRunnableS19S1200000_15) {
        boolean zLIZ;
        C1C7U.LIZ("AICommentaryPlayer@aab7.startPlayForAnchor$1$2");
        try {
            aRunnableS19S1200000_15.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AICommentaryPlayer@aab7.startPlayForAnchor$1$2");
    }

    public static final void run$2(ARunnableS19S1200000_15 aRunnableS19S1200000_15) {
        boolean zLIZ;
        C1C7U.LIZ("VoiceChatFeedUserMask@63b5.updateBusinessMicInfo$3$2");
        try {
            ((C940400aZy) aRunnableS19S1200000_15.l2).LJIIJ((int) (((ViewGroup) aRunnableS19S1200000_15.l1).getWidth() * C933980aPc.LIZJ(aRunnableS19S1200000_15.s0)), (ViewGroup) aRunnableS19S1200000_15.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VoiceChatFeedUserMask@63b5.updateBusinessMicInfo$3$2");
    }

    public static final void run$3(ARunnableS19S1200000_15 aRunnableS19S1200000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MutexTask@8913.onStateChange$1");
        try {
            aRunnableS19S1200000_15.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MutexTask@8913.onStateChange$1");
    }

    public ARunnableS19S1200000_15(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
