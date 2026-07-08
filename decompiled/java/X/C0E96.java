package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.ugc.android.editor.base.bottombar.ShowPanelFragmentEvent;
import com.ss.ugc.android.editor.bottom.panel.EditorContextFragment;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E96, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0E96 implements C0EHG {
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final int LLILLL;
    public final C362580EJk LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    @Override // X.C0EHG
    public void LIZLLL() {
    }

    @Override // X.C0EHG
    public C0E97 LJFF() {
        return null;
    }

    @Override // X.C0EHG
    public boolean LJII(C361980EHc c361980EHc) {
        return false;
    }

    @Override // X.C0EHG
    public final void LJIIIIZZ() {
        Fragment fragmentLJIIIIZZ = C369630EeP.LIZ.LJIIIIZZ();
        if (fragmentLJIIIIZZ == null || !fragmentLJIIIIZZ.isAdded()) {
            return;
        }
        C0E97 c0e97LJFF = LJFF();
        if (c0e97LJFF != null) {
            c0e97LJFF.LIZJ();
        }
        this.LLILZ.getClass();
        C362580EJk.LIZ(fragmentLJIIIIZZ);
    }

    public final Activity LJIIIZ() {
        return (Activity) this.LLIZ.getValue();
    }

    public final C0E48 LJIIJ() {
        return (C0E48) this.LLILZIL.getValue();
    }

    public final C19EG LJIIJJI() {
        return (C19EG) this.LLILZLL.getValue();
    }

    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final void LJIIL(EditorContextFragment editorContextFragment) {
        C0E97 c0e97LJFF = LJFF();
        if (c0e97LJFF != null) {
            c0e97LJFF.LIZLLL(editorContextFragment);
        }
        this.LLILZ.LIZJ(editorContextFragment);
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        ShowPanelFragmentEvent showPanelFragmentEvent = (ShowPanelFragmentEvent) C364210EPr.LIZIZ(ShowPanelFragmentEvent.class);
        showPanelFragmentEvent.LL.setValue(editorContextFragment.getClass().getCanonicalName());
    }

    public C0E96(C19A3 c19a3, C1DRG c1drg, int i) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
        C362580EJk c362580EJk = new C362580EJk(Integer.valueOf(i));
        this.LLILZ = c362580EJk;
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1142));
        c362580EJk.LIZIZ = C12WG.LJ(c19a3);
        this.LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1143));
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1141));
    }
}
