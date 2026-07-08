package X;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS124S0400000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19684011zq extends i<InterfaceC388540FLg, C19682811ze, C19658811vm, C19683711zn> implements InterfaceC379610EuV, InterfaceC388540FLg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final Context LLJILJILJ;
    public final FrameLayout LLJILLL;
    public final FrameLayout LLJJ;
    public final C0FKI LLJJI;
    public final C1DRG LLJJIII;
    public final C01GW LLJJIJI;
    public final Function0<C19682811ze> LLJJIJIIJIL;
    public final Function0<C19658811vm> LLJJIJIL;
    public final Function0<C19683711zn> LLJJJ;
    public final C385670FAf<TextStickerModel> LLJJJIL;
    public final C385670FAf<C0FHM> LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public C0FGA LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19684011zq.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19684011zq.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final InterfaceC1452170ntP K4() {
        return (InterfaceC1452170ntP) this.LLJJJJLIIL.getValue();
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJL[1]);
    }

    @Override // X.InterfaceC388540FLg
    public C0FGA Co() {
        C0FGA c0fga = this.LLJJL;
        return c0fga == null ? O4() : c0fga;
    }

    public final InterfaceC1455860nzM F4() {
        return (InterfaceC1455860nzM) this.LLJJJJJIL.getValue(this, LLJL[0]);
    }

    public final C19682811ze H4() {
        return (C19682811ze) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC388540FLg
    public void u0() {
        i3(AFwS273S0000000_29.get$arr$(81));
    }

    private final NLEEditor LF2() {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        InterfaceC1452170ntP interfaceC1452170ntPK4 = K4();
        if (!(interfaceC1452170ntPK4 instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntPK4) == null || (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) == null) {
            return null;
        }
        return c348100DkmLIZLLL.LIZ;
    }

    private final C0FGA O4() {
        InterfaceC1455860nzM interfaceC1455860nzMF4;
        VideoPublishEditModel editModel;
        NLEEditor nLEEditorLF2 = LF2();
        InterfaceC1452170ntP interfaceC1452170ntPK4 = K4();
        if (interfaceC1452170ntPK4 == null || nLEEditorLF2 == null || this.LLJILJILJ == null || (interfaceC1455860nzMF4 = F4()) == null || (editModel = getEditModel()) == null) {
            return null;
        }
        C0F8Z c0f8z = new C0F8Z(this.LLJILJILJ, nLEEditorLF2, editModel, interfaceC1455860nzMF4, interfaceC1452170ntPK4.getInitSize(), this);
        this.LLJJL = c0f8z;
        return c0f8z;
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public Point LLFZ() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.LLFZ();
        }
        return null;
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public InterfaceC388390FKr R4() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.R4();
        }
        return null;
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public C1664680tQA<TextStickerModel> Z() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.Z();
        }
        return null;
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void h4() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.h4();
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void l2() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.l2();
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void l3() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.l3();
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FEF
    public boolean onBackPressed() {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.onBackPressed();
        }
        return false;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C0FGA c0fga = this.LLJJL;
        if (c0fga != null) {
            c0fga.destroy();
        }
    }

    @Override // ge.i
    public Function0<C19682811ze> E3() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC388540FLg
    public C385670FAf<C0FHM> S1() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC388540FLg
    public C385670FAf<TextStickerModel> j4() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19658811vm> o2() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19683711zn> w2() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void W4(String str) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.W4(str);
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void b4(EnumC1409650mmp enumC1409650mmp) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.b4(enumC1409650mmp);
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void f5(Pair<String, String> pair) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.f5(pair);
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void s0(boolean z) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.s0(z);
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public boolean y1(int i) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            return c0fwoLLLLLJIL.y1(i);
        }
        return false;
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void e3(TTSModel tTSModel, Pair<Float, Float> pair) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.e3(tTSModel, pair);
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void y4(String str, EnumC1409650mmp enumC1409650mmp) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.y4(str, enumC1409650mmp);
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FWO
    public void W0(TTSModel tTSModel, float f, float f2) {
        C0FWO c0fwoLLLLLJIL = H4().LLLLLJIL();
        if (c0fwoLLLLLJIL != null) {
            c0fwoLLLLLJIL.W0(tTSModel, f, f2);
        }
    }

    @Override // X.InterfaceC388540FLg, X.C0FF7
    public void LLZLI(TextStickerModel textStickerModel, C388340FKm c388340FKm, C390420FSm c390420FSm, C0FSC c0fsc) {
        i3(new AwS124S0400000_29(textStickerModel, c388340FKm, c390420FSm, c0fsc, 0));
        show();
    }

    public C19684011zq(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, C0FKI c0fki, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = context;
        this.LLJILLL = frameLayout;
        this.LLJJ = frameLayout2;
        this.LLJJI = c0fki;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 128));
        this.LLJJIJIIJIL = new AwS573S0100000_29(this, 130);
        this.LLJJIJIL = AFwS218S0000000_29.get$arr$(87);
        this.LLJJJ = new AwS573S0100000_29(this, 129);
        this.LLJJJIL = Z1(new C2217381BqS() { // from class: X.11zp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19658811vm) obj).LIZ;
            }
        });
        this.LLJJJJ = Z1(new C2217381BqS() { // from class: X.11zo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19658811vm) obj).LIZJ;
            }
        });
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 131));
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }
}
