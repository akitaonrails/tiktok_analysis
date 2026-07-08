package X;

import android.view.Window;
import android.view.WindowManager;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS79S1000000_29;

/* JADX INFO: renamed from: X.11zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19682511zb extends i<InterfaceC385890FBb, C19681511zR, C19680811zK, C19682211zY> implements InterfaceC379610EuV, InterfaceC385890FBb {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C1DRG LLJILJILJ;
    public final boolean LLJILLL;
    public TextStickerModel LLJJ;
    public Integer LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public C19681511zR LLJJIJI;
    public final Function0<C19680811zK> LLJJIJIIJIL;
    public final Function0<C19682211zY> LLJJIJIL;
    public final C385670FAf<C386100FBw> LLJJJ;
    public final h0<Boolean> LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19682511zb.class, "textMobService", "getTextMobService()Lcom/ss/android/ugc/aweme/tools/sticker/core/text/ITextStickerMobService;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = 8;
    }

    @Override // X.InterfaceC385890FBb
    public void DC0() {
        WindowManager.LayoutParams attributes;
        if (this.LLJJI == null) {
            Window window = C1664590tQ1.LJII(this).getWindow();
            this.LLJJI = (window == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
            Window window2 = C1664590tQ1.LJII(this).getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(16);
            }
        }
        i3(AFwS273S0000000_29.get$arr$(192));
    }

    @Override // ge.i
    public Function0<C19681511zR> E3() {
        return new AwS573S0100000_29(this, 525);
    }

    public final C0FGR F4() {
        return (C0FGR) this.LLJJIII.getValue(this, LLJJJJ[0]);
    }

    @Override // X.InterfaceC385890FBb
    public void LJLZ() {
        C0FGR c0fgrF4;
        i3(AFwS273S0000000_29.get$arr$(188));
        if (this.LLJILLL) {
            C386100FBw c386100FBw = T2().LJ;
            if ((c386100FBw != null ? c386100FBw.LIZ : null) != EnumC371580EhY.SHOW || (c0fgrF4 = F4()) == null) {
                return;
            }
            TextStickerModel textStickerModel = T2().LIZJ;
            c0fgrF4.LJIL("close", textStickerModel, Integer.valueOf(textStickerModel.getTextStr().length()));
        }
    }

    @Override // X.InterfaceC385890FBb
    public void pe0() {
        i3(AFwS273S0000000_29.get$arr$(190));
    }

    @Override // X.InterfaceC385890FBb
    public void vT() {
        Integer num = this.LLJJI;
        if (num != null) {
            int iIntValue = num.intValue();
            Window window = C1664590tQ1.LJII(this).getWindow();
            if (window != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        this.LLJJI = null;
        i3(AFwS273S0000000_29.get$arr$(193));
    }

    @Override // X.InterfaceC385890FBb
    public void Co2() {
        vT();
        i3(AFwS273S0000000_29.get$arr$(189));
        C19681511zR c19681511zR = this.LLJJIJI;
        if (c19681511zR != null) {
            c19681511zR.LLJJJJLIIL = null;
        }
    }

    @Override // X.InterfaceC385890FBb
    public void WD0() {
        show();
        DC0();
        i3(AFwS273S0000000_29.get$arr$(191));
    }

    @Override // X.InterfaceC385890FBb
    public C385670FAf<C386100FBw> Rf() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC385890FBb
    public C385670FAf<Boolean> SM() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19680811zK> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19682211zY> w2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC385890FBb
    public void E11(InterfaceC1631630sYr<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Boolean> interfaceC1631630sYr) {
        C19681511zR c19681511zR = this.LLJJIJI;
        if (c19681511zR != null) {
            c19681511zR.LLJJJJLIIL = interfaceC1631630sYr;
        }
    }

    @Override // X.InterfaceC385890FBb
    public void GX1(InterfaceC19682311zZ interfaceC19682311zZ) {
        i3(new AwS608S0100000_29(interfaceC19682311zZ, 314));
    }

    @Override // X.InterfaceC385890FBb
    public void LJJLIIIJJIZ(TextStickerModel textStickerModel) {
        this.LLJJ = textStickerModel;
        i3(new AwS608S0100000_29(textStickerModel, 316));
    }

    @Override // X.InterfaceC385890FBb
    public void LLLLIIIILLL(String str) {
        i3(new AwS79S1000000_29(str, 2));
    }

    @Override // X.InterfaceC385890FBb
    public void j01(String str) {
        i3(new AwS79S1000000_29(str, 3));
    }

    @Override // X.InterfaceC385890FBb
    public void li0(C19681811zU c19681811zU) {
        i3(new AwS608S0100000_29(c19681811zU, 317));
    }

    @Override // X.InterfaceC385890FBb
    public void vo1(InterfaceC19682311zZ interfaceC19682311zZ) {
        i3(new AwS608S0100000_29(interfaceC19682311zZ, 315));
    }

    public C19682511zb(C19A3 c19a3, C1DRG c1drg, boolean z) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = z;
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C0FGR.class, null);
        this.LLJJIJIIJIL = AFwS218S0000000_29.get$arr$(239);
        this.LLJJIJIL = new AwS573S0100000_29(this, 524);
        this.LLJJJ = Z1(new C2217381BqS() { // from class: X.11za
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19680811zK) obj).LJ;
            }
        });
        this.LLJJJIL = new h0<>(null);
    }
}
