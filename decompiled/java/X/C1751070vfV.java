package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.settings.MessageCenterTabListEntranceSettings;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.TabChunk$refresh$1", f = "MessageCenterAssem.kt", l = {}, m = "invokeSuspend")
public final class C1751070vfV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1751170vff LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751070vfV(C1751170vff c1751170vff, InterfaceC1364105Vn<? super C1751070vfV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1751170vff;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1751070vfV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabChunk@41aa.refresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILZLL.LJFF(null);
        C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LL.LLILZLL;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MessageCenterTabListEntranceSettings.TabListEntranceConfigModel tabListEntranceConfigModel = MessageCenterTabListEntranceSettings.LIZ;
        MessageCenterTabListEntranceSettings.TabListEntranceConfigModel tabListEntranceConfigModel2 = (MessageCenterTabListEntranceSettings.TabListEntranceConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_shop_message_function_entrance_config", MessageCenterTabListEntranceSettings.TabListEntranceConfigModel.class, tabListEntranceConfigModel);
        if (tabListEntranceConfigModel2 != null) {
            tabListEntranceConfigModel = tabListEntranceConfigModel2;
        }
        C20600815jK.LIZJ(c20600815jK, new C111100bV(tabListEntranceConfigModel.functionEntranceItems));
        C20600815jK.LIZJ(this.LL.LLILZLL, new C03HG(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8))), R.attr.na, 0, 60));
        this.LL.LLIZLLLIL.vQ2(EnumC1751120vfa.TAB_LIST, EnumC1751110vfZ.SUCCESS);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TabChunk@41aa.refresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
