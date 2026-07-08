package X;

import Y.AObjectS247S0100000_29;
import android.graphics.Point;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19684111zr extends i<InterfaceC388530FLf, C19682911zf, C19658711vl, C19683611zm> implements InterfaceC379610EuV, InterfaceC388530FLf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final FrameLayout LLJILJILJ;
    public final FrameLayout LLJILLL;
    public final C0FKI LLJJ;
    public final C1DRG LLJJI;
    public final C01GW LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final Function0<C19682911zf> LLJJIJIIJIL;
    public final Function0<C19658711vl> LLJJIJIL;
    public final Function0<C19683611zm> LLJJJ;
    public final C385670FAf<TextStickerModel> LLJJJIL;
    public final C385670FAf<C0FHM> LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19684111zr.class, "editorStickerApi", "getEditorStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final InterfaceC391240FVq F4() {
        return (InterfaceC391240FVq) this.LLJJIJI.getValue(this, LLJJJJJIL[0]);
    }

    public final C19682911zf H4() {
        return (C19682911zf) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC388530FLf
    public void u0() {
        i3(AFwS273S0000000_29.get$arr$(157));
    }

    private final void Xi() {
        j4().LJI(this);
        j4().LIZ(this, new AObjectS247S0100000_29(this, 62));
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public Point LLFZ() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.LLFZ();
        }
        return null;
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public InterfaceC388390FKr R4() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.R4();
        }
        return null;
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public C1664680tQA<TextStickerModel> Z() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.Z();
        }
        return null;
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void h4() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.h4();
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void l2() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.l2();
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void l3() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.l3();
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FEF
    public boolean onBackPressed() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.onBackPressed();
        }
        return false;
    }

    @Override // ge.i
    public Function0<C19682911zf> E3() {
        return this.LLJJIJIIJIL;
    }

    public final void O4() {
        u0();
    }

    @Override // X.InterfaceC388530FLf
    public C385670FAf<C0FHM> S1() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC388530FLf
    public C385670FAf<TextStickerModel> j4() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19658711vl> o2() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19683611zm> w2() {
        return this.LLJJJ;
    }

    public final void K4(TextStickerModel textStickerModel) {
        i3(new AwS608S0100000_29(textStickerModel, 277));
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void W4(String str) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.W4(str);
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void b4(EnumC1409650mmp enumC1409650mmp) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.b4(enumC1409650mmp);
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void f5(Pair<String, String> pair) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.f5(pair);
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void s0(boolean z) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.s0(z);
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public boolean y1(int i) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.y1(i);
        }
        return false;
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void e3(TTSModel tTSModel, Pair<Float, Float> pair) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.e3(tTSModel, pair);
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void y4(String str, EnumC1409650mmp enumC1409650mmp) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.y4(str, enumC1409650mmp);
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FWO
    public void W0(TTSModel tTSModel, float f, float f2) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.W0(tTSModel, f, f2);
        }
    }

    @Override // X.InterfaceC388530FLf, X.C0FF7
    public void LLZLI(TextStickerModel textStickerModel, C388340FKm c388340FKm, C390420FSm c390420FSm, C0FSC c0fsc) {
        i3(new AwS238S0300000_29(textStickerModel, c390420FSm, c0fsc, 16));
        show();
        Xi();
    }

    public C19684111zr(FrameLayout frameLayout, FrameLayout frameLayout2, C0FKI c0fki, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = frameLayout;
        this.LLJILLL = frameLayout2;
        this.LLJJ = c0fki;
        this.LLJJI = c1drg;
        this.LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 478));
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
        this.LLJJIJIIJIL = new AwS573S0100000_29(this, 480);
        this.LLJJIJIL = AFwS218S0000000_29.get$arr$(230);
        this.LLJJJ = new AwS573S0100000_29(this, 479);
        this.LLJJJIL = Z1(new C2217381BqS() { // from class: X.11zt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19658711vl) obj).LIZ;
            }
        });
        this.LLJJJJ = Z1(new C2217381BqS() { // from class: X.11zs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19658711vl) obj).LIZJ;
            }
        });
    }
}
