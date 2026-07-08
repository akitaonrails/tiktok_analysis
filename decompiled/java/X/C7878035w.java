package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.035w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7878035w {
    public static final C7878035w LIZ = new C7878035w();
    public static final String LIZIZ = "ec_localized_size_info_key";
    public static final String LIZJ = "ec_localized_size_identifier";

    public static String LIZLLL(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append("_");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return u.LJJIFFI(sb.toString(), "__", "_", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (kotlin.text.a0.LJJJIL(r1) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection r17) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7878035w.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection");
    }

    public static boolean LJII(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (!(!a0.LJJJIL(str))) {
                return false;
            }
        }
        return true;
    }

    public static List LIZIZ(List list, String[] strArr) {
        List listLJLI;
        SalePropValue next;
        if (strArr != null) {
            listLJLI = C13LQ.LJLI(strArr);
        } else {
            listLJLI = C13BV.INSTANCE;
        }
        if (!listLJLI.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            for (Object obj : listLJLI) {
                map.put(obj, obj);
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    List<SalePropValue> list2 = ((SaleProp) it2.next()).salePropValueList;
                    String str = null;
                    if (list2 != null) {
                        Iterator<SalePropValue> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (map.get(next.propValueId) != null) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        SalePropValue salePropValue = next;
                        if (salePropValue != null) {
                            str = salePropValue.propValueId;
                        }
                    }
                    if (C123100dR.LIZ(str)) {
                        arrayList.add(str);
                    } else {
                        arrayList.add("");
                    }
                }
            }
            return arrayList;
        }
        return listLJLI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:
    
        if (r1 != null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection r10, java.lang.String[] r11) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7878035w.LJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuSelection, java.lang.String[]):java.util.List");
    }

    public static SkuItem LJIIIIZZ(String str, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (u.LJIJI(((SkuItem) next).salePropValueIds, str, false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (SkuItem) next;
    }

    public static SkuItem LJI(List list, List list2, String[] strArr) {
        if (strArr == null || list == null || list2 == null) {
            return null;
        }
        boolean z = false;
        if (strArr.length == list2.size()) {
            z = true;
            for (String str : strArr) {
                if (Intrinsics.LJFF(str, "")) {
                    z = false;
                }
            }
        }
        if (!(!list.isEmpty()) || !z) {
            return null;
        }
        return LJIIIIZZ(LIZLLL(strArr), list);
    }

    public static Image LIZJ(String[] strArr, List list, List list2, boolean z) {
        Object next;
        Image image;
        if (!z) {
            if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
                return null;
            }
            if (strArr.length == list.size()) {
                for (String str : strArr) {
                    if (str.length() != 0) {
                    }
                }
                SkuItem skuItemLJIIIIZZ = LJIIIIZZ(LIZLLL(strArr), list2);
                if (skuItemLJIIIIZZ == null) {
                    return null;
                }
                return skuItemLJIIIIZZ.originalImage;
            }
        } else {
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
            SkuItem skuItemLJIIIIZZ2 = LJIIIIZZ(LIZLLL(strArr), list2);
            if (skuItemLJIIIIZZ2 != null) {
                return skuItemLJIIIIZZ2.originalImage;
            }
        }
        List listLJJLL = C13LQ.LJJLL(strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            List<SkuSaleProp> list3 = ((SkuItem) obj).skuSalePropList;
            if (list3 != null) {
                Iterator<SkuSaleProp> it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        SkuSaleProp next2 = it2.next();
                        Iterator it3 = listLJJLL.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.LJFF(next2.propValueId, it3.next())) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                Integer num = ((SkuItem) next).stockNum;
                if (num != null && num.intValue() > 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SkuItem skuItem = (SkuItem) next;
        if (skuItem != null && (image = skuItem.originalImage) != null) {
            return image;
        }
        SkuItem skuItem2 = (SkuItem) C13LP.LJJJLL(arrayList);
        if (skuItem2 == null) {
            return null;
        }
        return skuItem2.originalImage;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: CancellationException -> 0x005f, all -> 0x0064, TryCatch #2 {CancellationException -> 0x005f, all -> 0x0064, blocks: (B:4:0x0018, B:6:0x001c, B:8:0x0022, B:11:0x002d, B:13:0x003d, B:9:0x0027, B:12:0x0036), top: B:23:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r3, com.bytedance.tux.input.TuxTextView r4, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag r5, int r6, int r7, int r8, int r9) {
        /*
            if (r5 == 0) goto L68
            r0 = 0
            X.C12ES.LJIILL(r0, r4)
            int r6 = r6 + r8
            int r0 = -r6
            X.C0H9H.LJI(r0, r4)
            int r7 = r7 + r9
            int r0 = -r7
            X.C0H9H.LIZLLL(r0, r4)
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r2 = r5.text
            java.lang.String r1 = "hot_selling_tag_tips"
            r0 = 0
            X.C03C8.LIZJ(r4, r2, r1, r0)
            com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor r1 = r5.backgroundColor     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            if (r1 == 0) goto L36
            boolean r0 = X.C960203pA.LIZIZ(r3)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            if (r0 == 0) goto L27
            java.lang.String r0 = r1.getDarkColor()     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            goto L2b
        L27:
            java.lang.String r0 = r1.getColor()     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
        L2b:
            if (r0 == 0) goto L36
            int r0 = X.C0HEZ.LIZIZ(r0)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            goto L3d
        L36:
            r0 = 2131100455(0x7f060327, float:1.7813292E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r3)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
        L3d:
            X.0F3z r1 = new X.0F3z     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            r1.<init>()     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            r1.LIZ = r0     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            float r0 = X.C418440Gaw.LIZIZ(r0)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            r1.LIZJ = r0     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            android.graphics.drawable.Drawable r0 = r1.LIZ(r3)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            r4.setBackground(r0)     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.util.concurrent.CancellationException -> L5f java.lang.Throwable -> L64
            if (r0 != 0) goto L6b
            goto L68
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L68:
            X.C0H1U.LIZIZ(r4)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7878035w.LIZ(android.content.Context, com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag, int, int, int, int):void");
    }
}
