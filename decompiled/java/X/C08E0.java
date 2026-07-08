package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08E0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08E0 {
    public final String LIZ;
    public final Pattern LIZIZ;
    public ArrayList<C08E1> LIZJ;

    public C08E0() {
        this(null);
    }

    public C08E0(String str) {
        this.LIZ = str;
        this.LIZIZ = PatternProtector.compile("\\[\\d{1,2}:\\d{1,2}([\\.:]\\d{1,3})?\\]");
        PatternProtector.compile("\\<\\d*,\\d*,\\d*\\>");
        this.LIZJ = new ArrayList<>();
    }

    public final C08E0 LIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                Matcher matcher = PatternProtector.compile("\\[(offset):[^\\]]+\\]").matcher(line);
                while (matcher.find()) {
                    Intrinsics.LJFF(matcher.group().substring(1, 7), "offset");
                }
                String string = a0.LJLIIIL(LIZJ(line)).toString();
                if (string.length() > 0) {
                    LIZIZ(string);
                }
            }
            bufferedReader.close();
            return this;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LIZIZ(String str) {
        long j;
        Matcher matcher = this.LIZIZ.matcher(str);
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
                        ArrayList<C08E1> arrayList2 = this.LIZJ;
                        C08E1 c08e1 = new C08E1(string2);
                        c08e1.LIZIZ = jLongValue;
                        arrayList2.add(c08e1);
                    }
                }
                return;
            }
        }
    }

    public final String LIZJ(String str) {
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
                if (this.LIZIZ.matcher(strLIZIZ).find()) {
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
