package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113720f5W extends C1113730f5X {
    public final GradientDrawable LLIZLLLIL;
    public int LLJ;

    public C1113720f5W(View view) {
        Drawable background;
        GradientDrawable gradientDrawable;
        C1114180f6G c1114180f6G;
        super(view);
        View view2 = this.LLILZIL;
        if (view2 != null) {
            background = view2.getBackground();
        } else {
            background = null;
        }
        if (background instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = null;
        }
        this.LLIZLLLIL = gradientDrawable;
        InterfaceC1113760f5a interfaceC1113760f5a = this.LLILZ;
        if ((interfaceC1113760f5a instanceof C1114180f6G) && (c1114180f6G = (C1114180f6G) interfaceC1113760f5a) != null) {
            c1114180f6G.setCapsuleRadiusObserver(new AwS630S0100000_16(this, 112));
        }
    }

    @Override // X.C1113730f5X
    public final void R5(C1109770ez9 c1109770ez9) {
        boolean zLJFF;
        LiveCapsuleStyleItemConfig liveCapsuleStyleItemConfigLJI;
        C1109770ez9 c1109770ez92;
        Context context;
        Resources resources;
        DisplayMetrics displayMetrics;
        View view;
        float fApplyDimension;
        DataChannel dataChannel = c1109770ez9.LJIIIZ;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(PublicScreenShrinkChannel.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        this.LLIZ = zLJFF;
        InterfaceC1113740f5Y interfaceC1113740f5Y = this.LLILLJJLI;
        if (interfaceC1113740f5Y != null && (liveCapsuleStyleItemConfigLJI = interfaceC1113740f5Y.LJI()) != null && (c1109770ez92 = this.LL) != null && (context = c1109770ez92.LIZ) != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && (view = this.LLILZIL) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (this.LLIZ) {
                fApplyDimension = TypedValue.applyDimension(1, liveCapsuleStyleItemConfigLJI.shrinkModeMarginEnd, displayMetrics);
            } else {
                fApplyDimension = TypedValue.applyDimension(1, liveCapsuleStyleItemConfigLJI.marginEnd, displayMetrics);
            }
            marginLayoutParams.setMarginEnd((int) fApplyDimension);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    @Override // X.C1113730f5X, X.AbstractC1111020f1A
    public final /* bridge */ /* synthetic */ void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
        L5(c1109770ez9, (InterfaceC1113740f5Y) interfaceC1112060f2q);
    }

    @Override // X.C1113730f5X
    /* JADX INFO: renamed from: P5 */
    public final void L5(C1109770ez9 c1109770ez9, InterfaceC1113740f5Y interfaceC1113740f5Y) {
        View actionView;
        if (this.LLJ != interfaceC1113740f5Y.LJI().capsuleMinHeight) {
            this.LLJ = interfaceC1113740f5Y.LJI().capsuleMinHeight;
            InterfaceC1113760f5a interfaceC1113760f5a = this.LLILZ;
            if (interfaceC1113760f5a != null && (actionView = interfaceC1113760f5a.getActionView()) != null) {
                ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
                layoutParams.height = (int) TypedValue.applyDimension(1, this.LLJ, c1109770ez9.LIZ.getResources().getDisplayMetrics());
                C786410Ut5.W5(actionView, layoutParams);
            }
        }
        super.L5(c1109770ez9, interfaceC1113740f5Y);
    }
}
