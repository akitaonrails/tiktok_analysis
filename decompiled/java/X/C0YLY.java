package X;

import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.TokenInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YLY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLY extends Message.Builder<Request, C0YLY> {
    public Integer LIZLLL;
    public Long LJ;
    public String LJFF;
    public String LJI;
    public EnumC872610YLb LJII;
    public Integer LJIIIIZZ;
    public String LJIIIZ;
    public RequestBody LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public Map<String, String> LJIIZILJ = new LinkedHashMap();
    public Integer LJIJ;
    public TokenInfo LJIJI;
    public EnumC872600YLa LJIJJ;
    public MsgTrace LJIJJLI;
    public Integer LJIL;
    public String LJJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Request build() {
        return new Request(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, buildUnknownFields());
    }
}
