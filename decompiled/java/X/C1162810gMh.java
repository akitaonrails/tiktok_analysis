package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.0gMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162810gMh {
    public final Function0<ViewGroup> LIZ;
    public final Map<View, Integer> LIZIZ = new LinkedHashMap();
    public final Map<View, C1159900gI0> LIZJ = new LinkedHashMap();
    public EnumC1159920gI2 LIZLLL = EnumC1159920gI2.LL;
    public boolean LJ;
    public boolean LJFF;

    public final ViewGroup LIZ() {
        ViewGroup viewGroupInvoke = this.LIZ.invoke();
        if (viewGroupInvoke == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) viewGroupInvoke.findViewById(R.id.video_add_extra_buttons_container);
        return viewGroup == null ? (ViewGroup) viewGroupInvoke.findViewById(R.id.m86) : viewGroup;
    }

    public final void LIZIZ() {
        EnumC1159920gI2 enumC1159920gI2 = this.LJ ? EnumC1159920gI2.LLILLJJLI : this.LJFF ? EnumC1159920gI2.LLILLL : EnumC1159920gI2.LL;
        EnumC1159920gI2 enumC1159920gI22 = this.LIZLLL;
        if (enumC1159920gI2 == enumC1159920gI22) {
            return;
        }
        int iOrdinal = enumC1159920gI22.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                    C786410Ut5.LJLLLLLL(((Number) entry.getValue()).intValue(), (View) entry.getKey());
                }
                ((LinkedHashMap) this.LIZIZ).clear();
            } else {
                if (iOrdinal != 2) {
                    throw new C1954807lC();
                }
                for (Map.Entry entry2 : ((LinkedHashMap) this.LIZJ).entrySet()) {
                    View view = (View) entry2.getKey();
                    C1159900gI0 c1159900gI0 = (C1159900gI0) entry2.getValue();
                    C786410Ut5.T4(view, c1159900gI0.LIZ);
                    view.setClickable(c1159900gI0.LIZIZ);
                }
                ((LinkedHashMap) this.LIZJ).clear();
            }
        }
        int iOrdinal2 = enumC1159920gI2.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                ViewGroup viewGroupLIZ = LIZ();
                if (viewGroupLIZ != null) {
                    ((LinkedHashMap) this.LIZIZ).clear();
                    Iterator<View> it2 = new C09RD(viewGroupLIZ).iterator();
                    while (true) {
                        C09RE c09re = (C09RE) it2;
                        if (!c09re.hasNext()) {
                            break;
                        }
                        View view2 = (View) c09re.next();
                        this.LIZIZ.put(view2, Integer.valueOf(view2.getVisibility()));
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                }
            } else {
                if (iOrdinal2 != 2) {
                    throw new C1954807lC();
                }
                ViewGroup viewGroupLIZ2 = LIZ();
                if (viewGroupLIZ2 != null) {
                    ((LinkedHashMap) this.LIZJ).clear();
                    Iterator<View> it3 = new C09RD(viewGroupLIZ2).iterator();
                    while (true) {
                        C09RE c09re2 = (C09RE) it3;
                        if (!c09re2.hasNext()) {
                            break;
                        }
                        View view3 = (View) c09re2.next();
                        this.LIZJ.put(view3, new C1159900gI0(view3.getAlpha(), view3.isClickable()));
                        C786410Ut5.T4(view3, 0.4f);
                        view3.setClickable(false);
                    }
                }
            }
        }
        this.LIZLLL = enumC1159920gI2;
    }

    public C1162810gMh(AwS576S0100000_32 awS576S0100000_32) {
        this.LIZ = awS576S0100000_32;
    }

    public final void LIZJ(boolean z) {
        this.LJFF = z;
        LIZIZ();
    }
}
