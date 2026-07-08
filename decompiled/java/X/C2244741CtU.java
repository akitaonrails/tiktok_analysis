package X;

import com.bytedance.im.core.proto.MediaURLStruct;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1CtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244741CtU extends Message.Builder<MediaURLStruct, C2244741CtU> {
    public String LIZLLL;
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public String LJFF;
    public Integer LJI;
    public Integer LJII;
    public Long LJIIIIZZ;
    public Long LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MediaURLStruct build() {
        return new MediaURLStruct(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
