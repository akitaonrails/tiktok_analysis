package X;

import android.view.View;
import i9c.b;
import i9c.b.a;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.187a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC212320187a<VIEW extends View, DATA, STYLE, STYLE_HANDLER extends b.a<STYLE>> extends C185J<VIEW, DATA> {
    public STYLE_HANDLER LIZLLL;
    public final C01GW LJ;
    public STYLE LJFF;

    public abstract STYLE_HANDLER LJIIJ();

    public abstract STYLE_HANDLER LJIIJJI(STYLE style);

    public final STYLE_HANDLER LJIIL() {
        STYLE_HANDLER style_handler = this.LIZLLL;
        return style_handler == null ? (InterfaceC212321187b) this.LJ.getValue() : style_handler;
    }

    public AbstractC212320187a(VIEW view) {
        super(view);
        this.LJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 518));
    }

    public final void LJIILIIL(STYLE style) {
        this.LJFF = style;
        this.LIZLLL = LJIIJJI(style);
    }
}
