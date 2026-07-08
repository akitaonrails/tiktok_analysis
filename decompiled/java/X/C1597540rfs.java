package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0rfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597540rfs implements InterfaceC1597360rfa<InterfaceC1891350zJl> {
    @Override // X.InterfaceC1597360rfa
    public final List<EnumC1597060rf6> LIZ() {
        return C1697810uHb.LJIIJJI(EnumC1597060rf6.LIVE, EnumC1597060rf6.LIVE_EVENT, EnumC1597060rf6.STORY, EnumC1597060rf6.HIGHLIGHT, EnumC1597060rf6.ACTIVE_STATUS, EnumC1597060rf6.ON_THIS_DAY);
    }

    public static String LIZLLL(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        C1598140rgq c1598140rgq;
        SkylightData skylightData;
        Long l;
        if (!(interfaceC1891350zJl instanceof C1598140rgq) || (c1598140rgq = (C1598140rgq) interfaceC1891350zJl) == null || (skylightData = c1598140rgq.LLILLJJLI) == null || (l = skylightData.uid) == null || (string = l.toString()) == null) {
            string = "";
        }
        return C1596950rev.LIZJ(EnumC1597060rf6.FRIENDS, string);
    }

    @Override // X.InterfaceC1597360rfa
    public final List<InterfaceC1160280gIc<InterfaceC1891350zJl>> LIZIZ(List<? extends InterfaceC1891350zJl> list) {
        C1598140rgq c1598140rgq;
        SkylightData skylightData;
        Long l;
        String string;
        boolean z = true;
        if (!((Boolean) C277580AuK.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof C1598140rgq) {
                    arrayList.add(new C1160290gId(LIZLLL(interfaceC1891350zJl)));
                }
            }
            return arrayList;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : list) {
            if ((interfaceC1891350zJl2 instanceof C1598140rgq) && (c1598140rgq = (C1598140rgq) interfaceC1891350zJl2) != null && (skylightData = c1598140rgq.LLILLJJLI) != null && (l = skylightData.uid) != null && (string = l.toString()) != null && !linkedHashSet.add(string)) {
                arrayList2.add(new C1160290gId(LIZLLL(interfaceC1891350zJl2)));
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1597360rfa
    public final List LIZJ(C1597310rfV c1597310rfV, List list) {
        boolean zBooleanValue;
        Boolean bool;
        Object obj = c1597310rfV.LIZ(EnumC1597060rf6.STORY).get("has_more");
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1160290gId(LIZLLL((InterfaceC1891350zJl) it2.next())));
            }
            return arrayList;
        }
        if (C1597190rfJ.LIZ(c1597310rfV)) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new C1160290gId(LIZLLL((InterfaceC1891350zJl) it3.next())));
            }
            return arrayList2;
        }
        List<EnumC1597060rf6> listLIZ = LIZ();
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(3);
        AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(this, 5);
        if (!list.isEmpty() && !listLIZ.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (EnumC1597060rf6 enumC1597060rf6 : listLIZ) {
                List<InterfaceC1891350zJl> list2 = c1597310rfV.LIZLLL.get(enumC1597060rf6);
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                Iterator<InterfaceC1891350zJl> it4 = list2.iterator();
                while (it4.hasNext()) {
                    Object objInvoke = aFwS264S0000000_24.invoke(it4.next());
                    if (objInvoke != null) {
                        linkedHashSet.add(objInvoke);
                    }
                }
                Iterator<InterfaceC1891350zJl> it5 = c1597310rfV.LIZJ(enumC1597060rf6).iterator();
                while (it5.hasNext()) {
                    Object objInvoke2 = aFwS264S0000000_24.invoke(it5.next());
                    if (objInvoke2 != null) {
                        linkedHashSet.add(objInvoke2);
                    }
                }
            }
            if (linkedHashSet.isEmpty()) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                Object objInvoke3 = aFwS264S0000000_24.invoke(obj2);
                if (objInvoke3 != null && linkedHashSet.contains(objInvoke3)) {
                    arrayList3.add(new C1160290gId((String) awS603S0100000_24.invoke(obj2)));
                }
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }
}
