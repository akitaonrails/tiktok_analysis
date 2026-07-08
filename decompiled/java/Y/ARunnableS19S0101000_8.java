package Y;

import X.AbstractC528270Knh;
import X.C01TT;
import X.C0LD3;
import X.C0LEP;
import X.C0ML5;
import X.C0MR3;
import X.C0MVY;
import X.C0WZX;
import X.C1390380mHk;
import X.C13LZ;
import X.C1429810nJL;
import X.C15438062q;
import X.C1618440sDa;
import X.C194353111z;
import X.C19EG;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C426750GoL;
import X.C529750Kq5;
import X.C530520KrK;
import X.C534590Kxt;
import X.C565430MFp;
import X.C576420MjA;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS68S0301000_8;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS19S0101000_8 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        OnThisDayCardPreviewScene onThisDayCardPreviewScene = (OnThisDayCardPreviewScene) ((C0MR3) this.l0).getDiContainer().LJII(OnThisDayCardPreviewScene.class, null);
        C0ML5 c0ml5 = C0ML5.LIZ;
        boolean z = onThisDayCardPreviewScene.LLLII;
        c0ml5.getClass();
        List listLJ = C0ML5.LJ("preview", z);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
        Iterator it2 = listLJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1618440sDa.LIZIZ.LJIJJLI().LJIJJLI((MediaModel) it2.next()));
        }
        C1429810nJL c1429810nJL = C1429810nJL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("local media list size: ");
        sbLIZ.append(arrayList.size());
        C201955140j.LJIILJJIL(c1429810nJL, C2188811AlT.LIZIZ(sbLIZ));
        C01TT.LIZLLL(new AwS68S0301000_8(listLJ, (List<? extends MediaModel>) this.l0, (C0MR3) arrayList, (List<ForwardMedia>) this.i1, 2));
    }

    public final void LIZ$1() {
        Rect rectLIZIZ = ((C576420MjA) this.l0).LLLLLJIL().LIZIZ(this.i1);
        if (rectLIZIZ != null) {
            C576420MjA c576420MjA = (C576420MjA) this.l0;
            SurfaceView surfaceViewLLLLLJLJLL = c576420MjA.LLLLLJLJLL();
            ViewGroup.LayoutParams layoutParams = c576420MjA.LLLLLJLJLL().getLayoutParams();
            layoutParams.width = rectLIZIZ.width();
            layoutParams.height = rectLIZIZ.height();
            C786410Ut5.U5(surfaceViewLLLLLJLJLL, layoutParams);
            SurfaceView surfaceViewLLLLLJLJLL2 = c576420MjA.LLLLLJLJLL();
            Context sceneContext = c576420MjA.getSceneContext();
            C786410Ut5.Ic(surfaceViewLLLLLJLJLL2, (sceneContext == null || !C426750GoL.LIZLLL(sceneContext)) ? rectLIZIZ.left : -rectLIZIZ.left);
            C786410Ut5.dd(c576420MjA.LLLLLJLJLL(), rectLIZIZ.top);
        }
    }

    public static final void run$0(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        AbstractC528270Knh abstractC528270Knh = (AbstractC528270Knh) aRunnableS19S0101000_8.l0;
        int i = aRunnableS19S0101000_8.i1;
        abstractC528270Knh.getClass();
        C1C7U.LIZ("AVMediaChooseBaseFragment@6534.showLoading$1L");
        if (abstractC528270Knh.LLJL) {
            abstractC528270Knh.LLLZI();
            View view = abstractC528270Knh.LLJJL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                C194353111z.LIZ.LIZJ(i, C0MVY.SHOW, C0LD3.DUAL_BALL, C0LEP.CLOSE_GONE, abstractC528270Knh.LLLLLJLJLL());
            }
        }
        C1C7U.LIZIZ("AVMediaChooseBaseFragment@6534.showLoading$1L");
    }

    public static final void run$1(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        C529750Kq5 c529750Kq5 = (C529750Kq5) aRunnableS19S0101000_8.l0;
        int i = aRunnableS19S0101000_8.i1;
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.refreshSelectedState$1L");
        C786410Ut5.LJLLLLLL(i, c529750Kq5.LLJIJIL);
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.refreshSelectedState$1L");
    }

    public static final void run$2(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        boolean zLIZ;
        C1C7U.LIZ("VideoTemplateSlotMixedView@693d.autoScrollToCenter$1");
        try {
            RecyclerView recyclerView = ((C530520KrK) aRunnableS19S0101000_8.l0).LLILLJJLI;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(aRunnableS19S0101000_8.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoTemplateSlotMixedView@693d.autoScrollToCenter$1");
    }

    public static final void run$3(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        boolean zLIZ;
        C1C7U.LIZ("TTEPAbilityServiceImpl@9eb0.downloadEffectAndJumpShootPage$4$onFail$1");
        try {
            C19EG c19eg = (C19EG) aRunnableS19S0101000_8.l0;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(aRunnableS19S0101000_8.i1);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(c19eg, 5009, creativeToastBuilder);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTEPAbilityServiceImpl@9eb0.downloadEffectAndJumpShootPage$4$onFail$1");
    }

    public static final void run$4(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        boolean zLIZ;
        C1C7U.LIZ("EditGlobalLoadingComponent@be7e.showLoadingDelayed$runnable$1");
        try {
            ((C534590Kxt) aRunnableS19S0101000_8.l0).Ip2(1107);
            ((C534590Kxt) aRunnableS19S0101000_8.l0).LLILZLL.remove(Integer.valueOf(aRunnableS19S0101000_8.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditGlobalLoadingComponent@be7e.showLoadingDelayed$runnable$1");
    }

    public static final void run$5(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        boolean zLIZ;
        C1C7U.LIZ("LocalMediaAuthorizationComponent@96bc.startScanAlbum$1");
        try {
            aRunnableS19S0101000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalMediaAuthorizationComponent@96bc.startScanAlbum$1");
    }

    public static final void run$6(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        boolean zLIZ;
        C1C7U.LIZ("CameraLayoutGridScene@9962.initObservables$6$1");
        try {
            Rect rectLIZIZ = ((C576420MjA) aRunnableS19S0101000_8.l0).LLLLLJIL().LIZIZ(aRunnableS19S0101000_8.i1);
            if (rectLIZIZ != null) {
                ((C576420MjA) aRunnableS19S0101000_8.l0).LLLLIL().LIZJ.invoke(Integer.valueOf(rectLIZIZ.width()), Integer.valueOf(rectLIZIZ.height()));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraLayoutGridScene@9962.initObservables$6$1");
    }

    public static final void run$7(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        boolean zLIZ;
        C1C7U.LIZ("CameraLayoutGridScene@9962.initObservables$6$2");
        try {
            aRunnableS19S0101000_8.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraLayoutGridScene@9962.initObservables$6$2");
    }

    public static final void run$8(ARunnableS19S0101000_8 aRunnableS19S0101000_8) {
        boolean zLIZ;
        C1C7U.LIZ("InputBoxScene@fda4.initObservers$16$2$1");
        try {
            Editable editableLLLZIL = C2204961BRm.LLLZIL((C565430MFp) aRunnableS19S0101000_8.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null));
            if (editableLLLZIL != null) {
                ((C565430MFp) aRunnableS19S0101000_8.l0).setSelection(C13LZ.LJ(aRunnableS19S0101000_8.i1, 0, editableLLLZIL.length()));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InputBoxScene@fda4.initObservers$16$2$1");
    }

    public ARunnableS19S0101000_8(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
