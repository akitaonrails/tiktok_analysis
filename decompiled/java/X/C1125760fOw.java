package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0fOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125760fOw {
    public static Map<Long, Long> LIZ;
    public static Map<Long, Long> LIZIZ;

    public static boolean LIZLLL(AbstractC1126600fQI abstractC1126600fQI) {
        Object obj;
        Long lValueOf;
        long j;
        Gift gift;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        } else {
            obj = null;
        }
        if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
            lValueOf = Long.valueOf(gift.id);
        } else {
            lValueOf = null;
        }
        Gift.GiftSponsorInfo giftSponsorInfoLIZJ = C1127480fRi.LIZJ(lValueOf, null);
        if (abstractC1126600fQI != null && !abstractC1126600fQI.LIZJ) {
            if (giftSponsorInfoLIZJ != null) {
                j = giftSponsorInfoLIZJ.sponsorId;
            } else {
                j = 0;
            }
            if (j == UserService.getInstance().user().getCurrentUserId() && C1125800fP0.LJI()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(ImageView imageView, C16F5 c16f5) {
        Context context;
        int iIntValue;
        if (C1125810fP1.LIZIZ()) {
            if (imageView != null && imageView.getVisibility() == 0) {
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), imageView);
                C500260Jjc.LJLJLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), imageView);
                C500260Jjc.LJJLJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), imageView);
                imageView.setBackgroundResource(R.drawable.ee2);
            }
            if (c16f5 != null && (context = c16f5.getContext()) != null) {
                Integer numLIZ = C1135270feH.LIZ(R.attr.ezt, context);
                if (numLIZ != null) {
                    iIntValue = numLIZ.intValue();
                } else {
                    iIntValue = -1711276033;
                }
                c16f5.setTextColor(iIntValue);
            }
        }
    }

    public static void LIZ(C16F5 c16f5, C16F5 c16f52, C16F5 c16f53) {
        Context context;
        int iIntValue;
        int iIntValue2;
        if (C1125810fP1.LIZIZ()) {
            if ((c16f5 != null && (context = c16f5.getContext()) != null) || (c16f52 != null && (context = c16f52.getContext()) != null)) {
                Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.ee2);
                if (drawableLIZIZ != null) {
                    drawableLIZIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    if (C497740JfY.LJJ()) {
                        if (c16f5 != null) {
                            c16f5.setCompoundDrawables(null, null, drawableLIZIZ, null);
                        }
                        if (c16f52 != null) {
                            c16f52.setCompoundDrawables(null, null, drawableLIZIZ, null);
                        }
                    } else {
                        if (c16f5 != null) {
                            c16f5.setCompoundDrawables(drawableLIZIZ, null, null, null);
                        }
                        if (c16f52 != null) {
                            c16f52.setCompoundDrawables(drawableLIZIZ, null, null, null);
                        }
                    }
                }
                if (c16f5 != null) {
                    Integer numLIZ = C1135270feH.LIZ(R.attr.ezq, context);
                    if (numLIZ != null) {
                        iIntValue2 = numLIZ.intValue();
                    } else {
                        iIntValue2 = -592138;
                    }
                    c16f5.setTextColor(iIntValue2);
                }
            }
            if (c16f53 != null) {
                c16f53.setTypeface(C1119920fFW.LIZJ(c16f53.getTextSize(), 500, c16f53.getContext()));
                Context context2 = c16f53.getContext();
                if (context2 != null) {
                    Integer numLIZ2 = C1135270feH.LIZ(R.attr.ezt, context2);
                    if (numLIZ2 != null) {
                        iIntValue = numLIZ2.intValue();
                    } else {
                        iIntValue = -1711276033;
                    }
                    c16f53.setTextColor(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        if (c16f53 == null) {
            return;
        }
        c16f53.setTypeface(C1119920fFW.LIZJ(c16f53.getTextSize(), 500, c16f53.getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(X.AbstractC1126600fQI r20, long r21, com.bytedance.ies.sdk.datachannel.DataChannel r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125760fOw.LIZJ(X.0fQI, long, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):int");
    }
}
