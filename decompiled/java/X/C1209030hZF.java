package X;

import Y.ARunnableS118S0100000_18;
import Y.ARunnableS87S0200000_18;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.manage.joinquestion.EditJoinQuestionFragment;

/* JADX INFO: renamed from: X.0hZF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209030hZF implements C0TVI {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C1209030hZF(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C1209030hZF c1209030hZF, View view, C20246014Ju c20246014Ju) {
        ((PollCreateFragment) c1209030hZF.l0).LLJILLL = c20246014Ju.LIZ(7).LIZIZ;
        View view2 = (View) c1209030hZF.l1;
        HandlerHook.viewPost(view2, new ARunnableS87S0200000_18(view2, (PollCreateFragment) c1209030hZF.l0, 3));
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C1209030hZF c1209030hZF, View view, C20246014Ju c20246014Ju) {
        boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
        EditJoinQuestionFragment editJoinQuestionFragment = (EditJoinQuestionFragment) c1209030hZF.l0;
        if (editJoinQuestionFragment.LLIZ && !zLJIIIIZZ) {
            HandlerHook.viewPost((View) c1209030hZF.l1, new ARunnableS118S0100000_18(editJoinQuestionFragment, 74));
        }
        ((EditJoinQuestionFragment) c1209030hZF.l0).LLIZ = zLJIIIIZZ;
        return c20246014Ju;
    }
}
