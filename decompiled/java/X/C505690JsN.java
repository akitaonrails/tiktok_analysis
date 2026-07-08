package X;

import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0JsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505690JsN extends C502700JnY {
    public final View LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final C1324720kZq LLILZ;
    public final View LLILZIL;
    public final C1324720kZq LLILZLL;

    public C505690JsN(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.n8e);
        this.LLILLL = (C16F5) view.findViewById(R.id.mud);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.bh2);
        this.LLILZIL = view.findViewById(R.id.n0u);
        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.bjg);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C505520Js6 c505520Js6;
        C504510JqT c504510JqT;
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String strLIZIZ = null;
        if (abstractC503810JpL instanceof C505520Js6) {
            c505520Js6 = (C505520Js6) abstractC503810JpL;
        } else {
            c505520Js6 = null;
        }
        if (interfaceC2753014t instanceof C504510JqT) {
            c504510JqT = (C504510JqT) interfaceC2753014t;
        } else {
            c504510JqT = null;
        }
        if (c505520Js6 == null || c504510JqT == null) {
            return;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JsO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.LL.getContext(), c505520Js6.LIZ);
            }
        }, this.LL);
        C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), c504510JqT.LLILLL, this.LLILZ);
        this.LLILLL.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131844320), Arrays.copyOf(new Object[]{C0KVU.LIZ(c504510JqT.LLILLL)}, 1)));
        Long l = c505520Js6.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue > 0) {
            C786410Ut5.LLJJJJ(this.LLILLJJLI, 0);
            C16F5 c16f5 = this.LLILLJJLI;
            String strLJIJI = C497740JfY.LJIJI(2131844319);
            Object[] objArr = new Object[1];
            Long l2 = c505520Js6.LIZIZ;
            if (l2 != null) {
                strLIZIZ = C474270Iin.LIZIZ(l2.longValue());
            }
            objArr[0] = strLIZIZ;
            c16f5.setText(C786410Ut5.j4(strLJIJI, Arrays.copyOf(objArr, 1)));
        } else {
            C786410Ut5.LLJJJJ(this.LLILLJJLI, 8);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ewq, this.LL.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ewr, this.LL.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ews, this.LL.getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        final int[] iArr = {iIntValue, iIntValue2, iIntValue3};
        float fLIZIZ = C497740JfY.LIZIZ(8.0f);
        float fLIZIZ2 = C497740JfY.LIZIZ(1.0f);
        float f = fLIZIZ - fLIZIZ2;
        RoundRectShape roundRectShape = new RoundRectShape(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ}, new RectF(fLIZIZ2, fLIZIZ2, fLIZIZ2, fLIZIZ2), new float[]{f, f, f, f, f, f, f, f});
        ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: X.0GQT
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public final Shader resize(int i, int i2) {
                return new LinearGradient(0.0f, 0.0f, i, i2, iArr, (float[]) null, Shader.TileMode.CLAMP);
            }
        };
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.setShaderFactory(shaderFactory);
        this.LLILZIL.setBackground(shapeDrawable);
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LJFF = true;
        c1143920fsE.LIZIZ = "tiktok_live_watch_resource_normal_1";
        c1143920fsE.LIZJ = "live_skylight_icon_anim_small_size.webp";
        c1143920fsE.LIZ = this.LLILZLL;
        c1143920fsE.LJI = Integer.MAX_VALUE;
        C1143680frq.LJIIIIZZ(c1143920fsE);
    }
}
