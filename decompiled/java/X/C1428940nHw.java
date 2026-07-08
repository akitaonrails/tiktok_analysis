package X;

import Y.AObjectS396S0100000_22;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428940nHw implements NLEPrepareListener {
    public final WeakReference<NLETemplateSource> LIZ;
    public final AObjectS396S0100000_22 LIZIZ = new AObjectS396S0100000_22(this, 13);

    public C1428940nHw(WeakReference<NLETemplateSource> weakReference) {
        this.LIZ = weakReference;
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
        List<NLEPrepareListener> list;
        NLETemplateSource nLETemplateSource = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource != null && (list = nLETemplateSource.LJ) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((NLEPrepareListener) it2.next()).onPreSuccess(nLETemplateModel);
            }
        }
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onSuccess(NLETemplateModel nLETemplateModel) {
        List<NLEPrepareListener> list;
        NLETemplateSource nLETemplateSource = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource != null && (list = nLETemplateSource.LJ) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((NLEPrepareListener) it2.next()).onSuccess(nLETemplateModel);
            }
        }
        NLETemplateSource nLETemplateSource2 = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource2 != null) {
            nLETemplateSource2.LJII = 0;
        }
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onError(int i, String str) {
        List<NLEPrepareListener> list;
        NLETemplateSource nLETemplateSource = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource != null && (list = nLETemplateSource.LJ) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((NLEPrepareListener) it2.next()).onError(i, str);
            }
        }
        NLETemplateSource nLETemplateSource2 = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource2 != null) {
            nLETemplateSource2.LJII = i;
        }
    }

    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
    public final void onProgress(float f, String str) {
        List<NLEPrepareListener> list;
        NLETemplateSource nLETemplateSource = (NLETemplateSource) this.LIZIZ.invoke();
        if (nLETemplateSource != null && (list = nLETemplateSource.LJ) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((NLEPrepareListener) it2.next()).onProgress(f, str);
            }
        }
    }
}
