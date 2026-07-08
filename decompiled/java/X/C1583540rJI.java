package X;

import android.text.TextUtils;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0rJI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583540rJI {
    public static final boolean LIZ(String str, List list) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(((InterfaceC1583870rJp) it2.next()).tag(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(C19EG c19eg, AbstractC1583710rJZ abstractC1583710rJZ, List<? extends InterfaceC1583870rJp> list, List<? extends InterfaceC1583870rJp> list2) {
        boolean z;
        AbstractC1583720rJa abstractC1583720rJa;
        AbstractC1583720rJa abstractC1583720rJa2;
        ArrayList<Object> arrayList = (ArrayList) list;
        ArrayList<InterfaceC1583870rJp> arrayList2 = (ArrayList) list2;
        if (arrayList.size() != arrayList2.size()) {
            z = true;
        } else {
            z = false;
        }
        for (Object obj : arrayList) {
            if ((obj instanceof AbstractC1583720rJa) && (abstractC1583720rJa2 = (AbstractC1583720rJa) obj) != null && !LIZ(abstractC1583720rJa2.tag(), list2)) {
                abstractC1583710rJZ.LJJIIJZLJL(abstractC1583720rJa2);
                z = true;
            }
        }
        for (InterfaceC1583870rJp interfaceC1583870rJp : arrayList2) {
            if (!LIZ(interfaceC1583870rJp.tag(), list)) {
                if ((interfaceC1583870rJp instanceof AbstractC1583720rJa) && (abstractC1583720rJa = (AbstractC1583720rJa) interfaceC1583870rJp) != null) {
                    abstractC1583710rJZ.LJJ(abstractC1583720rJa);
                }
                z = true;
            }
        }
        if (!z) {
            if (arrayList2.size() == arrayList.size()) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (!TextUtils.equals(((InterfaceC1583870rJp) ListProtector.get(list2, i)).tag(), ((InterfaceC1583870rJp) ListProtector.get(list, i)).tag())) {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                return;
            }
        }
        AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(list2, (List<? extends InterfaceC1594550rb3>) 516);
        ArrayList arrayList3 = (ArrayList) abstractC1583710rJZ.LLIZLLLIL;
        if (arrayList3.size() > 1) {
            C08XD.LJJ(arrayList3, new C512501z9(awS603S0100000_24, 1));
        }
        Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg);
        hoxLIZ.LLILZ.clear();
        hoxLIZ.LLILZLL.clear();
    }
}
