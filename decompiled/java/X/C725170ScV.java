package X;

import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ScV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725170ScV extends C09AY implements Function0<C0SZT<PowerCell<?>, InterfaceC1891350zJl>> {
    public final /* synthetic */ PowerAdapter LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725170ScV(PowerAdapter powerAdapter) {
        super(0);
        this.LL = powerAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0SZT<PowerCell<?>, InterfaceC1891350zJl> invoke() {
        return new C0SZT<>(this.LL);
    }
}
