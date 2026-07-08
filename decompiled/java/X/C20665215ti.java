package X;

import Y.ACListenerS165S0100000_31;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.activestatus.api.model.ActivityStatus;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20665215ti extends FrameLayout {
    public final InterfaceC20663615tS LL;
    public final ConstraintLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final FrameLayout LLILZIL;
    public final FrameLayout LLILZLL;
    public final FrameLayout LLIZ;
    public final LinearLayout LLIZLLLIL;
    public final C20666315tt LLJ;
    public final C896560ZFe LLJI;
    public final C20665915tp LLJIJIL;
    public final C20665515tl LLJILJIL;
    public final C20665815to LLJILJILJ;

    public final void LIZJ() {
        LinearLayout linearLayout = this.LLIZLLLIL;
        int childCount = linearLayout.getChildCount();
        int iLIZIZ = 0;
        for (int i = 0; i < childCount; i++) {
            linearLayout.getChildAt(i);
            if (getVisibility() == 0) {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
            }
            if (getVisibility() == 0) {
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
            }
        }
        FrameLayout frameLayout = this.LLILZ;
        View childAt = this.LLILZIL.getChildAt(0);
        if (childAt != null && childAt.getVisibility() == 8) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), iLIZIZ, frameLayout.getPaddingBottom());
    }

    public final ConstraintLayout getContentContainer() {
        return this.LLILLJJLI;
    }

    public final C20666315tt getInnerPushLeftView() {
        return this.LLJ;
    }

    public final FrameLayout getRightContainer() {
        return this.LLILZIL;
    }

    public final void LIZ(C20663815tU c20663815tU) {
        ViewGroup viewGroup;
        View view = c20663815tU.LIZIZ;
        ViewParent parent = null;
        if (view != null) {
            parent = view.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(c20663815tU.LIZIZ, viewGroup);
        }
        int i = c20663815tU.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("addAreaView area:");
                                sbLIZ.append(c20663815tU.LIZ);
                                sbLIZ.append(" is unsupport");
                                C19290510dT.LIZIZ("InnerPushView", C2188811AlT.LIZIZ(sbLIZ));
                            } else {
                                C786410Ut5.LJJJJIZL(this.LLIZ);
                                this.LLIZ.addView(c20663815tU.LIZIZ);
                            }
                        } else {
                            C786410Ut5.LJJJJIZL(this.LLILZLL);
                            this.LLILZLL.addView(c20663815tU.LIZIZ);
                        }
                    } else {
                        C786410Ut5.LJJJJIZL(this.LLILZIL);
                        this.LLILZIL.addView(c20663815tU.LIZIZ);
                        View view2 = c20663815tU.LIZIZ;
                        if (view2 != null && view2.getVisibility() == 0) {
                            C337180DJs.LIZJ(this.LLILZIL);
                        }
                    }
                } else {
                    C786410Ut5.LJJJJIZL(this.LLILZ);
                    this.LLILZ.addView(c20663815tU.LIZIZ);
                }
            } else {
                C786410Ut5.LJJJJIZL(this.LLILLL);
                this.LLILLL.addView(c20663815tU.LIZIZ);
            }
        } else {
            C786410Ut5.LJJJJL(this.LLILLJJLI);
            this.LLILLJJLI.addView(c20663815tU.LIZIZ);
        }
        LIZJ();
    }

    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        C20665915tp c20665915tp = this.LLJIJIL;
        InterfaceC20663615tS interfaceC20663615tS = this.LL;
        c20665915tp.LLILLJJLI = interfaceC20663615tS;
        this.LLJ.LLILLJJLI = interfaceC20663615tS;
        this.LLJI.LLILLJJLI = interfaceC20663615tS;
        LIZLLL(innerPushMessage);
        LIZLLL(innerPushMessage);
        LIZLLL(innerPushMessage);
        LIZLLL(innerPushMessage);
        LIZLLL(innerPushMessage);
        FrameLayout frameLayout = this.LLILLL;
        C786410Ut5.LJJJJIZL(frameLayout);
        frameLayout.addView(this.LLJ);
        C786410Ut5.O7(frameLayout, new ACListenerS165S0100000_31(this, 178));
        FrameLayout frameLayout2 = this.LLILZ;
        C786410Ut5.LJJJJIZL(frameLayout2);
        frameLayout2.addView(this.LLJI);
        C786410Ut5.O7(frameLayout2, new ACListenerS165S0100000_31(this, 179));
        FrameLayout frameLayout3 = this.LLILZIL;
        C786410Ut5.LJJJJIZL(frameLayout3);
        C786410Ut5.LJZ(getVisibility(), frameLayout3);
        frameLayout3.addView(this.LLJIJIL);
        C786410Ut5.O7(frameLayout3, new ACListenerS165S0100000_31(frameLayout3, 180));
        FrameLayout frameLayout4 = this.LLILZLL;
        C786410Ut5.LJJJJIZL(frameLayout4);
        C786410Ut5.LJZ(getVisibility(), frameLayout4);
        frameLayout4.addView(this.LLJILJILJ);
        C786410Ut5.O7(frameLayout4, new ACListenerS165S0100000_31(this, 181));
        FrameLayout frameLayout5 = this.LLIZ;
        C786410Ut5.LJJJJIZL(frameLayout5);
        C786410Ut5.LJZ(getVisibility(), frameLayout5);
        frameLayout5.addView(this.LLJILJIL);
        C786410Ut5.O7(frameLayout5, new ACListenerS165S0100000_31(this, 182));
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null) {
            if (uiTemplate.topType != 0) {
                C786410Ut5.LJZ(0, this.LLILZLL);
            }
            if (uiTemplate.bottomType != 0) {
                C786410Ut5.LJZ(0, this.LLIZ);
            }
        }
        LIZJ();
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.15tt] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0ZFe] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.15tp] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.15tl] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.15to] */
    public C20665215ti(InterfaceC20663615tS interfaceC20663615tS, final Context context) {
        View viewInflate;
        super(context, null, 0);
        this.LL = interfaceC20663615tS;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (C20674015v8.LIZIZ() && C20673215v0.LIZ(R.layout.ctg, context) && activityLIZ != null) {
            viewInflate = C20673215v0.LIZLLL(R.layout.ctg, activityLIZ, this, true);
        } else if (C20674015v8.LIZJ() && activityLIZ != null) {
            viewInflate = C21146717pB.LIZIZ(activityLIZ, R.layout.ctg, this, true);
        } else {
            viewInflate = FrameLayout.inflate(context, R.layout.ctg, this);
        }
        this.LLIZLLLIL = (LinearLayout) viewInflate.findViewById(R.id.kot);
        this.LLILLJJLI = (ConstraintLayout) viewInflate.findViewById(R.id.koo);
        this.LLILLL = (FrameLayout) viewInflate.findViewById(R.id.kor);
        this.LLILZ = (FrameLayout) viewInflate.findViewById(R.id.kos);
        this.LLILZIL = (FrameLayout) viewInflate.findViewById(R.id.kox);
        this.LLILZLL = (FrameLayout) viewInflate.findViewById(R.id.kp2);
        this.LLIZ = (FrameLayout) viewInflate.findViewById(R.id.kok);
        this.LLJ = new AbstractViewOnClickListenerC20665415tk(context) { // from class: X.15tt
            public final C427870Gq9 LLILZ;
            public final C427870Gq9 LLILZIL;
            public final FrameLayout LLILZLL;
            public final C427870Gq9 LLIZ;
            public final C427870Gq9 LLIZLLLIL;
            public final FrameLayout LLJ;
            public final C1610770s1D LLJI;
            public C1610740s1A LLJIJIL;
            public boolean LLJILJIL;

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final void LJFF() {
                this.LLILZ.setActualImageResource(R.drawable.c5w);
                this.LLIZ.setActualImageResource(R.drawable.c5w);
                this.LLIZLLLIL.setActualImageResource(R.drawable.c5w);
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void onDetachedFromWindow() {
                C1610740s1A c1610740s1A;
                super.onDetachedFromWindow();
                C19290510dT.LIZ("InnerPushPopupLetView", "left view onDetachedFromWindow");
                if (!this.LLJILJIL || (c1610740s1A = this.LLJIJIL) == null) {
                    return;
                }
                c1610740s1A.LJIIJ();
            }

            {
                View viewInflate2;
                super(context, null, 0);
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (C20674015v8.LIZIZ() && C20673215v0.LIZ(R.layout.ctc, context) && activityLIZ2 != null) {
                    viewInflate2 = C20673215v0.LIZLLL(R.layout.ctc, activityLIZ2, this, true);
                } else if (C20674015v8.LIZJ() && activityLIZ2 != null) {
                    viewInflate2 = C21146717pB.LIZIZ(activityLIZ2, R.layout.ctc, this, true);
                } else {
                    viewInflate2 = FrameLayout.inflate(context, R.layout.ctc, this);
                }
                setClipChildren(false);
                this.LLILZ = (C427870Gq9) viewInflate2.findViewById(R.id.koq);
                this.LLILZIL = (C427870Gq9) viewInflate2.findViewById(R.id.kow);
                this.LLILZLL = (FrameLayout) viewInflate2.findViewById(R.id.vbr);
                this.LLIZ = (C427870Gq9) viewInflate2.findViewById(R.id.kp4);
                this.LLIZLLLIL = (C427870Gq9) viewInflate2.findViewById(R.id.kol);
                this.LLJ = (FrameLayout) viewInflate2.findViewById(R.id.kou);
                this.LLJI = (C1610770s1D) viewInflate2.findViewById(R.id.mvl);
            }

            private final void setAvatarVisible(int i) {
                if (i != 1) {
                    if (i == 2) {
                        C786410Ut5.LLLLJI(this.LLILZ, 8);
                        C786410Ut5.LJZ(0, this.LLJ);
                        return;
                    }
                    return;
                }
                C786410Ut5.LLLLJI(this.LLILZ, 0);
                C786410Ut5.LJZ(8, this.LLJ);
            }

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final void LIZLLL(InnerPushMessage innerPushMessage) {
                Integer numValueOf;
                List<Integer> list;
                Integer num;
                Drawable drawable;
                int iIntValue;
                int iIntValue2;
                int iLIZIZ;
                List<? extends Drawable> list2;
                super.LIZLLL(innerPushMessage);
                this.LLJILJIL = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("left view bindContent type:");
                InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
                if (templatePushMsg != null) {
                    numValueOf = Integer.valueOf(templatePushMsg.leftType);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(' ');
                C19290510dT.LIZ("inner_push_platform", C2188811AlT.LIZIZ(sbLIZ));
                InnerPushUITemplate templatePushMsg2 = getTemplatePushMsg();
                if (templatePushMsg2 != null) {
                    int i = templatePushMsg2.leftType;
                    int iIntValue3 = -1;
                    if (i != -1) {
                        if (i != 0) {
                            if (i != 1) {
                                if (i == 2 && ((list2 = templatePushMsg2.avatarDrawables) == null || list2.isEmpty())) {
                                    LJII(templatePushMsg2, Float.valueOf(0.0f));
                                }
                            } else {
                                LJII(templatePushMsg2, Float.valueOf(2.0f));
                            }
                        } else {
                            LJII(templatePushMsg2, null);
                        }
                    } else {
                        int visibility = getVisibility();
                        setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, this);
                    }
                    if (templatePushMsg2.avatarImageWidth > 0 && templatePushMsg2.avatarImageHeight > 0) {
                        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(templatePushMsg2.avatarImageHeight)));
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(templatePushMsg2.avatarImageWidth)));
                        if (templatePushMsg2.avatarImageHeight <= 40) {
                            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                        } else {
                            iLIZIZ = 0;
                        }
                        setPadding(iLIZIZ, 0, 0, 0);
                    }
                    Function2<? super C427870Gq9, ? super C427870Gq9, Unit> function2 = templatePushMsg2.multiAvatarsLoadFunction;
                    if (function2 != null) {
                        function2.invoke(this.LLIZ, this.LLIZLLLIL);
                        setAvatarVisible(2);
                        LJI(innerPushMessage);
                    } else {
                        Function1<? super C427870Gq9, Unit> function1 = templatePushMsg2.singleAvatarLoadFunction;
                        if (function1 != null) {
                            function1.invoke(this.LLILZ);
                            setAvatarVisible(1);
                            LJI(innerPushMessage);
                        } else {
                            List<String> list3 = templatePushMsg2.avatarUrls;
                            if (list3 != null && !list3.isEmpty()) {
                                List<String> list4 = templatePushMsg2.secondAvatarUrls;
                                if (list4 != null && !list4.isEmpty()) {
                                    C0ZKZ c0zkz = C0ZKZ.LIZ;
                                    List<String> list5 = templatePushMsg2.avatarUrls;
                                    C427870Gq9 c427870Gq9 = this.LLIZLLLIL;
                                    c0zkz.getClass();
                                    C0ZKZ.LIZ(innerPushMessage, list5, c427870Gq9);
                                    C0ZKZ.LIZ(innerPushMessage, templatePushMsg2.secondAvatarUrls, this.LLIZ);
                                    setAvatarVisible(2);
                                    LJI(innerPushMessage);
                                } else {
                                    List<String> list6 = templatePushMsg2.avatarUrls;
                                    if (list6 != null && list6.size() == 1) {
                                        C0ZKZ c0zkz2 = C0ZKZ.LIZ;
                                        List<String> list7 = templatePushMsg2.avatarUrls;
                                        C427870Gq9 c427870Gq92 = this.LLILZ;
                                        c0zkz2.getClass();
                                        C0ZKZ.LIZ(innerPushMessage, list7, c427870Gq92);
                                        setAvatarVisible(1);
                                        LJI(innerPushMessage);
                                    }
                                }
                            } else {
                                List<? extends Drawable> list8 = templatePushMsg2.avatarDrawables;
                                if (list8 != null && !list8.isEmpty()) {
                                    List<? extends Drawable> list9 = templatePushMsg2.avatarDrawables;
                                    if (list9 != null && (drawable = (Drawable) C13LP.LJJJLL(list9)) != null) {
                                        setAvatarVisible(1);
                                        this.LLILZ.setImageDrawable(drawable);
                                        LJI(innerPushMessage);
                                    }
                                } else {
                                    List<Integer> list10 = templatePushMsg2.avatarResIds;
                                    if (list10 != null && !list10.isEmpty() && (list = templatePushMsg2.avatarResIds) != null && (num = (Integer) C13LP.LJJJLL(list)) != null) {
                                        int iIntValue4 = num.intValue();
                                        setAvatarVisible(1);
                                        this.LLILZ.setActualImageResource(iIntValue4);
                                        LJI(innerPushMessage);
                                    }
                                }
                            }
                        }
                    }
                    int i2 = templatePushMsg2.avatarRing;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    InnerPushMessage curMsg = getCurMsg();
                                    if (curMsg != null && curMsg.getType() == 116 && ((Boolean) C136500fb.LIZ.getValue()).booleanValue()) {
                                        String strLJII = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJII("live_skylight_icon_anim_small_size.webp");
                                        templatePushMsg2.setAvatarRightLabelAutoPlay(true);
                                        templatePushMsg2.setAvatarRightLabelUrl(strLJII);
                                        templatePushMsg2.setAvatarRightLabelWidth(14);
                                        templatePushMsg2.setAvatarRightLabelHeight(14);
                                        templatePushMsg2.setAvatarRightLabelMargin(3);
                                        InnerPushMessage curMsg2 = getCurMsg();
                                        if (curMsg2 != null) {
                                            LJI(curMsg2);
                                        }
                                        C786410Ut5.Y(this.LLJI, 0);
                                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nn, getContext());
                                        if (numLIZJ != null) {
                                            int iIntValue5 = numLIZJ.intValue();
                                            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.nm, getContext());
                                            if (numLIZJ2 != null) {
                                                int iIntValue6 = numLIZJ2.intValue();
                                                C1610770s1D c1610770s1D = this.LLJI;
                                                ViewGroup.LayoutParams layoutParams2 = c1610770s1D.getLayoutParams();
                                                if (layoutParams2 != null) {
                                                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                                                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                                                    C786410Ut5.W5(c1610770s1D, layoutParams2);
                                                    Intrinsics.LJFF(templatePushMsg2.avatarBreath, Boolean.TRUE);
                                                    this.LLJI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                                                    this.LLJI.LIZ(iIntValue5, iIntValue6);
                                                    C844470XAv.LIZ.getClass();
                                                    templatePushMsg2.setTopIconView(C20640115pf.LIZLLL(C844470XAv.LIZ()));
                                                    View view = templatePushMsg2.topIconView;
                                                    if (view != null) {
                                                        this.LLILZLL.addView(view, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)), 1));
                                                    }
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                                }
                                            } else {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                C786410Ut5.Y(this.LLJI, 0);
                                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.nn, getContext());
                                if (numLIZJ3 == null) {
                                    return;
                                }
                                int iIntValue7 = numLIZJ3.intValue();
                                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.nm, getContext());
                                if (numLIZJ4 == null) {
                                    return;
                                }
                                int iIntValue8 = numLIZJ4.intValue();
                                C1610770s1D c1610770s1D2 = this.LLJI;
                                ViewGroup.LayoutParams layoutParams3 = c1610770s1D2.getLayoutParams();
                                if (layoutParams3 != null) {
                                    layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                                    layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                                    C786410Ut5.W5(c1610770s1D2, layoutParams3);
                                    Intrinsics.LJFF(templatePushMsg2.avatarBreath, Boolean.TRUE);
                                    this.LLJI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                                    this.LLJI.LIZ(iIntValue7, iIntValue8);
                                    C844470XAv.LIZ.getClass();
                                    templatePushMsg2.setTopIconView(C20640115pf.LIZLLL(C844470XAv.LIZ()));
                                    View view2 = templatePushMsg2.topIconView;
                                    if (view2 != null) {
                                        this.LLILZLL.addView(view2, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)), 1));
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                            }
                        } else {
                            C786410Ut5.Y(this.LLJI, 0);
                            C1610770s1D c1610770s1D3 = this.LLJI;
                            ViewGroup.LayoutParams layoutParams4 = c1610770s1D3.getLayoutParams();
                            if (layoutParams4 != null) {
                                layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                                layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                                C786410Ut5.W5(c1610770s1D3, layoutParams4);
                                C1610770s1D c1610770s1D4 = this.LLJI;
                                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.ti, getContext());
                                if (numLIZJ5 != null) {
                                    iIntValue = numLIZJ5.intValue();
                                } else {
                                    iIntValue = -1;
                                }
                                Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.tj, getContext());
                                if (numLIZJ6 != null) {
                                    iIntValue2 = numLIZJ6.intValue();
                                } else {
                                    iIntValue2 = -1;
                                }
                                Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.tk, getContext());
                                if (numLIZJ7 != null) {
                                    iIntValue3 = numLIZJ7.intValue();
                                }
                                c1610770s1D4.LIZIZ(iIntValue, iIntValue2, iIntValue3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
                                this.LLJI.setStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                                this.LLJI.setInnerStrokeWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                        }
                        if (Intrinsics.LJFF(templatePushMsg2.avatarBreath, Boolean.TRUE)) {
                            this.LLJILJIL = true;
                            FrameLayout frameLayout = this.LLILZLL;
                            C1610740s1A c1610740s1A = new C1610740s1A(true, (View) frameLayout, (View) frameLayout, this.LLJI);
                            this.LLJIJIL = c1610740s1A;
                            c1610740s1A.LIZ();
                        }
                        if (templatePushMsg2.avatarRingWidth > 0 && templatePushMsg2.avatarRingHeight > 0) {
                            C1610770s1D c1610770s1D5 = this.LLJI;
                            ViewGroup.LayoutParams layoutParams5 = c1610770s1D5.getLayoutParams();
                            if (layoutParams5 != null) {
                                layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(templatePushMsg2.avatarRingWidth)));
                                layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(templatePushMsg2.avatarRingHeight)));
                                C786410Ut5.W5(c1610770s1D5, layoutParams5);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                        }
                        int i3 = templatePushMsg2.avatarRingPadding;
                        if (i3 > 0) {
                            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
                            this.LLJI.setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
                            return;
                        }
                        return;
                    }
                    C786410Ut5.Y(this.LLJI, 8);
                    return;
                }
                C786410Ut5.LLLLJI(this.LLILZ, 0);
            }

            public final void LJI(final InnerPushMessage innerPushMessage) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                FrameLayout.LayoutParams layoutParams;
                InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                if (uiTemplate == null) {
                    return;
                }
                View view = uiTemplate.topIconView;
                if (view != null) {
                    if (uiTemplate.topIconViewWidth > 0 && uiTemplate.topIconViewHeight > 0) {
                        layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.topIconViewWidth))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.topIconViewHeight))), 1);
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(-2, -2, 1);
                    }
                    this.LLILZLL.addView(view, layoutParams);
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = this.LLILZIL.getLayoutParams();
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.avatarRightLabelHeight))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.avatarRightLabelWidth))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.avatarRightLabelMargin))));
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.avatarRightLabelMargin)));
                }
                C786410Ut5.F6(this.LLILZIL, layoutParams2);
                int i = uiTemplate.avatarRightLabelPadding;
                if (i > 0) {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                    this.LLILZIL.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
                }
                if (uiTemplate.avatarRightLabelDrawable != null) {
                    C786410Ut5.LLLLJI(this.LLILZIL, 0);
                    this.LLILZIL.setImageDrawable(uiTemplate.avatarRightLabelDrawable);
                    innerPushMessage.getTracker().LJIILJJIL = 1;
                    innerPushMessage.getTracker().LJIIIIZZ = 1L;
                    innerPushMessage.getTracker().LJIIJJI = 1;
                    return;
                }
                String str = uiTemplate.avatarRightLabelUrl;
                if (str != null && str.length() != 0) {
                    C786410Ut5.LLLLJI(this.LLILZIL, 0);
                    if (uiTemplate.avatarRightLabelAutoPlay) {
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(uiTemplate.avatarRightLabelUrl));
                        c1331670kl3LJIIIIZZ.LJJ(this.LLILZIL);
                        c1331670kl3LJIIIIZZ.LIZLLL("noticeTypeIcon");
                        c1331670kl3LJIIIIZZ.LIZLLL = true;
                        C1331750klB c1331750klB = new C1331750klB();
                        c1331750klB.LIZ = true;
                        c1331750klB.LJII = EnumC1203020hPY.OVERLAY_COLOR;
                        c1331670kl3LJIIIIZZ.LJJI = c1331750klB.LIZ();
                        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LJIIIIZZ.LJJJIL = new InterfaceC658750Psf() { // from class: X.15u0
                            @Override // X.InterfaceC658750Psf
                            public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
                            }

                            @Override // X.InterfaceC658750Psf
                            public final void Ck(JSONObject jSONObject) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onImageSensibleLoaded imageMonitorData:");
                                sbLIZ.append(jSONObject);
                                C19290510dT.LIZ("InnerPushPopupLeftView", C2188811AlT.LIZIZ(sbLIZ));
                                int i2 = 1;
                                if (!jSONObject.optBoolean("isSuccess")) {
                                    i2 = 0;
                                }
                                innerPushMessage.getTracker().LJIILJJIL = i2;
                                innerPushMessage.getTracker().LJIIIIZZ = jSONObject.optLong("duration", -1L);
                                innerPushMessage.getTracker().LJIIJJI = jSONObject.optInt("from", -1);
                            }
                        };
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                        return;
                    }
                    C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(uiTemplate.avatarRightLabelUrl));
                    c1331670kl3LJIIIIZZ2.LJJ(this.LLILZIL);
                    c1331670kl3LJIIIIZZ2.LIZLLL("noticeTypeIcon");
                    c1331670kl3LJIIIIZZ2.LIZLLL = false;
                    C1331750klB c1331750klB2 = new C1331750klB();
                    c1331750klB2.LIZ = true;
                    c1331750klB2.LJII = EnumC1203020hPY.OVERLAY_COLOR;
                    c1331670kl3LJIIIIZZ2.LJJI = c1331750klB2.LIZ();
                    c1331670kl3LJIIIIZZ2.LJIL = Bitmap.Config.ARGB_8888;
                    c1331670kl3LJIIIIZZ2.LJJJIL = new InterfaceC658750Psf() { // from class: X.15u1
                        @Override // X.InterfaceC658750Psf
                        public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
                        }

                        @Override // X.InterfaceC658750Psf
                        public final void Ck(JSONObject jSONObject) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onImageSensibleLoaded imageMonitorData:");
                            sbLIZ.append(jSONObject);
                            C19290510dT.LIZ("InnerPushPopupLeftView", C2188811AlT.LIZIZ(sbLIZ));
                            int i2 = 1;
                            if (!jSONObject.optBoolean("isSuccess")) {
                                i2 = 0;
                            }
                            innerPushMessage.getTracker().LJIILJJIL = i2;
                            innerPushMessage.getTracker().LJIIIIZZ = jSONObject.optLong("duration", -1L);
                            innerPushMessage.getTracker().LJIIJJI = jSONObject.optInt("from", -1);
                        }
                    };
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                    return;
                }
                C786410Ut5.LLLLJI(this.LLILZIL, 8);
            }

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final boolean LJ(int i, View view) {
                String str;
                InterfaceC19330810jy interfaceC19330810jyLIZ;
                InnerPushMessage curMsg = getCurMsg();
                if (curMsg != null && (interfaceC19330810jyLIZ = C20641815pw.LIZ(curMsg.getType())) != null && interfaceC19330810jyLIZ.LIZ(i, curMsg)) {
                    return true;
                }
                InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
                if (templatePushMsg == null || (str = templatePushMsg.avatarSchema) == null) {
                    return false;
                }
                LIZ(1, getCurMsg(), str);
                return true;
            }

            public final void LJII(InnerPushUITemplate innerPushUITemplate, Float f) {
                C1331070kk5 hierarchy = this.LLILZ.getHierarchy();
                C1331100kk8 c1331100kk8 = hierarchy.LIZJ;
                if (c1331100kk8 == null) {
                    c1331100kk8 = new C1331100kk8();
                }
                float f2 = innerPushUITemplate.avatarImageRadius;
                if (f2 > 0.0f) {
                    c1331100kk8.LIZIZ = false;
                    c1331100kk8.LJII(C418440Gaw.LIZIZ(Float.valueOf(f2)));
                } else if (f != null && f.floatValue() >= 0.0f) {
                    c1331100kk8.LIZIZ = false;
                    c1331100kk8.LJII(C418440Gaw.LIZIZ(f));
                } else {
                    c1331100kk8.LIZIZ = true;
                }
                if (innerPushUITemplate.avatarImageBorderWidth >= 0.0f) {
                    c1331100kk8.LJ(C418440Gaw.LIZIZ(Float.valueOf(innerPushUITemplate.avatarImageBorderWidth)), C960203pA.LIZ(R.attr.ng, getContext()));
                }
                hierarchy.LJJIII(c1331100kk8);
            }
        };
        this.LLJI = new C20665715tn(context) { // from class: X.0ZFe
            public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1440));

            private final InterfaceC899120ZPa getStreakHandler() {
                return (InterfaceC899120ZPa) this.LLIZLLLIL.getValue();
            }

            @Override // X.C20665715tn, X.AbstractViewOnClickListenerC20665415tk
            public final void LIZLLL(InnerPushMessage innerPushMessage) {
                Object obj;
                Object c098200Yq;
                String uid;
                List<User> list;
                User user;
                String str;
                super.LIZLLL(innerPushMessage);
                if (C13LQ.LJJIJIIJI(Integer.valueOf(innerPushMessage.getType()), new Integer[]{21, 1009, 1, 2, 3, 4, 31, 27, 32}) >= 0) {
                    Map<String, Object> extrasMap = innerPushMessage.getExtrasMap();
                    if (extrasMap != null) {
                        obj = extrasMap.get("conversation_id");
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof String) && (str = (String) obj) != null && str.length() > 0) {
                        InterfaceC899120ZPa streakHandler = getStreakHandler();
                        if (streakHandler != null) {
                            streakHandler.LIZLLL(1, str, null, true);
                            return;
                        }
                        return;
                    }
                    if (C13LQ.LJJIJIIJI(Integer.valueOf(innerPushMessage.getType()), new Integer[]{31, 27}) >= 0) {
                        try {
                            c098200Yq = (ActivityStatus) C051M.LIZIZ(ActivityStatus.class, innerPushMessage.getBizExtraJsonStr());
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        ActivityStatus activityStatus = (ActivityStatus) c098200Yq;
                        if (activityStatus == null || (uid = activityStatus.userID) == null) {
                            return;
                        }
                    } else {
                        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                        if (uiTemplate == null || (list = uiTemplate.fromUsers) == null || (user = (User) C13LP.LJJJLZIJ(0, list)) == null || (uid = user.getUid()) == null || uid.length() <= 0) {
                            return;
                        }
                    }
                    InterfaceC899120ZPa streakHandler2 = getStreakHandler();
                    if (streakHandler2 != null) {
                        streakHandler2.LIZIZ(1, uid, null, true);
                    }
                }
            }
        };
        this.LLJIJIL = new AbstractViewOnClickListenerC20665415tk(context) { // from class: X.15tp
            public final C19231910Lt LLILZ;
            public final TuxTextView LLILZIL;
            public final C197039127h LLILZLL;
            public final SmartImageView LLIZ;

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final void LJFF() {
                this.LLILZLL.setText("");
                this.LLILZIL.setText("");
                this.LLIZ.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }

            {
                View viewInflate2;
                super(context, null, 0);
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (C20674015v8.LIZIZ() && C20673215v0.LIZ(R.layout.cte, context) && activityLIZ2 != null) {
                    viewInflate2 = C20673215v0.LIZLLL(R.layout.cte, activityLIZ2, this, true);
                } else if (C20674015v8.LIZJ() && activityLIZ2 != null) {
                    viewInflate2 = C21146717pB.LIZIZ(activityLIZ2, R.layout.cte, this, true);
                } else {
                    viewInflate2 = FrameLayout.inflate(context, R.layout.cte, this);
                }
                this.LLILZ = (C19231910Lt) viewInflate2.findViewById(R.id.kop);
                this.LLILZIL = (TuxTextView) viewInflate2.findViewById(R.id.kom);
                this.LLILZLL = (C197039127h) viewInflate2.findViewById(R.id.koz);
                this.LLIZ = (SmartImageView) viewInflate2.findViewById(R.id.koy);
            }

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final void LIZLLL(InnerPushMessage innerPushMessage) {
                super.LIZLLL(innerPushMessage);
                InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
                if (templatePushMsg != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("right view bindContent type:");
                    sbLIZ.append(templatePushMsg.rightType);
                    sbLIZ.append(' ');
                    C19290510dT.LIZ("inner_push_platform", C2188811AlT.LIZIZ(sbLIZ));
                    int iLIZIZ = (int) ((((double) (getContext().getResources().getDisplayMetrics().widthPixels - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)))) * 0.4d) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
                    int marginEnd = 0;
                    switch (templatePushMsg.rightType) {
                        case 0:
                            C786410Ut5.a2(this, 8);
                            break;
                        case 1:
                            C786410Ut5.a2(this, 0);
                            C19329910jp c19329910jp = C19329910jp.LIZ;
                            View[] viewArr = {this.LLILZ, this.LLILZIL, this.LLILZLL};
                            c19329910jp.getClass();
                            C19329910jp.LIZIZ(viewArr);
                            C786410Ut5.LLFF(0, this.LLIZ);
                            this.LLIZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            LJI(innerPushMessage);
                            break;
                        case 2:
                            C786410Ut5.a2(this, 0);
                            C19329910jp c19329910jp2 = C19329910jp.LIZ;
                            View[] viewArr2 = {this.LLIZ, this.LLILZIL, this.LLILZLL};
                            c19329910jp2.getClass();
                            C19329910jp.LIZIZ(viewArr2);
                            C19231910Lt c19231910Lt = this.LLILZ;
                            int visibility = c19231910Lt.getVisibility();
                            c19231910Lt.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, c19231910Lt);
                            this.LLILZ.LIZLLL(innerPushMessage);
                            this.LLILZ.LLILLJJLI = getPopupWindowRef();
                            C19231910Lt c19231910Lt2 = this.LLILZ;
                            ViewGroup.LayoutParams layoutParams = c19231910Lt2.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
                            }
                            c19231910Lt2.setViewMaxWidth(iLIZIZ - marginEnd);
                            break;
                        case 3:
                            C786410Ut5.a2(this, 0);
                            C19329910jp c19329910jp3 = C19329910jp.LIZ;
                            View[] viewArr3 = {this.LLILZ, this.LLIZ, this.LLILZLL};
                            c19329910jp3.getClass();
                            C19329910jp.LIZIZ(viewArr3);
                            C786410Ut5.LLLLZLL(this.LLILZIL, 0);
                            this.LLILZIL.setText(templatePushMsg.rightBtnText);
                            this.LLILZIL.setTextColorRes(R.attr.a04);
                            TuxTextView tuxTextView = this.LLILZIL;
                            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                            }
                            tuxTextView.setMaxWidth(iLIZIZ - marginEnd);
                            break;
                        case 4:
                            C786410Ut5.a2(this, 0);
                            C19329910jp c19329910jp4 = C19329910jp.LIZ;
                            View[] viewArr4 = {this.LLILZ, this.LLIZ, this.LLILZIL};
                            c19329910jp4.getClass();
                            C19329910jp.LIZIZ(viewArr4);
                            C786410Ut5.LLLLLLJ(this.LLILZLL, 0);
                            this.LLILZLL.setText(templatePushMsg.rightBtnText);
                            C197039127h c197039127h = this.LLILZLL;
                            ViewGroup.LayoutParams layoutParams3 = c197039127h.getLayoutParams();
                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
                            }
                            c197039127h.setMaxWidth(iLIZIZ - marginEnd);
                            break;
                        case 5:
                            C786410Ut5.a2(this, 0);
                            C19329910jp c19329910jp5 = C19329910jp.LIZ;
                            View[] viewArr5 = {this.LLILZ, this.LLIZ, this.LLILZLL};
                            c19329910jp5.getClass();
                            C19329910jp.LIZIZ(viewArr5);
                            C786410Ut5.LLLLZLL(this.LLILZIL, 0);
                            this.LLILZIL.setTextColorRes(R.attr.a1k);
                            this.LLILZIL.setText(templatePushMsg.rightBtnText);
                            TuxTextView tuxTextView2 = this.LLILZIL;
                            ViewGroup.LayoutParams layoutParams4 = tuxTextView2.getLayoutParams();
                            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                            }
                            tuxTextView2.setMaxWidth(iLIZIZ - marginEnd);
                            break;
                        case 6:
                        default:
                            C786410Ut5.a2(this, 8);
                            C19290510dT.LIZIZ("inner_push_platform", " invalid right type");
                            break;
                        case 7:
                            C786410Ut5.a2(this, 0);
                            C19329910jp c19329910jp6 = C19329910jp.LIZ;
                            View[] viewArr6 = {this.LLILZ, this.LLILZIL, this.LLILZLL};
                            c19329910jp6.getClass();
                            C19329910jp.LIZIZ(viewArr6);
                            C786410Ut5.LLFF(0, this.LLIZ);
                            templatePushMsg.setRightImageDrawable(C1336205Ku.LIZ(false).getImSayHiService().LJIIIIZZ(getContext()));
                            LJI(innerPushMessage);
                            break;
                        case 8:
                            if (C19331310k3.LJIIJJI(innerPushMessage)) {
                                C786410Ut5.a2(this, 0);
                                C19329910jp c19329910jp7 = C19329910jp.LIZ;
                                View[] viewArr7 = {this.LLILZ, this.LLILZIL, this.LLILZLL};
                                c19329910jp7.getClass();
                                C19329910jp.LIZIZ(viewArr7);
                                C786410Ut5.LLFF(0, this.LLIZ);
                                templatePushMsg.setRightImageDrawable(C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJIL(getContext()));
                                LJI(innerPushMessage);
                            } else {
                                C786410Ut5.a2(this, 8);
                            }
                            break;
                    }
                }
            }

            public final void LJI(final InnerPushMessage innerPushMessage) {
                int iLIZIZ;
                InnerPushMessage curMsg;
                InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                if (uiTemplate == null) {
                    return;
                }
                C1331100kk8 c1331100kk8 = this.LLIZ.getHierarchy().LIZJ;
                if (c1331100kk8 != null) {
                    c1331100kk8.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.rightImageRadius))));
                    InnerPushMessage curMsg2 = getCurMsg();
                    if ((curMsg2 == null || curMsg2.getType() != 27) && ((curMsg = getCurMsg()) == null || curMsg.getType() != 31)) {
                        c1331100kk8.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(uiTemplate.rightImageBorderWidth))));
                    }
                }
                InnerPushMessage curMsg3 = getCurMsg();
                if (curMsg3 != null && curMsg3.getType() == 1009) {
                    TypedValue typedValue = new TypedValue();
                    getContext().getTheme().resolveAttribute(R.attr.a03, typedValue, true);
                    int i = typedValue.data;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(i);
                    this.LLIZ.setBackground(gradientDrawable);
                    this.LLIZ.getHierarchy().LJJIII(C1331100kk8.LIZ());
                }
                ViewGroup.LayoutParams layoutParams = this.LLIZ.getLayoutParams();
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.rightImageHeight)));
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(uiTemplate.rightImageWidth)));
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (uiTemplate.rightImageHeight <= 40) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    } else {
                        iLIZIZ = 0;
                    }
                    marginLayoutParams.setMarginEnd(iLIZIZ);
                }
                String str = uiTemplate.rightImageUrl;
                if (str != null && str.length() != 0) {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(uiTemplate.rightImageUrl));
                    c1331670kl3LJIIIIZZ.LJJ(this.LLIZ);
                    c1331670kl3LJIIIIZZ.LJJIJL(getContext());
                    c1331670kl3LJIIIIZZ.LIZLLL("rightCover");
                    c1331670kl3LJIIIIZZ.LJJJIL = new InterfaceC658750Psf() { // from class: X.15tr
                        @Override // X.InterfaceC658750Psf
                        public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
                        }

                        @Override // X.InterfaceC658750Psf
                        public final void Ck(JSONObject jSONObject) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onImageSensibleLoaded imageMonitorData:");
                            sbLIZ.append(jSONObject);
                            C19290510dT.LIZ("inner_push_platform", C2188811AlT.LIZIZ(sbLIZ));
                            int i2 = 1;
                            if (!jSONObject.optBoolean("isSuccess")) {
                                i2 = 0;
                            }
                            innerPushMessage.getTracker().LJIILL = i2;
                            innerPushMessage.getTracker().LJIIIZ = jSONObject.optLong("duration", -1L);
                            innerPushMessage.getTracker().LJIIL = jSONObject.optInt("from", -1);
                        }
                    };
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    return;
                }
                int i2 = uiTemplate.rightImageResId;
                if (i2 > 0) {
                    this.LLIZ.setImageResource(i2);
                    innerPushMessage.getTracker().LJIILL = 1;
                    innerPushMessage.getTracker().LJIIIZ = 1L;
                    innerPushMessage.getTracker().LJIIL = 1;
                    return;
                }
                Drawable drawable = uiTemplate.rightImageDrawable;
                if (drawable != null) {
                    this.LLIZ.setImageDrawable(drawable);
                    innerPushMessage.getTracker().LJIILL = 1;
                    innerPushMessage.getTracker().LJIIIZ = 1L;
                    innerPushMessage.getTracker().LJIIL = 1;
                    return;
                }
                C786410Ut5.LLFF(8, this.LLIZ);
            }

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final boolean LJ(int i, View view) {
                String str;
                InterfaceC19330810jy interfaceC19330810jyLIZ;
                InnerPushMessage curMsg = getCurMsg();
                if (curMsg != null && (((interfaceC19330810jyLIZ = C20641815pw.LIZ(curMsg.getType())) != null && interfaceC19330810jyLIZ.LIZ(i, curMsg)) || C20663315tP.LIZ(3, curMsg))) {
                    return true;
                }
                C19290510dT.LIZLLL("inner_push_platform", "RightView handleClick right container");
                InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
                if (templatePushMsg == null || (str = templatePushMsg.rightSchemaUrl) == null) {
                    return false;
                }
                LIZ(3, getCurMsg(), str);
                return true;
            }
        };
        this.LLJILJIL = new AbstractViewOnClickListenerC20665415tk(context) { // from class: X.15tl
            public final View LLILZ;
            public final TuxTextView LLILZIL;

            {
                View viewInflate2;
                super(context, null, 0);
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (C20674015v8.LIZIZ() && C20673215v0.LIZ(R.layout.ctb, context) && activityLIZ2 != null) {
                    viewInflate2 = C20673215v0.LIZLLL(R.layout.ctb, activityLIZ2, this, true);
                } else if (C20674015v8.LIZJ() && activityLIZ2 != null) {
                    viewInflate2 = C21146717pB.LIZIZ(activityLIZ2, R.layout.ctb, this, true);
                } else {
                    viewInflate2 = FrameLayout.inflate(context, R.layout.ctb, this);
                }
                this.LLILZ = viewInflate2.findViewById(R.id.si0);
                this.LLILZIL = (TuxTextView) viewInflate2.findViewById(R.id.pg8);
                C786410Ut5.I7(this, viewInflate2);
            }

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final void LIZLLL(InnerPushMessage innerPushMessage) {
                super.LIZLLL(innerPushMessage);
                InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
                if (templatePushMsg != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bottom view bindContent bottomType:");
                    sbLIZ.append(templatePushMsg.bottomType);
                    C19290510dT.LIZ("inner_push_platform", C2188811AlT.LIZIZ(sbLIZ));
                    int i = templatePushMsg.bottomType;
                    if (i != 0) {
                        if (i != 3) {
                            int visibility = getVisibility();
                            setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, this);
                            return;
                        } else {
                            int visibility2 = getVisibility();
                            setVisibility(0);
                            C1602160rnK.LIZIZ(visibility2, 0, this);
                            C786410Ut5.LLLLZLL(this.LLILZIL, 0);
                            return;
                        }
                    }
                    int visibility3 = getVisibility();
                    setVisibility(8);
                    C1602160rnK.LIZIZ(visibility3, 8, this);
                }
            }

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final boolean LJ(int i, View view) {
                String str;
                InterfaceC19330810jy interfaceC19330810jyLIZ;
                InnerPushMessage curMsg = getCurMsg();
                if (curMsg != null && (interfaceC19330810jyLIZ = C20641815pw.LIZ(curMsg.getType())) != null && interfaceC19330810jyLIZ.LIZ(i, curMsg)) {
                    return true;
                }
                InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
                if (templatePushMsg == null || (str = templatePushMsg.bottomSchemaUrl) == null) {
                    return false;
                }
                LIZ(5, getCurMsg(), str);
                return true;
            }
        };
        this.LLJILJILJ = new AbstractViewOnClickListenerC20665415tk(context) { // from class: X.15to
            public final RemoteImageView LLILZ;

            {
                View viewInflate2;
                super(context, null, 0);
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (C20674015v8.LIZIZ() && C20673215v0.LIZ(R.layout.ctf, context) && activityLIZ2 != null) {
                    viewInflate2 = C20673215v0.LIZLLL(R.layout.ctf, activityLIZ2, this, true);
                } else if (C20674015v8.LIZJ() && activityLIZ2 != null) {
                    viewInflate2 = C21146717pB.LIZIZ(activityLIZ2, R.layout.ctf, this, true);
                } else {
                    viewInflate2 = FrameLayout.inflate(context, R.layout.ctf, this);
                }
                RemoteImageView remoteImageView = (RemoteImageView) viewInflate2.findViewById(R.id.kp3);
                this.LLILZ = remoteImageView;
                C786410Ut5.E9(remoteImageView, this);
            }

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final void LIZLLL(InnerPushMessage innerPushMessage) {
                super.LIZLLL(innerPushMessage);
                InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
                if (templatePushMsg != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("top view bindContent title:");
                    sbLIZ.append(templatePushMsg.title);
                    sbLIZ.append(" avatar2 url:");
                    sbLIZ.append(templatePushMsg.title);
                    C19290510dT.LIZ("inner_push_platform", C2188811AlT.LIZIZ(sbLIZ));
                    if (templatePushMsg.topType == 1) {
                        C786410Ut5.l(this.LLILZ, 0);
                        C1331100kk8 c1331100kk8 = this.LLILZ.getHierarchy().LIZJ;
                        if (c1331100kk8 != null) {
                            c1331100kk8.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(templatePushMsg.rightImageRadius))));
                        }
                        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(templatePushMsg.topImageHeight)));
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(templatePushMsg.topImageWidth)));
                        C786410Ut5.f7(this.LLILZ, layoutParams);
                        String str = templatePushMsg.topImageUrl;
                        if (str != null && str.length() != 0) {
                            C1324840ka2.LJIIJ(this.LLILZ, templatePushMsg.topImageUrl, -1, -1);
                            return;
                        }
                        int i = templatePushMsg.topImageRes;
                        if (i > 0) {
                            this.LLILZ.setImageResource(i);
                            return;
                        } else {
                            C786410Ut5.l(this.LLILZ, 8);
                            return;
                        }
                    }
                    int visibility = getVisibility();
                    setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, this);
                }
            }

            @Override // X.AbstractViewOnClickListenerC20665415tk
            public final boolean LJ(int i, View view) {
                String str;
                InterfaceC19330810jy interfaceC19330810jyLIZ;
                InnerPushMessage curMsg = getCurMsg();
                if (curMsg != null && (interfaceC19330810jyLIZ = C20641815pw.LIZ(curMsg.getType())) != null && interfaceC19330810jyLIZ.LIZ(i, curMsg)) {
                    return true;
                }
                InnerPushUITemplate templatePushMsg = getTemplatePushMsg();
                if (templatePushMsg == null || (str = templatePushMsg.topSchemaUrl) == null) {
                    return false;
                }
                LIZ(4, getCurMsg(), str);
                return true;
            }
        };
    }

    public final void LIZLLL(InnerPushMessage innerPushMessage, int[] iArr) {
        for (int i : iArr) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        C19290510dT.LIZIZ("InnerPushView", "updateView error: area is invalid");
                    } else {
                        LIZLLL(innerPushMessage);
                        if (this.LLILZIL.indexOfChild(this.LLJIJIL) != -1) {
                            C786410Ut5.LJZ(getVisibility(), this.LLILZIL);
                        } else {
                            FrameLayout frameLayout = this.LLILZIL;
                            C786410Ut5.LJJJJIZL(frameLayout);
                            C786410Ut5.LJZ(getVisibility(), frameLayout);
                            frameLayout.addView(this.LLJIJIL);
                            C786410Ut5.O7(frameLayout, new ACListenerS165S0100000_31(this, 183));
                        }
                    }
                } else {
                    LIZLLL(innerPushMessage);
                }
            } else {
                LIZLLL(innerPushMessage);
            }
        }
        LIZJ();
    }
}
