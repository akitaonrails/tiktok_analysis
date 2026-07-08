package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.Set;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652260t68 extends AbstractC2255721DQs<InterfaceC1648590t0D> implements InterfaceC1648590t0D, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1648590t0D LLILLJJLI = this;
    public final C560530Lyd<C048700Fp> LLILLL;
    public final LiveEvent<C048700Fp> LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final Set<EnumC1355290lN9> LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652260t68.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZIL.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.InterfaceC1648590t0D
    public InterfaceC579890Mol FO2() {
        return (InterfaceC579890Mol) this.LLIZ.getValue();
    }

    public final void Z1() {
        C19EG activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131832241);
        creativeToastBuilder.isTuxToast(true);
        C1390380mHk.LIZ(activity, 3092, creativeToastBuilder);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LIZ(EnumC1355300lNA.CAMERA);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C861540Xqy(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LIZJ(EnumC1355300lNA.CAMERA);
        }
    }

    public InterfaceC1648590t0D W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1648590t0D
    public LiveEvent<C048700Fp> ur0() {
        return this.LLILZ;
    }

    public C1652260t68(C1DRG c1drg) {
        this.LL = c1drg;
        C560530Lyd<C048700Fp> c560530Lyd = new C560530Lyd<>();
        this.LLILLL = c560530Lyd;
        this.LLILZ = c560530Lyd;
        this.LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLILZLL = C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.AUDIO_FOCUS, EnumC1355290lN9.MICROPHONE});
        this.LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 252));
    }

    public final boolean X1(Set<? extends EnumC1355290lN9> set) {
        BusinessCapabilityService.LIZ.getClass();
        return C1355270lN7.LIZ(C1355280lN8.LIZ(), set);
    }
}
