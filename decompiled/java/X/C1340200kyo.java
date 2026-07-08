package X;

import Y.ACListenerS155S0100000_21;
import Y.ALAdapterS10S0300000_21;
import Y.ALAdapterS16S0200000_21;
import Y.AUListenerS270S0100000_21;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340200kyo extends AbstractC1340180kym {
    public LinearLayout LL;
    public ConstraintLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;
    public ConstraintLayout LLIZ;
    public TuxSpinner LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;
    public C1322110kVd LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public InterfaceC1340050kyZ LLJJ;
    public Function0<Unit> LLJJI;
    public Function1<? super Integer, Unit> LLJJIII;
    public Comment LLJJIJI;
    public Aweme LLJJIJIIJIL;
    public String LLJJIJIL;
    public final boolean LLJJJ;
    public boolean LLJJJIL;
    public AnimatorSet LLJJJJ;
    public boolean LLJJJJJIL;
    public C1342670l2n LLJJJJLIIL;
    public String LLJJL;
    public Object LLJJLIIIJLLLLLLLZ;

    public C1340200kyo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final View getInlineBannerCellFromXml() {
        View view = this.LLJI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.knn);
        this.LLJI = viewFindViewById;
        return viewFindViewById;
    }

    private final TuxIconView getInlineBannerCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kno);
            this.LLJILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    private final TuxTextView getInlineBannerCtaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.knp);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final C1322110kVd getInlineBannerThumbnailFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.knr);
            this.LLJIJIL = (C1322110kVd) callbackFindViewById;
        }
        return (C1322110kVd) callbackFindViewById;
    }

    private final TuxTextView getInlineBannerTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kns);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZIZ() {
        ITextToImageService iTextToImageService;
        String str = this.LLJJL;
        C1342670l2n c1342670l2n = this.LLJJJJLIIL;
        if (str != null && c1342670l2n != null && (iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null)) != null) {
            iTextToImageService.LJJIJIL(str, c1342670l2n);
        }
        this.LLJJL = null;
        this.LLJJJJLIIL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    public final boolean LJFF() {
        Integer seekingHelpModelType;
        Comment comment = this.LLJJIJI;
        if (comment == null || (seekingHelpModelType = comment.getSeekingHelpModelType()) == null || seekingHelpModelType.intValue() != 1) {
            return false;
        }
        return ((Number) C04R6.LIZ.getValue()).intValue() != 0 || C1340250kyt.LIZ;
    }

    public final void LJI() {
        View inlineBannerCellFromXml;
        Comment comment = this.LLJJIJI;
        if (comment == null) {
            return;
        }
        boolean z = (this.LLJJJJJIL || (inlineBannerCellFromXml = getInlineBannerCellFromXml()) == null || inlineBannerCellFromXml.getVisibility() != 0) ? false : true;
        int commentPostStatus = comment.getCommentPostStatus();
        if (commentPostStatus == 0) {
            if (z) {
                return;
            }
            LinearLayout addCellFromXml = getAddCellFromXml();
            ConstraintLayout addCellHelpFromXml = getAddCellHelpFromXml();
            LinearLayout loadingCellFromXml = getLoadingCellFromXml();
            LinearLayout addedCellFromXml = getAddedCellFromXml();
            ConstraintLayout commentPostButtonFromXml = getCommentPostButtonFromXml();
            boolean zLJFF = LJFF();
            C786410Ut5.LJZL(zLJFF ? 8 : 0, addCellFromXml);
            if (zLJFF) {
                ConstraintLayout addCellHelpFromXml2 = getAddCellHelpFromXml();
                if (addCellHelpFromXml2 != null) {
                    C786410Ut5.LL(0, addCellHelpFromXml2);
                }
                TuxTextView textHelpFromXml = getTextHelpFromXml();
                if (textHelpFromXml != null) {
                    if (((Number) C04R6.LIZ.getValue()).intValue() == 1) {
                        textHelpFromXml.setText(2131821418);
                        TuxTextView textHelpSuffixFromXml = getTextHelpSuffixFromXml();
                        if (textHelpSuffixFromXml != null) {
                            textHelpSuffixFromXml.setText(2131821419);
                            C786410Ut5.LLLLZLL(textHelpSuffixFromXml, 0);
                        }
                    } else {
                        textHelpFromXml.setText(2131821417);
                        TuxTextView textHelpSuffixFromXml2 = getTextHelpSuffixFromXml();
                        if (textHelpSuffixFromXml2 != null) {
                            C786410Ut5.LLLLZLL(textHelpSuffixFromXml2, 8);
                        }
                    }
                }
            } else if (addCellHelpFromXml != null) {
                C786410Ut5.LL(8, addCellHelpFromXml);
            }
            C786410Ut5.LJZL(8, loadingCellFromXml);
            C786410Ut5.LJZL(8, addedCellFromXml);
            C786410Ut5.W4(addCellFromXml, 1.0f);
            if (addCellHelpFromXml != null) {
                C786410Ut5.c5(addCellHelpFromXml, 1.0f);
            }
            C786410Ut5.W4(loadingCellFromXml, 1.0f);
            C786410Ut5.W4(addedCellFromXml, 1.0f);
            LIZ(commentPostButtonFromXml);
            C1341780l1M c1341780l1M = C1341780l1M.LIZ;
            C1341780l1M.LIZIZ(c1341780l1M, commentPostButtonFromXml, EnumC1341650l19.NULL, 0.0f, null, 12);
            ConstraintLayout constraintLayout = (!zLJFF || addCellHelpFromXml == null) ? addCellFromXml : addCellHelpFromXml;
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 180), constraintLayout);
            C1341780l1M.LIZIZ(c1341780l1M, constraintLayout, EnumC1341650l19.BUTTON, 0.0f, null, 12);
            LIZ(addedCellFromXml);
            LIZ(loadingCellFromXml);
            if (constraintLayout != addCellFromXml) {
                LIZ(addCellFromXml);
            }
            if (constraintLayout == addCellHelpFromXml || addCellHelpFromXml == null) {
                return;
            }
            LIZ(addCellHelpFromXml);
            return;
        }
        if (commentPostStatus != 1) {
            if (commentPostStatus == 2) {
                if (z) {
                    LJ(false);
                }
                if (C07CJ.LIZ() == 2 && C296110Bj7.LIZ() == 0) {
                    C786410Ut5.x(this, 8);
                    return;
                }
                LinearLayout addCellFromXml2 = getAddCellFromXml();
                ConstraintLayout addCellHelpFromXml3 = getAddCellHelpFromXml();
                LinearLayout loadingCellFromXml2 = getLoadingCellFromXml();
                LinearLayout addedCellFromXml2 = getAddedCellFromXml();
                ConstraintLayout commentPostButtonFromXml2 = getCommentPostButtonFromXml();
                C786410Ut5.LJZL(8, addCellFromXml2);
                if (addCellHelpFromXml3 != null) {
                    C786410Ut5.LL(8, addCellHelpFromXml3);
                }
                C786410Ut5.LJZL(8, loadingCellFromXml2);
                C786410Ut5.LJZL(0, addedCellFromXml2);
                C786410Ut5.W4(addCellFromXml2, 1.0f);
                if (addCellHelpFromXml3 != null) {
                    C786410Ut5.c5(addCellHelpFromXml3, 1.0f);
                }
                C786410Ut5.W4(loadingCellFromXml2, 1.0f);
                C786410Ut5.W4(addedCellFromXml2, 1.0f);
                LIZ(commentPostButtonFromXml2);
                C1341780l1M c1341780l1M2 = C1341780l1M.LIZ;
                C1341780l1M.LIZIZ(c1341780l1M2, commentPostButtonFromXml2, EnumC1341650l19.NULL, 0.0f, null, 12);
                C786410Ut5.R7(addedCellFromXml2, new ACListenerS155S0100000_21(this, 181));
                C1341780l1M.LIZIZ(c1341780l1M2, addedCellFromXml2, EnumC1341650l19.BUTTON, 0.0f, null, 12);
                LIZ(addCellFromXml2);
                if (addCellHelpFromXml3 != null) {
                    LIZ(addCellHelpFromXml3);
                }
                LIZ(loadingCellFromXml2);
                return;
            }
            return;
        }
        if (z) {
            LJ(false);
        }
        LinearLayout addCellFromXml3 = getAddCellFromXml();
        LinearLayout loadingCellFromXml3 = getLoadingCellFromXml();
        LinearLayout addedCellFromXml3 = getAddedCellFromXml();
        ConstraintLayout commentPostButtonFromXml3 = getCommentPostButtonFromXml();
        if (C07CJ.LIZ() == 2 && C296110Bj7.LIZ() == 0) {
            LIZ(commentPostButtonFromXml3);
            C1341780l1M.LIZIZ(C1341780l1M.LIZ, commentPostButtonFromXml3, EnumC1341650l19.NULL, 0.0f, null, 12);
            C786410Ut5.R7(addCellFromXml3, new ACListenerS155S0100000_21(this, 182));
            return;
        }
        C786410Ut5.LJZL(8, addCellFromXml3);
        ConstraintLayout addCellHelpFromXml4 = getAddCellHelpFromXml();
        if (addCellHelpFromXml4 != null) {
            C786410Ut5.LL(8, addCellHelpFromXml4);
        }
        C786410Ut5.LJZL(0, loadingCellFromXml3);
        C786410Ut5.LJZL(8, addedCellFromXml3);
        C786410Ut5.W4(addCellFromXml3, 1.0f);
        ConstraintLayout addCellHelpFromXml5 = getAddCellHelpFromXml();
        if (addCellHelpFromXml5 != null) {
            C786410Ut5.c5(addCellHelpFromXml5, 1.0f);
        }
        C786410Ut5.W4(loadingCellFromXml3, 1.0f);
        C786410Ut5.W4(addedCellFromXml3, 1.0f);
        if (this.LLJJJ) {
            C786410Ut5.LLZILL(getIconLoadingFromXml(), 0);
            C426750GoL.LJIIIZ(getTextLoadingStatusFromXml(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 0, 0, false, 16);
        }
        if (LJFF()) {
            int i = ((Number) C04R6.LIZ.getValue()).intValue() != 1 ? 2131821417 : 2131821418;
            TuxTextView textLoadingStatusFromXml = getTextLoadingStatusFromXml();
            if (textLoadingStatusFromXml != null) {
                textLoadingStatusFromXml.setText(i);
            }
        }
        LIZ(commentPostButtonFromXml3);
        LIZ(addCellFromXml3);
        ConstraintLayout addCellHelpFromXml6 = getAddCellHelpFromXml();
        if (addCellHelpFromXml6 != null) {
            LIZ(addCellHelpFromXml6);
        }
        LIZ(loadingCellFromXml3);
        LIZ(addedCellFromXml3);
        C1341780l1M c1341780l1M3 = C1341780l1M.LIZ;
        EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.NULL;
        C1341780l1M.LIZIZ(c1341780l1M3, commentPostButtonFromXml3, enumC1341650l19, 0.0f, null, 12);
        C1341780l1M.LIZIZ(c1341780l1M3, loadingCellFromXml3, enumC1341650l19, 0.0f, null, 12);
    }

    public final LinearLayout getAddCellFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ad4);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ConstraintLayout getAddCellHelpFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ad5);
            this.LLILLJJLI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final LinearLayout getAddedCellFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.afq);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ConstraintLayout getCommentPostButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ecs);
            this.LLIZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxSpinner getIconLoadingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k1r);
            this.LLIZLLLIL = (TuxSpinner) callbackFindViewById;
        }
        return (TuxSpinner) callbackFindViewById;
    }

    public final LinearLayout getLoadingCellFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nll);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getTextHelpFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xo3);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTextHelpSuffixFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xo4);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTextLoadingStatusFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xou);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout LIZLLL() {
        LinearLayout addCellFromXml = getAddCellFromXml();
        if (addCellFromXml != null && addCellFromXml.getVisibility() == 0) {
            return addCellFromXml;
        }
        LinearLayout loadingCellFromXml = getLoadingCellFromXml();
        if (loadingCellFromXml != null && loadingCellFromXml.getVisibility() == 0) {
            return loadingCellFromXml;
        }
        LinearLayout addedCellFromXml = getAddedCellFromXml();
        if (addedCellFromXml == null || addedCellFromXml.getVisibility() != 0) {
            return null;
        }
        return addedCellFromXml;
    }

    public final ViewGroup getVisibleAddCell() {
        return LJFF() ? getAddCellHelpFromXml() : getAddCellFromXml();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Function0<Unit> function0 = this.LLJJI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final Function1<Integer, Unit> getOnSelfVisibilityChanged() {
        return this.LLJJIII;
    }

    public static void LIZ(View view) {
        C786410Ut5.I7(null, view);
        view.setOnLongClickListener(null);
        view.setClickable(false);
        view.setLongClickable(false);
    }

    public final void LJ(boolean z) {
        int measuredHeight;
        View inlineBannerCellFromXml = getInlineBannerCellFromXml();
        if (inlineBannerCellFromXml == null) {
            return;
        }
        if (inlineBannerCellFromXml.getVisibility() != 0 && z) {
            return;
        }
        AnimatorSet animatorSet = this.LLJJJJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (!z) {
            C786410Ut5.LJLLLLLL(8, inlineBannerCellFromXml);
            C786410Ut5.T4(inlineBannerCellFromXml, 1.0f);
            ViewGroup.LayoutParams layoutParams = inlineBannerCellFromXml.getLayoutParams();
            layoutParams.height = -2;
            C786410Ut5.W5(inlineBannerCellFromXml, layoutParams);
            LJI();
            return;
        }
        this.LLJJJJJIL = true;
        try {
            LJI();
            this.LLJJJJJIL = false;
            LinearLayout linearLayoutLIZLLL = LIZLLL();
            if (linearLayoutLIZLLL != null) {
                C786410Ut5.W4(linearLayoutLIZLLL, 0.0f);
            }
            Integer numValueOf = Integer.valueOf(inlineBannerCellFromXml.getHeight());
            if (numValueOf.intValue() > 0) {
                measuredHeight = numValueOf.intValue();
            } else {
                measuredHeight = inlineBannerCellFromXml.getMeasuredHeight();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(inlineBannerCellFromXml, (Property<View, Float>) View.ALPHA, inlineBannerCellFromXml.getAlpha(), 0.0f);
            objectAnimatorOfFloat.setDuration(360L);
            arrayList.add(objectAnimatorOfFloat);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(measuredHeight, 0);
            valueAnimatorOfInt.setDuration(360L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(inlineBannerCellFromXml, 0));
            arrayList.add(valueAnimatorOfInt);
            if (linearLayoutLIZLLL != null) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayoutLIZLLL, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(360L);
                arrayList.add(objectAnimatorOfFloat2);
            }
            animatorSet2.playTogether(arrayList);
            animatorSet2.addListener(new ALAdapterS16S0200000_21(inlineBannerCellFromXml, this, 0));
            this.LLJJJJ = animatorSet2;
            animatorSet2.start();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJJJJJIL = false;
            throw th;
        }
    }

    public final void setAddCellFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setAddCellHelpFromXml(ConstraintLayout constraintLayout) {
        this.LLILLJJLI = constraintLayout;
    }

    public final void setAddedCellFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setCommentPostButtonFromXml(ConstraintLayout constraintLayout) {
        this.LLIZ = constraintLayout;
    }

    public final void setIconLoadingFromXml(TuxSpinner tuxSpinner) {
        this.LLIZLLLIL = tuxSpinner;
    }

    public final void setLoadingCellFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setOnDetached(Function0<Unit> function0) {
        this.LLJJI = function0;
    }

    public final void setOnSelfVisibilityChanged(Function1<? super Integer, Unit> function1) {
        this.LLJJIII = function1;
    }

    @Override // X.AbstractC1340180kym
    public void setReportedAddAsPostShow(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setTextHelpFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setTextHelpSuffixFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setTextLoadingStatusFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        Function1<? super Integer, Unit> function1;
        if (getVisibility() != i) {
            z = true;
        } else {
            z = false;
        }
        super.setVisibility(i);
        if (z && (function1 = this.LLJJIII) != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public C1340200kyo(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJJIJIL = "";
        this.LLJJJ = C1340700kzc.LIZ();
        C786410Ut5.LJLLJ(context, R.layout.a18, this);
        setClickable(false);
        setLongClickable(false);
        setFocusable(false);
    }

    public static Bundle LIZJ(Bundle bundle, String str, String str2) {
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        C786410Ut5.LJJJI("cmt_to_post_entrance_module", "preview_card", bundle2);
        C786410Ut5.LJJJI("cmt_to_post_entrance_element", str, bundle2);
        C786410Ut5.LJJJI("cmt_to_post_preview_position", "ori_comment", bundle2);
        if (str2 != null && str2.length() != 0) {
            C786410Ut5.LJJJI("cmt_to_post_initial_content_source", str2, bundle2);
        }
        return bundle2;
    }

    public final void LJII(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z) {
        C1322110kVd inlineBannerThumbnailFromXml;
        TuxTextView inlineBannerCtaFromXml;
        TuxIconView inlineBannerCloseFromXml;
        TuxTextView inlineBannerTitleFromXml;
        View inlineBannerCellFromXml = getInlineBannerCellFromXml();
        if (inlineBannerCellFromXml == null || (inlineBannerThumbnailFromXml = getInlineBannerThumbnailFromXml()) == null || (inlineBannerCtaFromXml = getInlineBannerCtaFromXml()) == null || (inlineBannerCloseFromXml = getInlineBannerCloseFromXml()) == null) {
            return;
        }
        if (str.length() > 0) {
            inlineBannerThumbnailFromXml.setImageURI(Uri.fromFile(new C0VSJ(str)), (Object) null);
        }
        if (str2.length() > 0 && (inlineBannerTitleFromXml = getInlineBannerTitleFromXml()) != null) {
            inlineBannerTitleFromXml.setText(str2);
        }
        C786410Ut5.q9(inlineBannerThumbnailFromXml, new ACListenerS155S0100000_21(function0, 177));
        C786410Ut5.h9(inlineBannerCtaFromXml, new ACListenerS155S0100000_21(function02, 178));
        C786410Ut5.a9(inlineBannerCloseFromXml, new ACListenerS155S0100000_21(function03, 179));
        if (inlineBannerCellFromXml.getVisibility() == 0) {
            return;
        }
        LIZ(getCommentPostButtonFromXml());
        LinearLayout addCellFromXml = getAddCellFromXml();
        if (addCellFromXml != null) {
            LIZ(addCellFromXml);
        }
        LinearLayout loadingCellFromXml = getLoadingCellFromXml();
        if (loadingCellFromXml != null) {
            LIZ(loadingCellFromXml);
        }
        LinearLayout addedCellFromXml = getAddedCellFromXml();
        if (addedCellFromXml != null) {
            LIZ(addedCellFromXml);
        }
        C1341780l1M c1341780l1M = C1341780l1M.LIZ;
        ConstraintLayout commentPostButtonFromXml = getCommentPostButtonFromXml();
        EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.NULL;
        C1341780l1M.LIZIZ(c1341780l1M, commentPostButtonFromXml, enumC1341650l19, 0.0f, null, 12);
        LinearLayout addCellFromXml2 = getAddCellFromXml();
        if (addCellFromXml2 != null) {
            C1341780l1M.LIZIZ(c1341780l1M, addCellFromXml2, enumC1341650l19, 0.0f, null, 12);
        }
        LinearLayout loadingCellFromXml2 = getLoadingCellFromXml();
        if (loadingCellFromXml2 != null) {
            C1341780l1M.LIZIZ(c1341780l1M, loadingCellFromXml2, enumC1341650l19, 0.0f, null, 12);
        }
        LinearLayout addedCellFromXml2 = getAddedCellFromXml();
        if (addedCellFromXml2 != null) {
            C1341780l1M.LIZIZ(c1341780l1M, addedCellFromXml2, enumC1341650l19, 0.0f, null, 12);
        }
        ConstraintLayout commentPostButtonFromXml2 = getCommentPostButtonFromXml();
        if (commentPostButtonFromXml2 != null) {
            commentPostButtonFromXml2.setLongClickable(true);
            commentPostButtonFromXml2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0kyp
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return true;
                }
            });
        }
        C786410Ut5.x(this, 0);
        LinearLayout linearLayoutLIZLLL = LIZLLL();
        if (!z) {
            ViewGroup.LayoutParams layoutParams = inlineBannerCellFromXml.getLayoutParams();
            layoutParams.height = -2;
            C786410Ut5.W5(inlineBannerCellFromXml, layoutParams);
            C786410Ut5.T4(inlineBannerCellFromXml, 0.0f);
            C786410Ut5.LJLLLLLL(0, inlineBannerCellFromXml);
            AnimatorSet animatorSet = this.LLJJJJ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (linearLayoutLIZLLL != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayoutLIZLLL, (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(200L);
                arrayList.add(objectAnimatorOfFloat);
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(inlineBannerCellFromXml, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(200L);
            arrayList.add(objectAnimatorOfFloat2);
            animatorSet2.playTogether(arrayList);
            animatorSet2.addListener(new ALAdapterS16S0200000_21(linearLayoutLIZLLL, this, 1));
            this.LLJJJJ = animatorSet2;
            animatorSet2.start();
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (width < 0) {
            width = 0;
        }
        if (width == 0) {
            C786410Ut5.T4(inlineBannerCellFromXml, 1.0f);
            C786410Ut5.LJLLLLLL(0, inlineBannerCellFromXml);
            if (linearLayoutLIZLLL != null) {
                C786410Ut5.LJZL(8, linearLayoutLIZLLL);
                return;
            }
            return;
        }
        inlineBannerCellFromXml.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = inlineBannerCellFromXml.getMeasuredHeight();
        if (measuredHeight <= 0) {
            C786410Ut5.T4(inlineBannerCellFromXml, 1.0f);
            C786410Ut5.LJLLLLLL(0, inlineBannerCellFromXml);
            if (linearLayoutLIZLLL != null) {
                C786410Ut5.LJZL(8, linearLayoutLIZLLL);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = inlineBannerCellFromXml.getLayoutParams();
        layoutParams2.height = 0;
        C786410Ut5.W5(inlineBannerCellFromXml, layoutParams2);
        C786410Ut5.T4(inlineBannerCellFromXml, 0.0f);
        C786410Ut5.LJLLLLLL(0, inlineBannerCellFromXml);
        AnimatorSet animatorSet3 = this.LLJJJJ;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        if (linearLayoutLIZLLL != null) {
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayoutLIZLLL, (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(360L);
            arrayList2.add(objectAnimatorOfFloat3);
        }
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(inlineBannerCellFromXml, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat4.setDuration(360L);
        arrayList2.add(objectAnimatorOfFloat4);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, measuredHeight);
        valueAnimatorOfInt.setDuration(360L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(inlineBannerCellFromXml, 1));
        arrayList2.add(valueAnimatorOfInt);
        animatorSet4.playTogether(arrayList2);
        animatorSet4.addListener(new ALAdapterS10S0300000_21(inlineBannerCellFromXml, linearLayoutLIZLLL, this, 0));
        this.LLJJJJ = animatorSet4;
        animatorSet4.start();
    }
}
