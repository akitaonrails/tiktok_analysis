package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.040Y, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C040Y {
    public final Pattern LIZ;
    public ArrayList<C040Z> LIZIZ;

    public C040Y() {
        this(0);
    }

    public C040Y(int i) {
        this.LIZ = PatternProtector.compile("\\[\\d{1,2}:\\d{1,2}([\\.:]\\d{1,3})?\\]");
        PatternProtector.compile("\\<\\d*,\\d*,\\d*\\>");
        this.LIZIZ = new ArrayList<>();
    }

    public final void LIZ(String str) {
        long j;
        Matcher matcher = this.LIZ.matcher(str);
        ArrayList arrayList = new ArrayList();
        int iEnd = 0;
        while (true) {
            long j2 = -1;
            if (matcher.find()) {
                String string = a0.LJLIIIL(matcher.group()).toString();
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string.substring(1, string.length() - 1), new String[]{":", e3.d}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() >= 2) {
                    if (listLJJLIIIJILLIZJL.size() == 2) {
                        try {
                            int i = CastIntegerProtector.parseInt((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                            int i2 = CastIntegerProtector.parseInt((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                            if (i >= 0 && i2 >= 0 && i2 < 60) {
                                j2 = ((long) ((i * 60) + i2)) * 1000;
                            } else {
                                throw new NumberFormatException();
                            }
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else if (listLJJLIIIJILLIZJL.size() == 3) {
                        try {
                            int i3 = CastIntegerProtector.parseInt((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                            int i4 = CastIntegerProtector.parseInt((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                            int i5 = CastIntegerProtector.parseInt((String) ListProtector.get(listLJJLIIIJILLIZJL, 2));
                            if (i3 >= 0 && i4 >= 0 && i4 < 60 && i5 >= 0 && i5 <= 999) {
                                int i6 = (i3 * 60) + i4;
                                if (i5 > 99) {
                                    j = ((long) i6) * 1000;
                                } else {
                                    j = ((long) i6) * 1000;
                                    i5 *= 10;
                                }
                                j2 = j + ((long) i5);
                            } else {
                                throw new NumberFormatException();
                            }
                        } catch (NumberFormatException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } else {
                        continue;
                    }
                }
                arrayList.add(Long.valueOf(j2));
                iEnd = matcher.end();
            } else {
                String string2 = a0.LJLIIIL(str.substring(iEnd, str.length())).toString();
                if (u.LJJIIJZLJL(string2, e3.e, false) && u.LJIIZILJ(string2, e3.f, false)) {
                    string2 = "";
                }
                if (string2.length() == 0) {
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    long jLongValue = ((Number) it2.next()).longValue();
                    if (jLongValue != -1) {
                        ArrayList<C040Z> arrayList2 = this.LIZIZ;
                        C040Z c040z = new C040Z(string2);
                        c040z.LIZIZ = jLongValue;
                        arrayList2.add(c040z);
                    }
                }
                return;
            }
        }
    }

    public final String LIZIZ(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.f}, 0, 6);
        int size = listLJJLIIIJILLIZJL.size();
        for (int i = 0; i < size; i++) {
            String strLIZIZ = (String) ListProtector.get(listLJJLIIIJILLIZJL, i);
            if (i == listLJJLIIIJILLIZJL.size() - 1) {
                if (u.LJIIZILJ(strLIZIZ, e3.f, false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(']');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(']');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (u.LJJIIJZLJL(strLIZIZ, e3.e, false) && u.LJIIZILJ(strLIZIZ, e3.f, false)) {
                if (this.LIZ.matcher(strLIZIZ).find()) {
                    stringBuffer.append(strLIZIZ);
                } else {
                    return "";
                }
            } else {
                stringBuffer.append(strLIZIZ);
            }
        }
        return stringBuffer.toString();
    }
}
