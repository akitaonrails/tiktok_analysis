package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497950Jft extends AbstractC508030Jw9<C507750Jvh> {
    public final C1324720kZq LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public boolean LLILZLL;

    public C497950Jft(View view) {
        super(view);
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.xsw);
        this.LLILLL = (C1324720kZq) view.findViewById(R.id.xsx);
        this.LLILZ = (C16F5) view.findViewById(R.id.xt0);
        this.LLILZIL = (C16F5) view.findViewById(R.id.xt1);
    }

    @Override // X.C0K07
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    public final void I5(C507750Jvh c507750Jvh) {
        R5(c507750Jvh);
        GetSubPrivilegeDetailResponse.Data data = c507750Jvh.LLILZ;
        if (this.LLILZLL) {
            View viewFindViewById = this.itemView.findViewById(R.id.tv_title);
            if (viewFindViewById != null) {
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
            View viewFindViewById2 = this.itemView.findViewById(R.id.zhr);
            if (viewFindViewById2 != null) {
                C500260Jjc.LJIILIIL(viewFindViewById2);
            }
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                C786410Ut5.W5(view, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarThumb()).LJJI(this.LLILLL);
        C1143680frq.LJI(this.LLILLJJLI, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_5", "ttlive_sub_discord_icon.png"), null, true);
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            c16f5.setText(C0KVU.LIZ(data.anchorDetail));
        }
        C16F5 c16f52 = this.LLILZIL;
        if (c16f52 != null) {
            c16f52.setText(C0KVU.LIZ(UserService.getInstance().user().LJIJJLI()));
        }
        C16F5 c16f53 = this.LLILZ;
        if (c16f53 != null) {
            c16f53.setTextColor(C0JS0.LIZJ("#A6BAFF"));
        }
        C16F5 c16f54 = this.LLILZIL;
        if (c16f54 != null) {
            c16f54.setTextColor(C0JS0.LIZJ("#C8A6FF"));
        }
    }
}
