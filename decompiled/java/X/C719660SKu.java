package X;

import Y.ARunnableS22S0101000_11;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS119S0101000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719660SKu implements InterfaceC710220RtU, C0SLU, InterfaceC719740SLc, InterfaceC705580Rm0 {
    public static final float LJLL = C418440Gaw.LIZIZ(3);
    public static final float LJLLI = C418440Gaw.LIZIZ(1);
    public static final int LJLLILLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    public static final int LJLLJ;
    public static final int LJLLL;
    public static final int LJLLLL;
    public static final int LJLLLLLL;
    public static final int LJLZ;
    public static final int LJZ;
    public static final int LJZI;
    public static final int LJZL;
    public static final int LL;
    public static final int LLD;
    public static final C01GW<Integer> LLF;
    public static final C01GW<Integer> LLFF;
    public static final int LLFFF;
    public static final C01GW<GradientDrawable> LLFII;
    public static final C01GW<C0SLT> LLFZ;
    public final Context LIZ;
    public C719530SKh LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public boolean LJI;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public C720110SMn LJIILIIL;
    public C0SFT LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public List<PhotoModeImage> LJIIZILJ;
    public PhotoModeImage LJIJ;
    public PhotoModeImage LJIJI;
    public PhotoModeImage LJIJJ;
    public Pair<Float, C0SL3> LJIJJLI;
    public FeedContentLayoutInfo LJIL;
    public int LJJ;
    public int LJJI;
    public Integer LJJIIJZLJL;
    public Drawable LJJIIZI;
    public Drawable LJJIJIL;
    public int LJJIJLIJ;
    public CopyOnWriteArraySet<View> LJJJI;
    public View LJJJIL;
    public ViewGroup LJJJJ;
    public View LJJJJI;
    public int LJJJJIZL;
    public final C01GW LJJJJJ;
    public Integer LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public View LJJJJZ;
    public boolean LJJJJZI;
    public boolean LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJLZIJ;
    public boolean LJJJZ;
    public final int LJJL;
    public final C01GW LJJLI;
    public int LJJLIIIIJ;
    public int LJJLIIIJ;
    public final int LJJLIIIJILLIZJL;
    public float LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public boolean LJJLIIJ;
    public BPEAHandler LJJLIL;
    public C0SL2 LJJLJ;
    public C0SL2 LJJLJLI;
    public C0SL2 LJJLL;
    public InterfaceC719700SKy LJJZ;
    public C21600219g8 LJJZZI;
    public int LJJZZIII;
    public int LJL;
    public int LJLI;
    public int LJLIIIL;
    public final int LJLIIL;
    public boolean LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public int LJLJJI;
    public View LJLJJL;
    public Long LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public ViewOnLayoutChangeListenerC738720SyM LJLJLLL;
    public String LJII = "";
    public int LJJIFFI = -1;
    public int LJJII = -1;
    public int LJJIII = -1;
    public int LJJIIJ = -1;
    public int LJJIIZ = -1;
    public final C01GW LJJIJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1371));
    public int LJJIJIIJI = -1;
    public int LJJIJIIJIL = -1;
    public int LJJIJL = -1;
    public int LJJIL = -1;
    public int LJJIZ = -7829368;
    public final C01GW LJJJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(345));

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LJLLJ = iLIZIZ;
        LJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LJLLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        LJLLLLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47));
        LJLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
        LJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45));
        LJZI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55));
        LJZL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        LLD = iLIZIZ2;
        LLF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(340));
        LLFF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(343));
        LLFFF = iLIZIZ;
        LLFII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(341));
        LLFZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(342));
    }

    @Override // X.InterfaceC710220RtU
    public final boolean LJIIL() {
        return this.LJJJLIIL && this.LJJJZ;
    }

    @Override // X.InterfaceC710220RtU
    public final boolean LJJIFFI() {
        if (this.LJJJLIIL) {
            return this.LJJJLZIJ || this.LJJJZ;
        }
        return false;
    }

    @Override // X.InterfaceC710220RtU
    public final Drawable LJJIIJZLJL() {
        return LLFII.getValue();
    }

    public final void LJJIJIIJI() {
        if (!this.LJJJLIIL) {
            int i = LJLLILLLL;
            this.LJJZZIII = LJJJJI() + i + this.LJJJJIZL;
            this.LJL = i;
            this.LJLI = i;
            this.LJLIIIL = i;
            return;
        }
        int i2 = LJLLILLLL;
        int iLJJJJI = LJJJJI() + i2 + this.LJJJJIZL;
        PhotoModeImage photoModeImage = this.LJIJI;
        C0SL3 c0sl3LJJJI = LJJJI(photoModeImage != null ? photoModeImage.pos : 0);
        if (c0sl3LJJJI != null) {
            Rect rect = c0sl3LJJJI.LJ;
            int iWidth = rect != null ? rect.width() : 0;
            Rect rect2 = c0sl3LJJJI.LJ;
            iLJJJJI = (rect2 != null ? rect2.top : 0) + i2;
            iLJJJJ = (LJJJJ() - LLFFF) - iWidth;
        }
        int i3 = this.LJJLIIIJILLIZJL;
        if (iLJJJJ < i3) {
            iLJJJJ = i3;
        }
        int i4 = iLJJJJ + i2;
        int i5 = i4 - this.LJJLIIIJ;
        int iLJJJJI2 = LJJJJI() + i2 + this.LJJJJIZL;
        if (iLJJJJI < iLJJJJI2) {
            iLJJJJI = iLJJJJI2;
        }
        this.LJJZZIII = iLJJJJI;
        this.LJL = i4;
        if (this.LJJL != 1) {
            i4 = i2 + LJLLJ;
        }
        this.LJLI = i4;
        this.LJLIIIL = i5;
    }

    public final void LJJIJIL() {
        GradientDrawable gradientDrawableLIZ;
        String str = this.LIZJ;
        if (str == null) {
            return;
        }
        GradientDrawable value = LLFII.getValue();
        if (this.LJJJLZIJ) {
            InterfaceC719700SKy interfaceC719700SKy = this.LJJZ;
            if (interfaceC719700SKy != null) {
                interfaceC719700SKy.LIZLLL(str, true, value, new Rect(0, LJJJJI() + this.LJJJJIZL, 0, 0));
                return;
            }
            return;
        }
        if (!this.LJJJZ) {
            InterfaceC719700SKy interfaceC719700SKy2 = this.LJJZ;
            if (interfaceC719700SKy2 != null) {
                interfaceC719700SKy2.LIZLLL(str, true, null, new Rect(0, 0, 0, 0));
                return;
            }
            return;
        }
        InterfaceC719700SKy interfaceC719700SKy3 = this.LJJZ;
        if (interfaceC719700SKy3 != null) {
            C719530SKh c719530SKh = this.LIZIZ;
            if (c719530SKh != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('-');
                sbLIZ.append(this.LJIILL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C719540SKi c719540SKi = (C719540SKi) c719530SKh.LJI.get((Object) strLIZIZ);
                if (c719540SKi != null && (gradientDrawableLIZ = c719530SKh.LIZ(c719540SKi.LIZ, c719540SKi.LIZIZ, strLIZIZ)) != null) {
                    value = gradientDrawableLIZ;
                }
            }
            interfaceC719700SKy3.LIZLLL(str, true, value, new Rect(0, LJJJJI() + this.LJJJJIZL, 0, 0));
        }
    }

    public final void LJJIL() {
        int iLJJJJ;
        if (this.LIZJ == null) {
            return;
        }
        PhotoModeImage photoModeImage = this.LJIJI;
        C0SL3 c0sl3LJJJI = LJJJI(photoModeImage != null ? photoModeImage.pos : 0);
        if (c0sl3LJJJI != null) {
            Rect rect = c0sl3LJJJI.LJ;
            int iWidth = rect != null ? rect.width() : 0;
            iLJJJJ = (LJJJJ() - LLFFF) - iWidth;
            this.LJJLIIIJJI = 1 - (iWidth / LJJJJ());
            this.LJJLIIIJJIZ = iLJJJJ;
        } else {
            iLJJJJ = 0;
        }
        if (iLJJJJ < this.LJJLIIIJILLIZJL || this.LJJLIIIJJI <= 0.0f) {
            this.LJJLIIIJJI = 0.04f - (LJLLJ / LJJJJ());
            iLJJJJ = this.LJJLIIIJILLIZJL;
            this.LJJLIIIJJIZ = iLJJJJ;
        }
        int i = (iLJJJJ - LLFFF) / 2;
        LJJJLL(iLJJJJ, i >= 0 ? i : 0, true);
    }

    public final FeedContentLayoutInfo LJJIZ() {
        C720210SMx c720210SMx = C0SMY.LIZ;
        FeedContentLayoutInfo feedContentLayoutInfoLIZLLL = C0SMY.LIZLLL(this.LIZJ, this.LJII);
        return feedContentLayoutInfoLIZLLL == null ? C0SMY.LIZIZ(this.LIZ, this.LJIILIIL, null, null, this.LJJI, this.LJIILJJIL, false, false, null, null) : feedContentLayoutInfoLIZLLL;
    }

    public final int LJJJIL() {
        if (this.LJJJLL && !this.LJJJLIIL && this.LJJ < LJJJJ()) {
            return LJJJJ();
        }
        int i = this.LJJ;
        return i <= 0 ? LJJJJ() : i;
    }

    public final int LJJJJ() {
        return ((Number) this.LJJLI.getValue()).intValue();
    }

    public final int LJJJJI() {
        return ((Number) this.LJJJJJ.getValue()).intValue();
    }

    public final boolean LJJJJIZL() {
        View viewUf;
        C720110SMn c720110SMn = this.LJIILIIL;
        if (c720110SMn == null || !c720110SMn.LJIIIIZZ || !c720110SMn.LJIIIZ) {
            return false;
        }
        InterfaceC719700SKy interfaceC719700SKy = this.LJJZ;
        if (interfaceC719700SKy != null) {
            viewUf = interfaceC719700SKy.Uf();
            if (viewUf != null && !(viewUf instanceof C705790RmL)) {
                return true;
            }
        } else {
            viewUf = null;
        }
        C1367960lha.LIZ.getClass();
        C705790RmL c705790RmL = (C705790RmL) viewUf;
        return C1367960lha.LIZ().isPoiAnchorView2(c705790RmL != null ? c705790RmL.LLILZIL : null);
    }

    public final void LJJJJLI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        View view = this.LJLJI;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || (numValueOf = Integer.valueOf(marginLayoutParams.bottomMargin)) == null) {
                return;
            }
            if (numValueOf.intValue() != this.LJLJJI) {
                marginLayoutParams.bottomMargin = this.LJLJJI;
                C786410Ut5.W5(view, marginLayoutParams);
                this.LJLJI = null;
                this.LJLJJI = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL() {
        /*
            r10 = this;
            java.lang.String r9 = r10.LIZJ
            if (r9 != 0) goto L5
            return
        L5:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r1 = r10.LJIJI
            if (r1 != 0) goto Ld
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r1 = r10.LJIJ
            if (r1 == 0) goto L26
        Ld:
            java.lang.Float r0 = r1.aspectRatio
            if (r0 == 0) goto L26
            float r8 = r0.floatValue()
        L15:
            int r3 = r1.pos
        L17:
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r0 = r10.LJIJI
            if (r0 == 0) goto L24
            int r0 = r0.pos
        L1d:
            X.0SL3 r0 = r10.LJJJI(r0)
            if (r0 != 0) goto L2c
            return
        L24:
            r0 = r3
            goto L1d
        L26:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L15
            r3 = -1
            goto L17
        L2c:
            X.0SL3 r7 = r0.LJIIL
            if (r7 == 0) goto Lab
            int r6 = r7.LIZJ
            int r0 = r0.LIZJ
            if (r6 == r0) goto Lab
            X.0SMx r0 = X.C0SMY.LIZ
            java.lang.String r1 = r10.LJII
            r0 = 614(0x266, float:8.6E-43)
            kotlin.jvm.internal.AFwS243S0000000_11 r0 = kotlin.jvm.internal.AFwS243S0000000_11.get$arr$(r0)
            X.C0SMY.LJIIIIZZ(r9, r1, r8, r0)
            java.util.List<com.ss.android.ugc.aweme.feed.model.PhotoModeImage> r0 = r10.LJIIZILJ
            if (r0 == 0) goto Lab
            int r2 = r0.size()
            if (r2 <= 0) goto Lab
            int r1 = r3 + 2
            r0 = 1
            int r2 = r2 - r0
            int r5 = java.lang.Math.min(r1, r2)
            if (r5 < 0) goto Lab
            r4 = 0
        L58:
            java.util.List<com.ss.android.ugc.aweme.feed.model.PhotoModeImage> r0 = r10.LJIIZILJ
            if (r0 == 0) goto La9
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r0 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImage) r0
            if (r0 == 0) goto La9
            java.lang.Float r0 = r0.aspectRatio
            if (r0 == 0) goto La9
            float r2 = r0.floatValue()
        L6c:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L7e
            X.0SKy r1 = r10.LJJZ
            if (r1 == 0) goto L79
            android.widget.ImageView$ScaleType r0 = r7.LIZ
            r1.LJIIIIZZ(r4, r6, r0)
        L79:
            if (r4 == r5) goto Lab
            int r4 = r4 + 1
            goto L58
        L7e:
            X.0SMx r0 = X.C0SMY.LIZ
            java.lang.String r1 = r10.LJII
            r0 = 615(0x267, float:8.62E-43)
            kotlin.jvm.internal.AFwS243S0000000_11 r0 = kotlin.jvm.internal.AFwS243S0000000_11.get$arr$(r0)
            X.0SL3 r3 = X.C0SMY.LJIIIIZZ(r9, r1, r2, r0)
            if (r3 == 0) goto L79
            X.0SL3 r0 = r3.LJIIL
            if (r0 == 0) goto L93
            r3 = r0
        L93:
            int r0 = r3.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L79
            X.0SKy r2 = r10.LJJZ
            if (r2 == 0) goto L79
            int r1 = r0.intValue()
            android.widget.ImageView$ScaleType r0 = r3.LIZ
            r2.LJIIIIZZ(r4, r1, r0)
            goto L79
        La9:
            r2 = 0
            goto L6c
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719660SKu.LJJJJLL():void");
    }

    public final void LJJJJZ() {
        C719880SLq c719880SLq;
        int iLJJIJIL;
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ;
        View view;
        View view2;
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ2;
        View view3;
        C21600219g8 c21600219g8 = this.LJJZZI;
        PagerAdapter adapter = c21600219g8 != null ? c21600219g8.getAdapter() : null;
        if (!(adapter instanceof C719880SLq) || (c719880SLq = (C719880SLq) adapter) == null || (iLJJIJIL = c719880SLq.LJJIJIL()) <= 0) {
            return;
        }
        int i = this.LJIILL;
        if (i > 0 && (photosViewHolderV3LJJJJJ2 = c719880SLq.LJJJJJ(i - 1)) != null && (view3 = photosViewHolderV3LJJJJJ2.LL) != null) {
            C786410Ut5.Jc(view3, -LJLLJ);
        }
        PhotosViewHolderV3 photosViewHolderV3LJJJJJ3 = c719880SLq.LJJJJJ(this.LJIILL);
        if (photosViewHolderV3LJJJJJ3 != null && (view2 = photosViewHolderV3LJJJJJ3.LL) != null) {
            C786410Ut5.Jc(view2, 0.0f);
        }
        int i2 = this.LJIILL;
        if (i2 + 1 > iLJJIJIL - 1 || (photosViewHolderV3LJJJJJ = c719880SLq.LJJJJJ(i2 + 1)) == null || (view = photosViewHolderV3LJJJJJ.LL) == null) {
            return;
        }
        C786410Ut5.Jc(view, LJLLJ);
    }

    @Override // X.InterfaceC710220RtU
    public final C443120HZe<Integer, Integer, Integer> LJ() {
        if (LJJIFFI()) {
            return new C443120HZe<>(Integer.valueOf(this.LJJIII), Integer.valueOf(this.LJJIIJ), this.LJJIIJZLJL);
        }
        return null;
    }

    @Override // X.InterfaceC710220RtU
    public final Pair<Integer, Integer> LJIILL() {
        if (LJJIFFI()) {
            return new Pair<>(Integer.valueOf(this.LJJIFFI), Integer.valueOf(this.LJJII));
        }
        return null;
    }

    @Override // X.InterfaceC710220RtU
    public final boolean LJIJJ() {
        return LJJIFFI();
    }

    @Override // X.InterfaceC710220RtU
    public final Pair<Integer, Drawable> LJJII() {
        if (LJJIFFI()) {
            return new Pair<>(Integer.valueOf(this.LJJIIZ), this.LJJIIZI);
        }
        return null;
    }

    @Override // X.InterfaceC710220RtU
    public final boolean LJJIIJ() {
        if (!LJIIL()) {
            return false;
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        return !C586380MzE.LIZ().LIZJ(this.LJII);
    }

    @Override // X.InterfaceC710220RtU
    public final boolean LJIILJJIL() {
        return this.LJJJLIIL;
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIL() {
        LJJIJIL();
    }

    @Override // X.InterfaceC710220RtU
    public final boolean LJJIJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC710220RtU
    public final boolean isEnable() {
        return this.LJJJJZI;
    }

    public C719660SKu(Context context) {
        this.LIZ = context;
        C721640SSk c721640SSk = C721640SSk.LIZ;
        if (context == null) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null) {
                context = abstractC1387200mCcLJ.LIZIZ();
            } else {
                context = null;
            }
        }
        int i = LJLZ;
        c721640SSk.getClass();
        this.LJJJJIZL = C721640SSk.LJIIIZ(i, context);
        this.LJJJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1370));
        this.LJJL = C0SKM.LJIIIIZZ().pagerAnchorType;
        this.LJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(344));
        C844470XAv.LIZ.getClass();
        this.LJJLIIIIJ = C11VU.LIZLLL(C844470XAv.LIZ());
        this.LJJLIIIJILLIZJL = (int) (((double) LJJJJ()) * 0.04d);
        this.LJLIIL = LJLLILLLL;
    }

    @Override // X.InterfaceC710220RtU
    public final void LJFF(String str) {
        if (this.LJJJJZI && Intrinsics.LJFF(this.LIZJ, str)) {
            this.LJJLIIJ = true;
            LJJJJL(300L, true);
        }
    }

    @Override // X.InterfaceC710220RtU
    public final void LJI(InterfaceC694230RKz interfaceC694230RKz) {
        ((Set) this.LJJJ.getValue()).remove(interfaceC694230RKz);
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIIIZ(String str) {
        InterfaceC719700SKy interfaceC719700SKy;
        if (Intrinsics.LJFF(this.LIZJ, str) && this.LJJJJZI && (interfaceC719700SKy = this.LJJZ) != null) {
            interfaceC719700SKy.LJIIIZ(this.LJJZZIII, this.LJL);
        }
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIIJ(C1331670kl3 c1331670kl3) {
        C1331730kl9 c1331730kl9;
        if (this.LJJJLIIL) {
            C1331750klB c1331750klB = new C1331750klB();
            int i = this.LJJIJL;
            float f = LJLLI;
            c1331750klB.LIZJ = i;
            c1331750klB.LIZIZ = f;
            c1331750klB.LJII = EnumC1203020hPY.OVERLAY_COLOR;
            c1331730kl9 = new C1331730kl9(c1331750klB);
        } else {
            c1331730kl9 = null;
        }
        c1331670kl3.LJJI = c1331730kl9;
        c1331670kl3.LJJLIIIJL = true;
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIIJJI(View view) {
        if (!this.LJJJLIIL && view != null) {
            view.setOutlineProvider(null);
        }
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIILLIIL(View view) {
        int i;
        if (!this.LJJJJZI) {
            return;
        }
        this.LJJJJZ = view;
        if (view instanceof C705790RmL) {
            ((AbstractC705690RmB) view).LJJIFFI(this);
        } else if (view != null) {
            LJJJLZIJ(view, null);
            if (C0SKM.LJIIIIZZ().enableCtaAdapt) {
                ViewOnLayoutChangeListenerC738720SyM viewOnLayoutChangeListenerC738720SyM = this.LJLJLLL;
                if (viewOnLayoutChangeListenerC738720SyM == null) {
                    this.LJLJLLL = new ViewOnLayoutChangeListenerC738720SyM(view, this, 1);
                } else {
                    view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC738720SyM);
                }
                view.addOnLayoutChangeListener(this.LJLJLLL);
            }
        }
        if (LJJJJIZL()) {
            i = LJLLLLLL;
        } else {
            C720110SMn c720110SMn = this.LJIILIIL;
            if (c720110SMn != null && c720110SMn.LJIIIIZZ) {
                i = LJLLLL;
            } else {
                i = 0;
            }
        }
        this.LJJJJLL = i + LJLLL;
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIJI(InterfaceC694230RKz interfaceC694230RKz) {
        ((Set) this.LJJJ.getValue()).add(interfaceC694230RKz);
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIJJLI(View view) {
        AbstractC705690RmB abstractC705690RmB;
        if ((view instanceof C705790RmL) && (abstractC705690RmB = (AbstractC705690RmB) view) != null) {
            abstractC705690RmB.LJJIFFI(this);
        }
    }

    @Override // X.InterfaceC710220RtU
    public final void LJJIII(String str) {
        int i;
        if (this.LJJJJZI && Intrinsics.LJFF(this.LIZJ, str)) {
            if (this.LJJJJZI) {
                i = 0;
            } else {
                i = LJLLJ;
            }
            LJJJLIIL(i);
        }
    }

    @Override // X.C0SLU
    public final void LJJIIZ(String str) {
        View view;
        int y;
        int i;
        int i2;
        if (Intrinsics.LJFF(this.LIZJ, str) && (view = this.LJLJJL) != null && this.LJJLIIIJLLLLLLLZ > 0 && (y = (int) view.getY()) > 0 && y < (i = this.LJJLIIIJLLLLLLLZ) && (i2 = this.LJJLIIIJLJLI) > i - y) {
            int i3 = i2 - (i - y);
            this.LJJLIIIJLJLI = i3;
            LJJJZ(i3);
        }
    }

    public final void LJJIJIIJIL(int i) {
        View viewLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        InterfaceC719700SKy interfaceC719700SKy = this.LJJZ;
        if (interfaceC719700SKy != null && (viewLIZIZ = interfaceC719700SKy.LIZIZ()) != null) {
            ViewGroup.LayoutParams layoutParams = viewLIZIZ.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (numValueOf = Integer.valueOf(marginLayoutParams.bottomMargin)) != null && numValueOf.intValue() != i) {
                this.LJLJI = viewLIZIZ;
                this.LJLJJI = numValueOf.intValue();
                marginLayoutParams.bottomMargin = i;
                C786410Ut5.W5(viewLIZIZ, marginLayoutParams);
            }
        }
    }

    public final C0SN0 LJJJ(int i) {
        float fFloatValue;
        Float f;
        String str = this.LIZJ;
        PhotoModeImage photoModeImage = null;
        if (str == null) {
            return null;
        }
        List<PhotoModeImage> list = this.LJIIZILJ;
        if (list != null) {
            list.size();
        }
        FeedContentLayoutInfo feedContentLayoutInfoLJJIZ = LJJIZ();
        boolean z = this.LJIIJJI;
        List<PhotoModeImage> list2 = this.LJIIZILJ;
        if (list2 != null) {
            photoModeImage = (PhotoModeImage) C13LP.LJJJLZIJ(i, list2);
        }
        PhotoModeImage photoModeImage2 = this.LJIJI;
        PhotoModeImage photoModeImage3 = this.LJIJJ;
        String str2 = this.LJII;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        boolean zLIZJ = C0SKN.LIZJ(this.LJIIIZ, true, this.LJIIJ, this.LJIIJJI, this.LJIIL, str2);
        String str4 = this.LJII;
        if (str4 != null) {
            str3 = str4;
        }
        boolean z2 = this.LJIIJ;
        boolean z3 = this.LJIIJJI;
        boolean z4 = this.LJIIL;
        boolean z5 = this.LJIIIZ;
        int i2 = feedContentLayoutInfoLJJIZ.titleLines;
        int i3 = feedContentLayoutInfoLJJIZ.descriptionLines;
        PhotoModeImage photoModeImage4 = this.LJIJJ;
        if (photoModeImage4 != null && (f = photoModeImage4.aspectRatio) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        return new C0SN0(str, z, i, photoModeImage, list2, photoModeImage2, photoModeImage3, zLIZJ, C0SKN.LIZLLL(i2, i3, Float.valueOf(fFloatValue), str3, z2, true, z3, z4, z5), this.LJII);
    }

    public final C0SL3 LJJJI(int i) {
        PhotoModeImage photoModeImage;
        float fFloatValue;
        List<PhotoModeImage> list = this.LJIIZILJ;
        if (list != null && (photoModeImage = (PhotoModeImage) C13LP.LJJJLZIJ(i, list)) != null) {
            this.LJIJ = photoModeImage;
            String str = this.LIZJ;
            if (str == null) {
                return null;
            }
            Float f = photoModeImage.aspectRatio;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C720210SMx c720210SMx = C0SMY.LIZ;
            C0SL3 c0sl3LJ = C0SMY.LJ(fFloatValue, str, this.LJII);
            if (c0sl3LJ != null) {
                return c0sl3LJ;
            }
            int iLJJJJI = this.LJJI;
            if (iLJJJJI <= 0) {
                iLJJJJI = (this.LJJLIIIIJ - LLD) + LJJJJI();
            }
            int iLJJJIL = LJJJIL();
            FeedContentLayoutInfo feedContentLayoutInfoLJJIZ = LJJIZ();
            int i2 = photoModeImage.width;
            int i3 = photoModeImage.height;
            if (i2 > 0 && i3 > 0 && fFloatValue > 0.0f && iLJJJIL > 0 && iLJJJJI > 0) {
                return C0SMY.LJFF(feedContentLayoutInfoLJJIZ, i2, i3, iLJJJIL, iLJJJJI, this.LJJJJIZL, LJJJJI(), LJJJ(i));
            }
        }
        return null;
    }

    public final void LJJJJJL(boolean z) {
        C719880SLq c719880SLq;
        View view;
        View view2;
        this.LJIILLIIL = z;
        if (this.LJJJLIIL && this.LJIIJJI) {
            C21600219g8 c21600219g8 = this.LJJZZI;
            PagerAdapter adapter = null;
            if (c21600219g8 != null) {
                adapter = c21600219g8.getAdapter();
            }
            if ((adapter instanceof C719880SLq) && (c719880SLq = (C719880SLq) adapter) != null) {
                PhotosViewHolderV3 photosViewHolderV3LJJJJJ = c719880SLq.LJJJJJ(0);
                if (photosViewHolderV3LJJJJJ != null && (view2 = photosViewHolderV3LJJJJJ.LL) != null) {
                    C786410Ut5.Jc(view2, 0.0f);
                }
                PhotosViewHolderV3 photosViewHolderV3LJJJJJ2 = c719880SLq.LJJJJJ(1);
                if (photosViewHolderV3LJJJJJ2 != null && (view = photosViewHolderV3LJJJJJ2.LL) != null) {
                    C786410Ut5.Jc(view, LJLLJ);
                }
            }
            C21600219g8 c21600219g82 = this.LJJZZI;
            if (c21600219g82 != null) {
                c21600219g82.setScrollX(0);
            }
        }
        if (!z) {
            this.LJJJJLL = 0;
            return;
        }
        LJJJJL(1000L, true);
        this.LJLJJLL = Long.valueOf(SystemClock.elapsedRealtime());
        this.LJLJL = 0;
    }

    public final void LJJJJZI(String str) {
        String str2;
        if (str != null && !Intrinsics.LJFF(str, this.LIZJ) && (str2 = this.LIZJ) != null) {
            this.LIZLLL = str2;
        }
        this.LIZJ = str;
    }

    public final void LJJJLIIL(int i) {
        View viewLJI;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        InterfaceC719700SKy interfaceC719700SKy = this.LJJZ;
        if (interfaceC719700SKy != null && (viewLJI = interfaceC719700SKy.LJI()) != null) {
            ViewGroup.LayoutParams layoutParams = viewLJI.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (numValueOf = Integer.valueOf(marginLayoutParams.bottomMargin)) != null && numValueOf.intValue() != i) {
                marginLayoutParams.bottomMargin = i;
                C786410Ut5.W5(viewLJI, marginLayoutParams);
            }
        }
    }

    public final boolean LJJJZ(int i) {
        if (i < 0) {
            return false;
        }
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            BPEAHandler bPEAHandler = this.LJJLIL;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS22S0101000_11(i, this, 6));
                return true;
            }
            return true;
        }
        InterfaceC719700SKy interfaceC719700SKy = this.LJJZ;
        if (interfaceC719700SKy == null) {
            return true;
        }
        interfaceC719700SKy.LIZJ(i);
        return true;
    }

    @Override // X.InterfaceC710220RtU
    public final void LIZ(int i, int i2) {
        this.LJJ = i;
        this.LJJI = i2;
    }

    @Override // X.InterfaceC719740SLc
    public final int LIZIZ(int i, int i2) {
        C21600219g8 c21600219g8;
        PagerAdapter adapter;
        if (this.LJJJLIIL) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (!C586380MzE.LIZ().LIZJ(this.LJII) && (c21600219g8 = this.LJJZZI) != null && (adapter = c21600219g8.getAdapter()) != null && adapter.getCount() > 1 && i != 0 && i != adapter.getCount() - 1) {
                return i2 - this.LJJLIIIJ;
            }
            return i2;
        }
        return i2;
    }

    @Override // X.InterfaceC719740SLc
    public final C0WIY<Float, Float> LIZJ(float f, float f2) {
        PagerAdapter adapter;
        if (this.LJJJLIIL && this.LJJL != 1) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (!C586380MzE.LIZ().LIZJ(this.LJII)) {
                C21600219g8 c21600219g8 = this.LJJZZI;
                if (c21600219g8 != null && (adapter = c21600219g8.getAdapter()) != null && adapter.getCount() > 1) {
                    float f3 = this.LJJLIIIJJI;
                    if (f3 > 0.0f && f2 > f3) {
                        return new C0WIY<>(Float.valueOf(f), Float.valueOf(f2 - this.LJJLIIIJJI));
                    }
                }
                return new C0WIY<>(Float.valueOf(f), Float.valueOf(f2));
            }
        }
        return new C0WIY<>(Float.valueOf(f), Float.valueOf(f2));
    }

    @Override // X.InterfaceC710220RtU
    public final void LIZLLL(View view, String str) {
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.LJJJJZI && Intrinsics.LJFF(str, this.LIZJ)) {
            ViewParent parent = null;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                this.LJJJJ = viewGroup;
                int iIntValue = LLFF.getValue().intValue();
                if (iIntValue <= 0) {
                    View view2 = this.LJJJJI;
                    if (view2 != null) {
                        parent = view2.getParent();
                    }
                    if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(this.LJJJJI, viewGroup3);
                        return;
                    }
                    return;
                }
                Context context = this.LIZ;
                if (context == null) {
                    return;
                }
                View view3 = this.LJJJJI;
                if (view3 == null) {
                    this.LJJJJI = new View(context);
                    View view4 = this.LJJJJI;
                    if (view4 != null) {
                        C786410Ut5.W5(view4, new ViewGroup.LayoutParams(1, iIntValue));
                    }
                    viewGroup.addView(this.LJJJJI, 0);
                    return;
                }
                if (!Intrinsics.LJFF(view3.getParent(), viewGroup)) {
                    View view5 = this.LJJJJI;
                    if (view5 != null) {
                        parent = view5.getParent();
                    }
                    if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(this.LJJJJI, viewGroup2);
                    }
                    View view6 = this.LJJJJI;
                    if (view6 != null && (layoutParams2 = view6.getLayoutParams()) != null) {
                        layoutParams2.height = iIntValue;
                    }
                    viewGroup.addView(this.LJJJJI, 0);
                    return;
                }
                View view7 = this.LJJJJI;
                if (view7 == null || (layoutParams = view7.getLayoutParams()) == null) {
                    return;
                }
                layoutParams.height = iIntValue;
            }
        }
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIIIIZZ(View view, String str) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (Intrinsics.LJFF(this.LIZJ, str) && this.LJJJJZI) {
            C720210SMx c720210SMx = C0SMY.LIZ;
            FeedContentLayoutInfo feedContentLayoutInfoLIZLLL = C0SMY.LIZLLL(str, this.LJII);
            if (feedContentLayoutInfoLIZLLL != null) {
                i = feedContentLayoutInfoLIZLLL.bottom;
            } else {
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                C786410Ut5.W5(view, marginLayoutParams);
            }
            this.LJLILLLLZI = view;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0160, code lost:
    
        if (r3 >= (-X.C719660SKu.LJLLILLLL)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0163, code lost:
    
        if (r3 >= (-5)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0165, code lost:
    
        r11.LJJJJJL = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x016e, code lost:
    
        if (LJJJZ(r11.LJJLIIIJL - r3) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0170, code lost:
    
        r11.LJLJLJ = true;
        r11.LJJLIIIJLJLI = r11.LJJLIIIJL - r3;
        r11.LJJLIIIJLLLLLLLZ = r4 + r3;
        r11.LJLJL++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0180, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0181, code lost:
    
        r11.LJJLIIIJLLLLLLLZ = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0183, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d7, code lost:
    
        if (r3 > 5) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c A[PHI: r8
      0x013c: PHI (r8v4 int) = (r8v2 int), (r8v8 int) binds: [B:102:0x0135, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    @Override // X.C0SLU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719660SKu.LJIILIIL(java.lang.String, boolean):boolean");
    }

    public final void LJJIJL(FeedContentLayoutInfo feedContentLayoutInfo, int i) {
        if (i <= 0) {
            C720210SMx c720210SMx = C0SMY.LIZ;
            C0SMY.LJIIIZ(this.LIZJ, this.LJII, null, null, AFwS243S0000000_11.get$arr$(616));
            return;
        }
        C118300cf c118300cf = new C118300cf();
        int i2 = feedContentLayoutInfo.descLineH;
        int i3 = feedContentLayoutInfo.descriptionLines;
        if (i3 > 1) {
            int i4 = 0;
            do {
                int i5 = c118300cf.element;
                if (i5 >= i3) {
                    break;
                }
                c118300cf.element = i5 + 1;
                i4 += i2;
            } while (i4 < i);
            int i6 = c118300cf.element;
            int i7 = i3 - 1;
            if (i6 > i7) {
                i6 = i7;
            }
            c118300cf.element = i6;
            if (1 <= i6 && i6 < i3) {
                C720210SMx c720210SMx2 = C0SMY.LIZ;
                C0SMY.LJIIIZ(this.LIZJ, this.LJII, null, null, new AwS119S0101000_11(i3, c118300cf, 3));
                this.LJLJLJ = false;
                InterfaceC719700SKy interfaceC719700SKy = this.LJJZ;
                if (interfaceC719700SKy != null) {
                    interfaceC719700SKy.E8();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r11v14, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r11v9, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r12v14, types: [T, android.widget.ImageView$ScaleType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r13v13, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, android.widget.ImageView$ScaleType] */
    /* JADX WARN: Type inference failed for: r13v5, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r13v7, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r14v10, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r14v7, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r15v9, types: [T, android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, android.graphics.Rect] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIJLIJ(com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo r36, int r37) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719660SKu.LJJIJLIJ(com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJ(kotlin.jvm.functions.Function1 r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719660SKu.LJJJJJ(kotlin.jvm.functions.Function1, boolean):void");
    }

    public final void LJJJJL(long j, boolean z) {
        if (z) {
            C0SL2 c0sl2 = this.LJJLJLI;
            if (c0sl2 != null) {
                BPEAHandler bPEAHandler = this.LJJLIL;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacks(c0sl2);
                }
            } else {
                c0sl2 = new C0SL2(this);
                this.LJJLJLI = c0sl2;
            }
            c0sl2.LLILLL = true;
            c0sl2.LLILLJJLI = this.LIZJ;
            BPEAHandler bPEAHandler2 = this.LJJLIL;
            if (bPEAHandler2 != null) {
                C786410Ut5.LJLIIL(j, bPEAHandler2, c0sl2);
                return;
            }
            return;
        }
        C0SL2 c0sl22 = this.LJJLJ;
        if (c0sl22 != null) {
            BPEAHandler bPEAHandler3 = this.LJJLIL;
            if (bPEAHandler3 != null) {
                bPEAHandler3.removeCallbacks(c0sl22);
            }
        } else {
            c0sl22 = new C0SL2(this);
            this.LJJLJ = c0sl22;
        }
        c0sl22.LLILLL = false;
        c0sl22.LLILLJJLI = this.LIZJ;
        BPEAHandler bPEAHandler4 = this.LJJLIL;
        if (bPEAHandler4 != null) {
            C786410Ut5.LJLIIL(j, bPEAHandler4, c0sl22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ(android.view.View r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719660SKu.LJJJLZIJ(android.view.View, android.view.View):void");
    }

    @Override // X.InterfaceC705580Rm0
    public final void LJIIZILJ(View view, View view2, String str) {
        if (!Intrinsics.LJFF(this.LIZJ, str)) {
            return;
        }
        LJJJLZIJ(view, view2);
    }

    @Override // X.InterfaceC705580Rm0
    public final void LJJ(View view, View view2, String str) {
        if (!Intrinsics.LJFF(this.LIZJ, str)) {
            return;
        }
        LJJJLZIJ(view, view2);
    }

    @Override // X.InterfaceC710220RtU
    public final boolean LJJIIZI(int i, String str, boolean z) {
        if (this.LJJJLL) {
            if (z) {
                int i2 = this.LJJLIIIJLJLI;
                if (i2 == 0) {
                    C720210SMx c720210SMx = C0SMY.LIZ;
                    FeedContentLayoutInfo feedContentLayoutInfoLIZLLL = C0SMY.LIZLLL(str, this.LJII);
                    if (feedContentLayoutInfoLIZLLL != null) {
                        i2 = feedContentLayoutInfoLIZLLL.bottom;
                    } else {
                        i2 = 0;
                    }
                }
                if (i2 > i) {
                    LJJIJIIJIL(i);
                }
                if (i2 < i) {
                    return true;
                }
                return false;
            }
            LJJJJLI();
            return true;
        }
        if (this.LJJJLIIL) {
            if (z) {
                if (this.LJJJJLI != i) {
                    this.LJFF = str;
                    int i3 = this.LJJLIIIJLJLI;
                    if (i3 == 0) {
                        C720210SMx c720210SMx2 = C0SMY.LIZ;
                        FeedContentLayoutInfo feedContentLayoutInfoLIZLLL2 = C0SMY.LIZLLL(str, this.LJII);
                        if (feedContentLayoutInfoLIZLLL2 != null) {
                            i3 = feedContentLayoutInfoLIZLLL2.bottom;
                        } else {
                            i3 = 0;
                        }
                    }
                    int i4 = i - i3;
                    if (i4 > 0) {
                        this.LJJJJLI = i;
                        this.LJJJJL = i4;
                        FeedContentLayoutInfo feedContentLayoutInfoLJJIZ = LJJIZ();
                        FeedContentLayoutInfo feedContentLayoutInfo = feedContentLayoutInfoLJJIZ.initLayoutInfo;
                        if (feedContentLayoutInfo != null) {
                            feedContentLayoutInfoLJJIZ = feedContentLayoutInfo;
                        }
                        int i5 = this.LJJJJL;
                        LJJIJL(feedContentLayoutInfoLJJIZ, i5 - LJJIJLIJ(feedContentLayoutInfoLJJIZ, i5));
                        return true;
                    }
                    LJJIJIIJIL(i);
                    return false;
                }
            } else if (Intrinsics.LJFF(this.LJFF, str)) {
                this.LJFF = null;
                this.LJJJJLI = 0;
                this.LJJJJL = 0;
                LJJJJLI();
                if (this.LJJJJLL > 0) {
                    FeedContentLayoutInfo feedContentLayoutInfoLJJIZ2 = LJJIZ();
                    FeedContentLayoutInfo feedContentLayoutInfo2 = feedContentLayoutInfoLJJIZ2.initLayoutInfo;
                    if (feedContentLayoutInfo2 != null) {
                        feedContentLayoutInfoLJJIZ2 = feedContentLayoutInfo2;
                    }
                    Integer num = this.LJJJJJL;
                    if (num != null && num.intValue() > 0) {
                        LJJIJL(feedContentLayoutInfoLJJIZ2, num.intValue() - LJJIJLIJ(feedContentLayoutInfoLJJIZ2, num.intValue()));
                        return true;
                    }
                    if (this.LJJLIIIJLLLLLLLZ > 0) {
                        LJJJJLL();
                        return true;
                    }
                    LJJIJL(feedContentLayoutInfoLJJIZ2, this.LJJJJLL - LJJIJLIJ(feedContentLayoutInfoLJJIZ2, this.LJJJJLL));
                } else {
                    this.LJLJLJ = false;
                    LJJJJLL();
                    C720210SMx c720210SMx3 = C0SMY.LIZ;
                    FeedContentLayoutInfo feedContentLayoutInfoLIZLLL3 = C0SMY.LIZLLL(this.LIZJ, this.LJII);
                    if (feedContentLayoutInfoLIZLLL3 != null) {
                        FeedContentLayoutInfo feedContentLayoutInfo3 = feedContentLayoutInfoLIZLLL3.initLayoutInfo;
                        if (feedContentLayoutInfo3 == null) {
                            feedContentLayoutInfo3 = feedContentLayoutInfoLIZLLL3;
                        }
                        if (feedContentLayoutInfoLIZLLL3.totalHeight == feedContentLayoutInfo3.totalHeight && feedContentLayoutInfoLIZLLL3.descriptionLines == feedContentLayoutInfo3.descriptionLines) {
                            return true;
                        }
                        C0SMY.LJIIIZ(this.LIZJ, this.LJII, null, null, new AwS590S0100000_11(feedContentLayoutInfo3, 393));
                        InterfaceC719700SKy interfaceC719700SKy = this.LJJZ;
                        if (interfaceC719700SKy != null) {
                            interfaceC719700SKy.E8();
                            return true;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void LJJJLL(int i, int i2, boolean z) {
        C21600219g8 c21600219g8;
        if (z && i > 0) {
            C21600219g8 c21600219g82 = this.LJJZZI;
            if (c21600219g82 != null) {
                c21600219g82.setClipToPadding(false);
            }
            C21600219g8 c21600219g83 = this.LJJZZI;
            if (c21600219g83 != null) {
                c21600219g83.setPadding(LLFFF, 0, i, 0);
            }
            C21600219g8 c21600219g84 = this.LJJZZI;
            if (c21600219g84 != null) {
                c21600219g84.LJJIJIIJIL(new InterfaceC19471211Fu() { // from class: X.0SLL
                    @Override // X.InterfaceC19471211Fu
                    public final void LIZ(View view, float f) {
                        C786410Ut5.Jc(view, C719660SKu.LJLLJ * f);
                    }
                });
            }
            this.LJJLIIIJ = i2;
            C21600219g8 c21600219g85 = this.LJJZZI;
            if (c21600219g85 != null) {
                c21600219g85.setPageChangeExtOffset(0.35f);
            }
            float f = C0SKM.LJIIIIZZ().flingValue;
            if (f >= 0.0f && (c21600219g8 = this.LJJZZI) != null) {
                c21600219g8.setPageFlingVelocity(f);
            }
            C21600219g8 c21600219g86 = this.LJJZZI;
            if (c21600219g86 != null) {
                c21600219g86.setOnPageScrollTriggerListener(this);
                return;
            }
            return;
        }
        this.LJJLIIIJJI = 0.0f;
        this.LJJLIIIJJIZ = 0;
        C21600219g8 c21600219g87 = this.LJJZZI;
        if (c21600219g87 != null) {
            c21600219g87.setClipToPadding(true);
        }
        C21600219g8 c21600219g88 = this.LJJZZI;
        if (c21600219g88 != null) {
            c21600219g88.setPadding(0, 0, 0, 0);
        }
        C21600219g8 c21600219g89 = this.LJJZZI;
        if (c21600219g89 != null) {
            c21600219g89.LJJIJIIJIL(new InterfaceC19471211Fu() { // from class: X.0SLP
                @Override // X.InterfaceC19471211Fu
                public final void LIZ(View view, float f2) {
                    C786410Ut5.Jc(view, 0.0f);
                }
            });
        }
        C21600219g8 c21600219g810 = this.LJJZZI;
        if (c21600219g810 != null) {
            c21600219g810.setPageChangeExtOffset(0.0f);
        }
        C21600219g8 c21600219g811 = this.LJJZZI;
        if (c21600219g811 != null) {
            c21600219g811.setPageFlingVelocity(-1.0f);
        }
        this.LJJLIIIJ = 0;
        C21600219g8 c21600219g812 = this.LJJZZI;
        if (c21600219g812 == null) {
            return;
        }
        c21600219g812.setOnPageScrollTriggerListener(null);
    }

    @Override // X.InterfaceC710220RtU
    public final void LLJJIJIL(Function0 function0, boolean z, boolean z2) {
        int size;
        if (C0SKM.LJII() && this.LJJJLIIL) {
            int i = 0;
            if (z) {
                this.LJI = true;
            } else {
                this.LJI = false;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            List<PhotoModeImage> list = this.LJIIZILJ;
            if (list != null && (size = list.size()) > 0) {
                do {
                    InterfaceC719700SKy interfaceC719700SKy = this.LJJZ;
                    if (interfaceC719700SKy != null) {
                        interfaceC719700SKy.LJFF(i, z, z2);
                    }
                    i++;
                } while (i < size);
            }
        }
    }

    @Override // X.InterfaceC710220RtU
    public final FeedContentLayoutInfo LJII(String str, FeedContentLayoutInfo feedContentLayoutInfo, C0S5S c0s5s, C0S5R c0s5r) {
        if (!Intrinsics.LJFF(this.LIZJ, str)) {
            return feedContentLayoutInfo;
        }
        C720210SMx c720210SMx = C0SMY.LIZ;
        FeedContentLayoutInfo feedContentLayoutInfoLJIIIZ = C0SMY.LJIIIZ(str, this.LJII, c0s5s, c0s5r, new C719690SKx(this));
        if (feedContentLayoutInfoLJIIIZ != null) {
            return feedContentLayoutInfoLJIIIZ;
        }
        return feedContentLayoutInfo;
    }

    @Override // X.InterfaceC710220RtU
    public final void LJJI(View view, View view2, View view3, View.OnTouchListener onTouchListener) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!this.LJJJJZI) {
            if (view != null) {
                view.setOutlineProvider(null);
            }
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
                view2.setOnTouchListener(null);
                return;
            }
            return;
        }
        if (!this.LJJJLIIL) {
            if (view != null) {
                view.setOutlineProvider(null);
            }
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                view2.setOnTouchListener(onTouchListener);
            }
            if (view != null) {
                view.setBackground(null);
            }
            if (view3 instanceof C426320Gne) {
                C426320Gne c426320Gne = (C426320Gne) view3;
                ViewGroup.LayoutParams layoutParams = c426320Gne.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    if (marginLayoutParams.width != LL) {
                        marginLayoutParams.width = LL;
                        marginLayoutParams.height = LL;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426320Gne);
                        c426320Gne.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426320Gne);
                    c426320Gne.setLayoutParams(marginLayoutParams);
                }
                c426320Gne.setAboveColor(this.LJJIL);
                c426320Gne.setUnderColor(this.LJJIZ);
                return;
            }
            return;
        }
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
            view2.setOnTouchListener(onTouchListener);
        }
        if (view != null) {
            view.setBackgroundColor(this.LJJIJLIJ);
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (C586380MzE.LIZ().LIZJ(this.LJII)) {
            if (view != null) {
                view.setOutlineProvider(null);
            }
        } else if (view != null) {
            view.setOutlineProvider(LLFZ.getValue());
            view.setClipToOutline(true);
        }
        if (!(view3 instanceof C426320Gne)) {
            return;
        }
        C426320Gne c426320Gne2 = (C426320Gne) view3;
        ViewGroup.LayoutParams layoutParams2 = c426320Gne2.getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            if (marginLayoutParams.width != LJZL) {
                marginLayoutParams.width = LJZL;
                marginLayoutParams.height = LJZL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426320Gne2);
                c426320Gne2.setLayoutParams(marginLayoutParams);
            }
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426320Gne2);
            c426320Gne2.setLayoutParams(marginLayoutParams);
        }
        c426320Gne2.setAboveColor(this.LJJIL);
        c426320Gne2.setUnderColor(this.LJJIZ);
    }

    @Override // X.InterfaceC710220RtU
    public final void LJIJ(View view, int i, int i2, int i3, int i4) {
        if (this.LJJJJZI) {
            if (i2 == i4 && i == i3) {
                return;
            }
            this.LJLJJL = view;
            LJJJJL(300L, false);
        }
    }
}
