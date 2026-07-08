package X;

import Y.AObserverS220S0100000_16;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989100bqW extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ ShakeEgg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C989100bqW(ShakeEgg shakeEgg) {
        super(0);
        this.LL = shakeEgg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.0bqX, X.0rJg] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FrameLayout invoke() {
        ?? FindViewById = C786410Ut5.Td(this.LL.LL.getLayoutInflater(), R.layout.d4s, (ViewGroup) this.LL.LL.findViewById(android.R.id.content), true).findViewById(R.id.feed_shake_egg_container);
        final ShakeEgg shakeEgg = this.LL;
        ShakeEggVM shakeEggVM = shakeEgg.LLILLL;
        if (shakeEggVM == null) {
            shakeEggVM = null;
        }
        shakeEggVM.LLJIJIL.observe(shakeEgg.LL, new AObserverS220S0100000_16(shakeEgg, 19));
        ShakeEggVM shakeEggVM2 = shakeEgg.LLILLL;
        if (shakeEggVM2 == null) {
            shakeEggVM2 = null;
        }
        shakeEggVM2.LLIZ.observe(shakeEgg.LL, new AObserverS220S0100000_16(shakeEgg, 20));
        ShakeEggVM shakeEggVM3 = shakeEgg.LLILLL;
        if (shakeEggVM3 == null) {
            shakeEggVM3 = null;
        }
        shakeEggVM3.LLIZLLLIL.observe(shakeEgg.LL, new AObserverS220S0100000_16(shakeEgg, 21));
        ShakeEggVM shakeEggVM4 = shakeEgg.LLILLL;
        if (shakeEggVM4 == null) {
            shakeEggVM4 = null;
        }
        shakeEggVM4.LLJ.observe(shakeEgg.LL, new AObserverS220S0100000_16(shakeEgg, 22));
        ShakeEggVM shakeEggVM5 = shakeEgg.LLILLL;
        if (shakeEggVM5 == null) {
            shakeEggVM5 = null;
        }
        shakeEggVM5.LLJILJIL.observe(shakeEgg.LL, new AObserverS220S0100000_16(shakeEgg, 23));
        ShakeEggVM shakeEggVM6 = shakeEgg.LLILLL;
        if (shakeEggVM6 == null) {
            shakeEggVM6 = null;
        }
        shakeEggVM6.LLJILJILJ.observe(shakeEgg.LL, new AObserverS220S0100000_16(shakeEgg, 2));
        if (shakeEgg.LLILZIL == null) {
            ?? r1 = new InterfaceC1055110dYz() { // from class: X.0bqX
                @Override // X.InterfaceC1583780rJg
                public final String getHoxNodeTag() {
                    return "";
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeShow(Bundle bundle) {
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeHide(Bundle bundle) {
                    ShakeEgg shakeEgg2 = shakeEgg;
                    shakeEgg2.LIZLLL();
                    shakeEgg2.LIZJ();
                    shakeEgg2.LIZIZ();
                }
            };
            shakeEgg.LLILZIL = r1;
            Hox hox = shakeEgg.LLILZ;
            (hox != null ? hox : 0).wQ2("For You", r1);
        }
        return FindViewById;
    }
}
