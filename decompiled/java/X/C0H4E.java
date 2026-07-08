package X;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
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

/* JADX INFO: renamed from: X.0H4E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H4E extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<SubLevel> LL = new ArrayList();
    public final float LLILLJJLI = (int) C511520K4g.LIZ(8.0f);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((C0H4F) viewHolder).I5(i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        C0H4F c0h4f = new C0H4F(viewGroup) { // from class: X.0K1A
            public final C0K1B LL;

            @Override // X.C0H4F
            public final void I5(int i2) {
                TextView badgeStr;
                View badgeLine;
                TextView badgeStr2;
                ImageModel imageModel;
                CombineBadgeStruct combineBadgeStruct;
                CombineBadgeStruct combineBadgeStruct2;
                String str;
                TextView badgeStr3;
                String str2;
                CombineBadgeStruct combineBadgeStruct3;
                TextView badgeStr4;
                TextView des;
                String str3;
                LinearLayout badgeContainer;
                CombineBadgeStruct combineBadgeStruct4;
                CombineBadgeBackground combineBadgeBackground;
                View badgeLine2;
                Typeface typefaceCreate;
                SubLevel subLevel = (SubLevel) C13LP.LJJJLZIJ(i2, this.LLILLJJLI.LL);
                if (subLevel == null) {
                    return;
                }
                C0K1B c0k1b = this.LL;
                C417410GYh badgeIcon = null;
                if (c0k1b != null) {
                    badgeStr = c0k1b.getBadgeStr();
                } else {
                    badgeStr = null;
                }
                if (badgeStr != null) {
                    Typeface typeface = badgeStr.getTypeface();
                    if (typeface == null) {
                        typeface = Typeface.DEFAULT;
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        typefaceCreate = Typeface.create(typeface, OppoPermissionPopupMaskDelayExp.DEFAULT, false);
                    } else {
                        typefaceCreate = Typeface.create(typeface, 1);
                    }
                    badgeStr.setTypeface(typefaceCreate);
                }
                if (i2 == ((ArrayList) this.LLILLJJLI.LL).size() - 1) {
                    C0K1B c0k1b2 = this.LL;
                    if (c0k1b2 != null && (badgeLine2 = c0k1b2.getBadgeLine()) != null) {
                        C786410Ut5.LJLLLLLL(8, badgeLine2);
                    }
                } else {
                    C0K1B c0k1b3 = this.LL;
                    if (c0k1b3 != null && (badgeLine = c0k1b3.getBadgeLine()) != null) {
                        C786410Ut5.LJLLLLLL(0, badgeLine);
                    }
                }
                if (i2 == 0) {
                    C0K1B c0k1b4 = this.LL;
                    if (c0k1b4 != null) {
                        c0k1b4.setItemScale(1.0f);
                    }
                } else {
                    C0K1B c0k1b5 = this.LL;
                    if (c0k1b5 != null) {
                        c0k1b5.setItemScale(0.72f);
                    }
                }
                List<C0K1C> list = C1ES3.LIZ;
                C0K1C c0k1c = (C0K1C) C13LP.LJJJLZIJ(i2, list);
                if (c0k1c == null) {
                    c0k1c = (C0K1C) ListProtector.get(list, ((ArrayList) list).size() - 1);
                }
                C0K1Z c0k1z = C0K1Z.LIZ;
                String str4 = c0k1c.LIZ;
                c0k1z.getClass();
                int iLIZLLL = C0K1Z.LIZLLL(str4);
                int iLIZLLL2 = C0K1Z.LIZLLL(c0k1c.LIZIZ);
                int iLIZLLL3 = C0K1Z.LIZLLL(c0k1c.LIZJ);
                BadgeStruct badgeStruct = subLevel.badgeStruct;
                if (badgeStruct != null && (combineBadgeStruct4 = badgeStruct.combineBadgeStruct) != null && (combineBadgeBackground = combineBadgeStruct4.background) != null) {
                    String str5 = combineBadgeBackground.backgroundColorCode;
                    if (str5 != null && C0K51.LJ(str5)) {
                        iLIZLLL = C0K1Z.LIZLLL(combineBadgeBackground.backgroundColorCode);
                        iLIZLLL2 = C0K1Z.LIZLLL(combineBadgeBackground.backgroundColorCode);
                    }
                    String str6 = combineBadgeBackground.borderColorCode;
                    if (str6 != null && C0K51.LJ(str6)) {
                        iLIZLLL3 = C0K1Z.LIZLLL(combineBadgeBackground.borderColorCode);
                    }
                }
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iLIZLLL, iLIZLLL2});
                if (iLIZLLL3 != 0) {
                    gradientDrawable.setStroke((int) C511520K4g.LIZ(1.5f), iLIZLLL3);
                }
                gradientDrawable.setCornerRadius(this.LLILLJJLI.LLILLJJLI);
                C0K1B c0k1b6 = this.LL;
                if (c0k1b6 != null && (badgeContainer = c0k1b6.getBadgeContainer()) != null) {
                    badgeContainer.setBackground(gradientDrawable);
                }
                C0K1B c0k1b7 = this.LL;
                if (c0k1b7 != null && (des = c0k1b7.getDes()) != null) {
                    SubLevel subLevel2 = (SubLevel) C13LP.LJJJLZIJ(i2, this.LLILLJJLI.LL);
                    if (subLevel2 == null || (str3 = subLevel2.desc) == null) {
                        str3 = "";
                    }
                    des.setText(str3);
                }
                BadgeStruct badgeStruct2 = subLevel.badgeStruct;
                if (badgeStruct2 != null && (combineBadgeStruct2 = badgeStruct2.combineBadgeStruct) != null && (str = combineBadgeStruct2.str) != null && str.length() != 0) {
                    C0K1B c0k1b8 = this.LL;
                    if (c0k1b8 != null && (badgeStr4 = c0k1b8.getBadgeStr()) != null) {
                        C786410Ut5.LLIL(badgeStr4, 0);
                    }
                    C0K1B c0k1b9 = this.LL;
                    if (c0k1b9 != null && (badgeStr3 = c0k1b9.getBadgeStr()) != null) {
                        BadgeStruct badgeStruct3 = subLevel.badgeStruct;
                        if (badgeStruct3 != null && (combineBadgeStruct3 = badgeStruct3.combineBadgeStruct) != null) {
                            str2 = combineBadgeStruct3.str;
                        } else {
                            str2 = null;
                        }
                        badgeStr3.setText(str2);
                    }
                } else {
                    C0K1B c0k1b10 = this.LL;
                    if (c0k1b10 != null && (badgeStr2 = c0k1b10.getBadgeStr()) != null) {
                        C786410Ut5.LLIL(badgeStr2, 8);
                    }
                }
                C511420K3w.LJIIJ.getClass();
                C511420K3w c511420K3w = new C511420K3w();
                BadgeStruct badgeStruct4 = subLevel.badgeStruct;
                if (badgeStruct4 != null && (combineBadgeStruct = badgeStruct4.combineBadgeStruct) != null) {
                    imageModel = combineBadgeStruct.icon;
                } else {
                    imageModel = null;
                }
                c511420K3w.LIZ = imageModel;
                C0K1B c0k1b11 = this.LL;
                if (c0k1b11 != null) {
                    badgeIcon = c0k1b11.getBadgeIcon();
                }
                c511420K3w.LIZ(badgeIcon);
            }

            {
                C0K1B c0k1b;
                super(new C0K1B(viewGroup.getContext()));
                View view = this.itemView;
                if (view instanceof C0K1B) {
                    c0k1b = (C0K1B) view;
                } else {
                    c0k1b = null;
                }
                this.LL = c0k1b;
            }
        };
        C786410Ut5.W5(c0h4f.itemView, new LinearLayout.LayoutParams(-2, -2));
        try {
            View view = c0h4f.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h4f.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h4f.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0K1A.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h4f.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h4f.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0K1A.class.getName();
        return c0h4f;
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
