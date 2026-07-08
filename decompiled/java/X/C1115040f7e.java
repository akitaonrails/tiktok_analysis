package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0f7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115040f7e implements InterfaceC1114340f6W {
    public final /* synthetic */ SubEmojiInputDialogFragment LIZ;

    @Override // X.InterfaceC1114320f6U
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1114320f6U
    public final void LJ(AbstractC1115080f7i abstractC1115080f7i) {
    }

    @Override // X.InterfaceC1114320f6U
    public final void LIZ() {
        this.LIZ.MR();
    }

    @Override // X.InterfaceC1114330f6V
    public final void LIZIZ() {
        this.LIZ.LLJJLIIIJLLLLLLLZ.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public C1115040f7e(SubEmojiInputDialogFragment subEmojiInputDialogFragment) {
        this.LIZ = subEmojiInputDialogFragment;
    }

    @Override // X.InterfaceC1114330f6V
    public final void LIZLLL(C1115500f8O c1115500f8O) throws Throwable {
        String string;
        C20586215gy c20586215gy = this.LIZ.LLJJLIIIJLLLLLLLZ;
        if (c20586215gy == null) {
            return;
        }
        final Editable editableLLLFF = C2204961BRm.LLLFF(c20586215gy, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null));
        SubEmojiInputDialogFragment subEmojiInputDialogFragment = this.LIZ;
        if (editableLLLFF == null) {
            string = "";
        } else {
            string = editableLLLFF.toString();
        }
        subEmojiInputDialogFragment.LLJJIII = string;
        final EmoteModel emoteModel = (EmoteModel) c1115500f8O;
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        C1110390f09.LIZJ(emoteModel, EnumC1110450f0F.INPUT_PANNEL, this.LIZ, new Function1() { // from class: X.0f7d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iSR;
                String string2;
                C1115040f7e c1115040f7e = this.LL;
                Editable editable = editableLLLFF;
                EmoteModel emoteModel2 = emoteModel;
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                SubEmojiInputDialogFragment subEmojiInputDialogFragment2 = c1115040f7e.LIZ;
                int iLJI = subEmojiInputDialogFragment2.LLLFF.LJI(C2204961BRm.LLLF(subEmojiInputDialogFragment2.LLJJLIIIJLLLLLLLZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+D9GpUDqpxijmBP151Ekm/NvrUkPJB0NWtppm19W3MpfpLShHqBycIE6yoiW7Zg6JpA4YS0F", null)), null) + 4;
                if (subEmojiInputDialogFragment2.LLJIJIL) {
                    iSR = 15;
                } else {
                    iSR = subEmojiInputDialogFragment2.SR();
                }
                if (iLJI > iSR) {
                    if (subEmojiInputDialogFragment2.LLJIJIL) {
                        string2 = subEmojiInputDialogFragment2.getString(2131841268);
                    } else {
                        string2 = subEmojiInputDialogFragment2.getString(2131841268);
                    }
                    C766270U4b.LJIIJJI(string2);
                } else {
                    subEmojiInputDialogFragment2.LLLILZ = false;
                    int selectionStart = subEmojiInputDialogFragment2.LLJJLIIIJLLLLLLLZ.getSelectionStart();
                    subEmojiInputDialogFragment2.LLLILZJ = true;
                    editable.insert(selectionStart, spannableStringBuilder);
                    subEmojiInputDialogFragment2.LLLILZJ = false;
                    if (!subEmojiInputDialogFragment2.LLLIL) {
                        subEmojiInputDialogFragment2.LLLFF.LIZIZ(selectionStart, emoteModel2);
                        return null;
                    }
                }
                return null;
            }
        });
    }
}
