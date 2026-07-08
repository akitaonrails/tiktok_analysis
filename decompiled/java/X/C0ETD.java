package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ETD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ETD extends i<C0ER2, C0ETH, C0ETE, C0ETF> implements InterfaceC379610EuV, C0ER2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Function0<C0ETE> LLJJIII;
    public final Function0<C0ETF> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ETD.class, "contentApi", "getContentApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/fillerword/api/CaptionFillerWordContentApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ETD.class, "contextData", "getContextData()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/captions/fillerword/ui/CaptionFillerWordPanelContext;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJIL = 8;
    }

    public final InterfaceC364550EQz H4() {
        return (InterfaceC364550EQz) this.LLJJ.getValue(this, LLJJIJIIJIL[0]);
    }

    public final C364490EQt K4() {
        return (C364490EQt) this.LLJJI.getValue(this, LLJJIJIIJIL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        F4(0);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0ETE> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0ETF> w2() {
        return this.LLJJIJI;
    }

    public final void F4(int i) {
        C364490EQt c364490EQtK4 = K4();
        InterfaceC360800ECo interfaceC360800ECo = (InterfaceC360800ECo) c364490EQtK4.LLJJIJIIJIL.getValue(c364490EQtK4, C364490EQt.LLJJL[4]);
        if (interfaceC360800ECo != null) {
            C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.FULL_SCREEN}, Integer.valueOf(i), null, null, null, 28);
        }
    }

    public final View O4(Context context) {
        return C786410Ut5.Sd(R.layout.c02, C786410Ut5.ne(context), null);
    }

    @Override // X.C0ER2
    public void OB2(EnumC364790ERx enumC364790ERx) {
        i3(new AwS584S0100000_5(enumC364790ERx, 537));
    }

    public C0ETD(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC364550EQz.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C364490EQt.class, null);
        this.LLJJIII = new AwS549S0100000_5(this, 609);
        this.LLJJIJI = new AwS549S0100000_5(this, 610);
    }
}
