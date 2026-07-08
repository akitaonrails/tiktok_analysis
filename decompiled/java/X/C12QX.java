package X;

import Y.AAListenerS339S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS40S0101000_29;
import Y.AsS37S0200000_29;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.zhiliaoapp.musically.R;
import irm.AkS18S0000000_29;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS159S0110000_29;
import kotlin.jvm.internal.AwS306S0300000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12QX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12QX extends AbstractC1664490tPr<C12RH, C19754312Qr> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLIL;
    public final C1DRG LLJJJIL;
    public final C19755412Rc LLJJJJ;
    public final C1664750tQH LLJJJJLIIL;
    public boolean LLJJL;
    public Effect LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public boolean LLJLIL;
    public InterfaceC1452170ntP LLJLILLLLZIIL;
    public boolean LLJLL;
    public float LLJLLL;
    public final C1664750tQH LLJZIJLIL;
    public final C1664750tQH LLL;
    public String LLLFF;
    public String LLLFFI;
    public final C1664750tQH LLLFZ;
    public final C1664750tQH LLLI;
    public View LLLIIII;
    public TuxTextView LLLIIIIL;
    public TuxTextView LLLIIIL;
    public TuxTextView LLLIIL;
    public LinearLayout LLLIILIL;
    public TuxIconView LLLIL;
    public RelativeLayout LLLILZ;
    public TuxIconView LLLILZJ;
    public C194350111w LLLILZLLLI;
    public View LLLIZZ;
    public boolean LLLJ;
    public C1664150tPJ LLLJL;
    public C999420c7A LLLL;
    public C19724112Fb LLLLII;
    public C1664150tPJ LLLLIIIILLL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public int LLLLILI;
    public String LLLLL;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(170));
    public boolean LLJLLIL = true;
    public final C194341111n LLJZ = new C194341111n();
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(172));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 258));
    public List<Effect> LLLJIL = new ArrayList();
    public final C01GW LLLLIIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(171));
    public boolean LLLLIILL = true;
    public final C01GW LLLLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 259));
    public List<? extends NLEModel> LLLLJI = C13BV.INSTANCE;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12QX.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12QX.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12QX.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12QX.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C12QX.class, "aePreviewApiComponent", "getAePreviewApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/preview/AEPreviewApiComponent;", 0);
        c09r3.getClass();
        LLLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public final void LLLLLJLJLL() {
        if (this.LLJLLIL || this.LLJLLL <= 0.0f) {
            return;
        }
        LinearLayout linearLayout = this.LLLIILIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(0, linearLayout);
        LinearLayout linearLayout2 = this.LLLIILIL;
        ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout2 != null ? linearLayout2 : null, "translationY", this.LLJLLL, 0.0f).setDuration(300L);
        duration.addListener(new AAListenerS339S0100000_29(this, 4));
        C786410Ut5.Pd(duration);
    }

    public final C12RU LLLLLLZZ() {
        return (C12RU) this.LLLI.getValue(this, LLLLLIL[4]);
    }

    public final C0FPW LLLLLZ() {
        C194350111w c194350111w;
        C1454410nx1.LIZ.getClass();
        if (!C1454410nx1.LIZ() || (c194350111w = this.LLLILZLLLI) == null) {
            return (C1664120tPG) this.LLJJJJJIL.getValue();
        }
        C0FPW curPanel = c194350111w.getCurPanel();
        return curPanel == null ? (C1664120tPG) this.LLJJJJJIL.getValue() : curPanel;
    }

    public final float LLLLLZL() {
        if (((InterfaceC1418580n1E) this.LLL.getValue(this, LLLLLIL[2])).Ie2()) {
            return LLLLZLLLI().getVoiceVolume();
        }
        return 0.0f;
    }

    public final InterfaceC1455860nzM LLLLZ() {
        return (InterfaceC1455860nzM) this.LLJZIJLIL.getValue(this, LLLLLIL[1]);
    }

    public final NLEEditor LLLLZLL() {
        return (NLEEditor) this.LLLII.getValue();
    }

    public final C12RZ LLLLZLLIL() {
        return (C12RZ) this.LLLLIIL.getValue();
    }

    public final VideoPublishEditModel LLLLZLLLI() {
        return (VideoPublishEditModel) this.LLJJJJLIIL.getValue(this, LLLLLIL[0]);
    }

    public final InterfaceC19753012Qe LLLZI() {
        return (InterfaceC19753012Qe) this.LLLFZ.getValue(this, LLLLLIL[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    public final Effect LLLZLL() {
        C259800zU c259800zU = new C259800zU();
        if (LLLLZLLLI().getVeAudioEffectParam() == null && LLLLZLLLI().creativeModel.streamVoiceConversionModel.vcEffectId.length() == 0 && !C1428520nHG.LJJJJLI(LLLLZLLLI())) {
            c259800zU.element = LLLLZIL();
        } else {
            AudioEffectParam veAudioEffectParam = LLLLZLLLI().getVeAudioEffectParam();
            if (veAudioEffectParam != null) {
                if (veAudioEffectParam.getUploadId().length() == 0) {
                    c259800zU.element = LLLLZIL();
                } else {
                    ?? effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
                    effect.setUnzipPath(veAudioEffectParam.getEffectPath());
                    effect.setEffectId(veAudioEffectParam.getUploadId());
                    c259800zU.element = effect;
                }
            }
        }
        Effect effect2 = (Effect) c259800zU.element;
        if (effect2 != null) {
            this.LLLJL = new C1664150tPJ(effect2, 0, 2046);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initDefaultSelection  selectedEffect is null ? ");
        sbLIZ.append(c259800zU.element == 0);
        sbLIZ.append(" ,id= ");
        Effect effect3 = (Effect) c259800zU.element;
        sbLIZ.append(effect3 != null ? effect3.getEffectId() : null);
        sbLIZ.append(", name= ");
        Effect effect4 = (Effect) c259800zU.element;
        sbLIZ.append(effect4 != null ? effect4.getName() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        return (Effect) c259800zU.element;
    }

    public final void LLLZZ() {
        boolean z;
        if (this.LLLLIILL) {
            LLLLIL().LIZLLL.invoke(Boolean.TRUE);
            z = false;
        } else {
            z = true;
        }
        this.LLLLIILLL = z;
    }

    public final boolean LLZ() {
        Effect effect;
        if (this.LLLLILI > 1) {
            return false;
        }
        LLLLLZ().LJ();
        C1664150tPJ c1664150tPJ = this.LLLJL;
        if (c1664150tPJ != null && (effect = c1664150tPJ.LIZ) != null) {
            LLLLLZ().LJIJ(effect);
            int iLIZIZ = LLLLLZ().LIZIZ();
            this.LLLLILI++;
            if (!C1664460tPo.LIZLLL(effect)) {
                C1664150tPJ c1664150tPJ2 = this.LLLJL;
                if (c1664150tPJ2 != null) {
                    LLLLLLLLLL(iLIZIZ, c1664150tPJ2);
                }
                return true;
            }
            C1664150tPJ c1664150tPJ3 = this.LLLJL;
            if (c1664150tPJ3 != null) {
                LLLLLLLZIL(iLIZIZ, c1664150tPJ3);
            }
        }
        return false;
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        C19A3 c19a3 = (C19A3) this.mParentScene;
        if (c19a3 != null) {
            c19a3.hide(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC1452170ntP value = LLLLZ().g().getValue();
        this.LLJLILLLLZIIL = value;
        C386180FCe.LIZ(value != null ? C352130DrH.LIZ(value) : null);
        this.LLJLLIL = false;
        if (this.LLJJL) {
            LLZIL();
            LLLLLZ().LJI();
            LLLLLL();
            LLZLL((AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12RE
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RH) obj).LIZLLL;
                }
            }).LIZJ()).LIZ, false);
            LLZLLLL();
        } else {
            this.LLJJL = true;
            C1454410nx1.LIZ.getClass();
            if (C1454410nx1.LIZ()) {
                C194350111w c194350111w = (C194350111w) requireViewById(R.id.nbg);
                this.LLLILZLLLI = c194350111w;
                if (c194350111w == null) {
                    c194350111w = null;
                }
                int visibility = c194350111w.getVisibility();
                c194350111w.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c194350111w);
                C786410Ut5.LJZ(8, (FrameLayout) requireViewById(R.id.voice_filter_layout));
                C194350111w c194350111w2 = this.LLLILZLLLI;
                if (c194350111w2 == null) {
                    c194350111w2 = null;
                }
                this.LLLIIII = c194350111w2.getClearView();
                C194350111w c194350111w3 = this.LLLILZLLLI;
                if (c194350111w3 == null) {
                    c194350111w3 = null;
                }
                c194350111w3.setOnVCItemClickListener((InterfaceC1664180tPM) this.LLLLJ.getValue());
                C194350111w c194350111w4 = this.LLLILZLLLI;
                if (c194350111w4 == null) {
                    c194350111w4 = null;
                }
                AwS678S0100000_29 awS678S0100000_29 = new AwS678S0100000_29(this, 5);
                C1664420tPk c1664420tPk = c194350111w4.LLILZ;
                if (c1664420tPk == null) {
                    c1664420tPk = null;
                }
                c1664420tPk.LLILZLL = new C19775712Yx(c194350111w4, (C194350111w) awS678S0100000_29, (InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Integer, Unit>) 1);
                C194350111w c194350111w5 = this.LLLILZLLLI;
                if (c194350111w5 == null) {
                    c194350111w5 = null;
                }
                this.LLLIIIIL = c194350111w5.getTipView();
                C194350111w c194350111w6 = this.LLLILZLLLI;
                if (c194350111w6 == null) {
                    c194350111w6 = null;
                }
                VideoPublishEditModel videoPublishEditModelLLLLZLLLI = LLLLZLLLI();
                c194350111w6.getClass();
                c194350111w6.LLJJ = new C386190FCf(videoPublishEditModelLLLLZLLLI);
            } else {
                View viewRequireViewById = requireViewById(R.id.dzu);
                TextView textView = (TextView) viewRequireViewById;
                if (C298250BmZ.LIZ()) {
                    textView.setText(getString(2131833787));
                }
                this.LLLIIII = viewRequireViewById;
                this.LLLIIIIL = (TuxTextView) requireViewById(R.id.tv_tip);
                ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.voice_filter_layout);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(requireSceneContext(), 4);
                RecyclerView recyclerViewLIZLLL = LLLLLZ().LIZLLL(this.mView.getContext(), gridLayoutManager, new C1664440tPm());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart((int) (((double) C1415610mwR.LIZIZ()) * 0.04d));
                layoutParams.setMarginEnd((int) (((double) C1415610mwR.LIZIZ()) * 0.04d));
                layoutParams.topMargin = C366700EZg.LIZ(20.0d);
                viewGroup.addView(recyclerViewLIZLLL, layoutParams);
                C0FPW c0fpwLLLLLZ = LLLLLZ();
                C1664220tPQ c1664220tPQ = new C1664220tPQ(false);
                c1664220tPQ.LLJIJIL = AFwS217S0000000_28.get$arr$(377);
                c0fpwLLLLLZ.LJFF(c1664220tPQ);
                if (recyclerViewLIZLLL != null) {
                    recyclerViewLIZLLL.addOnScrollListener(new AsS37S0200000_29(gridLayoutManager, this, 1));
                }
                this.LLJZ.LJ.LJ = true;
                final C386190FCf c386190FCf = new C386190FCf(LLLLZLLLI());
                this.LLJZ.LJII(recyclerViewLIZLLL, new C0FGH() { // from class: X.111q
                    @Override // X.C0FGH
                    public final void LIZ(int i, List<Integer> list) {
                        List<Effect> list2 = this.LIZ.LLLJIL;
                        C386190FCf c386190FCf2 = c386190FCf;
                        int i2 = 0;
                        for (Object obj : (ArrayList) list2) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                Effect effect = (Effect) obj;
                                if (((ArrayList) list).contains(Integer.valueOf(i2))) {
                                    c386190FCf2.LIZ(0, "", effect.getEffectId(), effect.getName());
                                }
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                });
                this.LLLIZZ = requireViewById(R.id.j4v);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setColors(new int[]{-16777216, 0});
                View view = this.LLLIZZ;
                if (view == null) {
                    view = null;
                }
                view.setBackground(gradientDrawable);
            }
            LinearLayout linearLayout = (LinearLayout) requireViewById(R.id.aex);
            this.LLLIILIL = linearLayout;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C786410Ut5.LJZL(0, linearLayout);
            LinearLayout linearLayout2 = this.LLLIILIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e2);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
            linearLayout2.setBackground(c384050F3z.LIZ(requireSceneContext()));
            LinearLayout linearLayout3 = this.LLLIILIL;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            C786410Ut5.I7(new AkS95S0100000_29(this, 34), linearLayout3);
            this.LLLIIL = (TuxTextView) requireViewById(R.id.aez);
            this.LLLIL = (TuxIconView) requireViewById(R.id.jyh);
            this.LLLILZJ = (TuxIconView) requireViewById(R.id.volume_btn2);
            TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.fuz);
            this.LLLIIIL = tuxTextView;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C999420c7A c999420c7A = (C999420c7A) requireViewById(R.id.mpn);
            this.LLLL = c999420c7A;
            if (c999420c7A == null) {
                c999420c7A = null;
            }
            int visibility2 = c999420c7A.getVisibility();
            c999420c7A.setVisibility(4);
            C1602160rnK.LIZIZ(visibility2, 4, c999420c7A);
            this.LLLLII = (C19724112Fb) requireViewById(R.id.z0k);
            RelativeLayout relativeLayout = (RelativeLayout) requireViewById(R.id.volume_btn2_layout);
            this.LLLILZ = relativeLayout;
            if (relativeLayout == null) {
                relativeLayout = null;
            }
            C786410Ut5.I7(new AkS95S0100000_29(this, 35), relativeLayout);
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RT
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RH) obj).LIZJ;
                }
            }, new AwS608S0100000_29(this, 211));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RH) obj).LIZLLL;
                }
            }, new AwS608S0100000_29(this, 202));
            AudioRecorderParam audioRecorderParam = (AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12RD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RH) obj).LIZLLL;
                }
            }).LIZJ()).LIZ;
            RelativeLayout relativeLayout2 = this.LLLILZ;
            if (relativeLayout2 == null) {
                relativeLayout2 = null;
            }
            LLZLLIL(relativeLayout2, true ^ audioRecorderParam.getMStack().isEmpty());
            C19724112Fb c19724112Fb = (C19724112Fb) requireViewById(R.id.z0k);
            C19755412Rc c19755412Rc = this.LLJJJJ;
            final C12R0 c12r0 = new C12R0(c19724112Fb, c19755412Rc);
            final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(c19724112Fb, 203);
            final AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(c19724112Fb, this, 27);
            c19755412Rc.LJIIIZ = c12r0;
            c19724112Fb.setOnSliderListener(new InterfaceC19724212Fc() { // from class: X.12Qk
                @Override // X.InterfaceC19724212Fc
                public final void LIZ(C19724112Fb c19724112Fb2) {
                    c12r0.LIZIZ.LJIIJ.LIZ(c19724112Fb2.getIndicator() / 100, true);
                    Function1<C19724112Fb, Unit> function1 = awS395S0200000_29;
                    if (function1 != null) {
                        function1.invoke(c19724112Fb2);
                    }
                }

                @Override // X.InterfaceC19724212Fc
                public final void LIZIZ(C19724112Fb c19724112Fb2) {
                    Function1<C19724112Fb, Unit> function1 = awS608S0100000_29;
                    if (function1 != null) {
                        function1.invoke(c19724112Fb2);
                    }
                }

                @Override // X.InterfaceC19724212Fc
                public final void LIZJ(int i, boolean z) {
                    if (!z) {
                        return;
                    }
                    c12r0.LIZIZ.LJII();
                    c12r0.LIZIZ.LJIIJ.LIZ(i / 100, false);
                }
            });
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RH) obj).LIZ;
                }
            }, new AwS608S0100000_29(this, 204));
            C386250FCl c386250FCl = (C386250FCl) this.LLLF.getValue();
            Context contextRequireSceneContext = requireSceneContext();
            AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 260);
            c386250FCl.getClass();
            C386240FCk c386240FCk = new C386240FCk(contextRequireSceneContext);
            c386240FCk.LIZJ = awS573S0100000_29;
            c386250FCl.LIZ = c386240FCk;
            View view2 = this.LLLIIII;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.I7(new AkS95S0100000_29(this, 36), view2);
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RH) obj).LIZIZ;
                }
            }, new AwS608S0100000_29(this, 208));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RH) obj).LJ;
                }
            }, new AwS608S0100000_29(this, 209));
            LLZLL((AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12RF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RH) obj).LIZLLL;
                }
            }).LIZJ()).LIZ, false);
            LLZLLLL();
            LLLLLZ().LJII((InterfaceC1664180tPM) this.LLLLJ.getValue());
            LLLLLL();
        }
        NLEModel model = LLLLZLL().getModel();
        if (!LLLLZLLLI().isCurrentAutoCutMode()) {
            this.LLLLJI = C348930Dm7.LIZ(model);
        }
        final ArrayList arrayList = new ArrayList();
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        Iterator<? extends NLEModel> it2 = this.LLLLJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C19536311c1(null, effect, it2.next()));
        }
        if (C386180FCe.LIZIZ()) {
            LLLZI().G81((C19538011cI) C19538911cR.LIZ.getValue());
            LLLZI().WG2(arrayList, new InterfaceC1219270hpl() { // from class: X.12RY
                @Override // X.InterfaceC1219270hpl
                public final void onFailed() {
                }

                @Override // X.InterfaceC1219270hpl
                public final void onStart() {
                }

                @Override // X.InterfaceC1219270hpl
                public final void onSuccess() {
                }
            });
        }
        AbstractC1452680nuE abstractC1452680nuEGc = LLLLZ().gc();
        NLEEditor nLEEditor = (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null) ? null : c348100DkmLIZIZ.LIZ;
        C1664150tPJ c1664150tPJLJIILIIL = LLLLLZ().LJIILIIL(LLLLLZ().LIZIZ());
        Effect effect2 = c1664150tPJLJIILIIL != null ? c1664150tPJLJIILIIL.LIZ : null;
        this.LLJJLIIIJLLLLLLLZ = null;
        if (effect2 == null || C1664460tPo.LJFF(effect2) || C1664460tPo.LIZLLL(effect2) || !C703302op.LIZ(effect2.getEffectId())) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = effect2;
        C352320Dra.LIZJ(LLLLZ());
        if (nLEEditor != null) {
            nLEEditor.commit();
            nLEEditor.done();
        }
        C1446150njh.LIZIZ(LLLLZLLLI());
        C352320Dra.LIZ(effect2, LLLLLZL(), LLLLZ(), new AwS643S0100000_29(this, 38));
        if (nLEEditor != null) {
            nLEEditor.commit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLLL() {
        AudioRecorderParam audioRecorderParam = (AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12R6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12RH) obj).LIZLLL;
            }
        }).LIZJ()).LIZ;
        Map<Integer, Integer> map = C12QV.LIZ;
        C19754712Qv c19754712QvLIZ = C12QV.LIZ(LLLLZLLLI(), audioRecorderParam, false);
        boolean z = false;
        C19754712Qv c19754712Qv = new C19754712Qv(c19754712QvLIZ.LIZIZ, c19754712QvLIZ.LIZJ, c19754712QvLIZ.LIZ && LLLLLLZ((AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12R5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12RH) obj).LIZLLL;
            }
        }).LIZJ()).LIZ), c19754712QvLIZ.LIZLLL);
        Effect effectLLLZLL = LLLZLL();
        if (C0CH5.LIZ()) {
            C384200F4o c384200F4o = C384200F4o.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLZLLLI = LLLLZLLLI();
            NLEModel model = LLLLZLL().getModel();
            c384200F4o.getClass();
            if (C384200F4o.LIZ(videoPublishEditModelLLLLZLLLI, model)) {
                z = true;
            }
        }
        C1454410nx1.LIZ.getClass();
        if (!C1454410nx1.LIZ()) {
            LLLLLZ().LIZ(new C1664390tPh());
            LLLLLZ().LJIJI(c19754712Qv, effectLLLZLL, new C194348111u(this, c19754712QvLIZ, z));
            return;
        }
        LinearLayout linearLayout = this.LLLIILIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(4, linearLayout);
        C194350111w c194350111w = this.LLLILZLLLI;
        (c194350111w != null ? c194350111w : null).LIZIZ(c19754712QvLIZ, effectLLLZLL, new AwS395S0200000_29(this, effectLLLZLL, 26), new AwS159S0110000_29(this, z, 1));
    }

    public final void LLLLLLIL() {
        C1664150tPJ c1664150tPJLJIILIIL;
        Effect effect;
        String effectId;
        Effect effect2;
        C1664150tPJ c1664150tPJLJIILIIL2 = LLLLLZ().LJIILIIL(LLLLLZ().LIZIZ());
        Effect effect3 = null;
        if (c1664150tPJLJIILIIL2 != null && (effect2 = c1664150tPJLJIILIIL2.LIZ) != null) {
            if (!C1664460tPo.LJFF(effect2) && !C1664460tPo.LIZLLL(effect2) && C703302op.LIZ(effect2.getEffectId())) {
                C352320Dra.LIZJ(LLLLZ());
            }
            C19546111db.LIZ.getClass();
            if (C19546111db.LJIIJJI(effect2)) {
                LLLZI().dF1();
            }
            if (!C19546111db.LJIIJJI(effect2)) {
                c();
            }
        }
        int iLJIILJJIL = LLLLLZ().LJIILJJIL();
        if (iLJIILJJIL == -1 || (c1664150tPJLJIILIIL = LLLLLZ().LJIILIIL(iLJIILJJIL)) == null || (effect = c1664150tPJLJIILIIL.LIZ) == null || (effectId = effect.getEffectId()) == null || effectId.length() == 0) {
            LLLLLZ().LJ();
        } else {
            if (effect != null) {
                LLLLLZ().LJIJ(effect);
                LLLLLZ().LJIIJ();
            }
            effect3 = effect;
        }
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            LLLZZIL();
            return;
        }
        if (effect3 != null) {
            effect3.getEffectId();
        }
        LLLZI().by2(LLLLZ(), effect3);
        Scene scene = this.mParentScene;
        if (scene != null) {
            LLLLLJIL(scene, effect3);
        }
    }

    public final void LLLLLLJ() {
        C12RZ c12rzLLLLZLLIL = LLLLZLLIL();
        c12rzLLLLZLLIL.LIZ = 0;
        c12rzLLLLZLLIL.LIZIZ = 0;
        c12rzLLLLZLLIL.LIZJ = 0;
        String str = this.LLLFF;
        if (str != null) {
            LLLZI().oT(str);
        }
        String str2 = this.LLLFFI;
        if (str2 != null) {
            LLLZI().oT(str2);
        }
        this.LLLFF = null;
        this.LLLFFI = null;
    }

    public final Effect LLLLZIL() {
        NLEModel model = LLLLZLL().getModel();
        if (model == null) {
            return null;
        }
        List listLIZ = C348930Dm7.LIZ(model);
        C19546111db.LIZ.getClass();
        Effect effectLJFF = C19546111db.LJFF();
        if (LLLZI().pC0().LIZ(new C19536311c1(null, new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null), (NLEModel) C13LP.LJJJLL(listLIZ)), SpeakerCenter.LIZ.getString("restoreSpeakerId", ""))) {
            return effectLJFF;
        }
        return null;
    }

    public final int LLLZ() {
        Effect effect;
        C1664150tPJ c1664150tPJLJIIJJI = LLLLLZ().LJIIJJI();
        if (c1664150tPJLJIIJJI == null || (effect = c1664150tPJLJIIJJI.LIZ) == null) {
            return 0;
        }
        return C1664460tPo.LIZLLL(effect) ? 3 : 1;
    }

    public final boolean LLLZIIL() {
        NLETrack nLETrackPrevious;
        VecNLETrackSlotSPtr slots;
        NLEModel model = LLLLZLL().getModel();
        if (model == null) {
            return false;
        }
        VecNLETrackSPtr tracks = model.getTracks();
        ListIterator<NLETrack> listIterator = tracks.listIterator(tracks.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                nLETrackPrevious = null;
                break;
            }
            nLETrackPrevious = listIterator.previous();
            if (Intrinsics.LJFF(nLETrackPrevious.getExtra("AudioTrackType"), "DUB")) {
                break;
            }
        }
        NLETrack nLETrack = nLETrackPrevious;
        return (nLETrack == null || (slots = nLETrack.getSlots()) == null || slots.size() <= 0) ? false : true;
    }

    public final void LLLZZIL() {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        AbstractC1452680nuE abstractC1452680nuEGc = LLLLZ().gc();
        NLEEditor nLEEditor = (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null) ? null : c348100DkmLIZIZ.LIZ;
        Effect effect = this.LLJJLIIIJLLLLLLLZ;
        if (effect == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C352320Dra.LIZJ(LLLLZ());
        C1446150njh.LIZIZ(LLLLZLLLI());
        C352320Dra.LIZ(effect, LLLLLZL(), LLLLZ(), new AwS643S0100000_29(this, 36));
        if (nLEEditor != null) {
            nLEEditor.commit();
            nLEEditor.done();
        }
    }

    public final void LLZIL() {
        Effect effectLLLZLL = LLLZLL();
        if (effectLLLZLL == null) {
            LLLLLZ().LJ();
        } else {
            LLLLLZ().LJIJ(effectLLLZLL);
            LLLLLZ().LJIIJ();
        }
        C1454410nx1.LIZ.getClass();
        if (C1454410nx1.LIZ()) {
            C194350111w c194350111w = this.LLLILZLLLI;
            if (c194350111w == null) {
                c194350111w = null;
            }
            c194350111w.LIZJ(effectLLLZLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZLLLL() {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12QX.LLZLLLL():void");
    }

    public final void c() {
        LLLLZLLIL().LIZIZ = 4;
        LinearLayout linearLayout = this.LLLIILIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 32), linearLayout);
        RelativeLayout relativeLayout = this.LLLILZ;
        C786410Ut5.I7(new AkS95S0100000_29(this, 33), relativeLayout != null ? relativeLayout : null);
        C0CAU.LIZIZ(new ARunnableS129S0100000_29(this, 76));
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        LLLLLZ().onDestroy();
        LLLZI().mV0();
        C194341111n c194341111n = this.LLJZ;
        if (c194341111n.LIZ != 0) {
            c194341111n.LJIIIIZZ();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C2296208zA.LIZ().getClass();
        C2299808zk.LIZJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLLLIILL = false;
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        this.LLLLIILL = true;
        if (this.LLLLIILLL) {
            LLLZZ();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        Effect effect;
        super.onStop();
        C1664150tPJ c1664150tPJ = this.LLLLIIIILLL;
        if (c1664150tPJ == null || (effect = c1664150tPJ.LIZ) == null) {
            return;
        }
        C19546111db.LIZ.getClass();
        if (!C19546111db.LJIIJJI(effect) || C19546111db.LJII(effect)) {
            return;
        }
        c();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJIL;
    }

    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        C194341111n c194341111n = this.LLJZ;
        T t = c194341111n.LIZ;
        if (t != 0) {
            c194341111n.LJFF(t, z);
        }
    }

    public final void LLLLLLL(List<C19536311c1> list) {
        C19536311c1 c19536311c1;
        if (list != null && (c19536311c1 = (C19536311c1) C13LP.LJJJLL(list)) != null) {
            C12RZ c12rzLLLLZLLIL = LLLLZLLIL();
            C19546111db c19546111db = C19546111db.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLZLLLI = LLLLZLLLI();
            c19546111db.getClass();
            c12rzLLLLZLLIL.LIZ = C19546111db.LJIIL(c19536311c1, videoPublishEditModelLLLLZLLLI) ? 1 : 0;
            LLLZI().bl2();
            LLLZI().HY0(c19536311c1);
            return;
        }
        LLLZI().HY0(null);
    }

    public final boolean LLLLLLZ(AudioRecorderParam audioRecorderParam) {
        NLEModel nLEModelLIZ;
        Map<Integer, Integer> map = C12QV.LIZ;
        if (C12QV.LIZ(LLLLZLLLI(), audioRecorderParam, false).LIZ) {
            C19546111db c19546111db = C19546111db.LIZ;
            InterfaceC1452170ntP value = LLLLZ().g().getValue();
            if (value != null) {
                nLEModelLIZ = C352130DrH.LIZ(value);
            } else {
                nLEModelLIZ = null;
            }
            c19546111db.getClass();
            if (C19546111db.LIZ(nLEModelLIZ)) {
                return true;
            }
        }
        if ((!audioRecorderParam.getMStack().isEmpty()) || LLLZ() == 3 || C1428520nHG.LJJJJLI(LLLLZLLLI())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z) {
        int i;
        C12RZ c12rzLLLLZLLIL = LLLLZLLIL();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c12rzLLLLZLLIL.LIZIZ = i;
        LinearLayout linearLayout = this.LLLIILIL;
        RelativeLayout relativeLayout = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.I7(new AkS18S0000000_29(2), linearLayout);
        RelativeLayout relativeLayout2 = this.LLLILZ;
        if (relativeLayout2 != null) {
            relativeLayout = relativeLayout2;
        }
        C786410Ut5.I7(new AkS18S0000000_29(3), relativeLayout);
        C0CAU.LIZIZ(new ARunnableS129S0100000_29(this, 77));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLZ().d02().observe(this, new AObserverS231S0100000_29(this, 75));
    }

    public C12QX(C1DRG c1drg, C19755412Rc c19755412Rc) {
        this.LLJJJIL = c1drg;
        this.LLJJJJ = c19755412Rc;
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLL = C1664770tQJ.LIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLLFZ = C1664770tQJ.LIZ(c1drg, InterfaceC19753012Qe.class, null);
        this.LLLI = C1664770tQJ.LIZ(c1drg, C12RU.class, null);
    }

    public final void LLLLLJIL(LifecycleOwner lifecycleOwner, Effect effect) {
        if (effect != null) {
            C1446150njh.LIZ(lifecycleOwner, LLLLZLLLI(), effect);
        }
    }

    public final void LLLLLLLLL(Effect effect, List list) {
        if (!C1664460tPo.LJFF(effect) && !C1664460tPo.LIZLLL(effect)) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (!LLLZI().pC0().LIZ((C19536311c1) it2.next(), C1664460tPo.LJII(effect))) {
                e(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLLLLLL(int r7, X.C1664150tPJ r8) {
        /*
            r6 = this;
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r8.LIZ
            if (r5 != 0) goto L5
            return
        L5:
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r6.LLLLZLL()
            com.bytedance.ies.nle.editor_jni.NLEModel r3 = r0.getModel()
            X.0nx1 r0 = X.C1454410nx1.LIZ
            r0.getClass()
            boolean r0 = X.C1454410nx1.LIZ()
            r4 = 0
            if (r0 == 0) goto L24
            X.111w r0 = r6.LLLILZLLLI
            if (r0 != 0) goto L1e
            r0 = r4
        L1e:
            java.lang.String r2 = r0.getCurTabName()
            if (r2 != 0) goto L26
        L24:
            java.lang.String r2 = ""
        L26:
            X.0FDJ r0 = X.C12PS.LLJJLIIIJLLLLLLLZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.LLLLZLLLI()
            r0.getClass()
            java.lang.String r0 = "add"
            X.C0FDJ.LIZ(r1, r5, r0, r2)
            java.util.List r0 = X.C348930Dm7.LIZJ(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L43:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r1 = r2.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r1
            X.11c1 r0 = new X.11c1
            r0.<init>(r1, r5, r4)
            r3.add(r0)
            goto L43
        L58:
            java.util.List<? extends com.bytedance.ies.nle.editor_jni.NLEModel> r0 = r6.LLLLJI
            java.util.Iterator r2 = r0.iterator()
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r1 = r2.next()
            com.bytedance.ies.nle.editor_jni.NLEModel r1 = (com.bytedance.ies.nle.editor_jni.NLEModel) r1
            X.11c1 r0 = new X.11c1
            r0.<init>(r4, r5, r1)
            r3.add(r0)
            goto L5e
        L73:
            r0 = 0
            r6.LLZLI(r3, r7, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12QX.LLLLLLLLLL(int, X.0tPJ):void");
    }

    public final void LLLLLLLZIL(final int i, final C1664150tPJ c1664150tPJ) {
        final Effect effect = c1664150tPJ.LIZ;
        if (effect == null) {
            return;
        }
        NLEModel model = LLLLZLL().getModel();
        C0FDJ c0fdj = C12PS.LLJJLIIIJLLLLLLLZ;
        VideoPublishEditModel videoPublishEditModelLLLLZLLLI = LLLLZLLLI();
        c0fdj.getClass();
        C0FDJ.LIZ(videoPublishEditModelLLLLZLLLI, effect, "add", null);
        NLEModel nLEModelLJ = C348970DmB.LJ(model, Float.valueOf(LLLLLZL()));
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new C19536311c1(null, effect, nLEModelLJ));
        arrayList.add(new C19536311c1(null, effect, model));
        LLLLLLL(arrayList);
        LLLLLLLLL(effect, arrayList);
        LLLLLZ().LJIJ(effect);
        final boolean zLLLZIL = LLLZIL(C1664460tPo.LJII(effect), arrayList);
        this.LLLFFI = LLLZI().SY0(arrayList, new InterfaceC1219340hps() { // from class: X.12Qa
            @Override // X.InterfaceC1219340hps
            public final void LIZ(int i2, int i3) {
            }

            @Override // X.InterfaceC1219340hps
            public final void onCancel() {
            }

            @Override // X.InterfaceC1219340hps
            public final void onStart(int i2) {
                this.LIZ.LLLLIL().LIZLLL.invoke(Boolean.FALSE);
                C12QX c12qx = this.LIZ;
                if (!zLLLZIL) {
                    c12qx.e(false);
                } else {
                    c12qx.getClass();
                }
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZIZ(int i2, int i3) {
                Effect effect2;
                if (this.LIZ.getSceneContext() == null) {
                    return;
                }
                this.LIZ.LLLLLZ().LJIILLIIL(i, 1);
                C1664150tPJ c1664150tPJ2 = this.LIZ.LLLLIIIILLL;
                if (c1664150tPJ2 != null && (effect2 = c1664150tPJ2.LIZ) != null && C1664460tPo.LIZLLL(effect2)) {
                    this.LIZ.d(i3, zLLLZIL);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1219340hps
            public final void LIZJ(int i2, List list) {
                int i3;
                if (this.LIZ.getSceneContext() == null || !c1664150tPJ.LJII) {
                    return;
                }
                C12QX c12qx = this.LIZ;
                c12qx.LLLLILI = 0;
                c12qx.c();
                C259800zU c259800zU = new C259800zU();
                C1446150njh.LIZIZ(this.LIZ.LLLLZLLLI());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C19536311c1 c19536311c1 = (C19536311c1) it2.next();
                    String str = c19536311c1.LJ;
                    if (str != null) {
                        this.LIZ.LLLZI().pC0().LIZIZ(c19536311c1, C1664460tPo.LJII(effect), str);
                    }
                    this.LIZ.LLLZI().FZ1(c19536311c1, this.LIZ.LLLLZ(), new AwS306S0300000_29(c259800zU, (C259800zU<Effect>) this.LIZ, (C12QX) c1664150tPJ, (C1664150tPJ) 3));
                }
                C19546111db c19546111db = C19546111db.LIZ;
                Effect effect2 = (Effect) c259800zU.element;
                c19546111db.getClass();
                C19546111db.LJIILIIL(effect2);
                C12QX c12qx2 = this.LIZ;
                c12qx2.LLLLLJIL(C372650EjH.LIZIZ(c12qx2), (Effect) c259800zU.element);
                this.LIZ.LLLLZLL().commit();
                this.LIZ.LLLZI().by2(this.LIZ.LLLLZ(), effect);
                this.LIZ.LLLLLZ().LJIJ(effect);
                this.LIZ.LLLLZLLLI().creativeModel.voiceConversionModel.hasStyleConversion = true;
                this.LIZ.LLZLLLL();
                C12QX c12qx3 = this.LIZ;
                boolean zLLLZIIL = c12qx3.LLLZIIL();
                RelativeLayout relativeLayout = this.LIZ.LLLILZ;
                if (relativeLayout == null) {
                    relativeLayout = null;
                }
                c12qx3.LLZLLIL(relativeLayout, zLLLZIIL);
                C12QX c12qx4 = this.LIZ;
                if (c12qx4.getSceneContext() != null) {
                    TuxTextView tuxTextView = c12qx4.LLLIIL;
                    if (tuxTextView == null) {
                        tuxTextView = null;
                    }
                    Context contextRequireSceneContext = c12qx4.requireSceneContext();
                    if (C297750Bll.LIZ()) {
                        i3 = 2131826780;
                    } else {
                        i3 = 2131826779;
                    }
                    tuxTextView.setText(contextRequireSceneContext.getString(i3));
                }
                this.LIZ.LLLLIL().LJ.invoke();
                this.LIZ.LLLZZ();
                this.LIZ.LLLFFI = null;
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZLLL(int i2, C19536611c4 c19536611c4) {
                if (this.LIZ.getSceneContext() == null || !c1664150tPJ.LJII) {
                    return;
                }
                this.LIZ.c();
                C384200F4o c384200F4o = C384200F4o.LIZ;
                Context contextRequireSceneContext = this.LIZ.requireSceneContext();
                Integer numValueOf = Integer.valueOf(c19536611c4.LIZ);
                c384200F4o.getClass();
                C384200F4o.LIZIZ(contextRequireSceneContext, numValueOf);
                this.LIZ.LLZLLLL();
                this.LIZ.LLLFFI = null;
                List<C19536311c1> list = arrayList;
                if (list != null && C13LP.LJJJLL(list) != null && this.LIZ.LLZ()) {
                    return;
                }
                this.LIZ.LLLLLZ().LJ();
                this.LIZ.LLLZZ();
            }
        });
    }

    public final boolean LLLZIL(String str, List list) {
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!LLLZI().pC0().LIZ((C19536311c1) it2.next(), str)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final void LLLZLZ(int i, int i2) {
        C1454410nx1.LIZ.getClass();
        LinearLayout linearLayout = null;
        if (!C1454410nx1.LIZ()) {
            if (i2 > 0) {
                View view = this.LLLIZZ;
                if (view == null) {
                    view = null;
                }
                C786410Ut5.LJLLLLLL(0, view);
            } else {
                View view2 = this.LLLIZZ;
                if (view2 == null) {
                    view2 = null;
                }
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        if (i > 0) {
            if (!this.LLJLL) {
                LinearLayout linearLayout2 = this.LLLIILIL;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                if (linearLayout2.getVisibility() != 8) {
                    LinearLayout linearLayout3 = this.LLLIILIL;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    float f = ((ViewGroup.MarginLayoutParams) linearLayout3.getLayoutParams()).bottomMargin;
                    LinearLayout linearLayout4 = this.LLLIILIL;
                    if (linearLayout4 == null) {
                        linearLayout4 = null;
                    }
                    this.LLJLLL = f + linearLayout4.getHeight();
                    LinearLayout linearLayout5 = this.LLLIILIL;
                    if (linearLayout5 == null) {
                        linearLayout5 = null;
                    }
                    C786410Ut5.LJZL(0, linearLayout5);
                    LinearLayout linearLayout6 = this.LLLIILIL;
                    if (linearLayout6 != null) {
                        linearLayout = linearLayout6;
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout, "translationY", 0.0f, this.LLJLLL).setDuration(300L);
                    duration.addListener(new AAListenerS339S0100000_29(this, 5));
                    C786410Ut5.Pd(duration);
                    return;
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            return;
        }
        LLLLLJLJLL();
    }

    public final void LLZLL(AudioRecorderParam audioRecorderParam, boolean z) {
        if (getSceneContext() == null) {
            return;
        }
        this.LLJL = requireViewById(R.id.fut);
        boolean zLLLLLLZ = LLLLLLZ(audioRecorderParam);
        if (z) {
            Map<Integer, Integer> map = C12QV.LIZ;
            if (!C12QV.LIZ(LLLLZLLLI(), audioRecorderParam, z).LIZ) {
                zLLLLLLZ = false;
            }
        }
        LinearLayout linearLayout = null;
        if (zLLLLLLZ) {
            View view = this.LLJL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            TuxTextView tuxTextView = this.LLLIIIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            LLLLLZ().LJIIZILJ(new C19754712Qv(true, false, 14));
            LLLLLZ().LJIIL(0);
            LinearLayout linearLayout2 = this.LLLIILIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e2);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
            linearLayout2.setBackground(c384050F3z.LIZ(requireSceneContext()));
            LinearLayout linearLayout3 = this.LLLIILIL;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout3.getLayoutParams();
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
            marginLayoutParams.width = -2;
            LinearLayout linearLayout4 = this.LLLIILIL;
            if (linearLayout4 != null) {
                linearLayout = linearLayout4;
            }
            C786410Ut5.d6(linearLayout, marginLayoutParams);
            return;
        }
        View view2 = this.LLJL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        TuxTextView tuxTextView2 = this.LLLIIIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
        LLLLLZ().LJIIZILJ(new C19754712Qv(false, false, 14));
        LLLLLZ().LJIIL(1);
        LinearLayout linearLayout5 = this.LLLIILIL;
        if (linearLayout5 == null) {
            linearLayout5 = null;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
        linearLayout5.setBackground(c384050F3z2.LIZ(requireSceneContext()));
        LinearLayout linearLayout6 = this.LLLIILIL;
        if (linearLayout6 == null) {
            linearLayout6 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout6.getLayoutParams();
        marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        marginLayoutParams2.width = -1;
        LinearLayout linearLayout7 = this.LLLIILIL;
        if (linearLayout7 != null) {
            linearLayout = linearLayout7;
        }
        C786410Ut5.d6(linearLayout, marginLayoutParams2);
    }

    public final void LLZLLIL(View view, boolean z) {
        if (getSceneContext() == null) {
            return;
        }
        int i = 2131826780;
        TuxTextView tuxTextView = null;
        if (z) {
            if (C1428520nHG.LJJJJLI(LLLLZLLLI())) {
                TuxTextView tuxTextView2 = this.LLLIIL;
                if (tuxTextView2 != null) {
                    tuxTextView = tuxTextView2;
                }
                Context contextRequireSceneContext = requireSceneContext();
                if (!C297750Bll.LIZ()) {
                    i = 2131826779;
                }
                tuxTextView.setText(contextRequireSceneContext.getString(i));
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            TuxTextView tuxTextView3 = this.LLLIIL;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            tuxTextView.setText(requireSceneContext().getString(2131826777));
            this.LLLLL = requireSceneContext().getString(2131826777);
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        TuxTextView tuxTextView4 = this.LLLIIL;
        if (tuxTextView4 != null) {
            tuxTextView = tuxTextView4;
        }
        Context contextRequireSceneContext2 = requireSceneContext();
        if (!C297750Bll.LIZ()) {
            i = 2131826779;
        }
        tuxTextView.setText(contextRequireSceneContext2.getString(i));
        this.LLLLL = requireSceneContext().getString(2131826779);
        C786410Ut5.LJLLLLLL(8, view);
    }

    public final void d(int i, boolean z) {
        if (!z) {
            if (LLLLZLLIL().LIZIZ == 0 || LLLLZLLIL().LIZIZ == 2) {
                LLLLZLLIL().LIZIZ = 3;
            }
            ARunnableS40S0101000_29 aRunnableS40S0101000_29 = new ARunnableS40S0101000_29(this, i, 10);
            C1664150tPJ c1664150tPJ = this.LLLLIIIILLL;
            if (c1664150tPJ != null && c1664150tPJ.LJII && LLLLZLLIL().LIZIZ == 3) {
                C0CAU.LIZIZ(aRunnableS40S0101000_29);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (((double) ScreenUtils.getFullScreenHeight(this.mActivity)) * 0.45d);
        C786410Ut5.W5(view, layoutParams);
    }

    public static final boolean LLZL(Effect effect, C19754712Qv c19754712Qv, boolean z) {
        if (((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2() && C1664460tPo.LIZJ(effect)) {
            return true;
        }
        if (C1664460tPo.LJFF(effect) && !C386180FCe.LIZIZ()) {
            return true;
        }
        if (c19754712Qv != null && c19754712Qv.LIZLLL && C1664460tPo.LJFF(effect)) {
            return true;
        }
        if (C1664460tPo.LIZLLL(effect) && !z) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        C1653260t7k.LIZ("voice_xml_load");
        if (C298050BmF.LIZ()) {
            viewGroup2 = (ViewGroup) C21146717pB.LIZIZ(requireSceneContext(), R.layout.enw, viewGroup, false);
        } else {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.enw, viewGroup, false);
        }
        C1653260t7k.LIZIZ("voice_xml_load");
        return viewGroup2;
    }

    public final void LLZLI(final List<C19536311c1> list, final int i, final C1664150tPJ c1664150tPJ, final boolean z) {
        final Effect effect = c1664150tPJ.LIZ;
        if (effect == null) {
            return;
        }
        LLLLLLL(list);
        LLLLLLLLL(effect, list);
        LLLLLZ().LJIJ(effect);
        final boolean zLLLZIL = LLLZIL(C1664460tPo.LJII(effect), list);
        this.LLLFF = LLLZI().SY0(list, new InterfaceC1219340hps() { // from class: X.12QY
            @Override // X.InterfaceC1219340hps
            public final void onCancel() {
                Effect effect2;
                C1664150tPJ c1664150tPJ2 = this.LIZ.LLLLIIIILLL;
                if (c1664150tPJ2 == null || (effect2 = c1664150tPJ2.LIZ) == null) {
                    return;
                }
                C19546111db.LIZ.getClass();
                if (C19546111db.LJIIJJI(effect2)) {
                    this.LIZ.c();
                }
            }

            @Override // X.InterfaceC1219340hps
            public final void onStart(int i2) {
                this.LIZ.LLLLIL().LIZLLL.invoke(Boolean.FALSE);
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 3) {
                        return;
                    }
                    C12QX c12qx = this.LIZ;
                    if (!zLLLZIL) {
                        c12qx.e(false);
                        return;
                    } else {
                        c12qx.getClass();
                        return;
                    }
                }
                this.LIZ.LLLLLZ().LJIILLIIL(i, 2);
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZ(int i2, int i3) {
                if (i2 == 3) {
                    C19546111db c19546111db = C19546111db.LIZ;
                    Effect effect2 = effect;
                    c19546111db.getClass();
                    if (C19546111db.LJII(effect2)) {
                        this.LIZ.d(i3, zLLLZIL);
                    }
                }
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZIZ(int i2, int i3) {
                if (this.LIZ.getSceneContext() != null && i2 == 1) {
                    this.LIZ.LLLLLZ().LJIILLIIL(i, 1);
                    C19536311c1 c19536311c1 = (C19536311c1) C13LP.LJJJLL(list);
                    if (c19536311c1 != null) {
                        C12QX c12qx = this.LIZ;
                        boolean z2 = zLLLZIL;
                        C19546111db c19546111db = C19546111db.LIZ;
                        VideoPublishEditModel videoPublishEditModelLLLLZLLLI = c12qx.LLLLZLLLI();
                        c19546111db.getClass();
                        if (!C19546111db.LJIIL(c19536311c1, videoPublishEditModelLLLLZLLLI)) {
                            c12qx.d(i3, z2);
                        }
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1219340hps
            public final void LIZJ(int i2, List list2) {
                if (this.LIZ.getSceneContext() == null || !c1664150tPJ.LJII) {
                    return;
                }
                C12QX c12qx = this.LIZ;
                c12qx.LLLLILI = 0;
                if (C1428520nHG.LJJJJLI(c12qx.LLLLZLLLI())) {
                    C12QX c12qx2 = this.LIZ;
                    c12qx2.LLLLIL = true;
                    c12qx2.LLLZI().dF1();
                    this.LIZ.LLLLIL().LJ.invoke();
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 3) {
                            if (!c1664150tPJ.LJII) {
                                return;
                            }
                            this.LIZ.c();
                            C12QX c12qx3 = this.LIZ;
                            c12qx3.LLLJL = c1664150tPJ;
                            if (c12qx3.LLLLIL) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    this.LIZ.LLLZI().FZ1((C19536311c1) it2.next(), this.LIZ.LLLLZ(), null);
                                }
                            }
                            C19546111db c19546111db = C19546111db.LIZ;
                            Effect effect2 = effect;
                            c19546111db.getClass();
                            C19546111db.LJIILIIL(effect2);
                            C12QX c12qx4 = this.LIZ;
                            c12qx4.LLLLLJIL(C372650EjH.LIZIZ(c12qx4), effect);
                        }
                    } else {
                        if (!c1664150tPJ.LJII) {
                            return;
                        }
                        this.LIZ.c();
                        C259800zU c259800zU = new C259800zU();
                        C1446150njh.LIZIZ(this.LIZ.LLLLZLLLI());
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            this.LIZ.LLLZI().FZ1((C19536311c1) it3.next(), this.LIZ.LLLLZ(), new AwS306S0300000_29(c259800zU, (C259800zU<Effect>) this.LIZ, (C12QX) c1664150tPJ, (C1664150tPJ) 4));
                        }
                        C19546111db c19546111db2 = C19546111db.LIZ;
                        Effect effect3 = (Effect) c259800zU.element;
                        c19546111db2.getClass();
                        C19546111db.LJIILIIL(effect3);
                        C12QX c12qx5 = this.LIZ;
                        c12qx5.LLLLLJIL(C372650EjH.LIZIZ(c12qx5), (Effect) c259800zU.element);
                    }
                } else {
                    this.LIZ.LLLLLZ().LJIILLIIL(i, 1);
                    if (true ^ list2.isEmpty()) {
                        this.LIZ.c();
                        C19536311c1 c19536311c1 = (C19536311c1) ListProtector.get(list2, 0);
                        C1446150njh.LIZIZ(this.LIZ.LLLLZLLLI());
                        this.LIZ.LLLZI().FZ1(c19536311c1, this.LIZ.LLLLZ(), new AwS464S0200000_29(this.LIZ, c1664150tPJ, 5));
                    }
                }
                C12QX c12qx6 = this.LIZ;
                c12qx6.LLLLIL = false;
                c12qx6.LLLLZLL().commit();
                this.LIZ.LLLZI().by2(this.LIZ.LLLLZ(), effect);
                Effect effect4 = c1664150tPJ.LIZ;
                if (effect4 != null) {
                    this.LIZ.LLLLLZ().LJIJ(effect4);
                }
                this.LIZ.LLZLLLL();
                C12QX c12qx7 = this.LIZ;
                if (c12qx7.getSceneContext() != null) {
                    TuxTextView tuxTextView = c12qx7.LLLIIL;
                    if (tuxTextView == null) {
                        tuxTextView = null;
                    }
                    tuxTextView.setText(c12qx7.LLLLL);
                }
                C12QX c12qx8 = this.LIZ;
                boolean zLLLZIIL = c12qx8.LLLZIIL();
                RelativeLayout relativeLayout = this.LIZ.LLLILZ;
                if (relativeLayout == null) {
                    relativeLayout = null;
                }
                c12qx8.LLZLLIL(relativeLayout, zLLLZIIL);
                boolean zIsPlaying = this.LIZ.LLLLLLZZ().isPlaying();
                if (i2 != 3 || (!this.LIZ.LLLZI().o5() && !zIsPlaying)) {
                    this.LIZ.LLLZZ();
                }
                this.LIZ.LLLFF = null;
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZLLL(int i2, C19536611c4 c19536611c4) {
                if (this.LIZ.getSceneContext() == null || !c1664150tPJ.LJII) {
                    return;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 3) {
                            C12QX c12qx = this.LIZ;
                            c12qx.LLLFF = null;
                            if (!z) {
                                if (c12qx.LLLJL == null) {
                                    c12qx.LLLZI().dF1();
                                }
                                C12QX c12qx2 = this.LIZ;
                                List<C19536311c1> list2 = list;
                                int i3 = i;
                                C1664150tPJ c1664150tPJ2 = c1664150tPJ;
                                c12qx2.getClass();
                                Iterator<C19536311c1> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LJIILL = true;
                                }
                                c12qx2.LLZLI(list2, i3, c1664150tPJ2, true);
                                return;
                            }
                            return;
                        }
                    } else {
                        this.LIZ.c();
                    }
                } else {
                    this.LIZ.LLLLLZ().LJIILLIIL(i, 1);
                }
                Activity activity = this.LIZ.mActivity;
                if (activity != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(activity.getResources().getString(2131826992));
                    C1390380mHk.LIZ(activity, 3066, creativeToastBuilder);
                }
                this.LIZ.LLZLLLL();
                this.LIZ.LLLFF = null;
                List<C19536311c1> list3 = list;
                if (list3 != null && C13LP.LJJJLL(list3) != null && this.LIZ.LLZ()) {
                    return;
                }
                this.LIZ.LLLLLZ().LJ();
                this.LIZ.LLLZZ();
            }
        });
    }
}
