package Y;

import X.C0CHQ;
import X.C0VSJ;
import X.C1432030nMv;
import X.C1439160nYQ;
import X.C1447720nmE;
import X.C1C7U;
import X.C2298208zU;
import X.C2488709p7;
import X.C2489809pI;
import X.EnumC20228214Cy;
import X.InterfaceC1631620sYq;
import X.RunnableC1432010nMt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS35S0500000_22 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS35S0500000_22 aCallableS35S0500000_22) {
        C1C7U.LIZ("ImageModeExtKt@da1.compileTempImages$1");
        File fileLIZIZ = C2489809pI.LIZIZ((CreativeInfo) aCallableS35S0500000_22.l0);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Map map = (Map) aCallableS35S0500000_22.l1;
        ImageAlbumData imageAlbumData = (ImageAlbumData) aCallableS35S0500000_22.l2;
        CreativeModel creativeModel = (CreativeModel) aCallableS35S0500000_22.l3;
        CreativeInfo creativeInfo = (CreativeInfo) aCallableS35S0500000_22.l0;
        Function0 function0 = (Function0) aCallableS35S0500000_22.l4;
        for (Map.Entry entry : map.entrySet()) {
            String path = fileLIZIZ.getPath();
            C2488709p7 c2488709p7 = C2488709p7.LIZ;
            int iIntValue = ((Number) entry.getValue()).intValue();
            c2488709p7.getClass();
            String path2 = new C0VSJ(path, C2488709p7.LJIIIIZZ(iIntValue)).getPath();
            boolean autoEnhanceOn = imageAlbumData.getAutoEnhanceOn();
            new RunnableC1432010nMt((SingleImageData) entry.getKey(), imageAlbumData, creativeModel, path2, new C1432030nMv(false, Boolean.valueOf(autoEnhanceOn), C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.VE_PREVIEW_WORKSPACE, null, false, 12), creativeModel.imageEditModel.map, false), new C1447720nmE(entry, atomicInteger, map, path2, autoEnhanceOn, function0), (InterfaceC1631620sYq) null, 192).run();
            imageAlbumData = imageAlbumData;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageModeExtKt@da1.compileTempImages$1");
        return unit;
    }

    public static final Object call$1(ACallableS35S0500000_22 aCallableS35S0500000_22) throws Throwable {
        C1C7U.LIZ("SavePhotoStickerManager@3a8c.process$2");
        ((C1439160nYQ) aCallableS35S0500000_22.l0).LIZIZ(((AwemeDraft) aCallableS35S0500000_22.l1).LIZIZ(), (ArrayList) aCallableS35S0500000_22.l2, (AtomicInteger) aCallableS35S0500000_22.l3, (ArrayList) aCallableS35S0500000_22.l4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SavePhotoStickerManager@3a8c.process$2");
        return unit;
    }

    public ACallableS35S0500000_22(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj4;
        this.l2 = obj3;
        this.l3 = obj2;
        this.l4 = obj5;
    }
}
