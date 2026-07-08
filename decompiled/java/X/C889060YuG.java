package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889060YuG extends Message.Builder<C889080YuI, C889060YuG> {
    public EnumC1705606m6 LIZLLL;
    public List<C2244601CtG> LJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C889080YuI build() {
        return new C889080YuI(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
