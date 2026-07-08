package X;

import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.SocialAvatarIdData$1$1", f = "SocialAvatarIdData.kt", l = {93}, m = "invokeSuspend")
public final class C0HKS extends C09AX implements Function2<InterfaceC439080HJq, InterfaceC1364105Vn<? super Unit>, Object> {
    public float LL;
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0HKU LLILZLL;
    public final /* synthetic */ SocialAvatarFastFlowService LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HKS(C0HKU c0hku, SocialAvatarFastFlowService socialAvatarFastFlowService, InterfaceC1364105Vn<? super C0HKS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c0hku;
        this.LLIZ = socialAvatarFastFlowService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HKS c0hks = new C0HKS(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0hks.LLILZIL = obj;
        return c0hks;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r0 <= r2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005e -> B:6:0x0021). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HKS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC439080HJq interfaceC439080HJq, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC439080HJq, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
