package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ps0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528180ps0 extends TuxTextView {
    public boolean LLJJJJ;
    public InterfaceC497601wk LLJJJJJIL;

    public final boolean getNeedTranslate() {
        return this.LLJJJJ;
    }

    public final InterfaceC497601wk getScope() {
        return this.LLJJJJJIL;
    }

    public final void setNeedTranslate(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setScope(InterfaceC497601wk interfaceC497601wk) {
        this.LLJJJJJIL = interfaceC497601wk;
    }

    public C1528180ps0(Context context, AttributeSet attributeSet) {
        InterfaceC497601wk interfaceC497601wkLIZ;
        super(context, attributeSet, 0);
        if (C7879035x.LIZLLL() || C7879035x.LJ()) {
            ((IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class)).LJII();
        }
        this.LLJJJJ = false;
        if (C1388190mED.LIZIZ(context) != null) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                interfaceC497601wkLIZ = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ);
            } else {
                interfaceC497601wkLIZ = null;
            }
        } else {
            interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        }
        this.LLJJJJJIL = interfaceC497601wkLIZ;
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.LLJJJJ && charSequence != null && !a0.LJJJIL(charSequence)) {
            InterfaceC497601wk interfaceC497601wk = this.LLJJJJJIL;
            if (interfaceC497601wk != null) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1528140prw(bufferType, this, charSequence, null), 3);
                return;
            }
            return;
        }
        super.setText(charSequence, bufferType);
    }
}
