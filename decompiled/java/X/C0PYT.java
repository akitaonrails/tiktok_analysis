package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PYT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.mob.SingleSearchLynxLoadInfo$sendLoadFinish$1", f = "SingleSearchLynxLoadInfo.kt", l = {}, m = "invokeSuspend")
public final class C0PYT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DynamicPatch LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PYT(DynamicPatch dynamicPatch, String str, long j, boolean z, InterfaceC1364105Vn<? super C0PYT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dynamicPatch;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PYT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String rawData;
        C1C7U.LIZ("SingleSearchLynxLoadInfo@7505.sendLoadFinish$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C647990PbJ c647990PbJ = C647990PbJ.LIZ;
        DynamicPatch dynamicPatch = this.LL;
        c647990PbJ.getClass();
        int iLIZ = C647990PbJ.LIZ(dynamicPatch);
        C647890Pb9 c647890Pb9 = new C647890Pb9();
        c647890Pb9.LJIIZILJ("type", "load_success");
        c647890Pb9.LJIIZILJ("schema", this.LLILLJJLI);
        c647890Pb9.LJIIZILJ("load_time", String.valueOf(this.LLILLL));
        if (this.LLILZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c647890Pb9.LJIIZILJ("preload", str);
        int length = 0;
        int i = 1;
        if (iLIZ != 1) {
            i = 0;
        }
        c647890Pb9.LJIIZILJ("is_built_in", String.valueOf(i));
        c647890Pb9.LJJIFFI(2);
        DynamicPatch dynamicPatch2 = this.LL;
        if (dynamicPatch2 != null && (rawData = dynamicPatch2.getRawData()) != null) {
            length = rawData.length();
        }
        c647890Pb9.LJIIZILJ("raw_data_size", String.valueOf(length));
        c647890Pb9.LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleSearchLynxLoadInfo@7505.sendLoadFinish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
