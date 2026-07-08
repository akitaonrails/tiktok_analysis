package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0o9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462440o9y extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public final InterfaceC1462140o9U LLILLJJLI;
    public final C05YF LLILLL = this;
    public final int LLILZ = 4;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1465230oET.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1406950miT.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), C1455830nzJ.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1462440o9y.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1462440o9y.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1462440o9y.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1462440o9y.class, "iStickerSelectListener", "getIStickerSelectListener()Lcom/ss/android/ugc/aweme/infoSticker/IStickerSelectListener;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1462440o9y.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1462440o9y.class, "editStickerPanelCompatibleAdapter", "getEditStickerPanelCompatibleAdapter()Lcom/ss/android/ugc/gamora/editor/EditStickerPanelCompatibleAdapter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1462440o9y.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    private final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILZLL.getValue(this, LLJILJIL[1]);
    }

    private final Activity getActivity() {
        return (Activity) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    private final C1455830nzJ w2() {
        return (C1455830nzJ) this.LLJI.getValue(this, LLJILJIL[5]);
    }

    public final InterfaceC1406950miT G2() {
        return (InterfaceC1406950miT) this.LLIZLLLIL.getValue(this, LLJILJIL[3]);
    }

    public final InterfaceC1451520nsM W1() {
        return (InterfaceC1451520nsM) this.LLJ.getValue(this, LLJILJIL[4]);
    }

    public final C1451630nsX Z1() {
        return (C1451630nsX) this.LLJIJIL.getValue(this, LLJILJIL[6]);
    }

    public final InterfaceC1465230oET o2() {
        return (InterfaceC1465230oET) this.LLIZ.getValue(this, LLJILJIL[2]);
    }

    public final void pc2() {
        C1653260t7k.LIZ("click_edit_sticker_entrance");
        C1462460oA0.LIZ(o2(), true, 0L, 6);
    }

    private final void c3() {
        o2().N8();
        o2().Bt(new InterfaceC1406950miT() { // from class: X.0o9z
            @Override // X.InterfaceC1406950miT
            public final void Bl() {
                this.LL.G2().Bl();
                C1451630nsX c1451630nsXZ1 = this.LL.Z1();
                if (c1451630nsXZ1 != null) {
                    c1451630nsXZ1.LIZIZ(AFwS261S0000000_22.get$arr$(163));
                }
            }

            @Override // X.InterfaceC1406950miT
            public final void Ho() {
                this.LL.G2().Ho();
                C1451630nsX c1451630nsXZ1 = this.LL.Z1();
                if (c1451630nsXZ1 != null) {
                    c1451630nsXZ1.LIZIZ(AFwS261S0000000_22.get$arr$(164));
                }
            }

            @Override // X.InterfaceC1406950miT
            public final void L0(Effect effect, String str) {
                this.LL.G2().L0(effect, str);
            }

            @Override // X.InterfaceC1406950miT
            public final void Ph(Effect effect, String str) {
                InterfaceC1451520nsM interfaceC1451520nsMW1 = this.LL.W1();
                if (interfaceC1451520nsMW1 != null) {
                    interfaceC1451520nsMW1.jA();
                }
                this.LL.G2().Ph(effect, str);
            }
        });
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1455860nzM interfaceC1455860nzM;
        LiveData<Void> liveDataWw2;
        super.onCreate();
        X1().ww2().observe(this, new AObjectS245S0100000_22(this, 104));
        w2().LIZJ.LIZ(this, new AObjectS245S0100000_22(this, 105));
        if (C297770Bln.LIZ() && (interfaceC1455860nzM = (InterfaceC1455860nzM) getDiContainer().LJIIL(null, InterfaceC1455860nzM.class)) != null && (liveDataWw2 = interfaceC1455860nzM.ww2()) != null) {
            liveDataWw2.observe(this, new AObserverS225S0100000_22(this, 64));
        }
        if (this.LLILLJJLI.LJ() != null) {
            C385670FAf<InterfaceC1460000o62> c385670FAfLJ = this.LLILLJJLI.LJ();
            if (c385670FAfLJ != null) {
                c385670FAfLJ.LIZ(this, new AObjectS245S0100000_22(this, 106));
            }
        } else {
            LiveData<Integer> liveDataLIZ = this.LLILLJJLI.LIZ();
            if (liveDataLIZ != null) {
                liveDataLIZ.observe(this, new AObjectS245S0100000_22(this, 107));
            }
        }
        w2().LIZIZ.LIZ(this, new AObjectS245S0100000_22(this, 108));
        w2().LIZ.LIZ(this, new AObjectS245S0100000_22(this, 109));
    }

    public final int H2() {
        return this.LLILZ;
    }

    public final InterfaceC1462140o9U T2() {
        return this.LLILLJJLI;
    }

    public final void W2() {
        c3();
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1462440o9y(C1DRG c1drg, InterfaceC1462140o9U interfaceC1462140o9U) {
        this.LL = c1drg;
        this.LLILLJJLI = interfaceC1462140o9U;
    }
}
