package X;

import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869360Y8o extends Message.Builder<ConversationSettingInfo, C869360Y8o> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Long LJI;
    public Long LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public Integer LJIIJ;
    public Map<String, String> LJIIJJI = new LinkedHashMap();
    public Long LJIIL;
    public Integer LJIILIIL;
    public Long LJIILJJIL;
    public Long LJIILL;
    public Long LJIILLIIL;
    public Long LJIIZILJ;
    public Integer LJIJ;
    public Integer LJIJI;
    public EnumC868530Y5j LJIJJ;
    public String LJIJJLI;
    public Integer LJIL;
    public BizConvSettingPersistentExt LJJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationSettingInfo build() {
        return new ConversationSettingInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, buildUnknownFields());
    }
}
