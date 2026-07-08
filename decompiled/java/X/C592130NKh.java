package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.exts.TabIconExtsKt$preDecode$2$preDecodeAll$2", f = "TabIconExts.kt", l = {}, m = "invokeSuspend")
public final class C592130NKh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TabDynamicIconInfo LL;
    public final /* synthetic */ C0NKZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592130NKh(TabDynamicIconInfo tabDynamicIconInfo, C0NKZ c0nkz, InterfaceC1364105Vn<? super C592130NKh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tabDynamicIconInfo;
        this.LLILLJJLI = c0nkz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592130NKh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconExtsKt@747f.preDecode$2$preDecodeAll$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TabIconViewConfig tabIconViewConfig = this.LL.bottomTabIconConfig;
        if (tabIconViewConfig != null) {
            C0NLV.LJ(tabIconViewConfig, this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TabIconExtsKt@747f.preDecode$2$preDecodeAll$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
