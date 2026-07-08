package X;

import Y.AsS35S0100000_8;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Knq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528360Knq {
    public final Function0<Unit> LIZ;
    public View LIZIZ;
    public RecyclerView LIZJ;
    public View LIZLLL;
    public View LJ;
    public C1322110kVd LJFF;
    public View LJI;
    public View LJII;
    public C1322110kVd LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public AnimatorSet LJIIJJI;
    public final HashMap<String, Integer> LJIIL;
    public String LJIILIIL;

    public final void LIZIZ() {
        String str = this.LJIILIIL;
        View view = Intrinsics.LJFF(str, "live_recordings") ? this.LJI : Intrinsics.LJFF(str, "ai_content") ? this.LIZLLL : null;
        if (this.LJIILIIL.length() == 0 || view == null || view.getVisibility() == 8) {
            return;
        }
        if ((view.getTranslationY() == (-((float) view.getHeight())) - ((float) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)))) && view.getAlpha() == 0.0f) {
            return;
        }
        LIZ(-view.getHeight(), 0.0f, view);
    }

    public final void LIZJ() {
        RecyclerView recyclerView = this.LIZJ;
        if (recyclerView == null) {
            return;
        }
        this.LJIIIZ = true;
        recyclerView.addOnScrollListener(new AsS35S0100000_8(this, 4));
        if (recyclerView instanceof C540760LIs) {
            ((C540760LIs) recyclerView).setTimeLineListener(new InterfaceC529170Kp9() { // from class: X.0Kny
                @Override // X.InterfaceC529170Kp9
                public final void LIZ(boolean z) {
                    if (z) {
                        this.LIZ.LIZIZ();
                    } else {
                        this.LIZ.LIZLLL();
                    }
                }
            });
        }
    }

    public final void LIZLLL() {
        String str = this.LJIILIIL;
        View view = Intrinsics.LJFF(str, "live_recordings") ? this.LJI : Intrinsics.LJFF(str, "ai_content") ? this.LIZLLL : null;
        if (this.LJIILIIL.length() == 0 || view == null || view.getVisibility() == 8) {
            return;
        }
        if ((view.getTranslationY() == 0.0f) && view.getAlpha() == 1.0f) {
            return;
        }
        LIZ(0.0f, 1.0f, view);
    }

    public C528360Knq(AwS552S0100000_8 awS552S0100000_8) {
        this.LIZ = awS552S0100000_8;
        HashMap<String, Integer> map = new HashMap<>();
        this.LJIIL = map;
        this.LJIILIIL = "";
        map.put("live_recordings", 0);
        map.put("ai_content", 1);
    }

    public final void LJ(TikTokMediaModel tikTokMediaModel, String str) {
        int iIntValue;
        String str2 = this.LJIILIIL;
        Integer num = this.LJIIL.get(str);
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer num2 = this.LJIIL.get(str2);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        if (iIntValue > iIntValue2) {
            return;
        }
        if (Intrinsics.LJFF(str, "live_recordings")) {
            if (tikTokMediaModel == null) {
                this.LJIILIIL = "";
                ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) C1659640tI2.LIZJ(this.LIZIZ).LIZ(ChooseMediaViewModel.class);
                chooseMediaViewModel.getClass();
                chooseMediaViewModel.yR2(new AwS23S0010000_8(false, 7));
                return;
            }
            this.LJIILIIL = "live_recordings";
            this.LIZ.invoke();
            ChooseMediaViewModel chooseMediaViewModel2 = (ChooseMediaViewModel) C1659640tI2.LIZJ(this.LIZIZ).LIZ(ChooseMediaViewModel.class);
            chooseMediaViewModel2.getClass();
            chooseMediaViewModel2.yR2(new AwS23S0010000_8(true, 7));
            C530900Krw.LIZIZ(this.LJIIIIZZ, tikTokMediaModel.LJFF(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            return;
        }
        if (!Intrinsics.LJFF(str, "ai_content") || !C301610Brz.LIZ()) {
            return;
        }
        if (tikTokMediaModel == null) {
            this.LJIILIIL = "";
            ChooseMediaViewModel chooseMediaViewModel3 = (ChooseMediaViewModel) C1659640tI2.LIZJ(this.LIZIZ).LIZ(ChooseMediaViewModel.class);
            chooseMediaViewModel3.getClass();
            chooseMediaViewModel3.yR2(new AwS23S0010000_8(false, 2));
            return;
        }
        this.LJIILIIL = "ai_content";
        this.LIZ.invoke();
        ChooseMediaViewModel chooseMediaViewModel4 = (ChooseMediaViewModel) C1659640tI2.LIZJ(this.LIZIZ).LIZ(ChooseMediaViewModel.class);
        chooseMediaViewModel4.getClass();
        chooseMediaViewModel4.yR2(new AwS23S0010000_8(true, 2));
        C1322110kVd c1322110kVd = this.LJFF;
        if (c1322110kVd == null) {
            return;
        }
        Size size = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        InterfaceC529900KqK interfaceC529900KqK = new InterfaceC529900KqK() { // from class: X.0Knz
            @Override // X.InterfaceC529900KqK
            public final void LIZ() {
            }

            @Override // X.InterfaceC529900KqK
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC529900KqK
            public final void onFailure(Throwable th) {
            }
        };
        Uri uriLJIILIIL = C2471909mP.LJIILIIL(tikTokMediaModel.LJFF());
        Context context = c1322110kVd.getContext();
        if (context == null) {
            return;
        }
        C529670Kpx.LIZIZ(c1322110kVd, context, uriLJIILIIL, size, interfaceC529900KqK);
    }

    public final void LIZ(float f, float f2, View view) {
        AnimatorSet animatorSet = this.LJIIJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", f2);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.start();
        this.LJIIJJI = animatorSet2;
    }
}
