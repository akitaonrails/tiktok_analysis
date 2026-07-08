package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1C4A, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4A extends Message.Builder<C1C48, C1C4A> {
    public Map<String, C1C4B> LIZLLL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1C48 build() {
        return new C1C48(this.LIZLLL, buildUnknownFields());
    }
}
