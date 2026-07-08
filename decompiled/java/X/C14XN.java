package X;

import android.content.Context;
import android.util.LruCache;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14XN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XN extends AbstractC20283114Yb {
    public static final LruCache<String, Float> LLJJJIL = new LruCache<>(16);
    public static final LruCache<String, Float> LLJJJJ = new LruCache<>(16);
    public Context LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public C20286814Zm LLJJI;
    public C0SUT LLJJIII;
    public ComposeView LLJJIJI;
    public int LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 347));
    public final C20293414aq LLJJJ = new C20293414aq("background");

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
        C0SUT c0sut = this.LLJJIII;
        if (c0sut != null) {
            C786410Ut5.V(c0sut, 8);
        }
        View view = this.LLJILJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLJILLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC20289914aH
    public final void LJFF() {
        LJIIJJI(EnumC20283814Yi.SWIPE, this.LL, true);
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
        View view = this.LLJILJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJILLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC20289914aH
    public final void LJIIIZ() {
        String aid;
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (C586380MzE.LIZ().LIZIZ("homepage_hot")) {
            C1440005kM.LIZ(new C714060Rzg(false, EnumC1616310sA9.OTHER_EXIT.getType(), "", "homepage_hot"));
        }
        Aweme aweme = this.LL;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            C20291314aV.LIZ.getClass();
            C20291314aV.LJIIIIZZ.add(aid);
        }
        LJIILIIL();
    }

    public final void LJJIJIIJI() {
        C20286814Zm c20286814Zm = this.LLJJI;
        if (c20286814Zm == null || !c20286814Zm.LJIJJ) {
            return;
        }
        C20552315bV.LIZIZ(this.LL);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // X.AbstractC20284914Yt, X.InterfaceC20289914aH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean So() {
        /*
            r6 = this;
            X.14aV r1 = X.C20291314aV.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            r1.getClass()
            boolean r0 = X.C20291314aV.LJIIIIZZ(r0)
            r5 = 0
            if (r0 == 0) goto L56
            java.util.HashSet<java.lang.String> r1 = X.C20291314aV.LJIIIIZZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            if (r0 == 0) goto L54
            java.lang.String r0 = r0.getAid()
        L18:
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 != 0) goto L56
            r4 = 0
        L1f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            boolean r3 = X.C692060RCq.LIZ(r0)
            X.14aq r2 = r6.LLJJJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "needTrans, outOfFrequncy = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", isDisabled = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", showSet = "
            r1.append(r0)
            java.util.HashSet<java.lang.String> r0 = X.C20291314aV.LJIIIIZZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            r2.LJIIJ(r1, r0)
            if (r4 == 0) goto L53
            if (r3 != 0) goto L53
            r5 = 1
        L53:
            return r5
        L54:
            r0 = 0
            goto L18
        L56:
            r4 = 1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.So():boolean");
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        C0SUT c0sut = this.LLJJIII;
        return c0sut != null && c0sut.getVisibility() == 0;
    }

    public static final int LJJIIJ(C05P0<Integer> c05p0) {
        return c05p0.getValue().intValue();
    }

    public static final float LJJIIZI(C05P1<Float> c05p1) {
        return c05p1.getValue().floatValue();
    }

    public static boolean LJJIJ(C1676490tjD c1676490tjD, C1691540u7U c1691540u7U, int i) {
        return C1691540u7U.LIZ(c1691540u7U, c1676490tjD.LIZIZ, c1676490tjD.LIZJ, 1, C1682390tsj.LIZ(0, i, 0, Integer.MAX_VALUE), 972).LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r12, X.InterfaceC1680500tpg r13, int r14) {
        /*
            r11 = this;
            r0 = 1259287890(0x4b0f3552, float:9385298.0)
            X.13ZC r6 = r13.LJIIJ(r0)
            r0 = r14 & 6
            r9 = 4
            if (r0 != 0) goto La1
            boolean r0 = r6.LJII(r12)
            if (r0 == 0) goto L9e
            r10 = 4
        L13:
            r10 = r10 | r14
        L14:
            r0 = r14 & 48
            if (r0 != 0) goto L21
            boolean r0 = r6.LJII(r11)
            if (r0 == 0) goto L9b
            r0 = 32
        L20:
            r10 = r10 | r0
        L21:
            r1 = r10 & 19
            r0 = 18
            if (r1 != r0) goto L40
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L40
            r6.LIZJ()
        L30:
            X.13Ys r2 = r6.LJJJJZI()
            if (r2 == 0) goto L3f
            kotlin.jvm.internal.AwS124S0201000_25 r1 = new kotlin.jvm.internal.AwS124S0201000_25
            r0 = 87
            r1.<init>(r11, r12, r14, r0)
            r2.LIZLLL = r1
        L3f:
            return
        L40:
            r5 = 0
            r8 = 1
            X.0u7U r7 = X.C1672580tcu.LIZ(r5, r5, r8, r6)
            X.13DR r0 = X.C20055113dV.LJII
            java.lang.Object r0 = r6.LJJIL(r0)
            X.0u5o r0 = (X.InterfaceC1690500u5o) r0
            float r4 = r0.getDensity()
            X.0tyA r1 = X.InterfaceC1685750ty9.LIZ
            r0 = 1065353216(0x3f800000, float:1.0)
            X.0ty9 r2 = androidx.compose.foundation.layout.c.LJ(r1, r0)
            r1 = 3
            r0 = 0
            X.0ty9 r3 = androidx.compose.foundation.layout.c.LJIJI(r2, r0, r1)
            r0 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
            r6.LJJIIJZLJL(r0)
            r0 = r10 & 14
            if (r0 == r9) goto L6b
            r8 = 0
        L6b:
            boolean r2 = r6.LJIJ(r4)
            r2 = r2 | r8
            boolean r0 = r6.LJII(r11)
            r2 = r2 | r0
            boolean r0 = r6.LJJIIJ(r7)
            r2 = r2 | r0
            java.lang.Object r1 = r6.LJJ()
            if (r2 != 0) goto L89
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L91
        L89:
            X.0tjB r1 = new X.0tjB
            r1.<init>(r12, r4, r11, r7)
            r6.LJJIJIIJI(r1)
        L91:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r6.LJJJJL(r5)
            r0 = 6
            X.C1683060tto.LIZ(r3, r1, r6, r0, r5)
            goto L30
        L9b:
            r0 = 16
            goto L20
        L9e:
            r10 = 2
            goto L13
        La1:
            r10 = r14
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJJ(kotlin.jvm.functions.Function2, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(java.lang.String r37, int r38, com.ss.android.ugc.aweme.feed.model.survey.Question r39, X.InterfaceC1680500tpg r40, int r41) {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJJIII(java.lang.String, int, com.ss.android.ugc.aweme.feed.model.survey.Question, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(long r34, int r36, java.lang.String r37, boolean r38, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r39, X.InterfaceC1680500tpg r40, int r41) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJIL(long, int, java.lang.String, boolean, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(int r47, com.ss.android.ugc.aweme.feed.model.survey.Question r48, int r49, boolean r50, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r51, X.InterfaceC1680500tpg r52, int r53) {
        /*
            Method dump skipped, instruction units count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJJII(int, com.ss.android.ugc.aweme.feed.model.survey.Question, int, boolean, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(int r26, com.ss.android.ugc.aweme.feed.model.survey.Question r27, boolean r28, long r29, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r31, X.InterfaceC1680500tpg r32, int r33) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJJIIJZLJL(int, com.ss.android.ugc.aweme.feed.model.survey.Question, boolean, long, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC690490R6p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r8, android.content.Context r9, com.ss.android.ugc.aweme.feed.model.Aweme r10, android.view.View r11, android.view.View r12, android.view.View r13, android.view.View r14, boolean r15, X.AbstractC19368810q6 r16) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, boolean, X.10q6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(boolean r34, java.lang.String r35, float r36, boolean r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, float r39, X.InterfaceC1680500tpg r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJJI(boolean, java.lang.String, float, boolean, kotlin.jvm.functions.Function0, float, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04df A[PHI: r20
      0x04df: PHI (r20v1 boolean) = (r20v0 boolean), (r20v4 boolean) binds: [B:190:0x04dd, B:70:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0 A[PHI: r20
      0x00f0: PHI (r20v3 boolean) = (r20v0 boolean), (r20v4 boolean) binds: [B:190:0x04dd, B:70:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(java.lang.String r52, int r53, boolean r54, com.ss.android.ugc.aweme.feed.model.survey.Question r55, int r56, boolean r57, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r58, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r59, X.InterfaceC1680500tpg r60, int r61) {
        /*
            Method dump skipped, instruction units count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJJIFFI(java.lang.String, int, boolean, com.ss.android.ugc.aweme.feed.model.survey.Question, int, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0793  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(java.lang.String r75, int r76, com.ss.android.ugc.aweme.feed.model.survey.Question r77, int r78, long r79, java.lang.String r81, boolean r82, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r83, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r84, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, X.InterfaceC1680500tpg r87, int r88, int r89) {
        /*
            Method dump skipped, instruction units count: 2435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XN.LJJIIZ(java.lang.String, int, com.ss.android.ugc.aweme.feed.model.survey.Question, int, long, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}
