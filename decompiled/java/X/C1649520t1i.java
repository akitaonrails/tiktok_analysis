package X;

import Y.AObjectS246S0100000_25;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649520t1i extends C1652790t6z {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649520t1i.class, "recordPermissionUIApiComponent", "getRecordPermissionUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1649520t1i.class, "playApiComponent", "getPlayApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1649520t1i.class, "shootModeSwitchApiComponent", "getShootModeSwitchApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootModeSwitchApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1649520t1i.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final InterfaceC1653800t8c B3() {
        return (InterfaceC1653800t8c) this.LLJJJJJIL.getValue(this, LLJJL[2]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJJJJLIIL.getValue(this, LLJJL[3]);
    }

    private final a q3() {
        return (a) this.LLJJJJ.getValue(this, LLJJL[1]);
    }

    private final InterfaceC1652190t61 v3() {
        return (InterfaceC1652190t61) this.LLJJJIL.getValue(this, LLJJL[0]);
    }

    @Override // X.C1652790t6z
    public boolean c3() {
        C385670FAf<Boolean> c385670FAfL00;
        InterfaceC1652190t61 interfaceC1652190t61V3 = v3();
        if (interfaceC1652190t61V3 == null || (c385670FAfL00 = interfaceC1652190t61V3.L00()) == null) {
            return false;
        }
        return Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE);
    }

    @Override // X.C1652790t6z, X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        C385670FAf<C1649510t1h> c385670FAfQw1;
        super.onCreate();
        getRecordAdapterApi().BT0(this);
        if (G2()) {
            return;
        }
        a aVarQ3 = q3();
        if (aVarQ3 != null && (c385670FAfQw1 = aVarQ3.Qw1()) != null) {
            c385670FAfQw1.LIZ(this, new AObjectS246S0100000_25(this, 256));
        }
        InterfaceC1653800t8c interfaceC1653800t8cB3 = B3();
        if (interfaceC1653800t8cB3 == null || (bottomTabIndexChangeEvent = interfaceC1653800t8cB3.getBottomTabIndexChangeEvent()) == null) {
            return;
        }
        bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 257));
    }

    @Override // X.C1652790t6z, X.AbstractC2255721DQs
    public void onDestroy() {
        getRecordAdapterApi().BT0(null);
        super.onDestroy();
    }

    @Override // X.C1652790t6z
    public boolean m3(Effect effect) {
        if (C539900LFk.LJIIIIZZ(this.LLILZLL)) {
            return false;
        }
        return super.m3(effect);
    }

    public C1649520t1i(C1DRG c1drg, boolean z) {
        super(c1drg, z);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), a.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1653800t8c.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    }

    public final boolean E3(C1647390syH c1647390syH, String str) {
        if (!TextUtils.equals((CharSequence) c1647390syH.LIZ, str) && TextUtils.equals((CharSequence) c1647390syH.LIZIZ, str)) {
            return true;
        }
        return false;
    }
}
