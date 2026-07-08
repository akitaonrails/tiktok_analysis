package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180831AWr extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Rect LLILLJJLI;
    public final /* synthetic */ C1AXM LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ViewGroup LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180831AWr(String str, Rect rect, C1AXM c1axm, float f, boolean z, ViewGroup viewGroup, boolean z2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = rect;
        this.LLILLL = c1axm;
        this.LLILZ = f;
        this.LLILZIL = z;
        this.LLILZLL = viewGroup;
        this.LLIZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setParentWithOutVideoSize, afterDefaultParentRect, source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", originalLocationRect=");
        sbLIZ.append(rect);
        sbLIZ.append(", defaultParentRect=");
        sbLIZ.append(this.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("LayoutFirstFrameOptLog", strLIZIZ, null, null);
        if (!Intrinsics.LJFF(rect, this.LLILLJJLI)) {
            c1azw.getClass();
            C1AZW.LIZ("LayoutFirstFrameOptLog", "setParentWithOutVideoSize, defaultParentRect != originalLocationRect", null, null);
            Rect rectLJJIFFI = this.LLILLL.LJJIFFI(rect, this.LLILZ);
            this.LLILLL.LLJIJIL(this.LLILZIL, this.LLILZLL, this.LLIZ, rectLJJIFFI, rectLJJIFFI.width(), rectLJJIFFI.height(), true);
        }
        return Unit.LIZ;
    }
}
