package X;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.beauty.multiguest.LiveBeautySubItemMultiGuestFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0U6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766840U6g extends C0U6V {
    public final LiveSmallItemBeautyViewModel LJIIJJI;
    public final Fragment LJIIL;
    public final C19P4 LJIILIIL;
    public final ImageView LJIILJJIL;
    public final int LJIILL;
    public final C0U78 LJIILLIIL;
    public final Integer LJIIZILJ;
    public LiveBeautySubItemMultiGuestFragment LJIJ;

    @Override // X.C0U6V
    public final LiveEffect LIZJ() {
        List<LiveEffect> listLIZ = LIZ();
        if (listLIZ == null) {
            return null;
        }
        return (LiveEffect) C13LP.LJJJLZIJ(C0U7C.LJIIJJI(this.LJII, true, listLIZ), listLIZ);
    }

    @Override // X.C0U6V
    public final void LJI(LiveEffect liveEffect) {
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        String strLLILL = liveEffect.LLILL();
        String str = "";
        if (strLLILL == null) {
            strLLILL = "";
        }
        String strLJLL = liveEffect.LJLL();
        if (strLJLL == null) {
            strLJLL = "";
        }
        String resourceId = liveEffect.getResourceId();
        String name = liveEffect.getName();
        String str2 = this.LIZLLL;
        C0U78 c0u78 = this.LJIILLIIL;
        LiveBeautySubItemMultiGuestFragment liveBeautySubItemMultiGuestFragment = new LiveBeautySubItemMultiGuestFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("live_effect_panel_name", strLLILL, bundle);
        C786410Ut5.LJJJI("live_effect_panel_key", strLJLL, bundle);
        C786410Ut5.LJJJI("parent_effect_name", name, bundle);
        C786410Ut5.LJJJI("live_effect_panel_info", resourceId, bundle);
        C786410Ut5.LJJJI("live_effect_panel_name_enum", str2, bundle);
        liveBeautySubItemMultiGuestFragment.setArguments(bundle);
        liveBeautySubItemMultiGuestFragment.LLIZLLLIL = c0u78;
        liveBeautySubItemMultiGuestFragment.LLILZIL = new AwS556S0100000_12(this, 41);
        liveBeautySubItemMultiGuestFragment.LLILZLL = new AwS591S0100000_12(this, 63);
        Integer num = this.LJIIZILJ;
        if (num != null) {
            liveBeautySubItemMultiGuestFragment.LL.LLILZ = num.intValue();
        }
        this.LJIJ = liveBeautySubItemMultiGuestFragment;
        C500260Jjc.LJIILIIL(this.LJIILJJIL);
        LiveBeautySubItemMultiGuestFragment liveBeautySubItemMultiGuestFragment2 = this.LJIJ;
        if (liveBeautySubItemMultiGuestFragment2 != null) {
            String strLLILL2 = liveEffect.LLILL();
            if (strLLILL2 == null) {
                strLLILL2 = "";
            }
            String strLJLL2 = liveEffect.LJLL();
            if (strLJLL2 != null) {
                str = strLJLL2;
            }
            String resourceId2 = liveEffect.getResourceId();
            String name2 = liveEffect.getName();
            String str3 = this.LIZLLL;
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("live_effect_panel_name", strLLILL2, bundle2);
            C786410Ut5.LJJJI("live_effect_panel_key", str, bundle2);
            C786410Ut5.LJJJI("parent_effect_name", name2, bundle2);
            C786410Ut5.LJJJI("live_effect_panel_info", resourceId2, bundle2);
            C786410Ut5.LJJJI("live_effect_panel_name_enum", str3, bundle2);
            liveBeautySubItemMultiGuestFragment2.setArguments(bundle2);
            Fragment fragment = this.LJIIL;
            if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIJ(this.LJIILL, liveBeautySubItemMultiGuestFragment2, null);
                c19ehLJIIJ.LJIIJJI();
            }
        }
    }

    public C766840U6g(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, DataChannel dataChannel, Fragment fragment, C19P4 c19p4, ImageView imageView, TextView textView, int i, C0U78 c0u78, Integer num) {
        LifecycleCoroutineScope lifecycleScope;
        super(dataChannel, c19p4, textView, "liveguestbeauty", c0u78);
        this.LJIIJJI = liveSmallItemBeautyViewModel;
        this.LJIIL = fragment;
        this.LJIILIIL = c19p4;
        this.LJIILJJIL = imageView;
        this.LJIILL = i;
        this.LJIILLIIL = c0u78;
        this.LJIIZILJ = num;
        if (dataChannel != null) {
            dataChannel.BQ2(fragment, OnLiveEffectSelectedEvent.class, new AwS591S0100000_12(this, 1166));
        }
        if (fragment != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C766870U6j(this, null), 3);
        }
    }
}
