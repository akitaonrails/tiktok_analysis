package X;

import android.content.Context;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponseV2;
import com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.map.PoiBackgroundMapComponent$drawPopupView$1$1", f = "PoiBackgroundMapComponent.kt", l = {491, 507, 508}, m = "invokeSuspend")
public final class C1177260gk0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C1177360gkA LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ List<PoiGeneralCard> LLILZ;
    public final /* synthetic */ PoiBackgroundMapComponent LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177260gk0(List<PoiGeneralCard> list, PoiBackgroundMapComponent poiBackgroundMapComponent, Context context, PoiDiscoveryApi$PoiDiscoveryCardListResponseV2 poiDiscoveryApi$PoiDiscoveryCardListResponseV2, InterfaceC1364105Vn<? super C1177260gk0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = list;
        this.LLILZIL = poiBackgroundMapComponent;
        this.LLILZLL = context;
        this.LLIZ = poiDiscoveryApi$PoiDiscoveryCardListResponseV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1177260gk0(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177260gk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
