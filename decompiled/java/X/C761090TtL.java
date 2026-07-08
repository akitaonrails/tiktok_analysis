package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$saveSoundEffectOrder$1", f = "SoundEffectViewModel.kt", l = {382, 383}, m = "invokeSuspend")
public final class C761090TtL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SoundEffectViewModel LLILLJJLI;
    public final /* synthetic */ List<SoundEffect> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761090TtL(SoundEffectViewModel soundEffectViewModel, List<SoundEffect> list, InterfaceC1364105Vn<? super C761090TtL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = soundEffectViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761090TtL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SoundEffectViewModel@1990.saveSoundEffectOrder$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SoundEffectViewModel@1990.saveSoundEffectOrder$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C761960Tuk c761960Tuk = this.LLILLJJLI.LLILZ;
            List<SoundEffect> list = this.LLILLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<SoundEffect> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C2286608xc.LJFF(it2.next().id));
            }
            c761960Tuk.LJ(0, arrayList);
            C761960Tuk c761960Tuk2 = this.LLILLJJLI.LLILZ;
            this.LL = 1;
            obj = c761960Tuk2.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SoundEffectViewModel@1990.saveSoundEffectOrder$1");
                return objLJFF;
            }
        }
        C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
        C403601ha c403601ha = new C403601ha((List) obj, false, 6);
        this.LL = 2;
        if (c2252331DDr.emit(c403601ha, this) == objLJFF) {
            C1C7U.LIZIZ("SoundEffectViewModel@1990.saveSoundEffectOrder$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SoundEffectViewModel@1990.saveSoundEffectOrder$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
