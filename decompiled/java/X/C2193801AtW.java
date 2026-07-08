package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.profile.business.ur.edit.api.YoutubeApi;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193801AtW implements InterfaceC832270Wkr {
    public static final /* synthetic */ int LLJ = 0;
    public final C19EG LL;
    public final InterfaceC1216930hlz LLILLJJLI;
    public C2193811AtX LLILZIL;
    public String LLILLL = "";
    public String LLILZ = "";
    public final C1498060p5Q LLILZLL = new C1498060p5Q();
    public final C2193901Atg LLIZ = new C2193901Atg();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 1));

    @Override // X.InterfaceC832890Wlr
    public final void LJJJZ(ConnectionResult connectionResult) {
    }

    public C2193801AtW(C19EG c19eg, InterfaceC1216930hlz interfaceC1216930hlz) {
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC1216930hlz;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZJ(C1528630psj c1528630psj, C2193491At1 c2193491At1) {
        YoutubeApi.YouTubeResponse youTubeResponse;
        Integer num;
        Integer num2 = null;
        String str = null;
        try {
            youTubeResponse = YoutubeApi.LIZIZ.LIZ(c2193491At1.LJFF, null, "", "", new C1528610psh(new C1528620psi(c1528630psj)).LLILLL.LIZJ(), c2193491At1.LIZIZ, c2193491At1.LIZJ).get();
            if (youTubeResponse != null && (num = youTubeResponse.statusCode) != null) {
                if (num.intValue() == 0) {
                    InterfaceC1216930hlz interfaceC1216930hlz = this.LLILLJJLI;
                    YoutubeApi.YouTubeResponse.YoutubeChannelStruct youtubeChannelStruct = youTubeResponse.youtubeData;
                    if (youtubeChannelStruct != null) {
                        str = youtubeChannelStruct.channelTitle;
                    }
                    interfaceC1216930hlz.g50(str);
                    C1440005kM.LIZ(new C1436405jm(false));
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("platform", "youtube");
                    C20684815ws.LJIILLIIL("social_account_bind_success", c2344009Gk.LIZ);
                    C1232140iAW c1232140iAW = C1232140iAW.LIZ;
                    C1232050iAN c1232050iAN = new C1232050iAN("click_save", EnumC1216940hm0.SOCIAL_ACCOUNT_BIND);
                    c1232050iAN.LJIIIIZZ = EnumC1216840hlq.YOUTUBE;
                    C1232060iAO c1232060iAO = new C1232060iAO(c1232050iAN);
                    c1232140iAW.getClass();
                    C1232140iAW.LJ(c1232060iAO);
                    return;
                }
                if (num.intValue() == 3004005) {
                    LIZIZ(this, null, this.LL.getString(2131845492), "sever_get_user_info", youTubeResponse, 1);
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            youTubeResponse = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("YouTube link request error: ");
        if (youTubeResponse != null) {
            num2 = youTubeResponse.statusCode;
        }
        sbLIZ.append(num2);
        LIZIZ(this, new Exception(C2188811AlT.LIZIZ(sbLIZ)), null, "sever_get_user_info", youTubeResponse, 2);
    }

    public static void LIZIZ(C2193801AtW c2193801AtW, Exception exc, String str, String str2, YoutubeApi.YouTubeResponse youTubeResponse, int i) {
        YoutubeApi.YouTubeResponse youTubeResponse2 = youTubeResponse;
        String str3 = str;
        Exception exc2 = exc;
        if ((i & 1) != 0) {
            exc2 = null;
        }
        String str4 = "";
        if ((i & 2) != 0) {
            str3 = "";
        }
        if ((i & 4) == 0) {
            str4 = str2;
        }
        if ((i & 8) != 0) {
            youTubeResponse2 = null;
        }
        c2193801AtW.LIZ(false, null, str3, exc2, youTubeResponse2, str4);
    }

    public final void LIZ(boolean z, Integer num, String str, Exception exc, YoutubeApi.YouTubeResponse youTubeResponse, String str2) {
        YoutubeApi youtubeApi = YoutubeApi.LIZ;
        C19EG c19eg = this.LL;
        youtubeApi.getClass();
        String strLIZ = YoutubeApi.LIZ(c19eg, exc, num, youTubeResponse);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", "youtube");
        c2344009Gk.LJIIIIZZ("error_desc", strLIZ);
        c2344009Gk.LJIIIIZZ("error_code", str2);
        C20684815ws.LJIILLIIL("social_account_bind_failure", c2344009Gk.LIZ);
        if (z) {
            this.LLILLJJLI.g50(null);
            str = this.LL.getString(2131850169, C878800Ydi.LIZ);
        } else if (str == null) {
            String str3 = C878800Ydi.LIZ;
            C19EG c19eg2 = this.LL;
            if (a0.LJJIIZI(strLIZ, "User cancelled", false)) {
                str = c19eg2.getString(2131850169, C878800Ydi.LIZ);
            } else if (a0.LJJIIZI(strLIZ, "AuthorizationException", false)) {
                str = c19eg2.getString(2131850171, C878800Ydi.LIZ);
            } else {
                String str4 = C878800Ydi.LIZ;
                str = c19eg2.getString(2131850170, str4, str4);
            }
        }
        this.LLILLJJLI.uV1(str);
    }
}
