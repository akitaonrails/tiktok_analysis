package X;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DET, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public abstract class C0DET extends C19GS {
    public boolean LL;
    public long LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public int LLLLZI() {
        return R.style.zh;
    }

    public int LLLLZIL() {
        return 0;
    }

    public boolean LLLLZLLLI() {
        return this instanceof OrdersV2OrderDetailsActivity;
    }

    public final FrameLayout LLLLLZL() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setBackgroundColor(LLLLZLL(this.LL));
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        InterfaceC333090D3z interfaceC333090D3z;
        if (!this.LLILZ) {
            this.LLILZ = true;
            int iLLLLZIL = LLLLZIL();
            if (iLLLLZIL != 0 && (this instanceof InterfaceC333090D3z) && (interfaceC333090D3z = (InterfaceC333090D3z) this) != null) {
                C335000DBi c335000DBiG4 = interfaceC333090D3z.g4();
                if ((c335000DBiG4 instanceof InterfaceC335020DBk) && c335000DBiG4 != null) {
                    c335000DBiG4.LJJII(System.currentTimeMillis() - this.LLILLJJLI, iLLLLZIL, this.LLILLL, interfaceC333090D3z.ee());
                }
            }
        }
        super.onDestroy();
        Iterator it2 = ((ArrayList) C0DE0.LIZ).iterator();
        while (it2.hasNext()) {
            Reference reference = (Reference) it2.next();
            if (Intrinsics.LJFF(reference.get(), this) || reference.get() == null) {
                it2.remove();
            }
        }
        C0D83.LIZ.getClass();
        C0D83 value = C0D8H.LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy: ");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        value.d();
    }

    public int LLLLZLL(boolean z) {
        return C0DDG.LIZ(this, z);
    }

    public final void LLLLZLLIL(int i) {
        if (this.LLILLL == 0) {
            this.LLILLL = i;
        }
    }

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        super.attachBaseContext(context);
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            i18nManagerServiceApiLIZ.LIZIZ(this);
        }
    }

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            this.LLILZIL = true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C960203pA.LIZIZ(this)) {
            setTheme(LLLLZI());
            this.LL = true;
        }
        super.onCreate(bundle);
        ((ArrayList) C0DE0.LIZ).add(new WeakReference(this));
        C0D83.LIZ.getClass();
        C0D83 value = C0D8H.LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate: ");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        value.d();
        this.LLILLJJLI = System.currentTimeMillis();
        getOnBackPressedDispatcher().LIZ(this, new C346240Dhm(this, 3));
    }

    @Override // X.C19GS, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        if (LLLLZLLLI() && view != null) {
            FrameLayout frameLayoutLLLLLZL = LLLLLZL();
            if (view.getParent() instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
            }
            frameLayoutLLLLLZL.addView(view);
            super.setContentView(frameLayoutLLLLLZL);
            return;
        }
        super.setContentView(view);
    }

    @Override // X.C19GS, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        if (!LLLLZLLLI()) {
            super.setContentView(i);
            return;
        }
        FrameLayout frameLayoutLLLLLZL = LLLLLZL();
        C786410Ut5.Td(getLayoutInflater(), i, frameLayoutLLLLLZL, true);
        super.setContentView(frameLayoutLLLLLZL);
    }

    @Override // X.C19GS, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (LLLLZLLLI() && view != null) {
            FrameLayout frameLayoutLLLLLZL = LLLLLZL();
            frameLayoutLLLLLZL.addView(view);
            super.setContentView(frameLayoutLLLLLZL, layoutParams);
            return;
        }
        super.setContentView(view, layoutParams);
    }
}
