package X;

import Y.ACListenerS51S0201000_26;
import Y.ACListenerS73S0300000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.pipo.ttpay.recharge.network.Amount;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0001000_6;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS91S1200000_6;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0uua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721980uua extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final List<C197039127h> LLJJ;
    public EditText LLJJI;
    public final List<TuxTextView> LLJJIII;
    public final Map<String, String> LLJJIJI;

    private final C197039127h getBtn0() {
        return (C197039127h) this.LL.getValue();
    }

    private final C197039127h getBtn1() {
        return (C197039127h) this.LLILLJJLI.getValue();
    }

    private final C197039127h getBtn2() {
        return (C197039127h) this.LLILLL.getValue();
    }

    private final C197039127h getBtn3() {
        return (C197039127h) this.LLILZ.getValue();
    }

    private final C197039127h getBtn4() {
        return (C197039127h) this.LLILZIL.getValue();
    }

    private final C197039127h getBtn5() {
        return (C197039127h) this.LLILZLL.getValue();
    }

    private final C197039127h getBtn6() {
        return (C197039127h) this.LLIZ.getValue();
    }

    private final C197039127h getBtn7() {
        return (C197039127h) this.LLIZLLLIL.getValue();
    }

    private final C197039127h getBtn8() {
        return (C197039127h) this.LLJ.getValue();
    }

    private final C197039127h getBtn9() {
        return (C197039127h) this.LLJI.getValue();
    }

    private final C197039127h getBtnContinue() {
        return (C197039127h) this.LLJILJILJ.getValue();
    }

    private final C197039127h getBtnDecimal() {
        return (C197039127h) this.LLJIJIL.getValue();
    }

    private final C197039127h getBtnDelete() {
        return (C197039127h) this.LLJILJIL.getValue();
    }

    private final GridLayout getRecommendContainer() {
        return (GridLayout) this.LLJILLL.getValue();
    }

    public final void e0() {
        Iterator<TuxTextView> it2 = this.LLJJIII.iterator();
        while (it2.hasNext()) {
            it2.next().setBackgroundResource(R.drawable.aqw);
        }
    }

    public final C197039127h getContinueButton() {
        return getBtnContinue();
    }

    public final void setRecommendAmount(List<Amount> list) {
        if (!list.isEmpty()) {
            GridLayout recommendContainer = getRecommendContainer();
            C786410Ut5.LJJJJJ(recommendContainer);
            recommendContainer.setOrientation(0);
            C337180DJs.LIZJ(recommendContainer);
            recommendContainer.setColumnCount(list.size());
            int i = 0;
            for (Amount amount : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Amount amount2 = amount;
                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                    layoutParams.width = 0;
                    layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                    layoutParams.rowSpec = GridLayout.spec(Integer.MIN_VALUE, -2.0f);
                    layoutParams.height = -2;
                    TuxTextView tuxTextView = new TuxTextView(recommendContainer.getContext(), null, 6, 0);
                    C786410Ut5.R6(tuxTextView, layoutParams);
                    tuxTextView.setTuxFont(52);
                    tuxTextView.setTextColorRes(R.attr.a1h);
                    tuxTextView.setText(amount2.showAmount);
                    C426750GoL.LJIIL(tuxTextView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
                    tuxTextView.setGravity(17);
                    tuxTextView.setBackgroundResource(R.drawable.aqw);
                    if (i % recommendContainer.getColumnCount() != 0) {
                        C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, null, null, false, 30);
                    }
                    C786410Ut5.h9(tuxTextView, new ACListenerS51S0201000_26(amount2, i, this, 0));
                    recommendContainer.addView(tuxTextView);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("button_");
                    sbLIZ.append(amount2.value);
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "show"), new Pair("option_id", C2188811AlT.LIZIZ(sbLIZ)), new Pair("option_type", "amount_selected"), new Pair("rank", String.valueOf(i2)));
                    mapLJIIJ.putAll(this.LLJJIJI);
                    C1716310ulR.LIZ.getClass();
                    C1716310ulR.LIZLLL("pipo_option_show", mapLJIIJ);
                    ((ArrayList) this.LLJJIII).add(tuxTextView);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public C1721980uua(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1461));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1462));
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1463));
        this.LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1464));
        this.LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1465));
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1466));
        this.LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1467));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1468));
        this.LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1469));
        this.LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1470));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1472));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1473));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1471));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1474));
        this.LLJJ = new ArrayList();
        this.LLJJIII = new ArrayList();
        this.LLJJIJI = new LinkedHashMap();
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d2v, this, true);
    }

    public final void h0(EditText editText, Map<String, String> map, String str, Integer num) {
        boolean z;
        boolean z2;
        int i;
        C19ME c19me;
        int i2;
        float f;
        int iLIZIZ;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = e3.d;
        }
        ((LinkedHashMap) this.LLJJIJI).clear();
        this.LLJJIJI.putAll(map);
        ((ArrayList) this.LLJJ).clear();
        this.LLJJI = editText;
        editText.setShowSoftInputOnFocus(false);
        ActionMode.Callback callback = new ActionMode.Callback() { // from class: X.0yR1
            @Override // android.view.ActionMode.Callback
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                if (menu != null) {
                    menu.clear();
                    return false;
                }
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                if (menu != null) {
                    menu.clear();
                    return false;
                }
                return false;
            }
        };
        editText.setTextIsSelectable(false);
        editText.setLongClickable(false);
        editText.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0uub
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return true;
            }
        });
        editText.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() { // from class: X.0uuc
            @Override // android.view.View.OnCreateContextMenuListener
            public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.clear();
            }
        });
        editText.setCustomSelectionActionModeCallback(callback);
        editText.setCustomInsertionActionModeCallback(callback);
        ((ArrayList) this.LLJJ).add(getBtn0());
        ((ArrayList) this.LLJJ).add(getBtn1());
        ((ArrayList) this.LLJJ).add(getBtn2());
        ((ArrayList) this.LLJJ).add(getBtn3());
        ((ArrayList) this.LLJJ).add(getBtn4());
        ((ArrayList) this.LLJJ).add(getBtn5());
        ((ArrayList) this.LLJJ).add(getBtn6());
        ((ArrayList) this.LLJJ).add(getBtn7());
        ((ArrayList) this.LLJJ).add(getBtn8());
        ((ArrayList) this.LLJJ).add(getBtn9());
        int i3 = 0;
        for (Object obj : (ArrayList) this.LLJJ) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C197039127h c197039127h = (C197039127h) obj;
                c197039127h.LJJJJL(new AwS21S0001000_6(i3, 0));
                C786410Ut5.U8(c197039127h, new ACListenerS73S0300000_6(this, editText, c197039127h, 1));
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (num != null && num.intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C197039127h btnDecimal = getBtnDecimal();
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLJ(btnDecimal, i);
        ViewGroup.LayoutParams layoutParams = getBtn0().getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            if (z2) {
                i2 = R.id.cpd;
            } else {
                i2 = R.id.cp4;
            }
            c19me.endToStart = i2;
            if (z2) {
                f = 2.0f;
            } else {
                f = 3.0f;
            }
            c19me.horizontalWeight = f;
            if (z2) {
                iLIZIZ = 0;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            c19me.setMarginEnd(iLIZIZ);
            C786410Ut5.J6(getBtn0(), c19me);
        }
        getBtnDecimal().LJJJJL(new AwS91S1200000_6(str, this, editText, 0));
        getBtnDelete().LJJJJL(new AwS235S0300000_26(this, (C1721980uua) editText, (EditText) map, (Map<String, String>) 3));
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "show"), new Pair("button_id", "backspace"));
        mapLJIIJ.putAll(map);
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_button_show", mapLJIIJ);
        getBtnContinue().LJJJJL(AFwS236S0000000_6.get$arr$(35));
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("event_type", "show"), new Pair("button_id", "continue"));
        mapLJIIJ2.putAll(map);
        C1716310ulR.LIZLLL("pipo_button_show", mapLJIIJ2);
    }
}
