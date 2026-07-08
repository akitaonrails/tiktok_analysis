package X;

import com.ss.android.ugc.aweme.tako.autoplay.TakoAutoPlayController;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.autoplay.TakoAutoPlayController$buildCommandFlow$1", f = "TakoAutoPlayController.kt", l = {}, m = "invokeSuspend")
public final class C1783610wVz extends C09AX implements InterfaceC1631620sYq<Boolean, InterfaceC1783650wW3, InterfaceC1364105Vn<? super InterfaceC1780280wQc>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ InterfaceC1783650wW3 LLILLJJLI;
    public final /* synthetic */ TakoAutoPlayController LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783610wVz(TakoAutoPlayController takoAutoPlayController, InterfaceC1364105Vn<? super C1783610wVz> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = takoAutoPlayController;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1780270wQb;
        String simpleName;
        C1C7U.LIZ("TakoAutoPlayController@e714.buildCommandFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        InterfaceC1783650wW3 interfaceC1783650wW3 = this.LLILLJJLI;
        if (z && interfaceC1783650wW3 != null) {
            c1780270wQb = new C1780270wQb(interfaceC1783650wW3, Boolean.valueOf(this.LLILLL.LIZ));
        } else {
            c1780270wQb = C1780290wQd.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stateCommandFlow: gate=");
        sbLIZ.append(z);
        sbLIZ.append(" target=");
        if (interfaceC1783650wW3 != null) {
            simpleName = interfaceC1783650wW3.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(" -> ");
        sbLIZ.append(c1780270wQb);
        C2188811AlT.LIZIZ(sbLIZ);
        C1C7U.LIZIZ("TakoAutoPlayController@e714.buildCommandFlow$1");
        return c1780270wQb;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, InterfaceC1783650wW3 interfaceC1783650wW3, InterfaceC1364105Vn<? super InterfaceC1780280wQc> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C1783610wVz c1783610wVz = new C1783610wVz(this.LLILLL, interfaceC1364105Vn);
        c1783610wVz.LL = zBooleanValue;
        c1783610wVz.LLILLJJLI = interfaceC1783650wW3;
        return c1783610wVz.invokeSuspend(Unit.LIZ);
    }
}
