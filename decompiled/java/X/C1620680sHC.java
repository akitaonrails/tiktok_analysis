package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620680sHC extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            case 3:
                onLoad$3(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        if (2 - this.$t != 0) {
            super.onOK();
        } else {
            onOK$0(this);
        }
    }

    public static final void onOK$0(C1620680sHC c1620680sHC) {
        BottomPublishObserver bottomPublishObserver = (BottomPublishObserver) c1620680sHC.l1;
        if (bottomPublishObserver.LLILZLL == null) {
            bottomPublishObserver.LLILZLL = new CreativityToolsPluginUpdater();
        }
        CreativityToolsPluginUpdater creativityToolsPluginUpdater = bottomPublishObserver.LLILZLL;
        if (creativityToolsPluginUpdater != null) {
            creativityToolsPluginUpdater.LIZ();
        }
    }

    public static final void onLoad$0(C1620680sHC c1620680sHC, AsyncAVService asyncAVService, long j) {
        Integer defaultTab;
        boolean zIsBroadcastSmoothGoLive = asyncAVService.uiService().recordService().isBroadcastSmoothGoLive();
        RecordConfig recordConfig = (RecordConfig) c1620680sHC.l0;
        if (recordConfig != null && (defaultTab = recordConfig.getDefaultTab()) != null && defaultTab.intValue() == 2 && zIsBroadcastSmoothGoLive) {
            asyncAVService.uiService().recordService().startIndependentLiveActivity((C19EG) c1620680sHC.l1, (RecordConfig) c1620680sHC.l0);
        } else {
            if (((RecordConfig) c1620680sHC.l0) == null) {
                return;
            }
            asyncAVService.uiService().recordService().startRecord((C19EG) c1620680sHC.l1, (RecordConfig) c1620680sHC.l0);
            if (!Intrinsics.LJFF(((RecordConfig) c1620680sHC.l0).getEnsureLaunchOnlyOnceFromThirdParty(), Boolean.TRUE)) {
                return;
            }
            ((Intent) c1620680sHC.l2).removeExtra("EXTRA_AV_RECORD_CONFIG");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onLoad$1(C1620680sHC c1620680sHC, AsyncAVService asyncAVService, long j) {
        MainActivityScope mainActivityScopeLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        PublishTabAbility publishTabAbility;
        C19EG c19egLIZJ = ((C632290Or5) c1620680sHC.l0).LIZJ((Context) c1620680sHC.l1);
        if (c19egLIZJ != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZJ)) != null && (interfaceC665370Q7z = mainActivityScopeLIZJ.LL) != null && (publishTabAbility = (PublishTabAbility) C1558520qew.LIZJ(interfaceC665370Q7z, PublishTabAbility.class)) != null && publishTabAbility.D80()) {
            if (Intrinsics.LJFF(publishTabAbility.getResourceType(), "template")) {
                asyncAVService.uiService().recordService().enterRecordPageInTemplate((Context) c1620680sHC.l1, ((RecordConfig.Builder) ((C259800zU) c1620680sHC.l2).element).build());
            } else {
                asyncAVService.uiService().recordService().startSpecialPlusEntrance((Context) c1620680sHC.l1, ((RecordConfig.Builder) ((C259800zU) c1620680sHC.l2).element).build());
            }
            publishTabAbility.Bn0();
        } else {
            asyncAVService.uiService().recordService().startRecord((Context) c1620680sHC.l1, ((RecordConfig.Builder) ((C259800zU) c1620680sHC.l2).element).build());
        }
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null) {
            iMainService.changeStatusBarMainTab(C1388190mED.LIZ((Context) c1620680sHC.l1), "PUBLISH");
        }
        C1618230sDF.LIZIZ.LIZ.getClass();
    }

    public static final void onLoad$2(C1620680sHC c1620680sHC, AsyncAVService asyncAVService, long j) {
        PublishTabAbility publishTabAbility = (PublishTabAbility) c1620680sHC.l0;
        if (publishTabAbility != null && publishTabAbility.D80()) {
            if (Intrinsics.LJFF(((PublishTabAbility) c1620680sHC.l0).getResourceType(), "template")) {
                asyncAVService.uiService().recordService().enterRecordPageInTemplate(((BottomPublishObserver) c1620680sHC.l1).LLILLJJLI, ((RecordConfig.Builder) c1620680sHC.l2).build());
            } else {
                asyncAVService.uiService().recordService().startSpecialPlusEntrance(((BottomPublishObserver) c1620680sHC.l1).LLILLJJLI, ((RecordConfig.Builder) c1620680sHC.l2).build());
            }
            PublishTabAbility publishTabAbility2 = (PublishTabAbility) c1620680sHC.l0;
            if (publishTabAbility2 != null) {
                publishTabAbility2.Bn0();
            }
        } else {
            asyncAVService.uiService().recordService().startRecord(((BottomPublishObserver) c1620680sHC.l1).LLILLJJLI, ((RecordConfig.Builder) c1620680sHC.l2).build());
        }
        C19267810Zo.LIZ(((BottomPublishObserver) c1620680sHC.l1).LLILLJJLI, "PUBLISH");
        C1618230sDF.LIZIZ.LIZ.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onLoad$3(C1620680sHC c1620680sHC, AsyncAVService asyncAVService, long j) {
        MainActivityScope mainActivityScopeLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        PublishTabAbility publishTabAbility;
        C19EG c19egLIZJ = ((C634800Ov8) c1620680sHC.l0).LIZJ((Context) c1620680sHC.l1);
        if (c19egLIZJ != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZJ)) != null && (interfaceC665370Q7z = mainActivityScopeLIZJ.LL) != null && (publishTabAbility = (PublishTabAbility) C1558520qew.LIZJ(interfaceC665370Q7z, PublishTabAbility.class)) != null && publishTabAbility.D80()) {
            if (Intrinsics.LJFF(publishTabAbility.getResourceType(), "template")) {
                asyncAVService.uiService().recordService().enterRecordPageInTemplate((Context) c1620680sHC.l1, ((RecordConfig.Builder) ((C259800zU) c1620680sHC.l2).element).build());
            } else {
                asyncAVService.uiService().recordService().startSpecialPlusEntrance((Context) c1620680sHC.l1, ((RecordConfig.Builder) ((C259800zU) c1620680sHC.l2).element).build());
            }
            publishTabAbility.Bn0();
        } else {
            asyncAVService.uiService().recordService().startRecord((Context) c1620680sHC.l1, ((RecordConfig.Builder) ((C259800zU) c1620680sHC.l2).element).build());
        }
        IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (iMainService != null) {
            iMainService.changeStatusBarMainTab(C1388190mED.LIZ((Context) c1620680sHC.l1), "PUBLISH");
        }
        C1618230sDF.LIZIZ.LIZ.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1620680sHC(Object obj, C632290Or5 c632290Or5, Context context, C259800zU<RecordConfig.Builder> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = c632290Or5;
        this.l2 = context;
    }
}
