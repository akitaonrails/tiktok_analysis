package X;

/* JADX INFO: renamed from: X.0dTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1051750dTZ implements InterfaceC1051730dTX {
    public EnumC1051570dTH access = EnumC1051570dTH.PRIVATE;
    public final C1051660dTQ contextProviderFactory;
    public boolean needCallback;

    @Override // X.InterfaceC1051690dTT
    public void release() {
    }

    @Override // X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    public final C1051660dTQ getContextProviderFactory() {
        return this.contextProviderFactory;
    }

    @Override // X.InterfaceC1051460dT6
    public boolean getNeedCallback() {
        return this.needCallback;
    }

    public AbstractC1051750dTZ(C1051660dTQ c1051660dTQ) {
        this.contextProviderFactory = c1051660dTQ;
    }

    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    public void setNeedCallback(boolean z) {
        this.needCallback = z;
    }
}
