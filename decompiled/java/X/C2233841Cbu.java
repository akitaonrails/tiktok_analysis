package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1Cbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233841Cbu extends Message.Builder<C2233821Cbs, C2233841Cbu> {
    public Boolean LIZLLL;
    public Long LJ;
    public Double LJFF;
    public EnumC2182351Ab3 LJI;
    public C1CSP LJII;
    public C2230371CRf LJIIIIZZ;
    public String LJIIIZ;
    public C1CIG LJIIJ;
    public C1CIG LJIIJJI;
    public C1CIG LJIIL;
    public C1CIG LJIILIIL;
    public C1CIG LJIILJJIL;
    public C1CIG LJIILL;
    public C1CIG LJIILLIIL;
    public C1CIG LJIIZILJ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2233821Cbs build() {
        Boolean bool = this.LIZLLL;
        if (bool != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null && this.LJIILIIL != null && this.LJIILLIIL != null) {
            return new C2233821Cbs(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, buildUnknownFields());
        }
        C1516540pZE.LJII(bool, "is_room_owner", this.LJ, "self_uid", this.LJFF, "device_screen_scale", this.LJI, "layer_scene", this.LJII, "parent_container_info", this.LJIIIIZZ, "container_rect_config", this.LJIIJ, "link_mic_static_data_channel_provider", this.LJIIJJI, "link_mic_layout_thread_handler", this.LJIIL, "listener", this.LJIILIIL, "view_provider", this.LJIILLIIL, "log_handler");
        throw null;
    }
}
