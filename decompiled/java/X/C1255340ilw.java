package X;

import Y.ACListenerS55S0400000_19;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0ilw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255340ilw extends AbstractC21673619ry<C1255350ilx> {
    public final WeakReference<InterfaceC1255400im2> LL;
    public final C1255390im1 LLILLJJLI;
    public final C19EG LLILLL;
    public final Bundle LLILZ;
    public final List<SignificantUserInfo> LLILZIL = new ArrayList();
    public int LLILZLL = -1;
    public final long LLIZ = System.currentTimeMillis();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZIL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1255350ilx c1255350ilx = (C1255350ilx) viewHolder;
        super.onViewAttachedToWindow(c1255350ilx);
        String str = c1255350ilx.LL;
        if (str != null && str.length() != 0 && !Intrinsics.LJFF(c1255350ilx.LL, "-1") && !Intrinsics.LJFF(c1255350ilx.LL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            C1255320ilu c1255320ilu = C1255320ilu.LIZ;
            String str2 = c1255350ilx.LL;
            c1255320ilu.getClass();
            long jLIZ = C1255320ilu.LIZ(str2);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(c1255350ilx.LLIZ.getCount(), "notification_cnt");
            c2344009Gk.LJIIIIZZ("account_user_id", c1255350ilx.LL);
            c2344009Gk.LIZJ(c1255350ilx.getAdapterPosition(), "order");
            c2344009Gk.LIZLLL(jLIZ, "dm_notification_cnt");
            C20684815ws.LJIILLIIL("account_list_show", c2344009Gk.LIZ);
        }
    }

    public final void LLLFZ(View view, boolean z) {
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, this.LLILLL);
            if (numLIZJ != null) {
                view.setBackgroundColor(numLIZJ.intValue());
                return;
            } else {
                view.setBackground(null);
                return;
            }
        }
        view.setBackground(null);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        TuxTextView tuxTextView;
        C1255350ilx c1255350ilx = (C1255350ilx) viewHolder;
        SignificantUserInfo significantUserInfo = (SignificantUserInfo) ListProtector.get(this.LLILZIL, i);
        if (Intrinsics.LJFF(significantUserInfo.uid, "-1")) {
            c1255350ilx.LLILZ.setText(2131825105);
            C786410Ut5.LLIL(c1255350ilx.LLILZIL, 8);
            C427660Gpo c427660Gpo = c1255350ilx.LLILLL;
            Context context = c427660Gpo.getContext();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_plus;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(28));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c427660Gpo.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        } else {
            C427660Gpo.LJIIJJI(c1255350ilx.LLILLL, significantUserInfo.avatarUrl, false, null, null, false, false, null, null, false, null, 1022);
            c1255350ilx.LLILZ.setText(significantUserInfo.LIZIZ());
            C786410Ut5.LLIL(c1255350ilx.LLILZIL, 8);
            C0H9H.LJI(0, c1255350ilx.LLIZ);
        }
        TextView textView = c1255350ilx.LLILZ;
        String string = null;
        if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
            tuxTextView.setTuxFont(102);
        }
        C1744700vVE.LJIIIIZZ((int) C12ES.LIZJ(72.0f, c1255350ilx.itemView.getContext()), c1255350ilx.LLILLJJLI);
        String str = significantUserInfo.uid;
        c1255350ilx.LL = str;
        TuxIconView tuxIconView = c1255350ilx.LLILZLL;
        if (Intrinsics.LJFF(str, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i2);
        C786410Ut5.LLLLLLIL(c1255350ilx.LLIZ, 8);
        Bundle bundle = this.LLILZ;
        if (bundle != null) {
            string = bundle.getString("switch_account_sec_uid");
        }
        if (!Intrinsics.LJFF(significantUserInfo.uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            int iLJI = C1903780zdo.LJII().LJI(significantUserInfo.uid);
            if (iLJI > 0) {
                C786410Ut5.LLLLLLIL(c1255350ilx.LLIZ, 0);
                c1255350ilx.LLIZ.setCount(iLJI);
                c1255350ilx.LLIZ.setMaxCount(99);
                c1255350ilx.LLIZ.setMaxCount(1);
            }
            if (i == this.LLILZLL) {
                LLLFZ(c1255350ilx.LLILLJJLI, true);
            } else if (Intrinsics.LJFF(string, significantUserInfo.secUid)) {
                LLLFZ(c1255350ilx.LLILLJJLI, true);
                this.LLILZLL = i;
                Bundle bundle2 = this.LLILZ;
                if (bundle2 != null) {
                    bundle2.remove("switch_account_sec_uid");
                }
            } else {
                LLLFZ(c1255350ilx.LLILLJJLI, false);
            }
        } else {
            c1255350ilx.LLILLJJLI.setSelected(true);
        }
        C786410Ut5.I7(new ACListenerS55S0400000_19(new ViewOnClickListenerC1255430im5(this.LL, significantUserInfo, c1255350ilx.itemView.getContext(), this.LLILLL, this.LLILLJJLI, string, this.LLILZ), this, significantUserInfo, c1255350ilx, 2), c1255350ilx.itemView);
        q0.LJIJ(c1255350ilx.LLILLJJLI, new C1266340j3g(c1255350ilx, 2));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1255350ilx c1255350ilx = new C1255350ilx(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eec, viewGroup, false));
        try {
            View view = c1255350ilx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1255350ilx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1255350ilx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1255350ilx.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1255350ilx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1255350ilx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1255350ilx.class.getName();
        return c1255350ilx;
    }

    public C1255340ilw(WeakReference<InterfaceC1255400im2> weakReference, C1255390im1 c1255390im1, C19EG c19eg, Bundle bundle) {
        this.LL = weakReference;
        this.LLILLJJLI = c1255390im1;
        this.LLILLL = c19eg;
        this.LLILZ = bundle;
    }
}
