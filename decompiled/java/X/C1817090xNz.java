package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1817090xNz extends C2217421BqW implements Function0<Unit> {
    public C1817090xNz(DecorationEditNavigationViewModel decorationEditNavigationViewModel) {
        super(0, decorationEditNavigationViewModel, DecorationEditNavigationViewModel.class, "editDescriptionBoard", "editDescriptionBoard()V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r11 = this;
            java.lang.Object r6 = r11.receiver
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel r6 = (com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel) r6
            X.0uMa r0 = r6.wQ2()
            r7 = 0
            r10 = 7
            r9 = 4
            if (r0 == 0) goto L42
            com.bytedance.android.livesdk.model.Board r0 = r0.LIZIZ
            if (r0 == 0) goto L42
            java.util.List<com.bytedance.android.livesdk.model.BoardItem> r0 = r0.boardItemList
            if (r0 == 0) goto L42
            java.util.Iterator r1 = r0.iterator()
        L19:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r8 = r1.next()
            r0 = r8
            com.bytedance.android.livesdk.model.BoardItem r0 = (com.bytedance.android.livesdk.model.BoardItem) r0
            int r0 = r0.boardItemType
            if (r0 == r9) goto L2c
            if (r0 != r10) goto L19
        L2c:
            com.bytedance.android.livesdk.model.BoardItem r8 = (com.bytedance.android.livesdk.model.BoardItem) r8
            if (r8 == 0) goto L42
        L30:
            X.0xOb r1 = new X.0xOb
            r1.<init>(r8, r7)
            X.0c1Y r0 = new X.0c1Y
            r0.<init>(r1)
            r6.setState(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            r8 = 0
            goto L2c
        L42:
            com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsClickableBulletSetting r0 = com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsClickableBulletSetting.INSTANCE
            boolean r0 = r0.getValue()
            r3 = 33
            r1 = 66
            java.lang.String r5 = "#FF000000"
            if (r0 == 0) goto L6c
            com.bytedance.android.livesdk.model.BoardItem r8 = new com.bytedance.android.livesdk.model.BoardItem
            r8.<init>()
            r8.boardItemType = r10
            com.bytedance.android.livesdk.model.BoardItemStyle r0 = new com.bytedance.android.livesdk.model.BoardItemStyle
            r0.<init>()
            r0.colorTheme = r5
            r8.style = r0
            com.bytedance.android.livesdk.model.BoardItemPosition r0 = new com.bytedance.android.livesdk.model.BoardItemPosition
            r0.<init>()
            r0.percentageX = r1
            r0.percentageY = r3
            r8.canvasPosition = r0
            goto L30
        L6c:
            com.bytedance.android.livesdk.model.BoardItem r8 = new com.bytedance.android.livesdk.model.BoardItem
            r8.<init>()
            r8.boardItemType = r9
            com.bytedance.android.livesdk.model.BoardItemStyle r0 = new com.bytedance.android.livesdk.model.BoardItemStyle
            r0.<init>()
            r0.colorTheme = r5
            r8.style = r0
            com.bytedance.android.livesdk.model.BoardItemPosition r0 = new com.bytedance.android.livesdk.model.BoardItemPosition
            r0.<init>()
            r0.percentageX = r1
            r0.percentageY = r3
            r8.canvasPosition = r0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1817090xNz.invoke():java.lang.Object");
    }
}
