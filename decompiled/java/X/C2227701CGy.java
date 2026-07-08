package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227701CGy extends Message.Builder<C2227681CGw, C2227701CGy> {
    public String LIZLLL;
    public Map<String, String> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2227681CGw build() {
        return new C2227681CGw(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
