package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0gRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165940gRk implements Serializable {
    public final C1176580giu bounds;
    public final C1177960gl8 farLeft;
    public final C1177960gl8 farRight;
    public final C1177960gl8 nearLeft;
    public final C1177960gl8 nearRight;

    public C1165940gRk() {
        this(null, null, null, null, null);
    }

    public C1165940gRk(C1177960gl8 c1177960gl8, C1177960gl8 c1177960gl82, C1177960gl8 c1177960gl83, C1177960gl8 c1177960gl84, C1176580giu c1176580giu) {
        this.nearLeft = c1177960gl8;
        this.nearRight = c1177960gl82;
        this.farLeft = c1177960gl83;
        this.farRight = c1177960gl84;
        this.bounds = c1176580giu;
    }
}
