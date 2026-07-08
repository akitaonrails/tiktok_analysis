package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS157S0400000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19628611qu extends AbstractC2255721DQs<InterfaceC19627611qk> implements InterfaceC19627611qk, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public InterfaceC1356670lPN LLILLJJLI;
    public ViewGroup LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public String LLILZIL = "";
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C1456770o0p.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19628611qu.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19628611qu.class, "socialNewEditConfig", "getSocialNewEditConfig()Lcom/ss/android/ugc/aweme/social/creation/api/edit/exp/SocialNewEditConfig;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InterfaceC19627611qk W1() {
        return this;
    }

    public final C1456770o0p X1() {
        return (C1456770o0p) this.LLILZLL.getValue(this, LLIZ[1]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLIZ[0]);
    }

    @Override // X.InterfaceC19627611qk
    public C0FLH LJIIJ() {
        final InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
        return new C0FLH() { // from class: X.11qv
            @Override // X.C0FLH
            public final boolean LIZ() {
                return accountService.isLogin();
            }

            @Override // X.C0FLH
            public final boolean LLLLLIL() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "mention_people_in_text_sticker", true) == 2;
            }

            @Override // X.C0FLH
            public final boolean LLLLLJLJLL() {
                return C0FMW.LIZ();
            }

            @Override // X.C0FLH
            public final void LLLLJI(boolean z) {
                InterfaceC1356670lPN interfaceC1356670lPN = this.LIZ.LLILLJJLI;
                if (interfaceC1356670lPN != null) {
                    interfaceC1356670lPN.LLLLJI(z);
                }
            }

            @Override // X.C0FLH
            public final boolean LLLLLJIL(AwS584S0100000_5 awS584S0100000_5) {
                return C20612915lH.LIZIZ.LJIIIIZZ().LJFF(awS584S0100000_5);
            }

            @Override // X.C0FLH
            public final void LLLLLILLIL(String str, String str2) {
                if (Intrinsics.LJFF(this.LIZ.LLILZIL, str)) {
                    return;
                }
                C19628611qu c19628611qu = this.LIZ;
                c19628611qu.LLILZIL = str;
                InterfaceC1356670lPN interfaceC1356670lPN = c19628611qu.LLILLJJLI;
                if (interfaceC1356670lPN != null) {
                    interfaceC1356670lPN.Ml(str, str2, false);
                }
            }

            @Override // X.C0FLH
            public final void LLLLL(ViewGroup viewGroup, Context context, C0FLC c0flc) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    C19628611qu c19628611qu = this.LIZ;
                    C786410Ut5.LJJJJI(viewGroup);
                    ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(c19egLIZIZ, new AwS157S0400000_29(c19628611qu, c19egLIZIZ, viewGroup, c0flc, 10));
                }
                this.LIZ.LLILLL = viewGroup;
            }
        };
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19628611qu(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
