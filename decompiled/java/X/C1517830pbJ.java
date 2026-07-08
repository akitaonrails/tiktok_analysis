package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517830pbJ extends Message.Builder<C1517810pbH, C1517830pbJ> {
    public Map<String, String> LIZLLL = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1517810pbH build() {
        return new C1517810pbH(this.LIZLLL, buildUnknownFields());
    }
}
