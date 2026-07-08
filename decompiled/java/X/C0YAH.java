package X;

import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YAH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAH extends Message.Builder<ModifyPropertyBody, C0YAH> {
    public String LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;
    public List<ModifyPropertyContent> LJIIIIZZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModifyPropertyBody build() {
        return new ModifyPropertyBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
