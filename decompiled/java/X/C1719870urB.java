package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.resourceloader.AccessPreCheckInfo;
import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.bytedance.pipo.stellar.base.resourceloader.StellarSection;
import com.bytedance.pipo.stellar.base.resourceloader.StellarStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0urB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719870urB {
    public static final StellarSection LIZIZ(StellarSection stellarSection) {
        String str = stellarSection.id;
        List<CardDO> list = stellarSection.cardList;
        Map<String, Object> map = stellarSection.trackingParams;
        stellarSection.getClass();
        return new StellarSection(str, list, null, null, map);
    }

    public static final StellarChunk LIZ(StellarChunk stellarChunk, StellarChunk stellarChunk2) {
        String lowerCase;
        ArrayList arrayList = null;
        if (stellarChunk2 != null && u.LJIJI(stellarChunk.refreshType, "partial", true)) {
            List<StellarSection> list = stellarChunk2.sections;
            List<StellarSection> list2 = stellarChunk.sections;
            if (list2 == null) {
                if (list != null) {
                    arrayList = new ArrayList(list);
                }
            } else if (list != null && !list.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<StellarSection> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(LIZIZ(it2.next()));
                }
                arrayList = new ArrayList(arrayList2);
                for (StellarSection stellarSection : list2) {
                    String str = stellarSection.sectionDataOperation;
                    if (str != null && (lowerCase = str.toLowerCase(Locale.ROOT)) != null) {
                        int iHashCode = lowerCase.hashCode();
                        if (iHashCode != -1335458389) {
                            if (iHashCode != -1183792455) {
                                if (iHashCode == -838846263 && lowerCase.equals("update")) {
                                    LIZJ(arrayList, stellarSection);
                                }
                            } else if (lowerCase.equals("insert")) {
                                StellarSection stellarSectionLIZIZ = LIZIZ(stellarSection);
                                Iterator it3 = arrayList.iterator();
                                int i = 0;
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    if (Intrinsics.LJFF(((StellarSection) it3.next()).id, stellarSection.targetSectionId)) {
                                        if (i >= 0) {
                                            ListProtector.add(arrayList, i, stellarSectionLIZIZ);
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                                arrayList.add(stellarSectionLIZIZ);
                            }
                        } else if (lowerCase.equals("delete")) {
                            String str2 = stellarSection.targetSectionId;
                            if (str2 != null || (str2 = stellarSection.id) != null) {
                                C19719612Di.LJJIIJ(arrayList, new AwS76S1000000_26(str2, 52), true);
                            }
                        }
                    }
                    LIZJ(arrayList, stellarSection);
                }
            } else {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<StellarSection> it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(LIZIZ(it4.next()));
                }
                arrayList = new ArrayList(arrayList3);
            }
            StellarStyle stellarStyle = stellarChunk.mainStyle;
            if (stellarStyle == null) {
                stellarStyle = stellarChunk2.mainStyle;
            }
            CardDO cardDO = stellarChunk.header;
            if (cardDO == null) {
                cardDO = stellarChunk2.header;
            }
            List<CardDO> list3 = stellarChunk.background;
            if (list3 == null) {
                list3 = stellarChunk2.background;
            }
            List<CardDO> list4 = stellarChunk.footer;
            if (list4 == null) {
                list4 = stellarChunk2.footer;
            }
            Map<String, Object> map = stellarChunk.trackingParams;
            if (map == null) {
                map = stellarChunk2.trackingParams;
            }
            AccessPreCheckInfo accessPreCheckInfo = stellarChunk.accessPreCheckInfo;
            if (accessPreCheckInfo == null) {
                accessPreCheckInfo = stellarChunk2.accessPreCheckInfo;
            }
            return StellarChunk.LIZ(stellarChunk, arrayList, stellarStyle, cardDO, list3, list4, map, accessPreCheckInfo, 8555);
        }
        List<StellarSection> list5 = stellarChunk.sections;
        if (list5 != null) {
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list5, 10));
            Iterator<StellarSection> it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList4.add(LIZIZ(it5.next()));
            }
            arrayList = new ArrayList(arrayList4);
        }
        return StellarChunk.LIZ(stellarChunk, arrayList, null, null, null, null, null, null, 16379);
    }

    public static final void LIZJ(List<StellarSection> list, StellarSection stellarSection) {
        StellarSection stellarSectionLIZIZ = LIZIZ(stellarSection);
        String str = stellarSectionLIZIZ.id;
        if (str == null) {
            str = stellarSection.targetSectionId;
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((StellarSection) it2.next()).id, str)) {
                if (i >= 0) {
                    ListProtector.set(list, i, stellarSectionLIZIZ);
                    return;
                }
            } else {
                i++;
            }
        }
        arrayList.add(stellarSectionLIZIZ);
    }
}
