package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.bridge.DefaultGenAIBridge$stopFailedTask$1", f = "DefaultGenAIBridge.kt", l = {553}, m = "invokeSuspend")
public final class C2331709Br extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ICreationAsyncTaskManager LL;
    public int LLILLJJLI;
    public final /* synthetic */ EnumC2331909Bt LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331709Br(EnumC2331909Bt enumC2331909Bt, String str, InterfaceC1364105Vn<? super C2331709Br> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC2331909Bt;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2331709Br(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? LIZ;
        ?? SingletonList;
        C1C7U.LIZ("DefaultGenAIBridge@a8d8.stopFailedTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                ICreationAsyncTaskManager iCreationAsyncTaskManager = this.LL;
                C155000ia.LIZIZ(obj);
                LIZ = iCreationAsyncTaskManager;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LIZ = C09BV.LIZ();
            if (LIZ == 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.stopFailedTask$1");
                return unit;
            }
            int i2 = C2332209Bw.LIZ[this.LLILLL.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    String str = this.LLILZ;
                    this.LL = LIZ;
                    this.LLILLJJLI = 1;
                    obj = LIZ.LJJIJLIJ(str, this);
                    LIZ = LIZ;
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.stopFailedTask$1");
                        return objLJFF;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                SingletonList = Collections.singletonList(this.LLILZ);
                LIZ.LJJJJJL(SingletonList);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.stopFailedTask$1");
                return unit2;
            }
        }
        Iterable iterable = (Iterable) obj;
        SingletonList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            SingletonList.add(((C0LSZ) it2.next()).LIZ);
        }
        LIZ.LJJJJJL(SingletonList);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.stopFailedTask$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
