package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.Unit;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142090fpH {
    public static final void LIZ() {
        C1142070fpF.LIZ.getClass();
        C1142070fpF.LJFF();
    }

    public static final void LIZJ() {
        EnumC1142140fpM enumC1142140fpM;
        Object c098200Yq;
        C1142070fpF.LIZ.getClass();
        C1142070fpF.LJ();
        if (!C1142070fpF.LJIIJJI) {
            C1136870fgr c1136870fgr = ((C1142020fpA) C1142070fpF.LIZLLL.getValue()).LIZ;
            if ((c1136870fgr != null ? c1136870fgr.LJIIIIZZ : null) != EnumC1142180fpQ.SECONDARY_PAGE) {
                C1142070fpF.LJJ();
                return;
            }
        }
        C1142020fpA c1142020fpA = (C1142020fpA) C1142070fpF.LIZLLL.getValue();
        if (c1142020fpA.LIZ == null || (enumC1142140fpM = c1142020fpA.LIZJ) == EnumC1142140fpM.COMPLETED || enumC1142140fpM == EnumC1142140fpM.ERROR) {
            return;
        }
        if (enumC1142140fpM != EnumC1142140fpM.PAUSED) {
            EnumC1142140fpM enumC1142140fpM2 = EnumC1142140fpM.PLAYING;
            if (enumC1142140fpM != enumC1142140fpM2) {
                C1142070fpF.LJJII(new AwS596S0100000_17(enumC1142140fpM2, 402));
            }
            AnonymousClass0956 anonymousClass0956 = C1142070fpF.LJFF;
            if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                long j = c1142020fpA.LIZLLL;
                AnonymousClass0956 anonymousClass09562 = C1142070fpF.LJFF;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                C1142070fpF.LJFF = C23250099c.LIZLLL(C1142070fpF.LIZIZ, null, null, new C1142110fpJ(j, null), 3);
                return;
            }
            return;
        }
        try {
            C1142080fpG c1142080fpG = C1142070fpF.LJ;
            TTVideoEngine tTVideoEngine = c1142080fpG.LIZ;
            if (tTVideoEngine != null) {
                tTVideoEngine.pause();
            }
            c1142080fpG.LIZJ.LIZJ(true);
            C20441214yg.LIZIZ("MusicGiftPreviewAudioPlayer", "pause playback");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("MusicGiftPreviewPlayer", "pause after delayed start failed", thM5exceptionOrNullimpl);
        }
    }

    public static final void LIZLLL() {
        EnumC1142140fpM enumC1142140fpM = ((C1142020fpA) C1142070fpF.LIZLLL.getValue()).LIZJ;
        if (enumC1142140fpM == EnumC1142140fpM.LOADING) {
            C20441214yg.LIZIZ("MusicGiftPreviewPlayer", "ignore stale stopped callback while loading");
            return;
        }
        AnonymousClass0956 anonymousClass0956 = C1142070fpF.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (enumC1142140fpM == EnumC1142140fpM.COMPLETED || enumC1142140fpM == EnumC1142140fpM.ERROR) {
            return;
        }
        C1142070fpF c1142070fpF = C1142070fpF.LIZ;
        EnumC1142140fpM enumC1142140fpM2 = EnumC1142140fpM.IDLE;
        c1142070fpF.getClass();
        C1142070fpF.LJJII(new AwS596S0100000_17(enumC1142140fpM2, 402));
    }

    public static final void LIZIZ(int i, String str) {
        C1142070fpF c1142070fpF = C1142070fpF.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code=");
        sbLIZ.append(i);
        sbLIZ.append(", message=");
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1142070fpF.getClass();
        C1142070fpF.LJIIIZ(strLIZIZ);
    }
}
