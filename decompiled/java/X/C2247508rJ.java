package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectManager$fetchVoiceEffectWithCategory$1", f = "AudioEffectManager.kt", l = {129, 131, 144}, m = "invokeSuspend")
public final class C2247508rJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC2247808rM LL;
    public C2299808zk LLILLJJLI;
    public C2246808rC LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public final /* synthetic */ InterfaceC2247808rM LLILZLL;
    public final /* synthetic */ C2299808zk LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2247508rJ(InterfaceC2247808rM interfaceC2247808rM, C2299808zk c2299808zk, long j, InterfaceC1364105Vn<? super C2247508rJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = interfaceC2247808rM;
        this.LLIZ = c2299808zk;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2247508rJ(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2247508rJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
