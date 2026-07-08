package X;

import com.bytedance.scalpel.protos.MethodStack;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C91, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C91 extends Message.Builder<MethodStack, C1C91> {
    public Long LIZLLL;
    public Integer LJFF;
    public String LJI;
    public Long LJIIIZ;
    public List<Long> LJ = C1516540pZE.LJIIIIZZ();
    public List<String> LJII = C1516540pZE.LJIIIIZZ();
    public List<String> LJIIIIZZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MethodStack build() {
        Long l = this.LIZLLL;
        if (l != null) {
            return new MethodStack(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "time");
        throw null;
    }
}
