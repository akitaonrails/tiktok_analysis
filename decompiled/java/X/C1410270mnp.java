package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.image.switchmode.payload.VoidPayload;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410270mnp extends AbstractC2255721DQs<InterfaceC1410280mnq> implements InterfaceC1410280mnq, InterfaceC379610EuV {
    public static final int LLIZ = 8;
    public final C1DRG LL;
    public final Function0<Bundle> LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final InterfaceC1410280mnq LLILZ = this;
    public final C560530Lyd<SwitchModePayload> LLILZIL = new C560530Lyd<>();
    public final h0<SwitchModePayload> LLILZLL = new h0<>(VoidPayload.INSTANCE);

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isRecyclerBuilder = ");
        sbLIZ.append(this.LLILLL.invoke());
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(this.LLILLL.invoke(), Boolean.TRUE)) {
            return;
        }
        Bundle bundleInvoke = this.LLILLJJLI.invoke();
        Parcelable parcelable = bundleInvoke != null ? bundleInvoke.getParcelable("switch_mode_payload") : null;
        if (!(parcelable instanceof SwitchModePayload) || parcelable == null) {
            return;
        }
        this.LLILZLL.LJII((SwitchModePayload) parcelable);
        this.LLILZIL.LJIIJ((SwitchModePayload) parcelable);
    }

    @Override // X.InterfaceC1410280mnq
    public C385670FAf<SwitchModePayload> B31() {
        return this.LLILZLL;
    }

    public InterfaceC1410280mnq W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1410280mnq
    public LiveEvent<SwitchModePayload> gl0() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1410280mnq
    public void nI0(SwitchModePayload switchModePayload) {
        this.LLILZLL.LJII(switchModePayload);
    }

    public C1410270mnp(C1DRG c1drg, Function0<Bundle> function0, Function0<Boolean> function02) {
        this.LL = c1drg;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }
}
