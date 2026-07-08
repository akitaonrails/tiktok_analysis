package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageInnerPushServiceImpl$shouldAcceptMessage$1", f = "TextImageInnerPushServiceImpl.kt", l = {86}, m = "invokeSuspend")
public final class C2330009Ba extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330009Ba(String str, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2330009Ba(this.LLILZ, interfaceC1364105Vn, this.LLILLL);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<String> c259800zU;
        ?? r0;
        C1C7U.LIZ("TextImageInnerPushServiceImpl@5c6f.shouldAcceptMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = this.LLILLL;
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null) {
                String str = this.LLILZ;
                this.LL = c259800zU;
                this.LLILLJJLI = 1;
                obj = iCreationAsyncTaskManagerLIZ.LIZJ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TextImageInnerPushServiceImpl@5c6f.shouldAcceptMessage$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TextImageInnerPushServiceImpl@5c6f.shouldAcceptMessage$1");
            return unit;
        }
        C0LSZ c0lsz = (C0LSZ) obj;
        if (c0lsz != null && (r0 = c0lsz.LJIIJ) != 0) {
            c259800zU.element = r0;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TextImageInnerPushServiceImpl@5c6f.shouldAcceptMessage$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TextImageInnerPushServiceImpl@5c6f.shouldAcceptMessage$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
