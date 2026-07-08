package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19629111qz implements InterfaceC19628411qs {
    public final Context LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final boolean LIZJ;

    @Override // X.InterfaceC19628411qs
    public final void LIZJ() {
    }

    @Override // X.InterfaceC19628411qs
    public final List<InputFilter> LIZ() {
        return C1697810uHb.LJIIJJI(new InputFilter() { // from class: X.11r1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                CharSequence charSequenceLJLIIIL;
                if (charSequence != null) {
                    charSequenceLJLIIIL = a0.LJLIIIL(charSequence);
                } else {
                    charSequenceLJLIIIL = null;
                }
                if (!TextUtils.isEmpty(charSequenceLJLIIIL) && !String.valueOf(charSequenceLJLIIIL).contentEquals("\n")) {
                    return null;
                }
                return "";
            }
        }, new InputFilter() { // from class: X.11r0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (spanned != null && charSequence != null) {
                    int length = 50 - (spanned.length() - (i4 - i3));
                    int i5 = i2 - i;
                    if (length < i5) {
                        Context context = this.LL.LIZ;
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(2131830037);
                        creativeToastBuilder.isTuxToastLegacy(true);
                        C1390380mHk.LIZJ(context, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, creativeToastBuilder);
                    }
                    if (length <= 0) {
                        return "";
                    }
                    if (length < i5) {
                        int i6 = length + i;
                        if (Character.isHighSurrogate(charSequence.charAt(i6 - 1)) && i6 - 1 == i) {
                            return "";
                        }
                        return charSequence.subSequence(i, i6);
                    }
                }
                return null;
            }
        });
    }

    @Override // X.InterfaceC19628411qs
    public final boolean LIZIZ() {
        return C300240Bpm.LIZ();
    }

    public C19629111qz(Context context, VideoPublishEditModel videoPublishEditModel, boolean z) {
        this.LIZ = context;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = z;
    }

    @Override // X.InterfaceC19628411qs
    public final C19629011qy LIZLLL(C1466510oGX c1466510oGX, C1215150hj7 c1215150hj7, ViewGroup viewGroup) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ == null) {
            return null;
        }
        return new C19629011qy(c19egLIZIZ, viewGroup, this, c1466510oGX, c1215150hj7);
    }
}
