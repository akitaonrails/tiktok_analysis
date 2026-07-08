package X;

import Y.ARunnableS111S0100000_11;
import Y.ARunnableS133S0100000_33;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
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

/* JADX INFO: renamed from: X.19qF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21662919qF implements InterfaceC661560PxC, InterfaceC469360Ias {
    public final String LL;
    public final Function1<String, Unit> LLILLJJLI;
    public final C1910470zob LLILLL;
    public final C21663119qH LLILZ;
    public final C21662419qA LLILZIL;
    public Aweme LLILZLL;
    public Map<String, String> LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public final List<View> LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.InterfaceC661560PxC
    public final void LJ(int i) {
    }

    @Override // X.InterfaceC661560PxC
    public final void LJII(int i) {
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIIZ(boolean z) {
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIILIIL(InterfaceC19471211Fu interfaceC19471211Fu) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC661560PxC
    public final int LIZJ() {
        C21662419qA c21662419qA = this.LLILZIL;
        c21662419qA.LLLZIIL = true;
        C716710S9l c716710S9l = c21662419qA.LLLLZIL;
        c716710S9l.LIZIZ = false;
        C0STS c0sts = c716710S9l.LIZ;
        c0sts.LIZLLL = false;
        c0sts.LIZ = 0;
        HandlerHook.viewRemoveCallbacks(c21662419qA, c21662419qA.LLLZIL);
        c21662419qA.LLLZI = 0;
        return this.LLILZIL.getCurrentPosition();
    }

    @Override // X.InterfaceC661560PxC
    public final int LJIILJJIL() {
        return this.LLILZ.LJIIJJI();
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIILL() {
        this.LLILLL.LJ = Integer.valueOf(this.LLILZIL.getCurrentItem());
        this.LLILZIL.LIZLLL(this);
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
        int currentPosition = this.LLILZIL.getCurrentPosition();
        if (C0SNF.LIZ == 2) {
            Aweme aweme = this.LLILZLL;
            if (aweme == null || (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) == null || (imageList2 = photoModeImageInfo2.getImageList()) == null || (photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(currentPosition, imageList2)) == null || (list = photoModeImageUrlModel2.bitrateImages) == null || (multiImageUrlInfo = (MultiImageUrlInfo) C13LP.LJJJLZIJ(0, list)) == null || (urlModel = multiImageUrlInfo.image) == null) {
                Aweme aweme2 = this.LLILZLL;
                urlModel = (aweme2 == null || (photoModeImageInfo = aweme2.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(currentPosition, imageList)) == null) ? null : photoModeImageUrlModel.displayImageNoWatermark;
            }
            C823050WQl.LIZLLL().execute(new ARunnableS111S0100000_11(urlModel, 191));
        }
        if ((C294830Bh3.LIZ() & 33) == 33 && currentPosition == 0 && Intrinsics.LJFF(this.LL, "general_search")) {
            C823050WQl.LIZLLL().execute(new ARunnableS111S0100000_11(this, 192));
        }
        return currentPosition;
    }

    @Override // X.InterfaceC661560PxC
    public final void onCleared() {
        InterfaceC21663319qJ interfaceC21663319qJLJLJI;
        this.LLILLL.LIZ();
        C1910470zob c1910470zob = this.LLILLL;
        c1910470zob.LJ = null;
        c1910470zob.LIZ = false;
        c1910470zob.LJFF = 0;
        ((LinkedHashMap) c1910470zob.LIZLLL).clear();
        ((LinkedHashMap) c1910470zob.LIZJ).clear();
        C21662419qA c21662419qA = this.LLILZIL;
        c21662419qA.LLLLZLL = 0;
        c21662419qA.LLLLZLLLI.clear();
        c21662419qA.LLLZI = 0;
        c21662419qA.LLLZ = false;
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null && (interfaceC21663319qJLJLJI = iSearchService.LJLJI(this.LL)) != null) {
            interfaceC21663319qJLJLJI.reset();
        }
        this.LLILZIL.LJJIIJZLJL(this);
    }

    @Override // X.InterfaceC661560PxC
    public final View LJIILLIIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC661560PxC
    public final void LIZLLL(int i) {
        this.LLILZIL.setInitialPhotoIndex(i);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJFF(InterfaceC661730PxT interfaceC661730PxT) {
        this.LLILZIL.LLLLZLLLI.remove(interfaceC661730PxT);
        this.LLILZ.LLJJI = null;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJI(int i) {
        this.LLILZIL.setCurrentPhotoItem(i);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIIIZZ(Integer num) {
        this.LLJILJIL = true;
        if (num != null) {
            int iIntValue = num.intValue();
            this.LLIZLLLIL = true;
            this.LLJI = iIntValue;
        }
        this.LLILZIL.LJJJJI(num);
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIL(InterfaceC661730PxT interfaceC661730PxT) {
        this.LLILZIL.LLLLZLLLI.addIfAbsent(interfaceC661730PxT);
        this.LLILZ.LLJJI = interfaceC661730PxT;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        int count;
        C21663119qH c21663119qH = this.LLILZ;
        if (c21663119qH.LIZLLL() && (count = c21663119qH.getCount()) > 0 && (i == 0 || i == count - 1)) {
            return;
        }
        int iLJIILIIL = this.LLILZ.LJIILIIL(i);
        if (this.LLJ) {
            return;
        }
        if (Intrinsics.LJFF(this.LL, "general_search") && C1111704Wl.LIZ() && !this.LLJILJIL) {
            return;
        }
        if (C1833407Ga.LIZ() && this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            if (iLJIILIIL == this.LLJI) {
                return;
            }
        }
        Aweme aweme = this.LLILZLL;
        if (aweme != null) {
            String str = this.LL;
            C0SQK c0sqk = C0SQK.LIZ;
            int iLJIILJJIL = LJIILJJIL();
            Map<String, String> map = this.LLIZ;
            c0sqk.getClass();
            C0SQK.LIZIZ(str, "auto", aweme, iLJIILIIL, "right", null, false, iLJIILJJIL, map, null, false, null, -1L, 1, null, null, null, "", null, null);
        }
        C1910470zob c1910470zob = this.LLILLL;
        c1910470zob.LJFF = Math.max(c1910470zob.LJFF, iLJIILIIL);
        HandlerHook.viewPostDelay(this.LLILZIL, new ARunnableS133S0100000_33(this, 127), 200L);
    }

    @Override // X.InterfaceC661560PxC
    public final void setExtraParams(Map<String, String> map) {
        this.LLIZ = map;
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIJJI(Aweme aweme, Long l, Integer num) {
        List<PhotoModeImageUrlModel> imageList;
        if (!Intrinsics.LJFF(aweme, this.LLILZLL)) {
            this.LLIZLLLIL = false;
            this.LLJILJIL = false;
        }
        this.LLILZLL = aweme;
        this.LLILZ.LLJILLL = aweme;
        this.LLILLL.LIZIZ = aweme;
        if (aweme != null) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null) {
                imageList = photoModeImageInfo.getImageList();
            } else {
                imageList = null;
            }
            this.LLILZIL.setSupportSlide(false);
            this.LLILZIL.setAdapter(this.LLILZ);
            C21663119qH c21663119qH = this.LLILZ;
            c21663119qH.LLJILJILJ = this.LLJIJIL;
            if (imageList != null) {
                if (!Intrinsics.LJFF(c21663119qH.LLJ, imageList)) {
                    c21663119qH.LLJJ = true;
                    c21663119qH.LLJ = imageList;
                    c21663119qH.notifyDataSetChanged();
                }
                if (this.LLILZ.LJIIJJI() > 0) {
                    this.LLILZIL.setCurrentPhotoItem(0);
                }
            }
            C21662419qA c21662419qA = this.LLILZIL;
            c21662419qA.getClass();
            if (l != null && num != null) {
                c21662419qA.LLLLZI = l.longValue() + ((long) num.intValue());
                c21662419qA.LLLLZIL.LIZLLL = num.intValue();
            }
            onPageSelected(this.LLILZ.LIZLLL() ? 1 : 0);
        }
    }

    @Override // X.InterfaceC661560PxC
    public final void LJIIJ(Aweme aweme, boolean z, Long l, Integer num) {
        this.LLJ = z;
        LJIIJJI(aweme, l, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21662919qF(ViewGroup viewGroup, String str, EnumC671230QUn enumC671230QUn, Function1<? super String, Unit> function1, EnumC1781440wSU enumC1781440wSU) {
        this.LL = str;
        this.LLILLJJLI = function1;
        C1910470zob c1910470zob = new C1910470zob();
        this.LLILLL = c1910470zob;
        this.LLILZ = new C21663119qH(viewGroup.getContext(), str, enumC671230QUn, c1910470zob, function1, enumC1781440wSU);
        this.LLJIJIL = new ArrayList();
        this.LLILZIL = (C21662419qA) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eag, viewGroup, false).findViewById(R.id.qdq);
        if (C0BUS.LIZ()) {
            int i = 0;
            do {
                ((ArrayList) this.LLJIJIL).add(C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.eae, viewGroup, false));
                i++;
            } while (i < 2);
        }
    }
}
