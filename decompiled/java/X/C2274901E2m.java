package X;

import android.app.Activity;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS15S0000001_35;
import kotlin.jvm.internal.AwS47S0010000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1E2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274901E2m extends C0ETZ<C0E2R, C1A7R, C1890107al, C1A7W> implements C0E2R {
    public static final int LLJJJ = 8;
    public final Activity LLJJI;
    public final C1DRG LLJJIII;
    public final C1889707ah LLJJIJI;
    public final C560530Lyd<Unit> LLJJIJIIJIL;
    public final C560530Lyd<Unit> LLJJIJIL;

    @Override // ge.i
    public Function0<C1A7R> E3() {
        return new AwS579S0100000_35(this, 173);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1890107al> o2() {
        return AFwS226S0000000_35.get$arr$(322);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1A7W> w2() {
        return new AwS579S0100000_35(this, 172);
    }

    @Override // X.C0E2R
    public LiveEvent<Unit> B50() {
        return this.LLJJIJIL;
    }

    @Override // X.C0E2R
    public LiveEvent<Unit> gV0() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.C0E2R
    public void Ra2(boolean z) {
        C0E48 c0e48F4;
        C0E55 player;
        Activity activity = this.LLJJI;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131833382);
        C1390380mHk.LIZ(activity, 1057, creativeToastBuilder);
        if (z && (c0e48F4 = F4()) != null && (player = c0e48F4.getPlayer()) != null) {
            player.LIZIZ(0L);
            player.LLIL(false);
        }
    }

    @Override // X.C0E2R
    public void TC(boolean z) {
        i3(new AwS47S0010000_35(z, 14));
    }

    @Override // X.C0E2R
    public void cD(float f) {
        i3(new AwS15S0000001_35(f, 1));
    }

    @Override // X.C0E2R
    public void ob1(boolean z) {
        i3(new AwS47S0010000_35(z, 16));
    }

    @Override // X.C0E2R
    public void zs2(boolean z) {
        i3(new AwS47S0010000_35(z, 15));
    }

    public C2274901E2m(C19A3 c19a3, Activity activity, C1DRG c1drg, C1889707ah c1889707ah) {
        super(c19a3, c1drg);
        this.LLJJI = activity;
        this.LLJJIII = c1drg;
        this.LLJJIJI = c1889707ah;
        this.LLJJIJIIJIL = new C560530Lyd<>();
        this.LLJJIJIL = new C560530Lyd<>();
    }
}
