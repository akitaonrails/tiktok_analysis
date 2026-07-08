package X;

import com.squareup.wire.Message;
import compliance.proto.FieldAnnotation;
import compliance.proto.MsgAnnotation;

/* JADX INFO: renamed from: X.1D9X, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9X extends Message.Builder<MsgAnnotation, C1D9X> {
    public FieldAnnotation LIZLLL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final MsgAnnotation build() {
        return new MsgAnnotation(this.LIZLLL, buildUnknownFields());
    }
}
