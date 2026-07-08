package Y;

import X.AbstractC691970RCh;
import X.C0R73;
import X.C0RCN;
import X.C0RCY;
import X.C0SOK;
import X.C1389340mG4;
import X.C1C7U;
import X.C21536219Qa;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C341940Daq;
import X.C691910RCb;
import X.C691920RCc;
import X.C691930RCd;
import X.C691940RCe;
import X.C691950RCf;
import X.C691960RCg;
import X.C719950SLx;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ability.IPhotoFloatGuideAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS4S0102000_11 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        LiveData<LifecycleOwner> viewLifecycleOwnerLiveData;
        LifecycleOwner value;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Fragment fragment;
        RelativeLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams c21536219Qa;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Fragment fragment2 = ((PostModeNestHeaderComponent) this.l0).LLILLL.LIZ;
        if (fragment2 == null || (viewLifecycleOwnerLiveData = fragment2.getViewLifecycleOwnerLiveData()) == null || (value = viewLifecycleOwnerLiveData.getValue()) == null || (lifecycle = value.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.INITIALIZED) || (fragment = ((PostModeNestHeaderComponent) this.l0).LLILLL.LIZ) == null || fragment.isDetached()) {
            return;
        }
        View view = ((PostModeNestHeaderComponent) this.l0).LLJILJIL;
        ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
        if (!(layoutParams2 instanceof RelativeLayout.LayoutParams) || (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.i1);
        }
        int i = layoutParams.height;
        int i2 = this.i1;
        if (i != i2) {
            layoutParams.height = i2;
            View view2 = ((PostModeNestHeaderComponent) this.l0).LLJILJIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, layoutParams);
            }
        }
        if (!C0SOK.LIZ().enableMusicWeaken) {
            TuxIconView tuxIconViewLJ = ((PostModeNestHeaderComponent) this.l0).LLILLL.LJ();
            int i3 = ((PostModeNestHeaderComponent) this.l0).LLLLIIIILLL;
            ViewGroup.LayoutParams layoutParams3 = tuxIconViewLJ != null ? tuxIconViewLJ.getLayoutParams() : null;
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams.bottomMargin = ((PostModeNestHeaderComponent) this.l0).LLLLIIL;
            }
            if (tuxIconViewLJ != null) {
                tuxIconViewLJ.setPadding(i3, i3, i3, i3);
            }
        }
        Aweme aweme = ((PostModeNestHeaderComponent) this.l0).LLILLL.LIZJ;
        int i4 = (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() <= 1) ? ((PostModeNestHeaderComponent) this.l0).LLLLIILL : ((PostModeNestHeaderComponent) this.l0).LLLLIILLL;
        View view3 = ((PostModeNestHeaderComponent) this.l0).LLJJ;
        if (view3 != null) {
            view3.setPadding(0, 0, 0, i4);
        }
        View view4 = ((PostModeNestHeaderComponent) this.l0).LLJJ;
        ViewGroup.LayoutParams layoutParams4 = view4 != null ? view4.getLayoutParams() : null;
        if (!(layoutParams4 instanceof C21536219Qa) || (c21536219Qa = (FrameLayout.LayoutParams) layoutParams4) == null) {
            c21536219Qa = new C21536219Qa(this.i2);
        }
        c21536219Qa.height = this.i2;
        View view5 = ((PostModeNestHeaderComponent) this.l0).LLJJ;
        if (view5 != null) {
            C786410Ut5.W5(view5, c21536219Qa);
        }
        if (((Boolean) ((PostModeNestHeaderComponent) this.l0).LLJJJJLIIL.getValue()).booleanValue()) {
            PostModeNestHeaderComponent postModeNestHeaderComponent = (PostModeNestHeaderComponent) this.l0;
            if (postModeNestHeaderComponent.LLIZ == null) {
                postModeNestHeaderComponent.LJJJJJ(null, null, null);
            }
        }
        IPhotoFloatGuideAbility iPhotoFloatGuideAbility = (IPhotoFloatGuideAbility) ((PostModeNestHeaderComponent) this.l0).i.getValue();
        if (iPhotoFloatGuideAbility != null) {
            iPhotoFloatGuideAbility.dr0();
        }
        ((PostModeNestHeaderComponent) this.l0).LJLJJI(true);
    }

    public final void LIZ$2() {
        C0RCY c0rcy = (C0RCY) this.l0;
        C691910RCb c691910RCb = c0rcy.LIZIZ;
        if (c691910RCb != null) {
            C691920RCc c691920RCc = new C691920RCc(c0rcy, this.i1, this.i2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC691970RCh abstractC691970RCh : c691910RCb.LIZ) {
                if (abstractC691970RCh instanceof C691930RCd) {
                    C0R73 c0r73 = ((C691930RCd) abstractC691970RCh).LIZIZ;
                    int i = c0r73.LIZJ;
                    String strLIZ = C0RCN.LIZ(c0r73.LIZ);
                    if (i > 0 && strLIZ.length() > 0) {
                        c691910RCb.LIZIZ += i;
                        arrayList.add(strLIZ);
                        arrayList2.add(abstractC691970RCh.LIZ);
                        arrayList3.add(Integer.valueOf(C341940Daq.LIZIZ(i)));
                    }
                } else if (abstractC691970RCh instanceof C691940RCe) {
                    C0R73 c0r732 = ((C691940RCe) abstractC691970RCh).LIZIZ;
                    int i2 = c0r732.LIZJ;
                    String strLIZ2 = C0RCN.LIZ(c0r732.LIZ);
                    if (i2 > 0 && strLIZ2.length() > 0) {
                        c691910RCb.LIZIZ += i2;
                        arrayList.add(strLIZ2);
                        arrayList2.add(abstractC691970RCh.LIZ);
                        arrayList3.add(Integer.valueOf(-C341940Daq.LIZIZ(i2)));
                    }
                } else if (abstractC691970RCh instanceof C691960RCg) {
                    C691960RCg c691960RCg = (C691960RCg) abstractC691970RCh;
                    C0R73 c0r733 = c691960RCg.LIZJ;
                    int i3 = c0r733.LIZJ - c691960RCg.LIZIZ.LIZJ;
                    String strLIZ3 = C0RCN.LIZ(c0r733.LIZ);
                    if (i3 != 0 && strLIZ3.length() > 0) {
                        c691910RCb.LIZIZ += i3;
                        arrayList.add(strLIZ3);
                        arrayList2.add(abstractC691970RCh.LIZ);
                        arrayList3.add(Integer.valueOf(C341940Daq.LIZIZ(i3)));
                    }
                } else if (abstractC691970RCh instanceof C691950RCf) {
                    C691950RCf c691950RCf = (C691950RCf) abstractC691970RCh;
                    C0R73 c0r734 = c691950RCf.LIZJ;
                    int i4 = c0r734.LJ - c691950RCf.LIZIZ.LJ;
                    String strLIZ4 = C0RCN.LIZ(c0r734.LIZ);
                    if (i4 != 0 && strLIZ4.length() > 0) {
                        c691910RCb.LIZIZ += i4;
                        arrayList.add(strLIZ4);
                        arrayList2.add(abstractC691970RCh.LIZ);
                        arrayList3.add(Integer.valueOf(C341940Daq.LIZIZ(i4)));
                    }
                }
            }
            c691920RCc.invoke(arrayList, arrayList2, arrayList3);
        }
    }

    public final void LIZ$0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index=");
        C719950SLx c719950SLx = ((PhotosViewHolderV3) this.l0).LLJILJILJ;
        sbLIZ.append(c719950SLx != null ? Integer.valueOf(c719950SLx.LL) : null);
        sbLIZ.append(", imageWidth=");
        sbLIZ.append(this.i1);
        sbLIZ.append(", imageHeight=");
        sbLIZ.append(this.i2);
        sbLIZ.append(", calculateScreenWidth=");
        ((PhotosViewHolderV3) this.l0).getClass();
        sbLIZ.append(C1389340mG4.LIZJ(((PhotosViewHolderV3) this.l0).LLJIJIL, null));
        sbLIZ.append(", aid=");
        Aweme awemeLJIJ = ((PhotosViewHolderV3) this.l0).LJIJ();
        sbLIZ.append(awemeLJIJ != null ? awemeLJIJ.getAid() : null);
        C2344809Gs.LIZLLL(6, "PhotoMode", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void run$0(ARunnableS4S0102000_11 aRunnableS4S0102000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PhotosViewHolderV3@b6aa.logImageDimensions$1");
        try {
            aRunnableS4S0102000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotosViewHolderV3@b6aa.logImageDimensions$1");
    }

    public static final void run$1(ARunnableS4S0102000_11 aRunnableS4S0102000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeNestHeaderComponent@e60e.runOnEnterAnimationFinished$delayRun$1");
        try {
            aRunnableS4S0102000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeNestHeaderComponent@e60e.runOnEnterAnimationFinished$delayRun$1");
    }

    public static final void run$2(ARunnableS4S0102000_11 aRunnableS4S0102000_11) {
        boolean zLIZ;
        C1C7U.LIZ("FrameEventTrack@90e3.trackMobEvent$1");
        try {
            aRunnableS4S0102000_11.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrameEventTrack@90e3.trackMobEvent$1");
    }

    public ARunnableS4S0102000_11(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
