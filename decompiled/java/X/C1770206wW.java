package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.SpannableStringBuilder;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.edit.InstructionEditAssem;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.im.debug.api.IIMDebugService;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06wW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1770206wW extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770206wW(C1377105aD c1377105aD, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1377105aD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770206wW(C869590Y9l c869590Y9l, int i) {
        super(4);
        this.$t = i;
        this.l0 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1770206wW(InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1631630sYr<? super MediaModel, ? super Integer, ? super Bitmap, ? super Long, Unit> interfaceC1631630sYr2) {
        super(4);
        this.$t = interfaceC1631630sYr2;
        this.l0 = interfaceC1631630sYr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770206wW(BusinessCommandMessage businessCommandMessage, int i) {
        super(4);
        this.$t = i;
        this.l0 = businessCommandMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770206wW(InstructionEditAssem instructionEditAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = instructionEditAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770206wW(SingleTitleBarCenterAssem singleTitleBarCenterAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = singleTitleBarCenterAssem;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C1770206wW c1770206wW, Object obj, Object obj2, Object obj3, Object obj4) {
        String conversationId;
        SystemContent.Key key = (SystemContent.Key) obj;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        if (key.getAction() == 200002 || key.getAction() == 26) {
            IStreakService.LJJIIZ.getClass();
            IStreakService iStreakServiceLIZ = C06LY.LIZ();
            C869590Y9l c869590Y9l = (C869590Y9l) c1770206wW.l0;
            if (c869590Y9l == null || (conversationId = c869590Y9l.getConversationId()) == null) {
                conversationId = "";
            }
            C786410Ut5.q2(spannableStringBuilder, iStreakServiceLIZ.B(conversationId, key), iIntValue, iIntValue2, 33);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1770206wW c1770206wW, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z = true;
        if (((Boolean) obj3).booleanValue()) {
            C197039127h c197039127h = (C197039127h) ((InstructionEditAssem) c1770206wW.l0).LLJJJJJIL.getValue();
            if (c197039127h != null) {
                ((InstructionEditAssem) c1770206wW.l0).kp(c197039127h, true);
            }
        } else {
            C197039127h c197039127h2 = (C197039127h) ((InstructionEditAssem) c1770206wW.l0).LLJJJJJIL.getValue();
            if (c197039127h2 != null) {
                ((InstructionEditAssem) c1770206wW.l0).kp(c197039127h2, false);
            }
            String str = ((InstructionEditAssem) c1770206wW.l0).ip().getState().LLILLL;
            if (Intrinsics.LJFF(obj4, obj2) || (str != null && str.length() != 0)) {
                z = false;
            }
            C197039127h c197039127h3 = (C197039127h) ((InstructionEditAssem) c1770206wW.l0).LLJJJJJIL.getValue();
            if (c197039127h3 != null) {
                c197039127h3.setEnabled(z);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1770206wW c1770206wW, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ((SingleTitleBarCenterAssem) c1770206wW.l0).Tp((C894700Z8a) obj3, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1770206wW c1770206wW, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int iIntValue = ((Number) obj4).intValue();
        IIMDebugService.LIZ.getClass();
        IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
        if (iIMDebugService != null) {
            iIMDebugService.LJIIJ();
        }
        if (zBooleanValue) {
            Function1<C0Y7K, Unit> onResult = ((BusinessCommandMessage) c1770206wW.l0).getOnResult();
            if (onResult != null) {
                onResult.invoke(new C867580Y1s(null));
            }
        } else {
            Function1<C0Y7K, Unit> onResult2 = ((BusinessCommandMessage) c1770206wW.l0).getOnResult();
            if (onResult2 != null) {
                onResult2.invoke(new C0Y3A(EnumC868890Y6t.CUSTOM, (String) null, Integer.valueOf(iIntValue), 10));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1770206wW c1770206wW, Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        float f2;
        long j = ((C1378605aS) obj).LIZ;
        long j2 = ((C1378605aS) obj2).LIZ;
        float fFloatValue = ((Number) obj3).floatValue();
        ((Number) obj4).floatValue();
        C1377105aD c1377105aD = (C1377105aD) c1770206wW.l0;
        Bitmap bitmap = c1377105aD.LIZ;
        if (bitmap != null) {
            C1683130ttv c1683130ttvLIZ = c1377105aD.LIZ();
            if (((int) (((C1377105aD) c1770206wW.l0).LIZJ() >> 32)) != 0 && ((int) (((C1377105aD) c1770206wW.l0).LIZJ() & 4294967295L)) != 0) {
                float f3 = c1683130ttvLIZ.LIZJ - c1683130ttvLIZ.LIZ;
                if (f3 > 0.0f && c1683130ttvLIZ.LIZLLL - c1683130ttvLIZ.LIZIZ > 0.0f) {
                    float fMax = Math.max(f3 / bitmap.getWidth(), (c1683130ttvLIZ.LIZLLL - c1683130ttvLIZ.LIZIZ) / bitmap.getHeight());
                    float fLIZIZ = ((C13FI) ((C1377105aD) c1770206wW.l0).LIZIZ).LIZIZ();
                    float fLIZLLL = C13LZ.LIZLLL(fFloatValue * fLIZIZ, 0.3f, 5.0f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C13LZ.LIZLLL(Float.intBitsToFloat((int) (j & 4294967295L)), c1683130ttvLIZ.LIZIZ, c1683130ttvLIZ.LIZLLL))) & 4294967295L) | (((long) Float.floatToRawIntBits(C13LZ.LIZLLL(Float.intBitsToFloat((int) (j >> 32)), c1683130ttvLIZ.LIZ, c1683130ttvLIZ.LIZJ))) << 32);
                    float fLIZJ = ((int) (((C1377105aD) c1770206wW.l0).LIZJ() >> 32)) / 2.0f;
                    float fLIZJ2 = ((int) (((C1377105aD) c1770206wW.l0).LIZJ() & 4294967295L)) / 2.0f;
                    float f4 = fLIZIZ * fMax;
                    Matrix matrix = new Matrix();
                    C1377105aD c1377105aD2 = (C1377105aD) c1770206wW.l0;
                    matrix.postTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                    matrix.postTranslate(fLIZJ, fLIZJ2);
                    matrix.postScale(f4, f4, fLIZJ, fLIZJ2);
                    matrix.postTranslate(Float.intBitsToFloat((int) (c1377105aD2.LIZIZ() >> 32)), Float.intBitsToFloat((int) (c1377105aD2.LIZIZ() & 4294967295L)));
                    Matrix matrix2 = new Matrix();
                    if (matrix.invert(matrix2)) {
                        int i2 = (int) (jFloatToRawIntBits >> 32);
                        int i3 = (int) (jFloatToRawIntBits & 4294967295L);
                        float[] fArr = {Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)};
                        matrix2.mapPoints(fArr);
                        float f5 = fArr[0];
                        float f6 = fArr[1];
                        float f7 = fMax * fLIZLLL;
                        Matrix matrix3 = new Matrix();
                        matrix3.postTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                        matrix3.postTranslate(fLIZJ, fLIZJ2);
                        matrix3.postScale(f7, f7, fLIZJ, fLIZJ2);
                        float[] fArr2 = {f5, f6};
                        matrix3.mapPoints(fArr2);
                        long jLJI = C1378605aS.LJI((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) - fArr2[0])) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) - fArr2[1])) & 4294967295L), j2);
                        if (fLIZLLL >= 1.0f) {
                            long jLIZJ = ((C1377105aD) c1770206wW.l0).LIZJ();
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            int i4 = (int) (jLIZJ >> 32);
                            if (i4 != 0 && (i = (int) (jLIZJ & 4294967295L)) != 0) {
                                float f8 = c1683130ttvLIZ.LIZJ - c1683130ttvLIZ.LIZ;
                                if (f8 > 0.0f && c1683130ttvLIZ.LIZLLL - c1683130ttvLIZ.LIZIZ > 0.0f) {
                                    float f9 = width;
                                    float f10 = height;
                                    float fMax2 = Math.max(f8 / f9, f8 / f10);
                                    float f11 = f9 * fMax2 * fLIZLLL;
                                    float f12 = f10 * fMax2 * fLIZLLL;
                                    float fIntBitsToFloat = ((i4 / 2.0f) + Float.intBitsToFloat((int) (jLJI >> 32))) - (f11 / 2.0f);
                                    float fIntBitsToFloat2 = ((i / 2.0f) + Float.intBitsToFloat((int) (jLJI & 4294967295L))) - (f12 / 2.0f);
                                    float f13 = f11 + fIntBitsToFloat;
                                    float f14 = f12 + fIntBitsToFloat2;
                                    float f15 = c1683130ttvLIZ.LIZ;
                                    if (fIntBitsToFloat > f15) {
                                        f = f15 - fIntBitsToFloat;
                                    } else {
                                        float f16 = c1683130ttvLIZ.LIZJ;
                                        if (f13 < f16) {
                                            f = f16 - f13;
                                        } else {
                                            f = 0.0f;
                                        }
                                    }
                                    float f18 = c1683130ttvLIZ.LIZIZ;
                                    if (fIntBitsToFloat2 > f18) {
                                        f2 = f18 - fIntBitsToFloat2;
                                    } else {
                                        float f19 = c1683130ttvLIZ.LIZLLL;
                                        if (f14 < f19) {
                                            f2 = f19 - f14;
                                        } else {
                                            f2 = 0.0f;
                                        }
                                    }
                                    jLJI = C1378605aS.LJI(jLJI, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                                }
                            }
                        }
                        ((C13FI) ((C1377105aD) c1770206wW.l0).LIZIZ).LJIILJJIL(fLIZLLL);
                        ((C13FE) ((C1377105aD) c1770206wW.l0).LIZJ).setValue(new C1378605aS(jLJI));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(C1770206wW c1770206wW, Object obj, Object obj2, Object obj3, Object obj4) {
        ((InterfaceC1631630sYr) c1770206wW.l0).invoke(obj, Integer.valueOf(((Number) obj2).intValue()), obj3, Long.valueOf(((Number) obj4).longValue()));
        return Unit.LIZ;
    }
}
