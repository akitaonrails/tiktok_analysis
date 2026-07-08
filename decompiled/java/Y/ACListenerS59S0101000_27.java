package Y;

import X.C03JO;
import X.C0WZX;
import X.C13LP;
import X.C1806990x7h;
import X.C1840790y0D;
import X.C2204961BRm;
import X.DialogC1840040xz0;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class ACListenerS59S0101000_27 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS59S0101000_27 aCListenerS59S0101000_27, View view) {
        String string;
        int length;
        Editable editableLLLFZ;
        Editable editableLLLFZ2;
        LiveEditText liveEditText = ((DialogC1840040xz0) aCListenerS59S0101000_27.l0).LLJJIJIIJIL;
        if (liveEditText != null && (editableLLLFZ2 = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmr5oXHNxRWdoZQbaplU7nK5yWtaRePtjB97beeAawE2uAfk=", null))) != null) {
            string = editableLLLFZ2.toString();
        } else {
            string = null;
        }
        LiveEditText liveEditText2 = ((DialogC1840040xz0) aCListenerS59S0101000_27.l0).LLJJIJIIJIL;
        if (liveEditText2 != null) {
            length = liveEditText2.getSelectionStart();
        } else {
            length = String.valueOf((Object) null).length();
        }
        if (string != null) {
            if (Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT) && length != 0) {
                ((DialogC1840040xz0) aCListenerS59S0101000_27.l0).LJLIIIL(String.valueOf(aCListenerS59S0101000_27.i1));
                return;
            }
            LiveEditText liveEditText3 = ((DialogC1840040xz0) aCListenerS59S0101000_27.l0).LLJJIJIIJIL;
            if (liveEditText3 == null || (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmr5oXHNxRWdoZQbaplU7nK5yWtaRePtjB97beeAawE2uAfk=", null))) == null) {
                return;
            }
            editableLLLFZ.insert(length, String.valueOf(aCListenerS59S0101000_27.i1));
            return;
        }
        ((DialogC1840040xz0) aCListenerS59S0101000_27.l0).LJLIIIL(String.valueOf(aCListenerS59S0101000_27.i1));
    }

    public static final void onClick$1(ACListenerS59S0101000_27 aCListenerS59S0101000_27, View view) {
        Object objLJJJLZIJ;
        C03JO c03jo;
        boolean z;
        C1840790y0D c1840790y0D = (C1840790y0D) aCListenerS59S0101000_27.l0;
        int i = aCListenerS59S0101000_27.i1;
        int i2 = c1840790y0D.LLILLL;
        if (i == i2) {
            Function1<? super TakoStandardRatio, Unit> function1 = c1840790y0D.LLILZ;
            if (function1 != null) {
                function1.invoke(C13LP.LJJJLZIJ(i2, c1840790y0D.LLILLJJLI));
                return;
            }
            return;
        }
        c1840790y0D.LLILLL = i;
        LinearLayout linearLayout = c1840790y0D.LL;
        int childCount = linearLayout.getChildCount();
        int i3 = 0;
        while (true) {
            objLJJJLZIJ = null;
            if (i3 >= childCount) {
                break;
            }
            View childAt = linearLayout.getChildAt(i3);
            if ((childAt instanceof C03JO) && (c03jo = (C03JO) childAt) != null) {
                if (i3 == c1840790y0D.LLILLL) {
                    z = true;
                } else {
                    z = false;
                }
                c03jo.setItemSelected(z);
            }
            i3++;
        }
        int i4 = c1840790y0D.LLILLL;
        if (i4 != -1) {
            objLJJJLZIJ = C13LP.LJJJLZIJ(i4, c1840790y0D.LLILLJJLI);
        }
        Function1<? super TakoStandardRatio, Unit> function12 = c1840790y0D.LLILZ;
        if (function12 == null) {
            return;
        }
        function12.invoke(objLJJJLZIJ);
    }

    public static final void onClick$2(ACListenerS59S0101000_27 aCListenerS59S0101000_27, View view) {
        C1806990x7h c1806990x7h = (C1806990x7h) aCListenerS59S0101000_27.l0;
        c1806990x7h.LLILLJJLI.LJIIIIZZ(aCListenerS59S0101000_27.i1, c1806990x7h.LLILLL.LLLFFI);
    }

    public ACListenerS59S0101000_27(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
