package X;

import Y.ARunnableS21S0400000_12;
import android.content.Context;
import android.text.SpannedString;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.LiveAiSummaryTypewriterAnimConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.AlphaSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TL0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TL0 extends LinearLayout {
    public final int LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final float LLILZ;
    public final float LLILZIL;

    public final List<Pair<TuxTextView, C745190TKz>> getAiSummaryContentViewList() {
        return (List) this.LLILLJJLI.getValue();
    }

    public final List<String> getShowTextList() {
        return (List) this.LLILLL.getValue();
    }

    public final void LIZ() {
        Iterator<Pair<TuxTextView, C745190TKz>> it2 = getAiSummaryContentViewList().iterator();
        while (it2.hasNext()) {
            C745190TKz second = it2.next().getSecond();
            C473410IhP.LJ(second.LIZ);
            second.LIZ = null;
        }
    }

    public final void LIZIZ() {
        for (Pair<TuxTextView, C745190TKz> pair : getAiSummaryContentViewList()) {
            C745190TKz second = pair.getSecond();
            C473410IhP.LJ(second.LIZ);
            second.LIZ = null;
            Iterator it2 = ((ArrayList) pair.getSecond().LIZJ).iterator();
            while (it2.hasNext()) {
                ((AlphaSpan) it2.next()).alpha = ((LiveAiSummaryTypewriterAnimConfig) C745070TKn.LIZIZ.getValue()).hasTypewriterAnim ? 0 : 225;
            }
            C786410Ut5.B5(pair.getFirst(), C745070TKn.LIZ());
        }
    }

    public C0TL0(int i, Context context) {
        super(context, null, 0);
        this.LL = i;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(280));
        this.LLILLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(931));
        this.LLILZ = C339190DRl.LIZ(15);
        this.LLILZIL = C339190DRl.LIZ(13);
        setOrientation(1);
        setGravity(1);
    }

    public final void LIZJ(Pair<? extends TuxTextView, C745190TKz> pair, final int i, final boolean z, final C354710DvR c354710DvR, final C0TL3 c0tl3) {
        CharSequence text;
        C745190TKz second = pair.getSecond();
        TuxTextView first = pair.getFirst();
        C0TL3 c0tl32 = new C0TL3() { // from class: X.0TL2
            @Override // X.C0TL3
            public final void LIZ() {
                int i2 = i + 1;
                if (this.getAiSummaryContentViewList().size() > i2 && this.getShowTextList().size() > i2) {
                    this.LIZJ((Pair) ListProtector.get(this.getAiSummaryContentViewList(), i + 1), i2, z, c354710DvR, c0tl3);
                } else {
                    C0TL3 c0tl33 = c0tl3;
                    if (c0tl33 != null) {
                        c0tl33.LIZ();
                    }
                }
            }
        };
        second.getClass();
        if (first != null && (text = first.getText()) != null && text.length() != 0) {
            if (!(first.getText() instanceof SpannedString)) {
                C786410Ut5.S4(1.0f, first);
                c0tl32.LIZ();
                return;
            }
            try {
                second.LIZIZ = 0;
                C473410IhP.LJ(second.LIZ);
                second.LIZ = null;
                C786410Ut5.S4(1.0f, first);
                ARunnableS21S0400000_12 aRunnableS21S0400000_12 = new ARunnableS21S0400000_12(second, first, c0tl32, c354710DvR, 2);
                second.LIZ = aRunnableS21S0400000_12;
                aRunnableS21S0400000_12.run();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c0tl32.LIZ();
                e.getStackTrace().toString();
            }
        }
    }
}
