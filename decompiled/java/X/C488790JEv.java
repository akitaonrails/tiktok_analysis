package X;

import Y.ACListenerS25S1300000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0JEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488790JEv extends RelativeLayout {
    public final View LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final C197039127h LLILZ;
    public final C197039127h LLILZIL;
    public final SmartImageView LLILZLL;
    public boolean LLIZ;
    public InterfaceC488780JEu LLIZLLLIL;

    public final void setClickWatchLive(boolean z) {
    }

    private final void setRadioCover(LiveRoomStruct liveRoomStruct) {
        String str;
        UrlModel avatarLarger;
        List<String> urlList;
        User user = liveRoomStruct.owner;
        if (user == null || (avatarLarger = user.getAvatarLarger()) == null || (urlList = avatarLarger.getUrlList()) == null || (str = (String) ListProtector.get(urlList, 0)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIFFI = new C1332060klg(25, 3);
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIZ.LJJ(this.LLILZLL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
    }

    public final void setClickSkip(boolean z) {
        this.LLIZ = z;
    }

    public C488790JEv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.bbs, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = (TextView) viewLJLLJ.findViewById(R.id.hu5);
        this.LLILLL = (TextView) viewLJLLJ.findViewById(R.id.hu3);
        this.LLILZ = (C197039127h) viewLJLLJ.findViewById(R.id.hu6);
        this.LLILZIL = (C197039127h) viewLJLLJ.findViewById(R.id.hu2);
        this.LLILZLL = (SmartImageView) viewLJLLJ.findViewById(R.id.jq_);
    }

    public final void LIZ(LiveRoomStruct liveRoomStruct, String str) {
        MaskLayer maskLayer;
        if (liveRoomStruct != null && (maskLayer = liveRoomStruct.maskLayer) != null) {
            C488810JEx c488810JEx = C488810JEx.LIZ;
            TextView textView = this.LLILLJJLI;
            Text text = maskLayer.title;
            c488810JEx.getClass();
            C488810JEx.LIZIZ(textView, text);
            C488810JEx.LIZIZ(this.LLILLL, maskLayer.subTitle);
            ((AppCompatImageView) this.LL.findViewById(R.id.hu4)).setImageResource(R.drawable.bb3);
            C786410Ut5.U8(this.LLILZ, new ACListenerS25S1300000_7(this, maskLayer, liveRoomStruct, str, 0));
            C786410Ut5.U8(this.LLILZIL, new ACListenerS25S1300000_7(this, maskLayer, liveRoomStruct, str, 1));
            setRadioCover(liveRoomStruct);
        }
    }
}
