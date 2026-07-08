package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0I2b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459990I2b {
    public static boolean LIZLLL;
    public final TuxIconView LIZ;
    public final C1353500lKG LIZIZ;
    public C0P0T LIZJ;

    static {
        new C452170HoF();
    }

    public final void LIZIZ(KeyEvent keyEvent) {
        InputConnection inputConnectionOnCreateInputConnection;
        C1353500lKG c1353500lKG = this.LIZIZ;
        if (c1353500lKG != null && (inputConnectionOnCreateInputConnection = c1353500lKG.onCreateInputConnection(new EditorInfo())) != null) {
            inputConnectionOnCreateInputConnection.sendKeyEvent(keyEvent);
            return;
        }
        C1353500lKG c1353500lKG2 = this.LIZIZ;
        if (c1353500lKG2 == null) {
            return;
        }
        c1353500lKG2.dispatchKeyEvent(keyEvent);
    }

    public final void LIZJ(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LIZ;
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 1.0f);
            }
            TuxIconView tuxIconView2 = this.LIZ;
            if (tuxIconView2 != null) {
                tuxIconView2.setEnabled(true);
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LIZ;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 0.34f);
        }
        TuxIconView tuxIconView4 = this.LIZ;
        if (tuxIconView4 == null) {
            return;
        }
        tuxIconView4.setEnabled(false);
    }

    public C459990I2b(TuxIconView tuxIconView, C1353500lKG c1353500lKG) {
        this.LIZ = tuxIconView;
        this.LIZIZ = c1353500lKG;
    }

    public final void LIZLLL(boolean z, boolean z2) {
        if (z) {
            TuxIconView tuxIconView = this.LIZ;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_keyboard_circle);
            }
        } else {
            TuxIconView tuxIconView2 = this.LIZ;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_sticker_round);
            }
        }
        if (z2) {
            TuxIconView tuxIconView3 = this.LIZ;
            if (tuxIconView3 != null) {
                tuxIconView3.setTintColorRes(R.attr.eg);
            }
        } else {
            TuxIconView tuxIconView4 = this.LIZ;
            if (tuxIconView4 != null) {
                tuxIconView4.setTintColorRes(R.attr.a1h);
            }
        }
        C452170HoF.LIZLLL(true);
    }

    public final void LIZ(String str, Aweme aweme, int i, CommentContextSource commentContextSource) {
        int i2 = 0;
        C1350920lG6.LIZ.getClass();
        C1350920lG6.LLIIII(str, "emoji_board", 1, 0, "", aweme, commentContextSource);
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C0I2X.LIZ.getClass();
            C0I2X.LIZ(str);
        }
        C1353500lKG c1353500lKG = this.LIZIZ;
        if (c1353500lKG != null) {
            Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMafNaTo5xaWym2CVlEaVeHomtXCixlAP1IxSp+d37u4IIFs=", null));
            if (editableLLLZZIL != null && editableLLLZZIL.length() + str.length() > i) {
                String string = C460020I2e.LIZ.getResources().getString(2131828516);
                C1233040iBy c1233040iBy = new C1233040iBy(C460020I2e.LIZ);
                c1233040iBy.LIZJ(string);
                c1233040iBy.LIZLLL();
                return;
            }
            int selectionStart = c1353500lKG.getSelectionStart();
            int selectionEnd = c1353500lKG.getSelectionEnd();
            if (selectionStart <= 0) {
                selectionStart = 0;
            }
            if (selectionEnd > 0) {
                i2 = selectionEnd;
            }
            if (selectionStart == i2) {
                Editable editableLLLZZIL2 = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMafNaTo5xaWym2CVlEaVeHomtXCixlAP1IxSp+d37u4IIFs=", null));
                if (editableLLLZZIL2 != null) {
                    editableLLLZZIL2.insert(selectionStart, str);
                }
            } else {
                try {
                    Editable editableLLLZZIL3 = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMafNaTo5xaWym2CVlEaVeHomtXCixlAP1IxSp+d37u4IIFs=", null));
                    if (editableLLLZZIL3 != null) {
                        editableLLLZZIL3.replace(selectionStart, i2, str);
                    }
                } catch (IndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            int length = selectionStart + str.length();
            int length2 = c1353500lKG.length();
            if (length > length2) {
                length = length2;
            }
            c1353500lKG.setSelection(length);
        }
    }
}
