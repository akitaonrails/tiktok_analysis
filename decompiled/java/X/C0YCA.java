package X;

import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.bytedance.im.core.proto.SendMediaRequest;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YCA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCA extends Message.Builder<SendMessageRequestBody, C0YCA> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public Integer LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public Boolean LJIIL;
    public ReferencedMessageInfo LJIILIIL;
    public ByteString LJIILL;
    public String LJIILLIIL;
    public ByteString LJIJJ;
    public ByteString LJIJJLI;
    public Long LJIL;
    public Map<String, String> LJII = new LinkedHashMap();
    public List<Long> LJIIJJI = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIILJJIL = new LinkedHashMap();
    public List<Long> LJIIZILJ = C1516540pZE.LJIIIIZZ();
    public List<Long> LJIJ = C1516540pZE.LJIIIIZZ();
    public List<SendMediaRequest> LJIJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendMessageRequestBody build() {
        return new SendMessageRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, buildUnknownFields());
    }
}
