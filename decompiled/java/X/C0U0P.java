package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U0P, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$handlePlayerAction$2", f = "KaraokeViewModel.kt", l = {1513, 1520, 1521, 1524, 1545, 1551, 1557, 1560, 1561, 1566, 1586, 1592, 1595, 1603}, m = "invokeSuspend")
public final class C0U0P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public KaraokeViewModel LL;
    public C0U22 LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final /* synthetic */ C0U0V LLILZIL;
    public final /* synthetic */ KaraokeViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U0P(C0U0V c0u0v, KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U0P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c0u0v;
        this.LLILZLL = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U0P(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0275 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:8:0x002b, B:14:0x0040, B:16:0x0048, B:18:0x0052, B:19:0x0068, B:21:0x0097, B:22:0x0099, B:28:0x00b1, B:32:0x00c1, B:34:0x00c7, B:36:0x00cf, B:38:0x00db, B:43:0x00f0, B:44:0x00f7, B:46:0x0108, B:48:0x0127, B:50:0x0142, B:51:0x0145, B:93:0x0231, B:95:0x023a, B:96:0x0245, B:103:0x0275, B:105:0x027d, B:107:0x0289, B:113:0x02a8, B:119:0x02c4, B:127:0x02de, B:55:0x0169, B:57:0x0171, B:59:0x017b, B:61:0x0196, B:62:0x019b, B:64:0x01b7, B:69:0x01d1, B:74:0x01e2, B:78:0x01f0, B:80:0x01f6, B:82:0x01fe, B:84:0x020a, B:89:0x021e, B:27:0x00ae, B:42:0x00ed, B:68:0x01ce, B:73:0x01df, B:88:0x021b, B:90:0x0225, B:92:0x022e, B:101:0x0270, B:112:0x02a5, B:118:0x02c1, B:124:0x02d8), top: B:144:0x0018, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289 A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:8:0x002b, B:14:0x0040, B:16:0x0048, B:18:0x0052, B:19:0x0068, B:21:0x0097, B:22:0x0099, B:28:0x00b1, B:32:0x00c1, B:34:0x00c7, B:36:0x00cf, B:38:0x00db, B:43:0x00f0, B:44:0x00f7, B:46:0x0108, B:48:0x0127, B:50:0x0142, B:51:0x0145, B:93:0x0231, B:95:0x023a, B:96:0x0245, B:103:0x0275, B:105:0x027d, B:107:0x0289, B:113:0x02a8, B:119:0x02c4, B:127:0x02de, B:55:0x0169, B:57:0x0171, B:59:0x017b, B:61:0x0196, B:62:0x019b, B:64:0x01b7, B:69:0x01d1, B:74:0x01e2, B:78:0x01f0, B:80:0x01f6, B:82:0x01fe, B:84:0x020a, B:89:0x021e, B:27:0x00ae, B:42:0x00ed, B:68:0x01ce, B:73:0x01df, B:88:0x021b, B:90:0x0225, B:92:0x022e, B:101:0x0270, B:112:0x02a5, B:118:0x02c1, B:124:0x02d8), top: B:144:0x0018, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02de A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:8:0x002b, B:14:0x0040, B:16:0x0048, B:18:0x0052, B:19:0x0068, B:21:0x0097, B:22:0x0099, B:28:0x00b1, B:32:0x00c1, B:34:0x00c7, B:36:0x00cf, B:38:0x00db, B:43:0x00f0, B:44:0x00f7, B:46:0x0108, B:48:0x0127, B:50:0x0142, B:51:0x0145, B:93:0x0231, B:95:0x023a, B:96:0x0245, B:103:0x0275, B:105:0x027d, B:107:0x0289, B:113:0x02a8, B:119:0x02c4, B:127:0x02de, B:55:0x0169, B:57:0x0171, B:59:0x017b, B:61:0x0196, B:62:0x019b, B:64:0x01b7, B:69:0x01d1, B:74:0x01e2, B:78:0x01f0, B:80:0x01f6, B:82:0x01fe, B:84:0x020a, B:89:0x021e, B:27:0x00ae, B:42:0x00ed, B:68:0x01ce, B:73:0x01df, B:88:0x021b, B:90:0x0225, B:92:0x022e, B:101:0x0270, B:112:0x02a5, B:118:0x02c1, B:124:0x02d8), top: B:144:0x0018, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023a A[Catch: all -> 0x02f2, TryCatch #0 {all -> 0x02f2, blocks: (B:8:0x002b, B:14:0x0040, B:16:0x0048, B:18:0x0052, B:19:0x0068, B:21:0x0097, B:22:0x0099, B:28:0x00b1, B:32:0x00c1, B:34:0x00c7, B:36:0x00cf, B:38:0x00db, B:43:0x00f0, B:44:0x00f7, B:46:0x0108, B:48:0x0127, B:50:0x0142, B:51:0x0145, B:93:0x0231, B:95:0x023a, B:96:0x0245, B:103:0x0275, B:105:0x027d, B:107:0x0289, B:113:0x02a8, B:119:0x02c4, B:127:0x02de, B:55:0x0169, B:57:0x0171, B:59:0x017b, B:61:0x0196, B:62:0x019b, B:64:0x01b7, B:69:0x01d1, B:74:0x01e2, B:78:0x01f0, B:80:0x01f6, B:82:0x01fe, B:84:0x020a, B:89:0x021e, B:27:0x00ae, B:42:0x00ed, B:68:0x01ce, B:73:0x01df, B:88:0x021b, B:90:0x0225, B:92:0x022e, B:101:0x0270, B:112:0x02a5, B:118:0x02c1, B:124:0x02d8), top: B:144:0x0018, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0268  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U0P.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
