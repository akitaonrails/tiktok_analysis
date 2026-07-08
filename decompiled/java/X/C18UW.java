package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18UW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18UW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C18UJ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AIChatGenNode LLILLL;
    public final /* synthetic */ Function0<Boolean> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18UW(C18UJ c18uj, String str, AIChatGenNode aIChatGenNode, Function0<Boolean> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(0);
        this.LL = c18uj;
        this.LLILLJJLI = str;
        this.LLILLL = aIChatGenNode;
        this.LLILZ = function0;
        this.LLILZIL = function02;
        this.LLILZLL = function03;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C21163117rp.LIZIZ = this.LL;
        C21163117rp.LIZIZ().LJIILIIL(this.LLILLJJLI);
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = this.LL;
        AIChatGenNode aIChatGenNode = this.LLILLL;
        c18up.getClass();
        C18UP.LJIILIIL(aIChatGenNode, c18uj, "leave");
        Function0<Boolean> function0 = this.LLILZ;
        if (function0 != null) {
            Function0<Unit> function02 = this.LLILZLL;
            if (function0.invoke().booleanValue()) {
                function02.invoke();
            }
        } else {
            this.LLILZLL.invoke();
        }
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }
}
