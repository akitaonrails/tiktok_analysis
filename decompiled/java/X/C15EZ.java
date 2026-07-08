package X;

import Y.ALAdapterS25S0100000_31;
import android.animation.AnimatorSet;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS180S1100000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.15EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem$showHighScoreEarlyEndNotice$1", f = "MatchCountDownAssem.kt", l = {1171}, m = "invokeSuspend")
public final class C15EZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C978450bZL LLILLJJLI;
    public final /* synthetic */ MatchCountDownAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15EZ(C978450bZL c978450bZL, MatchCountDownAssem matchCountDownAssem, InterfaceC1364105Vn<? super C15EZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c978450bZL;
        this.LLILLL = matchCountDownAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15EZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GiftModeMetaV2 giftModeMetaV2LJJII;
        String str;
        TextPiece textPiece;
        C1C7U.LIZ("MatchCountDownAssem@1efb.showHighScoreEarlyEndNotice$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1144400ft0 c1144400ft0 = C1144400ft0.LIZ;
            String str2 = this.LLILLJJLI.LIZ.key;
            this.LL = 1;
            obj = c1144400ft0.LIZ(str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MatchCountDownAssem@1efb.showHighScoreEarlyEndNotice$1");
                return objLJFF;
            }
        }
        String strLJIJI = (String) obj;
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        Boolean boolValueOf = null;
        if (interfaceC975810bV5LIZLLL != null) {
            giftModeMetaV2LJJII = interfaceC975810bV5LIZLLL.LJJII();
        } else {
            giftModeMetaV2LJJII = null;
        }
        if (C156900it.LJIIIZ(giftModeMetaV2LJJII)) {
            strLJIJI = C497740JfY.LJIJI(2131853767);
        }
        List<TextPiece> list = this.LLILLJJLI.LIZ.pieces;
        if (list == null || (textPiece = (TextPiece) C13LP.LJJJLZIJ(0, list)) == null || (str = textPiece.stringValue) == null) {
            str = "";
        }
        String strLJJIFFI = u.LJJIFFI(strLJIJI, "{s_numOfMillions}", str, false);
        if (strLJJIFFI.length() == 0) {
            C20441214yg.LIZIZ("MatchCountDownAssem", "Match high score notice message return empty string");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MatchCountDownAssem@1efb.showHighScoreEarlyEndNotice$1");
            return unit;
        }
        AwS180S1100000_31 awS180S1100000_31 = new AwS180S1100000_31(this.LLILLL, strLJJIFFI, 5);
        MatchCountDownAssem matchCountDownAssem = this.LLILLL;
        if (!matchCountDownAssem.LLL) {
            matchCountDownAssem.LLJJJJJIL = awS180S1100000_31;
        } else {
            C204741159n c204741159n = matchCountDownAssem.LLLIIIL;
            if (c204741159n != null && c204741159n.LJIIJJI) {
                AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(awS180S1100000_31, 1356);
                AnimatorSet animatorSet = c204741159n.LJIIJ;
                if (animatorSet != null) {
                    boolValueOf = Boolean.valueOf(animatorSet.isRunning());
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    AnimatorSet animatorSet2 = c204741159n.LJIIJ;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new ALAdapterS25S0100000_31(awS575S0100000_31, 38));
                    }
                } else {
                    awS575S0100000_31.invoke();
                }
            } else {
                awS180S1100000_31.invoke();
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MatchCountDownAssem@1efb.showHighScoreEarlyEndNotice$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
