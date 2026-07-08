package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KAO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KAO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubPackagePageDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KAO(SubPackagePageDialog subPackagePageDialog) {
        super(0);
        this.LL = subPackagePageDialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r11 = this;
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog r0 = r11.LL
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel r0 = r0.LLILLL
            r3 = 0
            if (r0 == 0) goto L90
            androidx.lifecycle.LiveData<X.0KGz> r0 = r0.LLILLL
            java.lang.Object r0 = r0.getValue()
            X.0KGz r0 = (X.C514830KGz) r0
            if (r0 == 0) goto L90
            X.0KH1 r0 = r0.LIZJ
            if (r0 == 0) goto L90
            webcast.api.sub.TemplateListData r2 = r0.LIZ
            if (r2 == 0) goto L1d
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege> r1 = r2.packagePrivilegeList
            if (r1 != 0) goto L1f
        L1d:
            X.13BV r1 = X.C13BV.INSTANCE
        L1f:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L97
            if (r2 == 0) goto L2b
            com.bytedance.android.live.base.model.emoji.EmoteConfig r3 = r2.emoteConfig
        L2b:
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageDialog r0 = r11.LL
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel r8 = r0.LLILLL
            if (r8 == 0) goto L97
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            if (r3 == 0) goto L8e
            java.util.List<com.bytedance.android.live.base.model.emoji.EmoteModel> r0 = r3.defaultEmoteList
            if (r0 == 0) goto L8e
            int r10 = r0.size()
        L40:
            java.util.Iterator r9 = r1.iterator()
        L44:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r6 = r9.next()
            com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege r6 = (com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege) r6
            com.bytedance.android.livesdk.chatroom.api.SubPackageSummary r0 = r6.packageSummary
            if (r0 == 0) goto L58
            java.lang.String r5 = r0.id
            if (r5 != 0) goto L5a
        L58:
            java.lang.String r5 = "-1"
        L5a:
            X.0KFB r4 = new X.0KFB
            if (r0 == 0) goto L62
            java.lang.String r3 = r0.name
            if (r3 != 0) goto L64
        L62:
            java.lang.String r3 = ""
        L64:
            emotes.model.EmoteListResult r0 = r6.emoteDetail
            if (r0 == 0) goto L8c
            java.util.List r0 = r0.getEmoteList()
            if (r0 == 0) goto L8c
            int r2 = r0.size()
        L72:
            int r2 = r2 + r10
            java.util.List<com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit> r0 = r6.customizedBenefits
            int r1 = r0.size()
            com.bytedance.android.livesdk.chatroom.api.SubPackageSummary r0 = r6.packageSummary
            if (r0 == 0) goto L8a
            com.bytedance.android.livesdk.chatroom.api.SubPackagePriceInfo r0 = r0.priceInfo
            if (r0 == 0) goto L8a
            int r0 = r0.priceGroup
        L83:
            r4.<init>(r3, r2, r1, r0)
            r7.put(r5, r4)
            goto L44
        L8a:
            r0 = 0
            goto L83
        L8c:
            r2 = 0
            goto L72
        L8e:
            r10 = 0
            goto L40
        L90:
            r2 = r3
            goto L1d
        L92:
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, X.0KFB>> r0 = r8.LLILZ
            r0.setValue(r7)
        L97:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KAO.invoke():java.lang.Object");
    }
}
