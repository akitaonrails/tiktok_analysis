package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0I2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460030I2f implements InterfaceC449820HkS {
    public final C1353510lKH LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1247));

    @Override // X.InterfaceC449820HkS
    public final /* synthetic */ void E0() {
    }

    @Override // X.InterfaceC449820HkS
    public final void LIZ(View view, C451030HmP c451030HmP) {
    }

    @Override // X.InterfaceC449820HkS
    public final /* synthetic */ void LJIILIIL(Aweme aweme) {
    }

    @Override // X.InterfaceC449820HkS
    public final void Id() {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (this.LIZIZ.getValue() == null) {
            this.LIZ.dispatchKeyEvent(keyEvent);
            return;
        }
        InputConnection inputConnection = (InputConnection) this.LIZIZ.getValue();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(keyEvent);
        }
    }

    public C460030I2f(C1353510lKH c1353510lKH) {
        this.LIZ = c1353510lKH;
    }

    @Override // X.InterfaceC449820HkS
    public final void Jd(int i, int i2, String str) throws Throwable {
        int length;
        if (str == null) {
            return;
        }
        Editable editableN = C2204961BRm.N(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmc4rakhZrOXGHcgZUy3eHfm8uoBRQtusaLA==", null));
        if (editableN != null) {
            length = editableN.length();
        } else {
            length = 0;
        }
        if (length + str.length() > ((Number) C303690BvL.LIZ.getValue()).intValue()) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
            c1389890mGx.LJIIIZ(2131838743);
            c1389890mGx.LJIIJJI();
            return;
        }
        int selectionStart = this.LIZ.getSelectionStart();
        int selectionEnd = this.LIZ.getSelectionEnd();
        int iMax = Math.max(0, selectionStart);
        int iMax2 = Math.max(0, selectionEnd);
        if (iMax == iMax2) {
            Editable editableN2 = C2204961BRm.N(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmc4rakhZrOXGHcgZUy3eHfm8uoBRQtusaLA==", null));
            if (editableN2 != null) {
                editableN2.insert(iMax, str);
            }
        } else {
            try {
                Editable editableN3 = C2204961BRm.N(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmc4rakhZrOXGHcgZUy3eHfm8uoBRQtusaLA==", null));
                if (editableN3 != null) {
                    editableN3.replace(iMax, iMax2, str);
                }
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int length2 = iMax + str.length();
        if (length2 >= this.LIZ.length()) {
            C1353510lKH c1353510lKH = this.LIZ;
            c1353510lKH.setSelection(c1353510lKH.length());
        } else {
            this.LIZ.setSelection(length2);
        }
    }

    @Override // X.InterfaceC449820HkS
    public final void Kd(CommentPersonalizedEmoji commentPersonalizedEmoji, int i, int i2) throws Throwable {
        String str;
        if (commentPersonalizedEmoji != null) {
            str = commentPersonalizedEmoji.emoji;
        } else {
            str = null;
        }
        Jd(i, i2, str);
    }
}
