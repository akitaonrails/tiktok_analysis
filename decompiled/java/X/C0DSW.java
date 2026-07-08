package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS302S0300000_25;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.0DSW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DSW extends C09AY implements Function1<Context, C0DS9> {
    public final /* synthetic */ C05P0<C0DS9> LL;
    public final /* synthetic */ C05P0<Float> LLILLJJLI;
    public final /* synthetic */ C05P0<C0DSV> LLILLL;
    public final /* synthetic */ Map<String, C1680770tq7> LLILZ;
    public final /* synthetic */ TakoContentPreviewItem LLILZIL;
    public final /* synthetic */ C05UN LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DSW(C05P0<C0DS9> c05p0, C05P0<Float> c05p02, C05P0<C0DSV> c05p03, Map<String, C1680770tq7> map, TakoContentPreviewItem takoContentPreviewItem, C05UN c05un) {
        super(1);
        this.LL = c05p0;
        this.LLILLJJLI = c05p02;
        this.LLILLL = c05p03;
        this.LLILZ = map;
        this.LLILZIL = takoContentPreviewItem;
        this.LLILZLL = c05un;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0DS9 invoke(Context context) {
        C0DS9 c0ds9 = new C0DS9(C1385040m98.LIZ(context, true));
        C05P0<C0DS9> c05p0 = this.LL;
        C05P0<Float> c05p02 = this.LLILLJJLI;
        C05P0<C0DSV> c05p03 = this.LLILLL;
        Map<String, C1680770tq7> map = this.LLILZ;
        TakoContentPreviewItem takoContentPreviewItem = this.LLILZIL;
        C05UN c05un = this.LLILZLL;
        c05p0.setValue(c0ds9);
        c0ds9.setOnProgressUpdateListener(new AwS581S0100000_2((C05P0) c05p02, (C05P0<InterfaceC1692950u9l>) 330));
        c0ds9.setOnPlayResultListener(new AwS370S0200000_4(c05p03, c0ds9, 33));
        c0ds9.setOnVideoSizeChangedListener(new AwS302S0300000_25((Map) map, (Map<String, C1680770tq7>) takoContentPreviewItem, (TakoContentPreviewItem) c05un, (C05UN) 2));
        c0ds9.setVideoLoadingSuppressed(true);
        return c0ds9;
    }
}
