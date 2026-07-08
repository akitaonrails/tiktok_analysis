package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0aVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937830aVp {
    public static final List<AbstractC939840aZ4> LIZ(C957020b0m c957020b0m) {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it2 = new C09RD(c957020b0m).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view = (View) c09re.next();
                if (view instanceof C939730aYt) {
                    arrayList.addAll(((C939730aYt) view).getAllElements());
                }
            } else {
                return arrayList;
            }
        }
    }

    public static final List<AbstractC939840aZ4> LIZIZ(EnumC939900aZA enumC939900aZA, InterfaceC940060aZQ interfaceC940060aZQ) {
        C942080acg c942080acgLJLJI;
        C947470alN c947470alN;
        List<C957020b0m> list;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if (interfaceC940060aZQ == null) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
            } else {
                interfaceC937900aVwLLIIJLIL = null;
            }
            if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) {
                interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL;
            } else {
                interfaceC940060aZQ = null;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (interfaceC940060aZQ != null && (c942080acgLJLJI = interfaceC940060aZQ.LJLJI()) != null && (c947470alN = c942080acgLJLJI.LIZ) != null && (list = c947470alN.LIZLLL) != null) {
            Iterator<C957020b0m> it2 = list.iterator();
            while (it2.hasNext()) {
                for (View view : new C09RD(it2.next())) {
                    if (view instanceof C939730aYt) {
                        Iterator<Map.Entry<EnumC939920aZC, ? extends List<? extends AbstractC939840aZ4>>> it3 = ((C939730aYt) view).LLJILLL.entrySet().iterator();
                        ArrayList arrayList2 = new ArrayList();
                        while (it3.hasNext()) {
                            List<? extends AbstractC939840aZ4> value = it3.next().getValue();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : value) {
                                if (((AbstractC939840aZ4) obj).getElementType() == enumC939900aZA) {
                                    arrayList3.add(obj);
                                }
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        arrayList.addAll(arrayList2);
                    }
                }
            }
        }
        return arrayList;
    }
}
