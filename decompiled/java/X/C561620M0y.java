package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initData$1$1$1", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561620M0y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxFragment LL;
    public final /* synthetic */ List<C561950M2f> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ EnumC562200M3e LLILZ;
    public final /* synthetic */ C562260M3k LLILZIL;
    public final /* synthetic */ C0M0Z LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C561620M0y(DraftBoxFragment draftBoxFragment, List<? extends C561950M2f> list, boolean z, EnumC562200M3e enumC562200M3e, C562260M3k c562260M3k, C0M0Z c0m0z, InterfaceC1364105Vn<? super C561620M0y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxFragment;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = enumC562200M3e;
        this.LLILZIL = c562260M3k;
        this.LLILZLL = c0m0z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561620M0y(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C561620M0y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
