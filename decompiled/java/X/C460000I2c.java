package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;

/* JADX INFO: renamed from: X.0I2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460000I2c implements InterfaceC449820HkS {
    public int LIZ;
    public final EditText LIZIZ;
    public final InputConnection LIZJ;
    public final InterfaceC460010I2d LIZLLL;
    public final CommentContextSource LJ;
    public Aweme LJFF;

    @Override // X.InterfaceC449820HkS
    public final void E0() {
        this.LIZLLL.E0();
    }

    @Override // X.InterfaceC449820HkS
    public final void Id() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        InputConnection inputConnection = this.LIZJ;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent);
        } else {
            this.LIZIZ.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // X.InterfaceC449820HkS
    public final void LJIILIIL(Aweme aweme) {
        this.LJFF = aweme;
    }

    @Override // X.InterfaceC449820HkS
    public final void LIZ(View view, C451030HmP c451030HmP) {
        this.LIZLLL.Qu(c451030HmP.LIZJ);
    }

    @Override // X.InterfaceC449820HkS
    public final void Jd(int i, int i2, String str) {
        if (i == 2) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            Aweme aweme = this.LJFF;
            CommentContextSource commentContextSource = this.LJ;
            c1350920lG6.getClass();
            C1350920lG6.LLIIII(str, "exposed_emoji", 1, 0, "", aweme, commentContextSource);
        } else if (i == 1) {
            C1350920lG6 c1350920lG62 = C1350920lG6.LIZ;
            Aweme aweme2 = this.LJFF;
            CommentContextSource commentContextSource2 = this.LJ;
            c1350920lG62.getClass();
            C1350920lG6.LLIIII(str, "emoji_board", 1, 0, "", aweme2, commentContextSource2);
        }
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C0I2X.LIZ.getClass();
            C0I2X.LIZ(str);
        }
        if (this.LIZLLL.RF()) {
            return;
        }
        if (C2204961BRm.LLJILLL(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLtFnUx8iu2xqwNJwnMkDPm/Vn", null)).length() + str.length() > this.LIZ) {
            String string = C460020I2e.LIZ.getResources().getString(2131828516);
            C1233040iBy c1233040iBy = new C1233040iBy(C460020I2e.LIZ);
            c1233040iBy.LIZJ(string);
            c1233040iBy.LIZLLL();
            return;
        }
        if (i == 2) {
            this.LIZLLL.onEmojiClick(str, i, i2);
        }
        int selectionStart = this.LIZIZ.getSelectionStart();
        int selectionEnd = this.LIZIZ.getSelectionEnd();
        int iMax = Math.max(0, selectionStart);
        int iMax2 = Math.max(0, selectionEnd);
        if (iMax == iMax2) {
            C2204961BRm.LLJILLL(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLtFnUx8iu2xqwNJwnMkDPm/Vn", null)).insert(iMax, str);
        } else {
            try {
                C2204961BRm.LLJILLL(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLtFnUx8iu2xqwNJwnMkDPm/Vn", null)).replace(iMax, iMax2, str);
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int length = iMax + str.length();
        if (length >= this.LIZIZ.length()) {
            EditText editText = this.LIZIZ;
            editText.setSelection(editText.length());
        } else {
            this.LIZIZ.setSelection(length);
        }
    }

    @Override // X.InterfaceC449820HkS
    public final void Kd(CommentPersonalizedEmoji commentPersonalizedEmoji, int i, int i2) {
        String strLIZIZ = commentPersonalizedEmoji.emoji;
        if (strLIZIZ == null) {
            return;
        }
        if (i == 4) {
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(strLIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            String str = commentPersonalizedEmoji.source;
            Integer num = commentPersonalizedEmoji.score;
            String str2 = commentPersonalizedEmoji.strategy;
            Aweme aweme = this.LJFF;
            CommentContextSource commentContextSource = this.LJ;
            c1350920lG6.getClass();
            C1350920lG6.LLIIII(strLIZIZ2, str, 3, num, str2, aweme, commentContextSource);
        } else {
            C1350920lG6 c1350920lG62 = C1350920lG6.LIZ;
            String str3 = commentPersonalizedEmoji.source;
            Integer num2 = commentPersonalizedEmoji.score;
            String str4 = commentPersonalizedEmoji.strategy;
            Aweme aweme2 = this.LJFF;
            CommentContextSource commentContextSource2 = this.LJ;
            c1350920lG62.getClass();
            C1350920lG6.LLIIII(strLIZIZ, str3, 1, num2, str4, aweme2, commentContextSource2);
        }
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C0I2X.LIZ.getClass();
            C0I2X.LIZ(strLIZIZ);
        }
        if (this.LIZLLL.RF()) {
            return;
        }
        if (i == 4) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (C2204961BRm.LLJILLL(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLtFnUx8iu2xqwNJwnMkDPm/Vn", null)).length() + strLIZIZ.length() > this.LIZ) {
            String string = C460020I2e.LIZ.getResources().getString(2131828516);
            C1389890mGx c1389890mGx = new C1389890mGx(this.LIZIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            return;
        }
        if (i == 2 || i == 4) {
            this.LIZLLL.onEmojiClick(strLIZIZ, i, i2);
        }
        SpannableString spannableStringLIZ = C462450IBn.LIZ(commentPersonalizedEmoji);
        if (i == 4) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) spannableStringLIZ).append((CharSequence) spannableStringLIZ).append((CharSequence) spannableStringLIZ);
            spannableStringLIZ = new SpannableString(spannableStringBuilder);
        }
        int selectionStart = this.LIZIZ.getSelectionStart();
        int selectionEnd = this.LIZIZ.getSelectionEnd();
        int iMax = Math.max(0, selectionStart);
        int iMax2 = Math.max(0, selectionEnd);
        if (iMax == iMax2) {
            C2204961BRm.LLJILLL(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLtFnUx8iu2xqwNJwnMkDPm/Vn", null)).insert(iMax, spannableStringLIZ);
        } else {
            try {
                C2204961BRm.LLJILLL(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLtFnUx8iu2xqwNJwnMkDPm/Vn", null)).replace(iMax, iMax2, spannableStringLIZ);
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int length = iMax + strLIZIZ.length();
        if (length >= this.LIZIZ.length()) {
            EditText editText = this.LIZIZ;
            editText.setSelection(editText.length());
        } else {
            this.LIZIZ.setSelection(length);
        }
    }

    public C460000I2c(EditText editText, int i, InterfaceC460010I2d interfaceC460010I2d, CommentContextSource commentContextSource) {
        this.LIZIZ = editText;
        this.LIZJ = editText.onCreateInputConnection(new EditorInfo());
        this.LIZ = i;
        this.LIZLLL = interfaceC460010I2d;
        this.LJ = commentContextSource;
    }
}
