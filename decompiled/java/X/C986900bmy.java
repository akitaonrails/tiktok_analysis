package X;

import android.os.SystemClock;
import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C986900bmy implements TextView.OnEditorActionListener {
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

    public C986900bmy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C986900bmy c986900bmy, TextView textView, int i, KeyEvent keyEvent) {
        Boolean boolValueOf;
        C971360bNu c971360bNu;
        String str;
        if (i != 4 && i != 5 && i != 6) {
            return false;
        }
        C971330bNr c971330bNr = ((DialogC971210bNf) c986900bmy.l0).LLL;
        if (c971330bNr != null && (c971360bNu = c971330bNr.LIZJ) != null && (str = c971360bNu.LIZ) != null) {
            boolValueOf = Boolean.valueOf(a0.LJJJIL(str));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            ((DialogC971210bNf) c986900bmy.l0).LLLF.setValue(EnumC953070auP.NORMAL_SELECT);
            return true;
        }
        ((DialogC971210bNf) c986900bmy.l0).LLLF.setValue(EnumC953070auP.NORMAL);
        return true;
    }

    public static final boolean onEditorAction$1(C986900bmy c986900bmy, TextView textView, int i, KeyEvent keyEvent) throws Throwable {
        Editable editableLLLFZ;
        if (i != 3) {
            return false;
        }
        LiveEditText liveEditText = ((MultiCoHostSearchFragment) c986900bmy.l0).LLILZLL;
        if (liveEditText != null) {
            editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF8AJhVgcdTdZDViJS7KxlteluS4UTf+R2n5Kq6zvG9zOAmqXithS2+iqmR8x/COWp", null));
        } else {
            editableLLLFZ = null;
        }
        String string = a0.LJLILLLLZI(String.valueOf(editableLLLFZ)).toString();
        MultiCoHostSearchFragment multiCoHostSearchFragment = (MultiCoHostSearchFragment) c986900bmy.l0;
        if (string.length() > 0) {
            C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "click key board search");
            AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) multiCoHostSearchFragment.LLILLL;
            if (abstractC960710b6j != null) {
                abstractC960710b6j.LJIJJLI(string);
            }
            multiCoHostSearchFragment.iS();
            multiCoHostSearchFragment.nS(multiCoHostSearchFragment.LLJILJIL, AFwS203S0000000_15.get$arr$(366));
            multiCoHostSearchFragment.LLJJIJIL = 2;
            AnonymousClass0956 anonymousClass0956 = multiCoHostSearchFragment.LLJJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            AbstractC960710b6j abstractC960710b6j2 = (AbstractC960710b6j) multiCoHostSearchFragment.LLILLL;
            if (abstractC960710b6j2 != null) {
                abstractC960710b6j2.LJIJI(multiCoHostSearchFragment.LLJJIJIL, SystemClock.elapsedRealtime(), string);
            }
        }
        return true;
    }

    public static final boolean onEditorAction$2(C986900bmy c986900bmy, TextView textView, int i, KeyEvent keyEvent) {
        Boolean boolValueOf;
        C971360bNu c971360bNu;
        String str;
        if (i != 4 && i != 5 && i != 6) {
            return false;
        }
        C971330bNr c971330bNr = ((DialogC971200bNe) c986900bmy.l0).LLLIIII;
        if (c971330bNr != null && (c971360bNu = c971330bNr.LIZJ) != null && (str = c971360bNu.LIZ) != null) {
            boolValueOf = Boolean.valueOf(a0.LJJJIL(str));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            ((DialogC971200bNe) c986900bmy.l0).LLLIIIIL.setValue(EnumC953070auP.NORMAL_SELECT);
            return true;
        }
        ((DialogC971200bNe) c986900bmy.l0).LLLIIIIL.setValue(EnumC953070auP.NORMAL);
        return true;
    }
}
