package X;

import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListSectionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227460i2y extends C1225700i08 {
    public EnumC1227730i3P LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public final String LJJJJJL() {
        return (String) this.LLILZIL.getValue();
    }

    @Override // X.C1225700i08, X.InterfaceC1224490hyB
    public final void LJIJ(C1224590hyL c1224590hyL) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        int i;
        C1227460i2y c1227460i2y = this;
        super.LJIJ(c1224590hyL);
        EnumC1227730i3P enumC1227730i3P = c1224590hyL.LIZ;
        c1227460i2y.LLILZ = enumC1227730i3P;
        if (enumC1227730i3P == EnumC1227730i3P.MAIN && !c1224590hyL.LJ && c1224590hyL.LIZIZ && (interfaceC1226510i1R = c1227460i2y.LL.LIZ) != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
            ArrayList<C1224840hyk> arrayList = new ArrayList();
            for (C1224840hyk c1224840hyk : list) {
                if (!((List) c1227460i2y.LLJIJIL.getValue()).contains(c1224840hyk.LLILZ)) {
                    arrayList.add(c1224840hyk);
                }
            }
            C913630Zsn.LJIIJJI.getClass();
            C1227540i36.LIZIZ.getClass();
            C1227740i3Q c1227740i3Q = C1227540i36.LIZJ;
            C1227540i36.LIZLLL = c1227740i3Q.LIZLLL;
            c1227740i3Q.LIZLLL = false;
            Map mapLIZIZ = C1227170i2V.LIZIZ(arrayList);
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = arrayList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    Object obj = ((C1224840hyk) it2.next()).LLJI.get("member_type");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (Intrinsics.LJFF(obj, InvitationListSectionType.INVITATION_LIST_SECTION_TYPE_HARDCORE_FAN.getMemberTypeForET()) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("highly_engaged_follower_cnt", String.valueOf(i)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C1224840hyk c1224840hyk2 : arrayList) {
                Pair[] pairArr = new Pair[2];
                Object obj2 = c1224840hyk2.LLJI.get("member_type");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                Object obj3 = "";
                if (obj2 == null) {
                    obj2 = "";
                }
                pairArr[0] = new Pair("join_member_type", obj2);
                Object obj4 = c1224840hyk2.LLJI.get("member_label");
                if ((obj4 instanceof String) && obj4 != null) {
                    obj3 = obj4;
                }
                pairArr[1] = new Pair("join_member_label", obj3);
                linkedHashMap.put(c1224840hyk2.LLILZ, C2097908Jt.LIZJ(new Pair("event_track", C2097608Jq.LJIIIIZZ(pairArr))));
            }
            String strLJ = C051M.LJ(linkedHashMap, false);
            if (((Boolean) c1227460i2y.LLJILJIL.getValue()).booleanValue()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C1224840hyk) it3.next()).LLILZ);
                }
                LJJJJJ(c1227460i2y, arrayList2, mapLIZIZ, null, false, null, null, mapLIZJ, strLJ, null, 316);
                return;
            }
            Pair<List<String>, List<String>> pairLIZJ = C1225230hzN.LIZJ(arrayList);
            List<String> first = pairLIZJ.getFirst();
            List<String> second = pairLIZJ.getSecond();
            if ((!first.isEmpty()) && (!second.isEmpty())) {
                c1227460i2y = c1227460i2y;
                first = first;
                mapLIZIZ = mapLIZIZ;
                mapLIZJ = mapLIZJ;
                LJJJJJ(c1227460i2y, first, mapLIZIZ, null, false, null, null, mapLIZJ, null, "muf", 188);
                LJJJJJ(c1227460i2y, second, mapLIZIZ, "send_invite", false, null, Boolean.FALSE, null, null, "non_muf", 208);
            }
            if ((!first.isEmpty()) && second.isEmpty()) {
                LJJJJJ(c1227460i2y, first, mapLIZIZ, null, false, null, null, mapLIZJ, null, "muf", 188);
            }
            if (first.isEmpty() && (!second.isEmpty())) {
                LJJJJJ(c1227460i2y, second, mapLIZIZ, "send_invite", true, new C1225200hzK(c1227460i2y), Boolean.FALSE, mapLIZJ, null, "non_muf", 128);
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

    public C1227460i2y(C1227620i3E c1227620i3E, AbstractC1225770i0F abstractC1225770i0F) {
        super(abstractC1225770i0F, c1227620i3E);
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1227620i3E, 3088));
        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(abstractC1225770i0F, 3084));
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(c1227620i3E, 3085));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1227620i3E, 3089));
        this.LLJ = C452501pT.LIZIZ(new AwS420S0200000_19(c1227620i3E, abstractC1225770i0F, 173));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(c1227620i3E, 3086));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1227620i3E, 3087));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1227620i3E, 3090));
    }

    public static void LJJJJJ(final C1227460i2y c1227460i2y, final List list, final Map map, String str, boolean z, C1225200hzK c1225200hzK, Boolean bool, Map map2, String str2, String str3, int i) {
        Map<String, String> mapLJ;
        boolean zBooleanValue;
        C873240YNm c873240YNm;
        boolean zBooleanValue2;
        final String str4 = str3;
        final Map mapLJ2 = map2;
        final C1225200hzK c1225200hzK2 = c1225200hzK;
        final boolean z2 = z;
        String str5 = str2;
        String str6 = str;
        String str7 = "";
        if ((i & 4) != 0) {
            str6 = "";
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        Boolean boolValueOf = null;
        if ((i & 16) != 0) {
            c1225200hzK2 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            mapLJ2 = C2097608Jq.LJ();
        }
        if ((i & 128) != 0) {
            str5 = "";
        }
        if ((i & 256) != 0) {
            str4 = "";
        }
        C1226140i0q.LIZJ(c1227460i2y.LLILLJJLI, c1227460i2y.LLILZ, true);
        C873240YNm c873240YNm2 = (C873240YNm) c1227460i2y.LLIZ.getValue();
        if (c873240YNm2 == null || (mapLJ = c873240YNm2.LIZJ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C873240YNm c873240YNm3 = (C873240YNm) c1227460i2y.LLIZ.getValue();
        if (c873240YNm3 != null) {
            boolValueOf = Boolean.valueOf(c873240YNm3.LIZLLL);
        }
        C873240YNm c873240YNm4 = (C873240YNm) c1227460i2y.LLIZ.getValue();
        if (c873240YNm4 != null) {
            String strLJJJJJL = c1227460i2y.LJJJJJL();
            if (strLJJJJJL != null) {
                str7 = strLJJJJJL;
            }
            List<Long> listLJFF = C866950Xzh.LJFF(list);
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
            if (str6.length() > 0) {
                linkedHashMap.put("a:join_source", str6);
            }
            if (str5.length() > 0) {
                linkedHashMap.put("invitee_join_info_map", str5);
            }
            if (bool != null) {
                zBooleanValue2 = bool.booleanValue();
            } else if (boolValueOf != null) {
                zBooleanValue2 = boolValueOf.booleanValue();
            } else {
                zBooleanValue2 = true;
            }
            c873240YNm = C873240YNm.LIZ(c873240YNm4, str7, listLJFF, linkedHashMap, zBooleanValue2);
        } else {
            String strLJJJJJL2 = c1227460i2y.LJJJJJL();
            if (strLJJJJJL2 == null) {
                strLJJJJJL2 = "";
            }
            List<Long> listLJFF2 = C866950Xzh.LJFF(list);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C1229420i68.LIZ(C461720I8s.LIZJ(), str6, new C900560ZUo("finish_add_member", c1227460i2y.LLILLJJLI.LJJJJLL().LJIIIZ().LIZJ(), c1227460i2y.LLILLJJLI.LJJJJLL().LJIIIZ().LIZLLL()), null, 18));
            if (str5.length() > 0) {
                linkedHashMap2.put("invitee_join_info_map", str5);
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = true;
            }
            c873240YNm = new C873240YNm(strLJJJJJL2, listLJFF2, linkedHashMap2, zBooleanValue, 112);
        }
        C913630Zsn.LJIIJJI.getClass();
        C1227540i36.LJIIJ();
        C0YUN.LIZIZ(c873240YNm, new InterfaceC867020Xzo<List<? extends C0YAE>>() { // from class: X.0i32
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC867020Xzo
            public final void LIZ(C868810Y6l<List<? extends C0YAE>> c868810Y6l) {
                Integer numValueOf;
                C19EG activity;
                C19EG activity2;
                C742250T9r c742250T9r = c868810Y6l.LIZJ;
                List<? extends C0YAE> list2 = c868810Y6l.LIZ;
                C0YMW c0ymw = c868810Y6l.LIZIZ;
                C913630Zsn.LJIIJJI.getClass();
                C1227540i36 c1227540i36 = C1227540i36.LIZIZ;
                String strLJJJJJL3 = this.LIZ.LJJJJJL();
                if (c0ymw != null) {
                    numValueOf = Integer.valueOf(c0ymw.getCode());
                } else {
                    numValueOf = null;
                }
                c1227540i36.LJIILIIL(strLJJJJJL3, c742250T9r, numValueOf);
                if (c742250T9r != null) {
                    List<String> list3 = list;
                    String str8 = str4;
                    C1227540i36.LJIIL(new C1227650i3H(list3.size(), c742250T9r.LIZIZ - c742250T9r.LIZ, c742250T9r.LIZJ - c742250T9r.LIZIZ, C1527905yX.LIZ(Integer.valueOf(list2.size())), C0ZBV.SUCCESS, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)), str8));
                }
                if (!z2) {
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
                    Function1<Integer, String> function1 = c1225200hzK2;
                    if (function1 != null) {
                        String strInvoke = function1.invoke(Integer.valueOf(list2.size()));
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LIZ.LL.LIZ;
                        if (interfaceC1226510i1R != null && (activity2 = interfaceC1226510i1R.getActivity()) != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                            c1389890mGx.LIZ(true);
                            c1389890mGx.LJIIJ(strInvoke);
                            c1389890mGx.LJIIJJI();
                        }
                    } else {
                        Function1 function12 = (Function1) this.LIZ.LLJI.getValue();
                        C1227460i2y c1227460i2y2 = this.LIZ;
                        String str9 = (String) function12.invoke(Integer.valueOf(list2.size()));
                        InterfaceC1226510i1R interfaceC1226510i1R2 = c1227460i2y2.LL.LIZ;
                        if (interfaceC1226510i1R2 != null && (activity = interfaceC1226510i1R2.getActivity()) != null) {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                            c1389890mGx2.LIZ(true);
                            c1389890mGx2.LJIIJ(str9);
                            c1389890mGx2.LJIIJJI();
                        }
                    }
                }
                C1227460i2y c1227460i2y3 = this.LIZ;
                C1226140i0q.LIZJ(c1227460i2y3.LLILLJJLI, c1227460i2y3.LLILZ, false);
                InterfaceC1226510i1R interfaceC1226510i1R3 = this.LIZ.LL.LIZ;
                if (interfaceC1226510i1R3 != null) {
                    interfaceC1226510i1R3.LJIILL(C343970De7.LIZ, null);
                }
                ((C1227050i2J) this.LIZ.LLILZLL.getValue()).LIZJ(list2, this.LIZ.LJJJJJL(), map, null, mapLJ2);
            }

            @Override // X.InterfaceC867020Xzo
            public final void LIZIZ(C0Y00 c0y00) {
                InterfaceC1226510i1R interfaceC1226510i1R;
                C742250T9r c742250T9r = c0y00.LIZIZ;
                C0YMW c0ymw = c0y00.LIZ;
                C913630Zsn c913630Zsn = C913630Zsn.LJIIJJI;
                c913630Zsn.getClass();
                C1227540i36.LIZIZ.LJIILIIL(this.LIZ.LJJJJJL(), c742250T9r, Integer.valueOf(C1232370iAt.LIZIZ(c0ymw)));
                if (c742250T9r != null) {
                    List<String> list2 = list;
                    String str8 = str4;
                    int size = list2.size();
                    C0ZBV c0zbvLIZJ = C1232370iAt.LIZJ(c0ymw);
                    int iLIZIZ = C1232370iAt.LIZIZ(c0ymw);
                    long j = c742250T9r.LIZIZ;
                    C1227540i36.LJIIL(new C1227650i3H(size, j - c742250T9r.LIZ, c742250T9r.LIZJ - j, 0, c0zbvLIZJ, Integer.valueOf(iLIZIZ), str8));
                }
                if (!z2) {
                    return;
                }
                IIMErrorUtils.LIZ.getClass();
                IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                if (iIMErrorUtilsLIZ != null) {
                    C0I0B.LJFF.LIZJ();
                    iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                }
                C1227460i2y c1227460i2y2 = this.LIZ;
                C1226140i0q.LIZJ(c1227460i2y2.LLILLJJLI, c1227460i2y2.LLILZ, false);
                if (C1232370iAt.LIZJ(c0ymw) == C0ZBV.SUCCESS && (interfaceC1226510i1R = this.LIZ.LL.LIZ) != null) {
                    interfaceC1226510i1R.LJIILL(C343970De7.LIZ, null);
                }
                c913630Zsn.LJIILLIIL(c0ymw);
                ((C1227050i2J) this.LIZ.LLILZLL.getValue()).LIZJ(null, this.LIZ.LJJJJJL(), map, null, mapLJ2);
            }
        });
    }
}
