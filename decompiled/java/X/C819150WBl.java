package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0WBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819150WBl implements InterfaceC814220Vwq {
    public final Set<C814570VxP> LIZ;
    public final AbstractC818550W9d LIZIZ;
    public final InterfaceC819180WBo LIZJ;

    public C819150WBl(Set set, C818560W9e c818560W9e, InterfaceC819180WBo interfaceC819180WBo) {
        this.LIZ = set;
        this.LIZIZ = c818560W9e;
        this.LIZJ = interfaceC819180WBo;
    }

    @Override // X.InterfaceC814220Vwq
    public final C819240WBu LIZ(String str, C814570VxP c814570VxP, C0WC0 c0wc0) {
        if (this.LIZ.contains(c814570VxP)) {
            return new C819240WBu(this.LIZIZ, str, c814570VxP, c0wc0, this.LIZJ);
        }
        throw new IllegalArgumentException(C786410Ut5.j4("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{c814570VxP, this.LIZ}));
    }
}
