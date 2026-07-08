package X;

import Y.ACListenerS128S0200000_26;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.privacy.phl.feed.PhlFeedFragment;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0vh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752020vh2 extends AbstractC21673619ry<C610310Nwj> {
    public final List<Video> LL;
    public final Fragment LLILLJJLI;
    public Long LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1752020vh2(PhlFeedFragment phlFeedFragment, List list) {
        this.LL = list;
        this.LLILLJJLI = phlFeedFragment;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C610310Nwj c610310Nwj = (C610310Nwj) viewHolder;
        Video video = (Video) ListProtector.get(this.LL, i);
        c610310Nwj.LLILLJJLI.LIZ(false);
        C786410Ut5.c5((ConstraintLayout) c610310Nwj.LLILLJJLI.findViewById(R.id.qtg).findViewById(R.id.eqx), 0.0f);
        c610310Nwj.LLILZ.LIZLLL = video;
        C1752030vh3 c1752030vh3 = new C1752030vh3();
        c1752030vh3.LIZ = c610310Nwj.LLILZ;
        c1752030vh3.LIZLLL = new C0JSE(video.getWidth(), video.getHeight());
        c1752030vh3.LJ = Integer.valueOf(video.getVideoLength() / LSPassThroughRecordSizeConfig.DEFAULT);
        Window window = null;
        c1752030vh3.LJI = null;
        C19EG activity = c610310Nwj.LL.getActivity();
        if (activity != null) {
            window = activity.getWindow();
        }
        c1752030vh3.LIZJ = window;
        c1752030vh3.LIZIZ = (ViewGroup) c610310Nwj.itemView;
        c1752030vh3.LJIIIIZZ = true;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_a_rectangle;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c1752030vh3.LJII = new C1752050vh5(c419910GdJ, new ACListenerS128S0200000_26(c610310Nwj, video, 2));
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getCover()));
        c1331670kl3LJIIIIZZ.LJJIJL(c610310Nwj.itemView.getContext());
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJJII(new C1775630wJ7(c1752030vh3, c610310Nwj, 0));
        c610310Nwj.LLILLJJLI.setParams(c1752030vh3);
        C786410Ut5.LLLLLLLLL(c610310Nwj.LLILLJJLI.LLJIJIL, 0);
        c610310Nwj.I5("");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C610310Nwj c610310Nwj = new C610310Nwj(viewGroup, this.LLILLJJLI);
        try {
            View view = c610310Nwj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c610310Nwj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c610310Nwj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C610310Nwj.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c610310Nwj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c610310Nwj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C610310Nwj.class.getName();
        return c610310Nwj;
    }
}
