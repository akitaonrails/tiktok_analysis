package X;

import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZX3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem$bindContent$3", f = "VoiceAssem.kt", l = {797}, m = "invokeSuspend")
public final class C0ZX3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VoiceAssem LLILLJJLI;
    public final /* synthetic */ C899830ZRt LLILLL;
    public final /* synthetic */ C899820ZRs LLILZ;
    public final /* synthetic */ C0ZXC LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZX3(VoiceAssem voiceAssem, C899830ZRt c899830ZRt, C899820ZRs c899820ZRs, C0ZXC c0zxc, InterfaceC1364105Vn<? super C0ZX3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = voiceAssem;
        this.LLILLL = c899830ZRt;
        this.LLILZ = c899820ZRs;
        this.LLILZIL = c0zxc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZX3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceAssem@7e6f.bindContent$3");
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
            C2252321DDq c2252321DDqLIZLLL = this.LLILLJJLI.LLLL.LIZLLL();
            IMVoiceMessageUtil.LIZ.getClass();
            C414301jJ c414301jJ = new C414301jJ(c2252321DDqLIZLLL, IMVoiceMessageUtil.LIZJ, new C0ZX2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null));
            this.LL = 1;
            if (C09IC.LJI(c414301jJ, this) == objLJFF) {
                C1C7U.LIZIZ("VoiceAssem@7e6f.bindContent$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceAssem@7e6f.bindContent$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
