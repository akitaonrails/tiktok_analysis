package X;

import X.C19EG;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.ui.feed.commerce.VSAMultiPhotoViewHolder;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.AdHintPhotoViewHolderV2;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotoAssemViewHolder;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotoHintViewHolder;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.ss.android.ugc.aweme.ui.feed.subphoto.std.PhotoHolderAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719880SLq extends AbstractC719900SLs<PhotosViewHolderV3> implements C0SMK {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public final InterfaceC720380SNo LLILLL;
    public final C0SLJ LLILZ;
    public final C0SM7 LLILZIL;
    public final ViewGroup LLILZLL;
    public final InterfaceC719500SKe LLIZ;
    public final C0SM8 LLIZLLLIL;
    public final C0SM1 LLJ;
    public final C0SLS LLJI;
    public final C0SMP LLJIJIL;
    public final C0SMC LLJILJIL;
    public PhotosViewHolderV3 LLJJ;
    public SmartImagePhotoViewHolderV2 LLJJI;
    public PhotosViewHolderV3 LLJJIJI;
    public int LLJJIJIIJIL;
    public C0SMF LLJJIJIL;
    public C0SCF LLJJLIIIJLLLLLLLZ;
    public C0S5N LLJL;
    public InterfaceC19578611iq LLJLIL;
    public C0SKT LLJLILLLLZIIL;
    public C0SFT LLJLL;
    public volatile boolean LLJLLIL;
    public boolean LLJZ;
    public final SparseArray<PhotosViewHolderV3> LLJILJILJ = new SparseArray<>();
    public final ArrayList<PhotoModeImageUrlModel> LLJILLL = new ArrayList<>();
    public int LLJJIII = -1;
    public final List<C0SMF> LLJJJ = new ArrayList();
    public final Map<Integer, InterfaceC469401sC> LLJJJIL = new LinkedHashMap();
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(522));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1671));
    public final C719930SLv LLJJJJLIIL = new C719930SLv(0);
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(523));
    public volatile int LLJLLL = 1;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    public final void LJJIZ() {
        for (InterfaceC469401sC interfaceC469401sC : ((LinkedHashMap) this.LLJJJIL).values()) {
            if (interfaceC469401sC != null) {
                interfaceC469401sC.cancel();
            }
        }
        ((LinkedHashMap) this.LLJJJIL).clear();
    }

    public final boolean LJJJIL() {
        return ((Boolean) this.LLJJJJJIL.getValue()).booleanValue();
    }

    public final int LJJJJI() {
        int size = this.LLJILLL.size();
        int i = this.LLJLLL;
        if (i != 0) {
            size /= i;
        }
        if (size <= 0) {
            return 1;
        }
        return size;
    }

    public final VideoItemParams LJJJJIZL() {
        return this.LLILZIL.d6();
    }

    public final void LJJJJL() {
        Aweme aweme;
        if (!((Boolean) C270610Aj5.LIZ.getValue()).booleanValue() || this.LLJILLL.size() <= 0 || LJJJJIZL() == null) {
            return;
        }
        boolean z = this.LLJLLIL;
        VideoItemParams videoItemParamsLJJJJIZL = LJJJJIZL();
        if (z != C1009740cNo.LJIIL(videoItemParamsLJJJJIZL != null ? videoItemParamsLJJJJIZL.getAweme() : null)) {
            VideoItemParams videoItemParamsLJJJJIZL2 = LJJJJIZL();
            int iLJI = 1;
            this.LLJLLIL = C1009740cNo.LJIIL(videoItemParamsLJJJJIZL2 != null ? videoItemParamsLJJJJIZL2.getAweme() : null);
            VideoItemParams videoItemParamsLJJJJIZL3 = LJJJJIZL();
            if (videoItemParamsLJJJJIZL3 != null && (aweme = videoItemParamsLJJJJIZL3.getAweme()) != null) {
                iLJI = C1009740cNo.LJI(aweme);
            }
            this.LLJLLL = iLJI;
            C0CNO.LIZLLL(0L, new AwS555S0100000_11(this, 1670));
        }
    }

    @Override // X.AbstractC719900SLs
    public final int LJJIJIL() {
        return ((C0SCS.LIZIZ(LJJJJIZL()) || LJJJZ()) && !this.LLILZIL.SC()) ? LJJJJI() + 1 : this.LLJLLIL ? LJJJJI() : this.LLJZ ? LJJJJI() : this.LLJILLL.size();
    }

    public final boolean LJJJZ() {
        VideoItemParams videoItemParamsLJJJJIZL;
        Aweme aweme;
        return (((!C0RHE.LJ() || LJJJJI() <= 1) && !C0RHE.LIZLLL()) || !this.LLJZ || (videoItemParamsLJJJJIZL = LJJJJIZL()) == null || (aweme = videoItemParamsLJJJJIZL.getAweme()) == null || AwemeExtKt.isAdTraffic(aweme) || this.LLILZIL.SC()) ? false : true;
    }

    @Override // X.C0SMK
    public final PhotosViewHolderV3 LJFF(int i) {
        return LJJJJJ(i);
    }

    @Override // X.AbstractC719900SLs
    public final int LJJIJL(int i) {
        Aweme aweme;
        if (C0SCS.LIZIZ(LJJJJIZL()) && !this.LLILZIL.SC() && i == LJJJJI() && LJJJJI() != 0) {
            return 1;
        }
        if (LJJJZ() && i == LJJJJI()) {
            return 6;
        }
        if (this.LLJLLIL) {
            return 4;
        }
        VideoItemParams videoItemParamsLJJJJIZL = LJJJJIZL();
        if (videoItemParamsLJJJJIZL != null && (aweme = videoItemParamsLJJJJIZL.getAweme()) != null && C721220SQu.LJFF(i, aweme)) {
            return 5;
        }
        return 0;
    }

    public final void LJJJ(int i) {
        PhotosViewHolderV3 photosViewHolderV3 = this.LLJJIJI;
        if (photosViewHolderV3 != null) {
            photosViewHolderV3.LJJIIZI();
        }
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ = LJJJJJ(i);
        if (photosViewHolderV3LJJJJJ != null) {
            photosViewHolderV3LJJJJJ.LJJIIJ(i);
        }
        this.LLJJIJI = photosViewHolderV3LJJJJJ;
        this.LLJJIJIIJIL = i;
    }

    public final PhotosViewHolderV3 LJJJI(int i) {
        PhotosViewHolderV3 photosViewHolderV3 = this.LLJILJILJ.get(i);
        if (photosViewHolderV3 != null && photosViewHolderV3.LLILLJJLI == LJJIJL(i) && photosViewHolderV3.LLJILJILJ != null) {
            return photosViewHolderV3;
        }
        return null;
    }

    public final InterfaceC1008930cMV LJJJJ(PhotosViewHolderV3 photosViewHolderV3) {
        IFeedService iFeedServiceLIZIZ;
        Context context;
        String str = null;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        Aweme aweme = null;
        if (iCommerceService == null || (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) == null) {
            return null;
        }
        View view = photosViewHolderV3.LL;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        VideoItemParams videoItemParamsLJJJJIZL = LJJJJIZL();
        if (videoItemParamsLJJJJIZL != null) {
            str = videoItemParamsLJJJJIZL.mEventType;
        }
        VideoItemParams videoItemParamsLJJJJIZL2 = LJJJJIZL();
        if (videoItemParamsLJJJJIZL2 != null) {
            aweme = videoItemParamsLJJJJIZL2.getAweme();
        }
        return iFeedServiceLIZIZ.LIZJ(context, aweme, str, true);
    }

    public final PhotosViewHolderV3 LJJJJJ(int i) {
        PhotosViewHolderV3 photosViewHolderV3 = this.LLJILJILJ.get(i);
        if (photosViewHolderV3 == null || photosViewHolderV3.LLILLJJLI != LJJIJL(i)) {
            return null;
        }
        return photosViewHolderV3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJJJJL(android.view.ViewGroup r11) {
        /*
            r10 = this;
            X.0SM2 r9 = X.C0SM2.LIZ
            r9.getClass()
            long r7 = android.os.SystemClock.elapsedRealtime()
            android.content.Context r0 = r11.getContext()
            X.19EG r2 = X.C1388190mED.LIZIZ(r0)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = r10.LJJJJIZL()
            r5 = 0
            if (r0 == 0) goto Lac
            int r6 = r0.currentPosition
        L1a:
            r9.getClass()
            java.lang.ref.SoftReference<X.0R1J> r0 = X.C0SM2.LIZLLL
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            X.0Qww r0 = (X.AbstractC686880Qww) r0
            if (r0 == 0) goto L2c
            android.app.Activity r1 = r0.LIZ
        L2c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            r4 = 2131565050(0x7f0d19fa, float:1.8755603E38)
            if (r0 == 0) goto L89
            java.lang.ref.SoftReference<X.0R1J> r0 = X.C0SM2.LIZLLL
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r0.get()
            X.0Qwv r0 = (X.C686870Qwv) r0
            if (r0 == 0) goto Laa
            boolean r3 = r0.LIZ(r4)
            if (r3 == 0) goto L4d
            int r0 = X.C0SM2.LIZJ
            int r0 = r0 + 1
            X.C0SM2.LIZJ = r0
        L4d:
            java.lang.ref.SoftReference<X.0R1J> r0 = X.C0SM2.LIZLLL
            if (r0 == 0) goto La8
            java.lang.Object r0 = r0.get()
            X.0Qwv r0 = (X.C686870Qwv) r0
            if (r0 == 0) goto La8
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.LinkedList<android.view.View>> r1 = r0.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.get(r0)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            if (r0 == 0) goto La8
            int r2 = r0.size()
        L6b:
            java.util.concurrent.ExecutorService r1 = X.C823050WQl.LIZIZ()
            X.0SLy r0 = new X.0SLy
            r0.<init>()
            r1.execute(r0)
            java.lang.ref.SoftReference<X.0R1J> r0 = X.C0SM2.LIZLLL
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.get()
            X.0Qwv r0 = (X.C686870Qwv) r0
            if (r0 == 0) goto L89
            android.view.View r6 = r0.LIZIZ(r4)
            if (r6 != 0) goto L92
        L89:
            android.content.Context r1 = r11.getContext()
            r0 = -1
            android.view.View r6 = X.C20742916Ex.LIZ(r1, r4, r11, r5, r0)
        L92:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r7
            r9.getClass()
            java.util.concurrent.ExecutorService r2 = X.C823050WQl.LIZIZ()
            Y.ARunnableS9S0000100_2 r1 = new Y.ARunnableS9S0000100_2
            r0 = 1
            r1.<init>(r3, r0)
            r2.execute(r1)
            return r6
        La8:
            r2 = 0
            goto L6b
        Laa:
            r3 = 0
            goto L4d
        Lac:
            r6 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719880SLq.LJJJJJL(android.view.ViewGroup):android.view.View");
    }

    public final void LJJJJLL(int i) {
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ = LJJJJJ(i);
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2 = this.LLJJI;
        if (smartImagePhotoViewHolderV2 != null && smartImagePhotoViewHolderV2 != photosViewHolderV3LJJJJJ) {
            C0SMD c0smd = SmartImagePhotoViewHolderV2.LLLLLLIL;
            smartImagePhotoViewHolderV2.LJJLIIIJLJLI(true);
        }
        C0FX4 c0fx4 = new C0FX4(this.LLJILJILJ, 0);
        while (c0fx4.hasNext()) {
            PhotosViewHolderV3 photosViewHolderV3 = (PhotosViewHolderV3) c0fx4.next();
            if (photosViewHolderV3 != photosViewHolderV3LJJJJJ && (photosViewHolderV3 instanceof SmartImagePhotoViewHolderV2)) {
                C0SMD c0smd2 = SmartImagePhotoViewHolderV2.LLLLLLIL;
                ((SmartImagePhotoViewHolderV2) photosViewHolderV3).LJJLIIIJLJLI(true);
            }
        }
        this.LLJJI = null;
    }

    public final void LJJJJZI(int i) {
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        C719970SLz c719970SLz;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV22;
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ = LJJJJJ(i);
        if (this.LLJJ == null) {
            this.LLJJ = photosViewHolderV3LJJJJJ;
        }
        String aid = null;
        if (this.LLJJIII != i) {
            if ((photosViewHolderV3LJJJJJ instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV22 = (SmartImagePhotoViewHolderV2) photosViewHolderV3LJJJJJ) != null) {
                smartImagePhotoViewHolderV22.LJJLIIIJL();
            }
            this.LLJJIII = i;
        }
        if (photosViewHolderV3LJJJJJ != null) {
            photosViewHolderV3LJJJJJ.LJIILJJIL();
        }
        if (LJJJIL()) {
            if (photosViewHolderV3LJJJJJ instanceof SmartImagePhotoViewHolderV2) {
                smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) photosViewHolderV3LJJJJJ;
            } else {
                smartImagePhotoViewHolderV2 = null;
            }
            C719930SLv c719930SLv = this.LLJJJJLIIL;
            if (c719930SLv.LIZIZ > 0 && smartImagePhotoViewHolderV2 != null) {
                String str = c719930SLv.LIZ;
                Aweme awemeLJIJ = smartImagePhotoViewHolderV2.LJIJ();
                if (awemeLJIJ != null) {
                    aid = awemeLJIJ.getAid();
                }
                if (Intrinsics.LJFF(str, aid) && (c719970SLz = this.LLJJJJLIIL.LIZJ.get(Integer.valueOf(i))) != null && c719970SLz.LIZIZ == this.LLJJJJLIIL.LIZIZ && smartImagePhotoViewHolderV2.LLLI != null) {
                    smartImagePhotoViewHolderV2.LJJLIIIJJIZ();
                }
            }
        }
    }

    public final Boolean LJJJLZIJ(int i) {
        Aweme aweme;
        List<C0SME> list;
        C0SME c0sme;
        if (C281430B1h.LIZ()) {
            C0S5N c0s5n = this.LLJL;
            if (c0s5n == null) {
                return null;
            }
            C161N c161n = C161N.LIZIZ;
            VideoItemParams videoItemParamsLJJJJIZL = LJJJJIZL();
            if (videoItemParamsLJJJJIZL != null) {
                aweme = videoItemParamsLJJJJIZL.getAweme();
            } else {
                aweme = null;
            }
            if (!c161n.LJJIII(aweme, this.LLJL) || (list = c0s5n.LIZIZ) == null || (c0sme = (C0SME) C13LP.LJJJLZIJ(i, list)) == null) {
                return null;
            }
            return Boolean.valueOf(c0sme.LIZIZ);
        }
        return Boolean.TRUE;
    }

    public final void LJJL(int i) {
        String aid;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        Float f;
        Aweme aweme;
        if (LJJJIL() && i >= 0) {
            C719930SLv c719930SLv = this.LLJJJJLIIL;
            if (c719930SLv.LIZIZ > 0) {
                String str = c719930SLv.LIZ;
                VideoItemParams videoItemParamsLJJJJIZL = LJJJJIZL();
                String aid2 = null;
                if (videoItemParamsLJJJJIZL != null && (aweme = videoItemParamsLJJJJIZL.getAweme()) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(str, aid)) {
                    PhotosViewHolderV3 photosViewHolderV3LJJJI = LJJJI(i);
                    if ((photosViewHolderV3LJJJI instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) photosViewHolderV3LJJJI) != null) {
                        String str2 = this.LLJJJJLIIL.LIZ;
                        Aweme awemeLJIJ = smartImagePhotoViewHolderV2.LJIJ();
                        if (awemeLJIJ != null) {
                            aid2 = awemeLJIJ.getAid();
                        }
                        if (!Intrinsics.LJFF(str2, aid2)) {
                            return;
                        }
                        Map<Integer, C719970SLz> map = this.LLJJJJLIIL.LIZJ;
                        Integer numValueOf = Integer.valueOf(i);
                        C719970SLz c719970SLz = map.get(numValueOf);
                        if (c719970SLz == null) {
                            c719970SLz = new C719970SLz(0);
                            map.put(numValueOf, c719970SLz);
                        }
                        C719970SLz c719970SLz2 = c719970SLz;
                        if (smartImagePhotoViewHolderV2.LLLI != null) {
                            if ((c719970SLz2.LIZ || c719970SLz2.LIZIZ != this.LLJJJJLIIL.LIZIZ) && smartImagePhotoViewHolderV2.LLLFFI.LIZ(smartImagePhotoViewHolderV2.LJIJ()) && (f = smartImagePhotoViewHolderV2.LLLI) != null) {
                                float fFloatValue = f.floatValue();
                                smartImagePhotoViewHolderV2.LLLFZ = false;
                                smartImagePhotoViewHolderV2.LJJJJ(smartImagePhotoViewHolderV2.LLLILZ, fFloatValue);
                                if (smartImagePhotoViewHolderV2.LLLFZ) {
                                    c719970SLz2.LIZIZ = this.LLJJJJLIIL.LIZIZ;
                                    c719970SLz2.LIZ = false;
                                    if (this.LLILZIL.D21(i) && Boolean.valueOf(C717490SCl.LIZ(smartImagePhotoViewHolderV2.LLJLLIL)).booleanValue()) {
                                        smartImagePhotoViewHolderV2.LJJLIIIJJIZ();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void LJJIL(int i, Function0<? extends InterfaceC469401sC> function0) {
        if (this.LLJJJIL.containsKey(Integer.valueOf(i))) {
            InterfaceC469401sC interfaceC469401sC = (InterfaceC469401sC) ((LinkedHashMap) this.LLJJJIL).get(Integer.valueOf(i));
            if (interfaceC469401sC != null) {
                interfaceC469401sC.cancel();
            }
        }
        InterfaceC469401sC interfaceC469401sCInvoke = function0.invoke();
        this.LLJJJIL.put(Integer.valueOf(i), interfaceC469401sCInvoke);
    }

    public final void LJJJJLI(long j, String str) {
        String aid;
        Aweme aweme;
        if (!LJJJIL()) {
            return;
        }
        VideoItemParams videoItemParamsLJJJJIZL = LJJJJIZL();
        if (videoItemParamsLJJJJIZL != null && (aweme = videoItemParamsLJJJJIZL.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        if (j <= 0) {
            C719930SLv c719930SLv = this.LLJJJJLIIL;
            c719930SLv.LIZ = null;
            c719930SLv.LIZIZ = 0L;
            c719930SLv.LIZJ.clear();
            return;
        }
        C719930SLv c719930SLv2 = this.LLJJJJLIIL;
        c719930SLv2.LIZ = str;
        c719930SLv2.LIZIZ = j;
        C0FX4 c0fx4 = new C0FX4(this.LLJILJILJ, 0);
        while (c0fx4.hasNext()) {
            LJJL(((C0SMB) c0fx4.next()).LLILLL);
        }
    }

    public final void LJJJJZ(C0S5N c0s5n, int i) {
        PhotoModeImageUrlModel photoModeImageUrlModel;
        this.LLJL = c0s5n;
        PhotosViewHolderV3 photosViewHolderV3 = this.LLJILJILJ.get(i);
        if (photosViewHolderV3 != null) {
            PhotoModeImageUrlModel photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(photosViewHolderV3.LLILLL, this.LLJILLL);
            if (photoModeImageUrlModel2 != null) {
                int i2 = photosViewHolderV3.LLILLL;
                VideoItemParams videoItemParamsLJJJJIZL = LJJJJIZL();
                Boolean boolLJJJLZIJ = LJJJLZIJ(photosViewHolderV3.LLILLL);
                C0SM0 c0sm0LJJIJIIJIL = photosViewHolderV3.LJJIJIIJIL();
                C0SMS c0smsLJIJJ = photosViewHolderV3.LJIJJ();
                if (c0smsLJIJJ != null) {
                    c0smsLJIJJ.LJFF(i2, photoModeImageUrlModel2, videoItemParamsLJJJJIZL, c0sm0LJJIJIIJIL, photosViewHolderV3.LLJJJ, boolLJJJLZIJ);
                }
            }
        }
        C0FX4 c0fx4 = new C0FX4(this.LLJILJILJ, 0);
        while (c0fx4.hasNext()) {
            PhotosViewHolderV3 photosViewHolderV32 = (PhotosViewHolderV3) c0fx4.next();
            int i3 = photosViewHolderV32.LLILLL;
            if (i3 != i && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i3, this.LLJILLL)) != null) {
                int i4 = photosViewHolderV32.LLILLL;
                VideoItemParams videoItemParamsLJJJJIZL2 = LJJJJIZL();
                Boolean boolLJJJLZIJ2 = LJJJLZIJ(photosViewHolderV32.LLILLL);
                C0SM0 c0sm0LJJIJIIJIL2 = photosViewHolderV32.LJJIJIIJIL();
                C0SMS c0smsLJIJJ2 = photosViewHolderV32.LJIJJ();
                if (c0smsLJIJJ2 != null) {
                    c0smsLJIJJ2.LJFF(i4, photoModeImageUrlModel, videoItemParamsLJJJJIZL2, c0sm0LJJIJIIJIL2, photosViewHolderV32.LLJJJ, boolLJJJLZIJ2);
                }
            }
        }
    }

    public final void onPageSelected(int i, boolean z) {
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV2;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV22;
        SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV23;
        if (z) {
            PhotosViewHolderV3 photosViewHolderV3 = this.LLJJ;
            if ((photosViewHolderV3 instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV23 = (SmartImagePhotoViewHolderV2) photosViewHolderV3) != null) {
                smartImagePhotoViewHolderV23.LJJLIIIJL();
            }
            PhotosViewHolderV3 photosViewHolderV32 = this.LLJJ;
            if (photosViewHolderV32 instanceof SmartImagePhotoViewHolderV2) {
                smartImagePhotoViewHolderV2 = (SmartImagePhotoViewHolderV2) photosViewHolderV32;
                if (smartImagePhotoViewHolderV2 != null && smartImagePhotoViewHolderV2.LJJL()) {
                    smartImagePhotoViewHolderV2.LLJLLL.LIZJ();
                    smartImagePhotoViewHolderV2.LLJLLL.LJ();
                    smartImagePhotoViewHolderV2.LLJZ.LIZJ();
                    smartImagePhotoViewHolderV2.LLJZ.LIZIZ();
                }
            } else {
                smartImagePhotoViewHolderV2 = null;
            }
            SmartImagePhotoViewHolderV2 smartImagePhotoViewHolderV24 = this.LLJJI;
            if (smartImagePhotoViewHolderV24 != null) {
                if (smartImagePhotoViewHolderV24 != smartImagePhotoViewHolderV2) {
                    C0SMD c0smd = SmartImagePhotoViewHolderV2.LLLLLLIL;
                    smartImagePhotoViewHolderV24.LJJLIIIJLJLI(true);
                    if (smartImagePhotoViewHolderV2 != null) {
                    }
                }
                smartImagePhotoViewHolderV2.LJJJJLL();
            } else if (smartImagePhotoViewHolderV2 != null) {
                smartImagePhotoViewHolderV2.LJJJJLL();
            }
            this.LLJJI = smartImagePhotoViewHolderV2;
            PhotosViewHolderV3 photosViewHolderV33 = this.LLJJ;
            if (photosViewHolderV33 != null) {
                photosViewHolderV33.LJIIZILJ();
            }
            PhotosViewHolderV3 photosViewHolderV34 = this.LLJJ;
            if (photosViewHolderV34 != null) {
                photosViewHolderV34.LLJJIII = null;
            }
            PhotosViewHolderV3 photosViewHolderV3LJJJJJ = LJJJJJ(i);
            this.LLJJ = photosViewHolderV3LJJJJJ;
            if ((photosViewHolderV3LJJJJJ instanceof SmartImagePhotoViewHolderV2) && (smartImagePhotoViewHolderV22 = (SmartImagePhotoViewHolderV2) photosViewHolderV3LJJJJJ) != null) {
                smartImagePhotoViewHolderV22.LJJLIIIJL();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1] */
    @Override // X.AbstractC719900SLs
    public final PhotosViewHolderV3 LJJIJLIJ(int i, int i2, ViewGroup viewGroup) {
        PhotosViewHolderV3 adHintPhotoViewHolderV2;
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        final View viewLJJJJJL = LJJJJJL(viewGroup);
                        InterfaceC720380SNo interfaceC720380SNo = this.LLILLL;
                        C0SLJ c0slj = this.LLILZ;
                        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1673);
                        C0SM7 c0sm7 = this.LLILZIL;
                        ViewGroup viewGroup2 = this.LLILZLL;
                        InterfaceC719500SKe interfaceC719500SKe = this.LLIZ;
                        C0SM8 c0sm8 = this.LLIZLLLIL;
                        C0SM1 c0sm1 = this.LLJ;
                        C0SLS c0sls = this.LLJI;
                        AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11(this, 1674);
                        final C0SZN c0szn = (C0SZN) this.LLJJL.getValue();
                        adHintPhotoViewHolderV2 = new SmartImagePhotoViewHolderV2(viewLJJJJJL, interfaceC720380SNo, c0slj, awS555S0100000_11, c0sm7, viewGroup2, interfaceC719500SKe, c0sm8, c0sm1, c0sls, awS555S0100000_112, new AssemReusedContainer<PhotoAssemViewHolder, C719950SLx>(viewLJJJJJL, c0szn) { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1
                            public final C19EG LLJILJILJ;
                            public final LifecycleOwner LLJILLL;
                            public final View LLJJ;

                            @Override // com.bytedance.ext_power_list.AssemReusedContainer
                            public final ReusedUIAssem<?> LLILLJJLI() {
                                return new PhotoHolderAssem();
                            }

                            @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
                            public final InterfaceC665370Q7z k0() {
                                return this.LLJJI.LLJIJIL.LIZ().invoke();
                            }

                            @Override // X.InterfaceC719640SKs
                            public final LifecycleOwner E82() {
                                return this.LLJILLL;
                            }

                            @Override // X.InterfaceC719640SKs
                            public final View LJJIJL() {
                                return this.LLJJ;
                            }

                            @Override // X.InterfaceC719640SKs
                            public final C19EG getActivity() {
                                return this.LLJILJILJ;
                            }

                            {
                                super(c0szn);
                                this.LLJILJILJ = this.LLJJI.LLJIJIL.getActivity();
                                this.LLJILLL = this.LLJJI.LLJIJIL.getLifecycleOwner();
                                this.LLJJ = viewLJJJJJL;
                            }
                        }, this.LLJILJIL, new C719910SLt(this));
                    } else {
                        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b7s, new FrameLayout(viewGroup.getContext()), false);
                        C0SLJ c0slj2 = this.LLILZ;
                        C0SM7 c0sm72 = this.LLILZIL;
                        ViewGroup viewGroup3 = this.LLILZLL;
                        C0SM8 c0sm82 = this.LLIZLLLIL;
                        C0SM1 c0sm12 = this.LLJ;
                        final C0SZN c0szn2 = (C0SZN) this.LLJJL.getValue();
                        adHintPhotoViewHolderV2 = new PhotoHintViewHolder(viewTd, c0slj2, c0sm72, viewGroup3, c0sm82, c0sm12, new AssemReusedContainer<PhotoAssemViewHolder, C719950SLx>(viewTd, c0szn2) { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1
                            public final C19EG LLJILJILJ;
                            public final LifecycleOwner LLJILLL;
                            public final View LLJJ;

                            @Override // com.bytedance.ext_power_list.AssemReusedContainer
                            public final ReusedUIAssem<?> LLILLJJLI() {
                                return new PhotoHolderAssem();
                            }

                            @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
                            public final InterfaceC665370Q7z k0() {
                                return this.LLJJI.LLJIJIL.LIZ().invoke();
                            }

                            @Override // X.InterfaceC719640SKs
                            public final LifecycleOwner E82() {
                                return this.LLJILLL;
                            }

                            @Override // X.InterfaceC719640SKs
                            public final View LJJIJL() {
                                return this.LLJJ;
                            }

                            @Override // X.InterfaceC719640SKs
                            public final C19EG getActivity() {
                                return this.LLJILJILJ;
                            }

                            {
                                super(c0szn2);
                                this.LLJILJILJ = this.LLJJI.LLJIJIL.getActivity();
                                this.LLJILLL = this.LLJJI.LLJIJIL.getLifecycleOwner();
                                this.LLJJ = viewTd;
                            }
                        });
                    }
                } else {
                    final View viewLJJJJJL2 = LJJJJJL(viewGroup);
                    InterfaceC720380SNo interfaceC720380SNo2 = this.LLILLL;
                    C0SLJ c0slj3 = this.LLILZ;
                    AwS555S0100000_11 awS555S0100000_113 = new AwS555S0100000_11(this, 1672);
                    C0SM7 c0sm73 = this.LLILZIL;
                    ViewGroup viewGroup4 = this.LLILZLL;
                    InterfaceC719500SKe interfaceC719500SKe2 = this.LLIZ;
                    C0SM8 c0sm83 = this.LLIZLLLIL;
                    C0SM1 c0sm13 = this.LLJ;
                    C0SLS c0sls2 = this.LLJI;
                    final C0SZN c0szn3 = (C0SZN) this.LLJJL.getValue();
                    adHintPhotoViewHolderV2 = new LivePhotoViewHolder(viewLJJJJJL2, interfaceC720380SNo2, c0slj3, awS555S0100000_113, c0sm73, viewGroup4, interfaceC719500SKe2, c0sm83, c0sm13, c0sls2, new AssemReusedContainer<PhotoAssemViewHolder, C719950SLx>(viewLJJJJJL2, c0szn3) { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1
                        public final C19EG LLJILJILJ;
                        public final LifecycleOwner LLJILLL;
                        public final View LLJJ;

                        @Override // com.bytedance.ext_power_list.AssemReusedContainer
                        public final ReusedUIAssem<?> LLILLJJLI() {
                            return new PhotoHolderAssem();
                        }

                        @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
                        public final InterfaceC665370Q7z k0() {
                            return this.LLJJI.LLJIJIL.LIZ().invoke();
                        }

                        @Override // X.InterfaceC719640SKs
                        public final LifecycleOwner E82() {
                            return this.LLJILLL;
                        }

                        @Override // X.InterfaceC719640SKs
                        public final View LJJIJL() {
                            return this.LLJJ;
                        }

                        @Override // X.InterfaceC719640SKs
                        public final C19EG getActivity() {
                            return this.LLJILJILJ;
                        }

                        {
                            super(c0szn3);
                            this.LLJILJILJ = this.LLJJI.LLJIJIL.getActivity();
                            this.LLJILLL = this.LLJJI.LLJIJIL.getLifecycleOwner();
                            this.LLJJ = viewLJJJJJL2;
                        }
                    }, this.LLJILJIL);
                }
            } else {
                final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d_o, viewGroup, false);
                InterfaceC720380SNo interfaceC720380SNo3 = this.LLILLL;
                C0SLJ c0slj4 = this.LLILZ;
                C0SM7 c0sm74 = this.LLILZIL;
                ViewGroup viewGroup5 = this.LLILZLL;
                InterfaceC719500SKe interfaceC719500SKe3 = this.LLIZ;
                C0SM8 c0sm84 = this.LLIZLLLIL;
                C0SM1 c0sm14 = this.LLJ;
                final C0SZN c0szn4 = (C0SZN) this.LLJJL.getValue();
                adHintPhotoViewHolderV2 = new VSAMultiPhotoViewHolder(viewTd2, interfaceC720380SNo3, c0slj4, c0sm74, viewGroup5, interfaceC719500SKe3, c0sm84, c0sm14, new AssemReusedContainer<PhotoAssemViewHolder, C719950SLx>(viewTd2, c0szn4) { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1
                    public final C19EG LLJILJILJ;
                    public final LifecycleOwner LLJILLL;
                    public final View LLJJ;

                    @Override // com.bytedance.ext_power_list.AssemReusedContainer
                    public final ReusedUIAssem<?> LLILLJJLI() {
                        return new PhotoHolderAssem();
                    }

                    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
                    public final InterfaceC665370Q7z k0() {
                        return this.LLJJI.LLJIJIL.LIZ().invoke();
                    }

                    @Override // X.InterfaceC719640SKs
                    public final LifecycleOwner E82() {
                        return this.LLJILLL;
                    }

                    @Override // X.InterfaceC719640SKs
                    public final View LJJIJL() {
                        return this.LLJJ;
                    }

                    @Override // X.InterfaceC719640SKs
                    public final C19EG getActivity() {
                        return this.LLJILJILJ;
                    }

                    {
                        super(c0szn4);
                        this.LLJILJILJ = this.LLJJI.LLJIJIL.getActivity();
                        this.LLJILLL = this.LLJJI.LLJIJIL.getLifecycleOwner();
                        this.LLJJ = viewTd2;
                    }
                });
            }
        } else {
            final View viewTd3 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b87, new FrameLayout(viewGroup.getContext()), false);
            C0SLJ c0slj5 = this.LLILZ;
            C0SM7 c0sm75 = this.LLILZIL;
            ViewGroup viewGroup6 = this.LLILZLL;
            C0SM8 c0sm85 = this.LLIZLLLIL;
            C0SM1 c0sm15 = this.LLJ;
            final C0SZN c0szn5 = (C0SZN) this.LLJJL.getValue();
            adHintPhotoViewHolderV2 = new AdHintPhotoViewHolderV2(viewTd3, c0slj5, c0sm75, viewGroup6, c0sm85, c0sm15, new AssemReusedContainer<PhotoAssemViewHolder, C719950SLx>(viewTd3, c0szn5) { // from class: com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1
                public final C19EG LLJILJILJ;
                public final LifecycleOwner LLJILLL;
                public final View LLJJ;

                @Override // com.bytedance.ext_power_list.AssemReusedContainer
                public final ReusedUIAssem<?> LLILLJJLI() {
                    return new PhotoHolderAssem();
                }

                @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC713360RyY
                public final InterfaceC665370Q7z k0() {
                    return this.LLJJI.LLJIJIL.LIZ().invoke();
                }

                @Override // X.InterfaceC719640SKs
                public final LifecycleOwner E82() {
                    return this.LLJILLL;
                }

                @Override // X.InterfaceC719640SKs
                public final View LJJIJL() {
                    return this.LLJJ;
                }

                @Override // X.InterfaceC719640SKs
                public final C19EG getActivity() {
                    return this.LLJILJILJ;
                }

                {
                    super(c0szn5);
                    this.LLJILJILJ = this.LLJJI.LLJIJIL.getActivity();
                    this.LLJILLL = this.LLJJI.LLJIJIL.getLifecycleOwner();
                    this.LLJJ = viewTd3;
                }
            });
        }
        this.LLJILJILJ.put(i2, adHintPhotoViewHolderV2);
        C0X35.LJIIJJI("ui_to_video_photomode_adapter_vh_create", false);
        return adHintPhotoViewHolderV2;
    }

    public final void LJJJLIIL(List<PhotoModeImageUrlModel> list, C0SFT c0sft, C0S5N c0s5n) {
        Aweme aweme;
        boolean z;
        Aweme aweme2;
        C0X35.LIZ("ui_to_video_photomode_adapter_set_data", false);
        VideoItemParams videoItemParamsLJJJJIZL = LJJJJIZL();
        if (videoItemParamsLJJJJIZL != null) {
            aweme = videoItemParamsLJJJJIZL.getAweme();
        } else {
            aweme = null;
        }
        int iLJI = 1;
        if (C1009740cNo.LJIIL(aweme)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLLIL = z;
        VideoItemParams videoItemParamsLJJJJIZL2 = LJJJJIZL();
        if (videoItemParamsLJJJJIZL2 != null && (aweme2 = videoItemParamsLJJJJIZL2.getAweme()) != null) {
            iLJI = C1009740cNo.LJI(aweme2);
        }
        this.LLJLLL = iLJI;
        LJJIZ();
        this.LLJJJJLIIL.LIZJ.clear();
        this.LLJLL = c0sft;
        this.LLJILLL.clear();
        this.LLJILLL.addAll(list);
        this.LLJL = c0s5n;
        C0SZN c0szn = (C0SZN) this.LLJJL.getValue();
        int iLJJIJIL = LJJIJIL();
        c0szn.LIZLLL().clear();
        CopyOnWriteArrayList<C0SZS<?, ?>> copyOnWriteArrayListLIZLLL = c0szn.LIZLLL();
        ArrayList arrayList = new ArrayList(iLJJIJIL);
        for (int i = 0; i < iLJJIJIL; i++) {
            arrayList.add(null);
        }
        copyOnWriteArrayListLIZLLL.addAll(arrayList);
        notifyDataSetChanged();
        C0X35.LJIIJJI("ui_to_video_photomode_adapter_set_data", false);
        C0X35.LIZ("ui_to_video_photomode_adapter_vh_create", false);
    }

    public C719880SLq(InterfaceC720380SNo interfaceC720380SNo, C0SLJ c0slj, PhotoViewModelV2 photoViewModelV2, ViewGroup viewGroup, InterfaceC719500SKe interfaceC719500SKe, C0SM8 c0sm8, C0SM1 c0sm1, C0SLS c0sls, C0SMP c0smp, C0SMC c0smc) {
        this.LLILLL = interfaceC720380SNo;
        this.LLILZ = c0slj;
        this.LLILZIL = photoViewModelV2;
        this.LLILZLL = viewGroup;
        this.LLIZ = interfaceC719500SKe;
        this.LLIZLLLIL = c0sm8;
        this.LLJ = c0sm1;
        this.LLJI = c0sls;
        this.LLJIJIL = c0smp;
        this.LLJILJIL = c0smc;
    }
}
