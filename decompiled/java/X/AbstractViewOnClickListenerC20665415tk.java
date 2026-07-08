package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import mf.a;

/* JADX INFO: renamed from: X.15tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractViewOnClickListenerC20665415tk extends FrameLayout implements View.OnClickListener, C0Z9I {
    public InnerPushUITemplate LL;
    public InterfaceC20663615tS LLILLJJLI;
    public InnerPushMessage LLILLL;

    public boolean LJ(int i, View view) {
        return false;
    }

    public void LJFF() {
    }

    public final InnerPushMessage getCurMsg() {
        return this.LLILLL;
    }

    public final InterfaceC20663615tS getPopupWindowRef() {
        return this.LLILLJJLI;
    }

    public final InnerPushUITemplate getTemplatePushMsg() {
        return this.LL;
    }

    public void LIZLLL(InnerPushMessage innerPushMessage) {
        View.OnClickListener fVar;
        this.LL = innerPushMessage.getUiTemplate();
        this.LLILLL = innerPushMessage;
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            boolean r0 = X.C0OBG.LIZIZ(r6)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r0 = r5.LLILLL
            if (r0 == 0) goto L19
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate r0 = r0.getUiTemplate()
            if (r0 == 0) goto L19
            boolean r0 = r0.isNeedDoubleClickCheck()
            if (r0 != r2) goto L19
            return
        L19:
            if (r6 == 0) goto L50
            boolean r0 = r6 instanceof X.C20666315tt
            if (r0 == 0) goto L34
            r4 = 1
        L20:
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r1 = r5.LLILLL
            if (r1 == 0) goto L63
            int r0 = X.C20642815q6.LIZ
            int r0 = r1.getType()
            X.C20642815q6.LIZIZ(r0, r1, r4)
            boolean r0 = r5.LJ(r4, r6)
            if (r0 == 0) goto L52
            return
        L34:
            boolean r0 = r6 instanceof X.C20665915tp
            if (r0 != 0) goto L4e
            boolean r0 = r6 instanceof X.C19231910Lt
            if (r0 != 0) goto L4e
            boolean r0 = r6 instanceof X.C20665815to
            if (r0 == 0) goto L42
            r4 = 4
            goto L20
        L42:
            boolean r0 = r6 instanceof X.C20665515tl
            if (r0 == 0) goto L48
            r4 = 5
            goto L20
        L48:
            boolean r0 = r6 instanceof X.C20665715tn
            if (r0 == 0) goto L50
            r4 = 2
            goto L20
        L4e:
            r4 = 3
            goto L20
        L50:
            r4 = 0
            goto L20
        L52:
            int r0 = r1.getType()
            X.10jy r0 = X.C20641815pw.LIZ(r0)
            if (r0 == 0) goto L63
            boolean r0 = r0.LIZ(r3, r1)
            if (r0 != r2) goto L63
            return
        L63:
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate r0 = r5.LL
            if (r0 == 0) goto L70
            java.lang.String r1 = r0.globalSchemaUrl
            if (r1 == 0) goto L70
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r0 = r5.LLILLL
            r5.LIZ(r4, r0, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractViewOnClickListenerC20665415tk.onClick(android.view.View):void");
    }

    public final void setCurMsg(InnerPushMessage innerPushMessage) {
        this.LLILLL = innerPushMessage;
    }

    public final void setPopupWindowRef(InterfaceC20663615tS interfaceC20663615tS) {
        this.LLILLJJLI = interfaceC20663615tS;
    }

    public final void setTemplatePushMsg(InnerPushUITemplate innerPushUITemplate) {
        this.LL = innerPushUITemplate;
    }

    public AbstractViewOnClickListenerC20665415tk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // X.C0Z9I
    public final void LIZ(int i, InnerPushMessage innerPushMessage, String str) {
        C10M5 c10m5 = C10M5.LIZ;
        Context context = getContext();
        InterfaceC20663615tS interfaceC20663615tS = this.LLILLJJLI;
        c10m5.getClass();
        C10M5.LIZ(str, context, interfaceC20663615tS, i, innerPushMessage);
    }
}
