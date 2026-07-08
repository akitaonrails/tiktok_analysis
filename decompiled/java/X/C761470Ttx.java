package X;

import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ttx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectFragment$initView$2$1$1", f = "SoundEffectFragment.kt", l = {161}, m = "invokeSuspend")
public final class C761470Ttx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SoundEffectFragment LLILLJJLI;
    public final /* synthetic */ C761590Tu9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761470Ttx(SoundEffectFragment soundEffectFragment, C761590Tu9 c761590Tu9, InterfaceC1364105Vn<? super C761470Ttx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = soundEffectFragment;
        this.LLILLL = c761590Tu9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761470Ttx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEK c1dek;
        C1C7U.LIZ("SoundEffectFragment@9c41.initView$2$1$1");
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
            C781710UlV c781710UlV = this.LLILLJJLI.LLJ;
            if (c781710UlV != null) {
                c781710UlV.LJIIIIZZ = true;
                c781710UlV.LIZLLL();
            }
            SoundEffectViewModel soundEffectViewModel = this.LLILLJJLI.LLIZ;
            if (soundEffectViewModel != null && (c1dek = soundEffectViewModel.LLILLJJLI) != null) {
                C080600Rw c080600Rw = new C080600Rw(this.LLILLL.LL);
                this.LL = 1;
                if (c1dek.LJIJI(c080600Rw, this) == objLJFF) {
                    C1C7U.LIZIZ("SoundEffectFragment@9c41.initView$2$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SoundEffectFragment@9c41.initView$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
