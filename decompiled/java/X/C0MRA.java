package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.localmedia.RecallLocalMediaLearnMoreScene;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MRA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRA {
    public static final void LIZ(TuxTextView tuxTextView, final Scene scene, final VideoPublishEditModel videoPublishEditModel, final boolean z, final List<ForwardMedia> list) {
        int i;
        Context contextRequireSceneContext = scene.requireSceneContext();
        String string = contextRequireSceneContext.getString(2131838685);
        final int iIntValue = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(contextRequireSceneContext.getString(2131838684, string));
        if (C0MRC.LIZLLL(contextRequireSceneContext)) {
            C1305840k5O.LIZ.getClass();
            int i2 = C1697630uHJ.LIZ;
            if (i2 != 2) {
                if (i2 != 3) {
                    i = 72;
                } else {
                    i = 92;
                }
            } else {
                i = 82;
            }
        } else {
            C1305840k5O.LIZ.getClass();
            int i3 = C1697630uHJ.LIZ;
            if (i3 != 2) {
                if (i3 != 3) {
                    i = 42;
                } else {
                    i = 62;
                }
            } else {
                i = 52;
            }
        }
        C444920HcY c444920HcY = new C444920HcY(i, false);
        int iLJJJ = a0.LJJJ(spannableStringBuilder, string, 0, false, 6);
        if (iLJJJ < 0) {
            iLJJJ = 0;
        }
        int length = string.length() + iLJJJ;
        C786410Ut5.q2(spannableStringBuilder, c444920HcY, iLJJJ, length, 17);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, scene.requireSceneContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        C786410Ut5.q2(spannableStringBuilder, new AbstractC431340Gvk(iIntValue, z, videoPublishEditModel, list, scene) { // from class: X.0MRD
            public final /* synthetic */ boolean LL;
            public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
            public final /* synthetic */ List<ForwardMedia> LLILLL;
            public final /* synthetic */ Scene LLILZ;

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                String str;
                if (this.LL) {
                    str = "pop_up";
                } else {
                    str = "card";
                }
                C0ML7 c0ml7 = C0ML7.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = this.LLILLJJLI;
                c0ml7.getClass();
                C0ML7.LJIILJJIL(videoPublishEditModel2, str, "learn_more", C0ML7.LIZIZ, this.LLILLL);
                NavigationScene navigationSceneLIZIZ = C1447800nmM.LIZIZ(this.LLILZ);
                RecallLocalMediaLearnMoreScene recallLocalMediaLearnMoreScene = new RecallLocalMediaLearnMoreScene();
                boolean z2 = this.LL;
                VideoPublishEditModel videoPublishEditModel3 = this.LLILLJJLI;
                List<ForwardMedia> list2 = this.LLILLL;
                recallLocalMediaLearnMoreScene.LLJJIJIL = z2;
                recallLocalMediaLearnMoreScene.LLJJJ = videoPublishEditModel3;
                recallLocalMediaLearnMoreScene.LLJJJIL = list2;
                navigationSceneLIZIZ.LLLLLLLLLL(recallLocalMediaLearnMoreScene, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(iIntValue, iIntValue);
                this.LL = z;
                this.LLILLJJLI = videoPublishEditModel;
                this.LLILLL = list;
                this.LLILZ = scene;
            }
        }, iLJJJ, length, 17);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, length, 17);
        tuxTextView.setText(spannableStringBuilder);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
