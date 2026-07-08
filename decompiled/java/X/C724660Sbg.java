package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724660Sbg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedUIAssem<RECEIVER> LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724660Sbg(View view, ReusedUIAssem reusedUIAssem) {
        super(0);
        this.LL = reusedUIAssem;
        this.LLILLJJLI = view;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ReusedUIAssem<RECEIVER> reusedUIAssem = this.LL;
        reusedUIAssem.track$assem_release(EnumC738160SxS.ON_VIEW_CREATED, new C724690Sbj(this.LLILLJJLI, reusedUIAssem));
        return Unit.LIZ;
    }
}
