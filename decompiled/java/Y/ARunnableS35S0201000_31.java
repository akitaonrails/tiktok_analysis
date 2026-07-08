package Y;

import X.C0WZX;
import X.C15DF;
import X.C15IP;
import X.C1C7U;
import X.C20491015Ga;
import X.C20494715Hl;
import X.C20517115Qb;
import X.C20748316Gz;
import X.C2204931BRj;
import X.C2204961BRm;
import X.InterfaceC20517315Qd;
import android.content.Intent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS35S0201000_31 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS35S0201000_31.LIZ$0():void");
    }

    public static final void run$0(ARunnableS35S0201000_31 aRunnableS35S0201000_31) throws Throwable {
        AuthorizeActivity authorizeActivity = (AuthorizeActivity) aRunnableS35S0201000_31.l0;
        int i = aRunnableS35S0201000_31.i2;
        Intent intent = (Intent) aRunnableS35S0201000_31.l1;
        String str = AuthorizeActivity._pnsPageId;
        authorizeActivity.getClass();
        C1C7U.LIZ("AuthorizeActivity@bcc6.onBackPressed$1L");
        C2204961BRm.LLLZ(authorizeActivity, i, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owskw7ZzjpAkGL23W6ZUpSsOMbBq/SqDC91CnBaI", null));
        authorizeActivity.finish();
        C1C7U.LIZIZ("AuthorizeActivity@bcc6.onBackPressed$1L");
    }

    public static final void run$1(ARunnableS35S0201000_31 aRunnableS35S0201000_31) {
        C2204931BRj c2204931BRj = (C2204931BRj) aRunnableS35S0201000_31.l0;
        int i = aRunnableS35S0201000_31.i2;
        Intent intent = (Intent) aRunnableS35S0201000_31.l1;
        c2204931BRj.getClass();
        C1C7U.LIZ("AuthorizeProcessor@b443.onBackPressed$1L");
        c2204931BRj.LLJJJJLIIL = Integer.valueOf(i);
        c2204931BRj.LLJJL = intent;
        c2204931BRj.finish();
        C1C7U.LIZIZ("AuthorizeProcessor@b443.onBackPressed$1L");
    }

    public static final void run$2(ARunnableS35S0201000_31 aRunnableS35S0201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.observeDividerPositionChange$1$8");
        try {
            ((C15DF) aRunnableS35S0201000_31.l0).LJJIIZI(!r4.LLLIZZ, (ConstraintLayout) aRunnableS35S0201000_31.l1, aRunnableS35S0201000_31.i2);
            ((C15DF) aRunnableS35S0201000_31.l0).LLLIIIL[0] = true;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.observeDividerPositionChange$1$8");
    }

    public static final void run$3(ARunnableS35S0201000_31 aRunnableS35S0201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("TuxSheetBehavior@629d.settleToStatePendingLayout$1");
        try {
            ((TuxSheetBehavior) aRunnableS35S0201000_31.l0).LIZLLL(aRunnableS35S0201000_31.i2, (View) aRunnableS35S0201000_31.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TuxSheetBehavior@629d.settleToStatePendingLayout$1");
    }

    public static final void run$4(ARunnableS35S0201000_31 aRunnableS35S0201000_31) {
        C20491015Ga c20491015Ga = (C20491015Ga) aRunnableS35S0201000_31.l0;
        int i = aRunnableS35S0201000_31.i2;
        MusicModel musicModel = (MusicModel) aRunnableS35S0201000_31.l1;
        c20491015Ga.getClass();
        C1C7U.LIZ("MusicListView@adf0.tryAutoPlay$1L");
        C20748316Gz c20748316Gz = new C20748316Gz(c20491015Ga.LJ, 1);
        c20748316Gz.LIZ = i;
        RecyclerView.LayoutManager layoutManager = c20491015Ga.LIZIZ.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(c20748316Gz);
        }
        HandlerHook.viewPost(c20491015Ga.LIZIZ, new ARunnableS35S0201000_31(i, musicModel, c20491015Ga, 5));
        C1C7U.LIZIZ("MusicListView@adf0.tryAutoPlay$1L");
    }

    public static final void run$5(ARunnableS35S0201000_31 aRunnableS35S0201000_31) {
        C20491015Ga c20491015Ga = (C20491015Ga) aRunnableS35S0201000_31.l0;
        int i = aRunnableS35S0201000_31.i2;
        MusicModel musicModel = (MusicModel) aRunnableS35S0201000_31.l1;
        c20491015Ga.getClass();
        C1C7U.LIZ("MusicListView@adf0.tryAutoPlay$1L$1L");
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c20491015Ga.LIZIZ.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition instanceof C15IP) {
            ((C20494715Hl) c20491015Ga.LJFF).LLLI((C15IP) viewHolderFindViewHolderForAdapterPosition, musicModel);
        }
        C1C7U.LIZIZ("MusicListView@adf0.tryAutoPlay$1L$1L");
    }

    public static final void run$6(ARunnableS35S0201000_31 aRunnableS35S0201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("FeedDynamicPopupTask$Companion@75df.trigger$1");
        try {
            aRunnableS35S0201000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedDynamicPopupTask$Companion@75df.trigger$1");
    }

    public static final void run$7(ARunnableS35S0201000_31 aRunnableS35S0201000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SmartColorProcessor@381f.onSucceed$1");
        try {
            if (!((C20517115Qb) aRunnableS35S0201000_31.l0).LIZIZ.get()) {
                ((InterfaceC20517315Qd) aRunnableS35S0201000_31.l1).LIZ(aRunnableS35S0201000_31.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SmartColorProcessor@381f.onSucceed$1");
    }

    public ARunnableS35S0201000_31(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.l1 = obj;
        this.i2 = i;
    }

    public ARunnableS35S0201000_31(C15DF c15df, ConstraintLayout constraintLayout, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = c15df;
        this.l1 = constraintLayout;
        this.i2 = i;
    }
}
