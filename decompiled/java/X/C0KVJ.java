package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS105S0400000_7;

/* JADX INFO: renamed from: X.0KVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KVJ extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ CharSequence LL;
    public final /* synthetic */ CharSequence LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ CharSequence LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KVJ(CharSequence charSequence, CharSequence charSequence2, Map<String, ? extends Object> map, Function0<Unit> function0, CharSequence charSequence3, Integer num, Function0<Unit> function02) {
        super(1);
        this.LL = charSequence;
        this.LLILLJJLI = charSequence2;
        this.LLILLL = map;
        this.LLILZ = function0;
        this.LLILZIL = charSequence3;
        this.LLILZLL = num;
        this.LLIZ = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF = true;
        c1397620mTQ2.LIZJ(0, this.LL, new AwS105S0400000_7((Map) this.LLILLL, (Map<String, ? extends Object>) this.LLILZ, (Function0<Unit>) this.LLILZIL, (CharSequence) this.LLILZLL, (Integer) 3));
        CharSequence charSequence = this.LLILLJJLI;
        if (charSequence != null && charSequence.length() != 0) {
            c1397620mTQ2.LIZJ(1, this.LLILLJJLI, new AwS105S0400000_7((Map) this.LLILLL, (Map<String, ? extends Object>) this.LLIZ, (Function0<Unit>) this.LLILZIL, (CharSequence) this.LLILZLL, (Integer) 4));
        }
        return Unit.LIZ;
    }
}
