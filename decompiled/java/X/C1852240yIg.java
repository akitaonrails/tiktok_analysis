package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0yIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852240yIg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CreativeTemplate LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ TakoPageContext LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function2<CreativeTemplate, Integer, Unit> LLIZ;
    public final /* synthetic */ InterfaceC1631620sYq<CreativeTemplate, Integer, List<BaseImage>, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1852240yIg(CreativeTemplate creativeTemplate, int i, C19EG c19eg, TakoPageContext takoPageContext, String str, String str2, Function2<? super CreativeTemplate, ? super Integer, Unit> function2, InterfaceC1631620sYq<? super CreativeTemplate, ? super Integer, ? super List<BaseImage>, Unit> interfaceC1631620sYq) {
        super(0);
        this.LL = creativeTemplate;
        this.LLILLJJLI = i;
        this.LLILLL = c19eg;
        this.LLILZ = takoPageContext;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = function2;
        this.LLIZLLLIL = interfaceC1631620sYq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1852270yIj c1852270yIj = C1852270yIj.LIZ;
        CreativeTemplate creativeTemplate = this.LL;
        int i = this.LLILLJJLI;
        C19EG c19eg = this.LLILLL;
        TakoPageContext takoPageContext = this.LLILZ;
        String str = this.LLILZIL;
        String str2 = this.LLILZLL;
        Function2<CreativeTemplate, Integer, Unit> function2 = this.LLIZ;
        InterfaceC1631620sYq<CreativeTemplate, Integer, List<BaseImage>, Unit> interfaceC1631620sYq = this.LLIZLLLIL;
        c1852270yIj.getClass();
        C1852270yIj.LJIIIZ(creativeTemplate, i, c19eg, takoPageContext, str, str2, function2, interfaceC1631620sYq, false);
        return Unit.LIZ;
    }
}
