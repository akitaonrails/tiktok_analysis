package X;

import android.content.Context;
import com.bytedance.als.h0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ew4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380580Ew4 extends C0ETZ<InterfaceC379250Etv, C380640EwA, C380590Ew5, C380620Ew8> implements InterfaceC379250Etv {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final Function0<C380640EwA> LLJJJ;
    public final Function0<C380590Ew5> LLJJJIL;
    public final Function0<C380620Ew8> LLJJJJ;
    public final h0<C380190EvR> LLJJJJJIL;
    public C380190EvR LLJJJJLIIL;
    public C380190EvR LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C380580Ew4.class, "editingTextApi", "getEditingTextApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditTextApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C380580Ew4.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C380580Ew4.class, "rootApi", "getRootApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelRootApiComponent;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJLIL = 8;
    }

    public final void LIZLLL() {
        XN1(false);
    }

    private final InterfaceC379160Etm O4() {
        return (InterfaceC379160Etm) this.LLJJIJIL.getValue(this, LLJL[2]);
    }

    private final C380640EwA P4() {
        return (C380640EwA) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final InterfaceC379090Etf H4() {
        return (InterfaceC379090Etf) this.LLJJIJI.getValue(this, LLJL[0]);
    }

    public final C379120Eti K4() {
        return (C379120Eti) this.LLJJIJIIJIL.getValue(this, LLJL[1]);
    }

    @Override // X.InterfaceC379250Etv
    public boolean D3() {
        if (!isShowing()) {
            return false;
        }
        LIZLLL();
        return true;
    }

    @Override // X.InterfaceC379250Etv
    public C380190EvR Ib() {
        return T2().LIZIZ;
    }

    @Override // ge.i
    public Function0<C380640EwA> E3() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC379250Etv
    public C385670FAf<C380190EvR> X10() {
        return this.LLJJJJJIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    public final C19A3 getParentScene() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C380590Ew5> o2() {
        return this.LLJJJIL;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C380620Ew8> w2() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC379250Etv
    public void I32(C380190EvR c380190EvR) {
        EnumC378720Et4 enumC378720Et4;
        if (c380190EvR.LJI) {
            this.LLJJL = c380190EvR;
            enumC378720Et4 = EnumC378720Et4.TEXT_TO_VIDEO_CREATION;
        } else {
            this.LLJJJJLIIL = c380190EvR;
            enumC378720Et4 = EnumC378720Et4.TEXT_TO_IMAGE_CREATION;
        }
        i3(new AwS371S0200000_5(c380190EvR, enumC378720Et4, 40));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    @Override // X.InterfaceC379250Etv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C380190EvR NN2(X.EnumC378720Et4 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.T2()
            X.0Ew5 r0 = (X.C380590Ew5) r0
            java.util.List<X.0EvR> r4 = r0.LIZJ
            int[] r1 = X.C379490EuJ.LIZ
            int r0 = r8.ordinal()
            r0 = r1[r0]
            r6 = 2
            r5 = 1
            if (r0 == r5) goto L88
            if (r0 == r6) goto L85
            X.0EvR r3 = r7.LLJJL
            if (r3 != 0) goto L1e
            X.0EvR r3 = r7.LLJJJJLIIL
        L1c:
            if (r3 == 0) goto L28
        L1e:
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L6a
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L6a
        L28:
            int[] r1 = X.C379490EuJ.LIZ
            int r0 = r8.ordinal()
            r0 = r1[r0]
            r3 = 0
            if (r0 == r5) goto La5
            if (r0 == r6) goto L8b
            java.util.Iterator r2 = r4.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0EvR r0 = (X.C380190EvR) r0
            java.util.List<com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig> r0 = r0.LJIIJ
            if (r0 == 0) goto L39
        L4a:
            X.0EvR r1 = (X.C380190EvR) r1
            if (r1 != 0) goto L67
            java.util.Iterator r2 = r4.iterator()
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0EvR r0 = (X.C380190EvR) r0
            java.util.List<com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.ImageGenTaskConfig> r0 = r0.LJIIIZ
            if (r0 == 0) goto L52
            r3 = r1
        L64:
            r1 = r3
            X.0EvR r1 = (X.C380190EvR) r1
        L67:
            return r1
        L68:
            r1 = r3
            goto L4a
        L6a:
            java.util.Iterator r2 = r4.iterator()
        L6e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            X.0EvR r0 = (X.C380190EvR) r0
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = r3.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6e
            return r3
        L85:
            X.0EvR r3 = r7.LLJJJJLIIL
            goto L1c
        L88:
            X.0EvR r3 = r7.LLJJL
            goto L1c
        L8b:
            java.util.Iterator r2 = r4.iterator()
        L8f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0EvR r0 = (X.C380190EvR) r0
            java.util.List<com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.ImageGenTaskConfig> r0 = r0.LJIIIZ
            if (r0 == 0) goto L8f
            r3 = r1
        La1:
            r1 = r3
            X.0EvR r1 = (X.C380190EvR) r1
            return r1
        La5:
            java.util.Iterator r2 = r4.iterator()
        La9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0EvR r0 = (X.C380190EvR) r0
            java.util.List<com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig> r0 = r0.LJIIJ
            if (r0 == 0) goto La9
            r3 = r1
        Lbb:
            r1 = r3
            X.0EvR r1 = (X.C380190EvR) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380580Ew4.NN2(X.0Et4):X.0EvR");
    }

    public final void T4(C380190EvR c380190EvR) {
        String str;
        if (c380190EvR == null) {
            return;
        }
        String str2 = c380190EvR.LIZJ;
        C380190EvR c380190EvR2 = T2().LIZIZ;
        if (c380190EvR2 != null) {
            str = c380190EvR2.LIZJ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            return;
        }
        Context sceneContext = this.LLJJI.getSceneContext();
        if (sceneContext != null) {
            new C0ZDN(sceneContext).LIZ(0);
        }
        O4().J02(new C378960EtS(c380190EvR, null, null, 6), false);
    }

    @Override // X.InterfaceC379250Etv
    public void VX1(List<C380190EvR> list) {
        i3(new AwS584S0100000_5(list, (List<Pair<Long, Float>>) 257));
    }

    @Override // X.InterfaceC379250Etv
    public void XN1(boolean z) {
        if (z) {
            H4().fp2();
            show();
        } else {
            H4().Tw2();
            hide();
        }
    }

    public final void Z4(int i) {
        EnumC378720Et4 enumC378720Et4;
        if (i == 0) {
            enumC378720Et4 = EnumC378720Et4.TEXT_TO_VIDEO_CREATION;
        } else {
            enumC378720Et4 = EnumC378720Et4.TEXT_TO_IMAGE_CREATION;
        }
        if (T2().LIZLLL == enumC378720Et4) {
            return;
        }
        i3(new AwS584S0100000_5(enumC378720Et4, 256));
        O4().J02(new C378960EtS(null, enumC378720Et4, null, 5), false);
    }

    public C380580Ew4(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379090Etf.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), C379120Eti.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379160Etm.class, null);
        this.LLJJJ = AFwS191S0000000_5.get$arr$(92);
        this.LLJJJIL = AFwS191S0000000_5.get$arr$(91);
        this.LLJJJJ = new AwS549S0100000_5(this, 255);
        this.LLJJJJJIL = new h0<>(null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 254));
    }
}
