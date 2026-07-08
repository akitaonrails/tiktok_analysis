package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.view.GameHeaderView$blurAndGradientCover$1", f = "GameHeaderView.kt", l = {1026, 1033, 1039}, m = "invokeSuspend")
public final class C1099620eim extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ C1908530zlT LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1099620eim(Bitmap bitmap, C1908530zlT c1908530zlT, InterfaceC1364105Vn<? super C1099620eim> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bitmap;
        this.LLILZ = c1908530zlT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1099620eim c1099620eim = new C1099620eim(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1099620eim.LLILLJJLI = obj;
        return c1099620eim;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapCreateBitmap;
        int iLIZIZ;
        int paddingTop;
        C1C7U.LIZ("GameHeaderView@dc6.blurAndGradientCover$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
                return unit2;
            }
            e = (Throwable) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get scaled bitmap error: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJIIL("GameHeaderView", C2188811AlT.LIZIZ(sbLIZ));
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
            return unit3;
        }
        C155000ia.LIZIZ(obj);
        Bitmap bitmapCreateBitmap2 = null;
        try {
            Bitmap bitmap = this.LLILLL;
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 1, this.LLILLL.getHeight() / 1, true);
            C1908530zlT c1908530zlT = this.LLILZ;
            c1908530zlT.getClass();
            try {
                RenderScript renderScriptCreate = RenderScript.create(c1908530zlT.getContext());
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                scriptIntrinsicBlurCreate.setRadius(20.0f);
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                allocationCreateTyped.copyTo(bitmapCreateBitmap);
                allocationCreateFromBitmap.destroy();
                allocationCreateTyped.destroy();
                scriptIntrinsicBlurCreate.destroy();
                renderScriptCreate.destroy();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("blur bitmap error: ");
                sbLIZ2.append(e.getMessage());
                C20441214yg.LJ("GameHeaderView", C2188811AlT.LIZIZ(sbLIZ2));
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap == null) {
                C1908530zlT c1908530zlT2 = this.LLILZ;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1096250edL c1096250edL = new C1096250edL(c1908530zlT2, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, c1096250edL) == objLJFF) {
                    C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
                    return objLJFF;
                }
                Unit unit22 = Unit.LIZ;
                C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
                return unit22;
            }
            C1908530zlT c1908530zlT3 = this.LLILZ;
            c1908530zlT3.getClass();
            Bitmap.Config config = bitmapCreateBitmap.getConfig();
            if (config != null) {
                bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), config);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                Paint paint = new Paint();
                float height = bitmapCreateBitmap.getHeight();
                int iLIZIZ2 = (int) C497740JfY.LIZIZ(200.0f);
                View view = c1908530zlT3.LLJI;
                if (view != null) {
                    iLIZIZ = view.getMeasuredHeight();
                } else {
                    iLIZIZ = (int) C497740JfY.LIZIZ(220.0f);
                }
                View view2 = c1908530zlT3.LLJI;
                if (view2 != null) {
                    paddingTop = view2.getPaddingTop();
                } else {
                    paddingTop = 0;
                }
                float expandedHeaderHeight = (height * (iLIZIZ2 + (iLIZIZ - paddingTop))) / c1908530zlT3.getExpandedHeaderHeight();
                paint.setShader(new LinearGradient(0.0f, bitmapCreateBitmap.getHeight(), 0.0f, bitmapCreateBitmap.getHeight() - expandedHeaderHeight, new int[]{-16777216, Math.min(255, Math.max(0, (int) (255 * 0.9f))) << 24, 0}, new float[]{0.0f, 0.62f, 1.0f}, Shader.TileMode.CLAMP));
                canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - expandedHeaderHeight, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                paint.setShader(null);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                Rect rect = new Rect(0, bitmapCreateBitmap.getHeight() - ((int) expandedHeaderHeight), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                canvas.drawBitmap(bitmapCreateBitmap, rect, rect, paint);
            }
            if (bitmapCreateBitmap2 == null) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
                return unit4;
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C1096270edN c1096270edN = new C1096270edN(bitmapCreateBitmap2, this.LLILZ, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq2, c1096270edN) == objLJFF) {
                C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
                return objLJFF;
            }
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
            return unit5;
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh3 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
            C1096260edM c1096260edM = new C1096260edM(this.LLILZ, null);
            this.LLILLJJLI = e;
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq3, c1096260edM) == objLJFF) {
                C1C7U.LIZIZ("GameHeaderView@dc6.blurAndGradientCover$1");
                return objLJFF;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
