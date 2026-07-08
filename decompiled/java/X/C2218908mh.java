package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.08mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.autoplay.TakoAutoPlayController$buildCommandFlow$gateFlow$1", f = "TakoAutoPlayController.kt", l = {}, m = "invokeSuspend")
public final class C2218908mh extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C2218908mh(InterfaceC1364105Vn<? super C2218908mh> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TakoAutoPlayController@e714.buildCommandFlow$gateFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z2 = this.LL;
        boolean z3 = this.LLILLJJLI;
        if (z2 && z3) {
            z = true;
        } else {
            z = false;
        }
        new C2219008mi(z2, z3, z);
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TakoAutoPlayController@e714.buildCommandFlow$gateFlow$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C2218908mh c2218908mh = new C2218908mh(interfaceC1364105Vn);
        c2218908mh.LL = zBooleanValue;
        c2218908mh.LLILLJJLI = zBooleanValue2;
        return c2218908mh.invokeSuspend(Unit.LIZ);
    }
}
