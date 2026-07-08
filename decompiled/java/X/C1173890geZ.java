package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0geZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173890geZ extends FrameLayout {
    public final C1173860geW LL;

    private final Drawable getOverlayBackground() {
        Drawable drawableLIZ = new C384050F3z().LIZ(getContext());
        GradientDrawable gradientDrawable = (GradientDrawable) drawableLIZ;
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr = new int[3];
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zd, getContext());
            iArr[0] = numLIZJ != null ? numLIZJ.intValue() : 0;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zd, getContext());
            iArr[1] = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.z_, getContext());
            iArr[2] = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
            gradientDrawable.setColors(iArr, new float[]{0.0f, 0.4f, 1.0f});
        } else {
            int[] iArr2 = new int[3];
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.zd, getContext());
            iArr2[0] = numLIZJ4 != null ? numLIZJ4.intValue() : 0;
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.zd, getContext());
            iArr2[1] = numLIZJ5 != null ? numLIZJ5.intValue() : 0;
            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.z_, getContext());
            iArr2[2] = numLIZJ6 != null ? numLIZJ6.intValue() : 0;
            gradientDrawable.setColors(iArr2);
        }
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setGradientType(0);
        return drawableLIZ;
    }

    public final Drawable getPostButtonBackground() {
        C384050F3z c384050F3z = new C384050F3z();
        C1546210qL5.LIZ.getClass();
        c384050F3z.LIZJ = Float.valueOf(C1546210qL5.LIZ(200));
        Drawable drawableLIZ = c384050F3z.LIZ(getContext());
        GradientDrawable gradientDrawable = (GradientDrawable) drawableLIZ;
        int[] iArr = new int[3];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.u8, getContext());
        iArr[0] = numLIZJ != null ? numLIZJ.intValue() : 0;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.u7, getContext());
        iArr[1] = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.u6, getContext());
        iArr[2] = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
        gradientDrawable.setColors(iArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setGradientType(0);
        return drawableLIZ;
    }

    public C1173890geZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.fb6, C786410Ut5.ne(context), this);
        int i = R.id.bnu;
        SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.bnu, this);
        if (smartImageView != null) {
            i = R.id.e1g;
            TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.e1g, this);
            if (tuxIconView != null) {
                i = R.id.ffs;
                TextView textView = (TextView) C1616006Uk.LIZ(R.id.ffs, this);
                if (textView != null) {
                    i = R.id.oo4;
                    SmartImageView smartImageView2 = (SmartImageView) C1616006Uk.LIZ(R.id.oo4, this);
                    if (smartImageView2 != null) {
                        i = R.id.f768oo5;
                        SmartImageView smartImageView3 = (SmartImageView) C1616006Uk.LIZ(R.id.f768oo5, this);
                        if (smartImageView3 != null) {
                            i = R.id.oo6;
                            SmartImageView smartImageView4 = (SmartImageView) C1616006Uk.LIZ(R.id.oo6, this);
                            if (smartImageView4 != null) {
                                i = R.id.oo7;
                                FrameLayout frameLayout = (FrameLayout) C1616006Uk.LIZ(R.id.oo7, this);
                                if (frameLayout != null) {
                                    i = R.id.pwk;
                                    View viewLIZ = C1616006Uk.LIZ(R.id.pwk, this);
                                    if (viewLIZ != null) {
                                        i = R.id.ril;
                                        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.ril, this);
                                        if (c197039127h != null) {
                                            i = R.id.vbx;
                                            SmartImageView smartImageView5 = (SmartImageView) C1616006Uk.LIZ(R.id.vbx, this);
                                            if (smartImageView5 != null) {
                                                i = R.id.vby;
                                                FrameLayout frameLayout2 = (FrameLayout) C1616006Uk.LIZ(R.id.vby, this);
                                                if (frameLayout2 != null) {
                                                    i = R.id.title;
                                                    TextView textView2 = (TextView) C1616006Uk.LIZ(R.id.title, this);
                                                    if (textView2 != null) {
                                                        this.LL = new C1173860geW(this, smartImageView, tuxIconView, textView, smartImageView2, smartImageView3, smartImageView4, frameLayout, viewLIZ, c197039127h, smartImageView5, frameLayout2, textView2);
                                                        c197039127h.LJJJJL(new AwS597S0100000_18(this, 759));
                                                        viewLIZ.setBackground(getOverlayBackground());
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    public final void LIZ(Aweme aweme, List<? extends Aweme> list, Function1<? super EnumC1173840geU, Unit> function1) {
        User currentUser;
        String uid;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null && (uid = currentUser.getUid()) != null) {
            String str = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()));
            InterfaceC1618460sDc interfaceC1618460sDcLJIJJLI = C1618440sDa.LIZIZ.LJIJJLI();
            Context context = getContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uid);
            sbLIZ.append('_');
            sbLIZ.append(str);
            interfaceC1618460sDcLJIJJLI.LJIJ(new C20271514Tp(context, aweme, "", C2188811AlT.LIZIZ(sbLIZ), "story_archive", list, 0, 0, C13BV.INSTANCE, false, "has_local", null, false, false, null, null, null, null, 1041344), new AwS562S0100000_18(function1, (Function1<? super C1184710gw1, Unit>) 2284));
        }
    }
}
