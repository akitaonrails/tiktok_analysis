package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636150sg9 extends FrameLayout implements InterfaceC1640430sn3<EnumC1641470soj> {
    public final Map<EnumC1641470soj, View> LL;
    public final Map<EnumC1641470soj, Function1<ViewGroup, View>> LLILLJJLI;
    public EnumC1641470soj LLILLL;

    public C1636150sg9() {
        throw null;
    }

    @Override // X.InterfaceC1640430sn3
    public EnumC1641470soj getState() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1640430sn3
    public void setState(EnumC1641470soj enumC1641470soj) {
        View view = (View) ((LinkedHashMap) this.LL).get(this.LLILLL);
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLILLL = enumC1641470soj;
        Function1 function1 = (Function1) ((LinkedHashMap) this.LLILLJJLI).get(enumC1641470soj);
        if (function1 != null) {
            if (!this.LL.containsKey(this.LLILLL)) {
                View view2 = (View) function1.invoke(this);
                C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-1, -1));
                addView(view2);
                this.LL.put(this.LLILLL, view2);
            }
            View view3 = (View) ((LinkedHashMap) this.LL).get(this.LLILLL);
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
        }
    }

    public C1636150sg9(Context context, Map map, EnumC1641470soj enumC1641470soj) {
        super(context, null);
        this.LL = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LLILLJJLI = linkedHashMap;
        linkedHashMap.putAll(map);
        this.LLILLL = enumC1641470soj;
    }
}
