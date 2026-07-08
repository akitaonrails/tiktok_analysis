package X;

import Y.ACListenerS109S0200000_5;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.sticker.SecretRepliesStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS143S0201000_19;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0iC5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233110iC5 extends AbstractC21673619ry<C1233120iC6> {
    public final StoryViewerListViewModel LL;
    public final List<C730340Skq> LLILLJJLI;
    public final boolean LLILLL;
    public final Activity LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(372));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public final void LLLFZ(int i) {
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            C730340Skq c730340Skq = (C730340Skq) ListProtector.get(this.LLILLJJLI, i);
            StoryViewerListViewModel storyViewerListViewModel = this.LL;
            storyViewerListViewModel.getClass();
            storyViewerListViewModel.withState(new AwS377S0200000_11(c730340Skq, storyViewerListViewModel, 110));
            notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final Long lValueOf;
        C1233120iC6 c1233120iC6 = (C1233120iC6) viewHolder;
        C730340Skq c730340Skq = (C730340Skq) ListProtector.get(this.LLILLJJLI, i);
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(c730340Skq.LL));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            lValueOf = null;
        }
        final String str = c730340Skq.LLILZ;
        final String str2 = c730340Skq.LLILLL;
        TextView textView = c1233120iC6.LL;
        if (this.LLILLL) {
            C426850GoV.LIZ(textView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        } else {
            C426850GoV.LIZ(textView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        }
        textView.setText(c730340Skq.LLILZ);
        final C197039127h c197039127h = c1233120iC6.LLILLJJLI;
        if (this.LLILLL) {
            C426850GoV.LIZ(c197039127h, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(149)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), c197039127h);
        } else {
            C426850GoV.LIZ(c197039127h, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(190)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)), c197039127h);
        }
        c197039127h.setText(c197039127h.getContext().getString(2131847211));
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0Sge
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view) {
                String str3;
                SecretRepliesStickerRecordServiceImpl.LIZIZ().LIZ(c197039127h.getContext(), null, new SecretRepliesRecordParam(null, new SecretRepliesResponseStickerStruct(lValueOf, str2, str))).LIZIZ();
                if (this.LLILLL) {
                    str3 = "all_secret_replies_page";
                } else {
                    str3 = "secret_reply_views_list_panel";
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", str3);
                C20684815ws.LJIILLIIL("add_secret_reply_to_story", c0lab.LIZ);
            }
        }, c197039127h);
        TuxIconView tuxIconView = c1233120iC6.LLILLL;
        C443090HZb c443090HZb = new C443090HZb(tuxIconView.getContext().getString(2131847212), new AwS143S0201000_19(this, i, c730340Skq, 2), R.raw.icon_trash_bin, null, 0, null, 0, false, false, null, 1016);
        C443090HZb c443090HZb2 = new C443090HZb(tuxIconView.getContext().getString(2131847213), new AwS143S0201000_19(this, i, c730340Skq, 3), R.raw.icon_flag, null, 0, null, 1, false, false, null, 952);
        if (this.LLILLL) {
            C426850GoV.LIZ(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0);
        } else {
            C426850GoV.LIZ(tuxIconView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), 0, 0);
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS109S0200000_5(c443090HZb, c443090HZb2, 19));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fby, viewGroup, false);
        boolean z = this.LLILLL;
        Integer numValueOf = Integer.valueOf(R.attr.zp);
        if (z) {
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(172)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132)), viewTd);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = numValueOf;
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(18));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(18));
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(18));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(18));
            viewTd.setBackgroundDrawable(c384050F3z.LIZ(viewTd.getContext()));
            C426850GoV.LIZ(viewTd, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, 0);
        } else {
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(230)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168)), viewTd);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = numValueOf;
            c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(22));
            viewTd.setBackgroundDrawable(c384050F3z2.LIZ(viewTd.getContext()));
            C426850GoV.LIZ(viewTd, 0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        C1233120iC6 c1233120iC6 = new C1233120iC6(viewTd);
        try {
            View view = c1233120iC6.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1233120iC6.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1233120iC6.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1233120iC6.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1233120iC6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1233120iC6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1233120iC6.class.getName();
        return c1233120iC6;
    }

    public C1233110iC5(StoryViewerListViewModel storyViewerListViewModel, List list, boolean z, Activity activity) {
        this.LL = storyViewerListViewModel;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = activity;
    }
}
