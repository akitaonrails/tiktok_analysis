package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.broadcast.setting.LiveCenterNativePageRenew;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1AHA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHA extends C1AHE {
    public String LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16FS LLILZIL;
    public final C16F5 LLILZLL;
    public Boolean LLIZ;
    public String LLIZLLLIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.16F5, android.widget.TextView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C1AHE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(int r15) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AHA.P5(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R5(boolean r8) {
        /*
            r7 = this;
            X.1AHD r0 = r7.LL
            boolean r0 = r0.LJII()
            if (r0 == 0) goto L84
            com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterGuideOpt r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterGuideOpt.INSTANCE
            boolean r0 = r0.showOverviewNow()
            if (r0 != 0) goto L84
            r0 = 1
        L11:
            java.lang.String r4 = "random"
            r3 = 0
            if (r0 == 0) goto L51
            java.lang.String r5 = "null_3min"
        L18:
            java.lang.String r2 = "random_tip_key"
            java.lang.String r6 = "tip_type"
            if (r8 == 0) goto L86
            java.lang.String r0 = r7.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L50
            java.lang.String r0 = "livesdk_live_center_tip_show"
            X.0IjA r1 = X.C0IJT.LIZ(r0)
            r1.LJJII(r5, r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r4)
            if (r0 == 0) goto L44
            tikcast.api.anchor_data.RealtimeLiveCenterDetailData r0 = r7.L5()
            if (r0 == 0) goto L41
            webcast.data.RealtimeLiveCenterTips r0 = r0.tipsInfo
            if (r0 == 0) goto L41
            java.lang.String r3 = r0.randomTipKey
        L41:
            r1.LJJII(r3, r2)
        L44:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.getDataChannel()
            r1.LJIJJLI(r0)
            r1.LIZ()
            r7.LLILLJJLI = r5
        L50:
            return
        L51:
            tikcast.api.anchor_data.RealtimeLiveCenterDetailData r0 = r7.L5()
            if (r0 == 0) goto L82
            webcast.data.RealtimeLiveCenterTips r0 = r0.tipsInfo
            if (r0 == 0) goto L82
            long r1 = r0.tipType
            int r0 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L82
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L6e
            java.lang.String r5 = "viewer_70%"
            goto L18
        L6e:
            int r1 = r2.intValue()
            r0 = 4
            if (r1 != r0) goto L78
            java.lang.String r5 = "income_70%"
            goto L18
        L78:
            int r1 = r2.intValue()
            r0 = 5
            if (r1 != r0) goto L82
            java.lang.String r5 = "excellent"
            goto L18
        L82:
            r5 = r4
            goto L18
        L84:
            r0 = 0
            goto L11
        L86:
            java.lang.String r0 = "livesdk_realtime_live_center_tip_click"
            X.0IjA r1 = X.C0IJT.LIZ(r0)
            r1.LJJII(r5, r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r4)
            if (r0 == 0) goto La4
            tikcast.api.anchor_data.RealtimeLiveCenterDetailData r0 = r7.L5()
            if (r0 == 0) goto La1
            webcast.data.RealtimeLiveCenterTips r0 = r0.tipsInfo
            if (r0 == 0) goto La1
            java.lang.String r3 = r0.randomTipKey
        La1:
            r1.LJJII(r3, r2)
        La4:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.getDataChannel()
            r1.LJIJJLI(r0)
            r1.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AHA.R5(boolean):void");
    }

    public C1AHA(View view, C1AHD c1ahd) {
        super(view, c1ahd);
        this.LLILLJJLI = "";
        this.LLILLL = (C16F5) view.findViewById(R.id.xze);
        this.LLILZ = (C16F5) view.findViewById(R.id.xz4);
        this.LLILZIL = (C16FS) view.findViewById(R.id.xe8);
        this.LLILZLL = (C16F5) view.findViewById(R.id.fao);
        if (!LiveCenterNativePageRenew.INSTANCE.isEnable()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = (int) C497740JfY.LIZIZ(16.0f);
            marginLayoutParams.rightMargin = (int) C497740JfY.LIZIZ(16.0f);
            marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(20.0f);
            C786410Ut5.W5(view, marginLayoutParams);
        }
        N5();
    }
}
