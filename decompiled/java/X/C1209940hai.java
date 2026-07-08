package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209940hai extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1209950haj LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1209940hai(C1209950haj c1209950haj, Activity activity, Aweme aweme, long j, long j2) {
        super(0);
        this.LL = c1209950haj;
        this.LLILLJJLI = activity;
        this.LLILLL = aweme;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1209950haj c1209950haj = this.LL;
        Activity activity = this.LLILLJJLI;
        Aweme aweme = this.LLILLL;
        c1209950haj.getClass();
        if (C1209950haj.LIZIZ(aweme, activity)) {
            this.LL.LIZ.Ve(this.LLILZ, this.LLILZIL);
        }
        return Unit.LIZ;
    }
}
