package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ZX2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem$bindContent$3$1", f = "VoiceAssem.kt", l = {}, m = "invokeSuspend")
public final class C0ZX2 extends C09AX implements InterfaceC1631620sYq<C0ZX0, List<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ C0ZX0 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VoiceAssem LLILLL;
    public final /* synthetic */ C899830ZRt LLILZ;
    public final /* synthetic */ C899820ZRs LLILZIL;
    public final /* synthetic */ C0ZXC LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZX2(VoiceAssem voiceAssem, C899830ZRt c899830ZRt, C899820ZRs c899820ZRs, C0ZXC c0zxc, InterfaceC1364105Vn<? super C0ZX2> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = voiceAssem;
        this.LLILZ = c899830ZRt;
        this.LLILZIL = c899820ZRs;
        this.LLILZLL = c0zxc;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZX2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C0ZX0 c0zx0, List<? extends String> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0ZX2 c0zx2 = new C0ZX2(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0zx2.LL = c0zx0;
        c0zx2.LLILLJJLI = list;
        return c0zx2.invokeSuspend(Unit.LIZ);
    }
}
