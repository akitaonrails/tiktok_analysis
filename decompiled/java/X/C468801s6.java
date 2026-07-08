package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01s6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareServiceImpl$generateStoryImageAndBackground$2$imagePathDeferred$1", f = "MixStudioShareServiceImpl.kt", l = {32}, m = "invokeSuspend")
public final class C468801s6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468801s6(Context context, String str, List<String> list, boolean z, InterfaceC1364105Vn<? super C468801s6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C468801s6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2$imagePathDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C474201sy c474201sy = C474201sy.LIZ;
            Context context = this.LLILLJJLI;
            String str = this.LLILLL;
            List<String> list = this.LLILZ;
            boolean z = this.LLILZIL;
            this.LL = 1;
            c474201sy.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            final String path = new C0VSJ(str, "sticker_image.webp").getPath();
            if (z) {
                try {
                    c474201sy.LIZ(path);
                    C189200o6.m2constructorimpl(path);
                    c2252611DEt.resumeWith(path);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C098200Yq c098200Yq = new C098200Yq(e);
                    C189200o6.m2constructorimpl(c098200Yq);
                    c2252611DEt.resumeWith(c098200Yq);
                }
            } else {
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
                c1331670kl3LJIIJ.LJJIJL(context);
                c1331670kl3LJIIJ.LJJII(new AbstractC468201s0() { // from class: X.01s7
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) throws Throwable {
                        if (bitmap == null) {
                            InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                            C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException("Bitmap is null"));
                            C189200o6.m2constructorimpl(c098200Yq2);
                            interfaceC20236714Gf.resumeWith(c098200Yq2);
                            return;
                        }
                        try {
                            Pair pairLIZ = C0HBT.LIZ();
                            int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
                            int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
                            int i2 = (int) (iIntValue * 0.8f);
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(356));
                            if (i2 > iLIZIZ) {
                                i2 = iLIZIZ;
                            }
                            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
                            if (i2 < iLIZIZ2) {
                                i2 = iLIZIZ2;
                            }
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i2, true);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCreateScaledBitmap, (iIntValue - bitmapCreateScaledBitmap.getWidth()) / 2.0f, ((iIntValue2 - bitmapCreateScaledBitmap.getHeight()) / 2.0f) + (iIntValue2 * 0.05f), (Paint) null);
                            C474201sy.LIZIZ(C474201sy.LIZ, bitmapCreateBitmap, path, Bitmap.CompressFormat.WEBP);
                            bitmapCreateScaledBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateScaledBitmap);
                            bitmapCreateBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                            InterfaceC20236714Gf<String> interfaceC20236714Gf2 = c2252611DEt;
                            String str2 = path;
                            C189200o6.m2constructorimpl(str2);
                            interfaceC20236714Gf2.resumeWith(str2);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            InterfaceC20236714Gf<String> interfaceC20236714Gf3 = c2252611DEt;
                            C098200Yq c098200Yq3 = new C098200Yq(new RuntimeException(e2.getMessage()));
                            C189200o6.m2constructorimpl(c098200Yq3);
                            interfaceC20236714Gf3.resumeWith(c098200Yq3);
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        String message;
                        InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Lighten loading image failed: ");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                        C189200o6.m2constructorimpl(c098200Yq2);
                        interfaceC20236714Gf.resumeWith(c098200Yq2);
                    }
                });
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2$imagePathDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2$imagePathDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
