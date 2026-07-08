package X;

import Y.AComparatorS34S0000000_15;
import android.util.Base64;
import com.bytedance.android.live.liveinteract.multihost.biz.link.layout.CoHostLayoutExtra;
import com.bytedance.android.live.liveinteract.multihost.biz.link.layout.CoHostWindowLayoutExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutWindowExtra;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostLayoutExtraDecodeOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostLayoutExtraPBSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostLayoutSortAnchorByPositionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostSpotIdContinuousBugfix;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Charsets;
import tikcast.linkmic.common.CohostTypeLayoutExtra;
import tikcast.linkmic.common.CohostTypeSpotExtra;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0b25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957830b25 {
    public static List LJFF() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : LIZLLL()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            long j = ((long) i) + 1;
            PosIdentity posIdentity = new PosIdentity();
            posIdentity.type = 1;
            String str = ((LinkUser) obj).linkMicId;
            posIdentity.value = str == null ? "" : str;
            arrayList.add(new C956260azY(new C957030b0n(j, posIdentity, null, 56), str));
            i = i2;
        }
        return arrayList;
    }

    public static List LIZLLL() {
        List<LinkUser> listLJJIJ = C915980Zwa.LJII().LJJIJ();
        return CoHostLayoutSortAnchorByPositionSetting.INSTANCE.isEnable() ? C13LP.LJLLLL(new AComparatorS34S0000000_15(17), listLJJIJ) : listLJJIJ;
    }

    public static Pair LJ() {
        ContentPosition contentPosition;
        int size = C915980Zwa.LJII().LJJIJ().size();
        long jLJJL = C915980Zwa.LJII().LJJL();
        if (jLJJL == 0) {
            C20441214yg.LIZIZ("CoHostLayoutDataCenter", "getLayoutIdByPositionType no display stream user");
            if (C915980Zwa.LJII().LJJLIIIJJI()) {
                return new Pair("cohost_with_guest_6", "2200");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cohost_normal_expand_");
            sbLIZ.append(size);
            return new Pair(C2188811AlT.LIZIZ(sbLIZ), "200201");
        }
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(jLJJL);
        int type = (c954460aweLLILL == null || (contentPosition = c954460aweLLILL.LJJIFFI) == null) ? EnumC954790axB.UNKNOWN.getType() : contentPosition.contentType;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getLayoutIdByPositionType posContentType = ");
        sbLIZ2.append(type);
        sbLIZ2.append(", linkedUserSize = ");
        sbLIZ2.append(size);
        C20441214yg.LIZIZ("CoHostLayoutDataCenter", C2188811AlT.LIZIZ(sbLIZ2));
        String str = null;
        if (type == EnumC954790axB.LIVE_STUDIO_STREAM_PORTRAIT.getType()) {
            if (size == 2) {
                str = "2007";
            } else if (size == 3) {
                str = "2008";
            } else if (size == 4) {
                str = "2009";
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cohost_aux_");
            sbLIZ3.append(size);
            sbLIZ3.append("_hosts_portrait_");
            sbLIZ3.append(size + 1);
            return new Pair(C2188811AlT.LIZIZ(sbLIZ3), str != null ? str : "");
        }
        if (type != EnumC954790axB.LIVE_STUDIO_STREAM_LANDSCAPE.getType()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cohost_normal_expand_");
            sbLIZ4.append(size);
            return new Pair(C2188811AlT.LIZIZ(sbLIZ4), "200201");
        }
        if (size == 2) {
            str = "2004";
        } else if (size == 3) {
            str = "2005";
        } else if (size == 4) {
            str = "2006";
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("cohost_aux_");
        sbLIZ5.append(size);
        sbLIZ5.append("_hosts_landscape_");
        sbLIZ5.append(size + 1);
        return new Pair(C2188811AlT.LIZIZ(sbLIZ5), str != null ? str : "");
    }

    public static Pair LJI() {
        ContentPosition contentPosition;
        int size = C915980Zwa.LJII().LJJIJ().size();
        if (C915980Zwa.LJFF().co0() && C970370bMJ.LJIIIIZZ() && size >= 3) {
            int iLIZJ = C970370bMJ.LIZJ();
            if (iLIZJ == 3 || iLIZJ == 4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cohost_1vn_");
                sbLIZ.append(size);
                return new Pair(C2188811AlT.LIZIZ(sbLIZ), "2030");
            }
            if (iLIZJ == 30 || iLIZJ == 40) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cohost_nv1_");
                sbLIZ2.append(size);
                return new Pair(C2188811AlT.LIZIZ(sbLIZ2), "2031");
            }
        }
        long jLJJL = C915980Zwa.LJII().LJJL();
        if (jLJJL == 0) {
            C20441214yg.LIZIZ("CoHostLayoutDataCenter", "getLayoutIdByPositionType no display stream user");
            if (C915980Zwa.LJII().LJJLIIIJJI()) {
                return new Pair("cohost_with_guest_6", "2200");
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cohost_normal_expand_");
            sbLIZ3.append(size);
            return new Pair(C2188811AlT.LIZIZ(sbLIZ3), "200201");
        }
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(jLJJL);
        int type = (c954460aweLLILL == null || (contentPosition = c954460aweLLILL.LJJIFFI) == null) ? EnumC954790axB.UNKNOWN.getType() : contentPosition.contentType;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("getLayoutIdByPositionType posContentType = ");
        sbLIZ4.append(type);
        sbLIZ4.append(", linkedUserSize = ");
        sbLIZ4.append(size);
        C20441214yg.LIZIZ("CoHostLayoutDataCenter", C2188811AlT.LIZIZ(sbLIZ4));
        String str = null;
        if (type == EnumC954790axB.LIVE_STUDIO_STREAM_PORTRAIT.getType()) {
            if (size == 2) {
                str = "2007";
            } else if (size == 3) {
                str = "2008";
            } else if (size == 4) {
                str = "2009";
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("cohost_aux_");
            sbLIZ5.append(size);
            sbLIZ5.append("_hosts_portrait_");
            sbLIZ5.append(size + 1);
            return new Pair(C2188811AlT.LIZIZ(sbLIZ5), str != null ? str : "");
        }
        if (type != EnumC954790axB.LIVE_STUDIO_STREAM_LANDSCAPE.getType()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("cohost_normal_expand_");
            sbLIZ6.append(size);
            return new Pair(C2188811AlT.LIZIZ(sbLIZ6), "200201");
        }
        if (size == 2) {
            str = "2004";
        } else if (size == 3) {
            str = "2005";
        } else if (size == 4) {
            str = "2006";
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("cohost_aux_");
        sbLIZ7.append(size);
        sbLIZ7.append("_hosts_landscape_");
        sbLIZ7.append(size + 1);
        return new Pair(C2188811AlT.LIZIZ(sbLIZ7), str != null ? str : "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    public static List LJIIIIZZ() {
        ?? LJFF;
        LinkUser next;
        ContentPosition contentPosition;
        int i;
        String str;
        String str2;
        String str3;
        if (C915980Zwa.LJII().LJJLIIIJJI()) {
            LJFF = new ArrayList();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room roomLJJLI = C500260Jjc.LJJLI();
            long id = roomLJJLI != null ? roomLJJLI.getId() : 0L;
            List<LinkUser> listLLLLIILL = C915980Zwa.LJII().LLLLIILL();
            List<LinkUser> listLIZIZ = C948780anU.LIZIZ(listLLLLIILL);
            List<LinkUser> listLIZ = C948780anU.LIZ(listLLLLIILL);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZ) {
                Long l = ((LinkUser) obj).roomId;
                if (l != null && l.longValue() == id) {
                    arrayList.add(obj);
                }
            }
            List<LinkUser> listLIZ2 = C948780anU.LIZ(listLLLLIILL);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (ArrayList) listLIZ2) {
                Long l2 = ((LinkUser) obj2).roomId;
                if (l2 == null || l2.longValue() != id) {
                    arrayList2.add(obj2);
                }
            }
            int i2 = 0;
            do {
                LinkUser linkUser = (LinkUser) C13LP.LJJJLZIJ(i2, listLIZIZ);
                if (linkUser != null && (str3 = linkUser.linkMicId) != null) {
                    PosIdentity posIdentity = new PosIdentity();
                    posIdentity.type = 1;
                    posIdentity.value = str3;
                    LJFF.add(new C956260azY(new C957030b0n(((long) i2) + 1, posIdentity, null, 56), str3));
                }
                i2++;
            } while (i2 < 2);
            int i3 = 2;
            while (true) {
                i = 4;
                if (i3 >= 4) {
                    break;
                }
                LinkUser linkUser2 = (LinkUser) C13LP.LJJJLZIJ(i3 - 2, arrayList);
                if (linkUser2 == null || (str2 = linkUser2.linkMicId) == null) {
                    PosIdentity posIdentity2 = new PosIdentity();
                    posIdentity2.type = 0;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("empty_slot_multi_guest_");
                    sbLIZ.append(i3 + 1);
                    posIdentity2.value = C2188811AlT.LIZIZ(sbLIZ);
                    LJFF.add(new C956260azY(new C957030b0n(((long) i3) + 1, posIdentity2, null, 56), null));
                } else {
                    PosIdentity posIdentity3 = new PosIdentity();
                    posIdentity3.type = 1;
                    posIdentity3.value = str2;
                    LJFF.add(new C956260azY(new C957030b0n(((long) i3) + 1, posIdentity3, null, 56), str2));
                }
                i3++;
            }
            do {
                LinkUser linkUser3 = (LinkUser) C13LP.LJJJLZIJ(i - 4, arrayList2);
                if (linkUser3 == null || (str = linkUser3.linkMicId) == null) {
                    PosIdentity posIdentity4 = new PosIdentity();
                    posIdentity4.type = 0;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("empty_slot_multi_guest_");
                    sbLIZ2.append(i + 1);
                    posIdentity4.value = C2188811AlT.LIZIZ(sbLIZ2);
                    LJFF.add(new C956260azY(new C957030b0n(((long) i) + 1, posIdentity4, null, 56), null));
                } else {
                    PosIdentity posIdentity5 = new PosIdentity();
                    posIdentity5.type = 1;
                    posIdentity5.value = str;
                    LJFF.add(new C956260azY(new C957030b0n(((long) i) + 1, posIdentity5, null, 56), str));
                }
                i++;
            } while (i < 6);
        } else {
            LJFF = LJFF();
        }
        String strLLJJ = C915980Zwa.LJII().LLJJ();
        if (C1533950q1J.LJ(strLLJJ)) {
            long jLJJL = C915980Zwa.LJII().LJJL();
            Iterator<LinkUser> it2 = C915980Zwa.LJII().LLLLIILL().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Long l3 = next.userId;
                if (l3 != null && l3.longValue() == jLJJL) {
                    break;
                }
            }
            LinkUser linkUser4 = next;
            String str4 = linkUser4 != null ? linkUser4.linkMicId : null;
            int size = LJFF.size();
            C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(jLJJL);
            int type = (c954460aweLLILL == null || (contentPosition = c954460aweLLILL.LJJIFFI) == null) ? EnumC954790axB.UNKNOWN.getType() : contentPosition.contentType;
            PosIdentity posIdentity6 = new PosIdentity();
            posIdentity6.type = 2;
            posIdentity6.value = strLLJJ;
            CohostLayoutWindowExtra cohostLayoutWindowExtra = new CohostLayoutWindowExtra();
            cohostLayoutWindowExtra.contentType = type;
            LJFF.add(new C956260azY(new C957030b0n(((long) size) + 1, posIdentity6, LIZIZ(cohostLayoutWindowExtra), 48), str4));
        }
        return LJFF;
    }

    public static String LIZ(CohostLayoutExtra cohostLayoutExtra) {
        InterfaceC940060aZQ interfaceC940060aZQ;
        if (CoHostLayoutExtraPBSetting.INSTANCE.isEnable()) {
            CohostLayoutExtra cohostLayoutExtra2 = new CohostLayoutExtra();
            cohostLayoutExtra2.offsetY = cohostLayoutExtra.offsetY;
            cohostLayoutExtra2.isZoomLayout = cohostLayoutExtra.isZoomLayout;
            cohostLayoutExtra2.scene = cohostLayoutExtra.scene;
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = null;
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
            }
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                interfaceC940060aZQ.LJJLI();
                C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                String strLIZJ = C973010bQZ.LIZJ(cohostLayoutExtra2);
                if (strLIZJ != null) {
                    return strLIZJ;
                }
            }
            return "";
        }
        String strLIZIZ = C20485080t.LIZIZ(new CoHostLayoutExtra(cohostLayoutExtra.offsetY, cohostLayoutExtra.isZoomLayout, cohostLayoutExtra.scene));
        if (strLIZIZ == null) {
            return "";
        }
        return Base64.encodeToString(strLIZIZ.getBytes(Charsets.UTF_8), 2);
    }

    public static String LIZIZ(CohostLayoutWindowExtra cohostLayoutWindowExtra) {
        InterfaceC940060aZQ interfaceC940060aZQ;
        if (CoHostLayoutExtraPBSetting.INSTANCE.isEnable()) {
            CohostLayoutWindowExtra cohostLayoutWindowExtra2 = new CohostLayoutWindowExtra();
            cohostLayoutWindowExtra2.contentType = cohostLayoutWindowExtra.contentType;
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = null;
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
            }
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                interfaceC940060aZQ.LJJLI();
                C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                String strLIZLLL = C973010bQZ.LIZLLL(cohostLayoutWindowExtra2);
                if (strLIZLLL != null) {
                    return strLIZLLL;
                }
            }
            return "";
        }
        String strLIZIZ = C20485080t.LIZIZ(new CoHostWindowLayoutExtra(cohostLayoutWindowExtra.contentType));
        if (strLIZIZ == null) {
            return "";
        }
        return Base64.encodeToString(strLIZIZ.getBytes(Charsets.UTF_8), 2);
    }

    public static String LIZJ(String str) {
        return new String(Base64.decode(str, 2), Charsets.UTF_8);
    }

    public static List LJII(List list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<LinkUser> listLJJIJ = C915980Zwa.LJII().LJJIJ();
            if (CoHostSpotIdContinuousBugfix.INSTANCE.isEnable() && listLJJIJ.size() < list.size()) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSpotListByBusinessUserList, anchorList.size=");
            sbLIZ.append(listLJJIJ.size());
            sbLIZ.append(", businessUserList.size=");
            sbLIZ.append(list.size());
            sbLIZ.append(", useCompactSpotId=");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("CoHostLayoutDataCenter", C2188811AlT.LIZIZ(sbLIZ));
            int size = 0;
            for (Object obj : list) {
                int i = size + 1;
                LinkUser linkUser = null;
                if (size >= 0) {
                    long jLongValue = ((Number) obj).longValue();
                    Iterator<LinkUser> it2 = listLJJIJ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        LinkUser next = it2.next();
                        Long l = next.userId;
                        if (l != null && l.longValue() == jLongValue) {
                            linkUser = next;
                            break;
                        }
                    }
                    LinkUser linkUser2 = linkUser;
                    if (linkUser2 != null) {
                        if (z) {
                            size = arrayList.size();
                        }
                        PosIdentity posIdentity = new PosIdentity();
                        posIdentity.type = 1;
                        posIdentity.value = String.valueOf(linkUser2.linkMicId);
                        arrayList.add(new C956260azY(new C957030b0n(((long) size) + 1, posIdentity, null, 56), linkUser2.linkMicId));
                    }
                    size = i;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJIIJ(java.util.List r10) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            long r8 = X.C950220apo.LJ()
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            X.0awC r0 = r0.LJIIIZ()
            r4 = 0
            if (r0 == 0) goto L90
            java.util.List r0 = r0.LIZLLL()
            if (r0 == 0) goto L90
            java.util.Iterator r7 = r0.iterator()
        L23:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r6 = r7.next()
            r0 = r6
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            java.lang.Long r0 = r0.userId
            if (r0 == 0) goto L23
            long r1 = r0.longValue()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L23
        L3c:
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r6 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r6
            if (r6 == 0) goto L90
            java.lang.String r6 = r6.linkMicId
        L42:
            java.util.Iterator r2 = r10.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0azY r0 = (X.C956260azY) r0
            X.0b0n r0 = r0.LIZIZ
            tikcast.linkmic.common.PosIdentity r0 = r0.LIZIZ
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.value
        L5b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L46
            if (r6 == 0) goto L46
            r4 = r1
            if (r1 == 0) goto L69
            r5.add(r1)
        L69:
            Y.AComparatorS34S0000000_15 r1 = new Y.AComparatorS34S0000000_15
            r0 = 18
            r1.<init>(r0)
            java.util.List r0 = X.C13LP.LJLLLL(r1, r10)
            java.util.Iterator r2 = r0.iterator()
        L78:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 != 0) goto L78
            r5.add(r1)
            goto L78
        L8c:
            r0 = r4
            goto L5b
        L8e:
            r6 = r4
            goto L3c
        L90:
            r6 = r4
            goto L42
        L92:
            java.util.Iterator r1 = r5.iterator()
        L96:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r1.next()
            X.0azY r0 = (X.C956260azY) r0
            X.0b0n r0 = r0.LIZIZ
            tikcast.linkmic.common.PosIdentity r0 = r0.LIZIZ
            if (r0 == 0) goto L96
            r3.add(r0)
            goto L96
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C957830b25.LJIIJ(java.util.List):java.util.List");
    }

    public static CohostLayoutExtra LJIIJJI(String str) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC940060aZQ interfaceC940060aZQ;
        CohostLayoutExtra cohostLayoutExtraLIZ;
        if (str != null) {
            try {
                if (CoHostLayoutExtraDecodeOpt.isEnable()) {
                    cohostLayoutExtraLIZ = (CohostLayoutExtra) C1516000pYM.LIZIZ(Base64.decode(str, 2), CohostLayoutExtra.class);
                } else {
                    InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ != null) {
                        interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
                    } else {
                        interfaceC937900aVwLLIIJLIL = null;
                    }
                    if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                        interfaceC940060aZQ.LJJLI();
                        C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                        cohostLayoutExtraLIZ = C973010bQZ.LIZ(str);
                    }
                    CoHostLayoutExtra coHostLayoutExtra = (CoHostLayoutExtra) C20485080t.LIZ(LIZJ(str), CoHostLayoutExtra.class);
                    CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
                    cohostLayoutExtra.offsetY = coHostLayoutExtra.offsetY;
                    cohostLayoutExtra.isZoomLayout = coHostLayoutExtra.isZoomLayout;
                    cohostLayoutExtra.scene = coHostLayoutExtra.scene;
                    return cohostLayoutExtra;
                }
                if (cohostLayoutExtraLIZ != null) {
                    return cohostLayoutExtraLIZ;
                }
                CoHostLayoutExtra coHostLayoutExtra2 = (CoHostLayoutExtra) C20485080t.LIZ(LIZJ(str), CoHostLayoutExtra.class);
                CohostLayoutExtra cohostLayoutExtra2 = new CohostLayoutExtra();
                cohostLayoutExtra2.offsetY = coHostLayoutExtra2.offsetY;
                cohostLayoutExtra2.isZoomLayout = coHostLayoutExtra2.isZoomLayout;
                cohostLayoutExtra2.scene = coHostLayoutExtra2.scene;
                return cohostLayoutExtra2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static CohostTypeLayoutExtra LJIIL(String str) {
        if (str != null) {
            try {
                CohostTypeLayoutExtra cohostTypeLayoutExtra = (CohostTypeLayoutExtra) C1516000pYM.LIZIZ(Base64.decode(str, 2), CohostTypeLayoutExtra.class);
                if (cohostTypeLayoutExtra != null) {
                    return cohostTypeLayoutExtra;
                }
                return (CohostTypeLayoutExtra) C20485080t.LIZ(LIZJ(str), CohostTypeLayoutExtra.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static CohostTypeSpotExtra LJIILIIL(String str) {
        if (str != null) {
            try {
                CohostTypeSpotExtra cohostTypeSpotExtra = (CohostTypeSpotExtra) C1516000pYM.LIZIZ(Base64.decode(str, 2), CohostTypeSpotExtra.class);
                if (cohostTypeSpotExtra != null) {
                    return cohostTypeSpotExtra;
                }
                return (CohostTypeSpotExtra) C20485080t.LIZ(LIZJ(str), CohostTypeSpotExtra.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static CohostLayoutWindowExtra LJIILJJIL(String str) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC940060aZQ interfaceC940060aZQ;
        CohostLayoutWindowExtra cohostLayoutWindowExtraLIZIZ;
        if (str != null) {
            try {
                if (CoHostLayoutExtraDecodeOpt.isEnable()) {
                    cohostLayoutWindowExtraLIZIZ = (CohostLayoutWindowExtra) C1516000pYM.LIZIZ(Base64.decode(str, 2), CohostLayoutWindowExtra.class);
                } else {
                    InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ != null) {
                        interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
                    } else {
                        interfaceC937900aVwLLIIJLIL = null;
                    }
                    if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                        interfaceC940060aZQ.LJJLI();
                        C973010bQZ c973010bQZ = C973010bQZ.LIZ;
                        cohostLayoutWindowExtraLIZIZ = C973010bQZ.LIZIZ(str);
                    }
                    CoHostWindowLayoutExtra coHostWindowLayoutExtra = (CoHostWindowLayoutExtra) C20485080t.LIZ(LIZJ(str), CoHostWindowLayoutExtra.class);
                    CohostLayoutWindowExtra cohostLayoutWindowExtra = new CohostLayoutWindowExtra();
                    cohostLayoutWindowExtra.contentType = coHostWindowLayoutExtra.contentType;
                    return cohostLayoutWindowExtra;
                }
                if (cohostLayoutWindowExtraLIZIZ != null) {
                    return cohostLayoutWindowExtraLIZIZ;
                }
                CoHostWindowLayoutExtra coHostWindowLayoutExtra2 = (CoHostWindowLayoutExtra) C20485080t.LIZ(LIZJ(str), CoHostWindowLayoutExtra.class);
                CohostLayoutWindowExtra cohostLayoutWindowExtra2 = new CohostLayoutWindowExtra();
                cohostLayoutWindowExtra2.contentType = coHostWindowLayoutExtra2.contentType;
                return cohostLayoutWindowExtra2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static String LJIIIZ(List list, boolean z) {
        int size;
        if (z) {
            if (list != null && !list.isEmpty()) {
                size = list.size();
            } else {
                C20441214yg.LJ("TakeStageLayoutKey", "Given bizUserList is empty. Use Sdk as fallback");
                size = C915980Zwa.LJII().LJJIJ().size();
            }
        } else {
            size = C915980Zwa.LJII().LJJIJ().size();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cohost_take_stage_v2_");
        sbLIZ.append(size);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
