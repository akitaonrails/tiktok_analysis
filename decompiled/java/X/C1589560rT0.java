package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rT0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589560rT0 {
    public static final List<InterfaceC1589510rSv> LIZ;
    public static final AtomicBoolean LIZIZ;
    public static final AtomicBoolean LIZJ;

    static {
        InterfaceC1589510rSv[] interfaceC1589510rSvArr = new InterfaceC1589510rSv[3];
        interfaceC1589510rSvArr[0] = C1227504rB.LIZJ() ? new InterfaceC1589510rSv() { // from class: X.0rT2
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC1589510rSv
            public final void LIZ(C1589400rSk c1589400rSk) {
            }

            @Override // X.InterfaceC1589510rSv
            public final void LIZIZ(C1589590rT3 c1589590rT3) {
            }

            @Override // X.InterfaceC1589510rSv
            public final void LIZJ() {
                C1227504rB.LIZLLL = true;
            }
        } : null;
        interfaceC1589510rSvArr[1] = ((Boolean) C1222504qN.LIZIZ.getValue()).booleanValue() ? new InterfaceC1589510rSv() { // from class: X.0rSz
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC1589510rSv
            public final void LIZIZ(C1589590rT3 c1589590rT3) {
            }

            @Override // X.InterfaceC1589510rSv
            public final void LIZJ() {
                Function0<Unit> function0 = C1222504qN.LIZJ;
                if (function0 != null) {
                    function0.invoke();
                    C1222504qN.LIZJ = null;
                }
            }

            @Override // X.InterfaceC1589510rSv
            public final void LIZ(C1589400rSk c1589400rSk) {
                int iMin;
                List<Aweme> list = c1589400rSk.LIZ;
                if (list != null && (!list.isEmpty()) && (iMin = Math.min(1, list.size() - 1)) >= 0) {
                    for (int i = 0; !AwemeExtKt.isAdTraffic((Aweme) ListProtector.get(list, i)); i++) {
                        if (i == iMin) {
                            return;
                        }
                    }
                    Function0<Unit> function0 = C1222504qN.LIZJ;
                    if (function0 != null) {
                        function0.invoke();
                        C1222504qN.LIZJ = null;
                    }
                }
            }
        } : null;
        interfaceC1589510rSvArr[2] = ((Boolean) C1222204qK.LIZIZ.getValue()).booleanValue() ? new InterfaceC1589510rSv() { // from class: X.0rT1
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC1589510rSv
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1589510rSv
            public final void LIZ(C1589400rSk c1589400rSk) {
                int iMin;
                List<Aweme> list = c1589400rSk.LIZ;
                if (list != null && (!list.isEmpty()) && (iMin = Math.min(1, list.size() - 1)) >= 0) {
                    int i = 0;
                    while (true) {
                        AwemeRawAd awemeRawAd = ((Aweme) ListProtector.get(list, i)).getAwemeRawAd();
                        if (awemeRawAd != null && awemeRawAd.getShakeModel() != null) {
                            Function0<Unit> function0 = C1222204qK.LIZJ;
                            if (function0 != null) {
                                function0.invoke();
                                C1222204qK.LIZJ = null;
                                return;
                            }
                            return;
                        }
                        if (i == iMin) {
                            return;
                        } else {
                            i++;
                        }
                    }
                }
            }

            @Override // X.InterfaceC1589510rSv
            public final void LIZIZ(C1589590rT3 c1589590rT3) {
                List<Aweme> list;
                Aweme aweme;
                AwemeRawAd awemeRawAd;
                Function0<Unit> function0;
                if (C1222204qK.LIZJ != null && (list = c1589590rT3.LIZIZ) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(c1589590rT3.LIZ + 2, list)) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getShakeModel() != null && (function0 = C1222204qK.LIZJ) != null) {
                    function0.invoke();
                    C1222204qK.LIZJ = null;
                }
            }
        } : null;
        LIZ = C13LQ.LJIJI(interfaceC1589510rSvArr);
        LIZIZ = new AtomicBoolean(false);
        LIZJ = new AtomicBoolean(false);
    }
}
