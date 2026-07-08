package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.bridge.DefaultGenAIBridge$restoreTask$1", f = "DefaultGenAIBridge.kt", l = {563, 564}, m = "invokeSuspend")
public final class C2331409Bo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC2331909Bt LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331409Bo(EnumC2331909Bt enumC2331909Bt, String str, String str2, InterfaceC1364105Vn<? super C2331409Bo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC2331909Bt;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2331409Bo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultGenAIBridge@a8d8.restoreTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.restoreTask$1");
                return unit;
            }
            int i2 = C2332109Bv.LIZ[this.LLILLJJLI.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    List listSingletonList = Collections.singletonList(this.LLILLL);
                    String str = this.LLILZ;
                    this.LL = 2;
                    if (iCreationAsyncTaskManagerLIZ.LJIJJLI(str, listSingletonList, this) == objLJFF) {
                        C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.restoreTask$1");
                        return objLJFF;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                List listSingletonList2 = Collections.singletonList(this.LLILLL);
                String str2 = this.LLILZ;
                this.LL = 1;
                if (iCreationAsyncTaskManagerLIZ.LJIJI(str2, listSingletonList2, this) == objLJFF) {
                    C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.restoreTask$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultGenAIBridge@a8d8.restoreTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
