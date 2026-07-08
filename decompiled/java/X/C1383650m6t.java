package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0m6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383650m6t extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ AtomicBoolean LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ AbstractC1383520m6g LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383650m6t(AtomicBoolean atomicBoolean, Aweme aweme, List<String> list, String str, String str2, String str3, AbstractC1383520m6g abstractC1383520m6g) {
        super(1);
        this.LL = atomicBoolean;
        this.LLILLJJLI = aweme;
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = abstractC1383520m6g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (this.LL.compareAndSet(false, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DuetVideoDownloader - stream fallback to legacy: ");
            sbLIZ.append(str2);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C1383660m6u c1383660m6u = C1383660m6u.LIZ;
            Aweme aweme = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            String str5 = this.LLILZLL;
            AbstractC1383520m6g abstractC1383520m6g = this.LLIZ;
            c1383660m6u.getClass();
            C1383660m6u.LIZJ(aweme, list, str3, str4, str5, abstractC1383520m6g);
        }
        return Unit.LIZ;
    }
}
