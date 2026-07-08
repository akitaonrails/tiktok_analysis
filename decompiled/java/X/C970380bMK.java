package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bMK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970380bMK extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public C970380bMK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final View getDividerView() {
        return (View) this.LLILZIL.getValue();
    }

    private final LiveIconView getGalleryIv() {
        return (LiveIconView) this.LLILLL.getValue();
    }

    private final C16F5 getGalleryTv() {
        return (C16F5) this.LLILZ.getValue();
    }

    private final LiveIconView getLeagueIv() {
        return (LiveIconView) this.LL.getValue();
    }

    private final C16F5 getLeagueTv() {
        return (C16F5) this.LLILLJJLI.getValue();
    }

    public static int LIZ(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CoHostGalleryBadgeView parseColorSafely ");
            sbLIZ.append(e.getMessage());
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
    }

    private final void setBackgroundColor(String str) {
        Drawable drawableLIZ = C14MI.LIZ(getContext(), R.drawable.dzz);
        if (drawableLIZ != null) {
            C16GF.LJI(drawableLIZ, LIZ(str));
            setBackground(drawableLIZ);
        }
    }

    public final boolean LIZIZ(GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (giftGalleryBadgeInfo != null) {
            GiftGalleryBadgeSection giftGalleryBadgeSection = giftGalleryBadgeInfo.leagueInfo;
            if (giftGalleryBadgeSection != null) {
                z = giftGalleryBadgeSection.shouldShow;
            } else {
                z = false;
                if (giftGalleryBadgeInfo != null) {
                }
            }
            GiftGalleryBadgeSection giftGalleryBadgeSection2 = giftGalleryBadgeInfo.galleryInfo;
            if (giftGalleryBadgeSection2 != null) {
                z2 = giftGalleryBadgeSection2.shouldShow;
            } else {
                z2 = false;
                if (giftGalleryBadgeInfo != null) {
                }
            }
            if (z || z2) {
                C500260Jjc.LLFFF(this);
                setBackgroundColor(giftGalleryBadgeInfo.backgroundColor);
                if (z && z2) {
                    z3 = true;
                }
                String str = giftGalleryBadgeInfo.separatorColor;
                View dividerView = getDividerView();
                if (dividerView != null) {
                    if (z3) {
                        C500260Jjc.LLFFF(dividerView);
                        dividerView.setBackgroundColor(LIZ(str));
                    } else {
                        C500260Jjc.LJIILIIL(dividerView);
                    }
                }
                GiftGalleryBadgeSection giftGalleryBadgeSection3 = giftGalleryBadgeInfo.leagueInfo;
                if (giftGalleryBadgeSection3 != null) {
                    LIZJ(giftGalleryBadgeSection3, getLeagueIv(), getLeagueTv(), AFwS203S0000000_15.get$arr$(259));
                }
                GiftGalleryBadgeSection giftGalleryBadgeSection4 = giftGalleryBadgeInfo.galleryInfo;
                if (giftGalleryBadgeSection4 != null) {
                    LIZJ(giftGalleryBadgeSection4, getGalleryIv(), getGalleryTv(), new C919180a1k(C466010IPf.LIZ));
                    return true;
                }
                LiveIconView galleryIv = getGalleryIv();
                C16F5 galleryTv = getGalleryTv();
                if (galleryTv != null) {
                    C500260Jjc.LJIILIIL(galleryTv);
                }
                if (galleryIv == null) {
                    return true;
                }
                C500260Jjc.LJIILIIL(galleryIv);
                return true;
            }
        }
        C500260Jjc.LJIILIIL(this);
        return false;
    }

    public C970380bMK(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = C1935407i4.LIZ(new AwS559S0100000_15(this, 441));
        this.LLILLJJLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 442));
        this.LLILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 439));
        this.LLILZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 440));
        this.LLILZIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 438));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gs4, this, true);
        setPadding(C439101nJ.LIZ(4), C439101nJ.LIZ(2), C439101nJ.LIZ(4), C439101nJ.LIZ(2));
    }

    public static void LIZJ(GiftGalleryBadgeSection giftGalleryBadgeSection, LiveIconView liveIconView, C16F5 c16f5, Function0 function0) {
        if (giftGalleryBadgeSection.shouldShow) {
            C500260Jjc.LLFFF(liveIconView);
            C1819620xS4.LIZ().LJIIIZ(giftGalleryBadgeSection.icon).LJJI(liveIconView);
            if (((Boolean) function0.invoke()).booleanValue()) {
                C500260Jjc.LLFFF(c16f5);
                LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText = giftGalleryBadgeSection.displayText;
                if (linkMicGiftGalleryDisplayText != null && c16f5 != null) {
                    c16f5.setText(linkMicGiftGalleryDisplayText.content);
                    c16f5.setTextColor(LIZ(linkMicGiftGalleryDisplayText.color));
                    return;
                }
                return;
            }
            C500260Jjc.LJIILIIL(c16f5);
            return;
        }
        C500260Jjc.LJIILIIL(liveIconView);
        C500260Jjc.LJIILIIL(c16f5);
    }
}
