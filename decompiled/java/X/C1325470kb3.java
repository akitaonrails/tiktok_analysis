package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0kb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$updateImageDiskCacheUsageInfoConfig$1$2", f = "CommonMessageListConfig.kt", l = {448}, m = "invokeSuspend")
public final class C1325470kb3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1325470kb3(InterfaceC1364105Vn<? super C1325470kb3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1325470kb3(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("CommonMessageListConfigKt@2fb4.updateImageDiskCacheUsageInfoConfig$1$2");
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
            this.LL = 1;
            if (C1325480kb4.LIZIZ) {
                unit = Unit.LIZ;
            } else {
                C1325480kb4.LIZIZ = true;
                for (C06TB c06tb : C06TB.values()) {
                    C1325430kaz c1325430kazLJII = C1331660kl2.LIZJ().LJII(c06tb.getSpace());
                    if (c1325430kazLJII != null && c1325430kazLJII.LIZ != null) {
                        Iterator it2 = ((ArrayList) c1325430kazLJII.LIZ).iterator();
                        float f = 0.0f;
                        while (it2.hasNext()) {
                            f += ((C1325440kb0) it2.next()).LIZ;
                        }
                        C1326200kcE c1326200kcE = C1326200kcE.LIZ;
                        String space = c06tb.getSpace();
                        long j = (long) f;
                        Keva kevaLIZIZ = c1326200kcE.LIZIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("cache_space_used_");
                        sbLIZ.append(space);
                        kevaLIZIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
                    }
                }
                unit = Unit.LIZ;
            }
            if (unit == objLJFF) {
                C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.updateImageDiskCacheUsageInfoConfig$1$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.updateImageDiskCacheUsageInfoConfig$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1325470kb3(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
