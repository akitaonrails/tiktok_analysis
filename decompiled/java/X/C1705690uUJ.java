package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0uUJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.batch.BoardBatchRenderCoordinator", f = "BoardBatchRenderCoordinator.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "awaitInOrder")
public final class C1705690uUJ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1705700uUK LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705690uUJ(C1705700uUK c1705700uUK, InterfaceC1364105Vn<? super C1705690uUJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1705700uUK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$1");
        return objLIZ;
    }
}
