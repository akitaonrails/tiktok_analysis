package X;

import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y4Y extends Message.Builder<ConversationCoreInfo, C0Y4Y> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Integer LJIIJ;
    public String LJIIJJI;
    public Long LJIILIIL;
    public String LJIILJJIL;
    public EnumC868560Y5m LJIILL;
    public Boolean LJIILLIIL;
    public Integer LJIIZILJ;
    public Integer LJIJ;
    public Long LJIJI;
    public String LJIJJ;
    public Long LJIJJLI;
    public BizConvCorePersistentExt LJIL;
    public Map<String, String> LJIIL = new LinkedHashMap();
    public List<String> LJJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationCoreInfo build() {
        return new ConversationCoreInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, buildUnknownFields());
    }
}
