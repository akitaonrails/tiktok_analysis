package X;

import X.C1BTZ;
import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.1BKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2203141BKm<T extends C1BTZ> {
    public T LIZ;
    public Bundle LIZIZ;
    public LinkedList<InterfaceC2203171BKp> LIZJ;
    public final C2203151BKn LIZLLL = new C2203151BKn(this);

    public abstract void LIZ(C2203151BKn c2203151BKn);

    public static void LIZJ(FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        final Context context = frameLayout.getContext();
        int iB4 = C786410Ut5.b4(googleApiAvailability, context);
        String strLIZJ = C829210Wfv.LIZJ(iB4, context);
        String strLIZIZ = C829210Wfv.LIZIZ(iB4, context);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        C786410Ut5.g6(textView, new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strLIZJ);
        linearLayout.addView(textView);
        final Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, iB4, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(button);
            button.setLayoutParams(layoutParams);
            button.setText(strLIZIZ);
            linearLayout.addView(button);
            C786410Ut5.L7(button, new View.OnClickListener() { // from class: X.09dX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        Context context2 = context;
                        Intent intent = errorResolutionIntent;
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, context2);
                        C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz4Z1hKg11Pf6XaXA==", new String[]{"016a9"}));
                    } catch (ActivityNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
    }

    public final void LIZLLL(int i) {
        while (!this.LIZJ.isEmpty() && this.LIZJ.getLast().LIZIZ() >= i) {
            this.LIZJ.removeLast();
        }
    }

    public final void LJ(Bundle bundle, InterfaceC2203171BKp interfaceC2203171BKp) {
        if (this.LIZ != null) {
            interfaceC2203171BKp.LIZ();
            return;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new LinkedList<>();
        }
        this.LIZJ.add(interfaceC2203171BKp);
        if (bundle != null) {
            Bundle bundle2 = this.LIZIZ;
            if (bundle2 == null) {
                this.LIZIZ = (Bundle) bundle.clone();
            } else {
                C786410Ut5.LJJIIJZLJL(bundle2, bundle);
            }
        }
        LIZ(this.LIZLLL);
    }

    public final View LIZIZ(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        LJ(bundle, new InterfaceC2203171BKp() { // from class: X.1BKo
            @Override // X.InterfaceC2203171BKp
            public final int LIZIZ() {
                return 2;
            }

            @Override // X.InterfaceC2203171BKp
            public final void LIZ() {
                C786410Ut5.LJJJJIZL(frameLayout);
                frameLayout.addView(this.LJ.LIZ.onCreateView(layoutInflater, viewGroup, bundle));
            }
        });
        if (this.LIZ == null) {
            LIZJ(frameLayout);
        }
        return frameLayout;
    }
}
