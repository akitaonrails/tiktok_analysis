package X;

import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Px2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661460Px2 extends C661470Px3 {
    public volatile boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C1012300cRw LLJJJ;
    public TuxIconView LLJJJIL;
    public final boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public AnonymousClass0956 LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public Integer LLJL;
    public final boolean LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public final boolean LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public final List<InterfaceC661730PxT> LLL;
    public final C661610PxH LLLF;
    public final C01GW LLLFF;

    @Override // X.C661470Px3, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final InterfaceC661560PxC getPhotoSlide() {
        return (InterfaceC661560PxC) this.LLJZIJLIL.getValue();
    }

    @Override // X.C661470Px3
    public final void LJIIIZ() {
        if (this.LLJLILLLLZIIL && !this.LLJLLL && !this.LLJZ) {
            this.LLJLL = false;
            LJIJI();
        }
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.LIZJ();
        }
        this.LLJJIJIL = !C18127078b.LIZIZ();
        this.LLJJIJIIJIL = false;
        super.LJIIIZ();
    }

    public final void LJIIZILJ() {
        InterfaceC661560PxC photoSlide;
        C661550PxB c661550PxBLJ;
        Aweme aweme;
        TuxIconView tuxIconView;
        C1012300cRw c1012300cRw;
        if (this.LLJJIJIIJIL) {
            String aid = null;
            if (!C18127078b.LIZIZ()) {
                if (C07P0.LIZIZ() && (c1012300cRw = this.LLJJJ) != null) {
                    C786410Ut5.r1(c1012300cRw, 8);
                }
                C661490Px5 dataProvider = getDataProvider();
                if (C659070PtB.LIZ(dataProvider != null ? dataProvider.LIZJ : null) && (tuxIconView = this.LLJJJIL) != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
            }
            if (C18127078b.LIZ()) {
                InterfaceC661560PxC photoSlide2 = getPhotoSlide();
                if (photoSlide2 != null) {
                    Integer numValueOf = Integer.valueOf(photoSlide2.LIZJ());
                    if (numValueOf.intValue() >= 0) {
                        int iIntValue = numValueOf.intValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pausePhoto, aid: ");
                        C661490Px5 dataProvider2 = getDataProvider();
                        if (dataProvider2 != null && (aweme = dataProvider2.LIZJ) != null) {
                            aid = aweme.getAid();
                        }
                        sbLIZ.append(aid);
                        sbLIZ.append(", position: ");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(", isAttached: ");
                        sbLIZ.append(isAttachedToWindow());
                        C2188811AlT.LIZIZ(sbLIZ);
                        C661490Px5 dataProvider3 = getDataProvider();
                        if (dataProvider3 != null && (c661550PxBLJ = dataProvider3.LJ()) != null) {
                            c661550PxBLJ.LJ = iIntValue;
                        }
                    }
                }
            } else {
                AnonymousClass0956 anonymousClass0956 = this.LLJJJJLIIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
            }
            this.LLJJIJIIJIL = false;
            if (!isAttachedToWindow() && (photoSlide = getPhotoSlide()) != null) {
                photoSlide.onCleared();
            }
            getPhotoMob().LJJI();
        }
    }

    public final void LJIJ() {
        Context context;
        Aweme aweme;
        InterfaceC661560PxC photoSlide;
        int iIntValue;
        C661550PxB c661550PxBLJ;
        if (this.LLJJIJIIJIL) {
            return;
        }
        if (this.LLJLILLLLZIIL && !this.LLJLLL && !this.LLJZ) {
            HandlerHook.viewPost(this, new ARunnableS110S0100000_10(this, 116));
        }
        this.LLJJIJIIJIL = true;
        int currentPosition = this.LLJJLIIIJLLLLLLLZ;
        if (C18127078b.LIZ()) {
            Integer numValueOf = this.LLJL;
            if (numValueOf == null) {
                C661490Px5 dataProvider = getDataProvider();
                numValueOf = (dataProvider == null || (c661550PxBLJ = dataProvider.LJ()) == null) ? null : Integer.valueOf(c661550PxBLJ.LJ);
            }
            this.LLJL = null;
            if (numValueOf != null && (iIntValue = numValueOf.intValue()) >= 0) {
                currentPosition = iIntValue;
            } else if (currentPosition < 0 && ((this.LLJLLL || this.LLJZ) && (photoSlide = getPhotoSlide()) != null)) {
                currentPosition = photoSlide.getCurrentPosition();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playPhoto, aid: ");
        C661490Px5 dataProvider2 = getDataProvider();
        sbLIZ.append((dataProvider2 == null || (aweme = dataProvider2.LIZJ) == null) ? null : aweme.getAid());
        sbLIZ.append(", position: ");
        sbLIZ.append(currentPosition);
        C2188811AlT.LIZIZ(sbLIZ);
        LJI();
        if (!C18127078b.LIZIZ()) {
            LJIJJ();
        }
        if (C18127078b.LIZ()) {
            InterfaceC661560PxC photoSlide2 = getPhotoSlide();
            if (photoSlide2 != null) {
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
                photoSlide2.LJIIIIZZ(Integer.valueOf(currentPosition));
            }
        } else {
            this.LLJJJJLIIL = null;
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C661490Px5 dataProvider3 = getDataProvider();
            C19EG c19egLIZIZ = (dataProvider3 == null || (context = dataProvider3.getContext()) == null) ? null : C1388190mED.LIZIZ(context);
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(this, c19egLIZIZ);
            this.LLJJJJLIIL = lifecycleOwnerLJIJI != null ? C948503nH.LJ(lifecycleOwnerLJIJI, C23271099x.INSTANCE, new C660280Pv8(this, null)) : null;
        }
        getPhotoMob().LJJ(this);
        LIZLLL(getPosition(), getCount(), 1500L);
    }

    public final C661480Px4 getPhotoMob() {
        return (C661480Px4) this.LLLFF.getValue();
    }

    @Override // X.C661470Px3, X.InterfaceC662180PyC
    public final void LIZIZ() {
        super.LIZIZ();
        LJIIZILJ();
    }

    @Override // X.C661470Px3, X.InterfaceC662180PyC
    public final void LIZJ() {
        Aweme aweme;
        super.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPerformPlay, aid: ");
        C661490Px5 dataProvider = getDataProvider();
        sbLIZ.append((dataProvider == null || (aweme = dataProvider.LIZJ) == null) ? null : aweme.getAid());
        sbLIZ.append(", isPlaying: ");
        sbLIZ.append(this.LLJJIJIIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIJ();
    }

    @Override // X.C661470Px3
    public final void LJIILIIL() {
        InterfaceC661540PxA videoPlayer = getVideoPlayer();
        if (videoPlayer != null) {
            videoPlayer.LJIIL(new InterfaceC2453409jQ() { // from class: X.0PxK
                @Override // X.InterfaceC2453409jQ
                public final Object get() {
                    return this.LIZ.getPhotoMob();
                }
            });
        }
    }

    public final void LJIJI() {
        ViewGroup viewGroup;
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        View viewLJIILLIIL = photoSlide != null ? photoSlide.LJIILLIIL() : null;
        if (!(viewLJIILLIIL instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLJIILLIIL) == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                C786410Ut5.Ob(childAt, 1.0f);
                C786410Ut5.pc(childAt, 1.0f);
                C786410Ut5.T4(childAt, 1.0f);
                C786410Ut5.Jc(childAt, 0.0f);
                C786410Ut5.ed(childAt, 0.0f);
            }
        }
    }

    public final void LJIJJ() {
        C1012300cRw c1012300cRw;
        if (C07P0.LIZIZ()) {
            C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
            C659080PtC.LJFF();
            int i = C659080PtC.LIZIZ;
            c1011980cRQ.getClass();
            EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i);
            if (enumC1012120cReLIZ != null && (c1012300cRw = this.LLJJJ) != null) {
                c1012300cRw.LIZ(enumC1012120cReLIZ, false);
            }
            C1012300cRw c1012300cRw2 = this.LLJJJ;
            if (c1012300cRw2 != null) {
                C786410Ut5.r1(c1012300cRw2, 0);
            }
        }
        boolean z = C659080PtC.LIZ;
        C661490Px5 dataProvider = getDataProvider();
        setMute(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, 1, dataProvider != null ? dataProvider.LIZJ : null));
        C659060PtA c659060PtA = C659060PtA.LIZ;
        C661490Px5 dataProvider2 = getDataProvider();
        Aweme aweme = dataProvider2 != null ? dataProvider2.LIZJ : null;
        C1012300cRw c1012300cRw3 = this.LLJJJ;
        TuxIconView tuxIconView = this.LLJJJIL;
        C661490Px5 dataProvider3 = getDataProvider();
        C659060PtA.LIZLLL(c659060PtA, aweme, c1012300cRw3, tuxIconView, dataProvider3 != null ? dataProvider3.LJIL : null, null, 16);
    }

    @Override // X.C661470Px3, X.InterfaceC648270Pbl
    public final void LLJJJ() {
        Aweme aweme;
        super.LLJJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pauseMedia, aid: ");
        C661490Px5 dataProvider = getDataProvider();
        sbLIZ.append((dataProvider == null || (aweme = dataProvider.LIZJ) == null) ? null : aweme.getAid());
        sbLIZ.append(", isPlaying: ");
        sbLIZ.append(this.LLJJIJIIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIZILJ();
    }

    @Override // X.C661470Px3, X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        Aweme aweme;
        super.LLLLLIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playMedia, aid: ");
        C661490Px5 dataProvider = getDataProvider();
        sbLIZ.append((dataProvider == null || (aweme = dataProvider.LIZJ) == null) ? null : aweme.getAid());
        sbLIZ.append(", isPlaying: ");
        sbLIZ.append(this.LLJJIJIIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIJ();
    }

    public final int getCount() {
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            return photoSlide.LJIILJJIL();
        }
        return -1;
    }

    public final int getPosition() {
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            return photoSlide.getCurrentPosition();
        }
        return -1;
    }

    @Override // X.C661470Px3, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.LJIILL();
        }
        InterfaceC661560PxC photoSlide2 = getPhotoSlide();
        if (photoSlide2 != null) {
            photoSlide2.LJIIL(this.LLLF);
        }
    }

    @Override // X.C661470Px3, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC661560PxC photoSlide;
        AnonymousClass0956 anonymousClass0956;
        super.onDetachedFromWindow();
        if (!C18127078b.LIZ() && (anonymousClass0956 = this.LLJJJJLIIL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC661560PxC photoSlide2 = getPhotoSlide();
        if (photoSlide2 != null) {
            photoSlide2.LJFF(this.LLLF);
        }
        if (this.LLJJIJIIJIL || (photoSlide = getPhotoSlide()) == null) {
            return;
        }
        photoSlide.onCleared();
    }

    public final int getInitialPhotoIndex() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean getIsPhotoPlaying() {
        return this.LLJJIJIIJIL;
    }

    public final TuxIconView getPhotoMuteNoteIcon() {
        return this.LLJJJIL;
    }

    public final C1012300cRw getPhotoSoundIcon() {
        return this.LLJJJ;
    }

    public final boolean getUseMainColorForce() {
        return this.LLJJJJJIL;
    }

    @Override // X.C661470Px3
    public final void LJFF(Aweme aweme) {
        int size;
        PhotoModeImageUrlModel searchOutflowDisplayImage;
        C661490Px5 dataProvider;
        C661550PxB c661550PxBLJ;
        int currentPosition;
        C661550PxB c661550PxBLJ2;
        int i;
        PhotoModeImageInfo photoModeImageInfo;
        C653660PkS c653660PkSLJIIIZ;
        InterfaceC661560PxC photoSlide;
        List<PhotoModeImageUrlModel> imageList;
        super.LJFF(aweme);
        PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        if (size > 1 && (photoSlide = getPhotoSlide()) != null) {
            photoSlide.LJIIIZ(this.LLJLLIL);
        }
        Integer numValueOf = null;
        if (((Boolean) C1100304Sb.LIZ.getValue()).booleanValue()) {
            C661480Px4 photoMob = getPhotoMob();
            String aid = aweme.getAid();
            if (!Intrinsics.LJFF(photoMob.LLJJJJ, aid)) {
                photoMob.LLJJJJ = aid;
                photoMob.LLJJIJI = false;
                photoMob.LLJJJIL = 0L;
                AnonymousClass0956 anonymousClass0956 = photoMob.LLJJIJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resetPlayFinishFlag called for new aweme: ");
                sbLIZ.append(aid);
                sbLIZ.append(", previous: ");
                sbLIZ.append(photoMob.LLJJJJ);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("same aweme rebind, skip reset: ");
                sbLIZ2.append(aid);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        InterfaceC661560PxC photoSlide2 = getPhotoSlide();
        if (photoSlide2 != null) {
            photoSlide2.LJIIJ(aweme, !C18127078b.LIZ(), Long.valueOf(((Number) C18127078b.LIZJ.getValue()).longValue()), Integer.valueOf(((Number) C18127078b.LIZIZ.getValue()).intValue()));
        }
        this.LLJJLIIIJLLLLLLLZ = C1ER1.LIZIZ.k(aweme);
        PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo3 != null) {
            searchOutflowDisplayImage = photoModeImageInfo3.getSearchOutflowDisplayImage();
        } else {
            searchOutflowDisplayImage = null;
        }
        if (searchOutflowDisplayImage != null) {
            C661480Px4 photoMob2 = getPhotoMob();
            if (this.LLJJLIIIJLLLLLLLZ != -1) {
                i = 1;
            } else {
                i = 0;
            }
            Aweme awemeLJII = photoMob2.LJII();
            if (awemeLJII != null && (photoModeImageInfo = awemeLJII.getPhotoModeImageInfo()) != null && !photoModeImageInfo.getHasReportedCoverChangedSuccess() && (c653660PkSLJIIIZ = photoMob2.LJIIIZ()) != null) {
                String str = c653660PkSLJIIIZ.LJIIJ;
                String strInvoke = c653660PkSLJIIIZ.LJJLI.invoke(awemeLJII);
                photoModeImageInfo.setHasReportedCoverChangedSuccess(true);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(i, "is_success");
                c2344009Gk.LJIIIIZZ("search_id", str);
                c2344009Gk.LJIIIIZZ("search_result_id", strInvoke);
                C20684815ws.LJIILLIIL("photo_cover_changed_success", c2344009Gk.LIZ);
            }
        }
        InterfaceC661560PxC photoSlide3 = getPhotoSlide();
        if (photoSlide3 != null) {
            photoSlide3.LIZLLL(this.LLJJLIIIJLLLLLLLZ);
        }
        InterfaceC661560PxC photoSlide4 = getPhotoSlide();
        if (photoSlide4 != null) {
            photoSlide4.LJII(this.LLJJLIIIJLLLLLLLZ);
        }
        getDataProvider();
        if (C18127078b.LIZ()) {
            C661490Px5 dataProvider2 = getDataProvider();
            if (dataProvider2 != null && (c661550PxBLJ2 = dataProvider2.LJ()) != null) {
                numValueOf = Integer.valueOf(c661550PxBLJ2.LJ);
            }
            this.LLJL = numValueOf;
            if (numValueOf != null) {
                if (numValueOf.intValue() < 0 && this.LLJJLIIIJLLLLLLLZ != -1) {
                    InterfaceC661560PxC photoSlide5 = getPhotoSlide();
                    if (photoSlide5 != null) {
                        photoSlide5.LJI(this.LLJJLIIIJLLLLLLLZ);
                    }
                } else {
                    InterfaceC661560PxC photoSlide6 = getPhotoSlide();
                    if (photoSlide6 != null) {
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue < 0) {
                            iIntValue = 0;
                        }
                        photoSlide6.LJI(iIntValue);
                    }
                }
            } else if (this.LLJLLL || this.LLJZ) {
                InterfaceC661560PxC photoSlide7 = getPhotoSlide();
                if ((photoSlide7 == null || (currentPosition = photoSlide7.getCurrentPosition()) < 0) && (currentPosition = this.LLJJLIIIJLLLLLLLZ) < 0) {
                    currentPosition = 0;
                }
                InterfaceC661560PxC photoSlide8 = getPhotoSlide();
                if (photoSlide8 != null) {
                    photoSlide8.LJI(currentPosition);
                }
            }
        }
        if (this.LLJJJJ && (dataProvider = getDataProvider()) != null && (c661550PxBLJ = dataProvider.LJ()) != null) {
            c661550PxBLJ.LJIIIZ = true;
        }
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
    }

    public final void LJIILLIIL(InterfaceC661730PxT interfaceC661730PxT) {
        if (!this.LLL.contains(interfaceC661730PxT)) {
            this.LLL.add(interfaceC661730PxT);
        }
    }

    @Override // X.C661470Px3, X.InterfaceC662180PyC
    public final void onPlayPrepare(String str) {
        InterfaceC661680PxO interfaceC661680PxO;
        if (C18127078b.LIZ()) {
            super.onPlayPrepare(str);
            return;
        }
        C581630MrZ c581630MrZ = new C581630MrZ(2, 0);
        InterfaceC661770PxX interfaceC661770PxX = this.LL;
        if (interfaceC661770PxX != null) {
            interfaceC661770PxX.LIZ(c581630MrZ);
        }
        C661490Px5 dataProvider = getDataProvider();
        if (dataProvider == null || (interfaceC661680PxO = dataProvider.LJIILL) == null) {
            return;
        }
        interfaceC661680PxO.onPlayPrepare(str);
    }

    @Override // X.C661470Px3, androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
        if (this.LLJJIJIL || this.LLJJIJIIJIL) {
            this.LLJJIJIL = false;
            if (!C18127078b.LIZIZ()) {
                LJIJJ();
            }
        }
    }

    public final void setCardPosition(int i) {
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.LJ(i);
        }
    }

    public final void setCurrentPhotoItem(int i) {
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.LJI(i);
        }
    }

    public final void setExtraParams(Map<String, String> map) {
        InterfaceC661560PxC photoSlide = getPhotoSlide();
        if (photoSlide != null) {
            photoSlide.setExtraParams(map);
        }
    }

    public final void setPhotoMuteNoteIcon(TuxIconView tuxIconView) {
        this.LLJJJIL = tuxIconView;
    }

    public final void setPhotoSoundIcon(C1012300cRw c1012300cRw) {
        this.LLJJJ = c1012300cRw;
    }

    public final void setUseMainColorForce(boolean z) {
        this.LLJJJJJIL = z;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.0PxH] */
    public C661460Px2(Context context, AttributeSet attributeSet) {
        InterfaceC661560PxC photoSlide;
        View viewLJIILLIIL;
        super(context, attributeSet, 0);
        this.LLJJJJ = C288510BSn.LIZ();
        this.LLJLIL = ((Boolean) C18127078b.LJFF.getValue()).booleanValue();
        boolean zBooleanValue = ((Boolean) C18127078b.LJIIIZ.getValue()).booleanValue();
        this.LLJLILLLLZIIL = zBooleanValue;
        this.LLJLL = true;
        this.LLJLLIL = ((Boolean) C18127078b.LJIIL.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) C078S.LIZ.getValue()).booleanValue();
        this.LLJLLL = zBooleanValue2;
        boolean zBooleanValue3 = ((Boolean) C18127078b.LJIILIIL.getValue()).booleanValue();
        this.LLJZ = zBooleanValue3;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 992));
        this.LLL = new ArrayList();
        this.LLLF = new C659290PtX() { // from class: X.0PxH
            @Override // X.C659290PtX, X.InterfaceC661730PxT
            public final void LIZJ(View view) {
                Iterator<InterfaceC661730PxT> it2 = this.LL.LLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(view);
                }
            }

            @Override // X.C659290PtX, X.InterfaceC661730PxT
            public final void LJ(View view, boolean z) {
                Iterator<InterfaceC661730PxT> it2 = this.LL.LLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LJ(view, z);
                }
            }

            @Override // X.C659290PtX, X.InterfaceC661730PxT
            public final void LIZIZ(int i, int i2, int i3) {
                Iterator it2 = ((ArrayList) this.LL.LLL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC661730PxT) it2.next()).LIZIZ(i, i2, i3);
                }
            }

            @Override // X.C659290PtX, X.InterfaceC661730PxT
            public final void LIZLLL(int i, int i2, long j) {
                Iterator<InterfaceC661730PxT> it2 = this.LL.LLL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL(i, i2, j);
                }
            }
        };
        this.LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 991));
        InterfaceC19471211Fu interfaceC19471211Fu = new InterfaceC19471211Fu() { // from class: X.0PxI
            @Override // X.InterfaceC19471211Fu
            public final void LIZ(View view, float f) {
                if (!this.LIZ.LLJLL) {
                    return;
                }
                float fAbs = Math.abs(f);
                float f2 = 0.0f;
                if (fAbs < 0.001f) {
                    C786410Ut5.T4(view, 1.0f);
                    C786410Ut5.Jc(view, 0.0f);
                } else {
                    C786410Ut5.Jc(view, (-view.getWidth()) * f);
                    if (fAbs < 1.0f) {
                        f2 = 1.0f - fAbs;
                    }
                    C786410Ut5.T4(view, f2);
                }
            }
        };
        InterfaceC661560PxC photoSlide2 = getPhotoSlide();
        if (photoSlide2 != null && (viewLJIILLIIL = photoSlide2.LJIILLIIL()) != null) {
            addView(viewLJIILLIIL);
        }
        if (zBooleanValue && !zBooleanValue2 && !zBooleanValue3 && (photoSlide = getPhotoSlide()) != null) {
            photoSlide.LJIILIIL(interfaceC19471211Fu);
        }
        LJIILLIIL(getPhotoMob());
    }
}
