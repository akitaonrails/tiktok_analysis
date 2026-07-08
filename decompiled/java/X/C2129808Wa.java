package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.08Wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinGeckoManager$tryPreloadBulletinEventGameGeckoResources$1$1", f = "BulletinGeckoManager.kt", l = {}, m = "invokeSuspend")
public final class C2129808Wa extends C09AX implements InterfaceC1631620sYq<Boolean, String, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ Object LLILLJJLI;

    public C2129808Wa(InterfaceC1364105Vn<? super C2129808Wa> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinGeckoManager@3a47.tryPreloadBulletinEventGameGeckoResources$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        String str = (String) this.LLILLJJLI;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinBoard preload event game gecko image success: ");
            sbLIZ.append(str);
            C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinBoard preload event game gecko image failed: ");
            sbLIZ2.append(str);
            C0OPX.LJIIJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinGeckoManager@3a47.tryPreloadBulletinEventGameGeckoResources$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C2129808Wa c2129808Wa = new C2129808Wa(interfaceC1364105Vn);
        c2129808Wa.LL = zBooleanValue;
        c2129808Wa.LLILLJJLI = str;
        return c2129808Wa.invokeSuspend(Unit.LIZ);
    }
}
