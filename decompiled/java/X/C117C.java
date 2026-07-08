package X;

import Y.AfS163S0200000_29;
import android.app.Activity;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.117C, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117C implements C117F {
    public boolean LIZIZ;
    public boolean LIZJ;
    public WeakReference<C19EG> LJ;
    public final List<C117D> LIZ = new ArrayList();
    public final List<InterfaceC420801kM> LIZLLL = new ArrayList();

    public final void LIZIZ(int i) {
        for (C117D c117d : this.LIZ) {
            switch (i) {
                case 0:
                    c117d.onCreate();
                    break;
                case 1:
                    c117d.LIZLLL();
                    break;
                case 2:
                    c117d.LJFF();
                    break;
                case 3:
                    c117d.onResume();
                    break;
                case 4:
                    c117d.onPause();
                    break;
                case 5:
                    c117d.LJ();
                    break;
                case 6:
                    c117d.LIZIZ();
                    break;
                case 7:
                    c117d.onDestroy();
                    break;
                case 8:
                    c117d.LIZJ();
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    c117d.LIZ();
                    break;
            }
        }
    }

    public final void LIZJ(WeakReference<C19EG> weakReference) {
        this.LJ = weakReference;
        ((ArrayList) this.LIZLLL).add(C2214201BlK.LIZIZ.LJJLIIJ().LJJLJLI(new AfS163S0200000_29(this, (WeakReference) weakReference, 10)));
        ((ArrayList) this.LIZLLL).add(C2214201BlK.LIZJ.LJJLIIJ().LJJLJLI(new AfS163S0200000_29(this, (WeakReference) weakReference, 11)));
        ((ArrayList) this.LIZLLL).add(C2214201BlK.LIZIZ().LJJLJLI(new AfS163S0200000_29(this, (WeakReference) weakReference, 12)));
        ((ArrayList) this.LIZLLL).add(C2214201BlK.LJ.LJJLIIJ().LJJLJLI(new AfS163S0200000_29(this, (WeakReference) weakReference, 13)));
        ((ArrayList) this.LIZLLL).add(C2214201BlK.LIZJ().LJJLJLI(new AfS163S0200000_29(this, (WeakReference) weakReference, 14)));
        ((ArrayList) this.LIZLLL).add(C2214201BlK.LIZ().LJJLJLI(new AfS163S0200000_29(this, (WeakReference) weakReference, 8)));
        ((ArrayList) this.LIZLLL).add(C2214201BlK.LJIIJ.LJJLIIJ().LJJLJLI(new AfS163S0200000_29(this, (WeakReference) weakReference, 9)));
        ((List) C117G.LIZ.getValue()).add(this);
    }

    @Override // X.C117F
    public final void LIZ(Activity activity, boolean z) {
        C19EG c19eg;
        WeakReference<C19EG> weakReference = this.LJ;
        if (weakReference != null) {
            c19eg = weakReference.get();
        } else {
            c19eg = null;
        }
        if (activity == c19eg) {
            if (z) {
                LIZIZ(8);
            } else {
                LIZIZ(9);
            }
        }
    }
}
