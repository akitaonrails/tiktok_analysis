package X;

import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.audiodownload.impl.TTSImpl$createText2Audio$2", f = "TTSImpl.kt", l = {}, m = "invokeSuspend")
public final class C2374309Sb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C2374409Sc LLILZ;
    public final /* synthetic */ ITTSCallback LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2374309Sb(String str, String str2, boolean z, C2374409Sc c2374409Sc, ITTSCallback iTTSCallback, String str3, InterfaceC1364105Vn<? super C2374309Sb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = c2374409Sc;
        this.LLILZIL = iTTSCallback;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2374309Sb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[Catch: 0ozz -> 0x0104, TryCatch #0 {0ozz -> 0x0104, blocks: (B:3:0x000b, B:5:0x0026, B:7:0x002a, B:14:0x004f, B:16:0x0053, B:18:0x0097, B:19:0x0099, B:21:0x00ac, B:23:0x00ca, B:24:0x00cc, B:26:0x00fb, B:27:0x00fd, B:10:0x003f, B:8:0x002c), top: B:33:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca A[Catch: 0ozz -> 0x0104, TryCatch #0 {0ozz -> 0x0104, blocks: (B:3:0x000b, B:5:0x0026, B:7:0x002a, B:14:0x004f, B:16:0x0053, B:18:0x0097, B:19:0x0099, B:21:0x00ac, B:23:0x00ca, B:24:0x00cc, B:26:0x00fb, B:27:0x00fd, B:10:0x003f, B:8:0x002c), top: B:33:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb A[Catch: 0ozz -> 0x0104, TryCatch #0 {0ozz -> 0x0104, blocks: (B:3:0x000b, B:5:0x0026, B:7:0x002a, B:14:0x004f, B:16:0x0053, B:18:0x0097, B:19:0x0099, B:21:0x00ac, B:23:0x00ca, B:24:0x00cc, B:26:0x00fb, B:27:0x00fd, B:10:0x003f, B:8:0x002c), top: B:33:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2374309Sb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
