package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11r8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19630011r8 implements InterfaceC19614111oZ {
    public final Context LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final ViewModelStoreOwner LIZJ;
    public final Scene LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 661));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 662));

    @Override // X.InterfaceC19614111oZ
    public final List<InputFilter> LIZ() {
        return C1697810uHb.LJIIJJI(new InputFilter() { // from class: X.11r7
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
        }, new InputFilter() { // from class: X.11r9
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

    @Override // X.InterfaceC19614111oZ
    public final C117Y LIZJ() {
        return (C117Y) this.LJ.getValue();
    }

    @Override // X.InterfaceC19614111oZ
    public final C117Y LIZLLL() {
        return (C117Y) this.LJFF.getValue();
    }

    @Override // X.InterfaceC19614111oZ
    public final boolean LIZIZ() {
        return C300240Bpm.LIZ();
    }

    public C19630011r8(Context context, VideoPublishEditModel videoPublishEditModel, ViewModelStoreOwner viewModelStoreOwner, Scene scene) {
        this.LIZ = context;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = viewModelStoreOwner;
        this.LIZLLL = scene;
    }
}
