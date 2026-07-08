package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900710ZVd {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(181));
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(65));

    public static Map LIZ(int i, int i2, C869590Y9l c869590Y9l) {
        int iIntValue;
        int iIntValue2;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer numValueOf = Integer.valueOf(i);
        String localExtValue = c869590Y9l.getLocalExtValue("a:width_px");
        if (localExtValue != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(localExtValue)) != null) {
            iIntValue = numLJIIJJI2.intValue();
        } else {
            iIntValue = 0;
        }
        if (numValueOf == null || iIntValue != numValueOf.intValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cacheCardWidth width:");
            sbLIZ.append(numValueOf);
            sbLIZ.append(", recordWidth:");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", msg = ");
            sbLIZ.append(c869590Y9l.getUuid());
            C2188811AlT.LIZIZ(sbLIZ);
            c869590Y9l.addLocalExt("a:width_px", String.valueOf(numValueOf));
            linkedHashMap.put("a:width_px", new C0Y3R(String.valueOf(i)));
        }
        Integer numValueOf2 = Integer.valueOf(i2);
        String localExtValue2 = c869590Y9l.getLocalExtValue("a:height_px");
        if (localExtValue2 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(localExtValue2)) != null) {
            iIntValue2 = numLJIIJJI.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (numValueOf2 == null || iIntValue2 != numValueOf2.intValue()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cacheCardWidth height:");
            sbLIZ2.append(numValueOf2);
            sbLIZ2.append(", recordHeight:");
            sbLIZ2.append(iIntValue2);
            sbLIZ2.append(", msg = ");
            sbLIZ2.append(c869590Y9l.getUuid());
            C2188811AlT.LIZIZ(sbLIZ2);
            c869590Y9l.addLocalExt("a:height_px", String.valueOf(numValueOf2));
            linkedHashMap.put("a:height_px", new C0Y3R(String.valueOf(i2)));
        }
        if (!(!linkedHashMap.isEmpty())) {
            return null;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(X.C869590Y9l r10, com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent r11, java.lang.Integer r12, java.lang.Integer r13) {
        /*
            r6 = 0
            if (r10 == 0) goto La5
            java.lang.String r0 = "a:width_px"
            java.lang.String r0 = r10.getLocalExtValue(r0)
            if (r0 == 0) goto La5
            java.lang.Integer r5 = X.C2095008Iq.LJIIJJI(r0)
            if (r5 == 0) goto La6
            int r9 = r5.intValue()
        L15:
            if (r9 != 0) goto L19
            int r9 = X.C900710ZVd.LIZ
        L19:
            if (r10 == 0) goto L9a
            java.lang.String r0 = "a:height_px"
            java.lang.String r0 = r10.getLocalExtValue(r0)
            if (r0 == 0) goto L9a
            java.lang.Integer r4 = X.C2095008Iq.LJIIJJI(r0)
            if (r4 == 0) goto L9b
            int r8 = r4.intValue()
        L2d:
            if (r8 != 0) goto L31
            int r8 = X.C900710ZVd.LIZIZ
        L31:
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZIZ()
            X.13DA r3 = new X.13DA
            r3.<init>()
            java.lang.String r2 = "1"
            java.lang.String r7 = "0"
            if (r5 == 0) goto L98
            if (r4 == 0) goto L98
            r1 = r2
        L44:
            java.lang.String r0 = "is_cached"
            r3.put(r0, r1)
            if (r11 == 0) goto L96
            java.lang.String r1 = r11.cardTemplate
        L4d:
            java.lang.String r0 = "card_template"
            r3.put(r0, r1)
            if (r11 == 0) goto L94
            java.lang.String r1 = r11.cardKey
        L56:
            java.lang.String r0 = "card_key"
            r3.put(r0, r1)
            if (r10 == 0) goto L61
            java.lang.String r6 = r10.getScene()
        L61:
            java.lang.String r0 = "lynx_scene"
            r3.put(r0, r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r12)
            if (r0 == 0) goto L92
            if (r5 == 0) goto L92
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r13)
            if (r0 == 0) goto L92
            if (r4 == 0) goto L92
        L76:
            java.lang.String r0 = "is_match_default"
            r3.put(r0, r2)
            java.util.Map r1 = r3.build()
            java.lang.String r0 = "dm_lynx_size_cached_rate"
            X.C20684815ws.LJIILLIIL(r0, r1)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.<init>(r1, r0)
            return r2
        L92:
            r2 = r7
            goto L76
        L94:
            r1 = r6
            goto L56
        L96:
            r1 = r6
            goto L4d
        L98:
            r1 = r7
            goto L44
        L9a:
            r4 = r6
        L9b:
            if (r13 == 0) goto La2
            int r8 = r13.intValue()
            goto L2d
        La2:
            int r8 = X.C900710ZVd.LIZIZ
            goto L2d
        La5:
            r5 = r6
        La6:
            if (r12 == 0) goto Lae
            int r9 = r12.intValue()
            goto L15
        Lae:
            int r9 = X.C900710ZVd.LIZ
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C900710ZVd.LIZIZ(X.0Y9l, com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent, java.lang.Integer, java.lang.Integer):kotlin.Pair");
    }
}
