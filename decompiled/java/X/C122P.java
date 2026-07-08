package X;

import Y.AObjectS240S0100000_5;
import Y.AObjectS247S0100000_29;
import Y.AObserverS209S0100000_5;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS34S0201000_29;
import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.vesdk.VEEditor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zoo.b;

/* JADX INFO: renamed from: X.122P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C122P implements InterfaceC1166920gTK, InterfaceC1391500mJY {
    public final C19EG LL;
    public final InterfaceC1461390o8H LLILLJJLI;
    public final InterfaceC1455860nzM LLILLL;
    public final FrameLayout LLILZ;
    public final C124T LLILZIL;
    public final C121O LLILZLL;
    public final LiveData<InterfaceC1452170ntP> LLIZ;
    public final InterfaceC196906122e LLIZLLLIL;
    public final int LLJ;
    public Rect LLJI;
    public InterfaceC1453510nvZ LLJIJIL;
    public final boolean LLJILJIL;
    public final C0FVR LLJILJILJ;
    public final AnonymousClass1240 LLJILLL;
    public final TTSVoiceModel LLJJ;
    public final Function0<Unit> LLJJI;
    public final C1DRG LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public StickerHintTextViewModel LLJJIJIL;
    public String LLJJJ;
    public TuxTextView LLJJJIL;
    public C196925122x LLJJJJ;
    public InterfaceC196915122n LLJJJJJIL;
    public InterfaceC196929123b LLJJJJLIIL;
    public C196911122j LLJJL;
    public Function1<? super C196925122x, Unit> LLJJLIIIJLLLLLLLZ;
    public Function1<? super C196925122x, Unit> LLJL;
    public C124A LLJLIL;
    public SoftKeyBoardListener LLJLILLLLZIIL;
    public InterfaceC196928123a LLJLL;
    public Function2<? super C196925122x, ? super C196925122x, Unit> LLJLLIL;
    public InterfaceC196910122i LLJLLL;
    public boolean LLJZ;
    public SafeHandler LLJZIJLIL;
    public ARunnableS34S0201000_29 LLL;
    public int LLLF;
    public int LLLFF;
    public long LLLFFI;
    public boolean LLLFZ;
    public Pair<Integer, Integer> LLLI;
    public final C391040FUw LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public final int LLLIIIL;
    public boolean LLLIIL;
    public MutableLiveData<C1452730nuJ> LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;

    public void LJIJ() {
    }

    public void LJJIJ() {
    }

    public void LJJIL(TextStickerData textStickerData) {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void LJII() {
        TextStickerData data;
        TextStickerData textStickerDataNw2;
        C196925122x c196925122x = this.LLJJJJ;
        if (c196925122x == null || (data = c196925122x.getData()) == null || (textStickerDataNw2 = LJIIL().Nw2()) == null) {
            return;
        }
        data.setAudioTrackDuration(textStickerDataNw2.getAudioTrackDuration());
        data.setAudioTrackFilePath(textStickerDataNw2.getAudioTrackFilePath());
        data.getAudioPathList().addAll(textStickerDataNw2.getAudioPathList());
        data.setAudioText(textStickerDataNw2.getAudioText());
        data.setAudioTrackDuration(textStickerDataNw2.getAudioTrackDuration());
        data.setSpeakerID(textStickerDataNw2.getSpeakerID());
        data.setAudioTrackIndex(textStickerDataNw2.getAudioTrackIndex());
        data.setNleUuid(textStickerDataNw2.getNleUuid());
        data.setHasReadTextAudio(textStickerDataNw2.getHasReadTextAudio());
        data.setVoiceEffectId(textStickerDataNw2.getVoiceEffectId());
        data.setVoiceEffectResourceId(textStickerDataNw2.getVoiceEffectResourceId());
        data.setVoiceAnchorName(textStickerDataNw2.getVoiceAnchorName());
        data.setVoiceEffectIconUrl(textStickerDataNw2.getVoiceEffectIconUrl());
        data.setTtsVoiceModel(textStickerDataNw2.getTtsVoiceModel());
        data.setSpeakerName(textStickerDataNw2.getSpeakerName());
        data.setVoiceCreatorUserName(textStickerDataNw2.getVoiceCreatorUserName());
        data.setVoiceCreatorUserId(textStickerDataNw2.getVoiceCreatorUserId());
        data.setCreatorVoice(textStickerDataNw2.isCreatorVoice());
        data.setTtsAnchorReleaseDate(textStickerDataNw2.getTtsAnchorReleaseDate());
        data.setTtsReleaseDate(textStickerDataNw2.getTtsReleaseDate());
        data.getTtsExtraMap().clear();
        data.getTtsExtraMap().putAll(textStickerDataNw2.getTtsExtraMap());
    }

    public final SafeHandler LJIIJJI() {
        SafeHandler safeHandler = this.LLJZIJLIL;
        if (safeHandler != null) {
            return safeHandler;
        }
        return null;
    }

    public final C122Q LJIIL() {
        return (C122Q) this.LLJJIJI.getValue();
    }

    public final List<TextStickerTextWrap> LJIILIIL() {
        return this.LLILZIL.getTextWrapList();
    }

    public void LJIILJJIL() {
        final C122Q c122qLJIIL = LJIIL();
        this.LLILLJJLI.LIZIZ(new GestureInteractItem(200, new AbstractC21664419qU(c122qLJIIL) { // from class: X.122d
            public final C122Q LL;

            {
                this.LL = c122qLJIIL;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean E2(C21645419nQ c21645419nQ) {
                return this.LL.E2(c21645419nQ);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJJLIIIJLJLI(float f) {
                return this.LL.LJJLIIIJLJLI(f);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLJI(float f) {
                return this.LL.LLLLJI(f);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                return this.LL.LLLZLZ(bVar);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return this.LL.onDown(motionEvent);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return this.LL.onScale(scaleGestureDetector);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return this.LL.onScaleBegin(scaleGestureDetector);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return this.LL.onSingleTapConfirmed(motionEvent);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                return this.LL.onUp(motionEvent);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                return this.LL.LLLLLLLLL(bVar, f, f2);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return this.LL.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return this.LL.onScroll(motionEvent, motionEvent2, f, f2);
            }
        }));
    }

    public void LJIILL() {
        this.LLJLIL = new C124A() { // from class: X.122S
            @Override // X.C124A
            public final void dismiss() {
                TextStickerData data;
                TextStickerData data2;
                C122P c122p = this.LIZ;
                C196925122x c196925122x = c122p.LLJJJJ;
                if (c196925122x != null) {
                    AnonymousClass1240 anonymousClass1240 = c122p.LLJILLL;
                    if (anonymousClass1240 != null) {
                        boolean zHa2 = c122p.LJIIL().ha2();
                        if (anonymousClass1240.LIZJ) {
                            if (zHa2) {
                                TextStickerData data3 = c196925122x.getData();
                                if (data3 != null) {
                                    HandlerHook.viewPost(c196925122x, new ARunnableS98S0200000_29(c196925122x, data3, 1));
                                }
                            } else {
                                c196925122x.setCenterY(anonymousClass1240.LIZ);
                                c196925122x.setCenterX(anonymousClass1240.LIZIZ);
                                float f = anonymousClass1240.LIZIZ;
                                float f2 = anonymousClass1240.LIZ;
                                AnonymousClass1238 anonymousClass1238 = c196925122x.LLJJIJI;
                                anonymousClass1238.LJIIIIZZ = f;
                                anonymousClass1238.LJIIIZ = f2;
                                anonymousClass1240.LIZ = 0.0f;
                                anonymousClass1240.LIZIZ = 0.0f;
                                anonymousClass1240.LIZJ = false;
                            }
                        }
                    }
                    if (c122p.LLLILZ && (data2 = c196925122x.getData()) != null && data2.getHasReadTextAudio()) {
                        c122p.LLLILZ = false;
                    }
                    if (!(c196925122x instanceof AnonymousClass1233) && c122p.LLLILZ && !c122p.LJIIL().ha2() && !c122p.LJIIL().fl2() && (((data = c196925122x.getData()) == null || !data.getHasReadTextAudio()) && C196909122h.LIZIZ().LIZIZ.LJI && (C196909122h.LIZIZ().LIZIZ.LIZIZ || C196909122h.LIZIZ().LIZIZ.LIZJ))) {
                        c122p.LLLILZ = false;
                        HandlerHook.viewPostDelay(c196925122x, new ARunnableS113S0100000_13(c196925122x, 4), 200L);
                    }
                }
                if (!this.LIZ.LJIIL().ha2() && !this.LIZ.LJIIL().fl2()) {
                    this.LIZ.LJIIL().u2().LJIIJ(new Pair<>(Boolean.TRUE, Boolean.FALSE));
                }
                this.LIZ.LJJIIJZLJL();
                this.LIZ.LJIIL().Cf2(false, this.LIZ.LLJJJJ);
            }

            @Override // X.C124A
            public final void show() {
                AnonymousClass1240 anonymousClass1240;
                TextStickerData data;
                C122P c122p = this.LIZ;
                C196925122x c196925122x = c122p.LLJJJJ;
                if (c196925122x != null && (anonymousClass1240 = c122p.LLJILLL) != null) {
                    c122p.LJIIL().ha2();
                    if (!anonymousClass1240.LIZJ && (data = c196925122x.getData()) != null) {
                        anonymousClass1240.LIZ = c196925122x.getCenterY();
                        anonymousClass1240.LIZIZ = c196925122x.getCenterX();
                        c196925122x.setCenterY(c196925122x.LJIILIIL(data.getEditCenterPoint().x, data.getEditCenterPoint().y).y);
                        c196925122x.setCenterX(c196925122x.LJIILIIL(data.getEditCenterPoint().x, data.getEditCenterPoint().y).x);
                        anonymousClass1240.LIZJ = true;
                    }
                }
                C122P c122p2 = this.LIZ;
                if (c122p2.LLJJJJ == null) {
                    c122p2.LLILZIL.LJIJI();
                }
                C560530Lyd<Pair<Boolean, Boolean>> c560530LydU2 = this.LIZ.LJIIL().u2();
                Boolean bool = Boolean.FALSE;
                c560530LydU2.LJIIJ(new Pair<>(bool, bool));
                this.LIZ.LJJIIZ(false);
                this.LIZ.LJIIL().Cf2(true, this.LIZ.LLJJJJ);
            }
        };
        this.LLJJL = new C196911122j(this);
        final C124T c124t = this.LLILZIL;
        c124t.setInputLayoutShowListener(new C124A() { // from class: X.122W
            @Override // X.C124A
            public final void dismiss() {
                TextStickerData data;
                MutableLiveData<Integer> mutableLiveDataIM0;
                C196925122x c196925122x = this.LIZ.LLJJJJ;
                if (c196925122x != null) {
                    c196925122x.LJIIL();
                }
                c124t.LJIILJJIL();
                InterfaceC1455860nzM interfaceC1455860nzM = this.LIZ.LLILLL;
                if (interfaceC1455860nzM != null && (mutableLiveDataIM0 = interfaceC1455860nzM.iM0()) != null) {
                    mutableLiveDataIM0.setValue(-1);
                }
                C196925122x c196925122x2 = this.LIZ.LLJJJJ;
                if (c196925122x2 == null || (data = c196925122x2.getData()) == null) {
                    return;
                }
                C122P c122p = this.LIZ;
                C124T c124t2 = c124t;
                c122p.getClass();
                if (C122P.LJ(c124t2, data) || !(data.getTtsVoiceModel() == null || TextUtils.isEmpty(data.getTtsVoiceModel().getEffectId()) || data.getAutoAddTtsFlag())) {
                    c122p.LJIJJLI(c124t2, data, C123P.LJIIIIZZ(c124t2.getTextWrapList()));
                }
            }

            @Override // X.C124A
            public final void show() {
                MutableLiveData<Integer> mutableLiveDataIM0;
                C124A c124a = this.LIZ.LLJLIL;
                if (c124a != null) {
                    c124a.show();
                }
                InterfaceC1455860nzM interfaceC1455860nzM = this.LIZ.LLILLL;
                if (interfaceC1455860nzM == null || (mutableLiveDataIM0 = interfaceC1455860nzM.iM0()) == null) {
                    return;
                }
                mutableLiveDataIM0.setValue(3);
            }
        });
        c124t.setTextStickerUpdateListener(new InterfaceC196961124h() { // from class: X.122p
            @Override // X.InterfaceC196961124h
            public final void LIZ() {
                c124t.LJIILJJIL();
            }
        });
        c124t.setVisibleController(new C124P() { // from class: X.122k
            @Override // X.C124P
            public final void LIZ() {
                c124t.LJIILJJIL();
            }

            @Override // X.C124P
            public final void LIZIZ() {
                C122P c122p = this.LIZ;
                c122p.LJJIJIIJIL(c122p.LLJJJJ, null);
            }
        });
    }

    public final void LJJIJLIJ() {
        int[] iArrLIZ;
        View contentView;
        Pair<Integer, Integer> pair = this.LLLI;
        if (pair == null || pair.getFirst().intValue() == 0 || pair.getSecond().intValue() == 0) {
            return;
        }
        InterfaceC196906122e interfaceC196906122e = this.LLIZLLLIL;
        if (interfaceC196906122e == null || interfaceC196906122e.LJLJI()) {
            InterfaceC196906122e interfaceC196906122e2 = this.LLIZLLLIL;
            if (interfaceC196906122e2 == null || (iArrLIZ = interfaceC196906122e2.LJLJJI(this.LLILZ)) == null) {
                iArrLIZ = C1675310thJ.LIZ(pair.getFirst().intValue(), pair.getSecond().intValue(), this.LLILZ);
            }
        } else {
            iArrLIZ = new int[]{0, 0};
        }
        this.LLLF = iArrLIZ[0];
        this.LLLFF = iArrLIZ[1];
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        InterfaceC196906122e interfaceC196906122e3 = this.LLIZLLLIL;
        this.LLJI = (interfaceC196906122e3 == null || interfaceC196906122e3.LJLJI()) ? new Rect(0, 0, layoutParams.width, layoutParams.height) : new Rect(0, 0, pair.getFirst().intValue(), pair.getSecond().intValue());
        InterfaceC196906122e interfaceC196906122e4 = this.LLIZLLLIL;
        if ((interfaceC196906122e4 == null || interfaceC196906122e4.LJLIIIL()) ? false : true) {
            this.LLJIJIL = null;
            return;
        }
        InterfaceC196906122e interfaceC196906122e5 = this.LLIZLLLIL;
        if (interfaceC196906122e5 == null || interfaceC196906122e5.LJLJI()) {
            InterfaceC1453510nvZ interfaceC1453510nvZ = this.LLJIJIL;
            if (interfaceC1453510nvZ != null && (contentView = interfaceC1453510nvZ.getContentView()) != null && contentView.getParent() != null) {
                C786410Ut5.LJJJLZIJ(contentView, (ViewGroup) contentView.getParent());
            }
            InterfaceC1453600nvi interfaceC1453600nvi = C123O.LIZJ().LIZJ;
            InterfaceC1453510nvZ interfaceC1453510nvZLIZ = interfaceC1453600nvi != null ? interfaceC1453600nvi.LIZ(this.LLLF, this.LL) : null;
            this.LLJIJIL = interfaceC1453510nvZLIZ;
            if (interfaceC1453510nvZLIZ != null) {
                this.LLILZ.addView(interfaceC1453510nvZLIZ.getContentView());
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLJJIJIIJIL.getValue();
    }

    public int LJIIJ() {
        if (C0FI2.LJIJJ().LJII() > 0) {
            return C0FI2.LJIJJ().LJII();
        }
        return 28;
    }

    public void LJIIZILJ() {
        StickerHintTextViewModel stickerHintTextViewModel;
        InterfaceC196906122e interfaceC196906122e;
        LiveData<Unit> liveDataOG2;
        C0FI2.LJIJJ().LJJIL(this.LLILZ.getContext(), Boolean.valueOf(!C298130BmN.LIZ()));
        Scene sceneLIZ = C0EBE.LIZ(this.LLILZ);
        C19EG c19eg = this.LL;
        LJIIL().yr(this.LLJILJIL);
        if (this.LLJJJ == null) {
            stickerHintTextViewModel = sceneLIZ != null ? (StickerHintTextViewModel) C1659630tI1.LJIIIIZZ(sceneLIZ, null, null, 6).get(StickerHintTextViewModel.class) : (StickerHintTextViewModel) ViewModelProviders.of(c19eg).get(StickerHintTextViewModel.class);
        } else if (sceneLIZ != null) {
            ViewModelProvider viewModelProviderLJIIIIZZ = C1659630tI1.LJIIIIZZ(sceneLIZ, null, null, 6);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJJJ);
            sbLIZ.append('-');
            sbLIZ.append(StickerHintTextViewModel.class.getCanonicalName());
            stickerHintTextViewModel = (StickerHintTextViewModel) viewModelProviderLJIIIIZZ.get(C2188811AlT.LIZIZ(sbLIZ), StickerHintTextViewModel.class);
        } else {
            ViewModelProvider viewModelProviderOf = ViewModelProviders.of(c19eg);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLJJJ);
            sbLIZ2.append('-');
            sbLIZ2.append(StickerHintTextViewModel.class.getCanonicalName());
            stickerHintTextViewModel = (StickerHintTextViewModel) viewModelProviderOf.get(C2188811AlT.LIZIZ(sbLIZ2), StickerHintTextViewModel.class);
        }
        this.LLJJIJIL = stickerHintTextViewModel;
        this.LLJZIJLIL = new SafeHandler(this);
        LJIILJJIL();
        SoftKeyBoardListener softKeyBoardListener = new SoftKeyBoardListener(this.LL, null, null, null, 12);
        softKeyBoardListener.LIZIZ(this);
        this.LLJLILLLLZIIL = softKeyBoardListener;
        C121O c121o = this.LLILZLL;
        if (c121o != null) {
            c121o.LJIL();
        }
        InterfaceC1455860nzM interfaceC1455860nzM = this.LLILLL;
        this.LLLIILIL = interfaceC1455860nzM != null ? interfaceC1455860nzM.vW1() : null;
        LJIIL().WZ().observe(this, new AObserverS209S0100000_5(this, 0));
        LJIIL().DT().LIZ(this, new AObjectS247S0100000_29(this, 0));
        LJIIL().ou2().LIZ(this, new AObjectS247S0100000_29(this, 8));
        LJIIL().ze0().LIZ(this, new AObjectS247S0100000_29(this, 14));
        LJIIL().hq2().LIZ(this, new AObjectS247S0100000_29(this, 15));
        LJIIL().pA().LIZ(this, new AObjectS247S0100000_29(this, 16));
        LJIIL().yx().LIZ(this, new AObjectS247S0100000_29(this, 18));
        LJIIL().X40().LIZ(this, new AObjectS247S0100000_29(this, 20));
        LJIIL().Zy2().LIZ(this, new AObjectS247S0100000_29(this, 22));
        LJIIL().iy2().LIZ(this, new AObjectS247S0100000_29(this, 4));
        LJIIL().pM1().LIZ(this, new AObjectS247S0100000_29(this, 5));
        LJIIL().Gh2().LIZ(this, new AObjectS247S0100000_29(this, 6));
        LJIIL().GV1().LIZ(this, new AObjectS247S0100000_29(this, 7));
        LJIIL().Hf1().LIZ(this, new AObjectS240S0100000_5(this, 2));
        LJIIL().aX0().LIZ(this, new AObjectS240S0100000_5(this, 3));
        LJIIL().Ob0().LIZ(this, new AObjectS247S0100000_29(this, 10));
        LJIIL().ZV0().LIZ(this, new AObjectS247S0100000_29(this, 12));
        LJIIL().rW1().LIZ(this, new AObjectS240S0100000_5(this, 4));
        LJIIL().nx0().LIZ(this, new AObjectS240S0100000_5(this, 5));
        LJIIL().gc1().LIZ(this, new AObjectS247S0100000_29(this, 17));
        LJIIL().i92().LIZ(this, new AObjectS247S0100000_29(this, 19));
        LJIIL().JO0().LIZ(this, new AObjectS247S0100000_29(this, 21));
        LJIIL().Uf2().LIZ(this, new AObjectS247S0100000_29(this, 23));
        LJIIL().QA2().LIZ(this, new AObjectS247S0100000_29(this, 24));
        LJIIL().Zp2().LIZ(this, new AObjectS240S0100000_5(this, 6));
        LJIIL().XI().LIZ(this, new AObjectS247S0100000_29(this, 25));
        LJIIL().Es1().LIZ(this, new AObjectS247S0100000_29(this, 26));
        LJIIL().Aa().LIZ(this, new AObjectS247S0100000_29(this, 27));
        LJIIL().gb1().LIZ(this, new AObjectS247S0100000_29(this, 28));
        LJIIL().N62().LIZ(this, new AObjectS247S0100000_29(this, 1));
        LJIIL().Tv0().LIZ(this, new AObjectS247S0100000_29(this, 2));
        LJIIL().ft1().LIZ(this, new InterfaceC1441305kZ() { // from class: X.122U
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C122P c122p = this.LL;
                int iIntValue = ((Integer) obj).intValue();
                Iterator<C196925122x> itOV1 = c122p.LJIIL().OV1();
                while (itOV1.hasNext()) {
                    C196925122x next = itOV1.next();
                    if (C0FVW.LIZ(next)) {
                        TextStickerData data = next.getData();
                        if (data != null && (!data.getInlineTextStyles().isEmpty())) {
                            ArrayList arrayList = new ArrayList(data.getInlineTextStyles());
                            ListIterator listIterator = arrayList.listIterator();
                            while (listIterator.hasNext()) {
                                if (((InlineRichTextStyleData) listIterator.next()).inlineStyle instanceof ForegroundColorStyle) {
                                    listIterator.remove();
                                }
                            }
                            data.setInlineTextStyles(arrayList);
                        }
                        next.LJJIIJ(next.getCurMode(), iIntValue, next.getCurAlignTxt(), next.getCurFontType());
                    } else {
                        return;
                    }
                }
                Iterator<TextStickerData> it2 = c122p.LJIIL().ps2().iterator();
                while (it2.hasNext()) {
                    it2.next().setColor(iIntValue);
                }
            }
        });
        LJIIL().aY0().LIZ(this, new AObjectS247S0100000_29(this, 3));
        LJIIL().xL().LIZ(this, new InterfaceC1441305kZ() { // from class: X.122V
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Pair pair = (Pair) obj;
                C122P c122p = this.LL;
                Iterator<C196925122x> itOV1 = c122p.LJIIL().OV1();
                while (itOV1.hasNext()) {
                    C196925122x next = itOV1.next();
                    if (C0FVW.LIZ(next)) {
                        next.LJJIIJ(((Number) pair.getSecond()).intValue(), next.getCurColor(), next.getCurAlignTxt(), (String) pair.getFirst());
                        TextStickerData textStickerDataLJIIJ = next.LJIIJ();
                        textStickerDataLJIIJ.setFontType((String) pair.getFirst());
                        textStickerDataLJIIJ.setBgMode(((Number) pair.getSecond()).intValue());
                        next.LJJIIZI(textStickerDataLJIIJ.getEffectTextLayoutConfig(), Collections.singletonList(C123P.LIZJ(C123P.LJIILJJIL(textStickerDataLJIIJ, c122p.LLILZ.getContext()))));
                        TextStickerData data = next.getData();
                        if (data != null && (true ^ data.getInlineTextStyles().isEmpty())) {
                            ArrayList arrayList = new ArrayList(data.getInlineTextStyles());
                            ListIterator listIterator = arrayList.listIterator();
                            while (listIterator.hasNext()) {
                                if (((InlineRichTextStyleData) listIterator.next()).inlineStyle instanceof ForegroundColorStyle) {
                                    listIterator.remove();
                                }
                            }
                            data.setInlineTextStyles(arrayList);
                        }
                    } else {
                        return;
                    }
                }
                for (TextStickerData textStickerData : c122p.LJIIL().ps2()) {
                    textStickerData.setFontType((String) pair.getFirst());
                    textStickerData.setBgMode(((Number) pair.getSecond()).intValue());
                    textStickerData.setTextWrapList(C1697810uHb.LJ(C123P.LIZJ(C123P.LJIILJJIL(textStickerData, c122p.LLILZ.getContext()))));
                }
            }
        });
        InterfaceC1455860nzM interfaceC1455860nzM2 = this.LLILLL;
        if (interfaceC1455860nzM2 != null && (liveDataOG2 = interfaceC1455860nzM2.oG2()) != null) {
            liveDataOG2.observe(this, new AObserverS231S0100000_29(this, 2));
        }
        LJIIL().Bz().observe(this, new AObserverS231S0100000_29(this, 3));
        TextWatcher textWatcherXI1 = LJIIL().XI1();
        if (textWatcherXI1 != null) {
            this.LLILZIL.LLILLL.addTextChangedListener(textWatcherXI1);
        }
        LJIIL().c6().LIZ(this, new AObjectS240S0100000_5(this, 0));
        LJIIL().Vo().LIZ(this, new AObjectS240S0100000_5(this, 1));
        LJIIL().N80().LIZ(this, new AObjectS247S0100000_29(this, 9));
        LJIIL().vC2().LIZ(this, new AObjectS247S0100000_29(this, 11));
        LJIIL().yE2().LIZ(this, new AObjectS247S0100000_29(this, 13));
        LJIILL();
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && ((interfaceC196906122e = this.LLIZLLLIL) == null || interfaceC196906122e.LJLIIL())) {
            LJJ(null);
        }
        this.LLL = new ARunnableS34S0201000_29(this, 0);
    }

    public void LJIJI() {
        LJIIL().R02();
        SoftKeyBoardListener softKeyBoardListener = this.LLJLILLLLZIIL;
        if (softKeyBoardListener == null) {
            softKeyBoardListener = null;
        }
        softKeyBoardListener.LIZ();
    }

    public void LJIJJ() {
        SafeHandler safeHandlerLJIIJJI = LJIIJJI();
        ARunnableS34S0201000_29 aRunnableS34S0201000_29 = this.LLL;
        if (aRunnableS34S0201000_29 == null) {
            aRunnableS34S0201000_29 = null;
        }
        safeHandlerLJIIJJI.removeCallbacks(aRunnableS34S0201000_29);
    }

    public final void LJJI() {
        LJIIL().Zs1();
        ArrayList<C196925122x> arrayList = new ArrayList();
        for (C196925122x c196925122x : LJIIL().ht()) {
            if (C0FVW.LIZ(c196925122x)) {
                arrayList.add(c196925122x);
            }
        }
        for (C196925122x c196925122x2 : arrayList) {
            if (LJIIL().ol1().contains(c196925122x2)) {
                LJJIFFI(c196925122x2);
                LJIIL().ol1().remove(c196925122x2);
            }
        }
        if (LJIIL().ol1().size() <= 0) {
            this.LLJJJJ = null;
        }
    }

    public final void LJJIIJZLJL() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (LJIIL().ab1() && (tuxTextView2 = this.LLJJJIL) != null && tuxTextView2.getVisibility() == 8) {
            TuxTextView tuxTextView3 = this.LLJJJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView3);
                return;
            }
            return;
        }
        TuxTextView tuxTextView4 = this.LLJJJIL;
        if (tuxTextView4 == null || tuxTextView4.getVisibility() != 0 || (tuxTextView = this.LLJJJIL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, tuxTextView);
    }

    public boolean LJJIJIIJI() {
        return this.LLLIIII;
    }

    public final void LIZLLL(C196925122x c196925122x) {
        if (c196925122x == null) {
            return;
        }
        if (this.LLILZ.getChildCount() > 1) {
            FrameLayout frameLayout = this.LLILZ;
            if (frameLayout.getChildAt(frameLayout.getChildCount() - 1) != c196925122x) {
                C786410Ut5.LJJJZ(c196925122x, this.LLILZ);
                this.LLILZ.addView(c196925122x);
            }
        }
        C196925122x c196925122xZn0 = LJIIL().Zn0();
        if (c196925122xZn0 != c196925122x) {
            LJIIL().IH1(c196925122x);
            if (c196925122xZn0 == null) {
                return;
            }
        }
        Function2<? super C196925122x, ? super C196925122x, Unit> function2 = this.LLJLLIL;
        if (function2 != null) {
            function2.invoke(c196925122xZn0, c196925122x);
        }
    }

    public final void LJI(C196925122x c196925122x) {
        if (c196925122x != null) {
            TextStickerData data = c196925122x.getData();
            if (data != null && data.getHasReadTextAudio() && !Intrinsics.LJFF(data.getAudioText(), C123P.LJIIIIZZ(data.getTextWrapList())) && C196909122h.LIZIZ().LIZIZ.LIZJ) {
                LJIJJLI(this.LLILZIL, data, C123P.LJIIIIZZ(data.getTextWrapList()));
                return;
            }
            return;
        }
        TextStickerData textStickerDataNw2 = LJIIL().Nw2();
        if (textStickerDataNw2 == null) {
            return;
        }
        LJJII(textStickerDataNw2);
    }

    public C196925122x LJIIIZ(TextStickerData textStickerData) {
        boolean z = false;
        if (textStickerData != null && textStickerData.isCaption()) {
            z = true;
        }
        C196925122x c196925122x = new C196925122x(this.LL, LJIIJJI(), textStickerData, !z, new C124G() { // from class: X.11y6
            @Override // X.C124G
            public final boolean LIZ() {
                return this.LIZ.LJIIL().LLLLZLLIL();
            }
        }, Boolean.TRUE, this.LLJJIII);
        c196925122x.LLJLIL = this.LLJLL;
        c196925122x.LLJLILLLLZIIL = LJIIL().Gb();
        return c196925122x;
    }

    public boolean LJIILLIIL(List<TextStickerTextWrap> list) {
        return C123P.LJIILIIL(list);
    }

    public void LJIL(TTSVoiceModel tTSVoiceModel) {
        String placeholderSlotId;
        LiveData<InterfaceC1452170ntP> liveData;
        InterfaceC1452170ntP value;
        List<TextStickerTextWrap> listLJIILIIL = LJIILIIL();
        if (LJIILLIIL(listLJIILIIL)) {
            LIZJ(listLJIILIIL, tTSVoiceModel);
            LJII();
            LJI(this.LLJJJJ);
        } else {
            C196925122x c196925122x = this.LLJJJJ;
            if (c196925122x != null) {
                C786410Ut5.LJJJZ(c196925122x, this.LLILZ);
                TextStickerData data = c196925122x.getData();
                if (data != null && (placeholderSlotId = data.getPlaceholderSlotId()) != null && !a0.LJJJIL(placeholderSlotId) && (liveData = this.LLIZ) != null && (value = liveData.getValue()) != null) {
                    C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
                    if (c348100DkmLIZIZ != null) {
                        c348100DkmLIZIZ.LJIIIZ().LJIILJJIL(placeholderSlotId);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                LJIIL().Yo(c196925122x);
            }
            LJII();
            LJI(this.LLJJJJ);
            this.LLJJJJ = null;
        }
        this.LLLFZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122P.LJJ(com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel):void");
    }

    public final void LJJIFFI(C196925122x c196925122x) {
        InterfaceC1452170ntP value;
        C786410Ut5.LJJJZ(c196925122x, this.LLILZ);
        InterfaceC196915122n interfaceC196915122n = this.LLJJJJJIL;
        if (interfaceC196915122n != null) {
            interfaceC196915122n.Yo(c196925122x);
        }
        TextStickerData data = c196925122x.getData();
        if (data != null && data.getNleUuid().length() > 0) {
            LiveData<InterfaceC1452170ntP> liveData = this.LLIZ;
            if (liveData != null && (value = liveData.getValue()) != null) {
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
                if (c348100DkmLIZIZ != null) {
                    InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
                    C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                    c347650Dk3.LIZJ = data.getNleUuid();
                    interfaceC391070FUzLJFF.LJJJI(c347650Dk3);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            data.setNleUuid("");
            data.setHasReadTextAudio(false);
        }
    }

    public final void LJJII(TextStickerData textStickerData) {
        InterfaceC1452170ntP value;
        LiveData<InterfaceC1452170ntP> liveData = this.LLIZ;
        if (liveData != null && (value = liveData.getValue()) != null && textStickerData.getHasReadTextAudio() && textStickerData.getNleUuid().length() > 0) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null) {
                InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
                C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                c347650Dk3.LIZJ = textStickerData.getNleUuid();
                interfaceC391070FUzLJFF.LJJJI(c347650Dk3);
                textStickerData.setHasReadTextAudio(false);
                textStickerData.setNleUuid("");
                textStickerData.setAudioTrackFilePath(null);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJJIII(C196925122x c196925122x) {
        Integer numValueOf;
        Function0<Unit> function0;
        InterfaceC1452170ntP value;
        boolean z;
        LiveData<InterfaceC1452170ntP> liveData;
        InterfaceC1452170ntP value2;
        InterfaceC1452170ntP value3;
        InterfaceC1452170ntP value4;
        if (c196925122x == null) {
            return;
        }
        LiveData<InterfaceC1452170ntP> liveData2 = this.LLIZ;
        Integer numValueOf2 = null;
        if (liveData2 != null && (value4 = liveData2.getValue()) != null) {
            numValueOf = Integer.valueOf(value4.getDuration());
        } else {
            numValueOf = null;
        }
        C786410Ut5.LJJJZ(c196925122x, this.LLILZ);
        LJIIL().Yo(c196925122x);
        this.LLJJJJ = null;
        InterfaceC196915122n interfaceC196915122n = this.LLJJJJJIL;
        if (interfaceC196915122n != null) {
            interfaceC196915122n.Yo(c196925122x);
        }
        TextStickerData data = c196925122x.getData();
        if (data != null) {
            if (data.getNleUuid().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LiveData<InterfaceC1452170ntP> liveData3 = this.LLIZ;
                if (liveData3 != null && (value3 = liveData3.getValue()) != null) {
                    C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value3);
                    if (c348100DkmLIZIZ != null) {
                        InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
                        C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                        c347650Dk3.LIZJ = data.getNleUuid();
                        interfaceC391070FUzLJFF.LJJJI(c347650Dk3);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                data.setNleUuid("");
                data.setHasReadTextAudio(false);
            }
            String placeholderSlotId = data.getPlaceholderSlotId();
            if (placeholderSlotId != null && !a0.LJJJIL(placeholderSlotId) && (liveData = this.LLIZ) != null && (value2 = liveData.getValue()) != null) {
                C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value2);
                if (c348100DkmLIZIZ2 != null) {
                    c348100DkmLIZIZ2.LJIIIZ().LJIILJJIL(placeholderSlotId);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        LiveData<InterfaceC1452170ntP> liveData4 = this.LLIZ;
        if (liveData4 != null && (value = liveData4.getValue()) != null) {
            numValueOf2 = Integer.valueOf(value.getDuration());
        }
        if (!Intrinsics.LJFF(numValueOf2, numValueOf) && (function0 = this.LLJJI) != null) {
            function0.invoke();
        }
    }

    public void LJJIIJ(int i) {
        if (!this.LLLFZ) {
            return;
        }
        C196925122x c196925122x = this.LLJJJJ;
        if (c196925122x != null) {
            c196925122x.LJIIJJI();
        }
        this.LLILZIL.LJJ();
        C124T c124t = this.LLILZIL;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c124t.LLJJJ.getLayoutParams();
        layoutParams.bottomMargin = i;
        C786410Ut5.W5(c124t.LLJJJ, layoutParams);
    }

    public final void LJJIIZ(boolean z) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (z) {
            TuxTextView tuxTextView3 = this.LLJJJIL;
            if (tuxTextView3 != null && tuxTextView3.getVisibility() == 8 && (tuxTextView2 = this.LLJJJIL) != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView2);
                return;
            }
            return;
        }
        TuxTextView tuxTextView4 = this.LLJJJIL;
        if (tuxTextView4 == null || tuxTextView4.getVisibility() != 0 || (tuxTextView = this.LLJJJIL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, tuxTextView);
    }

    public void LJJIIZI(C196925122x c196925122x) {
        c196925122x.setOnEditClickListener(new InterfaceC196910122i() { // from class: X.122R
            @Override // X.InterfaceC196910122i
            public final float LIZ(float f) {
                InterfaceC1453510nvZ interfaceC1453510nvZ = this.LIZ.LLJIJIL;
                if (interfaceC1453510nvZ != null) {
                    return interfaceC1453510nvZ.LIZ(f);
                }
                return f;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
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
            @Override // X.InterfaceC196910122i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(X.C196925122x r6) {
                /*
                    r5 = this;
                    boolean r0 = X.C0FVW.LIZ(r6)
                    if (r0 == 0) goto L24
                    X.122P r0 = r5.LIZ
                    r0.LJJI()
                    X.122P r0 = r5.LIZ
                    X.122Q r0 = r0.LJIIL()
                    X.0Lyd r1 = r0.o00()
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r1.LJIIJ(r0)
                    X.122P r0 = r5.LIZ
                    X.122Q r0 = r0.LJIIL()
                    r0.DU0()
                    return
                L24:
                    com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r6.getData()
                    r4 = 0
                    if (r0 == 0) goto L56
                    com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel r0 = r0.getTtsVoiceModel()
                    if (r0 == 0) goto L56
                    java.lang.String r3 = "auto"
                L33:
                    X.122P r0 = r5.LIZ
                    r0.LJJIII(r6)
                    X.122P r0 = r5.LIZ
                    X.123a r2 = r0.LLJLL
                    if (r2 == 0) goto L45
                    boolean r1 = r6.LLJILJIL
                    java.lang.String r0 = "click_cross"
                    r2.LIZJ(r1, r0, r3)
                L45:
                    X.122P r0 = r5.LIZ
                    com.ss.android.ugc.aweme.editSticker.interact.hit.StickerHintTextViewModel r0 = r0.LLJJIJIL
                    if (r0 == 0) goto L4c
                    r4 = r0
                L4c:
                    androidx.lifecycle.MutableLiveData r1 = r4.vQ2()
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    r1.postValue(r0)
                    return
                L56:
                    com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r6.getData()
                    r3 = 0
                    java.lang.String r1 = "is_tts_reuse_mdp"
                    r2 = 1
                    if (r0 == 0) goto L8b
                    java.util.Map r0 = r0.getTtsExtraMap()
                    if (r0 == 0) goto L8b
                    boolean r0 = r0.containsKey(r1)
                    if (r0 != r2) goto L8b
                    com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r6.getData()
                    if (r0 == 0) goto L89
                    java.util.Map r0 = r0.getTtsExtraMap()
                    if (r0 == 0) goto L89
                    java.lang.Object r1 = r0.get(r1)
                    java.lang.String r1 = (java.lang.String) r1
                L7e:
                    java.lang.String r0 = "1"
                    boolean r0 = kotlin.text.u.LJIJI(r1, r0, r3)
                    if (r0 != r2) goto L8b
                    java.lang.String r3 = "tts_reuse"
                    goto L33
                L89:
                    r1 = r4
                    goto L7e
                L8b:
                    java.lang.String r3 = "user_click"
                    goto L33
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C122R.LIZJ(X.122x):void");
            }

            @Override // X.InterfaceC196910122i
            public final void LJFF(C196925122x c196925122x2) {
                this.LIZ.LLLII.getClass();
                C391040FUw.LIZJ(true);
                this.LIZ.LJIIL().LJJJLZIJ();
                Function1<? super C196925122x, Unit> function1 = this.LIZ.LLJL;
                if (function1 != null) {
                    function1.invoke(c196925122x2);
                }
            }

            @Override // X.InterfaceC196910122i
            public final void LJII(C196925122x c196925122x2) {
                InterfaceC1455860nzM interfaceC1455860nzM;
                MutableLiveData<C1452730nuJ> mutableLiveDataVW1;
                this.LIZ.LLLIIL = false;
                if (C0FVW.LIZ(c196925122x2) && (interfaceC1455860nzM = this.LIZ.LLILLL) != null && (mutableLiveDataVW1 = interfaceC1455860nzM.vW1()) != null) {
                    mutableLiveDataVW1.setValue(C1452730nuJ.LIZJ());
                }
            }

            @Override // X.InterfaceC196910122i
            public final void LJIIIIZZ(C196925122x c196925122x2) {
                this.LIZ.LJIIL().LJJJLZIJ();
                Function1<? super C196925122x, Unit> function1 = this.LIZ.LLJJLIIIJLLLLLLLZ;
                if (function1 != null) {
                    function1.invoke(c196925122x2);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
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
            @Override // X.InterfaceC196910122i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJI(X.C196925122x r8, X.C196931123d r9) {
                /*
                    Method dump skipped, instruction units count: 303
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C122R.LJI(X.122x, X.123d):void");
            }

            @Override // X.InterfaceC196910122i
            public final PointF LIZIZ(C196925122x c196925122x2, float f, float f2) {
                InterfaceC1453510nvZ interfaceC1453510nvZ = this.LIZ.LLJIJIL;
                if (interfaceC1453510nvZ != null) {
                    PointF[] anglePointList = c196925122x2.getAnglePointList();
                    C089E c089e = new C089E(anglePointList);
                    while (c089e.hasNext()) {
                        PointF pointF = (PointF) c089e.next();
                        pointF.x += f;
                        pointF.y += f2;
                    }
                    return interfaceC1453510nvZ.LIZJ(anglePointList, f, f2);
                }
                return new PointF(0.0f, 0.0f);
            }

            @Override // X.InterfaceC196910122i
            public final int LIZLLL(C196925122x c196925122x2, boolean z, boolean z2) {
                InterfaceC1453510nvZ interfaceC1453510nvZ = this.LIZ.LLJIJIL;
                if (interfaceC1453510nvZ == null) {
                    return -1;
                }
                if (z) {
                    interfaceC1453510nvZ.LJ();
                    return -1;
                }
                return interfaceC1453510nvZ.LIZIZ(c196925122x2.getAnglePointListForBlock(), z2, false);
            }

            @Override // X.InterfaceC196910122i
            public final void LJ(C196925122x c196925122x2, boolean z, Integer num) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EditTextStickerScene -> Bubble onEditClick -> isDouble = ");
                sbLIZ.append(z);
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC196910122i interfaceC196910122i = this.LIZ.LLJLLL;
                if (interfaceC196910122i != null) {
                    interfaceC196910122i.LJ(c196925122x2, z, null);
                }
                if (z && !this.LIZ.LJIIL().rb().LIZJ().booleanValue()) {
                    if (System.currentTimeMillis() - this.LIZ.LLLFFI > 500) {
                        this.LIZ.LJIIIIZZ(c196925122x2, num);
                        return;
                    }
                    return;
                }
                if (C0FVW.LIZ(c196925122x2)) {
                    C123K c123k = c196925122x2.LLILZ;
                    boolean z2 = c196925122x2.LLJJIJIIJIL.LJIIIIZZ;
                    c123k.LJI = z2;
                    if (z2) {
                        this.LIZ.LJIIL().kP2().LJIIJ(Unit.LIZ);
                        return;
                    }
                }
                C122P c122p = this.LIZ;
                C196911122j c196911122j = c122p.LLJJL;
                if (c196911122j != null) {
                    c196911122j.LIZ();
                    c122p.LLJJJJ = c196925122x2;
                    c122p.LIZLLL(c196925122x2);
                }
                this.LIZ.LJIIL().LJJJLZIJ();
            }
        });
    }

    public final void LJJIJIL(C196925122x c196925122x) {
        InnerEffectTextLayoutConfig effectTextLayoutConfig;
        if (!c196925122x.LLJILJILJ) {
            List listSingletonList = Collections.singletonList(C123P.LIZIZ("", false));
            TextStickerData data = c196925122x.getData();
            if (data != null) {
                effectTextLayoutConfig = data.getEffectTextLayoutConfig();
            } else {
                effectTextLayoutConfig = null;
            }
            c196925122x.LJJIIZI(effectTextLayoutConfig, listSingletonList);
        }
        c196925122x.setIsGuidanceSticker(false);
        c196925122x.setWasGuidanceSticker(true);
        TextStickerData data2 = c196925122x.getData();
        if (data2 != null) {
            data2.setGuidanceSticker(false);
        }
        TextStickerData data3 = c196925122x.getData();
        if (data3 != null) {
            data3.setTtsVoiceModel(this.LLJJ);
        }
        C196925122x c196925122xMw0 = LJIIL().Mw0();
        if (c196925122xMw0 != null) {
            c196925122xMw0.setIsGuidanceSticker(false);
            TextStickerData data4 = c196925122xMw0.getData();
            if (data4 != null) {
                data4.setGuidanceSticker(false);
            }
        }
    }

    public void LJZI(int i) {
        TTSVoiceModel ttsVoiceModel;
        boolean z;
        TextStickerData data;
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || !this.LLLFZ) {
            return;
        }
        this.LLILZIL.LJIIIIZZ();
        C196925122x c196925122x = this.LLJJJJ;
        if (c196925122x != null && (data = c196925122x.getData()) != null) {
            ttsVoiceModel = data.getTtsVoiceModel();
        } else {
            ttsVoiceModel = null;
        }
        LJIL(ttsVoiceModel);
        C124A c124a = this.LLJLIL;
        if (c124a != null) {
            c124a.dismiss();
        }
        if (LJIIL().b8()) {
            LJIIL().t01();
        }
        if (LJIIL().ha2()) {
            C196925122x c196925122x2 = this.LLJJJJ;
            if (c196925122x2 != null) {
                LJIIL().NB0(c196925122x2);
            }
        } else if (LJIIL().fl2()) {
            LJIIJJI().postDelayed(new ARunnableS129S0100000_29(this, 1), 50L);
        } else {
            C196925122x c196925122x3 = this.LLJJJJ;
            if (c196925122x3 != null) {
                TextStickerData data2 = c196925122x3.getData();
                if (data2 != null && data2.getHasReadTextAudio()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && C196909122h.LIZIZ().LIZIZ.LIZJ) {
                    this.LLLII.getClass();
                    if (C391040FUw.LIZIZ.getInt("change_text_toast_shown", 0) < 3 && !c196925122x3.LLJILLL) {
                        HandlerHook.viewPostDelay(c196925122x3, new ARunnableS98S0200000_29(this, c196925122x3, 2), 500L);
                    }
                }
                TextStickerData data3 = c196925122x3.getData();
                if (data3 != null && !data3.getHasReadTextAudio() && !C196909122h.LIZIZ().LIZIZ.LJI && C196909122h.LIZIZ().LIZIZ.LIZIZ) {
                    this.LLLII.getClass();
                    if (C391040FUw.LIZIZ.getInt("read_text_toast_shown", 0) < 3 && !c196925122x3.LLJILLL && !C0FVW.LIZ(c196925122x3) && LJJIJIIJI()) {
                        HandlerHook.viewPostDelay(c196925122x3, new ARunnableS98S0200000_29(this, c196925122x3, 3), 500L);
                    }
                }
            }
        }
        if (this.LLJJJJ == null && Intrinsics.LJFF(LJIIL().N80().LJI(), Boolean.FALSE) && !LJIIL().fl2()) {
            LJIIL().JR1(true);
        }
        C196925122x c196925122x4 = this.LLJJJJ;
        if (c196925122x4 != null && C0FVW.LIZ(c196925122x4) && !LJIIL().fl2()) {
            LJIIL().JR1(true);
            LJIIL().o00().LJIIJ(Boolean.TRUE);
            if (!this.LLILZIL.LLLILZJ) {
                return;
            }
            C201955140j.LIZ("EditTextStickerScene -> need update all caption sticker's font");
            LJIIL().lT(this.LLJJJJ, this.LL);
        }
        C196925122x c196925122x5 = this.LLJJJJ;
        if (c196925122x5 != null) {
            C0FVW.LIZ(c196925122x5);
        }
    }

    @Override // X.InterfaceC1391500mJY
    public final void LLLL(int i) {
        C124T c124t = this.LLILZIL;
        if (!c124t.LLJJIII) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c124t.LLJJJ.getLayoutParams();
            layoutParams.bottomMargin += i;
            C786410Ut5.W5(c124t.LLJJJ, layoutParams);
        }
    }

    public static boolean LJ(C124T c124t, TextStickerData textStickerData) {
        if (!textStickerData.getHasReadTextAudio() || TextUtils.isEmpty(textStickerData.getAudioText()) || Intrinsics.LJFF(textStickerData.getAudioText(), C123P.LJIIIIZZ(c124t.getTextWrapList()))) {
            return false;
        }
        if (textStickerData.getAudioTrackIndex() < 0 && textStickerData.getNleUuid().length() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122P.LIZ(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, boolean):void");
    }

    public final void LIZIZ(TextStickerData textStickerData, boolean z) {
        if (textStickerData.isCaption()) {
            textStickerData.setEditCenterPoint(new Point(C0JAI.LIZJ(this.LL) / 2, C0JAI.LIZIZ(this.LL) / 2));
            LIZ(textStickerData, z);
        } else {
            LIZ(textStickerData, z);
        }
    }

    public final void LIZJ(List<TextStickerTextWrap> list, TTSVoiceModel tTSVoiceModel) {
        InnerEffectTextLayoutConfig effectTextLayoutConfig;
        C196925122x c196925122x = this.LLJJJJ;
        if (c196925122x != null) {
            LJJIL(c196925122x.getData());
            c196925122x.LJJIIJ(this.LLILZIL.getCurTxtMode(), this.LLILZIL.getCurColor(), this.LLILZIL.getAlignTxt(), C0FI2.LJIJJ().LJI);
            TextStickerData data = c196925122x.getData();
            if (data != null) {
                List<InlineRichTextStyleData> inlineTextStyleDatas = this.LLILZIL.getInlineTextStyleDatas();
                if (inlineTextStyleDatas == null) {
                    inlineTextStyleDatas = C13BV.INSTANCE;
                }
                data.setInlineTextStyles(inlineTextStyleDatas);
            }
            c196925122x.setFontSize(this.LLILZIL.LJIIJJI(LJIIJ()));
            TextStickerData data2 = c196925122x.getData();
            if (data2 != null) {
                effectTextLayoutConfig = data2.getEffectTextLayoutConfig();
            } else {
                effectTextLayoutConfig = null;
            }
            c196925122x.LJJIIZI(effectTextLayoutConfig, list);
            TextStickerData data3 = c196925122x.getData();
            if (data3 != null) {
                data3.setUseAutoTextSize(this.LLILZIL.LLILLL.LLJL);
            }
            TextStickerData data4 = c196925122x.getData();
            if (data4 != null) {
                data4.setHasChangedFontSize(this.LLILZIL.getHasFontSizeChanged());
            }
            TextStickerData data5 = c196925122x.getData();
            if (data5 != null) {
                data5.setUseColorDropper(this.LLILZIL.LLLF);
            }
            TextStickerData data6 = c196925122x.getData();
            if (data6 != null) {
                data6.setAdjustTextRollbar(this.LLILZIL.LLLFF);
            }
            InterfaceC196929123b interfaceC196929123b = this.LLJJJJLIIL;
            if (interfaceC196929123b != null) {
                interfaceC196929123b.LIZIZ(c196925122x);
                return;
            }
            return;
        }
        if (LJIIL().Ir0() >= this.LLJ) {
            C123O.LIZLLL().LIZIZ(2131836170, this.LL);
            return;
        }
        TextStickerData textStickerData = new TextStickerData("", this.LLILZIL.getCurTxtMode(), this.LLILZIL.getCurColor(), this.LLILZIL.getAlignTxt(), C0FI2.LJIJJ().LJI, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32, -1, -1, 4095, null);
        textStickerData.setEditCenterPoint(this.LLILZIL.getEditInputScreenCenterPoint());
        textStickerData.setTextWrapList(list);
        LJJIL(textStickerData);
        textStickerData.setFontSize(this.LLILZIL.LJIIJJI(LJIIJ()));
        textStickerData.setUseAutoTextSize(this.LLILZIL.LLILLL.LLJL);
        textStickerData.setHasChangedFontSize(this.LLILZIL.getHasFontSizeChanged());
        textStickerData.setTtsVoiceModel(tTSVoiceModel);
        textStickerData.setUseColorDropper(this.LLILZIL.LLLF);
        textStickerData.setAdjustTextRollbar(this.LLILZIL.LLLFF);
        List<InlineRichTextStyleData> inlineTextStyleDatas2 = this.LLILZIL.getInlineTextStyleDatas();
        if (inlineTextStyleDatas2 == null) {
            inlineTextStyleDatas2 = C13BV.INSTANCE;
        }
        textStickerData.setInlineTextStyles(inlineTextStyleDatas2);
        LIZIZ(textStickerData, false);
    }

    public final void LJIIIIZZ(C196925122x c196925122x, Integer num) {
        if (C0FVW.LIZ(c196925122x)) {
            C201955140j.LIZ("EditTextStickerScene -> editTextSticker -> pause video");
            LJIIL().JR1(false);
        }
        LJIIL().c2().LJIIJ(Boolean.FALSE);
        this.LLJJJJ = c196925122x;
        LJJIJIIJIL(c196925122x, num);
        InterfaceC196915122n interfaceC196915122n = this.LLJJJJJIL;
        if (interfaceC196915122n != null) {
            interfaceC196915122n.LIZLLL();
        }
        this.LLLFFI = System.currentTimeMillis();
        InterfaceC196928123a interfaceC196928123a = this.LLJLL;
        if (interfaceC196928123a != null) {
            interfaceC196928123a.LJFF(c196925122x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(X.C196925122x r23, java.lang.Integer r24) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122P.LJJIJIIJIL(X.122x, java.lang.Integer):void");
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public final void LJIJJLI(C124T c124t, TextStickerData textStickerData, String str) {
        InterfaceC1452170ntP value;
        InterfaceC1452170ntP value2;
        if (LJIIL().ha2()) {
            return;
        }
        if (!LJ(c124t, textStickerData) && textStickerData.getTtsVoiceModel() != null) {
            LiveData<InterfaceC1452170ntP> liveData = this.LLIZ;
            if (liveData != null && (value2 = liveData.getValue()) != null) {
                textStickerData.setHasReadTextAudio(false);
                textStickerData.setAutoAddTtsFlag(true);
                textStickerData.setAudioText(null);
                textStickerData.setNleUuid("");
                textStickerData.setAudioTrackIndex(-1);
                textStickerData.setAudioTrackFilePath(null);
                if (C196909122h.LIZIZ().LIZIZ.LIZJ && str.length() > 0) {
                    LJIIL().YH(textStickerData, str);
                    LJIIL().X61(textStickerData);
                }
                value2.nf(textStickerData.getStartTime(), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                value2.play();
                return;
            }
            return;
        }
        LiveData<InterfaceC1452170ntP> liveData2 = this.LLIZ;
        if (liveData2 == null || (value = liveData2.getValue()) == null) {
            return;
        }
        if (textStickerData.getNleUuid().length() > 0) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null) {
                InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
                C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                c347650Dk3.LIZJ = textStickerData.getNleUuid();
                interfaceC391070FUzLJFF.LJJJI(c347650Dk3);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        textStickerData.setHasReadTextAudio(false);
        textStickerData.setAudioText(null);
        textStickerData.setNleUuid("");
        textStickerData.setAudioTrackIndex(-1);
        textStickerData.setAudioTrackFilePath(null);
        if (C196909122h.LIZIZ().LIZIZ.LIZJ) {
            if (!a0.LJJJIL(str)) {
                LJIIL().YH(textStickerData, str);
            }
        } else if (C123P.LJIIIIZZ(c124t.getTextWrapList()).length() > 0) {
            this.LLLII.getClass();
            Keva keva = C391040FUw.LIZIZ;
            if (keva.getInt("read_text_change_toast", 0) < 3) {
                C1638280sja c1638280sja = C21366318jV.LIZLLL;
                Context context = c124t.getContext();
                c1638280sja.getClass();
                C1638280sja.LIZJ(2131829882, 0, context).LIZ();
                this.LLLII.getClass();
                keva.storeInt("read_text_change_toast", keva.getInt("read_text_change_toast", 0) + 1);
            }
        }
        value.nf(textStickerData.getStartTime(), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        value.play();
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public C122P(C19EG c19eg, InterfaceC1461390o8H interfaceC1461390o8H, InterfaceC1455860nzM interfaceC1455860nzM, FrameLayout frameLayout, C124T c124t, C121O c121o, LiveData liveData, InterfaceC196906122e interfaceC196906122e, int i, InterfaceC1453510nvZ interfaceC1453510nvZ, boolean z, C0FVR c0fvr, AnonymousClass1240 anonymousClass1240, TTSVoiceModel tTSVoiceModel, Function0 function0, C1DRG c1drg, int i2) {
        Rect rect;
        InterfaceC196906122e interfaceC196906122e2 = interfaceC196906122e;
        LiveData liveData2 = liveData;
        C121O c121o2 = c121o;
        C0FVR c0fvr2 = c0fvr;
        boolean z2 = z;
        InterfaceC1453510nvZ interfaceC1453510nvZ2 = interfaceC1453510nvZ;
        int i3 = i;
        Function0 function02 = function0;
        TTSVoiceModel tTSVoiceModel2 = tTSVoiceModel;
        AnonymousClass1240 anonymousClass12402 = anonymousClass1240;
        InterfaceC1455860nzM interfaceC1455860nzM2 = (i2 & 4) != 0 ? null : interfaceC1455860nzM;
        c121o2 = (i2 & 32) != 0 ? null : c121o2;
        liveData2 = (i2 & 64) != 0 ? null : liveData2;
        interfaceC196906122e2 = (i2 & 128) != 0 ? null : interfaceC196906122e2;
        i3 = (i2 & 256) != 0 ? 30 : i3;
        if ((i2 & 512) != 0) {
            rect = new Rect();
        } else {
            rect = null;
        }
        interfaceC1453510nvZ2 = (i2 & 1024) != 0 ? null : interfaceC1453510nvZ2;
        z2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2;
        c0fvr2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C0FVR.NONE : c0fvr2;
        anonymousClass12402 = (i2 & 8192) != 0 ? null : anonymousClass12402;
        tTSVoiceModel2 = (i2 & 16384) != 0 ? null : tTSVoiceModel2;
        function02 = (32768 & i2) != 0 ? null : function02;
        C1DRG c1drg2 = (i2 & 65536) == 0 ? c1drg : null;
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC1461390o8H;
        this.LLILLL = interfaceC1455860nzM2;
        this.LLILZ = frameLayout;
        this.LLILZIL = c124t;
        this.LLILZLL = c121o2;
        this.LLIZ = liveData2;
        this.LLIZLLLIL = interfaceC196906122e2;
        this.LLJ = i3;
        this.LLJI = rect;
        this.LLJIJIL = interfaceC1453510nvZ2;
        this.LLJILJIL = z2;
        this.LLJILJILJ = c0fvr2;
        this.LLJILLL = anonymousClass12402;
        this.LLJJ = tTSVoiceModel2;
        this.LLJJI = function02;
        this.LLJJIII = c1drg2;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 6));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 5));
        this.LLLII = C391040FUw.LIZ;
        this.LLLIIII = true;
        this.LLLIIIL = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LLLILZ = true;
    }
}
