package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1D0X, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0X extends Message.Builder<C1D0T, C1D0X> {
    public EnumC2182911Abx LIZLLL;
    public EnumC2182371Ab5 LJ;
    public Long LJFF;
    public Long LJI;
    public String LJII;
    public Double LJIIIIZZ;
    public Double LJIIIZ;
    public Long LJIIJ;
    public Double LJIIJJI;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public Long LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public Boolean LJIL;
    public C1CXG LJJ;
    public List<String> LJIIL = C1516540pZE.LJIIIIZZ();
    public Map<String, C1CSD> LJIILIIL = new LinkedHashMap();
    public Map<String, C1CSD> LJIILJJIL = new LinkedHashMap();
    public List<C1CW4> LJJI = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D0T build() {
        EnumC2182911Abx enumC2182911Abx = this.LIZLLL;
        if (enumC2182911Abx != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJII != null && this.LJIIIIZZ != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIJJI != null && this.LJIILL != null && this.LJIILLIIL != null && this.LJIJ != null && this.LJIJI != null && this.LJIJJ != null && this.LJIJJLI != null && this.LJIL != null && this.LJJ != null) {
            return new C1D0T(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, this.LJIJJ, this.LJIJJLI, this.LJIL, this.LJJ, this.LJJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2182911Abx, "room_permission", this.LJ, "vendor_version", this.LJFF, "dsl_layout_scene_override", this.LJI, "dsl_layout_scene_version", this.LJII, "dsl_layout_id", this.LJIIIIZZ, "canvas_width", this.LJIIIZ, "canvas_height", this.LJIIJ, "battle_id", this.LJIIJJI, "container_offset_y", this.LJIILL, "business_extra_info", this.LJIILLIIL, "zoomed_linkmic_id", this.LJIJ, "sync_layout_id", this.LJIJI, "sub_scene", this.LJIJJ, "mix_background_color", this.LJIJJLI, "background", this.LJIL, "is_force_push_audio_steam", this.LJJ, "room_permission_v2");
        throw null;
    }
}
