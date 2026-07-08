package Y;

import X.AbstractC21342018fa;
import X.C0C64;
import X.C0IDB;
import X.C0VSJ;
import X.C11DR;
import X.C1321240kUE;
import X.C1322110kVd;
import X.C13LP;
import X.C1450070nq1;
import X.C1465030oE9;
import X.C15438062q;
import X.C19578211im;
import X.C19585611jy;
import X.C19591211ks;
import X.C19592311l3;
import X.C19607711nX;
import X.C19647111tt;
import X.C19EG;
import X.C1C7U;
import X.C2113008Po;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2188811AlT;
import X.C2471909mP;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC19589411ka;
import X.InterfaceC1320380kSq;
import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.aweme.ui.layout.FeedContentUiConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS4S0401000_29 implements Runnable {
    public final int $t;
    public int i4;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String path;
        C19EG c19eg;
        List<StickerModel> allStickers;
        FeedContentUiConfig feedContentUiConfig;
        if (((C1322110kVd) this.l0).getParent() == null) {
            return;
        }
        C19647111tt c19647111tt = (C19647111tt) this.l1;
        ViewGroup viewGroup = (ViewGroup) this.l2;
        FeedContentLayoutInfo feedContentLayoutInfo = c19647111tt.LLJJ;
        Integer numValueOf = (feedContentLayoutInfo == null || (feedContentUiConfig = feedContentLayoutInfo.uiConfig) == null) ? null : Integer.valueOf(feedContentUiConfig.photoRadius);
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            viewGroup.setClipToOutline(false);
            viewGroup.setOutlineProvider(null);
        } else {
            viewGroup.setClipToOutline(true);
            viewGroup.setOutlineProvider(new C0IDB(numValueOf, 5));
            if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
                viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.11rD
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        view.removeOnLayoutChangeListener(this);
                        view.invalidateOutline();
                    }
                });
            } else {
                viewGroup.invalidateOutline();
            }
        }
        SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(this.i4, ((C19647111tt) this.l1).LLJJJJJIL);
        if (singleImageData == null) {
            return;
        }
        C19647111tt c19647111tt2 = (C19647111tt) this.l1;
        if (c19647111tt2.LLJIJIL <= 0) {
            if (!c19647111tt2.LLJI && singleImageData.getEditImageInfo().isFullScreen()) {
                C19647111tt.LJJJI((C1322110kVd) this.l0, InterfaceC1320380kSq.LJI);
            } else {
                C19647111tt.LJJJI((C1322110kVd) this.l0, InterfaceC1320380kSq.LIZJ);
            }
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "image_preview_flash_black_opt", true, false)) {
            Map<C1322110kVd, C1321240kUE> map = ((C19647111tt) this.l1).LLJJLIIIJLLLLLLLZ;
            C1322110kVd c1322110kVd = (C1322110kVd) this.l0;
            map.put(c1322110kVd, new C1321240kUE(c1322110kVd));
        }
        ImageSynthesisResult imageSynthesisResult = ((C19647111tt) this.l1).LLJJJJLIIL[this.i4];
        if (imageSynthesisResult != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Debug-F instantiateItem updateSynthesisResult position = ");
            sbLIZ.append(this.i4);
            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            C19647111tt c19647111tt3 = (C19647111tt) this.l1;
            if (c19647111tt3.LLIZLLLIL) {
                C19647111tt.LJJJI((C1322110kVd) this.l0, imageSynthesisResult.getImageRatio() > c19647111tt3.LLJ ? InterfaceC1320380kSq.LIZJ : InterfaceC1320380kSq.LJI);
            }
            ((C19647111tt) this.l1).LJJIJLIJ((C1322110kVd) this.l0, Uri.fromFile(new C0VSJ(imageSynthesisResult.getPath())));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Debug-F instantiateItem updateSynthesisResult use src position = ");
            sbLIZ2.append(this.i4);
            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
            C19647111tt c19647111tt4 = (C19647111tt) this.l1;
            if (c19647111tt4.LLIZLLLIL) {
                C19647111tt.LJJJI((C1322110kVd) this.l0, singleImageData.getSrcImageInfo().getImageRatio() > c19647111tt4.LLJ ? InterfaceC1320380kSq.LIZJ : InterfaceC1320380kSq.LJI);
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "image_preview_use_temp_image", true, false) && singleImageData.getEditImageInfo().getTempSynthesisPath() != null && C2113008Po.LIZIZ(singleImageData.getEditImageInfo().getTempSynthesisPath())) {
                C1450070nq1.LIZLLL("Debug-F instantiateItem use tempSynthesisPath");
                path = singleImageData.getEditImageInfo().getTempSynthesisPath();
            } else {
                path = singleImageData.getSrcImageInfo().getPath();
            }
            ((C19647111tt) this.l1).LJJIJLIJ((C1322110kVd) this.l0, C2471909mP.LJJIIZI(path) ? UriProtector.parse(path) : Uri.fromFile(new C0VSJ(path)));
        }
        C19647111tt c19647111tt5 = (C19647111tt) this.l1;
        View view = (View) this.l3;
        c19647111tt5.getClass();
        ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData.getStickerInfoNewEngine();
        if (stickerInfoNewEngine == null || !stickerInfoNewEngine.hasSticker()) {
            return;
        }
        C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.w7t));
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.w69);
        Activity activity = c19647111tt5.LLILLJJLI;
        if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
            return;
        }
        int width = view.getWidth();
        int ratio = (int) (width / singleImageData.getEditImageInfo().getRatio());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, ratio);
        layoutParams.gravity = 17;
        C786410Ut5.a6(frameLayout, layoutParams);
        C19607711nX c19607711nXLJIJI = StickerContainerService.LIZ().LJIJI();
        EnumC19589411ka enumC19589411ka = EnumC19589411ka.PREVIEW;
        C19592311l3 c19592311l3 = new C19592311l3(width, ratio, 16);
        LifecycleOwner lifecycleOwner = c19647111tt5.LLILLL;
        if (lifecycleOwner == null) {
            lifecycleOwner = c19eg;
        }
        C1465030oE9 c1465030oE9 = C1465030oE9.LIZ;
        VideoPublishEditModel videoPublishEditModel = c19647111tt5.LLILZIL;
        c1465030oE9.getClass();
        c19607711nXLJIJI.LIZJ(new C19591211ks(enumC19589411ka, frameLayout, c19592311l3, c19eg, C1465030oE9.LJI(videoPublishEditModel), null, null, null, new AwS608S0100000_29(c19647111tt5, 234), new AwS608S0100000_29(c19647111tt5, 235), false, lifecycleOwner, null, null, 13536));
        ImageStickerInfoNewEngine stickerInfoNewEngine2 = singleImageData.getStickerInfoNewEngine();
        if (stickerInfoNewEngine2 == null || (allStickers = stickerInfoNewEngine2.getAllStickers()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StickerModel stickerModel : allStickers) {
            if (stickerModel.getStickerType() != EnumC1466150oFx.TEXT) {
                arrayList.add(stickerModel);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((StickerModel) it2.next()).getInteractStickerStruct());
        }
        c19607711nXLJIJI.LIZLLL(arrayList2, arrayList, null, null);
    }

    public static final void run$0(ARunnableS4S0401000_29 aRunnableS4S0401000_29) {
        boolean zLIZ;
        C1C7U.LIZ("ImagePublishPreviewPageAdapter@57b9.instantiateItem$1");
        try {
            aRunnableS4S0401000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImagePublishPreviewPageAdapter@57b9.instantiateItem$1");
    }

    public static final void run$1(ARunnableS4S0401000_29 aRunnableS4S0401000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditDonationStickerComponent@beb5.tryShowDonationTapMoreOptionsTooltip$1");
        try {
            C19585611jy.q3((C19585611jy) aRunnableS4S0401000_29.l0, (TuxTextView) aRunnableS4S0401000_29.l1, (C19578211im) aRunnableS4S0401000_29.l2, (FrameLayout) aRunnableS4S0401000_29.l3, aRunnableS4S0401000_29.i4);
            C19585611jy c19585611jy = (C19585611jy) aRunnableS4S0401000_29.l0;
            ARunnableS129S0100000_29 aRunnableS129S0100000_29 = new ARunnableS129S0100000_29(c19585611jy, 107);
            HandlerHook.viewPostDelay((TuxTextView) aRunnableS4S0401000_29.l1, aRunnableS129S0100000_29, 3000L);
            c19585611jy.LLJILJIL = aRunnableS129S0100000_29;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditDonationStickerComponent@beb5.tryShowDonationTapMoreOptionsTooltip$1");
    }

    public static final void run$2(ARunnableS4S0401000_29 aRunnableS4S0401000_29) {
        final C11DR c11dr = (C11DR) aRunnableS4S0401000_29.l0;
        final List list = (List) aRunnableS4S0401000_29.l1;
        final List list2 = (List) aRunnableS4S0401000_29.l2;
        int i = aRunnableS4S0401000_29.i4;
        Function0 function0 = (Function0) aRunnableS4S0401000_29.l3;
        C1C7U.LIZ("JediAsyncListDiffer@2d32.submitList$1L");
        c11dr.LIZLLL.execute(new ARunnableS4S0401000_29(c11dr, list2, C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.11DV
            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return list2.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return list.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i2, int i3) {
                Object obj = ListProtector.get(list, i2);
                Object obj2 = ListProtector.get(list2, i3);
                if (obj != null) {
                    if (obj2 != null) {
                        return c11dr.LIZIZ.LIZ.LIZ(obj, obj2);
                    }
                } else if (obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i2, int i3) {
                Object obj = ListProtector.get(list, i2);
                Object obj2 = ListProtector.get(list2, i3);
                if (obj != null) {
                    if (obj2 != null) {
                        return c11dr.LIZIZ.LIZ.LIZIZ(obj, obj2);
                    }
                    return false;
                }
                if (obj2 == null) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i2, int i3) {
                Object obj = ListProtector.get(list, i2);
                Object obj2 = ListProtector.get(list2, i3);
                if (obj != null && obj2 != null) {
                    return c11dr.LIZIZ.LIZ.LIZJ(obj, obj2);
                }
                throw new AssertionError();
            }
        }, true), i, function0, 3));
        C1C7U.LIZIZ("JediAsyncListDiffer@2d32.submitList$1L");
    }

    public static final void run$3(ARunnableS4S0401000_29 aRunnableS4S0401000_29) {
        C11DR c11dr = (C11DR) aRunnableS4S0401000_29.l0;
        int i = aRunnableS4S0401000_29.i4;
        List<? extends T> list = (List) aRunnableS4S0401000_29.l1;
        C21341918fZ c21341918fZ = (C21341918fZ) aRunnableS4S0401000_29.l2;
        Function0 function0 = (Function0) aRunnableS4S0401000_29.l3;
        C1C7U.LIZ("JediAsyncListDiffer@2d32.submitList$lambda$1$1L");
        if (c11dr.LJ == i) {
            c11dr.LJFF = list;
            c21341918fZ.LIZIZ(c11dr.LIZ);
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("JediAsyncListDiffer@2d32.submitList$lambda$1$1L");
    }

    public ARunnableS4S0401000_29(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i4 = i;
        this.l3 = obj4;
    }
}
