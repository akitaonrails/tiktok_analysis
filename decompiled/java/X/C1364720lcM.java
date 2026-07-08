package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1364720lcM extends C2217421BqW implements Function1<IMContact, Unit> {
    public C1364720lcM(ViewOnTouchListenerC1364750lcP viewOnTouchListenerC1364750lcP) {
        super(1, viewOnTouchListenerC1364750lcP, ViewOnTouchListenerC1364750lcP.class, "sendMessage", "sendMessage(Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMContact;)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r16) {
        /*
            r15 = this;
            java.lang.Object r0 = r15.receiver
            r0.getClass()
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = X.ViewOnTouchListenerC1364750lcP.LLILZ
            if (r0 == 0) goto L40
            android.os.Bundle r1 = r0.extras
            if (r1 == 0) goto L40
            java.lang.String r0 = "aid"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "forward_limit_label_category"
            int r1 = r1.getInt(r0)
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L40
            if (r1 <= 0) goto L40
            X.0lcP r0 = X.ViewOnTouchListenerC1364750lcP.LL
            r0.getClass()
            X.01GW r0 = X.ViewOnTouchListenerC1364750lcP.LLJI
            java.lang.Object r0 = r0.getValue()
            X.0ldQ r0 = (X.InterfaceC1365380ldQ) r0
            boolean r0 = r0.LJJJJJ(r1, r2)
            if (r0 == 0) goto L40
            r0 = 671(0x29f, float:9.4E-43)
            kotlin.jvm.internal.AFwS209S0000000_21 r0 = kotlin.jvm.internal.AFwS209S0000000_21.get$arr$(r0)
            X.C0CNO.LJ(r0)
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            com.ss.android.ugc.aweme.sharer.model.SharePackage r4 = X.ViewOnTouchListenerC1364750lcP.LLILZ
            if (r4 == 0) goto L3d
            X.0rjL r0 = com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi r0 = X.C1599690rjL.LIZ()
            X.0ldQ r3 = r0.getShareService()
            r5 = 0
            java.util.List r6 = java.util.Collections.singletonList(r16)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            android.os.Bundle r0 = r4.extras
            java.lang.String r1 = "tab_name"
            if (r0 == 0) goto Lab
            java.lang.String r0 = r0.getString(r1)
        L65:
            java.lang.String r2 = ""
            if (r0 != 0) goto L6a
            r0 = r2
        L6a:
            r11.put(r1, r0)
            android.os.Bundle r0 = r4.extras
            java.lang.String r1 = "is_from_push"
            if (r0 == 0) goto L79
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L7a
        L79:
            r0 = r2
        L7a:
            r11.put(r1, r0)
            android.os.Bundle r0 = r4.extras
            java.lang.String r1 = "push_type"
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L8a
        L89:
            r0 = r2
        L8a:
            r11.put(r1, r0)
            android.os.Bundle r0 = r4.extras
            java.lang.String r1 = "push_id"
            if (r0 == 0) goto L9a
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L9a
            r2 = r0
        L9a:
            r11.put(r1, r2)
            r8 = 1
            java.util.Map r14 = X.C2097608Jq.LJ()
            r7 = r5
            r9 = r5
            r10 = r5
            r12 = r8
            r13 = r5
            r3.LJJJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L3d
        Lab:
            r0 = r5
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364720lcM.invoke(java.lang.Object):java.lang.Object");
    }
}
