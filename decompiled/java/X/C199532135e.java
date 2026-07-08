package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.135e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199532135e implements InterfaceC199535135h {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0WhY] */
    static {
        final String str = "application/x-www-form-urlencoded";
        ?? r2 = new Object(str) { // from class: X.0WhY
            public static final Pattern LJ = PatternProtector.compile("[\\w!#$&.+\\-\\^_]+|[*]");
            public static final Pattern LJFF = PatternProtector.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
            public static final Pattern LJI;
            public static final Pattern LJII;
            public String LIZ;
            public String LIZIZ;
            public final SortedMap<String, String> LIZJ = new TreeMap();
            public String LIZLLL;

            static {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\\s*(");
                sbLIZ.append("[^\\s/=;\"]+");
                sbLIZ.append(")/(");
                sbLIZ.append("[^\\s/=;\"]+");
                sbLIZ.append(")\\s*(");
                sbLIZ.append(";.*");
                sbLIZ.append(")?");
                LJI = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ), 32);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("\"([^\"]*)\"");
                sbLIZ2.append("|");
                sbLIZ2.append("[^\\s;\"]*");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("\\s*;\\s*(");
                sbLIZ3.append("[^\\s/=;\"]+");
                sbLIZ3.append(")=(");
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(")");
                LJII = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ3));
            }

            public final String LIZ() {
                String str2 = this.LIZLLL;
                if (str2 != null) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.LIZ);
                sb.append('/');
                sb.append(this.LIZIZ);
                SortedMap<String, String> sortedMap = this.LIZJ;
                if (sortedMap != null) {
                    for (Map.Entry entry : ((TreeMap) sortedMap).entrySet()) {
                        String strLIZIZ = (String) entry.getValue();
                        sb.append("; ");
                        sb.append((String) entry.getKey());
                        sb.append("=");
                        if (!LJFF.matcher(strLIZIZ).matches()) {
                            String strReplace = strLIZIZ.replace("\\", "\\\\").replace("\"", "\\\"");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("\"");
                            sbLIZ.append(strReplace);
                            sbLIZ.append("\"");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        sb.append(strLIZIZ);
                    }
                }
                String string = sb.toString();
                this.LIZLLL = string;
                return string;
            }

            public final int hashCode() {
                return LIZ().hashCode();
            }

            public final String toString() {
                return LIZ();
            }

            {
                this.LIZ = "application";
                this.LIZIZ = "octet-stream";
                Matcher matcher = LJI.matcher(str);
                C19864312np.LIZLLL("Type must be in the 'maintype/subtype; parameter=value' format", matcher.matches());
                String strGroup = matcher.group(1);
                Pattern pattern = LJ;
                C19864312np.LIZLLL("Type contains reserved characters", pattern.matcher(strGroup).matches());
                this.LIZ = strGroup;
                this.LIZLLL = null;
                String strGroup2 = matcher.group(2);
                C19864312np.LIZLLL("Subtype contains reserved characters", pattern.matcher(strGroup2).matches());
                this.LIZIZ = strGroup2;
                this.LIZLLL = null;
                String strGroup3 = matcher.group(3);
                if (strGroup3 != null) {
                    Matcher matcher2 = LJII.matcher(strGroup3);
                    while (matcher2.find()) {
                        String strGroup4 = matcher2.group(1);
                        String strGroup5 = matcher2.group(3);
                        if (strGroup5 == null) {
                            strGroup5 = matcher2.group(2);
                        }
                        LIZIZ(strGroup4, strGroup5);
                    }
                }
            }

            public final boolean equals(Object obj) {
                C830220WhY c830220WhY;
                if (!(obj instanceof C830220WhY) || (c830220WhY = (C830220WhY) obj) == null || !this.LIZ.equalsIgnoreCase(c830220WhY.LIZ) || !this.LIZIZ.equalsIgnoreCase(c830220WhY.LIZIZ) || !this.LIZJ.equals(c830220WhY.LIZJ)) {
                    return false;
                }
                return true;
            }

            public final void LIZIZ(String str2, String str3) {
                if (str3 == null) {
                    this.LIZLLL = null;
                    ((TreeMap) this.LIZJ).remove(str2.toLowerCase(Locale.US));
                    return;
                }
                C19864312np.LIZLLL("Name contains reserved characters", LJFF.matcher(str2).matches());
                this.LIZLLL = null;
                ((TreeMap) this.LIZJ).put(str2.toLowerCase(Locale.US), str3);
            }
        };
        Charset charset = C19857312mh.LIZ;
        r2.LIZIZ("charset", charset == null ? null : charset.name());
        r2.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.io.Reader r16, java.lang.Object r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199532135e.LIZ(java.io.Reader, java.lang.Object, boolean):void");
    }

    public static Object LIZIZ(Type type, List<Type> list, String str) {
        Class cls;
        Type typeLJ = C199533135f.LJ(list, type);
        if (typeLJ instanceof Class) {
            cls = (Class) typeLJ;
        } else {
            cls = null;
        }
        if (typeLJ == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str != null && cls != null && !cls.isAssignableFrom(String.class)) {
                if (cls != Character.class && cls != Character.TYPE) {
                    if (cls != Boolean.class && cls != Boolean.TYPE) {
                        if (cls != Byte.class && cls != Byte.TYPE) {
                            if (cls != Short.class && cls != Short.TYPE) {
                                if (cls != Integer.class && cls != Integer.TYPE) {
                                    if (cls != Long.class && cls != Long.TYPE) {
                                        if (cls != Float.class && cls != Float.TYPE) {
                                            if (cls != Double.class && cls != Double.TYPE) {
                                                if (cls == C20018413Ug.class) {
                                                    return C20018413Ug.parseRfc3339(str);
                                                }
                                                if (cls == BigInteger.class) {
                                                    return new BigInteger(str);
                                                }
                                                if (cls == BigDecimal.class) {
                                                    return new BigDecimal(str);
                                                }
                                                if (cls.isEnum()) {
                                                    if (C199544135q.LIZIZ(cls, false).LIZJ.contains(str)) {
                                                        C199545135r c199545135rLIZ = C199544135q.LIZIZ(cls, false).LIZ(str);
                                                        return C08FF.LIZ(c199545135rLIZ.LIZIZ.getDeclaringClass(), c199545135rLIZ.LIZIZ.getName());
                                                    }
                                                    throw new IllegalArgumentException(C786410Ut5.j4("given enum name %s not part of enumeration", new Object[]{str}));
                                                }
                                            } else {
                                                return CastDoubleProtector.valueOf(str);
                                            }
                                        } else {
                                            return CastFloatProtector.valueOf(str);
                                        }
                                    } else {
                                        return CastLongProtector.valueOf(str);
                                    }
                                } else {
                                    return CastIntegerProtector.valueOf(str);
                                }
                            } else {
                                return CastShortProtector.valueOf(str);
                            }
                        } else {
                            return CastByteProtector.valueOf(str);
                        }
                    } else {
                        return Boolean.valueOf(str);
                    }
                } else {
                    if (str.length() == 1) {
                        return Character.valueOf(str.charAt(0));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("expected type Character/char but got ");
                    sbLIZ.append(cls);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                return str;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("expected primitive class, but got: ");
        sbLIZ2.append(typeLJ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
