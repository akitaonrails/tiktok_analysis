package Y;

import X.AbstractC19484711Kz;
import X.AbstractC214814194y;
import X.AbstractC529520Kpi;
import X.C0MAY;
import X.C118300cf;
import X.C11HU;
import X.C11S5;
import X.C13LP;
import X.C1449720npS;
import X.C1463670oBx;
import X.C1701940uOG;
import X.C199E;
import X.C19EH;
import X.C1C7U;
import X.C1DRG;
import X.C201955140j;
import X.C214798194i;
import X.C2471909mP;
import X.C2474509mp;
import X.C259800zU;
import X.C385670FAf;
import X.C525520KjG;
import X.C526910KlV;
import X.C527270Km5;
import X.C527400KmI;
import X.C527900Kn6;
import X.C528030KnJ;
import X.C529690Kpz;
import X.C569760MWg;
import X.C569770MWh;
import X.C571310Mav;
import X.C571470MbB;
import X.C786410Ut5;
import X.InterfaceC526620Kl2;
import X.InterfaceC527980KnE;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt$wrapRunnable$observer$1;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.vesdk.VEMediaParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS17S0400000_8 implements Runnable {
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
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        for (MediaModel mediaModel : (ArrayList) this.l0) {
            String strLJFF = mediaModel.LJFF();
            if (!TextUtils.isEmpty(strLJFF)) {
                C2471909mP.LJIJI(strLJFF);
                String strLJIJI = C2471909mP.LJIJI(strLJFF);
                if (strLJIJI == null) {
                    strLJIJI = "";
                }
                if (!strLJFF.contains("amweme/") && !strLJFF.contains("hotsoon/") && strLJIJI.endsWith("mp4")) {
                    ((ArrayList) this.l1).add(mediaModel);
                }
            }
        }
        C2474509mp.LIZ(new ARunnableS108S0100000_8(this, 4));
    }

    public final void LIZ$1() {
        C527400KmI c527400KmI;
        List<TikTokMediaModel> list;
        C527400KmI c527400KmI2;
        List<TikTokMediaModel> list2;
        TikTokMediaModel tikTokMediaModel;
        C527270Km5 c527270Km5 = ((C526910KlV) this.l0).LLJJIJI;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        PagerAdapter adapter = c527270Km5.getAdapter();
        if (!(adapter instanceof C527400KmI) || (c527400KmI2 = (C527400KmI) adapter) == null || (list2 = c527400KmI2.LLJIJIL) == null || (tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(((C118300cf) this.l1).element, list2)) == null || !Intrinsics.LJFF(((TikTokMediaModel) this.l2).LJFF(), tikTokMediaModel.LJFF())) {
            C526910KlV c526910KlV = (C526910KlV) this.l0;
            C527270Km5 c527270Km52 = c526910KlV.LLJJIJI;
            if (c527270Km52 == null) {
                c527270Km52 = null;
            }
            PagerAdapter adapter2 = c527270Km52.getAdapter();
            if ((adapter2 instanceof C527400KmI) && (c527400KmI = (C527400KmI) adapter2) != null && (list = c527400KmI.LLJIJIL) != null) {
                C527270Km5 c527270Km53 = c526910KlV.LLJJIJI;
                if (c527270Km53 == null) {
                    c527270Km53 = null;
                }
                TikTokMediaModel tikTokMediaModel2 = (TikTokMediaModel) C13LP.LJJJLZIJ(c527270Km53.getCurrentItem(), list);
                if (tikTokMediaModel2 != null) {
                    TextView textView = c526910KlV.LLJJLIIIJLLLLLLLZ;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setText(String.valueOf(tikTokMediaModel2.selectIndex));
                }
            }
        } else {
            C526910KlV c526910KlV2 = (C526910KlV) this.l0;
            C118300cf c118300cf = (C118300cf) this.l1;
            AbstractC529520Kpi abstractC529520Kpi = (AbstractC529520Kpi) this.l3;
            C527270Km5 c527270Km54 = c526910KlV2.LLJJIJI;
            if (c527270Km54 == null) {
                c527270Km54 = null;
            }
            int currentItem = c527270Km54.getCurrentItem();
            int i = c118300cf.element;
            if (currentItem == i) {
                TextView textView2 = c526910KlV2.LLJJLIIIJLLLLLLLZ;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(String.valueOf(tikTokMediaModel.selectIndex));
            } else {
                C527270Km5 c527270Km55 = c526910KlV2.LLJJIJI;
                if (c527270Km55 == null) {
                    c527270Km55 = null;
                }
                c527270Km55.setCurrentItem(i);
            }
            abstractC529520Kpi.LLLLJI(tikTokMediaModel.selectIndex - 1);
            abstractC529520Kpi.notifyDataSetChanged();
        }
        C526910KlV.LLZIL((C526910KlV) this.l0, "preview_swap", null, null, 6);
    }

    public final void LIZ$2() {
        float width;
        Integer numValueOf = Integer.valueOf(((C529690Kpz) this.l0).itemView.getWidth());
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) this.l1;
        int iIntValue = numValueOf.intValue();
        if (iIntValue <= 0 || tikTokMediaModel.width <= iIntValue) {
            width = 1.0f;
        } else {
            width = ((C529690Kpz) this.l0).itemView.getWidth() / numValueOf.intValue();
        }
        C11HU c11huLJJ = AbstractC19484711Kz.LJIJI(new ACallableS17S0202000_8((VEMediaParser) this.l2, (TikTokMediaModel) this.l1, (int) (r2.width * width), (int) (r2.height * width), 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ());
        C529690Kpz c529690Kpz = (C529690Kpz) this.l0;
        VEMediaParser vEMediaParser = (VEMediaParser) this.l2;
        c11huLJJ.LJJIIZ(new AfS104S0300000_8(c529690Kpz, vEMediaParser, (C529690Kpz) this.l3, 2), new AfS177S0100000_8(vEMediaParser, 15));
    }

    public final void LIZ$3() {
        InterfaceC527980KnE interfaceC527980KnE;
        C385670FAf<InterfaceC526620Kl2> c385670FAfUt2;
        InterfaceC526620Kl2 interfaceC526620Kl2LIZJ;
        CreativeModel creativeModel;
        ApplyRecordEffectInfo applyRecordEffectInfoLIZLLL;
        View view = ((C528030KnJ) this.l0).LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) this.l1;
        boolean z = (shortVideoContext == null || (applyRecordEffectInfoLIZLLL = shortVideoContext.LIZLLL()) == null || applyRecordEffectInfoLIZLLL.photoSelectMaxCount != 1) ? false : true;
        ShortVideoContext shortVideoContext2 = (ShortVideoContext) this.l1;
        RecordEffectModel recordEffectModel = null;
        if (shortVideoContext2 != null) {
            shortVideoContext2.creativeModel.recordEffectModel.applyRecordEffectInfo = null;
        }
        ((C528030KnJ) this.l0).LJIJ(true);
        if (z) {
            Keva keva = C527900Kn6.LIZ;
            ShortVideoContext shortVideoContext3 = (ShortVideoContext) this.l1;
            if (!C527900Kn6.LIZ(shortVideoContext3 != null ? shortVideoContext3.shootWay : null)) {
                ((C528030KnJ) this.l0).setMultiSelectCheckBox(true);
            }
        }
        ((View.OnClickListener) this.l2).onClick(((C528030KnJ) this.l0).LLJJI);
        C1DRG c1drg = (C1DRG) this.l3;
        if (c1drg == null || (interfaceC527980KnE = (InterfaceC527980KnE) c1drg.LJIIL(null, InterfaceC527980KnE.class)) == null || (c385670FAfUt2 = interfaceC527980KnE.Ut2()) == null || (interfaceC526620Kl2LIZJ = c385670FAfUt2.LIZJ()) == null) {
            return;
        }
        ShortVideoContext shortVideoContext4 = (ShortVideoContext) this.l1;
        if (shortVideoContext4 != null && (creativeModel = shortVideoContext4.creativeModel) != null) {
            recordEffectModel = creativeModel.recordEffectModel;
        }
        interfaceC526620Kl2LIZJ.Zl2(recordEffectModel, true);
    }

    public final void LIZ$4() {
        AbstractC214814194y abstractC214814194y;
        Integer second;
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity = (LiveMultiTabWrapperActivity) this.l0;
        NavigationScene navigationScene = liveMultiTabWrapperActivity.LLJ;
        if (navigationScene != null) {
            navigationScene.LLLJL();
        }
        List<Fragment> listLJJLIIIJL = liveMultiTabWrapperActivity.getSupportFragmentManager().LJJLIIIJL();
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : listLJJLIIIJL) {
            if (fragment instanceof DialogFragment) {
                arrayList.add(fragment);
            }
        }
        if (!arrayList.isEmpty()) {
            C19EH c19ehLJIIJ = liveMultiTabWrapperActivity.getSupportFragmentManager().LJIIJ();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c19ehLJIIJ.LJIIZILJ((Fragment) it2.next());
            }
            c19ehLJIIJ.LJIIL();
        }
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity2 = (LiveMultiTabWrapperActivity) this.l0;
        Scene scene = (Scene) this.l1;
        Bundle bundle = (Bundle) this.l2;
        C199E c199e = (C199E) this.l3;
        NavigationScene navigationScene2 = liveMultiTabWrapperActivity2.LLJ;
        if (navigationScene2 != null) {
            navigationScene2.LLLJL();
            if (liveMultiTabWrapperActivity2.LC() == null || !(scene instanceof AbstractC214814194y) || (abstractC214814194y = (AbstractC214814194y) scene) == null) {
                return;
            }
            abstractC214814194y.mArguments = C571310Mav.LIZ(bundle);
            C569760MWg c569760MWg = new C569760MWg();
            if (c569760MWg.LJIIJJI != null) {
                throw new IllegalArgumentException("setLaunchModeBehavior is not null, please invoke setLaunchModeBehavior(null) at first");
            }
            c569760MWg.LJIIJ = c199e;
            Pair<Integer, Integer> pairLIZJ = C569770MWh.LIZJ(abstractC214814194y.getStartAnimationType());
            Integer first = pairLIZJ.getFirst();
            if (first != null && first.intValue() == 0 && (second = pairLIZJ.getSecond()) != null) {
                second.intValue();
            }
            C214798194i c214798194i = new C214798194i();
            c214798194i.LJIIIIZZ(new ARunnableS41S0300000_8(abstractC214814194y, navigationScene2, c214798194i, 12));
            c569760MWg.LIZJ = c214798194i;
            c569760MWg.LJ = true;
            c569760MWg.LJFF = true;
            c569760MWg.LIZ = false;
            navigationScene2.LLLLLLLLLL(abstractC214814194y, c569760MWg.LIZ());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, kotlin.jvm.internal.AFwS194S0000000_8] */
    public static final void run$0(ARunnableS17S0400000_8 aRunnableS17S0400000_8) {
        Runnable runnable = (Runnable) aRunnableS17S0400000_8.l0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aRunnableS17S0400000_8.l1;
        LifecycleOwnerExtensionsKt$wrapRunnable$observer$1 lifecycleOwnerExtensionsKt$wrapRunnable$observer$1 = (LifecycleOwnerExtensionsKt$wrapRunnable$observer$1) aRunnableS17S0400000_8.l2;
        C259800zU c259800zU = (C259800zU) aRunnableS17S0400000_8.l3;
        C1C7U.LIZ("LifecycleOwnerExtensionsKt@74c0.wrapRunnable$1L");
        runnable.run();
        lifecycleOwner.getLifecycle().removeObserver(lifecycleOwnerExtensionsKt$wrapRunnable$observer$1);
        c259800zU.element = LifecycleOwnerExtensionsKt.LIZIZ;
        C1C7U.LIZIZ("LifecycleOwnerExtensionsKt@74c0.wrapRunnable$1L");
    }

    public static final void run$1(ARunnableS17S0400000_8 aRunnableS17S0400000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MusVideoChooseFragment@1503.refreshData$1");
        try {
            aRunnableS17S0400000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusVideoChooseFragment@1503.refreshData$1");
    }

    public static final void run$2(ARunnableS17S0400000_8 aRunnableS17S0400000_8) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewRootScene@2e13.initDockerSubscribe$1$1$swapItem$1");
        try {
            aRunnableS17S0400000_8.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewRootScene@2e13.initDockerSubscribe$1$1$swapItem$1");
    }

    public static final void run$3(ARunnableS17S0400000_8 aRunnableS17S0400000_8) {
        boolean zLIZ;
        C1C7U.LIZ("VideoTemplateSlotMixedView$VideoTemplateSlotMixedAdapter@e4e2.VideoTemplateSlotMixedViewHolder$bindClippedVideoCoverData$1");
        try {
            aRunnableS17S0400000_8.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoTemplateSlotMixedView$VideoTemplateSlotMixedAdapter@e4e2.VideoTemplateSlotMixedViewHolder$bindClippedVideoCoverData$1");
    }

    public static final void run$4(ARunnableS17S0400000_8 aRunnableS17S0400000_8) {
        boolean zLIZ;
        C1C7U.LIZ("VideoImageMixedView@e799.initRemoveEffectBar$4$1$1");
        try {
            aRunnableS17S0400000_8.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoImageMixedView@e799.initRemoveEffectBar$4$1$1");
    }

    public static final void run$5(ARunnableS17S0400000_8 aRunnableS17S0400000_8) {
        boolean zLIZ;
        C1C7U.LIZ("SAALauncherOnlyLive@2020.launchPageInLiveSAA$1");
        try {
            aRunnableS17S0400000_8.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAALauncherOnlyLive@2020.launchPageInLiveSAA$1");
    }

    public static final void run$6(ARunnableS17S0400000_8 aRunnableS17S0400000_8) {
        C571470MbB c571470MbB = (C571470MbB) aRunnableS17S0400000_8.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aRunnableS17S0400000_8.l1;
        C1463670oBx c1463670oBx = (C1463670oBx) aRunnableS17S0400000_8.l2;
        Intent intent = (Intent) aRunnableS17S0400000_8.l3;
        c571470MbB.getClass();
        C1C7U.LIZ("DraftEditHelper@b4d4.lambda$openVideoPublishPage$5$1$onSuccess$1L");
        C201955140j.LJIILJJIL(C0MAY.LIZIZ, "DraftEditHelper NLEDraftBuilder fetch audio enhance model success");
        C1449720npS.LIZIZ(c1463670oBx, videoPublishEditModel);
        c571470MbB.LIZ(intent);
        C1C7U.LIZIZ("DraftEditHelper@b4d4.lambda$openVideoPublishPage$5$1$onSuccess$1L");
    }

    public ARunnableS17S0400000_8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }

    public ARunnableS17S0400000_8(C526910KlV c526910KlV, C118300cf c118300cf, C525520KjG c525520KjG, TikTokMediaModel tikTokMediaModel, AbstractC529520Kpi abstractC529520Kpi, int i) {
        this.$t = i;
        this.l0 = c526910KlV;
        this.l1 = c118300cf;
        this.l2 = tikTokMediaModel;
        this.l3 = abstractC529520Kpi;
    }

    public ARunnableS17S0400000_8(C571470MbB c571470MbB, VideoPublishEditModel videoPublishEditModel, C1463670oBx c1463670oBx, Context context, Intent intent, int i) {
        this.$t = i;
        this.l0 = c571470MbB;
        this.l1 = videoPublishEditModel;
        this.l2 = c1463670oBx;
        this.l3 = intent;
    }
}
