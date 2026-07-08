package X;

import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.setting.page.backgroundaudio.BGAudioViewModel;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911000zpS extends C19292910dr {
    public final Fragment LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.AbstractC19318610i0
    public final AbstractC19293010ds LIZJ() {
        ((BGAudioViewModel) this.LLILZLL.getValue()).LL.observe(this.LLILZIL.getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 99));
        return super.LIZJ();
    }

    @Override // X.C19292910dr
    /* JADX INFO: renamed from: LJII */
    public final C19319810iC LIZLLL() {
        Boolean value = ((BGAudioViewModel) this.LLILZLL.getValue()).LL.getValue();
        return new C19319810iC(value != null ? value.booleanValue() : false, this.LLILZIL.getString(2131826772), new ACListenerS162S0100000_28(this, 168), false, null, null, null, null, false, false, false, null, 131064);
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public C1911000zpS(Fragment fragment) {
        super(null);
        this.LLILZIL = fragment;
        this.LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 978));
    }
}
