package Y;

import X.C09JN;
import X.C0IJT;
import X.C1095250ebj;
import X.C1116320f9i;
import X.C16FZ;
import X.C1C7U;
import X.C470590Icr;
import X.C474500IjA;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C518180KTw;
import X.C766270U4b;
import X.C786410Ut5;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentPurchaseConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import tikcast.api.fans.FansConfigResponse;

/* JADX INFO: loaded from: classes18.dex */
public class AfS2S0110100_17 implements C09JN {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0367  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$0(Y.AfS2S0110100_17 r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S0110100_17.accept$0(Y.AfS2S0110100_17, java.lang.Object):void");
    }

    public static final void accept$1(AfS2S0110100_17 afS2S0110100_17, Object obj) {
        C501470JlZ c501470JlZ;
        String prompt;
        C1C7U.LIZ("StarCommentPaymentDialog@9fd7.queryPurchasePage$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C501470JlZ) {
            c501470JlZ = (C501470JlZ) th;
        } else {
            c501470JlZ = null;
        }
        if (afS2S0110100_17.z1) {
            C16FZ c16fz = ((StarCommentPaymentDialog) afS2S0110100_17.l0).LLJJ;
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 8);
            }
            LinearLayout linearLayout = ((StarCommentPaymentDialog) afS2S0110100_17.l0).LLJILJILJ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            if (c501470JlZ != null && (prompt = c501470JlZ.getPrompt()) != null && C500260Jjc.LJJIIZ(prompt)) {
                C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            }
            String str = ((StarCommentPaymentDialog) afS2S0110100_17.l0).LLLFZ;
            if (str == null) {
                str = "";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_error_panel_show");
            c474500IjALIZ.LJIL();
            C1116320f9i.LIZ(c474500IjALIZ);
            C1116320f9i.LIZIZ(c474500IjALIZ, th, "error_code");
            c474500IjALIZ.LJJII(str, "enter_from");
            c474500IjALIZ.LIZ();
            long jCurrentTimeMillis = System.currentTimeMillis() - afS2S0110100_17.j2;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_star_comment_purchase_page_init_request");
            c474500IjALIZ2.LJIL();
            C1116320f9i.LIZ(c474500IjALIZ2);
            C1116320f9i.LIZIZ(c474500IjALIZ2, th, "status_code");
            c474500IjALIZ2.LJJII(0, "is_successful");
            c474500IjALIZ2.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
            c474500IjALIZ2.LIZ();
        } else {
            StarCommentPaymentDialog starCommentPaymentDialog = (StarCommentPaymentDialog) afS2S0110100_17.l0;
            starCommentPaymentDialog.LLJLLIL++;
            starCommentPaymentDialog.LLJZ += System.currentTimeMillis() - afS2S0110100_17.j2;
            C786410Ut5.LJLJLJ(((StarCommentPaymentDialog) afS2S0110100_17.l0).LLLIIII, ((StarCommentPaymentDialog) afS2S0110100_17.l0).LLLIIII.obtainMessage(1), ((long) LiveStarCommentPurchaseConfig.INSTANCE.getSettingValue().refreshTime) * 1000);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - afS2S0110100_17.j2;
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_star_comment_purchase_page_polling_request");
            c474500IjALIZ3.LJIL();
            C1116320f9i.LIZ(c474500IjALIZ3);
            C1116320f9i.LIZIZ(c474500IjALIZ3, th, "status_code");
            c474500IjALIZ3.LJJII(0, "is_successful");
            c474500IjALIZ3.LJJII(Long.valueOf(jCurrentTimeMillis2), "duration");
            c474500IjALIZ3.LJJII(1, "is_empty");
            c474500IjALIZ3.LIZ();
        }
        C1C7U.LIZIZ("StarCommentPaymentDialog@9fd7.queryPurchasePage$2");
    }

    public static final void accept$2(AfS2S0110100_17 afS2S0110100_17, Object obj) {
        int i;
        C1C7U.LIZ("FansClubViewModel@394b.requestFansConfigNew$dispose$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS2S0110100_17.j2;
        if (c470590Icr != null) {
            i = c470590Icr.statusCode;
        } else {
            i = 0;
        }
        C518180KTw.LJIIIIZZ(0, i, "/webcast/privilege/fans_config/", jCurrentTimeMillis);
        if (c470590Icr != null && c470590Icr.data != 0) {
            C518180KTw.LJIILIIL(c470590Icr.statusCode, afS2S0110100_17.z1);
            C786410Ut5.LJJZZIII(C1095250ebj.LIZ, new ARunnableS116S0100000_16(new AwS561S0100000_17(c470590Icr, (C470590Icr<FansConfigResponse.Data>) 595), (Function0<Unit>) 15));
            Function0 function0 = (Function0) afS2S0110100_17.l0;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("FansClubViewModel@394b.requestFansConfigNew$dispose$1");
    }

    public AfS2S0110100_17(long j, Object obj, boolean z, int i) {
        this.$t = i;
        this.j2 = j;
        this.z1 = z;
        this.l0 = obj;
    }
}
