package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.touchpoint.api.model.TaskDoneData;
import com.bytedance.touchpoint.api.model.TaskDoneReponse;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.service.IInteractiveService;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings;
import com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336410ks implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$0(C19336410ks c19336410ks) {
    }

    public static final void onComplete$1(C19336410ks c19336410ks) {
    }

    public static final void onComplete$2(C19336410ks c19336410ks) {
    }

    public static final void onComplete$3(C19336410ks c19336410ks) {
    }

    public static final void onComplete$4(C19336410ks c19336410ks) {
    }

    public static final void onComplete$5(C19336410ks c19336410ks) {
    }

    public static final void onError$0(C19336410ks c19336410ks, Throwable th) {
    }

    public static final void onError$1(C19336410ks c19336410ks, Throwable th) {
    }

    public static final void onSubscribe$0(C19336410ks c19336410ks, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C19336410ks c19336410ks, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$2(C19336410ks c19336410ks, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$3(C19336410ks c19336410ks, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$5(C19336410ks c19336410ks, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
            case 2:
                onComplete$2(this);
                break;
            case 3:
                onComplete$3(this);
                break;
            case 4:
                onComplete$4(this);
                break;
            case 5:
                onComplete$5(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
            case 2:
                onError$2(this, th);
                break;
            case 3:
                onError$3(this, th);
                break;
            case 4:
                onError$4(this, th);
                break;
            case 5:
                onError$5(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
            case 2:
                onNext$2(this, obj);
                break;
            case 3:
                onNext$3(this, obj);
                break;
            case 4:
                onNext$4(this, obj);
                break;
            case 5:
                onNext$5(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
            case 2:
                onSubscribe$2(this, interfaceC420801kM);
                break;
            case 3:
                onSubscribe$3(this, interfaceC420801kM);
                break;
            case 4:
                onSubscribe$4(this, interfaceC420801kM);
                break;
            case 5:
                onSubscribe$5(this, interfaceC420801kM);
                break;
        }
    }

    public static final void onError$2(C19336410ks c19336410ks, Throwable th) {
        InterfaceC191809102d interfaceC191809102d = (InterfaceC191809102d) c19336410ks.l0;
        if (interfaceC191809102d != null) {
            interfaceC191809102d.LIZJ();
        }
        C102U.LIZ.getClass();
        int i = C102U.LIZLLL;
        if (i > 0) {
            C102U.LIZLLL = i - 1;
            ((C102V) c19336410ks.l1).LIZ((InterfaceC191809102d) c19336410ks.l0, 0);
        }
    }

    public static final void onError$3(C19336410ks c19336410ks, Throwable th) {
        C2382909Vj.LIZ((CompletionBlock) c19336410ks.l1, 0, String.valueOf(th.getMessage()), null, 4);
    }

    public static final void onError$4(C19336410ks c19336410ks, Throwable th) {
        C01U6.LIZIZ(new AwS572S0100000_28((InterfaceC1897660zTw) c19336410ks.l1, 864));
    }

    public static final void onError$5(C19336410ks c19336410ks, Throwable th) {
        C01U6.LIZIZ(new AwS572S0100000_28((InterfaceC1897220zTE) c19336410ks.l0, 867));
    }

    public static final void onNext$0(C19336410ks c19336410ks, Object obj) {
        C1898050zUZ c1898050zUZ = (C1898050zUZ) obj;
        if (c1898050zUZ.LIZ == 1) {
            Function1 function1 = (Function1) c19336410ks.l0;
            if (function1 != null) {
                function1.invoke(c1898050zUZ);
                return;
            }
            return;
        }
        Function1 function12 = (Function1) c19336410ks.l1;
        if (function12 == null) {
            return;
        }
        function12.invoke(c1898050zUZ);
    }

    public static final void onNext$1(C19336410ks c19336410ks, Object obj) {
        C1594040raE c1594040raELJ = ((IContentLanguageService) ServiceManager.get().getService(IContentLanguageService.class)).LJ((List) c19336410ks.l0, ((ConfigListResponse) obj).contentLanguage);
        ((ContentPreferenceViewModel) c19336410ks.l1).yQ2(c1594040raELJ.LIZ, c1594040raELJ.LIZIZ);
    }

    public static final void onNext$2(C19336410ks c19336410ks, Object obj) {
        Integer numValueOf;
        PreferenceSettings preferenceSettings;
        ComplianceSetting complianceSetting = (ComplianceSetting) obj;
        if (complianceSetting.isMixedAge() != 0) {
            C1440005kM.LIZ(new C1916780zym(complianceSetting.isMixedAge()));
        }
        if (complianceSetting.status_code == 0) {
            C102U.LIZ.getClass();
            ComplianceSetting complianceSettingLIZ = C102U.LIZJ.LIZ();
            if (complianceSettingLIZ != null && (preferenceSettings = complianceSettingLIZ.getPreferenceSettings()) != null) {
                numValueOf = Integer.valueOf(preferenceSettings.stemFeedStatus);
            } else {
                numValueOf = null;
            }
            C102U.LIZ(complianceSetting);
            PreferenceSettings preferenceSettings2 = complianceSetting.getPreferenceSettings();
            if (preferenceSettings2 != null) {
                int i = preferenceSettings2.stemFeedStatus;
                if (numValueOf == null || numValueOf.intValue() != i) {
                    C1440005kM.LIZ(new C612920O2g(i));
                }
            }
            InterfaceC191809102d interfaceC191809102d = (InterfaceC191809102d) c19336410ks.l0;
            if (interfaceC191809102d != null) {
                interfaceC191809102d.onSuccess();
            }
            C102U.LIZLLL = 3;
            return;
        }
        InterfaceC191809102d interfaceC191809102d2 = (InterfaceC191809102d) c19336410ks.l0;
        if (interfaceC191809102d2 != null) {
            interfaceC191809102d2.LIZJ();
        }
        C102U.LIZ.getClass();
        int i2 = C102U.LIZLLL;
        if (i2 <= 0) {
            return;
        }
        C102U.LIZLLL = i2 - 1;
        ((C102V) c19336410ks.l1).LIZ((InterfaceC191809102d) c19336410ks.l0, 0);
    }

    public static final void onNext$3(C19336410ks c19336410ks, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        IInteractiveService iInteractiveService = (IInteractiveService) PluggableExtentionKt.pluggableSpi$default(IInteractiveService.class, false, false, false, 14, null);
        if (iInteractiveService != null) {
            String uid = ((InterfaceC1902300zbQ) c19336410ks.l0).getUid();
            C1896810zSZ c1896810zSZ = new C1896810zSZ();
            c1896810zSZ.LJIIJJI = uid;
            iInteractiveService.LIZ(c1896810zSZ);
        }
        CompletionBlock completionBlock = (CompletionBlock) c19336410ks.l1;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1902260zbM.class, null);
        ((InterfaceC1902260zbM) xBaseModelLIZJ).setFollowStatus(followStatus.getFollowerStatus());
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void onNext$4(C19336410ks c19336410ks, Object obj) {
        InterfaceC1897660zTw interfaceC1897660zTw;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != -1) {
            if (iIntValue == 1 && (interfaceC1897660zTw = (InterfaceC1897660zTw) c19336410ks.l1) != null) {
                interfaceC1897660zTw.onSuccess(((C1897600zTq) c19336410ks.l0).LIZ);
                return;
            }
            return;
        }
        InterfaceC1897660zTw interfaceC1897660zTw2 = (InterfaceC1897660zTw) c19336410ks.l1;
        if (interfaceC1897660zTw2 == null) {
            return;
        }
        interfaceC1897660zTw2.onFail();
    }

    public static final void onNext$5(C19336410ks c19336410ks, Object obj) {
        TaskDoneData taskDoneData;
        List<TouchPoint> list;
        TaskDoneData taskDoneData2;
        if (((Number) obj).intValue() == 1) {
            InterfaceC1897220zTE interfaceC1897220zTE = (InterfaceC1897220zTE) c19336410ks.l0;
            TaskDoneReponse taskDoneReponse = ((C1897600zTq) c19336410ks.l1).LIZLLL;
            if (taskDoneReponse != null) {
                taskDoneData2 = taskDoneReponse.data;
            } else {
                taskDoneData2 = null;
            }
            interfaceC1897220zTE.LIZ(taskDoneData2);
        } else {
            ((InterfaceC1897220zTE) c19336410ks.l0).onFail();
        }
        TaskDoneReponse taskDoneReponse2 = ((C1897600zTq) c19336410ks.l1).LIZLLL;
        if (taskDoneReponse2 != null && (taskDoneData = taskDoneReponse2.data) != null && (list = taskDoneData.touchPointData) != null) {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            C2178808gE.LIZ().LJIIIIZZ(list);
        }
    }

    public static final void onSubscribe$4(C19336410ks c19336410ks, InterfaceC420801kM interfaceC420801kM) {
        ((C1897600zTq) c19336410ks.l0).LIZJ = interfaceC420801kM;
    }

    public C19336410ks(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
