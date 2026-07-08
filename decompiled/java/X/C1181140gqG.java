package X;

import com.ss.android.ugc.aweme.slash.data.SlashParam;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181140gqG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SlashFragment<CONTEXT> LL;
    public final /* synthetic */ Function0<InterfaceC1181300gqW> LLILLJJLI;
    public final /* synthetic */ SlashRequestParam LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<SlashParam> LLILZIL;
    public final /* synthetic */ InterfaceC1181150gqH LLILZLL;
    public final /* synthetic */ C1181120gqE LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1181140gqG(SlashFragment<CONTEXT> slashFragment, Function0<? extends InterfaceC1181300gqW> function0, SlashRequestParam slashRequestParam, String str, List<SlashParam> list, InterfaceC1181150gqH interfaceC1181150gqH, C1181120gqE c1181120gqE) {
        super(0);
        this.LL = slashFragment;
        this.LLILLJJLI = function0;
        this.LLILLL = slashRequestParam;
        this.LLILZ = str;
        this.LLILZIL = list;
        this.LLILZLL = interfaceC1181150gqH;
        this.LLIZ = c1181120gqE;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.wD1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        return Unit.LIZ;
    }
}
