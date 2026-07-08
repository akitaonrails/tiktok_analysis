package X;

import android.view.View;
import kotlin.jvm.internal.AwS576S0100000_32;
import n7c.b;
import n7c.b.a;

/* JADX INFO: renamed from: X.187Z, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C187Z<VIEW extends View, DATA, STYLE, STYLE_HANDLER extends b.a<STYLE>> extends AbstractC212220183e<VIEW, DATA> {
    public STYLE_HANDLER LJ;
    public final C01GW LJFF;
    public STYLE LJI;

    public abstract STYLE_HANDLER LJIIJJI();

    public final STYLE_HANDLER LJIIL() {
        STYLE_HANDLER style_handler = this.LJ;
        return style_handler == null ? (InterfaceC212322187c) this.LJFF.getValue() : style_handler;
    }

    public C187Z(VIEW view, String str) {
        super(view, str);
        this.LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 644));
    }
}
