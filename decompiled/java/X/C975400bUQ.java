package X;

import android.graphics.Rect;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975400bUQ {
    public static final C975410bUR LIZ = new C975410bUR();
    public static MatchBaseWidget LIZIZ;
    public static AnonymousClass0956 LIZJ;
    public static boolean LIZLLL;

    public static void LIZJ() {
        C20441214yg.LJIIIZ("MatchScoreAccuracyHelper", "stopPeriodicCheck: ");
        AnonymousClass0956 anonymousClass0956 = LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZJ = null;
    }

    public static void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetScoreData: clearAll ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (!LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
            return;
        }
        LIZJ();
        LIZLLL = false;
        C975390bUP.LJIIIZ = null;
        C975390bUP.LIZ = 0;
        C975390bUP.LIZIZ = false;
        C975390bUP.LIZJ = 0L;
        C975390bUP.LIZLLL = 0L;
        C975390bUP.LJ = 0L;
        C975390bUP.LJFF = 0L;
        C975390bUP.LJI = false;
        C975390bUP.LJII = false;
        C975390bUP.LJIIIIZZ = 0L;
        C975410bUR c975410bUR = LIZ;
        synchronized (c975410bUR) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resetScoreData: clearAll ");
            sbLIZ2.append(z);
            C20441214yg.LIZIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ2));
            if (z) {
                c975410bUR.LIZJ.clear();
                c975410bUR.LJIIJ.clear();
            }
            c975410bUR.LIZIZ.clear();
            c975410bUR.LIZLLL.clear();
            c975410bUR.LJ.clear();
            c975410bUR.LJFF.clear();
            c975410bUR.LJII.clear();
            c975410bUR.LJIIIIZZ.clear();
            c975410bUR.LJIIIZ.clear();
            c975410bUR.LJI.clear();
            c975410bUR.LJIIJJI = false;
            c975410bUR.LJIILIIL = "none";
            c975410bUR.LJIILJJIL = false;
        }
    }

    public static void LIZLLL(boolean z) {
        boolean z2;
        if (!LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
            return;
        }
        C975410bUR c975410bUR = LIZ;
        synchronized (c975410bUR) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateUiAnchorLinkMicPos: hostListChanged: ");
            sbLIZ.append(z);
            sbLIZ.append(", this.hostListChanged: ");
            sbLIZ.append(c975410bUR.LJIILJJIL);
            C20441214yg.LIZIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (!z && !c975410bUR.LJIILJJIL) {
                z2 = false;
            } else {
                z2 = true;
            }
            c975410bUR.LJIILJJIL = z2;
            List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLI, 10));
            Iterator<C954460awe> it2 = listLJJLI.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
            if (Intrinsics.LJFF(c975410bUR.LJII, arrayList)) {
                return;
            }
            c975410bUR.LJII.clear();
            Iterator<C954460awe> it3 = C915980Zwa.LJII().LJJLI().iterator();
            while (it3.hasNext()) {
                long j = it3.next().LJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateUiAnchorLinkMicPos: coHostUser uid: ");
                sbLIZ2.append(j);
                C20441214yg.LIZIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ2));
                c975410bUR.LJII.add(Long.valueOf(j));
                if (!c975410bUR.LJ.containsKey(Long.valueOf(j))) {
                    c975410bUR.LJ.put(Long.valueOf(j), 0L);
                }
                if (!c975410bUR.LJFF.containsKey(Long.valueOf(j))) {
                    c975410bUR.LJFF.put(Long.valueOf(j), 0L);
                }
            }
            if (c975410bUR.LJIIIIZZ.isEmpty()) {
                c975410bUR.LJIIIIZZ.addAll(c975410bUR.LJII);
            }
            c975410bUR.LJIIL();
            c975410bUR.LJIIJ();
            if (C970370bMJ.LJ() && c975410bUR.LIZLLL.size() != c975410bUR.LJII.size()) {
                c975410bUR.LIZLLL.keySet().retainAll(c975410bUR.LJII);
            }
        }
    }

    public static void LIZ(int i, String str) {
        boolean z;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        if (!LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
            return;
        }
        boolean zIsAppBackground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground();
        MatchBaseWidget matchBaseWidget = LIZIZ;
        boolean z2 = false;
        if (matchBaseWidget != null && matchBaseWidget.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        try {
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            long jLJJIIZ = C974540bT2.LJJIIZ();
            MatchBaseWidget matchBaseWidget2 = LIZIZ;
            if (matchBaseWidget2 != null && (viewOnClickListenerC986770bmlX1 = matchBaseWidget2.x1(jLJJIIZ)) != null && viewOnClickListenerC986770bmlX1.isShown()) {
                Rect rect = new Rect();
                if (viewOnClickListenerC986770bmlX1.getGlobalVisibleRect(rect) && rect.height() > 0) {
                    if (rect.width() > 0) {
                        z2 = true;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isCoHostWindowVisible exception: ");
            sbLIZ.append(e);
            C20441214yg.LJIIIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkScoreAbnormal: checkSource ");
        sbLIZ2.append(str);
        sbLIZ2.append(", result ");
        sbLIZ2.append(i);
        sbLIZ2.append(", isInMatch ");
        sbLIZ2.append(C915980Zwa.LJFF().co0());
        sbLIZ2.append(", isBackground ");
        sbLIZ2.append(zIsAppBackground);
        sbLIZ2.append(", isResumed ");
        sbLIZ2.append(z);
        sbLIZ2.append(", isCohostWindowVisible ");
        sbLIZ2.append(z2);
        C20441214yg.LIZIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ2));
        if (!C915980Zwa.LJFF().co0()) {
            LIZIZ(true);
            return;
        }
        if (!zIsAppBackground && z && z2) {
            if (Intrinsics.LJFF(str, EnumC975440bUU.START_ANIMATION_END.getValue()) && !LIZLLL) {
                LIZLLL = true;
                C20441214yg.LIZIZ("MatchScoreAccuracyHelper", "startPeriodicCheck: ");
                LIZJ();
                C1DFH c1dfh = C0PEM.LIZ;
                LIZJ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C975420bUS(null), 3);
            }
            if (Intrinsics.LJFF(str, EnumC975440bUU.PERIODIC.getValue()) && !LIZLLL) {
                return;
            }
            if (Intrinsics.LJFF(str, EnumC975440bUU.SHOW_RESULT.getValue())) {
                LIZJ();
            }
            ArrayList arrayList = new ArrayList();
            if (LiveMatchScoreTrackSetting.INSTANCE.enableTrackNormal()) {
                arrayList.add(EnumC975430bUT.NORMAL);
            }
            try {
                C975410bUR c975410bUR = LIZ;
                synchronized (c975410bUR) {
                    try {
                        c975410bUR.LIZLLL(arrayList, i, str, AFwS203S0000000_15.get$arr$(224));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("checkScoreAbnormal: exception ");
                sbLIZ3.append(e2);
                C20441214yg.LJIIIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (!arrayList.isEmpty()) {
                C975390bUP.LJIILIIL(str, arrayList, LIZ);
            }
        }
    }
}
