package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl$startPolling$1", f = "MixStudioStatusRepoImpl.kt", l = {580, 585, 604, 625}, m = "invokeSuspend")
public final class C441340HSi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MixStudioStatusResponse LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441340HSi(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, int i, boolean z, InterfaceC1364105Vn<? super C441340HSi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = mixStudioStatusRepoImpl;
        this.LLILZLL = i;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C441340HSi c441340HSi = new C441340HSi(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c441340HSi.LLILZ = obj;
        return c441340HSi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: 0HSx -> 0x010e, TryCatch #1 {0HSx -> 0x010e, blocks: (B:12:0x002f, B:21:0x005f, B:23:0x006c, B:24:0x006e, B:27:0x007a, B:28:0x0089), top: B:85:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: 0HSx -> 0x010e, TryCatch #1 {0HSx -> 0x010e, blocks: (B:12:0x002f, B:21:0x005f, B:23:0x006c, B:24:0x006e, B:27:0x007a, B:28:0x0089), top: B:85:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [X.01wk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [X.01wk] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.01wk] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C441340HSi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
