package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestKaraokeOptWaitingUsrUpdateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0aJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930320aJi {
    public static int LIZ;

    public static void LIZ(C410901il c410901il) {
        if (c410901il.size() == 0) {
            C930480aJy.LIZ.getClass();
            if (C930480aJy.LJIJ()) {
                LinkPlayerInfo linkPlayerInfoLJIIJ = C930480aJy.LJIIJ();
                if (linkPlayerInfoLJIIJ != null) {
                    c410901il.add(linkPlayerInfoLJIIJ);
                    return;
                }
                return;
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null) {
                return;
            }
            LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
            linkPlayerInfo.LIZ = 2;
            User owner = room.getOwner();
            if (owner == null) {
                return;
            }
            linkPlayerInfo.mUser = owner;
            c410901il.add(linkPlayerInfo);
        }
    }

    public static int LIZLLL(C410901il c410901il) {
        int i;
        ListIterator<Object> listIterator = c410901il.listIterator(c410901il.size());
        while (true) {
            i = 0;
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if ((objPrevious instanceof LinkPlayerInfo) && (((LinkPlayerInfo) objPrevious).LIZIZ == 1 || ((LinkPlayerInfo) objPrevious).LIZIZ == 0)) {
                break;
            }
        }
        int iNextIndex = listIterator.nextIndex();
        if (iNextIndex != -1) {
            i = iNextIndex;
        }
        return i + LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = LIZJ(10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0 != (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r3 = r9.listIterator(r9.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r3.hasPrevious() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2 = r3.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if ((r2 instanceof com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (((com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r2).LIZIZ == 3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if ((r2 instanceof X.C929230aHx) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (((X.C929230aHx) r2).LIZ != 3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r3 = r3.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r3 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r4 = new X.C443120HZe(java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (LJIIIZ(7, r9) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        return new X.C443120HZe(java.lang.Integer.valueOf(((java.lang.Number) r4.getFirst()).intValue() + r8), -1, java.lang.Integer.valueOf(((java.lang.Number) r4.getFirst()).intValue() + r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        r3 = LJFF(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r3 != (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r7 = LJII(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (LJIIIZ(2, r9) != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        r4 = new X.C443120HZe(java.lang.Integer.valueOf(((java.lang.Number) r7.getFirst()).intValue() + r3), -1, java.lang.Integer.valueOf(((java.lang.Number) r7.getFirst()).intValue() + r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        r4 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C443120HZe LJ(X.C410901il r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C930320aJi.LJ(X.01il):X.0HZe");
    }

    public static int LJFF(C410901il c410901il) {
        int i = 0;
        for (Object obj : c410901il) {
            if ((obj instanceof C930130aJP) && ((C930130aJP) obj).LIZIZ == 1) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int LJI(C410901il c410901il) {
        int i = 0;
        for (Object obj : c410901il) {
            if ((obj instanceof C930130aJP) && ((C930130aJP) obj).LIZIZ == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static C443120HZe LJII(C410901il c410901il) {
        int iNextIndex;
        ListIterator<Object> listIterator = c410901il.listIterator(c410901il.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if ((objPrevious instanceof LinkPlayerInfo) && ((LinkPlayerInfo) objPrevious).LIZIZ == 2) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        int iLJI = LJI(c410901il);
        if (iNextIndex == -1) {
            if (iLJI == -1) {
                int iLIZLLL = LIZLLL(c410901il);
                return new C443120HZe(Integer.valueOf(iLIZLLL), -1, Integer.valueOf(iLIZLLL));
            }
            iNextIndex = iLJI;
        }
        return new C443120HZe(Integer.valueOf(iNextIndex), Integer.valueOf(iLJI), Integer.valueOf(iNextIndex));
    }

    public static String LJIIJ(LinkPlayerInfo linkPlayerInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(linkPlayerInfo.mUser.getId());
        sbLIZ.append('_');
        sbLIZ.append(linkPlayerInfo.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(linkPlayerInfo.mRoleType);
        sbLIZ.append('_');
        sbLIZ.append(linkPlayerInfo.mModifyTime);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MultiGuestUpdateUserInfoHelper_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LIZJ(int i, C410901il c410901il) {
        int i2 = 0;
        for (Object obj : c410901il) {
            if ((obj instanceof C930130aJP) && ((C930130aJP) obj).LIZIZ == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int LJIIIIZZ(int i, C410901il c410901il) {
        int i2 = 0;
        for (Object obj : c410901il) {
            if ((obj instanceof C929230aHx) && ((C929230aHx) obj).LIZ == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int LJIIIZ(int i, C410901il c410901il) {
        int i2 = 0;
        for (Object obj : c410901il) {
            if ((obj instanceof C929230aHx) && ((C929230aHx) obj).LIZ == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int LJIIJJI(List list, List list2) {
        int size;
        int size2 = 0;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (list2 != null) {
            size2 = list2.size();
        }
        return size + size2;
    }

    public static Map LIZIZ(C410901il c410901il, List list, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<Object> it2 = c410901il.iterator();
        while (it2.hasNext()) {
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) it2.next();
            linkedHashMap2.put(LJIIJ(linkPlayerInfo), new Pair(linkPlayerInfo, 1));
        }
        if (list != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) it3.next();
                String strLJIIJ = LJIIJ(linkPlayerInfo2);
                Pair pair = (Pair) linkedHashMap2.get(strLJIIJ);
                if (pair != null) {
                    if (MultiGuestKaraokeOptWaitingUsrUpdateSetting.INSTANCE.isEnable()) {
                        if (!z) {
                            linkedHashMap2.put(strLJIIJ, new Pair(pair.getFirst(), 2));
                        } else if (((LinkPlayerInfo) pair.getFirst()).linkUserType != linkPlayerInfo2.linkUserType) {
                            linkedHashMap2.put(strLJIIJ, new Pair(linkPlayerInfo2, 3));
                        } else {
                            linkedHashMap2.put(strLJIIJ, new Pair(pair.getFirst(), 2));
                        }
                    } else {
                        linkedHashMap2.put(strLJIIJ, new Pair(pair.getFirst(), 2));
                    }
                } else {
                    linkedHashMap.put(strLJIIJ, new C930350aJl(linkPlayerInfo2, false, false));
                }
            }
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (((Number) ((Pair) entry.getValue()).getSecond()).intValue() == 1) {
                linkedHashMap.put(entry.getKey(), new C930350aJl((LinkPlayerInfo) ((Pair) entry.getValue()).getFirst(), true, false));
            } else if (((Number) ((Pair) entry.getValue()).getSecond()).intValue() == 3) {
                linkedHashMap.put(entry.getKey(), new C930350aJl((LinkPlayerInfo) ((Pair) entry.getValue()).getFirst(), true, true));
            }
        }
        return linkedHashMap;
    }

    public static void LJIILJJIL(C410901il c410901il, int i, C1117360fBO c1117360fBO) {
        try {
            c410901il.remove(i);
            c1117360fBO.LLLII(c410901il);
            if (!(c1117360fBO instanceof C929420aIG)) {
                c1117360fBO.notifyItemRemoved(i);
                if (i != c1117360fBO.LL.size()) {
                    c1117360fBO.notifyItemRangeChanged(i, c1117360fBO.LL.size() - i);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AZW.LJFF(LJIIL(942), "notifyItemRemoved failed,", th.getMessage(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(X.C410901il r4, int r5, java.lang.Object r6, X.C1117360fBO r7) {
        /*
            LIZ(r4)     // Catch: java.lang.Throwable -> L8f
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnableClearWhenRejectSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnableClearWhenRejectSetting.INSTANCE     // Catch: java.lang.Throwable -> L8f
            boolean r0 = r0.enable()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "MultiGuestUpdateUserInfoHelper"
            if (r0 == 0) goto Le
            goto L10
        Le:
            r2 = r5
            goto L44
        L10:
            X.0aM6 r0 = X.C931800aM6.LIZ     // Catch: java.lang.Throwable -> L8f
            r0.getClass()     // Catch: java.lang.Throwable -> L8f
            boolean r0 = X.C931800aM6.LIZIZ()     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto Le
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L8f
            if (r5 <= r0) goto Le
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "notifyItemInserted fixed, indexInsert:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            r1.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = " is out of range, lastAllItemList size:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L8f
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8f
            X.C20441214yg.LJIIL(r3, r0)     // Catch: java.lang.Throwable -> L8f
        L44:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "notifyItemInserted inputIndexInsert:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            r1.append(r5)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = " indexInsert:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            r1.append(r2)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = " lastAllItemList:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            r1.append(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = " itemInsert:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f
            r1.append(r6)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8f
            X.C20441214yg.LIZIZ(r3, r0)     // Catch: java.lang.Throwable -> L8f
            r4.add(r2, r6)     // Catch: java.lang.Throwable -> L8f
            r7.LLLII(r4)     // Catch: java.lang.Throwable -> L8f
            boolean r0 = r7 instanceof X.C929420aIG     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto La3
            r7.notifyItemInserted(r2)     // Catch: java.lang.Throwable -> L8f
            java.util.List<?> r0 = r7.LL     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L8f
            if (r2 == r0) goto La3
            java.util.List<?> r0 = r7.LL     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L8f
            int r0 = r0 - r2
            r7.notifyItemRangeChanged(r2, r0)     // Catch: java.lang.Throwable -> L8f
            return
        L8f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            r0 = 552(0x228, float:7.74E-43)
            java.lang.String r3 = LJIIL(r0)
            java.lang.String r2 = r1.getMessage()
            r1 = 0
            java.lang.String r0 = "notifyItemInserted failed,"
            X.C1AZW.LJFF(r3, r0, r2, r1)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C930320aJi.LJIILIIL(X.01il, int, java.lang.Object, X.0fBO):void");
    }

    public static void LJIILLIIL(List list, List list2, C410901il c410901il, C410901il c410901il2, C1117360fBO c1117360fBO) {
        boolean z;
        int size;
        C410901il c410901il3;
        int iLJI;
        String strLJIJJ;
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        int size2 = c410901il.size();
        if (c410901il2 != null) {
            size = c410901il2.size();
        } else {
            size = 0;
        }
        int i = size2 + size;
        int iLJIIJJI = LJIIJJI(list2, list);
        if (!z) {
            if (i != iLJIIJJI && (iLJI = LJI((c410901il3 = (C410901il) c1117360fBO.LL))) != -1) {
                Object obj = c410901il3.get(iLJI);
                C930130aJP c930130aJP = (C930130aJP) obj;
                if (iLJIIJJI == 1) {
                    strLJIJJ = C497740JfY.LJIJJ(2131842070, Integer.valueOf(iLJIIJJI));
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131842071, Integer.valueOf(iLJIIJJI));
                }
                c930130aJP.LIZ = strLJIJJ;
                c930130aJP.LIZIZ = 0;
                c410901il3.set(iLJI, obj);
                c1117360fBO.LLLII(c410901il3);
                if (!(c1117360fBO instanceof C929420aIG)) {
                    c1117360fBO.notifyItemChanged(iLJI);
                    return;
                }
                return;
            }
            return;
        }
        C410901il c410901il4 = (C410901il) c1117360fBO.LL;
        int iLJI2 = LJI(c410901il4);
        if (iLJI2 == -1) {
            return;
        }
        LJIILJJIL(c410901il4, iLJI2, c1117360fBO);
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:577:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(boolean r19, X.C930330aJj r20, X.C930340aJk r21, X.C1117360fBO r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C930320aJi.LJIILL(boolean, X.0aJj, X.0aJk, X.0fBO, int, boolean):void");
    }
}
