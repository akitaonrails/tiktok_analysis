package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0yIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852250yIh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CreativeTemplate LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ TakoPageContext LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Function2<CreativeTemplate, Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ InterfaceC1631620sYq<CreativeTemplate, Integer, List<BaseImage>, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1852250yIh(CreativeTemplate creativeTemplate, int i, int i2, C19EG c19eg, TakoPageContext takoPageContext, String str, String str2, Function2<? super CreativeTemplate, ? super Integer, Unit> function2, InterfaceC1631620sYq<? super CreativeTemplate, ? super Integer, ? super List<BaseImage>, Unit> interfaceC1631620sYq) {
        super(0);
        this.LL = creativeTemplate;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c19eg;
        this.LLILZIL = takoPageContext;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = function2;
        this.LLJ = interfaceC1631620sYq;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1852270yIj c1852270yIj = C1852270yIj.LIZ;
        CreativeTemplate creativeTemplate = this.LL;
        int i = this.LLILLJJLI + this.LLILLL;
        C19EG c19eg = this.LLILZ;
        TakoPageContext takoPageContext = this.LLILZIL;
        String str = this.LLILZLL;
        String str2 = this.LLIZ;
        Function2<CreativeTemplate, Integer, Unit> function2 = this.LLIZLLLIL;
        InterfaceC1631620sYq<CreativeTemplate, Integer, List<BaseImage>, Unit> interfaceC1631620sYq = this.LLJ;
        c1852270yIj.getClass();
        C1852270yIj.LJIIIZ(creativeTemplate, i, c19eg, takoPageContext, str, str2, function2, interfaceC1631620sYq, true);
        return Unit.LIZ;
    }
}
