package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1583710rJZ extends AbstractC1583720rJa {
    public AbstractC1583720rJa LLILZLL;
    public boolean LLIZ;
    public boolean LLILZIL = true;
    public final List<AbstractC1583720rJa> LLIZLLLIL = new ArrayList();
    public final C01GW LLJ = C452501pT.LIZIZ(new C1583750rJd());

    public abstract boolean LJJII();

    public abstract void LJJIIZ(Bundle bundle, String str);

    public final void LJJ(AbstractC1583720rJa abstractC1583720rJa) {
        if (!((ArrayList) this.LLIZLLLIL).contains(abstractC1583720rJa)) {
            InterfaceC1583760rJe interfaceC1583760rJe = C1563860qnY.LIZ;
            if (interfaceC1583760rJe != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add child: parent > ");
                sbLIZ.append(this);
                sbLIZ.append(", child > ");
                sbLIZ.append(abstractC1583720rJa);
                interfaceC1583760rJe.log(C2188811AlT.LIZIZ(sbLIZ));
            }
            abstractC1583720rJa.LJIL(this);
            ((ArrayList) this.LLIZLLLIL).add(abstractC1583720rJa);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(tag());
        sbLIZ2.append("#addChild(), already has childNode ");
        sbLIZ2.append(abstractC1583720rJa.tag());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJJI(InterfaceC1583770rJf interfaceC1583770rJf) {
        ((CopyOnWriteArrayList) this.LLJ.getValue()).add(interfaceC1583770rJf);
    }

    public final void LJJIII(Bundle bundle) {
        CopyOnWriteArrayList<InterfaceC1055110dYz> copyOnWriteArrayList;
        this.LLIZ = false;
        if (this.LLILZIL) {
            return;
        }
        if (C13LP.LJJJJ(this.LLILZLL, this.LLIZLLLIL)) {
            AbstractC1583720rJa abstractC1583720rJa = this.LLILZLL;
            if (abstractC1583720rJa instanceof AbstractC1583710rJZ) {
                ((AbstractC1583710rJZ) abstractC1583720rJa).LJJIII(bundle);
            }
            AbstractC1583720rJa abstractC1583720rJa2 = this.LLILZLL;
            if (abstractC1583720rJa2 != null && (copyOnWriteArrayList = abstractC1583720rJa2.LLILLJJLI) != null) {
                Iterator<InterfaceC1055110dYz> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onNodeHide(bundle);
                }
            }
        }
    }

    public final void LJJIIJ(Bundle bundle) {
        CopyOnWriteArrayList<InterfaceC1055110dYz> copyOnWriteArrayList;
        CopyOnWriteArrayList<InterfaceC1055110dYz> copyOnWriteArrayList2;
        AbstractC1583720rJa abstractC1583720rJa = this.LLILZLL;
        if (abstractC1583720rJa != null && (copyOnWriteArrayList2 = abstractC1583720rJa.LLILLJJLI) != null) {
            copyOnWriteArrayList2.size();
        }
        this.LLIZ = true;
        AbstractC1583720rJa abstractC1583720rJa2 = this.LLILZLL;
        if (abstractC1583720rJa2 != null && (copyOnWriteArrayList = abstractC1583720rJa2.LLILLJJLI) != null) {
            Iterator<InterfaceC1055110dYz> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onNodeShow(bundle);
            }
        }
        if (this.LLILZIL) {
            this.LLILZIL = false;
            return;
        }
        AbstractC1583720rJa abstractC1583720rJa3 = this.LLILZLL;
        if (abstractC1583720rJa3 instanceof AbstractC1583710rJZ) {
            ((AbstractC1583710rJZ) abstractC1583720rJa3).LJJIIJ(bundle);
        }
    }

    public final void LJJIIJZLJL(AbstractC1583720rJa abstractC1583720rJa) {
        String strTag;
        if (!((ArrayList) this.LLIZLLLIL).contains(abstractC1583720rJa)) {
            return;
        }
        AbstractC1583720rJa abstractC1583720rJa2 = this.LLILZLL;
        if (abstractC1583720rJa2 != null) {
            strTag = abstractC1583720rJa2.tag();
        } else {
            strTag = null;
        }
        if (Intrinsics.LJFF(strTag, abstractC1583720rJa.tag())) {
            this.LLILZLL = null;
        }
        InterfaceC1583760rJe interfaceC1583760rJe = C1563860qnY.LIZ;
        if (interfaceC1583760rJe != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove child: parent > ");
            sbLIZ.append(this);
            sbLIZ.append(", child > ");
            sbLIZ.append(abstractC1583720rJa);
            interfaceC1583760rJe.log(C2188811AlT.LIZIZ(sbLIZ));
        }
        abstractC1583720rJa.LJIL(null);
        ((ArrayList) this.LLIZLLLIL).remove(abstractC1583720rJa);
    }

    public final void LJJIFFI(String str, Bundle bundle, CopyOnWriteArrayList<InterfaceC1583770rJf> copyOnWriteArrayList, CopyOnWriteArrayList<InterfaceC1583770rJf> copyOnWriteArrayList2) {
        String strTag;
        String strTag2;
        int i = 0;
        for (Object obj : (ArrayList) this.LLIZLLLIL) {
            int i2 = i + 1;
            if (i >= 0) {
                if (Intrinsics.LJFF(((AbstractC1583720rJa) obj).tag(), str)) {
                    if (i < ((ArrayList) this.LLIZLLLIL).size()) {
                        AbstractC1583720rJa abstractC1583720rJaLIZ = C1583740rJc.LIZ(this.LLILZLL);
                        AbstractC1583720rJa abstractC1583720rJa = this.LLILZLL;
                        if (Intrinsics.LJFF(abstractC1583720rJa, ListProtector.get(this.LLIZLLLIL, i))) {
                            bundle.putBoolean("hox_arg_redundant_tag", true);
                        }
                        LJJIII(bundle);
                        this.LLILZLL = (AbstractC1583720rJa) ListProtector.get(this.LLIZLLLIL, i);
                        LJJIIJ(bundle);
                        AbstractC1583720rJa abstractC1583720rJaLIZ2 = C1583740rJc.LIZ(this.LLILZLL);
                        AbstractC1583720rJa abstractC1583720rJa2 = this.LLILZLL;
                        if (abstractC1583720rJa2 != null) {
                            abstractC1583720rJa2.LJIJJ(abstractC1583720rJa, abstractC1583720rJa2, (CopyOnWriteArrayList) this.LLJ.getValue());
                        }
                        if (abstractC1583720rJaLIZ2 != null) {
                            abstractC1583720rJaLIZ2.LJIJJLI(abstractC1583720rJaLIZ, abstractC1583720rJaLIZ2, copyOnWriteArrayList);
                            if (abstractC1583720rJaLIZ != null) {
                                strTag = abstractC1583720rJaLIZ.tag();
                            } else {
                                strTag = null;
                            }
                            if (!Intrinsics.LJFF(strTag, abstractC1583720rJaLIZ2.tag())) {
                                for (InterfaceC1583770rJf interfaceC1583770rJf : copyOnWriteArrayList2) {
                                    if (abstractC1583720rJaLIZ != null) {
                                        strTag2 = abstractC1583720rJaLIZ.tag();
                                    } else {
                                        strTag2 = null;
                                    }
                                    interfaceC1583770rJf.A4(strTag2, abstractC1583720rJaLIZ2.tag());
                                }
                            }
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("dispatchVisible(), out of childrenList size, index = ");
                        sbLIZ.append(i);
                        sbLIZ.append(", childrenList size = ");
                        sbLIZ.append(((ArrayList) this.LLIZLLLIL).size());
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
