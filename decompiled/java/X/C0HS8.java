package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS215S0300000_6;

/* JADX INFO: renamed from: X.0HS8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HS8 extends C09AY implements Function2<C03H5, List<? extends EnumC440890HQp>, Unit> {
    public final /* synthetic */ MixStudioBaseFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HS8(MixStudioBaseFragment mixStudioBaseFragment) {
        super(2);
        this.LL = mixStudioBaseFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C03H5 c03h5, List<? extends EnumC440890HQp> list) {
        Context context;
        int iIntValue;
        EnumC440890HQp enumC440890HQp = (EnumC440890HQp) C13LP.LJJLIIIJJI(list);
        boolean z = false;
        for (Map.Entry entry : ((LinkedHashMap) this.LL.LLJIJIL).entrySet()) {
            Object key = entry.getKey();
            View view = (View) entry.getValue();
            if (key == enumC440890HQp) {
                C786410Ut5.LJLLLLLL(0, view);
                z = true;
            } else {
                C786410Ut5.LJLLLLLL(4, view);
            }
        }
        if (!z && (context = this.LL.getContext()) != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(View.generateViewId());
            if (enumC440890HQp == EnumC440890HQp.HOME) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                frameLayout.setBackgroundColor(iIntValue);
            }
            MixStudioBaseFragment mixStudioBaseFragment = this.LL;
            FrameLayout frameLayout2 = mixStudioBaseFragment.LLJI;
            if (frameLayout2 != null) {
                frameLayout2.addView(frameLayout);
            }
            mixStudioBaseFragment.LLJIJIL.put(enumC440890HQp, frameLayout);
            MixStudioBaseFragment mixStudioBaseFragment2 = this.LL;
            C723850SaN.LIZ(mixStudioBaseFragment2, false, null, new AwS215S0300000_6(mixStudioBaseFragment2, enumC440890HQp, frameLayout, 7), 3);
        }
        return Unit.LIZ;
    }
}
