package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.103t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191851103t extends AbstractC191842103k implements InterfaceC191831102z {
    public final C191852103u LLILLL;

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        Object next;
        InterfaceC191854103w interfaceC191854103w;
        Object objPrevious;
        InterfaceC191854103w interfaceC191854103w2;
        InterfaceC191854103w interfaceC191854103w3;
        ArrayList arrayList = new ArrayList();
        C103N c103n = this.LLILLL.LIZLLL;
        if (c103n != null) {
            arrayList.add(new C191857103z(c103n.LIZ(context)));
        }
        List<AbstractC191843103l> list = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList();
        Iterator<AbstractC191843103l> it2 = list.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().LJ(context), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return C13BV.INSTANCE;
        }
        Iterator it3 = arrayList2.iterator();
        int i = 0;
        while (true) {
            CharSequence charSequenceLIZ = null;
            if (it3.hasNext()) {
                Object next2 = it3.next();
                int i2 = i + 1;
                if (i >= 0) {
                    Object obj = (AbstractC191840103i) next2;
                    if ((obj instanceof InterfaceC191854103w) && (interfaceC191854103w3 = (InterfaceC191854103w) obj) != null) {
                        interfaceC191854103w3.LIZLLL(false);
                        interfaceC191854103w3.LIZJ(false);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (next instanceof InterfaceC191854103w) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next instanceof InterfaceC191854103w) {
                    interfaceC191854103w = (InterfaceC191854103w) next;
                } else {
                    interfaceC191854103w = null;
                }
                if (interfaceC191854103w != null) {
                    interfaceC191854103w.LIZLLL(true);
                }
                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (objPrevious instanceof InterfaceC191854103w) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                if ((objPrevious instanceof InterfaceC191854103w) && (interfaceC191854103w2 = (InterfaceC191854103w) objPrevious) != null) {
                    interfaceC191854103w2.LIZJ(true);
                }
                arrayList.addAll(arrayList2);
                C191852103u c191852103u = this.LLILLL;
                if (c191852103u.LJFF) {
                    C103N c103n2 = c191852103u.LJI;
                    if (c103n2 != null) {
                        charSequenceLIZ = c103n2.LIZ(context);
                    }
                    CharSequence charSequenceLIZJ = LIZJ(context, charSequenceLIZ);
                    if (charSequenceLIZJ != null && charSequenceLIZJ.length() != 0) {
                        arrayList.add(new C191856103y(charSequenceLIZJ));
                    }
                }
                return arrayList;
            }
        }
    }

    public C191851103t(C191852103u c191852103u, List<? extends AbstractC191843103l> list) {
        super(list);
        this.LLILLL = c191852103u;
    }

    @Override // X.InterfaceC191831102z
    public final CharSequence LIZJ(Context context, CharSequence charSequence) {
        CharSequence charSequenceLIZJ;
        for (Object obj : this.LLILLJJLI) {
            if ((obj instanceof InterfaceC191831102z) && (charSequenceLIZJ = ((InterfaceC191831102z) obj).LIZJ(context, null)) != null && charSequenceLIZJ.length() != 0) {
                return charSequenceLIZJ;
            }
        }
        return charSequence;
    }
}
