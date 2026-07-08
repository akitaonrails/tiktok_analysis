package X;

import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.view.View;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS96S1300000_14;
import mf.a;

/* JADX INFO: renamed from: X.0ZLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898310ZLx extends C898300ZLw {
    public Function2<? super View, ? super LightInteractionCommonResource, Unit> LLILZIL;
    public View.OnClickListener LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;

    public final TuxTextView getMessageBtn() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    @Override // X.C898300ZLw
    public final void LIZLLL() {
        super.LIZLLL();
        C337180DJs.LIZ(getMessageBtn());
    }

    public C898310ZLx(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS415S0200000_14(this, context, 122));
        View.OnClickListener aCListenerS149S0100000_14 = new ACListenerS149S0100000_14(this, 79);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS149S0100000_14) : aCListenerS149S0100000_14);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    @Override // X.C898300ZLw, android.view.View.OnClickListener
    public final void onClick(View view) {
        C898320ZLy lightInteractionEntryContext;
        LightInteractionEntryConf lightInteractionEntryConf;
        String interactionName;
        if ((!this.LLIZ || !C0OBG.LIZIZ(view)) && (lightInteractionEntryContext = getLightInteractionEntryContext()) != null && (lightInteractionEntryConf = lightInteractionEntryContext.LIZ) != null && (interactionName = lightInteractionEntryConf.getInteractionName()) != null) {
            InterfaceC892560Yzu reporter = getReporter();
            String str = "";
            if (reporter != null) {
                String str2 = lightInteractionEntryContext.LJFF.get("light_interaction_enter_from");
                if (str2 == null) {
                    str2 = lightInteractionEntryContext.LJFF.get("enter_from");
                }
                String str3 = lightInteractionEntryContext.LJFF.get("light_interaction_enter_method");
                if (str3 == null) {
                    str3 = lightInteractionEntryContext.LJFF.get("enter_method");
                }
                String str4 = lightInteractionEntryContext.LJFF.get("position");
                String str5 = lightInteractionEntryContext.LJFF.get("push_label");
                String strLIZJ = C898300ZLw.LIZJ(lightInteractionEntryContext);
                C898170ZLj c898170ZLj = C898170ZLj.LL;
                String interactionName2 = lightInteractionEntryContext.LIZ.getInteractionName();
                if (interactionName2 == null) {
                    interactionName2 = "";
                }
                reporter.LJ(str2, str3, str4, str5, strLIZJ, c898170ZLj.LJII(interactionName2));
            }
            C0ZM3.LLILLJJLI.LJIILLIIL(getContext());
            IRemindUsersViewHelper iRemindUsersViewHelperLJIJJLI = C1336205Ku.LIZ(false).getImChatService().LJIJJLI();
            Context context = getContext();
            String str6 = lightInteractionEntryContext.LJFF.get("enter_from");
            if (str6 != null) {
                str = str6;
            }
            iRemindUsersViewHelperLJIJJLI.LIZ(context, str, true, new AwS96S1300000_14(this, interactionName, lightInteractionEntryContext, view, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r3, java.lang.String r4, android.view.View.OnClickListener r5, kotlin.jvm.functions.Function2<? super android.view.View, ? super com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource, kotlin.Unit> r6) {
        /*
            r2 = this;
            if (r3 == 0) goto L41
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate r0 = r3.getUiTemplate()
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.rightSchemaUrl
            if (r0 != 0) goto Lf
        Lc:
            r3.getUiTemplate()
        Lf:
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate r0 = r3.getUiTemplate()
            if (r0 == 0) goto L41
            boolean r0 = r0.isNeedDoubleClickCheck()
        L19:
            r2.LLIZ = r0
            r2.LLILZIL = r6
            r2.LLILZLL = r5
            com.bytedance.tux.input.TuxTextView r0 = r2.getMessageBtn()
            X.C786410Ut5.h9(r0, r5)
            if (r3 == 0) goto L36
            int r0 = r3.getType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L38
        L36:
            java.lang.String r1 = ""
        L38:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C898170ZLj.LIZ(r0, r1, r4)
            return
        L41:
            r0 = 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C898310ZLx.LJ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage, java.lang.String, android.view.View$OnClickListener, kotlin.jvm.functions.Function2):void");
    }
}
