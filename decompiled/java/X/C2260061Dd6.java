package X;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import android.os.Build;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.1Dd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260061Dd6 {
    public final InterfaceC2260091Dd9 LIZ;
    public InterfaceC2190701AoW<?> LIZIZ;
    public InterfaceC2190701AoW<?> LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;
    public Object LJII;
    public EnumC2260111DdB LJIIIIZZ;
    public EnumC2260181DdI LJIIIZ;
    public EnumC2260121DdC LJIIJ;
    public EnumC2260221DdM LJIIJJI;
    public EnumC2260141DdE LJIIL;
    public EnumC2260201DdK LJIILIIL;
    public EnumC2260171DdH LJIILJJIL;
    public EnumC2260191DdJ LJIILL;
    public EnumC2260211DdL LJIILLIIL;
    public EnumC2260101DdA LJIIZILJ;
    public EnumC2260151DdF LJIJ;
    public EnumC2260161DdG LJIJI;
    public Object LJIJJ;

    public final Map<String, Object> LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.LIZJ.LIZJ());
        linkedHashMap.put("numberingSystem", this.LJI);
        linkedHashMap.put("calendar", this.LJ);
        linkedHashMap.put("timeZone", this.LJIJJ);
        EnumC2260111DdB enumC2260111DdB = this.LJIIIIZZ;
        if (enumC2260111DdB != EnumC2260111DdB.UNDEFINED) {
            linkedHashMap.put("hourCycle", enumC2260111DdB.toString());
            EnumC2260111DdB enumC2260111DdB2 = this.LJIIIIZZ;
            if (enumC2260111DdB2 == EnumC2260111DdB.H11 || enumC2260111DdB2 == EnumC2260111DdB.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        EnumC2260181DdI enumC2260181DdI = this.LJIIIZ;
        if (enumC2260181DdI != EnumC2260181DdI.UNDEFINED) {
            linkedHashMap.put("weekday", enumC2260181DdI.toString());
        }
        EnumC2260121DdC enumC2260121DdC = this.LJIIJ;
        if (enumC2260121DdC != EnumC2260121DdC.UNDEFINED) {
            linkedHashMap.put("era", enumC2260121DdC.toString());
        }
        EnumC2260221DdM enumC2260221DdM = this.LJIIJJI;
        if (enumC2260221DdM != EnumC2260221DdM.UNDEFINED) {
            linkedHashMap.put("year", enumC2260221DdM.toString());
        }
        EnumC2260141DdE enumC2260141DdE = this.LJIIL;
        if (enumC2260141DdE != EnumC2260141DdE.UNDEFINED) {
            linkedHashMap.put("month", enumC2260141DdE.toString());
        }
        EnumC2260201DdK enumC2260201DdK = this.LJIILIIL;
        if (enumC2260201DdK != EnumC2260201DdK.UNDEFINED) {
            linkedHashMap.put("day", enumC2260201DdK.toString());
        }
        EnumC2260171DdH enumC2260171DdH = this.LJIILJJIL;
        if (enumC2260171DdH != EnumC2260171DdH.UNDEFINED) {
            linkedHashMap.put("hour", enumC2260171DdH.toString());
        }
        EnumC2260191DdJ enumC2260191DdJ = this.LJIILL;
        if (enumC2260191DdJ != EnumC2260191DdJ.UNDEFINED) {
            linkedHashMap.put("minute", enumC2260191DdJ.toString());
        }
        EnumC2260211DdL enumC2260211DdL = this.LJIILLIIL;
        if (enumC2260211DdL != EnumC2260211DdL.UNDEFINED) {
            linkedHashMap.put("second", enumC2260211DdL.toString());
        }
        EnumC2260101DdA enumC2260101DdA = this.LJIIZILJ;
        if (enumC2260101DdA != EnumC2260101DdA.UNDEFINED) {
            linkedHashMap.put("timeZoneName", enumC2260101DdA.toString());
        }
        EnumC2260151DdF enumC2260151DdF = this.LJIJ;
        if (enumC2260151DdF != EnumC2260151DdF.UNDEFINED) {
            linkedHashMap.put("dateStyle", enumC2260151DdF.toString());
        }
        EnumC2260161DdG enumC2260161DdG = this.LJIJI;
        if (enumC2260161DdG != EnumC2260161DdG.UNDEFINED) {
            linkedHashMap.put("timeStyle", enumC2260161DdG.toString());
        }
        return linkedHashMap;
    }

    public static String LIZIZ(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                sb.append((char) (cCharAt + ' '));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public final List<Map<String, String>> LIZ(double d) {
        String strLJ;
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorLIZ = this.LIZ.LIZ(d);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorLIZ.first(); cFirst != 65535; cFirst = attributedCharacterIteratorLIZ.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorLIZ.getIndex() + 1 == attributedCharacterIteratorLIZ.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it2 = attributedCharacterIteratorLIZ.getAttributes().keySet().iterator();
                if (it2.hasNext()) {
                    strLJ = this.LIZ.LJ(it2.next(), sb.toString());
                } else {
                    strLJ = "literal";
                }
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strLJ);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public C2260061Dd6(List<String> list, Map<String, Object> map) throws C20129013pQ, C317550Ccb {
        int i;
        String strLJII;
        EnumC2260111DdB enumC2260111DdB;
        String str;
        if (Build.VERSION.SDK_INT >= 24) {
            this.LIZ = new InterfaceC2260091Dd9() { // from class: X.1Dd7
                public DateFormat LIZ;

                public static int LJIIIZ(EnumC2260151DdF enumC2260151DdF) throws C20129013pQ {
                    int i2 = C2260231DdN.LIZ[enumC2260151DdF.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return 1;
                        }
                        if (i2 == 3) {
                            return 2;
                        }
                        if (i2 == 4) {
                            return 3;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid DateStyle: ");
                        sbLIZ.append(enumC2260151DdF.toString());
                        throw new C20129013pQ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return 0;
                }

                public static int LJIIJ(EnumC2260161DdG enumC2260161DdG) throws C20129013pQ {
                    int i2 = C2260231DdN.LIZIZ[enumC2260161DdG.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return 1;
                        }
                        if (i2 == 3) {
                            return 2;
                        }
                        if (i2 == 4) {
                            return 3;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid DateStyle: ");
                        sbLIZ.append(enumC2260161DdG.toString());
                        throw new C20129013pQ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return 0;
                }

                @Override // X.InterfaceC2260091Dd9
                public final AttributedCharacterIterator LIZ(double d) {
                    return this.LIZ.formatToCharacterIterator(Double.valueOf(d));
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LIZIZ(double d) {
                    return this.LIZ.format(new Date((long) d));
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LIZJ(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    return NumberingSystem.getInstance((ULocale) interfaceC2190701AoW.getLocale()).getName();
                }

                @Override // X.InterfaceC2260091Dd9
                public final EnumC2260111DdB LIZLLL(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    try {
                        String pattern = ((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) interfaceC2190701AoW.getLocale())).toPattern();
                        StringBuilder sb = new StringBuilder();
                        boolean z = false;
                        for (int i2 = 0; i2 < pattern.length(); i2++) {
                            char cCharAt = pattern.charAt(i2);
                            if (cCharAt == '\'') {
                                z = !z;
                            } else if (!z && cCharAt >= 'A' && (cCharAt <= 'Z' || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                                sb.append(pattern.charAt(i2));
                            }
                        }
                        String string = sb.toString();
                        if (string.contains(String.valueOf('h'))) {
                            return EnumC2260111DdB.H12;
                        }
                        if (string.contains(String.valueOf('K'))) {
                            return EnumC2260111DdB.H11;
                        }
                        if (string.contains(String.valueOf('H'))) {
                            return EnumC2260111DdB.H23;
                        }
                        return EnumC2260111DdB.H24;
                    } catch (ClassCastException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return EnumC2260111DdB.H24;
                    }
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LJI(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    String type = DateFormat.getDateInstance(3, (ULocale) interfaceC2190701AoW.getLocale()).getCalendar().getType();
                    C2190181Ang c2190181Ang = C2190211Anj.LIZJ;
                    if (c2190181Ang.containsKey(type)) {
                        return c2190181Ang.get(type);
                    }
                    return type;
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LJII(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    return Calendar.getInstance((ULocale) interfaceC2190701AoW.getLocale()).getTimeZone().getID();
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LJ(AttributedCharacterIterator.Attribute attribute, String str2) {
                    if (attribute == DateFormat.Field.DAY_OF_WEEK) {
                        return "weekday";
                    }
                    if (attribute == DateFormat.Field.ERA) {
                        return "era";
                    }
                    if (attribute == DateFormat.Field.YEAR) {
                        try {
                            CastDoubleProtector.parseDouble(str2);
                            return "year";
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return "yearName";
                        }
                    }
                    if (attribute == DateFormat.Field.MONTH) {
                        return "month";
                    }
                    if (attribute == DateFormat.Field.DAY_OF_MONTH) {
                        return "day";
                    }
                    if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
                        return "hour";
                    }
                    if (attribute == DateFormat.Field.MINUTE) {
                        return "minute";
                    }
                    if (attribute == DateFormat.Field.SECOND) {
                        return "second";
                    }
                    if (attribute == DateFormat.Field.TIME_ZONE) {
                        return "timeZoneName";
                    }
                    if (attribute == DateFormat.Field.AM_PM) {
                        return "dayPeriod";
                    }
                    if (attribute.toString().equals("android.icu.text.DateFormat$Field(related year)")) {
                        return "relatedYear";
                    }
                    return "literal";
                }

                public static void LJIIIIZZ(StringBuilder sb, char[] cArr, char c) {
                    for (int i2 = 0; i2 < sb.length(); i2++) {
                        int length = cArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (sb.charAt(i2) == cArr[i3]) {
                                    sb.setCharAt(i2, c);
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                }

                @Override // X.InterfaceC2260091Dd9
                public final void LJFF(InterfaceC2190701AoW interfaceC2190701AoW, String str2, String str3, EnumC2260181DdI enumC2260181DdI, EnumC2260121DdC enumC2260121DdC, EnumC2260221DdM enumC2260221DdM, EnumC2260141DdE enumC2260141DdE, EnumC2260201DdK enumC2260201DdK, EnumC2260171DdH enumC2260171DdH, EnumC2260191DdJ enumC2260191DdJ, EnumC2260211DdL enumC2260211DdL, EnumC2260101DdA enumC2260101DdA, EnumC2260111DdB enumC2260111DdB2, Object obj, EnumC2260151DdF enumC2260151DdF, EnumC2260161DdG enumC2260161DdG, Object obj2) throws C20129013pQ {
                    String localizedPattern;
                    Calendar calendar;
                    StringBuilder sb = new StringBuilder();
                    EnumC2260151DdF enumC2260151DdF2 = EnumC2260151DdF.UNDEFINED;
                    if (enumC2260151DdF == enumC2260151DdF2 && enumC2260161DdG == EnumC2260161DdG.UNDEFINED) {
                        sb.append(enumC2260181DdI.getSkeleonSymbol());
                        sb.append(enumC2260121DdC.getSkeleonSymbol());
                        sb.append(enumC2260221DdM.getSkeleonSymbol());
                        sb.append(enumC2260141DdE.getSkeleonSymbol());
                        sb.append(enumC2260201DdK.getSkeleonSymbol());
                        if (enumC2260111DdB2 != EnumC2260111DdB.H11 && enumC2260111DdB2 != EnumC2260111DdB.H12) {
                            sb.append(enumC2260171DdH.getSkeleonSymbol24());
                        } else {
                            sb.append(enumC2260171DdH.getSkeleonSymbol12());
                        }
                        sb.append(enumC2260191DdJ.getSkeleonSymbol());
                        sb.append(enumC2260211DdL.getSkeleonSymbol());
                        sb.append(enumC2260101DdA.getSkeleonSymbol());
                    } else {
                        if (enumC2260151DdF == enumC2260151DdF2) {
                            localizedPattern = ((SimpleDateFormat) DateFormat.getTimeInstance(LJIIJ(enumC2260161DdG), (ULocale) interfaceC2190701AoW.getLocale())).toLocalizedPattern();
                        } else if (enumC2260161DdG == EnumC2260161DdG.UNDEFINED) {
                            localizedPattern = ((SimpleDateFormat) DateFormat.getDateInstance(LJIIIZ(enumC2260151DdF), (ULocale) interfaceC2190701AoW.getLocale())).toLocalizedPattern();
                        } else {
                            localizedPattern = ((SimpleDateFormat) DateFormat.getDateTimeInstance(LJIIIZ(enumC2260151DdF), LJIIJ(enumC2260161DdG), (ULocale) interfaceC2190701AoW.getLocale())).toLocalizedPattern();
                        }
                        sb.append(localizedPattern);
                        HashMap<String, String> mapLIZ = interfaceC2190701AoW.LIZ();
                        if (mapLIZ.containsKey("hc")) {
                            String str4 = mapLIZ.get("hc");
                            if (str4 != "h11" && str4 != "h12") {
                                if (str4 == "h23" || str4 == "h24") {
                                    LJIIIIZZ(sb, new char[]{'h', 'H', 'K'}, 'k');
                                }
                            } else {
                                LJIIIIZZ(sb, new char[]{'H', 'K', 'k'}, 'h');
                            }
                        }
                        if (enumC2260111DdB2 != EnumC2260111DdB.H11 && enumC2260111DdB2 != EnumC2260111DdB.H12) {
                            if (enumC2260111DdB2 == EnumC2260111DdB.H23 || enumC2260111DdB2 == EnumC2260111DdB.H24) {
                                LJIIIIZZ(sb, new char[]{'h', 'H', 'K'}, 'k');
                            }
                        } else {
                            LJIIIIZZ(sb, new char[]{'H', 'K', 'k'}, 'h');
                        }
                        if (!(obj2 instanceof C20129413pU) && !(obj2 instanceof C20129213pS)) {
                            if (((Boolean) obj2).booleanValue()) {
                                LJIIIIZZ(sb, new char[]{'H', 'K', 'k'}, 'h');
                            } else {
                                LJIIIIZZ(sb, new char[]{'h', 'H', 'K'}, 'k');
                            }
                        }
                    }
                    String string = sb.toString();
                    if (!str2.isEmpty()) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        arrayList.add(str2);
                        InterfaceC2190701AoW interfaceC2190701AoWLIZIZ = interfaceC2190701AoW.LIZIZ();
                        interfaceC2190701AoWLIZIZ.LJFF("ca", arrayList);
                        calendar = Calendar.getInstance((ULocale) interfaceC2190701AoWLIZIZ.getLocale());
                    } else {
                        calendar = null;
                    }
                    if (!str3.isEmpty()) {
                        try {
                            if (NumberingSystem.getInstanceByName(str3) == null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Invalid numbering system: ");
                                sbLIZ.append(str3);
                                throw new C20129013pQ(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            ArrayList<String> arrayList2 = new ArrayList<>();
                            arrayList2.add(str3);
                            interfaceC2190701AoW.LJFF("nu", arrayList2);
                        } catch (RuntimeException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Invalid numbering system: ");
                            sbLIZ2.append(str3);
                            throw new C20129013pQ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    if (calendar != null) {
                        this.LIZ = DateFormat.getPatternInstance(calendar, string, (ULocale) interfaceC2190701AoW.getLocale());
                    } else {
                        this.LIZ = DateFormat.getPatternInstance(string, (ULocale) interfaceC2190701AoW.getLocale());
                    }
                    if (!(obj instanceof C20129413pU) && !(obj instanceof C20129213pS)) {
                        this.LIZ.setTimeZone(TimeZone.getTimeZone((String) obj));
                    }
                }
            };
        } else {
            this.LIZ = new InterfaceC2260091Dd9() { // from class: X.1Dd8
                public java.text.DateFormat LIZ;

                @Override // X.InterfaceC2260091Dd9
                public final String LIZJ(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    return "latn";
                }

                @Override // X.InterfaceC2260091Dd9
                public final AttributedCharacterIterator LIZ(double d) {
                    return this.LIZ.formatToCharacterIterator(Double.valueOf(d));
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LIZIZ(double d) {
                    return this.LIZ.format(new Date((long) d));
                }

                @Override // X.InterfaceC2260091Dd9
                public final EnumC2260111DdB LIZLLL(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    try {
                        String pattern = ((java.text.SimpleDateFormat) java.text.DateFormat.getTimeInstance(0, (Locale) interfaceC2190701AoW.getLocale())).toPattern();
                        StringBuilder sb = new StringBuilder();
                        boolean z = false;
                        for (int i2 = 0; i2 < pattern.length(); i2++) {
                            char cCharAt = pattern.charAt(i2);
                            if (cCharAt == '\'') {
                                z = !z;
                            } else if (!z && cCharAt >= 'A' && (cCharAt <= 'Z' || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                                sb.append(pattern.charAt(i2));
                            }
                        }
                        String string = sb.toString();
                        if (string.contains(String.valueOf('h'))) {
                            return EnumC2260111DdB.H12;
                        }
                        if (string.contains(String.valueOf('K'))) {
                            return EnumC2260111DdB.H11;
                        }
                        if (string.contains(String.valueOf('H'))) {
                            return EnumC2260111DdB.H23;
                        }
                        return EnumC2260111DdB.H24;
                    } catch (ClassCastException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return EnumC2260111DdB.H24;
                    }
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LJI(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    return java.text.DateFormat.getDateInstance(3, (Locale) interfaceC2190701AoW.getLocale()).getCalendar().toString();
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LJII(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    return java.util.Calendar.getInstance((Locale) interfaceC2190701AoW.getLocale()).getTimeZone().getID();
                }

                @Override // X.InterfaceC2260091Dd9
                public final String LJ(AttributedCharacterIterator.Attribute attribute, String str2) {
                    if (attribute == DateFormat.Field.DAY_OF_WEEK) {
                        return "weekday";
                    }
                    if (attribute == DateFormat.Field.ERA) {
                        return "era";
                    }
                    if (attribute == DateFormat.Field.YEAR) {
                        try {
                            CastDoubleProtector.parseDouble(str2);
                            return "year";
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return "yearName";
                        }
                    }
                    if (attribute == DateFormat.Field.MONTH) {
                        return "month";
                    }
                    if (attribute == DateFormat.Field.DAY_OF_MONTH) {
                        return "day";
                    }
                    if (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) {
                        return "hour";
                    }
                    if (attribute == DateFormat.Field.MINUTE) {
                        return "minute";
                    }
                    if (attribute == DateFormat.Field.SECOND) {
                        return "second";
                    }
                    if (attribute == DateFormat.Field.TIME_ZONE) {
                        return "timeZoneName";
                    }
                    if (attribute == DateFormat.Field.AM_PM) {
                        return "dayPeriod";
                    }
                    if (attribute.toString().equals("android.icu.text.DateFormat$Field(related year)")) {
                        return "relatedYear";
                    }
                    return "literal";
                }

                @Override // X.InterfaceC2260091Dd9
                public final void LJFF(InterfaceC2190701AoW interfaceC2190701AoW, String str2, String str3, EnumC2260181DdI enumC2260181DdI, EnumC2260121DdC enumC2260121DdC, EnumC2260221DdM enumC2260221DdM, EnumC2260141DdE enumC2260141DdE, EnumC2260201DdK enumC2260201DdK, EnumC2260171DdH enumC2260171DdH, EnumC2260191DdJ enumC2260191DdJ, EnumC2260211DdL enumC2260211DdL, EnumC2260101DdA enumC2260101DdA, EnumC2260111DdB enumC2260111DdB2, Object obj, EnumC2260151DdF enumC2260151DdF, EnumC2260161DdG enumC2260161DdG, Object obj2) {
                    boolean z;
                    if (!str2.isEmpty()) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        arrayList.add(str2);
                        interfaceC2190701AoW.LJFF("ca", arrayList);
                    }
                    if (!str3.isEmpty()) {
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        arrayList2.add(str3);
                        interfaceC2190701AoW.LJFF("nu", arrayList2);
                    }
                    boolean z2 = true;
                    if (enumC2260221DdM == null && enumC2260141DdE == null && enumC2260201DdK == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (enumC2260171DdH == null && enumC2260191DdJ == null && enumC2260211DdL == null) {
                        z2 = false;
                    }
                    if (z) {
                        if (z2) {
                            this.LIZ = java.text.DateFormat.getDateTimeInstance(0, 0, (Locale) interfaceC2190701AoW.getLocale());
                        } else {
                            this.LIZ = java.text.DateFormat.getDateInstance(0, (Locale) interfaceC2190701AoW.getLocale());
                        }
                    } else if (z2) {
                        this.LIZ = java.text.DateFormat.getTimeInstance(0, (Locale) interfaceC2190701AoW.getLocale());
                    }
                    if (!(obj instanceof C20129413pU) && !(obj instanceof C20129213pS)) {
                        this.LIZ.setTimeZone(java.util.TimeZone.getTimeZone((String) obj));
                    }
                }
            };
        }
        List listAsList = Arrays.asList("ca", "nu", "hc");
        if (map instanceof HashMap) {
            String[] strArr = {"weekday", "year", "month", "day"};
            int i2 = 0;
            boolean z = true;
            do {
                z = C20129313pT.LIZ(map, strArr[i2]) instanceof C20129413pU ? z : false;
                i2++;
            } while (i2 < 4);
            String[] strArr2 = {"hour", "minute", "second"};
            int i3 = 0;
            do {
                z = C20129313pT.LIZ(map, strArr2[i3]) instanceof C20129413pU ? z : false;
                i3++;
            } while (i3 < 3);
            if (((C20129313pT.LIZ(map, "dateStyle") instanceof C20129413pU) && (C20129313pT.LIZ(map, "timeStyle") instanceof C20129413pU)) ? z : false) {
                String[] strArr3 = {"year", "month", "day"};
                int i4 = 0;
                do {
                    C20129313pT.LIZIZ(map, strArr3[i4], "numeric");
                    i4++;
                } while (i4 < 3);
            }
            HashMap map2 = new HashMap();
            EnumC199645139n enumC199645139n = EnumC199645139n.STRING;
            C20129313pT.LIZIZ(map2, "localeMatcher", C20129113pR.LIZIZ(map, "localeMatcher", enumC199645139n, C2260051Dd5.LIZ, "best fit"));
            C20129413pU c20129413pU = C20129313pT.LIZ;
            Object objLIZIZ = C20129113pR.LIZIZ(map, "calendar", enumC199645139n, c20129413pU, c20129413pU);
            if (!(objLIZIZ instanceof C20129413pU)) {
                if (!C2192861As0.LIZJ(0, r0.length() - 1, (String) objLIZIZ, 3, 8)) {
                    throw new C20129013pQ("Invalid calendar option !");
                }
            }
            C20129313pT.LIZIZ(map2, "ca", objLIZIZ);
            Object objLIZIZ2 = C20129113pR.LIZIZ(map, "numberingSystem", enumC199645139n, c20129413pU, c20129413pU);
            if (!(objLIZIZ2 instanceof C20129413pU)) {
                if (!C2192861As0.LIZJ(0, r0.length() - 1, (String) objLIZIZ2, 3, 8)) {
                    throw new C20129013pQ("Invalid numbering system !");
                }
            }
            C20129313pT.LIZIZ(map2, "nu", objLIZIZ2);
            Object objLIZIZ3 = C20129113pR.LIZIZ(map, "hour12", EnumC199645139n.BOOLEAN, c20129413pU, c20129413pU);
            Object objLIZIZ4 = C20129113pR.LIZIZ(map, "hourCycle", enumC199645139n, new String[]{"h11", "h12", "h23", "h24"}, c20129413pU);
            boolean z2 = objLIZIZ3 instanceof C20129413pU;
            C20129313pT.LIZIZ(map2, "hc", z2 ? objLIZIZ4 : C20129313pT.LIZIZ);
            HashMap mapLIZ = C2190821Aoi.LIZ(map2, list, listAsList);
            InterfaceC2190701AoW<?> interfaceC2190701AoW = (InterfaceC2190701AoW) mapLIZ.get("locale");
            this.LIZIZ = interfaceC2190701AoW;
            this.LIZJ = interfaceC2190701AoW.LIZIZ();
            Object objLIZ = C20129313pT.LIZ(mapLIZ, "ca");
            if (!(objLIZ instanceof C20129213pS)) {
                this.LIZLLL = false;
                this.LJ = (String) objLIZ;
            } else {
                this.LIZLLL = true;
                this.LJ = this.LIZ.LJI(this.LIZIZ);
            }
            Object objLIZ2 = C20129313pT.LIZ(mapLIZ, "nu");
            if (!(objLIZ2 instanceof C20129213pS)) {
                i = 0;
                this.LJFF = false;
                this.LJI = (String) objLIZ2;
            } else {
                i = 0;
                this.LJFF = true;
                this.LJI = this.LIZ.LIZJ(this.LIZIZ);
            }
            Object objLIZ3 = C20129313pT.LIZ(mapLIZ, "hc");
            Object objLIZ4 = C20129313pT.LIZ(map, "timeZone");
            if (objLIZ4 instanceof C20129413pU) {
                strLJII = this.LIZ.LJII(this.LIZIZ);
            } else {
                String string = objLIZ4.toString();
                String[] availableIDs = java.util.TimeZone.getAvailableIDs();
                int length = availableIDs.length;
                while (i < length) {
                    strLJII = availableIDs[i];
                    if (!LIZIZ(strLJII).equals(LIZIZ(string))) {
                        i++;
                    }
                }
                throw new C20129013pQ("Invalid timezone name!");
            }
            this.LJIJJ = strLJII;
            EnumC199645139n enumC199645139n2 = EnumC199645139n.STRING;
            C20129113pR.LIZJ(EnumC2260241DdO.class, C20129113pR.LIZIZ(map, "formatMatcher", enumC199645139n2, new String[]{"basic", "best fit"}, "best fit"));
            C20129413pU c20129413pU2 = C20129313pT.LIZ;
            this.LJIIIZ = (EnumC2260181DdI) C20129113pR.LIZJ(EnumC2260181DdI.class, C20129113pR.LIZIZ(map, "weekday", enumC199645139n2, new String[]{"long", "short", "narrow"}, c20129413pU2));
            this.LJIIJ = (EnumC2260121DdC) C20129113pR.LIZJ(EnumC2260121DdC.class, C20129113pR.LIZIZ(map, "era", enumC199645139n2, new String[]{"long", "short", "narrow"}, c20129413pU2));
            this.LJIIJJI = (EnumC2260221DdM) C20129113pR.LIZJ(EnumC2260221DdM.class, C20129113pR.LIZIZ(map, "year", enumC199645139n2, new String[]{"numeric", "2-digit"}, c20129413pU2));
            this.LJIIL = (EnumC2260141DdE) C20129113pR.LIZJ(EnumC2260141DdE.class, C20129113pR.LIZIZ(map, "month", enumC199645139n2, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, c20129413pU2));
            this.LJIILIIL = (EnumC2260201DdK) C20129113pR.LIZJ(EnumC2260201DdK.class, C20129113pR.LIZIZ(map, "day", enumC199645139n2, new String[]{"numeric", "2-digit"}, c20129413pU2));
            Object objLIZIZ5 = C20129113pR.LIZIZ(map, "hour", enumC199645139n2, new String[]{"numeric", "2-digit"}, c20129413pU2);
            this.LJIILJJIL = (EnumC2260171DdH) C20129113pR.LIZJ(EnumC2260171DdH.class, objLIZIZ5);
            this.LJIILL = (EnumC2260191DdJ) C20129113pR.LIZJ(EnumC2260191DdJ.class, C20129113pR.LIZIZ(map, "minute", enumC199645139n2, new String[]{"numeric", "2-digit"}, c20129413pU2));
            this.LJIILLIIL = (EnumC2260211DdL) C20129113pR.LIZJ(EnumC2260211DdL.class, C20129113pR.LIZIZ(map, "second", enumC199645139n2, new String[]{"numeric", "2-digit"}, c20129413pU2));
            this.LJIIZILJ = (EnumC2260101DdA) C20129113pR.LIZJ(EnumC2260101DdA.class, C20129113pR.LIZIZ(map, "timeZoneName", enumC199645139n2, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, c20129413pU2));
            this.LJIJ = (EnumC2260151DdF) C20129113pR.LIZJ(EnumC2260151DdF.class, C20129113pR.LIZIZ(map, "dateStyle", enumC199645139n2, new String[]{"full", "long", "medium", "short"}, c20129413pU2));
            Object objLIZIZ6 = C20129113pR.LIZIZ(map, "timeStyle", enumC199645139n2, new String[]{"full", "long", "medium", "short"}, c20129413pU2);
            EnumC2260161DdG enumC2260161DdG = (EnumC2260161DdG) C20129113pR.LIZJ(EnumC2260161DdG.class, objLIZIZ6);
            this.LJIJI = enumC2260161DdG;
            if ((this.LJIJ == EnumC2260151DdF.UNDEFINED && enumC2260161DdG == EnumC2260161DdG.UNDEFINED) || (this.LJIIIZ == EnumC2260181DdI.UNDEFINED && this.LJIIJ == EnumC2260121DdC.UNDEFINED && this.LJIIJJI == EnumC2260221DdM.UNDEFINED && this.LJIIL == EnumC2260141DdE.UNDEFINED && this.LJIILIIL == EnumC2260201DdK.UNDEFINED && C20129313pT.LIZ(map, "dayPeriod") == c20129413pU2 && this.LJIILJJIL == EnumC2260171DdH.UNDEFINED && this.LJIILL == EnumC2260191DdJ.UNDEFINED && this.LJIILLIIL == EnumC2260211DdL.UNDEFINED && this.LJIIZILJ == EnumC2260101DdA.UNDEFINED && C20129313pT.LIZ(map, "fractionalSecondDigits") == c20129413pU2)) {
                if ((objLIZIZ5 instanceof C20129413pU) && (objLIZIZ6 instanceof C20129413pU)) {
                    this.LJIIIIZZ = EnumC2260111DdB.UNDEFINED;
                } else {
                    EnumC2260111DdB enumC2260111DdBLIZLLL = this.LIZ.LIZLLL(this.LIZIZ);
                    if (objLIZ3 instanceof C20129213pS) {
                        enumC2260111DdB = enumC2260111DdBLIZLLL;
                    } else {
                        enumC2260111DdB = (EnumC2260111DdB) C20129113pR.LIZJ(EnumC2260111DdB.class, objLIZ3);
                    }
                    if (!z2) {
                        if (((Boolean) objLIZIZ3).booleanValue()) {
                            enumC2260111DdB = EnumC2260111DdB.H11;
                            if (enumC2260111DdBLIZLLL != enumC2260111DdB && enumC2260111DdBLIZLLL != EnumC2260111DdB.H23) {
                                enumC2260111DdB = EnumC2260111DdB.H12;
                            }
                        } else {
                            enumC2260111DdB = (enumC2260111DdBLIZLLL == EnumC2260111DdB.H11 || enumC2260111DdBLIZLLL == EnumC2260111DdB.H23) ? EnumC2260111DdB.H23 : EnumC2260111DdB.H24;
                        }
                    }
                    this.LJIIIIZZ = enumC2260111DdB;
                }
                this.LJII = objLIZIZ3;
                InterfaceC2260091Dd9 interfaceC2260091Dd9 = this.LIZ;
                InterfaceC2190701AoW<?> interfaceC2190701AoW2 = this.LIZIZ;
                if (this.LIZLLL) {
                    str = "";
                } else {
                    str = this.LJ;
                }
                interfaceC2260091Dd9.LJFF(interfaceC2190701AoW2, str, this.LJFF ? "" : this.LJI, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, this.LJIIIIZZ, this.LJIJJ, this.LJIJ, this.LJIJI, objLIZIZ3);
                return;
            }
            throw new C317550Ccb("Can't set date-time component options when dateStyle or timeStyle is used");
        }
        throw new C20129013pQ("Invalid options object !");
    }

    public static List<String> LIZLLL(List<String> list, Map<String, Object> map) {
        String str = (String) C20129113pR.LIZIZ(map, "localeMatcher", EnumC199645139n.STRING, C2260051Dd5.LIZ, "best fit");
        ArrayList arrayList = (ArrayList) list;
        String[] strArr = new String[arrayList.size()];
        if (Build.VERSION.SDK_INT >= 24 && str.equals("best fit")) {
            return Arrays.asList(C2190831Aoj.LIZJ((String[]) arrayList.toArray(strArr)));
        }
        return Arrays.asList(C2190831Aoj.LJ((String[]) arrayList.toArray(strArr)));
    }
}
