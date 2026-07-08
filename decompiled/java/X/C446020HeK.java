package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446020HeK extends C09AY implements Function2<UIAssem, List<String>, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446020HeK(View view) {
        super(2);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, List<String> list) {
        boolean z;
        List<String> list2 = list;
        C1826520xdC c1826520xdC = (C1826520xdC) this.LL.findViewById(R.id.ujy);
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            c1826520xdC.LIZ(new C1782380wU0(it2.next(), null, 30));
        }
        if (list2.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        C500260Jjc.LJLJLJ(c1826520xdC, z);
        return Unit.LIZ;
    }
}
