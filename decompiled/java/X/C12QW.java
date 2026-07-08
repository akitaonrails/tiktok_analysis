package X;

import Y.AAListenerS339S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS40S0101000_29;
import Y.AsS37S0200000_29;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS159S0110000_29;
import kotlin.jvm.internal.AwS306S0300000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12QW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12QW extends AbstractC1664490tPr<C12RM, C19753712Ql> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLL;
    public final C1DRG LLJJJIL;
    public final C1664750tQH LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public Effect LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public InterfaceC1452170ntP LLJLIL;
    public boolean LLJLILLLLZIIL;
    public float LLJLLIL;
    public final C1664750tQH LLJZ;
    public final C1664750tQH LLJZIJLIL;
    public String LLLF;
    public String LLLFF;
    public final C1664750tQH LLLFFI;
    public View LLLI;
    public TuxTextView LLLII;
    public TuxTextView LLLIIII;
    public TuxTextView LLLIIIIL;
    public LinearLayout LLLIIIL;
    public TuxIconView LLLIIL;
    public RelativeLayout LLLIILIL;
    public C194350111w LLLIL;
    public C19724112Fb LLLILZ;
    public View LLLILZJ;
    public boolean LLLILZLLLI;
    public TuxIconView LLLJ;
    public C1664150tPJ LLLJIL;
    public C999420c7A LLLJL;
    public C19724112Fb LLLL;
    public C1664150tPJ LLLLII;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public int LLLLIL;
    public String LLLLJI;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(165));
    public boolean LLJLL = true;
    public final C194341111n LLJLLL = new C194341111n();
    public final C01GW LLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(167));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 247));
    public List<Effect> LLLIZZ = new ArrayList();
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(166));
    public boolean LLLLIIL = true;
    public final C01GW LLLLILI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 248));
    public List<? extends NLEModel> LLLLJ = C13BV.INSTANCE;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12QW.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12QW.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12QW.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12QW.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0);
        c09r3.getClass();
        LLLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final void LLLLLJLJLL() {
        if (this.LLJLL || this.LLJLLIL <= 0.0f) {
            return;
        }
        LinearLayout linearLayout = this.LLLIIIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(0, linearLayout);
        LinearLayout linearLayout2 = this.LLLIIIL;
        ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout2 != null ? linearLayout2 : null, "translationY", this.LLJLLIL, 0.0f).setDuration(300L);
        duration.addListener(new AAListenerS339S0100000_29(this, 2));
        C786410Ut5.Pd(duration);
    }

    public final C0FPW LLLLLLZZ() {
        C194350111w c194350111w;
        C1454410nx1.LIZ.getClass();
        if (!C1454410nx1.LIZ() || (c194350111w = this.LLLIL) == null) {
            return (C1664120tPG) this.LLJJJJ.getValue();
        }
        C0FPW curPanel = c194350111w.getCurPanel();
        return curPanel == null ? (C1664120tPG) this.LLJJJJ.getValue() : curPanel;
    }

    public final float LLLLLZ() {
        if (((InterfaceC1418580n1E) this.LLJZIJLIL.getValue(this, LLLLL[2])).Ie2()) {
            return LLLLZLLIL().getVoiceVolume();
        }
        return 0.0f;
    }

    public final InterfaceC1455860nzM LLLLLZL() {
        return (InterfaceC1455860nzM) this.LLJZ.getValue(this, LLLLL[1]);
    }

    public final NLEEditor LLLLZIL() {
        return (NLEEditor) this.LLLFZ.getValue();
    }

    public final C12RZ LLLLZLL() {
        return (C12RZ) this.LLLLIIIILLL.getValue();
    }

    public final VideoPublishEditModel LLLLZLLIL() {
        return (VideoPublishEditModel) this.LLJJJJJIL.getValue(this, LLLLL[0]);
    }

    public final InterfaceC19753012Qe LLLZ() {
        return (InterfaceC19753012Qe) this.LLLFFI.getValue(this, LLLLL[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r0v32, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    public final Effect LLLZIL() {
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        List<C347470Djl> listLJII;
        C259800zU c259800zU = new C259800zU();
        AbstractC1452680nuE abstractC1452680nuEGc = LLLLLZL().gc();
        boolean z = (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) == null || (listLJII = interfaceC391070FUzLJFF.LJII()) == null) ? false : !listLJII.isEmpty();
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJLIL;
        if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && !C348930Dm7.LJFF(nLEModelLIZ) && !z) {
            this.LLLJIL = null;
            return (Effect) c259800zU.element;
        }
        if (LLLLZLLIL().getVeAudioEffectParam() == null && LLLLZLLIL().creativeModel.streamVoiceConversionModel.vcEffectId.length() == 0 && !C1428520nHG.LJJJJLI(LLLLZLLIL())) {
            c259800zU.element = LLLLZ();
        } else {
            AudioEffectParam veAudioEffectParam = LLLLZLLIL().getVeAudioEffectParam();
            if (veAudioEffectParam != null) {
                if (veAudioEffectParam.getUploadId().length() == 0) {
                    c259800zU.element = LLLLZ();
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
            this.LLLJIL = new C1664150tPJ(effect2, 0, 2046);
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

    public final void LLLZLZ() {
        boolean z;
        if (this.LLLLIIL) {
            LLLLIL().LIZ.invoke(Boolean.TRUE);
            z = false;
        } else {
            z = true;
        }
        this.LLLLIILL = z;
    }

    public final boolean LLLZZIL() {
        Effect effect;
        if (this.LLLLIL > 1) {
            return false;
        }
        LLLLLLZZ().LJ();
        C1664150tPJ c1664150tPJ = this.LLLJIL;
        if (c1664150tPJ != null && (effect = c1664150tPJ.LIZ) != null) {
            LLLLLLZZ().LJIJ(effect);
            int iLIZIZ = LLLLLLZZ().LIZIZ();
            this.LLLLIL++;
            if (!C1664460tPo.LIZLLL(effect)) {
                C1664150tPJ c1664150tPJ2 = this.LLLJIL;
                if (c1664150tPJ2 != null) {
                    LLLLLLLLLL(iLIZIZ, c1664150tPJ2);
                }
                return true;
            }
            C1664150tPJ c1664150tPJ3 = this.LLLJIL;
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
        InterfaceC1452170ntP value = LLLLLZL().g().getValue();
        this.LLJLIL = value;
        C386180FCe.LIZ(value != null ? C352130DrH.LIZ(value) : null);
        this.LLJLL = false;
        if (this.LLJJJJLIIL) {
            LLZ();
            LLLLLLZZ().LJI();
            LLLLLL();
            LLZLI((AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12R8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LIZLLL;
                }
            }).LIZJ()).LIZ, false);
            LLZLLIL();
        } else {
            this.LLJJJJLIIL = true;
            C1454410nx1.LIZ.getClass();
            if (C1454410nx1.LIZ()) {
                C194350111w c194350111w = (C194350111w) requireViewById(R.id.nbg);
                this.LLLIL = c194350111w;
                if (c194350111w == null) {
                    c194350111w = null;
                }
                int visibility = c194350111w.getVisibility();
                c194350111w.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c194350111w);
                C786410Ut5.LJZ(8, (FrameLayout) requireViewById(R.id.voice_filter_layout));
                C194350111w c194350111w2 = this.LLLIL;
                if (c194350111w2 == null) {
                    c194350111w2 = null;
                }
                this.LLLI = c194350111w2.getClearView();
                C194350111w c194350111w3 = this.LLLIL;
                if (c194350111w3 == null) {
                    c194350111w3 = null;
                }
                c194350111w3.setOnVCItemClickListener((InterfaceC1664180tPM) this.LLLLILI.getValue());
                C194350111w c194350111w4 = this.LLLIL;
                if (c194350111w4 == null) {
                    c194350111w4 = null;
                }
                AwS678S0100000_29 awS678S0100000_29 = new AwS678S0100000_29(this, 4);
                C1664420tPk c1664420tPk = c194350111w4.LLILZ;
                if (c1664420tPk == null) {
                    c1664420tPk = null;
                }
                c1664420tPk.LLILZLL = new C19775712Yx(c194350111w4, (C194350111w) awS678S0100000_29, (InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Integer, Unit>) 1);
                C194350111w c194350111w5 = this.LLLIL;
                if (c194350111w5 == null) {
                    c194350111w5 = null;
                }
                this.LLLII = c194350111w5.getTipView();
                C194350111w c194350111w6 = this.LLLIL;
                if (c194350111w6 == null) {
                    c194350111w6 = null;
                }
                VideoPublishEditModel videoPublishEditModelLLLLZLLIL = LLLLZLLIL();
                c194350111w6.getClass();
                c194350111w6.LLJJ = new C386190FCf(videoPublishEditModelLLLLZLLIL);
            } else {
                this.LLLI = requireViewById(R.id.dzu);
                this.LLLII = (TuxTextView) requireViewById(R.id.tv_tip);
                ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.voice_filter_layout);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(requireSceneContext(), 4);
                RecyclerView recyclerViewLIZLLL = LLLLLLZZ().LIZLLL(this.mView.getContext(), gridLayoutManager, new C0DXR() { // from class: X.0GhA
                    @Override // X.C0DXR
                    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    }

                    @Override // X.C0DXR
                    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    }
                });
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart((int) (((double) C1415610mwR.LIZIZ()) * 0.04d));
                layoutParams.setMarginEnd((int) (((double) C1415610mwR.LIZIZ()) * 0.04d));
                layoutParams.topMargin = C366700EZg.LIZ(20.0d);
                viewGroup.addView(recyclerViewLIZLLL, layoutParams);
                C0FPW c0fpwLLLLLLZZ = LLLLLLZZ();
                C1664220tPQ c1664220tPQ = new C1664220tPQ(false);
                c1664220tPQ.LLJIJIL = AFwS217S0000000_28.get$arr$(376);
                c0fpwLLLLLLZZ.LJFF(c1664220tPQ);
                if (recyclerViewLIZLLL != null) {
                    recyclerViewLIZLLL.addOnScrollListener(new AsS37S0200000_29(gridLayoutManager, this, 0));
                }
                this.LLJLLL.LJ.LJ = true;
                final C386190FCf c386190FCf = new C386190FCf(LLLLZLLIL());
                this.LLJLLL.LJII(recyclerViewLIZLLL, new C0FGH() { // from class: X.111r
                    @Override // X.C0FGH
                    public final void LIZ(int i, List<Integer> list) {
                        List<Effect> list2 = this.LIZ.LLLIZZ;
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
                this.LLLILZJ = requireViewById(R.id.j4v);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setColors(new int[]{-16777216, 0});
                View view = this.LLLILZJ;
                if (view == null) {
                    view = null;
                }
                view.setBackground(gradientDrawable);
            }
            LinearLayout linearLayout = (LinearLayout) requireViewById(R.id.aex);
            this.LLLIIIL = linearLayout;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C786410Ut5.LJZL(0, linearLayout);
            LinearLayout linearLayout2 = this.LLLIIIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e2);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
            linearLayout2.setBackground(c384050F3z.LIZ(requireSceneContext()));
            LinearLayout linearLayout3 = this.LLLIIIL;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            C786410Ut5.I7(new AkS95S0100000_29(this, 25), linearLayout3);
            this.LLLIIIIL = (TuxTextView) requireViewById(R.id.aez);
            this.LLLIIL = (TuxIconView) requireViewById(R.id.jyh);
            this.LLLJ = (TuxIconView) requireViewById(R.id.volume_btn2);
            TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.fuz);
            this.LLLIIII = tuxTextView;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C999420c7A c999420c7A = (C999420c7A) requireViewById(R.id.mpn);
            this.LLLJL = c999420c7A;
            if (c999420c7A == null) {
                c999420c7A = null;
            }
            int visibility2 = c999420c7A.getVisibility();
            c999420c7A.setVisibility(4);
            C1602160rnK.LIZIZ(visibility2, 4, c999420c7A);
            this.LLLL = (C19724112Fb) requireViewById(R.id.z0k);
            RelativeLayout relativeLayout = (RelativeLayout) requireViewById(R.id.volume_btn2_layout);
            this.LLLIILIL = relativeLayout;
            if (relativeLayout == null) {
                relativeLayout = null;
            }
            C786410Ut5.I7(new AkS95S0100000_29(this, 27), relativeLayout);
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LIZJ;
                }
            }, new AwS608S0100000_29(this, 192));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RA
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LIZLLL;
                }
            }, new AwS608S0100000_29(this, 193));
            AudioRecorderParam audioRecorderParam = (AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12RB
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LIZLLL;
                }
            }).LIZJ()).LIZ;
            RelativeLayout relativeLayout2 = this.LLLIILIL;
            if (relativeLayout2 == null) {
                relativeLayout2 = null;
            }
            LLZLL(relativeLayout2, true ^ audioRecorderParam.getMStack().isEmpty());
            C19724112Fb c19724112Fb = (C19724112Fb) requireViewById(R.id.z0k);
            this.LLLILZ = c19724112Fb;
            if (c19724112Fb == null) {
                c19724112Fb = null;
            }
            c19724112Fb.setOnSliderListener(new InterfaceC19724212Fc() { // from class: X.12DQ
                public int LIZ;

                @Override // X.InterfaceC19724212Fc
                public final void LIZ(C19724112Fb c19724112Fb2) {
                    C19724112Fb c19724112Fb3 = this.LIZIZ.LLLILZ;
                    C19724112Fb c19724112Fb4 = null;
                    if (c19724112Fb3 == null) {
                        c19724112Fb3 = null;
                    }
                    c19724112Fb3.setKnobRadius(C366700EZg.LIZ(4.0d));
                    C19724112Fb c19724112Fb5 = this.LIZIZ.LLLILZ;
                    if (c19724112Fb5 != null) {
                        c19724112Fb4 = c19724112Fb5;
                    }
                    c19724112Fb4.setKnobShadowOffsetX(C366700EZg.LIZ(8.0d) - C366700EZg.LIZ(4.0d));
                    this.LIZIZ.LLLLIL().LJ.invoke(Integer.valueOf(c19724112Fb2.getIndicator()), Boolean.TRUE);
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "drag_progress_bar_auto_play_enable", true, false)) {
                        C2487409ou.LIZLLL(500L, new ARunnableS129S0100000_29(this.LIZIZ, 75));
                    }
                }

                @Override // X.InterfaceC19724212Fc
                public final void LIZIZ(C19724112Fb c19724112Fb2) {
                    C19724112Fb c19724112Fb3 = this.LIZIZ.LLLILZ;
                    C19724112Fb c19724112Fb4 = null;
                    if (c19724112Fb3 == null) {
                        c19724112Fb3 = null;
                    }
                    c19724112Fb3.setKnobRadius(C366700EZg.LIZ(8.0d));
                    C19724112Fb c19724112Fb5 = this.LIZIZ.LLLILZ;
                    if (c19724112Fb5 != null) {
                        c19724112Fb4 = c19724112Fb5;
                    }
                    c19724112Fb4.setKnobShadowOffsetX(0);
                    this.LIZIZ.LLLLIL().LIZ.invoke(Boolean.FALSE);
                }

                @Override // X.InterfaceC19724212Fc
                public final void LIZJ(int i, boolean z) {
                    if (z && this.LIZ != i) {
                        this.LIZ = i;
                        this.LIZIZ.LLLLIL().LJ.invoke(Integer.valueOf(i), Boolean.FALSE);
                    }
                }
            });
            C19724112Fb c19724112Fb2 = this.LLLILZ;
            if (c19724112Fb2 == null) {
                c19724112Fb2 = null;
            }
            InterfaceC1452170ntP value2 = LLLLLZL().g().getValue();
            c19724112Fb2.setMax(value2 != null ? value2.getDuration() : 0);
            C19724112Fb c19724112Fb3 = this.LLLILZ;
            if (c19724112Fb3 == null) {
                c19724112Fb3 = null;
            }
            c19724112Fb3.setMin(0);
            C19724112Fb c19724112Fb4 = this.LLLILZ;
            if (c19724112Fb4 == null) {
                c19724112Fb4 = null;
            }
            c19724112Fb4.setIndicator(0);
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LJII;
                }
            }, new AwS608S0100000_29(this, 184));
            C386250FCl c386250FCl = (C386250FCl) this.LLL.getValue();
            Context contextRequireSceneContext = requireSceneContext();
            AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 249);
            c386250FCl.getClass();
            C386240FCk c386240FCk = new C386240FCk(contextRequireSceneContext);
            c386240FCk.LIZJ = awS573S0100000_29;
            c386250FCl.LIZ = c386240FCk;
            View view2 = this.LLLI;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.I7(new AkS95S0100000_29(this, 29), view2);
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LIZIZ;
                }
            }, new AwS608S0100000_29(this, 185));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LJ;
                }
            }, new AwS608S0100000_29(this, 190));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LJFF;
                }
            }, new AwS585S0100000_6(this, 164));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12RO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LJI;
                }
            }, new AwS608S0100000_29(this, 183));
            LLZLI((AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12R9
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C12RM) obj).LIZLLL;
                }
            }).LIZJ()).LIZ, false);
            LLZLLIL();
            LLLLLLZZ().LJII((InterfaceC1664180tPM) this.LLLLILI.getValue());
            LLLLLL();
        }
        NLEModel model = LLLLZIL().getModel();
        if (!LLLLZLLIL().isCurrentAutoCutMode()) {
            this.LLLLJ = C348930Dm7.LIZ(model);
        }
        final ArrayList arrayList = new ArrayList();
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        Iterator<? extends NLEModel> it2 = this.LLLLJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C19536311c1(null, effect, it2.next()));
        }
        if (C386180FCe.LIZIZ()) {
            LLLZ().G81((C19538011cI) C19538911cR.LIZ.getValue());
            LLLZ().WG2(arrayList, new InterfaceC1219270hpl() { // from class: X.12RX
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
        AbstractC1452680nuE abstractC1452680nuEGc = LLLLLZL().gc();
        NLEEditor nLEEditor = (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null) ? null : c348100DkmLIZIZ.LIZ;
        C1664150tPJ c1664150tPJLJIILIIL = LLLLLLZZ().LJIILIIL(LLLLLLZZ().LIZIZ());
        Effect effect2 = c1664150tPJLJIILIIL != null ? c1664150tPJLJIILIIL.LIZ : null;
        this.LLJJL = null;
        if (effect2 == null || C1664460tPo.LJFF(effect2) || C1664460tPo.LIZLLL(effect2) || !C703302op.LIZ(effect2.getEffectId())) {
            return;
        }
        this.LLJJL = effect2;
        C352320Dra.LIZJ(LLLLLZL());
        if (nLEEditor != null) {
            nLEEditor.commit();
            nLEEditor.done();
        }
        C1446150njh.LIZIZ(LLLLZLLIL());
        C352320Dra.LIZ(effect2, LLLLLZ(), LLLLLZL(), new AwS643S0100000_29(this, 34));
        if (nLEEditor != null) {
            nLEEditor.commit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLLL() {
        AudioRecorderParam audioRecorderParam = (AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12R4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12RM) obj).LIZLLL;
            }
        }).LIZJ()).LIZ;
        Map<Integer, Integer> map = C12QV.LIZ;
        C19754712Qv c19754712QvLIZ = C12QV.LIZ(LLLLZLLIL(), audioRecorderParam, false);
        boolean z = false;
        C19754712Qv c19754712Qv = new C19754712Qv(c19754712QvLIZ.LIZIZ, c19754712QvLIZ.LIZJ, c19754712QvLIZ.LIZ && LLLLLLZ((AudioRecorderParam) ((C375830EoP) LLLLILI().LIZ(new C2217381BqS() { // from class: X.12R3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12RM) obj).LIZLLL;
            }
        }).LIZJ()).LIZ), c19754712QvLIZ.LIZLLL);
        Effect effectLLLZIL = LLLZIL();
        if (C0CH5.LIZ()) {
            C384200F4o c384200F4o = C384200F4o.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLZLLIL = LLLLZLLIL();
            NLEModel model = LLLLZIL().getModel();
            c384200F4o.getClass();
            if (C384200F4o.LIZ(videoPublishEditModelLLLLZLLIL, model)) {
                z = true;
            }
        }
        C1454410nx1.LIZ.getClass();
        if (!C1454410nx1.LIZ()) {
            LLLLLLZZ().LIZ(new C1664390tPh());
            LLLLLLZZ().LJIJI(c19754712Qv, effectLLLZIL, new C194347111t(this, c19754712QvLIZ, z));
            return;
        }
        LinearLayout linearLayout = this.LLLIIIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(4, linearLayout);
        C194350111w c194350111w = this.LLLIL;
        (c194350111w != null ? c194350111w : null).LIZIZ(c19754712QvLIZ, effectLLLZIL, new AwS395S0200000_29(this, effectLLLZIL, 21), new AwS159S0110000_29(this, z, 0));
    }

    public final void LLLLLLIL() {
        C1664150tPJ c1664150tPJLJIILIIL;
        Effect effect;
        String effectId;
        Effect effect2;
        C1664150tPJ c1664150tPJLJIILIIL2 = LLLLLLZZ().LJIILIIL(LLLLLLZZ().LIZIZ());
        Effect effect3 = null;
        if (c1664150tPJLJIILIIL2 != null && (effect2 = c1664150tPJLJIILIIL2.LIZ) != null) {
            if (!C1664460tPo.LJFF(effect2) && !C1664460tPo.LIZLLL(effect2) && C703302op.LIZ(effect2.getEffectId())) {
                C352320Dra.LIZJ(LLLLLZL());
            }
            C19546111db.LIZ.getClass();
            if (C19546111db.LJIIJJI(effect2)) {
                LLLZ().dF1();
            }
            if (!C19546111db.LJIIJJI(effect2)) {
                LLZLLLL();
            }
        }
        int iLJIILJJIL = LLLLLLZZ().LJIILJJIL();
        if (iLJIILJJIL == -1 || (c1664150tPJLJIILIIL = LLLLLLZZ().LJIILIIL(iLJIILJJIL)) == null || (effect = c1664150tPJLJIILIIL.LIZ) == null || (effectId = effect.getEffectId()) == null || effectId.length() == 0) {
            LLLLLLZZ().LJ();
        } else {
            if (effect != null) {
                LLLLLLZZ().LJIJ(effect);
                LLLLLLZZ().LJIIJ();
            }
            effect3 = effect;
        }
        if (this.LLJJL != null) {
            LLLZZ();
            return;
        }
        if (effect3 != null) {
            effect3.getEffectId();
        }
        LLLZ().by2(LLLLLZL(), effect3);
        Scene scene = this.mParentScene;
        if (scene != null) {
            LLLLLJIL(scene, effect3);
        }
    }

    public final void LLLLLLJ() {
        C12RZ c12rzLLLLZLL = LLLLZLL();
        c12rzLLLLZLL.LIZ = 0;
        c12rzLLLLZLL.LIZIZ = 0;
        c12rzLLLLZLL.LIZJ = 0;
        String str = this.LLLF;
        if (str != null) {
            LLLZ().oT(str);
        }
        String str2 = this.LLLFF;
        if (str2 != null) {
            LLLZ().oT(str2);
        }
        this.LLLF = null;
        this.LLLFF = null;
    }

    public final Effect LLLLZ() {
        NLEModel model = LLLLZIL().getModel();
        if (model == null) {
            return null;
        }
        List listLIZ = C348930Dm7.LIZ(model);
        C19546111db.LIZ.getClass();
        Effect effectLJFF = C19546111db.LJFF();
        if (LLLZ().pC0().LIZ(new C19536311c1(null, new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null), (NLEModel) C13LP.LJJJLL(listLIZ)), SpeakerCenter.LIZ.getString("restoreSpeakerId", ""))) {
            return effectLJFF;
        }
        return null;
    }

    public final int LLLLZLLLI() {
        Effect effect;
        C1664150tPJ c1664150tPJLJIIJJI = LLLLLLZZ().LJIIJJI();
        if (c1664150tPJLJIIJJI == null || (effect = c1664150tPJLJIIJJI.LIZ) == null) {
            return 0;
        }
        return C1664460tPo.LIZLLL(effect) ? 3 : 1;
    }

    public final boolean LLLZI() {
        NLETrack nLETrackPrevious;
        VecNLETrackSlotSPtr slots;
        NLEModel model = LLLLZIL().getModel();
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

    public final void LLLZZ() {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        AbstractC1452680nuE abstractC1452680nuEGc = LLLLLZL().gc();
        NLEEditor nLEEditor = (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null) ? null : c348100DkmLIZIZ.LIZ;
        Effect effect = this.LLJJL;
        if (effect == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C352320Dra.LIZJ(LLLLLZL());
        C1446150njh.LIZIZ(LLLLZLLIL());
        C352320Dra.LIZ(effect, LLLLLZ(), LLLLLZL(), new AwS643S0100000_29(this, 33));
        if (nLEEditor != null) {
            nLEEditor.commit();
            nLEEditor.done();
        }
    }

    public final void LLZ() {
        Effect effectLLLZIL = LLLZIL();
        if (effectLLLZIL == null) {
            LLLLLLZZ().LJ();
        } else {
            LLLLLLZZ().LJIJ(effectLLLZIL);
            LLLLLLZZ().LJIIJ();
        }
        C1454410nx1.LIZ.getClass();
        if (C1454410nx1.LIZ()) {
            C194350111w c194350111w = this.LLLIL;
            if (c194350111w == null) {
                c194350111w = null;
            }
            c194350111w.LIZJ(effectLLLZIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZLLIL() {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12QW.LLZLLIL():void");
    }

    public final void LLZLLLL() {
        LLLLZLL().LIZIZ = 4;
        LinearLayout linearLayout = this.LLLIIIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 26), linearLayout);
        RelativeLayout relativeLayout = this.LLLIILIL;
        C786410Ut5.I7(new AkS95S0100000_29(this, 28), relativeLayout != null ? relativeLayout : null);
        C0CAU.LIZIZ(new ARunnableS129S0100000_29(this, 73));
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        LLLLLLZZ().onDestroy();
        LLLZ().mV0();
        C194341111n c194341111n = this.LLJLLL;
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
        this.LLLLIIL = false;
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        this.LLLLIIL = true;
        if (this.LLLLIILL) {
            LLLZLZ();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        Effect effect;
        super.onStop();
        C1664150tPJ c1664150tPJ = this.LLLLII;
        if (c1664150tPJ == null || (effect = c1664150tPJ.LIZ) == null) {
            return;
        }
        C19546111db.LIZ.getClass();
        if (!C19546111db.LJIIJJI(effect) || C19546111db.LJII(effect)) {
            return;
        }
        LLZLLLL();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJIL;
    }

    public C12QW(C1DRG c1drg) {
        this.LLJJJIL = c1drg;
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLLFFI = C1664770tQJ.LIZ(c1drg, InterfaceC19753012Qe.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        C194341111n c194341111n = this.LLJLLL;
        T t = c194341111n.LIZ;
        if (t != 0) {
            c194341111n.LJFF(t, z);
        }
    }

    public final void LLLLLLL(List<C19536311c1> list) {
        C19536311c1 c19536311c1;
        if (list != null && (c19536311c1 = (C19536311c1) C13LP.LJJJLL(list)) != null) {
            C12RZ c12rzLLLLZLL = LLLLZLL();
            C19546111db c19546111db = C19546111db.LIZ;
            VideoPublishEditModel videoPublishEditModelLLLLZLLIL = LLLLZLLIL();
            c19546111db.getClass();
            c12rzLLLLZLL.LIZ = C19546111db.LJIIL(c19536311c1, videoPublishEditModelLLLLZLLIL) ? 1 : 0;
            LLLZ().bl2();
            LLLZ().HY0(c19536311c1);
            return;
        }
        LLLZ().HY0(null);
    }

    public final boolean LLLLLLZ(AudioRecorderParam audioRecorderParam) {
        NLEModel nLEModelLIZ;
        Map<Integer, Integer> map = C12QV.LIZ;
        if (C12QV.LIZ(LLLLZLLIL(), audioRecorderParam, false).LIZ) {
            C19546111db c19546111db = C19546111db.LIZ;
            InterfaceC1452170ntP value = LLLLLZL().g().getValue();
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
        if ((!audioRecorderParam.getMStack().isEmpty()) || LLLLZLLLI() == 3 || C1428520nHG.LJJJJLI(LLLLZLLIL())) {
            return true;
        }
        return false;
    }

    public final void d(boolean z) {
        int i;
        C12RZ c12rzLLLLZLL = LLLLZLL();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c12rzLLLLZLL.LIZIZ = i;
        LinearLayout linearLayout = this.LLLIIIL;
        RelativeLayout relativeLayout = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.I7(new AkS18S0000000_29(0), linearLayout);
        RelativeLayout relativeLayout2 = this.LLLIILIL;
        if (relativeLayout2 != null) {
            relativeLayout = relativeLayout2;
        }
        C786410Ut5.I7(new AkS18S0000000_29(1), relativeLayout);
        C0CAU.LIZIZ(new ARunnableS129S0100000_29(this, 74));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLLZL().d02().observe(this, new AObserverS231S0100000_29(this, 74));
    }

    public final void LLLLLJIL(LifecycleOwner lifecycleOwner, Effect effect) {
        if (effect != null) {
            C1446150njh.LIZ(lifecycleOwner, LLLLZLLIL(), effect);
        }
    }

    public final void LLLLLLLLL(Effect effect, List list) {
        if (!C1664460tPo.LJFF(effect) && !C1664460tPo.LIZLLL(effect)) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (!LLLZ().pC0().LIZ((C19536311c1) it2.next(), C1664460tPo.LJII(effect))) {
                d(true);
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
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r6.LLLLZIL()
            com.bytedance.ies.nle.editor_jni.NLEModel r3 = r0.getModel()
            X.0nx1 r0 = X.C1454410nx1.LIZ
            r0.getClass()
            boolean r0 = X.C1454410nx1.LIZ()
            r4 = 0
            if (r0 == 0) goto L24
            X.111w r0 = r6.LLLIL
            if (r0 != 0) goto L1e
            r0 = r4
        L1e:
            java.lang.String r2 = r0.getCurTabName()
            if (r2 != 0) goto L26
        L24:
            java.lang.String r2 = ""
        L26:
            X.0FDJ r0 = X.C12PS.LLJJLIIIJLLLLLLLZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.LLLLZLLIL()
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
            java.util.List<? extends com.bytedance.ies.nle.editor_jni.NLEModel> r0 = r6.LLLLJ
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
            r6.LLZL(r3, r7, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12QW.LLLLLLLLLL(int, X.0tPJ):void");
    }

    public final void LLLLLLLZIL(final int i, final C1664150tPJ c1664150tPJ) {
        final Effect effect = c1664150tPJ.LIZ;
        if (effect == null) {
            return;
        }
        NLEModel model = LLLLZIL().getModel();
        C0FDJ c0fdj = C12PS.LLJJLIIIJLLLLLLLZ;
        VideoPublishEditModel videoPublishEditModelLLLLZLLIL = LLLLZLLIL();
        c0fdj.getClass();
        C0FDJ.LIZ(videoPublishEditModelLLLLZLLIL, effect, "add", null);
        NLEModel nLEModelLJ = C348970DmB.LJ(model, Float.valueOf(LLLLLZ()));
        final ArrayList arrayList = new ArrayList();
        arrayList.add(new C19536311c1(null, effect, nLEModelLJ));
        arrayList.add(new C19536311c1(null, effect, model));
        LLLLLLL(arrayList);
        LLLLLLLLL(effect, arrayList);
        LLLLLLZZ().LJIJ(effect);
        final boolean zLLLZIIL = LLLZIIL(C1664460tPo.LJII(effect), arrayList);
        this.LLLFF = LLLZ().SY0(arrayList, new InterfaceC1219340hps() { // from class: X.12Qb
            @Override // X.InterfaceC1219340hps
            public final void LIZ(int i2, int i3) {
            }

            @Override // X.InterfaceC1219340hps
            public final void onCancel() {
            }

            @Override // X.InterfaceC1219340hps
            public final void onStart(int i2) {
                this.LIZ.LLLLIL().LIZ.invoke(Boolean.FALSE);
                C12QW c12qw = this.LIZ;
                if (!zLLLZIIL) {
                    c12qw.d(false);
                } else {
                    c12qw.getClass();
                }
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZIZ(int i2, int i3) {
                Effect effect2;
                if (this.LIZ.getSceneContext() == null) {
                    return;
                }
                this.LIZ.LLLLLLZZ().LJIILLIIL(i, 1);
                C1664150tPJ c1664150tPJ2 = this.LIZ.LLLLII;
                if (c1664150tPJ2 != null && (effect2 = c1664150tPJ2.LIZ) != null && C1664460tPo.LIZLLL(effect2)) {
                    this.LIZ.c(i3, zLLLZIIL);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1219340hps
            public final void LIZJ(int i2, List list) {
                if (this.LIZ.getSceneContext() == null || !c1664150tPJ.LJII) {
                    return;
                }
                C12QW c12qw = this.LIZ;
                c12qw.LLLLIL = 0;
                c12qw.LLZLLLL();
                C259800zU c259800zU = new C259800zU();
                C1446150njh.LIZIZ(this.LIZ.LLLLZLLIL());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C19536311c1 c19536311c1 = (C19536311c1) it2.next();
                    String str = c19536311c1.LJ;
                    if (str != null) {
                        this.LIZ.LLLZ().pC0().LIZIZ(c19536311c1, C1664460tPo.LJII(effect), str);
                    }
                    this.LIZ.LLLZ().FZ1(c19536311c1, this.LIZ.LLLLLZL(), new AwS306S0300000_29(c259800zU, (C259800zU<Effect>) this.LIZ, (C12QW) c1664150tPJ, (C1664150tPJ) 1));
                }
                C19546111db c19546111db = C19546111db.LIZ;
                Effect effect2 = (Effect) c259800zU.element;
                c19546111db.getClass();
                C19546111db.LJIILIIL(effect2);
                C12QW c12qw2 = this.LIZ;
                c12qw2.LLLLLJIL(C372650EjH.LIZIZ(c12qw2), (Effect) c259800zU.element);
                this.LIZ.LLLLZIL().commit();
                this.LIZ.LLLZ().by2(this.LIZ.LLLLLZL(), effect);
                this.LIZ.LLLLLLZZ().LJIJ(effect);
                this.LIZ.LLLLZLLIL().creativeModel.voiceConversionModel.hasStyleConversion = true;
                this.LIZ.LLZLLIL();
                C12QW c12qw3 = this.LIZ;
                boolean zLLLZI = c12qw3.LLLZI();
                RelativeLayout relativeLayout = this.LIZ.LLLIILIL;
                if (relativeLayout == null) {
                    relativeLayout = null;
                }
                c12qw3.LLZLL(relativeLayout, zLLLZI);
                C12QW c12qw4 = this.LIZ;
                if (c12qw4.getSceneContext() != null) {
                    TuxTextView tuxTextView = c12qw4.LLLIIIIL;
                    if (tuxTextView == null) {
                        tuxTextView = null;
                    }
                    tuxTextView.setText(c12qw4.requireSceneContext().getString(2131826779));
                }
                this.LIZ.LLLLIL().LIZIZ.invoke();
                this.LIZ.LLLZLZ();
                this.LIZ.LLLFF = null;
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZLLL(int i2, C19536611c4 c19536611c4) {
                if (this.LIZ.getSceneContext() == null || !c1664150tPJ.LJII) {
                    return;
                }
                this.LIZ.LLZLLLL();
                C384200F4o c384200F4o = C384200F4o.LIZ;
                Context contextRequireSceneContext = this.LIZ.requireSceneContext();
                Integer numValueOf = Integer.valueOf(c19536611c4.LIZ);
                c384200F4o.getClass();
                C384200F4o.LIZIZ(contextRequireSceneContext, numValueOf);
                this.LIZ.LLZLLIL();
                this.LIZ.LLLFF = null;
                List<C19536311c1> list = arrayList;
                if (list != null && C13LP.LJJJLL(list) != null && this.LIZ.LLLZZIL()) {
                    return;
                }
                this.LIZ.LLLLLLZZ().LJ();
                this.LIZ.LLLZLZ();
            }
        });
    }

    public final boolean LLLZIIL(String str, List list) {
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!LLLZ().pC0().LIZ((C19536311c1) it2.next(), str)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final void LLLZLL(int i, int i2) {
        C1454410nx1.LIZ.getClass();
        LinearLayout linearLayout = null;
        if (!C1454410nx1.LIZ()) {
            if (i2 > 0) {
                View view = this.LLLILZJ;
                if (view == null) {
                    view = null;
                }
                C786410Ut5.LJLLLLLL(0, view);
            } else {
                View view2 = this.LLLILZJ;
                if (view2 == null) {
                    view2 = null;
                }
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        if (i > 0) {
            if (!this.LLJLILLLLZIIL) {
                LinearLayout linearLayout2 = this.LLLIIIL;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                if (linearLayout2.getVisibility() != 8) {
                    LinearLayout linearLayout3 = this.LLLIIIL;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    float f = ((ViewGroup.MarginLayoutParams) linearLayout3.getLayoutParams()).bottomMargin;
                    LinearLayout linearLayout4 = this.LLLIIIL;
                    if (linearLayout4 == null) {
                        linearLayout4 = null;
                    }
                    this.LLJLLIL = f + linearLayout4.getHeight();
                    LinearLayout linearLayout5 = this.LLLIIIL;
                    if (linearLayout5 == null) {
                        linearLayout5 = null;
                    }
                    C786410Ut5.LJZL(0, linearLayout5);
                    LinearLayout linearLayout6 = this.LLLIIIL;
                    if (linearLayout6 != null) {
                        linearLayout = linearLayout6;
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout, "translationY", 0.0f, this.LLJLLIL).setDuration(300L);
                    duration.addListener(new AAListenerS339S0100000_29(this, 3));
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

    public final void LLZLI(AudioRecorderParam audioRecorderParam, boolean z) {
        if (getSceneContext() == null) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = requireViewById(R.id.fut);
        boolean zLLLLLLZ = LLLLLLZ(audioRecorderParam);
        if (z) {
            Map<Integer, Integer> map = C12QV.LIZ;
            if (!C12QV.LIZ(LLLLZLLIL(), audioRecorderParam, z).LIZ) {
                zLLLLLLZ = false;
            }
        }
        LinearLayout linearLayout = null;
        if (zLLLLLLZ) {
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            TuxTextView tuxTextView = this.LLLIIII;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            LLLLLLZZ().LJIIZILJ(new C19754712Qv(true, false, 14));
            LLLLLLZZ().LJIIL(0);
            LinearLayout linearLayout2 = this.LLLIIIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e2);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
            linearLayout2.setBackground(c384050F3z.LIZ(requireSceneContext()));
            LinearLayout linearLayout3 = this.LLLIIIL;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout3.getLayoutParams();
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
            marginLayoutParams.width = -2;
            LinearLayout linearLayout4 = this.LLLIIIL;
            if (linearLayout4 != null) {
                linearLayout = linearLayout4;
            }
            C786410Ut5.d6(linearLayout, marginLayoutParams);
            return;
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        TuxTextView tuxTextView2 = this.LLLIIII;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
        LLLLLLZZ().LJIIZILJ(new C19754712Qv(false, false, 14));
        LLLLLLZZ().LJIIL(1);
        LinearLayout linearLayout5 = this.LLLIIIL;
        if (linearLayout5 == null) {
            linearLayout5 = null;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
        linearLayout5.setBackground(c384050F3z2.LIZ(requireSceneContext()));
        LinearLayout linearLayout6 = this.LLLIIIL;
        if (linearLayout6 == null) {
            linearLayout6 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout6.getLayoutParams();
        marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        marginLayoutParams2.width = -1;
        LinearLayout linearLayout7 = this.LLLIIIL;
        if (linearLayout7 != null) {
            linearLayout = linearLayout7;
        }
        C786410Ut5.d6(linearLayout, marginLayoutParams2);
    }

    public final void LLZLL(View view, boolean z) {
        if (getSceneContext() == null) {
            return;
        }
        int i = 2131826780;
        TuxTextView tuxTextView = null;
        if (z) {
            if (C1428520nHG.LJJJJLI(LLLLZLLIL())) {
                TuxTextView tuxTextView2 = this.LLLIIIIL;
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
            TuxTextView tuxTextView3 = this.LLLIIIIL;
            if (tuxTextView3 != null) {
                tuxTextView = tuxTextView3;
            }
            tuxTextView.setText(requireSceneContext().getString(2131826777));
            this.LLLLJI = requireSceneContext().getString(2131826777);
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        TuxTextView tuxTextView4 = this.LLLIIIIL;
        if (tuxTextView4 != null) {
            tuxTextView = tuxTextView4;
        }
        Context contextRequireSceneContext2 = requireSceneContext();
        if (!C297750Bll.LIZ()) {
            i = 2131826779;
        }
        tuxTextView.setText(contextRequireSceneContext2.getString(i));
        this.LLLLJI = requireSceneContext().getString(2131826779);
        C786410Ut5.LJLLLLLL(8, view);
    }

    public final void c(int i, boolean z) {
        if (!z) {
            if (LLLLZLL().LIZIZ == 0 || LLLLZLL().LIZIZ == 1 || LLLLZLL().LIZIZ == 2) {
                LLLLZLL().LIZIZ = 3;
            }
            ARunnableS40S0101000_29 aRunnableS40S0101000_29 = new ARunnableS40S0101000_29(this, i, 9);
            C1664150tPJ c1664150tPJ = this.LLLLII;
            if (c1664150tPJ != null && c1664150tPJ.LJII && LLLLZLL().LIZIZ == 3) {
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

    public static final boolean LLZIL(Effect effect, C19754712Qv c19754712Qv, boolean z) {
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

    public final void LLZL(final List<C19536311c1> list, final int i, final C1664150tPJ c1664150tPJ, final boolean z) {
        final Effect effect = c1664150tPJ.LIZ;
        if (effect == null) {
            return;
        }
        LLLLLLL(list);
        LLLLLLLLL(effect, list);
        LLLLLLZZ().LJIJ(effect);
        final boolean zLLLZIIL = LLLZIIL(C1664460tPo.LJII(effect), list);
        this.LLLF = LLLZ().SY0(list, new InterfaceC1219340hps() { // from class: X.12QZ
            @Override // X.InterfaceC1219340hps
            public final void onCancel() {
                Effect effect2;
                C1664150tPJ c1664150tPJ2 = this.LIZ.LLLLII;
                if (c1664150tPJ2 == null || (effect2 = c1664150tPJ2.LIZ) == null) {
                    return;
                }
                C19546111db.LIZ.getClass();
                if (C19546111db.LJIIJJI(effect2)) {
                    this.LIZ.LLZLLLL();
                }
            }

            @Override // X.InterfaceC1219340hps
            public final void onStart(int i2) {
                this.LIZ.LLLLIL().LIZ.invoke(Boolean.FALSE);
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 3) {
                        return;
                    }
                    C12QW c12qw = this.LIZ;
                    if (!zLLLZIIL) {
                        c12qw.d(false);
                        return;
                    } else {
                        c12qw.getClass();
                        return;
                    }
                }
                this.LIZ.LLLLLLZZ().LJIILLIIL(i, 2);
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZ(int i2, int i3) {
                if (i2 == 3) {
                    C19546111db c19546111db = C19546111db.LIZ;
                    Effect effect2 = effect;
                    c19546111db.getClass();
                    if (C19546111db.LJII(effect2)) {
                        this.LIZ.c(i3, zLLLZIIL);
                    }
                }
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZIZ(int i2, int i3) {
                if (this.LIZ.getSceneContext() != null && i2 == 1) {
                    this.LIZ.LLLLLLZZ().LJIILLIIL(i, 1);
                    C19536311c1 c19536311c1 = (C19536311c1) C13LP.LJJJLL(list);
                    if (c19536311c1 != null) {
                        C12QW c12qw = this.LIZ;
                        boolean z2 = zLLLZIIL;
                        C19546111db c19546111db = C19546111db.LIZ;
                        VideoPublishEditModel videoPublishEditModelLLLLZLLIL = c12qw.LLLLZLLIL();
                        c19546111db.getClass();
                        if (!C19546111db.LJIIL(c19536311c1, videoPublishEditModelLLLLZLLIL)) {
                            c12qw.c(i3, z2);
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
                C12QW c12qw = this.LIZ;
                c12qw.LLLLIL = 0;
                if (C1428520nHG.LJJJJLI(c12qw.LLLLZLLIL())) {
                    C12QW c12qw2 = this.LIZ;
                    c12qw2.LLLLIILLL = true;
                    c12qw2.LLLZ().dF1();
                    this.LIZ.LLLLIL().LIZIZ.invoke();
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 3) {
                            this.LIZ.LLZLLLL();
                            C1664150tPJ c1664150tPJ2 = c1664150tPJ;
                            if (!c1664150tPJ2.LJII) {
                                return;
                            }
                            C12QW c12qw3 = this.LIZ;
                            c12qw3.LLLJIL = c1664150tPJ2;
                            if (c12qw3.LLLLIILLL) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    this.LIZ.LLLZ().FZ1((C19536311c1) it2.next(), this.LIZ.LLLLLZL(), null);
                                }
                            }
                            C19546111db c19546111db = C19546111db.LIZ;
                            Effect effect2 = effect;
                            c19546111db.getClass();
                            C19546111db.LJIILIIL(effect2);
                            C12QW c12qw4 = this.LIZ;
                            c12qw4.LLLLLJIL(C372650EjH.LIZIZ(c12qw4), effect);
                        }
                    } else {
                        this.LIZ.LLZLLLL();
                        if (!c1664150tPJ.LJII) {
                            return;
                        }
                        C259800zU c259800zU = new C259800zU();
                        C1446150njh.LIZIZ(this.LIZ.LLLLZLLIL());
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            this.LIZ.LLLZ().FZ1((C19536311c1) it3.next(), this.LIZ.LLLLLZL(), new AwS306S0300000_29(c259800zU, (C259800zU<Effect>) this.LIZ, (C12QW) c1664150tPJ, (C1664150tPJ) 2));
                        }
                        C19546111db c19546111db2 = C19546111db.LIZ;
                        Effect effect3 = effect;
                        c19546111db2.getClass();
                        C19546111db.LJIILIIL(effect3);
                        C12QW c12qw5 = this.LIZ;
                        c12qw5.LLLLLJIL(C372650EjH.LIZIZ(c12qw5), (Effect) c259800zU.element);
                    }
                } else {
                    this.LIZ.LLLLLLZZ().LJIILLIIL(i, 1);
                    if (true ^ list2.isEmpty()) {
                        this.LIZ.LLZLLLL();
                        C19536311c1 c19536311c1 = (C19536311c1) ListProtector.get(list2, 0);
                        C1446150njh.LIZIZ(this.LIZ.LLLLZLLIL());
                        this.LIZ.LLLZ().FZ1(c19536311c1, this.LIZ.LLLLLZL(), new AwS464S0200000_29(this.LIZ, c1664150tPJ, 4));
                    }
                }
                C12QW c12qw6 = this.LIZ;
                c12qw6.LLLLIILLL = false;
                c12qw6.LLLLZIL().commit();
                this.LIZ.LLLZ().by2(this.LIZ.LLLLLZL(), effect);
                Effect effect4 = c1664150tPJ.LIZ;
                if (effect4 != null) {
                    this.LIZ.LLLLLLZZ().LJIJ(effect4);
                }
                this.LIZ.LLZLLIL();
                C12QW c12qw7 = this.LIZ;
                if (c12qw7.getSceneContext() != null) {
                    TuxTextView tuxTextView = c12qw7.LLLIIIIL;
                    if (tuxTextView == null) {
                        tuxTextView = null;
                    }
                    tuxTextView.setText(c12qw7.LLLLJI);
                }
                C12QW c12qw8 = this.LIZ;
                boolean zLLLZI = c12qw8.LLLZI();
                RelativeLayout relativeLayout = this.LIZ.LLLIILIL;
                if (relativeLayout == null) {
                    relativeLayout = null;
                }
                c12qw8.LLZLL(relativeLayout, zLLLZI);
                boolean zBooleanValue = this.LIZ.LLLLIL().LJI.invoke().booleanValue();
                if (i2 != 3 || (!this.LIZ.LLLZ().o5() && !zBooleanValue)) {
                    this.LIZ.LLLZLZ();
                }
                this.LIZ.LLLF = null;
            }

            @Override // X.InterfaceC1219340hps
            public final void LIZLLL(int i2, C19536611c4 c19536611c4) {
                if (this.LIZ.getSceneContext() == null || !c1664150tPJ.LJII) {
                    return;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 3) {
                            C12QW c12qw = this.LIZ;
                            c12qw.LLLF = null;
                            if (!z) {
                                if (c12qw.LLLJIL == null) {
                                    c12qw.LLLZ().dF1();
                                }
                                C12QW c12qw2 = this.LIZ;
                                List<C19536311c1> list2 = list;
                                int i3 = i;
                                C1664150tPJ c1664150tPJ2 = c1664150tPJ;
                                c12qw2.getClass();
                                Iterator<C19536311c1> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LJIILL = true;
                                }
                                c12qw2.LLZL(list2, i3, c1664150tPJ2, true);
                                return;
                            }
                            return;
                        }
                    } else {
                        this.LIZ.LLZLLLL();
                    }
                } else {
                    this.LIZ.LLLLLLZZ().LJIILLIIL(i, 1);
                }
                Activity activity = this.LIZ.mActivity;
                if (activity != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(activity.getResources().getString(2131826992));
                    C1390380mHk.LIZ(activity, 3066, creativeToastBuilder);
                }
                this.LIZ.LLZLLIL();
                this.LIZ.LLLF = null;
                List<C19536311c1> list3 = list;
                if (list3 != null && C13LP.LJJJLL(list3) != null && this.LIZ.LLLZZIL()) {
                    return;
                }
                this.LIZ.LLLLLLZZ().LJ();
                this.LIZ.LLLZLZ();
            }
        });
    }
}
