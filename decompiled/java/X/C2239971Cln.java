package X;

import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Cln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239971Cln extends Message.Builder<SendMessageP2PRequestBody, C2239971Cln> {
    public EnumC875200YVa LIZLLL;
    public String LJ;
    public Integer LJFF;
    public Long LJI;
    public Integer LJIIIZ;
    public String LJIIJ;
    public String LJIIL;
    public List<Long> LJII = C1516540pZE.LJIIIIZZ();
    public List<Long> LJIIIIZZ = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIIJJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SendMessageP2PRequestBody build() {
        return new SendMessageP2PRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
    }
}
