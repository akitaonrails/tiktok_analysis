package X;

import android.content.Context;
import android.graphics.Point;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19659511vt {
    public final Context LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJI;
    public int LJII;
    public float LJIIIIZZ;

    public final List<TextStickerData> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        Context context = this.LIZ;
        float f = 2;
        arrayList.add(LIZ(context, context.getString(2131821885), this.LIZIZ / f, this.LIZJ / f, C19659711vv.LIZ() ? this.LJI : 36, this.LJ));
        Context context2 = this.LIZ;
        arrayList.add(LIZ(context2, this.LIZLLL, this.LIZIZ / f, C12ES.LIZJ(this.LJIIIIZZ + 40.0f, context2) + (this.LIZJ / f), C19659711vv.LIZ() ? this.LJII : 20, this.LJFF));
        return arrayList;
    }

    public final void LIZJ(final Function1<? super Boolean, Unit> function1) {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "creation_tools_on_this_day_font_style", true);
        if (iLJIJ != 1) {
            if (iLJIJ != 2) {
                this.LJ = "Damion-Regular.ttf";
                this.LJFF = "Proxima-Nova-Semibold.otf";
            } else {
                this.LJ = "TikTok-Display-Bold-Oblique.ttf";
                this.LJFF = "TikTok-Display-Bold-Oblique.ttf";
                this.LJI = 28;
                this.LJII = 18;
                this.LJIIIIZZ = -7.0f;
            }
        } else {
            this.LJ = "CrimsonText-SemiBold.ttf";
            this.LJFF = "CrimsonText-SemiBold.ttf";
            this.LJIIIIZZ = -2.0f;
        }
        C0FI2.LJIJJLI("textfont").LIZLLL(this.LJ, new C0FI9() { // from class: X.11vu
            @Override // X.C0FI9
            public final void onFail() {
            }

            @Override // X.C0FI9
            public final void onSuccess() {
            }

            @Override // X.C0FI9
            public final void LIZ(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                function1.invoke(Boolean.valueOf(zBooleanValue));
                if (!zBooleanValue) {
                    this.LJ = "Proxima-Nova-Semibold.otf";
                }
            }
        }, Boolean.valueOf(!C298130BmN.LIZ()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19659511vt(long r4, android.content.Context r6, X.InterfaceC1455860nzM r7) {
        /*
            r3 = this;
            r3.<init>()
            r3.LIZ = r6
            X.0nuE r0 = r7.gc()
            if (r0 == 0) goto L73
            X.0ntP r0 = r0.LJJ()
            com.ss.android.vesdk.VESize r0 = r0.getInitSize()
            if (r0 == 0) goto L73
            int r0 = r0.width
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L73
            int r0 = r1.intValue()
        L25:
            r3.LIZIZ = r0
            X.0nuE r0 = r7.gc()
            if (r0 == 0) goto L6e
            X.0ntP r0 = r0.LJJ()
            com.ss.android.vesdk.VESize r0 = r0.getInitSize()
            if (r0 == 0) goto L6e
            int r0 = r0.height
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L6e
            int r0 = r1.intValue()
        L47:
            r3.LIZJ = r0
            com.bytedance.bddatefmt.BDDateFormat r2 = new com.bytedance.bddatefmt.BDDateFormat
            java.lang.String r0 = "M/D/YYYY"
            r2.<init>(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r2.LIZIZ(r4, r0)
            r3.LIZLLL = r0
            java.lang.String r0 = "Damion-Regular.ttf"
            r3.LJ = r0
            java.lang.String r0 = "Proxima-Nova-Semibold.otf"
            r3.LJFF = r0
            r0 = 32
            r3.LJI = r0
            r0 = 20
            r3.LJII = r0
            return
        L6e:
            int r0 = X.C12ES.LJIIIIZZ(r6)
            goto L47
        L73:
            int r0 = X.C12ES.LJIIJ(r6)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19659511vt.<init>(long, android.content.Context, X.0nzM):void");
    }

    public final TextStickerData LIZ(Context context, String str, float f, float f2, int i, String str2) {
        C0FI2.LJIJJLI("textfont").LJI = str2;
        TextStickerData textStickerData = new TextStickerData(str, 1, -1, 2, str2, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32, -1, -1, 4095, null);
        textStickerData.setScale(i / textStickerData.getFontSize());
        textStickerData.setX(f);
        textStickerData.setY(f2);
        textStickerData.setEditCenterPoint(new Point(this.LIZIZ / 2, this.LIZJ / 2));
        textStickerData.setTextWrapList(Collections.singletonList(C123P.LIZJ(C123P.LJIILJJIL(textStickerData, context))));
        return textStickerData;
    }
}
