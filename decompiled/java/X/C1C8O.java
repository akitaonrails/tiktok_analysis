package X;

import com.bytedance.otis.protos.MethodStack;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C8O, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C8O extends Message.Builder<MethodStack, C1C8O> {
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
        return new MethodStack(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
