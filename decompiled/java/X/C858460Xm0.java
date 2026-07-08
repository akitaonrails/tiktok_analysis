package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Xm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858460Xm0 extends AbstractC856650Xj5<AVTextExtraStruct> {
    public final CharSequence LIZIZ;
    public final List<AVTextExtraStruct> LIZJ;
    public final C857960XlC LIZLLL;
    public String LJ;
    public String LJFF;
    public final Map<String, String> LJI;
    public int LJII;
    public final C01GW LJIIIIZZ;

    public static boolean LIZJ(char c) {
        return 'a' <= c ? c < '{' : 'A' <= c && c < '[';
    }

    public final int LIZLLL() {
        ((LinkedHashMap) this.LJI).clear();
        this.LJ = "";
        this.LJFF = "";
        int i = this.LJII + 1;
        this.LJII = i;
        if (i >= this.LIZIZ.length()) {
            this.LJ = "";
            this.LJFF = "";
            return 4;
        }
        char c = 'd';
        String strLIZIZ = "";
        String strLIZIZ2 = "";
        char c2 = 'd';
        while (this.LJII < this.LIZIZ.length()) {
            if (c2 == c) {
                if (this.LIZIZ.charAt(this.LJII) == '<') {
                    c2 = 'n';
                } else {
                    if (this.LIZIZ.charAt(this.LJII) == '>') {
                        throw new C857510XkT("invalid character >", null);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LJFF);
                    sbLIZ.append(this.LIZIZ.charAt(this.LJII));
                    this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                    c2 = 140;
                }
                this.LJII++;
            } else if (c2 != 'n') {
                if (c2 == 140) {
                    if (this.LIZIZ.charAt(this.LJII) == '<') {
                        this.LJII--;
                        return 1;
                    }
                    if (this.LIZIZ.charAt(this.LJII) == '>') {
                        throw new C857510XkT("greater-than character should be escaped", null);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LJFF);
                    sbLIZ2.append(this.LIZIZ.charAt(this.LJII));
                    this.LJFF = C2188811AlT.LIZIZ(sbLIZ2);
                    this.LJII++;
                } else if (c2 == 130) {
                    if (!LIZJ(this.LIZIZ.charAt(this.LJII))) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Illegal end tag, expected: [a-z||A-Z], actual: ");
                        sbLIZ3.append(this.LIZIZ.charAt(this.LJII));
                        throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ3), null);
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(this.LJ);
                    sbLIZ4.append(this.LIZIZ.charAt(this.LJII));
                    this.LJ = C2188811AlT.LIZIZ(sbLIZ4);
                    this.LJII++;
                    c2 = 131;
                } else if (c2 != 131) {
                    switch (c2) {
                        case 'x':
                            if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(this.LJ);
                                sbLIZ5.append(this.LIZIZ.charAt(this.LJII));
                                this.LJ = C2188811AlT.LIZIZ(sbLIZ5);
                                this.LJII++;
                            } else {
                                if (this.LIZIZ.charAt(this.LJII) != ' ') {
                                    if (this.LIZIZ.charAt(this.LJII) == '>') {
                                        return 0;
                                    }
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("Illegal character in tag name, expected=[a-z||A-Z], actual=");
                                    sbLIZ6.append(this.LIZIZ.charAt(this.LJII));
                                    sbLIZ6.append(", parsed sub sequence: ");
                                    sbLIZ6.append((Object) this.LIZIZ.subSequence(0, this.LJII));
                                    throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ6), null);
                                }
                                this.LJII++;
                            }
                            break;
                        case 'y':
                            if (this.LIZIZ.charAt(this.LJII) == ' ') {
                                this.LJII++;
                                continue;
                            } else {
                                if (!LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("Illegal character in attribute key, expected=[a-z||A-Z], actual=");
                                    sbLIZ7.append(this.LIZIZ.charAt(this.LJII));
                                    throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ7), null);
                                }
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("");
                                sbLIZ8.append(this.LIZIZ.charAt(this.LJII));
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
                                this.LJII++;
                                c2 = 'z';
                            }
                            break;
                        case 'z':
                            if (LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append(strLIZIZ);
                                sbLIZ9.append(this.LIZIZ.charAt(this.LJII));
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
                                this.LJII++;
                                continue;
                            } else {
                                if (this.LIZIZ.charAt(this.LJII) != '=') {
                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                    sbLIZ10.append("Illegal character in attribute key, expected=[a-z||A-Z], actual=");
                                    sbLIZ10.append(this.LIZIZ.charAt(this.LJII));
                                    throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ10), null);
                                }
                                this.LJII++;
                                c2 = '{';
                            }
                            break;
                        case '{':
                            c2 = '|';
                            if (this.LIZIZ.charAt(this.LJII) == '\"') {
                                this.LJII++;
                                strLIZIZ2 = "";
                                continue;
                            } else {
                                if (this.LIZIZ.charAt(this.LJII) == '\'') {
                                    throw new C857510XkT("We only support double quotation marks in attribute declaration of a tag, so use double quotation marks instead of single quotation marks.", null);
                                }
                                if (!LIZJ(this.LIZIZ.charAt(this.LJII))) {
                                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                    sbLIZ11.append("Illegal character in attribute value, expected=[a-z||A-Z], actual=");
                                    sbLIZ11.append(this.LIZIZ.charAt(this.LJII));
                                    throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ11), null);
                                }
                                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                sbLIZ12.append("");
                                sbLIZ12.append(this.LIZIZ.charAt(this.LJII));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ12);
                                this.LJII++;
                            }
                            break;
                        case '|':
                            char cCharAt = this.LIZIZ.charAt(this.LJII);
                            if (LIZJ(cCharAt) || ('0' > cCharAt ? cCharAt == '#' : cCharAt < ':')) {
                                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                sbLIZ13.append(strLIZIZ2);
                                sbLIZ13.append(this.LIZIZ.charAt(this.LJII));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ13);
                                this.LJII++;
                            } else if (this.LIZIZ.charAt(this.LJII) == '\"') {
                                this.LJI.put(strLIZIZ, strLIZIZ2);
                                this.LJII++;
                                c2 = '}';
                                strLIZIZ = "";
                                strLIZIZ2 = "";
                            } else {
                                if (this.LIZIZ.charAt(this.LJII) != ' ') {
                                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                    sbLIZ14.append("Illegal character in attribute value, expected=[a-z||A-Z], actual=");
                                    sbLIZ14.append(this.LIZIZ.charAt(this.LJII));
                                    throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ14), null);
                                }
                                this.LJI.put(strLIZIZ, strLIZIZ2);
                                this.LJII++;
                                strLIZIZ = "";
                                strLIZIZ2 = "";
                            }
                            break;
                        case '}':
                            if (this.LIZIZ.charAt(this.LJII) != ' ') {
                                if (this.LIZIZ.charAt(this.LJII) == '>') {
                                    return 0;
                                }
                                throw new C857510XkT("attribute value accepted, only space or > is acceptable", null);
                            }
                            if (strLIZIZ.length() > 0 || strLIZIZ2.length() > 0) {
                                this.LJI.put(strLIZIZ, strLIZIZ2);
                                strLIZIZ = "";
                                strLIZIZ2 = "";
                            }
                            this.LJII++;
                            break;
                            break;
                        case '~':
                            this.LJII--;
                            return 0;
                    }
                    c2 = 'y';
                } else {
                    if (!LIZJ(this.LIZIZ.charAt(this.LJII))) {
                        if (this.LIZIZ.charAt(this.LJII) == '>') {
                            if (this.LJ.length() == 0) {
                                throw new C857510XkT("Illegal end tag, end tag name is empty", null);
                            }
                            return 2;
                        }
                        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                        sbLIZ15.append("Illegal end tag, expected: [a-z||A-Z], actual: ");
                        sbLIZ15.append(this.LIZIZ.charAt(this.LJII));
                        throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ15), null);
                    }
                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                    sbLIZ16.append(this.LJ);
                    sbLIZ16.append(this.LIZIZ.charAt(this.LJII));
                    this.LJ = C2188811AlT.LIZIZ(sbLIZ16);
                    this.LJII++;
                }
            } else if (this.LIZIZ.charAt(this.LJII) == '/') {
                this.LJII++;
                c2 = 130;
            } else {
                if (!LIZJ(this.LIZIZ.charAt(this.LJII))) {
                    StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                    sbLIZ17.append("Illegal character in tag name, expected=[a-z||A-Z], actual=");
                    sbLIZ17.append(this.LIZIZ.charAt(this.LJII));
                    throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ17), null);
                }
                StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                sbLIZ18.append(this.LJ);
                sbLIZ18.append(this.LIZIZ.charAt(this.LJII));
                this.LJ = C2188811AlT.LIZIZ(sbLIZ18);
                this.LJII++;
                c2 = 'x';
            }
            c = 'd';
        }
        if (this.LJII >= this.LIZIZ.length()) {
            if (c2 == 'n') {
                throw new C857510XkT("tag incomplete", null);
            }
            if (c2 == 140) {
                return 1;
            }
        }
        return 4;
    }

    public final String LIZIZ(String str) {
        for (Map.Entry entry : ((Map) this.LJIIIIZZ.getValue()).entrySet()) {
            str = u.LJJIFFI(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    public final C13E8 LJ(boolean z) {
        String str;
        C13E8 c13e8 = new C13E8();
        C13E8<C858570XmB> c13e82 = new C13E8<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (AVTextExtraStruct aVTextExtraStruct : this.LIZJ) {
            String tagId = aVTextExtraStruct.getTagId();
            if (tagId != null) {
                map.put(tagId, aVTextExtraStruct);
            } else {
                throw new C857510XkT("Use markup text protocol but tag_id is null!", null);
            }
        }
        int iLIZLLL = LIZLLL();
        while (iLIZLLL != 4) {
            if (iLIZLLL != 0) {
                if (iLIZLLL != 1) {
                    if (iLIZLLL == 2) {
                        C858570XmB c858570XmB = new C858570XmB(this.LJ, 2, 4);
                        CharSequence charSequence = c858570XmB.LIZ;
                        if (Intrinsics.LJFF(charSequence, "v")) {
                            Pair pair = (Pair) C19719612Di.LJJIJIIJI(arrayList);
                            if (pair != null && Intrinsics.LJFF(((C858570XmB) pair.getFirst()).LIZ, "v")) {
                                if (((C858570XmB) pair.getFirst()).LIZIZ != 2) {
                                    c13e82.addLast(c858570XmB);
                                }
                            } else {
                                throw new C857510XkT("markup stack do not have a video tag", null);
                            }
                        } else if (Intrinsics.LJFF(charSequence, "d")) {
                            Pair pair2 = (Pair) C19719612Di.LJJIJIIJI(arrayList);
                            if (pair2 != null && Intrinsics.LJFF(((C858570XmB) pair2.getFirst()).LIZ, "d")) {
                                LIZ(c858570XmB, c13e82);
                            } else {
                                throw new C857510XkT("markup stack do not have a duet chain start tag", null);
                            }
                        } else if (Intrinsics.LJFF(charSequence, "s")) {
                            Pair pair3 = (Pair) C19719612Di.LJJIJIIJI(arrayList);
                            if (pair3 != null && Intrinsics.LJFF(((C858570XmB) pair3.getFirst()).LIZ, "s")) {
                                LIZ(c858570XmB, c13e82);
                            } else {
                                throw new C857510XkT("markup stack do not have a stitch chain start tag", null);
                            }
                        } else if (!Intrinsics.LJFF(charSequence, "ap") && !Intrinsics.LJFF(charSequence, "as")) {
                            if (Intrinsics.LJFF(charSequence, "m")) {
                                if (arrayList.size() >= 1) {
                                    Pair pair4 = (Pair) ListProtector.get(arrayList, arrayList.size() - 1);
                                    CharSequence charSequence2 = ((C858570XmB) pair4.getFirst()).LIZ;
                                    if (Intrinsics.LJFF(charSequence2, "v")) {
                                        arrayList.remove(pair4);
                                        int iIntValue = ((Number) pair4.getSecond()).intValue();
                                        int i = iIntValue + 1;
                                        if (c13e82.size() > i) {
                                            if (!Intrinsics.LJFF(c13e82.get(iIntValue).LIZ, "v") && !Intrinsics.LJFF(c13e82.get(i).LIZ, "m")) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("markup text parse error! markup text: ");
                                                sbLIZ.append((Object) this.LIZIZ);
                                                throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ), null);
                                            }
                                            c13e82.get(i).LIZ = "v";
                                            c13e82.remove(c13e82.get(iIntValue));
                                            c858570XmB.LIZ = "v";
                                            arrayList.add(new Pair(c858570XmB, Integer.valueOf(c13e82.size())));
                                            c13e82.addLast(c858570XmB);
                                        } else {
                                            throw new C857510XkT("markObjects should have a mention user start tag", null);
                                        }
                                    } else if (Intrinsics.LJFF(charSequence2, "d") || Intrinsics.LJFF(charSequence2, "s")) {
                                        boolean zLJFF = Intrinsics.LJFF(((C858570XmB) pair4.getFirst()).LIZ, "d");
                                        if (c13e82.size() >= 3 && Intrinsics.LJFF(c13e82.get(c13e82.size() - 2).LIZ, "m") && c13e82.get(c13e82.size() - 2).LIZIZ == 0) {
                                            c13e82.get(c13e82.size() - 2).LIZ = "v";
                                            String str2 = c13e82.get(c13e82.size() - 2).LIZJ.get(FollowStatusChangeMethod.PARAM_UID);
                                            if (str2 != null && str2.length() != 0 && map.get(str2) != null) {
                                                Object obj = map.get(str2);
                                                if (obj != null) {
                                                    ((AVTextExtraStruct) obj).subType = 1;
                                                    c858570XmB.LIZ = "v";
                                                    c13e82.addLast(c858570XmB);
                                                } else {
                                                    "Required value was null.".toString();
                                                    throw new IllegalArgumentException("Required value was null.");
                                                }
                                            } else {
                                                throw new C857510XkT("mention user start tag should have a tagId and corresponding textExtra", null);
                                            }
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("markup text parse ");
                                            if (zLJFF) {
                                                str = "duet";
                                            } else {
                                                str = "stitch";
                                            }
                                            sbLIZ2.append(str);
                                            sbLIZ2.append(" chain error! markup text: ");
                                            sbLIZ2.append((Object) this.LIZIZ);
                                            throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ2), null);
                                        }
                                    }
                                } else {
                                    c13e82.addLast(c858570XmB);
                                }
                            } else if (Intrinsics.LJFF(charSequence, "rc")) {
                                LIZ(c858570XmB, c13e82);
                            } else {
                                c13e82.addLast(c858570XmB);
                            }
                        } else if (arrayList.size() >= 1) {
                            Pair pair5 = (Pair) ListProtector.get(arrayList, arrayList.size() - 1);
                            CharSequence charSequence3 = ((C858570XmB) pair5.getFirst()).LIZ;
                            if (Intrinsics.LJFF(charSequence3, "ap") || Intrinsics.LJFF(charSequence3, "as")) {
                                arrayList.remove(pair5);
                                int iIntValue2 = ((Number) pair5.getSecond()).intValue();
                                int i2 = iIntValue2 + 1;
                                if (c13e82.size() > i2) {
                                    if (!Intrinsics.LJFF(c13e82.get(iIntValue2).LIZ, "as") && !Intrinsics.LJFF(c13e82.get(iIntValue2).LIZ, "ap")) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("markup text parse error! markup text: ");
                                        sbLIZ3.append((Object) this.LIZIZ);
                                        throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ3), null);
                                    }
                                    c13e82.get(i2).LIZ = c13e82.get(iIntValue2).LIZ;
                                    c13e82.remove(c13e82.get(iIntValue2));
                                    c858570XmB.LIZ = c13e82.get(iIntValue2).LIZ;
                                    arrayList.add(new Pair(c858570XmB, Integer.valueOf(c13e82.size())));
                                    c13e82.addLast(c858570XmB);
                                } else {
                                    throw new C857510XkT("markObjects should have a mention user start tag", null);
                                }
                            }
                        } else {
                            c13e82.addLast(c858570XmB);
                        }
                    } else {
                        continue;
                    }
                } else {
                    c13e82.addLast(new C858570XmB(this.LJFF, 1, 4));
                }
            } else {
                C858570XmB c858570XmB2 = new C858570XmB(this.LJ, 0, new HashMap(this.LJI));
                int size = c13e82.size();
                CharSequence charSequence4 = c858570XmB2.LIZ;
                if (Intrinsics.LJFF(charSequence4, "v") || Intrinsics.LJFF(charSequence4, "d") || Intrinsics.LJFF(charSequence4, "s")) {
                    arrayList.add(new Pair(c858570XmB2, Integer.valueOf(size)));
                }
                c13e82.addLast(c858570XmB2);
            }
            iLIZLLL = LIZLLL();
        }
        C858570XmB c858570XmBLJIIIIZZ = c13e82.LJIIIIZZ();
        if (c858570XmBLJIIIIZZ != null && c858570XmBLJIIIIZZ.LIZIZ == 2 && (Intrinsics.LJFF(c858570XmBLJIIIIZZ.LIZ, "m") || Intrinsics.LJFF(c858570XmBLJIIIIZZ.LIZ, "h"))) {
            c13e82.addLast(new C858570XmB(" ", 1, 4));
        }
        int length = 0;
        for (C858570XmB c858570XmB3 : c13e82) {
            int i3 = c858570XmB3.LIZIZ;
            if (i3 != -1) {
                if (i3 != 0) {
                    String strLIZIZ = "";
                    if (i3 != 1) {
                        if (i3 == 2) {
                            CharSequence charSequence5 = c858570XmB3.LIZ;
                            if (Intrinsics.LJFF(charSequence5, "m")) {
                                AbstractC858320Xlm abstractC858320Xlm = (AbstractC858320Xlm) c13e8.LJIIZILJ();
                                if (abstractC858320Xlm != null) {
                                    AbstractC858320Xlm abstractC858320Xlm2 = (AbstractC858320Xlm) c13e8.LJIIIIZZ();
                                    if (abstractC858320Xlm2 instanceof C858470Xm1) {
                                        String strLJIILJJIL = abstractC858320Xlm.LJIILJJIL();
                                        length -= strLJIILJJIL.length();
                                        C858470Xm1 c858470Xm1 = (C858470Xm1) abstractC858320Xlm2;
                                        c858470Xm1.LJIIL = strLJIILJJIL.substring(1);
                                        AVTextExtraStruct aVTextExtraStruct2 = (AVTextExtraStruct) map.get(c858470Xm1.LJ());
                                        if (aVTextExtraStruct2 != null) {
                                            aVTextExtraStruct2.start = length;
                                            aVTextExtraStruct2.end = strLJIILJJIL.length() + length;
                                            length += strLJIILJJIL.length();
                                        }
                                    } else {
                                        throw new C857510XkT("end mention user tag, but no start tag", null);
                                    }
                                } else {
                                    throw new C857510XkT("end mention user tag, but no user display name provided", null);
                                }
                            } else if (!Intrinsics.LJFF(charSequence5, "as") && !Intrinsics.LJFF(charSequence5, "ap")) {
                                if (Intrinsics.LJFF(charSequence5, "v")) {
                                    AbstractC858320Xlm abstractC858320Xlm3 = (AbstractC858320Xlm) c13e8.LJIIZILJ();
                                    if (abstractC858320Xlm3 != null) {
                                        AbstractC858320Xlm abstractC858320Xlm4 = (AbstractC858320Xlm) c13e8.LJIIIIZZ();
                                        if (abstractC858320Xlm4 instanceof C858500Xm4) {
                                            String strLJIILJJIL2 = abstractC858320Xlm3.LJIILJJIL();
                                            length -= strLJIILJJIL2.length();
                                            C858500Xm4 c858500Xm4 = (C858500Xm4) abstractC858320Xlm4;
                                            c858500Xm4.LJIILIIL = strLJIILJJIL2.substring(1);
                                            AVTextExtraStruct aVTextExtraStruct3 = (AVTextExtraStruct) map.get(c858500Xm4.LJ());
                                            if (aVTextExtraStruct3 != null) {
                                                aVTextExtraStruct3.start = length;
                                                aVTextExtraStruct3.end = strLJIILJJIL2.length() + length;
                                                length += strLJIILJJIL2.length();
                                            }
                                        } else {
                                            throw new C857510XkT("end mention video tag, but no start tag", null);
                                        }
                                    } else {
                                        throw new C857510XkT("end mention video tag, but no video display name provided", null);
                                    }
                                } else if (Intrinsics.LJFF(charSequence5, "h")) {
                                    AbstractC858320Xlm abstractC858320Xlm5 = (AbstractC858320Xlm) c13e8.LJIIZILJ();
                                    if (abstractC858320Xlm5 != null) {
                                        AbstractC858320Xlm abstractC858320Xlm6 = (AbstractC858320Xlm) c13e8.LJIIIIZZ();
                                        if (abstractC858320Xlm6 instanceof C858540Xm8) {
                                            String strLJIILJJIL3 = abstractC858320Xlm5.LJIILJJIL();
                                            length -= strLJIILJJIL3.length();
                                            C858540Xm8 c858540Xm8 = (C858540Xm8) abstractC858320Xlm6;
                                            c858540Xm8.LJIIJ = strLJIILJJIL3.substring(1);
                                            AVTextExtraStruct aVTextExtraStruct4 = (AVTextExtraStruct) map.get(c858540Xm8.LJ());
                                            if (aVTextExtraStruct4 != null) {
                                                aVTextExtraStruct4.start = length;
                                                aVTextExtraStruct4.end = strLJIILJJIL3.length() + length;
                                                length += strLJIILJJIL3.length();
                                            }
                                        } else {
                                            throw new C857510XkT("end hashtag tag, but no start tag", null);
                                        }
                                    } else {
                                        throw new C857510XkT("end hashtag tag, but no hashtag name provided", null);
                                    }
                                } else if (Intrinsics.LJFF(charSequence5, "s")) {
                                    C858420Xlw c858420Xlw = new C858420Xlw(0);
                                    c858420Xlw.LJII = C0W3U.RTL;
                                    while (!c13e8.isEmpty() && c858420Xlw.LIZ((AbstractC858320Xlm) c13e8.last())) {
                                        c13e8.removeLast();
                                    }
                                    c13e8.addLast(c858420Xlw);
                                } else if (Intrinsics.LJFF(charSequence5, "d")) {
                                    C858410Xlv c858410Xlv = new C858410Xlv(0);
                                    c858410Xlv.LJII = C0W3U.RTL;
                                    while (!c13e8.isEmpty() && c858410Xlv.LIZ((AbstractC858320Xlm) c13e8.last())) {
                                        c13e8.removeLast();
                                    }
                                    c13e8.addLast(c858410Xlv);
                                } else if (Intrinsics.LJFF(charSequence5, "rc")) {
                                    C858400Xlu c858400Xlu = new C858400Xlu(0);
                                    c858400Xlu.LJII = C0W3U.RTL;
                                    while (!c13e8.isEmpty() && c858400Xlu.LIZ((AbstractC858320Xlm) c13e8.last())) {
                                        c13e8.removeLast();
                                    }
                                    c13e8.addLast(c858400Xlu);
                                } else if (Intrinsics.LJFF(charSequence5, "pc")) {
                                    C858430Xlx c858430Xlx = new C858430Xlx();
                                    c858430Xlx.LJII = C0W3U.RTL;
                                    while (!c13e8.isEmpty() && c858430Xlx.LIZ((AbstractC858320Xlm) c13e8.last())) {
                                        c13e8.removeLast();
                                    }
                                    c13e8.addLast(c858430Xlx);
                                } else {
                                    C857960XlC c857960XlC = this.LIZLLL;
                                    if (c857960XlC.LIZ && c857960XlC.LIZIZ) {
                                        while (true) {
                                            if (!(!c13e8.isEmpty())) {
                                                break;
                                            }
                                            AbstractC858320Xlm abstractC858320Xlm7 = (AbstractC858320Xlm) c13e8.last();
                                            if (abstractC858320Xlm7 instanceof C858370Xlr) {
                                                abstractC858320Xlm7.getClass();
                                                break;
                                            }
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append(abstractC858320Xlm7.LJIILJJIL());
                                            sbLIZ4.append(strLIZIZ);
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                            c13e8.removeLast();
                                        }
                                        if (!(c13e8.LJIIIIZZ() instanceof C858370Xlr)) {
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("unknown tag has no start tag, only end tag present, tag: ");
                                            sbLIZ5.append((Object) c858570XmB3.LIZ);
                                            sbLIZ5.append(", attributes: ");
                                            sbLIZ5.append(c858570XmB3.LIZJ);
                                            throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ5), null);
                                        }
                                    }
                                }
                            } else {
                                AbstractC858320Xlm abstractC858320Xlm8 = (AbstractC858320Xlm) c13e8.LJIIZILJ();
                                if (abstractC858320Xlm8 != null) {
                                    AbstractC858320Xlm abstractC858320Xlm9 = (AbstractC858320Xlm) c13e8.LJIIIIZZ();
                                    if (abstractC858320Xlm9 instanceof C858590XmD) {
                                        String strLJIILJJIL4 = abstractC858320Xlm8.LJIILJJIL();
                                        length -= strLJIILJJIL4.length();
                                        C858590XmD c858590XmD = (C858590XmD) abstractC858320Xlm9;
                                        c858590XmD.LJIIIZ = strLJIILJJIL4;
                                        if (Intrinsics.LJFF(c858570XmB3.LIZ, "as")) {
                                            c858590XmD.LJIIJ = 520;
                                        } else {
                                            c858590XmD.LJIIJ = 521;
                                        }
                                        AVTextExtraStruct aVTextExtraStruct5 = (AVTextExtraStruct) map.get(c858590XmD.LJ());
                                        if (aVTextExtraStruct5 != null) {
                                            aVTextExtraStruct5.start = length;
                                            aVTextExtraStruct5.end = strLJIILJJIL4.length() + length;
                                            length += strLJIILJJIL4.length();
                                        }
                                    } else {
                                        throw new C857510XkT("end mention user tag, but no start tag", null);
                                    }
                                } else {
                                    throw new C857510XkT("end mention user tag, but no user display name provided", null);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        while (!c13e8.isEmpty() && (c13e8.last() instanceof C858350Xlp)) {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(((AbstractC858320Xlm) c13e8.removeLast()).LJIILJJIL());
                            sbLIZ6.append(strLIZIZ);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                        }
                        int length2 = length - strLIZIZ.length();
                        int length3 = LIZIZ(c858570XmB3.LIZ.toString()).length() + length;
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(strLIZIZ);
                        sbLIZ7.append(LIZIZ(c858570XmB3.LIZ.toString()));
                        c13e8.addLast(new C858350Xlp(length2, length3, C2188811AlT.LIZIZ(sbLIZ7)));
                        length += LIZIZ(c858570XmB3.LIZ.toString()).length();
                    }
                } else {
                    CharSequence charSequence6 = c858570XmB3.LIZ;
                    if (Intrinsics.LJFF(charSequence6, "h")) {
                        String str3 = c858570XmB3.LIZJ.get(FollowStatusChangeMethod.PARAM_UID);
                        if (str3 != null) {
                            AVTextExtraStruct aVTextExtraStruct6 = (AVTextExtraStruct) map.get(str3);
                            if (aVTextExtraStruct6 != null) {
                                C858540Xm8 c858540Xm82 = new C858540Xm8(length, c858570XmB3.LIZ.length() + length);
                                c858540Xm82.LJIILIIL(str3);
                                c858540Xm82.LJIIIZ = aVTextExtraStruct6.subType;
                                c13e8.addLast(c858540Xm82);
                            } else {
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("tag_id not found in metadata, tag=");
                                sbLIZ8.append((Object) c858570XmB3.LIZ);
                                throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ8), null);
                            }
                        } else {
                            throw new C857510XkT("hashtag id is null", null);
                        }
                    } else if (Intrinsics.LJFF(charSequence6, "m")) {
                        String str4 = c858570XmB3.LIZJ.get(FollowStatusChangeMethod.PARAM_UID);
                        if (str4 != null) {
                            AVTextExtraStruct aVTextExtraStruct7 = (AVTextExtraStruct) map.get(str4);
                            if (aVTextExtraStruct7 != null) {
                                int length4 = c858570XmB3.LIZ.length() + length;
                                String str5 = aVTextExtraStruct7.userId;
                                if (str5 != null) {
                                    C858470Xm1 c858470Xm12 = new C858470Xm1(length, length4, new C858610XmF(str5, aVTextExtraStruct7.getSecUid()));
                                    c858470Xm12.LJIILIIL(str4);
                                    c858470Xm12.LJIIJ = aVTextExtraStruct7.subType;
                                    c13e8.addLast(c858470Xm12);
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append("tag_id not found in metadata, tag=");
                                sbLIZ9.append((Object) c858570XmB3.LIZ);
                                throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ9), null);
                            }
                        } else {
                            throw new C857510XkT("mention user id is null", null);
                        }
                    } else if (!Intrinsics.LJFF(charSequence6, "as") && !Intrinsics.LJFF(charSequence6, "ap")) {
                        if (Intrinsics.LJFF(charSequence6, "v")) {
                            String str6 = c858570XmB3.LIZJ.get(FollowStatusChangeMethod.PARAM_UID);
                            if (str6 != null) {
                                AVTextExtraStruct aVTextExtraStruct8 = (AVTextExtraStruct) map.get(str6);
                                if (aVTextExtraStruct8 != null) {
                                    int length5 = length + c858570XmB3.LIZ.length();
                                    String str7 = aVTextExtraStruct8.awemeId;
                                    if (str7 != null) {
                                        String str8 = aVTextExtraStruct8.userId;
                                        if (str8 != null) {
                                            C858500Xm4 c858500Xm42 = new C858500Xm4(length, length5, str7, new C858610XmF(str8, aVTextExtraStruct8.getSecUid()), aVTextExtraStruct8.commentId);
                                            c858500Xm42.LJIILIIL(str6);
                                            c858500Xm42.LJIIL = aVTextExtraStruct8.subType;
                                            c13e8.addLast(c858500Xm42);
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                    sbLIZ10.append("tag_id not found in metadata, tag=");
                                    sbLIZ10.append((Object) c858570XmB3.LIZ);
                                    throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ10), null);
                                }
                            } else {
                                throw new C857510XkT("mention video id is null", null);
                            }
                        } else if (Intrinsics.LJFF(charSequence6, "br")) {
                            String strLIZIZ2 = "\n";
                            while (!c13e8.isEmpty()) {
                                AbstractC858320Xlm abstractC858320Xlm10 = (AbstractC858320Xlm) c13e8.last();
                                if (!(abstractC858320Xlm10 instanceof C858350Xlp)) {
                                    break;
                                }
                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                sbLIZ11.append(abstractC858320Xlm10.LJIILJJIL());
                                sbLIZ11.append(strLIZIZ2);
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ11);
                                c13e8.removeLast();
                            }
                            int i4 = length + 1;
                            c13e8.addLast(new C858350Xlp(length, i4, strLIZIZ2));
                            length = i4;
                        } else if (!Intrinsics.LJFF(charSequence6, "d") && !Intrinsics.LJFF(charSequence6, "s") && !Intrinsics.LJFF(charSequence6, "rc")) {
                            C857960XlC c857960XlC2 = this.LIZLLL;
                            if (c857960XlC2.LIZ && c857960XlC2.LIZIZ) {
                                c858570XmB3.LIZ.toString();
                                final Map<String, String> map2 = c858570XmB3.LIZJ;
                                c13e8.addLast(new AbstractC858390Xlt(map2) { // from class: X.0Xlr
                                    public final Map<String, String> LJIIIZ;

                                    @Override // X.AbstractC858390Xlt, X.AbstractC858320Xlm
                                    public final String LJIILJJIL() {
                                        return "";
                                    }

                                    {
                                        super(0, 0, 0);
                                        this.LJIIIZ = map2;
                                    }
                                });
                            }
                        }
                    } else {
                        String str9 = c858570XmB3.LIZJ.get(FollowStatusChangeMethod.PARAM_UID);
                        if (str9 != null) {
                            C858590XmD c858590XmD2 = new C858590XmD(length, c858570XmB3.LIZ.length() + length);
                            if (Intrinsics.LJFF(c858570XmB3.LIZ, "as")) {
                                c858590XmD2.LJIIJ = 520;
                            } else {
                                c858590XmD2.LJIIJ = 521;
                            }
                            c858590XmD2.LJIILIIL(str9);
                            c13e8.addLast(c858590XmD2);
                        } else {
                            throw new C857510XkT("ai copy writing id is null", null);
                        }
                    }
                }
            } else {
                throw new C857510XkT("Unknown markup object", null);
            }
        }
        if (z) {
            int i5 = 0;
            for (Object obj2 : c13e8) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    ((AbstractC858320Xlm) obj2).LJIILIIL(String.valueOf(i5));
                    i5 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return c13e8;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C858570XmB r5, X.C13E8<X.C858570XmB> r6) {
        /*
            r4 = this;
            X.0XlC r0 = r4.LIZLLL
            boolean r0 = r0.LIZ
            r3 = 1
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r6.LJIIIIZZ()
            X.0XmB r0 = (X.C858570XmB) r0
            if (r0 == 0) goto L4d
            java.lang.CharSequence r1 = r0.LIZ
        L11:
            java.lang.String r0 = " "
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L4f
            r2 = 0
        L1a:
            int r1 = r6.size()
            r0 = 3
            if (r1 <= r0) goto L51
            int r0 = r6.size()
            int r0 = r0 - r3
            java.lang.Object r0 = r6.get(r0)
            X.0XmB r0 = (X.C858570XmB) r0
            int r0 = r0.LIZIZ
            if (r0 != r3) goto L51
            int r0 = r6.size()
            r1 = 2
            int r0 = r0 - r1
            java.lang.Object r0 = r6.get(r0)
            X.0XmB r0 = (X.C858570XmB) r0
            int r0 = r0.LIZIZ
            if (r0 != r1) goto L51
            if (r2 == 0) goto L51
            java.lang.Object r0 = r6.removeLast()
            r6.addLast(r5)
            r6.addLast(r0)
            return
        L4d:
            r1 = 0
            goto L11
        L4f:
            r2 = 1
            goto L1a
        L51:
            r6.addLast(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C858460Xm0.LIZ(X.0XmB, X.13E8):void");
    }

    public C858460Xm0(CharSequence charSequence, final List<AVTextExtraStruct> list, C857960XlC c857960XlC) {
        new Object(list) { // from class: X.0Xj5
            public final List<METADATA> LIZ;

            {
                this.LIZ = list;
            }
        };
        this.LIZIZ = charSequence;
        this.LIZJ = list;
        this.LIZLLL = c857960XlC;
        this.LJ = "";
        this.LJFF = "";
        this.LJI = new LinkedHashMap();
        this.LJII = -1;
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(583));
    }
}
