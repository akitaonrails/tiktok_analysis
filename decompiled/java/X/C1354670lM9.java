package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS146S1100000_32;
import njp.a;

/* JADX INFO: renamed from: X.0lM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.photocomment.util.AIPhotoCommentHelperKt$enterAIChatPage$1$1", f = "AIPhotoCommentHelper.kt", l = {}, m = "invokeSuspend")
public final class C1354670lM9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C788550UwX LL;
    public final /* synthetic */ C07YI LLILLJJLI;
    public final /* synthetic */ C1347430lAT LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ OnActivityResultCallback LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354670lM9(C788550UwX c788550UwX, C07YI c07yi, C1347430lAT c1347430lAT, Context context, OnActivityResultCallback onActivityResultCallback, long j, InterfaceC1364105Vn<? super C1354670lM9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c788550UwX;
        this.LLILLJJLI = c07yi;
        this.LLILLL = c1347430lAT;
        this.LLILZ = context;
        this.LLILZIL = onActivityResultCallback;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354670lM9(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        C1C7U.LIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C788550UwX c788550UwX = this.LL;
        c788550UwX.LIZJ.removeCallbacksAndMessages(null);
        DialogC1389620mGW dialogC1389620mGW = c788550UwX.LIZIZ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        if (this.LLILLJJLI.LIZ.length() == 0) {
            new Object() { // from class: X.04lL
                public static final Map<String, String> LIZIZ = new HashMap();
            }.getClass();
            IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
            if (iToolsDebugGpService != null) {
                iToolsDebugGpService.isOpen();
            }
            Activity activityLIZ = C0FNT.LIZ(this.LLILZ);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131820730);
                c1389890mGx.LJIIJJI();
            }
        } else {
            C1347430lAT c1347430lAT = this.LLILLL;
            String str = this.LLILLJJLI.LIZ;
            C201955140j.LIZIZ(C1357140lQ8.LIZIZ.LIZ, " start genAIChatPageConfig");
            AIChatPageConfig aIChatPageConfigLIZ = C21300918Xn.LIZ(new AwS146S1100000_32(c1347430lAT, str, 13));
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService != null && (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) != null) {
                interfaceC21300818XmLIZ.LIZLLL(this.LLILZ, this.LLILZIL, aIChatPageConfigLIZ);
            }
        }
        C1347720lAw.LJIILIIL(this.LLILLL.LIZ, this.LLILZLL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
