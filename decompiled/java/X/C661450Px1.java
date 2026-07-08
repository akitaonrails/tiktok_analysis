package X;

import X.C640750PBh;
import X.C650630PfZ;
import X.EnumC651030PgD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchphoto.core.ui.SearchPhotoForLynx$ability$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Px1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661450Px1 extends C661440Px0 {
    public volatile boolean LLLLIIL;
    public final boolean LLLLIILL;
    public final C01GW LLLLIILLL;
    public final C01GW LLLLIL;
    public boolean LLLLILI;
    public final C01GW LLLLJ;
    public final SearchPhotoForLynx$ability$1 LLLLJI;
    public InterfaceC665370Q7z LLLLL;

    @Override // X.C661440Px0, X.InterfaceC661680PxO, X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        Aweme aweme;
        UC(2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playMedia(), aid: ");
        C661490Px5 dataProvider = getDataProvider();
        sbLIZ.append((dataProvider == null || (aweme = dataProvider.LIZJ) == null) ? null : aweme.getAid());
        sbLIZ.append(", isPlaying: ");
        sbLIZ.append(this.LLLLIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        LJJIJ();
    }

    private final C661530Px9 getKeyframeListener() {
        return (C661530Px9) this.LLLLJ.getValue();
    }

    private final C661480Px4 getPhotoMob() {
        return (C661480Px4) this.LLLLIL.getValue();
    }

    public final void LJJIIZ() {
        InterfaceC661560PxC photoSlide;
        C661550PxB c661550PxBLJ;
        Aweme aweme;
        if (this.LLLLIIL || isPlaying()) {
            InterfaceC661560PxC photoSlide2 = getPhotoSlide();
            if (photoSlide2 != null) {
                Integer numValueOf = Integer.valueOf(photoSlide2.LIZJ());
                if (numValueOf.intValue() >= 0) {
                    String aid = null;
                    if (1 != 0) {
                        int iIntValue = numValueOf.intValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pausePhoto, aid: ");
                        C661490Px5 dataProvider = getDataProvider();
                        if (dataProvider != null && (aweme = dataProvider.LIZJ) != null) {
                            aid = aweme.getAid();
                        }
                        sbLIZ.append(aid);
                        sbLIZ.append(", position: ");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(", isAttached: ");
                        sbLIZ.append(isAttachedToWindow());
                        C2188811AlT.LIZIZ(sbLIZ);
                        C661490Px5 dataProvider2 = getDataProvider();
                        if (dataProvider2 != null && (c661550PxBLJ = dataProvider2.LJ()) != null) {
                            c661550PxBLJ.LJ = iIntValue;
                        }
                    }
                }
            }
            this.LLLLIIL = false;
            if (!isAttachedToWindow() && (photoSlide = getPhotoSlide()) != null) {
                photoSlide.onCleared();
            }
            getPhotoMob().LJJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ() {
        /*
            r8 = this;
            boolean r0 = r8.LLLLIIL
            if (r0 == 0) goto L5
            return
        L5:
            r3 = 1
            r8.LLLLIIL = r3
            X.0PxC r0 = r8.getPhotoSlide()
            r7 = 0
            if (r0 == 0) goto Lad
            int r5 = r0.LJIILJJIL()
        L13:
            int r4 = r8.getKeyframePhotoIndex()
            if (r4 < 0) goto Laa
            boolean r0 = X.C1111604Wk.LIZ()
            if (r0 == 0) goto Laa
            if (r4 <= 0) goto Laa
            r2 = 1
        L22:
            X.0Px5 r0 = r8.getDataProvider()
            r6 = 0
            if (r0 == 0) goto La4
            X.0PxB r0 = r0.LJ()
            if (r0 == 0) goto La4
            int r0 = r0.LJ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 < 0) goto La4
            int r2 = r1.intValue()
        L3f:
            if (r4 < 0) goto L93
            int r0 = r5 + (-1)
            if (r4 != r0) goto L93
            if (r2 != r4) goto L93
            boolean r0 = X.C1111604Wk.LIZ()
            if (r0 == 0) goto L93
            r3 = 0
        L4e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "playPhoto: aid="
            r1.append(r0)
            X.0Px5 r0 = r8.getDataProvider()
            if (r0 == 0) goto L65
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZJ
            if (r0 == 0) goto L65
            java.lang.String r6 = r0.getAid()
        L65:
            r1.append(r6)
            java.lang.String r0 = ", lastPosition="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", photoCount="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", keyframeIndex="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", shouldAutoScroll="
            r1.append(r0)
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            X.0Px4 r0 = r8.getPhotoMob()
            r0.LJJ(r8)
            return
        L93:
            X.0PxC r1 = r8.getPhotoSlide()
            if (r1 == 0) goto L4e
            if (r2 < 0) goto L9c
            r7 = r2
        L9c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.LJIIIIZZ(r0)
            goto L4e
        La4:
            if (r2 == 0) goto La8
            r2 = r4
            goto L3f
        La8:
            r2 = 0
            goto L3f
        Laa:
            r2 = 0
            goto L22
        Lad:
            r5 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661450Px1.LJJIJ():void");
    }

    public final InterfaceC661560PxC getPhotoSlide() {
        return (InterfaceC661560PxC) this.LLLLIILLL.getValue();
    }

    @Override // X.C661440Px0, X.C0PML
    public final void LJFF() {
        C661550PxB c661550PxBLJ;
        C661490Px5 dataProvider = getDataProvider();
        if (dataProvider != null && (c661550PxBLJ = dataProvider.LJ()) != null) {
            c661550PxBLJ.LJ = getPosition();
        }
        super.LJFF();
        C1012040cRW c1012040cRWLIZIZ = C1012040cRW.LIZIZ();
        c1012040cRWLIZIZ.LJFF = true;
        c1012040cRWLIZIZ.LJIIL = getPosition();
    }

    @Override // X.C661440Px0
    public final void LJIIZILJ() {
        Aweme aweme;
        super.LJIIZILJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause, aid: ");
        C661490Px5 dataProvider = getDataProvider();
        sbLIZ.append((dataProvider == null || (aweme = dataProvider.LIZJ) == null) ? null : aweme.getAid());
        sbLIZ.append(", isPlaying flag: ");
        sbLIZ.append(this.LLLLIIL);
        sbLIZ.append(", isPlaying func: ");
        sbLIZ.append(isPlaying());
        C2188811AlT.LIZIZ(sbLIZ);
        LJJIIZ();
    }

    @Override // X.C661440Px0
    public final void LJIJI() {
        Aweme aweme;
        super.LJIJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play, aid: ");
        C661490Px5 dataProvider = getDataProvider();
        sbLIZ.append((dataProvider == null || (aweme = dataProvider.LIZJ) == null) ? null : aweme.getAid());
        sbLIZ.append(", isPlaying: ");
        sbLIZ.append(this.LLLLIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        LJJIJ();
    }

    @Override // X.C661440Px0, X.InterfaceC661680PxO, X.InterfaceC648270Pbl
    public final void LLJJJ() {
        super.LLJJJ();
        LJJIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getKeyframePhotoIndex() {
        /*
            r5 = this;
            X.0Px5 r0 = r5.getDataProvider()
            r4 = 0
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZJ
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.search.model.SearchKeySegmentsInfo r0 = r0.getKeySegmentsInfo()
            if (r0 == 0) goto L5d
            java.util.List r0 = r0.getKeySegmentInfos()
            if (r0 == 0) goto L5d
            java.lang.Object r3 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.search.model.KeySegmentInfo r3 = (com.ss.android.ugc.aweme.search.model.KeySegmentInfo) r3
            if (r3 == 0) goto L5e
            int r2 = r3.getIndexStart()
        L23:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getKeyframePhotoIndex: aid="
            r1.append(r0)
            X.0Px5 r0 = r5.getDataProvider()
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZJ
            if (r0 == 0) goto L5b
            java.lang.String r0 = r0.getAid()
        L3a:
            r1.append(r0)
            java.lang.String r0 = ", indexStart="
            r1.append(r0)
            if (r3 == 0) goto L4c
            int r0 = r3.getIndexStart()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L4c:
            r1.append(r4)
            java.lang.String r0 = ", result="
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            return r2
        L5b:
            r0 = r4
            goto L3a
        L5d:
            r3 = r4
        L5e:
            r2 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661450Px1.getKeyframePhotoIndex():int");
    }

    public final int getPosition() {
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            return photoSlide.getCurrentPosition();
        }
        return -1;
    }

    @Override // X.C661440Px0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C641100PCq.LIZIZ(this);
        this.LLLLL = interfaceC665370Q7zLIZIZ;
        if (interfaceC665370Q7zLIZIZ != null) {
            C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this.LLLLJI, SearchServiceCenter$AutoPlayAbility.class, null, null);
        }
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.LJIILL();
        }
        InterfaceC661560PxC photoSlide2 = getPhotoSlide();
        if (photoSlide2 != null) {
            photoSlide2.LJIIL(getPhotoMob());
        }
        InterfaceC661560PxC photoSlide3 = getPhotoSlide();
        if (photoSlide3 != null) {
            photoSlide3.LJIIL(getKeyframeListener());
        }
    }

    @Override // X.C661440Px0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC661560PxC photoSlide;
        super.onDetachedFromWindow();
        LJIIZILJ();
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLLLL;
        if (interfaceC665370Q7z != null && C1558520qew.LIZ(interfaceC665370Q7z, SearchServiceCenter$AutoPlayAbility.class, null) == this.LLLLJI) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, SearchServiceCenter$AutoPlayAbility.class, null);
        }
        InterfaceC661560PxC photoSlide2 = getPhotoSlide();
        if (photoSlide2 != null) {
            photoSlide2.LJFF(getPhotoMob());
        }
        InterfaceC661560PxC photoSlide3 = getPhotoSlide();
        if (photoSlide3 != null) {
            photoSlide3.LJFF(getKeyframeListener());
        }
        if (this.LLLLIIL || (photoSlide = getPhotoSlide()) == null) {
            return;
        }
        photoSlide.onCleared();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.search.lynx.xsearch.searchphoto.core.ui.SearchPhotoForLynx$ability$1] */
    public C661450Px1(Context context) {
        ViewParent parent;
        ViewParent parent2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View viewLJIILLIIL;
        super(context, null, 0);
        this.LLLLIILL = C288510BSn.LIZ();
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1118));
        this.LLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1117));
        this.LLLLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1116));
        this.LLLLJI = new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.lynx.xsearch.searchphoto.core.ui.SearchPhotoForLynx$ability$1
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LJJLIIIJLLLLLLLZ() {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Mu(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean N1() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View Vt() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void kC0(int i) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean mm() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void wp(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void J0() {
                this.LL.LJIJJLI(EnumC651030PgD.DO_NOTHING);
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LLZZZZ() {
                this.LL.LJIIZILJ();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean isPlaying() {
                return this.LL.LLLLIIL;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View getDetectView() {
                return this.LL;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                function0.invoke();
            }
        };
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null && (viewLJIILLIIL = photoSlide.LJIILLIIL()) != null) {
            addView(viewLJIILLIIL, 0);
        }
        C661850Pxf core = getCore();
        if (core != null) {
            core.setMVideoMobListener(getPhotoMob());
        }
        if (((Number) C270870AjV.LIZ.getValue()).intValue() != 1) {
            C0GZM mCoverView = getMCoverView();
            if (mCoverView != null) {
                parent = mCoverView.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(getMCoverView(), viewGroup2);
            }
            ImageView mCoverBackground = getMCoverBackground();
            if (mCoverBackground != null) {
                parent2 = mCoverBackground.getParent();
            } else {
                parent2 = null;
            }
            if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                C786410Ut5.LJJJLZIJ(getMCoverBackground(), viewGroup);
            }
            setMCoverView(null);
            setMCoverBackground(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    @Override // X.C661440Px0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r6 = this;
            super.LIZLLL(r7)
            X.0PxC r1 = r6.getPhotoSlide()
            r0 = 0
            if (r1 == 0) goto Ld
            r1.LJIIJJI(r7, r0, r0)
        Ld:
            int r5 = r6.getKeyframePhotoIndex()
            r4 = 1
            r3 = 0
            if (r5 < 0) goto L5d
            boolean r0 = X.C1111604Wk.LIZ()
            if (r0 == 0) goto L5d
            r2 = 1
        L1c:
            X.0Px5 r0 = r6.getDataProvider()
            if (r0 == 0) goto L59
            X.0PxB r0 = r0.LJ()
            if (r0 == 0) goto L59
            int r0 = r0.LJ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 < 0) goto L59
            int r5 = r1.intValue()
        L38:
            X.0PxC r0 = r6.getPhotoSlide()
            if (r0 == 0) goto L44
            if (r5 >= 0) goto L41
            r5 = 0
        L41:
            r0.LJI(r5)
        L44:
            boolean r0 = r6.LLLLIILL
            if (r0 == 0) goto L56
            X.0Px5 r0 = r6.getDataProvider()
            if (r0 == 0) goto L56
            X.0PxB r0 = r0.LJ()
            if (r0 == 0) goto L56
            r0.LJIIIZ = r4
        L56:
            r6.LLLLIIL = r3
            return
        L59:
            if (r2 != 0) goto L38
            r5 = 0
            goto L38
        L5d:
            r2 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661450Px1.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.C661440Px0
    public final void LJIJJLI(EnumC651030PgD enumC651030PgD) {
        String aid;
        Aweme aweme;
        super.LJIJJLI(enumC651030PgD);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playWithSynergyAction, aid: ");
        C661490Px5 dataProvider = getDataProvider();
        if (dataProvider != null && (aweme = dataProvider.LIZJ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", isPlaying: ");
        sbLIZ.append(this.LLLLIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        LJJIJ();
    }

    @Override // X.C661440Px0, X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        setPlayingWhenLeave$search_release(false);
        LJJIFFI(true);
    }

    @Override // X.C661440Px0
    public void setAwemeIdentifier(Map<String, ? extends Object> map) {
        C661550PxB c661550PxBLJ;
        super.setAwemeIdentifier(map);
        C661490Px5 dataProvider = getDataProvider();
        if (dataProvider != null && (c661550PxBLJ = dataProvider.LJ()) != null) {
            c661550PxBLJ.LJ = 0;
        }
    }

    public final void setPlayPosition(int i) {
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            if (i < 0) {
                i = 0;
            }
            photoSlide.LJI(i);
        }
    }

    @Override // X.C661440Px0
    public void setRepeat(boolean z) {
        this.LLLLILI = z;
    }
}
