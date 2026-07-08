package X;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Spanned;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859190yTt extends FrameLayout implements InterfaceC1859200yTu {
    public static final int LLJI;
    public static final int LLJIJIL;
    public static final int LLJILJIL;
    public FrameLayout LL;
    public int LLILLJJLI;
    public TextView LLILLL;
    public Spanned LLILZ;
    public InterfaceC1859630yUb LLILZIL;
    public int LLILZLL;
    public Map<String, ? extends Object> LLIZ;
    public final int LLIZLLLIL;
    public final View LLJ;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LLJI = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        LLJIJIL = iLIZIZ2;
        LLJILJIL = iLIZIZ + iLIZIZ2;
    }

    @Override // X.InterfaceC1859200yTu
    public final View LJJZZI() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            frameLayout.setTag(R.id.o0p, null);
        }
    }

    public final FrameLayout getContainer() {
        return this.LL;
    }

    public final int getVideoHeight() {
        return this.LLIZLLLIL;
    }

    public C1859190yTt(Context context) {
        int iLIZIZ;
        View view;
        super(context, null);
        this.LLILLJJLI = getResources().getConfiguration().orientation;
        C07QH.LIZ.getClass();
        if (C07QH.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(182));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        }
        this.LLIZLLLIL = iLIZIZ;
        C07QJ.LIZ.getClass();
        if (C07QJ.LIZIZ()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C1859020yTc.LIZ(false, true), LLJILJIL + iLIZIZ);
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            C786410Ut5.a6(frameLayout, layoutParams);
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
            float fLIZIZ = C418440Gaw.LIZIZ(12);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iLIZIZ2, iLIZIZ);
            layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
            C786410Ut5.a6(frameLayout2, layoutParams2);
            frameLayout2.setClipToOutline(true);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
            frameLayout2.setBackground(c384050F3z.LIZ(context));
            C0GW2 c0gw2 = new C0GW2(context);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gw2);
            c0gw2.setLayoutParams(layoutParams3);
            frameLayout2.addView(c0gw2);
            linearLayout.addView(frameLayout2);
            frameLayout.addView(linearLayout);
            view = frameLayout;
        } else {
            View view2 = new View(getContext());
            C786410Ut5.W5(view2, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152))));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view2.getContext());
            view = view2;
            if (numLIZJ != null) {
                view2.setBackgroundDrawable(C1908520zlS.LIZ(0.0f, C418440Gaw.LIZIZ(8), 0.0f, C418440Gaw.LIZIZ(8), numLIZJ.intValue()));
                view = view2;
            }
        }
        this.LLJ = view;
        setPadding(0, LLJI, 0, LLJIJIL);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Spanned spanned;
        InterfaceC1859630yUb interfaceC1859630yUb;
        super.onConfigurationChanged(configuration);
        if (!((Boolean) C0AX7.LIZ.getValue()).booleanValue()) {
            int i = this.LLILLJJLI;
            int i2 = configuration.orientation;
            if (i != i2) {
                this.LLILLJJLI = i2;
                TextView textView = this.LLILLL;
                if (textView == null || (spanned = this.LLILZ) == null || (interfaceC1859630yUb = this.LLILZIL) == null) {
                    return;
                }
                Size sizeLJJZZIII = LJJZZIII(textView, spanned, interfaceC1859630yUb, this.LLILZLL, this.LLIZ);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = sizeLJJZZIII.getWidth();
                    layoutParams.height = sizeLJJZZIII.getHeight();
                    C786410Ut5.W5(this, layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    public final void setContainer(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    @Override // X.InterfaceC1859200yTu
    public final Size LJJZZIII(TextView textView, Spanned spanned, InterfaceC1859630yUb interfaceC1859630yUb, int i, Map<String, ? extends Object> map) {
        FrameLayout frameLayout;
        boolean zBooleanValue;
        int iLIZIZ;
        Boolean boolLJLI;
        List arrayList;
        this.LLILLL = textView;
        this.LLILZ = spanned;
        this.LLILZIL = interfaceC1859630yUb;
        this.LLILZLL = i;
        this.LLIZ = map;
        ViewParent parent = textView.getParent();
        Integer numValueOf = null;
        if (parent instanceof FrameLayout) {
            frameLayout = (FrameLayout) parent;
        } else {
            frameLayout = null;
        }
        this.LL = frameLayout;
        if (frameLayout != null) {
            int spanStart = spanned.getSpanStart(interfaceC1859630yUb);
            int spanEnd = spanned.getSpanEnd(interfaceC1859630yUb);
            String dataType = interfaceC1859630yUb.getDataType();
            String strLIZ = interfaceC1859630yUb.LIZ();
            Object tag = frameLayout.getTag(R.id.o0p);
            if (!C19719512Dh.LJI(tag) || (arrayList = (List) tag) == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(new C1859550yUT(spanStart, spanEnd, dataType, strLIZ, this));
            frameLayout.setTag(R.id.o0p, arrayList);
        }
        int iLIZ = C0H16.LIZ(spanned, spanned.getSpanStart(interfaceC1859630yUb));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("span.dataType ");
        sbLIZ.append(interfaceC1859630yUb.getDataType());
        sbLIZ.append(" span.dataValue.getPlaceholderId()");
        sbLIZ.append(C1859250yTz.LJII(interfaceC1859630yUb.LIZ(), FollowStatusChangeMethod.PARAM_UID));
        sbLIZ.append("margin");
        sbLIZ.append(iLIZ);
        sbLIZ.append(" container?.width");
        FrameLayout frameLayout2 = this.LL;
        if (frameLayout2 != null) {
            numValueOf = Integer.valueOf(frameLayout2.getMeasuredWidth());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        String strLJII = C1859250yTz.LJII(interfaceC1859630yUb.LIZ(), "isShare");
        if (strLJII != null && (boolLJLI = a0.LJLI(strLJII)) != null) {
            zBooleanValue = boolLJLI.booleanValue();
        } else {
            zBooleanValue = false;
        }
        InterfaceC1859220yTw interfaceC1859220yTwLJ = C1859250yTz.LJ(interfaceC1859630yUb.getDataType());
        if (interfaceC1859220yTwLJ != null) {
            getContext();
            Size sizeLJ = interfaceC1859220yTwLJ.LJ(interfaceC1859630yUb, this.LL, spanned, zBooleanValue);
            if (sizeLJ != null) {
                View view = this.LLJ;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
                removeView(view);
                return sizeLJ;
            }
        }
        if (this.LLJ.getParent() == null) {
            addView(this.LLJ);
        }
        C07QJ.LIZ.getClass();
        boolean zLIZIZ = C07QJ.LIZIZ();
        String dataType2 = interfaceC1859630yUb.getDataType();
        if (Intrinsics.LJFF(dataType2, "video")) {
            return new Size(C1859020yTc.LIZ(zBooleanValue, zLIZIZ), this.LLIZLLLIL + LLJILJIL);
        }
        if (Intrinsics.LJFF(dataType2, "uncertain")) {
            int iLIZ2 = C1859020yTc.LIZ(zBooleanValue, false);
            if (C07QJ.LIZIZ()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)) + LLJILJIL;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152));
            }
            return new Size(iLIZ2, iLIZIZ);
        }
        return new Size(C1859020yTc.LIZ(zBooleanValue, false), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)) + LLJILJIL);
    }
}
