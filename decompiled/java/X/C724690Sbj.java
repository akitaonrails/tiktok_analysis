package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724690Sbj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedUIAssem<C03H5> LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724690Sbj(View view, ReusedUIAssem reusedUIAssem) {
        super(0);
        this.LL = reusedUIAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onViewCreated(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
