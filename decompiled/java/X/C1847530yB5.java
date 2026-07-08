package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.vesdk.VEWaterMarkPosition;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0yB5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847530yB5 implements InterfaceC1781960wTK {
    public static final /* synthetic */ int LJI = 0;
    public final CreativeInfo LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final Map<String, String[]> LJFF = new HashMap();

    @Override // X.InterfaceC1781960wTK
    public final C1781970wTL LJIIIIZZ() {
        int i = (int) (24 * (this.LIZJ / 1080.0f));
        C1781970wTL c1781970wTL = new C1781970wTL();
        c1781970wTL.xOffset = i;
        c1781970wTL.yOffset = i;
        c1781970wTL.position = VEWaterMarkPosition.TL_BR;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaterMarkPositionConfig xOffset:");
        sbLIZ.append(i);
        sbLIZ.append(" yOffset:");
        sbLIZ.append(i);
        sbLIZ.append(" videoWidth:");
        sbLIZ.append(this.LIZJ);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return c1781970wTL;
    }

    @Override // X.InterfaceC1781960wTK
    public final void reset() {
        ((HashMap) this.LJFF).clear();
    }

    @Override // X.InterfaceC1781960wTK
    public final CreativeInfo LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1781960wTK
    public final String[] LIZJ(int i) {
        boolean z;
        int i2;
        if (!((Boolean) C277840Auk.LIZ.getValue()).booleanValue() || i == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aigc_watermark");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(i);
        sbLIZ.append(((Number) C277880Auo.LIZ.getValue()).intValue());
        sbLIZ.append(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String[] strArr = (String[]) ((HashMap) this.LJFF).get(strLIZIZ);
        if (strArr != null && strArr.length > 0) {
            return strArr;
        }
        String strLIZJ = C08HM.LIZJ(strLIZIZ);
        C0VSJ c0vsj = new C0VSJ(C1847540yB6.LIZJ(this.LIZ));
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            z = false;
        } else {
            z = true;
        }
        int i3 = this.LIZJ;
        if (i3 != 0 && (i2 = this.LIZLLL) != 0) {
            if (!z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("provide error ");
                sbLIZ2.append(z);
                sbLIZ2.append(' ');
                sbLIZ2.append(this.LIZJ);
                sbLIZ2.append(' ');
                sbLIZ2.append(this.LIZLLL);
                C201955140j.LJI("provideAIGCWaterMarks error", new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
                return null;
            }
            CreativeInfo creativeInfo = this.LIZ;
            C1847520yB4 c1847520yB4 = C1847520yB4.LIZ;
            String strLIZJ2 = C1847540yB6.LIZJ(creativeInfo);
            c1847520yB4.getClass();
            String[] strArrLIZ = C1847520yB4.LIZ(strLIZJ2, strLIZJ);
            if (strArrLIZ.length == 0) {
                ArrayList arrayList = new ArrayList();
                C438740HIi c438740HIi = new C438740HIi();
                c438740HIi.LIZ(i3, i2);
                arrayList.add(c438740HIi);
                strArrLIZ = C1847520yB4.LIZIZ((C438740HIi[]) arrayList.toArray(new C438740HIi[0]), C1847540yB6.LIZJ(creativeInfo), strLIZJ);
            }
            ((HashMap) this.LJFF).put(strLIZIZ, strArrLIZ);
            return strArrLIZ;
        }
        C201955140j.LJ("provideAIGCWaterMarks error please init videoWidth and videoHeight");
        return null;
    }

    @Override // X.InterfaceC1781960wTK
    public final String[] LIZLLL(int i) {
        boolean z;
        int i2;
        boolean z2;
        Object c098200Yq;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Bitmap bitmap = null;
        Object obj = null;
        if (i == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ailive_watermark");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(i);
        sbLIZ.append(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String[] strArr = (String[]) ((HashMap) this.LJFF).get(strLIZIZ);
        if (strArr != null && strArr.length > 0) {
            return strArr;
        }
        String strLIZJ = C08HM.LIZJ(strLIZIZ);
        C0VSJ c0vsj = new C0VSJ(C1847540yB6.LIZLLL(this.LIZ));
        boolean z3 = true;
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            z = false;
        } else {
            z = true;
        }
        int i3 = this.LIZJ;
        if (i3 != 0 && (i2 = this.LIZLLL) != 0) {
            if (!z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("provide error ");
                sbLIZ2.append(z);
                sbLIZ2.append(' ');
                sbLIZ2.append(this.LIZJ);
                sbLIZ2.append(' ');
                sbLIZ2.append(this.LIZLLL);
                C201955140j.LJI("provideAILiveWaterMarks error", new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
                return null;
            }
            CreativeInfo creativeInfo = this.LIZ;
            C1847520yB4 c1847520yB4 = C1847520yB4.LIZ;
            String strLIZLLL = C1847540yB6.LIZLLL(creativeInfo);
            c1847520yB4.getClass();
            String[] strArrLIZ = C1847520yB4.LIZ(strLIZLLL, strLIZJ);
            if (strArrLIZ.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                ArrayList arrayList = new ArrayList();
                C438740HIi c438740HIi = new C438740HIi();
                if (i3 > 0 && i2 > 0) {
                    float fMin = Math.min(i3, i2) / C418440Gaw.LIZIZ(750);
                    C422650Ghj c422650Ghj = new C422650Ghj(C1BWL.LIZ());
                    String str = (String) ((Map) C290180BYy.LIZIZ.getValue()).get(C0CHQ.LIZ().getAppLanguage());
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() != 0) {
                        z3 = false;
                    }
                    if (!z3) {
                        try {
                            c098200Yq = (Bitmap) C23250099c.LJ(C23271099x.INSTANCE, new C468001ry(str, null));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                            obj = c098200Yq;
                        }
                        bitmap = (Bitmap) obj;
                    }
                    c422650Ghj.setWatermarkImage(bitmap);
                    int iLIZIZ = C814420VxA.LIZIZ(c422650Ghj.LLILLL * fMin);
                    int iLIZIZ2 = C814420VxA.LIZIZ(c422650Ghj.LLILZ * fMin);
                    int iLIZIZ3 = C814420VxA.LIZIZ(c422650Ghj.LLILZIL * fMin);
                    ImageView imageView = c422650Ghj.LLILLJJLI;
                    if (imageView != null && (layoutParams2 = imageView.getLayoutParams()) != null) {
                        layoutParams2.width = iLIZIZ2;
                    }
                    ImageView imageView2 = c422650Ghj.LLILLJJLI;
                    if (imageView2 != null && (layoutParams = imageView2.getLayoutParams()) != null) {
                        layoutParams.height = iLIZIZ3;
                    }
                    FrameLayout frameLayout = c422650Ghj.LL;
                    if (frameLayout != null) {
                        frameLayout.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                    }
                    c422650Ghj.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    c422650Ghj.layout(0, 0, c422650Ghj.getMeasuredWidth(), c422650Ghj.getMeasuredHeight());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c422650Ghj.getMeasuredWidth(), c422650Ghj.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    c422650Ghj.draw(new Canvas(bitmapCreateBitmap));
                    c438740HIi.LIZ = bitmapCreateBitmap;
                }
                arrayList.add(c438740HIi);
                C438740HIi[] c438740HIiArr = (C438740HIi[]) arrayList.toArray(new C438740HIi[0]);
                C1847520yB4 c1847520yB42 = C1847520yB4.LIZ;
                String strLIZLLL2 = C1847540yB6.LIZLLL(creativeInfo);
                c1847520yB42.getClass();
                strArrLIZ = C1847520yB4.LIZIZ(c438740HIiArr, strLIZLLL2, strLIZJ);
            }
            ((HashMap) this.LJFF).put(strLIZIZ, strArrLIZ);
            return strArrLIZ;
        }
        C201955140j.LJ("provideAILiveWaterMarks error please init videoWidth and videoHeight");
        return null;
    }

    @Override // X.InterfaceC1781960wTK
    public final String[] LJ(int i) {
        boolean z;
        int i2;
        if (i == 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_chat_watermark");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(i);
        sbLIZ.append(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String[] strArr = (String[]) ((HashMap) this.LJFF).get(strLIZIZ);
        int i3 = 1;
        if (strArr != null && strArr.length != 0) {
            return strArr;
        }
        String strLIZJ = C08HM.LIZJ(strLIZIZ);
        C0VSJ c0vsj = new C0VSJ(C1847540yB6.LIZIZ(this.LIZ));
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            z = false;
        } else {
            z = true;
        }
        int i4 = this.LIZJ;
        if (i4 == 0 || (i2 = this.LIZLLL) == 0 || !z) {
            return null;
        }
        CreativeInfo creativeInfo = this.LIZ;
        C1847520yB4 c1847520yB4 = C1847520yB4.LIZ;
        String strLIZIZ2 = C1847540yB6.LIZIZ(creativeInfo);
        c1847520yB4.getClass();
        String[] strArrLIZ = C1847520yB4.LIZ(strLIZIZ2, strLIZJ);
        if (strArrLIZ.length == 0) {
            ArrayList arrayList = new ArrayList();
            C438740HIi c438740HIi = new C438740HIi();
            if (i4 > 0 && i2 > 0) {
                C2476209n6 c2476209n6 = new C2476209n6(C1BWL.LIZ());
                c2476209n6.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredWidth = c2476209n6.getMeasuredWidth();
                int measuredHeight = c2476209n6.getMeasuredHeight();
                float fLIZIZ = C418440Gaw.LIZIZ(750);
                float fMin = Math.min(i4 / fLIZIZ, i2 / fLIZIZ);
                int i5 = (int) (measuredWidth * fMin);
                if (i5 < 1) {
                    i5 = 1;
                }
                int i6 = (int) (measuredHeight * fMin);
                if (i6 >= 1) {
                    i3 = i6;
                }
                c2476209n6.layout(0, 0, measuredWidth, measuredHeight);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i3, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(fMin, fMin);
                c2476209n6.draw(canvas);
                c438740HIi.LIZ = bitmapCreateBitmap;
            }
            arrayList.add(c438740HIi);
            strArrLIZ = C1847520yB4.LIZIZ((C438740HIi[]) arrayList.toArray(new C438740HIi[0]), C1847540yB6.LIZIZ(creativeInfo), strLIZJ);
        }
        ((HashMap) this.LJFF).put(strLIZIZ, strArrLIZ);
        return strArrLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a3  */
    @Override // X.InterfaceC1781960wTK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] LIZIZ(boolean r31, X.InterfaceC2257101DWa r32) {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1847530yB5.LIZIZ(boolean, X.1DWa):java.lang.String[]");
    }

    @Override // X.InterfaceC1781960wTK
    public final String[] LJFF(String str, InterfaceC2257101DWa interfaceC2257101DWa) {
        boolean z;
        boolean z2;
        int i;
        if (interfaceC2257101DWa != null && TextUtils.equals(o.LJIIZILJ.getCurrentUserID(), interfaceC2257101DWa.getUid())) {
            z = true;
        } else {
            z = false;
        }
        if (z && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String[] strArr = (String[]) ((HashMap) this.LJFF).get(strLIZIZ);
            if (strArr != null && strArr.length > 0) {
                return strArr;
            }
            String strLIZJ = C08HM.LIZJ(strLIZIZ);
            C0VSJ c0vsj = new C0VSJ(C1847540yB6.LJ(this.LIZ));
            if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i2 = this.LIZJ;
            if (i2 != 0 && (i = this.LIZLLL) != 0) {
                if (!z2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("provide error ");
                    sbLIZ2.append(z2);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(this.LIZJ);
                    sbLIZ2.append(' ');
                    sbLIZ2.append(this.LIZLLL);
                    C201955140j.LJI("provideTTSWaterMarks error", new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2)));
                    return null;
                }
                CreativeInfo creativeInfo = this.LIZ;
                C1847520yB4 c1847520yB4 = C1847520yB4.LIZ;
                String strLJ = C1847540yB6.LJ(creativeInfo);
                c1847520yB4.getClass();
                String[] strArrLIZ = C1847520yB4.LIZ(strLJ, strLIZJ);
                if (strArrLIZ.length == 0) {
                    ArrayList arrayList = new ArrayList();
                    C438740HIi c438740HIi = new C438740HIi();
                    if (i2 > 0 && i > 0 && str != null && !Intrinsics.LJFF("", str)) {
                        Resources resources = o.LIZ.getResources();
                        float f = i2;
                        float f2 = f / 375.0f;
                        TextPaint textPaint = new TextPaint(1);
                        textPaint.setAntiAlias(true);
                        textPaint.setTextSize(14.0f * f2);
                        textPaint.setTypeface(C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
                        textPaint.setStyle(Paint.Style.FILL);
                        textPaint.setColor(resources.getColor(R.color.be));
                        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                        float f3 = 2;
                        int i3 = (int) ((fontMetrics.bottom - fontMetrics.top) * f3);
                        if (f - textPaint.measureText(str) < 24 * f2 * f3) {
                            i3 = (int) (i3 * 1.5f);
                        }
                        c438740HIi.LIZ = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(c438740HIi.LIZ);
                        canvas.drawColor(0);
                        StaticLayout staticLayout = new StaticLayout(str, textPaint, (int) (f - (48 * f2)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        canvas.save();
                        canvas.translate((i2 / 2) - (staticLayout.getWidth() / 2), 0.0f);
                        staticLayout.draw(canvas);
                        canvas.restore();
                    }
                    arrayList.add(c438740HIi);
                    strArrLIZ = C1847520yB4.LIZIZ((C438740HIi[]) arrayList.toArray(new C438740HIi[0]), C1847540yB6.LJ(creativeInfo), strLIZJ);
                }
                ((HashMap) this.LJFF).put(strLIZIZ, strArrLIZ);
                return strArrLIZ;
            }
            C201955140j.LJ("provideTTSWaterMarks error please init videoWidth and videoHeight");
        }
        return null;
    }

    @Override // X.InterfaceC1781960wTK
    public final void LJII(String str, InterfaceC2257101DWa interfaceC2257101DWa) {
        LJFF(str, interfaceC2257101DWa);
    }

    @Override // X.InterfaceC1781960wTK
    public final void LJIIIZ(boolean z, InterfaceC2257101DWa interfaceC2257101DWa) {
        LIZIZ(z, interfaceC2257101DWa);
    }

    @Override // X.InterfaceC1781960wTK
    public final String[] LJI(int i, boolean z, List list) {
        C547950LeL c547950LeL;
        String str;
        String appLanguage;
        boolean z2;
        int i2;
        if (i == 0) {
            return null;
        }
        C548590LfN.LIZ.getClass();
        List<C547950LeL> listLIZIZ = C548590LfN.LIZLLL().LIZIZ(list);
        if (listLIZIZ != null && (c547950LeL = (C547950LeL) C13LP.LJJJLL(listLIZIZ)) != null) {
            if (z) {
                str = c547950LeL.LJ;
            } else {
                str = c547950LeL.LJFF;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c547950LeL.LJI);
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(i);
            ISettingService iSettingService = (ISettingService) PluggableExtentionKt.pluggableSpi$default(ISettingService.class, false, false, false, 14, null);
            if (iSettingService != null) {
                appLanguage = iSettingService.getAppLanguage();
            } else {
                appLanguage = null;
            }
            sbLIZ.append(appLanguage);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String[] strArr = (String[]) ((HashMap) this.LJFF).get(strLIZIZ);
            int i3 = 1;
            if (strArr != null && strArr.length != 0) {
                return strArr;
            }
            String strLIZJ = C08HM.LIZJ(strLIZIZ);
            C0VSJ c0vsj = new C0VSJ(C1847540yB6.LIZ(this.LIZ));
            if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i4 = this.LIZJ;
            if (i4 == 0 || (i2 = this.LIZLLL) == 0 || !z2) {
                return null;
            }
            CreativeInfo creativeInfo = this.LIZ;
            if (str == null) {
                str = "";
            }
            C1847520yB4 c1847520yB4 = C1847520yB4.LIZ;
            String strLIZ = C1847540yB6.LIZ(creativeInfo);
            c1847520yB4.getClass();
            String[] strArrLIZ = C1847520yB4.LIZ(strLIZ, strLIZJ);
            if (strArrLIZ.length == 0) {
                ArrayList arrayList = new ArrayList();
                C438740HIi c438740HIi = new C438740HIi();
                if (z) {
                    if (i4 > 0 && i2 > 0) {
                        float fMin = Math.min(i4, i2) / C418440Gaw.LIZIZ(750);
                        C421240GfS c421240GfS = new C421240GfS(C1BWL.LIZ());
                        c421240GfS.setTvWatermarkText(str);
                        c421240GfS.LIZ(fMin);
                        c421240GfS.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        c421240GfS.layout(0, 0, c421240GfS.getMeasuredWidth(), c421240GfS.getMeasuredHeight());
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c421240GfS.getMeasuredWidth(), c421240GfS.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        c421240GfS.draw(new Canvas(bitmapCreateBitmap));
                        c438740HIi.LIZ = bitmapCreateBitmap;
                    }
                } else if (i4 > 0 && i2 > 0) {
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C1BWL.LIZ(), R.style.xm);
                    FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
                    C1847580yBA c1847580yBA = new C1847580yBA();
                    c1847580yBA.text(str);
                    c1847580yBA.textColorRes(R.attr.zi);
                    c1847580yBA.build();
                    C1847550yB7 c1847550yB7 = new C1847550yB7();
                    c1847580yBA.build();
                    c1847550yB7.LIZIZ = c1847580yBA;
                    c1847550yB7.LIZ = contextThemeWrapper;
                    frameLayout.addView((View) c1847550yB7.LIZJ.getValue());
                    frameLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredWidth = frameLayout.getMeasuredWidth();
                    int measuredHeight = frameLayout.getMeasuredHeight();
                    float fLIZIZ = C418440Gaw.LIZIZ(750);
                    float fMin2 = Math.min(i4 / fLIZIZ, i2 / fLIZIZ);
                    int i5 = (int) (measuredWidth * fMin2);
                    if (i5 < 1) {
                        i5 = 1;
                    }
                    int i6 = (int) (measuredHeight * fMin2);
                    if (i6 >= 1) {
                        i3 = i6;
                    }
                    frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i5, i3, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap2);
                    canvas.scale(fMin2, fMin2);
                    frameLayout.draw(canvas);
                    c438740HIi.LIZ = bitmapCreateBitmap2;
                }
                arrayList.add(c438740HIi);
                strArrLIZ = C1847520yB4.LIZIZ((C438740HIi[]) arrayList.toArray(new C438740HIi[0]), C1847540yB6.LIZ(creativeInfo), strLIZJ);
            }
            ((HashMap) this.LJFF).put(strLIZIZ, strArrLIZ);
            return strArrLIZ;
        }
        return new String[0];
    }

    public C1847530yB5(int i, int i2, int i3, CreativeInfo creativeInfo, String str) {
        this.LIZ = creativeInfo;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
