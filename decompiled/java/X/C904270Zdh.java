package X;

import com.bytedance.im.core.proto.UrlStruct;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0Zdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904270Zdh extends Message.Builder<UrlStruct, C904270Zdh> {
    public String LIZLLL;
    public List<String> LJ = C1516540pZE.LJIIIIZZ();
    public Integer LJFF;
    public Integer LJI;
    public Integer LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final UrlStruct build() {
        return new UrlStruct(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
