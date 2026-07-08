package X;

import com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YS5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YS5 extends Message.Builder<ModifyMessagePropertyResponseBody, C0YS5> {
    public C0YAO LIZLLL;
    public Long LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModifyMessagePropertyResponseBody build() {
        return new ModifyMessagePropertyResponseBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
