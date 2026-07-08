package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0v6V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729370v6V extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ RootData LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729370v6V(InterfaceC497601wk interfaceC497601wk, RootData rootData, int i, List<String> list, String str, long j) {
        super(1);
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = rootData;
        this.LLILLL = i;
        this.LLILZ = list;
        this.LLILZIL = str;
        this.LLILZLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C1729400v6Y c1729400v6Y = C1729400v6Y.LIZ;
        InterfaceC497601wk interfaceC497601wk = this.LL;
        String str = this.LLILLJJLI.authorId;
        int i = this.LLILLL;
        List<String> list = this.LLILZ;
        c1729400v6Y.getClass();
        C1729400v6Y.LJIIIIZZ(interfaceC497601wk, str, i, list, false);
        C1729400v6Y.LJIIIZ(this.LLILLJJLI, this.LLILLL, this.LLILZIL, this.LLILZLL, th.getMessage());
        return Unit.LIZ;
    }
}
