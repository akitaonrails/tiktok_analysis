package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.feedback.EcommerceSearchMiddleFeedback;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS124S1100000_10;
import kotlin.jvm.internal.AwS139S0400000_10;
import kotlin.jvm.internal.AwS23S1101000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qs0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683820Qs0 extends AbstractC683850Qs3 {
    public static WeakReference<C1389890mGx> LLILLL;

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        String containerID;
        View view;
        C19EG c19eg;
        Object parent;
        Context context;
        LinearLayout linearLayout;
        View view2;
        View view3;
        Activity activityLIZIZ;
        C19EG c19eg2;
        Activity activityLIZIZ2;
        final InterfaceC683840Qs2 interfaceC683840Qs2 = (InterfaceC683840Qs2) xBaseParamModel;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        if (interfaceC683840Qs2.getWordContent().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        AttributeSet attributeSet = null;
        if (!z && interfaceC683840Qs2.getWordGroupId().length() != 0 && interfaceC683840Qs2.getWordImageUrl().length() != 0 && interfaceC683840Qs2.getSearchPosition().length() != 0 && interfaceC683840Qs2.getSearchlogId().length() != 0 && interfaceC683840Qs2.getSearchEntrance().length() != 0) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
                ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = (ISearchSuggestSubPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), ISearchSuggestSubPageAbility.class, null);
                if (iSearchSuggestSubPageAbility != null) {
                    iSearchSuggestSubPageAbility.Rz1();
                }
                LLILLL = null;
                SAFHelper.LIZ.getClass();
                Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
                if (activityLJIIIIZZ == null && C1205604ne.LIZ()) {
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ != null && (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) != null) {
                        activityLIZIZ = C737910Sx3.LIZIZ(activityLIZIZ2);
                    } else {
                        activityLIZIZ = null;
                    }
                    if (activityLIZIZ instanceof C19EG) {
                        c19eg2 = (C19EG) activityLIZIZ;
                    } else {
                        c19eg2 = null;
                    }
                    if (((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLIIIJJI(c19eg2)) {
                        activityLJIIIIZZ = c19eg2;
                    }
                }
                if ((activityLJIIIIZZ instanceof C19EG) && (c19eg = (C19EG) activityLJIIIIZZ) != null) {
                    ViewParent parent2 = view.getParent();
                    if (parent2 != null) {
                        parent = parent2.getParent();
                    } else {
                        parent = null;
                    }
                    if (((parent instanceof View) && (view3 = (View) parent) != null && (context = view3.getContext()) != null) || (context = view.getContext()) != null) {
                        View viewSd = C786410Ut5.Sd(R.layout.br1, C786410Ut5.ne(context), null);
                        ((TextView) viewSd.findViewById(R.id.gjv)).setText(interfaceC683840Qs2.getWordContent());
                        SmartImageView smartImageView = (SmartImageView) viewSd.findViewById(R.id.gjw);
                        C1331750klB c1331750klB = new C1331750klB();
                        c1331750klB.LJ = C418440Gaw.LIZIZ(4);
                        smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
                        smartImageView.setImageURI(interfaceC683840Qs2.getWordImageUrl());
                        if ((viewSd instanceof LinearLayout) && (linearLayout = (LinearLayout) viewSd) != null) {
                            EcommerceSearchMiddleFeedback.FeedbackQuestion[] feedbackQuestionArrLIZ = EcommerceSearchMiddleFeedback.LIZ().LIZ();
                            if (feedbackQuestionArrLIZ == null) {
                                feedbackQuestionArrLIZ = EcommerceSearchMiddleFeedback.LIZ;
                            }
                            int length = feedbackQuestionArrLIZ.length;
                            int i = 0;
                            while (i < length) {
                                EcommerceSearchMiddleFeedback.FeedbackQuestion feedbackQuestion = feedbackQuestionArrLIZ[i];
                                Integer index = feedbackQuestion.getIndex();
                                String value = feedbackQuestion.getValue();
                                if (index != null && value != null) {
                                    final int iIntValue = index.intValue();
                                    final AwS139S0400000_10 awS139S0400000_10 = new AwS139S0400000_10(this, feedbackQuestion, interfaceC683840Qs2, linearLayout, 1);
                                    TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, r0 == true ? 1 : 0);
                                    tuxTextView.setText(value);
                                    tuxTextView.setSingleLine(true);
                                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                                    tuxTextView.setTuxFont(41);
                                    tuxTextView.setTextColorRes(R.attr.a1h);
                                    StateListDrawable stateListDrawable = new StateListDrawable();
                                    int[] iArr = new int[1];
                                    iArr[r0 == true ? 1 : 0] = 16842919;
                                    C384050F3z c384050F3z = new C384050F3z();
                                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                                    c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                                    c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.nf, context);
                                    c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.nh, context);
                                    stateListDrawable.addState(iArr, c384050F3z.LIZ(context));
                                    C384050F3z c384050F3z2 = new C384050F3z();
                                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                                    c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                                    c384050F3z2.LIZ = C1308910kAL.LIZJ(R.attr.c5, context);
                                    c384050F3z2.LJ = C1308910kAL.LIZJ(R.attr.nh, context);
                                    stateListDrawable.addState(new int[0], c384050F3z2.LIZ(context));
                                    tuxTextView.setBackgroundDrawable(stateListDrawable);
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
                                    layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
                                    tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                                    C786410Ut5.R6(tuxTextView, layoutParams);
                                    tuxTextView.setLongClickable(true);
                                    tuxTextView.setClickable(true);
                                    view2 = view;
                                    final View view4 = view;
                                    C786410Ut5.h9(tuxTextView, new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Qs1
                                        @Override // X.AbstractViewOnClickListenerC1637610siV
                                        public final void LIZ(View view5) {
                                            C1389890mGx c1389890mGx = new C1389890mGx(view4);
                                            String strLIZJ = EcommerceSearchMiddleFeedback.LIZ().LIZJ();
                                            if (strLIZJ == null) {
                                                strLIZJ = EcommerceSearchMiddleFeedback.LIZJ;
                                            }
                                            c1389890mGx.LJIIJ(strLIZJ);
                                            WeakReference<C1389890mGx> weakReference = C683820Qs0.LLILLL;
                                            C683820Qs0.LLILLL = new WeakReference<>(c1389890mGx);
                                            C683820Qs0 c683820Qs0 = this;
                                            InterfaceC683840Qs2 interfaceC683840Qs22 = interfaceC683840Qs2;
                                            int i2 = iIntValue;
                                            String strValueOf = String.valueOf(c1389890mGx.hashCode());
                                            c683820Qs0.getClass();
                                            C1018703yb.LIZLLL("mall_search_text_submit", new AwS23S1101000_10(interfaceC683840Qs22, i2, strValueOf, 0));
                                            c1389890mGx.LJIIJJI();
                                            C683820Qs0 c683820Qs02 = this;
                                            InterfaceC683840Qs2 interfaceC683840Qs23 = interfaceC683840Qs2;
                                            String strValueOf2 = String.valueOf(c1389890mGx.hashCode());
                                            c683820Qs02.getClass();
                                            C1018703yb.LIZLLL("mall_search_feedback_toast_show", new AwS124S1100000_10(interfaceC683840Qs23, strValueOf2, 2));
                                            IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
                                            JSONObject jSONObject = new JSONObject();
                                            InterfaceC683840Qs2 interfaceC683840Qs24 = interfaceC683840Qs2;
                                            try {
                                                jSONObject.put("wordContent", interfaceC683840Qs24.getWordContent());
                                                C189200o6.m2constructorimpl(jSONObject.put("wordGroupId", interfaceC683840Qs24.getWordGroupId()));
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                C189200o6.m2constructorimpl(new C098200Yq(th));
                                            }
                                            iEventCenter.LIZ("ecSearchMiddleFeedbackEvent", C786410Ut5.J3(jSONObject));
                                            awS139S0400000_10.invoke();
                                        }
                                    });
                                    linearLayout.addView(tuxTextView);
                                } else {
                                    view2 = view;
                                }
                                i++;
                                r0 = 0;
                                attributeSet = null;
                                view = view2;
                            }
                        }
                        C1390920mIc c1390920mIc = new C1390920mIc(r0, r0);
                        C0OM1 c0om1 = new C0OM1();
                        C1250250idj c1250250idj = new C1250250idj();
                        String strLIZIZ = EcommerceSearchMiddleFeedback.LIZ().LIZIZ();
                        if (strLIZIZ == null) {
                            strLIZIZ = EcommerceSearchMiddleFeedback.LIZIZ;
                        }
                        c1250250idj.LIZJ = strLIZIZ;
                        c0om1.LIZJ = c1250250idj;
                        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
                        C1251150ifB c1251150ifB = new C1251150ifB();
                        c1251150ifB.LIZLLL();
                        c1251150ifB.LIZJ = R.raw.icon_x_mark;
                        c1251150ifB.LIZJ(new AwS554S0100000_10(viewSd, 158));
                        abstractC1250290idnArr[r0] = c1251150ifB;
                        c0om1.LIZIZ(abstractC1250290idnArr);
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLJJIJIL = c0om1;
                        tuxSheet.LLJJJ = null;
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
                        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                        tuxSheet2.LLJI = numLIZJ;
                        tuxSheet2.LLJJIII = viewSd;
                        c1390920mIc.LJIIIIZZ(1);
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(400));
                        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
                        tuxSheet3.LLJJL = iLIZIZ;
                        tuxSheet3.LLJLILLLLZIIL = r0;
                        tuxSheet3.LLJLL = true;
                        tuxSheet3.LLILLJJLI = new C0R49(this, interfaceC683840Qs2, 0);
                        tuxSheet3.show(c19eg.getSupportFragmentManager(), "EcSearchMiddleFeedbackSheet");
                        C1018703yb.LIZLLL("mall_click_search_feedback", new AwS124S1100000_10(interfaceC683840Qs2, "open", 1));
                    }
                }
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC683860Qs4.class, containerID), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 1, "params is empty string", null, 4);
    }
}
