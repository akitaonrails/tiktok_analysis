package X;

import com.bytedance.im.core.proto.SecUidPair;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1ChL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2237211ChL extends Message.Builder<SecUidPair, C2237211ChL> {
    public Long LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final SecUidPair build() {
        return new SecUidPair(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
