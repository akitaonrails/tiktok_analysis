package X;

import android.app.Activity;
import android.text.Spannable;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.lexical.platform.span.AiCopyWritingSpan;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858090XlP {
    public static Map LIZ(final boolean z) {
        C858080XlO c858080XlO = new C858080XlO();
        c858080XlO.LIZ(C13LE.LIZ(C858370Xlr.class), new InterfaceC858600XmE<C858370Xlr>() { // from class: X.0XlN
            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(InterfaceC858060XlM interfaceC858060XlM, C858370Xlr c858370Xlr) {
                interfaceC858060XlM.LIZIZ();
                return C858520Xm6.LIZIZ("");
            }
        });
        c858080XlO.LIZ(C13LE.LIZ(C858350Xlp.class), new InterfaceC858600XmE<C858350Xlp>() { // from class: X.0XlL
            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(InterfaceC858060XlM interfaceC858060XlM, C858350Xlp c858350Xlp) {
                interfaceC858060XlM.LIZIZ();
                String strLJIILJJIL = c858350Xlp.LJIILJJIL();
                if (interfaceC858060XlM.getFrom() == EnumC858020XlI.PUBLISH_PREVIEW) {
                    return C858520Xm6.LIZIZ(u.LJJIFFI(strLJIILJJIL, "\n", " ", false));
                }
                if (interfaceC858060XlM.getFrom() == EnumC858020XlI.IMAGE_PUBLISH_PREVIEW) {
                    return C858520Xm6.LIZIZ(new Regex("\n+").replace(strLJIILJJIL, "\n"));
                }
                return C858520Xm6.LIZIZ(strLJIILJJIL);
            }
        });
        c858080XlO.LIZ(C13LE.LIZ(C858540Xm8.class), new InterfaceC858600XmE<C858540Xm8>() { // from class: X.0XlU
            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(InterfaceC858060XlM interfaceC858060XlM, C858540Xm8 c858540Xm8) {
                Spannable spannableLIZIZ;
                C858540Xm8 c858540Xm82 = c858540Xm8;
                Activity activityLIZLLL = interfaceC858060XlM.LIZLLL();
                String strLJIILJJIL = c858540Xm82.LJIILJJIL();
                C858520Xm6 c858520Xm6LIZIZ = interfaceC858060XlM.LIZIZ();
                if (strLJIILJJIL.length() > 71) {
                    String string = activityLIZLLL.getString(2131835470, 70);
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(string);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(activityLIZLLL, 4010, creativeToastBuilder);
                    spannableLIZIZ = C858520Xm6.LIZIZ(strLJIILJJIL.subSequence(0, 71));
                } else {
                    spannableLIZIZ = C858520Xm6.LIZIZ(strLJIILJJIL);
                }
                C786410Ut5.o2(spannableLIZIZ, c858520Xm6LIZIZ.LIZ(activityLIZLLL, c858540Xm82), 0, spannableLIZIZ.length(), 33);
                return spannableLIZIZ;
            }
        });
        c858080XlO.LIZ(C13LE.LIZ(C858470Xm1.class), new InterfaceC858600XmE<C858470Xm1>() { // from class: X.0XlW
            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(final InterfaceC858060XlM interfaceC858060XlM, C858470Xm1 c858470Xm1) {
                C858470Xm1 c858470Xm12 = c858470Xm1;
                String strLJIILJJIL = c858470Xm12.LJIILJJIL();
                C858520Xm6 c858520Xm6LIZIZ = interfaceC858060XlM.LIZIZ();
                Spannable spannableLIZIZ = C858520Xm6.LIZIZ(strLJIILJJIL);
                int length = spannableLIZIZ.length();
                C786410Ut5.o2(spannableLIZIZ, c858520Xm6LIZIZ.LIZ(interfaceC858060XlM.LIZLLL(), c858470Xm12), 0, length, 33);
                int i = C858170XlX.LIZ[c858470Xm12.LJIIJJI.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C0GZ8 c0gz8 = new C0GZ8(interfaceC858060XlM.LIZLLL(), new C0GZ7() { // from class: X.0Xla
                            @Override // X.C0GZ7
                            public final void LIZ() {
                            }

                            @Override // X.C0GZ7
                            public final int getMaxWidth() {
                                return interfaceC858060XlM.getMaxWidth();
                            }
                        });
                        c0gz8.LLJILJILJ = Integer.valueOf(R.raw.icon_comment_fill);
                        C786410Ut5.o2(spannableLIZIZ, c0gz8, 0, length, 33);
                    } else {
                        throw new C1954807lC();
                    }
                }
                interfaceC858060XlM.LIZJ().LIZ(c858470Xm12.LJIIJJI);
                return spannableLIZIZ;
            }
        });
        c858080XlO.LIZ(C13LE.LIZ(C858590XmD.class), new InterfaceC858600XmE<C858590XmD>(z) { // from class: X.0Xld
            public final boolean LIZ;

            {
                this.LIZ = z;
            }

            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(InterfaceC858060XlM interfaceC858060XlM, C858590XmD c858590XmD) {
                AiCopyWritingSpan aiCopyWritingSpan;
                C858590XmD c858590XmD2 = c858590XmD;
                String str = c858590XmD2.LJIIIZ;
                interfaceC858060XlM.LIZIZ();
                Spannable spannableLIZIZ = C858520Xm6.LIZIZ(str);
                int length = spannableLIZIZ.length();
                Activity activityLIZLLL = interfaceC858060XlM.LIZLLL();
                String str2 = c858590XmD2.LJIIIZ;
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) C13LP.LJJJLL(c858590XmD2.LJI());
                int i = 6553;
                int iIntValue = -1;
                if (Intrinsics.LJFF(c858590XmD2.LJFF(), "ap")) {
                    if (this.LIZ) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, activityLIZLLL);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                    } else {
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ei, activityLIZLLL);
                        if (numLIZJ2 != null) {
                            iIntValue = numLIZJ2.intValue();
                        }
                    }
                    if (aVTextExtraStruct != null) {
                        i = aVTextExtraStruct.type;
                    }
                    aiCopyWritingSpan = new AiCopyWritingSpan(iIntValue, str2, i);
                    aiCopyWritingSpan.subType = 521;
                    aiCopyWritingSpan.mStruct.setSubType(521);
                } else {
                    if (this.LIZ) {
                        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, activityLIZLLL);
                        if (numLIZJ3 != null) {
                            iIntValue = numLIZJ3.intValue();
                        }
                    } else {
                        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ee, activityLIZLLL);
                        if (numLIZJ4 != null) {
                            iIntValue = numLIZJ4.intValue();
                        }
                    }
                    if (aVTextExtraStruct != null) {
                        i = aVTextExtraStruct.type;
                    }
                    aiCopyWritingSpan = new AiCopyWritingSpan(iIntValue, str2, i);
                    aiCopyWritingSpan.subType = 520;
                    aiCopyWritingSpan.mStruct.setSubType(520);
                }
                C786410Ut5.o2(spannableLIZIZ, aiCopyWritingSpan, 0, length, 33);
                return spannableLIZIZ;
            }
        });
        c858080XlO.LIZ(C13LE.LIZ(C858500Xm4.class), new InterfaceC858600XmE<C858500Xm4>() { // from class: X.0XlV
            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(final InterfaceC858060XlM interfaceC858060XlM, C858500Xm4 c858500Xm4) {
                C858500Xm4 c858500Xm42 = c858500Xm4;
                String strLJIILJJIL = c858500Xm42.LJIILJJIL();
                C858520Xm6 c858520Xm6LIZIZ = interfaceC858060XlM.LIZIZ();
                Spannable spannableLIZIZ = C858520Xm6.LIZIZ(strLJIILJJIL);
                int length = spannableLIZIZ.length();
                Activity activityLIZLLL = interfaceC858060XlM.LIZLLL();
                C786410Ut5.o2(spannableLIZIZ, c858520Xm6LIZIZ.LIZ(activityLIZLLL, c858500Xm42), 0, length, 33);
                C786410Ut5.o2(spannableLIZIZ, new C0GZ6(activityLIZLLL, new C0GZ7() { // from class: X.0Xlb
                    @Override // X.C0GZ7
                    public final void LIZ() {
                    }

                    @Override // X.C0GZ7
                    public final int getMaxWidth() {
                        return interfaceC858060XlM.getMaxWidth();
                    }
                }), 0, length, 33);
                interfaceC858060XlM.LIZJ().LIZ(EnumC858180XlY.VIDEO);
                return spannableLIZIZ;
            }
        });
        c858080XlO.LIZ(C13LE.LIZ(C858410Xlv.class), new InterfaceC858600XmE<C858410Xlv>() { // from class: X.0XlQ
            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(InterfaceC858060XlM interfaceC858060XlM, C858410Xlv c858410Xlv) {
                return c858410Xlv.LJJ(interfaceC858060XlM);
            }
        });
        c858080XlO.LIZ(C13LE.LIZ(C858420Xlw.class), new InterfaceC858600XmE<C858420Xlw>() { // from class: X.0XlS
            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(InterfaceC858060XlM interfaceC858060XlM, C858420Xlw c858420Xlw) {
                return c858420Xlw.LJJ(interfaceC858060XlM);
            }
        });
        c858080XlO.LIZ(C13LE.LIZ(C858400Xlu.class), new InterfaceC858600XmE<C858400Xlu>() { // from class: X.0XlR
            @Override // X.InterfaceC858600XmE
            public final Spannable LIZ(InterfaceC858060XlM interfaceC858060XlM, C858400Xlu c858400Xlu) {
                return c858400Xlu.LJJ(interfaceC858060XlM);
            }
        });
        return c858080XlO.LIZ;
    }
}
