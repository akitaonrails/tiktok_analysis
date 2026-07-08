package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1D0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0Y extends Message.Builder<C1D0V, C1D0Y> {
    public EnumC2182911Abx LIZLLL;
    public EnumC2182371Ab5 LJ;
    public Long LJFF;
    public Long LJI;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public Long LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public Boolean LJIILL;
    public C1CXG LJIILLIIL;
    public Boolean LJIJI;
    public List<String> LJII = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIIIIZZ = new LinkedHashMap();
    public List<C1CW4> LJIIZILJ = C1516540pZE.LJIIIIZZ();
    public List<String> LJIJ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1D0V build() {
        EnumC2182911Abx enumC2182911Abx = this.LIZLLL;
        if (enumC2182911Abx != null && this.LJ != null && this.LJFF != null && this.LJI != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIL != null && this.LJIILIIL != null && this.LJIILJJIL != null && this.LJIILL != null && this.LJIILLIIL != null && this.LJIJI != null) {
            return new C1D0V(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, buildUnknownFields());
        }
        C1516540pZE.LJII(enumC2182911Abx, "room_permission", this.LJ, "vendor_version", this.LJFF, "dsl_layout_scene_override", this.LJI, "battle_id", this.LJIIIZ, "business_extra_info", this.LJIIJ, "zoomed_linkmic_id", this.LJIIL, "sub_scene", this.LJIILIIL, "mix_background_color", this.LJIILJJIL, "background", this.LJIILL, "is_force_push_audio_steam", this.LJIILLIIL, "room_permission_v2", this.LJIJI, "need_old_corner_radius");
        throw null;
    }
}
