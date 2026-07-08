package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331540CzA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331540CzA(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C15433062l.LJ("/api/ad/v1/landingpage/comments", C2097608Jq.LJIIIIZZ(new Pair("channel_name", this.LL), new Pair("cursor", this.LLILLJJLI)));
        return Unit.LIZ;
    }
}
