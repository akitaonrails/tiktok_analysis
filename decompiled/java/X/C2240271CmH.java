package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240271CmH extends Message.Builder<C2240251CmF, C2240271CmH> {
    public EnumC2240311CmL LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public String LJI;
    public List<String> LJII = C1516540pZE.LJIIIIZZ();
    public String LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2240251CmF build() {
        return new C2240251CmF(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
