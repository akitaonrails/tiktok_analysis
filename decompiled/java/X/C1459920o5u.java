package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS49S0001000_4;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0o5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459920o5u implements Function0<C1DRG>, InterfaceC859350XnR {
    public static final C1593720rZi LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C19EG LL;
    public final VideoPublishEditModel LLILLJJLI;
    public final Function0<C1DRG> LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 746));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 748));
    public final C1466800oH0 LLILZLL = new C1466800oH0(this, 0);
    public boolean LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459920o5u.class, "editorProAPI", "getEditorProAPI()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1459920o5u.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0)};
        LLIZLLLIL = new C1593720rZi();
    }

    public final InterfaceC1455610nyx LIZIZ() {
        return (InterfaceC1455610nyx) this.LLILZ.getValue();
    }

    public final C1459930o5v LIZJ() {
        C1459930o5v c1459930o5v;
        C363500EMy.LIZ.getClass();
        C1459930o5v c1459930o5v2 = C363500EMy.LJIIIIZZ;
        if (c1459930o5v2 == null || !Intrinsics.LJFF(c1459930o5v2.LIZ, this.LL)) {
            C19EG c19eg = this.LL;
            if ((c19eg instanceof C19EG) && c19eg != null) {
                C363500EMy.LJIIIIZZ = new C1459930o5v(this.LL, this.LLILLJJLI, new AwS566S0100000_22(this, 747));
            }
        }
        if (!Intrinsics.LJFF(C0CHQ.LIZ().getAccountService().getCurrentUserID(), null) && (c1459930o5v = C363500EMy.LJIIIIZZ) != null) {
            c1459930o5v.LIZLLL = null;
            c1459930o5v.LJ = Boolean.valueOf(!C363750ENx.LIZLLL(C0CHQ.LIZ().getAccountService().getCurrentUserID()));
        }
        return C363500EMy.LJIIIIZZ;
    }

    public final boolean LJFF() {
        InterfaceC372680EjK interfaceC372680EjK;
        C1403010mc7.LIZ.getCommerceService();
        AwS49S0001000_4 awS49S0001000_4 = new AwS49S0001000_4(C1465270oEX.LIZ(), 9);
        AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(264);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_offline_editor_guidance_sticker", true) == 1 || !((Boolean) awS49S0001000_4.invoke()).booleanValue() || ((Boolean) aFwS210S0000000_22.invoke()).booleanValue()) {
            return false;
        }
        C1414930mvL c1414930mvL = C1414930mvL.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        c1414930mvL.getClass();
        if (C1414930mvL.LJII(videoPublishEditModel, false)) {
            return false;
        }
        if (!this.LLIZ) {
            this.LLIZ = true;
            C1DRG c1drgInvoke = this.LLILLL.invoke();
            if (c1drgInvoke != null && (interfaceC372680EjK = (InterfaceC372680EjK) ((C0ETY) c1drgInvoke.LJII(C0ETY.class, null)).MY1(InterfaceC372680EjK.class)) != null) {
                interfaceC372680EjK.pk1(false);
            }
            C363750ENx.LJ("has_show_slide_guide_v2");
        }
        return true;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1DRG invoke() {
        return this.LLILLL.invoke();
    }

    public final boolean LJ() {
        return (!C574590MgD.LIZ() || C1459910o5t.LIZ.LIZ("guide_shown", false) || C1428470nHB.LLIIIJ(this.LLILLJJLI)) ? false : true;
    }

    @Override // X.InterfaceC859350XnR
    public final void LIZ(Function1 function1) {
        LIZLLL(new AwS388S0200000_22(function1, (Function1<? super Boolean, Unit>) this, (C1459920o5u) 142));
    }

    public final void LIZLLL(Function1<? super Boolean, Unit> function1) {
        boolean z;
        C1414930mvL c1414930mvL = C1414930mvL.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        c1414930mvL.getClass();
        if (C1414930mvL.LJII(videoPublishEditModel, false)) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            function1.invoke(Boolean.FALSE);
            return;
        }
        if (Intrinsics.LJFF("editor_pro_h5", this.LLILLJJLI.mShootWay) && !C363750ENx.LIZ.LIZ("guideShownH5", false)) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLILLJJLI.isEnterFromDM() && !C1428470nHB.LLIIIJ(this.LLILLJJLI)) {
            if (C0L0X.LIZ(this.LLILLJJLI.creativeModel)) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            if (u4.LJIIIIZZ(this.LLILLJJLI) && z) {
                this.LLIZ = true;
                function1.invoke(Boolean.TRUE);
                return;
            }
            if (u4.LJIIIIZZ(this.LLILLJJLI)) {
                C1459930o5v c1459930o5vLIZJ = LIZJ();
                if (c1459930o5vLIZJ != null) {
                    AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(function1, (Function1<? super Map<Integer, String>, Unit>) 535);
                    String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                    boolean zLIZJ = C363750ENx.LIZJ();
                    if (zLIZJ && ((Boolean) C284710BDx.LIZ.getValue()).booleanValue()) {
                        zLIZJ = false;
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_offline_editor_guidance_popup", true) == 1 || ((C256090A1v.LIZ() && (a0.LJJJIL(currentUserID) || Intrinsics.LJFF(currentUserID, CardStruct.IStatusCode.DEFAULT))) || zLIZJ)) {
                        awS601S0100000_22.invoke(Boolean.FALSE);
                        return;
                    }
                    if (c1459930o5vLIZJ.LJIIIIZZ) {
                        awS601S0100000_22.invoke(Boolean.FALSE);
                        return;
                    }
                    if (c1459930o5vLIZJ.LJIIJ) {
                        awS601S0100000_22.invoke(Boolean.TRUE);
                        return;
                    }
                    if (!c1459930o5vLIZJ.LJIIIZ && !c1459930o5vLIZJ.LJIIJJI) {
                        return;
                    }
                    Boolean bool = c1459930o5vLIZJ.LIZLLL;
                    if (bool != null) {
                        awS601S0100000_22.invoke(Boolean.valueOf(bool.booleanValue()));
                        return;
                    } else {
                        c1459930o5vLIZJ.LIZ(new AwS388S0200000_22(c1459930o5vLIZJ, awS601S0100000_22, 298));
                        return;
                    }
                }
                return;
            }
            function1.invoke(Boolean.FALSE);
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, X.InterfaceC1460130o6F r11) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1459920o5u.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0o6F):void");
    }

    public C1459920o5u(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, Function0<C1DRG> function0) {
        this.LL = c19eg;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = function0;
        new C1466800oH0(this, 1);
    }
}
