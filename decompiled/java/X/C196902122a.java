package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS34S0201000_29;
import Y.ARunnableS98S0200000_29;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewState;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.vesdk.VESize;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.122a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196902122a implements InterfaceC1166920gTK, InterfaceC1391500mJY, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1DRG LL;
    public final C19EG LLILLJJLI;
    public final InterfaceC1461390o8H LLILLL;
    public final FrameLayout LLILZ;
    public final C124T LLILZIL;
    public final C121O LLILZLL;
    public final LiveData<InterfaceC1452170ntP> LLIZ;
    public final C124C LLIZLLLIL;
    public final int LLJ;
    public Rect LLJI;
    public InterfaceC1453510nvZ LLJIJIL;
    public FTCEditTextStickerViewModel LLJILJIL;
    public FTCStickerHintTextViewModel LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final C1664750tQH LLJJ;
    public C196925122x LLJJI;
    public InterfaceC196915122n LLJJIII;
    public C196913122l LLJJIJI;
    public Function1<? super C196925122x, Unit> LLJJIJIIJIL;
    public C196904122c LLJJIJIL;
    public SoftKeyBoardListener LLJJJ;
    public InterfaceC196928123a LLJJJIL;
    public final C860670XpZ LLJJJJ;
    public final C01GW LLJJJJJIL;
    public Function2<? super C196925122x, ? super C196925122x, Unit> LLJJJJLIIL;
    public InterfaceC196910122i LLJJL;
    public SafeHandler LLJJLIIIJLLLLLLLZ;
    public ARunnableS34S0201000_29 LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public Pair<Integer, Integer> LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C196902122a.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C196902122a.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public C196902122a() {
        throw null;
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

    public final FTCEditTextStickerViewModel LIZJ() {
        FTCEditTextStickerViewModel fTCEditTextStickerViewModel = this.LLJILJIL;
        if (fTCEditTextStickerViewModel != null) {
            return fTCEditTextStickerViewModel;
        }
        return null;
    }

    public final void LJI() {
        View contentView;
        Pair<Integer, Integer> pair = this.LLJLLL;
        if (pair == null || pair.getFirst().intValue() == 0 || pair.getSecond().intValue() == 0) {
            return;
        }
        int[] iArrLIZ = C1675310thJ.LIZ(pair.getFirst().intValue(), pair.getSecond().intValue(), this.LLILZ);
        this.LLJLIL = iArrLIZ[0];
        this.LLJLILLLLZIIL = iArrLIZ[1];
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        this.LLJI = new Rect(0, 0, layoutParams.width, layoutParams.height);
        InterfaceC1453510nvZ interfaceC1453510nvZ = this.LLJIJIL;
        if (interfaceC1453510nvZ != null && (contentView = interfaceC1453510nvZ.getContentView()) != null && contentView.getParent() != null) {
            C786410Ut5.LJJJLZIJ(contentView, (ViewGroup) contentView.getParent());
        }
        InterfaceC1453600nvi interfaceC1453600nvi = C123O.LIZJ().LIZJ;
        InterfaceC1453510nvZ interfaceC1453510nvZLIZ = interfaceC1453600nvi != null ? interfaceC1453600nvi.LIZ(this.LLJLIL, this.LLILLJJLI) : null;
        this.LLJIJIL = interfaceC1453510nvZLIZ;
        if (interfaceC1453510nvZLIZ != null) {
            this.LLILZ.addView(interfaceC1453510nvZLIZ.getContentView());
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLJJJJJIL.getValue();
    }

    public final void LIZLLL() {
        InfoStickerModel infoStickerModelLJLI;
        List<StickerItemModel> list;
        InterfaceC1452170ntP value;
        VESize initSize;
        boolean z = !LIZJ().LJLL();
        C124C c124c = this.LLIZLLLIL;
        if (c124c == null || (infoStickerModelLJLI = c124c.LJLI()) == null || (list = infoStickerModelLJLI.stickers) == null) {
            return;
        }
        Iterator<StickerItemModel> it2 = list.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            StickerItemModel next = it2.next();
            if (next.type == 2) {
                if (z) {
                    if (!z2) {
                        LiveData<InterfaceC1452170ntP> liveData = this.LLIZ;
                        if (liveData != null && (value = liveData.getValue()) != null && (initSize = value.getInitSize()) != null) {
                            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(initSize.width), Integer.valueOf(initSize.height));
                            if (this.LLJLLL == null) {
                                this.LLJLLL = pair;
                                LJI();
                            }
                        }
                        z2 = true;
                    }
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C123O.LIZ(), next.extra, TextStickerData.class);
                    if (textStickerData != null) {
                        LIZJ().Ct(textStickerData, true);
                    }
                }
                it2.remove();
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public final void LIZIZ(C196925122x c196925122x) {
        if (c196925122x != null && this.LLJIJIL != null) {
            if (this.LLILZ.getChildCount() > 1) {
                FrameLayout frameLayout = this.LLILZ;
                if (frameLayout.getChildAt(frameLayout.getChildCount() - 1) != c196925122x) {
                    C786410Ut5.LJJJZ(c196925122x, this.LLILZ);
                    this.LLILZ.addView(c196925122x);
                }
            }
            C196925122x c196925122xZn0 = LIZJ().Zn0();
            if (c196925122xZn0 != c196925122x) {
                LIZJ().IH1(c196925122x);
                if (c196925122xZn0 == null) {
                    return;
                }
            }
            Function2<? super C196925122x, ? super C196925122x, Unit> function2 = this.LLJJJJLIIL;
            if (function2 != null) {
                function2.invoke(c196925122xZn0, c196925122x);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C196925122x r16) {
        /*
            r15 = this;
            r2 = 1
            r15.LLJLLIL = r2
            r12 = 0
            if (r16 == 0) goto L5f
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r16.getData()
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel r0 = r0.getTtsVoiceModel()
        L10:
            r14 = 0
            if (r0 == 0) goto L27
            java.lang.String r11 = "auto"
        L15:
            if (r16 != 0) goto L61
            X.124T r1 = r15.LLILZIL
            com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel r0 = r15.LIZJ()
            int r0 = r0.T10()
            r1.LJJIFFI(r0, r11, r12)
            r15.LLJJI = r12
            return
        L27:
            java.lang.String r1 = "is_tts_reuse_mdp"
            if (r16 == 0) goto L5c
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r16.getData()
            if (r0 == 0) goto L5c
            java.util.Map r0 = r0.getTtsExtraMap()
            if (r0 == 0) goto L5c
            boolean r0 = r0.containsKey(r1)
            if (r0 != r2) goto L5c
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r16.getData()
            if (r0 == 0) goto L5a
            java.util.Map r0 = r0.getTtsExtraMap()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L4f:
            java.lang.String r0 = "1"
            boolean r0 = kotlin.text.u.LJIJI(r1, r0, r14)
            if (r0 != r2) goto L5c
            java.lang.String r11 = "tts_reuse"
            goto L15
        L5a:
            r1 = r12
            goto L4f
        L5c:
            java.lang.String r11 = "user_click"
            goto L15
        L5f:
            r0 = r12
            goto L10
        L61:
            X.124T r1 = r15.LLILZIL
            java.util.List r2 = r16.getTextWrapList()
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r16.getData()
            if (r0 == 0) goto L73
            java.util.List r3 = r0.getInlineTextStyles()
            if (r3 != 0) goto L75
        L73:
            X.13BV r3 = X.C13BV.INSTANCE
        L75:
            int r4 = r16.getCurMode()
            int r5 = r16.getCurColor()
            int r6 = r16.getCurAlignTxt()
            java.lang.String r7 = r16.getCurFontType()
            r8 = 0
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r16.getData()
            int r9 = r0.getFontSize()
            com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel r0 = r15.LIZJ()
            int r10 = r0.T10()
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r16.getData()
            if (r0 == 0) goto Lae
            boolean r13 = r0.isUseColorDropper()
        La0:
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r0 = r16.getData()
            if (r0 == 0) goto Laa
            boolean r14 = r0.isAdjustTextRollbar()
        Laa:
            r1.LJJII(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        Lae:
            r13 = 0
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196902122a.LJ(X.122x):void");
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        if (!this.LLJLLIL) {
            return;
        }
        C196925122x c196925122x = this.LLJJI;
        if (c196925122x != null) {
            c196925122x.LJIIJJI();
        }
        this.LLILZIL.LJJ();
        C124T c124t = this.LLILZIL;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c124t.LLJJJ.getLayoutParams();
        layoutParams.bottomMargin = i;
        C786410Ut5.W5(c124t.LLJJJ, layoutParams);
    }

    @Override // X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        if (!this.LLJLLIL) {
            return;
        }
        this.LLILZIL.LJIIIIZZ();
        List<TextStickerTextWrap> textWrapList = this.LLILZIL.getTextWrapList();
        InnerEffectTextLayoutConfig effectTextLayoutConfig = null;
        if (C123P.LJIILIIL(textWrapList)) {
            C196925122x c196925122x = this.LLJJI;
            int iLJII = 28;
            if (c196925122x != null) {
                c196925122x.getData();
                c196925122x.LJJIIJ(this.LLILZIL.getCurTxtMode(), this.LLILZIL.getCurColor(), this.LLILZIL.getAlignTxt(), C0FI2.LJIJJ().LJI);
                if (C0FI2.LJIJJ().LJII() > 0) {
                    iLJII = C0FI2.LJIJJ().LJII();
                }
                c196925122x.setFontSize(iLJII);
                TextStickerData data = c196925122x.getData();
                if (data != null) {
                    effectTextLayoutConfig = data.getEffectTextLayoutConfig();
                }
                c196925122x.LJJIIZI(effectTextLayoutConfig, textWrapList);
            } else if (LIZJ().Ir0() >= this.LLJ) {
                C123O.LIZLLL().LIZIZ(2131836170, this.LLILLJJLI);
            } else {
                TextStickerData textStickerData = new TextStickerData("", this.LLILZIL.getCurTxtMode(), this.LLILZIL.getCurColor(), this.LLILZIL.getAlignTxt(), C0FI2.LJIJJ().LJI, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -32, -1, -1, 4095, null);
                textStickerData.setEditCenterPoint(this.LLILZIL.getEditInputScreenCenterPoint());
                textStickerData.setTextWrapList(textWrapList);
                if (C0FI2.LJIJJ().LJII() > 0) {
                    iLJII = C0FI2.LJIJJ().LJII();
                }
                textStickerData.setFontSize(iLJII);
                LIZ(textStickerData, false);
            }
        } else {
            C196925122x c196925122x2 = this.LLJJI;
            if (c196925122x2 != null) {
                C786410Ut5.LJJJZ(c196925122x2, this.LLILZ);
                LIZJ().Yo(c196925122x2);
            }
            this.LLJJI = null;
        }
        this.LLJLLIL = false;
        C196904122c c196904122c = this.LLJJIJIL;
        if (c196904122c != null) {
            c196904122c.dismiss();
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

    public final void LIZ(TextStickerData textStickerData, boolean z) {
        this.LLILZIL.setData(textStickerData);
        C19EG c19eg = this.LLILLJJLI;
        SafeHandler safeHandler = this.LLJJLIIIJLLLLLLLZ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        C196925122x c196925122x = new C196925122x(c19eg, safeHandler, textStickerData, true, new C124G() { // from class: X.123c
            @Override // X.C124G
            public final boolean LIZ() {
                return this.LIZ.LIZJ().LLLLZLLIL();
            }
        }, Boolean.TRUE);
        c196925122x.LLJLIL = this.LLJJJIL;
        LIZJ().IQ1(c196925122x);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c196925122x);
        c196925122x.setLayoutParams(layoutParams);
        this.LLILZ.addView(c196925122x);
        InterfaceC196915122n interfaceC196915122n = this.LLJJIII;
        if (interfaceC196915122n != null) {
            interfaceC196915122n.LIZIZ();
        }
        this.LLJJI = c196925122x;
        c196925122x.setOnEditClickListener(new InterfaceC196910122i() { // from class: X.122Z
            @Override // X.InterfaceC196910122i
            public final void LIZJ(C196925122x c196925122x2) {
            }

            @Override // X.InterfaceC196910122i
            public final void LJFF(C196925122x c196925122x2) {
            }

            @Override // X.InterfaceC196910122i
            public final void LJII(C196925122x c196925122x2) {
            }

            @Override // X.InterfaceC196910122i
            public final float LIZ(float f) {
                InterfaceC1453510nvZ interfaceC1453510nvZ = this.LIZ.LLJIJIL;
                if (interfaceC1453510nvZ != null) {
                    return interfaceC1453510nvZ.LIZ(f);
                }
                return f;
            }

            @Override // X.InterfaceC196910122i
            public final void LJIIIIZZ(C196925122x c196925122x2) {
                this.LIZ.LIZJ().a2(true);
                this.LIZ.LIZJ().LJJJLZIJ();
                Function1<? super C196925122x, Unit> function1 = this.LIZ.LLJJIJIIJIL;
                if (function1 != null) {
                    function1.invoke(c196925122x2);
                }
                InterfaceC196928123a interfaceC196928123a = this.LIZ.LLJJJIL;
                if (interfaceC196928123a != null) {
                    interfaceC196928123a.LIZLLL();
                }
            }

            @Override // X.InterfaceC196910122i
            public final void LJI(C196925122x c196925122x2, C196931123d c196931123d) {
                if (!c196931123d.LIZJ) {
                    this.LIZ.LIZIZ(c196925122x2);
                }
                if (!c196931123d.LIZLLL && !c196931123d.LJ) {
                    boolean zLIZ = C0GTU.LIZ(this.LIZ.LLJI, c196925122x2.getAnglePointList());
                    C196902122a c196902122a = this.LIZ;
                    C121O c121o = c196902122a.LLILZLL;
                    if (c121o != null) {
                        int iLJJJJL = c121o.LJJJJL(c196931123d.LIZ, c196931123d.LIZIZ, c196931123d.LIZJ, zLIZ);
                        if (iLJJJJL != 1) {
                            if (iLJJJJL != 3) {
                                if (iLJJJJL == 4) {
                                    c196925122x2.LJJIII(0.3137255f, true);
                                }
                            } else {
                                C786410Ut5.LJJJZ(c196925122x2, c196902122a.LLILZ);
                                c196902122a.LIZJ().Yo(c196925122x2);
                                c196902122a.LLJJI = null;
                                InterfaceC196915122n interfaceC196915122n2 = c196902122a.LLJJIII;
                                if (interfaceC196915122n2 != null) {
                                    interfaceC196915122n2.Yo(c196925122x2);
                                }
                            }
                        } else {
                            c196925122x2.LJJIII(0.3137255f, false);
                        }
                    }
                }
                if (this.LIZ.LLILZLL != null) {
                    C786410Ut5.L5(c196925122x2, 1.0f);
                }
                InterfaceC196915122n interfaceC196915122n3 = this.LIZ.LLJJIII;
                if (interfaceC196915122n3 != null) {
                    interfaceC196915122n3.LIZ(new C196931123d(c196931123d.LIZJ, c196931123d.LIZ, c196931123d.LIZIZ, c196931123d.LIZLLL, c196931123d.LJ));
                }
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
            public final int LIZLLL(C196925122x c196925122x2, boolean z2, boolean z3) {
                InterfaceC1453510nvZ interfaceC1453510nvZ = this.LIZ.LLJIJIL;
                if (interfaceC1453510nvZ == null) {
                    return -1;
                }
                if (z2) {
                    interfaceC1453510nvZ.LJ();
                    return -1;
                }
                return interfaceC1453510nvZ.LIZIZ(c196925122x2.getAnglePointListForBlock(), z3, false);
            }

            @Override // X.InterfaceC196910122i
            public final void LJ(C196925122x c196925122x2, boolean z2, Integer num) {
                InterfaceC196910122i interfaceC196910122i = this.LIZ.LLJJL;
                if (interfaceC196910122i != null) {
                    interfaceC196910122i.LJ(c196925122x2, z2, null);
                }
                if (z2) {
                    C196902122a c196902122a = this.LIZ;
                    if (!((FTCEditTextStickerViewState) C1170060gYO.LIZ(c196902122a, c196902122a.LIZJ())).getInTimeEditView()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C196902122a c196902122a2 = this.LIZ;
                        if (jCurrentTimeMillis - c196902122a2.LLJLL > 500) {
                            c196902122a2.LIZJ().c2().LJIIJ(Boolean.FALSE);
                            this.LIZ.LLJJI = c196925122x2;
                            this.LIZ.LJ(c196925122x2);
                            InterfaceC196915122n interfaceC196915122n2 = this.LIZ.LLJJIII;
                            if (interfaceC196915122n2 != null) {
                                interfaceC196915122n2.LIZLLL();
                            }
                            this.LIZ.LLJLL = System.currentTimeMillis();
                            InterfaceC196928123a interfaceC196928123a = this.LIZ.LLJJJIL;
                            if (interfaceC196928123a != null) {
                                interfaceC196928123a.LJFF(c196925122x2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                C196913122l c196913122l = this.LIZ.LLJJIJI;
                if (c196913122l != null) {
                    c196913122l.LIZ();
                    C196902122a c196902122a3 = this.LIZ;
                    C196925122x c196925122x3 = c196902122a3.LLJJI;
                    if (c196925122x3 != null) {
                        c196902122a3.LIZIZ(c196925122x3);
                    }
                }
                this.LIZ.LIZJ().LJJJLZIJ();
            }
        });
        int i = this.LLJLIL;
        int i2 = this.LLJLILLLLZIIL;
        c196925122x.LLJJI = i2;
        AnonymousClass1234 anonymousClass1234 = c196925122x.LLJJIJIIJIL;
        anonymousClass1234.LJIIJJI = i;
        anonymousClass1234.LJIIL = i2;
        TextStickerData textStickerData2 = c196925122x.LLJJIJIL;
        if (textStickerData2 != null && textStickerData2.getEditCenterPoint() != null) {
            c196925122x.setAnimXY(c196925122x.LLJJIJIL.getEditCenterPoint());
        }
        this.LLILZIL.LJ();
        if (!z) {
            HandlerHook.viewPostDelay(c196925122x, new ARunnableS98S0200000_29(this, c196925122x, 48), 500L);
        }
        if (textStickerData.getAutoSelect()) {
            HandlerHook.viewPost(c196925122x, new ARunnableS113S0100000_13(c196925122x, 189));
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
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

    public C196902122a(C1DRG c1drg, C19EG c19eg, InterfaceC1461390o8H interfaceC1461390o8H, FrameLayout frameLayout, C124T c124t, C121O c121o, LiveData liveData, C124C c124c, int i) {
        Rect rect = new Rect();
        this.LL = c1drg;
        this.LLILLJJLI = c19eg;
        this.LLILLL = interfaceC1461390o8H;
        this.LLILZ = frameLayout;
        this.LLILZIL = c124t;
        this.LLILZLL = c121o;
        this.LLIZ = liveData;
        this.LLIZLLLIL = c124c;
        this.LLJ = i;
        this.LLJI = rect;
        this.LLJIJIL = null;
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJ = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
        this.LLJJJJ = C860670XpZ.LIZ;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 850));
    }
}
