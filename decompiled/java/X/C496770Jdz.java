package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496770Jdz extends AbstractC495800JcQ<GetRoomProfileCardResponse.ResponseData> {
    public final EnumC495780JcO LLILZIL;
    public final C11NJ LLILZLL;
    public C16F5 LLIZ;
    public final UserProfileEvent LLIZLLLIL;
    public C1324720kZq LLJ;
    public final DataChannel LLJI;
    public User LLJIJIL;
    public C1324720kZq LLJILJIL;
    public C16FS LLJILJILJ;
    public C1324720kZq LLJILLL;
    public C1324720kZq LLJJ;
    public C1324720kZq LLJJI;
    public final Room LLJJIII;
    public GetRoomProfileCardResponse.ResponseData LLJJIJI;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLJJIJIIJIL;

    @Override // X.AbstractC495790JcP
    public final Object LJIILIIL(GetRoomProfileCardResponse.ResponseData responseData) {
        return responseData;
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super GetRoomProfileCardResponse.ResponseData> interfaceC1364105Vn) {
        return responseData;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        this.LLILZLL.LJ();
    }

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return this.LL.LJ ? R.layout.hm4 : R.layout.hm5;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496770Jdz.LJIIJ():void");
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        C500260Jjc.LJIILIIL(this.LLILLL);
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLJJIJIIJIL;
    }

    public C496770Jdz(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLILZIL = EnumC495780JcO.ENIGMA;
        this.LLILZLL = new C11NJ();
        this.LLIZLLLIL = c495920Jcc.LJIIIIZZ;
        this.LLJI = c495920Jcc.LJIIJJI;
        this.LLJJIII = c495920Jcc.LJFF;
        this.LLJJIJIIJIL = new Pair<>(Boolean.TRUE, C13BV.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.bytedance.android.live.base.model.user.User r6, java.lang.Object r7) {
        /*
            r5 = this;
            webcast.api.room.GetRoomProfileCardResponse$ResponseData r7 = (webcast.api.room.GetRoomProfileCardResponse.ResponseData) r7
            r5.LLJJIJI = r7
            r5.LLJIJIL = r6
            boolean r4 = r5.LJIIIIZZ(r6)
            if (r4 == 0) goto Laf
            android.view.View r0 = r5.LLILLL
            X.C500260Jjc.LLFFF(r0)
            X.16F5 r1 = r5.LLIZ
            if (r1 == 0) goto L1e
            com.bytedance.android.live.base.model.user.User r0 = r5.LLJIJIL
            java.lang.String r0 = X.C0KVU.LIZLLL(r0)
            r1.setText(r0)
        L1e:
            com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting r0 = com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting.INSTANCE
            boolean r0 = r0.v2()
            r3 = 0
            if (r0 == 0) goto L80
            com.bytedance.android.live.base.model.user.User r0 = r5.LLJIJIL
            if (r0 == 0) goto L77
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getAvatarMedium()
            if (r0 == 0) goto L77
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L77
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L77
            com.bytedance.android.live.base.model.user.User r0 = r5.LLJIJIL
            if (r0 == 0) goto L89
            com.bytedance.android.live.base.model.ImageModel r1 = r0.getAvatarMedium()
        L45:
            X.0JBN r0 = X.C1819620xS4.LIZ()
            X.0kZf r1 = r0.LJIIIZ(r1)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.LJIJJ = r0
            X.0kZq r0 = r5.LLJILJIL
            r1.LJJI(r0)
            X.0Jci r0 = r5.LL
            long r0 = r0.LJII
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.0Jci r0 = r5.LL
            X.0Jcf r0 = r0.LIZJ
            boolean r1 = r0.LJI
            java.lang.String r0 = "profile_card"
            X.C01CC.LIZJ(r0, r2, r3, r1)
            com.bytedance.android.live.base.model.user.User r0 = r5.LLJIJIL
            com.bytedance.android.livesdk.model.BorderInfo r2 = X.C496970JeJ.LIZ(r0)
            if (r2 != 0) goto L8b
            X.0kZq r0 = r5.LLJ
            X.C500260Jjc.LJIILIIL(r0)
            return r4
        L77:
            com.bytedance.android.live.base.model.user.User r0 = r5.LLJIJIL
            if (r0 == 0) goto L89
            com.bytedance.android.live.base.model.ImageModel r1 = r0.getAvatarThumb()
            goto L45
        L80:
            com.bytedance.android.live.base.model.user.User r0 = r5.LLJIJIL
            if (r0 == 0) goto L89
            com.bytedance.android.live.base.model.ImageModel r1 = r0.getAvatarThumb()
            goto L45
        L89:
            r1 = r3
            goto L45
        L8b:
            X.0kZq r0 = r5.LLJ
            X.C500260Jjc.LLFFF(r0)
            X.0JBN r1 = X.C1819620xS4.LIZ()
            com.bytedance.android.live.base.model.ImageModel r0 = r2.icon
            X.0kZf r1 = r1.LJIIIZ(r0)
            X.0kZq r0 = r5.LLJ
            r1.LJJI(r0)
            com.bytedance.android.live.base.model.user.User r3 = r5.LLJIJIL
            java.lang.String r2 = r2.source
            X.0Jci r0 = r5.LL
            X.0Jcf r0 = r0.LIZJ
            boolean r1 = r0.LJI
            java.lang.String r0 = "enigma_profile_card"
            X.C496970JeJ.LIZIZ(r3, r2, r0, r1)
            return r4
        Laf:
            android.view.View r0 = r5.LLILLL
            X.C500260Jjc.LJIILIIL(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496770Jdz.LJIIIZ(com.bytedance.android.live.base.model.user.User, java.lang.Object):boolean");
    }
}
