package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.tako.aivideo.detail.alphaplayer.AlphaVideoConfig;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.08fH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.alphaplayer.TakoAlphaPlayerDataSourceParser$parseGuideAnimationFromGeckoDir$config$1", f = "TakoAlphaPlayerDataSourceParser.kt", l = {}, m = "invokeSuspend")
public final class C2172908fH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AlphaVideoConfig>, Object> {
    public final /* synthetic */ File LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172908fH(File file, InterfaceC1364105Vn<? super C2172908fH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2172908fH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAlphaPlayerDataSourceParser@ea55.parseGuideAnimationFromGeckoDir$config$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1301850jyx.LIZ.getClass();
        Object objFromJson = GsonProtectorUtils.fromJson((Gson) C1301850jyx.LIZIZ.getValue(), C09BH.LJI(this.LL, Charsets.UTF_8), (Class<Object>) AlphaVideoConfig.class);
        C1C7U.LIZIZ("TakoAlphaPlayerDataSourceParser@ea55.parseGuideAnimationFromGeckoDir$config$1");
        return objFromJson;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AlphaVideoConfig> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
