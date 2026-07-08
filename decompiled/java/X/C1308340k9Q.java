package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k9Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308340k9Q {
    public static AbstractC1308290k9L LIZ(JSONObject jSONObject) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("exprSeq");
        if (jSONObjectOptJSONObject != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject) { // from class: X.0k9e
                public final List<AbstractC1308040k8w> LIZIZ;

                {
                    this.LIZIZ = C1308470k9d.LIZ(JSONObjectProtectorUtils.getJSONArray(jSONObjectOptJSONObject, "expressions"));
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r7, X.InterfaceC1364105Vn<java.lang.Object> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof X.C1308510k9h
                        if (r0 == 0) goto L4c
                        r5 = r8
                        X.0k9h r5 = (X.C1308510k9h) r5
                        int r2 = r5.LLILZIL
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L4c
                        int r2 = r2 - r1
                        r5.LLILZIL = r2
                    L12:
                        java.lang.Object r0 = r5.LLILLL
                        java.lang.Object r4 = X.C099R.LJFF()
                        int r1 = r5.LLILZIL
                        r3 = 1
                        if (r1 == 0) goto L41
                        if (r1 != r3) goto L53
                        java.lang.Object r2 = r5.LLILLJJLI
                        java.util.Iterator r2 = (java.util.Iterator) r2
                        X.0k8L r7 = r5.LL
                        X.C155000ia.LIZIZ(r0)
                    L28:
                        boolean r1 = r2.hasNext()
                        if (r1 == 0) goto L52
                        java.lang.Object r0 = r2.next()
                        X.0k8w r0 = (X.AbstractC1308040k8w) r0
                        r5.LL = r7
                        r5.LLILLJJLI = r2
                        r5.LLILZIL = r3
                        java.lang.Object r0 = r0.LIZ(r7, r5)
                        if (r0 != r4) goto L28
                        return r4
                    L41:
                        X.C155000ia.LIZIZ(r0)
                        java.util.List<X.0k8w> r0 = r6.LIZIZ
                        java.util.Iterator r2 = r0.iterator()
                        r0 = 0
                        goto L28
                    L4c:
                        X.0k9h r5 = new X.0k9h
                        r5.<init>(r6, r8)
                        goto L12
                    L52:
                        return r0
                    L53:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308480k9e.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("memberIndex");
        if (jSONObjectOptJSONObject2 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject2) { // from class: X.0k9M
                public final AbstractC1308040k8w LIZIZ;
                public final AbstractC1308040k8w LIZJ;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append('[');
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(']');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    AbstractC1308290k9L abstractC1308290k9LLIZ = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject2, "receiver"));
                    AbstractC1308290k9L abstractC1308290k9LLIZ2 = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject2, "index"));
                    this.LIZIZ = abstractC1308290k9LLIZ;
                    this.LIZJ = abstractC1308290k9LLIZ2;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r7, X.InterfaceC1364105Vn<java.lang.Object> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof X.C1308310k9N
                        if (r0 == 0) goto L5d
                        r5 = r8
                        X.0k9N r5 = (X.C1308310k9N) r5
                        int r2 = r5.LLILZ
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L5d
                        int r2 = r2 - r1
                        r5.LLILZ = r2
                    L12:
                        java.lang.Object r4 = r5.LLILLJJLI
                        java.lang.Object r3 = X.C099R.LJFF()
                        int r0 = r5.LLILZ
                        r2 = 2
                        r1 = 1
                        if (r0 == 0) goto L36
                        if (r0 == r1) goto L46
                        if (r0 != r2) goto L92
                        java.lang.Object r1 = r5.LL
                        X.C155000ia.LIZIZ(r4)
                    L27:
                        boolean r0 = r1 instanceof java.util.List
                        if (r0 == 0) goto L63
                        java.util.List r1 = (java.util.List) r1
                        int r0 = X.AbstractC1308290k9L.LIZLLL(r4)
                        java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
                        return r0
                    L36:
                        X.C155000ia.LIZIZ(r4)
                        X.0k8w r0 = r6.LIZIZ
                        r5.LL = r7
                        r5.LLILZ = r1
                        java.lang.Object r4 = r0.LIZ(r7, r5)
                        if (r4 != r3) goto L4d
                        return r3
                    L46:
                        java.lang.Object r7 = r5.LL
                        X.0k8L r7 = (X.C1307670k8L) r7
                        X.C155000ia.LIZIZ(r4)
                    L4d:
                        X.0k8w r0 = r6.LIZJ
                        r5.LL = r4
                        r5.LLILZ = r2
                        java.lang.Object r0 = r0.LIZ(r7, r5)
                        if (r0 != r3) goto L5a
                        return r3
                    L5a:
                        r1 = r4
                        r4 = r0
                        goto L27
                    L5d:
                        X.0k9N r5 = new X.0k9N
                        r5.<init>(r6, r8)
                        goto L12
                    L63:
                        boolean r0 = r1 instanceof java.util.Map
                        if (r0 == 0) goto L6e
                        java.util.Map r1 = (java.util.Map) r1
                        java.lang.Object r0 = r1.get(r4)
                        return r0
                    L6e:
                        boolean r0 = r1 instanceof org.json.JSONArray
                        if (r0 == 0) goto L7d
                        org.json.JSONArray r1 = (org.json.JSONArray) r1
                        int r0 = X.AbstractC1308290k9L.LIZLLL(r4)
                        java.lang.Object r0 = r1.get(r0)
                        return r0
                    L7d:
                        boolean r0 = r1 instanceof org.json.JSONObject
                        if (r0 == 0) goto L8a
                        org.json.JSONObject r1 = (org.json.JSONObject) r1
                        java.lang.String r4 = (java.lang.String) r4
                        java.lang.Object r0 = r1.opt(r4)
                        return r0
                    L8a:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Unsupported receiver for member index"
                        r1.<init>(r0)
                        throw r1
                    L92:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308300k9M.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("fnCall");
        if (jSONObjectOptJSONObject3 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject3) { // from class: X.0k9f
                public final String LIZIZ;
                public final List<AbstractC1308040k8w> LIZJ;

                {
                    List<AbstractC1308040k8w> listLIZ;
                    String string = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject3, FollowStatusChangeMethod.PARAM_UID);
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("args");
                    if (jSONArrayOptJSONArray != null) {
                        listLIZ = C1308470k9d.LIZ(jSONArrayOptJSONArray);
                    } else {
                        listLIZ = C13BV.INSTANCE;
                    }
                    this.LIZIZ = string;
                    this.LIZJ = listLIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:16:0x004f). Please report as a decompilation issue!!! */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r10, X.InterfaceC1364105Vn<java.lang.Object> r11) {
                    /*
                        Method dump skipped, instruction units count: 236
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308490k9f.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("unaryOp");
        if (jSONObjectOptJSONObject4 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject4) { // from class: X.0k9X
                public final EnumC1308440k9a LIZIZ;
                public final AbstractC1308040k8w LIZJ;

                {
                    EnumC1308440k9a enumC1308440k9aValueOf = EnumC1308440k9a.valueOf(jSONObjectOptJSONObject4.optString("op", "MINUS"));
                    AbstractC1308290k9L abstractC1308290k9LLIZ = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject4, "operand"));
                    this.LIZIZ = enumC1308440k9aValueOf;
                    this.LIZJ = abstractC1308290k9LLIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r6, X.InterfaceC1364105Vn<java.lang.Object> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof X.C1308420k9Y
                        if (r0 == 0) goto L4c
                        r4 = r7
                        X.0k9Y r4 = (X.C1308420k9Y) r4
                        int r2 = r4.LLILLL
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L4c
                        int r2 = r2 - r1
                        r4.LLILLL = r2
                    L12:
                        java.lang.Object r3 = r4.LL
                        java.lang.Object r1 = X.C099R.LJFF()
                        int r0 = r4.LLILLL
                        r2 = 1
                        if (r0 == 0) goto L3e
                        if (r0 != r2) goto La2
                        X.C155000ia.LIZIZ(r3)
                    L22:
                        X.0k9a r0 = r5.LIZIZ
                        int[] r1 = X.C1308430k9Z.LIZ
                        int r0 = r0.ordinal()
                        r1 = r1[r0]
                        if (r1 == r2) goto L58
                        r0 = 2
                        if (r1 != r0) goto L52
                        java.lang.Boolean r3 = (java.lang.Boolean) r3
                        boolean r0 = r3.booleanValue()
                        r0 = r0 ^ 1
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    L3e:
                        X.C155000ia.LIZIZ(r3)
                        X.0k8w r0 = r5.LIZJ
                        r4.LLILLL = r2
                        java.lang.Object r3 = r0.LIZ(r6, r4)
                        if (r3 != r1) goto L22
                        return r1
                    L4c:
                        X.0k9Y r4 = new X.0k9Y
                        r4.<init>(r5, r7)
                        goto L12
                    L52:
                        X.07lC r0 = new X.07lC
                        r0.<init>()
                        throw r0
                    L58:
                        boolean r0 = r3 instanceof java.lang.Integer
                        if (r0 == 0) goto L68
                        java.lang.Number r3 = (java.lang.Number) r3
                        int r0 = r3.intValue()
                        int r0 = -r0
                        java.lang.Integer r0 = X.C2286608xc.LJ(r0)
                        return r0
                    L68:
                        boolean r0 = r3 instanceof java.lang.Long
                        if (r0 == 0) goto L78
                        java.lang.Number r3 = (java.lang.Number) r3
                        long r2 = r3.longValue()
                        long r0 = -r2
                        java.lang.Long r0 = X.C2286608xc.LJFF(r0)
                        return r0
                    L78:
                        boolean r0 = r3 instanceof java.lang.Float
                        if (r0 == 0) goto L88
                        java.lang.Number r3 = (java.lang.Number) r3
                        float r0 = r3.floatValue()
                        float r0 = -r0
                        java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)
                        return r0
                    L88:
                        boolean r0 = r3 instanceof java.lang.Double
                        if (r0 == 0) goto L98
                        java.lang.Number r3 = (java.lang.Number) r3
                        double r2 = r3.doubleValue()
                        double r0 = -r2
                        java.lang.Double r0 = X.C2286608xc.LIZJ(r0)
                        return r0
                    L98:
                        double r2 = X.AbstractC1308290k9L.LIZJ(r3)
                        double r0 = -r2
                        java.lang.Double r0 = X.C2286608xc.LIZJ(r0)
                        return r0
                    La2:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308410k9X.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("binaryOp");
        if (jSONObjectOptJSONObject5 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject5) { // from class: X.0k9V
                public final EnumC2215661Bng LIZIZ;
                public final AbstractC1308040k8w LIZJ;
                public final AbstractC1308040k8w LIZLLL;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(' ');
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(' ');
                    sbLIZ.append(this.LIZLLL);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    EnumC2215661Bng enumC2215661BngValueOf = EnumC2215661Bng.valueOf(jSONObjectOptJSONObject5.optString("op", "OR"));
                    AbstractC1308290k9L abstractC1308290k9LLIZ = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject5, "lhs"));
                    AbstractC1308290k9L abstractC1308290k9LLIZ2 = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject5, "rhs"));
                    this.LIZIZ = enumC2215661BngValueOf;
                    this.LIZJ = abstractC1308290k9LLIZ;
                    this.LIZLLL = abstractC1308290k9LLIZ2;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r8, X.InterfaceC1364105Vn<java.lang.Object> r9) {
                    /*
                        Method dump skipped, instruction units count: 392
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308390k9V.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("assignment");
        if (jSONObjectOptJSONObject6 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject6) { // from class: X.0k9T
                public final String LIZIZ;
                public final AbstractC1308040k8w LIZJ;

                public final String toString() {
                    return this.LIZIZ;
                }

                {
                    String string = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject6, FollowStatusChangeMethod.PARAM_UID);
                    AbstractC1308290k9L abstractC1308290k9LLIZ = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject6, "value"));
                    this.LIZIZ = string;
                    this.LIZJ = abstractC1308290k9LLIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r6, X.InterfaceC1364105Vn<java.lang.Object> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof X.C1308380k9U
                        if (r0 == 0) goto L3c
                        r4 = r7
                        X.0k9U r4 = (X.C1308380k9U) r4
                        int r2 = r4.LLILZ
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L3c
                        int r2 = r2 - r1
                        r4.LLILZ = r2
                    L12:
                        java.lang.Object r3 = r4.LLILLJJLI
                        java.lang.Object r2 = X.C099R.LJFF()
                        int r0 = r4.LLILZ
                        r1 = 1
                        if (r0 == 0) goto L2c
                        if (r0 != r1) goto L42
                        X.0k8L r6 = r4.LL
                        X.C155000ia.LIZIZ(r3)
                    L24:
                        java.lang.String r1 = r5.LIZIZ
                        java.util.Map<java.lang.String, java.lang.Object> r0 = r6.LIZ
                        r0.put(r1, r3)
                        return r3
                    L2c:
                        X.C155000ia.LIZIZ(r3)
                        X.0k8w r0 = r5.LIZJ
                        r4.LL = r6
                        r4.LLILZ = r1
                        java.lang.Object r3 = r0.LIZ(r6, r4)
                        if (r3 != r2) goto L24
                        return r2
                    L3c:
                        X.0k9U r4 = new X.0k9U
                        r4.<init>(r5, r7)
                        goto L12
                    L42:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308370k9T.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("memberAssign");
        if (jSONObjectOptJSONObject7 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject7) { // from class: X.0k9b
                public final AbstractC1308040k8w LIZIZ;
                public final AbstractC1308040k8w LIZJ;
                public final AbstractC1308040k8w LIZLLL;

                public final String toString() {
                    return this.LIZIZ.toString();
                }

                {
                    AbstractC1308290k9L abstractC1308290k9LLIZ = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject7, "receiver"));
                    AbstractC1308290k9L abstractC1308290k9LLIZ2 = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject7, "index"));
                    AbstractC1308290k9L abstractC1308290k9LLIZ3 = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject7, "value"));
                    this.LIZIZ = abstractC1308290k9LLIZ;
                    this.LIZJ = abstractC1308290k9LLIZ2;
                    this.LIZLLL = abstractC1308290k9LLIZ3;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r8, X.InterfaceC1364105Vn<java.lang.Object> r9) throws org.json.JSONException {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof X.C1308460k9c
                        if (r0 == 0) goto L82
                        r6 = r9
                        X.0k9c r6 = (X.C1308460k9c) r6
                        int r2 = r6.LLILZIL
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L82
                        int r2 = r2 - r1
                        r6.LLILZIL = r2
                    L12:
                        java.lang.Object r2 = r6.LLILLL
                        java.lang.Object r5 = X.C099R.LJFF()
                        int r0 = r6.LLILZIL
                        r4 = 3
                        r3 = 2
                        r1 = 1
                        if (r0 == 0) goto L3e
                        if (r0 == r1) goto L4e
                        if (r0 == r3) goto L67
                        if (r0 != r4) goto Lb8
                        java.lang.Object r3 = r6.LLILLJJLI
                        java.lang.Object r1 = r6.LL
                        X.C155000ia.LIZIZ(r2)
                    L2c:
                        boolean r0 = X.C19719512Dh.LJI(r1)
                        if (r0 == 0) goto L88
                        java.util.List r1 = X.C19719512Dh.LIZIZ(r1)
                        int r0 = X.AbstractC1308290k9L.LIZLLL(r3)
                        com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r0, r2)
                        return r2
                    L3e:
                        X.C155000ia.LIZIZ(r2)
                        X.0k8w r0 = r7.LIZIZ
                        r6.LL = r8
                        r6.LLILZIL = r1
                        java.lang.Object r2 = r0.LIZ(r8, r6)
                        if (r2 != r5) goto L55
                        return r5
                    L4e:
                        java.lang.Object r8 = r6.LL
                        X.0k8L r8 = (X.C1307670k8L) r8
                        X.C155000ia.LIZIZ(r2)
                    L55:
                        X.0k8w r0 = r7.LIZJ
                        r6.LL = r8
                        r6.LLILLJJLI = r2
                        r6.LLILZIL = r3
                        java.lang.Object r0 = r0.LIZ(r8, r6)
                        if (r0 != r5) goto L64
                        return r5
                    L64:
                        r1 = r2
                        r2 = r0
                        goto L70
                    L67:
                        java.lang.Object r1 = r6.LLILLJJLI
                        java.lang.Object r8 = r6.LL
                        X.0k8L r8 = (X.C1307670k8L) r8
                        X.C155000ia.LIZIZ(r2)
                    L70:
                        X.0k8w r0 = r7.LIZLLL
                        r6.LL = r1
                        r6.LLILLJJLI = r2
                        r6.LLILZIL = r4
                        java.lang.Object r0 = r0.LIZ(r8, r6)
                        if (r0 != r5) goto L7f
                        return r5
                    L7f:
                        r3 = r2
                        r2 = r0
                        goto L2c
                    L82:
                        X.0k9c r6 = new X.0k9c
                        r6.<init>(r7, r9)
                        goto L12
                    L88:
                        boolean r0 = X.C19719512Dh.LJII(r1)
                        if (r0 == 0) goto L96
                        java.util.Map r0 = X.C19719512Dh.LIZJ(r1)
                        r0.put(r3, r2)
                        return r2
                    L96:
                        boolean r0 = r1 instanceof org.json.JSONArray
                        if (r0 == 0) goto La4
                        org.json.JSONArray r1 = (org.json.JSONArray) r1
                        int r0 = X.AbstractC1308290k9L.LIZLLL(r3)
                        r1.put(r0, r2)
                        return r2
                    La4:
                        boolean r0 = r1 instanceof org.json.JSONObject
                        if (r0 == 0) goto Lb0
                        org.json.JSONObject r1 = (org.json.JSONObject) r1
                        java.lang.String r3 = (java.lang.String) r3
                        r1.put(r3, r2)
                        return r2
                    Lb0:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Unsupported receiver for member assignment"
                        r1.<init>(r0)
                        throw r1
                    Lb8:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308450k9b.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject(FollowStatusChangeMethod.PARAM_UID);
        if (jSONObjectOptJSONObject8 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject8) { // from class: X.0k9J
                public final String LIZIZ;

                public final String toString() {
                    return this.LIZIZ;
                }

                {
                    this.LIZIZ = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject8, FollowStatusChangeMethod.PARAM_UID);
                }

                @Override // X.AbstractC1308040k8w
                public final Object LIZ(C1307670k8L c1307670k8L, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
                    return c1307670k8L.LIZ.get(this.LIZIZ);
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("literal");
        if (jSONObjectOptJSONObject9 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject9) { // from class: X.0k9K
                public final Object LIZIZ;

                public final String toString() {
                    String string;
                    Object obj = this.LIZIZ;
                    return (obj == null || (string = obj.toString()) == null) ? "null" : string;
                }

                {
                    Object objOpt = jSONObjectOptJSONObject9.opt("b");
                    if (objOpt == null && (objOpt = jSONObjectOptJSONObject9.opt("s")) == null && (objOpt = jSONObjectOptJSONObject9.opt("d")) == null && (objOpt = jSONObjectOptJSONObject9.opt("i32")) == null) {
                        objOpt = jSONObjectOptJSONObject9.opt("i64");
                    }
                    this.LIZIZ = objOpt;
                }

                @Override // X.AbstractC1308040k8w
                public final Object LIZ(C1307670k8L c1307670k8L, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
                    return this.LIZIZ;
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("cond");
        if (jSONObjectOptJSONObject10 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject10) { // from class: X.0k9R
                public final AbstractC1308040k8w LIZIZ;
                public final AbstractC1308040k8w LIZJ;
                public final AbstractC1308040k8w LIZLLL;

                {
                    AbstractC1308290k9L abstractC1308290k9LLIZ;
                    AbstractC1308290k9L abstractC1308290k9LLIZ2 = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject10, "cond"));
                    JSONObject jSONObjectOptJSONObject11 = jSONObjectOptJSONObject10.optJSONObject("then");
                    if (jSONObjectOptJSONObject11 != null) {
                        abstractC1308290k9LLIZ = C1308340k9Q.LIZ(jSONObjectOptJSONObject11);
                    } else {
                        abstractC1308290k9LLIZ = null;
                    }
                    JSONObject jSONObjectOptJSONObject12 = jSONObjectOptJSONObject10.optJSONObject("orElse");
                    AbstractC1308290k9L abstractC1308290k9LLIZ3 = jSONObjectOptJSONObject12 != null ? C1308340k9Q.LIZ(jSONObjectOptJSONObject12) : null;
                    this.LIZIZ = abstractC1308290k9LLIZ2;
                    this.LIZJ = abstractC1308290k9LLIZ;
                    this.LIZLLL = abstractC1308290k9LLIZ3;
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r8, X.InterfaceC1364105Vn<java.lang.Object> r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof X.C1308360k9S
                        if (r0 == 0) goto L65
                        r6 = r9
                        X.0k9S r6 = (X.C1308360k9S) r6
                        int r2 = r6.LLILZ
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L65
                        int r2 = r2 - r1
                        r6.LLILZ = r2
                    L12:
                        java.lang.Object r5 = r6.LLILLJJLI
                        java.lang.Object r4 = X.C099R.LJFF()
                        int r0 = r6.LLILZ
                        r3 = 3
                        r2 = 2
                        r1 = 1
                        if (r0 == 0) goto L29
                        if (r0 == r1) goto L39
                        if (r0 == r2) goto L73
                        if (r0 != r3) goto L6b
                        X.C155000ia.LIZIZ(r5)
                    L28:
                        return r5
                    L29:
                        X.C155000ia.LIZIZ(r5)
                        X.0k8w r0 = r7.LIZIZ
                        r6.LL = r8
                        r6.LLILZ = r1
                        java.lang.Object r5 = r0.LIZ(r8, r6)
                        if (r5 != r4) goto L3e
                        return r4
                    L39:
                        X.0k8L r8 = r6.LL
                        X.C155000ia.LIZIZ(r5)
                    L3e:
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        boolean r0 = r5.booleanValue()
                        r1 = 0
                        if (r0 == 0) goto L56
                        X.0k8w r0 = r7.LIZJ
                        if (r0 == 0) goto L77
                        r6.LL = r1
                        r6.LLILZ = r2
                        java.lang.Object r5 = r0.LIZ(r8, r6)
                        if (r5 != r4) goto L76
                        return r4
                    L56:
                        X.0k8w r0 = r7.LIZLLL
                        if (r0 == 0) goto L77
                        r6.LL = r1
                        r6.LLILZ = r3
                        java.lang.Object r5 = r0.LIZ(r8, r6)
                        if (r5 != r4) goto L28
                        return r4
                    L65:
                        X.0k9S r6 = new X.0k9S
                        r6.<init>(r7, r9)
                        goto L12
                    L6b:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    L73:
                        X.C155000ia.LIZIZ(r5)
                    L76:
                        return r5
                    L77:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308350k9R.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        final JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("forIn");
        if (jSONObjectOptJSONObject11 != null) {
            return new AbstractC1308290k9L(jSONObjectOptJSONObject11) { // from class: X.0k9O
                public final String LIZIZ;
                public final AbstractC1308040k8w LIZJ;
                public final AbstractC1308040k8w LIZLLL;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(" in ");
                    sbLIZ.append(this.LIZJ);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    AbstractC1308290k9L abstractC1308290k9LLIZ;
                    String string = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject11, FollowStatusChangeMethod.PARAM_UID);
                    AbstractC1308290k9L abstractC1308290k9LLIZ2 = C1308340k9Q.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject11, "iterable"));
                    JSONObject jSONObjectOptJSONObject12 = jSONObjectOptJSONObject11.optJSONObject("body");
                    if (jSONObjectOptJSONObject12 != null) {
                        abstractC1308290k9LLIZ = C1308340k9Q.LIZ(jSONObjectOptJSONObject12);
                    } else {
                        abstractC1308290k9LLIZ = null;
                    }
                    this.LIZIZ = string;
                    this.LIZJ = abstractC1308290k9LLIZ2;
                    this.LIZLLL = abstractC1308290k9LLIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:15:0x0035). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0096 -> B:35:0x00a3). Please report as a decompilation issue!!! */
                @Override // X.AbstractC1308040k8w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C1307670k8L r10, X.InterfaceC1364105Vn<java.lang.Object> r11) {
                    /*
                        Method dump skipped, instruction units count: 315
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1308320k9O.LIZ(X.0k8L, X.05Vn):java.lang.Object");
                }
            };
        }
        throw new IllegalStateException("Unsupported node type");
    }
}
