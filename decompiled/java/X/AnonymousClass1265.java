package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1265, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectEditText$initBgRes$2", f = "EffectEditText.kt", l = {240}, m = "invokeSuspend")
public final class AnonymousClass1265 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InnerEffectTextConfig LLILLJJLI;
    public final /* synthetic */ C12K3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1265(InnerEffectTextConfig innerEffectTextConfig, C12K3 c12k3, InterfaceC1364105Vn<? super AnonymousClass1265> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = innerEffectTextConfig;
        this.LLILLL = c12k3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass1265(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<InnerEffectTextBgConfig> bgConfigs;
        Bitmap bitmapDecodeFile;
        NinePatch ninePatch;
        C1C7U.LIZ("EffectEditText@7b22.initBgRes$2");
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
            ArrayList arrayList = new ArrayList();
            InnerEffectTextConfig innerEffectTextConfig = this.LLILLJJLI;
            if (innerEffectTextConfig != null && (bgConfigs = innerEffectTextConfig.getBgConfigs()) != null) {
                for (InnerEffectTextBgConfig innerEffectTextBgConfig : bgConfigs) {
                    try {
                        bitmapDecodeFile = BitmapFactory.decodeFile(innerEffectTextBgConfig.getBgName());
                        try {
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            C122D c122dLIZIZ = C123O.LIZIZ();
                            if (c122dLIZIZ != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("EffectEditText");
                                sbLIZ.append(Log.getStackTraceString(e));
                                c122dLIZIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bitmapDecodeFile = null;
                    }
                    if (innerEffectTextBgConfig.isNinePatch()) {
                        AnonymousClass1267 anonymousClass1267 = new AnonymousClass1267();
                        anonymousClass1267.LIZLLL = new int[0];
                        anonymousClass1267.LIZJ = new Rect();
                        anonymousClass1267.LIZIZ = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        anonymousClass1267.LIZ = arrayList2;
                        arrayList2.addAll(innerEffectTextBgConfig.getNinePatchInfo().getDivX());
                        anonymousClass1267.LIZIZ.addAll(innerEffectTextBgConfig.getNinePatchInfo().getDivY());
                        anonymousClass1267.LIZJ = new Rect(innerEffectTextBgConfig.getNinePatchInfo().getPaddingLeft(), innerEffectTextBgConfig.getNinePatchInfo().getPaddingTop(), innerEffectTextBgConfig.getNinePatchInfo().getPaddingRight(), innerEffectTextBgConfig.getNinePatchInfo().getPaddingBottom());
                        int[] iArr = new int[((ArrayList) AnonymousClass1266.LIZ(bitmapDecodeFile.getWidth(), anonymousClass1267.LIZ)).size() * ((ArrayList) AnonymousClass1266.LIZ(bitmapDecodeFile.getHeight(), anonymousClass1267.LIZIZ)).size()];
                        Arrays.fill(iArr, 1);
                        anonymousClass1267.LIZLLL = iArr;
                        ninePatch = new NinePatch(bitmapDecodeFile, anonymousClass1267.LIZ(), null);
                    } else {
                        ninePatch = null;
                    }
                    if (bitmapDecodeFile != null) {
                        arrayList.add(new C1644460stY(innerEffectTextBgConfig, bitmapDecodeFile, ninePatch, new Rect()));
                    }
                }
            }
            C2238608ps c2238608ps = C2108108Nr.LIZ;
            C858960Xmo c858960Xmo = new C858960Xmo(this.LLILLJJLI, this.LLILLL, arrayList, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c858960Xmo) == objLJFF) {
                C1C7U.LIZIZ("EffectEditText@7b22.initBgRes$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditText@7b22.initBgRes$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
