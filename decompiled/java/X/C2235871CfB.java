package X;

import com.squareup.wire.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1CfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235871CfB extends Message.Builder<C2235851Cf9, C2235871CfB> {
    public String LIZLLL;
    public C1CEH LJ;
    public C2232021CXo LJFF;
    public EnumC2232111CXx LJI;
    public Long LJIIIZ;
    public Long LJIIJ;
    public String LJIIJJI;
    public Long LJIIL;
    public Boolean LJIILIIL;
    public List<C2227361CFq> LJII = C1516540pZE.LJIIIIZZ();
    public Map<String, String> LJIIIIZZ = new LinkedHashMap();
    public List<Long> LJIILJJIL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C2235851Cf9 build() {
        String str = this.LIZLLL;
        if (str != null && this.LJI != null && this.LJIIIZ != null && this.LJIIJ != null && this.LJIIL != null && this.LJIILIIL != null) {
            return new C2235851Cf9(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, buildUnknownFields());
        }
        C1516540pZE.LJII(str, "invoke_id", this.LJI, "invite_type", this.LJIIIZ, "max_position", this.LJIIJ, "scene_version", this.LJIIL, "anchor_invite_source", this.LJIILIIL, "notice_confirmed");
        throw null;
    }
}
