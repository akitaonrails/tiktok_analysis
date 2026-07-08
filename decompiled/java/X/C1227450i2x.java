package X;

import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0i2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227450i2x extends C1225700i08 {
    public EnumC1227730i3P LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    public final String LJJJJL() {
        return (String) this.LLILZIL.getValue();
    }

    @Override // X.C1225700i08, X.InterfaceC1224490hyB
    public final void LJIJ(C1224590hyL c1224590hyL) throws JSONException {
        InterfaceC1226510i1R interfaceC1226510i1R;
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        super.LJIJ(c1224590hyL);
        EnumC1227730i3P enumC1227730i3P = c1224590hyL.LIZ;
        this.LLILZ = enumC1227730i3P;
        if (enumC1227730i3P == EnumC1227730i3P.MAIN && !c1224590hyL.LJ && c1224590hyL.LIZIZ && (interfaceC1226510i1R = this.LL.LIZ) != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (C1224840hyk c1224840hyk : list) {
                if (!((List) this.LLJIJIL.getValue()).contains(c1224840hyk.LLILZ)) {
                    arrayList.add(c1224840hyk);
                }
            }
            Map<String, String> mapLIZIZ = C1227170i2V.LIZIZ(arrayList);
            Map<String, String> mapLIZ = C1227170i2V.LIZ(arrayList);
            if (((Boolean) this.LLJILJIL.getValue()).booleanValue()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C1224840hyk) it2.next()).LLILZ);
                }
                LJJJJJ(arrayList2, mapLIZIZ, "", true, null, null, mapLIZ, "");
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object obj = ((C1224840hyk) it3.next()).LLJI.get("contact");
                if ((obj instanceof IMUser) && obj != null) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList3) {
                C2201941BFw c2201941BFw = IMUser.Companion;
                int followStatus = ((IMUser) obj2).getFollowStatus();
                c2201941BFw.getClass();
                if (C2201941BFw.LIZLLL(followStatus)) {
                    arrayList4.add(obj2);
                } else {
                    arrayList5.add(obj2);
                }
            }
            Pair pair = new Pair(arrayList4, arrayList5);
            List list2 = (List) pair.getFirst();
            List list3 = (List) pair.getSecond();
            ArrayList arrayList6 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                String uid = ((BaseContact) it4.next()).getUid();
                if (uid != null) {
                    arrayList6.add(uid);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                String uid2 = ((BaseContact) it5.next()).getUid();
                if (uid2 != null) {
                    arrayList7.add(uid2);
                }
            }
            Pair pair2 = new Pair(arrayList6, arrayList7);
            List<String> list4 = (List) pair2.getFirst();
            List<String> list5 = (List) pair2.getSecond();
            if ((!list4.isEmpty()) && (!list5.isEmpty())) {
                LJJJJJ(list4, mapLIZIZ, "", true, null, null, mapLIZ, "muf");
                LJJJJJ(list5, mapLIZIZ, "send_invite", false, null, Boolean.FALSE, mapLIZ, "non_muf");
            }
            if ((!list4.isEmpty()) && list5.isEmpty()) {
                LJJJJJ(list4, mapLIZIZ, "", true, null, null, mapLIZ, "muf");
            }
            if (list4.isEmpty() && (!list5.isEmpty())) {
                LJJJJJ(list5, mapLIZIZ, "send_invite", true, new C1225210hzL(this), Boolean.FALSE, mapLIZ, "non_muf");
            }
        }
    }

    @Override // X.C1225700i08, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        List<C1224840hyk> list = c1224790hyf.LIZIZ;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C1224840hyk c1224840hyk : list) {
            if (!c1224840hyk.LLJILLL) {
                arrayList.add(c1224840hyk);
            }
        }
        Object value = this.LLIZLLLIL.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool) && (interfaceC1226510i1R = this.LL.LIZ) != null) {
            interfaceC1226510i1R.LJIIZILJ(!arrayList.isEmpty(), false);
        }
        InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
        if (interfaceC1226510i1R2 != null) {
            interfaceC1226510i1R2.LJIIJJI(new C1224600hyM(EnumC1227730i3P.MAIN, Boolean.valueOf(!arrayList.isEmpty()), (String) ((Function1) this.LLJ.getValue()).invoke(Integer.valueOf(arrayList.size())), bool, (Boolean) null), false);
        }
    }

    public C1227450i2x(AbstractC1225770i0F abstractC1225770i0F, C1227610i3D c1227610i3D) {
        super(abstractC1225770i0F, c1227610i3D);
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1227610i3D, 3325));
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(abstractC1225770i0F, 3321));
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(c1227610i3D, 3322));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1227610i3D, 3326));
        this.LLJ = C452501pT.LIZIZ(new AwS420S0200000_19(abstractC1225770i0F, c1227610i3D, 207));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(c1227610i3D, 3323));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1227610i3D, 3324));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1227610i3D, 3327));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(c1227610i3D, 3328));
    }

    public final void LJJJJJ(final List<String> list, final Map<String, String> map, String str, final boolean z, final Function1<? super Integer, String> function1, Boolean bool, final Map<String, String> map2, final String str2) throws JSONException {
        Map<String, String> mapLJ;
        C873240YNm c873240YNm;
        boolean zBooleanValue = true;
        C1226910i25.LJFF(this.LLILLJJLI, this.LLILZ, true);
        C873240YNm c873240YNm2 = (C873240YNm) this.LLIZ.getValue();
        Boolean boolValueOf = null;
        if (c873240YNm2 == null || (mapLJ = c873240YNm2.LIZJ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C873240YNm c873240YNm3 = (C873240YNm) this.LLIZ.getValue();
        if (c873240YNm3 != null) {
            boolValueOf = Boolean.valueOf(c873240YNm3.LIZLLL);
        }
        C873240YNm c873240YNm4 = (C873240YNm) this.LLIZ.getValue();
        String str3 = "";
        if (c873240YNm4 != null) {
            String strLJJJJL = LJJJJL();
            if (strLJJJJL != null) {
                str3 = strLJJJJL;
            }
            List<Long> listLJFF = C866950Xzh.LJFF(list);
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
            if (str.length() > 0) {
                linkedHashMap.put("a:join_source", str);
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            }
            c873240YNm = C873240YNm.LIZ(c873240YNm4, str3, listLJFF, linkedHashMap, zBooleanValue);
        } else {
            String strLJJJJL2 = LJJJJL();
            if (strLJJJJL2 != null) {
                str3 = strLJJJJL2;
            }
            List<Long> listLJFF2 = C866950Xzh.LJFF(list);
            HashMap mapLIZ = C1229420i68.LIZ(C461720I8s.LIZJ(), str, new C900560ZUo("finish_add_member", this.LLILLJJLI.LJJJJLL().LJIIIZ().LIZJ(), this.LLILLJJLI.LJJJJLL().LJIIIZ().LIZLLL()), null, 18);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            c873240YNm = new C873240YNm(str3, listLJFF2, mapLIZ, zBooleanValue, 112);
        }
        IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
        if (iMGroupChatApiLIZ != null && iMGroupChatApiLIZ.LJJIFFI() != null) {
            C1227540i36.LJIIJ();
        }
        C0YUN.LIZIZ(c873240YNm, new InterfaceC867020Xzo<List<? extends C0YAE>>() { // from class: X.0i33
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC867020Xzo
            public final void LIZ(C868810Y6l<List<? extends C0YAE>> c868810Y6l) {
                int size;
                C19EG activity;
                int size2;
                C19EG activity2;
                C19EG activity3;
                List<? extends C0YAE> list2;
                C1227540i36 c1227540i36LJJIFFI;
                Integer numValueOf;
                C742250T9r c742250T9r = c868810Y6l.LIZJ;
                List<? extends C0YAE> list3 = c868810Y6l.LIZ;
                C0YMW c0ymw = c868810Y6l.LIZIZ;
                C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
                IMGroupChatApi iMGroupChatApiLIZ2 = c1618506Vj.LIZ();
                if (iMGroupChatApiLIZ2 != null && (c1227540i36LJJIFFI = iMGroupChatApiLIZ2.LJJIFFI()) != null) {
                    String strLJJJJL3 = this.LIZ.LJJJJL();
                    if (c0ymw != null) {
                        numValueOf = Integer.valueOf(c0ymw.getCode());
                    } else {
                        numValueOf = null;
                    }
                    c1227540i36LJJIFFI.LJIILIIL(strLJJJJL3, c742250T9r, numValueOf);
                }
                if (c742250T9r != null) {
                    List<String> list4 = list;
                    String str4 = str2;
                    IMGroupChatApi iMGroupChatApiLIZ3 = c1618506Vj.LIZ();
                    if (iMGroupChatApiLIZ3 != null && iMGroupChatApiLIZ3.LJJIFFI() != null) {
                        C1227540i36.LJIIL(new C1227650i3H(list4.size(), c742250T9r.LIZIZ - c742250T9r.LIZ, c742250T9r.LIZJ - c742250T9r.LIZIZ, C1527905yX.LIZ(Integer.valueOf(list3.size())), C0ZBV.SUCCESS, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)), str4));
                    }
                }
                if (!z) {
                    return;
                }
                if (c0ymw != null) {
                    IIMErrorUtils.LIZ.getClass();
                    IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                    if (iIMErrorUtilsLIZ != null) {
                        C0I0B.LJFF.LIZJ();
                        iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                    }
                } else {
                    Function1<Integer, String> function12 = function1;
                    if (function12 != null) {
                        if (list3 != null) {
                            size2 = list3.size();
                        } else {
                            size2 = 0;
                        }
                        String strInvoke = function12.invoke(Integer.valueOf(size2));
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LIZ.LL.LIZ;
                        if (interfaceC1226510i1R != null && (activity2 = interfaceC1226510i1R.getActivity()) != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                            c1389890mGx.LIZ(true);
                            c1389890mGx.LJIIJ(strInvoke);
                            c1389890mGx.LJIIJJI();
                        }
                    } else {
                        Function1 function13 = (Function1) this.LIZ.LLJI.getValue();
                        if (function13 != null) {
                            C1227450i2x c1227450i2x = this.LIZ;
                            if (list3 != null) {
                                size = list3.size();
                            } else {
                                size = 0;
                            }
                            String str5 = (String) function13.invoke(Integer.valueOf(size));
                            InterfaceC1226510i1R interfaceC1226510i1R2 = c1227450i2x.LL.LIZ;
                            if (interfaceC1226510i1R2 != null && (activity = interfaceC1226510i1R2.getActivity()) != null) {
                                C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                                c1389890mGx2.LIZ(true);
                                c1389890mGx2.LJIIJ(str5);
                                c1389890mGx2.LJIIJJI();
                            }
                        }
                    }
                }
                InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) this.LIZ.LLJILJILJ.getValue();
                if (interfaceC1631620sYq != null) {
                    InterfaceC1226510i1R interfaceC1226510i1R3 = this.LIZ.LL.LIZ;
                    if (interfaceC1226510i1R3 != null) {
                        activity3 = interfaceC1226510i1R3.getActivity();
                    } else {
                        activity3 = null;
                    }
                    String strLJJJJL4 = this.LIZ.LJJJJL();
                    if (strLJJJJL4 == null) {
                        strLJJJJL4 = "";
                    }
                    if (list3 == null) {
                        list2 = C13BV.INSTANCE;
                    } else {
                        list2 = list3;
                    }
                    interfaceC1631620sYq.invoke(activity3, strLJJJJL4, list2);
                } else {
                    EnterChatParams enterChatParams = new EnterChatParams(this.LIZ.LLILLJJLI.LJJJJLL().LIZIZ(), 3, this.LIZ.LJJJJL());
                    C1227450i2x c1227450i2x2 = this.LIZ;
                    enterChatParams.setNewGroupChat(true);
                    enterChatParams.setChatType(3);
                    enterChatParams.setEnterFrom(17);
                    enterChatParams.setEnterMethodForMob("live");
                    enterChatParams.setSessionId(c1227450i2x2.LJJJJL());
                    enterChatParams.setEnterFromForMob("live");
                    enterChatParams.setQuickChat(true);
                    C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
                }
                C1227450i2x c1227450i2x3 = this.LIZ;
                C1226910i25.LJFF(c1227450i2x3.LLILLJJLI, c1227450i2x3.LLILZ, false);
                InterfaceC1226510i1R interfaceC1226510i1R4 = this.LIZ.LL.LIZ;
                if (interfaceC1226510i1R4 != null) {
                    interfaceC1226510i1R4.LJIILL(C343970De7.LIZ, null);
                }
                InterfaceC1227250i2d interfaceC1227250i2d = (InterfaceC1227250i2d) this.LIZ.LLILZLL.getValue();
                if (interfaceC1227250i2d != 0) {
                    interfaceC1227250i2d.LIZJ(list3, this.LIZ.LJJJJL(), map, map2, C2097608Jq.LJIIIIZZ(new Pair("chat_type", "fan_group"), new Pair("conversation_id", String.valueOf(this.LIZ.LJJJJL()))));
                }
            }

            @Override // X.InterfaceC867020Xzo
            public final void LIZIZ(C0Y00 c0y00) {
                InterfaceC1226510i1R interfaceC1226510i1R;
                C1227540i36 c1227540i36LJJIFFI;
                C742250T9r c742250T9r = c0y00.LIZIZ;
                C0YMW c0ymw = c0y00.LIZ;
                C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
                IMGroupChatApi iMGroupChatApiLIZ2 = c1618506Vj.LIZ();
                if (iMGroupChatApiLIZ2 != null && (c1227540i36LJJIFFI = iMGroupChatApiLIZ2.LJJIFFI()) != null) {
                    c1227540i36LJJIFFI.LJIILIIL(this.LIZ.LJJJJL(), c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
                }
                if (c742250T9r != null) {
                    List<String> list2 = list;
                    String str4 = str2;
                    IMGroupChatApi iMGroupChatApiLIZ3 = c1618506Vj.LIZ();
                    if (iMGroupChatApiLIZ3 != null && iMGroupChatApiLIZ3.LJJIFFI() != null) {
                        int size = list2.size();
                        C0ZBV c0zbvLIZJ = C1232370iAt.LIZJ(c0ymw);
                        int iLIZIZ = C1232370iAt.LIZIZ(c0ymw);
                        long j = c742250T9r.LIZIZ;
                        C1227540i36.LJIIL(new C1227650i3H(size, j - c742250T9r.LIZ, c742250T9r.LIZJ - j, 0, c0zbvLIZJ, Integer.valueOf(iLIZIZ), str4));
                    }
                }
                if (!z) {
                    return;
                }
                IIMErrorUtils.LIZ.getClass();
                IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                if (iIMErrorUtilsLIZ != null) {
                    C0I0B.LJFF.LIZJ();
                    iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                }
                C1227450i2x c1227450i2x = this.LIZ;
                C1226910i25.LJFF(c1227450i2x.LLILLJJLI, c1227450i2x.LLILZ, false);
                if (C1232370iAt.LIZJ(c0ymw) == C0ZBV.SUCCESS && (interfaceC1226510i1R = this.LIZ.LL.LIZ) != null) {
                    interfaceC1226510i1R.LJIILL(C343970De7.LIZ, null);
                }
                IMGroupChatApi iMGroupChatApiLIZ4 = c1618506Vj.LIZ();
                if (iMGroupChatApiLIZ4 != null) {
                    iMGroupChatApiLIZ4.LJIILLIIL(c0ymw);
                }
                InterfaceC1227250i2d interfaceC1227250i2d = (InterfaceC1227250i2d) this.LIZ.LLILZLL.getValue();
                if (interfaceC1227250i2d != null) {
                    interfaceC1227250i2d.LIZJ(null, this.LIZ.LJJJJL(), map, map2, C2097608Jq.LJIIIIZZ(new Pair("chat_type", "fan_group"), new Pair("conversation_id", String.valueOf(this.LIZ.LJJJJL()))));
                }
            }
        });
    }
}
