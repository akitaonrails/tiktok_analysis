package X;

import Y.ARunnableS119S0100000_19;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.FollowingListAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0j1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265250j1v extends C09AY implements Function2<UIAssem, List<? extends InterfaceC1891350zJl>, Unit> {
    public final /* synthetic */ FollowingListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265250j1v(FollowingListAssem followingListAssem) {
        super(2);
        this.LL = followingListAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, List<? extends InterfaceC1891350zJl> list) {
        C19EG activity;
        C1265420j2C c1265420j2C;
        User user;
        C1265420j2C c1265420j2C2;
        User user2;
        String uid;
        C1265420j2C c1265420j2C3;
        User user3;
        String uid2;
        List<? extends InterfaceC1891350zJl> list2 = list;
        if (list2 != null) {
            FollowingListAssem followingListAssem = this.LL;
            ArrayList arrayList = new ArrayList();
            Iterator<? extends InterfaceC1891350zJl> it2 = list2.iterator();
            while (true) {
                activity = null;
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1891350zJl next = it2.next();
                if ((next instanceof C1265420j2C) && (c1265420j2C3 = (C1265420j2C) next) != null && (user3 = c1265420j2C3.LLILLJJLI) != null && (uid2 = user3.getUid()) != null) {
                    arrayList.add(uid2);
                }
            }
            List<InterfaceC1891350zJl> listLJII = followingListAssem.Oo().LLILZLL.LJII();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<InterfaceC1891350zJl> arrayList3 = (ArrayList) listLJII;
            for (InterfaceC1891350zJl interfaceC1891350zJl : arrayList3) {
                if ((interfaceC1891350zJl instanceof C1265420j2C) && (c1265420j2C2 = (C1265420j2C) interfaceC1891350zJl) != null && (user2 = c1265420j2C2.LLILLJJLI) != null && (uid = user2.getUid()) != null) {
                    arrayList2.add(uid);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList2) {
                Object arrayList4 = linkedHashMap.get(obj);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(obj, arrayList4);
                }
                ((List) arrayList4).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((List) entry.getValue()).size() > 1) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap2.keySet();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj2 : arrayList) {
                Object arrayList5 = linkedHashMap3.get(obj2);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap3.put(obj2, arrayList5);
                }
                ((List) arrayList5).add(obj2);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                if (((List) entry2.getValue()).size() > 1) {
                    linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set setKeySet2 = linkedHashMap4.keySet();
            C1910890zpH c1910890zpHAp = followingListAssem.ap();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[FDUP] listItemState changed: dataSize=");
            sbLIZ.append(list2.size());
            sbLIZ.append(", dataUids=");
            sbLIZ.append(arrayList);
            sbLIZ.append(", dataDups=");
            sbLIZ.append(setKeySet2);
            sbLIZ.append(", chunkSize=");
            sbLIZ.append(arrayList3.size());
            sbLIZ.append(", chunkUids=");
            sbLIZ.append(arrayList2);
            sbLIZ.append(", chunkDups=");
            sbLIZ.append(setKeySet);
            sbLIZ.append(", isComputingLayout=");
            sbLIZ.append(followingListAssem.Go().isComputingLayout());
            sbLIZ.append(", thread=");
            sbLIZ.append(C786410Ut5.u3().getName());
            c1910890zpHAp.LJII("following_assem", C2188811AlT.LIZIZ(sbLIZ));
            followingListAssem.Lo("listItemState changed");
            if (!C086I.LIZIZ(list2)) {
                HandlerHook.viewPost(followingListAssem.Go(), new ARunnableS119S0100000_19(followingListAssem, 5));
            }
            C1075830e6P c1075830e6P = followingListAssem.LLJILLL;
            if (c1075830e6P != null) {
                if (c1075830e6P.LLILLL - list2.size() <= 20) {
                    c1075830e6P.LIZIZ(null);
                }
            }
            if (!followingListAssem.Go().isComputingLayout()) {
                ArrayList<User> arrayList6 = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl2 : list2) {
                    if ((interfaceC1891350zJl2 instanceof C1265420j2C) && (c1265420j2C = (C1265420j2C) interfaceC1891350zJl2) != null && (user = c1265420j2C.LLILLJJLI) != null) {
                        arrayList6.add(user);
                    }
                }
                InterfaceC1264870j1J interfaceC1264870j1JX3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).x3();
                InterfaceC1087200eOk.LJJIJIIJIL.getClass();
                Fragment fragmentLJI = C724240Sb0.LJI(followingListAssem);
                if (fragmentLJI != null) {
                    activity = fragmentLJI.getActivity();
                }
                ListLiveCircleItemVM listLiveCircleItemVMLIZ = interfaceC1264870j1JX3.LIZ(1, activity);
                if (listLiveCircleItemVMLIZ != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ListLiveCircleItemVM try to data ");
                    sbLIZ2.append(Integer.valueOf(arrayList6.size()));
                    sbLIZ2.append(' ');
                    C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ2));
                    listLiveCircleItemVMLIZ.LLILZ.clear();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : arrayList6) {
                        if (((User) obj3).roomId != 0) {
                            arrayList7.add(obj3);
                        }
                    }
                    listLiveCircleItemVMLIZ.LLILZ.addAll(arrayList7);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("ListLiveCircleItemVM setRefreshLiveData2VM-u ");
                    sbLIZ3.append(listLiveCircleItemVMLIZ.LLILZ.size());
                    sbLIZ3.append("+,");
                    sbLIZ3.append(listLiveCircleItemVMLIZ.getClass());
                    sbLIZ3.append(' ');
                    C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ3));
                    listLiveCircleItemVMLIZ.LLIZLLLIL = "tiktok_relation_following_living_exit";
                    listLiveCircleItemVMLIZ.zQ2();
                }
                C0JAM c0jamLIZJ = C0JAU.LIZJ();
                if (c0jamLIZJ.LIZ()) {
                    for (User user4 : arrayList6) {
                        String strValueOf = String.valueOf(user4.roomId);
                        String uid3 = user4.getUid();
                        if (c0jamLIZJ.LIZ()) {
                            ((List) c0jamLIZJ.LJFF.getValue()).add(strValueOf);
                            ((List) c0jamLIZJ.LJI.getValue()).add(uid3);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
