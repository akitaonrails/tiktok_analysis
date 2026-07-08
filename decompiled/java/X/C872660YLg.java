package X;

import com.bytedance.im.core.proto.MediaInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872660YLg extends Message.Builder<MessageBody, C872660YLg> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Long LJIIIZ;
    public String LJIIJ;
    public Long LJIIL;
    public Long LJIILIIL;
    public Integer LJIILJJIL;
    public Long LJIILL;
    public String LJIILLIIL;
    public Long LJIJI;
    public ReferenceInfo LJIJJ;
    public Long LJIJJLI;
    public ByteString LJIL;
    public String LJJ;
    public EnumC869230Y8b LJJI;
    public Long LJJIFFI;
    public Long LJJIII;
    public ByteString LJJIIJ;
    public Long LJJIIJZLJL;
    public Integer LJJIIZ;
    public String LJJIIZI;
    public Map<String, String> LJIIJJI = new LinkedHashMap();
    public Map<String, PropertyItemList> LJIIZILJ = new LinkedHashMap();
    public Map<String, String> LJIJ = new LinkedHashMap();
    public List<MediaInfo> LJJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MessageBody build() {
        return new MessageBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, this.LJJIFFI, this.LJJII, this.LJJIII, this.LJJIIJ, this.LJJIIJZLJL, this.LJJIIZ, this.LJJIIZI, buildUnknownFields());
    }
}
