package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.exts.TabIconExtsKt$download$2", f = "TabIconExts.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, 35, 38}, m = "invokeSuspend")
public final class C592090NKd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C592100NKe>, Object> {
    public int LL;
    public final /* synthetic */ TabDynamicIconInfo LLILLJJLI;
    public final /* synthetic */ C0NKZ LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592090NKd(TabDynamicIconInfo tabDynamicIconInfo, C0NKZ c0nkz, boolean z, InterfaceC1364105Vn<? super C592090NKd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tabDynamicIconInfo;
        this.LLILLL = c0nkz;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592090NKd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconExtsKt@747f.download$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                C592100NKe c592100NKe = (C592100NKe) obj;
                C592100NKe c592100NKe2 = new C592100NKe(c592100NKe.LIZ, c592100NKe.LIZIZ, C0NLV.LIZJ(this.LLILLJJLI.tabKey));
                C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
                return c592100NKe2;
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
            return obj;
        }
        C155000ia.LIZIZ(obj);
        if (((Boolean) C0NLV.LIZIZ.getValue()).booleanValue()) {
            TabIconViewConfig tabIconViewConfigLIZIZ = C0NLV.LIZIZ(this.LLILLJJLI);
            if (tabIconViewConfigLIZIZ == null) {
                TabDynamicIconInfo tabDynamicIconInfo = this.LLILLJJLI;
                C0NKZ c0nkz = this.LLILLL;
                boolean z = this.LLILZ;
                this.LL = 1;
                obj = C2296808zG.LJ(new C592080NKc(tabDynamicIconInfo, c0nkz, z, null), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
                    return objLJFF;
                }
                C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
                return obj;
            }
            C0NKZ c0nkz2 = this.LLILLL;
            boolean z2 = this.LLILZ;
            this.LL = 2;
            obj = C2296808zG.LJ(new C592060NKa(tabIconViewConfigLIZIZ, c0nkz2, z2, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
                return objLJFF;
            }
            C592100NKe c592100NKe3 = (C592100NKe) obj;
            C592100NKe c592100NKe22 = new C592100NKe(c592100NKe3.LIZ, c592100NKe3.LIZIZ, C0NLV.LIZJ(this.LLILLJJLI.tabKey));
            C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
            return c592100NKe22;
        }
        TabDynamicIconInfo tabDynamicIconInfo2 = this.LLILLJJLI;
        C0NKZ c0nkz3 = this.LLILLL;
        boolean z3 = this.LLILZ;
        this.LL = 3;
        obj = C2296808zG.LJ(new C592080NKc(tabDynamicIconInfo2, c0nkz3, z3, null), this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
            return objLJFF;
        }
        C1C7U.LIZIZ("TabIconExtsKt@747f.download$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C592100NKe> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
