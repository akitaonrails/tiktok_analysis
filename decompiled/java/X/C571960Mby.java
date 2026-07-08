package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Mby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571960Mby extends AbstractC2255721DQs<InterfaceC572080McA> implements InterfaceC379610EuV, InterfaceC572080McA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC572080McA LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public boolean LLILZLL;
    public boolean LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final MutableLiveData<Integer> LLJ;
    public final MutableLiveData<C571970Mbz> LLJI;
    public final MutableLiveData<Boolean> LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C571960Mby.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = 8;
    }

    private final VideoPublishEditModel X1() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    @Override // X.InterfaceC572080McA
    public void F22() {
        C573960MfC.LIZ(C0CHQ.LIZ().LJIIJ(), X1(), X1().getCreationId(), 5, null, 24);
    }

    @Override // X.InterfaceC572080McA
    public LiveData<Boolean> Dd2() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC572080McA
    public LiveData<C571970Mbz> Nj0() {
        return this.LLJI;
    }

    @Override // X.InterfaceC572080McA
    public boolean U92() {
        return this.LLILZLL;
    }

    public InterfaceC572080McA W1() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC572080McA
    public LiveData<Boolean> dR1() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC572080McA
    public boolean li1() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC572080McA
    public LiveData<Integer> ua() {
        return this.LLJ;
    }

    @Override // X.InterfaceC572080McA
    public void YG2(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.InterfaceC572080McA
    public void bl0(boolean z) {
        this.LLJIJIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC572080McA
    public void la0(boolean z) {
        this.LLIZ = z;
    }

    @Override // X.InterfaceC572080McA
    public void FO(boolean z, boolean z2) {
        this.LLJI.setValue(new C571970Mbz(z, z2));
    }

    @Override // X.InterfaceC572080McA
    public void wI0(String str, boolean z) {
        int iValueOf;
        boolean z2 = true;
        if (!z) {
            la0(true);
        }
        X1().creativeModel.text2ImageModel.text = str;
        MutableLiveData<Boolean> mutableLiveData = this.LLIZLLLIL;
        if (str == null || !C123100dR.LIZ(str)) {
            z2 = false;
        }
        mutableLiveData.setValue(Boolean.valueOf(z2));
        MutableLiveData<Integer> mutableLiveData2 = this.LLJ;
        if (str != null) {
            iValueOf = Integer.valueOf(str.length());
        } else {
            iValueOf = 0;
        }
        mutableLiveData2.setValue(iValueOf);
    }

    public C571960Mby(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        c19a3.add(i, new C572260McS(getDiContainer()), "TTIEditContainerScene");
        this.LLIZLLLIL = new MutableLiveData<>();
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>();
    }
}
