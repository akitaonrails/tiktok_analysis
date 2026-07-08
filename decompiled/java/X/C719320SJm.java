package X;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0SJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719320SJm {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(int i, CharSequence charSequence) {
        int i2;
        if (i >= charSequence.length()) {
            return new Pair(EnumC719360SJq.END_MARKUP, new C719210SJb((CharSequence) null, 0, 7));
        }
        String strLIZIZ = "";
        if (charSequence.charAt(i) != EnumC718920SHy.CHARACTER_LOWER_THAN.getText()) {
            int i3 = i;
            while (i3 < charSequence.length() && charSequence.charAt(i3) != EnumC719330SJn.CHARACTER_START.getValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(charSequence.charAt(i3));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                i3++;
            }
            if (strLIZIZ.length() > 0) {
                C719210SJb c719210SJb = new C719210SJb(strLIZIZ, 1, 4);
                c719210SJb.LIZLLL = i;
                c719210SJb.LJ = i3;
                return new Pair(EnumC719360SJq.PLAIN_TEXT, c719210SJb);
            }
        } else {
            Character chLJLLJ = C13LN.LJLLJ(i, charSequence);
            char value = EnumC719330SJn.CHARACTER_START.getValue();
            if (chLJLLJ != null && chLJLLJ.charValue() == value) {
                int i4 = i + 1;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                EnumC719340SJo enumC719340SJo = EnumC719340SJo.TAG_INIT;
                boolean z = true;
                String strLIZIZ2 = "";
                String strLIZIZ3 = "";
                String strLIZIZ4 = "";
                while (i4 < charSequence.length()) {
                    char cCharAt = charSequence.charAt(i4);
                    switch (C719350SJp.LIZ[enumC719340SJo.ordinal()]) {
                        case 1:
                            if (cCharAt == EnumC719330SJn.CHARACTER_LINE_SLANT.getValue()) {
                                i4++;
                                z = false;
                            }
                            enumC719340SJo = EnumC719340SJo.TAG_NAME_START;
                            break;
                        case 2:
                            if (C718910SHx.LIZIZ(cCharAt)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ2);
                                sbLIZ2.append(cCharAt);
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            } else if (cCharAt == EnumC719330SJn.CHARACTER_END.getValue()) {
                                enumC719340SJo = EnumC719340SJo.TAG_FINISH;
                                break;
                            } else if (cCharAt == EnumC719330SJn.CHARACTER_SPACE.getValue()) {
                                enumC719340SJo = EnumC719340SJo.TAG_NAME_END;
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(strLIZIZ2);
                                sbLIZ3.append(" name contains ");
                                sbLIZ3.append(cCharAt);
                                sbLIZ3.append(" is invalid");
                                C719300SJk.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            }
                            i4++;
                            break;
                        case 3:
                            if (cCharAt == EnumC719330SJn.CHARACTER_END.getValue()) {
                                enumC719340SJo = EnumC719340SJo.TAG_FINISH;
                            } else if (C718910SHx.LIZIZ(cCharAt)) {
                                enumC719340SJo = EnumC719340SJo.TAG_ATTRIBUTE_NAME;
                                strLIZIZ3 = "";
                            } else {
                                if (cCharAt != EnumC719330SJn.CHARACTER_SPACE.getValue()) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append(strLIZIZ2);
                                    sbLIZ4.append(" name end contains ");
                                    sbLIZ4.append(cCharAt);
                                    sbLIZ4.append(" is invalid");
                                    C719300SJk.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                i4++;
                            }
                            break;
                        case 4:
                            if (C718910SHx.LIZIZ(cCharAt)) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(strLIZIZ3);
                                sbLIZ5.append(cCharAt);
                                strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                            } else if (cCharAt == EnumC719330SJn.CHARACTER_ATTR_EQUAL.getValue()) {
                                enumC719340SJo = EnumC719340SJo.TAG_ATTRIBUTE_VALUE;
                                i4++;
                                if (charSequence.charAt(i4) == EnumC719330SJn.CHARACTER_ATTR_VALUE_QUOTES.getValue()) {
                                    i4++;
                                }
                                strLIZIZ4 = "";
                            } else {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append(strLIZIZ3);
                                sbLIZ6.append(" name of ");
                                sbLIZ6.append(strLIZIZ2);
                                sbLIZ6.append(" contains ");
                                sbLIZ6.append(cCharAt);
                                sbLIZ6.append(" is invalid");
                                C719300SJk.LIZIZ(C2188811AlT.LIZIZ(sbLIZ6));
                            }
                            i4++;
                            break;
                        case 5:
                            if (!C718910SHx.LIZIZ(cCharAt) && !Character.isDigit(cCharAt) && cCharAt != '#') {
                                if (strLIZIZ4.length() > 0 && (cCharAt == EnumC719330SJn.CHARACTER_ATTR_VALUE_QUOTES.getValue() || cCharAt == EnumC719330SJn.CHARACTER_SPACE.getValue())) {
                                    i4++;
                                    if (strLIZIZ3.length() > 0 && strLIZIZ4.length() > 0) {
                                        linkedHashMap.put(strLIZIZ3, strLIZIZ4);
                                        strLIZIZ3 = "";
                                        strLIZIZ4 = "";
                                    }
                                    enumC719340SJo = EnumC719340SJo.TAG_ATTRIBUTE_END;
                                } else if (cCharAt == EnumC719330SJn.CHARACTER_END.getValue()) {
                                    if (strLIZIZ3.length() > 0 || strLIZIZ4.length() > 0) {
                                        linkedHashMap.put(strLIZIZ3, strLIZIZ4);
                                        strLIZIZ3 = "";
                                        strLIZIZ4 = "";
                                    }
                                    enumC719340SJo = EnumC719340SJo.TAG_ATTRIBUTE_END;
                                } else {
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append(strLIZIZ3);
                                    sbLIZ7.append(" value of ");
                                    sbLIZ7.append(strLIZIZ2);
                                    sbLIZ7.append(" contains ");
                                    sbLIZ7.append(cCharAt);
                                    sbLIZ7.append(" is invalid");
                                    C719300SJk.LIZIZ(C2188811AlT.LIZIZ(sbLIZ7));
                                    i4++;
                                }
                            } else {
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append(strLIZIZ4);
                                sbLIZ8.append(cCharAt);
                                strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ8);
                                i4++;
                            }
                            break;
                        case 6:
                            if (cCharAt == EnumC719330SJn.CHARACTER_END.getValue()) {
                                enumC719340SJo = EnumC719340SJo.TAG_FINISH;
                            } else if (cCharAt != EnumC719330SJn.CHARACTER_SPACE.getValue() && C718910SHx.LIZIZ(cCharAt)) {
                                enumC719340SJo = EnumC719340SJo.TAG_ATTRIBUTE_NAME;
                                strLIZIZ3 = "";
                            } else {
                                i4++;
                            }
                            break;
                        case 7:
                            if (z) {
                                i2 = 0;
                            } else {
                                i2 = 2;
                            }
                            C719210SJb c719210SJb2 = new C719210SJb(strLIZIZ2, i2, linkedHashMap);
                            c719210SJb2.LIZLLL = i;
                            c719210SJb2.LJ = i4 + 1;
                            if (c719210SJb2.LIZIZ == 0) {
                                return new Pair(EnumC719360SJq.START_TAG, c719210SJb2);
                            }
                            return new Pair(EnumC719360SJq.END_TAG, c719210SJb2);
                        default:
                            throw new C1954807lC();
                    }
                }
            }
        }
        return new Pair(EnumC719360SJq.END_MARKUP, new C719210SJb((CharSequence) null, 0, 7));
    }
}
