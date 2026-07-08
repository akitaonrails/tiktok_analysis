package X;

import android.view.View;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.ss.android.ugc.profile.business.profile.popup.MyProfileGuideWidgetV2;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ig2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251680ig2 extends C09AY implements InterfaceC1631620sYq<InterfaceC960503pD, Boolean, Boolean, Unit> {
    public final /* synthetic */ C259800zU<View> LL;
    public final /* synthetic */ BaseMyProfileGuideWidget LLILLJJLI;
    public final /* synthetic */ MyProfileGuideState LLILLL;
    public final /* synthetic */ C20515215Pi LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1251680ig2(C259800zU c259800zU, MyProfileGuideWidgetV2 myProfileGuideWidgetV2, MyProfileGuideState myProfileGuideState, C20515215Pi c20515215Pi) {
        super(3);
        this.LL = c259800zU;
        this.LLILLJJLI = myProfileGuideWidgetV2;
        this.LLILLL = myProfileGuideState;
        this.LLILZ = c20515215Pi;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // X.InterfaceC1631620sYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(X.InterfaceC960503pD r8, java.lang.Boolean r9, java.lang.Boolean r10) {
        /*
            r7 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            r6 = 1
            if (r0 != 0) goto L44
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r10, r1)
            if (r0 != 0) goto L44
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r1)
            if (r0 == 0) goto L41
            X.00zU<android.view.View> r0 = r7.LL
            T r0 = r0.element
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L32
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L32
            X.00zU<android.view.View> r0 = r7.LL
            T r1 = r0.element
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L32
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L32:
            com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget r0 = r7.LLILLJJLI
            com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideViewModel r1 = r0.LJIILIIL()
            r0 = 151(0x97, float:2.12E-43)
            kotlin.jvm.internal.AFwS283S0000000_35 r0 = kotlin.jvm.internal.AFwS283S0000000_35.get$arr$(r0)
            r1.setState(r0)
        L41:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            X.00zU<android.view.View> r0 = r7.LL
            T r0 = r0.element
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L53
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L53
            goto L41
        L53:
            com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget r1 = r7.LLILLJJLI
            com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState r0 = r7.LLILLL
            r1.getClass()
            boolean r0 = com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget.LJIJJLI(r0)
            if (r0 == 0) goto L41
            X.0ig3 r5 = new X.0ig3
            com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget r0 = r7.LLILLJJLI
            r0.getClass()
            X.19EG r0 = X.C1745060vVo.LIZ(r0)
            X.0TGX r4 = X.C0HZJ.LIZ(r0)
            kotlin.jvm.internal.AwS420S0200000_19 r3 = new kotlin.jvm.internal.AwS420S0200000_19
            X.00zU<android.view.View> r2 = r7.LL
            X.15Pi r1 = r7.LLILZ
            r0 = 154(0x9a, float:2.16E-43)
            r3.<init>(r2, r1, r0)
            r5.<init>(r4, r3)
            com.bytedance.poplayer.core.PopupManager.LJIJI(r5, r6)
            X.0iaG r0 = new X.0iaG
            r0.<init>()
            X.0iaG r0 = r0.LIZ()
            long r2 = java.lang.System.currentTimeMillis()
            com.bytedance.keva.Keva r1 = r0.LIZLLL
            java.lang.String r0 = "last_show_time"
            r1.storeLong(r0, r2)
            X.0ihT r1 = X.C1252570ihT.LIZ
            X.0iYE r0 = X.EnumC1246840iYE.SHOW
            java.lang.String r0 = r0.getType()
            r1.getClass()
            X.C1252570ihT.LIZ(r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251680ig2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
