package X;

import com.bytedance.ies.im.core.api.model.ExpValue;
import com.bytedance.ies.im.core.api.service.IIMQueryExpManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550920Lj8 extends C09AY implements Function0<C550880Lj4> {
    public C550920Lj8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C550880Lj4 invoke() {
        return new InterfaceC896190ZDt() { // from class: X.0Lj4
            @Override // X.InterfaceC896190ZDt
            public final boolean LIZ(String str) {
                ExpValue expValueLIZ;
                Integer num;
                if (!C550900Lj6.LIZ()) {
                    IIMQueryExpManager.LIZ.getClass();
                    IIMQueryExpManager value = C550890Lj5.LIZIZ.getValue();
                    if (value == null || (expValueLIZ = value.LIZ("tt_dm_light_interaction_reversal", str)) == null || (num = expValueLIZ.featureStatusCode) == null || num.intValue() != 1) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC896190ZDt
            public final boolean LIZIZ(String str) {
                if (str == null) {
                    if (C560910LzF.LIZIZ() && !C550900Lj6.LIZ()) {
                        return true;
                    }
                    return false;
                }
                if (C560910LzF.LIZIZ() && LIZ(str)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC896190ZDt
            public final void LIZJ(List list) {
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) list) {
                    if (!Intrinsics.LJFF(obj, curUserId)) {
                        arrayList.add(obj);
                    }
                }
                IIMQueryExpManager.LIZ.getClass();
                IIMQueryExpManager value = C550890Lj5.LIZIZ.getValue();
                if (value != null) {
                    value.LIZIZ(9, Collections.singletonList("tt_dm_light_interaction_reversal"), arrayList);
                }
            }

            @Override // X.InterfaceC896190ZDt
            public final boolean LIZLLL(String str) {
                if (str == null) {
                    return !C550900Lj6.LIZ();
                }
                return LIZ(str);
            }
        };
    }
}
