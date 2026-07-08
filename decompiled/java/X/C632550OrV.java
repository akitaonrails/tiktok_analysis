package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632550OrV extends C09AY implements Function1<AbstractC1686410tzD, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C632550OrV(String str, int i, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1686410tzD abstractC1686410tzD) {
        C20684815ws.LJIILLIIL("similar_song_show", C2097608Jq.LJIIIIZZ(new Pair("music_id", this.LL), new Pair("song_number", String.valueOf(this.LLILLJJLI)), new Pair("to_user_id", this.LLILLL)));
        return Unit.LIZ;
    }
}
