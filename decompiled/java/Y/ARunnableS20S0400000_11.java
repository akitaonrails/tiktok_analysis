package Y;

import X.C03IT;
import X.C07CO;
import X.C0S5R;
import X.C0STY;
import X.C0SX4;
import X.C0SXC;
import X.C1331660kl2;
import X.C1388190mED;
import X.C1602160rnK;
import X.C1839820xye;
import X.C19EG;
import X.C1AF0;
import X.C1C7U;
import X.C1EE2;
import X.C21368918jv;
import X.C2188811AlT;
import X.C304280BwI;
import X.C418440Gaw;
import X.C426750GoL;
import X.C439870HMr;
import X.C699370Rbz;
import X.C699390Rc1;
import X.C699810Rch;
import X.C720310SNh;
import X.C720690SOt;
import X.C814420VxA;
import X.C842150X1x;
import X.EnumC1986107qF;
import X.InterfaceC1325460kb2;
import X.InterfaceC690460R6m;
import X.ViewTreeObserverOnGlobalLayoutListenerC738820SyW;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.feed.platform.cell.component.penal.CellPenalLongPressOptComponent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS20S0400000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (Intrinsics.LJFF(((C699370Rbz) this.l0).LIZIZ.get(((C699810Rch) this.l1).LIZ), ((C699390Rc1) this.l2).LIZ)) {
            ((C699370Rbz) this.l0).LIZIZ(((C699810Rch) this.l1).LIZ);
            C699370Rbz c699370Rbz = (C699370Rbz) this.l0;
            View view = (View) this.l3;
            c699370Rbz.getClass();
            C699370Rbz.LJFF(view);
            if (((C699390Rc1) this.l2).LJFF != EnumC1986107qF.NONE) {
                C699370Rbz c699370Rbz2 = (C699370Rbz) this.l0;
                View view2 = (View) this.l3;
                c699370Rbz2.getClass();
                if (C699370Rbz.LJ(view2)) {
                    ((C699370Rbz) this.l0).LIZJ(((C699810Rch) this.l1).LIZ, ((C699390Rc1) this.l2).LIZ);
                    return;
                }
            }
            C699370Rbz c699370Rbz3 = (C699370Rbz) this.l0;
            String str = ((C699810Rch) this.l1).LIZ;
            View view3 = (View) this.l3;
            EnumC1986107qF enumC1986107qF = ((C699390Rc1) this.l2).LJFF;
            c699370Rbz3.getClass();
            if (enumC1986107qF == EnumC1986107qF.SLIDE_FROM_BOTTOM) {
                c699370Rbz3.LIZ(str, view3, true, null);
            }
            ((C699370Rbz) this.l0).LIZJ(((C699810Rch) this.l1).LIZ, ((C699390Rc1) this.l2).LIZ);
        }
    }

    public final void LIZ$1() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((ExploreFeedCell) this.l0).itemView.getContext());
        if (c19egLIZIZ != null) {
            VideoItemParams videoItemParams = (VideoItemParams) this.l1;
            PostModeDetailParams postModeDetailParams = (PostModeDetailParams) this.l2;
            ExploreFeedCell exploreFeedCell = (ExploreFeedCell) this.l0;
            Aweme aweme = (Aweme) this.l3;
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExploreFeedCell_");
            sbLIZ.append(exploreFeedCell.hashCode());
            c1ee2.LJIJI(c19egLIZIZ, videoItemParams, postModeDetailParams, C2188811AlT.LIZIZ(sbLIZ), null, null, null, new AwS377S0200000_11(exploreFeedCell, aweme, 139));
        }
    }

    public final void LIZ$3() throws Throwable {
        String descLanguage;
        C720690SOt c720690SOt = (C720690SOt) this.l0;
        C21368918jv c21368918jv = (C21368918jv) this.l1;
        CharSequence charSequence = (CharSequence) this.l2;
        C0S5R c0s5r = (C0S5R) this.l3;
        boolean z = c0s5r != null && c0s5r.LIZJ;
        c720690SOt.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            int visibility = c21368918jv.getVisibility();
            c21368918jv.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c21368918jv);
            return;
        }
        if (C07CO.LIZ()) {
            C426750GoL.LJIIL(c21368918jv, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 23);
        }
        int visibility2 = c21368918jv.getVisibility();
        c21368918jv.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, c21368918jv);
        if (z) {
            descLanguage = C1839820xye.LIZ().LIZ();
        } else {
            Aweme aweme = c720690SOt.LL.LIZJ;
            if (aweme == null || (descLanguage = aweme.getDescLanguage()) == null) {
                descLanguage = "";
            }
        }
        c21368918jv.LJJJJLI(charSequence, descLanguage);
        c21368918jv.setMovementMethod(LinkMovementMethod.getInstance());
        C439870HMr.LIZJ(c21368918jv, null);
        if (C304280BwI.LIZLLL() || C304280BwI.LIZJ()) {
            c720690SOt.LJI();
        }
        PostModePageViewModel postModePageViewModel = c720690SOt.LL.LJIIIIZZ;
        ViewTreeObserverOnGlobalLayoutListenerC738820SyW viewTreeObserverOnGlobalLayoutListenerC738820SyW = new ViewTreeObserverOnGlobalLayoutListenerC738820SyW(c21368918jv, new WeakReference(c720690SOt), postModePageViewModel, 2);
        if (C304280BwI.LIZLLL() || C304280BwI.LIZJ()) {
            c720690SOt.LLILLL = viewTreeObserverOnGlobalLayoutListenerC738820SyW;
            c720690SOt.LLILZ = c21368918jv;
        }
        SAFExtensionKt.LIZIZ(c21368918jv.getViewTreeObserver(), c720690SOt.LL.LJIILIIL(), viewTreeObserverOnGlobalLayoutListenerC738820SyW);
        postModePageViewModel.LLLIL = charSequence.length();
        C0SX4 c0sx4 = (C0SX4) c720690SOt.LLJIJIL.getValue();
        if (c0sx4 != null) {
            c0sx4.LIZ(c21368918jv);
        }
        if (c720690SOt.LL.LJIJ()) {
            return;
        }
        C0SXC.LIZ.getClass();
        boolean zLJ = C0SXC.LJ(charSequence);
        PostModeDetailParams postModeDetailParams = c720690SOt.LL.LJII;
        c720690SOt.LLILZLL = C0SXC.LJIIIIZZ(c21368918jv, zLJ, postModeDetailParams != null ? postModeDetailParams.eventType : null);
    }

    public final void LIZ$4() {
        View view = (View) ((WeakReference) this.l0).get();
        if (!(view != null && view.isAttachedToWindow())) {
            ((CellPenalLongPressOptComponent) this.l1).LLJZIJLIL = null;
            return;
        }
        ((CellPenalLongPressOptComponent) this.l1).LLL = true;
        MotionEvent motionEventObtain = MotionEvent.obtain((MotionEvent) this.l2);
        motionEventObtain.setAction(3);
        View view2 = (View) ((WeakReference) this.l0).get();
        if (view2 != null) {
            view2.dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        ((CellPenalLongPressOptComponent) this.l1).LLJZIJLIL = null;
        ((InterfaceC690460R6m) this.l3).LIZ(((MotionEvent) this.l2).getRawX(), ((MotionEvent) this.l2).getRawY());
    }

    public final void LIZ$2() {
        UrlModel cover;
        try {
            InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
            Video video = ((Aweme) this.l0).getVideo();
            Bitmap bitmapCreateBitmap = null;
            Bitmap bitmapLIZIZ = interfaceC1325460kb2LIZJ.LIZIZ(new C03IT((video == null || (cover = video.getCover()) == null) ? null : cover.getUrlList()));
            SmartImageView smartImageViewE6 = ((ExploreFeedCell) this.l1).e6();
            if (smartImageViewE6 != null) {
                int measuredWidth = smartImageViewE6.getMeasuredWidth();
                int measuredHeight = smartImageViewE6.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                    C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), smartImageViewE6);
                }
            }
            Bitmap bitmap = C720310SNh.LIZ;
            if (bitmapLIZIZ == null) {
                bitmapLIZIZ = bitmapCreateBitmap;
            }
            C720310SNh.LJII(bitmapLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "explore_set_placeholder_before_detail");
        }
        C0STY.LIZ.execute(new ARunnableS20S0400000_11((ExploreFeedCell) this.l1, (Aweme) this.l0, (VideoItemParams) this.l2, (PostModeDetailParams) this.l3, 1));
    }

    public static final void run$0(ARunnableS20S0400000_11 aRunnableS20S0400000_11) {
        boolean zLIZ;
        C1C7U.LIZ("SlotRuntimeManager@76cd.handleSlotAdd$$inlined$runOnMain$1");
        try {
            aRunnableS20S0400000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlotRuntimeManager@76cd.handleSlotAdd$$inlined$runOnMain$1");
    }

    public static final void run$1(ARunnableS20S0400000_11 aRunnableS20S0400000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreFeedCell@544c.enterPhotoModeFullPage$8$1");
        try {
            aRunnableS20S0400000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFeedCell@544c.enterPhotoModeFullPage$8$1");
    }

    public static final void run$2(ARunnableS20S0400000_11 aRunnableS20S0400000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreFeedCell@544c.enterPhotoModeFullPage$8");
        try {
            aRunnableS20S0400000_11.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFeedCell@544c.enterPhotoModeFullPage$8");
    }

    public static final void run$3(ARunnableS20S0400000_11 aRunnableS20S0400000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeDescriptionComponent@bdef.initViewForMarkup$1$1");
        try {
            aRunnableS20S0400000_11.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeDescriptionComponent@bdef.initViewForMarkup$1$1");
    }

    public static final void run$4(ARunnableS20S0400000_11 aRunnableS20S0400000_11) {
        boolean zLIZ;
        C1C7U.LIZ("CellPenalLongPressOptComponent@b830.postLongPressRunnable$longPressRunnable$1");
        try {
            aRunnableS20S0400000_11.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CellPenalLongPressOptComponent@b830.postLongPressRunnable$longPressRunnable$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS20S0400000_11(com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell r2, com.ss.android.ugc.aweme.feed.model.Aweme r3, com.ss.android.ugc.aweme.feed.model.VideoItemParams r4, com.ss.android.ugc.aweme.model.PostModeDetailParams r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            r0.l3 = r5
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r5
            r0.l3 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS20S0400000_11.<init>(com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.VideoItemParams, com.ss.android.ugc.aweme.model.PostModeDetailParams, int):void");
    }

    public ARunnableS20S0400000_11(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
