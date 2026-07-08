package X;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kX2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322980kX2 extends AbstractC21333318eB<ViewOnLayoutChangeListenerC1322990kX3> {
    public Object LLZZJLIL;
    public Object LLZZLLIL;
    public Object LLZZZIL;

    @Override // X.AbstractC21333318eB
    public final boolean LJIILL() {
        return false;
    }

    public C1322980kX2(C21325918cz c21325918cz) {
        super(c21325918cz);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJJLIIL(View view) {
        ViewOnLayoutChangeListenerC1322990kX3 viewOnLayoutChangeListenerC1322990kX3 = (ViewOnLayoutChangeListenerC1322990kX3) view;
        viewOnLayoutChangeListenerC1322990kX3.setImageMode("scaleToFill");
        viewOnLayoutChangeListenerC1322990kX3.LLJJIII = this.LL.LIZ.LIZLLL();
        viewOnLayoutChangeListenerC1322990kX3.setPerfManager(this.LL.LJIIJ);
    }

    @Override // X.AbstractC21333318eB
    public final View LJJJLZIJ(Context context) {
        return new ViewOnLayoutChangeListenerC1322990kX3(context, null, 0);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2;
        String str;
        Iterator<Map.Entry<String, ? extends Object>> it2 = map.entrySet().iterator();
        boolean z = false;
        while (true) {
            map2 = null;
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ? extends Object> next = it2.next();
            Object value = next.getValue();
            String key = next.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != -2116416774) {
                if (iHashCode != 114148) {
                    if (iHashCode == 3357091 && key.equals("mode") && (!Intrinsics.LJFF(this.LLZZLLIL, value))) {
                        this.LLZZLLIL = value;
                        ViewOnLayoutChangeListenerC1322990kX3 view = getView();
                        if (value instanceof String) {
                            str2 = (String) value;
                        }
                        view.setImageMode(str2);
                    }
                } else if (key.equals("src") && (!Intrinsics.LJFF(this.LLZZJLIL, value))) {
                    this.LLZZJLIL = value;
                    z = true;
                }
            } else if (key.equals("track_params") && (!Intrinsics.LJFF(this.LLZZZIL, value))) {
                this.LLZZZIL = value;
            }
        }
        if (z) {
            ViewOnLayoutChangeListenerC1322990kX3 view2 = getView();
            Object obj = this.LLZZJLIL;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            Object obj2 = this.LLZZZIL;
            if (obj2 instanceof Map) {
                map2 = (Map) obj2;
            }
            view2.LLIZLLLIL = str;
            view2.LLJ = map2;
            view2.LLJILJILJ = true;
            view2.LJIIJ(str, map2);
        }
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJJI(Map<String, ? extends Object> map) {
        Iterator<Map.Entry<String, ? extends Object>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue();
        }
        C1337880kv4 c1337880kv4 = this.LLJILJIL;
        C1337880kv4 c1337880kv42 = this.LLJILJILJ;
        getView().setCssWidth(c1337880kv4);
        getView().setCssHeight(c1337880kv42);
        ViewOnLayoutChangeListenerC1322990kX3 view = getView();
        this.LLILZLL.getAspectRatio();
        view.getClass();
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJLJLI(C21325918cz c21325918cz) {
        this.LL = c21325918cz;
    }

    @Override // X.AbstractC21333318eB
    public final void LJL(List<?> list, boolean z) {
        super.LJL(list, true);
    }
}
