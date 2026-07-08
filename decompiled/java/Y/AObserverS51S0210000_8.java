package Y;

import X.C0PEM;
import X.C1452730nuJ;
import X.C1DFH;
import X.C1DRG;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C348100Dkm;
import X.C352130DrH;
import X.C559200LwU;
import X.C559240LwY;
import X.C563360M7q;
import X.C572850MdP;
import X.InterfaceC1452170ntP;
import X.InterfaceC20236714Gf;
import X.InterfaceC366660EZc;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.texttoimage.choose.TextToImageChooseScene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes9.dex */
public class AObserverS51S0210000_8 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void LIZ$0(C559200LwU c559200LwU, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf) {
        NLEModel model;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        if (c559200LwU.LLJLLL.LJIIJJI == null) {
            return;
        }
        InterfaceC1452170ntP value = c559200LwU.JY0().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            model = nLEEditor.getModel();
        } else {
            model = null;
        }
        c559200LwU.LLJL = model;
        c559200LwU.M5();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C559240LwY(c559200LwU, interfaceC20236714Gf, null), 3);
    }

    public static final void onChanged$0(AObserverS51S0210000_8 aObserverS51S0210000_8, Object obj) {
        MutableLiveData<C1452730nuJ> mutableLiveDataVW1;
        MutableLiveData<C1452730nuJ> mutableLiveDataVW12;
        Boolean bool = (Boolean) obj;
        if (aObserverS51S0210000_8.z2) {
            Scene sceneFindSceneByTag = ((TextToImageChooseScene) aObserverS51S0210000_8.l0).findSceneByTag("TextToImageErrorRetryScene");
            if (bool.booleanValue()) {
                if (sceneFindSceneByTag == null) {
                    ((TextToImageChooseScene) aObserverS51S0210000_8.l0).add(R.id.i5p, new C563360M7q((C1DRG) aObserverS51S0210000_8.l1), "TextToImageErrorRetryScene");
                } else {
                    ((TextToImageChooseScene) aObserverS51S0210000_8.l0).show(sceneFindSceneByTag);
                }
                C572850MdP c572850MdP = ((TextToImageChooseScene) aObserverS51S0210000_8.l0).LLJLL;
                if (c572850MdP != null && (mutableLiveDataVW12 = c572850MdP.vW1()) != null) {
                    mutableLiveDataVW12.setValue(C1452730nuJ.LIZJ());
                    return;
                }
                return;
            }
            if (sceneFindSceneByTag == null) {
                return;
            }
            ((TextToImageChooseScene) aObserverS51S0210000_8.l0).hide(sceneFindSceneByTag);
            C572850MdP c572850MdP2 = ((TextToImageChooseScene) aObserverS51S0210000_8.l0).LLJLL;
            if (c572850MdP2 == null || (mutableLiveDataVW1 = c572850MdP2.vW1()) == null) {
                return;
            }
            mutableLiveDataVW1.setValue(C1452730nuJ.LIZ());
        }
    }

    public static final void onChanged$1(AObserverS51S0210000_8 aObserverS51S0210000_8, Object obj) {
        LiveData<Void> liveDataQS;
        if (((C559200LwU) aObserverS51S0210000_8.l0).v5() != null && !aObserverS51S0210000_8.z2) {
            InterfaceC366660EZc interfaceC366660EZcV5 = ((C559200LwU) aObserverS51S0210000_8.l0).v5();
            if (interfaceC366660EZcV5 != null && (liveDataQS = interfaceC366660EZcV5.QS()) != null) {
                C559200LwU c559200LwU = (C559200LwU) aObserverS51S0210000_8.l0;
                liveDataQS.observe(c559200LwU, new AObserverS173S0200000_8((InterfaceC20236714Gf) aObserverS51S0210000_8.l1, c559200LwU, 6));
                return;
            }
            return;
        }
        LIZ$0((C559200LwU) aObserverS51S0210000_8.l0, (InterfaceC20236714Gf) aObserverS51S0210000_8.l1);
    }

    public AObserverS51S0210000_8(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
