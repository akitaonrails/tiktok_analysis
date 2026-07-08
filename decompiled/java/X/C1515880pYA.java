package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.ecommerce.proto.ChunkComposePJResponseBodyConverter;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515880pYA extends C09AY implements Function1<byte[], ComposePbAndJson> {
    public final /* synthetic */ ChunkComposePJResponseBodyConverter LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515880pYA(ChunkComposePJResponseBodyConverter chunkComposePJResponseBodyConverter, String str, long j) {
        super(1);
        this.LL = chunkComposePJResponseBodyConverter;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ComposePbAndJson invoke(byte[] bArr) throws IOException {
        final byte[] bArr2 = bArr;
        if (bArr2 != null) {
            ChunkComposePJResponseBodyConverter chunkComposePJResponseBodyConverter = this.LL;
            final String str = this.LLILLJJLI;
            final long j = this.LLILLL;
            ComposePbAndJson composePbAndJsonLIZ = chunkComposePJResponseBodyConverter.LJ.LIZ(new TypedInput() { // from class: X.0pYB
                @Override // com.bytedance.retrofit2.mime.TypedInput
                public final InputStream in() {
                    return new ByteArrayInputStream(bArr2);
                }

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public final long length() {
                    return j;
                }

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public final String mimeType() {
                    return str;
                }
            });
            IEcRaxService iEcRaxService = chunkComposePJResponseBodyConverter.LJFF;
            if (iEcRaxService != null) {
                iEcRaxService.isOpen();
            }
            return composePbAndJsonLIZ;
        }
        return null;
    }
}
