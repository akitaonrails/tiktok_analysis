package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08k0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$createAllFramesPackage$5$1", f = "MixEditingFeatureExtractionService.kt", l = {}, m = "invokeSuspend")
public final class C2202208k0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ZipOutputStream>, Object> {
    public final /* synthetic */ ZipOutputStream LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2202208k0(ZipOutputStream zipOutputStream, List<String> list, InterfaceC1364105Vn<? super C2202208k0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = zipOutputStream;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2202208k0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ZipOutputStream zipOutputStream;
        C1C7U.LIZ("MixEditingFeatureExtractionService@fa48.createAllFramesPackage$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            zipOutputStream = this.LL;
            C08SA.LJI(zipOutputStream, this.LLILLJJLI);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            zipOutputStream = this.LL;
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.createAllFramesPackage$5$1");
        return zipOutputStream;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ZipOutputStream> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
