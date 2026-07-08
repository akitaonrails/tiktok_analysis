package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242121CpG extends Message.Builder<C2242091CpD, C2242121CpG> {
    public Integer LIZLLL;
    public String LJ;
    public String LJFF;
    public Boolean LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2242091CpD build() {
        return new C2242091CpD(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
