package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244621CtI extends Message.Builder<C2244601CtG, C2244621CtI> {
    public Integer LIZLLL;
    public String LJ;
    public Integer LJFF;
    public C2244701CtQ LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2244601CtG build() {
        return new C2244601CtG(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
