package X;

import android.content.Context;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AwS170S1100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396210mR9 extends AbstractC1396270mRF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1396210mR9.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1396210mR9.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1396210mR9.class, "viewModelProvider", "getViewModelProvider()Landroidx/lifecycle/ViewModelProvider;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.AbstractC1396270mRF
    public final long LIZ() {
        return 9L;
    }

    public C1396210mR9(C1DRG c1drg) {
        super(c1drg);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        C1664770tQJ.LIZ(c1drg, C1624790sNp.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, ViewModelProvider.class, null);
    }

    @Override // X.AbstractC1396270mRF
    public final void LIZIZ(int i, long j, String str) {
        if (str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        String string = "";
        String strOptString = jSONObject.optString("username", "");
        String strOptString2 = jSONObject.optString("uid", "");
        int iOptInt = jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
        if (iOptInt != 0) {
            if (iOptInt == 1) {
                string = ((Context) this.LLILZ.getValue(this, LLILZLL[0])).getString(2131848049, strOptString);
            }
        } else {
            string = ((Context) this.LLILZ.getValue(this, LLILZLL[0])).getString(2131848043, strOptString);
        }
        if (string.length() > 0) {
            LIZJ(new AwS170S1100000_21(this, string, 3));
        }
        LIZJ(new C1448170nmx(iOptInt, this, strOptString, strOptString2));
    }
}
