package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.063I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsPageKt$SettingsList$4$1$1", f = "SettingsPage.kt", l = {127, 131}, m = "invokeSuspend")
public final class C063I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<C443120HZe<InterfaceC19211810Ea, Boolean, Boolean>> LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1688880u3C LLILZLL;
    public final /* synthetic */ C05P0<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C063I(List<? extends C443120HZe<? extends InterfaceC19211810Ea, Boolean, Boolean>> list, C1690080u58 c1690080u58, String str, C1688880u3C c1688880u3C, C05P0<String> c05p0, InterfaceC1364105Vn<? super C063I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1690080u58;
        this.LLILZIL = str;
        this.LLILZLL = c1688880u3C;
        this.LLIZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C063I(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C06XG next;
        int size;
        C1C7U.LIZ("SettingsPageKt@9408.SettingsList$4$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLIZ.setValue(this.LLILZIL);
                    this.LLILZLL.LLIZ.invoke(new C063J());
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SettingsPageKt@9408.SettingsList$4$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            List<C443120HZe<InterfaceC19211810Ea, Boolean, Boolean>> list = this.LLILLL;
            String str = this.LLILZIL;
            Iterator<C443120HZe<InterfaceC19211810Ea, Boolean, Boolean>> it2 = list.iterator();
            i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().getFirst().getKey(), str)) {
                    if (i > 0) {
                        this.LL = i;
                        this.LLILLJJLI = 1;
                        if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                            C1C7U.LIZIZ("SettingsPageKt@9408.SettingsList$4$1$1");
                            return objLJFF;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        Iterator<C06XG> it3 = this.LLILZ.LJIIIZ().LJII().iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (next.getIndex() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C06XG c06xg = next;
        if (c06xg != null) {
            size = c06xg.getSize();
        } else {
            size = 52;
        }
        int iLIZ = ((((int) (this.LLILZ.LJIIIZ().LIZ() & 4294967295L)) / 2) - size) - (C497820Jfg.LIZJ(C1383370m6R.LIZ) + 52);
        this.LLILLJJLI = 2;
        if (this.LLILZ.LJFF(i, -iLIZ, this) == objLJFF) {
            C1C7U.LIZIZ("SettingsPageKt@9408.SettingsList$4$1$1");
            return objLJFF;
        }
        this.LLIZ.setValue(this.LLILZIL);
        this.LLILZLL.LLIZ.invoke(new C063J());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SettingsPageKt@9408.SettingsList$4$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
