package X;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.tools.infosticker.repository.internal.GifEntranceBannerController;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0snR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640670snR extends C1638170sjP {
    public final FrameLayout LLJIJIL;
    public final LifecycleOwner LLJILJIL;
    public final GifEntranceBannerController LLJILJILJ;

    public C1640670snR(FrameLayout frameLayout, C1640790snd c1640790snd, LifecycleOwner lifecycleOwner, C1662850tND c1662850tND, AwS674S0100000_25 awS674S0100000_25, LiveData liveData, Pair pair, C1656660tDE c1656660tDE) {
        super(frameLayout, c1662850tND, awS674S0100000_25, c1656660tDE, (Function0) null, lifecycleOwner);
        this.LLJIJIL = frameLayout;
        this.LLJILJIL = lifecycleOwner;
        this.LLJILJILJ = new GifEntranceBannerController(this.LLJIJIL, c1640790snd, this.LLJILJIL, c1662850tND, liveData, pair);
    }
}
