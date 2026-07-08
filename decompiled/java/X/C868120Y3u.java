package X;

import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCoreTransientExt;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868120Y3u extends Message.Builder<SetConversationCoreInfoRequestBody, C868120Y3u> {
    public String LIZLLL;
    public Long LJ;
    public Integer LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public Boolean LJIIJ;
    public Boolean LJIIJJI;
    public Boolean LJIIL;
    public Boolean LJIILIIL;
    public Map<String, String> LJIILJJIL = new LinkedHashMap();
    public String LJIILL;
    public BizConvCorePersistentExt LJIILLIIL;
    public BizConvCoreTransientExt LJIIZILJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SetConversationCoreInfoRequestBody build() {
        return new SetConversationCoreInfoRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, buildUnknownFields());
    }
}
