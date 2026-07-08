package X;

import Y.ACListenerS147S0100000_12;
import Y.ACListenerS52S0101000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.model.Operation;
import com.bytedance.android.livesdk.adminsetting.LiveManageListFragment;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0TbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC749920TbK extends AbstractC21673619ry {
    public boolean LL = true;

    public abstract int getBasicItemCount();

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        return this.LL ? getBasicItemCount() + 1 : getBasicItemCount();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LL && i == getBasicItemCount()) {
            return Integer.MIN_VALUE;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        User user;
        long jLongValue;
        ImageModel imageModelLJIIL;
        Operation operation;
        Long l;
        Operation operation2;
        int i2;
        C749950TbN c749950TbN;
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            AbstractC749880TbG abstractC749880TbG = (AbstractC749880TbG) this;
            if (viewHolder instanceof C749910TbJ) {
                C749910TbJ c749910TbJ = (C749910TbJ) viewHolder;
                if (((C749790Tb7) c749910TbJ.itemView).LLILLL == -1 && (c749950TbN = c749910TbJ.LL.LLILLL) != null) {
                    LiveManageListFragment liveManageListFragment = c749950TbN.LIZ;
                    if (liveManageListFragment.LLJILJIL) {
                        liveManageListFragment.LLJIJIL++;
                        liveManageListFragment.OR();
                    }
                }
                C749910TbJ c749910TbJ2 = abstractC749880TbG.LLILLJJLI;
                if (c749910TbJ2 != null) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) c749910TbJ2.itemView.getLayoutParams();
                    if (layoutParams instanceof C21681819tI) {
                        ((C21681819tI) layoutParams).LLILLJJLI = true;
                    }
                    C786410Ut5.W5(abstractC749880TbG.LLILLJJLI.itemView, layoutParams);
                    return;
                }
                return;
            }
            return;
        }
        C749870TbF c749870TbF = (C749870TbF) this;
        if (c749870TbF.getItemViewType(i) == 4099) {
            C749900TbI c749900TbI = (C749900TbI) viewHolder;
            if (c749900TbI == null) {
                return;
            }
            String str = c749870TbF.LLJ;
            TextView textView = c749900TbI.LL;
            if (str.equals("activity_kick_out")) {
                i2 = 2131853003;
            } else {
                i2 = 2131853002;
            }
            textView.setText(i2);
            return;
        }
        C749930TbL c749930TbL = (C749930TbL) viewHolder;
        if (c749930TbL == null) {
            return;
        }
        List<User> list = c749870TbF.LLILZLL;
        Map<Long, Operation> map = c749870TbF.LLIZ;
        if (list == null) {
            return;
        }
        c749930TbL.LLJ = list;
        User user2 = (User) ListProtector.get(list, i);
        if (user2 == null) {
            return;
        }
        View view = c749930TbL.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (user2.getAvatarThumb() != null) {
            C0JSS.LJII(c749930TbL.LL, user2.getAvatarThumb());
        } else {
            c749930TbL.LL.setImageResource(R.drawable.el_);
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(user2);
        userProfileEvent.mReportType = "report_user";
        C786410Ut5.H8(c749930TbL.LL, new ACListenerS147S0100000_12(userProfileEvent, 8));
        c749930TbL.LLILZLL.setText(C0KVU.LJ(user2));
        long id = user2.getId();
        if (map == null || (operation2 = map.get(Long.valueOf(id))) == null || (user = operation2.operator) == null || user.getId() <= 0) {
            user = null;
        }
        long id2 = user2.getId();
        if (map != null && (operation = map.get(Long.valueOf(id2))) != null && (l = operation.timestampSecond) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (user != null && jLongValue > 0) {
            C786410Ut5.LLIL(c749930TbL.LLILZIL, 0);
            c749930TbL.LLILZIL.setText(C497740JfY.LJIJJ(2131843138, C0KVU.LIZ(user)));
            TextView textView2 = (TextView) c749930TbL.itemView.findViewById(R.id.pok);
            C786410Ut5.LLIL(textView2, 0);
            textView2.setText(C749930TbL.LLJJI.format(new Date(jLongValue * 1000)));
        }
        if (user2.getUserHonor() != null && (imageModelLJIIL = user2.getUserHonor().LJIIL()) != null && !C086I.LIZIZ(imageModelLJIIL.getUrls())) {
            C0JSS.LJFF(c749930TbL.LLIZ, imageModelLJIIL, 0, new C786400Ut4(c749930TbL, 0));
            C786410Ut5.LLJJIII(c749930TbL.LLIZ, 0);
        } else {
            C786410Ut5.LLJJIII(c749930TbL.LLIZ, 8);
        }
        if ("activity_banned_talk".equals(c749930TbL.LLJI)) {
            c749930TbL.LLILLJJLI.setText(2131841264);
        }
        C786410Ut5.T7(c749930TbL.LLILLJJLI, new ACListenerS52S0101000_12(c749930TbL, i, 0));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c749930TbL;
        if (Integer.MIN_VALUE == i) {
            AbstractC749880TbG abstractC749880TbG = (AbstractC749880TbG) this;
            C749790Tb7 c749790Tb7 = new C749790Tb7(viewGroup.getContext(), null);
            int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.at0);
            int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(R.dimen.at1);
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, dimensionPixelSize);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c749790Tb7);
            c749790Tb7.setLayoutParams(layoutParams);
            Context context = viewGroup.getContext();
            C749800Tb8 c749800Tb8 = new C749800Tb8(context);
            C16FZ c16fz = new C16FZ(context, null);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.height = dimensionPixelSize2;
            layoutParams2.width = dimensionPixelSize2;
            layoutParams2.gravity = 17;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fz);
            c16fz.setLayoutParams(layoutParams2);
            c749800Tb8.LIZIZ = c16fz;
            ACListenerS147S0100000_12 aCListenerS147S0100000_12 = new ACListenerS147S0100000_12(abstractC749880TbG, 29);
            TextView textView = (TextView) C786410Ut5.Sd(R.layout.h77, C786410Ut5.ne(context), null);
            textView.setText(2131851923);
            C786410Ut5.I7(aCListenerS147S0100000_12, textView);
            c749800Tb8.LIZLLL = textView;
            c749800Tb8.LIZIZ = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h76, viewGroup, false);
            c749790Tb7.setBuilder(c749800Tb8);
            C749910TbJ c749910TbJ = new C749910TbJ(abstractC749880TbG, c749790Tb7);
            abstractC749880TbG.LLILLJJLI = c749910TbJ;
            c749930TbL = c749910TbJ;
        } else {
            C749870TbF c749870TbF = (C749870TbF) this;
            if (i == 4099) {
                c749930TbL = new C749900TbI(C786410Ut5.Td(C786410Ut5.ne(c749870TbF.LLILZ), R.layout.gpj, viewGroup, false));
            } else {
                Context context2 = c749870TbF.LLILZ;
                c749930TbL = new C749930TbL(context2, C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.gpk, viewGroup, false), c749870TbF.LLJ, c749870TbF.LLJI, c749870TbF.LLJIJIL, c749870TbF.LLIZLLLIL, c749870TbF.LLILZIL);
            }
        }
        try {
            View view = c749930TbL.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c749930TbL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c749930TbL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c749930TbL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c749930TbL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c749930TbL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c749930TbL.getClass().getName();
        return c749930TbL;
    }
}
