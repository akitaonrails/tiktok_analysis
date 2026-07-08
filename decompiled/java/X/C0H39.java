package X;

import Y.ACListenerS11S1101000_6;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeensVideo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H39, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H39 extends AbstractC21673619ry<C0H3A> {
    public final String LL;
    public final List<PrivacyHighlightsForTeensVideo> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C0H39(String str) {
        this.LL = str;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0H3A c0h3a = (C0H3A) viewHolder;
        PrivacyHighlightsForTeensVideo privacyHighlightsForTeensVideo = (PrivacyHighlightsForTeensVideo) ListProtector.get(this.LLILLJJLI, i);
        String str = ((C0H39) c0h3a.getBindingAdapter()).LL;
        if (Intrinsics.LJFF(str, "new_user_journey")) {
            ViewGroup.LayoutParams layoutParams = c0h3a.LL.getLayoutParams();
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
            C786410Ut5.a6(c0h3a.LL, layoutParams);
        }
        TextView textView = c0h3a.LLILLL;
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append((CharSequence) privacyHighlightsForTeensVideo.title);
        textView.setText(c1360520lVa.LIZ);
        c0h3a.LLILZ.setText(C00HL.LIZ(privacyHighlightsForTeensVideo.videoInfo.getDuration() / LSPassThroughRecordSizeConfig.DEFAULT));
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(privacyHighlightsForTeensVideo.videoInfo.getCover()));
        c1331670kl3LJIIIIZZ.LJJ(c0h3a.LLILLJJLI);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        C786410Ut5.I7(new ACListenerS11S1101000_6(c0h3a, str, i, 0), c0h3a.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0H3A c0h3a = new C0H3A(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bci, viewGroup, false));
        try {
            View view = c0h3a.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h3a.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h3a.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H3A.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h3a.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h3a.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H3A.class.getName();
        return c0h3a;
    }
}
