package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import java.io.File;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$handleMediaCopy$2", f = "EditServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C569010MTj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EditConfig LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569010MTj(C259800zU<String> c259800zU, String str, EditConfig editConfig, InterfaceC1364105Vn<? super C569010MTj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = str;
        this.LLILLL = editConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C569010MTj(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EditServiceImpl@7fc6.handleMediaCopy$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.element = UUID.randomUUID().toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IExternalService) ServiceManager.get().getService(IExternalService.class)).creativeStandardPath().genCreativePath(this.LL.element));
        sbLIZ.append(File.separator);
        sbLIZ.append(new C0VSJ(this.LLILLJJLI).getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C08QA.LJIILLIIL(new C0VSJ(this.LLILLJJLI), new C0VSJ(strLIZIZ), false, 6);
        this.LLILLL.setMediaInfo(new VideoMedia(strLIZIZ));
        this.LLILLL.setCreationId(this.LL.element);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditServiceImpl@7fc6.handleMediaCopy$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
