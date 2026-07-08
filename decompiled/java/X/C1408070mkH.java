package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0mkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.configable.customitem.dm.DirectMessageRadioItemComponent$1$1", f = "DirectMessageRadioItemComponent.kt", l = {}, m = "invokeSuspend")
public final class C1408070mkH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C106Y LL;
    public final /* synthetic */ Boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408070mkH(C106Y c106y, Boolean bool, InterfaceC1364105Vn<? super C1408070mkH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c106y;
        this.LLILLJJLI = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408070mkH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC191831102z c104w;
        C1C7U.LIZ("DirectMessageRadioItemComponent@3d0d.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C106Y c106y = this.LL;
        Boolean bool = this.LLILLJJLI;
        c106y.LLJJ = bool;
        if (Intrinsics.LJFF(bool, true)) {
            final String str = this.LL.LLJILJILJ.LJIIIZ;
            c104w = new InterfaceC191831102z(str) { // from class: X.0mkI
                public final String LL;

                {
                    this.LL = str;
                }

                @Override // X.InterfaceC191831102z
                public final CharSequence LIZJ(Context context, CharSequence charSequence) {
                    String str2 = this.LL;
                    if (Intrinsics.LJFF(str2, "dm_setting_potential_connection")) {
                        String string = context.getString(2131828193);
                        String string2 = context.getString(2131828194);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(string);
                        sbLIZ.append('\n');
                        sbLIZ.append(string2);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (!Intrinsics.LJFF(str2, "dm_setting_others")) {
                        return charSequence;
                    }
                    return context.getString(2131828192);
                }
            };
        } else {
            c104w = new C104W(this.LL.LLJILJILJ.LJIIIZ);
        }
        c106y.LLJJI = c104w;
        this.LL.LJIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DirectMessageRadioItemComponent@3d0d.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
