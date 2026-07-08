package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20603015jg extends C09AY implements Function0<C1558530qex> {
    public final /* synthetic */ PowerAdapter LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20603015jg(PowerAdapter powerAdapter) {
        super(0);
        this.LL = powerAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1558530qex invoke() {
        return new C1558530qex(new C20603115jh(this.LL));
    }
}
