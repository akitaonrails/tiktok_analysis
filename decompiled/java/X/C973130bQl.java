package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973130bQl extends LinearLayout {
    public final LiveIconView LL;
    public final C16F5 LLILLJJLI;
    public final View LLILLL;

    public static int LIZ(String str) {
        int color = 0;
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            color = Color.parseColor(str);
            return color;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseColorSafely error");
            sbLIZ.append(e);
            C20441214yg.LJ("MatchRankBadgeView", C2188811AlT.LIZIZ(sbLIZ));
            return color;
        }
    }

    public C973130bQl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, EnumC973150bQn.DEFAULT);
    }

    public final void LIZIZ(GiftGalleryBadgeInfo giftGalleryBadgeInfo, boolean z) {
        String str;
        ImageModel imageModel;
        String str2;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText2;
        ImageModel imageModel2;
        String str3;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText3;
        LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("leagueInfo: ");
        GiftGalleryBadgeSection giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo;
        String str4 = null;
        if (giftGalleryBadgeSection != null && (linkMicGiftGalleryDisplayText4 = giftGalleryBadgeSection.displayText) != null) {
            str = linkMicGiftGalleryDisplayText4.content;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MatchRankBadgeView", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            GiftGalleryBadgeSection giftGalleryBadgeSection2 = giftGalleryBadgeInfo.leagueInfo;
            if (giftGalleryBadgeSection2 != null) {
                imageModel2 = giftGalleryBadgeSection2.darkModeIcon;
            } else {
                imageModel2 = null;
            }
            c0jbnLIZ.LJIIIZ(imageModel2).LJJI(this.LL);
            C16F5 c16f5 = this.LLILLJJLI;
            GiftGalleryBadgeSection giftGalleryBadgeSection3 = giftGalleryBadgeInfo.leagueInfo;
            if (giftGalleryBadgeSection3 != null && (linkMicGiftGalleryDisplayText3 = giftGalleryBadgeSection3.displayText) != null) {
                str3 = linkMicGiftGalleryDisplayText3.darkModeColor;
            } else {
                str3 = null;
            }
            c16f5.setTextColor(LIZ(str3));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(4.0f));
            gradientDrawable.setColor(LIZ(giftGalleryBadgeInfo.darkModeBackgroundColor));
            View view = this.LLILLL;
            if (view != null) {
                view.setBackground(gradientDrawable);
            }
        } else {
            C0JBN c0jbnLIZ2 = C1819620xS4.LIZ();
            GiftGalleryBadgeSection giftGalleryBadgeSection4 = giftGalleryBadgeInfo.leagueInfo;
            if (giftGalleryBadgeSection4 != null) {
                imageModel = giftGalleryBadgeSection4.icon;
            } else {
                imageModel = null;
            }
            c0jbnLIZ2.LJIIIZ(imageModel).LJJI(this.LL);
            C16F5 c16f52 = this.LLILLJJLI;
            GiftGalleryBadgeSection giftGalleryBadgeSection5 = giftGalleryBadgeInfo.leagueInfo;
            if (giftGalleryBadgeSection5 != null && (linkMicGiftGalleryDisplayText = giftGalleryBadgeSection5.displayText) != null) {
                str2 = linkMicGiftGalleryDisplayText.color;
            } else {
                str2 = null;
            }
            c16f52.setTextColor(LIZ(str2));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius((int) C497740JfY.LIZIZ(4.0f));
            gradientDrawable2.setColor(LIZ(giftGalleryBadgeInfo.backgroundColor));
            View view2 = this.LLILLL;
            if (view2 != null) {
                view2.setBackground(gradientDrawable2);
            }
        }
        C16F5 c16f53 = this.LLILLJJLI;
        GiftGalleryBadgeSection giftGalleryBadgeSection6 = giftGalleryBadgeInfo.leagueInfo;
        if (giftGalleryBadgeSection6 != null && (linkMicGiftGalleryDisplayText2 = giftGalleryBadgeSection6.displayText) != null) {
            str4 = linkMicGiftGalleryDisplayText2.content;
        }
        c16f53.setText(str4);
    }

    public C973130bQl(Context context, AttributeSet attributeSet, EnumC973150bQn enumC973150bQn) {
        int i;
        super(context, attributeSet);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        int i2 = C973140bQm.LIZ[enumC973150bQn.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = R.layout.h7y;
            } else {
                throw new C1954807lC();
            }
        } else {
            i = R.layout.h7x;
        }
        C786410Ut5.Sd(i, layoutInflaterNe, this);
        setOrientation(0);
        this.LL = (LiveIconView) findViewById(R.id.lm7);
        this.LLILLJJLI = (C16F5) findViewById(R.id.zth);
        this.LLILLL = findViewById(R.id.bpx);
    }
}
