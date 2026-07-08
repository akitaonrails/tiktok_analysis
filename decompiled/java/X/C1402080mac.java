package X;

import android.os.Looper;
import android.os.MessageQueue;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentPanelFakeInput;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.DetailBottomFakeInput;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0mac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402080mac implements MessageQueue.IdleHandler {
    public final int $t;
    public Object l0;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.$t) {
            case 0:
                return queueIdle$0(this);
            case 1:
                return queueIdle$1(this);
            case 2:
                return queueIdle$2(this);
            case 3:
                return queueIdle$3(this);
            default:
                return false;
        }
    }

    public static final boolean queueIdle$0(C1402080mac c1402080mac) {
        if (!((RefactorKeyboardPanelV2) c1402080mac.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return false;
        }
        if (!((RefactorKeyboardPanelV2) c1402080mac.l0).getContentView().isShown()) {
            return true;
        }
        AwS420S0200000_19 awS420S0200000_19 = ((RefactorKeyboardPanelV2) c1402080mac.l0).LLJLLIL;
        if (awS420S0200000_19 != null) {
            awS420S0200000_19.invoke();
        }
        ((RefactorKeyboardPanelV2) c1402080mac.l0).LLJLLIL = null;
        return false;
    }

    public static final boolean queueIdle$1(C1402080mac c1402080mac) {
        if (!((RefactorKeyboardPanelV2) c1402080mac.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            return false;
        }
        if (!((RefactorKeyboardPanelV2) c1402080mac.l0).getContentView().isShown()) {
            return true;
        }
        AwS265S0300000_21 awS265S0300000_21 = ((RefactorKeyboardPanelV2) c1402080mac.l0).LLJLL;
        if (awS265S0300000_21 != null) {
            awS265S0300000_21.invoke();
        }
        RefactorKeyboardPanelV2 refactorKeyboardPanelV2 = (RefactorKeyboardPanelV2) c1402080mac.l0;
        refactorKeyboardPanelV2.LLJLL = null;
        C1402080mac c1402080mac2 = new C1402080mac(refactorKeyboardPanelV2, 0);
        ((ArrayList) refactorKeyboardPanelV2.LLJLILLLLZIIL).add(c1402080mac2);
        C786410Ut5.f3(c1402080mac2, Looper.myQueue());
        return false;
    }

    public static final boolean queueIdle$2(C1402080mac c1402080mac) {
        C19EG c19egLIZ = C724240Sb0.LIZ((DetailBottomFakeInput) c1402080mac.l0);
        Aweme aweme = null;
        if ((c19egLIZ instanceof C19EG) && c19egLIZ != null && !c19egLIZ.isFinishing() && !c19egLIZ.isDestroyed()) {
            DetailBottomFakeInput detailBottomFakeInput = (DetailBottomFakeInput) c1402080mac.l0;
            if (detailBottomFakeInput.LLILZ && detailBottomFakeInput.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                C1344030l4z.LIZJ("DetailBottomFakeInput", "scheduleKeyboardPreWarm: idle fired, starting pre-warm");
                C1344970l6V.LIZ(c19egLIZ);
                DetailBottomFakeInput detailBottomFakeInput2 = (DetailBottomFakeInput) c1402080mac.l0;
                EnumC1341680l1C enumC1341680l1C = EnumC1341680l1C.TEXT;
                int i = BaseFakeInput.LLLII;
                C1346920l9e c1346920l9eTp = detailBottomFakeInput2.Tp(enumC1341680l1C, null);
                C1347350lAL c1347350lAL = C1347350lAL.LIZ;
                Fragment fragmentLJI = C724240Sb0.LJI((DetailBottomFakeInput) c1402080mac.l0);
                CommentContextSource commentContextSourceKp = ((DetailBottomFakeInput) c1402080mac.l0).kp();
                if (commentContextSourceKp != null) {
                    aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
                }
                CommentContextSource commentContextSourceKp2 = ((DetailBottomFakeInput) c1402080mac.l0).kp();
                c1347350lAL.getClass();
                C1347350lAL.LIZLLL(c19egLIZ, fragmentLJI, aweme, commentContextSourceKp2, c1346920l9eTp);
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean queueIdle$3(C1402080mac c1402080mac) {
        C19EG c19egLIZ = C724240Sb0.LIZ((CommentPanelFakeInput) c1402080mac.l0);
        Aweme aweme = null;
        if ((c19egLIZ instanceof C19EG) && c19egLIZ != null && !c19egLIZ.isFinishing() && !c19egLIZ.isDestroyed()) {
            CommentPanelFakeInput commentPanelFakeInput = (CommentPanelFakeInput) c1402080mac.l0;
            if (commentPanelFakeInput.LLILZ && commentPanelFakeInput.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                C1344030l4z.LIZJ("CommentPanelFakeInput", "scheduleKeyboardPreWarm: idle fired, starting pre-warm");
                C1344970l6V.LIZ(c19egLIZ);
                CommentPanelFakeInput commentPanelFakeInput2 = (CommentPanelFakeInput) c1402080mac.l0;
                EnumC1341680l1C enumC1341680l1C = EnumC1341680l1C.TEXT;
                int i = BaseFakeInput.LLLII;
                C1346920l9e c1346920l9eTp = commentPanelFakeInput2.Tp(enumC1341680l1C, null);
                C1347350lAL c1347350lAL = C1347350lAL.LIZ;
                Fragment fragmentLJI = C724240Sb0.LJI((CommentPanelFakeInput) c1402080mac.l0);
                CommentContextSource commentContextSourceKp = ((CommentPanelFakeInput) c1402080mac.l0).kp();
                if (commentContextSourceKp != null) {
                    aweme = CommentContextSourceKt.aweme(commentContextSourceKp);
                }
                CommentContextSource commentContextSourceKp2 = ((CommentPanelFakeInput) c1402080mac.l0).kp();
                c1347350lAL.getClass();
                C1347350lAL.LIZLLL(c19egLIZ, fragmentLJI, aweme, commentContextSourceKp2, c1346920l9eTp);
                return false;
            }
            return false;
        }
        return false;
    }

    public C1402080mac(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
