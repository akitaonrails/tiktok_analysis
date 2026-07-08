package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228501CKa extends Message.Builder<C1CKY, C2228501CKa> {
    public C2232021CXo LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public EnumC1282030jSz LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1CKY build() {
        C2232021CXo c2232021CXo = this.LIZLLL;
        if (c2232021CXo != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new C1CKY(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(c2232021CXo, "leave_user", this.LJ, "is_self_video_mute", this.LJFF, "is_self_audio_mute", this.LJI, "leave_reason");
        throw null;
    }
}
