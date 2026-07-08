package Y;

import X.C09JN;
import X.C1392890mLn;
import X.C189200o6;
import X.C1C7U;
import X.C238400w2;
import X.C259800zU;
import X.InterfaceC1364105Vn;
import X.InterfaceC420801kM;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AfS100S0300000_2 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS100S0300000_2 afS100S0300000_2, Object obj) {
        C1C7U.LIZ("MuteTheirPostsManager@e4c1.unmutePosts$d$3");
        ((Function1) afS100S0300000_2.l0).invoke(Boolean.FALSE);
        C1392890mLn c1392890mLn = C1392890mLn.LIZ;
        Fragment fragment = (Fragment) afS100S0300000_2.l1;
        Activity activity = (Activity) afS100S0300000_2.l2;
        c1392890mLn.getClass();
        C1392890mLn.LJFF(activity, fragment);
        C1C7U.LIZIZ("MuteTheirPostsManager@e4c1.unmutePosts$d$3");
    }

    public static final void accept$1(AfS100S0300000_2 afS100S0300000_2, Object obj) {
        C1C7U.LIZ("PlaylistManageRepo@fa57.addVideoToPlaylist$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.status_code == 0) {
            Function0 function0 = (Function0) afS100S0300000_2.l0;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function1 function1 = (Function1) afS100S0300000_2.l1;
            if (function1 != null) {
                function1.invoke(new Exception(baseResponse.message));
            }
        }
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS100S0300000_2.l2).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("PlaylistManageRepo@fa57.addVideoToPlaylist$1");
    }

    public static final void accept$2(AfS100S0300000_2 afS100S0300000_2, Object obj) {
        C1C7U.LIZ("AwemePhotoDownloadShareAbilityHandler@72e3.getShortenLink$2$2");
        ((BaseSharePackage) afS100S0300000_2.l0).extras.putLong("link_duration", System.currentTimeMillis() - ((C238400w2) afS100S0300000_2.l1).element);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS100S0300000_2.l2;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        C1C7U.LIZIZ("AwemePhotoDownloadShareAbilityHandler@72e3.getShortenLink$2$2");
    }

    public static final void accept$3(AfS100S0300000_2 afS100S0300000_2, Object obj) {
        C1C7U.LIZ("AwemePhotoShareAbilityHandler@5c98.getShortenLink$2$3");
        ((BaseSharePackage) afS100S0300000_2.l0).extras.putLong("link_duration", System.currentTimeMillis() - ((C238400w2) afS100S0300000_2.l1).element);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS100S0300000_2.l2;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        C1C7U.LIZIZ("AwemePhotoShareAbilityHandler@5c98.getShortenLink$2$3");
    }

    public AfS100S0300000_2(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
