package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SP1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SP1 {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"4u", "fyp", "foru", "foryou"});
    public static final C01GW<C0SP1> LIZIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS198S0000000_11.get$arr$(84));

    public C0SP1() {
        new LinkedHashSet();
    }

    public static Aweme LIZ(Aweme aweme, TextExtraStruct textExtraStruct) {
        List<TextExtraStruct> foldedTextExtra;
        CharSequence charSequenceLJJL;
        if (aweme == null || AwemeExtKt.getFoldedTextExtra(aweme) == null || (((foldedTextExtra = AwemeExtKt.getFoldedTextExtra(aweme)) != null && foldedTextExtra.isEmpty()) || textExtraStruct == null || textExtraStruct.getFoldedTagsPos() == null || textExtraStruct.getFoldedTagsPos().size() == 0)) {
            return aweme;
        }
        try {
            int foldedTagIndex = textExtraStruct.getFoldedTagIndex();
            if (foldedTagIndex >= 1) {
                List<TextExtraStruct> foldedTextExtra2 = AwemeExtKt.getFoldedTextExtra(aweme);
                if (foldedTextExtra2 != null) {
                    if (foldedTagIndex <= foldedTextExtra2.size()) {
                        ArrayList arrayList = new ArrayList();
                        List<TextExtraStruct> foldedTextExtra3 = AwemeExtKt.getFoldedTextExtra(aweme);
                        if (foldedTextExtra3 != null) {
                            int size = foldedTextExtra3.size();
                            int length = 0;
                            int end = 0;
                            for (int i = 0; i < size; i++) {
                                List<TextExtraStruct> foldedTextExtra4 = AwemeExtKt.getFoldedTextExtra(aweme);
                                if (foldedTextExtra4 != null) {
                                    TextExtraStruct textExtraStruct2 = foldedTextExtra4.get(i);
                                    if (textExtraStruct2.getType() == 101 && textExtraStruct2.getFoldedTagIndex() == foldedTagIndex) {
                                        StringBuffer stringBuffer = new StringBuffer();
                                        int size2 = textExtraStruct.getFoldedTagsPos().size();
                                        int length2 = 0;
                                        for (int i2 = 0; i2 < size2; i2++) {
                                            Integer num = textExtraStruct.getFoldedTagsPos().get(i2);
                                            if (aweme.getTextExtra() != null && num.intValue() >= 0 && num.intValue() < aweme.getTextExtra().size()) {
                                                TextExtraStruct textExtraStructM271clone = aweme.getTextExtra().get(num.intValue()).m271clone();
                                                textExtraStructM271clone.setEverFolded(true);
                                                StringBuffer stringBuffer2 = new StringBuffer();
                                                if (i2 == 0) {
                                                    stringBuffer2.append("#");
                                                    stringBuffer2.append(textExtraStructM271clone.getHashTagName());
                                                    textExtraStructM271clone.setStart(textExtraStruct2.getStart() + length2);
                                                } else if (end > 0) {
                                                    int start = textExtraStructM271clone.getStart() - end;
                                                    int i3 = 1;
                                                    if (1 <= start) {
                                                        while (true) {
                                                            stringBuffer2.append(" ");
                                                            if (i3 == start) {
                                                                break;
                                                            }
                                                            i3++;
                                                        }
                                                    }
                                                    stringBuffer2.append("#");
                                                    stringBuffer2.append(textExtraStructM271clone.getHashTagName());
                                                    textExtraStructM271clone.setStart(textExtraStruct2.getStart() + length2 + start);
                                                }
                                                textExtraStructM271clone.setEnd(textExtraStructM271clone.getStart() + textExtraStructM271clone.getHashTagName().length() + 1);
                                                arrayList.add(textExtraStructM271clone);
                                                stringBuffer.append(stringBuffer2);
                                                length2 += stringBuffer2.length();
                                                if (i2 == textExtraStruct.getFoldedTagsPos().size() - 1) {
                                                    length = stringBuffer.length() - 4;
                                                    CharSequence foldedHashTagDesc = AwemeExtKt.getFoldedHashTagDesc(aweme);
                                                    if (foldedHashTagDesc != null) {
                                                        charSequenceLJJL = a0.LJJL(foldedHashTagDesc, textExtraStruct2.getStart(), textExtraStruct2.getEnd(), stringBuffer);
                                                    } else {
                                                        charSequenceLJJL = null;
                                                    }
                                                    AwemeBizExtKt.setFoldedHashTagDesc(aweme, charSequenceLJJL);
                                                }
                                                end = textExtraStructM271clone.getEnd();
                                            }
                                        }
                                    } else {
                                        textExtraStruct2.setStart(textExtraStruct2.getStart() + length);
                                        textExtraStruct2.setEnd(textExtraStruct2.getEnd() + length);
                                        arrayList.add(textExtraStruct2);
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                            AwemeBizExtKt.setFoldedTextExtra(aweme, arrayList);
                            return aweme;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return aweme;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            C2276411E8h.LIZIZ.LIZIZ("common_feed", e);
            return aweme;
        }
    }
}
