package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2176708ft {
    public static final int LIZIZ(List<? extends EffectCategoryModel> list) {
        ArrayList arrayList = (ArrayList) list;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.LJFF(((EffectCategoryModel) listIterator.previous()).getKey(), C2176908fv.LIZ.getValue())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static final void LIZJ(List<EffectCategoryModel> list) {
        Object value = C2176908fv.LIZ.getValue();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(C2176908fv.LIZ());
        linkedHashSet.remove(value);
        C19719612Di.LJJIIJ(list, new AwS582S0100000_3((Set) linkedHashSet, (Set<String>) 56), true);
    }

    public static final void LIZ(ShortVideoContext shortVideoContext, List<EffectCategoryModel> list, boolean z) {
        int iNextIndex;
        int iLIZIZ;
        if (!C1656550tD3.LIZ()) {
            C19719612Di.LJJIIJ(list, AFwS231S0000000_3.get$arr$(82), true);
            return;
        }
        if (z) {
            C19719612Di.LJJIIJ(list, AFwS231S0000000_3.get$arr$(82), true);
            return;
        }
        if (shortVideoContext != null && !shortVideoContext.LJJLL() && !shortVideoContext.isStoryOrPhotoTab) {
            LIZJ(list);
            return;
        }
        if (!C10EU.LJIILIIL() && C2176808fu.LIZ() && shortVideoContext != null && shortVideoContext.isStoryOrPhotoTab) {
            LIZJ(list);
            StringBuilder sb = new StringBuilder("forceChangeCreateTabPosition, ");
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            ArrayList arrayList2 = (ArrayList) list;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((EffectCategoryModel) it2.next()).getKey());
            }
            String strValueOf = String.valueOf(arrayList);
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_photo_mode_create_tab_issue_order", true, false)) {
                sb.append("use online order, return. ");
            } else {
                int iLIZIZ2 = LIZIZ(list);
                if (iLIZIZ2 == -1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("positionAbsolute = ");
                    sbLIZ.append(iLIZIZ2);
                    sbLIZ.append(", return. ");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (C13LP.LJJJJ(((EffectCategoryModel) listIterator.previous()).getKey(), C1697810uHb.LJIIJJI("trending", "hot", "popular", "tr"))) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            iNextIndex = -1;
                            break;
                        }
                    }
                    if (iNextIndex >= 0 && iNextIndex < arrayList2.size()) {
                        iLIZIZ = (LIZIZ(list) - iNextIndex) + 1;
                    } else {
                        iLIZIZ = 2;
                    }
                    if (iLIZIZ > 0 && iLIZIZ <= arrayList2.size()) {
                        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 2, "photo_mode_create_tab_position", true) - iLIZIZ;
                        int i = iLIZIZ2 + iLJIJ;
                        if (i < arrayList2.size() && i != iLIZIZ2) {
                            ListProtector.add(list, i, ListProtector.remove(list, iLIZIZ2));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("positionAbsolute = ");
                            sbLIZ2.append(iLIZIZ2);
                            sbLIZ2.append(", ");
                            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("positionRelativeTrending = ");
                            sbLIZ3.append(iLIZIZ);
                            sbLIZ3.append(", ");
                            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("targetDiff = ");
                            sbLIZ4.append(iLJIJ);
                            sbLIZ4.append(", ");
                            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("targetPosition = ");
                            sbLIZ5.append(i);
                            sbLIZ5.append(", ");
                            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                            sb.append("success. ");
                        } else {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("targetPosition = ");
                            sbLIZ6.append(i);
                            sbLIZ6.append(", return. ");
                            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
                        }
                    } else {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("positionRelativeTrending = ");
                        sbLIZ7.append(iLIZIZ);
                        sbLIZ7.append(", return.");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
                    }
                }
            }
            sb.append("\n origin before = " + strValueOf + ", ");
            StringBuilder sb2 = new StringBuilder("\n origin after = ");
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((EffectCategoryModel) it3.next()).getKey());
            }
            sb2.append(arrayList3);
            sb2.append(", ");
            sb.append(sb2.toString());
            C201955140j.LIZLLL(C20012313Rx.LIZIZ, "MobileEffectTemplateCreateTab", sb.toString());
            return;
        }
        C19719612Di.LJJIIJ(list, AFwS231S0000000_3.get$arr$(82), true);
    }
}
