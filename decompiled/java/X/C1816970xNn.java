package X;

import com.bytedance.android.livesdk.model.RichTextContent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816970xNn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1816940xNk LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ RichTextContent LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816970xNn(long j, long j2, long j3, C1816940xNk c1816940xNk, RichTextContent richTextContent, List list) {
        super(0);
        this.LL = c1816940xNk;
        this.LLILLJJLI = list;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = richTextContent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1839560xyE.LIZ(this.LL.getContext(), this.LLILLJJLI, new C1145550fur(this.LLILLL, this.LLILZ, this.LLILZIL), new C1145530fup(this.LLILLL, this.LLILZ, this.LLILZIL), new C1816960xNm(this.LLILLL, this.LLILZ, this.LLILZIL, this.LL, this.LLILZLL, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
