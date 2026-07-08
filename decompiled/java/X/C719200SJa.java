package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719200SJa {
    public static final /* synthetic */ int LIZ = 0;

    public static C0SJF LIZ(AbstractC719220SJc abstractC719220SJc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LongText from parser: ");
        sbLIZ.append(abstractC719220SJc.LIZIZ());
        C719300SJk.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) abstractC719220SJc.LIZJ).clear();
        List<C0SJL<C719000SIg>> listLIZ = abstractC719220SJc.LIZ(abstractC719220SJc.LIZ, abstractC719220SJc.LIZIZ);
        ((ArrayList) abstractC719220SJc.LIZJ).addAll(listLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(abstractC719220SJc.getClass().getSimpleName());
        sbLIZ2.append(" generateTextComponents size: ");
        sbLIZ2.append(listLIZ.size());
        C719300SJk.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return new C0SJF(abstractC719220SJc.LIZJ);
    }

    public static C0SJF LIZIZ(final String str, List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C719000SIg(((TextExtraStruct) it2.next()).m271clone()));
        }
        final List listLLIIII = C13LP.LLIIII(arrayList);
        return LIZ(new AbstractC719220SJc(str, listLLIIII) { // from class: X.0SJX
            @Override // X.AbstractC719230SJd
            public final String LIZIZ() {
                return C0SJY.DESC.getValue();
            }

            @Override // X.AbstractC719230SJd
            public final List<C0SJL<C719000SIg>> LIZ(CharSequence charSequence, Iterable<? extends C719000SIg> iterable) {
                C0SJT.LIZ.getClass();
                return C0SJT.LIZ(charSequence, iterable);
            }
        });
    }

    public static C0SJF LIZJ(final String str, List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C719000SIg(((TextExtraStruct) it2.next()).m271clone()));
        }
        final List listLLIIII = C13LP.LLIIII(arrayList);
        return LIZ(new AbstractC719220SJc(str, listLLIIII) { // from class: X.0SJZ
            public HashMap<String, C719000SIg> LIZLLL;

            @Override // X.AbstractC719230SJd
            public final String LIZIZ() {
                return C0SJY.MARKUP_TEXT.getValue();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC719230SJd
            public final List<C0SJL<C719000SIg>> LIZ(CharSequence charSequence, Iterable<? extends C719000SIg> iterable) {
                int i;
                int i2;
                C0SJJ c0sjj;
                C0SJJ c0sjj2;
                String str2;
                C0SJJ c0sjj3;
                String str3;
                C0SJJ c0sjj4;
                String str4;
                Object c0sjp;
                C13E8 c13e8 = new C13E8();
                this.LIZLLL = new HashMap<>();
                Iterator<? extends C719000SIg> it3 = iterable.iterator();
                while (true) {
                    String str5 = "";
                    if (!it3.hasNext()) {
                        break;
                    }
                    C719000SIg next = it3.next();
                    String tagId = next.LIZ.getTagId();
                    if (tagId != null) {
                        str5 = tagId;
                    }
                    if (str5.length() == 0) {
                        C719300SJk.LIZIZ("Use markup text protocol but tag_id is null!");
                    }
                    HashMap<String, C719000SIg> map = this.LIZLLL;
                    if (map != null) {
                        map.put(str5, next);
                    }
                }
                C13E8<C719210SJb> c13e82 = new C13E8();
                Pair pairLIZ = C719320SJm.LIZ(0, charSequence);
                int i3 = ((C719210SJb) pairLIZ.getSecond()).LJ;
                while (pairLIZ.getFirst() != EnumC719360SJq.END_MARKUP) {
                    int i4 = C719370SJr.LIZ[((EnumC719360SJq) pairLIZ.getFirst()).ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 != 5) {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    c13e82.addLast(pairLIZ.getSecond());
                                }
                            } else {
                                c13e82.addLast(pairLIZ.getSecond());
                            }
                        } else {
                            c13e82.addLast(pairLIZ.getSecond());
                        }
                    }
                    pairLIZ = C719320SJm.LIZ(i3, charSequence);
                    i3 = ((C719210SJb) pairLIZ.getSecond()).LJ;
                }
                C13E8 c13e83 = new C13E8();
                int length = 0;
                for (C719210SJb c719210SJb : c13e82) {
                    int i5 = c719210SJb.LIZIZ;
                    if (i5 != -1) {
                        String strLIZLLL = null;
                        METADATA metadata = 0;
                        METADATA metadata2 = 0;
                        METADATA metadata3 = 0;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    C0SJK c0sjk = (C0SJK) c13e83.LJIIIIZZ();
                                    if (c0sjk != null) {
                                        strLIZLLL = c0sjk.LIZLLL();
                                    }
                                    if (Intrinsics.LJFF(strLIZLLL, c719210SJb.LIZ)) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(LIZIZ());
                                        sbLIZ.append(" handleEndMarkupObjectWithNestedContainer: ");
                                        sbLIZ.append((String) c719210SJb.LIZ);
                                        C719300SJk.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                                        C0SJL c0sjl = (C0SJL) c13e8.LJIIZILJ();
                                        if (c0sjl != null) {
                                            i = c0sjl.LLILZ;
                                        } else {
                                            i = 0;
                                        }
                                        c0sjk.LLILZ = i;
                                        while (true) {
                                            if (c0sjl != null) {
                                                if (!Intrinsics.LJFF(c0sjl.LIZLLL(), c0sjk.LIZLLL())) {
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append('<');
                                                    sbLIZ2.append((String) c719210SJb.LIZ);
                                                    sbLIZ2.append("> -> addChild : ");
                                                    sbLIZ2.append(c0sjl);
                                                    C719300SJk.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                                                    ListProtector.add(c0sjk.LLJ, 0, c0sjl);
                                                    c0sjl = (C0SJL) c13e8.LJIIZILJ();
                                                } else {
                                                    i2 = c0sjl.LLILLL;
                                                    break;
                                                }
                                            } else {
                                                i2 = 0;
                                                break;
                                            }
                                        }
                                        c0sjk.LLILLL = i2;
                                        String strLIZ = c0sjk.LIZ();
                                        for (C0SJL c0sjl2 : (ArrayList) c0sjk.LLJ) {
                                            if ((c0sjl2 instanceof C0SJJ) && (c0sjj = (C0SJJ) c0sjl2) != null) {
                                                c0sjj.LLJI = strLIZ;
                                            }
                                        }
                                        c13e8.addLast(c0sjk);
                                        c13e83.LJIIZILJ();
                                    } else {
                                        CharSequence charSequence2 = c719210SJb.LIZ;
                                        if (Intrinsics.LJFF(charSequence2, "h")) {
                                            C0SJL c0sjl3 = (C0SJL) c13e8.LJIIZILJ();
                                            if (!(c0sjl3 instanceof C0SJM)) {
                                                C719300SJk.LIZIZ("end hashtag tag, but no hashtag value provided");
                                                if (c0sjl3 != null) {
                                                    c13e8.addLast(c0sjl3);
                                                }
                                            } else {
                                                C0SJL c0sjl4 = (C0SJL) c13e8.LJIIIIZZ();
                                                if ((c0sjl4 instanceof C0SJN) && ((str2 = (c0sjj2 = (C0SJJ) c0sjl4).LLJ) == null || str2.length() == 0)) {
                                                    LIZJ(((C0SJJ) c0sjl3).LIZ(), (C0SJJ) c0sjl4, length);
                                                    length = c0sjj2.LLILZ;
                                                } else {
                                                    c13e8.addLast(c0sjl3);
                                                    C719300SJk.LIZIZ("end hashtag tag, but no start tag");
                                                }
                                            }
                                        } else if (Intrinsics.LJFF(charSequence2, "m")) {
                                            C0SJL c0sjl5 = (C0SJL) c13e8.LJIIZILJ();
                                            if (!(c0sjl5 instanceof C0SJM)) {
                                                C719300SJk.LIZIZ("end mentionUser tag, but no mentionUser value provided");
                                                if (c0sjl5 != null) {
                                                    c13e8.addLast(c0sjl5);
                                                }
                                            } else {
                                                C0SJL c0sjl6 = (C0SJL) c13e8.LJIIIIZZ();
                                                if ((c0sjl6 instanceof C0SJR) && ((str3 = (c0sjj3 = (C0SJJ) c0sjl6).LLJ) == null || str3.length() == 0)) {
                                                    LIZJ(((C0SJJ) c0sjl5).LIZ(), (C0SJJ) c0sjl6, length);
                                                    length = c0sjj3.LLILZ;
                                                } else {
                                                    c13e8.addLast(c0sjl5);
                                                    C719300SJk.LIZIZ("end mentionUser tag, but no start tag");
                                                }
                                            }
                                        } else if (Intrinsics.LJFF(charSequence2, "v")) {
                                            C0SJL c0sjl7 = (C0SJL) c13e8.LJIIZILJ();
                                            if (!(c0sjl7 instanceof C0SJM)) {
                                                C719300SJk.LIZIZ("end mentionVideo tag, but no mentionVideo value provided");
                                                if (c0sjl7 != null) {
                                                    c13e8.addLast(c0sjl7);
                                                }
                                            } else {
                                                C0SJL c0sjl8 = (C0SJL) c13e8.LJIIIIZZ();
                                                if ((c0sjl8 instanceof C0SJS) && ((str4 = (c0sjj4 = (C0SJJ) c0sjl8).LLJ) == null || str4.length() == 0)) {
                                                    LIZJ(((C0SJJ) c0sjl7).LIZ(), (C0SJJ) c0sjl8, length);
                                                    length = c0sjj4.LLILZ;
                                                } else {
                                                    c13e8.addLast(c0sjl7);
                                                    C719300SJk.LIZIZ("end mentionVideo tag, but no start tag");
                                                }
                                            }
                                        } else if (Intrinsics.LJFF(charSequence2, "d")) {
                                            C719300SJk.LIZIZ("end duet tag, but no start tag");
                                        } else if (Intrinsics.LJFF(charSequence2, "s")) {
                                            C719300SJk.LIZIZ("end stitch tag, but no start tag");
                                        } else if (Intrinsics.LJFF(charSequence2, "rc")) {
                                            C719300SJk.LIZIZ("end replyComment tag, but no start tag");
                                        } else if (Intrinsics.LJFF(charSequence2, "rs")) {
                                            C719300SJk.LIZIZ("end replySticker tag, but no start tag");
                                        } else if (Intrinsics.LJFF(charSequence2, "as")) {
                                            C719300SJk.LIZIZ("end askSticker tag, but no start tag");
                                        } else if (Intrinsics.LJFF(charSequence2, "pc")) {
                                            C719300SJk.LIZIZ("end commentPost tag, but no start tag");
                                        } else {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append('<');
                                            sbLIZ3.append((Object) c719210SJb.LIZ);
                                            sbLIZ3.append("></");
                                            sbLIZ3.append((Object) c719210SJb.LIZ);
                                            sbLIZ3.append("> tag not support");
                                            C719300SJk.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                            c13e8.addLast(new C0SJP(0, 0, c719210SJb.LIZ.toString()));
                                        }
                                    }
                                }
                            } else {
                                String strLIZ2 = C718910SHx.LIZ(c719210SJb.LIZ.toString());
                                C0SJM c0sjm = new C0SJM(length, strLIZ2.length() + length, strLIZ2);
                                c0sjm.LLILZ = c0sjm.LIZ().length() + length;
                                c13e8.addLast(c0sjm);
                                length += c0sjm.LIZ().length();
                            }
                        } else {
                            CharSequence charSequence3 = c719210SJb.LIZ;
                            if (Intrinsics.LJFF(charSequence3, "h")) {
                                String str6 = c719210SJb.LIZJ.get(FollowStatusChangeMethod.PARAM_UID);
                                if (str6 == null) {
                                    str6 = "";
                                }
                                if (str6.length() == 0) {
                                    C719300SJk.LIZIZ("start hashtag id is null");
                                }
                                C0SJN c0sjn = new C0SJN(length, c719210SJb.LIZ.length() + length);
                                c0sjn.LLILZLL = str6;
                                HashMap<String, C719000SIg> map2 = this.LIZLLL;
                                if (map2 != null) {
                                    metadata = map2.get(str6);
                                }
                                c0sjn.LLIZ = metadata;
                                c0sjp = c0sjn;
                            } else if (Intrinsics.LJFF(charSequence3, "m")) {
                                String str7 = c719210SJb.LIZJ.get(FollowStatusChangeMethod.PARAM_UID);
                                if (str7 == null) {
                                    str7 = "";
                                }
                                if (str7.length() == 0) {
                                    C719300SJk.LIZIZ("start mention user id is null");
                                }
                                C0SJR c0sjr = new C0SJR(length, c719210SJb.LIZ.length() + length);
                                c0sjr.LLILZLL = str7;
                                HashMap<String, C719000SIg> map3 = this.LIZLLL;
                                if (map3 != null) {
                                    metadata2 = map3.get(str7);
                                }
                                c0sjr.LLIZ = metadata2;
                                c0sjp = c0sjr;
                            } else if (Intrinsics.LJFF(charSequence3, "v")) {
                                String str8 = c719210SJb.LIZJ.get(FollowStatusChangeMethod.PARAM_UID);
                                if (str8 == null) {
                                    str8 = "";
                                }
                                if (str8.length() == 0) {
                                    C719300SJk.LIZIZ("start mention video id is null");
                                }
                                C0SJS c0sjs = new C0SJS(length, c719210SJb.LIZ.length() + length);
                                c0sjs.LLILZLL = str8;
                                HashMap<String, C719000SIg> map4 = this.LIZLLL;
                                if (map4 != null) {
                                    metadata3 = map4.get(str8);
                                }
                                c0sjs.LLIZ = metadata3;
                                c0sjp = c0sjs;
                            } else if (Intrinsics.LJFF(charSequence3, "br")) {
                                c0sjp = new C0SJI(length, length + 1);
                            } else if (Intrinsics.LJFF(charSequence3, "d")) {
                                c0sjp = new C719260SJg(length, c719210SJb.LIZ.length() + length);
                            } else if (Intrinsics.LJFF(charSequence3, "s")) {
                                c0sjp = new C719290SJj(length, c719210SJb.LIZ.length() + length);
                            } else if (Intrinsics.LJFF(charSequence3, "rc")) {
                                c0sjp = new C719270SJh(length, c719210SJb.LIZ.length() + length);
                            } else if (Intrinsics.LJFF(charSequence3, "rs")) {
                                c0sjp = new C719280SJi(length, c719210SJb.LIZ.length() + length);
                            } else if (Intrinsics.LJFF(charSequence3, "as")) {
                                c0sjp = new C719240SJe(length, c719210SJb.LIZ.length() + length);
                            } else if (Intrinsics.LJFF(charSequence3, "pc")) {
                                c0sjp = new C719250SJf(length, c719210SJb.LIZ.length() + length);
                            } else {
                                c0sjp = new C0SJP(0, 0, c719210SJb.LIZ.toString());
                            }
                            c13e8.addLast(c0sjp);
                            if (c0sjp instanceof C0SJI) {
                                length++;
                            } else if (c0sjp instanceof C0SJK) {
                                c13e83.addLast(c0sjp);
                            }
                        }
                    } else {
                        C719300SJk.LIZIZ("Unknown markup object");
                    }
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("createTextComponents result size: ");
                sbLIZ4.append(c13e8.size());
                sbLIZ4.append(" -> ");
                sbLIZ4.append(c13e8);
                C719300SJk.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                return c13e8;
            }

            public final void LIZJ(String str2, C0SJJ c0sjj, int i) {
                C719000SIg c719000SIg;
                c0sjj.LLJ = str2;
                int length = i - str2.length();
                int length2 = c0sjj.LIZ().length() + length;
                c0sjj.LLILZ = length2;
                HashMap<String, C719000SIg> map = this.LIZLLL;
                if (map != null && (c719000SIg = map.get(c0sjj.LLILZLL)) != null) {
                    c719000SIg.LIZ.setStart(length);
                    c719000SIg.LIZ.setEnd(length2);
                }
            }
        });
    }
}
