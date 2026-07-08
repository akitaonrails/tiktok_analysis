package X;

import android.text.Editable;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xd3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826430xd3 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C1836370xt5 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826430xd3(C1836370xt5 c1836370xt5, int i) {
        super(0);
        this.LL = c1836370xt5;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.LL.setFontSize(this.LLILLJJLI);
        final int selectionStart = this.LL.getSelectionStart();
        final C1836370xt5 c1836370xt5 = this.LL;
        return Boolean.valueOf(HandlerHook.viewPostDelay(c1836370xt5, new Runnable() { // from class: X.0xd2
            public final void LIZ() throws Throwable {
                Editable editableLLLIIIL;
                C1836370xt5 c1836370xt52 = c1836370xt5;
                c1836370xt52.LLJJL = true;
                c1836370xt52.setText(C2204961BRm.LLLIIIL(c1836370xt52, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf5uC7mnQVOggE5DBr2G/XLFdWy3WIL28DuUkAzlc2EtNNmOYWLzOhf+mr/ENHO9fsp", null)));
                if (c1836370xt5.isCursorVisible()) {
                    int i = selectionStart;
                    if (i >= 0 && (editableLLLIIIL = C2204961BRm.LLLIIIL(c1836370xt5, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf5uC7mnQVOggE5DBr2G/XLFdWy3WIL28DuUkAzlc2EtNNmOYWLzOhf+mr/ENHO9fsp", null))) != null && i < editableLLLIIIL.length()) {
                        c1836370xt5.setSelection(selectionStart);
                        return;
                    }
                    C1836370xt5 c1836370xt53 = c1836370xt5;
                    Editable editableLLLIIIL2 = C2204961BRm.LLLIIIL(c1836370xt53, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXETYFW6HJz8IX7dXItfrncbtCedtf5uC7mnQVOggE5DBr2G/XLFdWy3WIL28DuUkAzlc2EtNNmOYWLzOhf+mr/ENHO9fsp", null));
                    c1836370xt53.setSelection(editableLLLIIIL2 != null ? editableLLLIIIL2.length() : 0);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FullyCustomizedBoardFontEditPreviewText@42f4.autoSizeIfApplicable$onSizeChange$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FullyCustomizedBoardFontEditPreviewText@42f4.autoSizeIfApplicable$onSizeChange$1$1");
            }
        }, 5L));
    }
}
