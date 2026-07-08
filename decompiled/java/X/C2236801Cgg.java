package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236801Cgg extends Message.Builder<C2236781Cge, C2236801Cgg> {
    public EnumC2232101CXw LIZLLL;
    public EnumC1282170jTD LJ;
    public EnumC1282170jTD LJFF;
    public EnumC1282170jTD LJI;
    public String LJII;
    public Boolean LJIIIIZZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2236781Cge build() {
        EnumC2232101CXw enumC2232101CXw = this.LIZLLL;
        if (enumC2232101CXw != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null) {
            return new C2236781Cge(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2232101CXw, "setting_layout", this.LJ, "setting_fix_mic_num", this.LJFF, "setting_allow_request_from_user", this.LJI, "setting_allow_request_from_follower_only", this.LJII, "frame_setting", this.LJIIIIZZ, "disable_layout_on_create");
        throw null;
    }
}
