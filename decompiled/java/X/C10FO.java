package X;

import Y.ACListenerS130S0200000_28;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.optimization.InjectLayoutInflater;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* JADX INFO: renamed from: X.10FO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C10FO extends LinearLayout {
    public final C127K LL;
    public final View LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;

    public C127K getTextCell() {
        return this.LL;
    }

    public void setEnable(boolean z) {
        this.LLILZLL = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.LL.setCellEnabled(z);
    }

    public void setLabelText(int i) {
        this.LLILZIL = getContext().getString(i);
        C11G4 c11g4 = (C11G4) this.LL.getAccessory();
        Objects.requireNonNull(c11g4);
        c11g4.LJIILJJIL(this.LLILZIL);
    }

    public void setLabelTextVisibility(int i) {
        if (i == 0) {
            C11G4 c11g4 = (C11G4) this.LL.getAccessory();
            Objects.requireNonNull(c11g4);
            c11g4.LJIILJJIL(this.LLILZIL);
        } else {
            C11G4 c11g42 = (C11G4) this.LL.getAccessory();
            Objects.requireNonNull(c11g42);
            c11g42.LJIILJJIL("");
        }
    }

    public void setLeftTuxIcon(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        this.LL.setIcon(c419910GdJ);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        ACListenerS130S0200000_28 aCListenerS130S0200000_28 = new ACListenerS130S0200000_28(onClickListener, this, 41);
        C11G4 c11g4 = (C11G4) this.LL.getAccessory();
        Objects.requireNonNull(c11g4);
        c11g4.LJIILL(aCListenerS130S0200000_28);
    }

    public void setSubtitle(int i) {
        String string = getContext().getString(i);
        this.LLILZ = string;
        this.LL.setSubtitle(string);
    }

    public void setSubtitleVisibility(int i) {
        if (i == 0) {
            this.LL.setSubtitle(this.LLILZ);
        } else {
            this.LL.setSubtitle(null);
        }
    }

    public void setTitle(int i) {
        String string = getContext().getString(i);
        this.LLILLL = string;
        this.LL.setTitle(string);
    }

    public void setLabelText(String str) {
        this.LLILZIL = str;
        C11G4 c11g4 = (C11G4) this.LL.getAccessory();
        Objects.requireNonNull(c11g4);
        c11g4.LJIILJJIL(this.LLILZIL);
    }

    public void setSubtitle(String str) {
        this.LLILZ = str;
        this.LL.setSubtitle(str);
    }

    public void setTitle(String str) {
        this.LLILLL = str;
        this.LL.setTitle(str);
    }

    public C10FO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = true;
        InjectLayoutInflater injectLayoutInflaterCreateInjectLayoutInflater = ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).createInjectLayoutInflater();
        if (injectLayoutInflaterCreateInjectLayoutInflater.isInjectionEnabled()) {
            injectLayoutInflaterCreateInjectLayoutInflater.setTag("PublishSettingItem#publish_item_publish_setting_tux");
            this.LLILLJJLI = injectLayoutInflaterCreateInjectLayoutInflater.inflate(context, R.layout.ek4, this, true);
        } else {
            this.LLILLJJLI = C786410Ut5.Sd(R.layout.ek4, C786410Ut5.ne(context).cloneInContext(context), this);
        }
        this.LL = (C127K) findViewById(R.id.xlf);
    }
}
