package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPullUpLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20664615tc extends FrameLayout implements InterfaceC1380420m1g, InterfaceC20672015uo {
    public InnerPushPullUpLayout LL;
    public FrameLayout LLILLJJLI;
    public C1908500zlQ LLILLL;
    public boolean LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public final RunnableC20664715td LLIZ;
    public InterfaceC20665015tg LLIZLLLIL;
    public InnerPushMessage LLJ;
    public final C20664815te LLJI;

    @Override // X.InterfaceC1380420m1g
    public final void LIZ() {
    }

    @Override // X.InterfaceC20672015uo
    public final void LIZJ() {
        RunnableC20664715td runnableC20664715td = this.LLIZ;
        runnableC20664715td.LL = false;
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            HandlerHook.viewRemoveCallbacks(frameLayout, runnableC20664715td);
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            HandlerHook.viewPostDelay(frameLayout2, this.LLIZ, this.LLILZLL);
        }
    }

    @Override // X.InterfaceC20672015uo
    public final void onShow() {
        C19290510dT.LIZ("InnerPushLayout", "InnerPushPullLayout onShow");
        InnerPushPullUpLayout innerPushPullUpLayout = this.LL;
        if (innerPushPullUpLayout != null) {
            innerPushPullUpLayout.setPullUpListener(this);
        }
        InnerPushPullUpLayout innerPushPullUpLayout2 = this.LL;
        if (innerPushPullUpLayout2 != null) {
            innerPushPullUpLayout2.setInternalTouchEventListener(this.LLJI);
        }
        InnerPushPullUpLayout innerPushPullUpLayout3 = this.LL;
        if (innerPushPullUpLayout3 != null) {
            innerPushPullUpLayout3.LIZIZ();
        }
        this.LLILZIL = System.currentTimeMillis() + this.LLILZLL;
        LIZJ();
    }

    @Override // X.InterfaceC1380420m1g
    public final void LIZIZ() {
        InnerPushMessage message = getMessage();
        if (message != null) {
            int i = C20642815q6.LIZ;
            List list = (List) C20642815q6.LIZ().get(Integer.valueOf(message.getType()));
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC20643015q8) it2.next()).LJIIJJI(message);
                }
            }
            Iterator<InterfaceC20643015q8> it3 = C20642815q6.LIZIZ.iterator();
            while (it3.hasNext()) {
                it3.next().LJIIJJI(message);
            }
        }
        this.LLILZ = false;
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            HandlerHook.viewRemoveCallbacks(frameLayout, this.LLIZ);
        }
        InterfaceC20665015tg interfaceC20665015tg = this.LLIZLLLIL;
        if (interfaceC20665015tg != null) {
            interfaceC20665015tg.LJIJI(null, true);
        }
    }

    public InnerPushMessage getMessage() {
        return this.LLJ;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.15te] */
    public C20664615tc(Context context) {
        int i;
        View viewInflate;
        FrameLayout frameLayout;
        super(context, null, 0);
        this.LLILZLL = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLIZ = new RunnableC20664715td(this);
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (C296900BkO.LIZ()) {
            i = R.layout.ct6;
        } else {
            i = R.layout.cta;
        }
        if (C20674015v8.LIZIZ() && C20673215v0.LIZ(i, getContext()) && activityLIZ != null) {
            viewInflate = C20673215v0.LIZLLL(i, activityLIZ, this, true);
        } else if (C20674015v8.LIZJ() && activityLIZ != null) {
            viewInflate = C21146717pB.LIZIZ(activityLIZ, i, this, true);
        } else {
            viewInflate = FrameLayout.inflate(getContext(), i, this);
        }
        this.LL = (InnerPushPullUpLayout) viewInflate.findViewById(R.id.si2);
        this.LLILLJJLI = (FrameLayout) viewInflate.findViewById(R.id.tp9);
        this.LLILLL = new C1908500zlQ(this.LLILLJJLI);
        if (Build.VERSION.SDK_INT < 28 && (frameLayout = this.LLILLJJLI) != null) {
            frameLayout.setLayerType(1, null);
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            frameLayout2.setBackground(this.LLILLL);
        }
        InnerPushPullUpLayout innerPushPullUpLayout = this.LL;
        if (innerPushPullUpLayout != null) {
            innerPushPullUpLayout.LLILLL = this.LLILLJJLI;
        }
        this.LLJI = new InterfaceC1380410m1f() { // from class: X.15te
            @Override // X.InterfaceC1380410m1f
            public final void onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent == null) {
                    return;
                }
                InnerPushPullUpLayout innerPushPullUpLayout2 = this.LIZ.LL;
                if (innerPushPullUpLayout2 != null && innerPushPullUpLayout2.getAnimating()) {
                    return;
                }
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action != 3) {
                                return;
                            }
                        } else {
                            this.LIZ.LLILZ = true;
                            return;
                        }
                    }
                    C20664615tc c20664615tc = this.LIZ;
                    c20664615tc.LLILZ = false;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C20664615tc c20664615tc2 = this.LIZ;
                    c20664615tc.LLILZIL = jCurrentTimeMillis + c20664615tc2.LLILZLL;
                    c20664615tc2.LIZJ();
                    return;
                }
                C20664615tc c20664615tc3 = this.LIZ;
                c20664615tc3.LLILZ = true;
                RunnableC20664715td runnableC20664715td = c20664615tc3.LLIZ;
                runnableC20664715td.LL = true;
                FrameLayout frameLayout3 = c20664615tc3.LLILLJJLI;
                if (frameLayout3 == null) {
                    return;
                }
                HandlerHook.viewRemoveCallbacks(frameLayout3, runnableC20664715td);
            }
        };
    }

    @Override // X.InterfaceC20672015uo
    public void setInnerPushLayoutRadius(int i) {
        C1908500zlQ c1908500zlQ = this.LLILLL;
        if (c1908500zlQ != null) {
            c1908500zlQ.LIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        }
    }

    @Override // X.InterfaceC20672015uo
    public void setInnerPushNotifier(InterfaceC20665015tg interfaceC20665015tg) {
        this.LLIZLLLIL = interfaceC20665015tg;
    }

    @Override // X.InterfaceC20672015uo
    public void setMessage(InnerPushMessage innerPushMessage) {
        this.LLJ = innerPushMessage;
    }

    @Override // X.InterfaceC20672015uo
    public void setShowDuration(long j) {
        this.LLILZLL = j;
    }
}
