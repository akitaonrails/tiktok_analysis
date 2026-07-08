package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09dF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effectdebugger.EffectDebuggerComponent$handleCmdButtonClick$2$1", f = "EffectDebuggerComponent.kt", l = {205}, m = "invokeSuspend")
public final class C2415109dF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ File LLILLJJLI;
    public final /* synthetic */ C2416009dO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415109dF(File file, C2416009dO c2416009dO, InterfaceC1364105Vn<? super C2415109dF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = file;
        this.LLILLL = c2416009dO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2415109dF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        File parentFile;
        String strLJFF;
        C1C7U.LIZ("EffectDebuggerComponent@97b3.handleCmdButtonClick$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            File[] fileArrListFiles = this.LLILLJJLI.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0 && (parentFile = this.LLILLJJLI.getParentFile()) != null && (strLJFF = C08SA.LJFF(parentFile.getAbsolutePath(), "CMD.zip", Collections.singletonList(this.LLILLJJLI.getAbsolutePath()))) != null && strLJFF.length() != 0) {
                C0VSJ c0vsj = new C0VSJ(strLJFF);
                Context contextRequireSceneContext = this.LLILLL.LLJJ.requireSceneContext();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(contextRequireSceneContext.getPackageName());
                sbLIZ.append(".fileprovider");
                Uri uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(contextRequireSceneContext, C2188811AlT.LIZIZ(sbLIZ), c0vsj);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/zip");
                intent.putExtra("android.intent.extra.STREAM", uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
                intent.addFlags(1);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C2415009dE c2415009dE = new C2415009dE(contextRequireSceneContext, intent, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c2415009dE) == objLJFF) {
                    C1C7U.LIZIZ("EffectDebuggerComponent@97b3.handleCmdButtonClick$2$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDebuggerComponent@97b3.handleCmdButtonClick$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
