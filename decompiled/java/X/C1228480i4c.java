package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.groupcreation.fragment.UnifiedGroupCreationFragment;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCommon;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0i4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.openplatform.CreatePublicGroupPreCheckHelper$processPublicGroupCreationForUnifiedPage$2", f = "CreatePublicGroupPreCheckHelper.kt", l = {53}, m = "invokeSuspend")
public final class C1228480i4c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1228470i4b LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C1228040i3u LLILZ;
    public final /* synthetic */ AbstractC1227390i2r LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228480i4c(C1228470i4b c1228470i4b, Context context, C1228040i3u c1228040i3u, AbstractC1227390i2r abstractC1227390i2r, InterfaceC1364105Vn<? super C1228480i4c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1228470i4b;
        this.LLILLL = context;
        this.LLILZ = c1228040i3u;
        this.LLILZIL = abstractC1227390i2r;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228480i4c(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        GroupEntrance groupEntrance;
        GroupAccessCriteriaCollection groupAccessCriteriaCollection;
        long j;
        boolean z3;
        C1224280hxq c1224280hxqLIZIZ;
        List<GroupAccessCriteriaCollection> list;
        GroupAccessCriteriaCollection next;
        boolean z4;
        Object next2;
        boolean z5;
        Object objLJIIIZ = obj;
        C1C7U.LIZ("CreatePublicGroupPreCheckHelper@7239.processPublicGroupCreationForUnifiedPage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIIZ);
            C1229040i5W c1229040i5W = C1229040i5W.LL;
            this.LL = 1;
            objLJIIIZ = C1229040i5W.LL.LJIIIZ(C1229100i5c.LJIILIIL(), this);
            if (objLJIIIZ == objLJFF) {
                C1C7U.LIZIZ("CreatePublicGroupPreCheckHelper@7239.processPublicGroupCreationForUnifiedPage$2");
                return objLJFF;
            }
        }
        C1228560i4k c1228560i4k = (C1228560i4k) objLJIIIZ;
        GroupEntranceCommon groupEntranceCommon = c1228560i4k.LIZJ;
        if (groupEntranceCommon != null && groupEntranceCommon.canCreate) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CreatePublicGroupPreCheckHelper@7239.processPublicGroupCreationForUnifiedPage$2");
            return unit;
        }
        if (C123100dR.LIZ(this.LLILLJJLI.LIZ.LIZJ) && C123100dR.LIZ(this.LLILLJJLI.LIZ.LIZLLL)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            List<GroupEntrance> list2 = c1228560i4k.LIZ;
            ArrayList arrayList = new ArrayList();
            for (GroupEntrance groupEntrance2 : list2) {
                if (groupEntrance2.canCreate) {
                    arrayList.add(groupEntrance2);
                }
            }
            C1228470i4b c1228470i4b = this.LLILLJJLI;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    GroupEntrance groupEntrance3 = (GroupEntrance) next2;
                    if (Intrinsics.LJFF(groupEntrance3.type.groupCategory, c1228470i4b.LIZ.LIZJ) && Intrinsics.LJFF(groupEntrance3.type.groupType, c1228470i4b.LIZ.LIZLLL)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            groupEntrance = (GroupEntrance) next2;
        } else {
            groupEntrance = null;
        }
        if (z2 && groupEntrance == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CreatePublicGroupPreCheckHelper@7239.processPublicGroupCreationForUnifiedPage$2");
            return unit2;
        }
        int i2 = this.LLILLJJLI.LIZ.LJ;
        if (z2 && i2 != EnumC1219960hqs.UNKNOWN.getValue() && groupEntrance != null && (list = groupEntrance.accessCriteriaCollections) != null) {
            Iterator<GroupAccessCriteriaCollection> it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (next.collectionId == i2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            groupAccessCriteriaCollection = next;
        } else {
            groupAccessCriteriaCollection = null;
        }
        Iterator<GroupEntrance> it4 = c1228560i4k.LIZ.iterator();
        int i3 = 0;
        while (it4.hasNext()) {
            i3 += it4.next().currentGroupCnt;
        }
        GroupEntranceCommon groupEntranceCommon2 = c1228560i4k.LIZJ;
        if (groupEntranceCommon2 != null) {
            j = groupEntranceCommon2.groupCntLimit;
        } else {
            j = 0;
        }
        if (i3 >= j) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1228500i4e c1228500i4e = C1228500i4e.LIZIZ;
        List<GroupAccessCriteriaCollection> list3 = c1228560i4k.LIZIZ;
        C1228470i4b c1228470i4b2 = this.LLILLJJLI;
        Context context = this.LLILLL;
        c1228500i4e.getClass();
        C1228650i4t c1228650i4t = c1228470i4b2.LIZ;
        C1228470i4b c1228470i4bLIZ = C1228470i4b.LIZ(c1228470i4b2, C1228650i4t.LIZ(c1228470i4b2.LIZ, null, null, null, null, 0, null, false, new C1228710i4z(C1228500i4e.LIZLLL(list3, c1228650i4t.LJJIIJZLJL), c1228650i4t.LJ, groupAccessCriteriaCollection, C1228910i5J.LIZLLL(context, groupAccessCriteriaCollection)), null, false, null, false, false, 0, 0, false, false, false, null, null, false, z3, null, 2146959231, 1), null, 2);
        C1228600i4o c1228600i4o = UnifiedGroupCreationFragment.LLJLL;
        Context context2 = this.LLILLL;
        C1228040i3u c1228040i3u = this.LLILZ;
        AbstractC1227390i2r abstractC1227390i2r = this.LLILZIL;
        c1228600i4o.getClass();
        C1228490i4d.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1228490i4d.LIZIZ.put(strLIZIZ, C1228470i4b.LIZ(c1228470i4bLIZ, C1228650i4t.LIZ(c1228470i4bLIZ.LIZ, null, null, null, null, 0, null, false, null, null, false, null, false, true, 16, 12, true, true, true, null, null, true, false, null, -1190133761, 1), null, 2));
        boolean z6 = c1228470i4bLIZ.LIZ.LJIIJ;
        AwS70S1000000_19 awS70S1000000_19 = new AwS70S1000000_19(strLIZIZ, 17);
        abstractC1227390i2r.getClass();
        EnumC1222430hur enumC1222430hur = EnumC1222430hur.BOTTOM;
        InterfaceC1225830i0L interfaceC1225830i0L = (InterfaceC1225830i0L) awS70S1000000_19.invoke(abstractC1227390i2r.LJIIIIZZ());
        Map<String, Object> mapLIZLLL = abstractC1227390i2r.LIZLLL();
        if (mapLIZLLL == null) {
            mapLIZLLL = C2097608Jq.LJ();
        }
        AbstractC1227390i2r abstractC1227390i2rLJIIJJI = abstractC1227390i2r.LJIIJJI(z6, enumC1222430hur, interfaceC1225830i0L, C2097608Jq.LJIIL(mapLIZLLL, C2097608Jq.LJIIIIZZ(new Pair("open_platform_biz_scene", c1228040i3u.LIZIZ), new Pair("open_platform_biz_line", c1228040i3u.LIZ), new Pair("open_platform_source", c1228040i3u.LIZJ))));
        C1227130i2R.LIZ.getClass();
        AbstractC1225770i0F abstractC1225770i0FLIZJ = C1227130i2R.LIZJ(abstractC1227390i2rLJIIJJI);
        IContactSelectorAPI iContactSelectorAPI = (IContactSelectorAPI) PluggableExtentionKt.pluggableSpiForReal(IContactSelectorAPI.class);
        if (iContactSelectorAPI != null && (c1224280hxqLIZIZ = iContactSelectorAPI.LIZIZ(abstractC1225770i0FLIZJ)) != null) {
            AbsContactSelectorFragment.LLJILJIL.put(strLIZIZ, c1224280hxqLIZIZ);
            c1224280hxqLIZIZ.LJIIJJI.LIZJ();
            c1224280hxqLIZIZ.LJIIJJI.LIZIZ();
        }
        try {
            if (c1228470i4bLIZ.LIZ.LJIIJ) {
                C1228490i4d.LIZ(context2, strLIZIZ, c1228040i3u.LIZ, c1228040i3u.LIZIZ, c1228470i4bLIZ);
            } else {
                C1228490i4d.LIZIZ(context2, strLIZIZ, c1228040i3u.LIZ, c1228040i3u.LIZIZ, c1228470i4bLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (strLIZIZ != null) {
                C1228490i4d.LIZJ.remove(strLIZIZ);
                C1228490i4d.LIZIZ.remove(strLIZIZ);
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("CreatePublicGroupPreCheckHelper@7239.processPublicGroupCreationForUnifiedPage$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
