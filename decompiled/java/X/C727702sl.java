package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import multiverse.data.proto.BcmStandardEvent;

/* JADX INFO: renamed from: X.02sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C727702sl extends Message.Builder<BcmStandardEvent, C727702sl> {
    public Map<String, String> LIZLLL = new LinkedHashMap();
    public Map<String, String> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BcmStandardEvent build() {
        return new BcmStandardEvent(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
