package X;

import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1C0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223321C0c extends Message.Builder<C2223301C0a, C2223321C0c> {
    public List<C1CDB> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2223301C0a build() {
        return new C2223301C0a(this.LIZLLL, buildUnknownFields());
    }
}
