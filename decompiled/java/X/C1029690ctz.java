package X;

import android.os.Bundle;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ctz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029690ctz implements InterfaceC999480c7G {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ;
    public final String LIZIZ;
    public final AbstractC1024610cln LIZJ;
    public Bundle LIZLLL;
    public final AnonymousClass0355 LJ = new AbstractC1024610cln() { // from class: X.0355
        @Override // X.AbstractC1537870q7d
        public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
            C1440005kM.LIZ(new IEvent(String.valueOf(interfaceC1541990qEH.hashCode())) { // from class: X.02zB
                public final String LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C767502zB) && Intrinsics.LJFF(this.LIZ, ((C767502zB) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ComponentsPreloadFinishEvent(hashCode=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str;
                }
            });
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
            C1440005kM.LIZ(new IEvent(String.valueOf(interfaceC1541990qEH.hashCode())) { // from class: X.02zC
                public final String LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C767602zC) && Intrinsics.LJFF(this.LIZ, ((C767602zC) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ComponentsPreloadStartEvent(hashCode=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str;
                }
            });
        }

        @Override // X.AbstractC1537870q7d
        public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
            C1440005kM.LIZ(new IEvent(String.valueOf(interfaceC1541990qEH.hashCode()), str2) { // from class: X.0354
                public final String LIZ;
                public final String LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AnonymousClass0354)) {
                        return false;
                    }
                    AnonymousClass0354 anonymousClass0354 = (AnonymousClass0354) obj;
                    return Intrinsics.LJFF(this.LIZ, anonymousClass0354.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0354.LIZIZ);
                }

                public final int hashCode() {
                    int iHashCode = this.LIZ.hashCode() * 31;
                    String str3 = this.LIZIZ;
                    return iHashCode + (str3 == null ? 0 : str3.hashCode());
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ComponentsPreloadFailEvent(hashCode=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", errorMessage=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = str2;
                }
            });
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0355] */
    public C1029690ctz(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str, AbstractC1024610cln abstractC1024610cln) {
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.LIZIZ = str;
        this.LIZJ = abstractC1024610cln;
    }

    @Override // X.InterfaceC999480c7G
    public final void LIZ(Bundle bundle, String str, boolean z) throws JSONException {
        Bundle bundle2;
        IAdSparkUtils iAdSparkUtilsLJFF;
        AdSparkContext adSparkContextLIZJ;
        boolean zLJI = MethodIDManager.LJI(137746);
        if (C0BNL.LIZ() == 2 || C0BNL.LIZ() == 3) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZIZ() && Intrinsics.LJFF(str, this.LIZ.getUrl()) && (bundle2 = this.LIZLLL) != null && C08RT.LIZ(bundle2, bundle)) {
                this.LIZ.refresh();
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            this.LIZLLL = bundle;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (iAdSparkUtilsLJFF = AdSparkUtils.LJFF()) != null && (adSparkContextLIZJ = iAdSparkUtilsLJFF.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getContext(), str, bundle, null, false)) != null) {
            adSparkContextLIZJ.LJJJJL(C2429209fW.LIZ().appendDataFlowId(adSparkContextLIZJ.bundle, "402657282"));
            adSparkContextLIZJ.bizCert = new ThirdPartyBizCert(402657282);
            adSparkContextLIZJ.LJJ(C1029700cu0.class, new C1029700cu0(this.LIZ));
            if (z) {
                adSparkContextLIZJ.LJJL("use_forest", true);
            }
            IAdSparkUtils iAdSparkUtilsLJFF2 = AdSparkUtils.LJFF();
            if (iAdSparkUtilsLJFF2 != null) {
                iAdSparkUtilsLJFF2.LIZLLL(adSparkContextLIZJ, this.LIZIZ);
            }
            adSparkContextLIZJ.LJJLJ(this.LIZJ);
            adSparkContextLIZJ.LJJLJ(this.LJ);
            adSparkContextLIZJ.LJJLIIJ(str);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJIJ(adSparkContextLIZJ);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJIIIIZZ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
