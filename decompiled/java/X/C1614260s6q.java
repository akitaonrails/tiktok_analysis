package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.payment.IapInfo;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614260s6q {
    public static final C1614260s6q LIZ = new C1614260s6q();
    public static final C11RK<C0KPG> LIZIZ = new C11RK<>();
    public static final InterfaceC1791930wjP LIZJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ();
    public static final C11RK<AbstractC1159230gGv> LIZLLL = new C11RK<>();
    public static final C11PQ<Boolean> LJ = C11PQ.LJLLLLLL(Boolean.FALSE);

    public static void LIZ(final String str, final PurchaseOptionWithPrice purchaseOptionWithPrice, IapInfo iapInfo, final EnumC1612690s4J enumC1612690s4J) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC1791930wjP interfaceC1791930wjP;
        C1789970wgF c1789970wgF = new C1789970wgF(iapInfo.iapPayload, new HashMap());
        LIZLLL.onNext(new AbstractC1159230gGv(enumC1612690s4J, str, purchaseOptionWithPrice) { // from class: X.0gGs
            public final String LIZIZ;
            public final EnumC1612690s4J LIZJ;
            public final String LIZLLL;
            public final PurchaseOptionWithPrice LJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1159200gGs)) {
                    return false;
                }
                C1159200gGs c1159200gGs = (C1159200gGs) obj;
                return Intrinsics.LJFF(this.LIZIZ, c1159200gGs.LIZIZ) && this.LIZJ == c1159200gGs.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1159200gGs.LIZLLL) && Intrinsics.LJFF(this.LJ, c1159200gGs.LJ);
            }

            public final int hashCode() {
                String str2 = this.LIZIZ;
                int iHashCode = (str2 == null ? 0 : str2.hashCode()) * 31;
                EnumC1612690s4J enumC1612690s4J2 = this.LIZJ;
                return ((((iHashCode + (enumC1612690s4J2 != null ? enumC1612690s4J2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IapLoading(groupId=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", sourceWay=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", productId=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", purchaseOption=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1159230gGv
            public final String LIZ() {
                return this.LIZLLL;
            }

            {
                super(str);
                this.LIZIZ = null;
                this.LIZJ = enumC1612690s4J;
                this.LIZLLL = str;
                this.LJ = purchaseOptionWithPrice;
            }
        });
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && (interfaceC1791930wjP = LIZJ) != null) {
            interfaceC1791930wjP.LIZIZ(activityLIZ, c1789970wgF, new InterfaceC518120KTq() { // from class: X.0s6x
                @Override // X.InterfaceC518120KTq
                public final void LIZ(C0KPG c0kpg) {
                    if (c0kpg.LIZ == C0KPI.SUCCESS) {
                        C1614260s6q.LIZLLL.onNext(new AbstractC1159230gGv(str, purchaseOptionWithPrice) { // from class: X.0gGu
                            public final String LIZIZ;
                            public final PurchaseOptionWithPrice LIZJ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (!(obj instanceof C1159220gGu)) {
                                    return false;
                                }
                                C1159220gGu c1159220gGu = (C1159220gGu) obj;
                                return Intrinsics.LJFF(this.LIZIZ, c1159220gGu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1159220gGu.LIZJ);
                            }

                            public final int hashCode() {
                                return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("IapLoadingDone(productId=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(", purchaseOption=");
                                sbLIZ.append(this.LIZJ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            @Override // X.AbstractC1159230gGv
                            public final String LIZ() {
                                return this.LIZIZ;
                            }

                            {
                                super(str);
                                this.LIZIZ = str;
                                this.LIZJ = purchaseOptionWithPrice;
                            }
                        });
                    }
                    C1614260s6q.LIZIZ.onNext(c0kpg);
                }
            });
        }
    }
}
