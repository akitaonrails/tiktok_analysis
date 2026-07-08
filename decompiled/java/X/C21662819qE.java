package X;

import Y.ARunnableS111S0100000_11;
import Y.ARunnableS129S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19qE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21662819qE implements InterfaceC661560PxC, InterfaceC469360Ias {
    public final String LL;
    public final Function1<String, Unit> LLILLJJLI;
    public final InterfaceC21663219qI LLILLL;
    public final C1910470zob LLILZ;
    public final C21663019qG LLILZIL;
    public final C21662519qB LLILZLL;
    public Aweme LLIZ;
    public Map<String, String> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public final List<View> LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    public final C21694119vH LIZ() {
        C21694119vH c21694119vH;
        try {
            int currentItem = this.LLILZLL.getCurrentItem();
            if (this.LLJILLL) {
                currentItem %= this.LLILZIL.LLJ.size();
            }
            int childCount = this.LLILZLL.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.LLILZLL.getChildAt(i);
                Object tag = childAt != null ? childAt.getTag() : null;
                if ((tag instanceof C21694119vH) && (c21694119vH = (C21694119vH) tag) != null && c21694119vH.LLILLL == currentItem) {
                    return c21694119vH;
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC661560PxC
    public final int LIZJ() {
        LIZIZ(true);
        C21662519qB c21662519qB = this.LLILZLL;
        c21662519qB.LLLZI = true;
        C716710S9l c716710S9l = c21662519qB.LLLLZIL;
        c716710S9l.LIZIZ = false;
        C0STS c0sts = c716710S9l.LIZ;
        c0sts.LIZLLL = false;
        c0sts.LIZ = 0;
        HandlerHook.viewRemoveCallbacks(c21662519qB, c21662519qB.LLLZL);
        c21662519qB.LLLZ = 0;
        return this.LLILZLL.getCurrentPosition();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC661560PxC
    public final int LJIILJJIL() {
        return this.LLJILLL ? this.LLILZIL.LLJ.size() : this.LLILZIL.getCount();
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIILL() {
        C1910470zob c1910470zob = this.LLILZ;
        if (c1910470zob != null) {
            int currentItem = this.LLILZLL.getCurrentItem();
            if (this.LLJILLL) {
                currentItem %= this.LLILZIL.LLJ.size();
            }
            c1910470zob.LJ = Integer.valueOf(currentItem);
        }
        this.LLILZLL.LIZLLL(this);
    }

    @Override // X.InterfaceC661560PxC
    public final int getCurrentPosition() {
        UrlModel urlModel;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList2;
        PhotoModeImageUrlModel photoModeImageUrlModel2;
        List<MultiImageUrlInfo> list;
        MultiImageUrlInfo multiImageUrlInfo;
        int currentPosition = this.LLILZLL.getCurrentPosition();
        if (C0SNF.LIZ == 2) {
            Aweme aweme = this.LLIZ;
            if (aweme == null || (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) == null || (imageList2 = photoModeImageInfo2.getImageList()) == null || (photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(currentPosition, imageList2)) == null || (list = photoModeImageUrlModel2.bitrateImages) == null || (multiImageUrlInfo = (MultiImageUrlInfo) C13LP.LJJJLZIJ(0, list)) == null || (urlModel = multiImageUrlInfo.image) == null) {
                Aweme aweme2 = this.LLIZ;
                urlModel = (aweme2 == null || (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(currentPosition, imageList)) == null) ? null : photoModeImageUrlModel.displayImageNoWatermark;
            }
            C823050WQl.LIZLLL().execute(new ARunnableS111S0100000_11(urlModel, 193));
        }
        if ((C294830Bh3.LIZ() & 33) == 33 && currentPosition == 0 && Intrinsics.LJFF(this.LL, "general_search")) {
            C823050WQl.LIZLLL().execute(new ARunnableS111S0100000_11(this, 194));
        }
        return currentPosition;
    }

    @Override // X.InterfaceC661560PxC
    public final void onCleared() {
        InterfaceC21663319qJ interfaceC21663319qJLJLJI;
        this.LLILZ.LIZ();
        C1910470zob c1910470zob = this.LLILZ;
        c1910470zob.LJ = null;
        c1910470zob.LIZ = false;
        c1910470zob.LJFF = 0;
        ((LinkedHashMap) c1910470zob.LIZLLL).clear();
        ((LinkedHashMap) c1910470zob.LIZJ).clear();
        C21662519qB c21662519qB = this.LLILZLL;
        c21662519qB.LLLLZLL = 0;
        c21662519qB.LLLLZLLIL.clear();
        c21662519qB.LLLZ = 0;
        c21662519qB.LLLLZLLLI = false;
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null && (interfaceC21663319qJLJLJI = iSearchService.LJLJI(this.LL)) != null) {
            interfaceC21663319qJLJLJI.reset();
        }
        this.LLILZLL.LJJIIJZLJL(this);
        LIZIZ(true);
    }

    @Override // X.InterfaceC661560PxC
    public final View LJIILLIIL() {
        return this.LLILZLL;
    }

    public final void LIZIZ(boolean z) {
        C21694119vH c21694119vHLIZ;
        C0STF c0stf;
        InterfaceC21663219qI interfaceC21663219qI = this.LLILLL;
        if (interfaceC21663219qI != null && (c21694119vHLIZ = LIZ()) != null && (c0stf = c21694119vHLIZ.LLJIJIL) != null) {
            if (z) {
                interfaceC21663219qI.LIZ(c0stf);
            } else {
                interfaceC21663219qI.LIZIZ(c0stf);
            }
        }
    }

    @Override // X.InterfaceC661560PxC
    public final void LIZLLL(int i) {
        this.LLILZLL.setCurrentPhotoItem(i);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJ(int i) {
        this.LLILZIL.LLJJIII = i;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJFF(InterfaceC661730PxT interfaceC661730PxT) {
        this.LLILZLL.LLLLZLLIL.remove(interfaceC661730PxT);
        this.LLILZIL.LLJJIJI = null;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJI(int i) {
        this.LLILZLL.setCurrentPhotoItem(i);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJII(int i) {
        this.LLILZLL.setLastPhotoIndex(i);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIIIZZ(Integer num) {
        int count;
        this.LLJILJILJ = true;
        if (num != null) {
            int iIntValue = num.intValue();
            this.LLJ = true;
            this.LLJIJIL = iIntValue;
        }
        C21662519qB c21662519qB = this.LLILZLL;
        c21662519qB.LLLZI = false;
        HandlerHook.viewRemoveCallbacks(c21662519qB, c21662519qB.LLLZL);
        if (num != null) {
            num.intValue();
            int iIntValue2 = num.intValue();
            if (c21662519qB.LLLZIIL) {
                int currentItem = c21662519qB.getCurrentItem();
                if (c21662519qB.getAdapter() instanceof C21663019qG) {
                    count = ((C21663019qG) c21662519qB.getAdapter()).LLJ.size();
                } else {
                    count = c21662519qB.getAdapter().getCount();
                }
                iIntValue2 += currentItem - (currentItem % count);
                if (iIntValue2 < currentItem) {
                    iIntValue2 += count;
                }
            }
            c21662519qB.LLLLZLL = iIntValue2;
            c21662519qB.LLFFF(iIntValue2, false);
        }
        C716710S9l c716710S9l = c21662519qB.LLLLZIL;
        c716710S9l.LIZIZ = true;
        C0STS c0sts = c716710S9l.LIZ;
        c0sts.LIZLLL = true;
        c0sts.LIZ = 0;
        HandlerHook.viewPostDelay(c21662519qB, c21662519qB.LLLZL, 1500L);
        LIZIZ(false);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIIZ(boolean z) {
        this.LLJILLL = z;
        this.LLILZIL.LLJJIJIIJIL = z;
        this.LLILZLL.setIsInfiniteScroll(z);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIL(InterfaceC661730PxT interfaceC661730PxT) {
        this.LLILZLL.LLLLZLLIL.addIfAbsent(interfaceC661730PxT);
        this.LLILZIL.LLJJIJI = interfaceC661730PxT;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIILIIL(InterfaceC19471211Fu interfaceC19471211Fu) {
        this.LLILZLL.setTransformer(interfaceC19471211Fu);
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        if (this.LLJI) {
            return;
        }
        if (Intrinsics.LJFF(this.LL, "general_search") && C1111704Wl.LIZ() && !this.LLJILJILJ) {
            return;
        }
        if (C1833407Ga.LIZ() && this.LLJ) {
            this.LLJ = false;
            if (i == this.LLJIJIL) {
                return;
            }
        }
        Aweme aweme = this.LLIZ;
        if (aweme != null) {
            String str = this.LL;
            C0SQK c0sqk = C0SQK.LIZ;
            int iLJIILJJIL = LJIILJJIL();
            Map<String, String> map = this.LLIZLLLIL;
            c0sqk.getClass();
            C0SQK.LIZIZ(str, "auto", aweme, i, "right", null, false, iLJIILJJIL, map, null, false, null, -1L, 1, null, null, null, "", null, null);
        }
        C1910470zob c1910470zob = this.LLILZ;
        c1910470zob.LJFF = Math.max(c1910470zob.LJFF, i);
        HandlerHook.viewPostDelay(this.LLILZLL, new ARunnableS129S0100000_29(this, 233), 200L);
        if (this.LLJILJILJ) {
            LIZIZ(false);
        }
    }

    @Override // X.InterfaceC661560PxC
    public final void setExtraParams(Map<String, String> map) {
        String str;
        this.LLIZLLLIL = map;
        C21663019qG c21663019qG = this.LLILZIL;
        if (map != null) {
            str = map.get("search_id");
        } else {
            str = null;
        }
        c21663019qG.LLJJI = str;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIJJI(Aweme aweme, Long l, Integer num) {
        List<PhotoModeImageUrlModel> imageList;
        if (!Intrinsics.LJFF(aweme, this.LLIZ)) {
            this.LLJ = false;
            this.LLJILJILJ = false;
        }
        this.LLIZ = aweme;
        C21663019qG c21663019qG = this.LLILZIL;
        c21663019qG.LLJILLL = aweme;
        c21663019qG.LLJJIJIL = false;
        this.LLILZ.LIZIZ = aweme;
        if (aweme != null) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null) {
                imageList = photoModeImageInfo.getImageList();
            } else {
                imageList = null;
            }
            this.LLILZLL.setSupportSlide(false);
            this.LLILZLL.setAdapter(this.LLILZIL);
            C21663019qG c21663019qG2 = this.LLILZIL;
            c21663019qG2.LLJILJILJ = this.LLJILJIL;
            if (imageList != null && !Intrinsics.LJFF(c21663019qG2.LLJ, imageList)) {
                c21663019qG2.LLJJ = true;
                c21663019qG2.LLJ = imageList;
                c21663019qG2.notifyDataSetChanged();
            }
            C21662519qB c21662519qB = this.LLILZLL;
            c21662519qB.getClass();
            if (l != null && num != null) {
                c21662519qB.LLLLZI = l.longValue() + ((long) num.intValue());
                c21662519qB.LLLLZIL.LIZLLL = num.intValue();
            }
            onPageSelected(0);
        }
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIJ(Aweme aweme, boolean z, Long l, Integer num) {
        this.LLJI = z;
        LJIIJJI(aweme, l, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21662819qE(ViewGroup viewGroup, String str, EnumC671230QUn enumC671230QUn, Function1<? super String, Unit> function1, EnumC1781440wSU enumC1781440wSU, InterfaceC21663219qI interfaceC21663219qI) {
        this.LL = str;
        this.LLILLJJLI = function1;
        this.LLILLL = interfaceC21663219qI;
        C1910470zob c1910470zob = new C1910470zob();
        this.LLILZ = c1910470zob;
        this.LLILZIL = new C21663019qG(viewGroup.getContext(), str, enumC671230QUn, c1910470zob, function1, enumC1781440wSU);
        this.LLJILJIL = new ArrayList();
        this.LLILZLL = (C21662519qB) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eaf, viewGroup, false).findViewById(R.id.qdq);
        if (C0BUS.LIZ()) {
            int i = 0;
            do {
                ((ArrayList) this.LLJILJIL).add(C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.eae, viewGroup, false));
                i++;
            } while (i < 2);
        }
    }
}
