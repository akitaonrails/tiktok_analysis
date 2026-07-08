package X;

import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS671S0100000_22;

/* JADX INFO: renamed from: X.0njZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446070njZ extends AbstractC2255721DQs<InterfaceC1446100njc> implements InterfaceC379610EuV, InterfaceC1446100njc, InterfaceC362610EJn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), Scene.class, null);
    public final ShortVideoContext LLILZ = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public long LLILZIL = -1;
    public final C1655770tBn LLILZLL = new C1655770tBn(new Function2<String, Boolean, Unit>() { // from class: X.0njb
        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
            bool.booleanValue();
            return Unit.LIZ;
        }
    });

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1446070njZ.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1446070njZ.class, "rootScene", "getRootScene()Lcom/bytedance/scene/Scene;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZLLLIL = 8;
    }

    public InterfaceC1446100njc X1() {
        return this;
    }

    private final Scene Z1() {
        return (Scene) this.LLILLL.getValue(this, LLIZ[1]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    @Override // X.InterfaceC1446100njc
    public void l() {
        W1("click_cross");
    }

    @Override // X.InterfaceC1446100njc
    public void onBackPressed() {
        W1("system_back_button");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C1462510oA5.LIZ().isOpen) {
            this.LLILZLL.LIZLLL(new C1462480oA2(getActivity(), Z1(), AFwS210S0000000_22.get$arr$(177), new AwS671S0100000_22(this, 2)));
        }
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(Z1());
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.AH(this);
        }
        Bundle bundleLIZ = C537670L6v.LIZ(getDiContainer(), getActivity());
        if (bundleLIZ != null) {
            this.LLILZIL = bundleLIZ.getLong("extra_start_record_time", -1L);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1446070njZ(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void W1(String str) {
        if (!this.LLILZLL.LIZ(str)) {
            o2(str, this.LLILZ, "video_shoot_page");
            getActivity().finish();
        }
    }

    @Override // X.InterfaceC362610EJn
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            onBackPressed();
            return true;
        }
        return false;
    }

    private final void o2(String str, ShortVideoContext shortVideoContext, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("shoot_page", str2);
        c0lab.LJ("shoot_enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("shoot_enter_method", shortVideoContext.enterMethod);
        c0lab.LJ("exit_method", str);
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLILZIL, "shoot_exit_duration");
        c0lab.LJ("furthest_page", C1411580mpw.LIZJ);
        C20684815ws.LJIILLIIL("shoot_exit", c0lab.LIZ);
    }
}
