package X;

import android.app.Activity;
import android.content.res.Configuration;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import kotlin.jvm.internal.AwS154S0101000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC880120Yfq implements InterfaceC487330J9f {
    public final Activity LL;
    public final C879540Yeu<?> LLILLJJLI;
    public final InterfaceC879010Ye3 LLILLL;
    public final C0Y8T LLILZ;
    public final IMUser LLILZIL;
    public final C866530Xz1 LLILZLL;
    public C1397510mTF LLIZ;
    public final String LLIZLLLIL;

    public AbstractC880120Yfq() {
        throw null;
    }

    public abstract void LIZ();

    public abstract int LIZIZ();

    public abstract int LIZLLL();

    public int LJ() {
        return 0;
    }

    public boolean LJI() {
        return false;
    }

    public static C05RV LIZJ() {
        return C19212010Ec.LIZJ.LIZJ();
    }

    public static boolean LJII(C0Y8T c0y8t) {
        if (c0y8t != null && c0y8t.isGroupChat() && !C0ZFW.LIZ.LJIIIZ(c0y8t)) {
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ(C0YMW c0ymw) {
        if (c0ymw != null && (c0ymw.getCode() == C0YIG.CONV_NOT_FOUND.getValue() || c0ymw.getCode() == C0YIG.CONV_DISSOLVED.getValue())) {
            C0CNO.LIZLLL(0L, new AwS154S0101000_14(1, this.LL, 4));
            return;
        }
        IIMErrorUtils.LIZ.getClass();
        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
        if (iIMErrorUtilsLIZ == null) {
            return;
        }
        iIMErrorUtilsLIZ.LIZLLL(this.LL, c0ymw);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C1397510mTF c1397510mTF = this.LLIZ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        this.LLIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC880120Yfq(android.app.Activity r6, X.C879540Yeu r7, X.InterfaceC879010Ye3 r8) {
        /*
            r5 = this;
            r5.<init>()
            r5.LL = r6
            r5.LLILLJJLI = r7
            r5.LLILLL = r8
            T r3 = r7.LIZJ
            boolean r0 = r3 instanceof X.C0Y8T
            r2 = 0
            if (r0 == 0) goto La8
            X.0Y8T r3 = (X.C0Y8T) r3
        L12:
            r5.LLILZ = r3
            X.05sZ<T> r1 = r7.LIZ
            X.06mj r4 = X.C1709506mj.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 == 0) goto L87
            java.util.Map<X.05sg<?>, X.05sU<?>> r1 = r7.LIZLLL
            X.06oE r0 = X.C1718806oE.LIZ
            java.lang.Object r0 = r1.get(r0)
            X.05sU r0 = (X.C1490405sU) r0
            if (r0 == 0) goto L85
            T r1 = r0.LIZIZ
        L2c:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1
        L32:
            r5.LLILZIL = r1
            if (r3 == 0) goto L3c
            java.lang.String r0 = r3.getConversationId()
            if (r0 != 0) goto L3e
        L3c:
            java.lang.String r0 = ""
        L3e:
            X.0Xz1 r0 = X.C0YNP.LIZIZ(r0)
            r5.LLILZLL = r0
            int r0 = r5.hashCode()
            int r0 = -r0
            X.C487280J9a.LIZ(r0, r5)
            X.05sZ<T> r0 = r7.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L76
            boolean r0 = r8 instanceof X.C878960Ydy
            if (r0 == 0) goto L5e
            X.0Ydy r8 = (X.C878960Ydy) r8
            if (r8 == 0) goto L5e
            X.0YgU r2 = r8.LLILLL
        L5e:
            X.0YgU r0 = X.EnumC880520YgU.MESSAGE_REQUEST_SPAM
            if (r2 != r0) goto L67
            java.lang.String r0 = "message_request_spam"
        L64:
            r5.LLIZLLLIL = r0
            return
        L67:
            if (r3 == 0) goto L73
            boolean r1 = r3.isRisky()
            r0 = 1
            if (r1 != r0) goto L73
            java.lang.String r0 = "filtered_message_request"
            goto L64
        L73:
            java.lang.String r0 = "non_filtered_message_request"
            goto L64
        L76:
            boolean r0 = r8 instanceof X.C878950Ydx
            if (r0 == 0) goto L82
            X.0Ydx r8 = (X.C878950Ydx) r8
            if (r8 == 0) goto L82
            java.lang.String r0 = r8.LLILLJJLI
            if (r0 != 0) goto L64
        L82:
            java.lang.String r0 = "notification_page"
            goto L64
        L85:
            r1 = r2
            goto L2c
        L87:
            X.0Yj3 r0 = X.C882110Yj3.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La6
            java.util.Map<X.05sg<?>, X.05sU<?>> r1 = r7.LIZLLL
            X.05sf r0 = X.C1491505sf.LIZ
            java.lang.Object r0 = r1.get(r0)
            X.05sU r0 = (X.C1490405sU) r0
            if (r0 == 0) goto La4
            T r1 = r0.LIZIZ
        L9d:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r1
            goto L32
        La4:
            r1 = r2
            goto L9d
        La6:
            r1 = r2
            goto L32
        La8:
            r3 = r2
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC880120Yfq.<init>(android.app.Activity, X.0Yeu, X.0Ye3):void");
    }

    public static void LJFF(AbstractC880120Yfq abstractC880120Yfq, String str, String str2, String str3, int i) {
        String str4 = str3;
        String str5 = str2;
        if ((i & 2) != 0) {
            str5 = "single";
        }
        if ((i & 4) != 0) {
            str4 = "click";
        }
        abstractC880120Yfq.getClass();
        if (!Intrinsics.LJFF(str5, "single_undo")) {
            C885310YoD c885310YoD = C885310YoD.LIZ;
            String str6 = abstractC880120Yfq.LLIZLLLIL;
            InterfaceC879010Ye3 interfaceC879010Ye3 = abstractC880120Yfq.LLILLL;
            C879540Yeu<?> c879540Yeu = abstractC880120Yfq.LLILLJJLI;
            c885310YoD.getClass();
            C885310YoD.LJJIFFI(c879540Yeu, interfaceC879010Ye3, str6, str5, str, str4);
            return;
        }
        C0Y8T c0y8t = abstractC880120Yfq.LLILZ;
        if (c0y8t == null) {
            return;
        }
        C885310YoD c885310YoD2 = C885310YoD.LIZ;
        String str7 = abstractC880120Yfq.LLIZLLLIL;
        InterfaceC879010Ye3 interfaceC879010Ye32 = abstractC880120Yfq.LLILLL;
        c885310YoD2.getClass();
        C885310YoD.LJJI(str7, str5, interfaceC879010Ye32, c0y8t, str, str4, true);
    }
}
