package X;

import com.ss.android.ugc.aweme.localservice.passthrough.rules.EventParamsConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18bB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21314718bB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ EventParamsConfig LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21314718bB(EventParamsConfig eventParamsConfig, String str, String str2) {
        super(0);
        this.LL = eventParamsConfig;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C21314118b5 c21314118b5 = C21314118b5.LIZ;
        EventParamsConfig eventParamsConfig = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        c21314118b5.getClass();
        C21314118b5.LIZIZ(this.LLILLJJLI, C21314118b5.LIZLLL(eventParamsConfig, str, str2, true));
        return Unit.LIZ;
    }
}
