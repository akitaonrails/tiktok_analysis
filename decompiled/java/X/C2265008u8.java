package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.vesdk.VEUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08u8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.mixediting.UploadAssetsResult$generateMetaJson$deferred$1", f = "IMixEditingFeatureExtractionService.kt", l = {}, m = "invokeSuspend")
public final class C2265008u8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2268608ui LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<Pair<Bitmap, String>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2265008u8(C2268608ui c2268608ui, String str, List<Pair<Bitmap, String>> list, InterfaceC1364105Vn<? super C2265008u8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2268608ui;
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2265008u8 c2265008u8 = new C2265008u8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2265008u8.LL = obj;
        return c2265008u8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        int i;
        int i2;
        int i3;
        Object obj2;
        ConcurrentHashMap<String, n> concurrentHashMap;
        C1C7U.LIZ("UploadAssetsResult@c4b.generateMetaJson$deferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C013C c013c = new C013C();
        ConcurrentHashMap<String, n> concurrentHashMap2 = this.LLILLJJLI.LJIILJJIL;
        if (concurrentHashMap2 == null || (nVar = concurrentHashMap2.get(this.LLILLL)) == null) {
            nVar = new n();
            String str = this.LLILLL;
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
            boolean zLJIILL = C2286708xd.LJIILL(str);
            c013c.element = true;
            if (videoFileInfo != null) {
                i = videoFileInfo.width;
            } else {
                i = 0;
            }
            nVar.LJJIII(C2286608xc.LJ(i), "width");
            if (videoFileInfo != null) {
                i2 = videoFileInfo.height;
            } else {
                i2 = 0;
            }
            nVar.LJJIII(C2286608xc.LJ(i2), "height");
            if (!zLJIILL && videoFileInfo != null) {
                i3 = videoFileInfo.duration;
            } else {
                i3 = 0;
            }
            nVar.LJJIII(C2286608xc.LJ(i3), "duration");
            nVar.LJJII(Boolean.valueOf(!zLJIILL), "isVideo");
            nVar.LJJII(false, "hasAudio");
            nVar.LJJIIJ("path", str);
            nVar.LJJIFFI("meta", new h());
        }
        List<Pair<Bitmap, String>> list = this.LLILZ;
        try {
            h hVarLJIIL = nVar.LJJIIZ("meta").LJIIL();
            if (list != null) {
                for (Pair<Bitmap, String> pair : list) {
                    n nVar2 = new n();
                    nVar2.LJJIII(C2286608xc.LJ(pair.getFirst().getWidth()), "width");
                    nVar2.LJJIII(C2286608xc.LJ(pair.getFirst().getHeight()), "height");
                    nVar2.LJJIIJ("name", pair.getSecond());
                    hVarLJIIL.LJJIFFI(nVar2);
                }
            }
            C189200o6.m2constructorimpl(hVarLJIIL);
            obj2 = hVarLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LIZIZ("generateMetaJson", "generateMetaJson exception: " + thM5exceptionOrNullimpl);
        }
        if (c013c.element && (concurrentHashMap = this.LLILLJJLI.LJIILJJIL) != null) {
            concurrentHashMap.put(this.LLILLL, nVar);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UploadAssetsResult@c4b.generateMetaJson$deferred$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
