package X;

import Y.ACListenerS166S0100000_32;
import Y.ACListenerS167S0100000_33;
import Y.ACallableS417S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.experiment.FollowFeedCombineOptimizeExpObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21516619Im {
    public Aweme LL;
    public String LLILLJJLI;
    public DataCenter LLILLL;
    public final Context LLILZ;
    public final View LLILZIL;

    public AbstractC21516619Im(View view) {
        this.LLILZ = view.getContext();
        this.LLILZIL = view;
        C21516719In c21516719In = (C21516719In) this;
        View viewLIZJ = C20673215v0.LIZJ(R.layout.c7q, C1388190mED.LIZ(c21516719In.LLILZ));
        if (view instanceof FrameLayout) {
            ((ViewGroup) view).addView(viewLIZJ);
        }
        c21516719In.LLILZLL = (RemoteImageView) viewLIZJ.findViewById(R.id.htw);
        c21516719In.LLIZ = (FrameLayout) viewLIZJ.findViewById(R.id.hty);
        c21516719In.LLIZLLLIL = (TextView) viewLIZJ.findViewById(R.id.hu0);
        View viewFindViewById = viewLIZJ.findViewById(R.id.htx);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(c21516719In, 119), viewFindViewById);
        }
        View viewFindViewById2 = viewLIZJ.findViewById(R.id.htz);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS167S0100000_33(c21516719In, 106), viewFindViewById2);
        }
        if (C444960Hcc.LIZJ(view.getContext())) {
            c21516719In.LLIZLLLIL.setBackgroundResource(R.drawable.bsb);
        } else {
            c21516719In.LLIZLLLIL.setBackgroundResource(R.drawable.bsa);
        }
        if (FollowFeedCombineOptimizeExpObject.INSTANCE.isHit()) {
            C15O7.LIZJ(new ACallableS417S0100000_10(view, 5)).LJ(new C21524519Ln(c21516719In, 6), C15O7.LJIIIIZZ, null);
        } else {
            c21516719In.LLIZLLLIL.setText(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O5().LIZJ(view.getContext(), "pm_following_livecard_live_icon"));
        }
    }
}
