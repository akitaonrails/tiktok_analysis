package X;

import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCoreTransientExt;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y4R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y4R extends Message.Builder<CreateConversationV2RequestBody, C0Y4R> {
    public Integer LIZLLL;
    public Boolean LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILJJIL;
    public Long LJIILL;
    public BizConvCorePersistentExt LJIILLIIL;
    public BizConvCoreTransientExt LJIIZILJ;
    public List<Long> LJ = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIIJ = new LinkedHashMap();
    public Map<String, String> LJIILIIL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final CreateConversationV2RequestBody build() {
        return new CreateConversationV2RequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, buildUnknownFields());
    }
}
