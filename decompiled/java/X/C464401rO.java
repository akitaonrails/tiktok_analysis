package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01rO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C464401rO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ AIBotInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C464401rO(Map<String, String> map, View view, AIBotInfo aIBotInfo) {
        super(0);
        this.LL = map;
        this.LLILLJJLI = view;
        this.LLILLL = aIBotInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        C1862330yYx.LJJJJI(C1862330yYx.LIZ, this.LL);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
        c1389890mGx.LJIIJ(C786410Ut5.j4(this.LLILLJJLI.getContext().getString(2131828539), Arrays.copyOf(new Object[]{C0DQF.LIZIZ(this.LLILLL)}, 1)));
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }
}
