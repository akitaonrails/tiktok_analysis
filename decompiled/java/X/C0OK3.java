package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OK3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OK3 {
    public C0OLV LIZ;
    public EnumC617060OIe LIZIZ;
    public boolean LJ;
    public EnumC617480OJu LIZJ = EnumC617480OJu.BULLETIN_OPEN;
    public long LIZLLL = 20;
    public Long LJFF = 0L;
    public boolean LJI = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OK3.LIZ(java.util.List):java.util.List");
    }

    public final void LJ(List<BulletinBaseItem> list) {
        if (this.LIZIZ != EnumC617060OIe.IDENTITY_SUBSCRIBER) {
            return;
        }
        int size = list.size() - 1;
        int i = 0;
        while (i < size) {
            BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) ListProtector.get(list, i);
            i++;
            BulletinBaseItem bulletinBaseItem2 = (BulletinBaseItem) ListProtector.get(list, i);
            if (!bulletinBaseItem.LJJIJLIJ() && bulletinBaseItem2.LJJIJLIJ()) {
                ListProtector.add(list, i, new C0OKG(C20642515q3.LJI(2131835825), 0));
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static List LIZJ(List list, List list2, C0OKA c0oka, InterfaceC1631620sYq interfaceC1631620sYq) {
        ?? arrayList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof BulletinBaseItem) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                C0OK6 c0ok6 = ((BulletinBaseItem) obj2).itemType;
                if (c0ok6 == C0OK6.INLINE || c0ok6 == C0OK6.CONTENT) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (interfaceC1631620sYq != null) {
            return (List) interfaceC1631620sYq.invoke(arrayList, list2, c0oka);
        }
        int i = C0OK9.LIZ[c0oka.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new ArrayList((Collection) arrayList);
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList);
            arrayList3.addAll(list2);
            return arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(list2);
        return arrayList4;
    }

    public final List<InterfaceC1891350zJl> LJFF(List<? extends InterfaceC1891350zJl> list, List<? extends BulletinBaseItem> list2, C0OKA c0oka, InterfaceC1631620sYq<? super List<? extends BulletinBaseItem>, ? super List<? extends BulletinBaseItem>, ? super C0OKA, ? extends List<BulletinBaseItem>> interfaceC1631620sYq) {
        return LIZLLL(list, null, null, list2, c0oka, interfaceC1631620sYq);
    }

    public static void LIZIZ(C0OKA c0oka, BulletinBaseItem bulletinBaseItem, BulletinBaseItem bulletinBaseItem2, Long l, List list) {
        switch (C0OK9.LIZ[c0oka.ordinal()]) {
            case 3:
                if (bulletinBaseItem != null) {
                    ListProtector.add(list, 0, bulletinBaseItem);
                }
                break;
            case 4:
                C19719512Dh.LIZ(list).remove(bulletinBaseItem2);
                C0OPX.LIZJ(list, bulletinBaseItem2, new AwS588S0100000_9(list, (List<InterfaceC1891350zJl>) 611));
                if (bulletinBaseItem != null) {
                    ListProtector.add(list, 0, bulletinBaseItem);
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (bulletinBaseItem != null) {
                    C0OPX.LIZJ(list, bulletinBaseItem2, new AwS375S0200000_9(bulletinBaseItem, list, 159));
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                ArrayList arrayList = (ArrayList) list;
                for (Object obj : arrayList) {
                    if (Intrinsics.LJFF(((BulletinBaseItem) obj).LJJJ(), l)) {
                        if (obj != null) {
                            arrayList.remove(obj);
                        }
                        break;
                    }
                }
                break;
        }
    }

    public final List<InterfaceC1891350zJl> LIZLLL(List<? extends InterfaceC1891350zJl> list, BulletinBaseItem bulletinBaseItem, BulletinBaseItem bulletinBaseItem2, List<? extends BulletinBaseItem> list2, C0OKA c0oka, InterfaceC1631620sYq<? super List<? extends BulletinBaseItem>, ? super List<? extends BulletinBaseItem>, ? super C0OKA, ? extends List<BulletinBaseItem>> interfaceC1631620sYq) {
        String str;
        List<BulletinBaseItem> listLIZJ;
        boolean z;
        BulletinStyleStruct bulletinStyleStructLJ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processDataList: refreshType :");
        sbLIZ.append(c0oka);
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList = new ArrayList();
        C0OLV c0olv = this.LIZ;
        if (c0olv != null && (str = c0olv.LL) != null) {
            Object obj = null;
            if (C0OKB.LIZ.contains(c0oka)) {
                ArrayList arrayList2 = new ArrayList();
                listLIZJ = arrayList2;
                if (bulletinBaseItem2 != null) {
                    if (list != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                            if (interfaceC1891350zJl instanceof BulletinBaseItem) {
                                arrayList3.add(interfaceC1891350zJl);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : arrayList3) {
                            C0OK6 c0ok6 = ((BulletinBaseItem) obj2).itemType;
                            if (c0ok6 == C0OK6.INLINE || c0ok6 == C0OK6.CONTENT) {
                                arrayList4.add(obj2);
                            }
                        }
                        arrayList2.addAll(arrayList4);
                    }
                    LIZIZ(c0oka, bulletinBaseItem2, bulletinBaseItem, null, arrayList2);
                    listLIZJ = arrayList2;
                }
            } else {
                listLIZJ = LIZJ(list, list2, c0oka, interfaceC1631620sYq);
            }
            LJ(listLIZJ);
            C0OOY.LIZ.getClass();
            List listLIZLLL = C0OOY.LIZLLL(listLIZJ);
            EnumC617060OIe enumC617060OIe = this.LIZIZ;
            EnumC617480OJu enumC617480OJu = this.LIZJ;
            long j = this.LIZLLL;
            C0OLV c0olv2 = this.LIZ;
            if (c0olv2 != null) {
                z = c0olv2.LLJ;
            } else {
                z = false;
            }
            arrayList.addAll(LIZ(C0OO1.LIZ(str, listLIZLLL, enumC617060OIe, enumC617480OJu, j, z)));
            if (!this.LJ) {
                arrayList.add(new C0268007e(0));
            }
            if (this.LJI || c0oka == C0OKA.GENERATED) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof BulletinBaseItem) {
                        arrayList5.add(obj3);
                    }
                }
                Iterator it2 = arrayList5.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    BulletinBaseItem bulletinBaseItem3 = (BulletinBaseItem) next;
                    if (C1533950q1J.LJ(bulletinBaseItem3.LJJL()) && (bulletinStyleStructLJ = bulletinBaseItem3.LJ()) != null && C617100OIi.LIZLLL(bulletinStyleStructLJ) && !bulletinBaseItem3.LJJIJLIJ()) {
                        obj = next;
                        break;
                    }
                }
                BulletinBaseItem bulletinBaseItem4 = (BulletinBaseItem) obj;
                if (bulletinBaseItem4 != null) {
                    bulletinBaseItem4.LLILZ = true;
                    this.LJI = false;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
