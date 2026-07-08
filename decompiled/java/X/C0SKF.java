package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0SKF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKF {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme) {
        return C0SCU.LIZ().LJJJ(aweme);
    }

    public static final String LIZIZ(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i2;
        boolean z11;
        ArrayList<TextExtraStruct> arrayList = null;
        if (aweme == null) {
            return null;
        }
        String desc = aweme.getDesc();
        String contentDesc = aweme.getContentDesc();
        boolean z12 = false;
        if (contentDesc != null && contentDesc.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            if (desc != null && desc.length() != 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                return "";
            }
            if (textExtra != null && !textExtra.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return desc;
            }
            boolean[] zArr = new boolean[desc.length()];
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct != null) {
                    int start = textExtraStruct.getStart();
                    if (start < 0) {
                        start = 0;
                    }
                    int end = textExtraStruct.getEnd();
                    int length = desc.length();
                    if (end > length) {
                        end = length;
                    }
                    if (textExtraStruct.getStart() > textExtraStruct.getEnd()) {
                        start = textExtraStruct.getEnd();
                        if (start < 0) {
                            start = 0;
                        }
                        end = textExtraStruct.getStart();
                        int length2 = desc.length();
                        if (end > length2) {
                            end = length2;
                        }
                    }
                    while (start < end) {
                        zArr[start] = true;
                        start++;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            int length3 = desc.length();
            for (int i3 = 0; i3 < length3; i3++) {
                if (!zArr[i3]) {
                    sb.append(desc.charAt(i3));
                }
            }
            String string = sb.toString();
            int length4 = string.length() - 1;
            int i4 = 0;
            boolean z13 = false;
            while (i4 <= length4) {
                if (!z13) {
                    i2 = i4;
                } else {
                    i2 = length4;
                }
                if (Intrinsics.LJI(string.charAt(i2), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z13) {
                    if (!z11) {
                        z13 = true;
                    } else {
                        i4++;
                    }
                } else {
                    if (!z11) {
                        break;
                    }
                    length4--;
                }
            }
            return string.subSequence(i4, length4 + 1).toString();
        }
        List<TextExtraStruct> contentDescExtra = aweme.getContentDescExtra();
        if (contentDescExtra != null) {
            arrayList = new ArrayList();
            for (TextExtraStruct textExtraStruct2 : contentDescExtra) {
                if (textExtraStruct2 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    arrayList.add(textExtraStruct2);
                }
            }
        }
        String contentDesc2 = aweme.getContentDesc();
        HashMap map = new HashMap();
        if (arrayList != null && !arrayList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            if (contentDesc2 != null && contentDesc2.length() != 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z6) {
                IntRange intRange = new IntRange(0, contentDesc2.length() - 1);
                for (TextExtraStruct textExtraStruct3 : arrayList) {
                    int lineIndex = textExtraStruct3.getLineIndex();
                    if (lineIndex <= intRange.LLILLJJLI && lineIndex >= 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7 && textExtraStruct3.getStart() <= textExtraStruct3.getEnd()) {
                        if (!map.containsKey(Integer.valueOf(lineIndex))) {
                            map.put(Integer.valueOf(lineIndex), new ArrayList());
                        }
                        ArrayList arrayList2 = (ArrayList) map.get(Integer.valueOf(lineIndex));
                        if (arrayList2 != null) {
                            arrayList2.add(textExtraStruct3);
                        }
                    }
                }
            }
        }
        if (C123100dR.LIZ(aweme.getContentDesc())) {
            StringBuilder sb2 = new StringBuilder();
            try {
                try {
                    JSONArray jSONArray = new JSONArray(aweme.getContentDesc());
                    int length5 = jSONArray.length();
                    for (int i5 = 0; i5 < length5; i5++) {
                        String string2 = jSONArray.getString(i5);
                        if (string2.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (i5 < length5 - 1) {
                                sb2.append("\n");
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            List<TextExtraStruct> list = (List) map.get(Integer.valueOf(i5));
                            if (list == null) {
                                list = C13BV.INSTANCE;
                            }
                            boolean[] zArr2 = new boolean[string2.length()];
                            for (TextExtraStruct textExtraStruct4 : list) {
                                int end2 = textExtraStruct4.getEnd();
                                for (int start2 = textExtraStruct4.getStart(); start2 < end2; start2++) {
                                    zArr2[start2] = true;
                                }
                            }
                            int length6 = string2.length();
                            for (int i6 = 0; i6 < length6; i6++) {
                                if (!zArr2[i6]) {
                                    sb3.append(string2.charAt(i6));
                                }
                            }
                            String string3 = sb3.toString();
                            int length7 = string3.length() - 1;
                            int i7 = 0;
                            boolean z14 = false;
                            while (i7 <= length7) {
                                if (!z14) {
                                    i = i7;
                                } else {
                                    i = length7;
                                }
                                if (string3.charAt(i) != ' ') {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (!z14) {
                                    if (!z5) {
                                        z14 = true;
                                    } else {
                                        i7++;
                                    }
                                } else {
                                    if (!z5) {
                                        break;
                                    }
                                    length7--;
                                }
                            }
                            String string4 = string3.subSequence(i7, length7 + 1).toString();
                            if (string4.length() <= 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4 && !Intrinsics.LJFF(string4, "\n")) {
                                sb2.append(string4);
                                if (i5 < length5 - 1) {
                                    sb2.append("\n");
                                }
                            }
                        }
                    }
                    if (sb2.length() > 0) {
                        z12 = true;
                    }
                    if (!z12) {
                        return desc;
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (sb2.length() > 0) {
                        z12 = true;
                    }
                    if (!z12) {
                        return desc;
                    }
                }
                return sb2.toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                sb2.length();
                throw th;
            }
        }
        return desc;
    }

    public static final String LIZJ(Aweme aweme) {
        String descLanguage;
        if (aweme == null || (descLanguage = aweme.getDescLanguage()) == null) {
            return "";
        }
        return descLanguage;
    }

    public static final boolean LIZLLL(String str) {
        return C13LP.LJJJJ(str, C0SKG.LIZ.supportScenarios);
    }
}
