package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tools.chat.extract.cell.AiChatMultiImagesCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12EV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12EV extends AbstractC1664490tPr<AnonymousClass0066, C12EW> {
    public int LLJJL;
    public long LLJL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 862));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 865));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 866));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 863));
    public final List<C1158270gFN> LLJJLIIIJLLLLLLLZ = new ArrayList();

    public final ViewOnAttachStateChangeListenerC20631115oD LLLLLJIL() {
        return (ViewOnAttachStateChangeListenerC20631115oD) this.LLJJJIL.getValue();
    }

    public final void LLLLLJLJLL() {
        LLLLIL().LJFF.invoke(Long.valueOf(System.currentTimeMillis() - this.LLJL));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View childAt;
        RecyclerView recyclerView;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        boolean z;
        ViewGroup viewGroup;
        super.onActivityCreated(bundle);
        this.LLJL = System.currentTimeMillis();
        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).clear();
        List<C1158270gFN> list = this.LLJJLIIIJLLLLLLLZ;
        List<String> listInvoke = LLLLIL().LIZ.invoke();
        Aweme awemeInvoke = LLLLIL().LIZLLL.invoke();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
        Iterator<String> it2 = listInvoke.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1158270gFN(awemeInvoke, it2.next()));
        }
        ((ArrayList) list).addAll(arrayList);
        View childAt2 = LLLLLJIL().getChildAt(0);
        if ((childAt2 instanceof C20632315oP) && (viewGroup = (ViewGroup) childAt2) != null) {
            childAt = viewGroup.getChildAt(0);
        } else {
            childAt = null;
        }
        if (childAt instanceof RecyclerView) {
            recyclerView = (RecyclerView) childAt;
        } else {
            recyclerView = null;
        }
        int iLIZLLL = C11VU.LIZLLL(LLLLLJIL().getContext()) + C1336100ksC.LIZLLL(LLLLLJIL().getContext());
        int iLJ = C11VU.LJ(LLLLLJIL().getContext());
        int i = (int) (iLIZLLL * 0.45f);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) + i;
        int i2 = (i * 9) / 16;
        ViewGroup.LayoutParams layoutParams = LLLLLJIL().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iLIZIZ;
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oDLLLLLJIL = LLLLLJIL();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnAttachStateChangeListenerC20631115oDLLLLLJIL);
            viewOnAttachStateChangeListenerC20631115oDLLLLLJIL.setLayoutParams(layoutParams);
        }
        int i3 = (iLJ - i2) / 2;
        if (recyclerView != null) {
            recyclerView.setPadding(i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), i3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            recyclerView.setClipToPadding(false);
        }
        C0HQZ c0hqz = new C0HQZ();
        ((ArrayList) c0hqz.LIZ).add(new C20584615gi(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        LLLLLJIL().setPageTransformer(c0hqz);
        InterfaceC1733780vDc viewItemOperator = LLLLLJIL().getViewItemOperator();
        C1173220gdU c1173220gdU = new C1173220gdU();
        c1173220gdU.LIZ = 1;
        viewItemOperator.LIZLLL(c1173220gdU);
        LLLLLJIL().getViewItemOperator().LIZJ(AiChatMultiImagesCell.class);
        LLLLLJIL().getViewItemOperator().getState().LIZLLL(this.LLJJLIIIJLLLLLLLZ, null);
        C197039127h c197039127h = (C197039127h) this.LLJJJJJIL.getValue();
        c197039127h.setIconTintColorRes(R.attr.z_);
        c197039127h.setTextColorRes(R.attr.z_);
        int[] iArr = new int[3];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cq, c197039127h.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, c197039127h.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, c197039127h.getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        iArr[2] = iIntValue3;
        c197039127h.LJJJJL(new AwS372S0200000_6(c197039127h, iArr, 112));
        c197039127h.LJJLI(true);
        C14K9.LJIJJ(c197039127h, new C0TVI() { // from class: X.0TYM
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27)) + c20244914JjLIZ.LIZLLL;
                    C786410Ut5.W5(view, marginLayoutParams);
                }
                return c20246014Ju;
            }
        });
        C12EU c12eu = (C12EU) this.LLJJJJ.getValue();
        int size = ((ArrayList) this.LLJJLIIIJLLLLLLLZ).size();
        c12eu.LLILZIL = size;
        c12eu.LLIZ = 0.0f;
        c12eu.LLIZLLLIL = 0.0f;
        ((ArrayList) c12eu.LLJIJIL).clear();
        if (size <= 0) {
            c12eu.requestLayout();
            c12eu.invalidate();
        } else {
            int i4 = 0;
            do {
                float f = c12eu.LL;
                float f2 = (i4 * (c12eu.LLILLJJLI + f)) + (f / 2);
                List<C1869530ykZ> list2 = c12eu.LLJIJIL;
                int i5 = c12eu.LLILLL;
                if (i4 < 7) {
                    z = true;
                } else {
                    z = false;
                }
                ((ArrayList) list2).add(new C1869530ykZ(i5, f2, z));
                i4++;
            } while (i4 < size);
            Math.max(0, size - 1);
            c12eu.requestLayout();
            c12eu.invalidate();
        }
        LLLLLJIL().registerOnPageChangeCallback(new C12Y0(this, 0));
        C786410Ut5.U8((C197039127h) this.LLJJJJJIL.getValue(), new ACListenerS163S0100000_29(this, 210));
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJJJLIIL.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131837153);
        c0om1.LIZJ = c1250250idj;
        C197020126o c197020126o = new C197020126o();
        c197020126o.LIZJ = true;
        c197020126o.LJII = Integer.valueOf(R.attr.a1j);
        c197020126o.LIZ(new AwS573S0100000_29(this, 864));
        c0om1.LIZIZ(c197020126o);
        tuxNavBar.setNavActions(c0om1);
        LLLLIL().LJ.invoke();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C18T2.LIZ.getClass();
        C18T2.LIZ("ai_chat_preview_boot_duration");
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bg8, viewGroup, false);
    }
}
