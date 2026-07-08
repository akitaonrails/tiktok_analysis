package X;

import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457810HxL {
    public static final void LIZ(IMInputAssem iMInputAssem, EnumC457820HxM enumC457820HxM, Function1<? super C457800HxK, Unit> function1) {
        C0RUV c0ruv;
        C457800HxK c457800HxK = new C457800HxK();
        function1.invoke(c457800HxK);
        if (((ArrayList) c457800HxK.LIZ).isEmpty()) {
            return;
        }
        List<C0RUV<? extends AbstractC738140SxQ>> list = iMInputAssem.getConfig().LLIZ;
        List<C0RTL> list2 = c457800HxK.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list2) {
            if (obj instanceof C0SZ5) {
                c0ruv = (C0RUV) obj;
                c0ruv.LLILZ.put("input_area", enumC457820HxM.name());
            } else if (obj instanceof C696590RUb) {
                c0ruv = (C0RUV) obj;
                c0ruv.LLILZ.put("input_area", enumC457820HxM.name());
            }
            arrayList.add(c0ruv);
        }
        list.addAll(arrayList);
    }
}
