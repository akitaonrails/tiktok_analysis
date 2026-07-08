package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.dynamic.card.data.DynamicClientData;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ivc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.utils.DynamicCardPerOptKitImpl$preload$2$1$1", f = "DynamicCardPerOptKitImpl.kt", l = {}, m = "invokeSuspend")
public final class C482220Ivc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482220Ivc(String str, boolean z, InterfaceC1364105Vn<? super C482220Ivc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C482220Ivc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        C1C7U.LIZ("DynamicCardPerOptKitImpl@6a5b.preload$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strDecode = URLDecoder.decode(this.LL, "UTF-8");
        if (this.LLILLJJLI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strDecode);
            sbLIZ.append("&thread_strategy=2");
            strDecode = C2188811AlT.LIZIZ(sbLIZ);
        }
        SparkContext sparkContextLIZJ = C1538140q84.LIZ.LIZJ(strDecode, new C1538590q8n());
        sparkContextLIZJ.LJJJJZ(new AbstractC1539010q9T() { // from class: X.18SS
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                if (!(interfaceC1531560pxS instanceof C1537910q7h)) {
                    return;
                }
                C13DA c13da = new C13DA();
                C0OFE.LIZ("__client_data", C1058250de3.LIZLLL(new DynamicClientData(null, null, C18SX.MessageNormal.getValue(), null, C2097608Jq.LJ(), true, C2097608Jq.LJ(), C2097608Jq.LJ())));
                ((C1537910q7h) interfaceC1531560pxS).LJIJJ = TemplateData.LJII(c13da.build());
            }
        });
        C1537060q6K.LJIIJJI(C1529590puH.LIZ, strDecode, "dm_dynamic_card", sparkContextLIZJ, null, true, null, 40);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicCardPerOptKitImpl@6a5b.preload$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
