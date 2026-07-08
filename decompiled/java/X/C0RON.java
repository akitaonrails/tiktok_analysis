package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS33S1101000_3;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RON, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0RON<DATA, CONTEXT> extends C0ROM<DATA, CONTEXT> {
    @Override // X.C0ROM
    public final boolean LIZ(DATA data, CONTEXT context) {
        return true;
    }

    @Override // X.C0ROM
    public final C694940RNs LIZJ(boolean z, List list, C694940RNs c694940RNs, AwS412S0200000_11 awS412S0200000_11) {
        Map<String, ViewGroup> map;
        ViewGroup viewGroup;
        C0ROM<DATA, CONTEXT> next;
        ViewGroup c0ros;
        int iIntValue;
        Integer num;
        if (c694940RNs != null && (map = c694940RNs.LIZJ) != null && (viewGroup = map.get(LJI())) != null) {
            C0ROR.LIZ(viewGroup, z, false);
            for (String str : (ArrayList) list) {
                if (c694940RNs.LIZJ.get(str) == null) {
                    Iterator<C0ROM<DATA, CONTEXT>> it2 = LJ().iterator();
                    do {
                        next = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.LJFF(next.LJI(), str));
                    C0ROM<DATA, CONTEXT> c0rom = next;
                    if (c0rom == null || (c0ros = c0rom.LIZIZ(viewGroup.getContext())) == null) {
                        c0ros = new C0ROS(viewGroup.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0ros);
                        c0ros.setLayoutParams(layoutParams);
                    }
                    C0ROR.LIZ(c0ros, false, false);
                    c694940RNs.LIZJ.put(str, c0ros);
                    Iterator it3 = ((List) awS412S0200000_11.invoke()).iterator();
                    int i = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            if (Intrinsics.LJFF(it3.next(), str)) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    c0ros.setTag(R.id.ki2, Integer.valueOf(i));
                    ArrayList arrayList = new ArrayList();
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        Object tag = viewGroup.getChildAt(i2).getTag(R.id.ki2);
                        if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        arrayList.add(Integer.valueOf(iIntValue));
                    }
                    List listLJLLJ = C13LP.LJLLJ(arrayList);
                    int size = listLJLLJ.size();
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = (i3 + size) / 2;
                        if (((Number) ListProtector.get(listLJLLJ, i4)).intValue() < i) {
                            i3 = i4 + 1;
                        } else {
                            size = i4;
                        }
                    }
                    if (i3 > viewGroup.getChildCount()) {
                        viewGroup.addView(c0ros);
                    } else {
                        viewGroup.addView(c0ros, i3);
                    }
                    new AwS33S1101000_3(i3, viewGroup, str, 1);
                    C0T6L.LIZLLL();
                }
            }
        }
        return c694940RNs;
    }
}
