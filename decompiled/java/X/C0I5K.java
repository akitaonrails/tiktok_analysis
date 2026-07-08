package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0I5K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0I5K implements InterfaceC460950I5t {
    public final UrlModel LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final InterfaceC1320380kSq LIZLLL;
    public final Function1<C1331670kl3, C1331670kl3> LJ;
    public final boolean LJFF;
    public final String LJI;
    public final InterfaceC460300I3g LJII;
    public final C0I5E LJIIIIZZ;
    public final EnumC460470I3x LJIIIZ;
    public final InterfaceC460900I5o LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;
    public final Integer LJIILL;

    public C0I5K() {
        throw null;
    }

    @Override // X.InterfaceC460950I5t
    public final Integer LJIIJJI() {
        return Integer.valueOf(this.LJIILIIL);
    }

    public String LIZ() {
        return this.LJI;
    }

    public InterfaceC1320380kSq LIZIZ() {
        return this.LIZLLL;
    }

    public InterfaceC460300I3g LIZJ() {
        return this.LJII;
    }

    public UrlModel LIZLLL() {
        return this.LIZ;
    }

    public boolean LJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC460950I5t
    public final Integer LJIIL() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC460950I5t
    public boolean LJIILIIL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC460950I5t
    public final EnumC460470I3x LJIILJJIL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC460950I5t
    public final InterfaceC460900I5o LJIILL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC460950I5t
    public final C0I5E LJIILLIIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC460950I5t
    public final int getHeight() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC460950I5t
    public final int getWidth() {
        return this.LJIIL;
    }

    public C0I5K(UrlModel urlModel, Integer num, Integer num2, InterfaceC1320380kSq interfaceC1320380kSq, Function1 function1, boolean z, String str, InterfaceC460300I3g interfaceC460300I3g, C0I5E c0i5e, EnumC460470I3x enumC460470I3x, C460450I3v c460450I3v, int i, int i2, int i3, Integer num3, int i4) {
        num2 = (i4 & 4) != 0 ? null : num2;
        function1 = (i4 & 16) != 0 ? null : function1;
        z = (i4 & 32) != 0 ? false : z;
        str = (i4 & 64) != 0 ? null : str;
        c0i5e = (i4 & 256) != 0 ? C0I5E.NONE : c0i5e;
        enumC460470I3x = (i4 & 512) != 0 ? EnumC460470I3x.ROUNDED_CORNERS : enumC460470I3x;
        Integer num4 = (i4 & 32768) == 0 ? num3 : null;
        this.LIZ = urlModel;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = interfaceC1320380kSq;
        this.LJ = function1;
        this.LJFF = z;
        this.LJI = str;
        this.LJII = interfaceC460300I3g;
        this.LJIIIIZZ = c0i5e;
        this.LJIIIZ = enumC460470I3x;
        this.LJIIJ = c460450I3v;
        this.LJIIJJI = i;
        this.LJIIL = i2;
        this.LJIILIIL = i3;
        this.LJIILJJIL = false;
        this.LJIILL = num4;
    }
}
