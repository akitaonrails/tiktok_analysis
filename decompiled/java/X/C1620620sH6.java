package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.friendstab.guidecard.component.FriendsGuideCardRootAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0sH6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620620sH6 extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                C299700Bou.LIZ("VibePageSummaryCell", "load summary_root_view background failed");
                break;
            case 1:
                onFailed$1(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public C1620620sH6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1620620sH6 c1620620sH6, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) c1620620sH6.l0;
        viewGroup.setBackground(new BitmapDrawable(viewGroup.getContext().getResources(), bitmap));
    }

    public static final void LIZ$1(C1620620sH6 c1620620sH6, Bitmap bitmap) {
        int iIntValue;
        if (bitmap == null) {
            return;
        }
        SmartImageView smartImageView = ((FriendsGuideCardRootAssem) c1620620sH6.l0).LLJJJJ;
        if (smartImageView != null) {
            smartImageView.setImageBitmap(bitmap);
        }
        Integer numLIZIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null)).LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = -16777216;
        }
        float[] fArr = {0.0f, 1.0f, 0.9f};
        Color.colorToHSV(iIntValue, fArr);
        int[] iArr = {Color.HSVToColor(fArr)};
        FriendsGuideCardRootAssem friendsGuideCardRootAssem = (FriendsGuideCardRootAssem) c1620620sH6.l0;
        friendsGuideCardRootAssem.getClass();
        List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(1.0f), Float.valueOf(0.5f));
        Float fValueOf = Float.valueOf(0.0f);
        C1287390jbd c1287390jbd = new C1287390jbd(1.0f, -0.3f, C1697810uHb.LJIIJJI(fValueOf, fValueOf), listLJIIJJI, Color.rgb(0, 0, 0), iArr[0], Color.rgb(0, 0, 0), Color.rgb(0, 0, 0), Color.rgb(0, 0, 0), 2.0f, 0.6f, 2);
        C1287400jbe c1287400jbe = friendsGuideCardRootAssem.LLJJLIIIJLLLLLLLZ;
        if (c1287400jbe != null) {
            c1287400jbe.LIZ(EnumC1287420jbg.SpinDiffuse, c1287390jbd);
            if (c1287400jbe.getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, c1287400jbe);
            }
            c1287400jbe.setZOrderMediaOverlay(true);
            c1287400jbe.getHolder().setFormat(-2);
            if (!friendsGuideCardRootAssem.LLLFF) {
                c1287400jbe.LIZJ();
                friendsGuideCardRootAssem.LLLFF = true;
            }
        }
    }

    public static final void onFailed$1(C1620620sH6 c1620620sH6, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on Failed,throwable:");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        FriendsGuideCardRootAssem friendsGuideCardRootAssem = (FriendsGuideCardRootAssem) c1620620sH6.l0;
        SmartImageView smartImageView = friendsGuideCardRootAssem.LLJJJJ;
        if (smartImageView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(friendsGuideCardRootAssem.getContext(), R.style.y0);
            int iIntValue = 0;
            if (C296430Bjd.LIZ() == 1) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, contextThemeWrapper);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, contextThemeWrapper);
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                }
            }
            c384050F3z.LIZIZ = Integer.valueOf(iIntValue);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(18));
            smartImageView.setImageDrawable(c384050F3z.LIZ(((FriendsGuideCardRootAssem) c1620620sH6.l0).LJJIJL().getContext()));
        }
    }
}
