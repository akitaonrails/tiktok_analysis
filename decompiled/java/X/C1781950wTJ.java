package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IFestivalService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.ss.android.vesdk.VEWatermarkParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781950wTJ {
    public static int LIZ;
    public static int LIZIZ;
    public static VEUtils.VEVideoFileInfo LIZJ;

    public static final boolean LIZJ(int i, int i2) {
        if (Math.abs((((double) i) / (((double) i2) * 1.0d)) - 1.7777777777777777d) < 0.001d) {
            return true;
        }
        return false;
    }

    public static final InterfaceC1781960wTK LIZIZ(final CreativeInfo creativeInfo, int i, final String str, int[] iArr) {
        if (i != 16 && i != 17) {
            return new C1847530yB5(iArr[0], iArr[1], i, creativeInfo, str);
        }
        final int i2 = iArr[0];
        final int i3 = iArr[1];
        return new InterfaceC1781960wTK(creativeInfo, str, i2, i3) { // from class: X.0yB3
            public final CreativeInfo LIZ;
            public final String LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final Map<String, String[]> LJ = new HashMap();

            @Override // X.InterfaceC1781960wTK
            public final String[] LIZJ(int i4) {
                return new String[0];
            }

            @Override // X.InterfaceC1781960wTK
            public final String[] LIZLLL(int i4) {
                return new String[0];
            }

            @Override // X.InterfaceC1781960wTK
            public final String[] LJ(int i4) {
                return new String[0];
            }

            @Override // X.InterfaceC1781960wTK
            public final String[] LJFF(String str2, InterfaceC2257101DWa interfaceC2257101DWa) {
                return new String[0];
            }

            @Override // X.InterfaceC1781960wTK
            public final String[] LJI(int i4, boolean z, List list) {
                return new String[0];
            }

            @Override // X.InterfaceC1781960wTK
            public final /* synthetic */ void LJII(String str2, InterfaceC2257101DWa interfaceC2257101DWa) {
            }

            @Override // X.InterfaceC1781960wTK
            public final C1781970wTL LJIIIIZZ() {
                int i4 = (int) (24 * (this.LIZJ / 1080.0f));
                C1781970wTL c1781970wTL = new C1781970wTL();
                c1781970wTL.xOffset = i4;
                c1781970wTL.yOffset = i4;
                c1781970wTL.position = VEWaterMarkPosition.BR;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WaterMarkPositionConfig xOffset:");
                sbLIZ.append(i4);
                sbLIZ.append(" yOffset:");
                sbLIZ.append(i4);
                sbLIZ.append(" videoWidth:");
                sbLIZ.append(this.LIZJ);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                return c1781970wTL;
            }

            @Override // X.InterfaceC1781960wTK
            public final void reset() {
                ((HashMap) this.LJ).clear();
            }

            @Override // X.InterfaceC1781960wTK
            public final CreativeInfo LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1781960wTK
            public final String[] LIZIZ(boolean z, InterfaceC2257101DWa interfaceC2257101DWa) {
                String uniqueId;
                boolean z2;
                int i4;
                String uniqueId2;
                String str2;
                if (TextUtils.isEmpty(interfaceC2257101DWa.getUniqueId())) {
                    uniqueId = interfaceC2257101DWa.getShortId();
                } else {
                    uniqueId = interfaceC2257101DWa.getUniqueId();
                }
                if (uniqueId == null) {
                    uniqueId = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uniqueId);
                sbLIZ.append(z);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String[] strArr = (String[]) ((HashMap) this.LJ).get(strLIZIZ);
                int i5 = 0;
                if (strArr != null && strArr.length != 0) {
                    return strArr;
                }
                String strLIZJ = C08HM.LIZJ(this.LIZIZ);
                if (TextUtils.isEmpty(uniqueId)) {
                    C201955140j.LJI("provideWaterMarks error", new IllegalArgumentException("userId is empty"));
                    return null;
                }
                C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LIZLLL(this.LIZ));
                if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i6 = this.LIZJ;
                if (i6 == 0 || (i4 = this.LIZLLL) == 0) {
                    return null;
                }
                if (!z2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("provide error ");
                    sbLIZ2.append(z2);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(this.LIZJ);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(this.LIZLLL);
                    C201955140j.LJI("provideWaterMarks error", new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
                    return null;
                }
                CreativeInfo creativeInfo2 = this.LIZ;
                new C1847560yB8();
                ((IFestivalService) ServiceManager.get().getService(IFestivalService.class)).LJ();
                C1847520yB4 c1847520yB4 = C1847520yB4.LIZ;
                if (TextUtils.isEmpty(interfaceC2257101DWa.getUniqueId())) {
                    uniqueId2 = interfaceC2257101DWa.getShortId();
                } else {
                    uniqueId2 = interfaceC2257101DWa.getUniqueId();
                }
                c1847520yB4.getClass();
                TypedArray typedArrayObtainTypedArray = C0CHQ.LIZ.getResources().obtainTypedArray(R.array.b_);
                int length = typedArrayObtainTypedArray.length();
                ArrayList arrayList = new ArrayList();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('@');
                sbLIZ3.append(uniqueId2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                int i7 = 0;
                while (i7 < length) {
                    C438740HIi c438740HIi = new C438740HIi();
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i7, i5);
                    Resources resources = C0CHQ.LIZ.getResources();
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, resourceId, null);
                    float fMin = Math.min(i6 / 1440.0f, i4 / 1440.0f);
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, (int) (455 * fMin), (int) (94 * fMin), true);
                    if (TextUtils.isEmpty(strLIZIZ2)) {
                        c438740HIi.LIZ = bitmapCreateScaledBitmap;
                    } else {
                        TextPaint textPaint = new TextPaint();
                        textPaint.setAntiAlias(true);
                        textPaint.setTypeface(C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
                        textPaint.setColor(resources.getColor(R.color.f569bc));
                        textPaint.setTextSize(56 * fMin);
                        textPaint.setTextAlign(Paint.Align.LEFT);
                        float f = 10 * fMin;
                        textPaint.setShadowLayer(f, 0.0f, 0.0f, resources.getColor(R.color.i5));
                        int iMax = Math.max(bitmapCreateScaledBitmap.getWidth(), ((int) (20 * fMin)) + ((int) Math.ceil(4 * fMin)) + ((int) (textPaint.measureText(strLIZIZ2) + (5.0f * fMin))));
                        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, (int) (bitmapCreateScaledBitmap.getHeight() + (1 * fMin) + (fontMetrics.bottom - fontMetrics.top)), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setShadowLayer(f, 0.0f, 0.0f, resources.getColor(R.color.i5));
                        canvas.drawBitmap(bitmapCreateScaledBitmap, (iMax - bitmapCreateScaledBitmap.getWidth()) + 3, 0.0f, paint);
                        canvas.drawText(strLIZIZ2, iMax - r12, (bitmapCreateScaledBitmap.getHeight() - fontMetrics.top) - (C12ES.LIZJ(4.0f, C0CHQ.LIZ) * fMin), textPaint);
                        c438740HIi.LIZ = bitmapCreateBitmap;
                    }
                    arrayList.add(c438740HIi);
                    i7++;
                    i5 = 0;
                }
                typedArrayObtainTypedArray.recycle();
                C438740HIi[] c438740HIiArr = (C438740HIi[]) arrayList.toArray(new C438740HIi[i5]);
                C1847520yB4 c1847520yB42 = C1847520yB4.LIZ;
                String strLIZLLL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LIZLLL(creativeInfo2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZJ);
                if (z) {
                    str2 = "_leftalign";
                } else {
                    str2 = "_rightalign";
                }
                sbLIZ4.append(str2);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                c1847520yB42.getClass();
                String[] strArrLIZIZ = C1847520yB4.LIZIZ(c438740HIiArr, strLIZLLL, strLIZIZ3);
                ((HashMap) this.LJ).put(strLIZIZ, strArrLIZIZ);
                return strArrLIZIZ;
            }

            @Override // X.InterfaceC1781960wTK
            public final void LJIIIZ(boolean z, InterfaceC2257101DWa interfaceC2257101DWa) {
                LIZIZ(false, interfaceC2257101DWa);
            }

            {
                this.LIZ = creativeInfo;
                this.LIZIZ = str;
                this.LIZJ = i2;
                this.LIZLLL = i3;
            }
        };
    }

    public static void LIZLLL(int i, int i2, VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity, VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity2) {
        int i3;
        int i4;
        double d;
        VEUtils.VEVideoFileInfo vEVideoFileInfo = LIZJ;
        if (vEVideoFileInfo != null) {
            i3 = vEVideoFileInfo.height;
            i4 = vEVideoFileInfo.width;
        } else {
            i3 = i;
            i4 = i2;
        }
        if (((double) i4) / (((double) i3) * 1.0d) < 0.8d) {
            if (i > i2) {
                d = i2;
            } else {
                d = i;
            }
            vEWatermarkEntity.yOffset = (i - vEWatermarkEntity.height) / 2;
            vEWatermarkEntity2.yOffset = (int) (((((double) i) - (((double) i2) * 1.25d)) / 2.0d) + (((double) 10) * (d / 750.0d)));
        }
    }

    public static final VEWatermarkParam LIZ(InterfaceC1781960wTK interfaceC1781960wTK, InterfaceC2257101DWa interfaceC2257101DWa, int[] iArr, boolean z, String str, boolean z2, String str2, int i, boolean z3, boolean z4, List<String> list) {
        float f;
        int i2;
        int i3;
        int i4;
        double d;
        String[] strArrLIZLLL;
        String[] strArrLJ;
        String[] strArrLJI;
        String[] strArrLJFF;
        double d2;
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity;
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity2;
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity3;
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity4;
        VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity5;
        int i5;
        if (interfaceC1781960wTK instanceof C1847530yB5) {
            String[] strArrLIZIZ = interfaceC1781960wTK.LIZIZ(true, interfaceC2257101DWa);
            String[] strArrLIZIZ2 = interfaceC1781960wTK.LIZIZ(false, interfaceC2257101DWa);
            String[] strArrLIZJ = interfaceC1781960wTK.LIZJ(i);
            if (z3) {
                strArrLIZLLL = interfaceC1781960wTK.LIZLLL(i);
            } else {
                strArrLIZLLL = null;
            }
            if (z4) {
                strArrLJ = interfaceC1781960wTK.LJ(i);
            } else {
                strArrLJ = null;
            }
            if (!list.isEmpty()) {
                strArrLJI = interfaceC1781960wTK.LJI(i, false, list);
            } else {
                strArrLJI = null;
            }
            if (strArrLIZJ != null && strArrLIZJ.length != 0) {
                strArrLJFF = null;
            } else {
                strArrLJFF = interfaceC1781960wTK.LJFF(str2, interfaceC2257101DWa);
            }
            C1781970wTL c1781970wTLLJIIIIZZ = interfaceC1781960wTK.LJIIIIZZ();
            CreativeInfo creativeInfoLIZ = interfaceC1781960wTK.LIZ();
            if (strArrLIZIZ != null && strArrLIZIZ.length != 0 && c1781970wTLLJIIIIZZ != null) {
                VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
                int i6 = iArr[0];
                int i7 = iArr[1];
                if (i7 > i6) {
                    d2 = i6;
                } else {
                    d2 = i7;
                }
                int i8 = (int) ((d2 / 750.0d) * ((double) 10));
                int[] iArrLIZ = C534390KxZ.LIZ(strArrLIZIZ[0]);
                int i9 = iArrLIZ[0];
                int i10 = iArrLIZ[1];
                VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity6 = new VEWatermarkParam.VEWatermarkEntity();
                vEWatermarkEntity6.images = strArrLIZIZ;
                vEWatermarkEntity6.interval = 2;
                vEWatermarkEntity6.width = i9;
                vEWatermarkEntity6.height = i10;
                vEWatermarkEntity6.xOffset = i8;
                vEWatermarkEntity6.yOffset = LIZIZ + i8;
                VEWaterMarkPosition vEWaterMarkPosition = VEWaterMarkPosition.TL;
                vEWatermarkEntity6.position = vEWaterMarkPosition;
                int i11 = LIZ;
                if (i11 != 0 && !z) {
                    vEWatermarkEntity6.sequenceIn = 0L;
                    vEWatermarkEntity6.sequenceOut = (long) (((double) i11) / 2.0d);
                } else {
                    vEWatermarkEntity6.sequenceIn = -1L;
                    vEWatermarkEntity6.sequenceOut = -1L;
                }
                VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity7 = new VEWatermarkParam.VEWatermarkEntity();
                vEWatermarkEntity7.images = strArrLIZIZ2;
                vEWatermarkEntity7.interval = 2;
                vEWatermarkEntity7.width = i9;
                vEWatermarkEntity7.height = i10;
                vEWatermarkEntity7.xOffset = i8;
                vEWatermarkEntity7.yOffset = i8 + LIZIZ;
                VEWaterMarkPosition vEWaterMarkPosition2 = VEWaterMarkPosition.BR;
                vEWatermarkEntity7.position = vEWaterMarkPosition2;
                int i12 = LIZ;
                if (i12 != 0 && !z) {
                    vEWatermarkEntity7.sequenceIn = (long) ((((double) i12) / 2.0d) + ((double) 1));
                    vEWatermarkEntity7.sequenceOut = i12;
                } else {
                    vEWatermarkEntity7.sequenceIn = -1L;
                    vEWatermarkEntity7.sequenceOut = -1L;
                }
                if (strArrLIZJ != null && strArrLIZJ.length != 0) {
                    int[] iArrLIZ2 = C534390KxZ.LIZ(strArrLIZJ[0]);
                    vEWatermarkEntity = new VEWatermarkParam.VEWatermarkEntity();
                    vEWatermarkEntity.images = strArrLIZJ;
                    vEWatermarkEntity.interval = 2;
                    vEWatermarkEntity.width = iArrLIZ2[0];
                    vEWatermarkEntity.height = iArrLIZ2[1];
                    vEWatermarkEntity.xOffset = 0;
                    vEWatermarkEntity.yOffset = 0;
                    vEWatermarkEntity.position = VEWaterMarkPosition.BL;
                    int i13 = LIZ;
                    if (i13 != 0 && !z) {
                        vEWatermarkEntity.sequenceIn = 0L;
                        vEWatermarkEntity.sequenceOut = i13;
                    } else {
                        vEWatermarkEntity.sequenceIn = 0L;
                        vEWatermarkEntity.sequenceOut = 2147483647L;
                    }
                } else {
                    vEWatermarkEntity = null;
                }
                if (strArrLIZLLL != null && strArrLIZLLL.length != 0) {
                    int[] iArrLIZ3 = C534390KxZ.LIZ(strArrLIZLLL[0]);
                    vEWatermarkEntity2 = new VEWatermarkParam.VEWatermarkEntity();
                    vEWatermarkEntity2.images = strArrLIZLLL;
                    vEWatermarkEntity2.interval = 2;
                    vEWatermarkEntity2.width = iArrLIZ3[0];
                    vEWatermarkEntity2.height = iArrLIZ3[1];
                    vEWatermarkEntity2.xOffset = 0;
                    vEWatermarkEntity2.yOffset = 0;
                    vEWatermarkEntity2.position = vEWaterMarkPosition2;
                    int i14 = LIZ;
                    if (i14 != 0 && !z) {
                        vEWatermarkEntity2.sequenceIn = 0L;
                        vEWatermarkEntity2.sequenceOut = i14;
                    } else {
                        vEWatermarkEntity2.sequenceIn = 0L;
                        vEWatermarkEntity2.sequenceOut = 2147483647L;
                    }
                } else {
                    vEWatermarkEntity2 = null;
                }
                if (strArrLJ != null && strArrLJ.length != 0) {
                    int[] iArrLIZ4 = C534390KxZ.LIZ(strArrLJ[0]);
                    vEWatermarkEntity3 = new VEWatermarkParam.VEWatermarkEntity();
                    vEWatermarkEntity3.images = strArrLJ;
                    vEWatermarkEntity3.interval = 2;
                    vEWatermarkEntity3.width = iArrLIZ4[0];
                    vEWatermarkEntity3.height = iArrLIZ4[1];
                    vEWatermarkEntity3.xOffset = 0;
                    vEWatermarkEntity3.yOffset = 0;
                    vEWatermarkEntity3.position = vEWaterMarkPosition;
                    int i15 = LIZ;
                    if (i15 != 0 && !z) {
                        vEWatermarkEntity3.sequenceIn = 0L;
                        vEWatermarkEntity3.sequenceOut = i15;
                    } else {
                        vEWatermarkEntity3.sequenceIn = 0L;
                        vEWatermarkEntity3.sequenceOut = 2147483647L;
                    }
                } else {
                    vEWatermarkEntity3 = null;
                }
                if (strArrLJI != null && strArrLJI.length != 0) {
                    int[] iArrLIZ5 = C534390KxZ.LIZ(strArrLJI[0]);
                    vEWatermarkEntity4 = new VEWatermarkParam.VEWatermarkEntity();
                    vEWatermarkEntity4.images = strArrLJI;
                    vEWatermarkEntity4.interval = 2;
                    vEWatermarkEntity4.width = iArrLIZ5[0];
                    vEWatermarkEntity4.height = iArrLIZ5[1];
                    vEWatermarkEntity4.xOffset = 0;
                    vEWatermarkEntity4.yOffset = 0;
                    vEWatermarkEntity4.position = vEWaterMarkPosition;
                    int i16 = LIZ;
                    if (i16 != 0 && !z) {
                        vEWatermarkEntity4.sequenceIn = 0L;
                        vEWatermarkEntity4.sequenceOut = i16;
                    } else {
                        vEWatermarkEntity4.sequenceIn = 0L;
                        vEWatermarkEntity4.sequenceOut = 2147483647L;
                    }
                } else {
                    vEWatermarkEntity4 = null;
                }
                if (strArrLJFF != null && strArrLJFF.length != 0) {
                    int[] iArrLIZ6 = C534390KxZ.LIZ(strArrLJFF[0]);
                    vEWatermarkEntity5 = new VEWatermarkParam.VEWatermarkEntity();
                    vEWatermarkEntity5.images = strArrLJFF;
                    vEWatermarkEntity5.interval = 2;
                    vEWatermarkEntity5.width = iArrLIZ6[0];
                    vEWatermarkEntity5.height = iArrLIZ6[1];
                    vEWatermarkEntity5.xOffset = 0;
                    vEWatermarkEntity5.yOffset = 0;
                    vEWatermarkEntity5.position = VEWaterMarkPosition.BL;
                    int i17 = LIZ;
                    if (i17 != 0 && !z) {
                        vEWatermarkEntity5.sequenceIn = 0L;
                        vEWatermarkEntity5.sequenceOut = i17;
                    } else {
                        vEWatermarkEntity5.sequenceIn = 0L;
                        vEWatermarkEntity5.sequenceOut = 2147483647L;
                    }
                } else {
                    vEWatermarkEntity5 = null;
                }
                LIZLLL(i7, i6, vEWatermarkEntity6, vEWatermarkEntity7);
                List listLJIILJJIL = C1697810uHb.LJIILJJIL(vEWatermarkEntity6, vEWatermarkEntity7);
                if (vEWatermarkEntity5 != null) {
                    listLJIILJJIL.add(vEWatermarkEntity5);
                }
                if (vEWatermarkEntity != null) {
                    listLJIILJJIL.add(vEWatermarkEntity);
                }
                if (vEWatermarkEntity2 != null) {
                    listLJIILJJIL.add(vEWatermarkEntity2);
                }
                if (vEWatermarkEntity3 != null) {
                    listLJIILJJIL.add(vEWatermarkEntity3);
                }
                if (vEWatermarkEntity4 != null) {
                    listLJIILJJIL.add(vEWatermarkEntity4);
                }
                vEWatermarkParam.setEntities((VEWatermarkParam.VEWatermarkEntity[]) listLJIILJJIL.toArray(new VEWatermarkParam.VEWatermarkEntity[0]));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WaterMarkPositionConfig2 config.xOffset:");
                sbLIZ.append(c1781970wTLLJIIIIZZ.xOffset);
                sbLIZ.append(" config.yOffset:");
                sbLIZ.append(c1781970wTLLJIIIIZZ.yOffset);
                sbLIZ.append("xOffset:");
                sbLIZ.append(vEWatermarkParam.xOffset);
                sbLIZ.append(" yOffset:");
                sbLIZ.append(vEWatermarkParam.yOffset);
                sbLIZ.append(" position:");
                sbLIZ.append(vEWatermarkParam.position);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (z && str.length() > 0) {
                    vEWatermarkParam.needExtFile = true;
                    vEWatermarkParam.extFile = str;
                }
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("enable_water_bg_mask", false) && !z2) {
                    VEWatermarkParam.VEWatermarkMask vEWatermarkMask = new VEWatermarkParam.VEWatermarkMask();
                    vEWatermarkMask.maskImage = C2235708pP.LIZ(creativeInfoLIZ, !LIZJ(i7, i6));
                    vEWatermarkMask.xOffset = 0;
                    vEWatermarkMask.yOffset = 0;
                    vEWatermarkMask.width = i6;
                    vEWatermarkMask.height = i7;
                    if (LIZJ(i7, i6)) {
                        vEWatermarkMask.yOffset += (((int) (((double) i6) * 1.7777777777777777d)) - i7) / 2;
                    }
                    vEWatermarkParam.mask = vEWatermarkMask;
                    i5 = 0;
                } else {
                    i5 = 0;
                }
                LIZ = i5;
                LIZIZ = i5;
                LIZJ = null;
                return vEWatermarkParam;
            }
        } else if (interfaceC1781960wTK instanceof C1847510yB3) {
            String[] strArrLIZIZ3 = interfaceC1781960wTK.LIZIZ(true, interfaceC2257101DWa);
            C1781970wTL c1781970wTLLJIIIIZZ2 = interfaceC1781960wTK.LJIIIIZZ();
            CreativeInfo creativeInfoLIZ2 = interfaceC1781960wTK.LIZ();
            if (strArrLIZIZ3 != null && strArrLIZIZ3.length != 0 && c1781970wTLLJIIIIZZ2 != null) {
                VEWatermarkParam vEWatermarkParam2 = new VEWatermarkParam();
                int i18 = iArr[0];
                int i19 = iArr[1];
                if (i19 > i18) {
                    f = i18;
                } else {
                    f = i19;
                }
                int i20 = (int) ((f / 1440.0f) * 40);
                int[] iArrLIZ7 = C534390KxZ.LIZ(strArrLIZIZ3[0]);
                int i21 = iArrLIZ7[0];
                int i22 = iArrLIZ7[1];
                VEWatermarkParam.VEWatermarkEntity vEWatermarkEntity8 = new VEWatermarkParam.VEWatermarkEntity();
                vEWatermarkEntity8.images = strArrLIZIZ3;
                vEWatermarkEntity8.interval = 2;
                vEWatermarkEntity8.width = i21;
                vEWatermarkEntity8.height = i22;
                vEWatermarkEntity8.xOffset = i20;
                vEWatermarkEntity8.yOffset = i20;
                vEWatermarkEntity8.position = VEWaterMarkPosition.BR;
                int i23 = LIZ;
                if (i23 != 0 && !z) {
                    vEWatermarkEntity8.sequenceIn = 0L;
                    vEWatermarkEntity8.sequenceOut = i23;
                } else {
                    vEWatermarkEntity8.sequenceIn = -1L;
                    vEWatermarkEntity8.sequenceOut = -1L;
                }
                if (z2) {
                    VEUtils.VEVideoFileInfo vEVideoFileInfo = LIZJ;
                    if (vEVideoFileInfo != null) {
                        i4 = vEVideoFileInfo.height;
                        i3 = vEVideoFileInfo.width;
                    } else {
                        i3 = i18;
                        i4 = i19;
                    }
                    if (((double) i3) / (((double) i4) * 1.0d) < 0.8d) {
                        if (i19 > i18) {
                            d = i18;
                        } else {
                            d = i19;
                        }
                        vEWatermarkEntity8.yOffset = (int) (((((double) i19) - (((double) i18) * 1.25d)) / 2.0d) - (((double) 10) * (d / 750.0d)));
                    }
                }
                vEWatermarkParam2.setEntities(new VEWatermarkParam.VEWatermarkEntity[]{vEWatermarkEntity8});
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("NowWaterMarkPositionConfig config.xOffset:");
                sbLIZ2.append(c1781970wTLLJIIIIZZ2.xOffset);
                sbLIZ2.append(" config.yOffset:");
                sbLIZ2.append(c1781970wTLLJIIIIZZ2.yOffset);
                sbLIZ2.append("xOffset:");
                sbLIZ2.append(vEWatermarkParam2.xOffset);
                sbLIZ2.append(" yOffset:");
                sbLIZ2.append(vEWatermarkParam2.yOffset);
                sbLIZ2.append(" position:");
                sbLIZ2.append(vEWatermarkParam2.position);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (z && str.length() > 0) {
                    vEWatermarkParam2.needExtFile = true;
                    vEWatermarkParam2.extFile = str;
                }
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("enable_water_bg_mask", false) && !z2) {
                    VEWatermarkParam.VEWatermarkMask vEWatermarkMask2 = new VEWatermarkParam.VEWatermarkMask();
                    vEWatermarkMask2.maskImage = C2235708pP.LIZ(creativeInfoLIZ2, !LIZJ(i19, i18));
                    vEWatermarkMask2.xOffset = 0;
                    vEWatermarkMask2.yOffset = 0;
                    vEWatermarkMask2.width = i18;
                    vEWatermarkMask2.height = i19;
                    if (LIZJ(i19, i18)) {
                        vEWatermarkMask2.yOffset += (((int) (((double) i18) * 1.7777777777777777d)) - i19) / 2;
                    }
                    vEWatermarkParam2.mask = vEWatermarkMask2;
                    i2 = 0;
                } else {
                    i2 = 0;
                }
                LIZ = i2;
                LIZIZ = i2;
                LIZJ = null;
                return vEWatermarkParam2;
            }
        }
        return null;
    }
}
