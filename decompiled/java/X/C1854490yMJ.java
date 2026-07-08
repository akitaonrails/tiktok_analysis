package X;

import android.content.Context;
import android.util.Size;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoStandardRatio;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854490yMJ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 6 ? "" : "image_to_video" : "edit_image" : "AI_create" : "homework" : "deep_thinking";
    }

    public static int LIZIZ(EnumC1854550yMP enumC1854550yMP) {
        int i = C1854510yML.LIZ[enumC1854550yMP.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 1;
                    }
                    return 0;
                }
                return 2;
            }
            return 6;
        }
        return 5;
    }

    public static int LIZLLL(TakoStandardRatio takoStandardRatio) {
        int i = takoStandardRatio.stdSize;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i == 5) {
                        return R.raw.icon_ratio_16_9;
                    }
                    return R.raw.icon_ratio_9_16;
                }
                return R.raw.icon_ratio_4_3;
            }
            return R.raw.icon_ratio_3_4;
        }
        return R.raw.icon_ratio_1_1;
    }

    public static EnumC1854550yMP LJFF(Integer num) {
        if (num != null) {
            if (num.intValue() == 5) {
                return EnumC1854550yMP.EDIT_IMAGE;
            }
            if (num.intValue() == 6) {
                return EnumC1854550yMP.IMAGE_TO_VIDEO;
            }
            if (num.intValue() == 2) {
                return EnumC1854550yMP.HOMEWORK;
            }
            if (num.intValue() == 1) {
                return EnumC1854550yMP.DEEP_THINK;
            }
        }
        return EnumC1854550yMP.NONE;
    }

    public static int LJI(EnumC1854550yMP enumC1854550yMP) {
        int i = C1854510yML.LIZ[enumC1854550yMP.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    return 0;
                }
            } else {
                C1561220qjI.LIZ.getClass();
                if (!C1561220qjI.LIZ()) {
                    return 1;
                }
                C1855940yOe.LIZ.getClass();
                return C1855940yOe.LIZ();
            }
        }
        C1855940yOe.LIZ.getClass();
        return C1855940yOe.LIZ();
    }

    public static String LJIIIIZZ(EnumC1854550yMP enumC1854550yMP) {
        int i = C1854510yML.LIZ[enumC1854550yMP.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "default";
                    }
                    return "deep_thinking";
                }
                return "homework";
            }
            return "image_to_video";
        }
        return "image";
    }

    public static C1567230qsz LJIIIZ(C1854540yMO c1854540yMO) {
        int i;
        String strLJII = c1854540yMO.LIZIZ;
        Integer numValueOf = null;
        if (strLJII == null || strLJII.length() <= 0) {
            int i2 = C1854510yML.LIZ[c1854540yMO.LIZ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            strLJII = "";
                        } else {
                            strLJII = C1857750yRZ.LJII(2131822460);
                        }
                    } else {
                        strLJII = C1857750yRZ.LJII(2131822463);
                    }
                } else {
                    strLJII = C1857750yRZ.LJII(2131822559);
                }
            } else {
                strLJII = C1857750yRZ.LJII(2131822450);
            }
        }
        int i3 = C1854510yML.LIZ[c1854540yMO.LIZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        numValueOf = Integer.valueOf(R.raw.icon_atom);
                    }
                } else {
                    numValueOf = Integer.valueOf(R.raw.icon_open_book_sparkle);
                }
            } else {
                numValueOf = Integer.valueOf(R.raw.icon_ai_video);
            }
        } else {
            C1852700yJQ.LIZ.getClass();
            if (C1852700yJQ.LIZ()) {
                i = R.raw.icon_ai_image;
            } else {
                i = R.raw.icon_image_brush;
            }
            numValueOf = Integer.valueOf(i);
        }
        return new C1567230qsz(strLJII, numValueOf);
    }

    public static C1854470yMH LJ(C1854470yMH c1854470yMH, TakoStandardRatio takoStandardRatio) {
        return C1854470yMH.LIZ(c1854470yMH, takoStandardRatio.nameText, Integer.valueOf(LIZLLL(takoStandardRatio)), null, null, false, null, 32758);
    }

    public static C1854470yMH LJII(C1854470yMH c1854470yMH, ConvertStyleItem convertStyleItem) {
        int i;
        Size size;
        Pair pair;
        String str;
        String strLJII = C1857750yRZ.LJII(2131849631);
        boolean z = true;
        if (convertStyleItem != null) {
            String str2 = convertStyleItem.imageStyle;
            if ((!a0.LJJJIL(str2)) && str2 != null) {
                strLJII = str2;
            }
        }
        if (convertStyleItem == null || (str = convertStyleItem.picUrl) == null || str.length() <= 0) {
            z = false;
        }
        int i2 = 18;
        if (z) {
            String str3 = convertStyleItem.picUrl;
            C1163410gNf.LIZ.getClass();
            if (C1163410gNf.LIZJ()) {
                size = new Size(18, 18);
            } else {
                C1855770yON.LIZ.getClass();
                if (C1855770yON.LIZIZ()) {
                    size = new Size(24, 24);
                } else {
                    size = new Size(32, 32);
                }
            }
            if (C1163410gNf.LIZJ()) {
                pair = new Pair(10, 4);
            } else {
                pair = new Pair(4, 4);
            }
            return C1854470yMH.LIZ(c1854470yMH, strLJII, null, str3, size, true, pair, 15926);
        }
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZ()) {
            i = 18;
        } else {
            i = 14;
        }
        if (!C1163410gNf.LIZ()) {
            i2 = 14;
        }
        return C1854470yMH.LIZ(c1854470yMH, strLJII, Integer.valueOf(R.raw.icon_convert), null, new Size(i, i2), false, new Pair(0, 6), 15926);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZ(C1854540yMO c1854540yMO, Function2 function2, Integer num, String str) {
        List<String> list;
        ArrayList arrayList = new ArrayList();
        List<Integer> list2 = c1854540yMO.LJ;
        if (list2 != null) {
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                Object obj = null;
                if (iIntValue == C0TGU.CONVERT_STYLE.getType()) {
                    int size = arrayList.size();
                    if (!c1854540yMO.LJFF.isEmpty()) {
                        C1854470yMH c1854470yMH = new C1854470yMH(C1857750yRZ.LJII(2131849631), size, c1854540yMO.LJIIIIZZ, Integer.valueOf(R.raw.icon_convert), null, 0 == true ? 1 : 0, new AwS641S0100000_27(function2, (Function2<? super C1854470yMH, ? super Context, Unit>) 5), EnumC1854500yMK.STYLE_CONVERT, Integer.valueOf(R.raw.icon_chevron_down), 0 == true ? 1 : 0, 25584);
                        if (str != null) {
                            Iterator<ConvertStyleItem> it3 = c1854540yMO.LJFF.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ConvertStyleItem next = it3.next();
                                if (Intrinsics.LJFF(next.nameStarling, str)) {
                                    obj = next;
                                    break;
                                }
                            }
                            c1854470yMH = LJII(c1854470yMH, (ConvertStyleItem) obj);
                        }
                        arrayList.add(c1854470yMH);
                    }
                } else {
                    int i = 0;
                    if (iIntValue == C0TGU.STANDARD_RATIO.getType()) {
                        int size2 = arrayList.size();
                        if (!c1854540yMO.LJI.isEmpty()) {
                            C1854470yMH c1854470yMH2 = new C1854470yMH(C1857750yRZ.LJII(2131822513), size2, c1854540yMO.LJIIIIZZ, Integer.valueOf(R.raw.icon_ratio_9_16), null, 0 == true ? 1 : 0, new AwS641S0100000_27(function2, (Function2<? super C1854470yMH, ? super Context, Unit>) 4), EnumC1854500yMK.RATIO_SELECT, Integer.valueOf(R.raw.icon_chevron_down), 0 == true ? 1 : 0, 25584);
                            Iterator<TakoStandardRatio> it4 = c1854540yMO.LJI.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                TakoStandardRatio next2 = it4.next();
                                int i2 = next2.stdSize;
                                if (num != null && i2 == num.intValue()) {
                                    obj = next2;
                                    break;
                                }
                            }
                            TakoStandardRatio takoStandardRatio = (TakoStandardRatio) obj;
                            if (takoStandardRatio != null) {
                                c1854470yMH2 = LJ(c1854470yMH2, takoStandardRatio);
                            }
                            arrayList.add(c1854470yMH2);
                        }
                    } else if (iIntValue == C0TGU.SUG.getType()) {
                        int size3 = arrayList.size();
                        TakoSug takoSug = c1854540yMO.LJII;
                        if (takoSug != null && (list = takoSug.sugList) != null) {
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (String str2 : list) {
                                int i3 = i + 1;
                                if (i >= 0) {
                                    String str3 = str2;
                                    arrayList2.add(new C1854470yMH(str3, size3 + i, c1854540yMO.LJIIIIZZ, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new AwS641S0100000_27(function2, (Function2<? super C1854470yMH, ? super Context, Unit>) 6), EnumC1854500yMK.AUTO_SEND_PROMPT, Integer.valueOf(R.raw.icon_arrow_right_ltr), str3, 17400));
                                    i = i3;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return arrayList;
    }
}
