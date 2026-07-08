package X;

import com.lynx.tasm.TemplateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539890qAt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1539580qAO LL;
    public final /* synthetic */ byte[] LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ TemplateData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539890qAt(C1539580qAO c1539580qAO, byte[] bArr, String str, TemplateData templateData) {
        super(0);
        this.LL = c1539580qAO;
        this.LLILLJJLI = bArr;
        this.LLILLL = str;
        this.LLILZ = templateData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZJ(this.LLILLJJLI, this.LLILZ, this.LLILLL);
        return Unit.LIZ;
    }
}
