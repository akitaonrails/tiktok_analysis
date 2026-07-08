package X;

import Y.AfS138S0200000_2;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS172S0400000_17;

/* JADX INFO: renamed from: X.0fyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147950fyj extends AbstractC1147960fyk {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue = ((InterfaceC1147970fyl) xBaseParamModel).getFetchMomentType().intValue();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C11IB c11ibLJLJJLL = C11NZ.LJLJJLL(3L, TimeUnit.SECONDS);
        C11RO c11ro = C11S5.LIZ;
        C784440Upu.LIZ().LIZIZ(new C255000yi(iIntValue, false, new AwS172S0400000_17(atomicBoolean, (C11JF) c11ibLJLJJLL.LJL(c11ro).LJJJLZIJ(c11ro).LJJLJLI(new AfS138S0200000_2(atomicBoolean, completionBlock, 3)), this, completionBlock, 0), 2));
    }
}
