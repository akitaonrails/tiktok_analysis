package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectAdapter$onItemClicked$1", f = "SoundEffectAdapter.kt", l = {89}, m = "invokeSuspend")
public final class C761110TtN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C761610TuB LLILLJJLI;
    public final /* synthetic */ SoundEffect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761110TtN(C761610TuB c761610TuB, SoundEffect soundEffect, InterfaceC1364105Vn<? super C761110TtN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c761610TuB;
        this.LLILLL = soundEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761110TtN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEK c1dek;
        C1C7U.LIZ("SoundEffectAdapter@a22d.onItemClicked$1");
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
            SoundEffectViewModel soundEffectViewModel = this.LLILLJJLI.LLILZIL;
            if (soundEffectViewModel != null && (c1dek = soundEffectViewModel.LLILLJJLI) != null) {
                C400101h1 c400101h1 = new C400101h1(this.LLILLL);
                this.LL = 1;
                if (c1dek.LJIJI(c400101h1, this) == objLJFF) {
                    C1C7U.LIZIZ("SoundEffectAdapter@a22d.onItemClicked$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SoundEffectAdapter@a22d.onItemClicked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
