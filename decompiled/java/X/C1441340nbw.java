package X;

import Y.AObjectS305S0200000_22;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441340nbw extends AbstractC2255721DQs<InterfaceC1451520nsM> implements InterfaceC1451520nsM, InterfaceC379610EuV {
    public static final C1441360nby LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1451520nsM LLILZIL = this;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(223));
    public InterfaceC1452170ntP LLIZ;
    public boolean LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0nby] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1441340nbw.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1441340nbw.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C1441340nbw.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0)};
        LLJ = new Object() { // from class: X.0nby
        };
        LLJIJIL = 8;
    }

    @Override // X.InterfaceC1451520nsM
    public void Ev0(C385670FAf<Pair<Boolean, AVMusic>> c385670FAf) {
    }

    @Override // X.InterfaceC1451520nsM
    public void gX0() {
    }

    @Override // X.InterfaceC1451520nsM
    public void jA() {
    }

    @Override // X.InterfaceC1451520nsM
    public void qx() {
    }

    public final InterfaceC1455850nzL X1() {
        return (InterfaceC1455850nzL) this.LLILZ.getValue(this, LLJI[2]);
    }

    public final InterfaceC1439070nYH Z1() {
        return (InterfaceC1439070nYH) this.LLILZLL.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJI[0]);
    }

    public final AbstractC214814194y o2() {
        return (AbstractC214814194y) this.LLILLL.getValue(this, LLJI[1]);
    }

    @Override // X.InterfaceC1451520nsM
    public void LLJL() {
        Z1().LJJIIZ(getEditModel());
    }

    @Override // X.InterfaceC1451520nsM
    public void qo() {
        InterfaceC1439070nYH interfaceC1439070nYHZ1 = Z1();
        o2();
        C1664590tQ1.LJII(this);
        interfaceC1439070nYHZ1.LJIJ(getEditModel());
    }

    public InterfaceC1451520nsM W1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1441340nbw(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1451520nsM
    public void jm(int i) {
        if (i != 1 && i != 1101) {
            if (((Boolean) C262830ARt.LIZ.getValue()).booleanValue() && !C1428470nHB.LJJZZI(getEditModel()) && !C1428470nHB.LJLJLJ(getEditModel())) {
                if (!((Set) C115100c9.LIZ.getValue()).contains(Integer.valueOf(i)) && Z1().LJJL() && !Z1().LJIL()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("click toolbar icon ");
                    sbLIZ.append(i);
                    m7(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("click toolbar icon ");
            sbLIZ2.append(i);
            m7(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC1451520nsM
    public void m7(String str) {
        Z1().LJJLL(getEditModel(), str);
    }

    @Override // X.InterfaceC1451520nsM
    public void uc(InterfaceC1452170ntP interfaceC1452170ntP) {
        C385670FAf<InterfaceC377540ErA> c385670FAfTF;
        this.LLIZ = interfaceC1452170ntP;
        if (C365940EWi.LIZLLL(getEditModel())) {
            InterfaceC1455850nzL interfaceC1455850nzLX1 = X1();
            if (interfaceC1455850nzLX1 != null && (c385670FAfTF = interfaceC1455850nzLX1.TF()) != null) {
                c385670FAfTF.LIZ(this, new AObjectS305S0200000_22(this, interfaceC1452170ntP, 16));
                return;
            }
            return;
        }
        Z1().LJJJI(o2(), C1664590tQ1.LJII(this), getEditModel(), interfaceC1452170ntP);
    }

    @Override // X.InterfaceC1451520nsM
    public void TV(Intent intent, InterfaceC1452170ntP interfaceC1452170ntP, boolean z) {
        Z1().LJJJ(getEditModel(), intent, interfaceC1452170ntP, z);
    }
}
