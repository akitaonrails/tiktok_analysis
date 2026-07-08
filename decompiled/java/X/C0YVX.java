package X;

import com.bytedance.im.core.proto.PropertyItem;
import com.squareup.wire.Message;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YVX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YVX extends Message.Builder<PropertyItem, C0YVX> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;
    public Long LJIIIIZZ;
    public ByteString LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PropertyItem build() {
        return new PropertyItem(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
    }
}
