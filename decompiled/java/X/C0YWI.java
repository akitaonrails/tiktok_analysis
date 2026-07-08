package X;

import com.bytedance.im.core.proto.status_message.PropertyItem;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YWI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWI extends Message.Builder<PropertyItem, C0YWI> {
    public Long LIZLLL;
    public String LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;
    public Long LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PropertyItem build() {
        return new PropertyItem(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
    }
}
