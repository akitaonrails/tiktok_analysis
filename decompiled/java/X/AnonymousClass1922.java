package X;

import Y.AObserverS216S0100000_12;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1922, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1922 extends AnonymousClass1925<InterfaceC905270ZfJ> implements InterfaceC905270ZfJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final InterfaceC905270ZfJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final MutableLiveData<Integer> LLJJIJIL;
    public final InterfaceC1738600vLO LLJJJ;
    public final C10J3 LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1922.class, "permissionOptionApi", "getPermissionOptionApi()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJJIL = 8;
    }

    public final InterfaceC855150Xgf E5() {
        return (InterfaceC855150Xgf) this.LLJJIJIIJIL.getValue(this, LLJJJJ[0]);
    }

    @Override // X.AnonymousClass1925
    public InterfaceC192004109q T4() {
        return new InterfaceC192004109q() { // from class: X.1923
            @Override // X.InterfaceC192004109q
            public final int LIZ() {
                return this.LIZ.t5().isPrivate;
            }

            @Override // X.InterfaceC192004109q
            public final VideoPublishEditModel LIZIZ() {
                return this.LIZ.t5();
            }

            @Override // X.InterfaceC192004109q
            public final void LIZJ(int i) {
                InterfaceC855150Xgf interfaceC855150XgfE5 = this.LIZ.E5();
                if (interfaceC855150XgfE5 != null) {
                    interfaceC855150XgfE5.jY0(i);
                    return;
                }
                if (i == 4) {
                    if (C298680BnG.LIZ()) {
                        this.LIZ.t5().isPrivate = i;
                    }
                    this.LIZ.t5().creativeModel.privacySettingModel.isSubscribeOnly = true;
                } else {
                    this.LIZ.t5().isPrivate = i;
                    this.LIZ.t5().creativeModel.privacySettingModel.isSubscribeOnly = false;
                }
                this.LIZ.LLJJIJIL.setValue(Integer.valueOf(i));
            }
        };
    }

    public InterfaceC905270ZfJ D5() {
        return this.LLJJIJI;
    }

    @Override // X.AnonymousClass1925, X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJJ;
    }

    @Override // X.AnonymousClass1925, X.C193N
    public C10J3 H4() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJIJI;
    }

    public AnonymousClass1922(C1DRG c1drg, C109W c109w) {
        super(c1drg, c109w);
        this.LLJJIJI = this;
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJJIJIL = new MutableLiveData<>();
        this.LLJJJ = EnumC214771193h.VISIBILITY_RADIO_GROUP;
        this.LLJJJIL = C193D.LIZ;
    }

    @Override // X.InterfaceC905270ZfJ
    public void Zz0(LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        this.LLJJIJIL.observe(lifecycleOwner, new AObserverS216S0100000_12(function1, 54));
    }
}
