package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectUtil$initVM$5$1$2$1$1$1$1", f = "TakoMultipleSelectUtil.kt", l = {480}, m = "invokeSuspend")
public final class C1388440mEc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoLongImageSharePackage LLILLJJLI;
    public final /* synthetic */ DialogC1389620mGW LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Bitmap LLIZLLLIL;
    public final /* synthetic */ BaseSharePackage LLJ;
    public final /* synthetic */ TakoMultipleSelectVM LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388440mEc(TakoLongImageSharePackage takoLongImageSharePackage, DialogC1389620mGW dialogC1389620mGW, View view, Activity activity, Map<String, String> map, String str, Bitmap bitmap, BaseSharePackage baseSharePackage, TakoMultipleSelectVM takoMultipleSelectVM, InterfaceC1364105Vn<? super C1388440mEc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoLongImageSharePackage;
        this.LLILLL = dialogC1389620mGW;
        this.LLILZ = view;
        this.LLILZIL = activity;
        this.LLILZLL = map;
        this.LLIZ = str;
        this.LLIZLLLIL = bitmap;
        this.LLJ = baseSharePackage;
        this.LLJI = takoMultipleSelectVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1388440mEc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.Closeable, java.io.OutputStream] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:113:0x01cd
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1388440mEc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
