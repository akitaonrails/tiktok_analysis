package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1C1F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1F extends Message.Builder<C1C1D, C1C1F> {
    public Map<Long, C062F> LIZLLL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C1D build() {
        return new C1C1D(this.LIZLLL, buildUnknownFields());
    }
}
