package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2299808zk {
    public static InterfaceC1635410sex LJ;
    public final String LIZ;
    public CategoryPageModel LIZIZ;
    public List<List<Effect>> LIZJ;
    public static final C01GW<C2299808zk> LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1711));
    public static final C01GW<C194557119v> LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1712));

    public C2299808zk() {
        this.LIZ = !C0CHQ.LIZ().getAccountService().LIZ() ? "voiceconversion" : "voicechanger";
    }

    public static void LIZJ() {
        InterfaceC1635410sex interfaceC1635410sexLIZIZ = C2296208zA.LIZIZ();
        if (interfaceC1635410sexLIZIZ != null) {
            interfaceC1635410sexLIZIZ.destroy();
        }
        LJ = null;
    }

    public static boolean LIZ(Effect effect) {
        if (C352370Drf.LIZJ(effect)) {
            return true;
        }
        if (effect != null) {
            InterfaceC1635410sex interfaceC1635410sexLIZIZ = C2296208zA.LIZIZ();
            if ((interfaceC1635410sexLIZIZ != null && interfaceC1635410sexLIZIZ.LJIIIIZZ(effect)) || effect.getEffectType() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZIZ(final InterfaceC2247808rM interfaceC2247808rM) {
        CategoryPageModel categoryPageModel = this.LIZIZ;
        if (categoryPageModel != null && !C086I.LIZIZ(categoryPageModel.getUrl_prefix())) {
            interfaceC2247808rM.LIZ(this.LIZIZ);
            return;
        }
        interfaceC2247808rM.LIZJ();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1635410sex interfaceC1635410sexLIZIZ = C2296208zA.LIZIZ();
        if (interfaceC1635410sexLIZIZ != null) {
            interfaceC1635410sexLIZIZ.tg(0, new IFetchCategoryEffectListener() { // from class: X.08rN
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    String msg;
                    int errorCode;
                    String msg2;
                    InterfaceC2247808rM interfaceC2247808rM2 = interfaceC2247808rM;
                    String str = "";
                    int errorCode2 = 0;
                    if (interfaceC2247808rM2 != null) {
                        if (exceptionResult != null) {
                            errorCode = exceptionResult.getErrorCode();
                            msg2 = exceptionResult.getMsg();
                            if (msg2 == null) {
                            }
                            interfaceC2247808rM2.LIZIZ(errorCode, msg2);
                        } else {
                            errorCode = 0;
                        }
                        msg2 = "";
                        interfaceC2247808rM2.LIZIZ(errorCode, msg2);
                    }
                    String str2 = this.LIZ.LIZ;
                    long j = jCurrentTimeMillis;
                    if (exceptionResult != null) {
                        errorCode2 = exceptionResult.getErrorCode();
                    }
                    if (exceptionResult != null && (msg = exceptionResult.getMsg()) != null) {
                        str = msg;
                    }
                    C2299808zk.LIZLLL(1, j, errorCode2, str2, str);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel2) {
                    CategoryPageModel categoryPageModel3 = categoryPageModel2;
                    this.LIZ.LIZIZ = categoryPageModel3;
                    InterfaceC2247808rM interfaceC2247808rM2 = interfaceC2247808rM;
                    if (interfaceC2247808rM2 != null) {
                        interfaceC2247808rM2.LIZ(categoryPageModel3);
                    }
                    C2299808zk.LIZLLL(0, jCurrentTimeMillis, 0, this.LIZ.LIZ, "");
                }
            }, this.LIZ, "all", false);
        }
    }

    public static void LIZLLL(int i, long j, int i2, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("panel", str);
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
        c2344009Gk.LJIIIIZZ("errorDesc", str2);
        c2344009Gk.LIZJ(i2, "errorCode");
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("aweme_voice_effect_list_error", c2344009Gk.LIZ);
    }
}
