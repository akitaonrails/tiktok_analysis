package X;

import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingTransientExt;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867980Y3g extends Message.Builder<SetConversationSettingInfoRequestBody, C867980Y3g> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public Boolean LJI;
    public Boolean LJII;
    public Boolean LJIIIIZZ;
    public EnumC868530Y5j LJIIIZ;
    public Integer LJIIL;
    public BizConvSettingPersistentExt LJIILJJIL;
    public BizConvSettingTransientExt LJIILL;
    public List<String> LJIIJ = C1516540pZE.LJIIIIZZ();
    public List<String> LJIIJJI = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIILIIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SetConversationSettingInfoRequestBody build() {
        return new SetConversationSettingInfoRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, buildUnknownFields());
    }
}
