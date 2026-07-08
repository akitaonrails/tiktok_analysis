package X;

import java.util.EnumMap;

/* JADX INFO: renamed from: X.12ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZP {
    public final EnumMap<EnumC19776112Zb, EnumC19776012Za> LIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (EnumC19776112Zb enumC19776112Zb : EnumC19776112Zb.values()) {
            EnumC19776012Za enumC19776012Za = this.LIZ.get(enumC19776112Zb);
            if (enumC19776012Za == null) {
                enumC19776012Za = EnumC19776012Za.LLILLJJLI;
            }
            sb.append(enumC19776012Za.LL);
        }
        return sb.toString();
    }

    public C12ZP() {
        this.LIZ = new EnumMap<>(EnumC19776112Zb.class);
    }

    public C12ZP(EnumMap<EnumC19776112Zb, EnumC19776012Za> enumMap) {
        EnumMap<EnumC19776112Zb, EnumC19776012Za> enumMap2 = new EnumMap<>(EnumC19776112Zb.class);
        this.LIZ = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static C12ZP LIZ(String str) {
        EnumC19776012Za enumC19776012Za;
        EnumMap enumMap = new EnumMap(EnumC19776112Zb.class);
        if (str.length() >= EnumC19776112Zb.values().length && str.charAt(0) == '1') {
            EnumC19776112Zb[] enumC19776112ZbArrValues = EnumC19776112Zb.values();
            int length = enumC19776112ZbArrValues.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                EnumC19776112Zb enumC19776112Zb = enumC19776112ZbArrValues[i2];
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                EnumC19776012Za[] enumC19776012ZaArrValues = EnumC19776012Za.values();
                int length2 = enumC19776012ZaArrValues.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length2) {
                        enumC19776012Za = enumC19776012ZaArrValues[i4];
                        if (enumC19776012Za.LL != cCharAt) {
                            i4++;
                        }
                    } else {
                        enumC19776012Za = EnumC19776012Za.LLILLJJLI;
                        break;
                    }
                }
                enumMap.put(enumC19776112Zb, enumC19776012Za);
                i2++;
                i = i3;
            }
            return new C12ZP(enumMap);
        }
        return new C12ZP();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.EnumC19776112Zb r3, int r4) {
        /*
            r2 = this;
            X.12Za r1 = X.EnumC19776012Za.LLILLJJLI
            r0 = -30
            if (r4 == r0) goto L22
            r0 = -20
            if (r4 == r0) goto L1f
            r0 = -10
            if (r4 == r0) goto L1c
            if (r4 == 0) goto L1f
            r0 = 30
            if (r4 != r0) goto L16
            X.12Za r1 = X.EnumC19776012Za.LLILZLL
        L16:
            java.util.EnumMap<X.12Zb, X.12Za> r0 = r2.LIZ
            r0.put(r3, r1)
            return
        L1c:
            X.12Za r1 = X.EnumC19776012Za.LLILZIL
            goto L16
        L1f:
            X.12Za r1 = X.EnumC19776012Za.LLIZ
            goto L16
        L22:
            X.12Za r1 = X.EnumC19776012Za.LLJ
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12ZP.LIZIZ(X.12Zb, int):void");
    }

    public final void LIZJ(EnumC19776112Zb enumC19776112Zb, EnumC19776012Za enumC19776012Za) {
        this.LIZ.put(enumC19776112Zb, enumC19776012Za);
    }
}
