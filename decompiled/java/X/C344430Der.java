package X;

import android.content.res.Resources;
import com.bytedance.poplayer.core.PopupManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS548S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Der, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.service.AddYoursSendNotiInviteBehavior$onSelected$3", f = "AddYoursInviteBehavior.kt", l = {}, m = "invokeSuspend")
public final class C344430Der extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344430Der(int i, InterfaceC1364105Vn<? super C344430Der> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C344430Der(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursSendNotiInviteBehavior@9640.onSelected$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final int i = this.LL;
        PopupManager.LJIJI(new C10GR(i) { // from class: X.0Des
            public final int LL;
            public final AwS548S0100000_4 LLILLJJLI = new AwS548S0100000_4(this, 562);

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 7001;
            }

            @Override // X.InterfaceC20660415sw
            public final /* bridge */ /* synthetic */ C688120Qyw i2() {
                return null;
            }

            {
                this.LL = i;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                if (c19egLIZIZ == null) {
                    c20656615sK.LIZ();
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LIZJ(this.LLILLJJLI);
                Resources resources = c19egLIZIZ.getResources();
                int i2 = this.LL;
                c1389890mGx.LJIIJ(resources.getQuantityString(2131755079, i2, Integer.valueOf(i2)));
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJJI();
            }
        }, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursSendNotiInviteBehavior@9640.onSelected$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
