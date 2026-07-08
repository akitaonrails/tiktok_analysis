package X;

import Y.ARunnableS20S1100000_15;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.EnumSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977380bXc implements InterfaceC975560bUg, InterfaceC1087920ePu {
    public EnumC976730bWZ LL;
    public MatchBaseWidget LLILLJJLI;
    public DataChannel LLILLL;
    public boolean LLILZ;
    public InterfaceC1085480eLy LLILZIL;
    public View LLILZLL;
    public boolean LLIZ;
    public C975960bVK LLIZLLLIL;

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "InteractiveLikeComponent";
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJI(EnumC919170a1j enumC919170a1j) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJII(AbstractC1136060ffY abstractC1136060ffY) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIZ(InterfaceC963620bBQ interfaceC963620bBQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJ(BattleInfoResponse battleInfoResponse, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIL(AbstractC970850bN5 abstractC970850bN5, EnumC970440bMQ enumC970440bMQ) {
    }

    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
    }

    @Override // X.InterfaceC975560bUg
    public final void onDestroy() {
        LIZ(true);
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // X.InterfaceC975560bUg
    public final void vc(List<C954460awe> list, List<C954460awe> list2) {
    }

    public C977380bXc() {
        EnumSet.noneOf(EnumC963560bBK.class);
        this.LL = EnumC976730bWZ.P1;
    }

    @Override // X.InterfaceC975560bUg
    public final EnumC976730bWZ getPriority() {
        return this.LL;
    }

    public final void LIZ(boolean z) {
        InterfaceC1085480eLy interfaceC1085480eLy;
        C15DF c15df;
        View view;
        if (!this.LLILZ && (interfaceC1085480eLy = this.LLILZIL) != null) {
            if (z) {
                interfaceC1085480eLy.LJIL(this);
            }
            interfaceC1085480eLy.LIZJ();
            MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
            TextView scoreTextView = null;
            if (matchBaseWidget != null && (view = matchBaseWidget.contentView) != null) {
                c15df = (C15DF) view.findViewById(R.id.klc);
                if (c15df != null) {
                    scoreTextView = c15df.getScoreTextView();
                }
            } else {
                c15df = null;
            }
            if (Intrinsics.LJFF(interfaceC1085480eLy.LJJIFFI(), scoreTextView) || Intrinsics.LJFF(interfaceC1085480eLy.LJJIFFI(), c15df)) {
                interfaceC1085480eLy.LIZ(this.LLILZLL);
            }
        }
    }

    @Override // X.InterfaceC975560bUg
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        boolean zLJIIZILJ;
        this.LLILLJJLI = matchBaseWidget;
        DataChannel dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        this.LLILLL = dataChannelProvideDataChannel;
        if (dataChannelProvideDataChannel != null) {
            zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannelProvideDataChannel);
        } else {
            zLJIIZILJ = false;
        }
        this.LLILZ = zLJIIZILJ;
    }

    @Override // X.InterfaceC975560bUg
    public final void LJFF(InterfaceC963620bBQ interfaceC963620bBQ) {
        LIZ(true);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIIIZZ(InterfaceC963620bBQ interfaceC963620bBQ) {
        LIZ(true);
    }

    @Override // X.InterfaceC975560bUg
    public final void LJIIJJI(InterfaceC963620bBQ interfaceC963620bBQ) {
        C975960bVK c975960bVK;
        boolean z;
        View view;
        TextView scoreTextView;
        CharSequence text;
        String string;
        long id;
        Room roomLJJLIIIIJ;
        C15DF c15df = null;
        if (interfaceC963620bBQ instanceof C975960bVK) {
            c975960bVK = (C975960bVK) interfaceC963620bBQ;
        } else {
            c975960bVK = null;
        }
        this.LLIZLLLIL = c975960bVK;
        if (!this.LLILZ) {
            if (c975960bVK != null) {
                z = c975960bVK.LJJ;
            } else {
                z = false;
            }
            this.LLIZ = z;
            if (this.LLIZ) {
                if (this.LLILZIL == null) {
                    IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
                    DataChannel dataChannel = this.LLILLL;
                    if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
                        id = roomLJJLIIIIJ.getId();
                    } else {
                        id = 0;
                    }
                    this.LLILZIL = iBarrageService.O41(id);
                }
                InterfaceC1085480eLy interfaceC1085480eLy = this.LLILZIL;
                if (interfaceC1085480eLy != null && interfaceC1085480eLy.isEnabled() && interfaceC1085480eLy.LIZIZ()) {
                    interfaceC1085480eLy.LJIIJ(this);
                    interfaceC1085480eLy.LJIIIIZZ();
                    this.LLILZLL = interfaceC1085480eLy.LJJIFFI();
                    MatchBaseWidget matchBaseWidget = this.LLILLJJLI;
                    if (matchBaseWidget != null && (view = matchBaseWidget.contentView) != null && (c15df = (C15DF) view.findViewById(R.id.klc)) != null && (scoreTextView = c15df.getScoreTextView()) != null && (text = scoreTextView.getText()) != null && (string = text.toString()) != null && !a0.LJJJIL(string)) {
                        interfaceC1085480eLy.LIZ(scoreTextView);
                    } else {
                        interfaceC1085480eLy.LIZ(c15df);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1087920ePu
    public final void onResult(String str) {
        C473410IhP.LIZIZ(new ARunnableS20S1100000_15(this, str, 4));
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
        this.LLIZ = false;
        LIZ(false);
    }
}
