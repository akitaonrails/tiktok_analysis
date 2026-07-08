package X;

import Y.ALAdapterS0S0100000_2;
import Y.AUListenerS253S0100000_2;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.story.experiment.streak.GroupChatStreakExpConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS686S0100000_2;

/* JADX INFO: renamed from: X.06po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1728606po extends ConstraintLayout implements InterfaceC1728206pk {
    public static final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360));
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public Animator LLJJ;
    public Animator LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C1231704rr LLJJIJIIJIL;
    public Function0<Unit> LLJJIJIL;
    public Function1<? super Boolean, Unit> LLJJJ;

    @Override // X.InterfaceC1728206pk
    public final void LJLJJI() {
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        addView(getShadowBackground());
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS253S0100000_2(this, 53));
        valueAnimatorOfFloat.addListener(new ALAdapterS0S0100000_2(this, 6));
        valueAnimatorOfFloat.start();
        this.LLJJ = valueAnimatorOfFloat;
    }

    @Override // X.InterfaceC1728206pk
    public final void LJLJJLL() {
        Animator animator = this.LLJJ;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LLJJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        View shadowBackground = getShadowBackground();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, shadowBackground);
        removeView(shadowBackground);
        for (View view : getElementViewList()) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
            removeView(view);
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLJJIII = false;
        this.LLJJIJI = false;
    }

    @Override // X.InterfaceC1728206pk
    public final void LLLLILI() {
        if (this.LLJJIII) {
            return;
        }
        this.LLJJIII = true;
        Iterator<View> it2 = getElementViewList().iterator();
        while (it2.hasNext()) {
            addView(it2.next());
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS253S0100000_2(this, 52));
        valueAnimatorOfFloat.addListener(new ALAdapterS0S0100000_2(this, 5));
        valueAnimatorOfFloat.start();
        this.LLJJI = valueAnimatorOfFloat;
    }

    public final TuxIconView getCloseIcon() {
        return (TuxIconView) this.LLILZLL.getValue();
    }

    public final List<View> getElementViewList() {
        return (List) this.LLJILLL.getValue();
    }

    public final C197039127h getPostToStoryButton() {
        return (C197039127h) this.LLJ.getValue();
    }

    public final View getPostToStoryReferenceView() {
        return (View) this.LLJILJILJ.getValue();
    }

    public final View getReferenceView() {
        return (View) this.LLJIJIL.getValue();
    }

    public final View getShadowBackground() {
        return (View) this.LLJI.getValue();
    }

    public final View getSubtitleReferenceView() {
        return (View) this.LLJILJIL.getValue();
    }

    public final TuxTextView getSubtitleTv() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    public final TuxTextView getTitleTv() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    public final void setOnClickListenerEmptyArea(Function0<Unit> function0) {
        C786410Ut5.I7(new AbS686S0100000_2(function0, 24), getShadowBackground());
        for (View view : getElementViewList()) {
            if (!Intrinsics.LJFF(view, getPostToStoryButton()) && !Intrinsics.LJFF(view, getCloseIcon()) && !Intrinsics.LJFF(view, getReferenceView()) && !Intrinsics.LJFF(view, getSubtitleReferenceView()) && !Intrinsics.LJFF(view, getPostToStoryReferenceView())) {
                C786410Ut5.I7(new AbS686S0100000_2(function0, 25), view);
            }
        }
    }

    public C1728606po(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        int iLIZIZ;
        int iLIZIZ2;
        super(context, attributeSet, i);
        this.LL = Math.min((C497820Jfg.LIZ(context) * 9) / 16, C497820Jfg.LIZIZ(context));
        if (C12ES.LJIIJ(context) <= LLJJJJLIIL) {
            z = true;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        } else {
            z = false;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        this.LLILLJJLI = iLIZIZ;
        if (z) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        }
        this.LLILLL = iLIZIZ2;
        this.LLILZ = iLIZIZ2;
        this.LLILZIL = iLIZIZ2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLILZLL = C452501pT.LIZIZ(new AwS403S0200000_2(context, this, 87));
        this.LLIZ = C452501pT.LIZIZ(new AwS403S0200000_2(context, this, 91));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS403S0200000_2(context, this, 90));
        this.LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(context, 1223));
        this.LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(context, 1225));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS403S0200000_2(context, this, 88));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS403S0200000_2(context, this, 89));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS546S0100000_2(context, 1224));
        this.LLJILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1222));
        this.LLJJIJIIJIL = new C1231704rr("streak_milestone_story_anim", null, 6);
    }

    @Override // X.InterfaceC1728206pk
    public final void LLLII(int i, String str, boolean z) {
        String string;
        String string2;
        Context context = getContext();
        TuxTextView titleTv = getTitleTv();
        if (i == 3) {
            string = context.getString(2131849183);
        } else {
            string = context.getString(2131849185);
        }
        titleTv.setText(string);
        TuxTextView subtitleTv = getSubtitleTv();
        if (str.length() > 20) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, 20));
            sbLIZ.append("...");
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (z && ((GroupChatStreakExpConfig) C126U.LIZIZ.getValue()).getEnable()) {
            string2 = context.getResources().getQuantityString(2131755733, i, Integer.valueOf(i));
        } else {
            string2 = context.getString(2131849178, str, Integer.valueOf(i));
        }
        subtitleTv.setText(string2);
    }
}
