package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ID7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID7 extends ClickableSpan {
    public final int $t;
    public Object l0;

    public static final void onClick$4(C0ID7 c0id7, View view) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            case 3:
                textPaint.setUnderlineText(false);
                break;
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C0ID7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C0ID7 c0id7, View view) {
        C19EG c19egLIZIZ;
        if (Intrinsics.LJFF(((StoryNotePanelAuthorFragment) c0id7.l0).SR().LLIZLLLIL.getValue(), Boolean.FALSE)) {
            Context context = ((StoryNotePanelAuthorFragment) c0id7.l0).getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIIZ(2131849045);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StoryNotePanelAuthorFragment storyNotePanelAuthorFragment = (StoryNotePanelAuthorFragment) c0id7.l0;
        if (jElapsedRealtime - storyNotePanelAuthorFragment.LLJILLL <= 2000) {
            return;
        }
        storyNotePanelAuthorFragment.LLJILLL = jElapsedRealtime;
        Context context2 = storyNotePanelAuthorFragment.getContext();
        if (context2 == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context2);
        c1397580mTM.LIZ(2131849040);
        c1397580mTM.LJIILJJIL = true;
        C985403tE.LIZ(c1397580mTM, new AwS585S0100000_6(storyNotePanelAuthorFragment, 14));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void onClick$1(C0ID7 c0id7, View view) {
        SmartRouter.buildRoute(view.getContext(), ((C432010Gwp) c0id7.l0).LIZLLL).open();
    }

    public static final void onClick$2(C0ID7 c0id7, View view) {
        Function0<Unit> function0 = ((C430740Gum) c0id7.l0).LLJL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$3(C0ID7 c0id7, View view) {
        ((Function0) c0id7.l0).invoke();
    }

    public static final void updateDrawState$0(C0ID7 c0id7, TextPaint textPaint) {
        Integer numLIZJ;
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = ((StoryNotePanelAuthorFragment) c0id7.l0).getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1l, context)) != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public static final void updateDrawState$1(C0ID7 c0id7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$4(C0ID7 c0id7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, ((View) c0id7.l0).getContext());
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }
}
