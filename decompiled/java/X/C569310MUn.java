package X;

import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.EditServiceImpl$startEditorProChangeBanMusic$videoInfo$1", f = "EditServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C569310MUn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VEUtils.VEVideoFileInfo>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569310MUn(String str, InterfaceC1364105Vn<? super C569310MUn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C569310MUn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditServiceImpl@7fc6.startEditorProChangeBanMusic$videoInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(this.LL);
        if (videoFileInfo != null) {
            C1C7U.LIZIZ("EditServiceImpl@7fc6.startEditorProChangeBanMusic$videoInfo$1");
            return videoFileInfo;
        }
        throw new RuntimeException("videoInfo fail");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VEUtils.VEVideoFileInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
