package X;

import Y.ACListenerS108S0200000_4;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337170DJr extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final InterfaceC337190DJt LL;
    public List<? extends Object> LLILLJJLI = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C337170DJr(C322400CkQ c322400CkQ) {
        this.LL = c322400CkQ;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C337210DJv) {
            C337210DJv c337210DJv = (C337210DJv) viewHolder;
            c337210DJv.getClass();
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectDraftDetailCardViewHolder", "unBind()");
            c337210DJv.LL = null;
            c337210DJv.LLILLJJLI = null;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        int i2;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if ((viewHolder instanceof C337210DJv) && (objLJJJLZIJ instanceof C322460CkW)) {
            C337210DJv c337210DJv = (C337210DJv) viewHolder;
            C322460CkW c322460CkW = (C322460CkW) objLJJJLZIJ;
            InterfaceC337190DJt interfaceC337190DJt = this.LL;
            c337210DJv.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bind(");
            sbLIZ.append(viewHolder.getBindingAdapterPosition());
            sbLIZ.append("), ");
            sbLIZ.append(c322460CkW);
            sbLIZ.append(", ");
            sbLIZ.append(c337210DJv);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("EffectDraftDetailCardViewHolder", C2188811AlT.LIZIZ(sbLIZ));
            String str2 = c322460CkW.LJIIIZ;
            C322460CkW c322460CkW2 = c337210DJv.LL;
            if (c322460CkW2 != null) {
                str = c322460CkW2.LJIIIZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, str2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("bindImage dup, return, ");
                sbLIZ2.append(str2);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectDraftDetailCardViewHolder", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                c1331670kl3LJIIIZ.LJJ(c337210DJv.LLILLL);
                c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LJIIIZ.LJJIJIL(new C0I7W(0.4f, 20, c337210DJv.itemView.getContext()));
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str2);
                c1331670kl3LJIIIZ2.LJJ(c337210DJv.LLILZLL);
                C786410Ut5.h3(c1331670kl3LJIIIZ2);
            }
            AbstractC322270CkD abstractC322270CkD = c322460CkW.LIZJ;
            if (abstractC322270CkD instanceof C322380CkO) {
                C786410Ut5.LLLLLZ(c337210DJv.LLILZIL, 8);
            } else if (abstractC322270CkD instanceof C322390CkP) {
                C786410Ut5.LLLLLZ(c337210DJv.LLILZIL, 0);
                c337210DJv.LLILZIL.setChecked(false);
            } else if (abstractC322270CkD instanceof C322280CkE) {
                C786410Ut5.LLLLLZ(c337210DJv.LLILZIL, 0);
                c337210DJv.LLILZIL.setChecked(true);
            } else {
                throw new C1954807lC();
            }
            c337210DJv.LLJI.setText(c322460CkW.LIZIZ);
            if (c322460CkW.LJFF) {
                C337180DJs.LIZJ(c337210DJv.LLJIJIL);
            } else {
                C337180DJs.LIZ(c337210DJv.LLJIJIL);
            }
            if (c322460CkW.LJFF && (i2 = c322460CkW.LJI) != 0 && i2 != 2) {
                if (i2 == 3) {
                    TuxIconView tuxIconView = c337210DJv.LLJ;
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_info_circle;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                    tuxIconView.setTuxIcon(c419910GdJ);
                    C337180DJs.LIZIZ(c337210DJv.LLILZLL);
                    C337180DJs.LIZ(c337210DJv.LLIZ);
                    C337180DJs.LIZ(c337210DJv.LLIZLLLIL);
                    C337180DJs.LIZJ(c337210DJv.LLJ);
                } else {
                    c337210DJv.LLIZ.LIZ(c322460CkW.LJII, false);
                    c337210DJv.LLIZLLLIL.setText(AnonymousClass0551.LIZ(C814420VxA.LIZIZ(c322460CkW.LJII), c337210DJv.LLJJI));
                    c337210DJv.LLJ.setTuxIcon(null);
                    C337180DJs.LIZIZ(c337210DJv.LLILZLL);
                    C337180DJs.LIZJ(c337210DJv.LLIZ);
                    C337180DJs.LIZJ(c337210DJv.LLIZLLLIL);
                    C337180DJs.LIZJ(c337210DJv.LLJ);
                }
            } else {
                C337180DJs.LIZJ(c337210DJv.LLILZLL);
                C337180DJs.LIZ(c337210DJv.LLIZ);
                C337180DJs.LIZ(c337210DJv.LLIZLLLIL);
                C337180DJs.LIZ(c337210DJv.LLJ);
            }
            if (c322460CkW.LJIIL == 4) {
                C786410Ut5.LLLLLLZZ(c337210DJv.LLJILJILJ, 8);
                c337210DJv.LLJILLL.setText("");
                C786410Ut5.LLLLZLL(c337210DJv.LLJILLL, 8);
                C786410Ut5.LJLLLLLL(8, c337210DJv.LLILZ);
                C786410Ut5.LLZLLIL(c337210DJv.LLJJ, 0);
            } else {
                C786410Ut5.LLLLLLZZ(c337210DJv.LLJILJILJ, 8);
                c337210DJv.LLJILLL.setText(c322460CkW.LJIIJJI);
                C786410Ut5.LLLLZLL(c337210DJv.LLJILLL, 0);
                C786410Ut5.LJLLLLLL(8, c337210DJv.LLILZ);
                C786410Ut5.LLZLLIL(c337210DJv.LLJJ, 8);
            }
            C786410Ut5.I7(new ACListenerS108S0200000_4(c337210DJv, viewHolder, 17), c337210DJv.itemView);
            c337210DJv.itemView.setOnLongClickListener(new ViewOnLongClickListenerC346300Dhs(viewHolder, c337210DJv, 1));
            if (c337210DJv.LL == null) {
                C1737910vKH.LIZ("prop_draft_card_show", c322460CkW.LIZ());
            }
            C322460CkW c322460CkW3 = c337210DJv.LL;
            AbstractC322270CkD abstractC322270CkD2 = c322460CkW.LIZJ;
            if ((abstractC322270CkD2 instanceof C322280CkE) && (c322460CkW3 == null || !Intrinsics.LJFF(c322460CkW3.LIZJ, abstractC322270CkD2))) {
                HashMap map = new HashMap(c322460CkW.LIZ());
                map.put("select_way", ((C322280CkE) abstractC322270CkD2).LIZ);
                C1737910vKH.LIZ("prop_draft_card_select", map);
            }
            c337210DJv.LL = c322460CkW;
            c337210DJv.LLILLJJLI = interfaceC337190DJt;
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C337210DJv c337210DJv = new C337210DJv(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fu1, viewGroup, false));
        try {
            View view = c337210DJv.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c337210DJv.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c337210DJv.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C337210DJv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c337210DJv.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c337210DJv.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C337210DJv.class.getName();
        return c337210DJv;
    }
}
