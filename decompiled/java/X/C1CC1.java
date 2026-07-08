package X;

import com.bytedance.im.core.proto.Config;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CC1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CC1 extends Message.Builder<Config, C1CC1> {
    public String LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final Config build() {
        return new Config(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
