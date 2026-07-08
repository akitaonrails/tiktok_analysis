package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C910260ZnM implements InterfaceC1891350zJl {
    public final String LL;
    public final C18VH LLILLJJLI;
    public final C1622006Ws<C01GW<List<C18VI>>> LLILLL;
    public final C909930Zmp LLILZ;
    public final Map<C13IQ<? extends Object>, C0H94> LLILZIL;

    public C1622006Ws<C01GW<List<C18VI>>> LIZIZ() {
        return this.LLILLL;
    }

    public C909930Zmp LIZLLL() {
        return this.LLILZ;
    }

    public C18VH LJ() {
        return this.LLILLJJLI;
    }

    public String LJI() {
        return this.LL;
    }

    public final void LIZ(C0H94 c0h94) {
        this.LLILZIL.put(C13LE.LIZ(c0h94.getClass()), c0h94);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C910260ZnM) || !areItemTheSame(interfaceC1891350zJl)) {
            return false;
        }
        C910260ZnM c910260ZnM = (C910260ZnM) interfaceC1891350zJl;
        if (LJ() != c910260ZnM.LJ() || !Intrinsics.LJFF(LIZLLL(), c910260ZnM.LIZLLL())) {
            return false;
        }
        Map<C13IQ<? extends Object>, C0H94> map = c910260ZnM.LLILZIL;
        if (this.LLILZIL.size() != map.size()) {
            return false;
        }
        for (Object obj : ((LinkedHashMap) this.LLILZIL).keySet()) {
            C0H94 c0h94 = (C0H94) ((LinkedHashMap) this.LLILZIL).get(obj);
            C0H94 c0h942 = (C0H94) ((LinkedHashMap) map).get(obj);
            if (c0h942 == null || c0h94 == null || !c0h94.areContentsTheSame(c0h942)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C910260ZnM) {
            return Intrinsics.LJFF(LJI(), ((C910260ZnM) interfaceC1891350zJl).LJI());
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C910260ZnM) && ((Boolean) C0BA3.LIZ.getValue()).booleanValue()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Map<C13IQ<? extends Object>, C0H94> map = this.LLILZIL;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key = entry.getKey();
                if (Intrinsics.LJFF(((LinkedHashMap) ((C910260ZnM) interfaceC1891350zJl).LLILZIL).get(key), entry.getValue())) {
                    linkedHashSet.add(key);
                }
                arrayList.add(Unit.LIZ);
            }
            return new C218800ss(linkedHashSet);
        }
        return null;
    }

    public C910260ZnM(String str, C18VH c18vh, C1622006Ws c1622006Ws, int i) {
        c1622006Ws = (i & 4) != 0 ? new C1622006Ws(C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(534))) : c1622006Ws;
        this.LL = str;
        this.LLILLJJLI = c18vh;
        this.LLILLL = c1622006Ws;
        this.LLILZ = null;
        this.LLILZIL = new LinkedHashMap();
    }
}
