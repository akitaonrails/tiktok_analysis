package X;

import android.content.Context;
import android.view.KeyEvent;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18XB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18XB extends i<C18VP, C18XI, C18XL, C18XQ> implements C18VP, InterfaceC379610EuV, InterfaceC362610EJn {
    public static final C18XS LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final C18UJ LLJJI;
    public C09AE LLJJIII;
    public C09AE LLJJIJI;
    public C09AE LLJJIJIIJIL;
    public C09AE LLJJIJIL;
    public C18XG LLJJJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.18XS] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18XB.class, "saveFeatureApi", "getSaveFeatureApi()Lcom/ss/android/ugc/tools/chat/common/api/AiChatCommonFeatureApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C18XB.class, "inputFeatureApi", "getInputFeatureApi()Lcom/ss/android/ugc/tools/chat/input/api/AiChatInputFeatureApi;", 0)};
        LLJJJIL = new Object() { // from class: X.18XS
        };
        LLJJJJJIL = 8;
    }

    private final void F4() {
        C09AE c09ae = this.LLJJIII;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJJIII = null;
        C09AE c09ae2 = this.LLJJIJI;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
        this.LLJJIJI = null;
        C09AE c09ae3 = this.LLJJIJIIJIL;
        if (c09ae3 != null) {
            c09ae3.LIZIZ(null);
        }
        this.LLJJIJIIJIL = null;
        C09AE c09ae4 = this.LLJJIJIL;
        if (c09ae4 != null) {
            c09ae4.LIZIZ(null);
        }
        this.LLJJIJIL = null;
    }

    private final C18VO H4() {
        return (C18VO) this.LLJJ.getValue(this, LLJJJJ[1]);
    }

    private final C18VQ K4() {
        return (C18VQ) this.LLJILLL.getValue(this, LLJJJJ[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C18XL> o2() {
        return new AwS576S0100000_32(this, 428);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C18XQ> w2() {
        return new AwS576S0100000_32(this, 429);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        H4().b51();
        this.LLJJJ = null;
        F4();
        i3(AFwS278S0000000_32.get$arr$(131));
        super.hide();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        F4();
        super.onDestroy();
    }

    public final void O4() {
        hide();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public final void P4(Context context) {
        C18XG c18xg = this.LLJJJ;
        if (c18xg != null) {
            String str = c18xg.LIZLLL;
            AIChatGenNode aIChatGenNode = c18xg.LIZIZ;
            if (str != null && context != null && aIChatGenNode != null) {
                C09AE c09ae = this.LLJJIII;
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                this.LLJJIII = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C18XD(this, null), K4().KX(context, str, "preview", aIChatGenNode)));
                return;
            }
        }
        i3(AFwS278S0000000_32.get$arr$(126));
    }

    public final void T4(Context context) {
        String str;
        AIChatGenNode aIChatGenNode;
        C18XG c18xg = this.LLJJJ;
        if (c18xg != null && (str = c18xg.LIZLLL) != null && context != null) {
            C09AE c09ae = this.LLJJIJI;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            C18VQ c18vqK4 = K4();
            C18XG c18xg2 = this.LLJJJ;
            if (c18xg2 != null) {
                aIChatGenNode = c18xg2.LIZIZ;
            } else {
                aIChatGenNode = null;
            }
            this.LLJJIJI = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C18XF(this, null), c18vqK4.Fg0(context, str, ".png", "preview", aIChatGenNode)));
        }
    }

    @Override // X.C18VP
    public void YT(C18XG c18xg) {
        C18T2.LIZ.getClass();
        C18T2.LIZ("ai_chat_preview_ready_duration");
        F4();
        this.LLJJJ = c18xg;
        String str = c18xg.LIZLLL;
        if (str == null) {
            return;
        }
        String str2 = c18xg.LIZJ;
        if (str2 == null) {
            str2 = str;
        }
        i3(new AwS146S1100000_32(c18xg, str2, 10));
        this.LLJJIJIIJIL = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C18XE(this, null), K4().co(str)));
        this.LLJJIJIL = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C18XC(this, null), K4().oo(str, ".png", 3)));
        show();
        if (c18xg.LIZ) {
            C18UP c18up = C18UP.LIZ;
            C18UJ c18uj = this.LLJJI;
            AIChatGenNode aIChatGenNode = c18xg.LIZIZ;
            c18up.getClass();
            C0LAB c0lab = new C0LAB();
            C18UP.LIZ(c0lab, c18uj);
            C18UP.LIZIZ(c0lab, aIChatGenNode);
            C20684815ws.LJIILLIIL("vp_generate_preview", c0lab.LIZ);
        }
        H4().TJ0(true);
    }

    public C18XB(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C18VQ.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C18VO.class, null);
        this.LLJJI = (C18UJ) getDiContainer().LJII(C18UJ.class, null);
    }

    @Override // X.InterfaceC362610EJn
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && isShowing()) {
            C201955140j.LIZIZ("CreationChatPreviewComponent", "onKeyDown");
            O4();
            return true;
        }
        return false;
    }
}
