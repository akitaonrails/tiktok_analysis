package X;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1583720rJa {
    public AbstractC1583710rJZ LL;
    public final CopyOnWriteArrayList<InterfaceC1055110dYz> LLILLJJLI = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<Object> LLILLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1583850rJn> LLILZ = new CopyOnWriteArrayList<>();

    public String LJFF() {
        return "";
    }

    public abstract Bundle LJIIZILJ();

    public abstract Class<? extends Fragment> LJIJ();

    public abstract String tag();

    public final LinkedList<AbstractC1583720rJa> LJIJI() {
        LinkedList<AbstractC1583720rJa> linkedList = new LinkedList<>();
        for (AbstractC1583720rJa abstractC1583720rJa = this; abstractC1583720rJa != null; abstractC1583720rJa = abstractC1583720rJa.LL) {
            linkedList.add(0, abstractC1583720rJa);
        }
        return linkedList;
    }

    public void LJIILLIIL(InterfaceC1583780rJg interfaceC1583780rJg) {
        if (!C13LP.LJJJJ(interfaceC1583780rJg, this.LLILLJJLI)) {
            if (interfaceC1583780rJg instanceof InterfaceC1055110dYz) {
                this.LLILLJJLI.add(interfaceC1583780rJg);
            }
            if (interfaceC1583780rJg instanceof InterfaceC1583850rJn) {
                this.LLILZ.add(interfaceC1583780rJg);
                return;
            }
            return;
        }
        throw new RuntimeException("have been added, cannot add again");
    }

    public final void LJIL(AbstractC1583710rJZ abstractC1583710rJZ) {
        String stackTraceString;
        if (abstractC1583710rJZ == null) {
            stackTraceString = Log.getStackTraceString(new Exception());
        } else {
            stackTraceString = "";
        }
        InterfaceC1583760rJe interfaceC1583760rJe = C1563860qnY.LIZ;
        if (interfaceC1583760rJe != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set parent: child: ");
            sbLIZ.append(this);
            sbLIZ.append(", parent: ");
            sbLIZ.append(abstractC1583710rJZ);
            sbLIZ.append(", extra: ");
            sbLIZ.append(stackTraceString);
            interfaceC1583760rJe.log(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LL = abstractC1583710rJZ;
    }

    public void LJIJJ(AbstractC1583720rJa abstractC1583720rJa, AbstractC1583720rJa abstractC1583720rJa2, List<InterfaceC1583770rJf> list) {
        String strTag;
        String strTag2;
        if (abstractC1583720rJa2 != null) {
            if (abstractC1583720rJa != null) {
                strTag = abstractC1583720rJa.tag();
            } else {
                strTag = null;
            }
            if (!Intrinsics.LJFF(strTag, abstractC1583720rJa2.tag())) {
                for (InterfaceC1583770rJf interfaceC1583770rJf : list) {
                    if (abstractC1583720rJa != null) {
                        strTag2 = abstractC1583720rJa.tag();
                    } else {
                        strTag2 = null;
                    }
                    interfaceC1583770rJf.A4(strTag2, abstractC1583720rJa2.tag());
                }
            }
        }
    }

    public void LJIJJLI(AbstractC1583720rJa abstractC1583720rJa, AbstractC1583720rJa abstractC1583720rJa2, CopyOnWriteArrayList<InterfaceC1583770rJf> copyOnWriteArrayList) {
        String strTag;
        for (InterfaceC1583770rJf interfaceC1583770rJf : copyOnWriteArrayList) {
            if (abstractC1583720rJa != null) {
                strTag = abstractC1583720rJa.tag();
            } else {
                strTag = null;
            }
            interfaceC1583770rJf.A4(strTag, abstractC1583720rJa2.tag());
        }
    }
}
