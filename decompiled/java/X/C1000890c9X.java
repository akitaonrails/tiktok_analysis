package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c9X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000890c9X implements InterfaceC1051190dSf {
    public final int LL;
    public boolean LLILLJJLI;
    public View LLILLL;
    public String LLILZ = "";
    public final AbstractC1028360crq LLILZIL;
    public int LLILZLL;

    public final void LIZ() throws JSONException {
        AbstractC1028360crq abstractC1028360crq;
        if (this.LLILLL == null || (abstractC1028360crq = this.LLILZIL) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("activeIndex", this.LLILZLL);
        jSONObject.put("containerKey", this.LL);
        abstractC1028360crq.LJIIJJI("onHide", jSONObject);
    }

    @Override // X.InterfaceC1051190dSf
    public final void A9(C1014910cW9 c1014910cW9) {
        this.LLILLJJLI = true;
        this.LLILLL = c1014910cW9.LIZ;
    }

    public final void LIZIZ(int i, FrameLayout frameLayout) throws JSONException {
        View view = this.LLILLL;
        if (view == null) {
            return;
        }
        if (!Intrinsics.LJFF(view.getParent(), frameLayout)) {
            LIZJ(i, frameLayout);
        }
        AbstractC1028360crq abstractC1028360crq = this.LLILZIL;
        if (abstractC1028360crq != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activeIndex", this.LLILZLL);
            jSONObject.put("containerKey", this.LL);
            abstractC1028360crq.LJIIJJI("onShow", jSONObject);
        }
    }

    public final void LIZJ(int i, FrameLayout frameLayout) throws JSONException {
        ViewParent parent;
        View view = this.LLILLL;
        if (view != null && !Intrinsics.LJFF(view.getParent(), frameLayout)) {
            C786410Ut5.LJJJJIZL(frameLayout);
            View view2 = this.LLILLL;
            if (view2 != null) {
                parent = view2.getParent();
            } else {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                C786410Ut5.LJJJLZIJ(this.LLILLL, viewGroup);
            }
            frameLayout.addView(this.LLILLL, new ViewGroup.LayoutParams(-1, -1));
        }
        this.LLILZLL = i;
        AbstractC1028360crq abstractC1028360crq = this.LLILZIL;
        if (abstractC1028360crq != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activeIndex", this.LLILZLL);
            jSONObject.put("containerKey", this.LL);
            abstractC1028360crq.LJIIJJI("onUpdate", jSONObject);
        }
    }

    @Override // X.InterfaceC1051190dSf
    public final void k3(String str, String str2) {
        this.LLILLJJLI = false;
        this.LLILZ = str;
    }

    public C1000890c9X(Context context, Aweme aweme, int i) {
        this.LL = i;
        AbstractC1028360crq abstractC1028360crqLIZLLL = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(C1000490c8t.LIZJ(context, aweme), C1000490c8t.LIZIZ(context, aweme, i));
        this.LLILZIL = abstractC1028360crqLIZLLL;
        if (abstractC1028360crqLIZLLL != null) {
            abstractC1028360crqLIZLLL.LJJ(C1000490c8t.LIZIZ(context, aweme, i), this, null);
        }
    }
}
