package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.HintsConfig;
import com.ss.android.ugc.aweme.model.AnoleAiAgentData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1021220cgK extends FrameLayout implements InterfaceC1021180cgG, View.OnClickListener {
    public View LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C424560Gko LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxIconView LLJIJIL;
    public long LLJILJIL;
    public InterfaceC1021210cgJ<? extends InterfaceC1021290cgR> LLJILJILJ;

    private final Map<String, String> getBasicClickParams() {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair(AbstractC1021310cgT.LIZIZ, String.valueOf(System.currentTimeMillis() - this.LLJILJIL));
        String str = AbstractC1021310cgT.LIZJ;
        CharSequence[] charSequenceArr = new CharSequence[2];
        TuxTextView startTvFromXml = getStartTvFromXml();
        charSequenceArr[0] = startTvFromXml != null ? startTvFromXml.getText() : null;
        TuxTextView endTvFromXml = getEndTvFromXml();
        charSequenceArr[1] = endTvFromXml != null ? endTvFromXml.getText() : null;
        pairArr[1] = new Pair(str, C13LQ.LJJJ(charSequenceArr, null, null, null, null, 63));
        return C2097608Jq.LJIIJ(pairArr);
    }

    private final View getAvatarContainerFromXml() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.bi2);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    private final View getCardBodyFromXml() {
        View view = this.LLILZLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.dea);
        this.LLILZLL = viewFindViewById;
        return viewFindViewById;
    }

    private final View getEndLayoutFromXml() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.h4y);
        this.LLIZLLLIL = viewFindViewById;
        return viewFindViewById;
    }

    private final View getSponsorLayoutFromXml() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.vvj);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    private final View getStartLayoutFromXml() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.vyr);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    private final TuxTextView getTitleTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3j);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C424560Gko getAvatarIvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.biz);
            this.LLILZ = (C424560Gko) callbackFindViewById;
        }
        return (C424560Gko) callbackFindViewById;
    }

    public final TuxIconView getCloseIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e26);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getEndTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.h5_);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getSponsorTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vvl);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getStartTvFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vzq);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public ViewOnClickListenerC1021220cgK(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.pb, C786410Ut5.ne(context), this);
        View sponsorLayoutFromXml = getSponsorLayoutFromXml();
        if (sponsorLayoutFromXml != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.im);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            sponsorLayoutFromXml.setBackground(c384050F3z.LIZ(context));
        }
        View cardBodyFromXml = getCardBodyFromXml();
        if (cardBodyFromXml != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zg);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            cardBodyFromXml.setBackground(c384050F3z2.LIZ(context));
        }
        C384050F3z c384050F3z3 = new C384050F3z();
        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.zj);
        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
        Drawable drawableLIZ = c384050F3z3.LIZ(context);
        View startLayoutFromXml = getStartLayoutFromXml();
        if (startLayoutFromXml != null) {
            startLayoutFromXml.setBackground(drawableLIZ);
        }
        View endLayoutFromXml = getEndLayoutFromXml();
        if (endLayoutFromXml != null) {
            endLayoutFromXml.setBackground(drawableLIZ);
        }
        TuxIconView closeIconFromXml = getCloseIconFromXml();
        if (closeIconFromXml != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZ = R.raw.icon_close_small_dark;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zk);
            closeIconFromXml.setTuxIcon(c419910GdJ);
        }
        C1308910kAL.LIZJ(R.attr.a03, context);
        this.LLJILJIL = System.currentTimeMillis();
    }

    private final void setAvatar(String str) {
        int i;
        View avatarContainerFromXml = getAvatarContainerFromXml();
        if (avatarContainerFromXml != null) {
            if (C123100dR.LIZ(str)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, avatarContainerFromXml);
        }
        if (str != null && str.length() != 0) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06ZC(str, this, null), 3);
        }
    }

    @Override // X.InterfaceC1021180cgG
    public final void LIZ(HintsConfig hintsConfig) {
        String str;
        List<String> shortHints;
        String str2;
        List<String> shortHints2;
        TuxTextView startTvFromXml = getStartTvFromXml();
        String title = null;
        if (startTvFromXml != null) {
            if (hintsConfig != null && (shortHints2 = hintsConfig.getShortHints()) != null) {
                str2 = (String) ListProtector.get(shortHints2, 0);
            } else {
                str2 = null;
            }
            startTvFromXml.setText(str2);
        }
        TuxTextView endTvFromXml = getEndTvFromXml();
        if (endTvFromXml != null) {
            if (hintsConfig != null && (shortHints = hintsConfig.getShortHints()) != null) {
                str = (String) ListProtector.get(shortHints, 1);
            } else {
                str = null;
            }
            endTvFromXml.setText(str);
        }
        TuxTextView titleTvFromXml = getTitleTvFromXml();
        if (titleTvFromXml != null) {
            if (hintsConfig != null) {
                title = hintsConfig.getTitle();
            }
            titleTvFromXml.setText(title);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1021310cgT c1021350cgX;
        CharSequence text;
        CharSequence text2;
        if (C0OBG.LIZIZ(this)) {
            return;
        }
        Map<String, String> basicClickParams = getBasicClickParams();
        String string = null;
        if (Intrinsics.LJFF(view, getStartLayoutFromXml())) {
            TuxTextView startTvFromXml = getStartTvFromXml();
            if (startTvFromXml != null && (text2 = startTvFromXml.getText()) != null) {
                string = text2.toString();
            }
            basicClickParams.put(AbstractC1021310cgT.LIZLLL, string);
            c1021350cgX = new C1021300cgS(string, basicClickParams);
        } else if (Intrinsics.LJFF(view, getEndLayoutFromXml())) {
            TuxTextView endTvFromXml = getEndTvFromXml();
            if (endTvFromXml != null && (text = endTvFromXml.getText()) != null) {
                string = text.toString();
            }
            basicClickParams.put(AbstractC1021310cgT.LIZLLL, string);
            c1021350cgX = new C1021300cgS(string, basicClickParams);
        } else if (Intrinsics.LJFF(view, getAvatarIvFromXml())) {
            c1021350cgX = new C1021350cgX(basicClickParams);
        } else if (Intrinsics.LJFF(view, getTitleTvFromXml())) {
            c1021350cgX = new AbstractC1021310cgT(basicClickParams) { // from class: X.0cgW
            };
        } else if (Intrinsics.LJFF(view, getSponsorLayoutFromXml())) {
            c1021350cgX = new AbstractC1021310cgT(basicClickParams) { // from class: X.0cga
            };
        } else if (!Intrinsics.LJFF(view, getCardBodyFromXml())) {
            return;
        } else {
            c1021350cgX = new AbstractC1021310cgT(basicClickParams) { // from class: X.0cgY
            };
        }
        InterfaceC1021210cgJ<? extends InterfaceC1021290cgR> interfaceC1021210cgJ = this.LLJILJILJ;
        if (interfaceC1021210cgJ != null) {
            interfaceC1021210cgJ.RO1(c1021350cgX);
        }
    }

    public final void setCloseIconFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setSponsorTvFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    @Override // X.InterfaceC1021180cgG
    public final void LIZIZ(C1014660cVk c1014660cVk, Function1 function1) {
        this.LLJILJIL = System.currentTimeMillis();
        c1014660cVk.logAd(C1021270cgP.LIZ, new AwS382S0200000_16(this, (ViewOnClickListenerC1021220cgK) function1, (Function1<? super C1023640ckE, Unit>) 127));
    }

    public final void LIZJ(AnoleAiAgentData anoleAiAgentData, InterfaceC1021210cgJ<? extends InterfaceC1021290cgR> interfaceC1021210cgJ) {
        String str;
        List<String> list;
        String str2;
        List<String> list2;
        String str3;
        this.LLJILJILJ = interfaceC1021210cgJ;
        TuxTextView titleTvFromXml = getTitleTvFromXml();
        String str4 = null;
        if (titleTvFromXml != null) {
            if (anoleAiAgentData != null) {
                str3 = anoleAiAgentData.title;
            } else {
                str3 = null;
            }
            titleTvFromXml.setText(str3);
        }
        if (anoleAiAgentData != null) {
            str = anoleAiAgentData.icon;
        } else {
            str = null;
        }
        setAvatar(str);
        TuxTextView startTvFromXml = getStartTvFromXml();
        if (startTvFromXml != null) {
            if (anoleAiAgentData != null && (list2 = anoleAiAgentData.shortHints) != null) {
                str2 = (String) C13LP.LJJJLZIJ(0, list2);
            } else {
                str2 = null;
            }
            startTvFromXml.setText(str2);
        }
        TuxTextView endTvFromXml = getEndTvFromXml();
        if (endTvFromXml != null) {
            if (anoleAiAgentData != null && (list = anoleAiAgentData.shortHints) != null) {
                str4 = (String) C13LP.LJJJLZIJ(1, list);
            }
            endTvFromXml.setText(str4);
        }
        View startLayoutFromXml = getStartLayoutFromXml();
        if (startLayoutFromXml != null) {
            C786410Ut5.I7(this, startLayoutFromXml);
        }
        C2271391DvN.LIZ(getStartLayoutFromXml(), (C1A5L) C2271381DvM.q.getValue());
        View endLayoutFromXml = getEndLayoutFromXml();
        if (endLayoutFromXml != null) {
            C786410Ut5.I7(this, endLayoutFromXml);
        }
        C2271391DvN.LIZ(getEndLayoutFromXml(), (C1A5L) C2271381DvM.r.getValue());
        C424560Gko avatarIvFromXml = getAvatarIvFromXml();
        if (avatarIvFromXml != null) {
            C786410Ut5.H9(avatarIvFromXml, this);
        }
        C2271391DvN.LIZ(getAvatarIvFromXml(), (C1A5L) C2271381DvM.s.getValue());
        TuxTextView titleTvFromXml2 = getTitleTvFromXml();
        if (titleTvFromXml2 != null) {
            C786410Ut5.h9(titleTvFromXml2, this);
        }
        C2271391DvN.LIZ(getTitleTvFromXml(), (C1A5L) C2271381DvM.t.getValue());
        View sponsorLayoutFromXml = getSponsorLayoutFromXml();
        if (sponsorLayoutFromXml != null) {
            C786410Ut5.I7(this, sponsorLayoutFromXml);
        }
        C2271391DvN.LIZ(getSponsorLayoutFromXml(), (C1A5L) C2271381DvM.u.getValue());
        View cardBodyFromXml = getCardBodyFromXml();
        if (cardBodyFromXml != null) {
            C786410Ut5.I7(this, cardBodyFromXml);
        }
        C2271391DvN.LIZ(getCardBodyFromXml(), (C1A5L) C2271381DvM.v.getValue());
    }
}
