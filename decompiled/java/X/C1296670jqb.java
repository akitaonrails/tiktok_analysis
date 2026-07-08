package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0jqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
public final class C1296670jqb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1294720jnS LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296670jqb(Context context, C1294720jnS c1294720jnS, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1294720jnS;
        this.LLILLJJLI = context;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1296670jqb(this.LLILLJJLI, this.LL, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RememberLottieCompositionKt@1ea3.loadImagesFromAssets$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C1294320jmo c1294320jmo : this.LL.LIZLLL.values()) {
            if (c1294320jmo.LJFF == null) {
                String str = c1294320jmo.LIZLLL;
                if (u.LJJIIJZLJL(str, "data:", false) && a0.LJJJ(str, "base64,", 0, false, 6) > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str.substring(a0.LJJIZ(str, ',', 0, false, 6) + 1), 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        c1294320jmo.LJFF = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1292050jj9.LIZJ("data URL did not have correct base64 format.", e);
                    }
                }
            }
            Context context = this.LLILLJJLI;
            String str2 = this.LLILLL;
            if (c1294320jmo.LJFF == null && str2 != null) {
                String str3 = c1294320jmo.LIZLLL;
                try {
                    AssetManager assets = context.getAssets();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(str3);
                    InputStream inputStreamOpen = assets.open(C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        c1294320jmo.LJFF = C1294350jmr.LJFF(c1294320jmo.LIZ, c1294320jmo.LIZIZ, BitmapFactory.decodeStream(inputStreamOpen, null, options2));
                    } catch (IllegalArgumentException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1292050jj9.LIZJ("Unable to decode image.", e2);
                    }
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C1292050jj9.LIZJ("Unable to open asset.", e3);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RememberLottieCompositionKt@1ea3.loadImagesFromAssets$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
