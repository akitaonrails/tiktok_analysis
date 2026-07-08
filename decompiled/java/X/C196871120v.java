package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nv7.c0;

/* JADX INFO: renamed from: X.120v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C196871120v extends View {
    public static final /* synthetic */ int LLLIIIIL = 0;
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public Point LLILZIL;
    public InterfaceC1452170ntP LLILZLL;
    public SafeHandler LLIZ;
    public C196870120u LLIZLLLIL;
    public VideoPublishEditModel LLJ;
    public C1DRG LLJI;
    public boolean LLJIJIL;
    public InterfaceC19629711r5<C196874120y> LLJILJIL;
    public InterfaceC19629711r5<C196874120y> LLJILJILJ;
    public C121U LLJILLL;
    public int LLJJ;
    public C1466170oFz LLJJI;
    public final C19671311xn LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public boolean LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public boolean LLJJL;
    public C121H LLJJLIIIJLLLLLLLZ;
    public C121M LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public C196873120x LLJLLL;
    public final C122L LLJZ;
    public final PointF LLJZIJLIL;
    public InterfaceC1461650o8h LLL;
    public InfoStickerViewModel LLLF;
    public int LLLFF;
    public AnonymousClass1214 LLLFFI;
    public AnonymousClass1223 LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public final ARunnableS129S0100000_29 LLLIIII;

    public final void LIZ() {
        this.LLJLLIL = false;
        C196870120u c196870120u = this.LLIZLLLIL;
        if (c196870120u != null) {
            Iterator it2 = ((ArrayList) c196870120u.LIZ).iterator();
            while (it2.hasNext()) {
                ((C196874120y) it2.next()).LLILZIL = false;
            }
        }
        invalidate();
    }

    public void setStickerOnPlayListener(AnonymousClass1220 anonymousClass1220) {
    }

    public final void LIZJ() {
        InterfaceC1452170ntP interfaceC1452170ntP;
        int iP2;
        if ((this.LLILLL == 0 || this.LLILZ == 0) && (interfaceC1452170ntP = this.LLILZLL) != null) {
            VESize initSize = interfaceC1452170ntP.getInitSize();
            this.LLILLL = initSize.width;
            this.LLILZ = initSize.height;
            int screenWidth = ScreenUtils.getScreenWidth(getContext());
            int i = this.LLILLL;
            this.LL = (screenWidth - i) >> 1;
            if (C537820L7k.LIZ(i, this.LLILZ)) {
                iP2 = 0;
            } else {
                int fullScreenHeight = ScreenUtils.getFullScreenHeight(getContext());
                c0 c0Var = c0.LIZ;
                iP2 = (((fullScreenHeight - (c0Var.LJIIIIZZ() ? c0Var.p2() + c0Var.o2() : c0Var.o2())) - c0Var.LJFF()) - this.LLILZ) / 2;
            }
            this.LLILLJJLI = iP2;
        }
    }

    public final void LJ() {
        C19671311xn c19671311xn;
        int i;
        if (this.LLIZ == null || this.LLJ == null || (c19671311xn = this.LLJJIII) == null || c19671311xn.LIZ == null || (i = this.LLJJIJI) == -1 || i != 2) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LLJ.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("prop_id", this.LLJJIII.LIZ.LLILLL.stickerId);
        c0lab.LJ("shoot_way", this.LLJ.mShootWay);
        c0lab.LIZ(-1, "sticker_type");
        this.LLJJIII.getClass();
        c0lab.LJ("enter_method", "finger_gesture");
        if (this.LLJ.getDraftId() != 0) {
            c0lab.LIZ(this.LLJ.getDraftId(), "draft_id");
        }
        if (!TextUtils.isEmpty(this.LLJ.getNewDraftId())) {
            c0lab.LJ("new_draft_id", this.LLJ.getNewDraftId());
        }
        if (C1428470nHB.LLIIIJ(this.LLJ)) {
            C1403830mdR.LIZ(this.LLJ, c0lab);
        }
        if (this.LLJJIII.LIZ.LLILLL.type == 27) {
            c0lab.LJ("sticker_type", "music_share_story");
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("prop_adjust", c0lab.LIZ);
    }

    public final void LJII() {
        C196870120u c196870120u = this.LLIZLLLIL;
        if (c196870120u != null) {
            c196870120u.LJIIL(EnumC390580FTc.NORMAL);
            invalidate();
        }
    }

    public final void LJIIIZ() {
        C19671311xn c19671311xn;
        C196874120y c196874120y;
        C196870120u c196870120u;
        if (this.LLJJIJI == 1 || (c19671311xn = this.LLJJIII) == null || (c196874120y = c19671311xn.LIZ) == null || (c196870120u = this.LLIZLLLIL) == null) {
            return;
        }
        if (!c19671311xn.LIZIZ) {
            c196870120u.LJIIJJI(c196874120y);
            return;
        }
        c196874120y.LLILZIL = true;
        c196870120u.LIZIZ = c196874120y;
        invalidate();
    }

    public int getStickNumber() {
        C196870120u c196870120u = this.LLIZLLLIL;
        int i = 0;
        if (c196870120u != null) {
            Iterator it2 = ((ArrayList) c196870120u.LIZ).iterator();
            while (it2.hasNext()) {
                it2.next();
                i++;
            }
        }
        return i;
    }

    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" onClickContent");
        sbLIZ.append(this.LLJJIII.LIZ == null);
        sbLIZ.append(" ");
        sbLIZ.append(this.LLJJIII.LIZ == null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLLFZ.LIZ()) {
            return;
        }
        if (this.LLJJIII.LIZ.LLILLL.isNowSmallWindowSticker()) {
            ((InterfaceC1461650o8h) this.LLJI.LJII(InterfaceC1461650o8h.class, null)).OC();
            return;
        }
        setShowHelpBox(true);
        this.LLJJIJI = 1;
        C196870120u c196870120u = this.LLIZLLLIL;
        if (c196870120u != null) {
            C196874120y c196874120y = this.LLJJIII.LIZ;
            AnonymousClass1222 anonymousClass1222 = c196870120u.LJII;
            if (anonymousClass1222 != null) {
                anonymousClass1222.LIZ();
            }
            if (c196870120u.LIZIZ != c196874120y) {
                c196870120u.LIZJ();
                c196870120u.LIZIZ = c196874120y;
            }
            C196874120y c196874120y2 = c196870120u.LIZIZ;
            c196874120y2.getClass();
            c196874120y2.LLILZIL = true;
            c196870120u.LJFF.getClass();
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c196870120u.LJ);
            C348440DlK c348440DlKLJJIIJZLJL = c348100DkmLIZIZ.LJIIIZ().LJJIIJZLJL(c196870120u.LIZIZ.LLILLL.uuid);
            if (c348440DlKLJJIIJZLJL != null) {
                c348440DlKLJJIIJZLJL.LIZLLL = 0L;
                c348440DlKLJJIIJZLJL.LJ = c196870120u.LJ.getDuration();
                c348100DkmLIZIZ.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
            }
            if (!TextUtils.isEmpty(c196870120u.LIZIZ.LLILLL.stickerId) && c196870120u.LIZJ.LLJ != null) {
                ((ICommerceToolsMissionService) ServiceManager.get().getService(ICommerceToolsMissionService.class)).LJIIIIZZ(c196870120u.LIZJ.LLJ, c196870120u.LIZIZ.LLILLL.stickerId);
            }
        }
        if (this.LLL == null) {
            this.LLL = (InterfaceC1461650o8h) this.LLJI.LJII(InterfaceC1461650o8h.class, null);
        }
        this.LLL.Ci1(this.LLJJIII.LIZ.LLILLL);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C122L c122l = this.LLJZ;
        c122l.getClass();
        ((ArrayList) C122I.LJIIJJI).add(c122l);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C122L c122l = this.LLJZ;
        c122l.getClass();
        ((ArrayList) C122I.LJIIJJI).remove(c122l);
    }

    public C196873120x getGestureListener() {
        return this.LLJLLL;
    }

    public final void LJI(String str) {
        C196870120u c196870120u = this.LLIZLLLIL;
        if (c196870120u != null) {
            C196874120y c196874120y = null;
            for (C196874120y c196874120y2 : (ArrayList) c196870120u.LIZ) {
                if (TextUtils.equals(c196874120y2.LLILLL.uuid, str)) {
                    c196874120y = c196874120y2;
                }
            }
            if (c196874120y != null) {
                c196870120u.LJFF(c196874120y);
            }
        }
    }

    public final void LJIIJ(C196874120y c196874120y) {
        RectF rectF;
        try {
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZLL;
            if (interfaceC1452170ntP == null) {
                return;
            }
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            float[] fArrLIZJ = c348100DkmLIZIZ.LJIIIZ().LIZ().LIZJ(c196874120y.LLILLL.uuid);
            float f = -c348100DkmLIZIZ.LJIIIZ().LIZ().getInfoStickerRotate(c196874120y.LLILLL.uuid);
            float infoStickerScale = c348100DkmLIZIZ.LJIIIZ().LIZ().getInfoStickerScale(c196874120y.LLILLL.uuid);
            if (infoStickerScale > 0.0f) {
                c196874120y.LLILLL.scale = infoStickerScale;
                c196874120y.LJIIIZ(infoStickerScale / c196874120y.LLJILJIL);
            }
            c196874120y.LLILLL.rotateAngle = f;
            float f2 = f - f;
            if (f2 != 0.0f && (rectF = c196874120y.LLIZLLLIL) != null) {
                c196874120y.LLJI.postRotate(f2, rectF.centerX(), c196874120y.LLIZLLLIL.centerY());
            }
            RectF rectF2 = c196874120y.LLIZLLLIL;
            float f3 = fArrLIZJ[2];
            float f4 = fArrLIZJ[0];
            float f5 = ((((f3 - f4) / 2.0f) + f4) * this.LLILLL) + this.LL;
            float f6 = fArrLIZJ[1];
            float f7 = fArrLIZJ[3];
            float fCenterX = f5 - rectF2.centerX();
            float fCenterY = (((((f6 - f7) / 2.0f) + f7) * this.LLILZ) + this.LLILLJJLI) - rectF2.centerY();
            c196874120y.LJIIIIZZ(fCenterX, fCenterY);
            StickerItemModel stickerItemModel = c196874120y.LLILLL;
            stickerItemModel.currentOffsetX += fCenterX / this.LLILLL;
            stickerItemModel.currentOffsetY += fCenterY / this.LLILZ;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c196874120y.LLILLL.uuid);
            c348100DkmLIZIZ.LJIIIZ().LJJIJIIJI(arrayList, Float.valueOf(c196874120y.LLILLL.currentOffsetX), Float.valueOf(c196874120y.LLILLL.currentOffsetY));
        } catch (VEException e) {
            TryCatchGuardChecker.doCheck(e);
            C2219091BtD.LIZLLL().LIZIZ(new RuntimeException("restorePinStickerPositionImpl", e));
        }
    }

    public final void LJIIJJI(boolean z) {
        C196870120u c196870120u;
        if (this.LLJIJIL == z) {
            return;
        }
        this.LLJIJIL = z;
        if (!z && (c196870120u = this.LLIZLLLIL) != null && c196870120u.LIZIZ != null) {
            c196870120u.LIZJ();
            this.LLJZ.LJII();
            StickerHintTextViewModel stickerHintTextViewModel = this.LLIZLLLIL.LJIIIIZZ;
            if (stickerHintTextViewModel != null) {
                stickerHintTextViewModel.vQ2().postValue(Boolean.TRUE);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C196870120u c196870120u = this.LLIZLLLIL;
        if (c196870120u != null) {
            for (C196874120y c196874120y : (ArrayList) c196870120u.LIZ) {
                c196874120y.getClass();
                RectF rectF = c196874120y.LLJ;
                if (rectF != null) {
                    float f = c196874120y.LLILZ.LJIIL;
                    rectF.top += f;
                    rectF.bottom += f;
                    if (c196874120y.LLILZIL) {
                        canvas.save();
                        canvas.rotate(c196874120y.LLILLL.rotateAngle, c196874120y.LLJ.centerX(), c196874120y.LLJ.centerY());
                        canvas.drawRect(c196874120y.LLJ, c196874120y.LLILZLL);
                        canvas.restore();
                        System.currentTimeMillis();
                    }
                    float fWidth = c196874120y.LLIZLLLIL.width() / 2.0f;
                    float fHeight = c196874120y.LLIZLLLIL.height() / 2.0f;
                    float fCenterX = c196874120y.LLIZLLLIL.centerX();
                    float fCenterY = c196874120y.LLIZLLLIL.centerY();
                    float f2 = fCenterX - fWidth;
                    float f3 = fCenterY - fHeight;
                    c196874120y.LLJIJIL[0].set(f2, f3);
                    float f4 = fCenterX + fWidth;
                    c196874120y.LLJIJIL[1].set(f4, f3);
                    float f5 = fCenterY + fHeight;
                    c196874120y.LLJIJIL[2].set(f4, f5);
                    c196874120y.LLJIJIL[3].set(f2, f5);
                    RectF rectF2 = c196874120y.LLJ;
                    rectF2.top -= f;
                    rectF2.bottom -= f;
                }
            }
        }
    }

    public void setHavePinEdit(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public void setHaveTimeEdit(boolean z) {
        this.LLJLIL = z;
    }

    public void setITimeEditListener(C121U c121u) {
        this.LLJILLL = c121u;
    }

    public void setMotionInterceptor(AnonymousClass1223 anonymousClass1223) {
        this.LLLFZ = anonymousClass1223;
    }

    public void setOnInfoStickerPinEditClick(InterfaceC19629711r5<C196874120y> interfaceC19629711r5) {
        this.LLJILJILJ = interfaceC19629711r5;
    }

    public void setOnInfoStickerTimeEdit(InterfaceC19629711r5<C196874120y> interfaceC19629711r5) {
        this.LLJILJIL = interfaceC19629711r5;
    }

    public void setOnStickerChangeListener(C121M c121m) {
        this.LLJL = c121m;
    }

    public void setPinHelper(AnonymousClass1214 anonymousClass1214) {
        this.LLLFFI = anonymousClass1214;
    }

    public void setShowHelpBox(boolean z) {
        RectF rectF;
        C196874120y c196874120y;
        SafeHandler safeHandler;
        C196874120y c196874120y2;
        this.LLJLLIL = z;
        C19671311xn c19671311xn = this.LLJJIII;
        if (c19671311xn != null && (c196874120y2 = c19671311xn.LIZ) != null) {
            c196874120y2.LLILZIL = z;
        }
        ARunnableS129S0100000_29 aRunnableS129S0100000_29 = this.LLLIIII;
        if (aRunnableS129S0100000_29 != null && (safeHandler = this.LLIZ) != null) {
            safeHandler.removeCallbacks(aRunnableS129S0100000_29);
        }
        if (z) {
            SafeHandler safeHandler2 = this.LLIZ;
            if (safeHandler2 != null) {
                safeHandler2.postDelayed(this.LLLIIII, LivePreCreateNextRoomPlayer.ENABLE);
            }
            C121U c121u = this.LLJILLL;
            if (c121u != null && !c121u.LLLLZLLIL() && !this.LLJILLL.LIZ()) {
                int i = this.LLLFF;
                C19671311xn c19671311xn2 = this.LLJJIII;
                if (c19671311xn2 != null && (c196874120y = c19671311xn2.LIZ) != null && c196874120y.LLJ != null) {
                    rectF = new RectF(this.LLJJIII.LIZ.LLJ);
                    float f = i;
                    rectF.top += f;
                    rectF.bottom += f;
                } else {
                    rectF = new RectF();
                }
                StickerItemModel stickerItemModel = this.LLJJIII.LIZ.LLILLL;
                String str = stickerItemModel.extra;
                if (str == null || !str.contains("donot_show_bubble")) {
                    C122L c122l = this.LLJZ;
                    c122l.LJIILIIL = stickerItemModel;
                    PointF pointF = this.LLJZIJLIL;
                    c122l.LJIIIZ(rectF, (int) pointF.x, (int) pointF.y, this.LLJJIII.LIZ.LLILLL.rotateAngle, false, null);
                    C20684815ws.LJIILLIIL("prop_more_click", u4.LJFF(this.LLJ, this.LLJJIII.LIZ.LLJILJILJ, false, 4).LIZ);
                }
            }
        } else {
            this.LLJZ.LJII();
        }
        invalidate();
    }

    public void setStickerDataChangeListener(C121P c121p) {
        C196870120u c196870120u = this.LLIZLLLIL;
        if (c196870120u != null) {
            c196870120u.LJI = c121p;
        }
    }

    public void setStickerHintEnable(boolean z) {
        this.LLLI = z;
        C196870120u c196870120u = this.LLIZLLLIL;
        if (c196870120u != null) {
            c196870120u.LJIIJ = z;
        }
    }

    public void setStickerOnMoveListener(C121H c121h) {
        this.LLJJLIIIJLLLLLLLZ = c121h;
    }

    public C196871120v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJIJIL = true;
        this.LLJJIII = new C19671311xn();
        this.LLJJL = false;
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = true;
        this.LLJZ = new C122L(this, new C122J() { // from class: X.11r4
            @Override // X.C122M
            public final void LIZ() {
            }

            @Override // X.C122M
            public final void LIZIZ() {
                C196871120v c196871120v = this.LIZ;
                C196874120y c196874120y = c196871120v.LLJJIII.LIZ;
                if (c196874120y == null) {
                    c196871120v.setShowHelpBox(false);
                    return;
                }
                if (c196871120v.LLJLIL) {
                    c196871120v.LLJJIJI = 1;
                    C196870120u c196870120u = c196871120v.LLIZLLLIL;
                    if (c196870120u != null) {
                        c196874120y.LLILZIL = false;
                        c196870120u.LIZJ();
                        c196871120v.LLIZLLLIL.LJIIL(EnumC390580FTc.IGNORED);
                    }
                    InterfaceC19629711r5<C196874120y> interfaceC19629711r5 = c196871120v.LLJILJIL;
                    if (interfaceC19629711r5 != null) {
                        interfaceC19629711r5.LIZ(c196871120v.LLJJIII.LIZ);
                    }
                }
            }

            @Override // X.C122M
            public final void LIZJ() {
                this.LIZ.LIZLLL();
            }

            @Override // X.C122M
            public final void LIZLLL() {
                C196871120v c196871120v = this.LIZ;
                C196874120y c196874120y = c196871120v.LLJJIII.LIZ;
                if (c196874120y == null) {
                    c196871120v.setShowHelpBox(false);
                    return;
                }
                c196871120v.LJI(c196874120y.LLILLL.uuid);
                c196871120v.LLJJI.LIZJ(null, "other", 0);
                c196871120v.setShowHelpBox(false);
            }

            @Override // X.C122M
            public final void LJ() {
                C196871120v c196871120v = this.LIZ;
                C196874120y c196874120y = c196871120v.LLJJIII.LIZ;
                if (c196874120y == null) {
                    c196871120v.setShowHelpBox(false);
                    return;
                }
                c196871120v.LLJJIJI = 1;
                if (c196871120v.LLIZLLLIL != null) {
                    c196874120y.LLILZIL = false;
                }
                InterfaceC19629711r5<C196874120y> interfaceC19629711r5 = c196871120v.LLJILJILJ;
                if (interfaceC19629711r5 != null) {
                    interfaceC19629711r5.LIZ(c196874120y);
                }
                SafeHandler safeHandler = c196871120v.LLIZ;
                if (safeHandler != null && c196871120v.LLILZLL != null) {
                    safeHandler.postDelayed(new ARunnableS129S0100000_29(c196871120v, 165), 300L);
                }
                boolean z = c196871120v.LLJJIII.LIZ.LLJILJILJ;
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", "video_edit_page");
                c0lab.LJ("shoot_way", c196871120v.LLJ.mShootWay);
                c0lab.LJ("creation_id", c196871120v.LLJ.getCreationId());
                c0lab.LJ("content_type", c196871120v.LLJ.getAvetParameter().getContentType());
                c0lab.LJ("content_source", c196871120v.LLJ.getAvetParameter().getContentSource());
                c0lab.LJ("prop_id", c196871120v.LLJJIII.LIZ.LLILLL.stickerId);
                c0lab.LIZ(z ? 1 : 0, "is_diy_prop");
                C2341909Fp.LIZ("prop_pin", c0lab.LIZ);
            }

            @Override // X.C122J, X.C122M
            public final void LJFF() {
                InterfaceC391240FVq interfaceC391240FVq;
                Object next;
                DonationStickerModel donationStickerModel;
                C196871120v c196871120v = this.LIZ;
                C1DRG c1drg = c196871120v.LLJI;
                StickerItemModel stickerItemModel = c196871120v.LLJZ.LJIILIIL;
                if (c1drg == null || stickerItemModel == null || stickerItemModel.type != 7 || !C0FWJ.LIZIZ() || (interfaceC391240FVq = (InterfaceC391240FVq) c1drg.LJIIL(null, InterfaceC391240FVq.class)) == null) {
                    return;
                }
                new Object() { // from class: X.11r6
                }.getClass();
                List<StickerModel> listLLLILZLLLI = interfaceC391240FVq.LLLILZLLLI(EnumC1466150oFx.DONATION);
                ArrayList arrayList = new ArrayList();
                for (StickerModel stickerModel : listLLLILZLLLI) {
                    if (stickerModel instanceof DonationStickerModel) {
                        arrayList.add(stickerModel);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                new Object() { // from class: X.11r6
                }.getClass();
                int i = 1;
                if (arrayList.size() == 1) {
                    donationStickerModel = (DonationStickerModel) ListProtector.get(arrayList, 0);
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((DonationStickerModel) next).getId() == stickerItemModel.getId()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    donationStickerModel = (DonationStickerModel) next;
                }
                if (donationStickerModel != null) {
                    C19629811r6 c19629811r6 = new Object() { // from class: X.11r6
                    };
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c1drg.LJIIL(null, VideoPublishEditModel.class);
                    c19629811r6.getClass();
                    int displayStyle = donationStickerModel.getDisplayStyle();
                    int displayStyle2 = donationStickerModel.getDisplayStyle();
                    if (displayStyle2 == 1) {
                        i = 2;
                    } else if (displayStyle2 == 2) {
                        i = 3;
                    } else if (displayStyle2 == 3) {
                        i = 4;
                    }
                    DonationStickerModel donationStickerModelCopy = donationStickerModel.copy(donationStickerModel.baseStickerModel, donationStickerModel.visible, donationStickerModel.clickable, donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, i, donationStickerModel.initialTransformScale, donationStickerModel.legacyDonationNoDisplayStyleAttr, donationStickerModel.isDynamicRender);
                    interfaceC391240FVq.k3(donationStickerModelCopy, EnumC356070Dxd.COMMIT);
                    new C1466170oFz(videoPublishEditModel).LIZIZ(displayStyle, i, donationStickerModelCopy);
                }
            }
        });
        this.LLJZIJLIL = new PointF();
        this.LLLFF = c0.LIZ.n2();
        this.LLLFZ = C1658670tGT.LIZ;
        this.LLLI = true;
        this.LLLII = false;
        this.LLLIIII = new ARunnableS129S0100000_29(this, 81);
    }

    public final void LJFF(float f, float f2) {
        int iLLL;
        C196870120u c196870120u = this.LLIZLLLIL;
        if (c196870120u != null && !C0IKQ.LIZ(c196870120u.LIZ)) {
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZLL;
            if (interfaceC1452170ntP != null) {
                iLLL = interfaceC1452170ntP.LLL();
            } else {
                iLLL = 0;
            }
            for (C196874120y c196874120y : (ArrayList) this.LLIZLLLIL.LIZ) {
                C196870120u c196870120u2 = this.LLIZLLLIL;
                c196870120u2.getClass();
                StickerItemModel stickerItemModel = c196874120y.LLILLL;
                if ((iLLL >= stickerItemModel.startTime && iLLL <= stickerItemModel.endTime) || c196874120y.equals(c196870120u2.LIZIZ)) {
                    if (!this.LLIZLLLIL.LJ(c196874120y) && LIZIZ(c196874120y, f, f2)) {
                        C196874120y c196874120y2 = this.LLJJIII.LIZ;
                        if (c196874120y2 != null) {
                            this.LLIZLLLIL.getClass();
                            if (c196874120y.LLILLL.layerWeight - c196874120y2.LLILLL.layerWeight > 0) {
                            }
                        }
                        String str = c196874120y.LLILLL.extra;
                        if (str == null || !str.contains("donot_move")) {
                            C19671311xn c19671311xn = this.LLJJIII;
                            c19671311xn.LIZ = c196874120y;
                            c19671311xn.LIZIZ = c196874120y.LLILZIL;
                        }
                    }
                }
            }
            this.LLIZLLLIL.LJIIIZ(this.LLJJIII.LIZ);
            C19671311xn c19671311xn2 = this.LLJJIII;
            if (c19671311xn2 != null && c19671311xn2.LIZ != null) {
                StickerItemModel stickerItemModel2 = new StickerItemModel();
                C196874120y c196874120y3 = this.LLJJIII.LIZ;
                if (c196874120y3 != null) {
                    stickerItemModel2 = c196874120y3.LLILLL;
                }
                new C121S(stickerItemModel2.currentOffsetX, stickerItemModel2.currentOffsetY);
            }
        }
    }

    public final void LJIIIIZZ(final InfoStickerModel infoStickerModel, final boolean z) {
        if (this.LLILLL != 0 && this.LLILZ != 0) {
            C196870120u c196870120u = this.LLIZLLLIL;
            if (c196870120u != null) {
                c196870120u.LIZ(infoStickerModel, z);
                return;
            }
            return;
        }
        C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.121C
            public boolean LL;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C196870120u c196870120u2;
                this.LLILZ.LIZJ();
                C196871120v c196871120v = this.LLILZ;
                if (c196871120v.LLILLL <= 0 || c196871120v.LLILZ <= 0 || this.LL || (c196870120u2 = c196871120v.LLIZLLLIL) == null) {
                    return;
                }
                c196870120u2.LIZ(infoStickerModel, z);
                this.LL = true;
                C786410Ut5.C3(this.LLILZ.getViewTreeObserver(), this);
            }
        });
    }

    public final boolean LIZIZ(C196874120y c196874120y, float f, float f2) {
        if (c196874120y.LLJ == null) {
            return false;
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new Point(0, 0);
        }
        this.LLILZIL.set((int) f, (int) f2);
        C121Q.LIZJ(this.LLILZIL, c196874120y.LLJ.centerX(), c196874120y.LLJ.centerY(), -c196874120y.LLILLL.rotateAngle);
        RectF rectF = c196874120y.LLJ;
        Point point = this.LLILZIL;
        return rectF.contains(point.x, point.y);
    }
}
