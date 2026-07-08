package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZEL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZEL extends C09AY implements Function1<C0ZES, C0ZES> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ List<C0HIA> LLILLJJLI;
    public final /* synthetic */ Set<String> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZEL(boolean z, List<C0HIA> list, Set<String> set, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = set;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0ZES invoke(C0ZES c0zes) {
        C0ZEM c0zem;
        C0ZES c0zes2 = c0zes;
        if (this.LL) {
            c0zem = C896290ZEd.LIZ;
        } else {
            c0zem = C0ZEO.LIZ;
        }
        List<C0HIA> list = this.LLILLJJLI;
        Set<String> set = this.LLILLL;
        C0ZEP c0zep = c0zes2.LLILZIL;
        boolean z = this.LLILZ;
        c0zep.getClass();
        return C0ZES.LIZ(c0zes2, c0zem, list, set, new C0ZEP(false, z), null, null, null, null, null, LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
