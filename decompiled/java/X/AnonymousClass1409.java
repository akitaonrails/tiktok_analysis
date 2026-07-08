package X;

import android.app.Application;
import com.ss.android.ugc.aweme.ITTC2PAService;
import com.ss.android.ugc.aweme.aigc.C2PACacheItem;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1409, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PACacheManager$getCacheItem$1", f = "C2PACacheManager.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass1409 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MediaModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C2PACacheItem LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C15464063q LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1409(MediaModel mediaModel, boolean z, C2PACacheItem c2PACacheItem, long j, C15464063q c15464063q, InterfaceC1364105Vn<? super AnonymousClass1409> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mediaModel;
        this.LLILLJJLI = z;
        this.LLILLL = c2PACacheItem;
        this.LLILZ = j;
        this.LLILZIL = c15464063q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1409(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIGCInfo aIGCInfo;
        Set<Integer> errorCode;
        Integer num;
        int iIntValue;
        AIGCInfo aIGCInfo2;
        Set<Integer> errorCode2;
        Integer num2;
        C1C7U.LIZ("C2PACacheManager@f00c.getCacheItem$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C140D c140d = C140D.LIZ;
        Application applicationLIZ = C1BWL.LIZ();
        MediaModel mediaModel = this.LL;
        c140d.getClass();
        String strLJIJJ = C140D.LJIJJ(mediaModel);
        String str = "";
        if (strLJIJJ == null) {
            strLJIJJ = "";
        }
        String strLJIL = C140D.LJIL(applicationLIZ, strLJIJJ);
        if (strLJIL != null) {
            str = strLJIL;
        }
        int iIntValue2 = 0;
        String strLJIJI = C140D.LJIJI(str, false, this.LLILLJJLI);
        AnonymousClass1407.LIZ.getClass();
        C01GW c01gw = AnonymousClass1407.LJI;
        ITTC2PAService iTTC2PAService = (ITTC2PAService) c01gw.getValue();
        if (iTTC2PAService != null) {
            boolean z = this.LLILLJJLI;
            C2PACacheItem c2PACacheItem = this.LLILLL;
            if (c2PACacheItem != null && (aIGCInfo2 = c2PACacheItem.aigcInfo) != null && (errorCode2 = aIGCInfo2.getErrorCode()) != null && (num2 = (Integer) C13LP.LJJJLIIL(errorCode2)) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            iTTC2PAService.mobEvent("read_c2pa", strLJIJI, z, iIntValue, "", this.LLILZ, true, this.LLILZIL);
        }
        ITTC2PAService iTTC2PAService2 = (ITTC2PAService) c01gw.getValue();
        if (iTTC2PAService2 != null) {
            boolean z2 = this.LLILLJJLI;
            C2PACacheItem c2PACacheItem2 = this.LLILLL;
            if (c2PACacheItem2 != null && (aIGCInfo = c2PACacheItem2.aigcInfo) != null && (errorCode = aIGCInfo.getErrorCode()) != null && (num = (Integer) C13LP.LJJLIIIJJIZ(errorCode)) != null) {
                iIntValue2 = num.intValue();
            }
            iTTC2PAService2.mobEvent("get_ingredient", strLJIJI, z2, iIntValue2, "", this.LLILZ, true, this.LLILZIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("C2PACacheManager@f00c.getCacheItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
