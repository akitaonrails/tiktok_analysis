package X;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.refactor.business.compliance.NewAdSubscriptionServiceImpl;
import com.ss.android.ugc.aweme.refactor.business.language.AppLanguageServiceImpl;
import com.ss.android.ugc.aweme.refactor.business.slogan.SloganPageServiceImpl;
import com.ss.android.ugc.aweme.refactor.business.smartlock.PersonalizedNujServiceImpl;
import com.ss.android.ugc.aweme.refactor.integration.FlowStepMonitorServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10P8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10P8 {
    public static C10PI LIZ(EnumC1153980g8S enumC1153980g8S, C10PX c10px) {
        final C1912470zrp c1912470zrp = new C1912470zrp(c10px);
        ((ArrayList) c1912470zrp.LIZJ).add(new InterfaceC1865160ydW() { // from class: X.0ydX
            @Override // X.InterfaceC1865160ydW
            public final <T> T getService(Class<T> cls) {
                if (Intrinsics.LJFF(cls, InterfaceC1866830ygD.class)) {
                    return (T) new InterfaceC1866830ygD() { // from class: X.0zJR
                        @Override // X.InterfaceC1866830ygD
                        public final boolean LIZ() {
                            AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("needPrivateAccountTips isLogin:");
                            sbLIZ.append(accountUserServiceLJIIJ.isLogin());
                            sbLIZ.append(",isChildrenMode:");
                            sbLIZ.append(accountUserServiceLJIIJ.LIZ());
                            sbLIZ.append(",notifyPrivatePolicy:");
                            sbLIZ.append(accountUserServiceLJIIJ.getCurUser().notifyPrivatePolicy);
                            sbLIZ.append(",isNewUser:");
                            sbLIZ.append(accountUserServiceLJIIJ.isNewUser());
                            C1911410zq7.LIZ("PrivateAccount", C2188811AlT.LIZIZ(sbLIZ));
                            return accountUserServiceLJIIJ.isLogin() && !accountUserServiceLJIIJ.LIZ() && accountUserServiceLJIIJ.getCurUser().notifyPrivatePolicy && accountUserServiceLJIIJ.isNewUser();
                        }
                    };
                }
                return null;
            }
        });
        ((ArrayList) c1912470zrp.LIZJ).add(new InterfaceC1865160ydW() { // from class: X.10OF
            @Override // X.InterfaceC1865160ydW
            public final <T> T getService(Class<T> cls) {
                C10H4 c10h4;
                C19EG c19egLIZIZ;
                C10PO.LIZ.getClass();
                C1912470zrp c1912470zrpLIZ = C10PO.LIZ();
                if (c1912470zrpLIZ != null && (c10h4 = c1912470zrpLIZ.LIZ) != null && (c19egLIZIZ = c10h4.LIZIZ()) != null) {
                    ViewModelProvider viewModelProviderOf = ViewModelProviders.of(c19egLIZIZ);
                    if (Intrinsics.LJFF(cls, C10PK.class)) {
                        T t = (T) viewModelProviderOf.get(PersonalizedNujServiceImpl.class);
                        if (t != null) {
                            return t;
                        }
                    } else {
                        if (Intrinsics.LJFF(cls, InterfaceC1912440zrm.class)) {
                            return (T) viewModelProviderOf.get(SloganPageServiceImpl.class);
                        }
                        if (Intrinsics.LJFF(cls, InterfaceC19236310Nl.class)) {
                            return (T) viewModelProviderOf.get(AppLanguageServiceImpl.class);
                        }
                        if (Intrinsics.LJFF(cls, InterfaceC1917150zzN.class)) {
                            return (T) viewModelProviderOf.get(NewAdSubscriptionServiceImpl.class);
                        }
                        if (Intrinsics.LJFF(cls, C10PL.class)) {
                            return (T) viewModelProviderOf.get(FlowStepMonitorServiceImpl.class);
                        }
                    }
                    return null;
                }
                C1911410zq7.LIZLLL("ViewModelService", "getService activity is null");
                return null;
            }
        });
        if (enumC1153980g8S == EnumC1153980g8S.NUJ_SCENE_NEW_USER_CONFIG) {
            return new C10PI(c1912470zrp) { // from class: X.10PE
                @Override // X.C10PP
                public final EnumC1153980g8S type() {
                    return EnumC1153980g8S.NUJ_SCENE_NEW_USER_CONFIG;
                }
            };
        }
        return new C10PI(c1912470zrp) { // from class: X.10PF
            @Override // X.C10PP
            public final EnumC1153980g8S type() {
                return EnumC1153980g8S.NUJ_SCENE_NEW_USER;
            }
        };
    }
}
