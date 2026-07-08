package X;

import Y.AObserverS126S0300000_15;
import Y.AfS109S0300000_15;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS42S0301000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930360aJm {
    public final MultiGuestDataHolder LIZ;
    public final LiveIconView LIZIZ;
    public final Function0<InterfaceC769940UIe> LIZJ;
    public Integer LIZLLL;

    public final Integer LIZ() {
        MutableLiveData<Integer> mutableLiveData;
        Integer num = this.LIZLLL;
        if (num != null) {
            return num;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.LIZ;
        if (multiGuestDataHolder == null || (mutableLiveData = multiGuestDataHolder.LJIJ) == null) {
            return null;
        }
        return mutableLiveData.getValue();
    }

    public final void LIZIZ(Boolean bool, String str, Boolean bool2, Integer num) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMirrorStatus, mirrorStatus = ");
        sbLIZ.append(num);
        sbLIZ.append(", videoSwitchOn = ");
        sbLIZ.append(bool);
        sbLIZ.append(", isUseBackCamera = ");
        sbLIZ.append(bool2);
        sbLIZ.append(" from = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestMirrorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (num != null) {
            this.LIZLLL = num;
        }
        boolean z = false;
        if (num != null && Intrinsics.LJFF(bool, Boolean.TRUE) && Intrinsics.LJFF(bool2, Boolean.FALSE)) {
            LiveIconView liveIconView = this.LIZIZ;
            if (liveIconView != null) {
                liveIconView.setEnabled(true);
            }
            int iIntValue = num.intValue();
            int i = C936070aSz.LIZ;
            if (iIntValue != 2) {
                z = true;
            }
            InterfaceC769940UIe interfaceC769940UIeInvoke = this.LIZJ.invoke();
            if (interfaceC769940UIeInvoke != null) {
                interfaceC769940UIeInvoke.s3(z);
            }
            LiveIconView liveIconView2 = this.LIZIZ;
            if (liveIconView2 != null) {
                C786410Ut5.i5(liveIconView2, 1.0f);
            }
            LiveIconView liveIconView3 = this.LIZIZ;
            if (liveIconView3 != null) {
                liveIconView3.setIconTintAttr(R.attr.eyv);
                return;
            }
            return;
        }
        LiveIconView liveIconView4 = this.LIZIZ;
        if (liveIconView4 != null) {
            liveIconView4.setEnabled(false);
        }
        LiveIconView liveIconView5 = this.LIZIZ;
        if (liveIconView5 != null) {
            C786410Ut5.i5(liveIconView5, 0.5f);
        }
        LiveIconView liveIconView6 = this.LIZIZ;
        if (liveIconView6 == null) {
            return;
        }
        liveIconView6.setIconTintAttr(R.attr.eyv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C930360aJm(DataChannel dataChannel, MultiGuestDataHolder multiGuestDataHolder, LiveIconView liveIconView, final MutableLiveData mutableLiveData, final MutableLiveData mutableLiveData2, final LifecycleOwner lifecycleOwner, final boolean z, final String str, Function0 function0) {
        this.LIZ = multiGuestDataHolder;
        this.LIZIZ = liveIconView;
        this.LIZJ = function0;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0aJn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i;
                    Integer numLIZ = this.LL.LIZ();
                    if (numLIZ != null) {
                        int iIntValue = numLIZ.intValue();
                        Room roomLJJIII = PlaybookUtilKt.LJJIII();
                        if (roomLJJIII == null) {
                            return;
                        }
                        int i2 = C936070aSz.LIZ;
                        int i3 = 2;
                        if (iIntValue != 2) {
                            C766270U4b.LIZLLL(2131851132);
                        } else {
                            C766270U4b.LIZLLL(2131851133);
                        }
                        C930360aJm c930360aJm = this.LL;
                        if (iIntValue != 0 && iIntValue != 1) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        c930360aJm.LIZIZ(mutableLiveData.getValue(), "ivMirror_Click", mutableLiveData2.getValue(), Integer.valueOf(i));
                        if (z) {
                            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                            C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
                            if (iIntValue != 0 && iIntValue != 1) {
                                i3 = 1;
                            }
                            c927600aFKLIZ.LJIJ(roomLJJIII, i3, lifecycleOwner, str, new AwS42S0301000_15(this.LL, (C930360aJm) iIntValue, (int) mutableLiveData, mutableLiveData2, (LiveData<Boolean>) 0));
                        }
                    }
                }
            });
        }
        if (LIZ() == null) {
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
            AwS293S0300000_15 awS293S0300000_15 = new AwS293S0300000_15(this, mutableLiveData, mutableLiveData2, 12);
            if (c927600aFKLIZ.LJIILIIL().LJIJ.getValue() == null) {
                C480460Ism.LIZ().getClass();
                ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).getGuestSetting().LIZLLL(C11RD.LIZ(C11RB.LIZJ(lifecycleOwner, Lifecycle.Event.ON_DESTROY), new C0UO0()))).LIZ(new AfS109S0300000_15(awS293S0300000_15, c927600aFKLIZ, dataChannel, 12), new C516201zk(awS293S0300000_15, 141));
            }
        } else {
            LIZIZ((Boolean) mutableLiveData.getValue(), "videoSwitchOnLiveData", (Boolean) mutableLiveData2.getValue(), LIZ());
        }
        LIZIZ((Boolean) mutableLiveData.getValue(), "init", (Boolean) mutableLiveData2.getValue(), LIZ());
        mutableLiveData.observe(lifecycleOwner, new AObserverS126S0300000_15(this, mutableLiveData, mutableLiveData2, 0));
        mutableLiveData2.observe(lifecycleOwner, new AObserverS126S0300000_15(this, mutableLiveData, mutableLiveData2, 1));
    }
}
