package X;

import X.C830490Whz;
import Y.ACListenerS163S0100000_29;
import Y.ACallableS432S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS10S0202000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS48S0110000_29;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import nv7.c0;

/* JADX INFO: renamed from: X.121W, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C121W implements InterfaceC1444160ngU, C121U {
    public C19GS LL;
    public AbstractC214814194y LLILLJJLI;
    public C121Z LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public C19471411Fw LLILZLL;
    public C12UW LLIZ;
    public ImageView LLIZLLLIL;
    public ImageView LLJ;
    public ImageView LLJI;
    public CutMultiVideoViewModel LLJIJIL;
    public View LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public SeekBar LLJJ;
    public ViewGroup LLJJI;
    public InterfaceC1452170ntP LLJJIII;
    public FTCInfoStickerViewModel LLJJIJI;
    public VideoPublishEditModel LLJJIJIIJIL;
    public View LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public List<MediaModel> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public SafeHandler LLJJL;
    public C121O LLJJLIIIJLLLLLLLZ;
    public FrameLayout LLJL;
    public MutableLiveData<Bitmap> LLJLIL;
    public MutableLiveData<Boolean> LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public InterfaceC1453510nvZ LLJLLL;
    public C196882121g LLJZIJLIL;
    public C121I LLL;
    public boolean LLLFF;
    public boolean LLLFFI;
    public C196878121c LLLFZ;
    public C19560811fy LLLI;
    public FTCEditCornerViewModel LLLII;
    public final InterfaceC1455860nzM LLLIIII;
    public final CreativeInfo LLLIIIIL;
    public boolean LLLIIIL;
    public final ARunnableS129S0100000_29 LLJZ = new ARunnableS129S0100000_29(this, 43);
    public final C830490Whz LLLF = new C830490Whz();

    public final void LIZJ() {
        InterfaceC1452170ntP interfaceC1452170ntP;
        if (this.LLJJJJ || (interfaceC1452170ntP = this.LLJJIII) == null) {
            return;
        }
        this.LLJJJJ = true;
        int duration = interfaceC1452170ntP.getDuration();
        this.LLJIJIL = (CutMultiVideoViewModel) C1659630tI1.LIZLLL(this.LLIZ).get(CutMultiVideoViewModel.class);
        this.LLIZ.setCanEdit(false);
        this.LLIZ.setMinVideoLength(100L);
        this.LLIZ.setMaxVideoLength(duration);
        this.LLJIJIL.LLJILJIL = this.LLJJIJIIJIL.isMvThemeVideoType();
        this.LLJIJIL.LLJILJILJ = duration;
        this.LLIZ.setFirstFrameVisibleLiveData(this.LLJLILLLLZIIL);
        this.LLIZ.setFirstFrameBitmapLiveData(this.LLJLIL);
        this.LLIZ.setVeEditor(this.LLJJIII);
        int frameWidth = this.LLIZ.getFrameWidth();
        int frameHeight = this.LLIZ.getFrameHeight();
        int iCeil = (int) Math.ceil((C12ES.LJIIJ(this.LL) - (this.LLIZ.getLeftRightMargin() * 2)) / (frameWidth * 1.0f));
        VEEditor.GET_FRAMES_FLAGS get_frames_flags = C1446620nkS.LIZ() ? VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL : VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
        this.LLLI = this.LLJJIJIIJIL.isMultiVideoEdit() ? new C19560811fy(new VEMultiEditVideoCoverGeneratorImpl(this.LLJJIII, this.LL, iCeil, this.LLJJIII.getDuration(), (int) this.LLJJIJIIJIL.getMultiEditVideoStartTime(), get_frames_flags), frameWidth, frameHeight, iCeil) : new C19560811fy(new VEVideoCoverGeneratorImpl(this.LLJJIII, this.LLILLJJLI, iCeil, get_frames_flags, "sticker_select_time"), frameWidth, frameHeight, iCeil);
        C12UW c12uw = this.LLIZ;
        AbstractC214814194y abstractC214814194y = this.LLILLJJLI;
        ViewModelProvider viewModelProviderLJFF = C1659630tI1.LJFF(abstractC214814194y);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJIJIL;
        C19560811fy c19560811fy = this.LLLI;
        List<MediaModel> list = this.LLJJJJJIL;
        c12uw.LLLFZ = c19560811fy;
        c12uw.LLLI = true;
        c12uw.LJII(abstractC214814194y, viewModelProviderLJFF, cutMultiVideoViewModel, list);
        this.LLIZ.setEnableBoundaryText(true);
        this.LLIZ.setPointerType(2);
    }

    @Override // X.C121U
    public final boolean LIZ() {
        MutableLiveData<Boolean> mutableLiveData = this.LLJJIJI.LLILZ;
        if (mutableLiveData == null || mutableLiveData.getValue() == null) {
            return false;
        }
        return mutableLiveData.getValue().booleanValue();
    }

    public final boolean LIZIZ() {
        C196880121e c196880121e;
        List<AnonymousClass1219> list;
        this.LLILLL.LLJJJIL.LJII();
        C121Z c121z = this.LLILLL;
        if (c121z == null || (c196880121e = c121z.LLILZIL) == null || (list = c196880121e.LIZ) == null || ((ArrayList) list).size() <= 0) {
            return false;
        }
        boolean z = false;
        for (AnonymousClass1219 anonymousClass1219 : (ArrayList) this.LLILLL.LLILZIL.LIZ) {
            if (anonymousClass1219.LL) {
                anonymousClass1219.LL = false;
                z = true;
            }
        }
        if (z) {
            C121Z c121z2 = this.LLILLL;
            c121z2.LLJJIJIL = false;
            c121z2.invalidate();
        }
        return z;
    }

    public final boolean LIZLLL() {
        C121I c121i = this.LLL;
        if (c121i instanceof AnonymousClass1219) {
            return true;
        }
        if ((c121i instanceof C196925122x) || (c121i instanceof C19610711o1) || (c121i instanceof C121V)) {
            return false;
        }
        C365090ETb.LIZIZ();
        return false;
    }

    public final void LJ() {
        if (this.LLLFF) {
            C0WIY<Long, Long> playBoundary = this.LLIZ.getPlayBoundary();
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJIII;
            Objects.requireNonNull(playBoundary.LIZ);
            this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZIZ(interfaceC1452170ntP.Te(r0.intValue())));
            int iMax = Math.max(playBoundary.LIZ.intValue(), 0);
            Long l = playBoundary.LIZIZ;
            Objects.requireNonNull(l);
            LJIILIIL(iMax, Math.min(l.intValue(), this.LLJJIII.getDuration()));
        }
    }

    public final void LJFF() {
        if (!this.LLLFF || this.LLJJIII == null) {
            return;
        }
        if (this.LLJJJJLIIL) {
            LJIIIZ();
        }
        LJIILIIL(0, this.LLJJIII.getDuration());
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJIII;
        Objects.requireNonNull(this.LLIZ.getPlayBoundary().LIZ);
        this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZIZ(interfaceC1452170ntP.Te(r0.intValue())));
    }

    public final void LJIIIZ() {
        C196925122x c196925122x;
        boolean z = !this.LLJJJJLIIL;
        this.LLJJJJLIIL = z;
        LJIIJ(z);
        LJIIJJI();
        C196882121g c196882121g = this.LLJZIJLIL;
        if (c196882121g != null) {
            boolean z2 = this.LLJJJJLIIL;
            ((FTCEditTextStickerViewModel) c196882121g.LIZ.LLJJI.getValue()).iJ2(C121Y.LLLII(z2), false);
            if (!z2) {
                C121I c121i = c196882121g.LIZ.LLLIILIL().LLL;
                if ((c121i instanceof C196925122x) && (c196925122x = (C196925122x) c121i) != null) {
                    c196925122x.LJJIII(C121Y.LLLII(true), false);
                }
            }
        }
        if (this.LLJJJJLIIL) {
            this.LLJI.setImageDrawable(this.LL.getResources().getDrawable(R.drawable.awo));
            this.LLJJL.post(this.LLJZ);
            this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZ());
        } else {
            this.LLJI.setImageDrawable(this.LL.getResources().getDrawable(R.drawable.awp));
            this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZIZ(this.LLJJIII.LLL()));
            this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZJ());
            this.LLJJL.removeCallbacks(this.LLJZ);
            C121I c121i2 = this.LLL;
            if (c121i2 != null) {
                c121i2.setAlpha(true);
            }
        }
        this.LLIZ.LJJIJ(true ^ this.LLJJJJLIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.11Fw, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIIJJI() {
        ?? r4;
        ?? string;
        if (this.LLJJJJLIIL) {
            string = this.LLILZLL.getContext().getResources().getString(2131849916);
        } else {
            float selectedTime = this.LLIZ.getSelectedTime();
            int string2 = 1;
            boolean z = (1000.0f * selectedTime) * 0.99f < ((float) this.LLIZ.getMinVideoLength());
            String strK4 = C786410Ut5.k4(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(selectedTime)});
            try {
                string2 = this.LLILZLL.getContext().getResources().getString(2131836172, strK4);
                r4 = string2;
            } catch (FormatFlagsConversionMismatchException e) {
                TryCatchGuardChecker.doCheck(e);
                Resources resources = this.LLILZLL.getContext().getResources();
                Object[] objArr = new Object[string2];
                objArr[0] = strK4;
                String string3 = resources.getString(2131836171, objArr);
                try {
                    C543670LTx c543670LTx = new C543670LTx();
                    c543670LTx.LIZ.put("exception", C1331420kke.LIZ(e));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("normal_str=");
                    sbLIZ.append(string3);
                    sbLIZ.append(", error_str=");
                    sbLIZ.append(this.LLILZLL.getContext().getResources().getString(2131836172));
                    c543670LTx.LIZ.put("event", C2188811AlT.LIZIZ(sbLIZ));
                    C1637890six.LIZIZ("info_sticker_string_format_event", c543670LTx.LJ());
                    r4 = string3;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C201955140j.LJ(e2.getLocalizedMessage());
                    r4 = string3;
                }
            }
            if (z) {
                SpannableString spannableString = new SpannableString(r4);
                int iIndexOf = r4.indexOf(strK4);
                int iIndexOf2 = r4.indexOf(strK4) + strK4.length();
                int color = this.LLILZLL.getResources().getColor(R.color.ct);
                int iMax = Math.max(0, iIndexOf);
                boolean zIsEmpty = TextUtils.isEmpty(spannableString);
                string = spannableString;
                string = spannableString;
                if (!zIsEmpty && iMax <= iIndexOf2) {
                    int length = spannableString.length();
                    string = spannableString;
                    if (iMax < length) {
                        int length2 = spannableString.length();
                        string = spannableString;
                        if (iIndexOf2 <= length2) {
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(color), iMax, iIndexOf2, 17);
                            string = spannableString;
                        }
                    }
                }
            } else {
                string = r4;
            }
        }
        this.LLILZLL.setText(string);
    }

    @Override // X.C121U
    public final boolean LLLLZLLIL() {
        MutableLiveData<Boolean> mutableLiveData = this.LLJJIJI.LLILLL;
        if (mutableLiveData == null || mutableLiveData.getValue() == null) {
            return false;
        }
        return mutableLiveData.getValue().booleanValue();
    }

    public final void LJIIJ(boolean z) {
        C196880121e c196880121e = this.LLILLL.LLILZIL;
        if (c196880121e != null) {
            if (z) {
                Iterator it2 = ((ArrayList) c196880121e.LIZ).iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    C352130DrH.LIZIZ(c196880121e.LIZJ).LJIIIZ();
                    next.getClass();
                    throw null;
                }
            } else {
                Iterator it3 = ((ArrayList) c196880121e.LIZ).iterator();
                if (it3.hasNext()) {
                    Object next2 = it3.next();
                    C352130DrH.LIZIZ(c196880121e.LIZJ).LJIIIZ();
                    next2.getClass();
                    throw null;
                }
            }
        }
        if (this.LLL != null && LIZLLL()) {
            this.LLL.setAlpha(true);
        }
    }

    @Override // X.InterfaceC1444160ngU
    public final boolean ve1(RectF rectF) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        VideoPublishEditModel videoPublishEditModel = this.LLJJIJIIJIL;
        if (videoPublishEditModel != null && videoPublishEditModel.hasInfoStickers() && (interfaceC1452170ntP = this.LLJJIII) != null) {
            VESize initSize = interfaceC1452170ntP.getInitSize();
            RectF rectF2 = new RectF();
            for (StickerItemModel stickerItemModel : this.LLJJIJIIJIL.getInfoStickerModel().stickers) {
                if (stickerItemModel.isImageSticker()) {
                    return true;
                }
                try {
                    float[] fArrLIZJ = C352130DrH.LIZIZ(this.LLJJIII).LJIIIZ().LIZ().LIZJ(stickerItemModel.uuid);
                    float f = fArrLIZJ[0];
                    float f2 = initSize.width;
                    float f3 = fArrLIZJ[3];
                    float f4 = initSize.height;
                    rectF2.set(f * f2, f3 * f4, fArrLIZJ[2] * f2, fArrLIZJ[1] * f4);
                    if (rectF2.top < rectF.top || rectF2.bottom > rectF.bottom) {
                        return true;
                    }
                } catch (VEException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getInfoStickerBoundingBox error, index is ");
                    sbLIZ.append(stickerItemModel.getId());
                    sbLIZ.append(" veState is ");
                    VEEditor.VEState state = this.LLJJIII.getState();
                    Objects.requireNonNull(state);
                    sbLIZ.append(state.getValue());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return false;
    }

    public C121W(InterfaceC1455860nzM interfaceC1455860nzM, CreativeInfo creativeInfo) {
        this.LLLIIII = interfaceC1455860nzM;
        this.LLLIIIIL = creativeInfo;
    }

    public final void LJII(boolean z, C121I c121i) {
        this.LLLFF = z;
        if (z && this.LLLIIIL && this.LLJJJJ) {
            this.LLLIIIL = false;
            this.LLJJJJJIL = this.LLJJIJIIJIL.getMediaModelList();
            C19560811fy c19560811fy = this.LLLI;
            if (c19560811fy != null) {
                c19560811fy.LIZIZ();
            }
            this.LLIZ.LIZLLL(null, C571930Mbv.LIZ(this.LLJJJJJIL, true, null, false, 12));
        }
        boolean z2 = !z;
        FTCEditCornerViewModel fTCEditCornerViewModel = this.LLLII;
        if (fTCEditCornerViewModel != null) {
            fTCEditCornerViewModel.Ip0(z2);
        }
        if (!this.LLJJJIL) {
            this.LLJJJIL = true;
            C786410Ut5.Q7(this.LLIZLLLIL, new ACListenerS163S0100000_29(this, 188));
            C786410Ut5.Q7(this.LLJ, new ACListenerS163S0100000_29(this, 189));
            C786410Ut5.Q7(this.LLJI, new ACListenerS163S0100000_29(this, 190));
            LIZJ();
            VideoEditViewModel videoEditViewModel = this.LLIZ.getVideoEditViewModel();
            videoEditViewModel.LLILLL.observe(this.LLILLJJLI, new AObserverS231S0100000_29(this, 136));
            videoEditViewModel.LLILZLL.observe(this.LLILLJJLI, new AObserverS231S0100000_29(this, 137));
            videoEditViewModel.LLJIJIL.observe(this.LLILLJJLI, new AObserverS231S0100000_29(this, 130));
            videoEditViewModel.LLJ.observe(this.LLILLJJLI, new AObserverS231S0100000_29(this, 131));
            videoEditViewModel.LLJI.observe(this.LLILLJJLI, new AObserverS231S0100000_29(this, 132));
            videoEditViewModel.LLIZ.observe(this.LLILLJJLI, new AObserverS231S0100000_29(this, 133));
            videoEditViewModel.LLIZLLLIL.observe(this.LLILLJJLI, new AObserverS231S0100000_29(this, 134));
            videoEditViewModel.LLILZIL.observe(this.LLILLJJLI, new AObserverS231S0100000_29(this, 135));
        }
        LJIIJ(z2);
        LJIIIIZZ(c121i, 0);
        int height = this.LLILZIL.getHeight();
        this.LLJLLIL = height;
        if (height == 0) {
            this.LLJLLIL = (int) C12ES.LIZJ(208.0f, this.LL);
        }
        int iLIZJ = this.LLJLLIL + ((int) C12ES.LIZJ(16.0f, this.LL));
        this.LLJLLIL = iLIZJ;
        View view = this.LLILZIL;
        C1462750oAT.LIZIZ(view, z, iLIZJ, view, new C19773812Ye(this, z, 5));
        C196882121g c196882121g = this.LLJZIJLIL;
        if (c196882121g != null) {
            c196882121g.LIZ(z);
        }
        if (z) {
            this.LLJJIJI.vQ2().setValue(C1453160nv0.LIZ(C19733712It.LIZIZ(true, false, false, false), ScreenUtils.getStatusBarHeight(this.LL), this.LLJLLIL, ((ScreenUtils.getFullScreenHeight(this.LL) - this.LLJLLIL) - ScreenUtils.getStatusBarHeight(this.LL)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL), c0.LIZ.n2()));
            ImageView imageView = this.LLJI;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(R.drawable.awp));
            this.LLJI.setEnabled(true);
            this.LLIZ.setEnabled(true);
            this.LLIZ.LJJIJ(true);
            this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZLLL(0L));
            return;
        }
        this.LLJI.setEnabled(false);
        this.LLIZ.setEnabled(false);
        this.LLJJL.removeCallbacks(this.LLJZ);
        this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZJ());
        MutableLiveData<C1453160nv0> mutableLiveDataVQ2 = this.LLJJIJI.vQ2();
        int color = this.LLILLL.getResources().getColor(R.color.b6);
        int statusBarHeight = ScreenUtils.getStatusBarHeight(this.LL);
        int i = this.LLJLLIL;
        int fullScreenHeight = ((ScreenUtils.getFullScreenHeight(this.LL) - this.LLJLLIL) - ScreenUtils.getStatusBarHeight(this.LL)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL);
        c0.LIZ.n2();
        mutableLiveDataVQ2.setValue(C1453170nv1.LIZ(color, statusBarHeight, i, fullScreenHeight));
        this.LLJJJJLIIL = false;
    }

    public final void LJIIIIZZ(C121I c121i, int i) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        InterfaceC1452170ntP interfaceC1452170ntP2;
        if (c121i == this.LLL) {
            return;
        }
        if (c121i != null) {
            if (!this.LLLF.containsKey(c121i)) {
                this.LLLF.put(c121i, c121i.LIZJ());
            }
            c121i.setAlpha(true);
            if (c121i instanceof AnonymousClass1219) {
                this.LLJJL.post(new ARunnableS129S0100000_29(this, 134));
            }
            if (this.LLJJJIL && i == 0 && this.LLJJIII != null) {
                int iLJFF = c121i.LJFF();
                int iLIZ = c121i.LIZ(this.LLJJIII.mo51if());
                if (iLJFF >= 0 && iLIZ >= 0 && !LJIIL(iLJFF, iLIZ, c121i)) {
                    this.LLJJL.postDelayed(new ARunnableS10S0202000_29(this, iLJFF, iLIZ, c121i, 2), 300L);
                }
                LJIIJJI();
            }
            C121I c121i2 = this.LLL;
            if (c121i2 != null) {
                if (i != 0) {
                    if (i == 1 && this.LLJJJ) {
                        c121i2.setAlpha(false);
                    }
                } else if (this.LLJJJIL) {
                    c121i2.setAlpha(false);
                }
                if ((this.LLL instanceof AnonymousClass1219) && (interfaceC1452170ntP2 = this.LLJJIII) != null) {
                    interfaceC1452170ntP2.refreshCurrentFrame();
                }
            }
            if (i == 1 && (interfaceC1452170ntP = this.LLJJIII) != null) {
                this.LLJJ.setProgress((int) (((this.LLJJIII.LLL() - c121i.LIZLLL(0)) / (c121i.LIZIZ(interfaceC1452170ntP.getDuration()) - c121i.LIZLLL(0))) * 100.0f));
            }
        } else {
            for (Map.Entry entry : (C830490Whz.a) this.LLLF.entrySet()) {
                C121I c121i3 = (C121I) entry.getKey();
                InterfaceC384940F7k interfaceC384940F7k = (InterfaceC384940F7k) entry.getValue();
                if (c121i3 != null && interfaceC384940F7k != null) {
                    C121Z c121z = this.LLILLL;
                    c121i3.LJ(interfaceC384940F7k, c121z.LL, c121z.LLILLJJLI);
                }
            }
            this.LLLF.clear();
        }
        this.LLL = c121i;
    }

    public final void LJIILIIL(int i, int i2) {
        LJIIJJI();
        if (this.LLL != null && this.LLJJIII != null) {
            if (LIZLLL()) {
                C121Z c121z = this.LLILLL;
                C121I c121i = this.LLL;
                if (c121z.LLILZIL != null && c121i != null) {
                    throw null;
                }
                return;
            }
            C121I c121i2 = this.LLL;
            if (c121i2 instanceof C196925122x) {
                TextStickerData data = ((C196925122x) c121i2).getData();
                if (data != null) {
                    data.setStartTime(i);
                    data.setEndTime(i2);
                    data.setUiStartTime(i);
                    data.setUiEndTime(i2);
                    return;
                }
                return;
            }
            if (c121i2 instanceof C19610711o1) {
                CommentVideoModel data2 = ((C19610711o1) c121i2).getData();
                if (data2 != null) {
                    data2.setStartTime(i);
                    data2.setEndTime(i2);
                    return;
                }
                return;
            }
            if (c121i2 instanceof C121V) {
                ((C121V) c121i2).LJJLIIIJLJLI();
                ((C121V) this.LLL).LIZIZ();
            }
        }
    }

    public final void LJI(final boolean z, C196874120y c196874120y, final boolean z2) {
        this.LLLFFI = z;
        boolean z3 = !z;
        FTCEditCornerViewModel fTCEditCornerViewModel = this.LLLII;
        if (fTCEditCornerViewModel != null) {
            fTCEditCornerViewModel.Ip0(z3);
        }
        if (!this.LLJJJ) {
            this.LLJJJ = true;
            this.LLJILLL.setTuxFont(42);
            this.LLJILJILJ.setTuxFont(42);
            C786410Ut5.h9(this.LLJILJILJ, new ACListenerS163S0100000_29(this, 186));
            C786410Ut5.h9(this.LLJILLL, new ACListenerS163S0100000_29(this, 187));
            LIZJ();
            C786410Ut5.wb(this.LLJJ, new C12YM(this, 8));
        }
        LJIIJ(z3);
        LJIIIIZZ(c196874120y, 1);
        int height = this.LLJILJIL.getHeight();
        this.LLJLLIL = height;
        if (height == 0) {
            this.LLJLLIL = (int) C12ES.LIZJ(120.0f, this.LL);
        }
        this.LLJJ.setProgress((int) ((this.LLJJIII.LLL() * 100.0f) / this.LLJJIII.getDuration()));
        View view = this.LLJILJIL;
        C1462750oAT.LIZIZ(view, z, this.LLJLLIL, view, new C092O() { // from class: X.121X
            @Override // X.C092O
            public final void accept(Object obj) throws Throwable {
                int i;
                C0KW6 c0kw6;
                C121W c121w = this.LIZ;
                boolean z4 = z;
                boolean z5 = z2;
                c121w.getClass();
                boolean z6 = !z4;
                C121Z c121z = c121w.LLILLL;
                if (z6) {
                    i = 0;
                } else {
                    i = 4;
                }
                int visibility = c121z.getVisibility();
                c121z.setVisibility(i);
                C1602160rnK.LIZIZ(visibility, i, c121z);
                if (z6) {
                    c121w.LLILLL.LIZ();
                }
                if (z4) {
                    c121w.LLILLL.LLIZLLLIL = 1;
                    c121w.LLJJIII.setLoopPlay(true);
                    return;
                }
                c121w.LLILLL.LLIZLLLIL = 0;
                if (z5) {
                    C196878121c c196878121c = c121w.LLLFZ;
                    C19GS c19gs = c121w.LL;
                    if (c19gs == null) {
                        c196878121c.getClass();
                    } else {
                        if (c196878121c.LJIIIZ == null) {
                            c196878121c.LJIIIZ = new C0KW6(c19gs);
                        }
                        C0KW6 c0kw62 = c196878121c.LJIIIZ;
                        if ((c0kw62 == null || !c0kw62.isShowing()) && (c0kw6 = c196878121c.LJIIIZ) != null) {
                            c0kw6.show();
                            C785410UrT.LIZIZ(c0kw6);
                            PopupMonitorServiceImpl.LIZ.getClass();
                            PopupMonitorServiceImpl.LJJJ(c0kw6);
                            C816490W1f.LIZ(c0kw6);
                        }
                    }
                    final C196878121c c196878121c2 = c121w.LLLFZ;
                    c196878121c2.getClass();
                    ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, new IFoundationAVService.IFetchResourcesListener() { // from class: X.121d
                        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                        public final void onFailed(Exception exc) {
                            C196899121x c196899121x = c196878121c2.LJI;
                            if (c196899121x != null) {
                                HandlerHook.viewPost(c196899121x.LIZ.LLILLL, new ARunnableS48S0110000_29(c196899121x, 1));
                            }
                        }

                        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                        public final void onSuccess(String[] strArr) {
                            C15O7.LIZIZ(new ACallableS432S0100000_29(c196878121c2, 7), C15O7.LJIIIIZZ, null).LJ(new C19774512Yl(c196878121c2, 15), C15O7.LJI, null);
                        }
                    });
                    return;
                }
                c121w.LLJJIII.setLoopPlay(true);
                c121w.LLJJIJI.vW1().setValue(C1452730nuJ.LIZ());
            }
        });
        C196882121g c196882121g = this.LLJZIJLIL;
        if (c196882121g != null) {
            c196882121g.LIZ(z);
        }
        if (z) {
            MutableLiveData<C1453160nv0> mutableLiveDataVQ2 = this.LLJJIJI.vQ2();
            int iLIZIZ = C19733712It.LIZIZ(true, false, false, false);
            int i = this.LLJLLIL;
            int fullScreenHeight = (ScreenUtils.getFullScreenHeight(this.LL) - this.LLJLLIL) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL);
            c0.LIZ.n2();
            mutableLiveDataVQ2.setValue(C1453170nv1.LIZIZ(iLIZIZ, 0, i, fullScreenHeight, true, z2, 1536));
            ImageView imageView = this.LLJI;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(R.drawable.awp));
            this.LLJI.setEnabled(true);
            return;
        }
        this.LLJI.setEnabled(false);
        this.LLJJL.removeCallbacks(this.LLJZ);
        this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZJ());
        MutableLiveData<C1453160nv0> mutableLiveDataVQ22 = this.LLJJIJI.vQ2();
        int color = this.LLILLL.getResources().getColor(R.color.b6);
        int statusBarHeight = ScreenUtils.getStatusBarHeight(this.LL);
        int i2 = this.LLJLLIL;
        int fullScreenHeight2 = (ScreenUtils.getFullScreenHeight(this.LL) - this.LLJLLIL) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL);
        c0.LIZ.n2();
        C1453160nv0 c1453160nv0 = new C1453160nv0(0, color);
        c1453160nv0.LIZJ = statusBarHeight;
        c1453160nv0.LIZLLL = i2;
        c1453160nv0.LJ = fullScreenHeight2;
        c1453160nv0.LJII = z2;
        c1453160nv0.LJIIIIZZ = true;
        mutableLiveDataVQ22.setValue(c1453160nv0);
        this.LLJJJJLIIL = false;
    }

    public final boolean LJIIL(int i, int i2, C121I c121i) {
        boolean zLJJJ = this.LLIZ.LJJJ(i, i2, true);
        if (zLJJJ && c121i != null) {
            this.LLJIJIL.LLILLL.setValue(Long.valueOf(c121i.LIZLLL(0)));
            this.LLJJIJI.vW1().setValue(C1452730nuJ.LIZLLL(c121i.LIZLLL(0)));
        }
        return zLJJJ;
    }
}
