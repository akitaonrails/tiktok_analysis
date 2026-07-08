package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.bytedance.router.monitor.RouterPageMonitor;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09dH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effectdebugger.EffectDebuggerComponent$handleButtonClick$1", f = "EffectDebuggerComponent.kt", l = {92, 123}, m = "invokeSuspend")
public final class C2415309dH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2415509dJ LLILLJJLI;
    public final /* synthetic */ File LLILLL;
    public final /* synthetic */ C2416009dO LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415309dH(C2415509dJ c2415509dJ, File file, C2416009dO c2416009dO, InterfaceC1364105Vn<? super C2415309dH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2415509dJ;
        this.LLILLL = file;
        this.LLILZ = c2416009dO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2415309dH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectDebuggerComponent@97b3.handleButtonClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    String str = (String) obj;
                    if (str != null && str.length() != 0) {
                        C0VSJ c0vsj = new C0VSJ(str);
                        Context contextRequireSceneContext = this.LLILZ.LLJJ.requireSceneContext();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(contextRequireSceneContext.getPackageName());
                        sbLIZ.append(".fileprovider");
                        Uri uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(contextRequireSceneContext, C2188811AlT.LIZIZ(sbLIZ), c0vsj);
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("application/zip");
                        intent.putExtra("android.intent.extra.STREAM", uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
                        intent.addFlags(1);
                        Intent intentCreateChooser = Intent.createChooser(intent, "Share Zip File");
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextRequireSceneContext, intentCreateChooser, "Context_startActivity_1");
                        C1701330uNH.LIZ(intentCreateChooser, contextRequireSceneContext);
                        C2204961BRm.LJJJJJL(contextRequireSceneContext, intentCreateChooser, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhmcbMncIYD/z91Lyo2/SmAnH9TZCEfHeahhf5imDltCoTyYC/EsxvyxloRg==", null));
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EffectDebuggerComponent@97b3.handleButtonClick$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C2415409dI c2415409dI = new C2415409dI(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c2415409dI) == objLJFF) {
                C1C7U.LIZIZ("EffectDebuggerComponent@97b3.handleButtonClick$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getClass();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectDebuggerComponent@97b3.handleButtonClick$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
