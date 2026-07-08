package X;

import com.bytedance.im.core.proto.MediaInfo;
import com.bytedance.im.core.proto.MediaURLStruct;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872680YLi extends Message.Builder<MediaInfo, C872680YLi> {
    public String LIZLLL;
    public EnumC870720YDu LJ;
    public String LJFF;
    public List<MediaURLStruct> LJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MediaInfo build() {
        return new MediaInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
    }
}
