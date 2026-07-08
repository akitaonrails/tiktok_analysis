package X;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.effect.input.EffectTextInputFragment;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0UsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785880UsE implements TextView.OnEditorActionListener {
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

    public C785880UsE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public C785880UsE(Context context, AbstractC748830TYz abstractC748830TYz, int i) {
        this.$t = i;
        this.l0 = abstractC748830TYz;
    }

    public static final boolean onEditorAction$0(C785880UsE c785880UsE, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                String string = textView.getText().toString();
                if (a0.LJJJIL(string)) {
                    C766270U4b.LIZLLL(2131842767);
                    return false;
                }
                ((AbstractC748830TYz) c785880UsE.l0).LLILZ.LIZ(new BlockWord(-1, a0.LJLIIIL(string).toString(), 0, ""), false);
                textView.setText("");
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LIZLLL(2131843092);
        return false;
    }

    public static final boolean onEditorAction$1(C785880UsE c785880UsE, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            ((C767880UAg) c785880UsE.l0).LJFF(null);
            KeyBoardUtil.LIZJ(C497740JfY.LJII(), ((C767880UAg) c785880UsE.l0).LLILZLL);
            ((C767880UAg) c785880UsE.l0).LJI();
            return true;
        }
        return false;
    }

    public static final boolean onEditorAction$2(C785880UsE c785880UsE, TextView textView, int i, KeyEvent keyEvent) {
        ((EffectTextInputFragment) c785880UsE.l0).dismiss();
        return true;
    }
}
