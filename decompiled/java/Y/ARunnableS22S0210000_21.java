package Y;

import X.C0P0T;
import X.C1075940e6a;
import X.C1346760l9O;
import X.C1350920lG6;
import X.C1353510lKH;
import X.C1369220ljc;
import X.C1391600mJi;
import X.C1C7U;
import X.C450720Hlu;
import X.C665740Q9k;
import X.EnumC1235690iGF;
import X.EnumC1368950ljB;
import android.content.Context;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.BaseInboxFragment;
import com.ss.android.ugc.now.interaction.assem.NowKeyboardInputAssem;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS138S0110000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS22S0210000_21 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.z2 && ((List) this.l0).isEmpty()) {
            ((C1369220ljc) this.l1).LLJJIJI.setValue(EnumC1368950ljB.LOADED);
        }
        ((C1369220ljc) this.l1).LLJJI.setValue((List) this.l0);
        if (this.z2 && (!((List) this.l0).isEmpty())) {
            ((C1369220ljc) this.l1).LLJJIJI.setValue(EnumC1368950ljB.LOADED);
        }
    }

    public final void LIZ$1() {
        KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) this.l0;
        if (!keyboardIconGroupAssem.LLILZ || !keyboardIconGroupAssem.Jo(true)) {
            KeyboardIconGroupAssem keyboardIconGroupAssem2 = (KeyboardIconGroupAssem) this.l0;
            keyboardIconGroupAssem2.LLLFZ = false;
            keyboardIconGroupAssem2.LLLFFI = null;
            if (this.z2) {
                C1346760l9O.LIZ("poll_guide");
                return;
            }
            return;
        }
        KeyboardIconGroupAssem keyboardIconGroupAssem3 = (KeyboardIconGroupAssem) this.l0;
        keyboardIconGroupAssem3.LLLFFI = null;
        C1075940e6a c1075940e6a = C1075940e6a.LIZ;
        Context context = ((TuxIconView) this.l1).getContext();
        TuxIconView tuxIconView = (TuxIconView) this.l1;
        AwS138S0110000_21 awS138S0110000_21 = new AwS138S0110000_21((KeyboardIconGroupAssem) this.l0, this.z2, 0);
        AwS138S0110000_21 awS138S0110000_212 = new AwS138S0110000_21((KeyboardIconGroupAssem) this.l0, this.z2, 1);
        c1075940e6a.getClass();
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        c450720Hlu.LLILLJJLI.LIZIZ = tuxIconView;
        c450720Hlu.LJIIJ(2131829074);
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJIIL = true;
        c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        c1391600mJi.LJIJJ = true;
        c450720Hlu.LJIIIZ(true, new ACListenerS155S0100000_21(awS138S0110000_21, 40));
        c450720Hlu.LJ(AFwS204S0000000_16.get$arr$(125));
        c450720Hlu.LIZJ(new AwS600S0100000_21(awS138S0110000_212, 92));
        keyboardIconGroupAssem3.LLJLLL = c450720Hlu.LIZIZ();
        C0P0T c0p0t = ((KeyboardIconGroupAssem) this.l0).LLJLLL;
        if (c0p0t != null) {
            c0p0t.show();
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceBp = ((KeyboardIconGroupAssem) this.l0).bp();
        Aweme aweme = commentContextSourceBp != null ? CommentContextSourceKt.aweme(commentContextSourceBp) : null;
        CommentContextSource commentContextSourceBp2 = ((KeyboardIconGroupAssem) this.l0).bp();
        String strEnterFrom = commentContextSourceBp2 != null ? CommentContextSourceKt.enterFrom(commentContextSourceBp2) : null;
        CommentContextSource commentContextSourceBp3 = ((KeyboardIconGroupAssem) this.l0).bp();
        String strEnterMethod = commentContextSourceBp3 != null ? CommentContextSourceKt.enterMethod(commentContextSourceBp3) : null;
        c1350920lG6.getClass();
        C1350920lG6.LJJJJJL("comment_poll", strEnterFrom, strEnterMethod, aweme);
    }

    public final void LIZ$2() {
        int i;
        if (this.z2) {
            Rect rectLIZIZ = C665740Q9k.LIZIZ((RecyclerView.ViewHolder) this.l0);
            if (rectLIZIZ != null) {
                BaseInboxFragment baseInboxFragment = (BaseInboxFragment) this.l1;
                int[] iArr = new int[2];
                baseInboxFragment.NR().getLocationOnScreen(iArr);
                i = rectLIZIZ.top - iArr[1];
                int iComputeVerticalScrollRange = (baseInboxFragment.NR().computeVerticalScrollRange() - baseInboxFragment.NR().computeVerticalScrollOffset()) - baseInboxFragment.NR().getHeight();
                if (iComputeVerticalScrollRange <= 0) {
                    iComputeVerticalScrollRange = 0;
                }
                if (i > iComputeVerticalScrollRange) {
                    baseInboxFragment.NR().animate().translationY(iComputeVerticalScrollRange - i).setDuration(300L).start();
                    i = iComputeVerticalScrollRange;
                }
            } else {
                i = 0;
            }
            ((BaseInboxFragment) this.l1).LLJI = i;
        } else {
            ((BaseInboxFragment) this.l1).NR().animate().translationY(0.0f).setDuration(300L).start();
            BaseInboxFragment baseInboxFragment2 = (BaseInboxFragment) this.l1;
            i = -baseInboxFragment2.LLJI;
            baseInboxFragment2.LLJI = 0;
        }
        ((BaseInboxFragment) this.l1).NR().smoothScrollBy(0, i);
    }

    public static final void run$0(ARunnableS22S0210000_21 aRunnableS22S0210000_21) {
        boolean zLIZ;
        C1C7U.LIZ("ShareMoreContactsRepository@8b41.publishRelationSearchResults$update$1");
        try {
            aRunnableS22S0210000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareMoreContactsRepository@8b41.publishRelationSearchResults$update$1");
    }

    public static final void run$1(ARunnableS22S0210000_21 aRunnableS22S0210000_21) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardIconGroupAssem@a073.showPollGuideIfNeed$1");
        try {
            aRunnableS22S0210000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardIconGroupAssem@a073.showPollGuideIfNeed$1");
    }

    public static final void run$2(ARunnableS22S0210000_21 aRunnableS22S0210000_21) {
        boolean zLIZ;
        C1C7U.LIZ("NowKeyboardInputAssem@92ef.openSoftInput$1$1");
        try {
            if (aRunnableS22S0210000_21.z2) {
                ((NowKeyboardInputAssem) aRunnableS22S0210000_21.l0).mp();
                KeyboardUtils.LIZLLL((C1353510lKH) aRunnableS22S0210000_21.l1);
            } else {
                KeyboardUtils.LIZIZ((C1353510lKH) aRunnableS22S0210000_21.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NowKeyboardInputAssem@92ef.openSoftInput$1$1");
    }

    public static final void run$3(ARunnableS22S0210000_21 aRunnableS22S0210000_21) {
        boolean zLIZ;
        C1C7U.LIZ("BaseInboxFragment@9076.onCommentNoticeReplyClick$1");
        try {
            aRunnableS22S0210000_21.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseInboxFragment@9076.onCommentNoticeReplyClick$1");
    }

    public ARunnableS22S0210000_21(List list, C1369220ljc c1369220ljc, int i) {
        this.$t = i;
        this.z2 = true;
        this.l0 = list;
        this.l1 = c1369220ljc;
    }

    public ARunnableS22S0210000_21(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
