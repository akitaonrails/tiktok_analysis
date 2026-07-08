package X;

import Y.ACListenerS119S0200000_16;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.HintsConfig;
import com.ss.android.ugc.aweme.model.AnoleAiAgentData;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;
import mf.a;

/* JADX INFO: renamed from: X.0cgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021200cgI extends FrameLayout implements InterfaceC1021180cgG {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;
    public long LLILLL;

    public final Map<String, String> getBasicClickParams() {
        return C2097608Jq.LJIIJ(new Pair(AbstractC1021310cgT.LIZIZ, String.valueOf(System.currentTimeMillis() - this.LLILLL)), new Pair(AbstractC1021310cgT.LIZLLL, getQuestionContent()), new Pair(AbstractC1021310cgT.LIZJ, getQuestionContent()), new Pair(AbstractC1021310cgT.LJFF, "bar"));
    }

    private final TuxIconView getArrowIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b8y);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    private final TuxTextView getChainTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dmx);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final String getQuestionContent() {
        TuxTextView chainTvFromXml = getChainTvFromXml();
        Object tag = chainTvFromXml != null ? chainTvFromXml.getTag(R.id.b4n) : null;
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public C1021200cgI(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.pc, C786410Ut5.ne(context), this);
        TuxIconView arrowIconFromXml = getArrowIconFromXml();
        if (arrowIconFromXml != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0p);
            c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
            arrowIconFromXml.setTuxIcon(c419910GdJ);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bt);
        setBackground(c384050F3z.LIZ(context));
        this.LLILLL = System.currentTimeMillis();
    }

    private final void setQuestionContent(String str) {
        TuxTextView chainTvFromXml = getChainTvFromXml();
        if (chainTvFromXml != null) {
            chainTvFromXml.setTag(R.id.b4n, str);
        }
    }

    @Override // X.InterfaceC1021180cgG
    public final void LIZ(HintsConfig hintsConfig) {
        String title;
        TuxTextView chainTvFromXml = getChainTvFromXml();
        String textChain = null;
        if (chainTvFromXml != null) {
            if (hintsConfig != null) {
                title = hintsConfig.getTitle();
            } else {
                title = null;
            }
            chainTvFromXml.setText(title);
        }
        if (hintsConfig != null) {
            textChain = hintsConfig.getTextChain();
        }
        setQuestionContent(textChain);
    }

    @Override // X.InterfaceC1021180cgG
    public final void LIZIZ(C1014660cVk c1014660cVk, Function1 function1) {
        C1022620cia.LIZ("TextChainView", "didShow");
        this.LLILLL = System.currentTimeMillis();
        c1014660cVk.logAd(C1021270cgP.LIZ, new AwS382S0200000_16(this, (C1021200cgI) function1, (Function1<? super C1023640ckE, Unit>) 113));
    }

    public final void LIZJ(AnoleAiAgentData anoleAiAgentData, InterfaceC1021210cgJ<? extends InterfaceC1021290cgR> interfaceC1021210cgJ) {
        String str;
        TuxTextView chainTvFromXml = getChainTvFromXml();
        String str2 = null;
        if (chainTvFromXml != null) {
            if (anoleAiAgentData != null) {
                str = anoleAiAgentData.title;
            } else {
                str = null;
            }
            chainTvFromXml.setText(str);
        }
        if (anoleAiAgentData != null) {
            str2 = anoleAiAgentData.textChain;
        }
        setQuestionContent(str2);
        View.OnClickListener aCListenerS119S0200000_16 = new ACListenerS119S0200000_16(this, interfaceC1021210cgJ, 38);
        if (C1848410yCV.LIZ) {
            aCListenerS119S0200000_16 = new f(aCListenerS119S0200000_16);
        }
        a aVar = new a(aCListenerS119S0200000_16);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.n.getValue());
    }
}
