package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231511CVp extends Message.Builder<C2231491CVn, C2231511CVp> {
    public String LIZLLL;
    public C2232021CXo LJ;
    public Long LJFF;
    public Long LJI;
    public EnumC1282030jSz LJII;
    public C1CW2 LJIIIIZZ;
    public C2227631CGr LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2231491CVn build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null) {
            return new C2231491CVn(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJ, "leaver", this.LJFF, "group_channel_id", this.LJI, "current_group_channel_id", this.LJII, "leave_reason", this.LJIIIIZZ, "finish_link_mic_reason", this.LJIIIZ, "biz_param");
        throw null;
    }
}
