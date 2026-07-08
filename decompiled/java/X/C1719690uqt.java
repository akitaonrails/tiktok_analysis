package X;

import com.bytedance.pipo.stellar.base.resourceloader.StellarChunk;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.portal.PortalResourceLoader$load$2", f = "PortalResourceLoader.kt", l = {47}, m = "invokeSuspend")
public final class C1719690uqt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<StellarChunk>>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1719680uqs LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1719700uqu LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719690uqt(C1719680uqs c1719680uqs, boolean z, String str, InterfaceC1719700uqu interfaceC1719700uqu, InterfaceC1364105Vn<? super C1719690uqt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1719680uqs;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = interfaceC1719700uqu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1719690uqt(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<StellarChunk>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1719690uqt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
