package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219151BtJ extends C09AY implements Function1<InterfaceC2219141BtI, Unit> {
    public final /* synthetic */ Function0<InterfaceC2269341Ds4> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2219151BtJ(Function0<? extends InterfaceC2269341Ds4> function0) {
        super(1);
        this.LL = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.190g] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0sNn] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2219141BtI interfaceC2219141BtI) {
        InterfaceC2219141BtI interfaceC2219141BtI2 = interfaceC2219141BtI;
        this.LL.invoke().getApplicationService().getClass();
        interfaceC2219141BtI2.LIZLLL(C1BWL.LIZ());
        this.LL.invoke().getApplicationService().getClass();
        interfaceC2219141BtI2.LIZ();
        this.LL.invoke().getApplicationService().getClass();
        interfaceC2219141BtI2.LJI();
        interfaceC2219141BtI2.LJII(new InterfaceC21358518iF() { // from class: X.190g
            @Override // X.InterfaceC21358518iF
            public final void LIZ(Context context, int i, String str) {
                Activity activityLIZ;
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && str != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(str);
                    C1390380mHk.LIZ(activityLIZ, 6003, creativeToastBuilder);
                }
            }
        });
        interfaceC2219141BtI2.LJIIIIZZ(this.LL.invoke().getGson());
        interfaceC2219141BtI2.LJ(new InterfaceC2140108Zz() { // from class: X.0sNn
            @Override // X.InterfaceC2140108Zz
            public final void LIZ(String str, Map<String, String> map) {
                C2341909Fp.LIZ(str, map);
            }
        });
        interfaceC2219141BtI2.LIZIZ();
        return Unit.LIZ;
    }
}
