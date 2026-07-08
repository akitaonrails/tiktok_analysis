package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository$fetchPDPData$2", f = "PDPDataRepository.kt", l = {399, 176, 201}, m = "invokeSuspend")
public final class C331690CzP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C0D3K>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public InterfaceC383701eN LLILLL;
    public C331730CzT LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ C331730CzT LLJILJILJ;
    public final /* synthetic */ PdpSupplementData LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331690CzP(String str, int i, String str2, C331730CzT c331730CzT, PdpSupplementData pdpSupplementData, InterfaceC1364105Vn<? super C331690CzP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = str;
        this.LLJIJIL = i;
        this.LLJILJIL = str2;
        this.LLJILJILJ = c331730CzT;
        this.LLJILLL = pdpSupplementData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331690CzP(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff A[Catch: all -> 0x022a, TryCatch #1 {all -> 0x022a, blocks: (B:92:0x01c6, B:104:0x01ef, B:105:0x01ff, B:107:0x0205, B:108:0x020c, B:28:0x0100), top: B:123:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c A[Catch: all -> 0x022e, TryCatch #4 {all -> 0x022e, blocks: (B:32:0x0116, B:34:0x011c, B:37:0x0123, B:39:0x0127, B:42:0x012d, B:44:0x0136, B:72:0x0187, B:78:0x0197, B:80:0x019d, B:89:0x01b3, B:91:0x01bd, B:71:0x0183, B:25:0x00d8, B:27:0x00f5), top: B:128:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183 A[Catch: all -> 0x022e, TRY_ENTER, TryCatch #4 {all -> 0x022e, blocks: (B:32:0x0116, B:34:0x011c, B:37:0x0123, B:39:0x0127, B:42:0x012d, B:44:0x0136, B:72:0x0187, B:78:0x0197, B:80:0x019d, B:89:0x01b3, B:91:0x01bd, B:71:0x0183, B:25:0x00d8, B:27:0x00f5), top: B:128:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331690CzP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C0D3K>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
