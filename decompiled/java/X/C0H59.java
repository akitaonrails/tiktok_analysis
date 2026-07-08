package X;

import Y.ACListenerS110S0200000_6;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviStaticImageDataModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0H59, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H59 extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final FrameLayout LLILLJJLI;

    public C0H59(View view) {
        super(view);
        this.LL = (SmartImageView) view.findViewById(R.id.s4x);
        this.LLILLJJLI = (FrameLayout) view.findViewById(R.id.s4y);
    }

    public final void I5(ProfileNaviDataModel profileNaviDataModel, int i, final C0H5A c0h5a, final boolean z) {
        UrlModel urlModel;
        List<String> urlList;
        String str;
        float f;
        if (i == 0) {
            View view = this.itemView;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            C786410Ut5.T4(view, f);
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0H5B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (z) {
                        c0h5a.rd();
                    }
                }
            }, this.itemView);
            return;
        }
        if (profileNaviDataModel == null) {
            return;
        }
        C786410Ut5.I7(new ACListenerS110S0200000_6(c0h5a, profileNaviDataModel, 64), this.itemView);
        try {
            String str2 = profileNaviDataModel.background_color;
            if (str2 != null && str2.length() != 0) {
                str = profileNaviDataModel.background_color;
            } else {
                str = "#A5E6FF";
            }
            this.LLILLJJLI.setBackgroundColor(Color.parseColor(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        List<ProfileNaviStaticImageDataModel> list = profileNaviDataModel.staticImage;
        if (list == null || !(true ^ list.isEmpty()) || (urlModel = ((ProfileNaviStaticImageDataModel) ListProtector.get(list, 0)).thumbnailUrl) == null || (urlList = urlModel.getUrlList()) == null || urlList.size() <= 0) {
            return;
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse((String) ListProtector.get(urlList, 0)));
        c1331670kl3LJI.LJJIJL(this.LL.getContext());
        c1331670kl3LJI.LJJ(this.LL);
        c1331670kl3LJI.LJJ = EnumC1338240kve.CENTER_INSIDE;
        C786410Ut5.h3(c1331670kl3LJI);
    }
}
