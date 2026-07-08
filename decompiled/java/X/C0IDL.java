package X;

import Y.ARunnableS75S0200000_6;
import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;
import java.util.UUID;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IDL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDL implements TextView.OnEditorActionListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$t) {
            case 0:
                return onEditorAction$0(this, textView, i, keyEvent);
            case 1:
                return onEditorAction$1(this, textView, i, keyEvent);
            case 2:
                return onEditorAction$2(this, textView, i, keyEvent);
            default:
                return false;
        }
    }

    public C0IDL(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C0IDL c0idl, TextView textView, int i, KeyEvent keyEvent) {
        C1353500lKG c1353500lKG;
        if (C447500Hgi.LIZ(i, keyEvent)) {
            PollCreateFragment pollCreateFragment = (PollCreateFragment) c0idl.l0;
            if (!pollCreateFragment.LLJJ && (c1353500lKG = pollCreateFragment.LLILZIL) != null) {
                pollCreateFragment.LLJJ = true;
                HandlerHook.viewPost(c1353500lKG, new ARunnableS75S0200000_6(pollCreateFragment, c1353500lKG, 26));
            }
            return true;
        }
        return false;
    }

    public static final boolean onEditorAction$1(C0IDL c0idl, TextView textView, int i, KeyEvent keyEvent) {
        Editable editableLLJILLL;
        String string;
        String string2;
        String strLJZL;
        String str;
        String str2;
        String str3;
        if (i != 3) {
            return false;
        }
        if (((FavoriteVideoTabRootFragment) c0idl.l0).RR() != EnumC444370Hbf.LLILLJJLI && ((FavoriteVideoTabRootFragment) c0idl.l0).RR() != EnumC444370Hbf.LLILLL) {
            return false;
        }
        EditText editText = ((FavoriteVideoTabRootFragment) c0idl.l0).LLJJ;
        String str4 = null;
        if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOypdZDc1SYJh7FSwtQaJ5OuoLljF4g5HQ2LdpTNkqjr60Yj3qWMNNfUm2yxSpbMLdHABFv8", null))) != null && (string = editableLLJILLL.toString()) != null && (string2 = a0.LJLIIIL(string).toString()) != null && (strLJZL = C13LN.LJZL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, string2)) != null && strLJZL.length() != 0) {
            FavoriteSearchViewModel favoriteSearchViewModelUR = ((FavoriteVideoTabRootFragment) c0idl.l0).UR();
            if (favoriteSearchViewModelUR != null) {
                favoriteSearchViewModelUR.LLJILJILJ = string2;
                favoriteSearchViewModelUR.LLJILLL = strLJZL;
                favoriteSearchViewModelUR.LLJJ = "input";
                favoriteSearchViewModelUR.LLJJIII = false;
                favoriteSearchViewModelUR.LLJJI = UUID.randomUUID().toString();
                favoriteSearchViewModelUR.LLILZIL.postValue(strLJZL);
            }
            C0HYB c0hyb = C0HYB.LIZ;
            FavoriteSearchViewModel favoriteSearchViewModelUR2 = ((FavoriteVideoTabRootFragment) c0idl.l0).UR();
            if (favoriteSearchViewModelUR2 != null) {
                str = favoriteSearchViewModelUR2.LLJJI;
            } else {
                str = null;
            }
            FavoriteSearchViewModel favoriteSearchViewModelUR3 = ((FavoriteVideoTabRootFragment) c0idl.l0).UR();
            if (favoriteSearchViewModelUR3 != null) {
                str2 = favoriteSearchViewModelUR3.LLJILJILJ;
            } else {
                str2 = null;
            }
            FavoriteSearchViewModel favoriteSearchViewModelUR4 = ((FavoriteVideoTabRootFragment) c0idl.l0).UR();
            if (favoriteSearchViewModelUR4 != null) {
                str3 = favoriteSearchViewModelUR4.LLJJ;
            } else {
                str3 = null;
            }
            FavoriteSearchViewModel favoriteSearchViewModelUR5 = ((FavoriteVideoTabRootFragment) c0idl.l0).UR();
            if (favoriteSearchViewModelUR5 != null) {
                str4 = favoriteSearchViewModelUR5.LLIZLLLIL;
            }
            c0hyb.getClass();
            C0HYB.LIZIZ(str, str2, str3, str4);
            C0HCS.LIZ.getClass();
            C0HCS.LIZIZ(strLJZL);
        }
        return true;
    }

    public static final boolean onEditorAction$2(C0IDL c0idl, TextView textView, int i, KeyEvent keyEvent) {
        Editable editableLLLLJI;
        CharSequence charSequenceLJLIIIL;
        if (i != 3 || (editableLLLLJI = C2204961BRm.LLLLJI(((C1749260vca) c0idl.l0).getEditTextView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkOQreVfk2Gu2s+zLZrr3Aqj0yhcf5cM765mBw8piV1ypPDdL07diRVnwfoc+8FzvkHsQ==", null))) == null || (charSequenceLJLIIIL = a0.LJLIIIL(editableLLLLJI)) == null || charSequenceLJLIIIL.length() != 0) {
            return false;
        }
        return true;
    }
}
