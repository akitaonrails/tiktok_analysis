package X;

import Y.ARunnableS125S0100000_25;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import ln3.a;

/* JADX INFO: renamed from: X.0tGW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1658700tGW extends AbstractC2255721DQs<InterfaceC1644760su2> implements InterfaceC1644760su2, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1644760su2 LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), Context.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 74));
    public final C1658750tGb LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public final MutableLiveData<EnumC1159880gHy> LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1658700tGW.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1658700tGW.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1658700tGW.class, "contextMayNull", "getContextMayNull()Landroid/content/Context;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    private final Context H2() {
        return (Context) this.LLILZLL.getValue(this, LLJIJIL[2]);
    }

    private final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLILZ.getValue(this, LLJIJIL[0]);
    }

    private final a o2() {
        return (a) this.LLILZIL.getValue(this, LLJIJIL[1]);
    }

    private final C1658810tGh w2() {
        return (C1658810tGh) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1644760su2
    public boolean Xx1() {
        NavigationScene navigationSceneLIZ;
        return Intrinsics.LJFF(this.LLJ.getValue(), Boolean.TRUE) || ((navigationSceneLIZ = C1447800nmM.LIZ(this.LL)) != null && C523910Kgf.LIZ(w2(), navigationSceneLIZ));
    }

    private final boolean X1() {
        a aVarO2;
        String string;
        C12I9 c12i9Je;
        BeautyFilterConfig beautyFilterConfigDf;
        if (!i3() || H2() == null || (aVarO2 = o2()) == null) {
            return false;
        }
        if (!C790050Uyx.LIZ(H2())) {
            if (m3()) {
                C12HF.LIZ("1", "1", "1");
                Function2<Context, String, Unit> function2HI = aVarO2.hI();
                if (function2HI != null) {
                    function2HI.invoke(H2(), "");
                }
                return true;
            }
            if (!q3() || (!aVarO2.je().LIZ().isEmpty())) {
                return false;
            }
            C12HF.LIZ("1", "2", "1");
            Function2<Context, String, Unit> function2HI2 = aVarO2.hI();
            if (function2HI2 != null) {
                function2HI2.invoke(H2(), "");
            }
            return true;
        }
        if (!aVarO2.je().LIZ().isEmpty()) {
            return false;
        }
        a aVarO22 = o2();
        if (aVarO22 == null || (c12i9Je = aVarO22.je()) == null || (beautyFilterConfigDf = c12i9Je.df()) == null || (string = Integer.valueOf(beautyFilterConfigDf.beautyOptimizeEffectChange).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        C12HF.LIZ(CardStruct.IStatusCode.DEFAULT, string, CardStruct.IStatusCode.DEFAULT);
        Function2<Context, String, Unit> function2HI3 = aVarO2.hI();
        if (function2HI3 != null) {
            function2HI3.invoke(H2(), "");
        }
        if (!aVarO2.g41()) {
            aVarO2.b52();
        }
        return true;
    }

    private final boolean i3() {
        C12I9 c12i9Je;
        BeautyFilterConfig beautyFilterConfigDf;
        C12I9 c12i9Je2;
        BeautyFilterConfig beautyFilterConfigDf2;
        a aVarO2 = o2();
        if (aVarO2 != null && (c12i9Je2 = aVarO2.je()) != null && (beautyFilterConfigDf2 = c12i9Je2.df()) != null && beautyFilterConfigDf2.beautyOptimizeEffectChange == 1) {
            return true;
        }
        a aVarO22 = o2();
        return (aVarO22 == null || (c12i9Je = aVarO22.je()) == null || (beautyFilterConfigDf = c12i9Je.df()) == null || beautyFilterConfigDf.beautyOptimizeEffectChange != 2) ? false : true;
    }

    private final boolean m3() {
        C12I9 c12i9Je;
        BeautyFilterConfig beautyFilterConfigDf;
        a aVarO2 = o2();
        return (aVarO2 == null || (c12i9Je = aVarO2.je()) == null || (beautyFilterConfigDf = c12i9Je.df()) == null || beautyFilterConfigDf.beautyOptimizeEffectChange != 1) ? false : true;
    }

    private final boolean q3() {
        C12I9 c12i9Je;
        BeautyFilterConfig beautyFilterConfigDf;
        a aVarO2 = o2();
        return (aVarO2 == null || (c12i9Je = aVarO2.je()) == null || (beautyFilterConfigDf = c12i9Je.df()) == null || beautyFilterConfigDf.beautyOptimizeEffectChange != 2) ? false : true;
    }

    @Override // X.InterfaceC1644760su2
    public void V3() {
        InterfaceC1658800tGg interfaceC1658800tGg = w2().LLJJJ;
        if (interfaceC1658800tGg != null) {
            interfaceC1658800tGg.V3();
        }
    }

    public final C1658750tGb G2() {
        return this.LLIZLLLIL;
    }

    public MutableLiveData<Boolean> T2() {
        return this.LLJ;
    }

    public final C19A3 W2() {
        return this.LL;
    }

    public InterfaceC1644760su2 Z1() {
        return this.LLILLL;
    }

    public MutableLiveData<EnumC1159880gHy> c3() {
        return this.LLJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1644760su2
    public /* bridge */ /* synthetic */ LiveData p4() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1644760su2
    public /* bridge */ /* synthetic */ LiveData wW() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1644760su2
    public void FT1(boolean z) {
        if (X1()) {
            return;
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
        if (z && !C523910Kgf.LIZ(w2(), navigationSceneLIZ)) {
            this.LLJ.setValue(Boolean.TRUE);
            InterfaceC1648510t05 gestureApiComponent = getGestureApiComponent();
            if (gestureApiComponent != null) {
                gestureApiComponent.WL(C1658770tGd.LIZ);
            }
            w2().LLJILLL = new C1658720tGY(this);
            C1658810tGh c1658810tGhW2 = w2();
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZ = true;
            C1661810tLX c1661810tLX = new C1661810tLX() { // from class: X.0tGV
            };
            c1661810tLX.LIZIZ = new ARunnableS125S0100000_25(this, 5);
            c569760MWg.LIZJ = c1661810tLX;
            navigationSceneLIZ.LLLLLLLLLL(c1658810tGhW2, c569760MWg.LIZ());
            return;
        }
        if (!C523910Kgf.LIZ(w2(), navigationSceneLIZ)) {
            return;
        }
        navigationSceneLIZ.onBackPressed();
    }

    public C1658810tGh W1(C1DRG c1drg) {
        return new C1658810tGh(c1drg, this.LLIZLLLIL.LIZ);
    }

    @Override // X.InterfaceC1644760su2
    public void lo(Drawable drawable) {
        w2().LLJJ = drawable;
    }

    public final void v3(boolean z) {
        this.LLJ.setValue(Boolean.valueOf(z));
    }

    public C1658700tGW(C19A3 c19a3, C1DRG c1drg, Function1<? super C1658750tGb, Unit> function1) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        C1658750tGb c1658750tGb = new C1658750tGb(0);
        this.LLIZLLLIL = c1658750tGb;
        if (function1 != null) {
            function1.invoke(c1658750tGb);
        }
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
    }
}
