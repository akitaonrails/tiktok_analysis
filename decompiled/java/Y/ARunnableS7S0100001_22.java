package Y;

import X.C1398350mUb;
import X.C1419160n2A;
import X.C1425090nBj;
import X.C1425160nBq;
import X.C1425240nBy;
import X.C1429740nJE;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C337180DJs;
import X.C786410Ut5;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS7S0100001_22 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1425160nBq c1425160nBq;
        TextureView textureView = ((C1425090nBj) this.l0).LLJJJJLIIL;
        if (textureView == null || textureView.getParent() == null) {
            return;
        }
        C1425090nBj c1425090nBj = (C1425090nBj) this.l0;
        if (c1425090nBj.LLJJJJLIIL != null) {
            float f = this.f1;
            CutsameDataItem cutsameDataItem = c1425090nBj.LLJJIJIL;
            if (cutsameDataItem == null || (c1425160nBq = c1425090nBj.LLJJJJ) == null) {
                return;
            }
            c1425090nBj.LLJJL = false;
            C337180DJs.LIZ(c1425090nBj.LLJ);
            if (cutsameDataItem.LIZLLL()) {
                c1425090nBj.LJIIL(c1425090nBj.LLJJIJIL);
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TemplateFeedItemView playVideo: progress = ");
                sbLIZ.append(f);
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.LJZ(0, c1425090nBj.LLIZLLLIL);
                TextureView textureView2 = c1425090nBj.LLJJJJLIIL;
                if (textureView2 != null) {
                    HandlerHook.viewPost(textureView2, new ARunnableS91S0200000_22(cutsameDataItem, textureView2, 0));
                }
                c1425090nBj.LLJLIL = f;
                c1425160nBq.setForceNewPlay(true);
                if (c1425090nBj.LLILLJJLI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    c1425160nBq.tryResume(C1419160n2A.LIZ(cutsameDataItem), C1425240nBy.LIZ(c1425090nBj, 1));
                    c1425090nBj.LLJLILLLLZIIL = false;
                    c1425090nBj.LLJLL = System.currentTimeMillis();
                }
            }
        }
    }

    public static final void run$0(ARunnableS7S0100001_22 aRunnableS7S0100001_22) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateFeedItemView@2028.playVideo$1");
        try {
            aRunnableS7S0100001_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateFeedItemView@2028.playVideo$1");
    }

    public static final void run$1(ARunnableS7S0100001_22 aRunnableS7S0100001_22) {
        boolean zLIZ;
        C1C7U.LIZ("TemplatePreviewPlayerManager@f760.adjustVideoSizeFallback$1");
        try {
            if (((TextureView) aRunnableS7S0100001_22.l0).getParent() != null) {
                C1429740nJE.LIZ(aRunnableS7S0100001_22.f1, (TextureView) aRunnableS7S0100001_22.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplatePreviewPlayerManager@f760.adjustVideoSizeFallback$1");
    }

    public static final void run$2(ARunnableS7S0100001_22 aRunnableS7S0100001_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$2$onProgress$1");
        try {
            NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aRunnableS7S0100001_22.l0;
            if (nLEResourceCallback != null) {
                nLEResourceCallback.onProgress(aRunnableS7S0100001_22.f1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$2$onProgress$1");
    }

    public static final void run$3(ARunnableS7S0100001_22 aRunnableS7S0100001_22) {
        INLEListenerCompile iNLEListenerCompile = (INLEListenerCompile) aRunnableS7S0100001_22.l0;
        float f = aRunnableS7S0100001_22.f1;
        C1C7U.LIZ("NLEExporterImplPublic$innerSetInfoListener$1@3196.onInfoCallback$2L");
        iNLEListenerCompile.onCompileProgress(f);
        C1C7U.LIZIZ("NLEExporterImplPublic$innerSetInfoListener$1@3196.onInfoCallback$2L");
    }

    public ARunnableS7S0100001_22(float f, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
