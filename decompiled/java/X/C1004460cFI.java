package X;

import com.ss.android.ugc.aweme.base.share.QuickShareCandidate;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem$tryToDisplayComponent$1$hasHandle$1", f = "QuickShareButtonAssem.kt", l = {528, 565, 570, 594, 607}, m = "invokeSuspend")
public final class C1004460cFI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ VideoItemParams LLILZLL;
    public final /* synthetic */ QuickShareButtonAssem LLIZ;
    public final /* synthetic */ C259800zU<C1004480cFK> LLIZLLLIL;
    public final /* synthetic */ C259800zU<Map<String, Object>> LLJ;
    public final /* synthetic */ C259800zU<IMContact> LLJI;
    public final /* synthetic */ C259800zU<QuickShareCandidate> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004460cFI(String str, VideoItemParams videoItemParams, QuickShareButtonAssem quickShareButtonAssem, C259800zU<C1004480cFK> c259800zU, C259800zU<Map<String, Object>> c259800zU2, C259800zU<IMContact> c259800zU3, C259800zU<QuickShareCandidate> c259800zU4, InterfaceC1364105Vn<? super C1004460cFI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = videoItemParams;
        this.LLIZ = quickShareButtonAssem;
        this.LLIZLLLIL = c259800zU;
        this.LLJ = c259800zU2;
        this.LLJI = c259800zU3;
        this.LLJIJIL = c259800zU4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1004460cFI(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x024b, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() == true) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05ce  */
    /* JADX WARN: Type inference failed for: r1v114, types: [T, com.ss.android.ugc.aweme.base.share.QuickShareCandidate] */
    /* JADX WARN: Type inference failed for: r2v23, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [T, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [T] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1004460cFI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
