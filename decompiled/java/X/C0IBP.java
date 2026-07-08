package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mf.a;

/* JADX INFO: renamed from: X.0IBP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IBP extends FrameLayout implements View.OnClickListener {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final TuxIconView LLILZ;
    public int LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;
    public C0IB7 LLIZ;

    private final ILightInteractionPlatformService getLightInteractionService() {
        return (ILightInteractionPlatformService) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
    }

    private final int getLightInteractionIconRes() {
        ILightInteractionPlatformService lightInteractionService = getLightInteractionService();
        if (lightInteractionService != null && lightInteractionService.LJJLIIIJJIZ() && this.LLIZ == C0IB7.REPOST) {
            return R.raw.icon_bitmap_sticker_hi;
        }
        ILightInteractionPlatformService lightInteractionService2 = getLightInteractionService();
        if (lightInteractionService2 == null || !lightInteractionService2.LJJLIIIIJ()) {
            return R.raw.icon_bitmap_sticker_nudge;
        }
        C0IB7 c0ib7 = this.LLIZ;
        return (c0ib7 == C0IB7.LIKE || c0ib7 == C0IB7.FAVOURITE) ? R.raw.icon_bitmap_sticker_heart : R.raw.icon_bitmap_sticker_nudge;
    }

    public final int getCurrStyle() {
        return this.LLILZIL;
    }

    public C0IBP(Context context) {
        View.OnClickListener fVar;
        super(context, null, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        this.LLILLL = R.raw.icon_arrow_turn_up_left_fill;
        this.LLIZ = C0IB7.NONE;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.br, context);
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(18));
        gradientDrawable.setSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        View view = new View(context);
        view.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LLILZ = tuxIconView;
        LIZIZ(1, false);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        addView(tuxIconView, layoutParams2);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        C426750GoL.LJIIL(this, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        View.OnClickListener aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1<? super Integer, Unit> function1;
        if (!C0OBG.LIZIZ(view) && (function1 = this.LLILZLL) != null) {
            function1.invoke(Integer.valueOf(this.LLILZIL));
        }
    }

    public final void LIZ(C0IB7 c0ib7, C896110ZDl c896110ZDl) {
        this.LLIZ = c0ib7;
        this.LLILZLL = c896110ZDl;
        ILightInteractionPlatformService lightInteractionService = getLightInteractionService();
        if (lightInteractionService != null && lightInteractionService.LJJLIIIIJ()) {
            LIZIZ(this.LLILZIL, true);
        }
    }

    public final boolean LIZIZ(int i, boolean z) {
        if (!z && this.LLILZIL == i) {
            return false;
        }
        this.LLILZIL = i;
        if (i == 2) {
            TuxIconView tuxIconView = this.LLILZ;
            tuxIconView.setIconRes(this.LLILLL);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, tuxIconView.getContext());
            if (numLIZJ != null) {
                tuxIconView.setTintColor(numLIZJ.intValue());
            }
            tuxIconView.setIconWidth(this.LL);
            tuxIconView.setIconHeight(this.LL);
            return true;
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        tuxIconView2.setIconRes(getLightInteractionIconRes());
        tuxIconView2.LIZ();
        tuxIconView2.setIconWidth(this.LLILLJJLI);
        tuxIconView2.setIconHeight(this.LLILLJJLI);
        return true;
    }
}
