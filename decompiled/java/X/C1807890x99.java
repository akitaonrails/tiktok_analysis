package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0x99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807890x99 implements InterfaceC1804390x3V {
    public EnumC1807900x9A LIZ;
    public final C1807920x9C LIZIZ = new C1803520x26() { // from class: X.0x9C
    };
    public final C1807880x98 LIZJ = new C1803520x26() { // from class: X.0x98
    };
    public final C1807930x9D LIZLLL = new C1803520x26() { // from class: X.0x9D
    };
    public final C1807910x9B LJ = new C1803520x26() { // from class: X.0x9B
    };
    public final C1807940x9E LJFF = new C1803520x26() { // from class: X.0x9E
    };

    @Override // X.InterfaceC1804390x3V
    public final Map<String, Long> LJIIIIZZ() {
        return C2097608Jq.LJI(new Pair("duration_query_currency", Long.valueOf(this.LIZIZ.LIZIZ)), new Pair("duration_fetch_diamond", Long.valueOf(this.LIZJ.LIZIZ)), new Pair("duration_query_product", Long.valueOf(this.LIZLLL.LIZIZ)), new Pair("duration_merge_data", Long.valueOf(this.LJ.LIZIZ)), new Pair("duration", Long.valueOf(this.LJFF.LIZIZ)));
    }

    @Override // X.InterfaceC1804390x3V
    public final void LIZ() {
        LIZ();
        this.LIZ = EnumC1807900x9A.LLILZLL;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LIZIZ() {
        LIZIZ();
        this.LIZ = EnumC1807900x9A.LLILZIL;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LIZJ() {
        LIZIZ();
        this.LIZ = EnumC1807900x9A.LLILLJJLI;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LIZLLL() {
        LIZ();
        this.LIZ = EnumC1807900x9A.LLILZ;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LJ() {
        LIZ();
        this.LIZ = EnumC1807900x9A.LLJI;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LJFF() {
        LIZIZ();
        this.LIZ = EnumC1807900x9A.LLILLL;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LJI() {
        LIZ();
        this.LIZ = EnumC1807900x9A.LLIZLLLIL;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LJII() {
        LIZ();
        this.LIZ = EnumC1807900x9A.LLJIJIL;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LJIIIZ() {
        LIZIZ();
        this.LIZ = EnumC1807900x9A.LLIZ;
    }

    @Override // X.InterfaceC1804390x3V
    public final void LJIIJ() {
        LIZIZ();
        this.LIZ = EnumC1807900x9A.LLJ;
    }

    @Override // X.InterfaceC1804390x3V
    public final String getCurrentState() {
        EnumC1807900x9A enumC1807900x9A = this.LIZ;
        if (enumC1807900x9A != null) {
            return enumC1807900x9A.LL;
        }
        return null;
    }
}
