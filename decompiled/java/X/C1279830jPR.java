package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jPR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279830jPR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1276910jKj LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279830jPR(int i, long j, C1276910jKj c1276910jKj, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = c1276910jKj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkCoreError linkCoreError = new LinkCoreError(this.LL, Long.valueOf(this.LLILLJJLI), this.LLILLL);
        InterfaceC1279800jPO interfaceC1279800jPO = this.LLILZ.LLJJJ;
        if (interfaceC1279800jPO != null) {
            interfaceC1279800jPO.LLI();
        }
        InterfaceC1279800jPO interfaceC1279800jPO2 = this.LLILZ.LLJJJ;
        if (interfaceC1279800jPO2 != null) {
            interfaceC1279800jPO2.LJLJJL(false, linkCoreError);
        }
        InterfaceC1279800jPO interfaceC1279800jPO3 = this.LLILZ.LLJJJ;
        if (interfaceC1279800jPO3 != null) {
            interfaceC1279800jPO3.LJJLIIIJJIZ("rust_error");
        }
        return Unit.LIZ;
    }
}
