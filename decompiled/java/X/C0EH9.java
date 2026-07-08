package X;

import com.ss.ugc.android.editor.bottom.panel.EditorContextFragment;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EH9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0EH9 extends C0E96 {
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C0EHA LLJIJIL;

    public final InterfaceC359940E9g LJIILIIL() {
        return (InterfaceC359940E9g) this.LLJ.getValue();
    }

    @Override // X.C0E96, X.C0EHG
    public final C0E97 LJFF() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0EHA] */
    public C0EH9(C19A3 c19a3, C1DRG c1drg, int i) {
        super(c19a3, c1drg, i);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1539));
        this.LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1540));
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1541));
        this.LLJIJIL = new C0E97() { // from class: X.0EHA
            @Override // X.C0E97
            public final void LIZIZ() {
            }

            @Override // X.C0E97
            public final void LIZJ() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0E97
            public final void LIZLLL(EditorContextFragment editorContextFragment) {
                C0EHD c0ehd;
                if ((editorContextFragment instanceof C0EHD) && (c0ehd = (C0EHD) editorContextFragment) != null) {
                    C0EH9 c0eh9 = this.LIZ;
                    C0EU3 c0eu3 = C0EU3.LIZ;
                    String panelName = c0ehd.getPanelName();
                    C0E48 c0e48LJIIJ = c0eh9.LJIIJ();
                    c0eu3.getClass();
                    C0EU3.LIZIZ(c0e48LJIIJ, panelName);
                }
            }
        };
    }
}
