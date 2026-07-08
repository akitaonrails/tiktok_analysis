package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Tt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectDataProvider$fetchSingleEffect$1$1", f = "LiveEffectDataProvider.kt", l = {203}, m = "invokeSuspend")
public final class C760880Tt0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ BgEffectViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC760840Tsw LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760880Tt0(boolean z, BgEffectViewModel bgEffectViewModel, String str, InterfaceC760840Tsw interfaceC760840Tsw, InterfaceC1364105Vn<? super C760880Tt0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = bgEffectViewModel;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC760840Tsw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C760880Tt0 c760880Tt0 = new C760880Tt0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c760880Tt0.LLILLJJLI = obj;
        return c760880Tt0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectDataProvider@97e.fetchSingleEffect$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL) {
                BgEffectViewModel bgEffectViewModel = this.LLILZ;
                String str = this.LLILZIL;
                bgEffectViewModel.getClass();
                C20441214yg.LIZIZ("shared_bg", "BgEffectViewModel loadLocalMultiEffectOrFetchSingleEffect start");
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModel), C0PEM.LIZJ, null, new C760960Tt8(bgEffectViewModel, str, null), 2);
            } else {
                BgEffectViewModel bgEffectViewModel2 = this.LLILZ;
                bgEffectViewModel2.getClass();
                C20441214yg.LIZIZ("shared_bg", "BgEffectViewModel fetchLatestMultiEffect start");
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModel2), C0PEM.LIZJ, null, new C760970Tt9(bgEffectViewModel2, false, null), 2);
            }
            C2252331DDr c2252331DDr = this.LLILZ.LLILLL;
            final InterfaceC760840Tsw interfaceC760840Tsw = this.LLILZLL;
            final boolean z = this.LLILLL;
            final String str2 = this.LLILZIL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0Tsz
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    T next;
                    AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj2;
                    if (abstractC401801hI instanceof C396001gM) {
                        C396001gM c396001gM = (C396001gM) abstractC401801hI;
                        if (Intrinsics.LJFF(c396001gM.LIZ, "multi")) {
                            List<T> list = c396001gM.LIZIZ;
                            String str3 = str2;
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str3)) {
                                        break;
                                    }
                                } else {
                                    next = (T) null;
                                    break;
                                }
                            }
                            LiveEffect liveEffect = next;
                            if (liveEffect == null) {
                                interfaceC760840Tsw.onFail();
                            } else {
                                interfaceC760840Tsw.LIZ(liveEffect);
                            }
                            if (z && !c396001gM.LIZLLL && (!c396001gM.LIZIZ.isEmpty())) {
                                C766720U5u c766720U5u = C766720U5u.LIZ;
                                String str4 = str2;
                                InterfaceC760840Tsw interfaceC760840Tsw2 = interfaceC760840Tsw;
                                c766720U5u.getClass();
                                BgEffectViewModel bgEffectViewModelLIZIZ = C0U60.LIZIZ();
                                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModelLIZIZ), null, null, new C760860Tsy(bgEffectViewModelLIZIZ, interfaceC760840Tsw2, str4, null), 3);
                            }
                            C2296808zG.LIZJ(interfaceC497601wk, null);
                        }
                    } else if ((abstractC401801hI instanceof C491401vk) && Intrinsics.LJFF(((C491401vk) abstractC401801hI).LIZ, "multi")) {
                        interfaceC760840Tsw.onFail();
                        C2296808zG.LIZJ(interfaceC497601wk, null);
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEffectDataProvider@97e.fetchSingleEffect$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
