package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856080yOs extends C09AY implements Function1<List<? extends C1853170yKB>, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ AnonymousClass0957<String> LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<String> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C1856090yOt LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C1318505Dz LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856080yOs(C19EG c19eg, C099G c099g, C099G c099g2, Function0 function0, C1856090yOt c1856090yOt, Context context, long j, C1318505Dz c1318505Dz) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = c099g;
        this.LLILLL = c099g2;
        this.LLILZ = function0;
        this.LLILZIL = c1856090yOt;
        this.LLILZLL = context;
        this.LLIZ = j;
        this.LLIZLLLIL = c1318505Dz;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends C1853170yKB> list) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C1856070yOr(list, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, "click_visual_search_button", this.LLILZLL, this.LLIZ, this.LLIZLLLIL, "visual_search_button", null), 3);
        return Unit.LIZ;
    }
}
