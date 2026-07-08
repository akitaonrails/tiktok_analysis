package X;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0X5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843080X5m extends C09AY implements Function2<byte[], String, Unit> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843080X5m(long j) {
        super(2);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(byte[] bArr, String str) {
        String str2;
        byte[] bArr2 = bArr;
        String str3 = str;
        if (bArr2 != null) {
            long j = this.LL;
            if (str3 != null && str3.length() != 0) {
                str2 = new String(bArr2, Charset.forName(str3));
            } else {
                str2 = new String(bArr2, Charsets.UTF_8);
            }
            if (!a0.LJJJIL(str2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HybridWebTTPInitTask upgradeAjaxHookScript. ");
                sbLIZ.append(System.currentTimeMillis() - j);
                sbLIZ.append(" ms");
                C843070X5l.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ), null, null);
                if (str2.length() != 0) {
                    C843010X5f.LIZIZ = str2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("upgradeAjaxHookScript, ");
                    sbLIZ2.append(str2);
                    C843070X5l.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ2), null);
                }
            }
        }
        return Unit.LIZ;
    }
}
