package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import com.bytedance.ttnet.TTNetInit;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$fetchDataNew$1$2", f = "SoundEffectViewModel.kt", l = {147}, m = "invokeSuspend")
public final class C761080TtK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ SoundEffectViewModel LLILLL;
    public final /* synthetic */ List<C0U74<SoundEffect>> LLILZ;
    public final /* synthetic */ List<C0U74<SoundEffect>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761080TtK(SoundEffectViewModel soundEffectViewModel, List<C0U74<SoundEffect>> list, List<C0U74<SoundEffect>> list2, InterfaceC1364105Vn<? super C761080TtK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = soundEffectViewModel;
        this.LLILZ = list;
        this.LLILZIL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761080TtK(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        List<C0U74<SoundEffect>> list;
        C1C7U.LIZ("SoundEffectViewModel@1990.fetchDataNew$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                list = (List) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<C0U74<SoundEffect>> listLIZ = this.LLILLL.LLILZ.LIZ();
            if ((!listLIZ.isEmpty()) && (!(listLIZ instanceof Collection) || !listLIZ.isEmpty())) {
                Iterator<C0U74<SoundEffect>> it2 = listLIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().LIZIZ.isEmpty()) {
                        this.LLILZ.addAll(listLIZ);
                        break;
                    }
                }
            }
            SoundEffectViewModel soundEffectViewModel = this.LLILLL;
            soundEffectViewModel.getClass();
            C0JT6<String> c0jt6 = InterfaceC766480U4w.LJJZZIII;
            String strLIZ = c0jt6.LIZ();
            if (strLIZ != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ);
            } else {
                lLJIILIIL = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (lLJIILIIL != null && lLJIILIIL.longValue() + ((long) soundEffectViewModel.LLIZLLLIL) >= jCurrentTimeMillis) {
                soundEffectViewModel.LLJ = false;
            } else {
                soundEffectViewModel.LLJ = true;
                c0jt6.LIZJ(String.valueOf(jCurrentTimeMillis));
            }
            if (this.LLILZ.isEmpty() || (this.LLILLL.LLJ && TTNetInit.getEffectiveConnectionType() > 4)) {
                list = this.LLILZIL;
                C761960Tuk c761960Tuk = this.LLILLL.LLILZ;
                this.LL = list;
                this.LLILLJJLI = 1;
                obj = c761960Tuk.LIZJ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SoundEffectViewModel@1990.fetchDataNew$1$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SoundEffectViewModel@1990.fetchDataNew$1$2");
            return unit;
        }
        list.addAll((Collection) obj);
        this.LLILLL.BQ2(this.LLILZ, this.LLILZIL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SoundEffectViewModel@1990.fetchDataNew$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
