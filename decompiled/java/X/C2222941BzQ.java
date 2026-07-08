package X;

import com.squareup.wire.Message;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1BzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222941BzQ extends Message.Builder<SdkUplinkPacket, C2222941BzQ> {
    public Long LIZLLL = 0L;
    public Long LJ = 0L;
    public String LJII = "";
    public ByteString LJIIIIZZ = ByteString.EMPTY;
    public Integer LJIIIZ = 0;
    public String LJIIJ = "";
    public Integer LJIIJJI = 0;
    public Map<String, String> LJFF = new LinkedHashMap();
    public Map<String, String> LJI = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SdkUplinkPacket build() {
        return new SdkUplinkPacket(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, buildUnknownFields());
    }
}
