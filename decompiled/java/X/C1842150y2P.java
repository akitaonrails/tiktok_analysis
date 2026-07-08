package X;

import Y.AfS10S0200100_27;
import Y.AfS161S0200000_27;
import Y.AfS196S0100000_27;
import Y.AfS4S1200100_27;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCanCreateRepostNoteSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostApi;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostAddNoteInputFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0y2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842150y2P implements InterfaceC1363540laS {
    public static final C1842150y2P LIZ = new C1842150y2P();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(350));

    @Override // X.InterfaceC1363540laS
    public final int LIZIZ() {
        return 2131855721;
    }

    @Override // X.InterfaceC1363540laS
    public final int LIZLLL() {
        return 2131855708;
    }

    @Override // X.InterfaceC1363540laS
    public final int LJFF() {
        return 2131855718;
    }

    @Override // X.InterfaceC1363540laS
    public final void LJ() {
        InterfaceC1106030et7.l7.LJFF(Boolean.TRUE);
    }

    @Override // X.InterfaceC1363540laS
    public final boolean LJIIJ() {
        return InterfaceC1106030et7.l7.LIZIZ().booleanValue();
    }

    @Override // X.InterfaceC1363540laS
    public final int getRepostIconRes() {
        return C1360460lVU.LIZIZ.LJJII().LIZIZ();
    }

    @Override // X.InterfaceC1363540laS
    public final boolean LIZJ() {
        return C1096600edu.LIZ() && LiveCanCreateRepostNoteSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC1363540laS
    public final boolean LJIIIZ() {
        return C1096600edu.LIZ() && C1096600edu.LIZIZ();
    }

    @Override // X.InterfaceC1363540laS
    public final int LJIIIIZZ(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        characterInstance.setText(str);
        characterInstance.first();
        int i = 0;
        for (int next = characterInstance.next(); next != -1; next = characterInstance.next()) {
            i++;
        }
        return i;
    }

    @Override // X.InterfaceC1363540laS
    public final boolean containEmoji(String str) {
        return PatternProtector.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?])").matcher(str).find();
    }

    @Override // X.InterfaceC1363540laS
    public final boolean onlyEmoji(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("^(");
        sbLIZ.append("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?|[\\u200d\\uFE0F?])");
        sbLIZ.append(")+$");
        return PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ)).matcher(str).matches();
    }

    public static void LJIIL(int i, boolean z, boolean z2) {
        Object obj;
        boolean z3;
        Activity topActivity = ActivityStack.getTopActivity();
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Object obj2 = null;
        if (abstractC1387200mCcLJ != null) {
            obj = abstractC1387200mCcLJ.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC1603190roz) {
            obj2 = obj;
        }
        boolean zLIZIZ = false;
        if (obj2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean z4 = !zLIZIZ;
        if (z3) {
            if (z) {
                if (!z2) {
                    if (z4) {
                        C766270U4b.LIZLLL(2131829438);
                        return;
                    } else {
                        C766270U4b.LIZLLL(2131855722);
                        return;
                    }
                }
                return;
            }
            if (z2) {
                if (i > 1 || topActivity == null) {
                    return;
                }
                C1389880mGw c1389880mGw = new C1389880mGw(topActivity);
                c1389880mGw.LJIIIIZZ(2131855720);
                c1389880mGw.LJIIJ();
                return;
            }
            if (z4) {
                C766270U4b.LIZLLL(2131829438);
                return;
            } else {
                C766270U4b.LIZLLL(2131846361);
                return;
            }
        }
        if (z) {
            if (z2) {
                C766270U4b.LIZLLL(2131855723);
                return;
            } else if (z4) {
                C766270U4b.LIZLLL(2131829438);
                return;
            } else {
                C766270U4b.LIZLLL(2131855722);
                return;
            }
        }
        if (z2) {
            C766270U4b.LIZLLL(2131855720);
        } else if (z4) {
            C766270U4b.LIZLLL(2131829438);
        } else {
            C766270U4b.LIZLLL(2131846361);
        }
    }

    @Override // X.InterfaceC1363540laS
    public final void LIZ(long j, InterfaceC1842140y2O interfaceC1842140y2O, Map map) {
        C480460Ism.LIZ().getClass();
        ((LiveRepostApi) C480460Ism.LIZLLL(LiveRepostApi.class)).deleteRepost(j).LJIILIIL(new C0UO0()).LJJLL(new AfS10S0200100_27(j, interfaceC1842140y2O, map, 1), new AfS196S0100000_27(interfaceC1842140y2O, 47));
        C20684815ws.LJIILLIIL("livesdk_repost_cancel", map);
        InterfaceC1106030et7.k7.LJFF(Boolean.TRUE);
    }

    @Override // X.InterfaceC1363540laS
    public final void LJIIJJI(long j, InterfaceC1842140y2O interfaceC1842140y2O, Map map) {
        C480460Ism.LIZ().getClass();
        ((LiveRepostApi) C480460Ism.LIZLLL(LiveRepostApi.class)).createRepost(j).LJIILIIL(new C0UO0()).LJJLL(new AfS10S0200100_27(j, interfaceC1842140y2O, map, 0), new AfS161S0200000_27(map, interfaceC1842140y2O, 14));
        InterfaceC1106030et7.k7.LJFF(Boolean.TRUE);
    }

    @Override // X.InterfaceC1363540laS
    public final void LJII(long j, InterfaceC1842140y2O interfaceC1842140y2O, String str, Map map) {
        C480460Ism.LIZ().getClass();
        ((LiveRepostApi) C480460Ism.LIZLLL(LiveRepostApi.class)).createRepostNote(j, str).LJIILIIL(new C0UO0()).LJJLL(new AfS4S1200100_27(j, interfaceC1842140y2O, str, map, 0), new AfS196S0100000_27(interfaceC1842140y2O, 46));
    }

    @Override // X.InterfaceC1363540laS
    public final void LJI(FragmentManager fragmentManager, long j, Map<String, String> map, InterfaceC1842140y2O interfaceC1842140y2O, Function0<Unit> function0) {
        RepostAddNoteInputFragment repostAddNoteInputFragment = new RepostAddNoteInputFragment();
        repostAddNoteInputFragment.LLJI = j;
        repostAddNoteInputFragment.LLJIJIL = map;
        repostAddNoteInputFragment.LLJILLL = interfaceC1842140y2O;
        repostAddNoteInputFragment.LLJJ = function0;
        repostAddNoteInputFragment.show(fragmentManager, "LIVE_REPOST_INPUT");
    }
}
