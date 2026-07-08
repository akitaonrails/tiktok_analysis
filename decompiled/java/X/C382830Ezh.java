package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.als.h0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.ImageGenTaskConfig;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.AwS18S1201000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS2S0020000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ezh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382830Ezh extends C0ETZ<InterfaceC379090Etf, C384700F6m, C382890Ezn, C0F0R> implements InterfaceC379090Etf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final C376260Ep6 LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final h0<String> LLJJJJ;
    public final Function0<C384700F6m> LLJJJJJIL;
    public final Function0<C382890Ezn> LLJJJJLIIL;
    public final Function0<C0F0R> LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C382830Ezh.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/preview/EPAIGCPreviewApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C382830Ezh.class, "configureApi", "getConfigureApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/configurations/EPAIGCConfigurationApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C382830Ezh.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/topbar/EPAICreateTopBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C382830Ezh.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C382830Ezh.class, "rootApi", "getRootApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelRootApiComponent;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJLIL = 8;
    }

    private final InterfaceC379270Etx x5() {
        return (InterfaceC379270Etx) this.LLJJIJIL.getValue(this, LLJL[2]);
    }

    @Override // X.InterfaceC379090Etf
    public void Oz2() {
        K4(C0F1E.NOQUOTA);
    }

    @Override // X.InterfaceC379090Etf
    public void Sy() {
        i3(AFwS234S0000000_5.get$arr$(144));
    }

    public final void Z4() {
        K4(C0F1E.LOADING);
        if (H4(this.LLJJI.requireSceneContext())) {
            v5().A01();
            v5().ql2(new AwS549S0100000_5(this, 228), new AwS549S0100000_5(this, 229));
            return;
        }
        C377760ErW c377760ErW = new C377760ErW(-47364, null, 0, null, null, 29);
        Activity activity = this.LLJJI.mActivity;
        if (activity != null) {
            C383990F3t.LIZ.getClass();
            C383990F3t.LJ(activity, c377760ErW);
        }
        K4(C0F1E.ENABLED);
    }

    public final InterfaceC379180Eto d5() {
        return (InterfaceC379180Eto) this.LLJJIJIIJIL.getValue(this, LLJL[1]);
    }

    @Override // X.InterfaceC379090Etf
    public void fp2() {
        i3(AFwS234S0000000_5.get$arr$(146));
    }

    public final C379120Eti k5() {
        return (C379120Eti) this.LLJJJ.getValue(this, LLJL[3]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        i3(AFwS234S0000000_5.get$arr$(145));
        super.onDestroy();
    }

    public final InterfaceC379060Etc t5() {
        return (InterfaceC379060Etc) this.LLJJIJI.getValue(this, LLJL[0]);
    }

    public final InterfaceC379160Etm v5() {
        return (InterfaceC379160Etm) this.LLJJJIL.getValue(this, LLJL[4]);
    }

    @Override // X.InterfaceC379090Etf
    public void xO0() {
        K4(C0F1E.DISABLED);
    }

    public final void D5() {
        v5().hb();
        this.LLJJI.LLLLIIIILLL();
    }

    public final void P4() {
        v5().ql2(new AwS549S0100000_5(this, 227), AFwS191S0000000_5.get$arr$(88));
    }

    @Override // X.InterfaceC379090Etf
    public C0F1E SV() {
        C0F1E c0f1e = T2().LIZJ;
        return c0f1e == null ? C0F1E.DISABLED : c0f1e;
    }

    public final void T4() {
        boolean z = !T2().LIZLLL;
        i3(new AwS2S0020000_5(!z, z, 0));
        d5().of(z);
    }

    @Override // X.InterfaceC379090Etf
    public void Tw2() {
        if (T2().LIZLLL) {
            d5().of(true);
        } else {
            i3(AFwS234S0000000_5.get$arr$(147));
        }
    }

    @Override // X.InterfaceC379090Etf
    public void g71() {
        if (T2().LIZLLL) {
            d5().of(false);
        }
    }

    @Override // X.InterfaceC379090Etf
    public String getPromptText() {
        String str = T2().LIZIZ;
        return str == null ? "" : str;
    }

    @Override // ge.i
    public Function0<C384700F6m> E3() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC379090Etf
    public C385670FAf<String> SR() {
        return this.LLJJJJ;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    public final C376260Ep6 n5() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C382890Ezn> o2() {
        return this.LLJJJJLIIL;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0F0R> w2() {
        return this.LLJJL;
    }

    public static boolean H4(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    private final void O4(C378970EtT c378970EtT) {
        C118300cf c118300cf = new C118300cf();
        C380190EvR c380190EvR = c378970EtT.LIZ;
        int i = 0;
        if (c380190EvR.LJIIJ != null && (!r0.isEmpty())) {
            i = 2;
        } else {
            List<ImageGenTaskConfig> list = c380190EvR.LJIIIZ;
            if (list != null) {
                Iterator<ImageGenTaskConfig> it2 = list.iterator();
                if (it2.hasNext()) {
                    int i2 = it2.next().imageMaxRefCount;
                    loop0: while (true) {
                        i = i2;
                        while (it2.hasNext()) {
                            i2 = it2.next().imageMaxRefCount;
                            if (i < i2) {
                                break;
                            }
                        }
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
        }
        c118300cf.element = i;
        i3(new AwS371S0200000_5(c378970EtT, c118300cf, 37));
    }

    public final void C5(C0F04 c0f04) {
        if (x5().N7() == EnumC378720Et4.TEXT_TO_VIDEO_CREATION) {
            C378370EsV c378370EsV = C378370EsV.LIZ;
            AbstractC359300E6u abstractC359300E6u = k5().LLJILJIL;
            c378370EsV.getClass();
            C378370EsV.LJIIIZ(abstractC359300E6u, c0f04);
            return;
        }
        C378370EsV c378370EsV2 = C378370EsV.LIZ;
        AbstractC359300E6u abstractC359300E6u2 = k5().LLJILJIL;
        c378370EsV2.getClass();
        C378370EsV.LJIIIIZZ(abstractC359300E6u2, c0f04);
    }

    @Override // X.InterfaceC379090Etf
    public void GQ(boolean z) {
        i3(new AwS20S0010000_5(z, 9));
    }

    public final void K4(C0F1E c0f1e) {
        if (c0f1e == T2().LIZJ) {
            return;
        }
        i3(new AwS584S0100000_5(c0f1e, 240));
    }

    @Override // X.InterfaceC379090Etf
    public void Kg2(C0F1E c0f1e) {
        K4(c0f1e);
    }

    @Override // X.InterfaceC379090Etf
    public void LLLLIIIILLL(String str) {
        this.LLJJLIIIJLLLLLLLZ = true;
        try {
            N5(str);
            this.LLJJLIIIJLLLLLLLZ = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJLIIIJLLLLLLLZ = false;
            throw th;
        }
    }

    public final void N5(String str) {
        i3(new AwS119S1100000_5(str, E5(T2().LIZJ, str, 2000, T2().LJ, T2().LJIIJ, T2().LJIIJJI), 4));
        this.LLJJJJ.LJII(str);
    }

    @Override // X.InterfaceC379090Etf
    public void Ud2(String str) {
        i3(new AwS56S1000000_5(str, 7));
    }

    @Override // X.InterfaceC379090Etf
    public void Xk1(String str) {
        i3(new AwS56S1000000_5(str, 6));
    }

    @Override // X.InterfaceC379090Etf
    public void uW(C378970EtT c378970EtT) {
        i3(new AwS584S0100000_5(c378970EtT, 241));
        H5(null, null);
        O4(c378970EtT);
    }

    @Override // X.InterfaceC379090Etf
    public void xX(boolean z) {
        i3(new AwS20S0010000_5(z, 10));
    }

    public C382830Ezh(C376260Ep6 c376260Ep6, C1DRG c1drg) {
        super(c376260Ep6, c1drg);
        this.LLJJI = c376260Ep6;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379060Etc.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379180Eto.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379270Etx.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), C379120Eti.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379160Etm.class, null);
        this.LLJJJJ = new h0<>("");
        this.LLJJJJJIL = AFwS191S0000000_5.get$arr$(90);
        this.LLJJJJLIIL = AFwS191S0000000_5.get$arr$(89);
        this.LLJJL = new AwS549S0100000_5(this, 230);
    }

    private final void H5(String str, Integer num) {
        int iIntValue;
        String str2 = str;
        if (str2 == null) {
            str2 = T2().LIZIZ;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = T2().LJ;
        }
        K4(E5(T2().LIZJ, str2, 2000, iIntValue, T2().LJIIJ, T2().LJIIJJI));
    }

    @Override // X.InterfaceC379090Etf
    public void vH(int i, String str) {
        i3(new AwS18S1201000_5(this, E5(T2().LIZJ, T2().LIZIZ, 2000, i, T2().LJIIJ, T2().LJIIJJI), i, str, 1));
    }

    public final C0F1E E5(C0F1E c0f1e, String str, int i, int i2, int i3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0F1E c0f1e2 = C0F1E.LOADING;
        if (c0f1e == c0f1e2) {
            return c0f1e2;
        }
        boolean z6 = false;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        boolean z7 = !z;
        if (str != null && str.length() > i) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE) && i3 >= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z7 && !z3) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i2 <= 0) {
            z6 = true;
        }
        if (z5 || z2 || (z4 && !z7)) {
            return C0F1E.DISABLED;
        }
        if (z6) {
            return C0F1E.NOQUOTA;
        }
        return C0F1E.ENABLED;
    }
}
