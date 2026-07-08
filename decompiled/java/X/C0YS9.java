package X;

import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YS9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YS9 extends Message.Builder<ModifyPropertyContent, C0YS9> {
    public C0YS6 LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public C0YAP LJII;
    public ByteString LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModifyPropertyContent build() {
        return new ModifyPropertyContent(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
