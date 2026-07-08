package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$searchSong$2", f = "KaraokeViewModel.kt", l = {1042, 1051, 1055, 1057, 1061, 1063, 1068, 1074}, m = "invokeSuspend")
public final class C765020Tzg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C765690U1v LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ KaraokeViewModel LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765020Tzg(String str, KaraokeViewModel karaokeViewModel, int i, boolean z, InterfaceC1364105Vn<? super C765020Tzg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = karaokeViewModel;
        this.LLILZLL = i;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765020Tzg(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[Catch: all -> 0x017a, TryCatch #0 {all -> 0x017a, blocks: (B:45:0x00d4, B:46:0x00d7, B:51:0x00ef, B:52:0x00f2, B:55:0x010a, B:59:0x0122, B:61:0x012a, B:65:0x0142, B:67:0x015c, B:35:0x00b0, B:36:0x00b3, B:39:0x00b9, B:41:0x00bd, B:24:0x006f, B:29:0x0086, B:31:0x0096, B:50:0x00ec, B:71:0x0176), top: B:82:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C765020Tzg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
