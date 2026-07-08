package X;

/* JADX INFO: renamed from: X.13Iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19988213Iq {
    public static final C13JM LIZJ(InterfaceC19983313Gt interfaceC19983313Gt) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Value of type '");
        sbLIZ.append(interfaceC19983313Gt.LJI());
        sbLIZ.append("' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '");
        sbLIZ.append(interfaceC19983313Gt.LIZIZ());
        sbLIZ.append("'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new C13JM(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final C13JM LIZIZ(Number number, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected special floating-point value ");
        sbLIZ.append(number);
        sbLIZ.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sbLIZ.append((Object) LJI(-1, str));
        return new C13JM(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final C13JL LIZLLL(int i, String str) {
        if (i >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unexpected JSON token at offset ");
            sbLIZ.append(i);
            sbLIZ.append(": ");
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        return new C13JL(str);
    }

    public static final void LJFF(AbstractC19987713Il abstractC19987713Il, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Trailing comma before the end of JSON ");
        sbLIZ.append(str);
        abstractC19987713Il.LJIILL(abstractC19987713Il.LIZ - 1, C2188811AlT.LIZIZ(sbLIZ), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence LJI(int i, CharSequence charSequence) {
        String str;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(".....");
            sbLIZ.append(charSequence.subSequence(length, charSequence.length()).toString());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        int i2 = i - 30;
        int i3 = i + 30;
        if (i2 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i3 >= charSequence.length()) {
            str2 = "";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (i3 > length2) {
            i3 = length2;
        }
        sbLIZ2.append(charSequence.subSequence(i2, i3).toString());
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final void LJII(AbstractC19987713Il abstractC19987713Il, Number number) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected special floating-point value ");
        sbLIZ.append(number);
        sbLIZ.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification");
        AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final C13JL LIZ(String str, String str2, Number number) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected special floating-point value ");
        sbLIZ.append(number);
        sbLIZ.append(" with key ");
        sbLIZ.append(str);
        sbLIZ.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        sbLIZ.append((Object) LJI(-1, str2));
        return LIZLLL(-1, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final C13JL LJ(String str, CharSequence charSequence, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("\nJSON input: ");
        sbLIZ.append((Object) LJI(i, charSequence));
        return LIZLLL(i, C2188811AlT.LIZIZ(sbLIZ));
    }
}
