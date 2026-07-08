package X;

import com.ss.android.ugc.aweme.ecommerce.proto.EcomProtobufServiceImpl;

/* JADX INFO: renamed from: X.0pZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.proto.EcomProtobufServiceImpl", f = "EcomProtobufServiceImpl.kt", l = {60}, m = "decodeResponse")
public final class C1517010pZz<T> extends AbstractC23140094w {
    public Object LL;
    public InterfaceC1507360pKQ LLILLJJLI;
    public byte[] LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ EcomProtobufServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1517010pZz(EcomProtobufServiceImpl ecomProtobufServiceImpl, InterfaceC1364105Vn<? super C1517010pZz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = ecomProtobufServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomProtobufServiceImpl@ee97.decodeResponse$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("EcomProtobufServiceImpl@ee97.decodeResponse$1");
        return objLIZ;
    }
}
