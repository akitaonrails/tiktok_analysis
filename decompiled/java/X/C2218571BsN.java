package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.1BsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218571BsN {
    public static final Logger LJII = Logger.getLogger(C2218571BsN.class.getName());
    public static final Map<Integer, String> LJIIIIZZ;
    public static final Set<Integer> LJIIIZ;
    public static final Set<Integer> LJIIJ;
    public static final Map<Character, Character> LJIIJJI;
    public static final Map<Character, Character> LJIIL;
    public static final Map<Character, Character> LJIILIIL;
    public static final Map<Character, Character> LJIILJJIL;
    public static final Pattern LJIILL;
    public static final Pattern LJIILLIIL;
    public static final Pattern LJIIZILJ;
    public static final Pattern LJIJ;
    public static final Pattern LJIJI;
    public static final Pattern LJIJJ;
    public static final Pattern LJIJJLI;
    public static final Pattern LJIL;
    public static final Pattern LJJ;
    public static final Pattern LJJI;
    public static C2218571BsN LJJIFFI;
    public final InterfaceC2218741Bse LIZ;
    public final Map<Integer, List<String>> LIZIZ;
    public final C19919612wk LIZJ = new C19919612wk();
    public final Set<String> LIZLLL = new HashSet(35);
    public final C19919512wj LJ = new C19919512wj();
    public final Set<String> LJFF = new HashSet(320);
    public final Set<Integer> LJI = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(52, "1");
        map.put(54, "9");
        LJIIIIZZ = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        LJIIIZ = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        LJIIJ = Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map<Character, Character> mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        LJIIL = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        LJIILIIL = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        LJIIJJI = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        Iterator<Character> it2 = mapUnmodifiableMap.keySet().iterator();
        while (it2.hasNext()) {
            char cCharValue = it2.next().charValue();
            map6.put(Character.valueOf(Character.toLowerCase(cCharValue)), Character.valueOf(cCharValue));
            map6.put(Character.valueOf(cCharValue), Character.valueOf(cCharValue));
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        LJIILJJIL = Collections.unmodifiableMap(map6);
        PatternProtector.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Map<Character, Character> map7 = LJIIL;
        sbLIZ.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sbLIZ.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LJIILL = PatternProtector.compile("[+＋]+");
        LJIILLIIL = PatternProtector.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        LJIIZILJ = PatternProtector.compile("(\\p{Nd})");
        LJIJ = PatternProtector.compile("[+＋\\p{Nd}]");
        LJIJI = PatternProtector.compile("[\\\\/] *x");
        LJIJJ = PatternProtector.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        LJIJJLI = PatternProtector.compile("(?:.*?[A-Za-z]){3}.*");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("\\p{Nd}");
        sbLIZ2.append("]*");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(",;");
        sbLIZ3.append("xｘ#＃~～");
        String strLIZ = LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        LIZ("xｘ#＃~～");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("(?:");
        sbLIZ4.append(strLIZ);
        sbLIZ4.append(")$");
        LJIL = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ4), 66);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ2);
        sbLIZ5.append("(?:");
        sbLIZ5.append(strLIZ);
        sbLIZ5.append(")?");
        LJJ = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ5), 66);
        PatternProtector.compile("(\\D+)");
        LJJI = PatternProtector.compile("(\\$\\d)");
        PatternProtector.compile("\\(?\\$1\\)?");
        LJJIFFI = null;
    }

    public static synchronized C2218571BsN LIZJ() {
        if (LJJIFFI == null) {
            LJIJI(new C2218571BsN(new C2218691BsZ(), C2280561EOg.LIZ()));
        }
        return LJJIFFI;
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[");
        sbLIZ.append(str);
        sbLIZ.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*");
        sbLIZ.append("(\\p{Nd}{1,7})");
        sbLIZ.append("#?|[- ]+(");
        sbLIZ.append("\\p{Nd}");
        sbLIZ.append("{1,5})#");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(C2218561BsM c2218561BsM) {
        StringBuilder sb = new StringBuilder();
        if (c2218561BsM.isItalianLeadingZero() && c2218561BsM.getNumberOfLeadingZeros() > 0) {
            char[] cArr = new char[c2218561BsM.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(c2218561BsM.getNationalNumber());
        return sb.toString();
    }

    public static void LJIILL(StringBuilder sb) {
        if (LJIJJLI.matcher(sb).matches()) {
            int length = sb.length();
            Map<Character, Character> map = LJIILIIL;
            StringBuilder sb2 = new StringBuilder(sb.length());
            for (int i = 0; i < sb.length(); i++) {
                Character ch = map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i))));
                if (ch != null) {
                    sb2.append(ch);
                }
            }
            sb.replace(0, length, sb2.toString());
            return;
        }
        sb.replace(0, sb.length(), LJIILLIIL(sb));
    }

    public static String LJIILLIIL(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int iDigit = Character.digit(charSequence.charAt(i), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static synchronized void LJIJI(C2218571BsN c2218571BsN) {
        LJJIFFI = c2218571BsN;
    }

    public final C2218581BsO LIZLLL(String str) {
        if (str != null && ((HashSet) this.LJFF).contains(str)) {
            C2218691BsZ c2218691BsZ = (C2218691BsZ) this.LIZ;
            return C2280551EOf.LIZ(str, c2218691BsZ.LIZJ, c2218691BsZ.LIZ, c2218691BsZ.LIZIZ);
        }
        return null;
    }

    public final String LJIIIIZZ(int i) {
        List<String> list = this.LIZIZ.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) ListProtector.get(list, 0);
    }

    public final String LJIIIZ(C2218561BsM c2218561BsM) {
        int countryCode = c2218561BsM.getCountryCode();
        List<String> list = this.LIZIZ.get(Integer.valueOf(countryCode));
        if (list == null) {
            Logger logger = LJII;
            Level level = Level.INFO;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Missing/invalid country_code (");
            sbLIZ.append(countryCode);
            sbLIZ.append(")");
            logger.log(level, C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (list.size() == 1) {
            return (String) ListProtector.get(list, 0);
        }
        String strLJFF = LJFF(c2218561BsM);
        for (String str : list) {
            C2218581BsO c2218581BsOLIZLLL = LIZLLL(str);
            if (c2218581BsOLIZLLL.hasLeadingDigits()) {
                if (this.LJ.LIZ(c2218581BsOLIZLLL.getLeadingDigits()).matcher(strLJFF).lookingAt()) {
                    return str;
                }
            } else if (LJII(strLJFF, c2218581BsOLIZLLL) != EnumC2218621BsS.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    public final boolean LJIIJJI(CharSequence charSequence) {
        EnumC2218671BsX enumC2218671BsXLJIJJ;
        try {
            C2218561BsM c2218561BsMLJIIZILJ = LJIIZILJ(charSequence, null);
            EnumC2218621BsS enumC2218621BsS = EnumC2218621BsS.UNKNOWN;
            String strLJFF = LJFF(c2218561BsMLJIIZILJ);
            int countryCode = c2218561BsMLJIIZILJ.getCountryCode();
            if (!this.LIZIZ.containsKey(Integer.valueOf(countryCode))) {
                enumC2218671BsXLJIJJ = EnumC2218671BsX.INVALID_COUNTRY_CODE;
            } else {
                enumC2218671BsXLJIJJ = LJIJJ(strLJFF, LJ(countryCode, LJIIIIZZ(countryCode)), enumC2218621BsS);
            }
            if (enumC2218671BsXLJIJJ != EnumC2218671BsX.IS_POSSIBLE) {
                if (enumC2218671BsXLJIJJ != EnumC2218671BsX.IS_POSSIBLE_LOCAL_ONLY) {
                    return false;
                }
            }
            return true;
        } catch (C1722250uv1 e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final boolean LJIIL(C2218561BsM c2218561BsM) {
        String strLJIIIZ = LJIIIZ(c2218561BsM);
        int countryCode = c2218561BsM.getCountryCode();
        C2218581BsO c2218581BsOLJ = LJ(countryCode, strLJIIIZ);
        if (c2218581BsOLJ != null) {
            if (!"001".equals(strLJIIIZ)) {
                C2218581BsO c2218581BsOLIZLLL = LIZLLL(strLJIIIZ);
                if (c2218581BsOLIZLLL != null) {
                    if (countryCode != c2218581BsOLIZLLL.getCountryCode()) {
                        return false;
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid region code: ");
                    sbLIZ.append(strLJIIIZ);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (LJII(LJFF(c2218561BsM), c2218581BsOLJ) == EnumC2218621BsS.UNKNOWN) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C2218571BsN(C2218691BsZ c2218691BsZ, Map map) {
        this.LIZ = c2218691BsZ;
        this.LIZIZ = map;
        HashMap map2 = (HashMap) map;
        for (Map.Entry entry : map2.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(ListProtector.get(list, 0))) {
                ((HashSet) this.LJI).add(entry.getKey());
            } else {
                this.LJFF.addAll(list);
            }
        }
        if (((HashSet) this.LJFF).remove("001")) {
            LJII.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.LIZLLL.addAll((Collection) map2.get(1));
    }

    public static C2218591BsP LJI(C2218581BsO c2218581BsO, EnumC2218621BsS enumC2218621BsS) {
        switch (C2218601BsQ.LIZJ[enumC2218621BsS.ordinal()]) {
            case 1:
                return c2218581BsO.getPremiumRate();
            case 2:
                return c2218581BsO.getTollFree();
            case 3:
                return c2218581BsO.getMobile();
            case 4:
            case 5:
                return c2218581BsO.getFixedLine();
            case 6:
                return c2218581BsO.getSharedCost();
            case 7:
                return c2218581BsO.getVoip();
            case 8:
                return c2218581BsO.getPersonalNumber();
            case BdTuring.TYPE_ECAF /* 9 */:
                return c2218581BsO.getPager();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return c2218581BsO.getUan();
            case BdTuring.TYPE_EMAIL /* 11 */:
                return c2218581BsO.getVoicemail();
            default:
                return c2218581BsO.getGeneralDesc();
        }
    }

    public final String LIZIZ(C2218561BsM c2218561BsM, EnumC2218661BsW enumC2218661BsW) {
        List<C2218611BsR> listNumberFormats;
        if (c2218561BsM.getNationalNumber() == 0 && c2218561BsM.hasRawInput()) {
            String rawInput = c2218561BsM.getRawInput();
            if (rawInput.length() > 0) {
                return rawInput;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int countryCode = c2218561BsM.getCountryCode();
        String strLJFF = LJFF(c2218561BsM);
        EnumC2218661BsW enumC2218661BsW2 = EnumC2218661BsW.E164;
        if (enumC2218661BsW == enumC2218661BsW2) {
            sb.append(strLJFF);
            LJIJ(countryCode, enumC2218661BsW2, sb);
        } else if (!this.LIZIZ.containsKey(Integer.valueOf(countryCode))) {
            sb.append(strLJFF);
        } else {
            C2218581BsO c2218581BsOLJ = LJ(countryCode, LJIIIIZZ(countryCode));
            if (c2218581BsOLJ.intlNumberFormats().size() != 0 && enumC2218661BsW != EnumC2218661BsW.NATIONAL) {
                listNumberFormats = c2218581BsOLJ.intlNumberFormats();
            } else {
                listNumberFormats = c2218581BsOLJ.numberFormats();
            }
            Iterator<C2218611BsR> it2 = listNumberFormats.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C2218611BsR next = it2.next();
                int iLeadingDigitsPatternSize = next.leadingDigitsPatternSize();
                if (iLeadingDigitsPatternSize == 0 || this.LJ.LIZ(next.getLeadingDigitsPattern(iLeadingDigitsPatternSize - 1)).matcher(strLJFF).lookingAt()) {
                    if (this.LJ.LIZ(next.getPattern()).matcher(strLJFF).matches()) {
                        String format = next.getFormat();
                        Matcher matcher = this.LJ.LIZ(next.getPattern()).matcher(strLJFF);
                        EnumC2218661BsW enumC2218661BsW3 = EnumC2218661BsW.NATIONAL;
                        String nationalPrefixFormattingRule = next.getNationalPrefixFormattingRule();
                        if (enumC2218661BsW == enumC2218661BsW3 && nationalPrefixFormattingRule != null && nationalPrefixFormattingRule.length() > 0) {
                            strLJFF = matcher.replaceAll(LJJI.matcher(format).replaceFirst(nationalPrefixFormattingRule));
                        } else {
                            strLJFF = matcher.replaceAll(format);
                        }
                        if (enumC2218661BsW == EnumC2218661BsW.RFC3966) {
                            Matcher matcher2 = LJIILLIIL.matcher(strLJFF);
                            if (matcher2.lookingAt()) {
                                strLJFF = matcher2.replaceFirst("");
                            }
                            strLJFF = matcher2.reset(strLJFF).replaceAll("-");
                        }
                    }
                }
            }
            sb.append(strLJFF);
            if (c2218561BsM.hasExtension() && c2218561BsM.getExtension().length() > 0) {
                if (enumC2218661BsW == EnumC2218661BsW.RFC3966) {
                    sb.append(";ext=");
                    sb.append(c2218561BsM.getExtension());
                } else if (c2218581BsOLJ.hasPreferredExtnPrefix()) {
                    sb.append(c2218581BsOLJ.getPreferredExtnPrefix());
                    sb.append(c2218561BsM.getExtension());
                } else {
                    sb.append(" ext. ");
                    sb.append(c2218561BsM.getExtension());
                }
            }
            LJIJ(countryCode, enumC2218661BsW, sb);
        }
        return sb.toString();
    }

    public final C2218581BsO LJ(int i, String str) {
        if ("001".equals(str)) {
            if (!this.LIZIZ.containsKey(Integer.valueOf(i))) {
                return null;
            }
            C2218691BsZ c2218691BsZ = (C2218691BsZ) this.LIZ;
            c2218691BsZ.getClass();
            List list = (List) ((HashMap) C2280561EOg.LIZ()).get(Integer.valueOf(i));
            if (list.size() != 1 || !"001".equals(ListProtector.get(list, 0))) {
                return null;
            }
            return C2280551EOf.LIZ(Integer.valueOf(i), c2218691BsZ.LIZLLL, c2218691BsZ.LIZ, c2218691BsZ.LIZIZ);
        }
        return LIZLLL(str);
    }

    public final EnumC2218621BsS LJII(String str, C2218581BsO c2218581BsO) {
        if (!LJIIJ(str, c2218581BsO.getGeneralDesc())) {
            return EnumC2218621BsS.UNKNOWN;
        }
        if (LJIIJ(str, c2218581BsO.getPremiumRate())) {
            return EnumC2218621BsS.PREMIUM_RATE;
        }
        if (LJIIJ(str, c2218581BsO.getTollFree())) {
            return EnumC2218621BsS.TOLL_FREE;
        }
        if (LJIIJ(str, c2218581BsO.getSharedCost())) {
            return EnumC2218621BsS.SHARED_COST;
        }
        if (LJIIJ(str, c2218581BsO.getVoip())) {
            return EnumC2218621BsS.VOIP;
        }
        if (LJIIJ(str, c2218581BsO.getPersonalNumber())) {
            return EnumC2218621BsS.PERSONAL_NUMBER;
        }
        if (LJIIJ(str, c2218581BsO.getPager())) {
            return EnumC2218621BsS.PAGER;
        }
        if (LJIIJ(str, c2218581BsO.getUan())) {
            return EnumC2218621BsS.UAN;
        }
        if (LJIIJ(str, c2218581BsO.getVoicemail())) {
            return EnumC2218621BsS.VOICEMAIL;
        }
        if (LJIIJ(str, c2218581BsO.getFixedLine())) {
            if (c2218581BsO.getSameMobileAndFixedLinePattern()) {
                return EnumC2218621BsS.FIXED_LINE_OR_MOBILE;
            }
            if (LJIIJ(str, c2218581BsO.getMobile())) {
                return EnumC2218621BsS.FIXED_LINE_OR_MOBILE;
            }
            return EnumC2218621BsS.FIXED_LINE;
        }
        if (!c2218581BsO.getSameMobileAndFixedLinePattern() && LJIIJ(str, c2218581BsO.getMobile())) {
            return EnumC2218621BsS.MOBILE;
        }
        return EnumC2218621BsS.UNKNOWN;
    }

    public final boolean LJIIJ(String str, C2218591BsP c2218591BsP) {
        int length = str.length();
        List<Integer> possibleLengthList = c2218591BsP.getPossibleLengthList();
        if (possibleLengthList.size() > 0 && !possibleLengthList.contains(Integer.valueOf(length))) {
            return false;
        }
        return this.LIZJ.LIZ(str, c2218591BsP);
    }

    public final C2218561BsM LJIIZILJ(CharSequence charSequence, String str) {
        CharSequence charSequenceSubSequence;
        int iLJIILIIL;
        int i;
        C2218561BsM c2218561BsM = new C2218561BsM();
        if (charSequence != null) {
            if (charSequence.length() <= 250) {
                StringBuilder sb = new StringBuilder();
                String string = charSequence.toString();
                int iIndexOf = string.indexOf(";phone-context=");
                String strGroup = "";
                if (iIndexOf >= 0) {
                    int i2 = iIndexOf + 15;
                    if (i2 < string.length() - 1 && string.charAt(i2) == '+') {
                        int iIndexOf2 = string.indexOf(59, i2);
                        if (iIndexOf2 > 0) {
                            sb.append(string.substring(i2, iIndexOf2));
                        } else {
                            sb.append(string.substring(i2));
                        }
                    }
                    int iIndexOf3 = string.indexOf("tel:");
                    if (iIndexOf3 >= 0) {
                        i = iIndexOf3 + 4;
                    } else {
                        i = 0;
                    }
                    sb.append(string.substring(i, iIndexOf));
                } else {
                    Matcher matcher = LJIJ.matcher(string);
                    if (!matcher.find()) {
                        charSequenceSubSequence = "";
                    } else {
                        charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                        Matcher matcher2 = LJIJJ.matcher(charSequenceSubSequence);
                        if (matcher2.find()) {
                            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                        }
                        Matcher matcher3 = LJIJI.matcher(charSequenceSubSequence);
                        if (matcher3.find()) {
                            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                        }
                    }
                    sb.append(charSequenceSubSequence);
                }
                int iIndexOf4 = sb.indexOf(";isub=");
                if (iIndexOf4 > 0) {
                    sb.delete(iIndexOf4, sb.length());
                }
                if (sb.length() >= 2 && LJJ.matcher(sb).matches()) {
                    if ((str != null && ((HashSet) this.LJFF).contains(str)) || (sb.length() != 0 && LJIILL.matcher(sb).lookingAt())) {
                        Matcher matcher4 = LJIL.matcher(sb);
                        if (matcher4.find()) {
                            String strSubstring = sb.substring(0, matcher4.start());
                            if (strSubstring.length() >= 2 && LJJ.matcher(strSubstring).matches()) {
                                int iGroupCount = matcher4.groupCount();
                                int i3 = 1;
                                while (true) {
                                    if (i3 > iGroupCount) {
                                        break;
                                    }
                                    if (matcher4.group(i3) != null) {
                                        strGroup = matcher4.group(i3);
                                        sb.delete(matcher4.start(), sb.length());
                                        break;
                                    }
                                    i3++;
                                }
                            }
                        }
                        if (strGroup.length() > 0) {
                            c2218561BsM.setExtension(strGroup);
                        }
                        C2218581BsO c2218581BsOLIZLLL = LIZLLL(str);
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            iLJIILIIL = LJIILIIL(sb, c2218581BsOLIZLLL, sb2, c2218561BsM);
                        } catch (C1722250uv1 e) {
                            TryCatchGuardChecker.doCheck(e);
                            Matcher matcher5 = LJIILL.matcher(sb);
                            if (e.getErrorType() == EnumC2218681BsY.INVALID_COUNTRY_CODE && matcher5.lookingAt()) {
                                iLJIILIIL = LJIILIIL(sb.substring(matcher5.end()), c2218581BsOLIZLLL, sb2, c2218561BsM);
                                if (iLJIILIIL == 0) {
                                    throw new C1722250uv1(EnumC2218681BsY.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                                }
                            } else {
                                throw new C1722250uv1(e.getErrorType(), e.getMessage());
                            }
                        }
                        if (iLJIILIIL != 0) {
                            String strLJIIIIZZ = LJIIIIZZ(iLJIILIIL);
                            if (!strLJIIIIZZ.equals(str)) {
                                c2218581BsOLIZLLL = LJ(iLJIILIIL, strLJIIIIZZ);
                            }
                        } else {
                            LJIILL(sb);
                            sb2.append((CharSequence) sb);
                            if (str != null) {
                                c2218561BsM.setCountryCode(c2218581BsOLIZLLL.getCountryCode());
                            }
                        }
                        if (sb2.length() >= 2) {
                            if (c2218581BsOLIZLLL != null) {
                                StringBuilder sb3 = new StringBuilder();
                                StringBuilder sb4 = new StringBuilder(sb2);
                                LJIILJJIL(sb4, c2218581BsOLIZLLL, sb3);
                                EnumC2218671BsX enumC2218671BsXLJIJJ = LJIJJ(sb4, c2218581BsOLIZLLL, EnumC2218621BsS.UNKNOWN);
                                if (enumC2218671BsXLJIJJ != EnumC2218671BsX.TOO_SHORT && enumC2218671BsXLJIJJ != EnumC2218671BsX.IS_POSSIBLE_LOCAL_ONLY && enumC2218671BsXLJIJJ != EnumC2218671BsX.INVALID_LENGTH) {
                                    sb2 = sb4;
                                }
                            }
                            int length = sb2.length();
                            if (length >= 2) {
                                if (length <= 17) {
                                    if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                                        c2218561BsM.setItalianLeadingZero(true);
                                        int i4 = 1;
                                        while (i4 < sb2.length() - 1 && sb2.charAt(i4) == '0') {
                                            i4++;
                                        }
                                        if (i4 != 1) {
                                            c2218561BsM.setNumberOfLeadingZeros(i4);
                                        }
                                    }
                                    c2218561BsM.setNationalNumber(CastLongProtector.parseLong(sb2.toString()));
                                    return c2218561BsM;
                                }
                                throw new C1722250uv1(EnumC2218681BsY.TOO_LONG, "The string supplied is too long to be a phone number.");
                            }
                            throw new C1722250uv1(EnumC2218681BsY.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                        }
                        throw new C1722250uv1(EnumC2218681BsY.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    }
                    throw new C1722250uv1(EnumC2218681BsY.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                }
                throw new C1722250uv1(EnumC2218681BsY.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            }
            throw new C1722250uv1(EnumC2218681BsY.TOO_LONG, "The string supplied was too long to parse.");
        }
        throw new C1722250uv1(EnumC2218681BsY.NOT_A_NUMBER, "The phone number supplied was null.");
    }

    public static void LJIJ(int i, EnumC2218661BsW enumC2218661BsW, StringBuilder sb) {
        int i2 = C2218601BsQ.LIZIZ[enumC2218661BsW.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                sb.insert(0, "-");
                sb.insert(0, i);
                sb.insert(0, '+');
                sb.insert(0, "tel:");
                return;
            }
            sb.insert(0, " ");
            sb.insert(0, i);
            sb.insert(0, '+');
            return;
        }
        sb.insert(0, i);
        sb.insert(0, '+');
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC2218671BsX LJIJJ(java.lang.CharSequence r9, X.C2218581BsO r10, X.EnumC2218621BsS r11) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2218571BsN.LJIJJ(java.lang.CharSequence, X.1BsO, X.1BsS):X.1BsX");
    }

    public final void LJIILJJIL(StringBuilder sb, C2218581BsO c2218581BsO, StringBuilder sb2) {
        int length = sb.length();
        String nationalPrefixForParsing = c2218581BsO.getNationalPrefixForParsing();
        if (length != 0 && nationalPrefixForParsing.length() != 0) {
            Matcher matcher = this.LJ.LIZ(nationalPrefixForParsing).matcher(sb);
            if (matcher.lookingAt()) {
                C2218591BsP generalDesc = c2218581BsO.getGeneralDesc();
                boolean zLIZ = this.LIZJ.LIZ(sb, generalDesc);
                int iGroupCount = matcher.groupCount();
                String nationalPrefixTransformRule = c2218581BsO.getNationalPrefixTransformRule();
                if (nationalPrefixTransformRule != null && nationalPrefixTransformRule.length() != 0 && matcher.group(iGroupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(nationalPrefixTransformRule));
                    if (zLIZ && !this.LIZJ.LIZ(sb3.toString(), generalDesc)) {
                        return;
                    }
                    if (sb2 != null && iGroupCount > 1) {
                        sb2.append(matcher.group(1));
                    }
                    sb.replace(0, sb.length(), sb3.toString());
                    return;
                }
                if (zLIZ && !this.LIZJ.LIZ(sb.substring(matcher.end()), generalDesc)) {
                    return;
                }
                if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                    sb2.append(matcher.group(1));
                }
                sb.delete(0, matcher.end());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILIIL(java.lang.CharSequence r8, X.C2218581BsO r9, java.lang.StringBuilder r10, X.C2218561BsM r11) throws X.C1722250uv1 {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2218571BsN.LJIILIIL(java.lang.CharSequence, X.1BsO, java.lang.StringBuilder, X.1BsM):int");
    }
}
