package X;

import Y.AComparatorS504S0100000_5;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357580E0e {
    public final VideoPublishEditModel LIZ;
    public final boolean LIZIZ;
    public List<? extends ResourceItem> LIZJ = C13BV.INSTANCE;

    public final List<ResourceItem> LIZ(List<? extends ResourceItem> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (!C357080DzG.LIZ((ResourceItem) obj) || C357620E0i.LIZ() || C357610E0h.LIZIZ(this.LIZ)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.ugc.android.editor.base.resource.ResourceItem> LIZIZ(java.util.List<? extends com.ss.ugc.android.editor.base.resource.ResourceItem> r8) {
        /*
            r7 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r8.iterator()
        L9:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r2 = r6.next()
            r4 = r2
            com.ss.ugc.android.editor.base.resource.ResourceItem r4 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r4
            X.0EMy r1 = X.C363500EMy.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r7.LIZ
            r1.getClass()
            boolean r0 = X.C363500EMy.LJIIJ(r0)
            r5 = 1
            if (r0 == 0) goto L6a
            X.01GW r0 = X.C0B7O.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L70
            X.0Dta r1 = X.C353560Dta.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r7.LIZ
            r1.getClass()
            boolean r0 = X.C353560Dta.LJ(r0)
            if (r0 != 0) goto L70
            X.01GW r0 = X.C287330BNz.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6a
            java.lang.String r1 = r4.gameplayType
            X.0E00 r0 = X.C0E00.SERVER_GAME_PLAY
            java.lang.String r0 = r0.getTypeName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6a
            java.lang.String r1 = r4.gameplayType
            X.0E00 r0 = X.C0E00.CLIENT_GAME_PLAY
            java.lang.String r0 = r0.getTypeName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6a
            r5 = 0
        L6a:
            if (r5 == 0) goto L9
            r3.add(r2)
            goto L9
        L70:
            java.lang.String r0 = r4.extra
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L6a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = r4.extra     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L80
            java.lang.String r0 = ""
        L80:
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "GamePlayResourceSubType"
            java.lang.String r1 = r1.optString(r0)     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "slow_motion"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L91
            r5 = r5 ^ r0
            goto L6a
        L91:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L6a
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357580E0e.LIZIZ(java.util.List):java.util.List");
    }

    public C357580E0e(VideoPublishEditModel videoPublishEditModel, boolean z) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<ResourceItem> LIZJ(NLETrackSlot nLETrackSlot, List<? extends ResourceItem> list) {
        String lowerCase;
        ArrayList arrayList;
        List listLJLLLL;
        String str;
        String lowerCase2;
        if (this.LIZIZ) {
            C354260Dui.LIZ.getClass();
            NLEResType nLEResTypeLJIIJ = C354260Dui.LJIIJ(nLETrackSlot);
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            Object[] objArr = C357600E0g.LIZ;
            Object[] objArr2 = (Object[]) c0c64LJIILLIIL.LJJIII("studio_editor_pro_magic_disable_categories", 0, objArr);
            if (objArr2 != null) {
                objArr = objArr2;
            }
            List listLJJLL = C13LQ.LJJLL(objArr);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (true) {
                String str2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                C357590E0f category = ((ResourceItem) next).getCategory();
                if (category != null) {
                    str2 = category.LIZIZ;
                }
                if (!C13LP.LJJJJ(str2, listLJJLL)) {
                    arrayList2.add(next);
                }
            }
            ArrayList<C357590E0f> arrayList3 = new ArrayList();
            C365360EUc.LIZ.getClass();
            for (C357590E0f c357590E0f : C365360EUc.LIZJ(arrayList2)) {
                List<ResourceItem> list2 = c357590E0f.LJI;
                if (list2 != null && (listLJLLLL = C13LP.LJLLLL(new AComparatorS504S0100000_5(nLEResTypeLJIIJ, 0), list2)) != null) {
                    arrayList = new ArrayList();
                    for (Object obj : listLJLLLL) {
                        ResourceItem resourceItem = (ResourceItem) obj;
                        C357590E0f category2 = resourceItem.getCategory();
                        if (category2 != null) {
                            str = category2.LIZIZ;
                        } else {
                            str = null;
                        }
                        if (str == null || (lowerCase2 = str.toLowerCase(Locale.ROOT)) == null || !a0.LJJIIZI(lowerCase2, "trending", false) || C0E0F.LIZIZ(resourceItem, nLEResTypeLJIIJ)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                arrayList3.add(new C357590E0f(c357590E0f.LIZ, c357590E0f.LIZIZ, c357590E0f.LIZJ, c357590E0f.LIZLLL, c357590E0f.LJ, c357590E0f.LJFF, arrayList));
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (C357590E0f c357590E0f2 : arrayList3) {
                String str3 = c357590E0f2.LIZIZ;
                if (str3 != null && (lowerCase = str3.toLowerCase(Locale.ROOT)) != null && a0.LJJIIZI(lowerCase, "trending", false)) {
                    arrayList4.add(c357590E0f2);
                } else {
                    List<ResourceItem> list3 = c357590E0f2.LJI;
                    if (list3 != null && !list3.isEmpty()) {
                        Iterator<ResourceItem> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            if (C0E0F.LIZIZ(it3.next(), nLEResTypeLJIIJ)) {
                                arrayList5.add(c357590E0f2);
                                break;
                            }
                        }
                    }
                    arrayList6.add(c357590E0f2);
                }
            }
            List listLJLIL = C13LP.LJLIL(arrayList6, C13LP.LJLIL(arrayList5, arrayList4));
            C365360EUc.LIZ.getClass();
            return LIZIZ(LIZ(C365360EUc.LJ(listLJLIL)));
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_sort_magic_resource_list", true) == 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it4 = list.iterator();
            while (true) {
                String str4 = "video";
                if (!it4.hasNext()) {
                    break;
                }
                Object next2 = it4.next();
                ResourceItem resourceItem2 = (ResourceItem) next2;
                if (resourceItem2.isNullItem) {
                    str4 = "null";
                } else if (C0E0F.LIZIZ(resourceItem2, NLEResType.IMAGE)) {
                    str4 = "photo";
                }
                Object arrayList7 = linkedHashMap.get(str4);
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                    linkedHashMap.put(str4, arrayList7);
                }
                ((List) arrayList7).add(next2);
            }
            List list4 = (List) linkedHashMap.get("null");
            if (list4 == null) {
                list4 = C13BV.INSTANCE;
            }
            Object obj2 = (Collection) linkedHashMap.get("photo");
            if (obj2 == null) {
                obj2 = C13BV.INSTANCE;
            }
            Object obj3 = (Collection) linkedHashMap.get("video");
            if (obj3 == null) {
                obj3 = C13BV.INSTANCE;
            }
            ArrayList arrayList8 = new ArrayList();
            if (true ^ list4.isEmpty()) {
                arrayList8.add(ListProtector.get(list4, 0));
            }
            if (C351220Dpo.LLJJJ(nLETrackSlot)) {
                arrayList8.addAll(obj2);
                arrayList8.addAll(obj3);
                return arrayList8;
            }
            arrayList8.addAll(obj3);
            arrayList8.addAll(obj2);
            return arrayList8;
        }
        return list;
    }
}
