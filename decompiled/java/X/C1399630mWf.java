package X;

import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0mWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399630mWf extends AbstractC21673619ry<C1399640mWg> {
    public final List<RelatedChallengeMusic> LL;
    public final Context LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ = "challenge_page";

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (C086I.LIZIZ(this.LL)) {
            return 0;
        }
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) ListProtector.get(this.LL, i);
        if (relatedChallengeMusic != null) {
            int i2 = relatedChallengeMusic.categoryType;
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    return 0;
                }
            }
            return i3;
        }
        return super.getItemViewType(i);
    }

    public final void LLLFZ(C1399640mWg c1399640mWg, Challenge challenge) {
        if (challenge == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("#");
        sbLIZ.append(challenge.getChallengeName());
        c1399640mWg.LL.setText(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.R7(c1399640mWg.LLILLJJLI, new ACListenerS124S0200000_21(challenge, this, 11));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("related_tag_id", challenge.getCid());
        c2344009Gk.LJIIIIZZ("tag_id", this.LLILLL);
        C20684815ws.LJIILLIIL("related_tag_show", c2344009Gk.LIZ);
    }

    public final void LLLI(C1399640mWg c1399640mWg, Music music) {
        if (music == null) {
            return;
        }
        c1399640mWg.LL.setText(music.getMusicName());
        Context context = this.LLILLJJLI;
        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(music.convertToMusicModel(), context, true)) {
            C786410Ut5.R7(c1399640mWg.LLILLJJLI, new ACListenerS124S0200000_21(music, this, 10));
        } else {
            C786410Ut5.R7(c1399640mWg.LLILLJJLI, null);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1399640mWg c1399640mWg = (C1399640mWg) viewHolder;
        RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) ListProtector.get(this.LL, i);
        if (relatedChallengeMusic != null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    Music music = relatedChallengeMusic.music;
                    if (music != null) {
                        LLLI(c1399640mWg, music);
                        return;
                    }
                    Challenge challenge = relatedChallengeMusic.challenge;
                    if (challenge == null) {
                        return;
                    }
                    LLLFZ(c1399640mWg, challenge);
                    return;
                }
                LLLFZ(c1399640mWg, relatedChallengeMusic.challenge);
                return;
            }
            LLLI(c1399640mWg, relatedChallengeMusic.music);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i != 1) {
            i2 = R.layout.bk0;
        } else {
            i2 = R.layout.bk6;
        }
        C1399640mWg c1399640mWg = new C1399640mWg(C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false));
        try {
            View view = c1399640mWg.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1399640mWg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1399640mWg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1399640mWg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1399640mWg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1399640mWg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1399640mWg.class.getName();
        return c1399640mWg;
    }

    public C1399630mWf(Context context, String str, List list) {
        this.LLILLJJLI = context;
        this.LL = list;
        this.LLILLL = str;
    }
}
