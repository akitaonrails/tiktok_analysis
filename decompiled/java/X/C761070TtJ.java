package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$fetchDataOld$1$2", f = "SoundEffectViewModel.kt", l = {}, m = "invokeSuspend")
public final class C761070TtJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ SoundEffectViewModel LL;
    public final /* synthetic */ List<C0U74<SoundEffect>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761070TtJ(SoundEffectViewModel soundEffectViewModel, List<C0U74<SoundEffect>> list, InterfaceC1364105Vn<? super C761070TtJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = soundEffectViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761070TtJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SoundEffectViewModel@1990.fetchDataOld$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C0U74<SoundEffect>> listLIZ = this.LL.LLILZ.LIZ();
        if ((!listLIZ.isEmpty()) && (!(listLIZ instanceof Collection) || !listLIZ.isEmpty())) {
            Iterator<C0U74<SoundEffect>> it2 = listLIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!it2.next().LIZIZ.isEmpty()) {
                    this.LLILLJJLI.addAll(listLIZ);
                    break;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(this.LLILLJJLI.addAll(listLIZ));
        C1C7U.LIZIZ("SoundEffectViewModel@1990.fetchDataOld$1$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
