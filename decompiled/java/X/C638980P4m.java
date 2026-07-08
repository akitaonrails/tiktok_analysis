package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.AdChoiceDeviceUserAge;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.AdChoiceViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ClearHistory;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0P4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638980P4m implements InterfaceC594300NSq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<AdChoiceDeviceUserAge> c0x9s, Throwable th) {
        switch (this.$t) {
            case 0:
                onFailure$0(this, c0x9s, th);
                break;
            case 1:
                onFailure$1(this, c0x9s, th);
                break;
            case 2:
                onFailure$2(this, c0x9s, th);
                break;
            case 3:
                onFailure$3(this, c0x9s, th);
                break;
        }
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<AdChoiceDeviceUserAge> c0x9s, C0X52<AdChoiceDeviceUserAge> c0x52) {
        switch (this.$t) {
            case 0:
                onResponse$0(this, c0x9s, c0x52);
                break;
            case 1:
                onResponse$1(this, c0x9s, c0x52);
                break;
            case 2:
                onResponse$2(this, c0x9s, c0x52);
                break;
            case 3:
                onResponse$3(this, c0x9s, c0x52);
                break;
        }
    }

    public C638980P4m(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFailure$0(C638980P4m c638980P4m, C0X9S c0x9s, Throwable th) {
        String message;
        ((AdChoiceViewModel) c638980P4m.l0).LLILZIL.postValue(Boolean.FALSE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUserAge error: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onFailure$1(C638980P4m c638980P4m, C0X9S c0x9s, Throwable th) {
        LogPbBean logPbBean;
        String imprId;
        String str = "unknown";
        if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            Object rawResponse = c0xir.getRawResponse();
            if ((rawResponse instanceof MusicAwemeList) && (logPbBean = ((MusicAwemeList) rawResponse).logPb) != null && (imprId = logPbBean.getImprId()) != null) {
                str = imprId;
            }
            InterfaceC635960Ox0 interfaceC635960Ox0 = (InterfaceC635960Ox0) c638980P4m.l0;
            if (interfaceC635960Ox0 != null) {
                int errorCode = c0xir.getErrorCode();
                String errorMsg = c0xir.getErrorMsg();
                if (errorMsg == null) {
                    errorMsg = th.toString();
                }
                interfaceC635960Ox0.onFailed(errorCode, errorMsg, str);
                return;
            }
            return;
        }
        InterfaceC635960Ox0 interfaceC635960Ox02 = (InterfaceC635960Ox0) c638980P4m.l0;
        if (interfaceC635960Ox02 == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        interfaceC635960Ox02.onFailed(-1, message, "unknown");
    }

    public static final void onFailure$2(C638980P4m c638980P4m, C0X9S c0x9s, Throwable th) {
        ((ComplianceVM) c638980P4m.l0).LLILZ.setValue(Boolean.FALSE);
    }

    public static final void onFailure$3(C638980P4m c638980P4m, C0X9S c0x9s, Throwable th) {
        ((SubscriptionVM) c638980P4m.l0).LLILZ.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$0(C638980P4m c638980P4m, C0X9S c0x9s, C0X52 c0x52) {
        AdChoiceDeviceUserAge adChoiceDeviceUserAge;
        Integer ageEligible;
        MutableLiveData<Boolean> mutableLiveData = ((AdChoiceViewModel) c638980P4m.l0).LLILZIL;
        boolean z = false;
        if (c0x52 != null && c0x52.LIZJ() && (adChoiceDeviceUserAge = (AdChoiceDeviceUserAge) c0x52.LIZIZ) != null && (ageEligible = adChoiceDeviceUserAge.getAgeEligible()) != null && ageEligible.intValue() == 1) {
            z = true;
        }
        mutableLiveData.postValue(Boolean.valueOf(z));
    }

    public static final void onResponse$1(C638980P4m c638980P4m, C0X9S c0x9s, C0X52 c0x52) {
        TypedByteArray typedByteArray;
        byte[] bytes;
        InterfaceC635960Ox0 interfaceC635960Ox0;
        String message;
        int i;
        String str;
        String imprId;
        LogPbBean logPbBean;
        Object objLIZIZ = c0x52.LIZIZ;
        InterfaceC635960Ox0 interfaceC635960Ox02 = (InterfaceC635960Ox0) c638980P4m.l0;
        Object c098200Yq = null;
        if (objLIZIZ == null) {
            try {
                TypedInput typedInput = c0x52.LIZJ;
                if (typedInput != null && (typedInput instanceof TypedByteArray) && (typedInput instanceof TypedByteArray) && (typedByteArray = (TypedByteArray) typedInput) != null && (bytes = typedByteArray.getBytes()) != null) {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String str2 = new String(bytes, Charsets.UTF_8);
                    c1227904rF.getClass();
                    objLIZIZ = C1227904rF.LIZIZ(str2, MusicAwemeList.class);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        MusicAwemeList musicAwemeList = (MusicAwemeList) objLIZIZ;
        if (musicAwemeList != null) {
            if (interfaceC635960Ox02 != null) {
                interfaceC635960Ox02.LIZ(musicAwemeList);
                c098200Yq = Unit.LIZ;
            }
        } else if (interfaceC635960Ox02 != null) {
            MusicAwemeList musicAwemeList2 = (MusicAwemeList) objLIZIZ;
            if (musicAwemeList2 != null) {
                i = musicAwemeList2.status_code;
            } else {
                i = -1;
            }
            MusicAwemeList musicAwemeList3 = (MusicAwemeList) objLIZIZ;
            if (musicAwemeList3 == null || (str = musicAwemeList3.status_msg) == null) {
                str = "unknown";
            }
            MusicAwemeList musicAwemeList4 = (MusicAwemeList) objLIZIZ;
            if (musicAwemeList4 == null || (logPbBean = musicAwemeList4.logPb) == null || (imprId = logPbBean.getImprId()) == null) {
                imprId = "unknown";
            }
            interfaceC635960Ox02.onFailed(i, str, imprId);
            c098200Yq = Unit.LIZ;
        }
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq) && (interfaceC635960Ox0 = (InterfaceC635960Ox0) c638980P4m.l0) != null) {
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null || (message = thM5exceptionOrNullimpl.getMessage()) == null) {
                message = "unknown";
            }
            interfaceC635960Ox0.onFailed(-1, message, "unknown");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$2(C638980P4m c638980P4m, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((ComplianceVM) c638980P4m.l0).LLILZIL.setValue(((ClearHistory) c0x52.LIZIZ).getSubmittedTime());
            ((ComplianceVM) c638980P4m.l0).LLILZ.setValue(Boolean.TRUE);
        }
    }

    public static final void onResponse$3(C638980P4m c638980P4m, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((SubscriptionVM) c638980P4m.l0).LLILZ.setValue(Boolean.TRUE);
        }
    }
}
