package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uU6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.effectplatform.impl.StickerResProvider$preload$1$1$1$preloadListDeferred$1", f = "StickerResProvider.kt", l = {48}, m = "invokeSuspend")
public final class C1705560uU6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AssetsLibData.AssetsLibCategory>, Object> {
    public int LL;
    public final /* synthetic */ C1705580uU8 LLILLJJLI;
    public final /* synthetic */ AssetsLibData.AssetsLibCategory LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705560uU6(C1705580uU8 c1705580uU8, AssetsLibData.AssetsLibCategory assetsLibCategory, InterfaceC1364105Vn<? super C1705560uU6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1705580uU8;
        this.LLILLL = assetsLibCategory;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705560uU6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StickerResProvider@ef8d.preload$1$1$1$preloadListDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1705570uU7 c1705570uU7 = new C1705570uU7(this.LLILLJJLI, this.LLILLL, null);
                this.LL = 1;
                obj = C099A.LIZIZ(3000L, c1705570uU7, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StickerResProvider@ef8d.preload$1$1$1$preloadListDeferred$1");
                    return objLJFF;
                }
            }
            c098200Yq = (AssetsLibData.AssetsLibCategory) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C1706630uVp.LIZJ("StickerResProvider", "StickerResProvider preload first category failed");
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        C1C7U.LIZIZ("StickerResProvider@ef8d.preload$1$1$1$preloadListDeferred$1");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AssetsLibData.AssetsLibCategory> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
