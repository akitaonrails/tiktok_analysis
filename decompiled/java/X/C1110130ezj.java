package X;

import Y.ACListenerS120S0200000_17;
import Y.ACListenerS152S0100000_17;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentDeleteForbidRegionalSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0ezj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110130ezj extends RecyclerView.ViewHolder {
    public final ImageView LL;
    public final TextView LLILLJJLI;
    public final ViewGroup LLILLL;
    public final C1668220tVs LLILZ;
    public final C994850bzn LLILZIL;
    public final TextView LLILZLL;
    public final View LLIZ;
    public final TextView LLIZLLLIL;

    public C1110130ezj(View view) {
        super(view);
        AbstractC20085213iM abstractC20085213iM = (AbstractC20085213iM) view.findViewById(R.id.c9c);
        if (abstractC20085213iM != null) {
            abstractC20085213iM.setViewCompositionStrategy(C20088213iq.LIZIZ);
        }
        this.LL = (ImageView) view.findViewById(R.id.user_avatar);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.user_name);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.kmc);
        this.LLILZ = (C1668220tVs) view.findViewById(R.id.c9c);
        this.LLILZIL = (C994850bzn) view.findViewById(R.id.xlq);
        this.LLILZLL = (TextView) view.findViewById(R.id.jgc);
        this.LLIZ = view.findViewById(R.id.fkh);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.xlj);
    }

    public final void N5(C1116210f9X c1116210f9X) {
        List urls;
        this.LLILZIL.LIZ(c1116210f9X.LLILZLL, c1116210f9X.LLILZIL / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (c1116210f9X.LLILZLL == 20) {
            this.LLILZ.setGear(EnumC1088820eRM.HIGH);
        } else {
            this.LLILZ.setGear(EnumC1088820eRM.LOW);
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel avatarThumb = c1116210f9X.LLILLJJLI.getAvatarThumb();
        if (avatarThumb != null) {
            urls = avatarThumb.getUrls();
        } else {
            urls = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        int width = this.LL.getWidth();
        int height = this.LL.getHeight();
        c1324610kZfLIZJ.LJ = width;
        c1324610kZfLIZJ.LJFF = height;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
        c1324610kZfLIZJ.LJJI(this.LL);
        this.LLILLJJLI.setText(C0KVU.LIZ(c1116210f9X.LLILLJJLI));
        this.LLIZLLLIL.setText(c1116210f9X.LLILLL);
        C786410Ut5.LLIL(this.LLILZLL, 8);
        ViewOnClickListenerC751210TdP viewOnClickListenerC751210TdP = new ViewOnClickListenerC751210TdP(new ACListenerS152S0100000_17(c1116210f9X, 57));
        C786410Ut5.Q7(this.LL, viewOnClickListenerC751210TdP);
        C786410Ut5.T7(this.LLILLJJLI, viewOnClickListenerC751210TdP);
        this.LLILZ.m64setBackgroundColor8_81llA(C1685850tyJ.LIZIZ(351464189));
    }

    public final void I5(C1116210f9X c1116210f9X, DataChannel dataChannel) {
        N5(c1116210f9X);
        if (!LiveStarCommentDeleteForbidRegionalSetting.INSTANCE.getValue()) {
            C786410Ut5.LJLLLLLL(0, this.LLIZ);
            C786410Ut5.I7(new ViewOnClickListenerC751210TdP(new ACListenerS120S0200000_17(c1116210f9X, dataChannel, 12)), this.LLIZ);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLIZ);
        }
        C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(6.0f), this.LLILLL);
        C786410Ut5.LLIL(this.LLIZLLLIL, 0);
    }

    public final void L5(C1116210f9X c1116210f9X, boolean z) {
        Drawable drawableLJIIJ;
        Drawable drawableLJIIJ2;
        if (z) {
            if (c1116210f9X.LLJJ) {
                View view = this.itemView;
                if (C497740JfY.LJJ()) {
                    drawableLJIIJ2 = C497740JfY.LJIIJ(R.drawable.e83);
                } else {
                    drawableLJIIJ2 = C497740JfY.LJIIJ(R.drawable.e82);
                }
                view.setBackground(drawableLJIIJ2);
                return;
            }
            this.itemView.setBackground(null);
            return;
        }
        N5(c1116210f9X);
        C786410Ut5.LJLLLLLL(8, this.LLIZ);
        if (c1116210f9X.LLILLJJLI.getId() == UserService.getInstance().user().getCurrentUserId()) {
            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(6.0f), this.LLILLL);
            C786410Ut5.LLIL(this.LLIZLLLIL, 0);
        } else {
            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(15.0f), this.LLILLL);
            C786410Ut5.LLIL(this.LLIZLLLIL, 8);
        }
        if (c1116210f9X.LLJJ) {
            View view2 = this.itemView;
            if (C497740JfY.LJJ()) {
                drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.e83);
            } else {
                drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.e82);
            }
            view2.setBackground(drawableLJIIJ);
            return;
        }
        this.itemView.setBackground(null);
    }
}
