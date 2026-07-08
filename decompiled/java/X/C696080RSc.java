package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photodownload.DownloadPhotoGlobal$onShareSuccess$4$1", f = "DownloadPhotoGlobal.kt", l = {}, m = "invokeSuspend")
public final class C696080RSc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C696080RSc(InterfaceC1364105Vn<? super C696080RSc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C696080RSc(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadPhotoGlobal@bbdf.onShareSuccess$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList(C1376010luZ.LJIILJJIL);
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i = 0;
        IWaterMarkService iWaterMarkService = (IWaterMarkService) PluggableExtentionKt.pluggableSpi$default(IWaterMarkService.class, false, false, false, 14, null);
        if (iWaterMarkService != null) {
            C1376010luZ.LIZ.getClass();
            iWaterMarkService.readAIGCAddAIPortraitWatermark(C1376010luZ.LJI, arrayList2);
        }
        int i2 = 0;
        for (Object obj2 : arrayList) {
            i++;
            if (i2 >= 0) {
                C1376010luZ c1376010luZ = C1376010luZ.LIZ;
                String str = (String) ListProtector.get(arrayList2, i2);
                c1376010luZ.getClass();
                C1376010luZ.LJII((String) obj2, str);
                i2 = i;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DownloadPhotoGlobal@bbdf.onShareSuccess$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C696080RSc(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
