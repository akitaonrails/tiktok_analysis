package X;

import com.bytedance.im.core.proto.MessageBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Y8S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8S extends C09AY implements Function1<C0Y7K, Unit> {
    public final /* synthetic */ C0Y8R LL;
    public final /* synthetic */ MessageBody LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y8S(C0Y8R c0y8r, MessageBody messageBody, long j) {
        super(1);
        this.LL = c0y8r;
        this.LLILLJJLI = messageBody;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0Y7K c0y7k) {
        C0Y7A c0y7a = new C0Y7A(this.LL.LIZ);
        MessageBody messageBody = this.LLILLJJLI;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        C0Y8R c0y8r = this.LL;
        int i = c0y8r.LIZIZ;
        String str = c0y8r.LIZJ;
        int iIntValue = this.LLILLJJLI.message_type.intValue();
        C0Y8R c0y8r2 = this.LL;
        c0y7a.LIZ(c0y7k, new C0Y7D(str, jCurrentTimeMillis, this.LL.LJFF, i, iIntValue, c0y8r2.LIZLLL, c0y8r2.LJ.getValue()), messageBody);
        return Unit.LIZ;
    }
}
