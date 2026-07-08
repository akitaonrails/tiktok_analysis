package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01sK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.detail.keyframe.util.TakoKeyframeImageLoadUtil$loadImagesFromThumb$4$1", f = "TakoKeyframeImageLoadUtil.kt", l = {}, m = "invokeSuspend")
public final class C470201sK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C470201sK(InterfaceC1364105Vn<? super C470201sK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C470201sK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoKeyframeImageLoadUtil@d977.loadImagesFromThumb$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C01GW c01gw = C470301sL.LIZ;
            if (((File) c01gw.getValue()).exists()) {
                File[] fileArrListFiles = ((File) c01gw.getValue()).listFiles();
                if (((File) c01gw.getValue()).isDirectory() && fileArrListFiles != null) {
                    C089E c089e = new C089E(fileArrListFiles);
                    while (c089e.hasNext()) {
                        ((File) c089e.next()).delete();
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoKeyframeImageLoadUtil@d977.loadImagesFromThumb$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C470201sK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
