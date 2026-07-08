package X;

import com.bytedance.im.core.proto.TokenInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251871DBx extends Message.Builder<TokenInfo, C2251871DBx> {
    public Integer LIZLLL;
    public EnumC19361510ov LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Long LJIIIZ;
    public Integer LJIIJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final TokenInfo build() {
        return new TokenInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, buildUnknownFields());
    }
}
