package X;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746710vYT<T> extends LinearLayout implements InterfaceC1747590vZt {
    public static final /* synthetic */ int LLIZ = 0;
    public TuxIconView LL;
    public C0I7D LLILLJJLI;
    public TuxIconView LLILLL;
    public final List<InterfaceC1747130vZ9> LLILZ;
    public C1746700vYS<T> LLILZIL;
    public int LLILZLL;

    public final TuxIconView getClearIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pm3);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C0I7D getSearchEditFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pm4);
            this.LLILLJJLI = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final TuxIconView getSearchIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pm5);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    @Override // X.InterfaceC1747590vZt
    public final void LIZ() throws Throwable {
        String string;
        C0I7D searchEditFromXml = getSearchEditFromXml();
        if (searchEditFromXml == null || !searchEditFromXml.hasFocus()) {
            C1746700vYS<T> c1746700vYS = this.LLILZIL;
            if (c1746700vYS != null) {
                c1746700vYS.LIZJ();
                return;
            }
            return;
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI(getSearchEditFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqhSD+NfcDqLm/KtnAPUNgUI5K3KXERta", null));
        if (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null) {
            string = "";
        }
        if (LIZJ(string)) {
            Iterator it2 = ((ArrayList) this.LLILZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1747130vZ9) it2.next()).A2(string);
            }
        } else {
            C1746700vYS<T> c1746700vYS2 = this.LLILZIL;
            if (c1746700vYS2 != null) {
                c1746700vYS2.LIZJ();
            }
        }
    }

    public final void LIZIZ(boolean z) {
        getSearchEditFromXml().setText("");
        if (z) {
            getSearchEditFromXml().clearFocus();
        }
    }

    public final boolean LIZJ(String str) {
        if (str == null || a0.LJJJIL(str) || str.length() < this.LLILZLL) {
            return false;
        }
        return true;
    }

    public final void setClearIconFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setSearchEditFromXml(C0I7D c0i7d) {
        this.LLILLJJLI = c0i7d;
    }

    public final void setSearchIconFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setSearchLenLimit(int i) {
        this.LLILZLL = i;
    }

    public C1746710vYT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = new ArrayList();
        this.LLILZLL = 4;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.axz, this, true);
        C0I7D searchEditFromXml = getSearchEditFromXml();
        if (searchEditFromXml != null) {
            searchEditFromXml.addTextChangedListener(new C927503jt(this) { // from class: X.0vYU
                public final /* synthetic */ C1746710vYT<Object> LL;

                {
                    this.LL = this;
                }

                @Override // X.C927503jt, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    String string;
                    C1746710vYT<Object> c1746710vYT = this.LL;
                    if (charSequence != null) {
                        string = charSequence.toString();
                    } else {
                        string = null;
                    }
                    if (c1746710vYT.LIZJ(string)) {
                        C1746700vYS<Object> c1746700vYS = this.LL.LLILZIL;
                        if (c1746700vYS != null) {
                            c1746700vYS.LJIIJJI.removeMessages(1);
                            c1746700vYS.LJIIJJI.sendEmptyMessageDelayed(1, 10L);
                        }
                    } else {
                        C1746700vYS<Object> c1746700vYS2 = this.LL.LLILZIL;
                        if (c1746700vYS2 != null) {
                            c1746700vYS2.LIZJ();
                        }
                    }
                    TuxIconView clearIconFromXml = this.LL.getClearIconFromXml();
                    int i4 = 0;
                    if (charSequence == null || charSequence.length() == 0) {
                        i4 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i4, clearIconFromXml);
                    Iterator it2 = ((ArrayList) this.LL.LLILZ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1747130vZ9) it2.next()).LJLILLLLZI(charSequence);
                    }
                }
            });
        }
        C0I7D searchEditFromXml2 = getSearchEditFromXml();
        if (searchEditFromXml2 != null) {
            searchEditFromXml2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 6));
        }
        TuxIconView clearIconFromXml = getClearIconFromXml();
        if (clearIconFromXml != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 3), clearIconFromXml);
        }
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(13.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(13.5d)))), 16);
        setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }
}
