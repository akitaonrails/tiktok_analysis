package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759610vtH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1759470vt3 LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ EnumC1759580vtE LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759610vtH(C1759470vt3 c1759470vt3, View view, EnumC1759580vtE enumC1759580vtE, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.LL = c1759470vt3;
        this.LLILLJJLI = view;
        this.LLILLL = enumC1759580vtE;
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZ((ViewGroup) this.LLILLJJLI, this.LLILLL);
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = this.LLILZIL;
        if (function02 != null) {
            function02.invoke();
        }
        return Unit.LIZ;
    }
}
