package X;

import java.util.List;

/* JADX INFO: renamed from: X.13Fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19980613Fs implements C13HG<C13BE> {
    public static final C19980613Fs LIZ = new C19980613Fs();
    public static final C19979413Fg LIZIZ = C19979413Fg.LIZIZ;

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return LIZIZ;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        C19981313Fz.LIZ(c13hb);
        return new C13BE((List) new C19979613Fi(C13GI.LIZ).deserialize(c13hb));
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19981313Fz.LIZIZ(c13hd);
        new C19979613Fi(C13GI.LIZ).serialize(c13hd, obj);
    }
}
