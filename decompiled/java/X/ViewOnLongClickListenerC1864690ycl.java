package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.component.video.NimbleVideoItemAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoNewImageAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.mix.TakoAnswerMixAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.videogeneration.TakoAnswerVideoGenerationAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.deepthink.TakoDeepThinkAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.assem.TakoNewMarkdownAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.product.TakoProductItemCell;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videogeneration.TakoVideoGenerationCoverAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ycl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewOnLongClickListenerC1864690ycl implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onLongClick$9(this, view);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onLongClick$10(this, view);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onLongClick$11(this, view);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onLongClick$12(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC1864690ycl(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        return ((Boolean) ((TakoNewImageAssem) viewOnLongClickListenerC1864690ycl.l0).LLLIIIL.invoke(view)).booleanValue();
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        return ((Boolean) ((TakoAnswerImageListItemAssem) viewOnLongClickListenerC1864690ycl.l0).LLLIL.invoke(view)).booleanValue();
    }

    public static final boolean onLongClick$10(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        boolean z;
        Function0<Boolean> function0 = ((C1854760yMk) viewOnLongClickListenerC1864690ycl.l0).LLLFZ.LJIILL;
        if ((function0 == null || !function0.invoke().booleanValue()) && !C1855050yND.LIZIZ(((C1854760yMk) viewOnLongClickListenerC1864690ycl.l0).getTakoReferenceAskInfo())) {
            if (String.valueOf(C2204961BRm.v(((C1854760yMk) viewOnLongClickListenerC1864690ycl.l0).getInputView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3j3HeX53NP4YQVHzG8nd3cZ6gRXNGEdNA8bI9SKSxWjF8rAy", null))).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !((C1854760yMk) viewOnLongClickListenerC1864690ycl.l0).getInputView().hasFocus();
            if (z && z2) {
                C1854760yMk c1854760yMk = (C1854760yMk) viewOnLongClickListenerC1864690ycl.l0;
                Function1<? super MotionEvent, Unit> function1 = c1854760yMk.LLLFZ.LJIILIIL;
                if (function1 != null) {
                    function1.invoke(c1854760yMk.LLLII);
                }
                ((C1854760yMk) viewOnLongClickListenerC1864690ycl.l0).LLLIIII = true;
                return true;
            }
        }
        return false;
    }

    public static final boolean onLongClick$11(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        Function0<Boolean> function0 = ((C1854760yMk) viewOnLongClickListenerC1864690ycl.l0).LLLFZ.LJIILL;
        if (function0 != null && function0.invoke().booleanValue()) {
            return false;
        }
        C1854760yMk c1854760yMk = (C1854760yMk) viewOnLongClickListenerC1864690ycl.l0;
        Function1<? super MotionEvent, Unit> function1 = c1854760yMk.LLLFZ.LJIILIIL;
        if (function1 != null) {
            function1.invoke(c1854760yMk.LLLIIIIL);
        }
        ((C1854760yMk) viewOnLongClickListenerC1864690ycl.l0).LLLIIIL = true;
        return true;
    }

    public static final boolean onLongClick$12(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        INimbleVideoListDependAbility iNimbleVideoListDependAbilityOp = ((NimbleVideoItemAssem) viewOnLongClickListenerC1864690ycl.l0).op();
        if (iNimbleVideoListDependAbilityOp != null) {
            iNimbleVideoListDependAbilityOp.Gt();
            return true;
        }
        return false;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        float clickX;
        float clickY;
        ArrayList arrayList;
        String strLJIIIZ;
        float clickX2;
        float clickY2;
        String strLJIIIZ2;
        boolean zYr = ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0).Yr();
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0);
        Message message = ((C1858660yT2) C631370Opb.LIZ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0)).LL.LLILLL;
        C14J2 c14j2Pq = ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0).pq();
        if (c14j2Pq != null) {
            clickX = c14j2Pq.getClickX();
        } else {
            clickX = 0.0f;
        }
        C14J2 c14j2Pq2 = ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0).pq();
        if (c14j2Pq2 != null) {
            clickY = c14j2Pq2.getClickY();
        } else {
            clickY = 0.0f;
        }
        if (C1857420yR2.LJJIIJ(c19egLIZ, view, C1558520qew.LJIIL((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0), message, clickX, clickY) || !C1858670yT3.LJIIJ(((C1858660yT2) C631370Opb.LIZ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0)).LL.LLILLL)) {
            return true;
        }
        if (zYr) {
            C1919007fQ.LIZ.getClass();
            if (C1919007fQ.LIZIZ()) {
                return true;
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0);
        Message message2 = ((C1858660yT2) C631370Opb.LIZ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0)).LL.LLILLL;
        TakoAnswerMixAssem takoAnswerMixAssem = (TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0;
        Message message3 = ((C1858660yT2) C631370Opb.LIZ(takoAnswerMixAssem)).LL.LLILLL;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0);
        C1919007fQ.LIZ.getClass();
        String str = "";
        Object obj = null;
        if (C1919007fQ.LIZLLL()) {
            ArrayList arrayList2 = new ArrayList();
            C1857420yR2.LJIIIIZZ(view, interfaceC665370Q7zLJIIL2, message3, "long_press", arrayList2);
            C1857420yR2.LJ(view, interfaceC665370Q7zLJIIL2, message3, "long_press", arrayList2);
            C1860130yVP c1860130yVP = takoAnswerMixAssem.LLLLZI;
            if (c1860130yVP != null) {
                strLJIIIZ2 = C1859930yV5.LIZJ(c1860130yVP);
                if (strLJIIIZ2 != null) {
                }
                C1857420yR2.LIZIZ(arrayList2, view, str, message3, interfaceC665370Q7zLJIIL2, null, null, 48);
                C1857420yR2.LJIILL(arrayList2, takoAnswerMixAssem.LLLLZI, message3, interfaceC665370Q7zLJIIL2, !takoAnswerMixAssem.Eq());
                C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7zLJIIL2, message3, null, arrayList2, null);
                C1857420yR2.LIZLLL(arrayList2, takoAnswerMixAssem.getContext(), message3, C1858670yT3.LIZ(message3, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, IMessageAbility.class, null)), interfaceC665370Q7zLJIIL2);
                arrayList = arrayList2;
                C1857420yR2.LJIIL(arrayList, view, message3, interfaceC665370Q7zLJIIL2, false, null, 24);
                C1857420yR2.LIZJ(interfaceC665370Q7zLJIIL2, arrayList);
            } else {
                C724270Sb3 c724270Sb3 = takoAnswerMixAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                strLJIIIZ2 = AnonymousClass1418.LJIIIZ(((C1858660yT2) obj).LLILZLL);
            }
            str = strLJIIIZ2;
            C1857420yR2.LIZIZ(arrayList2, view, str, message3, interfaceC665370Q7zLJIIL2, null, null, 48);
            C1857420yR2.LJIILL(arrayList2, takoAnswerMixAssem.LLLLZI, message3, interfaceC665370Q7zLJIIL2, !takoAnswerMixAssem.Eq());
            C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7zLJIIL2, message3, null, arrayList2, null);
            C1857420yR2.LIZLLL(arrayList2, takoAnswerMixAssem.getContext(), message3, C1858670yT3.LIZ(message3, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, IMessageAbility.class, null)), interfaceC665370Q7zLJIIL2);
            arrayList = arrayList2;
            C1857420yR2.LJIIL(arrayList, view, message3, interfaceC665370Q7zLJIIL2, false, null, 24);
            C1857420yR2.LIZJ(interfaceC665370Q7zLJIIL2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            C1857420yR2.LJIIIIZZ(view, interfaceC665370Q7zLJIIL2, message3, "long_press", arrayList3);
            C1857420yR2.LJ(view, interfaceC665370Q7zLJIIL2, message3, "long_press", arrayList3);
            arrayList = arrayList3;
            C1860130yVP c1860130yVP2 = takoAnswerMixAssem.LLLLZI;
            if (c1860130yVP2 != null) {
                strLJIIIZ = C1859930yV5.LIZJ(c1860130yVP2);
                if (strLJIIIZ != null) {
                }
                C1857420yR2.LIZIZ(arrayList, view, str, message3, interfaceC665370Q7zLJIIL2, null, null, 48);
                C1857420yR2.LJIILL(arrayList, takoAnswerMixAssem.LLLLZI, message3, interfaceC665370Q7zLJIIL2, !takoAnswerMixAssem.Eq());
                C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7zLJIIL2, message3, null, arrayList, null);
                C1857420yR2.LJIIL(arrayList, view, message3, interfaceC665370Q7zLJIIL2, false, null, 24);
                C1857420yR2.LIZLLL(arrayList, takoAnswerMixAssem.getContext(), message3, C1858670yT3.LIZ(message3, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, IMessageAbility.class, null)), interfaceC665370Q7zLJIIL2);
                C1857420yR2.LIZJ(interfaceC665370Q7zLJIIL2, arrayList);
            } else {
                C724270Sb3 c724270Sb32 = takoAnswerMixAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj = c724270Sb32.LL;
                }
                strLJIIIZ = AnonymousClass1418.LJIIIZ(((C1858660yT2) obj).LLILZLL);
            }
            str = strLJIIIZ;
            C1857420yR2.LIZIZ(arrayList, view, str, message3, interfaceC665370Q7zLJIIL2, null, null, 48);
            C1857420yR2.LJIILL(arrayList, takoAnswerMixAssem.LLLLZI, message3, interfaceC665370Q7zLJIIL2, !takoAnswerMixAssem.Eq());
            C1857420yR2.LJIILLIIL(24, view, interfaceC665370Q7zLJIIL2, message3, null, arrayList, null);
            C1857420yR2.LJIIL(arrayList, view, message3, interfaceC665370Q7zLJIIL2, false, null, 24);
            C1857420yR2.LIZLLL(arrayList, takoAnswerMixAssem.getContext(), message3, C1858670yT3.LIZ(message3, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, IMessageAbility.class, null)), interfaceC665370Q7zLJIIL2);
            C1857420yR2.LIZJ(interfaceC665370Q7zLJIIL2, arrayList);
        }
        C14J2 c14j2Pq3 = ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0).pq();
        if (c14j2Pq3 != null) {
            clickX2 = c14j2Pq3.getClickX();
        } else {
            clickX2 = 0.0f;
        }
        C14J2 c14j2Pq4 = ((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0).pq();
        if (c14j2Pq4 != null) {
            clickY2 = c14j2Pq4.getClickY();
        } else {
            clickY2 = 0.0f;
        }
        C1857420yR2.LJJIII(view, interfaceC665370Q7zLJIIL, message2, arrayList, clickX2, clickY2, false, !((TakoAnswerMixAssem) viewOnLongClickListenerC1864690ycl.l0).Eq(), 64);
        return true;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        boolean z;
        String str;
        Message message = ((C1858660yT2) C631370Opb.LIZ((TakoAnswerVideoGenerationAssem) viewOnLongClickListenerC1864690ycl.l0)).LL.LLILLL;
        if (C1858670yT3.LJIIJ(message) && !C1004300cF2.LIZJ(message.LJIIIZ(), message.serverTime)) {
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            C1857420yR2.LJJIII(view, C1558520qew.LJIIL((TakoAnswerVideoGenerationAssem) viewOnLongClickListenerC1864690ycl.l0), message, ((TakoAnswerVideoGenerationAssem) viewOnLongClickListenerC1864690ycl.l0).Wp(view, C1558520qew.LJIIL((TakoAnswerVideoGenerationAssem) viewOnLongClickListenerC1864690ycl.l0), message), ((TakoAnswerVideoGenerationAssem) viewOnLongClickListenerC1864690ycl.l0).Tp().getClickX(), ((TakoAnswerVideoGenerationAssem) viewOnLongClickListenerC1864690ycl.l0).Tp().getClickY(), false, false, 192);
            return true;
        }
        Integer numValueOf = null;
        ITakoAIBotUIAbility iTakoAIBotUIAbility = (ITakoAIBotUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL((TakoAnswerVideoGenerationAssem) viewOnLongClickListenerC1864690ycl.l0), ITakoAIBotUIAbility.class, null);
        if (iTakoAIBotUIAbility != null && iTakoAIBotUIAbility.ve2()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = message.uuid;
        String str3 = message.subSessionId;
        long j = message.actionId;
        Long lValueOf = Long.valueOf(message.botId);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoAnswerVideoGenerationAssem) viewOnLongClickListenerC1864690ycl.l0);
        String strLIZIZ = C1855920yOc.LIZIZ(message);
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(message.ext.activeAiImageSubBar));
        boolean z2 = message.isMultiAnswer;
        if (z2) {
            str = "multi_answer";
        } else {
            str = "default";
        }
        if (z2) {
            numValueOf = Integer.valueOf(message.selectedAnswerIndex + 1);
        }
        C12FB.LIZLLL(view, z, str2, str3, j, lValueOf, interfaceC665370Q7zLJIIL, "long_press", strLIZIZ, strLIZLLL, str, numValueOf);
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        float clickX;
        float clickY;
        float clickX2;
        C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0);
        Message message = ((C1858660yT2) C631370Opb.LIZ((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0)).LL.LLILLL;
        InterfaceC1860810yWV interfaceC1860810yWVTp = ((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0).Tp();
        float clickY2 = 0.0f;
        if (interfaceC1860810yWVTp != null) {
            clickX = interfaceC1860810yWVTp.getClickX();
        } else {
            clickX = 0.0f;
        }
        InterfaceC1860810yWV interfaceC1860810yWVTp2 = ((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0).Tp();
        if (interfaceC1860810yWVTp2 != null) {
            clickY = interfaceC1860810yWVTp2.getClickY();
        } else {
            clickY = 0.0f;
        }
        if (C1857420yR2.LJJIIJ(c19egLIZ, view, C1558520qew.LJIIL((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0), message, clickX, clickY) || !C1858670yT3.LJIIJ(((C1858660yT2) C631370Opb.LIZ((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0)).LL.LLILLL)) {
            return true;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0);
        Message message2 = ((C1858660yT2) C631370Opb.LIZ((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0)).LL.LLILLL;
        TakoAnswerBaseAssem takoAnswerBaseAssem = (TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0;
        List listWp = takoAnswerBaseAssem.Wp(view, C1558520qew.LJIIL((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0), ((C1858660yT2) C631370Opb.LIZ(takoAnswerBaseAssem)).LL.LLILLL);
        InterfaceC1860810yWV interfaceC1860810yWVTp3 = ((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0).Tp();
        if (interfaceC1860810yWVTp3 != null) {
            clickX2 = interfaceC1860810yWVTp3.getClickX();
        } else {
            clickX2 = 0.0f;
        }
        InterfaceC1860810yWV interfaceC1860810yWVTp4 = ((TakoAnswerBaseAssem) viewOnLongClickListenerC1864690ycl.l0).Tp();
        if (interfaceC1860810yWVTp4 != null) {
            clickY2 = interfaceC1860810yWVTp4.getClickY();
        }
        C1857420yR2.LJJIII(view, interfaceC665370Q7zLJIIL, message2, listWp, clickX2, clickY2, false, false, 192);
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        ViewGroup viewGroupY4;
        Message messageYy1;
        float clickX;
        float clickY;
        ArrayList arrayList;
        TakoMixFeed takoMixFeedLJIIIZ;
        String strLIZJ;
        float clickX2;
        float clickY2;
        TakoMixFeed takoMixFeedLJIIIZ2;
        String strLIZJ2;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL((TakoDeepThinkAssem) viewOnLongClickListenerC1864690ycl.l0), TakoCardAbility.class, null);
        if (takoCardAbility != null && (viewGroupY4 = takoCardAbility.Y4()) != null) {
            TakoDeepThinkAssem takoDeepThinkAssem = (TakoDeepThinkAssem) viewOnLongClickListenerC1864690ycl.l0;
            if (viewGroupY4.isLongClickable()) {
                takoDeepThinkAssem.getClass();
                TakoCardAbility takoCardAbility2 = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoDeepThinkAssem), TakoCardAbility.class, null);
                if (takoCardAbility2 != null && (messageYy1 = takoCardAbility2.Yy1()) != null) {
                    C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
                    C19EG c19egLIZ = C724240Sb0.LIZ(takoDeepThinkAssem);
                    C1859370yUB c1859370yUB = takoDeepThinkAssem.LLJLLIL;
                    if (c1859370yUB != null) {
                        clickX = c1859370yUB.getClickX();
                    } else {
                        clickX = 0.0f;
                    }
                    C1859370yUB c1859370yUB2 = takoDeepThinkAssem.LLJLLIL;
                    if (c1859370yUB2 != null) {
                        clickY = c1859370yUB2.getClickY();
                    } else {
                        clickY = 0.0f;
                    }
                    if (!C1857420yR2.LJJIIJ(c19egLIZ, viewGroupY4, C1558520qew.LJIIL(takoDeepThinkAssem), messageYy1, clickX, clickY) && C1858670yT3.LJIIJ(messageYy1)) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(takoDeepThinkAssem);
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(takoDeepThinkAssem);
                        C1919007fQ.LIZ.getClass();
                        String str = "";
                        if (C1919007fQ.LIZLLL()) {
                            ArrayList arrayList2 = new ArrayList();
                            C1857420yR2.LJIIIIZZ(viewGroupY4, interfaceC665370Q7zLJIIL2, messageYy1, "long_press", arrayList2);
                            C1857420yR2.LJ(viewGroupY4, interfaceC665370Q7zLJIIL2, messageYy1, "long_press", arrayList2);
                            C1859370yUB c1859370yUB3 = takoDeepThinkAssem.LLJLLIL;
                            if (c1859370yUB3 == null ? !((takoMixFeedLJIIIZ2 = messageYy1.LJIIIZ()) == null || (strLIZJ2 = takoMixFeedLJIIIZ2.thinkContent) == null) : (strLIZJ2 = C1859930yV5.LIZJ(c1859370yUB3)) != null) {
                                str = strLIZJ2;
                            }
                            C1857420yR2.LIZIZ(arrayList2, viewGroupY4, str, messageYy1, interfaceC665370Q7zLJIIL2, null, null, 48);
                            C1857420yR2.LJIILL(arrayList2, takoDeepThinkAssem.LLJLLIL, messageYy1, interfaceC665370Q7zLJIIL2, false);
                            C1857420yR2.LJIILLIIL(24, viewGroupY4, interfaceC665370Q7zLJIIL2, messageYy1, null, arrayList2, null);
                            C1857420yR2.LIZLLL(arrayList2, takoDeepThinkAssem.getContext(), messageYy1, C1858670yT3.LIZ(messageYy1, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, IMessageAbility.class, null)), interfaceC665370Q7zLJIIL2);
                            arrayList = arrayList2;
                            C1857420yR2.LJIIL(arrayList, viewGroupY4, messageYy1, interfaceC665370Q7zLJIIL2, false, null, 24);
                            C1857420yR2.LIZJ(interfaceC665370Q7zLJIIL2, arrayList);
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            C1857420yR2.LJIIIIZZ(viewGroupY4, interfaceC665370Q7zLJIIL2, messageYy1, "long_press", arrayList3);
                            C1857420yR2.LJ(viewGroupY4, interfaceC665370Q7zLJIIL2, messageYy1, "long_press", arrayList3);
                            arrayList = arrayList3;
                            C1859370yUB c1859370yUB4 = takoDeepThinkAssem.LLJLLIL;
                            if (c1859370yUB4 == null ? !((takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null || (strLIZJ = takoMixFeedLJIIIZ.thinkContent) == null) : (strLIZJ = C1859930yV5.LIZJ(c1859370yUB4)) != null) {
                                str = strLIZJ;
                            }
                            C1857420yR2.LIZIZ(arrayList, viewGroupY4, str, messageYy1, interfaceC665370Q7zLJIIL2, null, null, 48);
                            C1857420yR2.LJIILL(arrayList, takoDeepThinkAssem.LLJLLIL, messageYy1, interfaceC665370Q7zLJIIL2, false);
                            C1857420yR2.LJIILLIIL(24, viewGroupY4, interfaceC665370Q7zLJIIL2, messageYy1, null, arrayList, null);
                            C1857420yR2.LJIIL(arrayList, viewGroupY4, messageYy1, interfaceC665370Q7zLJIIL2, false, null, 24);
                            C1857420yR2.LIZLLL(arrayList, takoDeepThinkAssem.getContext(), messageYy1, C1858670yT3.LIZ(messageYy1, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, IMessageAbility.class, null)), interfaceC665370Q7zLJIIL2);
                            C1857420yR2.LIZJ(interfaceC665370Q7zLJIIL2, arrayList);
                        }
                        C1859370yUB c1859370yUB5 = takoDeepThinkAssem.LLJLLIL;
                        if (c1859370yUB5 != null) {
                            clickX2 = c1859370yUB5.getClickX();
                        } else {
                            clickX2 = 0.0f;
                        }
                        C1859370yUB c1859370yUB6 = takoDeepThinkAssem.LLJLLIL;
                        if (c1859370yUB6 != null) {
                            clickY2 = c1859370yUB6.getClickY();
                        } else {
                            clickY2 = 0.0f;
                        }
                        C1857420yR2.LJJIII(viewGroupY4, interfaceC665370Q7zLJIIL, messageYy1, arrayList, clickX2, clickY2, false, false, 192);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        ViewGroup viewGroupY4;
        TakoCardAbility takoCardAbilitySp = ((TakoNewMarkdownAssem) viewOnLongClickListenerC1864690ycl.l0).sp();
        if (takoCardAbilitySp != null && (viewGroupY4 = takoCardAbilitySp.Y4()) != null && viewGroupY4.isLongClickable()) {
            viewGroupY4.performLongClick();
            return true;
        }
        return false;
    }

    public static final boolean onLongClick$7(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        Function2<Float, Float, Unit> onLongClickListener = ((C1856230yP7) viewOnLongClickListenerC1864690ycl.l0).getOnLongClickListener();
        if (onLongClickListener != null) {
            onLongClickListener.invoke(Float.valueOf(((C1856230yP7) viewOnLongClickListenerC1864690ycl.l0).LLILZIL), Float.valueOf(((C1856230yP7) viewOnLongClickListenerC1864690ycl.l0).LLILZLL));
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$8(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        ViewGroup viewGroupY4;
        TakoCardAbility takoCardAbilityI5 = ((TakoProductItemCell) viewOnLongClickListenerC1864690ycl.l0).I5();
        if (takoCardAbilityI5 != null && (viewGroupY4 = takoCardAbilityI5.Y4()) != null) {
            viewGroupY4.performLongClick();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$9(ViewOnLongClickListenerC1864690ycl viewOnLongClickListenerC1864690ycl, View view) {
        return ((Boolean) ((TakoVideoGenerationCoverAssem) viewOnLongClickListenerC1864690ycl.l0).LLLIIIIL.invoke(view)).booleanValue();
    }
}
