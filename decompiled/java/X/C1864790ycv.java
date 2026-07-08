package X;

import Y.ARunnableS118S0100000_18;
import Y.ARunnableS127S0100000_27;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchResultFragment;
import com.bytedance.android.livesdk.game.gamelist.GameTopicSearchAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.ui.KeyboardAttachedDialogFragment;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.rss.link.ui.RssLinkAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS54S1000000_3;
import kotlin.jvm.internal.AwS77S1000000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ycv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864790ycv implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$9(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$8(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$9(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
            case 8:
                afterTextChanged$8(this, editable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                afterTextChanged$9(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                beforeTextChanged$9(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onTextChanged$9(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C1864790ycv(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C1864790ycv c1864790ycv, Editable editable) {
        ((C1852530yJ9) c1864790ycv.l0).LIZ();
    }

    public static final void afterTextChanged$1(C1864790ycv c1864790ycv, Editable editable) {
        boolean z;
        TuxIconView sendButton;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("afterTextChanged: text -> ");
        sbLIZ.append((Object) editable);
        C1022620cia.LIZ("KeyboardDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
        int i = 0;
        if (a0.LJLIIIL(String.valueOf(editable)).toString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C06Z8 c06z8 = ((KeyboardAttachedDialogFragment) c1864790ycv.l0).LLILLJJLI;
        if (c06z8 != null && (sendButton = c06z8.getSendButton()) != null) {
            if (!(!z)) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, sendButton);
        }
    }

    public static final void afterTextChanged$2(C1864790ycv c1864790ycv, Editable editable) {
        ((RssLinkAssem) c1864790ycv.l0).kp().setState(new AwS77S1000000_27(editable.toString(), 11));
    }

    public static final void afterTextChanged$3(C1864790ycv c1864790ycv, Editable editable) {
        HandlerHook.viewPost(((C1854760yMk) c1864790ycv.l0).getInputView(), new ARunnableS127S0100000_27((C1854760yMk) c1864790ycv.l0, 35));
        Function0<Unit> function0 = ((C1854760yMk) c1864790ycv.l0).LLLFZ.LJIIL;
        if (function0 != null) {
            function0.invoke();
        }
        ((C1854760yMk) c1864790ycv.l0).LJI(null, null);
    }

    public static final void afterTextChanged$4(C1864790ycv c1864790ycv, Editable editable) {
        if (editable != null) {
            ((C1793710wmH) c1864790ycv.l0).LJ(editable);
        }
    }

    public static final void afterTextChanged$5(C1864790ycv c1864790ycv, Editable editable) {
        String string;
        if (editable != null && (string = editable.toString()) != null) {
            if (string.length() == 0) {
                DialogC1840040xz0 dialogC1840040xz0 = (DialogC1840040xz0) c1864790ycv.l0;
                C16F5 c16f5 = dialogC1840040xz0.LLJJIJIL;
                if (c16f5 != null) {
                    C439101nJ.LJI(c16f5);
                }
                C16FS c16fs = dialogC1840040xz0.LLJJJIL;
                if (c16fs != null) {
                    c16fs.setEnabled(false);
                    return;
                }
                return;
            }
            try {
                long j = CastLongProtector.parseLong(string);
                if (j < ((DialogC1840040xz0) c1864790ycv.l0).LLJILLL.getFirst().longValue()) {
                    DialogC1840040xz0 dialogC1840040xz02 = (DialogC1840040xz0) c1864790ycv.l0;
                    C16F5 c16f52 = dialogC1840040xz02.LLJJIJIL;
                    if (c16f52 != null) {
                        c16f52.setText(C497740JfY.LJIJJ(2131843578, dialogC1840040xz02.LLJILLL.getFirst()));
                    }
                    C16F5 c16f53 = dialogC1840040xz02.LLJJIJIL;
                    if (c16f53 != null) {
                        C12ES.LJIILL(0, c16f53);
                    }
                    C16FS c16fs2 = dialogC1840040xz02.LLJJJIL;
                    if (c16fs2 == null) {
                        return;
                    }
                    c16fs2.setEnabled(false);
                    return;
                }
                if (j > ((DialogC1840040xz0) c1864790ycv.l0).LLJILLL.getSecond().longValue()) {
                    ((DialogC1840040xz0) c1864790ycv.l0).LJLIIL();
                    return;
                }
                DialogC1840040xz0 dialogC1840040xz03 = (DialogC1840040xz0) c1864790ycv.l0;
                C16F5 c16f54 = dialogC1840040xz03.LLJJIJIL;
                if (c16f54 != null) {
                    C439101nJ.LJI(c16f54);
                }
                C16FS c16fs3 = dialogC1840040xz03.LLJJJIL;
                if (c16fs3 == null) {
                    return;
                }
                c16fs3.setEnabled(true);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((DialogC1840040xz0) c1864790ycv.l0).LJLIIL();
            }
        }
    }

    public static final void afterTextChanged$6(C1864790ycv c1864790ycv, Editable editable) {
        int iLIZIZ;
        int iIntValue;
        String strValueOf = String.valueOf(editable);
        C21285918Rt c21285918Rt = (C21285918Rt) c1864790ycv.l0;
        int length = strValueOf.length();
        if (length > 1500) {
            c21285918Rt.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(length);
            sbLIZ.append("/1500");
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C377760ErW c377760ErW = new C377760ErW(-5, null, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, null, null, 21);
            Activity activity = c21285918Rt.mActivity;
            if (activity != null) {
                C384040F3y.LIZ.getClass();
                String strLIZ = C384040F3y.LIZ(activity, c377760ErW);
                if (!activity.isFinishing()) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIJ(strLIZ);
                    c1389890mGx.LIZ(false);
                    c1389890mGx.LJIIJJI();
                }
            }
            String strValueOf2 = String.valueOf(length);
            Context sceneContext = c21285918Rt.getSceneContext();
            if (sceneContext != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1l, sceneContext);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -65536;
                }
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, strValueOf2.length(), 33);
            }
            ((TextView) c21285918Rt.LLLFZ.getValue()).setText(spannableString);
            C786410Ut5.LLLLZLL((TuxTextView) c21285918Rt.LLLFZ.getValue(), 0);
            if (!c21285918Rt.LLLII && c21285918Rt.LLLIIII) {
                C18S0 c18s0 = c21285918Rt.LLLLILI().LIZ;
                int height = c21285918Rt.LLLLLLL().getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17));
                C0I7D c0i7dLLLLLLL = c21285918Rt.LLLLLLL();
                ViewGroup.LayoutParams layoutParams = c0i7dLLLLLLL.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = height;
                    C786410Ut5.W5(c0i7dLLLLLLL, layoutParams);
                    c21285918Rt.LLLII = true;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) c21285918Rt.LLLFZ.getValue(), 8);
            if (c21285918Rt.LLLII && c21285918Rt.LLLIIII) {
                AIGenerationType aIGenerationType = c21285918Rt.LLLLILI().LIZ.LIZIZ;
                if (aIGenerationType != AIGenerationType.IMAGE_TO_VIDEO && aIGenerationType != AIGenerationType.AI_TRANSITION) {
                    iLIZIZ = c21285918Rt.LLLIIIL;
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                }
                C0I7D c0i7dLLLLLLL2 = c21285918Rt.LLLLLLL();
                ViewGroup.LayoutParams layoutParams2 = c0i7dLLLLLLL2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = iLIZIZ;
                    C786410Ut5.W5(c0i7dLLLLLLL2, layoutParams2);
                    c21285918Rt.LLLII = false;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        C21285918Rt c21285918Rt2 = (C21285918Rt) c1864790ycv.l0;
        c21285918Rt2.LLLLIL().LIZ.invoke(new C1851240yH4(strValueOf, EnumC382880Ezm.BY_USER), Boolean.valueOf(c21285918Rt2.LLLI));
    }

    public static final void afterTextChanged$7(C1864790ycv c1864790ycv, Editable editable) {
        InputInnerAssem inputInnerAssem = (InputInnerAssem) c1864790ycv.l0;
        C1842270y2b c1842270y2b = inputInnerAssem.LLJJI;
        if (c1842270y2b != null) {
            HandlerHook.viewPost(c1842270y2b, new ARunnableS118S0100000_18(inputInnerAssem, 84));
        }
        InputInnerAssem inputInnerAssem2 = (InputInnerAssem) c1864790ycv.l0;
        long j = inputInnerAssem2.LLJZ;
        if (j > 0) {
            C1862330yYx.LJJJJ(C1862330yYx.LIZ, j, inputInnerAssem2.getCommonParams());
        }
    }

    public static final void afterTextChanged$8(C1864790ycv c1864790ycv, Editable editable) {
        String string;
        C20441214yg.LJIIIZ("GameCategoryListDialogV2", "afterTextChanged.");
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        String string2 = a0.LJLIIIL(string).toString();
        AssemVMLazy assemVMLazy = ((GameTopicSearchAssem) c1864790ycv.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GameTopicSearchAssem.LLJIJIL;
        assemVMLazy.getValue().setState(new AwS54S1000000_3(string2, 1));
        if (editable != null && !a0.LJJJIL(editable)) {
            C786410Ut5.LLJJIJIL((LiveIconView) ((GameTopicSearchAssem) c1864790ycv.l0).LLJI.getValue(), 0);
        } else {
            C786410Ut5.LLJJIJIL((LiveIconView) ((GameTopicSearchAssem) c1864790ycv.l0).LLJI.getValue(), 8);
        }
    }

    public static final void afterTextChanged$9(C1864790ycv c1864790ycv, Editable editable) {
        String string = editable.toString();
        LiveSearchResultFragment liveSearchResultFragment = (LiveSearchResultFragment) c1864790ycv.l0;
        liveSearchResultFragment.getClass();
        if (!TextUtils.isEmpty(string)) {
            C12ES.LJIILL(0, liveSearchResultFragment.LLILZ);
        } else {
            C12ES.LJIILL(8, liveSearchResultFragment.LLILZ);
        }
        if (!TextUtils.equals(liveSearchResultFragment.LLJI, string)) {
            String str = liveSearchResultFragment.LLJI;
            string.toString();
            liveSearchResultFragment.LLJI = string;
            if (TextUtils.isEmpty(string)) {
                liveSearchResultFragment.RR();
                liveSearchResultFragment.PR(str, "cancel");
            } else {
                if (liveSearchResultFragment.LLJIJIL == 1) {
                    return;
                }
                string.toString();
                liveSearchResultFragment.UR(string);
            }
        }
    }

    public static final void onTextChanged$3(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
        String string;
        String strSubstring;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        if (i3 > 0) {
            strSubstring = string.substring(i, i3 + i);
        } else {
            strSubstring = null;
        }
        C1854760yMk c1854760yMk = (C1854760yMk) c1864790ycv.l0;
        Function2<? super String, ? super Boolean, Unit> function2 = c1854760yMk.LLLFZ.LJIIJJI;
        if (function2 != null) {
            function2.invoke(strSubstring, Boolean.valueOf(Intrinsics.LJFF(strSubstring, c1854760yMk.LLIZLLLIL)));
        }
    }

    public static final void onTextChanged$7(C1864790ycv c1864790ycv, CharSequence charSequence, int i, int i2, int i3) {
        String string;
        String strSubstring;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        InputInnerAssem inputInnerAssem = (InputInnerAssem) c1864790ycv.l0;
        if (!inputInnerAssem.LLJL) {
            inputInnerAssem.kp().AQ2(string);
        }
        InputInnerAssem inputInnerAssem2 = (InputInnerAssem) c1864790ycv.l0;
        if (inputInnerAssem2.LLJJLIIIJLLLLLLLZ) {
            inputInnerAssem2.LLJJLIIIJLLLLLLLZ = false;
            return;
        }
        if (i3 > 0) {
            strSubstring = string.substring(i, i3 + i);
        } else {
            strSubstring = null;
        }
        InputInnerAssem inputInnerAssem3 = (InputInnerAssem) c1864790ycv.l0;
        inputInnerAssem3.tp(strSubstring, Intrinsics.LJFF(strSubstring, inputInnerAssem3.LLJLLIL));
    }
}
