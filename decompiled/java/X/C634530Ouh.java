package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* JADX INFO: renamed from: X.0Ouh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C634530Ouh extends LinearLayout {
    public final C127K LL;
    public final View LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public final IAVPublishService LLILZIL;

    public C634530Ouh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setEnable(boolean z) {
    }

    public final CharSequence getSubtitle() {
        return this.LL.getSubtitle();
    }

    public final String getLabelText() {
        return this.LLILZ;
    }

    public final View getMRootView() {
        return this.LLILLJJLI;
    }

    public final C127K getTextCell() {
        return this.LL;
    }

    public final String getTitle() {
        return this.LLILLL;
    }

    public final void setLabelText(String str) {
        this.LLILZ = str;
        C11G4 c11g4 = (C11G4) this.LL.getAccessory();
        Objects.requireNonNull(c11g4);
        c11g4.LJIILJJIL(this.LLILZ);
    }

    public final void setLeftTuxIcon(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZ = i;
        this.LL.setIcon(c419910GdJ);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C11G4 c11g4 = new C11G4(getContext(), null);
        c11g4.LJIILL(onClickListener);
        this.LL.setAccessory(c11g4);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.LL.setSubtitle(charSequence);
    }

    public final void setTitle(int i) {
        this.LLILLL = getContext().getString(i);
        C444910HcX c444910HcX = new C444910HcX(this.LLILLL);
        c444910HcX.LIZ(42);
        this.LL.setTitle(c444910HcX);
    }

    public final void setTitle(String str) {
        this.LLILLL = str;
    }

    public C634530Ouh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLILZIL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        this.LLILLJJLI = C786410Ut5.Sd(R.layout.u_, C786410Ut5.ne(context), this);
        this.LL = (C127K) findViewById(R.id.xlf);
    }
}
