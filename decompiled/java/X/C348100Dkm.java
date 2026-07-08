package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C348100Dkm {
    public static final /* synthetic */ int LJIIL = 0;
    public final NLEEditor LIZ;
    public final INLEMediaSession LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1085));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1083));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1088));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1082));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1081));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1087));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1086));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(303));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1084));
    public final C348110Dkn LJIIJJI;

    public final synchronized void LIZ() {
        this.LJIIJJI.LIZ();
    }

    public final synchronized void LIZIZ() {
        this.LJIIJJI.LIZIZ();
    }

    public final C0FWA LIZJ() {
        return (C0FWA) this.LJI.getValue();
    }

    public final C0EYJ LIZLLL() {
        return (C0EYJ) this.LJFF.getValue();
    }

    public final InterfaceC348530DlT LJ() {
        return (InterfaceC348530DlT) this.LIZLLL.getValue();
    }

    public final InterfaceC391070FUz LJFF() {
        return (InterfaceC391070FUz) this.LIZJ.getValue();
    }

    public final InterfaceC348910Dm5 LJII() {
        return (InterfaceC348910Dm5) this.LJIIIIZZ.getValue();
    }

    public final InterfaceC347510Djp LJIIIIZZ() {
        return (InterfaceC347510Djp) this.LJII.getValue();
    }

    public final C0FW6 LJIIIZ() {
        return (C0FW6) this.LJ.getValue();
    }

    public void LJIIL() {
        LJFF().LJJIJLIJ(this.LIZ);
        LJ().LJJIJLIJ(this.LIZ);
        LJIIIZ().LJJIJLIJ(this.LIZ);
        LIZLLL().LJJIJLIJ(this.LIZ);
        LIZJ().LJJIJLIJ(this.LIZ);
    }

    public final INLEMediaSession LJI() {
        return this.LIZIZ;
    }

    public final NLETrack LJIIJ(Function1<? super NLETrack, Boolean> function1) {
        NLETrack next;
        Iterator<NLETrack> it2 = this.LIZ.getModel().getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (function1.invoke(next).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public C348100Dkm(NLEEditor nLEEditor, INLEMediaSession iNLEMediaSession) {
        this.LIZ = nLEEditor;
        this.LIZIZ = iNLEMediaSession;
        this.LJIIJJI = new C348110Dkn(nLEEditor, iNLEMediaSession);
    }

    public final void LJIIJJI(AbstractC348060Dki abstractC348060Dki, boolean z) {
        C348110Dkn c348110Dkn = this.LJIIJJI;
        InterfaceC347430Djh interfaceC347430Djh = (InterfaceC347430Djh) this.LJIIJ.getValue();
        synchronized (c348110Dkn) {
            if (!c348110Dkn.LIZLLL) {
                abstractC348060Dki.LJ((InterfaceC347430Djh) this.LJIIJ.getValue());
                System.currentTimeMillis();
                abstractC348060Dki.LIZIZ(this.LIZIZ);
                System.currentTimeMillis();
                abstractC348060Dki.LIZJ(this.LIZ);
                System.currentTimeMillis();
                if (z) {
                    this.LIZ.commit();
                    System.currentTimeMillis();
                    abstractC348060Dki.LIZ(this.LIZIZ);
                    return;
                }
                return;
            }
            abstractC348060Dki.LJ(interfaceC347430Djh);
            System.currentTimeMillis();
            abstractC348060Dki.LIZIZ(c348110Dkn.LIZIZ);
            System.currentTimeMillis();
            abstractC348060Dki.LIZJ(c348110Dkn.LIZ);
            System.currentTimeMillis();
            c348110Dkn.LIZJ.add(abstractC348060Dki);
        }
    }
}
