package X;

import Y.AAListenerS341S0100000_31;
import Y.ACListenerS165S0100000_31;
import Y.AUListenerS278S0100000_31;
import Y.AfS145S0000000_31;
import Y.AfS200S0100000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cla.et.newet.ClickTransSurveyButtonEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ShowSecondaryTransSurveyOptionsEvent;
import com.ss.android.ugc.aweme.cla.et.newet.SubmitSecondaryTransSurveyOptionsEvent;
import com.ss.android.ugc.aweme.translation.delegates.ITranslationFeedbackDelegate;
import com.ss.android.ugc.aweme.translation.model.FeedbackReportInfo;
import com.ss.android.ugc.aweme.translation.model.TranslationFeedbackExtraInfo;
import com.zhiliaoapp.musically.R;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.161s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207086161s extends FrameLayout {
    public final String LL;
    public final ITranslationFeedbackDelegate LLILLJJLI;
    public final ViewOnAttachStateChangeListenerC20604515jv LLILLL;
    public final C426160GnO LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxIconView LLILZLL;
    public final FrameLayout LLIZ;
    public final FrameLayout LLIZLLLIL;
    public final LinearLayout LLJ;
    public final LinearLayout LLJI;
    public final C197039127h LLJIJIL;
    public final TuxTextView LLJILJIL;
    public AnimatorSet LLJILJILJ;
    public AnimatorSet LLJILLL;
    public AnimatorSet LLJJ;
    public AnimatorSet LLJJI;
    public AnimatorSet LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C207088161u LLJJIJIL;
    public final Map<EnumC207101162h, Boolean> LLJJJ;
    public final Map<EnumC207101162h, String> LLJJJIL;
    public final Map<EnumC207101162h, String> LLJJJJ;
    public final String LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final String LLJJL;

    public final void LIZLLL() {
        C786410Ut5.LJZ(0, this.LLIZ);
        C786410Ut5.LJZ(0, this.LLIZLLLIL);
        this.LLIZ.setClickable(true);
        this.LLIZLLLIL.setClickable(true);
        C786410Ut5.U4(this.LLIZ, 1.0f);
        C786410Ut5.U4(this.LLIZLLLIL, 1.0f);
        if (this.LLJJIJI > 0.0f) {
            C786410Ut5.Gd(this.LLIZ, this.LLJJIJI);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            this.LLILZIL.setTintColor(iIntValue);
            this.LLILZLL.setTintColor(iIntValue);
        }
    }

    public final void LJII() {
        String strLIZIZ;
        C207088161u c207088161u = this.LLJJIJIL;
        if (c207088161u != null) {
            Collection collectionValues = ((LinkedHashMap) this.LLJJJ).values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                return;
            }
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (!(!((Boolean) it2.next()).booleanValue())) {
                    FeedbackReportInfo feedbackReportInfo = new FeedbackReportInfo(c207088161u.LIZ);
                    List<Integer> list = feedbackReportInfo.translatedElement;
                    Map<EnumC207101162h, Boolean> map = this.LLJJJ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set setKeySet = linkedHashMap.keySet();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
                    Iterator it3 = setKeySet.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(Integer.valueOf(((EnumC207101162h) it3.next()).getValue()));
                    }
                    list.addAll(C13LP.LLIIII(arrayList));
                    C08XD.LJIL(feedbackReportInfo.translatedElement);
                    feedbackReportInfo.setPositiveFeedback(c207088161u.LJIIJ.getBValue());
                    feedbackReportInfo.setTargetLanguage(c207088161u.LJFF);
                    feedbackReportInfo.setExtraInfo(new TranslationFeedbackExtraInfo(true, c207088161u.LJII, c207088161u.LJIIIIZZ, c207088161u.LJI));
                    String str = feedbackReportInfo.itemId;
                    if (str == null || str.length() == 0 || feedbackReportInfo.translatedElement.isEmpty()) {
                        return;
                    }
                    LJIIJ();
                    C207088161u c207088161u2 = this.LLJJIJIL;
                    if (c207088161u2 != null) {
                        c207088161u2.LJIIIZ = true;
                    }
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(feedbackReportInfo);
                    if (strLJI == null || !C123100dR.LIZ(strLJI)) {
                        return;
                    }
                    Charset charset = Charsets.UTF_8;
                    String strEncodeToString = Base64.encodeToString(strLJI.getBytes(charset), 2);
                    C827070WcT.LIZ.getClass();
                    String strLIZJ = C827070WcT.LIZJ();
                    StringBuilder sb = new StringBuilder(strLJI);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('_');
                    sbLIZ.append(strLIZJ);
                    sbLIZ.append('_');
                    sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes(charset));
                        strLIZIZ = "";
                        for (byte b : bArrDigest) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append(C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strLIZIZ = "SHAException";
                    }
                    if (C123100dR.LIZ(strEncodeToString) && C123100dR.LIZ(strLIZIZ)) {
                        C20703515zt.LIZ.getClass();
                        C20703515zt.LIZIZ.LIZ(strEncodeToString, strLIZIZ).LJL(C11S5.LIZ()).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.161x
                            @Override // X.InterfaceC781210Ukh
                            public final void run() {
                            }
                        }).LJJLL(new AfS145S0000000_31(4), new AfS200S0100000_31(this, 54));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void LJIIJ() {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(this.LLJJL);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LJIIJJI();
    }

    public final AnimatorSet getEnterFollowUpQuestionAnimSet() {
        if (this.LLJJI == null) {
            LIZ();
        }
        return this.LLJJI;
    }

    public final AnimatorSet getSubmitOrCancelAnimSet() {
        if (this.LLJJIII == null) {
            LIZIZ();
        }
        return this.LLJJIII;
    }

    public final AnimatorSet getThumbUpMoveAnimSet() {
        if (this.LLJJ == null) {
            LIZJ();
        }
        return this.LLJJ;
    }

    public final void LIZ() {
        Interpolator interpolatorLIZLLL = C1619980sG4.LIZLLL();
        Interpolator interpolatorLJI = C1619980sG4.LJI();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJ, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(interpolatorLJI);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJI, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setStartDelay(100L);
        objectAnimatorOfFloat2.setInterpolator(interpolatorLJI);
        this.LLJ.measure(0, 0);
        this.LLJI.measure(0, 0);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.LLJI.getMeasuredHeight() - this.LLJ.getMeasuredHeight());
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.setInterpolator(interpolatorLIZLLL);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS278S0100000_31(this, 62));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.addListener(new AAListenerS341S0100000_31(this, 26));
        animatorSet.addListener(new AAListenerS341S0100000_31(this, 25));
        this.LLJJI = animatorSet;
    }

    public final void LIZIZ() {
        Interpolator interpolatorLIZLLL = C1619980sG4.LIZLLL();
        Interpolator interpolatorLJI = C1619980sG4.LJI();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJI, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(interpolatorLJI);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        objectAnimatorOfFloat2.setStartDelay(100L);
        objectAnimatorOfFloat2.setInterpolator(interpolatorLJI);
        this.LLJ.measure(0, 0);
        this.LLJI.measure(0, 0);
        int measuredHeight = this.LLJ.getMeasuredHeight();
        int measuredHeight2 = this.LLJI.getMeasuredHeight();
        if (measuredHeight <= 0 || measuredHeight2 <= 0) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -(measuredHeight2 - measuredHeight));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setStartDelay(100L);
        valueAnimatorOfInt.setInterpolator(interpolatorLIZLLL);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS278S0100000_31(this, 63));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.addListener(new AAListenerS341S0100000_31(this, 28));
        animatorSet.addListener(new AAListenerS341S0100000_31(this, 27));
        this.LLJJIII = animatorSet;
    }

    public final void LIZJ() {
        Interpolator interpolatorLIZLLL = C1619980sG4.LIZLLL();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLIZLLLIL, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(50L);
        objectAnimatorOfFloat.setInterpolator(interpolatorLIZLLL);
        float x = this.LLIZ.getX();
        float x2 = this.LLIZLLLIL.getX();
        float f = x2 - x;
        if (x <= 0.0f || x2 <= 0.0f) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLIZ, "translationX", 0.0f, f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(interpolatorLIZLLL);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new AAListenerS341S0100000_31(this, 30));
        animatorSet.addListener(new AAListenerS341S0100000_31(this, 29));
        this.LLJJ = animatorSet;
    }

    public final boolean LJFF() {
        List<EnumC207101162h> list;
        C207088161u c207088161u;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needShowFollowUpQuestion currentInfo:");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(", isSubmit:");
        C207088161u c207088161u2 = this.LLJJIJIL;
        sbLIZ.append(c207088161u2 != null ? Boolean.valueOf(c207088161u2.LJIIIZ) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C207088161u c207088161u3 = this.LLJJIJIL;
        return (c207088161u3 == null || (list = c207088161u3.LIZIZ) == null || list.size() <= 1 || (c207088161u = this.LLJJIJIL) == null || c207088161u.LJIIIZ) ? false : true;
    }

    @Override // android.view.View
    public final String getTag() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void LJ(EnumC207090161w enumC207090161w) {
        String str;
        C1582570rHj c1582570rHj;
        C207088161u c207088161u = this.LLJJIJIL;
        if (c207088161u != null) {
            c207088161u.LJIIJ = enumC207090161w;
        }
        if (!this.LLJJIJIIJIL) {
            Iterator it2 = new C1077420e8y(this.LLILZ, 42).iterator();
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (!c1077410e8x.hasNext()) {
                    break;
                }
                View view = (View) c1077410e8x.next();
                if ((view instanceof C1582570rHj) && (c1582570rHj = (C1582570rHj) view) != null) {
                    c1582570rHj.setSelected(false);
                }
            }
            Iterator it3 = ((LinkedHashMap) this.LLJJJ).entrySet().iterator();
            while (it3.hasNext()) {
                this.LLJJJ.put((EnumC207101162h) ((Map.Entry) it3.next()).getKey(), Boolean.FALSE);
            }
            this.LLJIJIL.setEnabled(false);
        } else if (c207088161u != null) {
            this.LLJJIJIIJIL = false;
            for (final EnumC207101162h enumC207101162h : c207088161u.LIZIZ) {
                this.LLJJJ.put(enumC207101162h, Boolean.FALSE);
                String str2 = this.LLJJJIL.get(enumC207101162h);
                if (str2 != null) {
                    final C1582570rHj c1582570rHj2 = new C1582570rHj(getContext(), null, 6);
                    c1582570rHj2.LJ(str2, null, null);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1582570rHj2);
                    c1582570rHj2.setLayoutParams(layoutParams);
                    C426750GoL.LJIIIZ(c1582570rHj2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 27);
                    C786410Ut5.V8(c1582570rHj2, new View.OnClickListener() { // from class: X.161v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            boolean z = true;
                            c1582570rHj2.setSelected(!r1.isSelected());
                            this.LLJJJ.put(enumC207101162h, Boolean.valueOf(c1582570rHj2.isSelected()));
                            C207086161s c207086161s = this;
                            C197039127h c197039127h = c207086161s.LLJIJIL;
                            Collection collectionValues = ((LinkedHashMap) c207086161s.LLJJJ).values();
                            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                                z = false;
                            } else {
                                Iterator it4 = collectionValues.iterator();
                                while (it4.hasNext()) {
                                    if (((Boolean) it4.next()).booleanValue()) {
                                        break;
                                    }
                                }
                                z = false;
                            }
                            c197039127h.setEnabled(z);
                        }
                    });
                    this.LLILZ.addView(c1582570rHj2);
                }
            }
        }
        TuxTextView tuxTextView = this.LLJILJIL;
        if (enumC207090161w == EnumC207090161w.THUMB_UP) {
            str = this.LLJJJJJIL;
        } else {
            str = this.LLJJJJLIIL;
        }
        tuxTextView.setText(str);
    }

    public final void LJI(C207088161u c207088161u) {
        if (c207088161u != null) {
            List<EnumC207101162h> list = c207088161u.LIZIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<EnumC207101162h> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = this.LLJJJJ.get(it2.next());
                if (str != null) {
                    arrayList.add(str);
                }
            }
            final String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            C207084161q c207084161q = new C017D() { // from class: X.161q
                @Override // X.C017D
                public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list2) {
                    return C13BV.INSTANCE;
                }
            };
            AnonymousClass0175 anonymousClass0175 = new AnonymousClass0175();
            final String str2 = c207088161u.LIZJ;
            final String strValue = c207088161u.LJIIJ.getStrValue();
            final String str3 = c207088161u.LIZLLL;
            final String str4 = c207088161u.LJ;
            final String str5 = c207088161u.LJFF;
            final int size = c207088161u.LIZIZ.size();
            C207069161b.LJ(ClickTransSurveyButtonEvent.class, c207084161q, anonymousClass0175, Collections.singletonList(new InterfaceC0241006d(size, str2, strValue, str3, str4, str5, strLJJLIIIJ) { // from class: X.006z
                public final String LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public final String LLILZ;
                public final String LLILZIL;
                public final String LLILZLL;
                public final int LLIZ;

                @Override // X.InterfaceC1282004zy
                public final boolean checkExtraParamKey() {
                    return false;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0263006z)) {
                        return false;
                    }
                    C0263006z c0263006z = (C0263006z) obj;
                    return Intrinsics.LJFF(this.LL, c0263006z.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0263006z.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0263006z.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0263006z.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0263006z.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0263006z.LLILZLL) && this.LLIZ == c0263006z.LLIZ;
                }

                public final int hashCode() {
                    String str6 = this.LL;
                    int iHashCode = (((str6 == null ? 0 : str6.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
                    String str7 = this.LLILLL;
                    int iHashCode2 = (iHashCode + (str7 == null ? 0 : str7.hashCode())) * 31;
                    String str8 = this.LLILZ;
                    int iHashCode3 = (iHashCode2 + (str8 == null ? 0 : str8.hashCode())) * 31;
                    String str9 = this.LLILZIL;
                    return ((((iHashCode3 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ;
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> keyParams() {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("author_id", this.LL);
                    linkedHashMap.put("button_type", this.LLILLJJLI);
                    linkedHashMap.put("enter_from", this.LLILLL);
                    linkedHashMap.put("group_id", this.LLILZ);
                    linkedHashMap.put("target_lang", this.LLILZIL);
                    linkedHashMap.put("translated_elements", this.LLILZLL);
                    linkedHashMap.put("translated_elements_count", Integer.valueOf(this.LLIZ));
                    return linkedHashMap;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ClickTransSurveyButtonParam(authorId=");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(", buttonType=");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(", enterFrom=");
                    sbLIZ.append(this.LLILLL);
                    sbLIZ.append(", groupId=");
                    sbLIZ.append(this.LLILZ);
                    sbLIZ.append(", targetLang=");
                    sbLIZ.append(this.LLILZIL);
                    sbLIZ.append(", translatedElements=");
                    sbLIZ.append(this.LLILZLL);
                    sbLIZ.append(", translatedElementsCount=");
                    sbLIZ.append(this.LLIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> filteredParams() {
                    return keyParams();
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> getExtraParam() {
                    return C2097608Jq.LJ();
                }

                {
                    this.LL = str2;
                    this.LLILLJJLI = strValue;
                    this.LLILLL = str3;
                    this.LLILZ = str4;
                    this.LLILZIL = str5;
                    this.LLILZLL = strLJJLIIIJ;
                    this.LLIZ = size;
                }
            }), 16);
        }
    }

    public final void LJIIIIZZ(C207088161u c207088161u) {
        if (c207088161u != null) {
            List<EnumC207101162h> list = c207088161u.LIZIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<EnumC207101162h> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = this.LLJJJJ.get(it2.next());
                if (str != null) {
                    arrayList.add(str);
                }
            }
            final String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            C207085161r c207085161r = new C017D() { // from class: X.161r
                @Override // X.C017D
                public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list2) {
                    return C13BV.INSTANCE;
                }
            };
            AnonymousClass0175 anonymousClass0175 = new AnonymousClass0175();
            final String str2 = c207088161u.LIZJ;
            final String str3 = c207088161u.LIZLLL;
            final String str4 = c207088161u.LJ;
            final String strValue = c207088161u.LJIIJ.getStrValue();
            final String str5 = c207088161u.LJFF;
            C207069161b.LJ(ShowSecondaryTransSurveyOptionsEvent.class, c207085161r, anonymousClass0175, Collections.singletonList(new InterfaceC0241006d(str2, str3, str4, strLJJLIIIJ, strValue, str5) { // from class: X.006x
                public final String LL;
                public final String LLILLJJLI;
                public final String LLILLL;
                public final String LLILZ;
                public final String LLILZIL;
                public final String LLILZLL;

                @Override // X.InterfaceC1282004zy
                public final boolean checkExtraParamKey() {
                    return false;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0261006x)) {
                        return false;
                    }
                    C0261006x c0261006x = (C0261006x) obj;
                    return Intrinsics.LJFF(this.LL, c0261006x.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0261006x.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0261006x.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0261006x.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0261006x.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0261006x.LLILZLL);
                }

                public final int hashCode() {
                    String str6 = this.LL;
                    int iHashCode = (str6 == null ? 0 : str6.hashCode()) * 31;
                    String str7 = this.LLILLJJLI;
                    int iHashCode2 = (iHashCode + (str7 == null ? 0 : str7.hashCode())) * 31;
                    String str8 = this.LLILLL;
                    int iHashCode3 = (((((iHashCode2 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
                    String str9 = this.LLILZLL;
                    return iHashCode3 + (str9 != null ? str9.hashCode() : 0);
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> keyParams() {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("author_id", this.LL);
                    linkedHashMap.put("enter_from", this.LLILLJJLI);
                    linkedHashMap.put("group_id", this.LLILLL);
                    linkedHashMap.put("showed_options", this.LLILZ);
                    linkedHashMap.put("survey_type", this.LLILZIL);
                    linkedHashMap.put("target_lang", this.LLILZLL);
                    return linkedHashMap;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ShowSecondaryTransSurveyOptionsParam(authorId=");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(", enterFrom=");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(", groupId=");
                    sbLIZ.append(this.LLILLL);
                    sbLIZ.append(", showedOptions=");
                    sbLIZ.append(this.LLILZ);
                    sbLIZ.append(", surveyType=");
                    sbLIZ.append(this.LLILZIL);
                    sbLIZ.append(", targetLang=");
                    sbLIZ.append(this.LLILZLL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> filteredParams() {
                    return keyParams();
                }

                @Override // X.InterfaceC1282004zy
                public final Map<String, Object> getExtraParam() {
                    return C2097608Jq.LJ();
                }

                {
                    this.LL = str2;
                    this.LLILLJJLI = str3;
                    this.LLILLL = str4;
                    this.LLILZ = strLJJLIIIJ;
                    this.LLILZIL = strValue;
                    this.LLILZLL = str5;
                }
            }), 16);
        }
    }

    public final void LJIIIZ(boolean z) {
        EnumC207090161w enumC207090161w;
        C207088161u c207088161u = this.LLJJIJIL;
        EnumC207090161w enumC207090161w2 = null;
        if (c207088161u != null) {
            enumC207090161w = c207088161u.LJIIJ;
        } else {
            enumC207090161w = null;
        }
        int i = 8;
        if (enumC207090161w == EnumC207090161w.THUMB_DOWN) {
            TuxIconView tuxIconView = this.LLILZIL;
            tuxIconView.setClickable(false);
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            FrameLayout frameLayout = this.LLIZ;
            frameLayout.setClickable(false);
            C786410Ut5.LJZ(8, frameLayout);
            TuxIconView tuxIconView2 = this.LLILZLL;
            tuxIconView2.setClickable(false);
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            FrameLayout frameLayout2 = this.LLIZLLLIL;
            frameLayout2.setClickable(false);
            C786410Ut5.LJZ(0, frameLayout2);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, getContext());
            if (numLIZJ != null) {
                this.LLILZLL.setTintColor(numLIZJ.intValue());
                return;
            }
            return;
        }
        if (c207088161u != null) {
            enumC207090161w2 = c207088161u.LJIIJ;
        }
        if (enumC207090161w2 != EnumC207090161w.THUMB_UP) {
            return;
        }
        TuxIconView tuxIconView3 = this.LLILZIL;
        tuxIconView3.setClickable(false);
        C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
        FrameLayout frameLayout3 = this.LLIZ;
        frameLayout3.setClickable(false);
        C786410Ut5.LJZ(0, frameLayout3);
        TuxIconView tuxIconView4 = this.LLILZLL;
        tuxIconView4.setClickable(false);
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        FrameLayout frameLayout4 = this.LLIZLLLIL;
        frameLayout4.setClickable(false);
        if (!z) {
            i = 4;
        }
        C786410Ut5.LJZ(i, frameLayout4);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, getContext());
        if (numLIZJ2 == null) {
            return;
        }
        this.LLILZIL.setTintColor(numLIZJ2.intValue());
    }

    public C207086161s(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        Integer numValueOf;
        Integer numValueOf2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        super(context, null, 0);
        this.LL = "TranslFeedbackLayout";
        C20703515zt.LIZ.getClass();
        this.LLILLJJLI = C20703515zt.LIZIZ.LIZLLL();
        this.LLJJIJIIJIL = true;
        this.LLJJJ = new LinkedHashMap();
        EnumC207101162h enumC207101162h = EnumC207101162h.DESCRIPTION;
        EnumC207101162h enumC207101162h2 = EnumC207101162h.CAPTION;
        EnumC207101162h enumC207101162h3 = EnumC207101162h.STICKER;
        this.LLJJJIL = C2097608Jq.LJIIIIZZ(new Pair(enumC207101162h, context.getString(2131850748)), new Pair(enumC207101162h2, context.getString(2131850749)), new Pair(enumC207101162h3, context.getString(2131850750)));
        this.LLJJJJ = C2097608Jq.LJIIIIZZ(new Pair(enumC207101162h, "description"), new Pair(enumC207101162h2, "caption"), new Pair(enumC207101162h3, "sticker"));
        this.LLJJJJJIL = context.getString(2131850752);
        this.LLJJJJLIIL = context.getString(2131850753);
        this.LLJJL = context.getString(2131850754);
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
        View viewSd = C786410Ut5.Sd(R.layout.adb, C786410Ut5.ne(context), this);
        C426160GnO c426160GnO = (C426160GnO) viewSd.findViewById(R.id.yiq);
        c426160GnO.setGravity(-1);
        this.LLILZ = c426160GnO;
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.cvw);
        tuxIconView.setPivotX(C418440Gaw.LIZIZ(0));
        tuxIconView.setPivotY(C418440Gaw.LIZIZ(18));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZ = R.raw.icon_thumbs_up_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZLLL = Integer.valueOf(R.attr.a1k);
        tuxIconView.setImageDrawable(c419910GdJ.LIZ(context));
        this.LLILZIL = tuxIconView;
        FrameLayout frameLayout = (FrameLayout) viewSd.findViewById(R.id.cvx);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        frameLayout.setBackground(c384050F3z.LIZ(context));
        this.LLIZ = frameLayout;
        TuxIconView tuxIconView2 = (TuxIconView) viewSd.findViewById(R.id.cvu);
        tuxIconView2.setPivotX(C418440Gaw.LIZIZ(18));
        tuxIconView2.setPivotY(C418440Gaw.LIZIZ(0));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ2.LIZ = R.raw.icon_thumbs_down_fill;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
        c419910GdJ2.LIZLLL = Integer.valueOf(R.attr.a1k);
        tuxIconView2.setImageDrawable(c419910GdJ2.LIZ(context));
        this.LLILZLL = tuxIconView2;
        FrameLayout frameLayout2 = (FrameLayout) viewSd.findViewById(R.id.cvv);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        frameLayout2.setBackground(c384050F3z2.LIZ(context));
        this.LLIZLLLIL = frameLayout2;
        LinearLayout linearLayout = (LinearLayout) viewSd.findViewById(R.id.me2);
        C384050F3z c384050F3z3 = new C384050F3z();
        if (C0SXF.LJIL(context)) {
            numValueOf = Integer.valueOf(R.attr.dz);
        } else {
            numValueOf = Integer.valueOf(R.attr.zq);
        }
        c384050F3z3.LIZIZ = numValueOf;
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        linearLayout.setBackground(c384050F3z3.LIZ(context));
        this.LLJ = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) viewSd.findViewById(R.id.mb3);
        C384050F3z c384050F3z4 = new C384050F3z();
        if (C0SXF.LJIL(context)) {
            numValueOf2 = Integer.valueOf(R.attr.dz);
        } else {
            numValueOf2 = Integer.valueOf(R.attr.zq);
        }
        c384050F3z4.LIZIZ = numValueOf2;
        c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        linearLayout2.setBackground(c384050F3z4.LIZ(context));
        this.LLJI = linearLayout2;
        C197039127h c197039127h = (C197039127h) viewSd.findViewById(R.id.cve);
        this.LLJIJIL = c197039127h;
        C197039127h c197039127h2 = (C197039127h) viewSd.findViewById(R.id.co3);
        this.LLJILJIL = (TuxTextView) viewSd.findViewById(R.id.xml);
        C786410Ut5.a9(tuxIconView, new ACListenerS165S0100000_31(this, 247));
        C786410Ut5.O7(frameLayout, new ACListenerS165S0100000_31(this, 248));
        C786410Ut5.a9(tuxIconView2, new ACListenerS165S0100000_31(this, 249));
        C786410Ut5.O7(frameLayout2, new ACListenerS165S0100000_31(this, 250));
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.161t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnimatorSet submitOrCancelAnimSet = this.LL.getSubmitOrCancelAnimSet();
                if (submitOrCancelAnimSet != null) {
                    submitOrCancelAnimSet.start();
                }
                Collection collectionValues = ((LinkedHashMap) this.LL.LLJJJ).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) it2.next()).booleanValue()) {
                            this.LL.LJIIIZ(false);
                            this.LL.LJII();
                            C207086161s c207086161s = this.LL;
                            C207088161u c207088161u = c207086161s.LLJJIJIL;
                            if (c207088161u != null && c207088161u.LJIIIZ) {
                                Map<EnumC207101162h, Boolean> map = c207086161s.LLJJJ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                                    if (((Boolean) entry.getValue()).booleanValue()) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                Set setKeySet = linkedHashMap.keySet();
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = setKeySet.iterator();
                                while (it3.hasNext()) {
                                    String str = c207086161s.LLJJJJ.get(it3.next());
                                    if (str != null) {
                                        arrayList.add(str);
                                    }
                                }
                                C207069161b.LJ(SubmitSecondaryTransSurveyOptionsEvent.class, new C017D() { // from class: X.017I
                                    @Override // X.C017D
                                    public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list) {
                                        return C13BV.INSTANCE;
                                    }
                                }, new AnonymousClass0175(), Collections.singletonList(new InterfaceC0241006d(c207088161u.LIZJ, c207088161u.LIZLLL, c207088161u.LJ, C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62), c207088161u.LJIIJ.getStrValue(), c207088161u.LJFF) { // from class: X.006y
                                    public final String LL;
                                    public final String LLILLJJLI;
                                    public final String LLILLL;
                                    public final String LLILZ;
                                    public final String LLILZIL;
                                    public final String LLILZLL;

                                    @Override // X.InterfaceC1282004zy
                                    public final boolean checkExtraParamKey() {
                                        return false;
                                    }

                                    public final boolean equals(Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        if (!(obj instanceof C0262006y)) {
                                            return false;
                                        }
                                        C0262006y c0262006y = (C0262006y) obj;
                                        return Intrinsics.LJFF(this.LL, c0262006y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0262006y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0262006y.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0262006y.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0262006y.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0262006y.LLILZLL);
                                    }

                                    public final int hashCode() {
                                        String str2 = this.LL;
                                        int iHashCode = (str2 == null ? 0 : str2.hashCode()) * 31;
                                        String str3 = this.LLILLJJLI;
                                        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
                                        String str4 = this.LLILLL;
                                        int iHashCode3 = (((((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
                                        String str5 = this.LLILZLL;
                                        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
                                    }

                                    @Override // X.InterfaceC1282004zy
                                    public final Map<String, Object> keyParams() {
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        linkedHashMap2.put("author_id", this.LL);
                                        linkedHashMap2.put("enter_from", this.LLILLJJLI);
                                        linkedHashMap2.put("group_id", this.LLILLL);
                                        linkedHashMap2.put("selected_options", this.LLILZ);
                                        linkedHashMap2.put("survey_type", this.LLILZIL);
                                        linkedHashMap2.put("target_lang", this.LLILZLL);
                                        return linkedHashMap2;
                                    }

                                    public final String toString() {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("SubmitSecondaryTransSurveyOptionsParam(authorId=");
                                        sbLIZ.append(this.LL);
                                        sbLIZ.append(", enterFrom=");
                                        sbLIZ.append(this.LLILLJJLI);
                                        sbLIZ.append(", groupId=");
                                        sbLIZ.append(this.LLILLL);
                                        sbLIZ.append(", selectedOptions=");
                                        sbLIZ.append(this.LLILZ);
                                        sbLIZ.append(", surveyType=");
                                        sbLIZ.append(this.LLILZIL);
                                        sbLIZ.append(", targetLang=");
                                        sbLIZ.append(this.LLILZLL);
                                        sbLIZ.append(')');
                                        return C2188811AlT.LIZIZ(sbLIZ);
                                    }

                                    @Override // X.InterfaceC1282004zy
                                    public final Map<String, Object> filteredParams() {
                                        return keyParams();
                                    }

                                    @Override // X.InterfaceC1282004zy
                                    public final Map<String, Object> getExtraParam() {
                                        return C2097608Jq.LJ();
                                    }

                                    {
                                        this.LL = str;
                                        this.LLILLJJLI = str;
                                        this.LLILLL = str;
                                        this.LLILZ = str;
                                        this.LLILZIL = str;
                                        this.LLILZLL = str;
                                    }
                                }), 16);
                            }
                            C207086161s c207086161s2 = this.LL;
                            C207088161u c207088161u2 = c207086161s2.LLJJIJIL;
                            if (c207088161u2 == null) {
                                return;
                            }
                            c207086161s2.LLILLJJLI.insertInfo(c207088161u2.LIZ, c207088161u2);
                            return;
                        }
                    }
                }
                this.LL.LIZLLL();
            }
        });
        C786410Ut5.U8(c197039127h2, new ACListenerS165S0100000_31(this, 251));
        if (this.LLJILJILJ == null) {
            Interpolator interpolatorLIZLLL = C1619980sG4.LIZLLL();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.setInterpolator(interpolatorLIZLLL);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView2, "rotation", 0.0f, -15.0f, 3.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(350L);
            objectAnimatorOfFloat2.setInterpolator(interpolatorLIZLLL);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            if (numLIZJ != null) {
                iIntValue3 = numLIZJ.intValue();
            } else {
                iIntValue3 = 0;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, getContext());
            if (numLIZJ2 != null) {
                iIntValue4 = numLIZJ2.intValue();
            } else {
                iIntValue4 = 0;
            }
            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(iIntValue3, iIntValue4);
            valueAnimatorOfArgb.setDuration(150L);
            valueAnimatorOfArgb.setInterpolator(interpolatorLIZLLL);
            valueAnimatorOfArgb.addUpdateListener(new AUListenerS278S0100000_31(this, 64));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat2, valueAnimatorOfArgb, objectAnimatorOfFloat);
            animatorSet.addListener(new AAListenerS341S0100000_31(this, 31));
            this.LLJILJILJ = animatorSet;
        }
        LIZJ();
        if (this.LLJILLL == null) {
            Interpolator interpolatorLIZLLL2 = C1619980sG4.LIZLLL();
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxIconView, "rotation", 0.0f, -15.0f, 3.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(350L);
            objectAnimatorOfFloat3.setInterpolator(interpolatorLIZLLL2);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a00, getContext());
            if (numLIZJ4 != null) {
                iIntValue2 = numLIZJ4.intValue();
            } else {
                iIntValue2 = 0;
            }
            ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(iIntValue, iIntValue2);
            valueAnimatorOfArgb2.setDuration(150L);
            valueAnimatorOfArgb2.setInterpolator(interpolatorLIZLLL2);
            valueAnimatorOfArgb2.addUpdateListener(new AUListenerS278S0100000_31(this, 65));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfFloat3, valueAnimatorOfArgb2);
            animatorSet2.addListener(new AAListenerS341S0100000_31(this, 32));
            this.LLJILLL = animatorSet2;
        }
        LIZIZ();
        LIZ();
    }
}
