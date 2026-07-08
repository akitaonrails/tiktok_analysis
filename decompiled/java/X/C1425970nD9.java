package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425970nD9 extends C19A3 {
    public final C1DRG LLJILLL;
    public final Function2<C539960LFq, C1424220nAK, Unit> LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 834));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(313));

    /* JADX WARN: Multi-variable type inference failed */
    public C1425970nD9(C1DRG c1drg, Function2<? super C539960LFq, ? super C1424220nAK, Unit> function2) {
        this.LLJILLL = c1drg;
        this.LLJJ = function2;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLJJ == null) {
            return;
        }
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(265));
        C1664590tQ1.LIZLLL(this, null, false, AFwS261S0000000_22.get$arr$(266), 3);
        C1664600tQ2.LIZ(this, null, new AwS601S0100000_22(this, 639));
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout((Context) this.LLJJI.getValue());
        frameLayout.setId(((Number) this.LLJJIII.getValue()).intValue());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Integer numLJII = C1308910kAL.LJII(R.attr.zm, C1385040m98.LIZ(frameLayout.getContext(), true));
        if (numLJII != null) {
            frameLayout.setBackgroundResource(numLJII.intValue());
        }
        return frameLayout;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
