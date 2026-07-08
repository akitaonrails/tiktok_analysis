package Y;

import X.C013C;
import X.C0S3T;
import X.C0S3V;
import X.C0S3W;
import X.C0S9P;
import X.C0SOO;
import X.C0SRL;
import X.C1481110oe5;
import X.C2188811AlT;
import X.C707090RoR;
import X.C715040S3a;
import X.C720560SOg;
import X.C720570SOh;
import X.C786410Ut5;
import androidx.lifecycle.CompatMediatorLiveData;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.FullPageHostAbility;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.mob.PhotoFullPageImageMonitorComponent;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AObserverS176S0200000_11 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS176S0200000_11 aObserverS176S0200000_11, Object obj) {
        ((CompatMediatorLiveData) aObserverS176S0200000_11.l0).setValue(((Function1) aObserverS176S0200000_11.l1).invoke(obj));
    }

    public static final void onChanged$1(AObserverS176S0200000_11 aObserverS176S0200000_11, Object obj) {
        ((SignUpOrLoginActivity) aObserverS176S0200000_11.l0).LLZLLLL((TuxTextView) aObserverS176S0200000_11.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$2(AObserverS176S0200000_11 aObserverS176S0200000_11, Object obj) {
        int i;
        C0S9P c0s9p;
        if (((Boolean) obj).booleanValue()) {
            PhotoFullPageImageMonitorComponent photoFullPageImageMonitorComponent = (PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0;
            PostModeFullPageViewModel postModeFullPageViewModel = ((C0SRL) aObserverS176S0200000_11.l1).LJIIIZ;
            if (postModeFullPageViewModel != null && (c0s9p = (C0S9P) postModeFullPageViewModel.getState()) != null) {
                i = c0s9p.LL;
            } else {
                i = 0;
            }
            photoFullPageImageMonitorComponent.LLIZ = i;
            PhotoFullPageImageMonitorComponent photoFullPageImageMonitorComponent2 = (PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0;
            photoFullPageImageMonitorComponent2.LL.LIZJ(photoFullPageImageMonitorComponent2.LLIZ);
            PhotoFullPageImageMonitorComponent photoFullPageImageMonitorComponent3 = (PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0;
            photoFullPageImageMonitorComponent3.LL.LJ(photoFullPageImageMonitorComponent3.LLIZ);
            FullPageHostAbility fullPageHostAbilityBo = ((PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0).bo();
            if (fullPageHostAbilityBo != null) {
                fullPageHostAbilityBo.LLJJI(((PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0).LLILZ);
            }
            FullPageHostAbility fullPageHostAbilityBo2 = ((PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0).bo();
            if (fullPageHostAbilityBo2 != null) {
                fullPageHostAbilityBo2.x6(((PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0).LLILZIL);
            }
            FullPageHostAbility fullPageHostAbilityBo3 = ((PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0).bo();
            if (fullPageHostAbilityBo3 != null) {
                fullPageHostAbilityBo3.K5(((PhotoFullPageImageMonitorComponent) aObserverS176S0200000_11.l0).LLILZLL);
            }
        }
    }

    public static final void onChanged$3(AObserverS176S0200000_11 aObserverS176S0200000_11, Object obj) {
        long j;
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C013C c013c = (C013C) aObserverS176S0200000_11.l0;
            if (!c013c.element) {
                c013c.element = true;
                LifecycleOwner value = ((PostModeCommentListFragmentV2) aObserverS176S0200000_11.l1).getViewLifecycleOwnerLiveData().getValue();
                if (value != null && ((PostModeCommentListFragmentV2) aObserverS176S0200000_11.l1).getView() != null && value.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
                    Runnable runnable = (Runnable) ((PostModeCommentListFragmentV2) aObserverS176S0200000_11.l1).LLJJL.getValue();
                    if (((PostModeCommentListFragmentV2) aObserverS176S0200000_11.l1).dS()) {
                        j = 120;
                    } else {
                        j = 0;
                    }
                    C786410Ut5.LJLIIL(j, C707090RoR.LIZ(), runnable);
                }
            }
        }
    }

    public static final void onChanged$4(AObserverS176S0200000_11 aObserverS176S0200000_11, Object obj) {
        ((C720570SOh) aObserverS176S0200000_11.l0).LIZ((C0SRL) aObserverS176S0200000_11.l1);
    }

    public static final void onChanged$5(AObserverS176S0200000_11 aObserverS176S0200000_11, Object obj) {
        ((C720560SOg) aObserverS176S0200000_11.l0).h0((C0SRL) aObserverS176S0200000_11.l1);
    }

    public static final void onChanged$6(AObserverS176S0200000_11 aObserverS176S0200000_11, Object obj) {
        boolean z;
        C0S3W c0s3wLJIIIZ;
        C0S3V c0s3v = (C0S3V) aObserverS176S0200000_11.l0;
        C0S3T c0s3t = (C0S3T) aObserverS176S0200000_11.l1;
        C715040S3a c715040S3a = (C715040S3a) obj;
        if (c715040S3a.LIZIZ || ((c0s3wLJIIIZ = c0s3v.LJIIIZ()) != null && c715040S3a.LIZ == c0s3wLJIIIZ.getProgress())) {
            z = false;
        } else {
            z = true;
        }
        if (c0s3t.LIZ.LJI) {
            if (!z || !c715040S3a.LIZJ) {
                return;
            }
        } else if (!z) {
            return;
        }
        C0S3W c0s3wLJIIIZ2 = c0s3v.LJIIIZ();
        if (c0s3wLJIIIZ2 != null) {
            c0s3wLJIIIZ2.setProgress(c715040S3a.LIZ, false);
        }
        String str = c0s3v.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seekbar progress change by livedata: ");
        sbLIZ.append(c715040S3a.LIZ);
        C1481110oe5.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$7(AObserverS176S0200000_11 aObserverS176S0200000_11, Object obj) {
        Boolean bool = (Boolean) obj;
        TuxIconView tuxIconView = (TuxIconView) aObserverS176S0200000_11.l0;
        if (tuxIconView != null && bool != null) {
            ((C0SOO) aObserverS176S0200000_11.l1).i0(tuxIconView, bool.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS176S0200000_11(Object obj, CompatMediatorLiveData<Object> compatMediatorLiveData, Function1<Object, Object> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = compatMediatorLiveData;
    }
}
