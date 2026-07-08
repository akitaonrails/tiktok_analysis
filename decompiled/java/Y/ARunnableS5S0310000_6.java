package Y;

import X.C098200Yq;
import X.C0H7B;
import X.C1388190mED;
import X.C1619980sG4;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C2400609au;
import X.C418440Gaw;
import X.C421710GgD;
import X.C432020Gwq;
import X.C442090HVf;
import X.C442110HVh;
import X.C695930RRn;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS5S0310000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
        Object c098200Yq;
        C19EG c19egLIZIZ;
        AlbumTrackParams albumTrackParams;
        PageFinder pageFinderVia = PageFinder.via((Context) this.l0);
        String str = this.z3 ? "1" : CardStruct.IStatusCode.DEFAULT;
        C442110HVh c442110HVh = ((LocalServiceAlbumVM) this.l1).LLJI;
        C442090HVf.LIZLLL(pageFinderVia, "fetch_image", str, (c442110HVh == null || (albumTrackParams = c442110HVh.LJFF) == null) ? null : albumTrackParams.generalMobParams);
        LocalServiceAlbumVM localServiceAlbumVM = (LocalServiceAlbumVM) this.l1;
        Context context = (Context) this.l0;
        localServiceAlbumVM.getClass();
        try {
            c098200Yq = C2400609au.LIZIZ(context, false, -1, -1, null, true, true, false, -1);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        List list = (List) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (list == null || (c19egLIZIZ = C1388190mED.LIZIZ((Context) this.l0)) == null) {
            return;
        }
        c19egLIZIZ.runOnUiThread(new ARunnableS1S0410000_6((LocalServiceAlbumVM) this.l1, list, (Context) this.l0, this.z3, (Function1) this.l2, 0));
    }

    public final void LIZ$1() {
        Object c098200Yq;
        AlbumTrackParams albumTrackParams;
        PageFinder pageFinderVia = PageFinder.via((Context) this.l0);
        String str = this.z3 ? "1" : CardStruct.IStatusCode.DEFAULT;
        C442110HVh c442110HVh = ((LocalServiceAlbumVM) this.l1).LLJI;
        C442090HVf.LIZLLL(pageFinderVia, "fetch_image", str, (c442110HVh == null || (albumTrackParams = c442110HVh.LJFF) == null) ? null : albumTrackParams.generalMobParams);
        LocalServiceAlbumVM localServiceAlbumVM = (LocalServiceAlbumVM) this.l1;
        Context context = (Context) this.l0;
        int i = localServiceAlbumVM.LLJIJIL;
        localServiceAlbumVM.LLJIJIL = i + 1;
        try {
            c098200Yq = C2400609au.LIZIZ(context, false, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, i, null, true, true, false, -1);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        if (!C695930RRn.LIZLLL(list) || list == null) {
            ((LocalServiceAlbumVM) this.l1).LLJILJIL = false;
            return;
        }
        ((LocalServiceAlbumVM) this.l1).LLJILJIL = true;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) this.l0);
        if (c19egLIZIZ != null) {
            c19egLIZIZ.runOnUiThread(new ARunnableS1S0410000_6((LocalServiceAlbumVM) this.l1, list, (Context) this.l0, this.z3, (Function1) this.l2, 1));
        }
    }

    public final void LIZ$2() {
        if (this.z3) {
            return;
        }
        int left = ((TuxIconView) this.l0).getLeft();
        TuxTextView productOriginPriceFromXml = ((C432020Gwq) this.l1).getProductOriginPriceFromXml();
        TuxTextView productDistcountFromXml = ((C432020Gwq) this.l1).getProductDistcountFromXml();
        if (productOriginPriceFromXml != null && productOriginPriceFromXml.getVisibility() == 0) {
            productOriginPriceFromXml.measure(0, 0);
        }
        if (productDistcountFromXml != null && productDistcountFromXml.getVisibility() == 0) {
            productDistcountFromXml.measure(0, 0);
        }
        int measuredWidth = (productOriginPriceFromXml == null || productOriginPriceFromXml.getVisibility() != 0) ? 0 : productOriginPriceFromXml.getMeasuredWidth();
        int measuredWidth2 = (productDistcountFromXml == null || productDistcountFromXml.getVisibility() != 0) ? 0 : productDistcountFromXml.getMeasuredWidth();
        int right = ((TuxTextView) this.l2).getRight() + measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f)));
        if (measuredWidth2 + right + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))) > left) {
            if (productDistcountFromXml != null) {
                C786410Ut5.LLLLZLL(productDistcountFromXml, 8);
            }
        } else if (productDistcountFromXml != null) {
            C786410Ut5.LLLLZLL(productDistcountFromXml, 0);
        }
        if (right > left) {
            C786410Ut5.F((C432020Gwq) this.l1, 8);
        } else {
            C786410Ut5.F((C432020Gwq) this.l1, 0);
        }
    }

    public final void LIZ$3() {
        if (((C421710GgD) this.l0).LIZ.getParent() == null) {
            return;
        }
        int[] iArr = new int[2];
        ((C421710GgD) this.l0).LIZ.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        ((View) this.l1).getLocationInWindow(iArr2);
        int[] iArr3 = new int[2];
        ((View) this.l2).getLocationInWindow(iArr3);
        ((View) this.l1).animate().withStartAction(new ARunnableS2S0102000_6((View) this.l1, (iArr[0] + (((C421710GgD) this.l0).LIZ.getWidth() / 2)) - (iArr2[0] + (((View) this.l1).getWidth() / 2)), (iArr3[1] + (((View) this.l2).getHeight() / 2)) - (iArr2[1] + (((View) this.l1).getHeight() / 2)), 6)).setInterpolator(C1619980sG4.LJFF()).scaleX(this.z3 ? 1.8f : 2.2f).scaleY(this.z3 ? 1.8f : 2.2f).alpha(1.0f).setDuration(200L).withEndAction(new ARunnableS25S0110000_6((View) this.l1, this.z3, 7)).start();
    }

    public static final void run$0(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LocalServiceAlbumVM@35d7.fetchAlbumWithBlock$1");
        try {
            aRunnableS5S0310000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalServiceAlbumVM@35d7.fetchAlbumWithBlock$1");
    }

    public static final void run$1(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LocalServiceAlbumVM@35d7.fetchAlbumWithBlock$2");
        try {
            aRunnableS5S0310000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalServiceAlbumVM@35d7.fetchAlbumWithBlock$2");
    }

    public static final void run$2(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PanelProductSmallCardViewHolder@360c.configDepositInfoAndHorizontalLayout$2");
        try {
            aRunnableS5S0310000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PanelProductSmallCardViewHolder@360c.configDepositInfoAndHorizontalLayout$2");
    }

    public static final void run$3(ARunnableS5S0310000_6 aRunnableS5S0310000_6) {
        boolean zLIZ;
        C1C7U.LIZ("StoryV2AnimController@1246.animateReaction$1");
        try {
            aRunnableS5S0310000_6.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryV2AnimController@1246.animateReaction$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS5S0310000_6(Object obj, Context context, boolean z, LocalServiceAlbumVM localServiceAlbumVM, Function1<? super List<C0H7B>, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.z3 = context;
        this.l1 = z;
        this.l2 = localServiceAlbumVM;
    }
}
