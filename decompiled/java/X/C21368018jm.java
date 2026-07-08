package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21368018jm extends FrameLayout {
    public static final /* synthetic */ int LLJILJIL = 0;
    public boolean LL;
    public Function0<Unit> LLILLJJLI;
    public Function1<? super C900210ZTf, Unit> LLILLL;
    public EnumC19382210sG LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    private final CardView getCardView() {
        return (CardView) this.LLIZ.getValue();
    }

    private final SmartImageView getEffectCover() {
        return (SmartImageView) this.LLILZIL.getValue();
    }

    private final C21415018rM getGameStatus() {
        return (C21415018rM) this.LLJ.getValue();
    }

    private final C19406710wD getLeaderBoardView() {
        return (C19406710wD) this.LLJIJIL.getValue();
    }

    private final C197039127h getPlayButton() {
        return (C197039127h) this.LLILZLL.getValue();
    }

    private final TuxIconView getResultEntranceButton() {
        return (TuxIconView) this.LLJI.getValue();
    }

    private final C21415018rM getTitle() {
        return (C21415018rM) this.LLIZLLLIL.getValue();
    }

    public final Function0<Unit> getClickCameraBtnCallback() {
        return this.LLILLJJLI;
    }

    public final Function1<C900210ZTf, Unit> getClickResultPageBtnCallback() {
        return this.LLILLL;
    }

    public final EnumC19382210sG getMode() {
        return this.LLILZ;
    }

    public C21368018jm(Context context) {
        super(context, null, 0);
        this.LLILZ = EnumC19382210sG.PLAY;
        this.LLILZIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 801));
        this.LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 804));
        this.LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 800));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 806));
        this.LLJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 802));
        this.LLJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 805));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 803));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cf_, this, true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        if (numLIZJ != null) {
            getCardView().setCardBackgroundColor(numLIZJ.intValue());
        }
        getCardView().setRadius(C0I73.LIZ);
        C197039127h playButton = getPlayButton();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a00);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        playButton.setBackground(c384050F3z.LIZ(context));
        getPlayButton().setTextColorRes(R.attr.a0o);
        getPlayButton().setText(context.getString(2131831831));
        TuxIconView resultEntranceButton = getResultEntranceButton();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zm);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        resultEntranceButton.setBackground(c384050F3z2.LIZ(context));
    }

    public final void setClickCameraBtnCallback(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setClickResultPageBtnCallback(Function1<? super C900210ZTf, Unit> function1) {
        this.LLILLL = function1;
    }

    public final void setGroupChat(boolean z) {
        this.LL = z;
    }

    public final void setMode(EnumC19382210sG enumC19382210sG) {
        this.LLILZ = enumC19382210sG;
        int i = C19382310sH.LIZ[enumC19382210sG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1584506Ih.LIZIZ(getResultEntranceButton());
                    C786410Ut5.w5(getPlayButton(), 1.0f);
                    getPlayButton().setLoading(false);
                    getPlayButton().setText(getContext().getString(2131831831));
                    return;
                }
                throw new C1954807lC();
            }
            C1584506Ih.LIZ(getResultEntranceButton());
            C786410Ut5.w5(getPlayButton(), 1.0f);
            getPlayButton().setLoading(false);
            getPlayButton().setText(getContext().getString(2131831801));
            return;
        }
        C1584506Ih.LIZ(getResultEntranceButton());
        C786410Ut5.w5(getPlayButton(), 0.5f);
        getPlayButton().setText("");
        getPlayButton().setLoading(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x039d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate r38, final com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21368018jm.LIZ(com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate, com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, boolean):void");
    }
}
