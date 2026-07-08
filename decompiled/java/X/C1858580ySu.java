package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import java.util.List;

/* JADX INFO: renamed from: X.0ySu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858580ySu implements InterfaceC1857890yRn, InterfaceC1587906Jp {
    public final /* synthetic */ TakoCardAbility LL;
    public final /* synthetic */ List<TakoUserItem> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    @Override // X.InterfaceC1857890yRn
    public final String LJ() {
        C326880Cre c326880CreM50;
        Message message;
        String str;
        TakoCardAbility takoCardAbility = this.LL;
        return (takoCardAbility == null || (c326880CreM50 = takoCardAbility.m50()) == null || (message = c326880CreM50.LLILLL) == null || (str = message.msgId) == null) ? "" : str;
    }

    @Override // X.InterfaceC1857890yRn
    public final Integer LJJJ() {
        return Integer.valueOf(this.LLILLL + C1859250yTz.LJI());
    }

    @Override // X.InterfaceC1857890yRn
    public final List<TakoUserItem> LJJJJI() {
        return this.LLILLJJLI;
    }

    public C1858580ySu(TakoCardAbility takoCardAbility, List<TakoUserItem> list, int i) {
        this.LL = takoCardAbility;
        this.LLILLJJLI = list;
        this.LLILLL = i;
    }
}
