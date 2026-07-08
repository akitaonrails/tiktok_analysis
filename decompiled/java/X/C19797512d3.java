package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.12d3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19797512d3 implements InterfaceC19797112cz, Iterable<InterfaceC19797112cz> {
    public final String LL;

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LIZIZ() {
        return new C19797512d3(this.LL);
    }

    @Override // X.InterfaceC19797112cz
    public final Boolean LIZLLL() {
        return Boolean.valueOf(!this.LL.isEmpty());
    }

    @Override // X.InterfaceC19797112cz
    public final Double LJ() {
        if (this.LL.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.LL);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // X.InterfaceC19797112cz
    public final Iterator<InterfaceC19797112cz> LJI() {
        return new Iterator<InterfaceC19797112cz>() { // from class: X.12dO
            public int LL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL < this.LLILLJJLI.LL.length();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ InterfaceC19797112cz next() {
                if (this.LL >= this.LLILLJJLI.LL.length()) {
                    throw new NoSuchElementException();
                }
                int i = this.LL;
                this.LL = i + 1;
                return new C19797512d3(String.valueOf(i));
            }
        };
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC19797112cz> iterator() {
        return new Iterator<InterfaceC19797112cz>() { // from class: X.12dM
            public int LL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL < this.LLILLJJLI.LL.length();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ InterfaceC19797112cz next() {
                if (this.LL >= this.LLILLJJLI.LL.length()) {
                    throw new NoSuchElementException();
                }
                String str = this.LLILLJJLI.LL;
                int i = this.LL;
                this.LL = i + 1;
                return new C19797512d3(String.valueOf(str.charAt(i)));
            }
        };
    }

    public final String toString() {
        return "\"" + this.LL + "\"";
    }

    @Override // X.InterfaceC19797112cz
    public final String LJFF() {
        return this.LL;
    }

    public C19797512d3(String str) {
        if (str != null) {
            this.LL = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19797512d3)) {
            return false;
        }
        return this.LL.equals(((C19797512d3) obj).LL);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LJIIJ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        double dDoubleValue;
        int iLIZ;
        int length;
        long jLJIIL;
        int i;
        double dDoubleValue2;
        double dMin;
        double length2;
        double dMin2;
        String strLJFF;
        double dDoubleValue3;
        double dLIZ;
        int iLIZ2;
        int i2;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str) && !"toLocaleUpperCase".equals(str) && !"trim".equals(str)) {
            throw new IllegalArgumentException(C786410Ut5.j4("%s is not a String function", new Object[]{str}));
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    b = 0;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    b = 1;
                }
                break;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    b = 2;
                }
                break;
            case -1361633751:
                if (str.equals("charAt")) {
                    b = 3;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b = 4;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 5;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 6;
                }
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b = 7;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 8;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 9;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    b = 10;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 11;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 12;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 13;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 14;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 15;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 16;
                }
                break;
        }
        String strLJFF2 = "undefined";
        switch (b) {
            case 0:
                C19796312cr.LJ(1, "hasOwnProperty", list);
                String str2 = this.LL;
                InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                if ("length".equals(interfaceC19797112czLIZIZ.LJFF())) {
                    return InterfaceC19797112cz.LJIJ;
                }
                double dDoubleValue4 = interfaceC19797112czLIZIZ.LJ().doubleValue();
                if (dDoubleValue4 == Math.floor(dDoubleValue4) && (i2 = (int) dDoubleValue4) >= 0 && i2 < str2.length()) {
                    return InterfaceC19797112cz.LJIJ;
                }
                return InterfaceC19797112cz.LJIJI;
            case 1:
                C19796312cr.LJ(0, "toString", list);
                return this;
            case 2:
                C19796312cr.LJ(0, "toLocaleLowerCase", list);
                return new C19797512d3(this.LL.toLowerCase());
            case 3:
                C19796312cr.LJIILIIL(1, "charAt", list);
                if (!((ArrayList) list).isEmpty()) {
                    iLIZ2 = (int) C19796312cr.LIZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue());
                } else {
                    iLIZ2 = 0;
                }
                String str3 = this.LL;
                if (iLIZ2 >= 0 && iLIZ2 < str3.length()) {
                    return new C19797512d3(String.valueOf(str3.charAt(iLIZ2)));
                }
                return InterfaceC19797112cz.LJIJJ;
            case 4:
                ArrayList arrayList = (ArrayList) list;
                if (arrayList.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.LL);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    sb.append(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, i3)).LJFF());
                }
                return new C19797512d3(sb.toString());
            case 5:
                C19796312cr.LJ(0, "toLowerCase", list);
                return new C19797512d3(this.LL.toLowerCase(Locale.ENGLISH));
            case 6:
                C19796312cr.LJIILIIL(1, "search", list);
                if (!((ArrayList) list).isEmpty()) {
                    strLJFF2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                }
                if (PatternProtector.compile(strLJFF2).matcher(this.LL).find()) {
                    return new C19816212g4(Double.valueOf(r1.start()));
                }
                return new C19816212g4(Double.valueOf(-1.0d));
            case 7:
                C19796312cr.LJ(0, "toLocaleUpperCase", list);
                return new C19797512d3(this.LL.toUpperCase());
            case 8:
                C19796312cr.LJIILIIL(2, "lastIndexOf", list);
                String str4 = this.LL;
                ArrayList arrayList2 = (ArrayList) list;
                if (arrayList2.size() > 0) {
                    strLJFF2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                }
                if (arrayList2.size() < 2) {
                    dDoubleValue3 = Double.NaN;
                } else {
                    dDoubleValue3 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue();
                }
                if (Double.isNaN(dDoubleValue3)) {
                    dLIZ = Double.POSITIVE_INFINITY;
                } else {
                    dLIZ = C19796312cr.LIZ(dDoubleValue3);
                }
                return new C19816212g4(Double.valueOf(str4.lastIndexOf(strLJFF2, (int) dLIZ)));
            case BdTuring.TYPE_ECAF /* 9 */:
                C19796312cr.LJ(0, "toUpperCase", list);
                return new C19797512d3(this.LL.toUpperCase(Locale.ENGLISH));
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C19796312cr.LJ(0, "toUpperCase", list);
                return new C19797512d3(this.LL.trim());
            case BdTuring.TYPE_EMAIL /* 11 */:
                C19796312cr.LJIILIIL(1, "match", list);
                String str5 = this.LL;
                if (((ArrayList) list).size() <= 0) {
                    strLJFF = "";
                } else {
                    strLJFF = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                }
                Matcher matcher = PatternProtector.compile(strLJFF).matcher(str5);
                if (matcher.find()) {
                    return new C19796612cu(new C19797512d3(matcher.group()));
                }
                return InterfaceC19797112cz.LJIILJJIL;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C19796312cr.LJIILIIL(2, "slice", list);
                String str6 = this.LL;
                ArrayList arrayList3 = (ArrayList) list;
                if (!arrayList3.isEmpty()) {
                    dDoubleValue2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                double dLIZ2 = C19796312cr.LIZ(dDoubleValue2);
                if (dLIZ2 < 0.0d) {
                    dMin = Math.max(((double) str6.length()) + dLIZ2, 0.0d);
                } else {
                    dMin = Math.min(dLIZ2, str6.length());
                }
                int i4 = (int) dMin;
                if (arrayList3.size() > 1) {
                    length2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue();
                } else {
                    length2 = str6.length();
                }
                double dLIZ3 = C19796312cr.LIZ(length2);
                if (dLIZ3 < 0.0d) {
                    dMin2 = Math.max(((double) str6.length()) + dLIZ3, 0.0d);
                } else {
                    dMin2 = Math.min(dLIZ3, str6.length());
                }
                return new C19797512d3(str6.substring(i4, Math.max(0, ((int) dMin2) - i4) + i4));
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C19796312cr.LJIILIIL(2, "split", list);
                String str7 = this.LL;
                if (str7.length() == 0) {
                    return new C19796612cu(this);
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = (ArrayList) list;
                if (arrayList5.isEmpty()) {
                    arrayList4.add(this);
                } else {
                    String strLJFF3 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                    if (arrayList5.size() > 1) {
                        jLJIIL = C19796312cr.LJIIL(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue());
                        if (jLJIIL == 0) {
                            return new C19796612cu();
                        }
                    } else {
                        jLJIIL = 2147483647L;
                    }
                    String[] strArrSplit = str7.split(Pattern.quote(strLJFF3), ((int) jLJIIL) + 1);
                    int length3 = strArrSplit.length;
                    if (strLJFF3.isEmpty() && strArrSplit.length > 0) {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i = zIsEmpty;
                        if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                            length3 = strArrSplit.length - 1;
                            i = zIsEmpty;
                        }
                    } else {
                        i = 0;
                    }
                    if (strArrSplit.length > jLJIIL) {
                        length3--;
                    }
                    while (i < length3) {
                        arrayList4.add(new C19797512d3(strArrSplit[i]));
                        i++;
                    }
                }
                return new C19796612cu(arrayList4);
            case 14:
                C19796312cr.LJIILIIL(2, "substring", list);
                String str8 = this.LL;
                ArrayList arrayList6 = (ArrayList) list;
                if (!arrayList6.isEmpty()) {
                    iLIZ = (int) C19796312cr.LIZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue());
                } else {
                    iLIZ = 0;
                }
                if (arrayList6.size() > 1) {
                    length = (int) C19796312cr.LIZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue());
                } else {
                    length = str8.length();
                }
                int iMin = Math.min(Math.max(iLIZ, 0), str8.length());
                int iMin2 = Math.min(Math.max(length, 0), str8.length());
                return new C19797512d3(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 15:
                C19796312cr.LJIILIIL(2, "replace", list);
                InterfaceC19797112cz interfaceC19797112czLIZ = InterfaceC19797112cz.LJIILIIL;
                ArrayList arrayList7 = (ArrayList) list;
                if (!arrayList7.isEmpty()) {
                    strLJFF2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                    if (arrayList7.size() > 1) {
                        interfaceC19797112czLIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                    }
                }
                String str9 = this.LL;
                int iIndexOf = str9.indexOf(strLJFF2);
                if (iIndexOf < 0) {
                    return this;
                }
                if (interfaceC19797112czLIZ instanceof AbstractC19795912cn) {
                    interfaceC19797112czLIZ = ((AbstractC19795912cn) interfaceC19797112czLIZ).LIZ(c19795712cl, Arrays.asList(new C19797512d3(strLJFF2), new C19816212g4(Double.valueOf(iIndexOf)), this));
                }
                String strSubstring = str9.substring(0, iIndexOf);
                String strLJFF4 = interfaceC19797112czLIZ.LJFF();
                String strSubstring2 = str9.substring(iIndexOf + strLJFF2.length());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strSubstring);
                sbLIZ.append(strLJFF4);
                sbLIZ.append(strSubstring2);
                return new C19797512d3(C2188811AlT.LIZIZ(sbLIZ));
            case 16:
                C19796312cr.LJIILIIL(2, "indexOf", list);
                String str10 = this.LL;
                ArrayList arrayList8 = (ArrayList) list;
                if (arrayList8.size() > 0) {
                    strLJFF2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJFF();
                }
                if (arrayList8.size() < 2) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue();
                }
                return new C19816212g4(Double.valueOf(str10.indexOf(strLJFF2, (int) C19796312cr.LIZ(dDoubleValue))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
