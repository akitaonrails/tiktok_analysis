package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS132S0400000_3;
import kotlin.jvm.internal.AwS404S0200000_3;
import njp.a;

/* JADX INFO: renamed from: X.09Hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.resize.StickerBitmapResizeHelperKt$resizeStickerImgAsync$1", f = "StickerBitmapResizeHelper.kt", l = {}, m = "invokeSuspend")
public final class C2347909Hx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1621190sI1> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C259800zU<int[]> LLILLL;
    public final /* synthetic */ C21356918hz LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ List<VEFrame> LLILZLL;
    public final /* synthetic */ Function2<C09I6, List<? extends VEFrame>, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2347909Hx(List<C1621190sI1> list, boolean z, C259800zU<int[]> c259800zU, C21356918hz c21356918hz, Context context, List<VEFrame> list2, Function2<? super C09I6, ? super List<? extends VEFrame>, Unit> function2, InterfaceC1364105Vn<? super C2347909Hx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = c259800zU;
        this.LLILZ = c21356918hz;
        this.LLILZIL = context;
        this.LLILZLL = list2;
        this.LLIZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2347909Hx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [T, int[]] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Context context;
        Bitmap bitmapLJI;
        C1C7U.LIZ("StickerBitmapResizeHelperKt@959a.resizeStickerImgAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1621190sI1> list = this.LL;
        boolean z = this.LLILLJJLI;
        C259800zU<int[]> c259800zU = this.LLILLL;
        C21356918hz c21356918hz = this.LLILZ;
        Context context2 = this.LLILZIL;
        List<VEFrame> list2 = this.LLILZLL;
        Function2<C09I6, List<? extends VEFrame>, Unit> function2 = this.LLIZ;
        try {
            C118300cf c118300cf = new C118300cf();
            int i = 0;
            for (C1621190sI1 c1621190sI1 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1621190sI1 c1621190sI12 = c1621190sI1;
                    if (z) {
                        int defaultHeight = c21356918hz.LJ.getPl().getDefaultHeight();
                        int defaultWidth = c21356918hz.LJ.getPl().getDefaultWidth();
                        String str = c1621190sI12.LIZ;
                        int[] iArr = c259800zU.element;
                        context = context2;
                        C2347809Hw.LIZ(true, defaultHeight, defaultWidth, context2, str, iArr);
                        c259800zU.element = iArr;
                    } else {
                        z = false;
                        context = context2;
                    }
                    String str2 = c1621190sI12.LIZ;
                    int[] iArr2 = c259800zU.element;
                    int i3 = iArr2[0];
                    int i4 = iArr2[1];
                    if (C2286708xd.LIZJ(str2) && (bitmapLJI = C2475309mx.LJI(i3, i4, C13W4.LIZ(str2), 4, str2)) != null) {
                        VEFrame vEFrameLIZJ = C2347809Hw.LIZJ(bitmapLJI);
                        if (vEFrameLIZJ != null) {
                            list2.set(i, vEFrameLIZJ);
                        }
                        c118300cf.element++;
                    }
                    i = i2;
                    context2 = context;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C0CNO.LIZLLL(0L, new AwS132S0400000_3((List) list, (List<C1621190sI1>) c118300cf, (C118300cf) function2, (Function2<? super C09I6, ? super List<? extends VEFrame>, Unit>) list2, (List<VEFrame>) 1));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function2<C09I6, List<? extends VEFrame>, Unit> function22 = this.LLIZ;
        List<VEFrame> list3 = this.LLILZLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C0CNO.LIZLLL(0L, new AwS404S0200000_3((Function2) function22, (Function2<? super C09I6, ? super List<? extends VEFrame>, Unit>) list3, (List<VEFrame>) 63));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerBitmapResizeHelperKt@959a.resizeStickerImgAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
