package X;

import com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody;
import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YC4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YC4 extends Message.Builder<ModifyMessagePropertyRequestBody, C0YC4> {
    public ModifyPropertyBody LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ModifyMessagePropertyRequestBody build() {
        return new ModifyMessagePropertyRequestBody(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
