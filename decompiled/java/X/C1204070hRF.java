package X;

import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel$fetchDataChunk$3", f = "NearbyContainerViewModel.kt", l = {858}, m = "invokeSuspend")
public final class C1204070hRF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public NearbyContainerViewModel LLILLJJLI;
    public Object LLILLL;
    public AnonymousClass0954 LLILZ;
    public InterfaceC824740WWy LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ AnonymousClass0954<AbstractC1203920hR0> LLIZ;
    public final /* synthetic */ NearbyContainerViewModel LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1204070hRF(AnonymousClass0954<? extends AbstractC1203920hR0> anonymousClass0954, NearbyContainerViewModel nearbyContainerViewModel, C118300cf c118300cf, String str, InterfaceC1364105Vn<? super C1204070hRF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = anonymousClass0954;
        this.LLIZLLLIL = nearbyContainerViewModel;
        this.LLJ = c118300cf;
        this.LLJI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1204070hRF(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x00ed, TryCatch #9 {all -> 0x00ed, blocks: (B:15:0x004c, B:17:0x0054, B:19:0x005e, B:21:0x0093, B:22:0x0097, B:24:0x00b1, B:26:0x00b5, B:29:0x00d6, B:30:0x00db), top: B:73:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:73:0x004c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1204070hRF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
