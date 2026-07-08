package X;

import com.bytedance.im.core.proto.BlockMembersRequestBody;
import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1DBI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DBI extends Message.Builder<BlockMembersRequestBody, C1DBI> {
    public EnumC868560Y5m LIZLLL;
    public Long LJFF;
    public Integer LJI;
    public String LJII;
    public Map<Long, Long> LJ = new LinkedHashMap();
    public Map<String, String> LJIIIIZZ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BlockMembersRequestBody build() {
        return new BlockMembersRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
