package X;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0utY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721340utY {
    public static final Map<EnumC1721320utW, Pattern> LJ = C2097608Jq.LJIIIIZZ(new Pair(EnumC1721320utW.BOLD, PatternProtector.compile("\\*\\*(.*?)\\*\\*")), new Pair(EnumC1721320utW.LINK, PatternProtector.compile("\\[(.*?)\\]\\((.*?)\\)")), new Pair(EnumC1721320utW.ITALICS, PatternProtector.compile("(?<!\\*)\\*(?!\\*)(.+?)(?<!\\*)\\*(?!\\*)")));
    public final List<C1721380utc> LIZ = new ArrayList();
    public final List<C432010Gwp> LIZIZ = new ArrayList();
    public final List<C991930bv5> LIZJ = new ArrayList();
    public SpannableString LIZLLL = new SpannableString("");

    public final void LIZJ() {
        ((ArrayList) this.LIZ).clear();
        ((ArrayList) this.LIZIZ).clear();
        ((ArrayList) this.LIZJ).clear();
        this.LIZLLL = new SpannableString("");
    }

    public final void LIZ(int i, int i2) {
        if (i >= 0 && i2 <= this.LIZLLL.length() && i < i2) {
            C786410Ut5.p2(this.LIZLLL, new AbsoluteSizeSpan(0), i, i2, 33);
        }
    }

    public final SpannableString LIZIZ(C1721330utX c1721330utX, CharSequence charSequence, Function1 function1, Function1 function12, Function1 function13) {
        Matcher matcher;
        Object obj;
        Matcher matcher2;
        Object obj2;
        Matcher matcher3;
        int i;
        LIZJ();
        this.LIZLLL = new SpannableString(charSequence);
        Set<EnumC1721320utW> set = c1721330utX.LIZ;
        EnumC1721320utW enumC1721320utW = EnumC1721320utW.BOLD;
        Object c098200Yq = null;
        if (set.contains(enumC1721320utW)) {
            try {
                Pattern pattern = c1721330utX.LIZIZ.get(enumC1721320utW);
                if (pattern != null) {
                    matcher3 = pattern.matcher(this.LIZLLL);
                } else {
                    matcher3 = null;
                }
                if (matcher3 != null) {
                    ArrayList arrayList = new ArrayList();
                    while (matcher3.find()) {
                        arrayList.add(new C1721350utZ(matcher3.start(), matcher3.end(), matcher3.start(1), matcher3.end(1)));
                    }
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        int i3 = i2;
                        while (true) {
                            i = i3 + 1;
                            if (i >= arrayList.size() || ((C1721350utZ) arrayList.get(i)).LIZ != ((C1721350utZ) arrayList.get(i3)).LIZIZ) {
                                break;
                            }
                            i3 = i;
                        }
                        C1721350utZ c1721350utZ = (C1721350utZ) arrayList.get(i2);
                        C1721350utZ c1721350utZ2 = (C1721350utZ) arrayList.get(i3);
                        LIZ(c1721350utZ.LIZ, c1721350utZ.LIZJ);
                        LIZ(c1721350utZ2.LIZLLL, c1721350utZ2.LIZIZ);
                        List<C1721380utc> list = this.LIZ;
                        int i4 = c1721350utZ.LIZJ;
                        int i5 = c1721350utZ2.LIZLLL;
                        this.LIZLLL.subSequence(i4, i5).toString();
                        ((ArrayList) list).add(new C1721380utc(i4, i5));
                        i2 = i;
                    }
                } else {
                    matcher3 = null;
                }
                C189200o6.m2constructorimpl(matcher3);
                obj2 = matcher3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
                obj2 = c098200Yq2;
            }
            C189200o6.m5exceptionOrNullimpl(obj2);
        }
        Set<EnumC1721320utW> set2 = c1721330utX.LIZ;
        EnumC1721320utW enumC1721320utW2 = EnumC1721320utW.ITALICS;
        if (set2.contains(enumC1721320utW2)) {
            try {
                Pattern pattern2 = c1721330utX.LIZIZ.get(enumC1721320utW2);
                if (pattern2 != null) {
                    matcher2 = pattern2.matcher(this.LIZLLL);
                } else {
                    matcher2 = null;
                }
                if (matcher2 == null) {
                    matcher2 = null;
                } else {
                    while (matcher2.find()) {
                        LIZ(matcher2.start(1) - 1, matcher2.start(1));
                        LIZ(matcher2.end(1), matcher2.end(1) + 1);
                        List<C991930bv5> list2 = this.LIZJ;
                        int iStart = matcher2.start(1);
                        int iEnd = matcher2.end(1);
                        String strGroup = matcher2.group(1);
                        if (strGroup == null) {
                            strGroup = "";
                        }
                        ((ArrayList) list2).add(new C991930bv5(iStart, iEnd, strGroup));
                    }
                }
                C189200o6.m2constructorimpl(matcher2);
                obj = matcher2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C098200Yq c098200Yq3 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq3);
                obj = c098200Yq3;
            }
            C189200o6.m5exceptionOrNullimpl(obj);
        }
        Set<EnumC1721320utW> set3 = c1721330utX.LIZ;
        EnumC1721320utW enumC1721320utW3 = EnumC1721320utW.LINK;
        if (set3.contains(enumC1721320utW3)) {
            try {
                Pattern pattern3 = c1721330utX.LIZIZ.get(enumC1721320utW3);
                if (pattern3 != null) {
                    matcher = pattern3.matcher(this.LIZLLL);
                } else {
                    matcher = null;
                }
                if (matcher != null) {
                    while (matcher.find()) {
                        LIZ(matcher.start(1) - 1, matcher.start(1));
                        LIZ(matcher.end(1), matcher.end(1) + 1);
                        LIZ(matcher.start(2) - 1, matcher.end(2) + 1);
                        List<C432010Gwp> list3 = this.LIZIZ;
                        int iStart2 = matcher.start(1);
                        int iEnd2 = matcher.end(1);
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            strGroup2 = "";
                        }
                        String strGroup3 = matcher.group(2);
                        if (strGroup3 == null) {
                            strGroup3 = "";
                        }
                        ((ArrayList) list3).add(new C432010Gwp(iStart2, iEnd2, strGroup2, strGroup3));
                    }
                    c098200Yq = matcher;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        for (C1721380utc c1721380utc : (ArrayList) this.LIZ) {
            Iterator it2 = ((Iterable) function1.invoke(c1721380utc)).iterator();
            while (it2.hasNext()) {
                C786410Ut5.p2(this.LIZLLL, it2.next(), c1721380utc.LIZ, c1721380utc.LIZIZ, 33);
            }
        }
        for (C432010Gwp c432010Gwp : (ArrayList) this.LIZIZ) {
            Iterator it3 = ((Iterable) function12.invoke(c432010Gwp)).iterator();
            while (it3.hasNext()) {
                C786410Ut5.p2(this.LIZLLL, it3.next(), c432010Gwp.LIZ, c432010Gwp.LIZIZ, 33);
            }
        }
        for (C991930bv5 c991930bv5 : (ArrayList) this.LIZJ) {
            List list4 = (List) function13.invoke(c991930bv5);
            if (list4 != null) {
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    C786410Ut5.p2(this.LIZLLL, it4.next(), c991930bv5.LIZ, c991930bv5.LIZIZ, 33);
                }
            }
        }
        return this.LIZLLL;
    }
}
