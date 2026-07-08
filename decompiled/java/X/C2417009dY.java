package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.bytedance.router.monitor.RouterPageMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09dY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.nlehelper.NLEDebugToolHelper$dumpEffect$1$1$2", f = "NLEDebugToolHelper.kt", l = {}, m = "invokeSuspend")
public final class C2417009dY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20576115fL LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2417009dY(C20576115fL c20576115fL, String str, InterfaceC1364105Vn<? super C2417009dY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20576115fL;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2417009dY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLEDebugToolHelper@5b74.dumpEffect$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20576115fL c20576115fL = this.LL;
        C0VSJ c0vsj = new C0VSJ(this.LLILLJJLI);
        Context context = c20576115fL.LIZ.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c20576115fL.LIZ.getContext().getPackageName());
        sbLIZ.append(".fileprovider");
        Uri uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, C2188811AlT.LIZIZ(sbLIZ), c0vsj);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/zip");
        intent.putExtra("android.intent.extra.STREAM", uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
        intent.addFlags(1);
        Context context2 = c20576115fL.LIZ.getContext();
        Intent intentCreateChooser = Intent.createChooser(intent, "Dump Effect share");
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intentCreateChooser, "Context_startActivity_1");
        C1701330uNH.LIZ(intentCreateChooser, context2);
        C2204961BRm.LJJJJJL(context2, intentCreateChooser, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMncITBf/w0qS8JceSdRgotTbKNVkWLLj8wPWSNCpt", null));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NLEDebugToolHelper@5b74.dumpEffect$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
