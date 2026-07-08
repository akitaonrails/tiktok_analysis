package X;

import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0YON, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YON extends Message.Builder<Response, C0YON> {
    public Integer LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public Integer LJII;
    public ResponseBody LJIIIIZZ;
    public String LJIIIZ;
    public Map<String, String> LJIIJ = new LinkedHashMap();
    public Long LJIIJJI;
    public Long LJIIL;
    public Long LJIILIIL;
    public Integer LJIILJJIL;
    public Long LJIILL;
    public String LJIILLIIL;
    public Long LJIIZILJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Response build() {
        return new Response(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, buildUnknownFields());
    }
}
