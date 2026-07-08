package X;

import Y.ACListenerS32S0100100_16;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0e87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076890e87 extends AbstractC1076940e8C {
    public Function1<? super Integer, Unit> LLJIJIL;
    public Function1<? super Integer, Unit> LLJILJIL;

    @Override // X.AbstractC1076940e8C
    public final void LIZIZ() {
        super.LIZIZ();
    }

    public C1076890e87(Context context) {
        super(context, null, 0);
        C786410Ut5.I7(new ACListenerS32S0100100_16(new AwS382S0200000_16(this, context, 97), 2), this);
        TuxTextView name = getName();
        if (name != null) {
            name.getPaint().setShader(new LinearGradient(0.0f, 0.0f, name.getPaint().measureText(name.getText().toString()), 0.0f, new int[]{ColorProtector.parseColor("#A180FF"), ColorProtector.parseColor("#D167FB")}, (float[]) null, Shader.TileMode.CLAMP));
            name.invalidate();
        }
    }

    public final void setOnClickListener(Function1<? super Integer, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setOnViewGoneListener(Function1<? super Integer, Unit> function1) {
        this.LLJILJIL = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.Class<com.ss.android.ugc.aweme.log.IAdChatAgentLogService> r1 = com.ss.android.ugc.aweme.log.IAdChatAgentLogService.class
            r2 = 0
            r5 = 14
            r6 = 0
            r3 = r2
            r4 = r2
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.log.IAdChatAgentLogService r2 = (com.ss.android.ugc.aweme.log.IAdChatAgentLogService) r2
            if (r2 == 0) goto L61
            r1 = 0
            if (r11 == 0) goto L66
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r11.getAwemeRawAd()
            if (r0 == 0) goto L66
            java.lang.String r3 = r0.getCreativeIdStr()
        L1d:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r11.getAwemeRawAd()
            if (r0 == 0) goto L27
            java.lang.String r6 = r0.getLogExtra()
        L27:
            java.lang.String r8 = X.C321640CjC.LIZJ
            com.bytedance.tux.input.TuxTextView r0 = r10.getName()
            if (r0 == 0) goto L33
            java.lang.CharSequence r1 = r0.getText()
        L33:
            java.lang.String r9 = java.lang.String.valueOf(r1)
            X.0e8B r0 = r10.getRenderData()
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.LIZJ
            if (r0 == 0) goto L64
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)
            if (r0 == 0) goto L64
            int r4 = r0.intValue()
        L4b:
            X.0e8B r0 = r10.getRenderData()
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.feed.model.CommerceAgentHint r0 = r0.LJI
            if (r0 == 0) goto L62
            java.lang.Integer r0 = r0.type
            if (r0 == 0) goto L62
            int r5 = r0.intValue()
        L5d:
            r7 = r12
            r2.LJIIJ(r3, r4, r5, r6, r7, r8, r9)
        L61:
            return
        L62:
            r5 = 0
            goto L5d
        L64:
            r4 = -1
            goto L4b
        L66:
            r3 = r6
            if (r11 == 0) goto L27
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1076890e87.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
