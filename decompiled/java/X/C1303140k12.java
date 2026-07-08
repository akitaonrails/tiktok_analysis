package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0k12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303140k12 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1303170k15 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1303160k14 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303140k12(int i, InterfaceC1303160k14 interfaceC1303160k14, C1303170k15 c1303170k15, String str) {
        super(0);
        this.LL = c1303170k15;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = interfaceC1303160k14;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        if (this.LL.LIZJ.get(this.LLILLJJLI) == null) {
            this.LL.LJIIJJI(this.LLILLL, this.LLILLJJLI);
            this.LLILZ.LIZ(null);
        } else {
            this.LLILZ.LIZ(this.LL.LIZJ.get(this.LLILLJJLI));
        }
        return Unit.LIZ;
    }
}
