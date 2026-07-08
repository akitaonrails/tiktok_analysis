package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0FIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387880FIs extends FrameLayout implements C0FID, C0FIA {
    public final C387920FIw LL;
    public final SmartImageView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final TuxIconView LLILZ;
    public ObjectAnimator LLILZIL;
    public TextFontStyleData LLILZLL;
    public C0FID LLIZ;
    public C0FIA LLIZLLLIL;
    public Drawable LLJ;
    public Drawable LLJI;
    public final Boolean LLJIJIL;
    public C419910GdJ LLJILJIL;
    public C419910GdJ LLJILJILJ;
    public C0FJ4 LLJILLL;

    @Override // X.C0FIA
    public final void LJ() {
    }

    public final boolean LJIIIZ() {
        if (this.LLILZLL == null) {
            return false;
        }
        C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextFontTypeLayout#startDownload, fontTitle = ");
        sbLIZ.append(this.LLILZLL.title);
        C201955140j.LJIILJJIL(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZLL.LIZIZ()) {
            if (!TextUtils.isEmpty(this.LLILZLL.textAnimResourceId) && !this.LLILZLL.LIZJ.LIZ()) {
                LJI();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TextFontTypeLayout#startDownload, already completed. fontTitle = ");
            sbLIZ2.append(this.LLILZLL.title);
            C201955140j.LJIILJJIL(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        }
        if (this.LLILZLL.LIZLLL == 3) {
            LJFF();
            return false;
        }
        if (!C790050Uyx.LIZ(getContext())) {
            C123O.LIZLLL().LIZIZ(2131830072, getContext());
            return false;
        }
        this.LLILZLL.LIZLLL = 3;
        LJFF();
        String strLJJJJJL = EffectPlatform.LJJJJJL();
        Effect effect = this.LLILZLL.LJ;
        if (effect != null && !effect.getPanel().isEmpty()) {
            strLJJJJJL = this.LLILZLL.LJ.getPanel();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("TextFontTypeLayout#startDownload, real start. fontTitle = ");
        sbLIZ3.append(this.LLILZLL.title);
        C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ3));
        C0FI2 c0fi2LJIJJLI = C0FI2.LJIJJLI(strLJJJJJL);
        Context context = getContext();
        TextFontStyleData textFontStyleData = this.LLILZLL;
        Boolean boolValueOf = Boolean.valueOf(!C298130BmN.LIZ());
        if (context != null) {
            C15O7.LIZJ(new C0FHX(System.currentTimeMillis(), this, c0fi2LJIJJLI, textFontStyleData, this, boolValueOf));
        }
        return false;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    public void setMotionStateCallback(C0FJ7 c0fj7) {
    }

    @Override // X.C0FID
    public final void LIZJ() {
        TextFontStyleData textFontStyleData = this.LLILZLL;
        if (textFontStyleData != null) {
            textFontStyleData.LIZLLL = 2;
            LJFF();
        }
        C0FID c0fid = this.LLIZ;
        if (c0fid != null) {
            c0fid.LIZJ();
        }
        C123O.LIZLLL().LIZ(getContext(), getContext().getResources().getString(2131834850));
    }

    public final void LJFF() {
        if (this.LLILZLL == null || this.LLJIJIL.booleanValue()) {
            return;
        }
        int i = this.LLILZLL.LIZLLL;
        if (i == 1) {
            C786410Ut5.LLLLLLZZ(this.LLILZ, 4);
            return;
        }
        if (i == 2) {
            C786410Ut5.LLLLLLZZ(this.LLILZ, 0);
            ObjectAnimator objectAnimator = this.LLILZIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.LLILZIL = null;
            C786410Ut5.Fb(this.LLILZ, 0.0f);
            C419910GdJ c419910GdJ = this.LLJILJIL;
            if (c419910GdJ != null) {
                this.LLILZ.setTuxIcon(c419910GdJ);
                return;
            } else {
                this.LLILZ.setImageDrawable(C800330VaR.LIZIZ(getContext(), R.drawable.c3u));
                return;
            }
        }
        if (i == 3) {
            C786410Ut5.LLLLLLZZ(this.LLILZ, 0);
            C419910GdJ c419910GdJ2 = this.LLJILJILJ;
            if (c419910GdJ2 != null) {
                this.LLILZ.setTuxIcon(c419910GdJ2);
            } else {
                this.LLILZ.setImageDrawable(C800330VaR.LIZIZ(getContext(), R.drawable.c7p));
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZ, "rotation", 0.0f, 360.0f);
            this.LLILZIL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(800L);
            this.LLILZIL.setRepeatMode(1);
            this.LLILZIL.setRepeatCount(-1);
            C786410Ut5.Pd(this.LLILZIL);
        }
    }

    public final void LJIIJ() {
        TextFontStyleData textFontStyleData = this.LLILZLL;
        if (textFontStyleData == null) {
            return;
        }
        Typeface typefaceLJJI = C0FI2.LJJI(textFontStyleData.fileName);
        if (typefaceLJJI != null) {
            this.LL.setTypeface(typefaceLJJI);
        }
        if (this.LLILZLL.LIZ()) {
            this.LL.setMaskBlurColor(LJII(R.attr.ee, getContext()));
        } else {
            this.LL.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    @Override // X.C0FIA
    public final void LIZIZ() {
        LJFF();
        C0FIA c0fia = this.LLIZLLLIL;
        if (c0fia != null) {
            c0fia.LIZIZ();
        }
    }

    public final void LJI() {
        TextFontStyleData textFontStyleData;
        if (C298130BmN.LIZ() || (textFontStyleData = this.LLILZLL) == null) {
            return;
        }
        if (TextUtils.isEmpty(textFontStyleData.textAnimResourceId)) {
            this.LLILZLL.LIZJ.LIZIZ = 5;
            return;
        }
        if (this.LLILZLL.LIZJ.LIZ()) {
            return;
        }
        if (!C790050Uyx.LIZ(getContext())) {
            C123O.LIZLLL().LIZIZ(2131830072, getContext());
            return;
        }
        String strLJJJJJL = EffectPlatform.LJJJJJL();
        Effect effect = this.LLILZLL.LJ;
        if (effect != null && !effect.getPanel().isEmpty()) {
            strLJJJJJL = this.LLILZLL.LJ.getPanel();
        }
        C0FI2 c0fi2LJIJJLI = C0FI2.LJIJJLI(strLJJJJJL);
        Context context = getContext();
        TextFontStyleData textFontStyleData2 = this.LLILZLL;
        Boolean boolValueOf = Boolean.valueOf(!C298130BmN.LIZ());
        if (context != null && boolValueOf.booleanValue()) {
            c0fi2LJIJJLI.LIZJ(textFontStyleData2, this, 0);
        }
        LJFF();
    }

    @Override // X.C0FIA
    public final void onFail() {
        LJFF();
        if (!TextUtils.isEmpty(this.LLILZLL.textAnimResourceId)) {
            this.LLILZLL.LIZJ.LIZIZ = 2;
            LJFF();
        }
        C0FIA c0fia = this.LLIZLLLIL;
        if (c0fia != null) {
            c0fia.onFail();
        }
    }

    public TextFontStyleData getFontData() {
        return this.LLILZLL;
    }

    public C387880FIs(Context context) {
        float f;
        super(context, null);
        Boolean boolValueOf = Boolean.valueOf(C297840Blu.LIZ());
        this.LLJIJIL = boolValueOf;
        View viewSd = C786410Ut5.Sd(R.layout.c51, C786410Ut5.ne(context), this);
        C387920FIw c387920FIw = (C387920FIw) viewSd.findViewById(R.id.y3k);
        this.LL = c387920FIw;
        this.LLILLJJLI = (SmartImageView) viewSd.findViewById(R.id.ih5);
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.w1c);
        this.LLILZ = tuxIconView;
        FrameLayout frameLayout = (FrameLayout) viewSd.findViewById(R.id.txt_bg);
        this.LLILLL = frameLayout;
        if (c387920FIw != null) {
            c387920FIw.setMinimumWidth((int) C11VU.LIZIZ(48.0f, context));
            c387920FIw.requestLayout();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_text_font_list_ui_optimize", true, false)) {
            if (frameLayout != null) {
                frameLayout.setMinimumWidth((int) C11VU.LIZIZ(76.0f, context));
                int iLIZIZ = C366700EZg.LIZIZ(10.0d, context);
                frameLayout.setPadding(iLIZIZ, 0, iLIZIZ, 0);
                frameLayout.requestLayout();
            }
        } else if (frameLayout != null) {
            frameLayout.setMinimumWidth((int) C11VU.LIZIZ(64.0f, context));
            frameLayout.requestLayout();
        }
        Context context2 = getContext();
        if (C12VA.LIZ().LJIIJ.invoke().booleanValue()) {
            f = 6.0f;
        } else {
            f = 4.0f;
        }
        int iLIZIZ2 = (int) C11VU.LIZIZ(f, context2);
        this.LLJ = C426580Go4.LIZJ(-1, 16777215, (int) C11VU.LIZIZ(2.0f, getContext()), iLIZIZ2);
        this.LLJI = C426580Go4.LIZJ(889192447, 16777215, 1, iLIZIZ2);
        if (boolValueOf.booleanValue()) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }

    private void setFontData(TextFontStyleData textFontStyleData) {
        Effect effect;
        String extra;
        Effect effect2;
        UrlModel iconUrl;
        List<String> url_list;
        if (textFontStyleData == null) {
            return;
        }
        this.LLILZLL = textFontStyleData;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_text_font_list_ui_optimize", true, false)) {
            C387920FIw c387920FIw = this.LL;
            int visibility = c387920FIw.getVisibility();
            c387920FIw.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c387920FIw);
            C786410Ut5.LLFF(0, this.LLILLJJLI);
            C03IT c03it = new C03IT(textFontStyleData.LJ.getIconUrl().getUrlList());
            if (((Boolean) C0FJ8.LIZ.getValue()).booleanValue() && (effect = textFontStyleData.LJ) != null && (extra = effect.getExtra()) != null) {
                JSONObject jSONObject = new JSONObject(extra);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("translated_icon_");
                sbLIZ.append(C0CHQ.LIZ().getAppLanguage());
                String strOptString = jSONObject.optString(C2188811AlT.LIZIZ(sbLIZ));
                if (strOptString.length() > 0 && (effect2 = textFontStyleData.LJ) != null && (iconUrl = effect2.getIconUrl()) != null && (url_list = iconUrl.getUrl_list()) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(url_list, 10));
                    for (String str : url_list) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(a0.LJL(str, "/", str));
                        sbLIZ2.append('/');
                        sbLIZ2.append(strOptString);
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    c03it = new C03IT(arrayList);
                }
            }
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03it);
            c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIJ.LJJ(this.LLILLJJLI);
            C786410Ut5.h3(c1331670kl3LJIIJ);
            return;
        }
        C387920FIw c387920FIw2 = this.LL;
        int visibility2 = c387920FIw2.getVisibility();
        c387920FIw2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c387920FIw2);
        C786410Ut5.LLFF(8, this.LLILLJJLI);
        String str2 = textFontStyleData.title;
        if (((Boolean) C0FJ8.LIZ.getValue()).booleanValue()) {
            Map<String, String> map = textFontStyleData.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("translated_title_");
            sbLIZ3.append(C0CHQ.LIZ().getAppLanguage());
            String str3 = map.get(C2188811AlT.LIZIZ(sbLIZ3));
            if (str3 != null) {
                str2 = str3;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            this.LL.setText(str2);
            setContentDescription(str2);
        }
        if (textFontStyleData.LJ.getResource_id().equals("7477473265066185217")) {
            this.LL.setIncludeFontPadding(false);
        }
        int i = textFontStyleData.topOffset;
        if (i != 0) {
            C387920FIw c387920FIw3 = this.LL;
            float fLIZIZ = C366700EZg.LIZIZ(i, getContext());
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c387920FIw3);
            c387920FIw3.setTranslationY(fLIZIZ);
        }
    }

    private void setMotionData(TextMotionData textMotionData) {
        if (textMotionData == null) {
            return;
        }
        this.LLILZLL.LIZJ = textMotionData;
    }

    @Override // X.C0FIA
    public final void LIZ(TextMotionData textMotionData) {
        LJFF();
        C0FIA c0fia = this.LLIZLLLIL;
        if (c0fia != null) {
            c0fia.LIZ(textMotionData);
        }
    }

    public final void LJIIIIZZ(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        setFontData(textFontStyleData);
        TextMotionData textMotionData = textFontStyleData.LIZJ;
        if (textMotionData != null) {
            setMotionData(textMotionData);
            LJFF();
        }
        LJIIJ();
        LJFF();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setClassName(Button.class.getName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setBackground(int r5) {
        /*
            r4 = this;
            r0 = 0
            r3 = 1
            if (r5 == r3) goto L43
            android.graphics.drawable.Drawable r1 = r4.LLJI
            r4.setSelected(r0)
        L9:
            android.widget.FrameLayout r0 = r4.LLILLL
            r0.setBackground(r1)
            X.0FJ4 r1 = r4.LLJILLL
            if (r1 == 0) goto L32
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L32
            boolean r0 = r1.LIZIZ
            if (r0 != 0) goto L32
            X.0FIw r2 = r4.LL
            android.content.Context r1 = r4.getContext()
            if (r5 != r3) goto L33
            r0 = 2131099773(0x7f06007d, float:1.7811909E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L41
            int r0 = r0.intValue()
        L2f:
            r2.setTextColor(r0)
        L32:
            return
        L33:
            r0 = 2131099768(0x7f060078, float:1.7811899E38)
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
            if (r0 == 0) goto L41
            int r0 = r0.intValue()
            goto L2f
        L41:
            r0 = -1
            goto L2f
        L43:
            android.graphics.drawable.Drawable r1 = r4.LLJ
            r4.setSelected(r3)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387880FIs.setBackground(int):void");
    }

    public void setCustomDownloadIcon(C419910GdJ c419910GdJ) {
        this.LLJILJIL = c419910GdJ;
    }

    public void setCustomLoadingIcon(C419910GdJ c419910GdJ) {
        this.LLJILJILJ = c419910GdJ;
    }

    public void setDownloadCallback(C0FID c0fid) {
        this.LLIZ = c0fid;
    }

    public void setFontTypeLayoutConfig(C0FJ4 c0fj4) {
        this.LLJILLL = c0fj4;
        if (c0fj4 != null) {
            if (c0fj4.LIZIZ) {
                findViewById(R.id.eqx).getLayoutParams().height = (int) C11VU.LIZIZ(56.0f, getContext());
                this.LL.setMinimumHeight((int) C11VU.LIZIZ(20.0f, getContext()));
                int iLIZIZ = (int) C11VU.LIZIZ(6.0f, getContext());
                int iLJII = LJII(R.attr.zi, getContext());
                int iLJII2 = LJII(R.attr.a01, getContext());
                this.LLJ = C426580Go4.LIZJ(iLJII, 16777215, (int) C11VU.LIZIZ(1.5f, getContext()), iLIZIZ);
                this.LLJI = C426580Go4.LIZJ(iLJII2, 16777215, (int) C11VU.LIZIZ(1.0f, getContext()), iLIZIZ);
                return;
            }
            if (c0fj4.LIZ) {
                int iLIZIZ2 = (int) C11VU.LIZIZ(34.0f, getContext());
                this.LLJ = C426580Go4.LIZJ(-1, -1, (int) C11VU.LIZIZ(2.0f, getContext()), iLIZIZ2);
                this.LLJI = C426580Go4.LIZJ(889192447, C1308910kAL.LIZJ(R.attr.e4, getContext()).intValue(), 0, iLIZIZ2);
            }
        }
    }

    public void setTextMotionCallback(C0FIA c0fia) {
        this.LLIZLLLIL = c0fia;
    }

    public static int LJII(int i, Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, new C1361400lX0(context, R.style.y0));
        if (numLIZJ == null) {
            return -1;
        }
        return numLIZJ.intValue();
    }

    @Override // X.C0FID
    public final void LIZLLL(TextFontStyleData textFontStyleData, boolean z) {
        LJFF();
        C0FID c0fid = this.LLIZ;
        if (c0fid != null) {
            TextFontStyleData textFontStyleData2 = this.LLILZLL;
            c0fid.LIZLLL(textFontStyleData2, textFontStyleData2.LIZIZ());
        }
        LJIIJ();
    }
}
