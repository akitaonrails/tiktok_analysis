package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.13AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13AZ implements C13AX, Serializable {
    public static final long serialVersionUID = 7535258609338176893L;

    @Override // X.C13AX
    public String getName() {
        return null;
    }

    @Override // X.C13AX
    public /* synthetic */ boolean isEnabledForLevel(EnumC19864512nr enumC19864512nr) {
        return C13AU.LJI(this, enumC19864512nr);
    }

    public Object readResolve() {
        return C13AD.LIZJ(getName());
    }

    @Override // X.C13AX
    public InterfaceC19966013Ac makeLoggingEventBuilder(EnumC19864512nr enumC19864512nr) {
        return new C19965813Aa();
    }
}
