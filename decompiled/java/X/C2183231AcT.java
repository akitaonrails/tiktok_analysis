package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183231AcT extends C09AY implements Function1<TypedInput, Unit> {
    public final /* synthetic */ C2183221AcS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183231AcT(C2183221AcS c2183221AcS) {
        super(1);
        this.LL = c2183221AcS;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TypedInput typedInput) {
        this.LL.LJFF = ((TypedByteArray) typedInput).getBytes();
        return Unit.LIZ;
    }
}
