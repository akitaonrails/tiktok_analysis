package X;

import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginComposeFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.14X2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginComposeFragment$PushSettingsList$4$1", f = "PushSettingsLoginComposeFragment.kt", l = {340}, m = "invokeSuspend")
public final class C14X2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C20304914ch LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;
    public final /* synthetic */ PushSettingsLoginComposeFragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14X2(boolean z, C20304914ch c20304914ch, C1690080u58 c1690080u58, PushSettingsLoginComposeFragment pushSettingsLoginComposeFragment, InterfaceC1364105Vn<? super C14X2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c20304914ch;
        this.LLILZ = c1690080u58;
        this.LLILZIL = pushSettingsLoginComposeFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C14X2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushSettingsLoginComposeFragment@d722.PushSettingsList$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILLJJLI) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PushSettingsLoginComposeFragment@d722.PushSettingsList$4$1");
                return unit;
            }
            List<C20696015yg> list = this.LLILLL.LL;
            PushSettingsLoginComposeFragment pushSettingsLoginComposeFragment = this.LLILZIL;
            Iterator<C20696015yg> it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                List<AbstractC20694715yT> list2 = it2.next().LIZIZ;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<AbstractC20694715yT> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().getUniqueId(), pushSettingsLoginComposeFragment.LLILLL.getValue())) {
                            if (i2 > 0) {
                                C1690080u58 c1690080u58 = this.LLILZ;
                                int iLIZ = C341940Daq.LIZ(16.0d);
                                this.LL = 1;
                                if (c1690080u58.LJFF(i2, iLIZ, this) == objLJFF) {
                                    C1C7U.LIZIZ("PushSettingsLoginComposeFragment@d722.PushSettingsList$4$1");
                                    return objLJFF;
                                }
                            }
                        }
                    }
                }
                i2++;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PushSettingsLoginComposeFragment@d722.PushSettingsList$4$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
