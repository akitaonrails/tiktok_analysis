package X;

import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531620Kt6 {
    public static List LIZ(List list) {
        String freezeGroup;
        Object next;
        String magicSupportType;
        Object next2;
        String originMaterialType;
        Object next3;
        boolean z;
        ArrayList<List> arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TemplateSlot templateSlot = (TemplateSlot) it2.next();
            String sameAssetGroup = templateSlot.getSameAssetGroup();
            if (sameAssetGroup != null && sameAssetGroup.length() != 0) {
                String sameAssetGroup2 = templateSlot.getSameAssetGroup();
                Object arrayList2 = linkedHashMap.get(sameAssetGroup2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    arrayList.add(arrayList2);
                    linkedHashMap.put(sameAssetGroup2, arrayList2);
                }
                ((List) arrayList2).add(templateSlot);
            } else {
                arrayList.add(Collections.singletonList(templateSlot));
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (List list2 : arrayList) {
            Iterator it3 = list2.iterator();
            if (it3.hasNext()) {
                Object next4 = it3.next();
                if (it3.hasNext()) {
                    double duration = ((TemplateSlot) next4).getDuration();
                    do {
                        Object next5 = it3.next();
                        double duration2 = ((TemplateSlot) next5).getDuration();
                        if (Double.compare(duration, duration2) < 0) {
                            next4 = next5;
                            duration = duration2;
                        }
                    } while (it3.hasNext());
                }
                TemplateSlot templateSlot2 = (TemplateSlot) next4;
                Iterator it4 = list2.iterator();
                while (true) {
                    freezeGroup = null;
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (((TemplateSlot) next).getMagicSupportType() != null) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                TemplateSlot templateSlot3 = (TemplateSlot) next;
                if (templateSlot3 != null) {
                    magicSupportType = templateSlot3.getMagicSupportType();
                } else {
                    magicSupportType = null;
                }
                templateSlot2.setMagicSupportType(magicSupportType);
                Iterator it5 = list2.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        if (((TemplateSlot) next2).getOriginMaterialType() != null) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                TemplateSlot templateSlot4 = (TemplateSlot) next2;
                if (templateSlot4 != null) {
                    originMaterialType = templateSlot4.getOriginMaterialType();
                } else {
                    originMaterialType = null;
                }
                templateSlot2.setOriginMaterialType(originMaterialType);
                Iterator it6 = list2.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next3 = it6.next();
                        if (((TemplateSlot) next3).getFreezeGroup() != null) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                TemplateSlot templateSlot5 = (TemplateSlot) next3;
                if (templateSlot5 != null) {
                    freezeGroup = templateSlot5.getFreezeGroup();
                }
                templateSlot2.setFreezeGroup(freezeGroup);
                if (!list2.isEmpty()) {
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        if (Intrinsics.LJFF(((TemplateSlot) it7.next()).isReverseVideo(), Boolean.TRUE)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                templateSlot2.setReverseVideo(Boolean.valueOf(z));
                arrayList3.add(templateSlot2);
            } else {
                throw new NoSuchElementException();
            }
        }
        return arrayList3;
    }

    public static final Pair<Boolean, List<TemplateSlot>> LIZIZ(List<TemplateSlot> list, boolean z) {
        if (C0AY1.LIZ(z) && ((ArrayList) LIZ(list)).size() < list.size()) {
            return new Pair<>(Boolean.TRUE, LIZ(list));
        }
        return new Pair<>(Boolean.FALSE, list);
    }
}
