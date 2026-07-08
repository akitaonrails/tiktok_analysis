package X;

import android.util.Base64;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09BP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.UDPSocketPlatformMisc$emitMessage$1", f = "UDPSocketPlatformMisc.kt", l = {}, m = "invokeSuspend")
public final class C09BP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ byte[] LL;
    public final /* synthetic */ C09BR LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09BP(byte[] bArr, C09BR c09br, int i, String str, int i2, String str2, int i3, int i4, InterfaceC1364105Vn<? super C09BP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bArr;
        this.LLILLJJLI = c09br;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = i2;
        this.LLILZLL = str2;
        this.LLIZ = i3;
        this.LLIZLLLIL = i4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09BP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UDPSocketPlatformMisc@e2cc.emitMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strEncodeToString = Base64.encodeToString(this.LL, 2);
        C09BR c09br = this.LLILLJJLI;
        int i = this.LLILLL;
        String str = this.LLILZ;
        c09br.LIZLLL(i, this.LLILZIL, this.LLIZ, this.LLIZLLLIL, strEncodeToString, str, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UDPSocketPlatformMisc@e2cc.emitMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
