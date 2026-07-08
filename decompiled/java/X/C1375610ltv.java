package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ltv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375610ltv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1376170lup LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375610ltv(C1376170lup c1376170lup, String str, String str2, Context context) {
        super(0);
        this.LL = c1376170lup;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1376170lup c1376170lup = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        Context context = this.LLILZ;
        c1376170lup.LLJ.LJII();
        c1376170lup.LLILLJJLI.getAid();
        C1440005kM.LIZ(new IEvent() { // from class: X.0Szm
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        if (c1376170lup.LLJ.LJ()) {
            c1376170lup.LLJ.LJI(c1376170lup.LL, str);
        } else {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            Aweme aweme = c1376170lup.LLILLJJLI;
            SharePackage sharePackage = c1376170lup.LLIZ;
            c1373540lqa.getClass();
            C1373540lqa.LIZLLL(aweme, context, str2, str, sharePackage);
        }
        return Unit.LIZ;
    }
}
