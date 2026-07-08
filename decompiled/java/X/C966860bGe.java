package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966860bGe extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966860bGe(int i, long j, C1276910jKj c1276910jKj, String str) {
        super(0);
        this.LL = c1276910jKj;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1279800jPO interfaceC1279800jPO = this.LL.LLJJJ;
        if (interfaceC1279800jPO != null) {
            interfaceC1279800jPO.LLIIIILZ(new LinkCoreError(this.LLILLJJLI, Long.valueOf(this.LLILLL), this.LLILZ));
        }
        InterfaceC1279800jPO interfaceC1279800jPO2 = this.LL.LLJJJ;
        if (interfaceC1279800jPO2 != null) {
            interfaceC1279800jPO2.LJJLIL();
        }
        return Unit.LIZ;
    }
}
