package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pKL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.network.ProtobufUtilKt$rdProtobufDecodeEvent$1", f = "ProtobufUtil.kt", l = {}, m = "invokeSuspend")
public final class C1507310pKL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1507360pKQ<?> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507310pKL(String str, String str2, long j, boolean z, String str3, InterfaceC1507360pKQ<?> interfaceC1507360pKQ, String str4, InterfaceC1364105Vn<? super C1507310pKL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = str3;
        this.LLILZLL = interfaceC1507360pKQ;
        this.LLIZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1507310pKL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String name;
        C1C7U.LIZ("ProtobufUtilKt@aa56.rdProtobufDecodeEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        long j = this.LLILLL;
        boolean z = this.LLILZ;
        String str3 = this.LLILZIL;
        InterfaceC1507360pKQ<?> interfaceC1507360pKQ = this.LLILZLL;
        String str4 = this.LLIZ;
        if (str != null) {
            linkedHashMap.put("path", str);
        }
        if (str2 != null) {
            linkedHashMap.put("ec_biz_scene", str2);
        }
        linkedHashMap.put("decode_cost", C2286608xc.LJFF(j));
        linkedHashMap.put("is_success", Boolean.valueOf(z));
        if (str3 == null) {
            str3 = "unknown";
        }
        linkedHashMap.put("content_type", str3);
        if (interfaceC1507360pKQ == null || (name = interfaceC1507360pKQ.getName()) == null) {
            name = "fallback";
        }
        linkedHashMap.put("decode_type", name);
        if (str4 != null) {
            linkedHashMap.put("error_msg", str4);
        }
        C1018703yb.LJ("rd_tiktokec_protobuf_decode", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProtobufUtilKt@aa56.rdProtobufDecodeEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
