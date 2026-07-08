package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideRequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09QY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.diversion.pdpshare.EcSearchInboxManager$tryRedirectPdpToSearch$1", f = "EcSearchInboxManager.kt", l = {82, 82}, m = "invokeSuspend")
public final class C09QY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Function0 LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C259800zU LLILZIL;
    public C557050Lt1 LLILZLL;
    public EcSearchFeedVideoGuideRequestParams LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ Uri LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Function0<Unit> LLJILLL;
    public final /* synthetic */ Uri LLJJ;
    public final /* synthetic */ String LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09QY(Uri uri, String str, Function0<Unit> function0, Uri uri2, String str2, InterfaceC1364105Vn<? super C09QY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJIL = uri;
        this.LLJILJILJ = str;
        this.LLJILLL = function0;
        this.LLJJ = uri2;
        this.LLJJI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09QY c09qy = new C09QY(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
        c09qy.LLJIJIL = obj;
        return c09qy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032c A[Catch: all -> 0x0451, CancellationException -> 0x0488, TryCatch #10 {all -> 0x0451, blocks: (B:116:0x030f, B:118:0x032c, B:120:0x0332, B:121:0x033a, B:123:0x0349, B:128:0x0353, B:130:0x0367, B:133:0x0370, B:136:0x0378, B:129:0x035e, B:135:0x0374), top: B:208:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0332 A[Catch: all -> 0x0451, CancellationException -> 0x0488, TRY_LEAVE, TryCatch #10 {all -> 0x0451, blocks: (B:116:0x030f, B:118:0x032c, B:120:0x0332, B:121:0x033a, B:123:0x0349, B:128:0x0353, B:130:0x0367, B:133:0x0370, B:136:0x0378, B:129:0x035e, B:135:0x0374), top: B:208:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0461 A[Catch: all -> 0x048d, CancellationException -> 0x04a4, TryCatch #6 {all -> 0x048d, blocks: (B:148:0x039d, B:151:0x03a4, B:153:0x03ac, B:157:0x03b4, B:159:0x03cf, B:161:0x03d5, B:162:0x03de, B:164:0x03ea, B:165:0x0400, B:166:0x0407, B:168:0x040e, B:169:0x0430, B:147:0x0392, B:176:0x0456, B:178:0x0461, B:180:0x0467, B:183:0x0489, B:184:0x048c, B:85:0x0208, B:89:0x024b, B:92:0x0252, B:94:0x0256, B:99:0x0264, B:100:0x026a, B:102:0x0289, B:103:0x0290, B:110:0x02b8, B:88:0x0240), top: B:201:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0467 A[Catch: all -> 0x048d, CancellationException -> 0x04a4, TryCatch #6 {all -> 0x048d, blocks: (B:148:0x039d, B:151:0x03a4, B:153:0x03ac, B:157:0x03b4, B:159:0x03cf, B:161:0x03d5, B:162:0x03de, B:164:0x03ea, B:165:0x0400, B:166:0x0407, B:168:0x040e, B:169:0x0430, B:147:0x0392, B:176:0x0456, B:178:0x0461, B:180:0x0467, B:183:0x0489, B:184:0x048c, B:85:0x0208, B:89:0x024b, B:92:0x0252, B:94:0x0256, B:99:0x0264, B:100:0x026a, B:102:0x0289, B:103:0x0290, B:110:0x02b8, B:88:0x0240), top: B:201:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [T, com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideConfigData] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [T, com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideConfigData] */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09QY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
