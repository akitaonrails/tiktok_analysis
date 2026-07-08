package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242821CqO extends Message.Builder<C2242801CqM, C2242821CqO> {
    public C2243521CrW LIZLLL;
    public String LJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2242801CqM build() {
        return new C2242801CqM(this.LIZLLL, this.LJ, buildUnknownFields());
    }
}
