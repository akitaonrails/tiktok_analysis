package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.EcommerceRoomHeadTag;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597100rfA {
    public static final C1597100rfA LIZ = new C1597100rfA();

    public static String LIZJ(Context context) {
        try {
            return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIIJZLJL().LIZ(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "LIVE";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060 A[PHI: r6 r7 r8
      0x0060: PHI (r6v4 boolean) = (r6v0 boolean), (r6v0 boolean), (r6v5 boolean) binds: [B:64:0x0104, B:65:0x0106, B:32:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r7v5 boolean) = (r7v1 boolean), (r7v1 boolean), (r7v6 boolean) binds: [B:64:0x0104, B:65:0x0106, B:32:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r8v5 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v6 boolean) binds: [B:64:0x0104, B:65:0x0106, B:32:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109 A[PHI: r2 r6 r7 r8
      0x0109: PHI (r2v1 boolean) = (r2v0 boolean), (r2v9 boolean), (r2v9 boolean) binds: [B:66:0x0108, B:34:0x0061, B:35:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r6v1 boolean) = (r6v0 boolean), (r6v4 boolean), (r6v4 boolean) binds: [B:66:0x0108, B:34:0x0061, B:35:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r7v2 boolean) = (r7v1 boolean), (r7v5 boolean), (r7v5 boolean) binds: [B:66:0x0108, B:34:0x0061, B:35:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r8v2 boolean) = (r8v1 boolean), (r8v5 boolean), (r8v5 boolean) binds: [B:66:0x0108, B:34:0x0061, B:35:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(int r12) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597100rfA.LIZLLL(int):java.lang.String");
    }

    public static void LJFF(TuxTextView tuxTextView) {
        tuxTextView.setCompoundDrawables(null, null, null, null);
        try {
            String strLIZJ = LIZJ(tuxTextView.getContext());
            tuxTextView.setText(strLIZJ);
            LIZ(tuxTextView, strLIZJ, 12.0f);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            tuxTextView.setText("LIVE");
            LIZ(tuxTextView, "LIVE", 12.0f);
        }
    }

    public static void LJ(final TuxTextView tuxTextView, EcommerceRoomHeadTag ecommerceRoomHeadTag) {
        String str;
        List urls;
        final String strLIZJ = ecommerceRoomHeadTag.text;
        final ImageModel imageModel = ecommerceRoomHeadTag.icon;
        final float fLIZJ = C12ES.LIZJ(88.0f, tuxTextView.getContext());
        if (imageModel != null && (urls = imageModel.getUrls()) != null) {
            str = (String) C13LP.LJJJLL(urls);
        } else {
            str = null;
        }
        if (strLIZJ == null || strLIZJ.length() <= 0) {
            strLIZJ = LIZJ(tuxTextView.getContext());
        }
        tuxTextView.setText(strLIZJ);
        LIZIZ(tuxTextView, strLIZJ, fLIZJ);
        if (TextUtils.isEmpty(str)) {
            tuxTextView.setCompoundDrawables(null, null, null, null);
            return;
        }
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str)));
        c1331670kl3LJIIJ.LIZLLL("FollowFeedSkylight");
        c1331670kl3LJIIJ.LJJIIJ(new AbstractC468201s0() { // from class: X.0rfB
            public final /* synthetic */ int LLILZ = 2;

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                int i;
                if (bitmap != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(tuxTextView.getResources(), bitmap);
                    ImageModel imageModel2 = imageModel;
                    int i2 = 10;
                    if (imageModel2 != null) {
                        i = imageModel2.width;
                    } else {
                        i = 10;
                    }
                    float f = i;
                    if (imageModel2 != null) {
                        i2 = imageModel2.height;
                    }
                    int iLIZJ = (int) C12ES.LIZJ(f, tuxTextView.getContext());
                    int iLIZJ2 = (int) C12ES.LIZJ(i2, tuxTextView.getContext());
                    float f2 = (fLIZJ - iLIZJ) - this.LLILZ;
                    C1597100rfA c1597100rfA = C1597100rfA.LIZ;
                    TextView textView = tuxTextView;
                    String str2 = strLIZJ;
                    c1597100rfA.getClass();
                    if (!C1597100rfA.LIZIZ(textView, str2, f2)) {
                        tuxTextView.setCompoundDrawables(null, null, null, null);
                        C1597100rfA.LIZIZ(tuxTextView, strLIZJ, fLIZJ);
                        return;
                    } else {
                        bitmapDrawable.setBounds(0, 0, iLIZJ, iLIZJ2);
                        tuxTextView.setCompoundDrawablePadding(this.LLILZ);
                        tuxTextView.setCompoundDrawables(bitmapDrawable, null, null, null);
                        return;
                    }
                }
                TextView textView2 = tuxTextView;
                String str3 = strLIZJ;
                float f3 = fLIZJ;
                textView2.setCompoundDrawables(null, null, null, null);
                C1597100rfA.LIZ.getClass();
                C1597100rfA.LIZIZ(textView2, str3, f3);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                tuxTextView.setCompoundDrawables(null, null, null, null);
                C1597100rfA c1597100rfA = C1597100rfA.LIZ;
                TextView textView = tuxTextView;
                String str2 = strLIZJ;
                float f = fLIZJ;
                c1597100rfA.getClass();
                C1597100rfA.LIZIZ(textView, str2, f);
            }
        });
    }

    public static void LIZ(TuxTextView tuxTextView, String str, float f) {
        tuxTextView.setTextSize(1, f);
        if (tuxTextView.getPaint().measureText(str) > C12ES.LIZJ(46.0f, tuxTextView.getContext())) {
            float f2 = f - 1;
            if (f2 >= 10.0f) {
                LIZ(tuxTextView, str, f2);
            }
        }
    }

    public static boolean LIZIZ(TextView textView, String str, float f) {
        float f2 = 12.0f;
        do {
            textView.setTextSize(1, f2);
            if (textView.getPaint().measureText(str) <= f) {
                return true;
            }
            f2 -= 1.0f;
        } while (f2 > 10.0f);
        return false;
    }

    public static void LJI(C1597100rfA c1597100rfA, Context context, FollowingInterestUser followingInterestUser, List list, int i, View view, String str, int i2, long j, int i3) {
        String str2;
        String str3 = str;
        long j2 = j;
        if ((i3 & 32) != 0) {
            str3 = "live_cover";
        }
        if ((i3 & 128) != 0) {
            j2 = 0;
        }
        c1597100rfA.getClass();
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    str2 = "";
                } else {
                    str2 = "homepage_follow";
                }
            } else {
                str2 = "homepage_hot";
            }
        } else {
            str2 = "homepage_friends";
        }
        Intrinsics.LJFF(null, Boolean.TRUE);
        C1597740rgC.LIZ.getClass();
        C1597740rgC.LJIIJ(context, followingInterestUser, list, i, view, str2, str3, j2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("is_live", "1");
        C20684815ws.LJIILLIIL("click_play_following_window", c2344009Gk.LIZ);
    }
}
