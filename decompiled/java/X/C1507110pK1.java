package X;

import com.ss.android.ugc.aweme.ecommerce.chunk.IEcChunkService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pK1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1507110pK1 extends C2217421BqW implements Function2<byte[], String, Unit> {
    public C1507110pK1(IEcChunkService iEcChunkService) {
        super(2, iEcChunkService, IEcChunkService.class, "onChunkRawData", "onChunkRawData([BLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(byte[] bArr, String str) {
        IEcChunkService iEcChunkService = (IEcChunkService) this.receiver;
        iEcChunkService.LIZ(str, bArr);
        return Unit.LIZ;
    }
}
