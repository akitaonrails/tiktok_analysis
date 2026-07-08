package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.relation.model.LinkPrivacyPopupStatusResponse;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;

/* JADX INFO: renamed from: X.0iDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234230iDt implements InterfaceC1234240iDu {
    public static final C1234230iDt LIZIZ = new C1234230iDt();
    public final /* synthetic */ InterfaceC1234240iDu LIZ = (InterfaceC1234240iDu) C2208308kz.LIZIZ.create(InterfaceC1234240iDu.class);

    @Override // X.InterfaceC1234240iDu
    @InterfaceC1501240pAY("/tiktok/privacy/setting/suggestion/update/v1")
    @InterfaceC1485505rh
    public final AbstractC19484711Kz<BaseResponse> LIZ(@InterfaceC1501100pAK("field") String str, @InterfaceC1501100pAK("value") int i) {
        return this.LIZ.LIZ(str, i);
    }

    @Override // X.InterfaceC1234240iDu
    @InterfaceC1501200pAU("/tiktok/v1/link/privacy/popup/status/")
    public final AbstractC19484711Kz<LinkPrivacyPopupStatusResponse> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC1234240iDu
    @InterfaceC1501240pAY("/ug/social/invite/msg/short_url/")
    @InterfaceC1485505rh
    public final AbstractC19484711Kz<ShortenUrlModel> LIZJ(@InterfaceC1501100pAK("url") String str) {
        return this.LIZ.LIZJ(str);
    }

    @Override // X.InterfaceC1234240iDu
    @InterfaceC1501200pAU("/ug/social/invite/msg/settings/")
    public final AbstractC19484711Kz<SmgSettingsModel> LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC1234240iDu
    @InterfaceC1501240pAY("/tiktok/v1/link/privacy/popup/status/update/")
    @InterfaceC1485505rh
    public final AbstractC19484711Kz<BaseResponse> LJ(@InterfaceC1501100pAK("displayed") boolean z) {
        return this.LIZ.LJ(z);
    }

    @Override // X.InterfaceC1234240iDu
    @InterfaceC1501200pAU("/tiktok/v1/sharer/info/")
    public final C11NZ<ExposeSharerData> LJFF(@InterfaceC1501120pAM("link_id") String str, @InterfaceC1501120pAM("share_type") int i, @InterfaceC1501120pAM("share_source") String str2, @InterfaceC1501120pAM("from_uid") String str3, @InterfaceC1501120pAM("sec_from_uid") String str4, @InterfaceC1501120pAM("item_id") String str5, @InterfaceC1501120pAM("checksum") String str6, @InterfaceC1501120pAM("timestamp") String str7, @InterfaceC1501120pAM("invitation_scene") String str8, @InterfaceC1501120pAM("share_url") String str9, @InterfaceC1501120pAM("share_link_mode") int i2, @InterfaceC1501120pAM("live_link_relation_ab") Integer num) {
        return this.LIZ.LJFF(str, i, str2, str3, str4, str5, str6, str7, str8, str9, i2, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C1233440iCc r19, X.EnumC1234280iDy r20, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.feed.model.ExposeSharerData> r21) {
        /*
            r18 = this;
            r4 = r21
            boolean r0 = r4 instanceof X.C1233480iCg
            if (r0 == 0) goto L68
            r3 = r4
            X.0iCg r3 = (X.C1233480iCg) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r3.LLILLL = r2
        L14:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L70
            X.C155000ia.LIZIZ(r4)
        L24:
            X.08Uu r4 = (X.AbstractC2126608Uu) r4
            r4.checkValid()
            return r4
        L2a:
            X.C155000ia.LIZIZ(r4)
            X.0iDt r5 = X.C1234230iDt.LIZIZ
            r4 = r19
            java.lang.String r6 = r4.LIZLLL
            X.0iDy r0 = r4.LIZ
            if (r0 != 0) goto L39
            r0 = r20
        L39:
            int r7 = r0.getRawValue()
            java.lang.String r8 = r4.LIZJ
            java.lang.String r9 = r4.LJ
            java.lang.String r10 = ""
            if (r9 != 0) goto L46
            r9 = r10
        L46:
            java.lang.String r0 = r4.LJFF
            if (r0 == 0) goto L4b
            r10 = r0
        L4b:
            java.lang.String r11 = r4.LIZIZ
            java.lang.String r12 = r4.LJII
            java.lang.String r13 = r4.LJIIIIZZ
            java.lang.String r14 = r4.LJIIIZ
            java.lang.String r15 = r4.LJIIJJI
            int r0 = r4.LJIIL
            r17 = 0
            r16 = r0
            X.11NZ r0 = r5.LJFF(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.LLILLL = r1
            java.lang.Object r4 = X.C11UD.LIZJ(r0, r3)
            if (r4 != r2) goto L24
            return r2
        L68:
            X.0iCg r3 = new X.0iCg
            r0 = r18
            r3.<init>(r0, r4)
            goto L14
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1234230iDt.LJI(X.0iCc, X.0iDy, X.05Vn):java.lang.Object");
    }
}
