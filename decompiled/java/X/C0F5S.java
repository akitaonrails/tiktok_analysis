package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;

/* JADX INFO: renamed from: X.0F5S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5S {
    public final /* synthetic */ InlineCaptionFragment LIZ;

    public final Context LIZ() {
        return this.LIZ.getContext();
    }

    public C0F5S(InlineCaptionFragment inlineCaptionFragment) {
        this.LIZ = inlineCaptionFragment;
    }

    public final void LIZIZ(int i, int i2) {
        C0F5E c0f5eUT = this.LIZ.uT();
        C0F5P c0f5p = c0f5eUT.LIZ.LJI;
        if (c0f5p.LJIIL) {
            int i3 = c0f5p.LJIILIIL;
            if (i2 > i3) {
                int i4 = i3 - i2;
                EditCaptionScene.HighLightLayoutManager highLightLayoutManager = c0f5eUT.LIZIZ.LJJIJIL;
                if (highLightLayoutManager != null) {
                    highLightLayoutManager.scrollToPositionWithOffset(i, i4);
                    return;
                }
                return;
            }
            EditCaptionScene.HighLightLayoutManager highLightLayoutManager2 = c0f5eUT.LIZIZ.LJJIJIL;
            if (highLightLayoutManager2 == null) {
                return;
            }
            highLightLayoutManager2.scrollToPositionWithOffset(i, 0);
        }
    }
}
