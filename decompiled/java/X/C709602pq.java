package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.02pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C709602pq extends Message.Builder<C709402po, C709602pq> {
    public String LIZLLL;
    public final Map<String, String> LJ = new LinkedHashMap();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C709402po build() {
        return new C709402po(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
