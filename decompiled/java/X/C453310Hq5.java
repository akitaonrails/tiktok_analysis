package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.emoji.analytics.IMEmojiAnalytics;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS442S0200000_6;

/* JADX INFO: renamed from: X.0Hq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453310Hq5 extends AbstractC21673619ry<C453320Hq6> {
    public final Function2<C451030HmP, Integer, Unit> LL;
    public final List<C451030HmP> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C453310Hq5(AwS442S0200000_6 awS442S0200000_6) {
        this.LL = awS442S0200000_6;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Long stickerId;
        String string;
        SetSticker setSticker = ((C453320Hq6) viewHolder).LLILZ;
        if (setSticker != null && (stickerId = setSticker.getStickerId()) != null && (string = stickerId.toString()) != null) {
            IMEmojiAnalytics iMEmojiAnalytics = IMEmojiAnalytics.LIZIZ;
            IMEmojiAnalytics.LIZJ.add(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa A[PHI: r6
      0x00fa: PHI (r6v3 com.ss.android.ugc.aweme.base.model.UrlModel) = (r6v2 com.ss.android.ugc.aweme.base.model.UrlModel), (r6v5 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:18:0x00f8, B:14:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013d  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453310Hq5.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C453320Hq6 c453320Hq6 = new C453320Hq6(new RemoteImageView(viewGroup.getContext()));
        try {
            View view = c453320Hq6.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c453320Hq6.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c453320Hq6.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C453320Hq6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c453320Hq6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c453320Hq6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C453320Hq6.class.getName();
        return c453320Hq6;
    }
}
