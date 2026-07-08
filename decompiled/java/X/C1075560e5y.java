package X;

import com.ss.android.ugc.aweme.relation.auth.api.partner.ContactRequestPartner;

/* JADX INFO: renamed from: X.0e5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075560e5y implements InterfaceC2661011f {
    public static final C1075560e5y LIZIZ = new C1075560e5y();
    public final /* synthetic */ InterfaceC2661011f LIZ;

    @Override // X.InterfaceC2661011f
    public final <T> T create(Class<T> cls) {
        return (T) this.LIZ.create(cls);
    }

    public C1075560e5y() {
        C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(C0CQT.LIZJ);
        c1499850p8J.LIZIZ(new ContactRequestPartner());
        this.LIZ = c1499850p8J.build();
    }
}
