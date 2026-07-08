package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817460xOa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DecorationEditNavigationViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817460xOa(DecorationEditNavigationViewModel decorationEditNavigationViewModel) {
        super(0);
        this.LL = decorationEditNavigationViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r6 = this;
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel r5 = r6.LL
            X.0uMa r0 = r5.wQ2()
            r4 = 0
            r3 = 6
            if (r0 == 0) goto L3d
            com.bytedance.android.livesdk.model.Board r0 = r0.LIZIZ
            if (r0 == 0) goto L3d
            java.util.List<com.bytedance.android.livesdk.model.BoardItem> r0 = r0.boardItemList
            if (r0 == 0) goto L3d
            java.util.Iterator r1 = r0.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.bytedance.android.livesdk.model.BoardItem r0 = (com.bytedance.android.livesdk.model.BoardItem) r0
            int r0 = r0.boardItemType
            if (r0 != r3) goto L16
        L27:
            com.bytedance.android.livesdk.model.BoardItem r2 = (com.bytedance.android.livesdk.model.BoardItem) r2
            if (r2 == 0) goto L3d
        L2b:
            X.0xOc r1 = new X.0xOc
            r1.<init>(r2)
            X.0c1Y r0 = new X.0c1Y
            r0.<init>(r1)
            r5.setState(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3b:
            r2 = 0
            goto L27
        L3d:
            com.bytedance.android.livesdk.model.BoardItem r2 = new com.bytedance.android.livesdk.model.BoardItem
            r2.<init>()
            r2.boardItemType = r3
            r2.matting = r4
            com.bytedance.android.livesdk.model.SceneryContent r1 = new com.bytedance.android.livesdk.model.SceneryContent
            r1.<init>()
            com.bytedance.android.livesdk.model.ImageContent r0 = new com.bytedance.android.livesdk.model.ImageContent
            r0.<init>()
            r1.imageContent = r0
            r2.sceneryContent = r1
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1817460xOa.invoke():java.lang.Object");
    }
}
