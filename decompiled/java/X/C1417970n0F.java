package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.ss.android.ugc.aweme.autocut.s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS37S0600000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0n0F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1417970n0F extends NLEModelRequestProgressCallback {
    public final List<InterfaceC1418260n0i> LIZ;
    public final boolean LIZIZ;
    public AwS37S0600000_22 LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public NLEModel LJFF;
    public UnorderedMapStrStr LJI;

    public void LIZ(String str) {
    }

    public void LIZIZ(NLEModel nLEModel, Map<String, String> map) {
        throw null;
    }

    public void LIZJ(int i, int i2, String str) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1417970n0F(List<? extends InterfaceC1418260n0i> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("COMPREHENSION_NLE: onResponse hasComprehensionNLE=");
        NLETrack nLETrack = null;
        if (unorderedMapStrStr != null) {
            str = (String) unorderedMapStrStr.get("comprehension_nle");
        } else {
            str = null;
        }
        sbLIZ.append(C123100dR.LIZ(str));
        C2188811AlT.LIZIZ(sbLIZ);
        if (unorderedMapStrStr != null) {
            String str3 = (String) unorderedMapStrStr.get("aigt_response");
            if (str3 != null && str3.length() > 0) {
                LIZ(str3);
                AwS37S0600000_22 awS37S0600000_22 = this.LIZJ;
                if (awS37S0600000_22 != null) {
                    awS37S0600000_22.invoke(str3);
                    return;
                }
                return;
            }
            if (unorderedMapStrStr != null && (str2 = (String) unorderedMapStrStr.get("comprehension_nle")) != null && str2.length() > 0) {
                this.LIZLLL = true;
                s sVar = s.LIZ;
                final AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 836);
                sVar.getClass();
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                nLEEditorLIZ.restore(str2);
                NLEModel model = nLEEditorLIZ.getModel();
                Iterator<NLETrack> it2 = model.getTracks().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    NLETrack next = it2.next();
                    if (next.getTrackType() == NLETrackType.AUDIO) {
                        nLETrack = next;
                        break;
                    }
                }
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2 != null) {
                    model.removeTrack(nLETrack2);
                }
                s.LJJLIIIIJ(model, new NLEResourceDownloadCallback() { // from class: X.0DyF
                    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
                    public final void onNeedFetch(VecString vecString) {
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
                    public final void onProgress(float f) {
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
                    public final void onSuccess(NLEModel nLEModel2) {
                        awS601S0100000_22.invoke(Boolean.TRUE);
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
                    public final void onFailure(String str4, int i, String str5) {
                        awS601S0100000_22.invoke(Boolean.FALSE);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onSuccess(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        NLETrack mainTrack;
        Map<String, String> mapLJIIZILJ = null;
        if (this.LIZLLL) {
            if (this.LJ) {
                if (unorderedMapStrStr != null) {
                    mapLJIIZILJ = C2097608Jq.LJIIZILJ(unorderedMapStrStr);
                }
                LIZIZ(nLEModel, mapLJIIZILJ);
            } else {
                this.LJFF = nLEModel;
                this.LJI = unorderedMapStrStr;
            }
        } else {
            if (unorderedMapStrStr != null) {
                mapLJIIZILJ = C2097608Jq.LJIIZILJ(unorderedMapStrStr);
            }
            LIZIZ(nLEModel, mapLJIIZILJ);
        }
        if (this.LIZIZ && nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null) {
            mainTrack.setExtra("async_render", "async_render");
        }
    }
}
