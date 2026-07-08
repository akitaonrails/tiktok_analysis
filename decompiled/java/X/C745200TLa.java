package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS52S0101000_12;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import webcast.api.room.MuteRule;

/* JADX INFO: renamed from: X.0TLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745200TLa extends AbstractC21673619ry<C0TJW> {
    public final Function1<Integer, Unit> LL;
    public final List<MuteRule> LLILLJJLI = new ArrayList();
    public final /* synthetic */ LiveMuteRulesFragmentSheet LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C745200TLa(LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet, AwS591S0100000_12 awS591S0100000_12) {
        this.LLILLL = liveMuteRulesFragmentSheet;
        this.LL = awS591S0100000_12;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Resources resources;
        String strLIZIZ;
        C0TJW c0tjw = (C0TJW) viewHolder;
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet = this.LLILLL;
        MuteRule muteRule = (MuteRule) obj;
        C745220TLc c745220TLc = new C745220TLc(muteRule.durationSecond);
        C1115360f8A c1115360f8A = C1115380f8C.LIZ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(muteRule.content);
        Context context = liveMuteRulesFragmentSheet.getContext();
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        C1115380f8C.LIZLLL(spannableStringBuilder, resources, liveMuteRulesFragmentSheet, new AwS626S0100000_12(c0tjw, 11));
        C16F5 c16f5 = c0tjw.LLILLJJLI;
        if (c16f5 != null) {
            if (liveMuteRulesFragmentSheet.getContext() == null || (strLIZIZ = C0TYC.LIZIZ(c745220TLc)) == null) {
                strLIZIZ = "";
            }
            c16f5.setText(strLIZIZ);
        }
        LiveIconView liveIconView = c0tjw.LLILLL;
        if (liveIconView != null) {
            C01C7.LIZIZ(new ACListenerS116S0200000_12(liveMuteRulesFragmentSheet, muteRule, 15), liveIconView);
        }
        LiveIconView liveIconView2 = c0tjw.LLILZ;
        if (liveIconView2 != null) {
            C01C7.LIZIZ(new ACListenerS52S0101000_12(this, i, 4), liveIconView2);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TJW c0tjw = new C0TJW(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hf1, viewGroup, false));
        try {
            View view = c0tjw.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tjw.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tjw.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TJW.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tjw.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tjw.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TJW.class.getName();
        return c0tjw;
    }
}
