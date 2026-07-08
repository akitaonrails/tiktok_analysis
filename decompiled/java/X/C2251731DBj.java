package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251731DBj extends Message.Builder<C2251721DBi, C2251731DBj> {
    public Integer LIZLLL;
    public Integer LJ;
    public C2251751DBl LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2251721DBi build() {
        return new C2251721DBi(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
