package X;

import java.net.URI;

/* JADX INFO: renamed from: X.0X2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC842330X2p {
    public static final C842350X2r LIZ = new InterfaceC842330X2p() { // from class: X.0X2r
        @Override // X.InterfaceC842330X2p
        public final boolean LIZ(C842390X2v c842390X2v, URI uri) {
            return true;
        }
    };

    boolean LIZ(C842390X2v c842390X2v, URI uri);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0X2r] */
    static {
        new InterfaceC842330X2p() { // from class: X.0X2q
            @Override // X.InterfaceC842330X2p
            public final boolean LIZ(C842390X2v c842390X2v, URI uri) {
                return C842390X2v.LIZ(c842390X2v.LLILZ, uri.getHost());
            }
        };
    }
}
