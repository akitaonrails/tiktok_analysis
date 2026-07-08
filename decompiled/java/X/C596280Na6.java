package X;

import Y.AComparatorS28S0000000_9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Na6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel$refreshMenuSource$1", f = "ProfileMenuViewModel.kt", l = {}, m = "invokeSuspend")
public final class C596280Na6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileMenuViewModel LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596280Na6(ProfileMenuViewModel profileMenuViewModel, List<String> list, InterfaceC1364105Vn<? super C596280Na6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileMenuViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596280Na6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileMenuViewModel@fa0c.refreshMenuSource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProfileMenuViewModel profileMenuViewModel = this.LL;
        C596300Na8 c596300Na8 = profileMenuViewModel.LL;
        List<InterfaceC596290Na7> list = profileMenuViewModel.LLILLJJLI;
        c596300Na8.getClass();
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(((InterfaceC596290Na7) it2.next()).LIZIZ());
            }
            ArrayList arrayList2 = new ArrayList(C13LP.LJLLLL(new AComparatorS28S0000000_9(13), linkedHashSet));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int i = 0;
            while (i < arrayList2.size()) {
                C1249580ice c1249580ice = (C1249580ice) ListProtector.get(arrayList2, i);
                i++;
                if (!C596300Na8.LIZIZ.contains(c1249580ice.LLILLL.toLowerCase(Locale.ROOT))) {
                    int i2 = i;
                    while (i2 < arrayList2.size()) {
                        int i3 = i2 + 1;
                        C1249580ice c1249580ice2 = (C1249580ice) ListProtector.get(arrayList2, i2);
                        if (Intrinsics.LJFF(c1249580ice.LLILLL, c1249580ice2.LLILLL)) {
                            if (c1249580ice.LLIZ > c1249580ice2.LLIZ) {
                                linkedHashSet2.add(c1249580ice2);
                            } else {
                                linkedHashSet2.add(c1249580ice);
                            }
                        }
                        i2 = i3;
                    }
                }
            }
            arrayList2.removeAll(linkedHashSet2);
            c596300Na8.LIZ.clear();
            c596300Na8.LIZ.addAll(arrayList2);
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshMenuSource sourceKeys: ");
        sbLIZ.append(this.LLILLJJLI);
        C1720106oR.LJI("ProfileMenuViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileMenuViewModel@fa0c.refreshMenuSource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
