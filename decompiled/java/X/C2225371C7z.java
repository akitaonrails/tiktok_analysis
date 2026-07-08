package X;

import com.bytedance.scalpel.protos.AttributionJavaStackInfo;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225371C7z extends Message.Builder<AttributionJavaStackInfo, C2225371C7z> {
    public String LJ;
    public String LJFF;
    public Long LJI;
    public List<String> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<AttributionJavaStackInfo.JavaStackItemInfo> LJII = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AttributionJavaStackInfo build() {
        String str = this.LJ;
        if (str != null && this.LJFF != null && this.LJI != null) {
            return new AttributionJavaStackInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "stage", this.LJFF, "thread_name", this.LJI, "startTime");
        throw null;
    }
}
