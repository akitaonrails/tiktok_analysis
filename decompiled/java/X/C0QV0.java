package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.search.result.skin.GeneralVerticalSkinAssem;
import com.ss.android.ugc.aweme.search.ecommerce.SwitchThemeAbility;
import com.ss.android.ugc.aweme.search.model.Image;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS10S1310000_6;

/* JADX INFO: renamed from: X.0QV0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QV0 extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ Image LL;
    public final /* synthetic */ GeneralVerticalSkinAssem LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ View LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QV0(Image image, GeneralVerticalSkinAssem generalVerticalSkinAssem, C19EG c19eg, View view, boolean z, Function0<Unit> function0, boolean z2, String str, View view2) {
        super(1);
        this.LL = image;
        this.LLILLJJLI = generalVerticalSkinAssem;
        this.LLILLL = c19eg;
        this.LLILZ = view;
        this.LLILZIL = z;
        this.LLILZLL = function0;
        this.LLIZ = z2;
        this.LLIZLLLIL = str;
        this.LLJ = view2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        final int width;
        final int height;
        boolean z;
        C0Q7B c0q7b;
        Function0<Unit> function0;
        C0Q4X c0q4xLo;
        final View view;
        final Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            Integer imageWidth = this.LL.getImageWidth();
            if (imageWidth != null) {
                width = imageWidth.intValue();
            } else {
                width = bitmap2.getWidth();
            }
            Integer imageHeight = this.LL.getImageHeight();
            if (imageHeight != null) {
                height = imageHeight.intValue();
            } else {
                height = bitmap2.getHeight();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[loadPromotionSkinBg] RdSearchBigSaleFixConf.enable=");
            sbLIZ.append(C286180BJo.LIZ());
            sbLIZ.append(", promotionSkinBackground=");
            final boolean z2 = false;
            if (this.LLILLJJLI.No() != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            C0Q4X c0q4xLo2 = this.LLILLJJLI.Lo();
            if (c0q4xLo2 != null) {
                c0q7b = c0q4xLo2.LLILZLL;
            } else {
                c0q7b = null;
            }
            if (c0q7b == C0Q7B.SIMPLIFIED) {
                z2 = true;
            }
            if (C286180BJo.LIZ()) {
                SmartImageView smartImageViewNo = this.LLILLJJLI.No();
                if (smartImageViewNo != null) {
                    if (z2 && !C0QV7.LIZ()) {
                        this.LLILLJJLI.Jo(bitmap2, smartImageViewNo, this.LLILLL, width, height, this.LLILZ);
                    } else {
                        this.LLILLJJLI.Go(bitmap2, smartImageViewNo, this.LLILLL, width, height, null);
                    }
                } else if (z2) {
                    final GeneralVerticalSkinAssem generalVerticalSkinAssem = this.LLILLJJLI;
                    final C19EG c19eg = this.LLILLL;
                    generalVerticalSkinAssem.getClass();
                    Fragment fragmentLJI = C724240Sb0.LJI(generalVerticalSkinAssem);
                    if ((fragmentLJI != null && (view = fragmentLJI.getView()) != null) || ((c0q4xLo = generalVerticalSkinAssem.Lo()) != null && (view = c0q4xLo.LLILZIL) != null)) {
                        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0QV2
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                View view2;
                                SmartImageView smartImageView;
                                View view3;
                                C786410Ut5.C3(view.getViewTreeObserver(), this);
                                GeneralVerticalSkinAssem generalVerticalSkinAssem2 = generalVerticalSkinAssem;
                                C0Q4X c0q4xLo3 = generalVerticalSkinAssem2.Lo();
                                if (c0q4xLo3 == null || (view3 = c0q4xLo3.LLILZIL) == null || (smartImageView = (SmartImageView) view3.findViewById(R.id.sb8)) == null) {
                                    Fragment fragmentLJI2 = C724240Sb0.LJI(generalVerticalSkinAssem2);
                                    if (fragmentLJI2 == null || (view2 = fragmentLJI2.getView()) == null) {
                                        return;
                                    } else {
                                        smartImageView = (SmartImageView) view2.findViewById(R.id.sb8);
                                    }
                                }
                                if (smartImageView != null) {
                                    if (!z2 || C0QV7.LIZ()) {
                                        generalVerticalSkinAssem.Go(bitmap2, smartImageView, c19eg, width, height, null);
                                        return;
                                    }
                                    GeneralVerticalSkinAssem generalVerticalSkinAssem3 = generalVerticalSkinAssem;
                                    Bitmap bitmap3 = bitmap2;
                                    Context context = c19eg;
                                    int i = width;
                                    int i2 = height;
                                    SwitchThemeAbility switchThemeAbility = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(generalVerticalSkinAssem), SwitchThemeAbility.class, null);
                                    generalVerticalSkinAssem3.Jo(bitmap3, smartImageView, context, i, i2, switchThemeAbility != null ? switchThemeAbility.Gu() : null);
                                }
                            }
                        });
                    }
                }
            }
            if (this.LLILZ != null) {
                this.LLILLJJLI.So().getState();
                this.LLILLJJLI.LJJIJL().getWidth();
                GeneralVerticalSkinAssem generalVerticalSkinAssem2 = this.LLILLJJLI;
                View view2 = this.LLILZ;
                generalVerticalSkinAssem2.Go(bitmap2, view2, this.LLILLL, width, height, new AwS10S1310000_6(this.LLILZIL, (boolean) this.LLIZLLLIL, (String) this.LLJ, (View) this.LLILZLL, (Function0<Unit>) view2, (View) 0));
            } else if (this.LLILZIL && (function0 = this.LLILZLL) != null) {
                function0.invoke();
            }
            SwitchThemeAbility switchThemeAbility = (SwitchThemeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLJJLI), SwitchThemeAbility.class, null);
            if (switchThemeAbility != null) {
                switchThemeAbility.BF2(this.LLIZ);
            }
        }
        return Unit.LIZ;
    }
}
