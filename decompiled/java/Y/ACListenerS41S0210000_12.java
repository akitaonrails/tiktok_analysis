package Y;

import X.C16FS;
import X.C19322110iZ;
import X.C21532619Oq;
import X.C238400w2;
import X.C748880TZe;
import X.InterfaceC1090170eTX;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeContactSelectorSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS41S0210000_12 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS41S0210000_12 aCListenerS41S0210000_12, View view) {
        FragmentManager fragmentManager;
        Long lValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C238400w2 c238400w2 = (C238400w2) aCListenerS41S0210000_12.l0;
        if (jCurrentTimeMillis - c238400w2.element < 2000) {
            return;
        }
        c238400w2.element = jCurrentTimeMillis;
        DataChannel dataChannel = ((LiveVisibleScopeSettingFragment) aCListenerS41S0210000_12.l1).LL;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) aCListenerS41S0210000_12.l1;
            boolean z = aCListenerS41S0210000_12.z2;
            String str = LiveVisibleScopeContactSelectorSheet._pnsPageId;
            if (liveVisibleScopeSettingFragment.LLILLL) {
                lValueOf = Long.valueOf(liveVisibleScopeSettingFragment.LLJJI);
            } else {
                lValueOf = null;
            }
            AwS130S0110000_12 awS130S0110000_12 = new AwS130S0110000_12(liveVisibleScopeSettingFragment, z, 4);
            LiveVisibleScopeContactSelectorSheet liveVisibleScopeContactSelectorSheet = new LiveVisibleScopeContactSelectorSheet();
            liveVisibleScopeContactSelectorSheet.LLJLLL = dataChannel;
            liveVisibleScopeContactSelectorSheet.LLJZ = lValueOf;
            liveVisibleScopeContactSelectorSheet.LLJZIJLIL = awS130S0110000_12;
            C19322110iZ.LJFF(fragmentManager, liveVisibleScopeContactSelectorSheet, "live_visible_scope_contact_selector_sheet", new InterfaceC1090170eTX() { // from class: X.0Toj
                @Override // X.InterfaceC1090170eTX
                public final void LIZ(long j) {
                }
            }, 0);
        }
    }

    public static final void onClick$1(ACListenerS41S0210000_12 aCListenerS41S0210000_12, View view) {
        if (Intrinsics.LJFF(((C21532619Oq) aCListenerS41S0210000_12.l0).getTag(), Integer.valueOf(view.getId())) && !aCListenerS41S0210000_12.z2) {
            ((C21532619Oq) aCListenerS41S0210000_12.l0).setTag(null);
            ((C16FS) view).j0(R.style.a8a);
            return;
        }
        ((C21532619Oq) aCListenerS41S0210000_12.l0).setTag(Integer.valueOf(view.getId()));
        C21532619Oq c21532619Oq = (C21532619Oq) aCListenerS41S0210000_12.l0;
        Function1 function1 = (Function1) aCListenerS41S0210000_12.l1;
        int childCount = c21532619Oq.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c21532619Oq.getChildAt(i);
            if (childAt.getId() == view.getId()) {
                C16FS c16fs = (C16FS) childAt;
                c16fs.j0(R.style.a7s);
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(c16fs.getId()));
                }
            } else {
                ((C16FS) childAt).j0(R.style.a8a);
            }
        }
    }

    public ACListenerS41S0210000_12(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.z2 = z;
    }
}
