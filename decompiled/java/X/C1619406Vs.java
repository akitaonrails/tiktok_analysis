package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06Vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1619406Vs {
    public static final C1619406Vs LIZ = new C1619406Vs();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static volatile C1619806Vw LIZLLL;
    public static volatile long LJ;

    public static void LIZLLL(String str) {
        C1619806Vw c1619806Vw = LIZLLL;
        if (c1619806Vw == null) {
            return;
        }
        String string = a0.LJLIIIL(str).toString();
        if (string.length() != 0 && Intrinsics.LJFF(c1619806Vw.LIZIZ, string)) {
            C06IM.LIZ.getClass();
            if (!C06IM.LIZJ()) {
                LIZLLL = null;
                return;
            }
            if (System.currentTimeMillis() - c1619806Vw.LIZLLL > 300000) {
                LIZLLL = null;
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - LJ < 3000 || !LIZJ.compareAndSet(false, true)) {
                return;
            }
            LJ = jCurrentTimeMillis;
            C23250099c.LIZLLL(LIZIZ, null, null, new C1619506Vt(c1619806Vw, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.06Vq] */
    public static void LIZ(C1619806Vw c1619806Vw, boolean z) {
        Object c098200Yq;
        ?? r3 = new Object(c1619806Vw.LIZ, c1619806Vw.LIZIZ, c1619806Vw.LIZJ, z) { // from class: X.06Vq
            public final String LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final boolean LIZLLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1619206Vq)) {
                    return false;
                }
                C1619206Vq c1619206Vq = (C1619206Vq) obj;
                return Intrinsics.LJFF(this.LIZ, c1619206Vq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1619206Vq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1619206Vq.LIZJ) && this.LIZLLL == c1619206Vq.LIZLLL;
            }

            public final int hashCode() {
                return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WheeBubbleUnlockIdsRefreshEvent(unlockBubbleId=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", conversationId=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", mediaSource=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", isNowUnlocked=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = str;
                this.LIZJ = str;
                this.LIZLLL = z;
            }
        };
        try {
            IChatCustomizeHelper.LIZ.getClass();
            C1619106Vp.LIZ().onWheeDiversionUnlockRefreshed(r3);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static boolean LIZIZ(String str, List list) {
        String string = a0.LJLIIIL(str).toString();
        if (string.length() == 0 || list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String string2 = a0.LJLIIIL((String) it2.next()).toString();
            if (string2.length() > 0) {
                arrayList.add(string2);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next(), string)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1619806Vw r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1619406Vs.LIZJ(X.06Vw, X.05Vn):java.lang.Object");
    }
}
