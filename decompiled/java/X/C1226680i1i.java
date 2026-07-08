package X;

import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;

/* JADX INFO: renamed from: X.0i1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226680i1i {
    public static final C20603715jn LIZIZ() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 2;
        IMStyleViewBridgeApi.LIZ.getClass();
        IMStyleViewBridgeApi iMStyleViewBridgeApiLIZ = C1227300i2i.LIZ();
        c20603715jn.LIZLLL = iMStyleViewBridgeApiLIZ != null ? iMStyleViewBridgeApiLIZ.LIZIZ() : null;
        return c20603715jn;
    }

    public static final C1227810i3X LJ() {
        Context context = C1383370m6R.LIZ;
        return new C1227810i3X(context.getString(2131850370), context.getString(2131850369));
    }

    public static C1390920mIc LIZ(AbstractC1225780i0G abstractC1225780i0G) {
        Context contextLIZIZ = abstractC1225780i0G.LIZIZ();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = (int) (0.95f * C1232370iAt.LIZLLL(contextLIZIZ));
        tuxSheet.LLJLL = true;
        tuxSheet.LLILLL = false;
        c1390920mIc.LJI(48);
        return c1390920mIc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (X.C894660Z7w.LJ() == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1228040i3u LIZJ(X.AbstractC1225770i0F r6) {
        /*
            X.0i0G r0 = r6.LJJJJLL()
            java.util.Map r2 = r0.LIZLLL()
            r1 = 0
            if (r2 == 0) goto L81
            java.lang.String r0 = "open_platform_biz_line"
            java.lang.Object r5 = r2.get(r0)
        L11:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L7f
            java.lang.String r5 = (java.lang.String) r5
        L17:
            java.lang.String r4 = ""
            if (r5 != 0) goto L1c
            r5 = r4
        L1c:
            X.0i0G r0 = r6.LJJJJLL()
            java.util.Map r2 = r0.LIZLLL()
            if (r2 == 0) goto L7d
            java.lang.String r0 = "open_platform_biz_scene"
            java.lang.Object r3 = r2.get(r0)
        L2c:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L34
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L35
        L34:
            r3 = r4
        L35:
            X.0i0G r0 = r6.LJJJJLL()
            java.util.Map r2 = r0.LIZLLL()
            if (r2 == 0) goto L45
            java.lang.String r0 = "open_platform_source"
            java.lang.Object r1 = r2.get(r0)
        L45:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L4e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L4e
            r4 = r1
        L4e:
            int r0 = r5.length()
            if (r0 == 0) goto L60
            int r0 = r3.length()
            if (r0 == 0) goto L60
            int r0 = r4.length()
            if (r0 != 0) goto L77
        L60:
            r6.getTag()
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L83
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 != 0) goto L83
        L77:
            X.0i3u r0 = new X.0i3u
            r0.<init>(r5, r3, r4)
            return r0
        L7d:
            r3 = r1
            goto L2c
        L7f:
            r5 = r1
            goto L17
        L81:
            r5 = r1
            goto L11
        L83:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "params invalid, bizLine & bizScene & source shouldn't be empty"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226680i1i.LIZJ(X.0i0F):X.0i3u");
    }

    public static final String LJFF(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return iMContact.getUid();
        }
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        return "";
    }

    public static final boolean LJI(IMContact iMContact) {
        String strLJFF = LJFF(iMContact);
        if (strLJFF != null && strLJFF.length() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return C1572306Dp.LIZ(iMContact.getUid());
        }
        return false;
    }

    public static final void LIZLLL(AbstractC1225770i0F abstractC1225770i0F, String str) {
        AbsContactSelectorFragment fragment;
        boolean zLJIIIZ = abstractC1225770i0F.LJJJJLL().LJIIIZ().LJIIIZ();
        InterfaceC1226510i1R interfaceC1226510i1R = abstractC1225770i0F.LLILLL;
        if (interfaceC1226510i1R != null && (fragment = interfaceC1226510i1R.getFragment()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LIZ(zLJIIIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }
}
