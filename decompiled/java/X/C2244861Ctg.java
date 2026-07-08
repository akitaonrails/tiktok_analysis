package X;

import com.bytedance.im.core.proto.BatchUnmarkMessageRequestBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1Ctg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244861Ctg extends Message.Builder<BatchUnmarkMessageRequestBody, C2244861Ctg> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public List<Long> LJI = C1516540pZE.LJIIIIZZ();
    public EnumC2244831Ctd LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchUnmarkMessageRequestBody build() {
        return new BatchUnmarkMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
