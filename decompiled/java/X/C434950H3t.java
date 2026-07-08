package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0H3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434950H3t extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<SubLevel> LL = new ArrayList();
    public final float LLILLJJLI = (int) C497740JfY.LIZIZ(8.0f);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC434960H3u) viewHolder).I5(i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        AbstractC434960H3u abstractC434960H3u = new AbstractC434960H3u(viewGroup) { // from class: X.0JwL
            public final C508160JwM LL;

            @Override // X.AbstractC434960H3u
            public final void I5(int i2) {
                C16F5 badgeStr;
                View badgeLine;
                C16F5 badgeStr2;
                ImageModel imageModel;
                CombineBadgeStruct combineBadgeStruct;
                CombineBadgeStruct combineBadgeStruct2;
                String str;
                C16F5 badgeStr3;
                String str2;
                CombineBadgeStruct combineBadgeStruct3;
                C16F5 badgeStr4;
                C16F5 des;
                String str3;
                LinearLayout badgeContainer;
                CombineBadgeStruct combineBadgeStruct4;
                CombineBadgeBackground combineBadgeBackground;
                View badgeLine2;
                SubLevel subLevel = (SubLevel) C13LP.LJJJLZIJ(i2, this.LLILLJJLI.LL);
                if (subLevel == null) {
                    return;
                }
                C508160JwM c508160JwM = this.LL;
                C1324720kZq badgeIcon = null;
                if (c508160JwM != null) {
                    badgeStr = c508160JwM.getBadgeStr();
                } else {
                    badgeStr = null;
                }
                C1119920fFW.LJI(OppoPermissionPopupMaskDelayExp.DEFAULT, badgeStr);
                if (i2 == ((ArrayList) this.LLILLJJLI.LL).size() - 1) {
                    C508160JwM c508160JwM2 = this.LL;
                    if (c508160JwM2 != null && (badgeLine2 = c508160JwM2.getBadgeLine()) != null) {
                        C786410Ut5.LJLLLLLL(8, badgeLine2);
                    }
                } else {
                    C508160JwM c508160JwM3 = this.LL;
                    if (c508160JwM3 != null && (badgeLine = c508160JwM3.getBadgeLine()) != null) {
                        C786410Ut5.LJLLLLLL(0, badgeLine);
                    }
                }
                if (i2 == 0) {
                    C508160JwM c508160JwM4 = this.LL;
                    if (c508160JwM4 != null) {
                        c508160JwM4.setItemScale(1.0f);
                    }
                } else {
                    C508160JwM c508160JwM5 = this.LL;
                    if (c508160JwM5 != null) {
                        c508160JwM5.setItemScale(0.72f);
                    }
                }
                List<C508210JwR> list = C1ES2.LIZ;
                C508210JwR c508210JwR = (C508210JwR) C13LP.LJJJLZIJ(i2, list);
                if (c508210JwR == null) {
                    c508210JwR = (C508210JwR) ListProtector.get(list, ((ArrayList) list).size() - 1);
                }
                int iLIZJ = C0JS0.LIZJ(c508210JwR.LIZ);
                int iLIZJ2 = C0JS0.LIZJ(c508210JwR.LIZIZ);
                int iLIZJ3 = C0JS0.LIZJ(c508210JwR.LIZJ);
                BadgeStruct badgeStruct = subLevel.badgeStruct;
                if (badgeStruct != null && (combineBadgeStruct4 = badgeStruct.combineBadgeStruct) != null && (combineBadgeBackground = combineBadgeStruct4.background) != null) {
                    String str4 = combineBadgeBackground.backgroundColorCode;
                    if (str4 != null && C500260Jjc.LJJIIZ(str4)) {
                        iLIZJ = C0JS0.LIZJ(combineBadgeBackground.backgroundColorCode);
                        iLIZJ2 = C0JS0.LIZJ(combineBadgeBackground.backgroundColorCode);
                    }
                    String str5 = combineBadgeBackground.borderColorCode;
                    if (str5 != null && C500260Jjc.LJJIIZ(str5)) {
                        iLIZJ3 = C0JS0.LIZJ(combineBadgeBackground.borderColorCode);
                    }
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iLIZJ, iLIZJ2});
                if (iLIZJ3 != 0) {
                    gradientDrawable.setStroke((int) C497740JfY.LIZIZ(1.5f), iLIZJ3);
                }
                gradientDrawable.setCornerRadius(this.LLILLJJLI.LLILLJJLI);
                C508160JwM c508160JwM6 = this.LL;
                if (c508160JwM6 != null && (badgeContainer = c508160JwM6.getBadgeContainer()) != null) {
                    badgeContainer.setBackground(gradientDrawable);
                }
                C508160JwM c508160JwM7 = this.LL;
                if (c508160JwM7 != null && (des = c508160JwM7.getDes()) != null) {
                    SubLevel subLevel2 = (SubLevel) C13LP.LJJJLZIJ(i2, this.LLILLJJLI.LL);
                    if (subLevel2 == null || (str3 = subLevel2.desc) == null) {
                        str3 = "";
                    }
                    des.setText(str3);
                }
                BadgeStruct badgeStruct2 = subLevel.badgeStruct;
                if (badgeStruct2 != null && (combineBadgeStruct2 = badgeStruct2.combineBadgeStruct) != null && (str = combineBadgeStruct2.str) != null && str.length() != 0) {
                    C508160JwM c508160JwM8 = this.LL;
                    if (c508160JwM8 != null && (badgeStr4 = c508160JwM8.getBadgeStr()) != null) {
                        C786410Ut5.LLJJJJ(badgeStr4, 0);
                    }
                    C508160JwM c508160JwM9 = this.LL;
                    if (c508160JwM9 != null && (badgeStr3 = c508160JwM9.getBadgeStr()) != null) {
                        BadgeStruct badgeStruct3 = subLevel.badgeStruct;
                        if (badgeStruct3 != null && (combineBadgeStruct3 = badgeStruct3.combineBadgeStruct) != null) {
                            str2 = combineBadgeStruct3.str;
                        } else {
                            str2 = null;
                        }
                        badgeStr3.setText(str2);
                    }
                } else {
                    C508160JwM c508160JwM10 = this.LL;
                    if (c508160JwM10 != null && (badgeStr2 = c508160JwM10.getBadgeStr()) != null) {
                        C786410Ut5.LLJJJJ(badgeStr2, 8);
                    }
                }
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                BadgeStruct badgeStruct4 = subLevel.badgeStruct;
                if (badgeStruct4 != null && (combineBadgeStruct = badgeStruct4.combineBadgeStruct) != null) {
                    imageModel = combineBadgeStruct.icon;
                } else {
                    imageModel = null;
                }
                C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(imageModel);
                C508160JwM c508160JwM11 = this.LL;
                if (c508160JwM11 != null) {
                    badgeIcon = c508160JwM11.getBadgeIcon();
                }
                c1324610kZfLJIIIZ.LJJI(badgeIcon);
            }

            {
                C508160JwM c508160JwM;
                super(new C508160JwM(viewGroup.getContext()));
                View view = this.itemView;
                if (view instanceof C508160JwM) {
                    c508160JwM = (C508160JwM) view;
                } else {
                    c508160JwM = null;
                }
                this.LL = c508160JwM;
            }
        };
        C786410Ut5.W5(abstractC434960H3u.itemView, new LinearLayout.LayoutParams(-2, -2));
        try {
            View view = abstractC434960H3u.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        abstractC434960H3u.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (abstractC434960H3u.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C508150JwL.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) abstractC434960H3u.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(abstractC434960H3u.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C508150JwL.class.getName();
        return abstractC434960H3u;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
        } else {
            viewHolder.getClass();
        }
    }
}
