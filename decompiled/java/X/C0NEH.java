package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import defpackage.x0;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NEH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEH implements InterfaceC590770NFb {
    @Override // X.InterfaceC590770NFb
    public final void LJII(C0NHH c0nhh) {
    }

    @Override // X.InterfaceC590770NFb
    public final int getSize() {
        C590480NDy.LIZ.getClass();
        return a0.LJJLIIIJILLIZJL(C590480NDy.LJI(), new String[]{","}, 0, 6).size();
    }

    public C0NEH() {
        C0NEM.LIZ.LIZIZ(this);
    }

    @Override // X.InterfaceC590770NFb
    public final C0N9C LIZJ() {
        return C0N9C.MERGE_CACHE;
    }

    @Override // X.InterfaceC590770NFb
    public final void LIZLLL(C0NHH c0nhh) {
        String str = c0nhh.LIZIZ;
        C590480NDy c590480NDy = C590480NDy.LIZ;
        C0NE1 c0ne1 = C0NE1.REMOVE;
        c590480NDy.getClass();
        C590480NDy.LJIIZILJ(str, c0ne1);
    }

    @Override // X.InterfaceC590770NFb
    public final C591480NHu LJFF(C0NEN c0nen) {
        boolean z;
        String str;
        C0NHH c0nhh;
        String aid;
        Aweme aweme;
        C590480NDy.LIZ.getClass();
        if (C590480NDy.LJI().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String strLJI = C590440NDu.LJI(C590480NDy.LJI());
            C0NHH c0nhh2 = C590260NDc.LIZIZ;
            if (c0nhh2 != null) {
                str = c0nhh2.LIZIZ;
            } else {
                str = null;
            }
            if (TextUtils.equals(str, strLJI)) {
                c0nhh = C590260NDc.LIZIZ;
            } else {
                c0nhh = (C0NHH) C13LP.LJJJLL(C590260NDc.LIZ(strLJI, C0NDM.COLD_CACHE));
                if (c0nhh != null) {
                    Aweme aweme2 = c0nhh.LIZLLL;
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (C590390NDp.LIZIZ(C0NEW.DB.getValue(), aid)) {
                        C590260NDc.LIZIZ = c0nhh;
                    }
                }
                C590480NDy.LJIIZILJ(strLJI, C0NE1.REMOVE);
            }
            if (c0nhh != null && (aweme = c0nhh.LIZLLL) != null) {
                AwemeBizExtKt.setCacheSourceType(aweme, C0N9C.MERGE_CACHE.ordinal());
                return new C591480NHu(true, c0nhh, (String) null, 12);
            }
        }
        return new C591480NHu(false, (C0NHH) null, "loadCache return null", 8);
    }

    @Override // X.InterfaceC590770NFb
    public final int LJI(C0NEN c0nen) {
        boolean z;
        int size = getSize();
        if (((Boolean) C591010NFz.LJIILIIL.getValue()).booleanValue()) {
            C590480NDy.LIZ.getClass();
            x0 x0Var = x0.LIZ;
            String strLJFF = C590480NDy.LJFF();
            x0Var.getClass();
            int iLIZIZ = x0.LIZIZ(strLJFF);
            String strLJ = C590480NDy.LJ();
            x0Var.getClass();
            int iLIZIZ2 = x0.LIZIZ(strLJ);
            if (iLIZIZ > 0 && Math.max(0, iLIZIZ2 - iLIZIZ) >= 2) {
                z = true;
            } else {
                z = false;
            }
            if (c0nen == C0NEN.PLAY_LAG) {
                if (!z) {
                    String strLJIIIIZZ = C590480NDy.LJIIIIZZ();
                    x0Var.getClass();
                    if (x0.LIZIZ(strLJIIIIZZ) <= 0) {
                        return 0;
                    }
                }
            } else if (c0nen == C0NEN.REACH_BOTTOM) {
                String strLJIIIIZZ2 = C590480NDy.LJIIIIZZ();
                x0Var.getClass();
                int iLIZIZ3 = x0.LIZIZ(strLJIIIIZZ2);
                if (iLIZIZ3 <= 2) {
                    if (iLIZIZ3 >= 1) {
                        String strLJ2 = C590480NDy.LJ();
                        x0Var.getClass();
                        if (x0.LIZIZ(strLJ2) >= 2) {
                            return size;
                        }
                    }
                    if (z) {
                        return size;
                    }
                    return 0;
                }
            }
        } else {
            C01GW c01gw = C591010NFz.LJIILJJIL;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                C590480NDy.LIZ.getClass();
                x0 x0Var2 = x0.LIZ;
                String strLJII = C590480NDy.LJII();
                x0Var2.getClass();
                if (x0.LIZIZ(strLJII) - x0.LIZIZ(C590480NDy.LJI()) < ((Number) c01gw.getValue()).intValue()) {
                    return 0;
                }
            }
        }
        return size;
    }

    @Override // X.InterfaceC590770NFb
    public final C591480NHu LJIIIIZZ(C0NEN c0nen) {
        return C0NEJ.LIZ();
    }

    @Override // X.InterfaceC590770NFb
    public final void LJ(C0NEN c0nen, C0NEK c0nek) {
        C593360NPa.LIZ(new AwS253S0300000_9(this, c0nen, c0nek, 23));
    }
}
