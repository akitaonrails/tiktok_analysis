package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987080bnG implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C987080bnG c987080bnG, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C987080bnG c987080bnG, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C987080bnG c987080bnG, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C987080bnG c987080bnG, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C987080bnG c987080bnG, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C987080bnG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C987080bnG c987080bnG, Editable editable) {
        String str;
        float f;
        C971360bNu c971360bNu;
        C971360bNu c971360bNu2;
        String strValueOf = String.valueOf(editable);
        int length = strValueOf.length();
        MultiGuestNoticeboardEditorSetting multiGuestNoticeboardEditorSetting = MultiGuestNoticeboardEditorSetting.INSTANCE;
        if (length >= multiGuestNoticeboardEditorSetting.getTextInputMaxCount()) {
            C953230auf.LIZ.getClass();
            if (!C953230auf.LJIIJJI()) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853948, Integer.valueOf(multiGuestNoticeboardEditorSetting.getTextInputMaxCount())));
            }
        }
        C971330bNr c971330bNr = ((DialogC971210bNf) c987080bnG.l0).LLL;
        if (c971330bNr != null && (c971360bNu2 = c971330bNr.LIZJ) != null) {
            str = c971360bNu2.LIZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, strValueOf)) {
            C971330bNr c971330bNr2 = ((DialogC971210bNf) c987080bnG.l0).LLL;
            if (c971330bNr2 != null && (c971360bNu = c971330bNr2.LIZJ) != null) {
                c971360bNu.LIZ = strValueOf;
            }
            ((DialogC971210bNf) c987080bnG.l0).LJLJJLL(EnumC971100bNU.TEXT);
            View view = ((DialogC971210bNf) c987080bnG.l0).LLJLILLLLZIIL;
            if (view != null) {
                view.setClickable(!a0.LJJJIL(strValueOf));
                if (a0.LJJJIL(strValueOf)) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                C786410Ut5.T4(view, f);
            }
        }
    }

    public static final void afterTextChanged$1(C987080bnG c987080bnG, Editable editable) {
        boolean z;
        if (Intrinsics.LJFF(editable.toString(), " ")) {
            LiveEditText liveEditText = ((MultiCoHostSearchFragment) c987080bnG.l0).LLILZLL;
            if (liveEditText != null) {
                liveEditText.setText("");
                return;
            }
            return;
        }
        String string = editable.toString();
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AnonymousClass0956 anonymousClass0956 = ((MultiCoHostSearchFragment) c987080bnG.l0).LLJJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            MultiCoHostSearchFragment multiCoHostSearchFragment = (MultiCoHostSearchFragment) c987080bnG.l0;
            C1DFH c1dfh = C0PEM.LIZ;
            multiCoHostSearchFragment.LLJJI = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C963380bB2((MultiCoHostSearchFragment) c987080bnG.l0, string, null), 3);
            return;
        }
        C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "search job cancel by 'search word is null'");
        AnonymousClass0956 anonymousClass09562 = ((MultiCoHostSearchFragment) c987080bnG.l0).LLJJI;
        if (anonymousClass09562 == null) {
            return;
        }
        anonymousClass09562.LIZIZ(null);
    }

    public static final void afterTextChanged$2(C987080bnG c987080bnG, Editable editable) {
        String str;
        float f;
        C971360bNu c971360bNu;
        C971360bNu c971360bNu2;
        String strValueOf = String.valueOf(editable);
        int length = strValueOf.length();
        MultiGuestNoticeboardEditorSetting multiGuestNoticeboardEditorSetting = MultiGuestNoticeboardEditorSetting.INSTANCE;
        if (length >= multiGuestNoticeboardEditorSetting.getTextInputMaxCount()) {
            C953230auf.LIZ.getClass();
            if (!C953230auf.LJIIJJI()) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853948, Integer.valueOf(multiGuestNoticeboardEditorSetting.getTextInputMaxCount())));
            }
        }
        C971330bNr c971330bNr = ((DialogC971200bNe) c987080bnG.l0).LLLIIII;
        if (c971330bNr != null && (c971360bNu2 = c971330bNr.LIZJ) != null) {
            str = c971360bNu2.LIZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, strValueOf)) {
            C971330bNr c971330bNr2 = ((DialogC971200bNe) c987080bnG.l0).LLLIIII;
            if (c971330bNr2 != null && (c971360bNu = c971330bNr2.LIZJ) != null) {
                c971360bNu.LIZ = strValueOf;
            }
            ((DialogC971200bNe) c987080bnG.l0).LJLJLJ(EnumC971100bNU.TEXT);
            View view = ((DialogC971200bNe) c987080bnG.l0).LLJLLL;
            if (view != null) {
                view.setClickable(!a0.LJJJIL(strValueOf));
                if (a0.LJJJIL(strValueOf)) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                C786410Ut5.T4(view, f);
            }
        }
    }

    public static final void onTextChanged$1(C987080bnG c987080bnG, CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        List<String> listLIZIZ;
        C972220bPI c972220bPI;
        if (Intrinsics.LJFF(charSequence.toString(), " ")) {
            LiveEditText liveEditText = ((MultiCoHostSearchFragment) c987080bnG.l0).LLILZLL;
            if (liveEditText != null) {
                liveEditText.setText("");
                return;
            }
            return;
        }
        if (charSequence.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "auto search to show preLoadView");
            LiveIconView liveIconView = ((MultiCoHostSearchFragment) c987080bnG.l0).LLJ;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 0);
            }
            MultiCoHostSearchFragment multiCoHostSearchFragment = (MultiCoHostSearchFragment) c987080bnG.l0;
            multiCoHostSearchFragment.nS(multiCoHostSearchFragment.LLJILJIL, AFwS203S0000000_15.get$arr$(364));
            return;
        }
        C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "auto search to show historyView");
        LiveIconView liveIconView2 = ((MultiCoHostSearchFragment) c987080bnG.l0).LLJ;
        if (liveIconView2 != null) {
            C786410Ut5.LLJJIJIL(liveIconView2, 8);
        }
        MultiCoHostSearchFragment multiCoHostSearchFragment2 = (MultiCoHostSearchFragment) c987080bnG.l0;
        multiCoHostSearchFragment2.nS(multiCoHostSearchFragment2.LLJJJJLIIL, AFwS203S0000000_15.get$arr$(365));
        C20337914i1<List<String>> c20337914i1 = InterfaceC960800b6s.LLLLJI;
        if (c20337914i1.LIZIZ() == null || ((listLIZIZ = c20337914i1.LIZIZ()) != null && listLIZIZ.size() == 0)) {
            ((MultiCoHostSearchFragment) c987080bnG.l0).oS(false);
            return;
        }
        ((MultiCoHostSearchFragment) c987080bnG.l0).oS(true);
        C972230bPJ c972230bPJ = ((MultiCoHostSearchFragment) c987080bnG.l0).LLJJLIIIJLLLLLLLZ;
        if (c972230bPJ == null || (c972220bPI = c972230bPJ.LIZLLL) == null) {
            return;
        }
        c972220bPI.N5();
    }
}
