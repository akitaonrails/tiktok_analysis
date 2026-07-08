package X;

import com.squareup.wire.Message;
import compliance.proto.FieldAnnotation;

/* JADX INFO: renamed from: X.1D9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9Z extends Message.Builder<FieldAnnotation, C1D9Z> {
    public Boolean LIZLLL;
    public Boolean LJ;
    public String LJFF;
    public FieldAnnotation LJI;
    public FieldAnnotation LJII;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final FieldAnnotation build() {
        return new FieldAnnotation(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, buildUnknownFields());
    }
}
