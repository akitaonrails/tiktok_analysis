package X;

import android.view.View;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10Kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19229110Kr extends AbstractC2211791BhR {
    public final float LJ;
    public final int LJFF;
    public final boolean LJI;
    public Function0<String> LJII;
    public final C19229010Kq LJIIIIZZ;
    public final C19229210Ks LJIIIZ;

    @Override // X.AbstractC2211791BhR
    public final int LIZJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        return this.LJII;
    }

    @Override // X.AbstractC2211791BhR
    public final /* bridge */ /* synthetic */ InterfaceC2211921Bhe LJ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC2211791BhR
    public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC2211791BhR
    public final boolean LJIIIIZZ() {
        return this.LJI;
    }

    @Override // X.AbstractC2211791BhR
    public final float LJIIL() {
        return this.LJ;
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        this.LJII = function0;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.10Kq] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.10Ks] */
    public C19229110Kr(final C20731616Ao c20731616Ao, final C10KT c10kt) {
        C1261540ivw.LIZ.getClass();
        C1261570ivz c1261570ivz = C1261540ivw.LIZIZ;
        if (c1261570ivz.LIZ != 1) {
            c1261570ivz.LIZ = 1;
            c1261570ivz.LIZJ = 0;
            c1261570ivz.LIZIZ = 0;
        }
        this.LJ = 0.7f;
        this.LJFF = 500;
        this.LJI = true;
        this.LJII = new AwS572S0100000_28(c20731616Ao, 791);
        this.LJIIIIZZ = new InterfaceC2211931Bhf() { // from class: X.10Kq
            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                RecSwipeViewModel recSwipeViewModel = c10kt.LL;
                EnumC1260930iux enumC1260930iux = EnumC1260930iux.SHOW;
                C1261860iwS c1261860iwS = c20731616Ao.LLILLJJLI;
                recSwipeViewModel.getClass();
                int i = C1260940iuy.LIZ[enumC1260930iux.ordinal()];
                String nickname = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            int i2 = C2187451AjH.LIZ;
                            C1720106oR.LIZ("RecSwipeViewModel", "Invalid Action Type");
                            return;
                        }
                        C1261540ivw.LIZ.getClass();
                        C1261570ivz c1261570ivz2 = C1261540ivw.LIZIZ;
                        c1261570ivz2.LIZJ++;
                        C447550Hgn.LIZJ(new AwS272S0300000_28(recSwipeViewModel, enumC1260930iux, c1261860iwS, 13));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BigCard Disappear:");
                        if (c1261860iwS != null) {
                            nickname = c1261860iwS.getNickname();
                        }
                        sbLIZ.append(nickname);
                        sbLIZ.append(", count: ");
                        sbLIZ.append(c1261570ivz2.LIZJ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    C447550Hgn.LIZJ(new AwS272S0300000_28(recSwipeViewModel, enumC1260930iux, c1261860iwS, 12));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BigCard Show:");
                    if (c1261860iwS != null) {
                        nickname = c1261860iwS.getNickname();
                    }
                    sbLIZ2.append(nickname);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
                C1261540ivw.LIZ.getClass();
                C1261570ivz c1261570ivz3 = C1261540ivw.LIZIZ;
                c1261570ivz3.LIZIZ++;
                C447550Hgn.LIZJ(new AwS272S0300000_28(recSwipeViewModel, enumC1260930iux, c1261860iwS, 11));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BigCard Seen:");
                if (c1261860iwS != null) {
                    nickname = c1261860iwS.getNickname();
                }
                sbLIZ3.append(nickname);
                sbLIZ3.append(", count:  ");
                sbLIZ3.append(c1261570ivz3.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        };
        this.LJIIIZ = new InterfaceC2211921Bhe() { // from class: X.10Ks
            @Override // X.InterfaceC2211921Bhe
            public final void LIZ(long j) {
            }
        };
    }
}
