package X;

import X.AbstractC1760900vvM;
import X.C2188811AlT;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1760900vvM {
    public final C19EG LL;
    public final Fragment LLILLJJLI;
    public EnumC1760910vvN LLILLL;
    public Uri LLILZ;
    public Uri LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;

    public AbstractC1760900vvM() {
        this(null, null, 3);
    }

    public final AbstractC1743840vTq LIZ() {
        return (AbstractC1743840vTq) this.LLIZLLLIL.getValue();
    }

    public void LIZIZ(Function0<Unit> function0) {
        int i = C1760920vvO.LIZ[this.LLILLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                function0.invoke();
                return;
            } else {
                function0.invoke();
                return;
            }
        }
        AbstractC1743840vTq abstractC1743840vTqLIZ = LIZ();
        if (abstractC1743840vTqLIZ != null && abstractC1743840vTqLIZ.LIZ()) {
            return;
        }
        function0.invoke();
    }

    public final void LIZJ(Activity activity, Bundle bundle) {
        boolean z;
        AbstractC1743840vTq abstractC1743840vTqLIZ;
        if (bundle != null) {
            z = bundle.getBoolean("tiktokec_fallback_is_reconstructed");
        } else {
            z = false;
        }
        this.LLIZ = z;
        if (C1760920vvO.LIZ[this.LLILLL.ordinal()] == 1 && (abstractC1743840vTqLIZ = LIZ()) != null) {
            abstractC1743840vTqLIZ.LIZIZ(activity, bundle);
        }
    }

    public final void LIZLLL(Activity activity, Bundle bundle) {
        AbstractC1743840vTq abstractC1743840vTqLIZ;
        if (bundle != null) {
            bundle.putBoolean("tiktokec_fallback_is_reconstructed", true);
        }
        if (C1760920vvO.LIZ[this.LLILLL.ordinal()] == 1 && (abstractC1743840vTqLIZ = LIZ()) != null) {
            abstractC1743840vTqLIZ.LIZJ(activity, bundle);
        }
    }

    public AbstractC1760900vvM(C19EG c19eg, Fragment fragment, int i) {
        c19eg = (i & 1) != 0 ? null : c19eg;
        fragment = (i & 2) != 0 ? null : fragment;
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
        this.LLILLL = EnumC1760910vvN.UNKNOWN;
        this.LLILZLL = true;
        GenericLifecycleObserver genericLifecycleObserver = new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws JSONException {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestory();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestory() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                AbstractC1760900vvM abstractC1760900vvM = this.LL;
                jSONObject.put("tiktokec_fallback_is_reconstructed", abstractC1760900vvM.LLIZ ? 1 : 0);
                jSONObject.put("tiktokec_fallback_type", abstractC1760900vvM.LLILLL.toString());
                Uri uri = abstractC1760900vvM.LLILZ;
                if (uri != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(uri.getScheme());
                    sbLIZ.append("://");
                    sbLIZ.append(uri.getAuthority());
                    sbLIZ.append(uri.getPath());
                    jSONObject.put("tiktokec_fallback_scheme", C2188811AlT.LIZIZ(sbLIZ));
                }
                ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).postEvent("rd_tiktokec_fallback_reconstructed", jSONObject);
            }
        };
        if (c19eg == null) {
            if (fragment == null) {
                throw new RuntimeException("At least one of theContext or theFragment should be initialized");
            }
        } else {
            Lifecycle lifecycle = c19eg.getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(genericLifecycleObserver);
            } else if (fragment != null) {
            }
            this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 647));
        }
        Lifecycle lifecycle2 = fragment.getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.addObserver(genericLifecycleObserver);
        }
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 647));
    }
}
