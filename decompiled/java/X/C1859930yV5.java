package X;

import Y.AsS53S0100000_27;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yV5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859930yV5 {
    public static final int[] LIZ = new int[2];
    public static final int[] LIZIZ = new int[2];
    public static WeakReference<C1859960yV8> LIZJ;
    public static WeakReference<InterfaceC1860040yVG> LIZLLL;

    public static void LIZ(InterfaceC1860040yVG interfaceC1860040yVG) {
        InterfaceC1860040yVG interfaceC1860040yVG2;
        InterfaceC1859950yV7 textSelector;
        C1859960yV8 c1859960yV8;
        InterfaceC1859950yV7 textSelector2;
        WeakReference<InterfaceC1860040yVG> weakReference = LIZLLL;
        if (weakReference != null) {
            interfaceC1860040yVG2 = weakReference.get();
        } else {
            interfaceC1860040yVG2 = null;
        }
        if ((interfaceC1860040yVG == null || interfaceC1860040yVG2 != interfaceC1860040yVG) && interfaceC1860040yVG2 != null && (textSelector = interfaceC1860040yVG2.getTextSelector()) != null) {
            textSelector.LIZJ();
        }
        LIZLLL = null;
        WeakReference<C1859960yV8> weakReference2 = LIZJ;
        if (weakReference2 != null && (c1859960yV8 = weakReference2.get()) != null) {
            c1859960yV8.LJII.dismiss();
            AbstractC1585810rMx abstractC1585810rMx = c1859960yV8.LIZLLL;
            if (abstractC1585810rMx != null) {
                c1859960yV8.LIZJ.removeOnScrollListener(abstractC1585810rMx);
            }
            InterfaceC1860040yVG interfaceC1860040yVG3 = c1859960yV8.LIZ;
            if (interfaceC1860040yVG3 != null) {
                interfaceC1860040yVG3.LJIILLIIL();
            }
            InterfaceC1860040yVG interfaceC1860040yVG4 = c1859960yV8.LIZ;
            if (interfaceC1860040yVG4 != null && (textSelector2 = interfaceC1860040yVG4.getTextSelector()) != null) {
                textSelector2.LJ(null);
            }
            c1859960yV8.LJI = null;
        }
        LIZJ = null;
    }

    public static View LIZIZ(View view) {
        Object parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return view;
        }
        if (parent instanceof View) {
            return LIZIZ((View) parent);
        }
        return null;
    }

    public static String LIZJ(C1860130yVP c1860130yVP) {
        return LJ(c1860130yVP, 0, c1860130yVP.getText().length(), true);
    }

    public static String LIZLLL(InterfaceC1860040yVG interfaceC1860040yVG) {
        InterfaceC1860070yVJ interfaceC1860070yVJ;
        String copyText;
        if (interfaceC1860040yVG instanceof C1860130yVP) {
            return LIZJ((C1860130yVP) interfaceC1860040yVG);
        }
        if (!(interfaceC1860040yVG instanceof InterfaceC1860070yVJ) || (interfaceC1860070yVJ = (InterfaceC1860070yVJ) interfaceC1860040yVG) == null || (copyText = interfaceC1860070yVJ.getCopyText()) == null) {
            return "";
        }
        return copyText;
    }

    public static String LJFF(InterfaceC1860040yVG interfaceC1860040yVG) {
        C1857640yRO c1857640yRO;
        CharSequence text;
        String string;
        int i;
        if (interfaceC1860040yVG instanceof C1860130yVP) {
            C1860130yVP c1860130yVP = (C1860130yVP) interfaceC1860040yVG;
            C2248251Cz9 textSelector = c1860130yVP.getTextSelector();
            if (textSelector == null || (i = textSelector.LJIIJJI) < 0) {
                i = 0;
            }
            C2248251Cz9 textSelector2 = c1860130yVP.getTextSelector();
            if (textSelector2 == null) {
                return "";
            }
            int i2 = textSelector2.LJIIL;
            int length = c1860130yVP.getText().length();
            if (i2 > length) {
                i2 = length;
            }
            if (i >= i2) {
                return "";
            }
            return u.LJJIFFI(new Regex("[\r\n]+").replace(LJ(c1860130yVP, i, i2, false), " "), "• ", "- ", false);
        }
        if (!(interfaceC1860040yVG instanceof C1857640yRO) || (c1857640yRO = (C1857640yRO) interfaceC1860040yVG) == null || (text = c1857640yRO.getText()) == null || (string = text.toString()) == null) {
            return "";
        }
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0yV9] */
    public static void LJII(final InterfaceC1860040yVG interfaceC1860040yVG, final Message message) {
        InterfaceC342000Daw markdownContent;
        C2248181Cz2 c2248181Cz2LJIIJJI;
        Integer numLIZJ;
        C2248181Cz2 c2248181Cz2LJIIL;
        int i;
        Integer numLIZJ2;
        int iIntValue;
        int i2;
        Integer numLIZJ3;
        int iIntValue2;
        int iLIZIZ;
        InterfaceC1860060yVI interfaceC1860060yVI;
        final Context context = interfaceC1860040yVG.LJJZZI().getContext();
        final C1860140yVQ c1860140yVQ = null;
        if ((interfaceC1860040yVG instanceof InterfaceC1860060yVI) && (interfaceC1860060yVI = (InterfaceC1860060yVI) interfaceC1860040yVG) != null) {
            markdownContent = interfaceC1860060yVI.getMarkdownContent();
        } else {
            markdownContent = null;
        }
        if (markdownContent instanceof C1860140yVQ) {
            c1860140yVQ = (C1860140yVQ) markdownContent;
        }
        InterfaceC1859950yV7 textSelector = interfaceC1860040yVG.getTextSelector();
        int iIntValue3 = 0;
        if (textSelector != null) {
            C1919007fQ.LIZ.getClass();
            if (C1919007fQ.LIZLLL()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
            }
            textSelector.LJIIIIZZ(iLIZIZ);
        }
        InterfaceC1859950yV7 textSelector2 = interfaceC1860040yVG.getTextSelector();
        if (textSelector2 != null) {
            textSelector2.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(63)));
        }
        InterfaceC1859950yV7 textSelector3 = interfaceC1860040yVG.getTextSelector();
        if (textSelector3 != null) {
            if (message.sender.isSelf) {
                numLIZJ3 = C1308910kAL.LIZJ(R.attr.zx, context);
            } else {
                C1919007fQ.LIZ.getClass();
                if (C1919007fQ.LIZLLL()) {
                    i2 = R.attr.zz;
                } else {
                    i2 = R.attr.a0g;
                }
                numLIZJ3 = C1308910kAL.LIZJ(i2, context);
            }
            if (numLIZJ3 != null) {
                iIntValue2 = numLIZJ3.intValue();
            } else {
                iIntValue2 = 0;
            }
            textSelector3.LJI(new BackgroundColorSpan(iIntValue2));
        }
        InterfaceC1859950yV7 textSelector4 = interfaceC1860040yVG.getTextSelector();
        int i3 = R.attr.a1t;
        if (textSelector4 != null && (c2248181Cz2LJIIL = textSelector4.LJIIL()) != null) {
            if (message.sender.isSelf) {
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.zw, context);
            } else {
                C1919007fQ.LIZ.getClass();
                if (C1919007fQ.LIZLLL()) {
                    i = R.attr.zw;
                } else {
                    i = R.attr.a1t;
                }
                numLIZJ2 = C1308910kAL.LIZJ(i, context);
            }
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            c2248181Cz2LJIIL.setCursorColor(iIntValue);
        }
        InterfaceC1859950yV7 textSelector5 = interfaceC1860040yVG.getTextSelector();
        if (textSelector5 != null && (c2248181Cz2LJIIJJI = textSelector5.LJIIJJI()) != null) {
            if (message.sender.isSelf) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.zw, context);
            } else {
                C1919007fQ.LIZ.getClass();
                if (C1919007fQ.LIZLLL()) {
                    i3 = R.attr.zw;
                }
                numLIZJ = C1308910kAL.LIZJ(i3, context);
            }
            if (numLIZJ != null) {
                iIntValue3 = numLIZJ.intValue();
            }
            c2248181Cz2LJIIJJI.setCursorColor(iIntValue3);
        }
        InterfaceC1859950yV7 textSelector6 = interfaceC1860040yVG.getTextSelector();
        if (textSelector6 != 0) {
            textSelector6.LIZIZ(new InterfaceC2248311CzF() { // from class: X.0yV9
                /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
                @Override // X.InterfaceC2248311CzF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        r9 = this;
                        X.0yVQ r5 = r1
                        X.0yVG r0 = r2
                        X.0yV7 r0 = r0.getTextSelector()
                        r4 = 0
                        if (r0 == 0) goto L9b
                        int r3 = r0.LJII()
                    Lf:
                        X.0yVG r0 = r2
                        X.0yV7 r0 = r0.getTextSelector()
                        if (r0 == 0) goto L99
                        int r2 = r0.LJIIIZ()
                    L1b:
                        com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = r3
                        com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender r0 = r0.sender
                        boolean r0 = r0.isSelf
                        if (r0 == 0) goto L78
                        android.content.Context r1 = r4
                        r0 = 2131100564(0x7f060394, float:1.7813513E38)
                        java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
                        if (r0 == 0) goto L97
                        int r8 = r0.intValue()
                    L32:
                        if (r5 == 0) goto L9e
                        android.text.SpannableStringBuilder r6 = r5.LIZ
                        int r1 = r6.length()
                        java.lang.Class<X.0Hiw> r0 = X.C448880Hiw.class
                        java.lang.Object[] r0 = r6.getSpans(r4, r1, r0)
                        java.util.List r0 = X.C13LQ.LJJLL(r0)
                        java.util.Iterator r7 = r0.iterator()
                    L48:
                        boolean r0 = r7.hasNext()
                        if (r0 == 0) goto L9e
                        java.lang.Object r6 = r7.next()
                        X.0Hiw r6 = (X.C448880Hiw) r6
                        android.text.SpannableStringBuilder r0 = r5.LIZ
                        int r1 = r0.getSpanStart(r6)
                        android.text.SpannableStringBuilder r0 = r5.LIZ
                        int r0 = r0.getSpanStart(r6)
                        if (r1 < r3) goto L6e
                        if (r0 >= r2) goto L6e
                        boolean r0 = r6 instanceof X.C448880Hiw
                        if (r0 == 0) goto L48
                        if (r6 == 0) goto L48
                        r6.LIZIZ(r8)
                        goto L48
                    L6e:
                        boolean r0 = r6 instanceof X.C448880Hiw
                        if (r0 == 0) goto L48
                        if (r6 == 0) goto L48
                        r6.LIZIZ(r4)
                        goto L48
                    L78:
                        android.content.Context r1 = r4
                        X.07fQ r0 = X.C1919007fQ.LIZ
                        r0.getClass()
                        boolean r0 = X.C1919007fQ.LIZLLL()
                        if (r0 == 0) goto L93
                        r0 = 2131100566(0x7f060396, float:1.7813517E38)
                    L88:
                        java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r1)
                        if (r0 == 0) goto L97
                        int r8 = r0.intValue()
                        goto L32
                    L93:
                        r0 = 2131100584(0x7f0603a8, float:1.7813554E38)
                        goto L88
                    L97:
                        r8 = 0
                        goto L32
                    L99:
                        r2 = 0
                        goto L1b
                    L9b:
                        r3 = 0
                        goto Lf
                    L9e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1859970yV9.LIZ():void");
                }

                @Override // X.InterfaceC2248311CzF
                public final void LIZIZ() {
                    C1860140yVQ c1860140yVQ2 = c1860140yVQ;
                    InterfaceC1859950yV7 textSelector7 = interfaceC1860040yVG.getTextSelector();
                    int iLJII = textSelector7 != null ? textSelector7.LJII() : 0;
                    InterfaceC1859950yV7 textSelector8 = interfaceC1860040yVG.getTextSelector();
                    int iLJIIIZ = textSelector8 != null ? textSelector8.LJIIIZ() : 0;
                    if (c1860140yVQ2 != null) {
                        SpannableStringBuilder spannableStringBuilder = c1860140yVQ2.LIZ;
                        for (C448880Hiw c448880Hiw : C13LQ.LJJLL(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C448880Hiw.class))) {
                            int spanStart = c1860140yVQ2.LIZ.getSpanStart(c448880Hiw);
                            int spanStart2 = c1860140yVQ2.LIZ.getSpanStart(c448880Hiw);
                            if (spanStart >= iLJII && spanStart2 <= iLJIIIZ && (c448880Hiw instanceof C448880Hiw) && c448880Hiw != null) {
                                c448880Hiw.LIZIZ(0);
                            }
                        }
                    }
                }
            });
        }
    }

    public static String LJ(C1860130yVP c1860130yVP, int i, int i2, boolean z) {
        int length = i2;
        int i3 = i;
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = c1860130yVP.getText().length();
        if (length > length2) {
            length = length2;
        }
        if (i3 >= length) {
            length = c1860130yVP.getText().length();
            i3 = 0;
        }
        StringBuilder sb = new StringBuilder(c1860130yVP.getText().subSequence(i3, length));
        try {
            C1859900yV2.LIZIZ.LIZJ(c1860130yVP.getText(), c1860130yVP.getMarkdownContent(), i3, length, sb, z);
            return new Regex("(?m)^\\s*$\\n*").replace(a0.LJJJLL("⚫", a0.LJLIIIL(sb.toString()).toString()), "\n");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return a0.LJLIIIL(sb.toString()).toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(InterfaceC1860040yVG interfaceC1860040yVG, Message message, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, Pair pair, int i) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
        Map<String, String> mapLJ;
        String strNZ0;
        ITakoAIBotUIAbility iTakoAIBotUIAbility;
        AIBotInfo botInfo;
        C1857640yRO c1857640yRO;
        CharSequence text;
        int length;
        CharSequence charSequenceLJLJI;
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            pair = null;
        }
        LIZ(interfaceC1860040yVG);
        if (z) {
            pair = null;
        }
        if (z) {
            InterfaceC1859950yV7 textSelector = interfaceC1860040yVG.getTextSelector();
            if (textSelector != null) {
                if (interfaceC1860040yVG instanceof C1860130yVP) {
                    text = ((AppCompatTextView) interfaceC1860040yVG).getText();
                } else {
                    if ((interfaceC1860040yVG instanceof C1857640yRO) && (c1857640yRO = (C1857640yRO) interfaceC1860040yVG) != null) {
                        text = c1857640yRO.getText();
                    }
                    length = 0;
                    textSelector.LJIILIIL(0, length);
                }
                if (text != null && (charSequenceLJLJI = a0.LJLJI(text, 8199)) != null) {
                    length = charSequenceLJLJI.length();
                } else {
                    length = 0;
                }
                textSelector.LJIILIIL(0, length);
            }
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
            if (takoCardAbility != null) {
                takoCardAbility.ME0();
            }
        } else if (pair != null) {
            InterfaceC1859950yV7 textSelector2 = interfaceC1860040yVG.getTextSelector();
            if (textSelector2 != null) {
                textSelector2.LJIILIIL(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
            }
        } else {
            InterfaceC1859950yV7 textSelector3 = interfaceC1860040yVG.getTextSelector();
            if (textSelector3 != null) {
                textSelector3.LJIILL((int) interfaceC1860040yVG.getClickX(), (int) interfaceC1860040yVG.getClickY());
            }
        }
        ArrayList arrayList = new ArrayList();
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZ()) {
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            interfaceC1860040yVG.LJJZZI();
            AwS271S0300000_27 awS271S0300000_27 = new AwS271S0300000_27(interfaceC665370Q7z, interfaceC1860040yVG, message, 12);
            if (C1919007fQ.LIZLLL() && !message.sender.isSelf && ((iTakoAIBotUIAbility = (ITakoAIBotUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoAIBotUIAbility.class, null)) == null || (botInfo = iTakoAIBotUIAbility.getBotInfo()) == null || !botInfo.isCsiBot())) {
                arrayList.add(C1857420yR2.LIZ(new AwS606S0100000_27(awS271S0300000_27, (Function0<Unit>) 435)));
            }
        }
        C1857420yR2 c1857420yR22 = C1857420yR2.LIZ;
        C1857420yR2.LIZIZ(arrayList, interfaceC1860040yVG.LJJZZI(), null, message, interfaceC665370Q7z, new AwS271S0300000_27(interfaceC665370Q7z, interfaceC1860040yVG, message, 13), null, 34);
        AwS271S0300000_27 awS271S0300000_272 = new AwS271S0300000_27(interfaceC665370Q7z, interfaceC1860040yVG, message, 14);
        if (C07I2.LIZ()) {
            arrayList.add(C1857420yR2.LIZ(new AwS606S0100000_27(awS271S0300000_272, 431)));
        }
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        AsS53S0100000_27 asS53S0100000_27 = new AsS53S0100000_27(interfaceC1860040yVG, 5);
        if (takoChatUIAbility != null && (viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM()) != null) {
            RunnableC1843540y4e runnableC1843540y4ePH1 = takoChatUIAbility.PH1();
            if (C1919007fQ.LIZLLL()) {
                C1859960yV8 c1859960yV8 = new C1859960yV8(interfaceC1860040yVG.LJJZZI().getContext(), interfaceC1860040yVG, message, viewOnAttachStateChangeListenerC20604515jvCM, arrayList, new AwS571S0100000_27(takoChatUIAbility, 1109), asS53S0100000_27);
                c1859960yV8.LJI = new C1859940yV6(runnableC1843540y4ePH1, viewOnAttachStateChangeListenerC20604515jvCM, interfaceC1860040yVG);
                LIZJ = new WeakReference<>(c1859960yV8);
                LIZLLL = new WeakReference<>(interfaceC1860040yVG);
                c1859960yV8.LIZ();
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
                if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                String str = message.uuid;
                String strLJJI = C1857420yR2.LJJI(message);
                ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoScreenTypeAbility.class, null);
                if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                    strNZ0 = "full_screen";
                }
                C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                c1862330yYx.getClass();
                c20235014FoLIZ.LIZ("tikbot_after_select_panel_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", mapLJ.get("enter_from")), new Pair("enter_method", mapLJ.get("enter_method")), new Pair("process_id", mapLJ.get("process_id")), new Pair("tako_session_id", mapLJ.get("tako_session_id")), new Pair("tako_chat_id", mapLJ.get("tako_chat_id")), new Pair("message_id", str), new Pair("message_type", strLJJI), new Pair("sub_process_id", mapLJ.get("sub_process_id")), new Pair("bot_id", mapLJ.get("bot_id")), new Pair("screen_type", strNZ0)));
                return;
            }
            C1860010yVD c1860010yVD = new C1860010yVD(interfaceC1860040yVG.LJJZZI().getContext(), interfaceC1860040yVG, message, viewOnAttachStateChangeListenerC20604515jvCM, false, arrayList, new AwS571S0100000_27(takoChatUIAbility, 1104), asS53S0100000_27, false, false, null, 1536);
            c1860010yVD.LJFF = new C1859940yV6(runnableC1843540y4ePH1, viewOnAttachStateChangeListenerC20604515jvCM, interfaceC1860040yVG);
            c1860010yVD.LIZJ();
        }
    }
}
