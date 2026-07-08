package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileFeedModule$fetchAndInsertAdsWithLog$1", f = "CommerceProfileFeedModule.kt", l = {223}, m = "invokeSuspend")
public final class C1053080dVi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1053070dVh LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053080dVi(C1053070dVh c1053070dVh, List<String> list, int i, String str, int i2, String str2, InterfaceC1364105Vn<? super C1053080dVi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1053070dVh;
        this.LLILLL = list;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = i2;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1053080dVi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x063e, code lost:
    
        X.C1053070dVh.LJIIIIZZ("Insertion fails. Unable to find the index of current aweme.");
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053080dVi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
