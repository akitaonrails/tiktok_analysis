package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.typechunk.SceneryLayoutTypeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xQC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818460xQC extends C09AY implements Function1<C1735840vGw, Unit> {
    public final /* synthetic */ SceneryLayoutTypeViewModel LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818460xQC(SceneryLayoutTypeViewModel sceneryLayoutTypeViewModel, int i) {
        super(1);
        this.LL = sceneryLayoutTypeViewModel;
        this.LLILLJJLI = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C1735840vGw r10) {
        /*
            r9 = this;
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.typechunk.SceneryLayoutTypeViewModel r0 = r9.LL
            java.util.List r0 = r0.listGetAll()
            if (r0 == 0) goto Lb8
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.typechunk.SceneryLayoutTypeViewModel r6 = r9.LL
            int r5 = r9.LLILLJJLI
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r3 = r0.iterator()
        L15:
            boolean r0 = r3.hasNext()
            r4 = 1
            r7 = 0
            if (r0 == 0) goto L45
            java.lang.Object r2 = r3.next()
            X.0xQF r2 = (X.C1818490xQF) r2
            boolean r0 = r2.LLILLJJLI
            if (r0 == 0) goto L34
            int r1 = r2.LL
            if (r1 == r5) goto L34
            X.0xQF r0 = new X.0xQF
            r0.<init>(r1, r7)
            r8.add(r0)
            goto L15
        L34:
            int r1 = r2.LL
            if (r1 != r5) goto L41
            X.0xQF r0 = new X.0xQF
            r0.<init>(r1, r4)
            r8.add(r0)
            goto L15
        L41:
            r8.add(r2)
            goto L15
        L45:
            r6.listSetItems(r8)
            X.0qg8 r0 = r6.LL
            java.lang.Object r0 = r0.getValue()
            X.0xLT r0 = (X.C1815530xLT) r0
            com.bytedance.android.livesdk.model.BoardItem r2 = r0.LL
            r3 = 3
            if (r2 == 0) goto L68
            com.bytedance.android.livesdk.model.SceneryContent r1 = r2.sceneryContent
            if (r1 == 0) goto L63
            r1.sceneryType = r5
            if (r5 == r4) goto Lc1
            r0 = 2
            if (r5 == r0) goto Lc1
            r0 = 0
        L61:
            r1.imageTransition = r0
        L63:
            if (r5 != r3) goto L66
            r7 = 1
        L66:
            r2.matting = r7
        L68:
            X.0vGx r0 = new X.0vGx
            r0.<init>(r5)
            r6.setState(r0)
            java.lang.String r0 = "livesdk_decoration_scenery_layout_editing_page"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            X.0qg8 r0 = r6.LL
            java.lang.Object r0 = r0.getValue()
            X.0xLT r0 = (X.C1815530xLT) r0
            java.lang.String r1 = r0.LLILLL
            java.lang.String r0 = "decoration_entrance"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "click"
            r2.LJJII(r0, r1)
            java.lang.String r1 = "click_position"
            java.lang.String r0 = "layout"
            r2.LJJII(r0, r1)
            if (r5 == 0) goto Lbe
            if (r5 == r4) goto Lbb
            if (r5 != r3) goto Lbe
            java.lang.String r1 = "full_screen"
        Lb0:
            java.lang.String r0 = "clicked_layout"
            r2.LJJII(r1, r0)
            r2.LIZ()
        Lb8:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lbb:
            java.lang.String r1 = "top"
            goto Lb0
        Lbe:
            java.lang.String r1 = "cancel"
            goto Lb0
        Lc1:
            r0 = 4
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1818460xQC.invoke(java.lang.Object):java.lang.Object");
    }
}
