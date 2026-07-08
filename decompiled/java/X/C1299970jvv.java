package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0jvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299970jvv extends C09AY implements Function2<byte[], String, Unit> {
    public final /* synthetic */ AbstractC1299910jvp<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299970jvv(AbstractC1299910jvp<String> abstractC1299910jvp) {
        super(2);
        this.LL = abstractC1299910jvp;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(byte[] bArr, String str) {
        byte[] bArr2 = bArr;
        String str2 = str;
        if (bArr2 != null) {
            this.LL.LIZ(C1299210juh.LIZ(new String(bArr2, Charsets.UTF_8)));
        } else if (str2 != null) {
            this.LL.LIZ(new C1299210juh<>(new Throwable(str2)));
        } else {
            this.LL.LIZ(new C1299210juh<>(new Throwable("unexpected code reached")));
        }
        return Unit.LIZ;
    }
}
