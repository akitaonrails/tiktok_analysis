package X;

import Y.ARunnableS55S0300000_22;
import Y.ARunnableS91S0200000_22;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447790nmL extends FrameLayout implements InterfaceC1434080nQE {
    public final HashSet<String> LL;
    public C19PO LLILLJJLI;
    public TextView LLILLL;
    public ImageView LLILZ;
    public ImageView LLILZIL;
    public ImageView LLILZLL;
    public TextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public String LLJ;
    public TextView LLJI;
    public BaseShortVideoContext LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public final C1447810nmN LLJJ;
    public final IAVPublishService LLJJI;
    public final C1434100nQG LLJJIII;
    public boolean LLJJIJI;

    private final String getProgressAnnouncement() {
        return (String) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC1434080nQE
    public final void LIZ() {
        this.LLJJ.LIZ();
        LJII();
        ImageView imageView = this.LLILZIL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.V4(imageView, 0.0f);
        ImageView imageView2 = this.LLILZIL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C786410Ut5.Lc(imageView2, C341940Daq.LIZ(15.0d));
        ImageView imageView3 = this.LLILZIL;
        if (imageView3 == null) {
            imageView3 = null;
        }
        C786410Ut5.gd(imageView3, C341940Daq.LIZ(15.0d));
        final C1447920nmY c1447920nmY = new C1447920nmY();
        ImageView imageView4 = this.LLILZIL;
        final ViewPropertyAnimator viewPropertyAnimatorWithEndAction = (imageView4 != null ? imageView4 : null).animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300L).withEndAction(new ARunnableS91S0200000_22(this, c1447920nmY, 12));
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.0nmO
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                this.LIZ.LLJJ.LIZLLL(c1447920nmY);
                viewPropertyAnimatorWithEndAction.cancel();
            }
        });
        C1447810nmN c1447810nmN = this.LLJJ;
        c1447810nmN.getClass();
        C12WP.LIZ();
        ((ArrayList) c1447810nmN.LIZLLL).add(c1447920nmY);
    }

    public final void LJI() {
        C19PO c19po = this.LLILLJJLI;
        if (c19po == null) {
            c19po = null;
        }
        float f = this.LLJILJILJ ? 0.8f : 1.0f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19po);
        c19po.setScaleX(f);
        C19PO c19po2 = this.LLILLJJLI;
        C19PO c19po3 = c19po2 != null ? c19po2 : null;
        float f2 = this.LLJILJILJ ? 0.8f : 1.0f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19po3);
        c19po3.setScaleY(f2);
    }

    public final void LJII() {
        ImageView imageView = this.LLILZ;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.V4(imageView, 1.0f);
        ImageView imageView2 = this.LLILZ;
        if (imageView2 == null) {
            imageView2 = null;
        }
        C786410Ut5.Lc(imageView2, 0.0f);
        ImageView imageView3 = this.LLILZ;
        if (imageView3 == null) {
            imageView3 = null;
        }
        C786410Ut5.gd(imageView3, 0.0f);
        ImageView imageView4 = this.LLILZIL;
        if (imageView4 == null) {
            imageView4 = null;
        }
        C786410Ut5.V4(imageView4, 1.0f);
        ImageView imageView5 = this.LLILZIL;
        if (imageView5 == null) {
            imageView5 = null;
        }
        C786410Ut5.Lc(imageView5, 0.0f);
        ImageView imageView6 = this.LLILZIL;
        if (imageView6 == null) {
            imageView6 = null;
        }
        C786410Ut5.gd(imageView6, 0.0f);
        ImageView imageView7 = this.LLILZLL;
        if (imageView7 == null) {
            imageView7 = null;
        }
        C786410Ut5.V4(imageView7, 1.0f);
        ImageView imageView8 = this.LLILZLL;
        if (imageView8 == null) {
            imageView8 = null;
        }
        C786410Ut5.Lc(imageView8, 0.0f);
        ImageView imageView9 = this.LLILZLL;
        C786410Ut5.gd(imageView9 != null ? imageView9 : null, 0.0f);
    }

    public final void LJIIIIZZ() {
        if (this.LLJJI.needShowAnim()) {
            TextView textView = this.LLJI;
            if (textView == null) {
                textView = null;
            }
            textView.setMaxLines(Integer.MAX_VALUE);
            ImageView imageView = this.LLILZ;
            if (imageView == null) {
                imageView = null;
            }
            int id = imageView.getId();
            if (this.LLJJI.isMultiTaskRecover()) {
                ImageView imageView2 = this.LLILZIL;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                id = imageView2.getId();
                TextView textView2 = this.LLJI;
                if (textView2 == null) {
                    textView2 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116));
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                TextView textView3 = this.LLJI;
                if (textView3 == null) {
                    textView3 = null;
                }
                C786410Ut5.g6(textView3, marginLayoutParams);
            }
            TextView textView4 = this.LLJI;
            if (textView4 == null) {
                textView4 = null;
            }
            if (textView4.getLineCount() <= 3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.tqy);
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                TextView textView5 = this.LLJI;
                if (textView5 == null) {
                    textView5 = null;
                }
                c19mb.LJIIIIZZ(textView5.getId(), 4, id, 4);
                c19mb.LIZIZ(constraintLayout);
            }
            TextView textView6 = this.LLJI;
            if (textView6 == null) {
                textView6 = null;
            }
            C786410Ut5.LLIL(textView6, 0);
            TextView textView7 = this.LLJI;
            if (textView7 == null) {
                textView7 = null;
            }
            C786410Ut5.S4(1.0f, textView7);
            C430110Gtl.LIZ(this, AFwS210S0000000_22.get$arr$(168));
            TextView textView8 = this.LLJI;
            if (textView8 == null) {
                textView8 = null;
            }
            textView8.setText(2131846540);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 0, getTranslateDistance(), 1, 0.0f, 1, 0.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setAnimationListener(new AnimationAnimationListenerC1466590oGf(this, 1));
            TextView textView9 = this.LLJI;
            if (textView9 == null) {
                textView9 = null;
            }
            if (textView9.getVisibility() == 0) {
                C15O7.LJIIIIZZ(3000L).LJ(new C1466860oH6(animationSet, this, 2), C15O7.LJIIIIZZ, null);
                this.LLJJI.setNeedShowAnim(false);
                this.LLJJI.setMultiTaskRecover(false);
            }
        }
    }

    public final VideoPublishEditModel getCurrentModel() {
        BaseShortVideoContext baseShortVideoContext = this.LLJIJIL;
        if (baseShortVideoContext == null) {
            baseShortVideoContext = null;
        }
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            return (VideoPublishEditModel) baseShortVideoContext;
        }
        return null;
    }

    public final int getEnterAnim() {
        return this.LLJJI.needShowAnim() ? R.anim.ew : R.anim.fx;
    }

    private final float getTranslateDistance() {
        return C444960Hcc.LIZIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) : -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public final void LJ() {
        String progressAnnouncement = getProgressAnnouncement();
        TextView textView = this.LLILLL;
        if (textView == null) {
            textView = null;
        }
        announceForAccessibility(C1447850nmR.LIZ.replace(progressAnnouncement, new C5183020f(C2097908Jt.LIZJ(new Pair("percentage", textView.getText().toString())), (Map<String, String>) 143)));
    }

    public final Integer getCurrentProgress() {
        return getState().LIZIZ.getValue();
    }

    @Override // X.InterfaceC1434080nQE
    public final void hide() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            C0SHX.LIZ(topActivity, null).LJIIJJI("upload_progress_fragment", false, null);
        }
    }

    public final IAVPublishService getPublishService() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1434080nQE
    public C1434100nQG getState() {
        return this.LLJJIII;
    }

    public C1447790nmL(Context context) {
        super(context, null, 0);
        this.LL = new HashSet<>();
        new HashMap();
        this.LLJILLL = C452501pT.LIZIZ(new AwS566S0100000_22(context, 349));
        this.LLJJ = new C1447810nmN();
        this.LLJJI = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        C1434100nQG c1434100nQG = new C1434100nQG();
        c1434100nQG.LJ.setValue(-1);
        c1434100nQG.LIZIZ(0);
        this.LLJJIII = c1434100nQG;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c9g, this, true);
        View viewFindViewById = findViewById(R.id.bwx);
        if (viewFindViewById != null) {
            this.LLILZ = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.bx0);
            if (viewFindViewById2 != null) {
                this.LLILZIL = (ImageView) viewFindViewById2;
                View viewFindViewById3 = findViewById(R.id.bx1);
                if (viewFindViewById3 != null) {
                    this.LLILZLL = (ImageView) viewFindViewById3;
                    View viewFindViewById4 = findViewById(R.id.lno);
                    if (viewFindViewById4 != null) {
                        C19PO c19po = (C19PO) viewFindViewById4;
                        this.LLILLJJLI = c19po;
                        c19po.setIndeterminate(false);
                        View viewFindViewById5 = findViewById(R.id.z5m);
                        if (viewFindViewById5 != null) {
                            this.LLILLL = (TextView) viewFindViewById5;
                            View viewFindViewById6 = findViewById(R.id.videoCount);
                            if (viewFindViewById6 != null) {
                                this.LLIZ = (TextView) viewFindViewById6;
                                View viewFindViewById7 = findViewById(R.id.uploadingHintText);
                                if (viewFindViewById7 != null) {
                                    this.LLJI = (TextView) viewFindViewById7;
                                    this.LLIZLLLIL = (TuxTextView) findViewById(R.id.zoc);
                                    LIZLLL(findViewById(R.id.bwy));
                                    ImageView imageView = this.LLILZ;
                                    LIZLLL(imageView == null ? null : imageView);
                                    ImageView imageView2 = this.LLILZIL;
                                    LIZLLL(imageView2 == null ? null : imageView2);
                                    ImageView imageView3 = this.LLILZLL;
                                    LIZLLL(imageView3 != null ? imageView3 : null);
                                    this.LLJJIJI = true;
                                    return;
                                }
                                "ID does not reference a View inside this View".toString();
                                throw new IllegalArgumentException("ID does not reference a View inside this View");
                            }
                            "ID does not reference a View inside this View".toString();
                            throw new IllegalArgumentException("ID does not reference a View inside this View");
                        }
                        "ID does not reference a View inside this View".toString();
                        throw new IllegalArgumentException("ID does not reference a View inside this View");
                    }
                    "ID does not reference a View inside this View".toString();
                    throw new IllegalArgumentException("ID does not reference a View inside this View");
                }
                "ID does not reference a View inside this View".toString();
                throw new IllegalArgumentException("ID does not reference a View inside this View");
            }
            "ID does not reference a View inside this View".toString();
            throw new IllegalArgumentException("ID does not reference a View inside this View");
        }
        "ID does not reference a View inside this View".toString();
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void LIZLLL(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new C1077140e8W(1));
    }

    @Override // X.InterfaceC1434080nQE
    public final void LIZIZ(Function0<Unit> function0) {
        this.LLJJ.LIZ();
        LJII();
        ImageView imageView = this.LLILZ;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        float x = imageView.getX();
        ImageView imageView3 = this.LLILZIL;
        if (imageView3 == null) {
            imageView3 = null;
        }
        float x2 = x - imageView3.getX();
        ImageView imageView4 = this.LLILZ;
        if (imageView4 == null) {
            imageView4 = null;
        }
        float y = imageView4.getY();
        ImageView imageView5 = this.LLILZIL;
        if (imageView5 == null) {
            imageView5 = null;
        }
        float y2 = y - imageView5.getY();
        final C1447920nmY c1447920nmY = new C1447920nmY();
        ImageView imageView6 = this.LLILZ;
        if (imageView6 == null) {
            imageView6 = null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = imageView6.animate().alpha(0.0f);
        ImageView imageView7 = this.LLILZ;
        if (imageView7 == null) {
            imageView7 = null;
        }
        final ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.translationY(((-imageView7.getHeight()) * 2) / 3.0f).setDuration(300L);
        ImageView imageView8 = this.LLILZLL;
        if (imageView8 == null) {
            imageView8 = null;
        }
        C786410Ut5.V4(imageView8, 0.0f);
        ImageView imageView9 = this.LLILZLL;
        if (imageView9 == null) {
            imageView9 = null;
        }
        C786410Ut5.Lc(imageView9, C341940Daq.LIZ(15.0d));
        ImageView imageView10 = this.LLILZLL;
        if (imageView10 == null) {
            imageView10 = null;
        }
        C786410Ut5.gd(imageView10, C341940Daq.LIZ(15.0d));
        ImageView imageView11 = this.LLILZLL;
        if (imageView11 == null) {
            imageView11 = null;
        }
        final ViewPropertyAnimator duration2 = imageView11.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300L);
        ImageView imageView12 = this.LLILZIL;
        if (imageView12 != null) {
            imageView2 = imageView12;
        }
        final ViewPropertyAnimator viewPropertyAnimatorWithEndAction = imageView2.animate().translationX(x2).translationY(y2).setDuration(300L).withEndAction(new ARunnableS55S0300000_22(this, c1447920nmY, function0, 4));
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.0nmQ
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                this.LIZ.LLJJ.LIZLLL(c1447920nmY);
                duration.cancel();
                duration2.cancel();
                viewPropertyAnimatorWithEndAction.cancel();
            }
        });
        C1447810nmN c1447810nmN = this.LLJJ;
        c1447810nmN.getClass();
        C12WP.LIZ();
        ((ArrayList) c1447810nmN.LIZLLL).add(c1447920nmY);
    }

    @Override // X.InterfaceC1434080nQE
    public final void LIZJ(Function0<Unit> function0) {
        this.LLJJ.LIZ();
        LJII();
        ImageView imageView = this.LLILZ;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        float x = imageView.getX();
        ImageView imageView3 = this.LLILZIL;
        if (imageView3 == null) {
            imageView3 = null;
        }
        float x2 = x - imageView3.getX();
        ImageView imageView4 = this.LLILZ;
        if (imageView4 == null) {
            imageView4 = null;
        }
        float y = imageView4.getY();
        ImageView imageView5 = this.LLILZIL;
        if (imageView5 == null) {
            imageView5 = null;
        }
        float y2 = y - imageView5.getY();
        final C1447920nmY c1447920nmY = new C1447920nmY();
        ImageView imageView6 = this.LLILZ;
        if (imageView6 == null) {
            imageView6 = null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = imageView6.animate().alpha(0.0f);
        ImageView imageView7 = this.LLILZ;
        if (imageView7 == null) {
            imageView7 = null;
        }
        final ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.translationY(((-imageView7.getHeight()) * 2) / 3.0f).setDuration(300L);
        ImageView imageView8 = this.LLILZIL;
        if (imageView8 != null) {
            imageView2 = imageView8;
        }
        final ViewPropertyAnimator viewPropertyAnimatorWithEndAction = imageView2.animate().translationX(x2).translationY(y2).setDuration(300L).withEndAction(new ARunnableS55S0300000_22(this, c1447920nmY, function0, 3));
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.0nmP
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                this.LIZ.LLJJ.LIZLLL(c1447920nmY);
                duration.cancel();
                viewPropertyAnimatorWithEndAction.cancel();
            }
        });
        C1447810nmN c1447810nmN = this.LLJJ;
        c1447810nmN.getClass();
        C12WP.LIZ();
        ((ArrayList) c1447810nmN.LIZLLL).add(c1447920nmY);
    }

    public final boolean LJFF(String str) {
        if (this.LL.contains(str)) {
            return false;
        }
        this.LL.add(str);
        return true;
    }

    public final void LJIIIZ(int i) {
        StringBuilder sbLIZ;
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            LJI();
        }
        C19PO c19po = this.LLILLJJLI;
        TuxTextView tuxTextView = null;
        if (c19po == null) {
            c19po = null;
        }
        c19po.setProgress(i);
        TextView textView = this.LLILLL;
        if (textView == null) {
            textView = null;
        }
        if (C444960Hcc.LIZIZ()) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('%');
            sbLIZ.append(i);
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
        }
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        LJ();
        TuxTextView tuxTextView2 = this.LLIZLLLIL;
        if (tuxTextView2 != null) {
            tuxTextView = tuxTextView2;
        }
        tuxTextView.setText("");
    }
}
