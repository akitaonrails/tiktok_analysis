package X;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopCardBackground;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H1E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVH$bindBackground$1$1", f = "USSESSellerModuleVH.kt", l = {467}, m = "invokeSuspend")
public final class C0H1E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Image LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ USSESSellerModuleVH LLILZ;
    public final /* synthetic */ ShopCardBackground LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H1E(Image image, boolean z, USSESSellerModuleVH uSSESSellerModuleVH, ShopCardBackground shopCardBackground, InterfaceC1364105Vn<? super C0H1E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = image;
        this.LLILLL = z;
        this.LLILZ = uSSESSellerModuleVH;
        this.LLILZIL = shopCardBackground;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H1E(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        int iLIZIZ;
        String str;
        int i;
        Integer numLJ2;
        Drawable drawable;
        Integer numLJ3;
        Object objLIZIZ = obj;
        C1C7U.LIZ("USSESSellerModuleVH@1a8c.bindBackground$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C0H1J c0h1j = C0H1L.LIZ;
            Image image = this.LLILLJJLI;
            C0H1C c0h1c = C0H1C.V1;
            this.LL = 1;
            objLIZIZ = c0h1j.LIZIZ(image, c0h1c, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("USSESSellerModuleVH@1a8c.bindBackground$1$1");
                return objLJFF;
            }
        }
        Integer num = (Integer) objLIZIZ;
        if (num != null) {
            boolean z = this.LLILLL;
            USSESSellerModuleVH uSSESSellerModuleVH = this.LLILZ;
            ShopCardBackground shopCardBackground = this.LLILZIL;
            Image image2 = this.LLILLJJLI;
            int iIntValue = num.intValue();
            if (z) {
                numLJ = C2286608xc.LJ(0);
            } else {
                numLJ = C2286608xc.LJ(8);
            }
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJ));
            View viewFindViewById = uSSESSellerModuleVH.itemView.findViewById(R.id.v7x);
            Integer num2 = shopCardBackground.shopBackgroundType;
            int value = C0H1G.OLD.getValue();
            if (num2 != null && num2.intValue() == value) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(168)));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(258)));
            }
            C1744700vVE.LJIIIIZZ(iLIZIZ, viewFindViewById);
            List<String> list = image2.toThumbFirstImageUrlModel().LIZ;
            if (list == null || (str = (String) C13LP.LJJJLL(list)) == null) {
                str = "";
            }
            Float f = null;
            C1334210kp9.LIZIZ(str, EnumC1769850w9n.PDP_SHOP_CARD_BACKGROUND, null, null, false, false, null, null);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
            List<String> list2 = USSESSellerModuleVH.LLJLLIL;
            c1331670kl3LIZLLL.LIZLLL("USSESSellerModuleVH");
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJI = new C1331920klS(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8))), fLIZIZ, fLIZIZ);
            c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) uSSESSellerModuleVH.itemView.findViewById(R.id.v7x));
            C786410Ut5.h3(c1331670kl3LIZLLL);
            if (z) {
                View viewFindViewById2 = uSSESSellerModuleVH.itemView.findViewById(R.id.v7z);
                viewFindViewById2.setBackground(new ColorDrawable(iIntValue));
                C631470Opl.LIZ(viewFindViewById2, null, null, null, C2286608xc.LIZLLL(C418440Gaw.LIZIZ(C2286608xc.LJ(10))), C2286608xc.LIZLLL(C418440Gaw.LIZIZ(C2286608xc.LJ(10))), 7);
                i = 100;
            } else {
                i = 200;
            }
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(i)));
            View viewFindViewById3 = uSSESSellerModuleVH.itemView.findViewById(R.id.v80);
            float[] fArr = {0.0f, 1.0f};
            int[] iArr = {iIntValue, 0};
            if (Build.VERSION.SDK_INT >= 29) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                gradientDrawable.setColors(iArr, fArr);
                if (z) {
                    numLJ3 = C2286608xc.LJ(0);
                } else {
                    numLJ3 = C2286608xc.LJ(8);
                }
                gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJ3)));
                drawable = gradientDrawable;
            } else {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, viewFindViewById3.getWidth(), 1.0f, iArr, fArr, Shader.TileMode.CLAMP);
                RectShape rectShape = new RectShape();
                if (z) {
                    numLJ2 = C2286608xc.LJ(0);
                } else {
                    numLJ2 = C2286608xc.LJ(8);
                }
                f = null;
                C631470Opl.LIZ(viewFindViewById3, C2286608xc.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLJ2))), null, null, null, null, 30);
                ShapeDrawable shapeDrawable = new ShapeDrawable(rectShape);
                shapeDrawable.getPaint().setShader(linearGradient);
                drawable = shapeDrawable;
            }
            viewFindViewById3.setBackground(drawable);
            C1744700vVE.LJIIIIZZ(iLIZIZ2, viewFindViewById3);
            View viewFindViewById4 = uSSESSellerModuleVH.itemView.findViewById(R.id.v81);
            viewFindViewById4.setBackground(new ColorDrawable(Color.argb((int) Math.round(((double) Color.alpha(iIntValue)) * 0.2d), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue))));
            C631470Opl.LIZ(viewFindViewById4, C2286608xc.LIZLLL(C418440Gaw.LIZIZ(C2286608xc.LJ(10))), f, f, f, f, 30);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USSESSellerModuleVH@1a8c.bindBackground$1$1");
        return unit;
    }
}
