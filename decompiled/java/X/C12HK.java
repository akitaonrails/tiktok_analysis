package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.data.BeautySyncData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12HK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HK {
    public static final Keva LIZ = Keva.getRepo("ulike_repo");
    public static final List<BeautySyncData> LIZIZ = new ArrayList();

    public static void LIZ(List list) {
        List<ComposerBeauty> childList;
        BeautySyncData beautySyncDataLIZIZ;
        Object[] objArr;
        Object[] objArr2;
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            ((ArrayList) LIZIZ).clear();
        } else if (!((ArrayList) LIZIZ).isEmpty()) {
            C19570511hX.LIZIZ("data had parse");
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List<ComposerBeauty> beautyList = ((BeautyCategory) it2.next()).getBeautyList();
                if (beautyList != null && !beautyList.isEmpty()) {
                    for (ComposerBeauty composerBeauty : beautyList) {
                        if (composerBeauty.isCollectionType() && (childList = composerBeauty.getChildList()) != null && (!childList.isEmpty())) {
                            Iterator<ComposerBeauty> it3 = childList.iterator();
                            while (it3.hasNext()) {
                                LIZJ(it3.next());
                            }
                        }
                        LIZJ(composerBeauty);
                    }
                }
            }
        }
        Keva keva = LIZ;
        if (keva.getBoolean("key_had_converted_keys", false)) {
            C19570511hX.LIZIZ("nothing to convert");
            return;
        }
        C19570511hX.LIZIZ("prepare to convert data");
        Set<String> setKeySet = keva.getAll().keySet();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (a0.LJJIIZI((String) obj, "composer_beauty_manual", false)) {
                arrayList2.add(obj);
            }
        }
        ArrayList<String[]> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (String str : arrayList2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convert data key:");
            sbLIZ.append(str);
            C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() < 8) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bad key:");
                sbLIZ2.append(str);
                C19570511hX.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                Object obj2 = ListProtector.get(listLJJLIIIJILLIZJL, 0);
                if (Intrinsics.LJFF("live", obj2)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("not record tag value key:");
                    sbLIZ3.append(str);
                    C19570511hX.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    Object obj3 = ListProtector.get(listLJJLIIIJILLIZJL, 6);
                    String strLIZIZ = (String) ListProtector.get(listLJJLIIIJILLIZJL, 7);
                    int size = listLJJLIIIJILLIZJL.size();
                    for (int i = 8; i < size; i++) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(strLIZIZ);
                        sbLIZ4.append('_');
                        sbLIZ4.append((String) ListProtector.get(listLJJLIIIJILLIZJL, i));
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    objArr2 = new String[]{str, obj2, "composer_beauty_manual", obj3, strLIZIZ};
                    arrayList3.add(objArr2);
                }
            }
            objArr2 = null;
            arrayList3.add(objArr2);
        }
        for (String[] strArr : arrayList3) {
            if (strArr != null && strArr.length != 0 && strArr.length == 5) {
                String str2 = strArr[0];
                BeautySyncData beautySyncDataLIZIZ2 = LIZIZ(strArr[3]);
                if (beautySyncDataLIZIZ2 != null) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strArr[1]);
                    sbLIZ5.append('_');
                    sbLIZ5.append(strArr[2]);
                    sbLIZ5.append('_');
                    sbLIZ5.append(beautySyncDataLIZIZ2.resourceId);
                    sbLIZ5.append('_');
                    sbLIZ5.append(strArr[4]);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                    Keva keva2 = LIZ;
                    int i2 = keva2.getInt(str2, Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE && !keva2.contains(strLIZIZ2)) {
                        keva2.storeFloat(strLIZIZ2, i2);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("convert key:");
                        sbLIZ6.append(strLIZIZ2);
                        sbLIZ6.append(" val:");
                        sbLIZ6.append(i2);
                        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
            }
        }
        ArrayList<String> arrayList4 = new ArrayList();
        for (Object obj4 : setKeySet) {
            if (a0.LJJIIZI((String) obj4, "key_selected_album", false)) {
                arrayList4.add(obj4);
            }
        }
        ArrayList<String[]> arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        for (String str3 : arrayList4) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("convert selected key:");
            sbLIZ7.append(str3);
            C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ7));
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str3, new String[]{"_"}, 0, 6);
            if (listLJJLIIIJILLIZJL2.size() < 6) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("bad selected key:");
                sbLIZ8.append(str3);
                C19570511hX.LIZJ(C2188811AlT.LIZIZ(sbLIZ8));
            } else {
                Object obj5 = ListProtector.get(listLJJLIIIJILLIZJL2, 0);
                if (Intrinsics.LJFF("live", obj5)) {
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("not record selected key:");
                    sbLIZ9.append(str3);
                    C19570511hX.LIZJ(C2188811AlT.LIZIZ(sbLIZ9));
                } else {
                    objArr = new String[]{str3, obj5, "key_selected_album", ListProtector.get(listLJJLIIIJILLIZJL2, 5)};
                    arrayList5.add(objArr);
                }
            }
            objArr = null;
            arrayList5.add(objArr);
        }
        for (String[] strArr2 : arrayList5) {
            if (strArr2 != null && strArr2.length != 0 && strArr2.length == 4) {
                String str4 = strArr2[0];
                BeautySyncData beautySyncDataLIZIZ3 = LIZIZ(strArr2[3]);
                if (beautySyncDataLIZIZ3 != null) {
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append(strArr2[1]);
                    sbLIZ10.append('_');
                    sbLIZ10.append(strArr2[2]);
                    sbLIZ10.append('_');
                    sbLIZ10.append(beautySyncDataLIZIZ3.resourceId);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ10);
                    Keva keva3 = LIZ;
                    if (!keva3.contains(strLIZIZ3) && (beautySyncDataLIZIZ = LIZIZ(keva3.getString(str4, ""))) != null) {
                        keva3.storeString(strLIZIZ3, beautySyncDataLIZIZ.resourceId);
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("convert selected key:");
                        sbLIZ11.append(strLIZIZ3);
                        sbLIZ11.append(" val:");
                        sbLIZ11.append(beautySyncDataLIZIZ.resourceId);
                        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ11));
                    }
                }
            }
        }
        LIZ.storeBoolean("key_had_converted_keys", true);
    }

    public static BeautySyncData LIZIZ(String str) {
        List<BeautySyncData> list;
        BeautySyncData next;
        if (!TextUtils.isEmpty(str) && (list = LIZIZ) != null && !((ArrayList) list).isEmpty()) {
            Iterator<BeautySyncData> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.effectId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BeautySyncData beautySyncData = next;
            if (beautySyncData != null) {
                return beautySyncData;
            }
        }
        return null;
    }

    public static final void LIZJ(ComposerBeauty composerBeauty) {
        ((ArrayList) LIZIZ).add(new BeautySyncData(composerBeauty.getEffect().getEffectId(), composerBeauty.getEffect().getResourceId(), composerBeauty.getCategoryId(), composerBeauty.getParentId()));
    }
}
