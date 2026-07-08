package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.DialogOption;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849300XTk extends C0XMO {
    @Override // X.C0XMO
    public final void LIZ(Uri uri) {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(activityLJFF);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            c1397580mTM.LJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "description");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
            c1397580mTM.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "options");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
            try {
                DialogOption[] dialogOptionArr = (DialogOption[]) new Gson().LJII(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, DialogOption[].class);
                if (dialogOptionArr == null) {
                    return;
                } else {
                    C985403tE.LIZ(c1397580mTM, new C849330XTn(dialogOptionArr, uri, this, activityLJFF));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static void LIZIZ(DialogOption dialogOption, Activity activity) {
        String str = dialogOption.optionUrl;
        if (str != null) {
            SmartRouter.buildRoute(activity, str).open();
        }
        if (dialogOption.optionId != null) {
            final String strFlattenToShortString = activity.getComponentName().flattenToShortString();
            final String str2 = dialogOption.optionId;
            C1440005kM.LIZ(new IEvent(strFlattenToShortString, str2) { // from class: X.034x
                public final String LIZ;
                public final String LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C7853034x)) {
                        return false;
                    }
                    C7853034x c7853034x = (C7853034x) obj;
                    return Intrinsics.LJFF(this.LIZ, c7853034x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c7853034x.LIZIZ);
                }

                public final int hashCode() {
                    return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
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
                    sbLIZ.append("DialogOptionClickEvent(activityName=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", optionId=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = strFlattenToShortString;
                    this.LIZIZ = str2;
                }
            });
        }
    }
}
