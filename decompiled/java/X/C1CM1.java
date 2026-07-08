package X;

import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1CM1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CM1 extends Message.Builder<C2229011CLz, C1CM1> {
    public String LIZLLL;
    public String LJ;
    public Boolean LJFF;
    public String LJI;
    public String LJII;
    public C2229171CMp LJIIIIZZ;
    public C1CZR LJIIIZ;
    public EnumC1286780jae LJIIJ;
    public Boolean LJIIJJI;
    public String LJIIL;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2229011CLz build() {
        String str = this.LIZLLL;
        if (str != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIIL != null) {
            return new C2229011CLz(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "app_channel_type", this.LJ, "project_key", this.LJFF, "force_global_api_server", this.LJI, "str_uid", this.LJII, "rtc_ext_info", this.LJIIIIZZ, "mix_stream_config", this.LJIIIZ, "media_param", this.LJIIJ, "render_view_mode", this.LJIIJJI, "enable_subscript_optimization", this.LJIIL, "link_mic_layout_config");
        throw null;
    }
}
