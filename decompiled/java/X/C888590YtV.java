package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.NewSessionListSingleChatVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListGroupChatWithStoryVH;
import com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListMessageRequestCellVH;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888590YtV {
    public static String LJ;
    public static C893390Z2z LJI;
    public static final C888590YtV LIZ = new C888590YtV();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<C0Z3E>> LJFF = new ConcurrentHashMap<>();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(547));

    public static int LIZJ(int i) {
        if (i == 0) {
            return 104;
        }
        if (i != 2) {
            return i != 3 ? 100 : 105;
        }
        return 107;
    }

    public static boolean LIZIZ() {
        C01GW c01gw = C270440Aio.LIZ;
        return ((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() != 0 || ((Number) C270430Ain.LIZ.getValue()).intValue() == 1 || C0BBN.LIZ() == 1 || C0BBN.LIZ() == 2 || C0BBN.LIZ() == 3 || C0BBN.LIZ() == 2 || C0BBN.LIZ() == 3;
    }

    public static void LIZ(String str) {
        boolean z;
        boolean z2;
        List<InterfaceC884440Ymo> listLJIIJ;
        Object objLIZIZ;
        Object obj;
        C19EG c19eg;
        int cacheSize;
        int i;
        C0Z3E newSessionListSingleChatVH;
        Object objLIZIZ2;
        Object obj2;
        C19EG c19eg2;
        int iIntValue;
        Object newSessionListSingleChatVH2;
        if ((C287770BPr.LIZ() & 4) != 0) {
            C01GW c01gw = LJII;
            if (!((AtomicBoolean) c01gw.getValue()).get() && !LIZJ.get()) {
                ((AtomicBoolean) c01gw.getValue()).set(true);
                LJ = str;
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId != null && curUserId.length() != 0) {
                    IMUserPortraitApi.LIZ.getClass();
                    InterfaceC886280Ypm interfaceC886280YpmLIZ = C1730606q8.LIZ().LIZ();
                    C01GW c01gw2 = C270440Aio.LIZ;
                    if (((Number) c01gw2.getValue()).intValue() == 1 && !interfaceC886280YpmLIZ.LJIL()) {
                        C888780Yto.LIZ("not_high_or_medium_activeness", str);
                        return;
                    }
                    if (((Number) c01gw2.getValue()).intValue() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i2 = -1;
                    if (z && interfaceC886280YpmLIZ.LIZIZ(curUserId) == -1) {
                        C888780Yto.LIZ("no_conversation", str);
                        return;
                    }
                    if (((Number) C270430Ain.LIZ.getValue()).intValue() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        InterfaceC886280Ypm interfaceC886280YpmLIZ2 = C1730606q8.LIZ().LIZ();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(Integer.valueOf(LIZJ(0)), Integer.valueOf(interfaceC886280YpmLIZ2.LJIJJ(curUserId)));
                        linkedHashMap.put(Integer.valueOf(LIZJ(3)), Integer.valueOf(interfaceC886280YpmLIZ2.LJII(curUserId)));
                        linkedHashMap.put(Integer.valueOf(LIZJ(2)), Integer.valueOf(interfaceC886280YpmLIZ2.LJIILJJIL(curUserId)));
                        List<EnumC888580YtU> listLJIIJJI = C1697810uHb.LJIIJJI(EnumC888580YtU.SINGLE_CHAT, EnumC888580YtU.GROUP_CHAT, EnumC888580YtU.MESSAGE_REQUEST_CELL);
                        for (EnumC888580YtU enumC888580YtU : listLJIIJJI) {
                            ConcurrentHashMap<Integer, CopyOnWriteArrayList<C0Z3E>> concurrentHashMap = LJFF;
                            if (!concurrentHashMap.contains(Integer.valueOf(enumC888580YtU.getVhType()))) {
                                concurrentHashMap.put(Integer.valueOf(enumC888580YtU.getVhType()), new CopyOnWriteArrayList<>());
                            }
                        }
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null) {
                            objLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ();
                        } else {
                            objLIZIZ2 = null;
                        }
                        if (objLIZIZ2 instanceof InterfaceC1603190roz) {
                            obj2 = (InterfaceC1603190roz) objLIZIZ2;
                        } else {
                            obj2 = null;
                        }
                        if ((obj2 instanceof C19EG) && (c19eg2 = (C19EG) obj2) != null) {
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C608850NuN(c19eg2, null), 3);
                            LJI = C0Z30.LIZ(c19eg2);
                            for (EnumC888580YtU enumC888580YtU2 : listLJIIJJI) {
                                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(enumC888580YtU2.getVhType()));
                                if (num != null && (iIntValue = num.intValue()) != i2) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i3 = 0; i3 < iIntValue; i3++) {
                                        if (!c19eg2.isFinishing()) {
                                            C20673215v0.LJI(enumC888580YtU2.getResId(), c19eg2);
                                        }
                                        View viewLIZJ = C20673215v0.LIZJ(enumC888580YtU2.getResId(), c19eg2);
                                        int i4 = C888610YtX.LIZ[enumC888580YtU2.ordinal()];
                                        if (i4 != 1) {
                                            if (i4 != 2) {
                                                if (i4 == 3) {
                                                    newSessionListSingleChatVH2 = new SessionListMessageRequestCellVH(viewLIZJ);
                                                } else {
                                                    throw new C1954807lC();
                                                }
                                            } else if (C298480Bmw.LIZ()) {
                                                newSessionListSingleChatVH2 = new SessionListGroupChatWithStoryVH(viewLIZJ);
                                            } else {
                                                newSessionListSingleChatVH2 = new SessionListGroupChatVH(viewLIZJ);
                                            }
                                        } else {
                                            newSessionListSingleChatVH2 = new NewSessionListSingleChatVH(viewLIZJ);
                                        }
                                        arrayList.add(newSessionListSingleChatVH2);
                                        ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZJ(C0Z3V.DIMENSION_DID, true).LJI("vh_preload", String.valueOf(newSessionListSingleChatVH2.hashCode()));
                                    }
                                    CopyOnWriteArrayList<C0Z3E> copyOnWriteArrayList = LJFF.get(Integer.valueOf(enumC888580YtU2.getVhType()));
                                    if (copyOnWriteArrayList != null) {
                                        copyOnWriteArrayList.addAll(arrayList);
                                    }
                                    i2 = -1;
                                }
                            }
                        } else {
                            C888780Yto.LIZ("no_activity", str);
                        }
                    } else {
                        List<EnumC888580YtU> listLJIIJJI2 = C1697810uHb.LJIIJJI(EnumC888580YtU.SINGLE_CHAT, EnumC888580YtU.GROUP_CHAT, EnumC888580YtU.MESSAGE_REQUEST_CELL);
                        for (EnumC888580YtU enumC888580YtU3 : listLJIIJJI2) {
                            ConcurrentHashMap<Integer, CopyOnWriteArrayList<C0Z3E>> concurrentHashMap2 = LJFF;
                            if (!concurrentHashMap2.contains(Integer.valueOf(enumC888580YtU3.getVhType()))) {
                                concurrentHashMap2.put(Integer.valueOf(enumC888580YtU3.getVhType()), new CopyOnWriteArrayList<>());
                            }
                        }
                        AbstractC883730Ylf.LJIIIIZZ.getClass();
                        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
                        if (abstractC883730YlfLJ != null) {
                            listLJIIJ = abstractC883730YlfLJ.LJIIJ(true);
                        } else {
                            listLJIIJ = C13BV.INSTANCE;
                        }
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ2 != null) {
                            objLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ();
                        } else {
                            objLIZIZ = null;
                        }
                        if (objLIZIZ instanceof InterfaceC1603190roz) {
                            obj = (InterfaceC1603190roz) objLIZIZ;
                        } else {
                            obj = null;
                        }
                        if ((obj instanceof C19EG) && (c19eg = (C19EG) obj) != null) {
                            C1DFH c1dfh2 = C0PEM.LIZ;
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C609040Nug(abstractC1387200mCcLIZIZ2, null), 3);
                            LJI = C0Z30.LIZ(c19eg);
                            for (EnumC888580YtU enumC888580YtU4 : listLJIIJJI2) {
                                if ((listLJIIJ instanceof Collection) && listLJIIJ.isEmpty()) {
                                    cacheSize = 0;
                                } else {
                                    cacheSize = 0;
                                    for (InterfaceC884440Ymo interfaceC884440Ymo : listLJIIJ) {
                                        C888590YtV c888590YtV = LIZ;
                                        InterfaceC1490905sZ<?> type = interfaceC884440Ymo.getType();
                                        c888590YtV.getClass();
                                        if (Intrinsics.LJFF(type, C882110Yj3.INSTANCE)) {
                                            i = 104;
                                        } else if (Intrinsics.LJFF(type, C1606306Qr.INSTANCE)) {
                                            i = 105;
                                        } else if (Intrinsics.LJFF(type, C878910Ydt.INSTANCE)) {
                                            i = 107;
                                        } else {
                                            i = 100;
                                        }
                                        if (i == enumC888580YtU4.getVhType() && (cacheSize = cacheSize + 1) < 0) {
                                            C1697810uHb.LJIJ();
                                            throw null;
                                        }
                                    }
                                }
                                if (cacheSize >= enumC888580YtU4.getCacheSize()) {
                                    cacheSize = enumC888580YtU4.getCacheSize();
                                }
                                for (int i5 = 0; i5 < cacheSize; i5++) {
                                    if (!c19eg.isFinishing()) {
                                        C20673215v0.LJI(enumC888580YtU4.getResId(), c19eg);
                                    }
                                    View viewLIZJ2 = C20673215v0.LIZJ(enumC888580YtU4.getResId(), c19eg);
                                    int i6 = C888610YtX.LIZ[enumC888580YtU4.ordinal()];
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            if (i6 == 3) {
                                                newSessionListSingleChatVH = new SessionListMessageRequestCellVH(viewLIZJ2);
                                            } else {
                                                throw new C1954807lC();
                                            }
                                        } else if (C298480Bmw.LIZ()) {
                                            newSessionListSingleChatVH = new SessionListGroupChatWithStoryVH(viewLIZJ2);
                                        } else {
                                            newSessionListSingleChatVH = new SessionListGroupChatVH(viewLIZJ2);
                                        }
                                    } else {
                                        newSessionListSingleChatVH = new NewSessionListSingleChatVH(viewLIZJ2);
                                    }
                                    ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZJ(C0Z3V.DIMENSION_DID, true).LJI("vh_preload", String.valueOf(newSessionListSingleChatVH.hashCode()));
                                    CopyOnWriteArrayList<C0Z3E> copyOnWriteArrayList2 = LJFF.get(Integer.valueOf(enumC888580YtU4.getVhType()));
                                    if (copyOnWriteArrayList2 != null) {
                                        copyOnWriteArrayList2.add(newSessionListSingleChatVH);
                                    }
                                }
                            }
                        } else {
                            C888780Yto.LIZ("no_activity", str);
                        }
                    }
                    ConcurrentHashMap<Integer, CopyOnWriteArrayList<C0Z3E>> concurrentHashMap3 = LJFF;
                    if (!concurrentHashMap3.isEmpty()) {
                        Iterator<Map.Entry<Integer, CopyOnWriteArrayList<C0Z3E>>> it2 = concurrentHashMap3.entrySet().iterator();
                        while (it2.hasNext()) {
                            if (!it2.next().getValue().isEmpty()) {
                                C888780Yto.LIZ("success", str);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                C888780Yto.LIZ("not_login", str);
            }
        }
    }
}
