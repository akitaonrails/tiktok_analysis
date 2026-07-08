package X;

import Y.ARunnableS106S0100000_6;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ViewOnTouchListenerC1364760lcQ extends C19GU implements View.OnTouchListener, InterfaceC487330J9f {
    public final Context LLILZLL;
    public final SharePackage LLIZ;
    public final int[] LLIZLLLIL;
    public final Function1<IMContact, Unit> LLJ;
    public final Function1<InterfaceC1369790lkX, Unit> LLJI;
    public LinearLayout LLJIJIL;
    public int LLJILJIL;
    public List<? extends AbstractC1364920lcg> LLJILJILJ;
    public boolean LLJILLL;
    public List<? extends RectF> LLJJ;
    public List<? extends RectF> LLJJI;
    public final float LLJJIII;
    public final float LLJJIJI;
    public final ARunnableS106S0100000_6 LLJJIJIIJIL;
    public final ARunnableS106S0100000_6 LLJJIJIL;

    public final void LJJZZIII() {
        List<? extends AbstractC1364920lcg> list;
        AbstractC1364920lcg abstractC1364920lcg;
        Bundle bundle;
        int i = this.LLJILJIL;
        if (i != -1) {
            if (i != -1 && (list = this.LLJILJILJ) != null && (abstractC1364920lcg = (AbstractC1364920lcg) C13LP.LJJJLZIJ(i, list)) != null) {
                if (abstractC1364920lcg instanceof C1364800lcU) {
                    C1364800lcU c1364800lcU = (C1364800lcU) abstractC1364920lcg;
                    this.LLJ.invoke(c1364800lcU.LIZ);
                    SharePackage sharePackage = this.LLIZ;
                    if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                        bundle.putInt("rank_num", LJJZZI(abstractC1364920lcg));
                    }
                    SharePackage sharePackage2 = this.LLIZ;
                    if (sharePackage2 != null) {
                        C1364620lcC c1364620lcC = C1364620lcC.LIZ;
                        int i2 = this.LLJILJIL;
                        C0I0B.LJFF.LIZIZ();
                        c1364620lcC.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (Intrinsics.LJFF(sharePackage2.itemType, "aweme") || Intrinsics.LJFF(sharePackage2.itemType, "aweme_photo")) {
                            linkedHashMap.put("author_follow_status", String.valueOf(sharePackage2.extras.getInt("follow_status", 0)));
                            linkedHashMap.put("panel_source", "share_button_long_press");
                            linkedHashMap.put("rank_index", String.valueOf(i2));
                            C20684815ws.LJIILLIIL("share_head_click", linkedHashMap);
                        }
                    }
                    C1364590lc9 c1364590lc9 = C1364590lc9.LIZ;
                    SharePackage sharePackage3 = this.LLIZ;
                    IMContact iMContact = c1364800lcU.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0I0B c0i0b = C0I0B.LJFF;
                    InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
                    int i3 = this.LLJILJIL;
                    c1364590lc9.getClass();
                    C1364590lc9.LJFF(sharePackage3, iMContact, false, "chat", jCurrentTimeMillis, interfaceC1493505szLIZIZ, i3);
                    C1364590lc9.LJI(this.LLIZ, c1364800lcU.LIZ, false, "chat", c0i0b.LIZIZ(), this.LLJILJIL);
                    SharePackage sharePackage4 = this.LLIZ;
                    List listSingletonList = Collections.singletonList(c1364800lcU.LIZ);
                    int i4 = this.LLJILJIL;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    InterfaceC1493505sz interfaceC1493505szLIZIZ2 = C0I0B.LJFF.LIZIZ();
                    c1364590lc9.getClass();
                    C1364590lc9.LIZLLL(sharePackage4, null, listSingletonList, jCurrentTimeMillis2, interfaceC1493505szLIZIZ2, i4);
                } else {
                    if (!(abstractC1364920lcg instanceof C1364830lcX)) {
                        throw new C1954807lC();
                    }
                    C1364830lcX c1364830lcX = (C1364830lcX) abstractC1364920lcg;
                    if (Intrinsics.LJFF(c1364830lcX.LIZ.key(), "repost")) {
                        SharePackage sharePackage5 = this.LLIZ;
                        if (sharePackage5 != null) {
                            InterfaceC1369790lkX interfaceC1369790lkX = c1364830lcX.LIZ;
                            interfaceC1369790lkX.LJJIIJ(sharePackage5.LJIILLIIL(interfaceC1369790lkX), this.LLILZLL, null);
                        }
                    } else {
                        this.LLJI.invoke(c1364830lcX.LIZ);
                    }
                }
                new C0ZDN(this.LLILZLL).LIZ(0);
            }
            LJL(-1);
            dismiss();
            C785410UrT.LIZ(this);
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        Activity activityLIZ = C1388190mED.LIZ(this.LLILZLL);
        if (activityLIZ == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), new InterfaceC487330J9f() { // from class: X.0lca
            @Override // X.InterfaceC487330J9f
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                C487280J9a.LIZJ(this);
                ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ = this.LL;
                viewOnTouchListenerC1364760lcQ.dismiss();
                C785410UrT.LIZ(viewOnTouchListenerC1364760lcQ);
            }
        });
    }

    public final int LJJZZI(AbstractC1364920lcg abstractC1364920lcg) {
        List<? extends AbstractC1364920lcg> list = this.LLJILJILJ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC1364920lcg abstractC1364920lcg2 : list) {
                if (abstractC1364920lcg2 instanceof C1364800lcU) {
                    arrayList.add(abstractC1364920lcg2);
                }
            }
            return arrayList.indexOf(abstractC1364920lcg);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL(int r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1364760lcQ.LJL(int):void");
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        LinearLayout linearLayout = this.LLJIJIL;
        if (linearLayout != null) {
            HandlerHook.viewRemoveCallbacks(linearLayout, this.LLJJIJIIJIL);
            HandlerHook.viewRemoveCallbacks(linearLayout, this.LLJJIJIL);
        }
        super.setOnDismissListener(onDismissListener);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        dismiss();
        C785410UrT.LIZ(this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                }
            }
            LJJZZIII();
            return true;
        }
        LJJZ(this.LLJJI, motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final void LJJZ(List list, float f, float f2) {
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((RectF) it2.next()).contains(f, f2)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            LJL(i);
        }
    }

    public ViewOnTouchListenerC1364760lcQ(Context context, AwemeSharePackage awemeSharePackage, int[] iArr, C1364720lcM c1364720lcM, AwS387S0200000_21 awS387S0200000_21) {
        super(context, R.style.adp);
        this.LLILZLL = context;
        this.LLIZ = awemeSharePackage;
        this.LLIZLLLIL = iArr;
        this.LLJ = c1364720lcM;
        this.LLJI = awS387S0200000_21;
        this.LLJILJIL = -1;
        this.LLJILLL = true;
        this.LLJJIII = C418440Gaw.LIZIZ(22);
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        this.LLJJIJI = fLIZIZ;
        float fLIZIZ2 = C418440Gaw.LIZIZ(87);
        this.LLJJIJIIJIL = new ARunnableS106S0100000_6(this, 277);
        this.LLJJIJIL = new ARunnableS106S0100000_6(this, 276);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.setDimAmount(0.3f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.gravity = 8388661;
                int i = window.getContext().getResources().getConfiguration().orientation;
                if (i == 1) {
                    attributes.x = (int) (((C12ES.LJIIJ(context) > C12ES.LJIIIIZZ(context) ? r0 : r1) - iArr[0]) - fLIZIZ);
                    attributes.y = (int) ((iArr[1] - C12ES.LJIIJJI(window.getContext())) - fLIZIZ2);
                } else if (i == 2) {
                    int iLJIIJJI = C12ES.LJIIJJI(window.getContext());
                    int iLJIIJ = C12ES.LJIIJ(context);
                    int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
                    attributes.x = ((iLJIIJ > iLJIIIIZZ ? iLJIIIIZZ : iLJIIJ) - iArr[0]) + iLJIIJJI;
                    attributes.y = (int) ((iArr[1] - iLJIIJJI) - fLIZIZ2);
                }
                attributes.windowAnimations = R.style.adp;
            }
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C487280J9a.LIZ(c19egLIZIZ.hashCode(), this);
        }
    }
}
