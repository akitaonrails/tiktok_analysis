package X;

import android.content.Context;
import com.ss.android.ugc.aweme.EffectImgCreator$Output;
import com.ss.android.ugc.aweme.IEffectConfig;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM$autoGenIcon$2", f = "EffectEditV2VM.kt", l = {}, m = "invokeSuspend")
public final class C1737100vIy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EffectEditV2VM LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ EnumC1736950vIj LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737100vIy(EffectEditV2VM effectEditV2VM, Context context, EnumC1736950vIj enumC1736950vIj, String str, InterfaceC1364105Vn<? super C1737100vIy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effectEditV2VM;
        this.LLILLJJLI = context;
        this.LLILLL = enumC1736950vIj;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1737100vIy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectEditV2VM@5973.autoGenIcon$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1737080vIw interfaceC1737080vIw = (InterfaceC1737080vIw) this.LL.LLILZIL.getValue();
        if (interfaceC1737080vIw != null) {
            Context context = this.LLILLJJLI;
            C1736960vIk c1736960vIk = EnumC1736950vIj.Companion;
            EnumC1736950vIj enumC1736950vIj = this.LLILLL;
            c1736960vIk.getClass();
            C1557090qcd c1557090qcd = new C1557090qcd(new C1737190vJ7(C1736960vIk.LIZ(enumC1736950vIj), new IEffectConfig.RemoteEffect(this.LLILZ)), 5);
            final EffectEditV2VM effectEditV2VM = this.LL;
            final EnumC1736950vIj enumC1736950vIj2 = this.LLILLL;
            interfaceC1737080vIw.LJ(context, c1557090qcd, new InterfaceC1737610vJn() { // from class: X.0vJJ
                @Override // X.InterfaceC1737610vJn
                public final void LIZ() {
                    effectEditV2VM.xQ2(enumC1736950vIj2, null);
                }

                @Override // X.InterfaceC1737610vJn
                public final void LIZIZ(EffectImgCreator$Output effectImgCreator$Output) {
                    effectEditV2VM.xQ2(enumC1736950vIj2, effectImgCreator$Output);
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditV2VM@5973.autoGenIcon$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
