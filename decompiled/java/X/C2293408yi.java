package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.util.ExtractCoverNewConfigExtensionsKt$shouldUseSmartCover$isInit$1$1", f = "ExtractCoverNewConfigExtensions.kt", l = {60}, m = "invokeSuspend")
public final class C2293408yi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C2292908yd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2293408yi(C2292908yd c2292908yd, InterfaceC1364105Vn<? super C2293408yi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2292908yd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2293408yi(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExtractCoverNewConfigExtensionsKt@f3a.shouldUseSmartCover$isInit$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2292908yd c2292908yd = this.LLILLJJLI;
            this.LL = 1;
            obj = c2292908yd.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ExtractCoverNewConfigExtensionsKt@f3a.shouldUseSmartCover$isInit$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ExtractCoverNewConfigExtensionsKt@f3a.shouldUseSmartCover$isInit$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
