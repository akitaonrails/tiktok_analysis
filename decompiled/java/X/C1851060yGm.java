package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.Observer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1851060yGm implements Observer, InterfaceC1635506an {
    public final /* synthetic */ C10CC LL;

    public C1851060yGm(C10CC c10cc) {
        this.LL = c10cc;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, C10CC.class, "onSubPreviewActiveStatusChange", "onSubPreviewActiveStatusChange(Lcom/ss/android/ugc/aweme/subscription/preview/models/SubscriptionPublishPreviewStatus;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Integer numLIZJ;
        String quantityString;
        Resources resources;
        AbstractC1778000wMw abstractC1778000wMw = (AbstractC1778000wMw) obj;
        C10CC c10cc = this.LL;
        c10cc.getClass();
        if (abstractC1778000wMw instanceof C1777980wMu) {
            c10cc.LIZJ(C06LR.LIZ(((C1777980wMu) abstractC1778000wMw).LIZ, c10cc.LIZ.getContext()));
            return;
        }
        int iIntValue = 0;
        String string = null;
        if (abstractC1778000wMw instanceof C1777990wMv) {
            int i = ((C1777990wMv) abstractC1778000wMw).LIZ;
            Context context = c10cc.LIZ.getContext();
            if (context == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(2131755466, i, Integer.valueOf(i))) == null) {
                quantityString = "";
            }
            c10cc.LIZJ(quantityString);
            return;
        }
        if (Intrinsics.LJFF(abstractC1778000wMw, C1778010wMx.LIZ)) {
            TuxTextView tuxTextViewLIZ = c10cc.LIZ();
            if (tuxTextViewLIZ != null) {
                Context context2 = c10cc.LIZ.getContext();
                if (context2 != null) {
                    string = context2.getString(R.string.mf6);
                }
                tuxTextViewLIZ.setText(string);
            }
            Context context3 = c10cc.LIZ.getContext();
            if (context3 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, context3)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            TuxTextView tuxTextViewLIZ2 = c10cc.LIZ();
            if (tuxTextViewLIZ2 != null) {
                tuxTextViewLIZ2.setTextColor(iIntValue);
            }
            TuxIconView tuxIconView = (TuxIconView) c10cc.LJI.getValue();
            if (tuxIconView == null) {
                return;
            }
            tuxIconView.setTintColor(iIntValue);
            return;
        }
        throw new C1954807lC();
    }
}
