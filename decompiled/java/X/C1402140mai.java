package X;

import android.content.Intent;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;

/* JADX INFO: renamed from: X.0mai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402140mai implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
            case 2:
                onActivityResult$2(this, i, i2, intent);
                break;
            case 3:
                onActivityResult$3(this, i, i2, intent);
                break;
            case 4:
                onActivityResult$4(this, i, i2, intent);
                break;
        }
    }

    public C1402140mai(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onActivityResult$0(C1402140mai c1402140mai, int i, int i2, Intent intent) {
        if (intent != null) {
            DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) c1402140mai.l0;
            intent.getLongExtra("TIME_PAUSED_IN_DETAIL_ACTIVITY", 0L);
            detailAwemeListFragment.getClass();
        }
    }

    public static final void onActivityResult$1(C1402140mai c1402140mai, int i, int i2, Intent intent) {
        if (intent != null) {
            DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) c1402140mai.l0;
            intent.getLongExtra("TIME_PAUSED_IN_DETAIL_ACTIVITY", 0L);
            detailAwemeListFragment.getClass();
        }
    }

    public static final void onActivityResult$2(C1402140mai c1402140mai, int i, int i2, Intent intent) {
        String strLJI;
        if (i2 != 104) {
            return;
        }
        AIChatGenNode aIChatGenNode = null;
        if (intent != null && (strLJI = C1354660lM8.LJI(intent)) != null && strLJI.length() != 0) {
            C1450600nqs c1450600nqsT2 = ((C1450590nqr) c1402140mai.l0).T2();
            if (intent != null) {
                aIChatGenNode = (AIChatGenNode) intent.getParcelableExtra("key_ai_chat_callback_data");
            }
            c1450600nqsT2.setImageAIChatGenNode(aIChatGenNode);
            ((C1450590nqr) c1402140mai.l0).i3(strLJI);
        }
    }

    public static final void onActivityResult$3(C1402140mai c1402140mai, int i, int i2, Intent intent) {
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(C724240Sb0.LJI((UIAssem) c1402140mai.l0), C1558520qew.LJIIL((UIAssem) c1402140mai.l0));
        if (iRefactorKeyboardFragmentLJIIJ != null) {
            iRefactorKeyboardFragmentLJIIJ.XW0(i2, intent, null);
        }
    }

    public static final void onActivityResult$4(C1402140mai c1402140mai, int i, int i2, Intent intent) {
        ((KeyboardDialogFragment) c1402140mai.l0).onActivityResult(i, i2, intent);
    }
}
