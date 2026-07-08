package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.List;

/* JADX INFO: renamed from: X.106U, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C106U implements C103R {
    public String LIZ;
    public View LIZIZ;

    @Override // X.C103R
    public final void LIZ() {
        this.LIZIZ = null;
    }

    @Override // X.C103R
    public final void LIZIZ(C19EG c19eg) {
    }

    @Override // X.C103R
    public final void LIZJ() {
    }

    @Override // X.C103R
    public final void LIZLLL(Context context, ViewModelStoreOwner viewModelStoreOwner) {
    }

    @Override // X.C103R
    public final void LJFF() {
    }

    @Override // X.C103R
    public final void LLFF() {
    }

    @Override // X.C103R
    public final void onPagePause() {
    }

    @Override // X.C103R
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.C103R
    public final void LJ(List<? extends AbstractC191843103l> list) {
        View view = this.LIZIZ;
        if (view != null) {
            LJIIIIZZ(view);
        }
    }

    @Override // X.C103R
    public final void LJI(View view) {
        this.LIZIZ = view;
        LJIIIIZZ(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(android.view.View r16) {
        /*
            r15 = this;
            r0 = 2131395179(0x7f0a826b, float:1.8411063E38)
            r4 = r16
            android.view.View r3 = r4.findViewById(r0)
            r0 = 2131375232(0x7f0a3480, float:1.8370606E38)
            android.view.View r2 = r4.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r2 = (com.bytedance.tux.input.TuxTextView) r2
            r0 = 2131367509(0x7f0a1655, float:1.8354942E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r3 == 0) goto L99
            if (r2 == 0) goto L99
            if (r1 == 0) goto L99
            r5 = r15
            java.lang.String r0 = r5.LIZ
            java.lang.String r7 = "dm_potential_connection"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            r8 = 0
            java.lang.String r6 = "dm_others"
            if (r0 != 0) goto L35
            java.lang.String r0 = r5.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L54
        L35:
            X.106T r0 = X.C106T.LIZ
            r0.getClass()
            java.lang.Class<com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService> r9 = com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService.class
            r13 = 14
            r14 = 0
            r10 = r8
            r11 = r8
            r12 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService r0 = (com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService) r0
            if (r0 == 0) goto L54
            boolean r0 = r0.LIZLLL()
            if (r0 == 0) goto L54
            X.C106T.LJ(r4, r3, r2, r1)
            return
        L54:
            java.lang.String r5 = r5.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r7)
            if (r0 == 0) goto L77
            X.104w r0 = X.C191880104w.LIZ
            r0.getClass()
            java.lang.String r0 = "dm_setting_potential_connection"
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r7 = X.C191880104w.LJIIJJI(r8, r0)
        L67:
            if (r7 == 0) goto L94
        L69:
            int r5 = r7.tipsType
            r0 = 7
            if (r5 != r0) goto L94
            X.106T r0 = X.C106T.LIZ
            r0.getClass()
            X.C106T.LJ(r4, r3, r2, r1)
            return
        L77:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r6)
            if (r0 == 0) goto L89
            X.104w r0 = X.C191880104w.LIZ
            r0.getClass()
            java.lang.String r0 = "dm_setting_others"
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r7 = X.C191880104w.LJIIJJI(r8, r0)
            goto L67
        L89:
            com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r7 = new com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem
            r10 = 0
            r12 = -1
            r9 = r8
            r11 = r8
            r13 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L69
        L94:
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r3)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106U.LJIIIIZZ(android.view.View):void");
    }

    @Override // X.C103R
    public final void LJII(C103L c103l, Bundle bundle, Bundle bundle2) {
        String str;
        if (c103l != null) {
            str = c103l.LIZ;
        } else {
            str = null;
        }
        this.LIZ = str;
    }
}
