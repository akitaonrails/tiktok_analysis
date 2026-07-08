package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import webcast.data.SecondaryBannerComponent;

/* JADX INFO: renamed from: X.0hU2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205800hU2 extends FrameLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public SecondaryBannerComponent LLILLL;

    private final String getBannerType() {
        Integer numValueOf;
        SecondaryBannerComponent secondaryBannerComponent = this.LLILLL;
        return (secondaryBannerComponent == null || (numValueOf = Integer.valueOf(secondaryBannerComponent.type)) == null) ? "unknown" : numValueOf.intValue() == 1 ? "giveaway" : numValueOf.intValue() == 2 ? "highlight" : "unknown";
    }

    public final void LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "live_take_page");
        linkedHashMap.put("author_id", getAuthorID());
        linkedHashMap.put("banner_type", getBannerType());
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_banner_click", linkedHashMap);
    }

    private final String getAuthorID() {
        String currentUserID;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) ? "" : currentUserID;
    }

    public C1205800hU2(final Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bwo, this, true);
        this.LL = (TuxTextView) findViewById(R.id.tv_sub_banner_message);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.lwc);
        C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0hU3
            @Override // X.AbstractViewOnClickListenerC420730Ged
            public final void LIZ(View view) {
                String str;
                if (view != null) {
                    this.LLILZ.LIZIZ();
                    SecondaryBannerComponent secondaryBannerComponent = this.LLILZ.LLILLL;
                    if (secondaryBannerComponent != null && (str = secondaryBannerComponent.schema) != null && str.length() != 0) {
                        SmartRouter.buildRoute(context, str).open();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(webcast.data.SecondaryBannerComponent r8) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1205800hU2.LIZ(webcast.data.SecondaryBannerComponent):void");
    }
}
