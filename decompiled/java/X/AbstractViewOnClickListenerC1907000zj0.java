package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;

/* JADX INFO: renamed from: X.0zj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractViewOnClickListenerC1907000zj0 extends FrameLayout implements View.OnClickListener {
    public GeneralTemplateNotice LL;
    public MusNotice LLILLJJLI;
    public InterfaceC1907020zj2 LLILLL;
    public C1905130zfz LLILZ;
    public C1905050zfr LLILZIL;
    public C1242270iQr LLILZLL;

    public abstract String LIZJ(View view);

    public abstract boolean LIZLLL(View view);

    public abstract EnumC1907390zjd getTemplatePosition();

    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle getExtraParam() {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractViewOnClickListenerC1907000zj0.getExtraParam():android.os.Bundle");
    }

    public final C1905130zfz getExpandAbility() {
        return this.LLILZ;
    }

    public final MusNotice getMBaseNotice() {
        return this.LLILLJJLI;
    }

    public final InterfaceC1907020zj2 getMBridge() {
        return this.LLILLL;
    }

    public final C1242270iQr getSearchTemplateInfo() {
        return this.LLILZLL;
    }

    public final GeneralTemplateNotice getTemplateNotice() {
        return this.LL;
    }

    public final C1905050zfr getViewHolderConfig() {
        return this.LLILZIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00af, code lost:
    
        if (r7 != null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractViewOnClickListenerC1907000zj0.onClick(android.view.View):void");
    }

    public final void setExpandAbility(C1905130zfz c1905130zfz) {
        this.LLILZ = c1905130zfz;
    }

    public final void setMBaseNotice(MusNotice musNotice) {
        this.LLILLJJLI = musNotice;
    }

    public final void setMBridge(InterfaceC1907020zj2 interfaceC1907020zj2) {
        this.LLILLL = interfaceC1907020zj2;
    }

    public final void setSearchTemplateInfo(C1242270iQr c1242270iQr) {
        this.LLILZLL = c1242270iQr;
    }

    public final void setTemplateNotice(GeneralTemplateNotice generalTemplateNotice) {
        this.LL = generalTemplateNotice;
    }

    public final void setViewHolderConfig(C1905050zfr c1905050zfr) {
        this.LLILZIL = c1905050zfr;
    }

    public final void LIZIZ(View.OnClickListener onClickListener, View view) {
        View.OnLongClickListener onLongClickListenerC2;
        if (view != null) {
            C786410Ut5.I7(onClickListener, view);
            InterfaceC1907020zj2 interfaceC1907020zj2 = this.LLILLL;
            if (interfaceC1907020zj2 != null && (onLongClickListenerC2 = interfaceC1907020zj2.c2()) != null) {
                view.setOnLongClickListener(onLongClickListenerC2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.EnumC1905950zhJ r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractViewOnClickListenerC1907000zj0.LJ(X.0zhJ, java.lang.String):void");
    }

    public AbstractViewOnClickListenerC1907000zj0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void LIZ(MusNotice musNotice, InterfaceC1907020zj2 interfaceC1907020zj2, C1242270iQr c1242270iQr) {
        C1905130zfz c1905130zfzS0;
        this.LLILLJJLI = musNotice;
        this.LL = musNotice.templateNotice;
        this.LLILLL = interfaceC1907020zj2;
        C1905050zfr c1905050zfr = null;
        if (interfaceC1907020zj2 != null) {
            c1905130zfzS0 = interfaceC1907020zj2.S0();
        } else {
            c1905130zfzS0 = null;
        }
        this.LLILZ = c1905130zfzS0;
        if (c1905130zfzS0 != null) {
            c1905050zfr = c1905130zfzS0.LIZIZ;
        }
        this.LLILZIL = c1905050zfr;
        this.LLILZLL = c1242270iQr;
    }
}
