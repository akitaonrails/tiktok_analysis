package X;

import com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0pKM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.network.ProtobufUtilKt$transcodeProtobufBlockingSafely$result$1", f = "ProtobufUtil.kt", l = {101}, m = "invokeSuspend")
public final class C1507320pKM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super byte[]>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ byte[] LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507320pKM(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, byte[] bArr) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = bArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1507320pKM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IEcomProtobufService iEcomProtobufService;
        C1C7U.LIZ("ProtobufUtilKt@aa56.transcodeProtobufBlockingSafely$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            if (str != null && a0.LJJIIZI(str, "application/x-protobuf", false) && (iEcomProtobufService = C1507370pKR.LIZ) != null) {
                String str2 = this.LLILLL;
                C1507330pKN c1507330pKN = C1507330pKN.LIZ;
                byte[] bArr = this.LLILZ;
                this.LL = 1;
                obj = iEcomProtobufService.LIZ(str2, c1507330pKN, bArr, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ProtobufUtilKt@aa56.transcodeProtobufBlockingSafely$result$1");
                    return objLJFF;
                }
            }
            obj = this.LLILZ;
            C1C7U.LIZIZ("ProtobufUtilKt@aa56.transcodeProtobufBlockingSafely$result$1");
            return obj;
        }
        if (obj == null) {
            obj = this.LLILZ;
        }
        C1C7U.LIZIZ("ProtobufUtilKt@aa56.transcodeProtobufBlockingSafely$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super byte[]> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
