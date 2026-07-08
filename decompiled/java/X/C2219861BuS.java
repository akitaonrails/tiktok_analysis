package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219861BuS extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219861BuS(C2219971Bud c2219971Bud) {
        super(2, c2219971Bud, C2219971Bud.class, "vibrateShort", "vibrateShort(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220181Buy invoke(org.json.JSONObject r6, java.lang.Integer r7) throws org.json.JSONException {
        /*
            r5 = this;
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r4 = r7.intValue()
            java.lang.Object r2 = r5.receiver
            X.1Bud r2 = (X.C2219971Bud) r2
            X.1BuU r0 = r2.LIZIZ
            boolean r0 = r0.LIZ
            if (r0 != 0) goto L1b
            X.1Buy r0 = X.C2220181Buy.LIZJ
            java.lang.String r0 = "vibrateShort:fail app in pause"
            X.1Buy r3 = X.C2220191Buz.LIZ(r0)
            return r3
        L1b:
            java.lang.String r1 = "type"
            java.lang.String r0 = ""
            java.lang.String r3 = r6.optString(r1, r0)
            if (r3 == 0) goto L80
            int r1 = r3.hashCode()
            r0 = -1078030475(0xffffffffbfbe8f75, float:-1.488753)
            if (r1 == r0) goto L75
            r0 = 99152071(0x5e8f0c7, float:2.1905623E-35)
            if (r1 == r0) goto L6a
            r0 = 102970646(0x6233516, float:3.0695894E-35)
            if (r1 != r0) goto L80
            java.lang.String r0 = "light"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L80
            X.1BuE r1 = X.EnumC2219721BuE.SHORT_LIGHT
        L42:
            X.0pmp r0 = r2.LIZ
            X.1BuA r0 = r0.LJFF
            X.0oqi r1 = r0.LJLJJLL(r1)
            X.0oqi r0 = X.EnumC1488940oqi.OK
            if (r1 != r0) goto L88
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r1 = "errMsg"
            java.lang.String r0 = "vibrateShort:ok"
            r3.put(r1, r0)
            X.1Buy r0 = X.C2220181Buy.LIZJ
            X.1Buy r3 = X.C2220191Buz.LIZIZ(r3)
            X.18gE r1 = r2.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.LJJLIIJ(r0, r3)
            return r3
        L6a:
            java.lang.String r0 = "heavy"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L80
            X.1BuE r1 = X.EnumC2219721BuE.SHORT_HEAVY
            goto L42
        L75:
            java.lang.String r0 = "medium"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L80
            X.1BuE r1 = X.EnumC2219721BuE.SHORT_MEDIUM
            goto L42
        L80:
            X.1BuM r0 = X.EnumC2219721BuE.Companion
            r0.getClass()
            X.1BuE r1 = X.EnumC2219721BuE.SHORT
            goto L42
        L88:
            X.0oqi r0 = X.EnumC1488940oqi.UNSUPPORTED
            if (r1 != r0) goto La4
            java.lang.String r1 = "unsupported"
        L8e:
            X.1Buy r0 = X.C2220181Buy.LIZJ
            java.lang.String r0 = "vibrateShort:fail "
            java.lang.String r0 = r0.concat(r1)
            X.1Buy r3 = X.C2220191Buz.LIZ(r0)
            X.18gE r1 = r2.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.LJJLIIJ(r0, r3)
            return r3
        La4:
            java.lang.String r1 = "unknown error"
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2219861BuS.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
