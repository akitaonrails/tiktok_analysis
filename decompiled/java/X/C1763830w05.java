package X;

import Y.ACListenerS128S0200000_26;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS164S0101000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w05, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763830w05 implements InterfaceC1761370vw7, InterfaceC1763180vz2 {
    public final C04AS LL;
    public final List<AbstractC1763110vyv> LLILLJJLI;
    public View LLILLL;
    public RectF LLILZ;
    public int LLILZIL = -1;

    @Override // X.InterfaceC1761370vw7
    public final void onShow(int i) {
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJFF() {
        ViewGroup viewGroup;
        View view = this.LLILLL;
        ViewParent parent = view != null ? view.getParent() : null;
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLILLL, viewGroup);
    }

    @Override // X.InterfaceC1761370vw7
    public final void onPageSelected(int i) {
        RectF rectF;
        EnumC1761790vwn enumC1761790vwnLIZIZ;
        View view = this.LLILLL;
        if (view == null || (rectF = this.LLILZ) == null) {
            return;
        }
        if (rectF.bottom <= 0.0f) {
            C1326490kch c1326490kch = C1326490kch.LIZ;
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(rectF, 1446);
            c1326490kch.getClass();
            C1326490kch.LIZIZ(awS570S0100000_26);
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        AbstractC1763110vyv abstractC1763110vyv = (AbstractC1763110vyv) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (abstractC1763110vyv != null) {
            enumC1761790vwnLIZIZ = abstractC1763110vyv.LIZIZ();
        } else {
            enumC1761790vwnLIZIZ = null;
        }
        if (enumC1761790vwnLIZIZ == EnumC1761790vwn.PHOTO) {
            RectF rectF2 = this.LLILZ;
            if (rectF2 != null) {
                int iLIZIZ2 = (((int) rectF2.bottom) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))) - iLIZIZ;
                C0H9H.LJI(iLIZIZ2, view);
                C1326490kch c1326490kch2 = C1326490kch.LIZ;
                AwS164S0101000_26 awS164S0101000_26 = new AwS164S0101000_26(iLIZIZ2, this, 2);
                c1326490kch2.getClass();
                C1326490kch.LIZIZ(awS164S0101000_26);
            }
            C12ES.LJIILL(0, view);
            if (i != this.LLILZIL) {
                this.LLILZIL = i;
                return;
            }
            return;
        }
        C03DZ.LIZ(view);
    }

    @Override // X.InterfaceC1761370vw7
    public final void setAlpha(float f) {
        View view = this.LLILLL;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1763830w05(C04AS c04as, List<? extends AbstractC1763110vyv> list) {
        this.LL = c04as;
        this.LLILLJJLI = list;
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        Map<String, ? extends Object> mapLIZIZ;
        ConcurrentHashMap<String, Object> concurrentHashMap;
        C1054004Ag c1054004Ag;
        ECRichText eCRichText;
        C04AS c04as = this.LL;
        Context context = frameLayout.getContext();
        c04as.getClass();
        FrameLayout frameLayout2 = new FrameLayout(context);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ar5, frameLayout2, true);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zl);
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
        c19659111vp.LJ = Integer.valueOf(R.attr.p0);
        c19659111vp.LIZ = C418440Gaw.LIZIZ(20);
        c19659111vp.LJI = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        frameLayout2.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
        C426750GoL.LJIIL(frameLayout2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
        TextView textView = (TextView) frameLayout2.findViewById(R.id.h89);
        TryOnData tryOnData = c04as.LIZ;
        if (tryOnData != null && (eCRichText = tryOnData.entryInfo) != null && textView != null) {
            C03B0 c03b0 = new C03B0(textView, "ai_try_on");
            C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
            textView.setText(c03b0.LIZJ);
        }
        this.LLILLL = frameLayout2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388613);
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(563));
        C786410Ut5.W5(frameLayout2, layoutParams);
        frameLayout.addView(frameLayout2);
        TryOnData tryOnData2 = this.LL.LIZ;
        if (tryOnData2 != null) {
            mapLIZIZ = C04AT.LIZIZ(tryOnData2);
        } else {
            mapLIZIZ = null;
        }
        C786410Ut5.I7(new ACListenerS128S0200000_26(this, mapLIZIZ, 24), frameLayout2);
        C04AS c04as2 = this.LL;
        PdpViewModel pdpViewModel = c04as2.LIZJ;
        if (pdpViewModel != null && (c1054004Ag = pdpViewModel.LLJLILLLLZIIL) != null) {
            concurrentHashMap = c1054004Ag.LIZIZ;
        } else {
            concurrentHashMap = null;
        }
        c04as2.LJFF(mapLIZIZ, concurrentHashMap);
        C03DZ.LIZ(frameLayout2);
    }

    @Override // X.InterfaceC1763180vz2
    public final void LJIIJJI(RectF rectF, int i) {
        this.LLILZ = rectF;
        onPageSelected(i);
    }
}
