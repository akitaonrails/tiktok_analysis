package X;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import wh6.AbS705S0100000_26;

/* JADX INFO: renamed from: X.0vUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744460vUq<T> extends LinearLayout implements InterfaceC1744500vUu {
    public static final /* synthetic */ int LLILZLL = 0;
    public C0I7D LL;
    public TuxIconView LLILLJJLI;
    public final List<InterfaceC1744450vUp> LLILLL;
    public final SearchHelper<T> LLILZ;
    public int LLILZIL;

    public final TuxIconView getClearIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dzz);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C0I7D getSearchEditFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u5_);
            this.LL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    @Override // X.InterfaceC1744500vUu
    public final void LIZ() throws Throwable {
        String string;
        C0I7D searchEditFromXml = getSearchEditFromXml();
        if (searchEditFromXml == null || !searchEditFromXml.hasFocus()) {
            this.LLILZ.LIZIZ();
            return;
        }
        Editable editableLLLLJI = C2204961BRm.LLLLJI(getSearchEditFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqjSD+NfcDs7G6skoCS8=", null));
        if (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null) {
            string = "";
        }
        if (!LIZJ(string)) {
            this.LLILZ.LIZIZ();
            return;
        }
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1744450vUp) it2.next()).A2(string);
        }
    }

    public C1744460vUq(Context context) {
        PopupWindow popupWindow;
        super(context, null, 0);
        this.LLILLL = new ArrayList();
        final SearchHelper<T> searchHelper = new SearchHelper<>(context, this, this);
        this.LLILZ = searchHelper;
        this.LLILZIL = 4;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.axy, this, true);
        C0I7D searchEditFromXml = getSearchEditFromXml();
        if (searchEditFromXml != null) {
            searchEditFromXml.addTextChangedListener(new C927503jt(this) { // from class: X.0vUr
                public final /* synthetic */ C1744460vUq<Object> LL;

                {
                    this.LL = this;
                }

                @Override // X.C927503jt, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    String string;
                    C1744460vUq<Object> c1744460vUq = this.LL;
                    if (charSequence != null) {
                        string = charSequence.toString();
                    } else {
                        string = null;
                    }
                    if (c1744460vUq.LIZJ(string)) {
                        SearchHelper<Object> searchHelper2 = this.LL.LLILZ;
                        searchHelper2.LJIIL.removeMessages(1);
                        searchHelper2.LJIIL.sendEmptyMessageDelayed(1, 10L);
                    } else {
                        this.LL.LLILZ.LIZIZ();
                    }
                    TuxIconView clearIconFromXml = this.LL.getClearIconFromXml();
                    int i4 = 0;
                    if (charSequence == null || charSequence.length() == 0) {
                        i4 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i4, clearIconFromXml);
                }
            });
        }
        C0I7D searchEditFromXml2 = getSearchEditFromXml();
        if (searchEditFromXml2 != null) {
            searchEditFromXml2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775860wJU(this, 5));
        }
        TuxIconView clearIconFromXml = getClearIconFromXml();
        if (clearIconFromXml != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 2), clearIconFromXml);
        }
        RecyclerView recyclerView = (RecyclerView) searchHelper.LJFF.findViewById(R.id.tdu);
        searchHelper.LJI = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C1058220de0(C960203pA.LIZ(R.attr.ng, context), 0, C12ES.LIZJ(16.0f, context), 2));
        }
        RecyclerView recyclerView2 = searchHelper.LJI;
        if (recyclerView2 != null) {
            recyclerView2.setVerticalScrollBarEnabled(false);
        }
        PopupWindow popupWindow2 = new PopupWindow(searchHelper.LJFF, -2, -2, false);
        searchHelper.LJII = popupWindow2;
        popupWindow2.setInputMethodMode(1);
        PopupWindow popupWindow3 = searchHelper.LJII;
        if (popupWindow3 != null) {
            popupWindow3.setSoftInputMode(16);
        }
        SearchResultAdapter searchResultAdapter = new SearchResultAdapter(true);
        searchHelper.LJIIIIZZ = searchResultAdapter;
        RecyclerView recyclerView3 = searchHelper.LJI;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(searchResultAdapter);
        }
        RecyclerView recyclerView4 = searchHelper.LJI;
        if (recyclerView4 != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(1);
            recyclerView4.setLayoutManager(linearLayoutManager);
        }
        searchHelper.LJFF.setBackgroundResource(R.drawable.b3r);
        Boolean bool = searchHelper.LIZLLL;
        if (bool != null && bool.booleanValue() && (popupWindow = searchHelper.LJII) != null) {
            popupWindow.setOutsideTouchable(true);
        }
        View viewFindViewById = searchHelper.LJFF.findViewById(R.id.ue1);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS705S0100000_26(searchHelper, 0, 42), viewFindViewById);
        }
        SearchResultAdapter searchResultAdapter2 = searchHelper.LJIIIIZZ;
        if (searchResultAdapter2 != null) {
            searchResultAdapter2.LLILLL = searchHelper;
        }
        PopupWindow popupWindow4 = searchHelper.LJII;
        if (popupWindow4 != null) {
            popupWindow4.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0vUs
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    InterfaceC1744490vUt<Object> interfaceC1744490vUt;
                    WeakReference<InterfaceC1744490vUt<Object>> weakReference = searchHelper.LJIIIZ;
                    if (weakReference == null || (interfaceC1744490vUt = weakReference.get()) == null) {
                        return;
                    }
                    List<C1744320vUc<Object>> list = searchHelper.LJIIJ;
                    interfaceC1744490vUt.W2(list != null ? list.size() : 0);
                }
            });
        }
    }

    public final void LIZIZ(InterfaceC1744450vUp interfaceC1744450vUp) {
        if (!((ArrayList) this.LLILLL).contains(interfaceC1744450vUp)) {
            ((ArrayList) this.LLILLL).add(interfaceC1744450vUp);
        }
    }

    public final boolean LIZJ(String str) {
        if (str == null || a0.LJJJIL(str) || str.length() < this.LLILZIL) {
            return false;
        }
        return true;
    }

    public final void setClearIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setHint(String str) {
        getSearchEditFromXml().setHint(str);
    }

    public final void setSearchEditFromXml(C0I7D c0i7d) {
        this.LL = c0i7d;
    }

    public final void setSearchLenLimit(int i) {
        this.LLILZIL = i;
    }

    public final void LIZLLL(boolean z, List<C1744320vUc<T>> list, InterfaceC1744490vUt<T> interfaceC1744490vUt, boolean z2, boolean z3) throws Throwable {
        String string;
        PopupWindow popupWindow;
        Editable editableLLLLJI = C2204961BRm.LLLLJI(getSearchEditFromXml(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsD7eYi4WNqjSD+NfcDs7G6skoCS8=", null));
        if (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null) {
            string = "";
        }
        if (LIZJ(string)) {
            SearchHelper<T> searchHelper = this.LLILZ;
            searchHelper.LJIIJJI = z;
            searchHelper.LJIIIZ = new WeakReference<>(interfaceC1744490vUt);
            searchHelper.LJIIJ = list;
            searchHelper.LIZLLL = Boolean.valueOf(z2);
            searchHelper.LJ = z3;
            if (z2 && (popupWindow = searchHelper.LJII) != null) {
                popupWindow.setOutsideTouchable(true);
            }
            searchHelper.LJIIL.removeMessages(2);
            searchHelper.LJIIL.removeMessages(3);
            searchHelper.LJIIL.sendEmptyMessage(3);
        }
    }
}
