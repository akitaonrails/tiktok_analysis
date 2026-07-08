package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.anchor.banner.PoiReTagBottomBarScene$reTag$1", f = "PoiRetagBottomBarAssem.kt", l = {786}, m = "invokeSuspend")
public final class C1199660hK8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ PoiReTagInfo LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;
    public final /* synthetic */ C1201010hMJ LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199660hK8(Aweme aweme, PoiReTagInfo poiReTagInfo, VideoItemParams videoItemParams, C1201010hMJ c1201010hMJ, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1199660hK8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = poiReTagInfo;
        this.LLILZ = videoItemParams;
        this.LLILZIL = c1201010hMJ;
        this.LLILZLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1199660hK8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:15:0x0045, B:16:0x0048, B:21:0x0051, B:22:0x0053, B:24:0x005b, B:26:0x0061, B:31:0x006d, B:32:0x0071, B:35:0x0079, B:37:0x007d, B:41:0x0089, B:44:0x0092, B:57:0x00aa, B:62:0x00bc, B:64:0x00c2, B:66:0x00c8, B:68:0x00d5, B:69:0x00d7, B:70:0x0187, B:73:0x01ab, B:81:0x01ba, B:82:0x01c2, B:84:0x01c6, B:85:0x01cc, B:9:0x0021, B:11:0x0031), top: B:93:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089 A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:15:0x0045, B:16:0x0048, B:21:0x0051, B:22:0x0053, B:24:0x005b, B:26:0x0061, B:31:0x006d, B:32:0x0071, B:35:0x0079, B:37:0x007d, B:41:0x0089, B:44:0x0092, B:57:0x00aa, B:62:0x00bc, B:64:0x00c2, B:66:0x00c8, B:68:0x00d5, B:69:0x00d7, B:70:0x0187, B:73:0x01ab, B:81:0x01ba, B:82:0x01c2, B:84:0x01c6, B:85:0x01cc, B:9:0x0021, B:11:0x0031), top: B:93:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092 A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:15:0x0045, B:16:0x0048, B:21:0x0051, B:22:0x0053, B:24:0x005b, B:26:0x0061, B:31:0x006d, B:32:0x0071, B:35:0x0079, B:37:0x007d, B:41:0x0089, B:44:0x0092, B:57:0x00aa, B:62:0x00bc, B:64:0x00c2, B:66:0x00c8, B:68:0x00d5, B:69:0x00d7, B:70:0x0187, B:73:0x01ab, B:81:0x01ba, B:82:0x01c2, B:84:0x01c6, B:85:0x01cc, B:9:0x0021, B:11:0x0031), top: B:93:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:15:0x0045, B:16:0x0048, B:21:0x0051, B:22:0x0053, B:24:0x005b, B:26:0x0061, B:31:0x006d, B:32:0x0071, B:35:0x0079, B:37:0x007d, B:41:0x0089, B:44:0x0092, B:57:0x00aa, B:62:0x00bc, B:64:0x00c2, B:66:0x00c8, B:68:0x00d5, B:69:0x00d7, B:70:0x0187, B:73:0x01ab, B:81:0x01ba, B:82:0x01c2, B:84:0x01c6, B:85:0x01cc, B:9:0x0021, B:11:0x0031), top: B:93:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6 A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:15:0x0045, B:16:0x0048, B:21:0x0051, B:22:0x0053, B:24:0x005b, B:26:0x0061, B:31:0x006d, B:32:0x0071, B:35:0x0079, B:37:0x007d, B:41:0x0089, B:44:0x0092, B:57:0x00aa, B:62:0x00bc, B:64:0x00c2, B:66:0x00c8, B:68:0x00d5, B:69:0x00d7, B:70:0x0187, B:73:0x01ab, B:81:0x01ba, B:82:0x01c2, B:84:0x01c6, B:85:0x01cc, B:9:0x0021, B:11:0x0031), top: B:93:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199660hK8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
