package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jL1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277090jL1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ LinkCoreError LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1277090jL1(C1276910jKj c1276910jKj, LinkCoreError linkCoreError) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = linkCoreError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO = this.LL.LLJJJ;
        if (interfaceC1279800jPO != null) {
            interfaceC1279800jPO.LLIIIILZ(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
