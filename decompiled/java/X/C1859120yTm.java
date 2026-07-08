package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;

/* JADX INFO: renamed from: X.0yTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859120yTm implements InterfaceC19408510wV, InterfaceC1587906Jp {
    public final /* synthetic */ TakoSug LL;
    public final /* synthetic */ TakoCardAbility LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    @Override // X.InterfaceC19408510wV
    public final C326960Crm LJIL() {
        TakoSug takoSug = this.LL;
        if (takoSug == null) {
            takoSug = new TakoSug(false, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, 0L, null, null, 0L, null, false, false, null, null, 0, 0L, false, null, false, false, false, false, false, null, null, -1, 31, null);
        }
        TakoCardAbility takoCardAbility = this.LLILLJJLI;
        return new C326960Crm(null, takoSug, takoCardAbility != null ? takoCardAbility.Yy1() : null, 1);
    }

    @Override // X.InterfaceC19408510wV
    public final Integer LIZ() {
        return Integer.valueOf(C1859250yTz.LJI());
    }

    @Override // X.InterfaceC19408510wV
    public final Integer LIZIZ() {
        return Integer.valueOf(C1859250yTz.LJI());
    }

    @Override // X.InterfaceC19408510wV
    public final String getSourceId() {
        return this.LLILLL;
    }

    public C1859120yTm(TakoSug takoSug, TakoCardAbility takoCardAbility, String str) {
        this.LL = takoSug;
        this.LLILLJJLI = takoCardAbility;
        this.LLILLL = str;
    }
}
