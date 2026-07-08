package X;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS118S1200000_1;
import kotlin.jvm.internal.AwS30S2200000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03EF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03EF extends TuxTextView {
    public Function0<Unit> LLJJJJ;
    public long LLJJJJJIL;

    public C03EF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Function0<Unit> function0;
        SpannableString spannableString;
        Object[] spans;
        if (!isEnabled()) {
            return false;
        }
        if (((getText() instanceof SpannableString) || (getText() instanceof SpannedString)) && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.LLJJJJJIL > 300) {
                this.LLJJJJJIL = jElapsedRealtime;
                int iU3 = C786410Ut5.U3(getLayout(), getLayout().getLineForVertical((int) (motionEvent.getY() + getTotalPaddingTop() + getScrollY())), (motionEvent.getX() - getTotalPaddingLeft()) + getScrollX());
                CharSequence text = getText();
                if ((!(text instanceof SpannableString) || (spannableString = (SpannableString) text) == null || (spans = spannableString.getSpans(iU3, iU3, ClickableSpan.class)) == null || C13LQ.LJJIIZ(0, spans) == null) && (function0 = this.LLJJJJ) != null) {
                    function0.invoke();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDefaultClickListener(Function0<Unit> function0) {
        this.LLJJJJ = function0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C03EF(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z4;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJJJJ(C03EF c03ef, final Context context, final LogisticLinkRichText logisticLinkRichText, final int i, int i2, AwS118S1200000_1 awS118S1200000_1, AwS30S2200000_1 awS30S2200000_1, int i3) {
        int iIntValue;
        int iIntValue2;
        C03EH c03eh;
        boolean z;
        AwS30S2200000_1 awS30S2200000_12 = null;
        if ((i3 & 128) != 0) {
            awS118S1200000_1 = null;
        }
        if ((i3 & 256) == 0) {
            awS30S2200000_12 = awS30S2200000_1;
        }
        c03ef.getClass();
        String str = logisticLinkRichText.template;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            c03ef.setMovementMethod(LinkMovementMethod.getInstance());
            ArrayList<C03EI> arrayList = new ArrayList();
            String str2 = logisticLinkRichText.template;
            if (str2 != null && str2.length() != 0) {
                ArrayList arrayList2 = new ArrayList();
                Map<String, LogisticLinkText> map = logisticLinkRichText.arguments;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        LogisticLinkText logisticLinkText = map.get(str3);
                        if (logisticLinkText != null) {
                            int iLJJJ = a0.LJJJ(str2, str3, z2 ? 1 : 0, z2, 6);
                            if (iLJJJ == -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            IEnsure iEnsure = C1AF0.LIZ;
                            if (iEnsure != null) {
                                iEnsure.ensureFalse(z, "logistic rich link text key not found");
                            }
                            if (iLJJJ >= 0) {
                                arrayList2.add(new C443120HZe(Integer.valueOf(iLJJJ), Integer.valueOf(iLJJJ + str3.length()), logisticLinkText));
                            }
                            z2 = false;
                        }
                    }
                }
                int iIntValue3 = 0;
                for (C443120HZe c443120HZe : C13LP.LJLLLL(new C512401z8(71), arrayList2)) {
                    if (iIntValue3 < ((Number) c443120HZe.getFirst()).intValue()) {
                        arrayList.add(new C03EI(new LogisticLinkText(str2.substring(iIntValue3, ((Number) c443120HZe.getFirst()).intValue()), null, null, null, null, null, null, null, logisticLinkRichText.textColorType, logisticLinkRichText.textFontType, null), C03EH.TEXT));
                    }
                    LogisticLinkText logisticLinkText2 = (LogisticLinkText) c443120HZe.getThird();
                    if (Intrinsics.LJFF(((LogisticLinkText) c443120HZe.getThird()).replaceWithIcon, Boolean.TRUE)) {
                        c03eh = C03EH.ICON;
                    } else {
                        c03eh = C03EH.TEXT;
                    }
                    arrayList.add(new C03EI(logisticLinkText2, c03eh));
                    iIntValue3 = ((Number) c443120HZe.getSecond()).intValue();
                }
                if (iIntValue3 != str2.length()) {
                    arrayList.add(new C03EI(new LogisticLinkText(str2.substring(iIntValue3), null, null, null, null, null, null, null, logisticLinkRichText.textColorType, logisticLinkRichText.textFontType, null), C03EH.TEXT));
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (final C03EI c03ei : arrayList) {
                String str4 = c03ei.LIZ.text;
                if (str4 != null) {
                    int i4 = C03EG.LIZ[c03ei.LIZIZ.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_info_circle;
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                            C786410Ut5.q2(spannableStringBuilder2, c419910GdJ.LIZIZ(0, context), 0, spannableStringBuilder2.length(), 17);
                            if (awS118S1200000_1 != null) {
                                awS118S1200000_1.invoke();
                            }
                            C786410Ut5.q2(spannableStringBuilder2, new C04J8(awS30S2200000_12, 3), 0, spannableStringBuilder2.length(), 17);
                            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str4);
                        Integer num = c03ei.LIZ.textColorType;
                        Integer num2 = logisticLinkRichText.textColorType;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = i;
                        }
                        C786410Ut5.q2(spannableStringBuilder3, new ForegroundColorSpan(C960203pA.LIZ(C7736030k.LIZ(num, Integer.valueOf(iIntValue)), context)), 0, str4.length(), 17);
                        Integer num3 = c03ei.LIZ.textFontType;
                        Integer num4 = logisticLinkRichText.textFontType;
                        if (num4 != null) {
                            iIntValue2 = num4.intValue();
                        } else {
                            iIntValue2 = i2;
                        }
                        C786410Ut5.q2(spannableStringBuilder3, new C444920HcY(C7736030k.LIZJ(num3, Integer.valueOf(iIntValue2)), false), 0, str4.length(), 17);
                        String str5 = c03ei.LIZ.link;
                        if (str5 != null && C770702zh.LIZ(str5)) {
                            final AddonPanelInfo addonPanelInfo = null;
                            final Object[] objArr = null == true ? 1 : 0;
                            final Object[] objArr2 = null == true ? 1 : 0;
                            C786410Ut5.q2(spannableStringBuilder3, new ClickableSpan() { // from class: X.038J
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) throws JSONException {
                                    boolean z3;
                                    AddonPanelInfo addonPanelInfo2 = addonPanelInfo;
                                    String str6 = c03ei.LIZ.link;
                                    if (addonPanelInfo2 != null && Intrinsics.LJFF(str6, "ecom_osp_addon_free_shipping_intercept")) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    Function1<Boolean, Unit> function1 = objArr;
                                    if (function1 != null) {
                                        function1.invoke(Boolean.valueOf(z3));
                                    }
                                    if (!z3) {
                                        JSONObject jSONObject = new JSONObject();
                                        HashMap<String, Object> map2 = objArr2;
                                        jSONObject.put("previous_page", "order_submit");
                                        if (map2 != null) {
                                            Object obj = map2.get("source");
                                            if (obj != null) {
                                                jSONObject.put("source", obj);
                                            }
                                            Object obj2 = map2.get("source_from");
                                            if (obj2 != null) {
                                                jSONObject.put("source_from", obj2);
                                            }
                                            Object obj3 = map2.get("source_page_type");
                                            if (obj3 != null) {
                                                jSONObject.put("source_page_type", obj3);
                                            }
                                            Object obj4 = map2.get("entrance_info");
                                            if (obj4 != null) {
                                                jSONObject.put("entrance_info", obj4);
                                            }
                                        }
                                        HashMap map3 = new HashMap();
                                        map3.put("trackParams", C786410Ut5.J3(jSONObject));
                                        SmartRouter.buildRoute(context, C919503ib.LIZJ(c03ei.LIZ.link, map3).toString()).open();
                                    }
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    int iIntValue4;
                                    int iLIZ;
                                    int iIntValue5;
                                    try {
                                        if (c03ei.LIZ.color != null && !C1744700vVE.LJ(context, null)) {
                                            iLIZ = Color.parseColor(c03ei.LIZ.color);
                                        } else if (c03ei.LIZ.darkColor != null && C1744700vVE.LJ(context, null)) {
                                            iLIZ = Color.parseColor(c03ei.LIZ.darkColor);
                                        } else {
                                            Integer num5 = c03ei.LIZ.textColorType;
                                            Integer num6 = logisticLinkRichText.textColorType;
                                            if (num6 != null) {
                                                iIntValue5 = num6.intValue();
                                            } else {
                                                iIntValue5 = i;
                                            }
                                            iLIZ = C7736030k.LIZ(num5, Integer.valueOf(iIntValue5));
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        Integer num7 = c03ei.LIZ.textColorType;
                                        Integer num8 = logisticLinkRichText.textColorType;
                                        if (num8 != null) {
                                            iIntValue4 = num8.intValue();
                                        } else {
                                            iIntValue4 = i;
                                        }
                                        iLIZ = C7736030k.LIZ(num7, Integer.valueOf(iIntValue4));
                                    }
                                    textPaint.setColor(iLIZ);
                                    textPaint.setUnderlineText(Intrinsics.LJFF(c03ei.LIZ.hasUnderscore, Boolean.TRUE));
                                }
                            }, 0, str4.length(), 17);
                        }
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
                    }
                }
            }
            c03ef.setText(spannableStringBuilder);
        }
    }
}
