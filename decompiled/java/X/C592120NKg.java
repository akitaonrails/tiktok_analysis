package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.exts.TabIconExtsKt$preDecode$2", f = "TabIconExts.kt", l = {}, m = "invokeSuspend")
public final class C592120NKg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TabDynamicIconInfo LLILLJJLI;
    public final /* synthetic */ C0NKZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592120NKg(TabDynamicIconInfo tabDynamicIconInfo, C0NKZ c0nkz, InterfaceC1364105Vn<? super C592120NKg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tabDynamicIconInfo;
        this.LLILLL = c0nkz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592120NKg c592120NKg = new C592120NKg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c592120NKg.LL = obj;
        return c592120NKg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconExtsKt@747f.preDecode$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        if (((Boolean) C0NLV.LIZJ.getValue()).booleanValue()) {
            TabIconViewConfig tabIconViewConfigLIZIZ = C0NLV.LIZIZ(this.LLILLJJLI);
            if (tabIconViewConfigLIZIZ == null) {
                LIZ(interfaceC497601wk, this.LLILLJJLI, this.LLILLL);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TabIconExtsKt@747f.preDecode$2");
                return unit;
            }
            C0NLV.LJ(tabIconViewConfigLIZIZ, this.LLILLL);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TabIconExtsKt@747f.preDecode$2");
            return unit2;
        }
        LIZ(interfaceC497601wk, this.LLILLJJLI, this.LLILLL);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TabIconExtsKt@747f.preDecode$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(InterfaceC497601wk interfaceC497601wk, TabDynamicIconInfo tabDynamicIconInfo, C0NKZ c0nkz) {
        C1DFB c1dfb = C0PEM.LIZJ;
        C23250099c.LIZLLL(interfaceC497601wk, c1dfb, null, new C592110NKf(tabDynamicIconInfo, c0nkz, null), 2);
        C23250099c.LIZLLL(interfaceC497601wk, c1dfb, null, new C592130NKh(tabDynamicIconInfo, c0nkz, null), 2);
    }
}
