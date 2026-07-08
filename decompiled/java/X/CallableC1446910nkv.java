package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IBusinessPublishService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class CallableC1446910nkv<V> implements Callable {
    public final /* synthetic */ ToolsActivityAssem LL;

    public CallableC1446910nkv(ToolsActivityAssem toolsActivityAssem) {
        this.LL = toolsActivityAssem;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("ToolsActivityAssem@6e7.doLazyDoInitInBgThread$1");
        final ToolsActivityAssem toolsActivityAssem = this.LL;
        toolsActivityAssem.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(toolsActivityAssem);
        if (c19egLIZ != null) {
            ((IBusinessPublishService) ServiceManager.get().getService(IBusinessPublishService.class)).initWaterMark();
            final IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
            iAVPublishServicePublishService.registerPublishProgressCallback(C724240Sb0.LIZ(toolsActivityAssem), new InterfaceC1447760nmI() { // from class: X.0nku
                @Override // X.InterfaceC1447760nmI
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1447760nmI
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1447760nmI
                public final void LIZ(Boolean bool, String str) {
                    boolean booleanExtra;
                    AbstractC1387200mCc abstractC1387200mCc;
                    Intent intent;
                    C19EG c19egLIZ2;
                    Intent intent2;
                    C19EG c19egLIZ3 = C724240Sb0.LIZ(toolsActivityAssem);
                    int i = 0;
                    if (c19egLIZ3 != null && (intent = c19egLIZ3.getIntent()) != null) {
                        booleanExtra = intent.getBooleanExtra("insert_now_post_without_landing", false);
                        if (booleanExtra && (c19egLIZ2 = C724240Sb0.LIZ(toolsActivityAssem)) != null && (intent2 = c19egLIZ2.getIntent()) != null) {
                            intent2.removeExtra("insert_now_post_without_landing");
                        }
                    } else {
                        booleanExtra = false;
                    }
                    PublishModel publishModel = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getPublishModel(str);
                    if ((publishModel == null || !publishModel.LIZ) && !toolsActivityAssem.LLILZIL.contains(str)) {
                        toolsActivityAssem.LLILZIL.add(str);
                        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                        int length = abstractC1387200mCcArrLJII.length;
                        while (true) {
                            if (i < length) {
                                abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
                                if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                                    break;
                                } else {
                                    i++;
                                }
                            } else {
                                abstractC1387200mCc = null;
                                break;
                            }
                        }
                        iAVPublishServicePublishService.processMainActivityCallback(abstractC1387200mCc, str, false, booleanExtra, bool);
                    }
                }
            }, toolsActivityAssem);
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abnormalExitLogService().logAppAbnormalExit();
            IAVPublishService iAVPublishServicePublishService2 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
            iAVPublishServicePublishService2.retryMissedSaveLocalAfterModeration();
            iAVPublishServicePublishService2.triggerDraftPublishNotificationIfNeeded();
            if (!toolsActivityAssem.LL) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().tryRestorePublish(c19egLIZ, false, new C20599015j2(c19egLIZ, toolsActivityAssem));
            }
            IMainService iMainService = (IMainService) ServiceManager.get().getService(IMainService.class);
            if (iMainService.isLastPublishFailed()) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(2131836417);
                c1389890mGx.LJIIJJI();
                iMainService.setLastPublishFailed(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolsActivityAssem@6e7.doLazyDoInitInBgThread$1");
        return unit;
    }
}
