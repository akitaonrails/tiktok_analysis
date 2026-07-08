package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ZX9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem$onBind$3$1", f = "VoiceAssem.kt", l = {}, m = "invokeSuspend")
public final class C0ZX9 extends C09AX implements InterfaceC1631620sYq<EnumC430090Gtj, C432800Gy6, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ EnumC430090Gtj LL;
    public /* synthetic */ C432800Gy6 LLILLJJLI;
    public final /* synthetic */ VoiceAssem LLILLL;
    public final /* synthetic */ C0ZXC LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZX9(VoiceAssem voiceAssem, C0ZXC c0zxc, InterfaceC1364105Vn<? super C0ZX9> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = voiceAssem;
        this.LLILZ = c0zxc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceAssem@7e6f.onBind$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC430090Gtj enumC430090Gtj = this.LL;
        C432800Gy6 c432800Gy6 = this.LLILLJJLI;
        if ((enumC430090Gtj == EnumC430090Gtj.LOCKED || enumC430090Gtj == EnumC430090Gtj.PRESSED || c432800Gy6.LJII == EnumC432940GyK.PLAYING) && (this.LLILLL.LLLL.LIZLLL().getValue() instanceof C0ZX4)) {
            this.LLILLL.LLLL.LIZIZ(this.LLILZ.LLJ().LIZIZ.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceAssem@7e6f.onBind$3$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(EnumC430090Gtj enumC430090Gtj, C432800Gy6 c432800Gy6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0ZX9 c0zx9 = new C0ZX9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0zx9.LL = enumC430090Gtj;
        c0zx9.LLILLJJLI = c432800Gy6;
        return c0zx9.invokeSuspend(Unit.LIZ);
    }
}
