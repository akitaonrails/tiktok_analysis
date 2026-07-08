package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.1Di4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263141Di4 {
    public final NLEEditor LIZ;
    public final C2263181Di8 LIZIZ;
    public final Set<InterfaceC2263211DiB> LIZJ;

    public final void LIZ(boolean z) {
        INLEPlayer playerApi;
        Iterator<InterfaceC2263211DiB> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().df(z);
        }
        INLEMediaSession iNLEMediaSession = this.LIZIZ.LIZLLL;
        if (iNLEMediaSession != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.pause();
        }
    }

    public final void LIZIZ(boolean z) {
        INLEPlayer playerApi;
        Iterator<InterfaceC2263211DiB> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(z);
        }
        INLEMediaSession iNLEMediaSession = this.LIZIZ.LIZLLL;
        if (iNLEMediaSession != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.play();
        }
    }

    public C2263141Di4(NLEEditor nLEEditor, C2263181Di8 c2263181Di8) {
        INLEMediaSettings mediaSettingApi;
        INLEPlayer playerApi;
        this.LIZ = nLEEditor;
        this.LIZIZ = c2263181Di8;
        INLEMediaSession iNLEMediaSession = c2263181Di8.LIZLLL;
        if (iNLEMediaSession != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.setPlayerStatusListener(new INLEListenerPlayerStatus() { // from class: X.1Di5
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus
                public final void onDestroy() {
                    this.LIZ.LIZIZ.LIZJ = false;
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus
                public final void onPause() {
                    C2263141Di4 c2263141Di4 = this.LIZ;
                    c2263141Di4.LIZIZ.LIZJ = false;
                    Iterator<InterfaceC2263211DiB> it2 = c2263141Di4.LIZJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ();
                    }
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus
                public final void onPlay() {
                    C2263141Di4 c2263141Di4 = this.LIZ;
                    c2263141Di4.LIZIZ.LIZJ = true;
                    Iterator<InterfaceC2263211DiB> it2 = c2263141Di4.LIZJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerPlayerStatus
                public final void onStop() {
                    this.LIZ.LIZIZ.LIZJ = false;
                }
            });
        }
        INLEMediaSession iNLEMediaSession2 = c2263181Di8.LIZLLL;
        if (iNLEMediaSession2 != null && (mediaSettingApi = iNLEMediaSession2.getMediaSettingApi()) != null) {
            mediaSettingApi.setLoopPlay(true);
        }
        this.LIZJ = new LinkedHashSet();
    }
}
