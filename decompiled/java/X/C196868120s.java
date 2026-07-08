package X;

import X.C830490Whz;
import Y.ACListenerS163S0100000_29;
import Y.ACallableS432S0100000_29;
import Y.AObjectS349S0100000_5;
import Y.ARunnableS10S0202000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS48S0110000_29;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import nv7.c0;

/* JADX INFO: renamed from: X.120s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196868120s implements InterfaceC1444160ngU, C121U {
    public Context LL;
    public Scene LLILLJJLI;
    public C196871120v LLILLL;
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
    public InterfaceC1452170ntP LLJJIJI;
    public InfoStickerViewModel LLJJIJIIJIL;
    public VideoPublishEditModel LLJJIJIL;
    public View LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public List<MediaModel> LLJJJJLIIL;
    public boolean LLJJL;
    public SafeHandler LLJJLIIIJLLLLLLLZ;
    public C121O LLJL;
    public FrameLayout LLJLIL;
    public MutableLiveData<Bitmap> LLJLILLLLZIIL;
    public MutableLiveData<Boolean> LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public Rect LLJZ;
    public InterfaceC1453510nvZ LLL;
    public C196875120z LLLFFI;
    public C391250FVr LLLFZ;
    public C121M LLLI;
    public C121I LLLII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public AnonymousClass1214 LLLIIL;
    public C19560811fy LLLIILIL;
    public final InterfaceC1455860nzM LLLIL;
    public boolean LLLILZ;
    public final CreativeInfo LLLILZJ;
    public final C1DRG LLLILZLLLI;
    public C1466170oFz LLLIZZ;
    public final boolean LLLJ;
    public int LLJJIII = 30;
    public int LLJZIJLIL = c0.LIZ.n2();
    public final ARunnableS129S0100000_29 LLLF = new ARunnableS129S0100000_29(this, 82);
    public final C12YW LLLFF = new C12YW(this, 10);
    public final C830490Whz LLLIIII = new C830490Whz();
    public C121N LLLJIL = null;
    public boolean LLLJL = false;

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196868120s.LJ():void");
    }

    @Override // X.C121U
    public final boolean LIZ() {
        MutableLiveData<Boolean> mutableLiveData;
        InfoStickerViewModel infoStickerViewModel = this.LLJJIJIIJIL;
        if (infoStickerViewModel == null || (mutableLiveData = infoStickerViewModel.LLILZ) == null || mutableLiveData.getValue() == null) {
            return false;
        }
        return mutableLiveData.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final void LIZIZ() {
        this.LLILLL.LJII();
        this.LLILLL.LLJJ = 0;
        if (LJFF()) {
            C121I c121i = this.LLLII;
            ?? r4 = c121i instanceof C196874120y ? ((C196874120y) c121i).LLJILJILJ : 0;
            ?? c0lab = new C0LAB();
            C121I c121i2 = this.LLLII;
            c0lab.LJ("prop_id", c121i2 instanceof C196874120y ? ((C196874120y) c121i2).LLILLL.stickerId : c121i2 instanceof C196925122x ? "text_sticker" : "");
            c0lab.LJ("creation_id", this.LLJJIJIL.getCreationId());
            c0lab.LJ("content_source", this.LLJJIJIL.getAvetParameter().getContentSource());
            c0lab.LJ("shoot_entrance", this.LLJJIJIL.mShootWay);
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LIZ(-1, "sticker_type");
            c0lab.LIZ(r4, "is_diy_prop");
            if (this.LLJJIJIL.getDraftId() != 0) {
                c0lab.LIZ(this.LLJJIJIL.getDraftId(), "draft_id");
            }
            if (!TextUtils.isEmpty(this.LLJJIJIL.getNewDraftId())) {
                c0lab.LJ("new_draft_id", this.LLJJIJIL.getNewDraftId());
            }
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("prop_timeset_cancel", c0lab.LIZ);
        } else {
            C121I c121i3 = this.LLLII;
            if (c121i3 instanceof C196925122x) {
                TextStickerData data = ((C196925122x) c121i3).getData();
                C20684815ws.LJIILLIIL("text_timeset_cancel", u4.LJFF(this.LLJJIJIL, false, data != null && data.getHasReadTextAudio(), 2).LIZ);
            } else if (c121i3 instanceof C19610711o1) {
                this.LLLIZZ.LJ(4);
            } else if (c121i3 instanceof C121V) {
                this.LLLIZZ.LJ(6);
            } else if (c121i3 instanceof InterfaceC391260FVs) {
                this.LLLIZZ.LJ(((InterfaceC391260FVs) c121i3).LIZJ());
            }
        }
        if (this.LLLJ) {
            LJIIL(false, null);
        } else {
            LJIIJJI(false, null);
        }
        this.LLLFZ.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196868120s.LIZJ():void");
    }

    public final boolean LIZLLL() {
        C196871120v c196871120v = this.LLILLL;
        if (c196871120v != null && c196871120v.LLIZLLLIL != null) {
            c196871120v.LLJZ.LJII();
            List<C196874120y> list = this.LLILLL.LLIZLLLIL.LIZ;
            if (list != null && ((ArrayList) list).size() > 0) {
                boolean z = false;
                for (C196874120y c196874120y : (ArrayList) this.LLILLL.LLIZLLLIL.LIZ) {
                    if (c196874120y.LLILZIL) {
                        c196874120y.LLILZIL = false;
                        z = true;
                    }
                }
                if (z) {
                    C196871120v c196871120v2 = this.LLILLL;
                    c196871120v2.LLJLLIL = false;
                    c196871120v2.invalidate();
                }
                return z;
            }
        }
        return false;
    }

    public final boolean LJFF() {
        C121I c121i = this.LLLII;
        if (c121i instanceof C196874120y) {
            return true;
        }
        return ((c121i instanceof C196925122x) || (c121i instanceof C19610711o1) || !(c121i instanceof C121V)) ? false : false;
    }

    public final void LJII() {
        C12UW c12uw;
        if (!this.LLLIIIIL || this.LLJJIJI == null || (c12uw = this.LLIZ) == null) {
            return;
        }
        C0WIY<Long, Long> playBoundary = c12uw.getPlayBoundary();
        this.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZIZ(this.LLJJIJI.Te(playBoundary.LIZ.intValue())));
        LJJ(Math.max(playBoundary.LIZ.intValue(), 0), Math.min(playBoundary.LIZIZ.intValue(), this.LLJJIJI.getDuration()), false, true);
        LJI();
    }

    public final void LJIIIIZZ() {
        if (!this.LLLIIIIL || this.LLJJIJI == null || this.LLIZ == null) {
            return;
        }
        if (this.LLJJL) {
            LJIIZILJ();
        }
        C0WIY<Long, Long> playBoundary = this.LLIZ.getPlayBoundary();
        long jTe = this.LLJJIJI.Te(this.LLIZ.getPlayBoundary().LIZ.intValue());
        LJJ(Math.max(playBoundary.LIZ.intValue(), 0), Math.min(playBoundary.LIZIZ.intValue(), this.LLJJIJI.getDuration()), true, false);
        this.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZIZ(jTe));
    }

    public final void LJIILLIIL() {
        C121I c121i = this.LLLII;
        if (!(c121i instanceof C196925122x)) {
            C12UW c12uw = this.LLIZ;
            if (c12uw != null) {
                c12uw.LJIIL();
                return;
            }
            return;
        }
        TextStickerData data = ((C196925122x) c121i).getData();
        if (this.LLIZ != null) {
            if (data == null || this.LLJJIJI == null || !data.getHasReadTextAudio()) {
                this.LLIZ.LJIIL();
            } else {
                this.LLIZ.LJJIIZ(data.getAudioTrackDuration(), this.LLJJIJI.mo51if());
            }
        }
    }

    public final void LJIIZILJ() {
        boolean z = !this.LLJJL;
        this.LLJJL = z;
        LJIJ(z);
        LJIJJ();
        C391250FVr c391250FVr = this.LLLFZ;
        if (c391250FVr != null) {
            c391250FVr.LIZ(this.LLJJL);
        }
        if (this.LLJJL) {
            Context context = this.LL;
            if (context != null) {
                this.LLJI.setImageDrawable(context.getResources().getDrawable(R.drawable.awo));
            }
            this.LLJJLIIIJLLLLLLLZ.post(this.LLLF);
            this.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZ());
            C12UW c12uw = this.LLIZ;
            if (c12uw != null) {
                c12uw.LJIIL();
            }
        } else {
            Context context2 = this.LL;
            if (context2 != null) {
                this.LLJI.setImageDrawable(context2.getResources().getDrawable(R.drawable.awp));
            }
            if (this.LLJJIJI != null) {
                this.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZIZ(this.LLJJIJI.LLL()));
            }
            this.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZJ());
            this.LLJJLIIIJLLLLLLLZ.removeCallbacks(this.LLLF);
            C121I c121i = this.LLLII;
            if (c121i != null) {
                c121i.setHighlightState(EnumC390580FTc.EMPHASIZED);
                C121I c121i2 = this.LLLII;
                if (c121i2 instanceof C196925122x) {
                    TextStickerData data = ((C196925122x) c121i2).getData();
                    if (this.LLIZ != null && data != null && this.LLJJIJI != null && data.getHasReadTextAudio()) {
                        C12UW c12uw2 = this.LLIZ;
                        C786410Ut5.x3(c12uw2.LLJZIJLIL.getViewTreeObserver(), new C122E(c12uw2, data.getAudioTrackDuration(), this.LLJJIJI.mo51if()));
                    }
                }
            }
        }
        C12UW c12uw3 = this.LLIZ;
        if (c12uw3 != null) {
            c12uw3.LJJIJ(!this.LLJJL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.11Fw, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
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
    public final void LJIJJ() {
        C19471411Fw c19471411Fw;
        if (this.LLJJL && (c19471411Fw = this.LLILZLL) != null) {
            String string = c19471411Fw.getContext().getResources().getString(2131849916);
            C19471411Fw c19471411Fw2 = this.LLILZLL;
            if (c19471411Fw2 != null) {
                c19471411Fw2.setText(string);
                return;
            }
            return;
        }
        C12UW c12uw = this.LLIZ;
        if (c12uw != null) {
            float selectedTime = c12uw.getSelectedTime();
            boolean z = (1000.0f * selectedTime) * 0.99f < ((float) this.LLIZ.getMinVideoLength());
            String strK4 = C786410Ut5.k4(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(selectedTime)});
            C19471411Fw c19471411Fw3 = this.LLILZLL;
            String string2 = "";
            ?? r7 = string2;
            if (c19471411Fw3 != null) {
                try {
                    string2 = c19471411Fw3.getContext().getResources().getString(2131836172, strK4);
                    r7 = string2;
                } catch (FormatFlagsConversionMismatchException e) {
                    TryCatchGuardChecker.doCheck(e);
                    String string3 = this.LLILZLL.getContext().getResources().getString(2131836171, strK4);
                    try {
                        C19471411Fw c19471411Fw4 = this.LLILZLL;
                        String string4 = string2;
                        if (c19471411Fw4 != null) {
                            string4 = c19471411Fw4.getContext().getResources().getString(2131836172);
                        }
                        C543670LTx c543670LTx = new C543670LTx();
                        c543670LTx.LIZ.put("exception", C1331420kke.LIZ(e));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("normal_str=");
                        sbLIZ.append(string3);
                        sbLIZ.append(", error_str=");
                        sbLIZ.append(string4);
                        c543670LTx.LIZ.put("event", C2188811AlT.LIZIZ(sbLIZ));
                        C1637890six.LIZIZ("info_sticker_string_format_event", c543670LTx.LJ());
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C201955140j.LJ(e2.getLocalizedMessage());
                    }
                    r7 = string3;
                }
            }
            if (z && this.LLILZLL != null) {
                SpannableString spannableString = new SpannableString(r7);
                int iIndexOf = r7.indexOf(strK4);
                int iIndexOf2 = r7.indexOf(strK4) + strK4.length();
                int color = this.LLILZLL.getResources().getColor(R.color.ct);
                int iMax = Math.max(0, iIndexOf);
                if (!TextUtils.isEmpty(spannableString) && iMax <= iIndexOf2 && iMax < spannableString.length() && iIndexOf2 <= spannableString.length()) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(color), iMax, iIndexOf2, 17);
                }
                r7 = spannableString;
            }
            ?? r0 = this.LLILZLL;
            if (r0 != 0) {
                r0.setText(r7);
            }
        }
    }

    @Override // X.C121U
    public final boolean LLLLZLLIL() {
        MutableLiveData<Boolean> mutableLiveData;
        InfoStickerViewModel infoStickerViewModel = this.LLJJIJIIJIL;
        if (infoStickerViewModel == null || (mutableLiveData = infoStickerViewModel.LLILLL) == null || mutableLiveData.getValue() == null) {
            return false;
        }
        return mutableLiveData.getValue().booleanValue();
    }

    public final void LJI() {
        if (LJFF()) {
            C121I c121i = this.LLLII;
            C0LAB c0labLJFF = u4.LJFF(this.LLJJIJIL, c121i instanceof C196874120y ? ((C196874120y) c121i).LLJILJILJ : false, false, 4);
            c0labLJFF.LIZ(-1, "sticker_type");
            C20684815ws.LJIILLIIL("prop_duration_adjust", c0labLJFF.LIZ);
            return;
        }
        C121I c121i2 = this.LLLII;
        if (c121i2 instanceof C196925122x) {
            u4.LJJLIIIJLLLLLLLZ(this.LLJJIJI, this.LLJJIJIL);
            return;
        }
        if (c121i2 instanceof C121V) {
            this.LLLIZZ.LIZLLL(6);
        } else if (c121i2 instanceof C19610711o1) {
            this.LLLIZZ.LIZLLL(4);
        } else if (c121i2 instanceof InterfaceC391260FVs) {
            this.LLLIZZ.LIZLLL(((InterfaceC391260FVs) c121i2).LIZJ());
        }
    }

    public final void LJIIJ(C121I c121i) {
        String str;
        if (c121i != null && (c121i instanceof C196874120y)) {
            boolean z = ((C196874120y) c121i).LLJILJILJ;
            if (this.LLJJIJIL != null) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("prop_id", ((C196874120y) c121i).LLILLL.stickerId);
                c0lab.LJ("creation_id", this.LLJJIJIL.getCreationId());
                if (this.LLLII == null) {
                    str = "click";
                } else {
                    str = "change";
                }
                c0lab.LJ("method", str);
                c0lab.LJ("content_type", this.LLJJIJIL.getAvetParameter().getContentType());
                c0lab.LJ("content_source", this.LLJJIJIL.getAvetParameter().getContentSource());
                c0lab.LJ("shoot_entrance", this.LLJJIJIL.mShootWay);
                c0lab.LJ("enter_from", "video_edit_page");
                c0lab.LIZ(-1, "sticker_type");
                c0lab.LIZ(z ? 1 : 0, "is_diy_prop");
                if (this.LLJJIJIL.getDraftId() != 0) {
                    c0lab.LIZ(this.LLJJIJIL.getDraftId(), "draft_id");
                }
                if (!TextUtils.isEmpty(this.LLJJIJIL.getNewDraftId())) {
                    c0lab.LJ("new_draft_id", this.LLJJIJIL.getNewDraftId());
                }
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C2341909Fp.LIZ("prop_time_set", c0lab.LIZ);
            }
        }
    }

    public final void LJIILIIL(C121I c121i) {
        InterfaceC19657911vd interfaceC19657911vdUp0;
        int duration = 0;
        if (this.LLLJ) {
            LJIILL(c121i);
            if (c121i != null) {
                C121N c121n = this.LLLJIL;
                InterfaceC391240FVq interfaceC391240FVqLLLIZZ = c121n.LIZ.LLLIZZ();
                if (interfaceC391240FVqLLLIZZ != null && (interfaceC19657911vdUp0 = interfaceC391240FVqLLLIZZ.up0()) != null) {
                    float fLIZLLL = c121i.LIZLLL(0);
                    InterfaceC1452170ntP value = c121n.LIZ.LLLILZ().g().getValue();
                    if (value != null) {
                        duration = value.getDuration();
                    }
                    interfaceC19657911vdUp0.LIZLLL(fLIZLLL, c121i.LIZIZ(duration));
                    return;
                }
                return;
            }
            LJIILLIIL();
            return;
        }
        LJIILJJIL(c121i, 0);
        LJIILLIIL();
    }

    public final void LJIILL(C121I c121i) {
        C196871120v c196871120v;
        InterfaceC1452170ntP interfaceC1452170ntP;
        SafeHandler safeHandler;
        if (c121i == this.LLLII) {
            return;
        }
        if (c121i != null) {
            if (!this.LLLIIII.containsKey(c121i)) {
                this.LLLIIII.put(c121i, c121i.LIZJ());
            }
            c121i.setHighlightState(EnumC390580FTc.EMPHASIZED);
            if ((c121i instanceof C196874120y) && (safeHandler = this.LLJJLIIIJLLLLLLLZ) != null && this.LLJJIJI != null) {
                safeHandler.post(new ARunnableS129S0100000_29(this, 166));
            }
            C121I c121i2 = this.LLLII;
            if (c121i2 != null) {
                c121i2.setHighlightState(EnumC390580FTc.IGNORED);
                if ((this.LLLII instanceof C196874120y) && (interfaceC1452170ntP = this.LLJJIJI) != null) {
                    interfaceC1452170ntP.refreshCurrentFrame();
                }
            }
            LJIIJ(c121i);
        } else {
            for (Map.Entry entry : (C830490Whz.a) this.LLLIIII.entrySet()) {
                C121I c121i3 = (C121I) entry.getKey();
                InterfaceC384940F7k interfaceC384940F7k = (InterfaceC384940F7k) entry.getValue();
                if (c121i3 != null && interfaceC384940F7k != null && (c196871120v = this.LLILLL) != null) {
                    c121i3.LJ(interfaceC384940F7k, c196871120v.LLILLL, c196871120v.LLILZ);
                }
            }
            this.LLLIIII.clear();
        }
        this.LLLII = c121i;
    }

    public final void LJIJ(boolean z) {
        C196870120u c196870120u;
        C196871120v c196871120v = this.LLILLL;
        if (c196871120v != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            if (z) {
                c196870120u.LJIIL(EnumC390580FTc.EMPHASIZED);
            } else {
                c196870120u.LJIIL(EnumC390580FTc.IGNORED);
            }
        }
        if (this.LLLII != null && LJFF()) {
            this.LLLII.setHighlightState(EnumC390580FTc.EMPHASIZED);
        }
    }

    public final void LJIJI(FrameLayout frameLayout) {
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (width <= 0 || height <= 0) {
            width = layoutParams.width;
            height = layoutParams.height;
            if (width <= 0 || height <= 0) {
                HandlerHook.viewPost(frameLayout, new ARunnableS85S0200000_16(this, frameLayout, 45));
            }
        }
        int i = layoutParams.topMargin;
        this.LLJZ = new Rect(0, i, width, height + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1444160ngU
    public final boolean ve1(RectF rectF) {
        VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
        if (videoPublishEditModel != null && this.LLJJIJI != null && videoPublishEditModel.hasInfoStickers()) {
            VESize initSize = this.LLJJIJI.getInitSize();
            final C259800zU c259800zU = new C259800zU();
            RectF rectF2 = new RectF();
            for (final StickerItemModel stickerItemModel : this.LLJJIJIL.getInfoStickerModel().stickers) {
                if (stickerItemModel.isImageSticker()) {
                    return true;
                }
                try {
                    C391360FWc.LIZLLL("", this.LLJJIJI, new Function1() { // from class: X.0F40
                        /* JADX WARN: Type inference failed for: r0v4, types: [T, float[]] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            StickerItemModel stickerItemModel2 = stickerItemModel;
                            C259800zU c259800zU2 = c259800zU;
                            C348100Dkm c348100Dkm = (C348100Dkm) obj;
                            if (stickerItemModel2.uuid != null) {
                                c259800zU2.element = c348100Dkm.LJIIIZ().LIZ().LIZJ(stickerItemModel2.uuid);
                                return null;
                            }
                            return null;
                        }
                    });
                    float[] fArr = (float[]) c259800zU.element;
                    if (fArr == null) {
                        return false;
                    }
                    float f = fArr[0];
                    float f2 = initSize.width;
                    float f3 = fArr[3];
                    float f4 = initSize.height;
                    rectF2.set(f * f2, f3 * f4, fArr[2] * f2, fArr[1] * f4);
                    if (rectF2.top < rectF.top || rectF2.bottom > rectF.bottom || (C301490Brn.LIZ() && (rectF2.left < rectF.left || rectF2.right > rectF.right))) {
                        return true;
                    }
                } catch (VEException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getInfoStickerBoundingBox error, index is ");
                    sbLIZ.append(stickerItemModel.getId());
                    sbLIZ.append(" veState is ");
                    sbLIZ.append(this.LLJJIJI.getState().getValue());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(boolean r8, X.C121I r9) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196868120s.LJIIJJI(boolean, X.121I):void");
    }

    public final void LJIIL(boolean z, C121I c121i) {
        InterfaceC19657911vd interfaceC19657911vdUp0;
        int duration;
        this.LLILLL.LIZ();
        this.LLILLL.LJIIJJI(true);
        if (z) {
            this.LLILLL.LLJJ = 1;
        }
        if (z) {
            LJIJ(false);
        }
        if (c121i != this.LLLII && c121i != null) {
            C121N c121n = this.LLLJIL;
            InterfaceC391240FVq interfaceC391240FVqLLLIZZ = c121n.LIZ.LLLIZZ();
            if (interfaceC391240FVqLLLIZZ != null && (interfaceC19657911vdUp0 = interfaceC391240FVqLLLIZZ.up0()) != null) {
                float fLIZLLL = c121i.LIZLLL(0);
                InterfaceC1452170ntP value = c121n.LIZ.LLLILZ().g().getValue();
                if (value != null) {
                    duration = value.getDuration();
                } else {
                    duration = 0;
                }
                interfaceC19657911vdUp0.LJFF(fLIZLLL, c121i.LIZIZ(duration));
            }
        }
        LJIILL(c121i);
        C391250FVr c391250FVr = this.LLLFZ;
        if (c391250FVr != null) {
            c391250FVr.LIZIZ(z, false);
        }
    }

    public final void LJIILJJIL(C121I c121i, int i) {
        C196871120v c196871120v;
        InterfaceC1452170ntP interfaceC1452170ntP;
        InterfaceC1452170ntP interfaceC1452170ntP2;
        InterfaceC1452170ntP interfaceC1452170ntP3;
        int iLIZ;
        SafeHandler safeHandler;
        TextStickerData data;
        if (c121i == this.LLLII) {
            return;
        }
        if (c121i != null) {
            if ((c121i instanceof C196925122x) && (data = ((C196925122x) c121i).getData()) != null && data.getEndTime() != 0 && data.getUiEndTime() == 0) {
                data.setUiEndTime(data.getEndTime());
            }
            if (!this.LLLIIII.containsKey(c121i)) {
                this.LLLIIII.put(c121i, c121i.LIZJ());
            }
            c121i.setHighlightState(EnumC390580FTc.EMPHASIZED);
            if ((c121i instanceof C196874120y) && (safeHandler = this.LLJJLIIIJLLLLLLLZ) != null && this.LLJJIJI != null) {
                safeHandler.post(new ARunnableS129S0100000_29(this, 167));
            }
            if (this.LLJJJJ && i == 0) {
                int iLJFF = c121i.LJFF();
                InterfaceC1452170ntP interfaceC1452170ntP4 = this.LLJJIJI;
                if (interfaceC1452170ntP4 != null) {
                    iLIZ = c121i.LIZ(interfaceC1452170ntP4.mo51if());
                } else {
                    iLIZ = 0;
                }
                if (iLJFF >= 0 && iLIZ >= 0 && !LJIL(iLJFF, iLIZ, c121i)) {
                    this.LLJJLIIIJLLLLLLLZ.postDelayed(new ARunnableS10S0202000_29(this, iLJFF, iLIZ, c121i, 3), 300L);
                }
                LJIJJ();
            }
            C121I c121i2 = this.LLLII;
            if (c121i2 != null) {
                if (i != 0) {
                    if (i == 1 && this.LLJJJIL) {
                        c121i2.setHighlightState(EnumC390580FTc.IGNORED);
                    }
                } else if (this.LLJJJJ) {
                    c121i2.setHighlightState(EnumC390580FTc.IGNORED);
                }
                if ((this.LLLII instanceof C196874120y) && (interfaceC1452170ntP3 = this.LLJJIJI) != null) {
                    interfaceC1452170ntP3.refreshCurrentFrame();
                }
            }
            if (i == 0) {
                LJIIJ(c121i);
            } else if (i == 1 && (interfaceC1452170ntP2 = this.LLJJIJI) != null) {
                this.LLJJ.setProgress((int) (((this.LLJJIJI.LLL() - c121i.LIZLLL(0)) / (c121i.LIZIZ(interfaceC1452170ntP2.getDuration()) - c121i.LIZLLL(0))) * 100.0f));
            }
        } else {
            for (Map.Entry entry : (C830490Whz.a) this.LLLIIII.entrySet()) {
                C121I c121i3 = (C121I) entry.getKey();
                InterfaceC384940F7k interfaceC384940F7k = (InterfaceC384940F7k) entry.getValue();
                if (c121i3 != null && interfaceC384940F7k != null && (c196871120v = this.LLILLL) != null) {
                    c121i3.LJ(interfaceC384940F7k, c196871120v.LLILLL, c196871120v.LLILZ);
                    if (interfaceC384940F7k instanceof TextStickerData) {
                        TextStickerData textStickerData = (TextStickerData) interfaceC384940F7k;
                        if (textStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(textStickerData.getNleUuid()) && (interfaceC1452170ntP = this.LLJJIJI) != null) {
                            C391360FWc.LIZLLL("InfoStickerHelper#setTimeEditSelectedViewA", interfaceC1452170ntP, new AObjectS349S0100000_5(textStickerData, 2));
                        }
                    }
                }
            }
            this.LLLIIII.clear();
        }
        this.LLLII = c121i;
        LJIILLIIL();
    }

    public final void LJJI(int i, int i2) {
        C196871120v c196871120v;
        if (LJFF() && (c196871120v = this.LLILLL) != null) {
            C196874120y c196874120y = (C196874120y) this.LLLII;
            C196870120u c196870120u = c196871120v.LLIZLLLIL;
            if (c196870120u != null) {
                c196870120u.LJIIZILJ(c196874120y, i, i2);
                return;
            }
            return;
        }
        C121I c121i = this.LLLII;
        if (c121i instanceof C19610711o1) {
            CommentVideoModel data = ((C19610711o1) c121i).getData();
            if (data == null) {
                return;
            }
            data.setStartTime(i);
            data.setEndTime(i2);
            return;
        }
        if (c121i instanceof C121V) {
            ((C121V) c121i).LJJLIIIJLJLI();
            ((C121V) this.LLLII).LIZIZ();
        } else {
            if (!(c121i instanceof InterfaceC391260FVs)) {
                return;
            }
            ((InterfaceC391260FVs) c121i).LJJLIIIJLJLI();
            ((InterfaceC391260FVs) this.LLLII).LIZIZ();
        }
    }

    public final void LJIIIZ(final boolean z, C196874120y c196874120y, final boolean z2) {
        C12UW c12uw;
        this.LLLIIIL = z;
        if (!this.LLJJJIL) {
            this.LLJJJIL = true;
            this.LLJILLL.setTuxFont(42);
            this.LLJILJILJ.setTuxFont(42);
            C786410Ut5.h9(this.LLJILJILJ, new ACListenerS163S0100000_29(this, 228));
            C786410Ut5.h9(this.LLJILLL, new ACListenerS163S0100000_29(this, 229));
            LJ();
            C786410Ut5.wb(this.LLJJ, new C12YM(this, 9));
        } else if (this.LLJJIJI != null && (c12uw = this.LLIZ) != null) {
            c12uw.setMinVideoLength(1000L);
            int iNg = this.LLJJIJI.ng();
            this.LLIZ.setMaxVideoLength(iNg);
            this.LLIZ.LJJIII(iNg);
            this.LLIZ.LJJIZ();
            this.LLJIJIL.LLJILJILJ = iNg;
        }
        if (z) {
            LJIJ(false);
        }
        LJIILJJIL(c196874120y, 1);
        View view = this.LLJILJIL;
        if (view != null) {
            this.LLJLLL = view.getHeight();
        }
        if (this.LLJLLL == 0) {
            this.LLJLLL = (int) C12ES.LIZJ(120.0f, this.LL);
        }
        if (this.LLJJIJI != null) {
            this.LLJJ.setProgress((int) ((r0.LLL() * 100.0f) / this.LLJJIJI.getDuration()));
        }
        View view2 = this.LLJILJIL;
        C1462750oAT.LIZIZ(view2, z, this.LLJLLL, view2, new C092O() { // from class: X.1213
            /* JADX WARN: Type inference failed for: r0v14, types: [X.0XRy] */
            @Override // X.C092O
            public final void accept(Object obj) throws Throwable {
                int i;
                AnonymousClass1214 anonymousClass1214;
                DialogC848920XRy dialogC848920XRy;
                C196868120s c196868120s = this.LIZ;
                boolean z3 = z;
                boolean z4 = z2;
                c196868120s.getClass();
                boolean z5 = !z3;
                C196871120v c196871120v = c196868120s.LLILLL;
                if (c196871120v != null) {
                    if (z5) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    int visibility = c196871120v.getVisibility();
                    c196871120v.setVisibility(i);
                    C1602160rnK.LIZIZ(visibility, i, c196871120v);
                    if (z5) {
                        c196868120s.LLILLL.LIZ();
                    }
                    if (z3) {
                        c196868120s.LLILLL.LLJJ = 1;
                        InterfaceC1452170ntP interfaceC1452170ntP = c196868120s.LLJJIJI;
                        if (interfaceC1452170ntP != null) {
                            interfaceC1452170ntP.setLoopPlay(true);
                            return;
                        }
                        return;
                    }
                    c196868120s.LLILLL.LLJJ = 0;
                    if (z4 && (anonymousClass1214 = c196868120s.LLLIIL) != null) {
                        Context context = c196868120s.LL;
                        if (context != null) {
                            if (anonymousClass1214.LJIIJ == null) {
                                anonymousClass1214.LJIIJ = new DialogC19728412Gs(context) { // from class: X.0XRy
                                    public C1390130mHL LL;

                                    @Override // android.app.Dialog
                                    public final void onBackPressed() {
                                    }

                                    @Override // X.DialogC19728412Gs, android.app.Dialog
                                    public final void show() throws Throwable {
                                        Object obj2;
                                        C1390130mHL c1390130mHL = this.LL;
                                        if (c1390130mHL != null) {
                                            C786410Ut5.LLZ(c1390130mHL, 0);
                                        }
                                        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMncIUB/z3xLylBinDaEZh22WKeEPKWUT8DMc9MZJeF37zww==", null);
                                        C0WST c0wst = new C0WST();
                                        Object[] objArr = new Object[0];
                                        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
                                        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", this, objArr, "void", c0wzw);
                                        if (c0wsuLIZIZ.LIZ) {
                                            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, this, c0wzw, false);
                                            return;
                                        }
                                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                                        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj2 = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj2;
                                        super.show();
                                        c0wst.LIZ(300000, "com/ss/android/ugc/aweme/tux/business/base/GlobalHookDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
                                    }

                                    @Override // android.app.Dialog
                                    public final void onCreate(Bundle bundle) {
                                        super.onCreate(bundle);
                                        setContentView(R.layout.d9g);
                                        C1390130mHL c1390130mHL = (C1390130mHL) findViewById(R.id.qhs);
                                        this.LL = c1390130mHL;
                                        if (c1390130mHL != null) {
                                            c1390130mHL.setMessage(2131829858);
                                        }
                                        C1390130mHL c1390130mHL2 = this.LL;
                                        if (c1390130mHL2 != null) {
                                            C786410Ut5.LLZ(c1390130mHL2, 0);
                                        }
                                        setCanceledOnTouchOutside(false);
                                    }
                                };
                            }
                            DialogC848920XRy dialogC848920XRy2 = anonymousClass1214.LJIIJ;
                            if ((dialogC848920XRy2 == null || !dialogC848920XRy2.isShowing()) && (dialogC848920XRy = anonymousClass1214.LJIIJ) != null) {
                                dialogC848920XRy.show();
                                C785410UrT.LIZIZ(dialogC848920XRy);
                                PopupMonitorServiceImpl.LIZ.getClass();
                                PopupMonitorServiceImpl.LJJJ(dialogC848920XRy);
                                C816490W1f.LIZ(dialogC848920XRy);
                            }
                        }
                        final AnonymousClass1214 anonymousClass12142 = c196868120s.LLLIIL;
                        anonymousClass12142.getClass();
                        ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, new IFoundationAVService.IFetchResourcesListener() { // from class: X.1216
                            @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                            public final void onFailed(Exception exc) {
                                C121R c121r = anonymousClass12142.LJII;
                                if (c121r != null) {
                                    C196868120s c196868120s2 = c121r.LIZ;
                                    if (c196868120s2.LLILLL != null) {
                                        HandlerHook.viewPost(c196868120s2.LLILLL, new ARunnableS48S0110000_29(c121r, 2));
                                    }
                                }
                            }

                            @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                            public final void onSuccess(String[] strArr) {
                                C15O7.LIZIZ(new ACallableS432S0100000_29(anonymousClass12142, 11), C15O7.LJIIIIZZ, null).LJ(new C19774512Yl(anonymousClass12142, 17), C15O7.LJI, null);
                            }
                        });
                        return;
                    }
                    InterfaceC1452170ntP interfaceC1452170ntP2 = c196868120s.LLJJIJI;
                    if (interfaceC1452170ntP2 != null) {
                        interfaceC1452170ntP2.setLoopPlay(true);
                    }
                    c196868120s.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZ());
                }
            }
        });
        C391250FVr c391250FVr = this.LLLFZ;
        if (c391250FVr != null) {
            c391250FVr.LIZIZ(z, true);
        }
        if (z) {
            MutableLiveData<C1453160nv0> mutableLiveDataVQ2 = this.LLJJIJIIJIL.vQ2();
            int iLIZIZ = C19733712It.LIZIZ(true, false, false, false);
            int i = this.LLJLLL;
            int fullScreenHeight = (ScreenUtils.getFullScreenHeight(this.LL) - this.LLJLLL) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL);
            c0.LIZ.n2();
            mutableLiveDataVQ2.setValue(C1453170nv1.LIZIZ(iLIZIZ, 0, i, fullScreenHeight, true, z2, 1536));
            ImageView imageView = this.LLJI;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(R.drawable.awp));
            this.LLJI.setEnabled(true);
            return;
        }
        this.LLJI.setEnabled(false);
        this.LLJJLIIIJLLLLLLLZ.removeCallbacks(this.LLLF);
        this.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZJ());
        if (this.LLILLL != null) {
            MutableLiveData<C1453160nv0> mutableLiveDataVQ22 = this.LLJJIJIIJIL.vQ2();
            int color = this.LLILLL.getResources().getColor(R.color.b6);
            int statusBarHeight = ScreenUtils.getStatusBarHeight(this.LL);
            int i2 = this.LLJLLL;
            int fullScreenHeight2 = (ScreenUtils.getFullScreenHeight(this.LL) - this.LLJLLL) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL);
            c0.LIZ.n2();
            C1453160nv0 c1453160nv0 = new C1453160nv0(0, color);
            c1453160nv0.LIZJ = statusBarHeight;
            c1453160nv0.LIZLLL = i2;
            c1453160nv0.LJ = fullScreenHeight2;
            c1453160nv0.LJII = z2;
            c1453160nv0.LJIIIIZZ = true;
            mutableLiveDataVQ22.setValue(c1453160nv0);
        }
        this.LLJJL = false;
    }

    public final void LJIJJLI(final int i, final int i2, String str) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        VideoPublishEditModel videoPublishEditModel = this.LLJJIJIL;
        if (videoPublishEditModel != null && videoPublishEditModel.getInfoStickerModel() != null && !C0IKQ.LIZ(this.LLJJIJIL.getInfoStickerModel().stickers)) {
            for (final StickerItemModel stickerItemModel : this.LLJJIJIL.getInfoStickerModel().stickers) {
                if (Objects.equals(stickerItemModel.stickerId, str) && (interfaceC1452170ntP = this.LLJJIJI) != null) {
                    C391360FWc.LIZLLL("", interfaceC1452170ntP, new Function1() { // from class: X.0npW
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            StickerItemModel stickerItemModel2 = stickerItemModel;
                            int i3 = i2;
                            int i4 = i;
                            C348100Dkm c348100Dkm = (C348100Dkm) obj;
                            C348440DlK c348440DlKLJJIIJZLJL = c348100Dkm.LJIIIZ().LJJIIJZLJL(stickerItemModel2.uuid);
                            if (c348440DlKLJJIIJZLJL != null) {
                                stickerItemModel2.startTime = i3;
                                stickerItemModel2.endTime = i4;
                                c348440DlKLJJIIJZLJL.LIZLLL = i3;
                                c348440DlKLJJIIJZLJL.LJ = i4;
                                c348100Dkm.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                                return null;
                            }
                            return null;
                        }
                    });
                }
            }
        }
    }

    public final boolean LJIL(int i, int i2, C121I c121i) {
        C12UW c12uw = this.LLIZ;
        if (c12uw == null) {
            return false;
        }
        boolean zLJJJ = c12uw.LJJJ(i, i2, true);
        LJIILLIIL();
        if (zLJJJ && c121i != null) {
            this.LLJIJIL.LLILLL.setValue(Long.valueOf(c121i.LIZLLL(0)));
            this.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZLLL(c121i.LIZLLL(0)));
        }
        return zLJJJ;
    }

    public C196868120s(InterfaceC1455860nzM interfaceC1455860nzM, CreativeInfo creativeInfo, C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        this.LLLJ = false;
        this.LLLIL = interfaceC1455860nzM;
        this.LLLILZJ = creativeInfo;
        this.LLLILZLLLI = c1drg;
        this.LLLJ = C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel);
    }

    public final void LJJ(final int i, int i2, boolean z, boolean z2) {
        C196871120v c196871120v;
        LJIJJ();
        if (this.LLLII == null) {
            return;
        }
        if (LJFF() && (c196871120v = this.LLILLL) != null) {
            C196874120y c196874120y = (C196874120y) this.LLLII;
            C196870120u c196870120u = c196871120v.LLIZLLLIL;
            if (c196870120u != null) {
                c196870120u.LJIIZILJ(c196874120y, i, i2);
                return;
            }
            return;
        }
        C121I c121i = this.LLLII;
        if (c121i instanceof C196925122x) {
            final TextStickerData data = ((C196925122x) c121i).getData();
            if (data == null) {
                return;
            }
            data.setStartTime(i);
            data.setEndTime(i2);
            data.setUiStartTime(i);
            data.setUiEndTime(i2);
            if (z) {
                LJIILLIIL();
            }
            if (!z2 || !data.getHasReadTextAudio() || this.LLJJIJI == null || TextUtils.isEmpty(data.getNleUuid())) {
                return;
            }
            C391360FWc.LIZLLL("InfoStickerHelper#updateWhenSelectChangeA", this.LLJJIJI, new Function1() { // from class: X.0FUy
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    TextStickerData textStickerData = data;
                    int i3 = i;
                    C348100Dkm c348100Dkm = (C348100Dkm) obj;
                    C347650Dk3 c347650Dk3 = c348100Dkm.LJFF().get(textStickerData.getNleUuid());
                    if (c347650Dk3 != null) {
                        c347650Dk3.LIZLLL = 0L;
                        c347650Dk3.LJ = textStickerData.getAudioTrackDuration();
                        c347650Dk3.LJFF = i3;
                        c347650Dk3.LJI = i3 + textStickerData.getAudioTrackDuration();
                        c348100Dkm.LJFF().LJIJI(c347650Dk3);
                        return null;
                    }
                    return null;
                }
            });
            return;
        }
        if (c121i instanceof C19610711o1) {
            CommentVideoModel data2 = ((C19610711o1) c121i).getData();
            if (data2 == null) {
                return;
            }
            data2.setStartTime(i);
            data2.setEndTime(i2);
            return;
        }
        if (c121i instanceof C121V) {
            ((C121V) c121i).LJJLIIIJLJLI();
            ((C121V) this.LLLII).LIZIZ();
        } else {
            if (!(c121i instanceof InterfaceC391260FVs)) {
                return;
            }
            ((InterfaceC391260FVs) c121i).LJJLIIIJLJLI();
            ((InterfaceC391260FVs) this.LLLII).LIZIZ();
        }
    }
}
