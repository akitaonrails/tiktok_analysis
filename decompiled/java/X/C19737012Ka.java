package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12Ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19737012Ka extends C12KZ {
    public C19737012Ka(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int LIZLLL(List<String> list) {
        C12KV c12kvLIZ = LIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            arrayList.add(new C12KY(str, str));
        }
        c12kvLIZ.LIZLLL(arrayList, null);
        LIZIZ();
        return getColumnPickers$tux_theme_release().size() - 1;
    }

    public final void LJI(int i) {
        ((C12KV) ListProtector.get(getColumnPickers$tux_theme_release(), 0)).setIndex$tux_theme_release(i);
    }

    @Override // X.C12KZ
    public void setMaxAxisOffset(int i) {
        Iterator<C12KV> it2 = getColumnPickers$tux_theme_release().iterator();
        while (it2.hasNext()) {
            it2.next().setMaxAxisOffset$tux_theme_release(i);
        }
    }

    public final void LJ(int i, final InterfaceC489860JIy interfaceC489860JIy) {
        ((C12KV) ListProtector.get(getColumnPickers$tux_theme_release(), i)).setCallback(new C12KW() { // from class: X.0JIz
            @Override // X.C12KW
            public final void LIZ(int i2, int i3, Object obj) {
                String str;
                InterfaceC489860JIy interfaceC489860JIy2 = interfaceC489860JIy;
                if (interfaceC489860JIy2 != null) {
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    interfaceC489860JIy2.LIZ(i3, str);
                }
            }
        });
    }

    public final void LJFF(int i, String str) {
        ((C12KV) ListProtector.get(getColumnPickers$tux_theme_release(), i)).setCurrentFocusItem$tux_theme_release(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19737012Ka(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z9;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        new ArrayList();
        new ArrayList();
        setWillNotDraw(false);
        LIZIZ();
        setTouchDelegate(new C19737112Kb(this));
    }
}
