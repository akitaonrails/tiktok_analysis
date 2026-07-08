package X;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.profile.platform.business.header.business.bio.container.ProfileHeaderBioBaseComponent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0j35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewTreeObserverOnPreDrawListenerC1265970j35 implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1265970j35 viewTreeObserverOnPreDrawListenerC1265970j35) {
        int i;
        int lineCount;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        EnumC1248450iap enumC1248450iap;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        C786410Ut5.D3(((TuxTextView) viewTreeObserverOnPreDrawListenerC1265970j35.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1265970j35);
        if (((TuxTextView) viewTreeObserverOnPreDrawListenerC1265970j35.l0).getParent() != null) {
            AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ((ProfileHeaderBioBaseComponent) viewTreeObserverOnPreDrawListenerC1265970j35.l1);
            int iIntValue = 0;
            if (assemSupervisorLJ != null && (copyOnWriteArrayList2 = assemSupervisorLJ.LLJILLL) != null) {
                Iterator<AbstractC738140SxQ> it2 = copyOnWriteArrayList2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next() instanceof InterfaceC1248320iac) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            Layout layout = ((TuxTextView) viewTreeObserverOnPreDrawListenerC1265970j35.l0).getLayout();
            if (layout != null) {
                lineCount = layout.getLineCount();
            } else {
                lineCount = 0;
            }
            if ((i - 1) + lineCount <= ((Number) ((ProfileHeaderBioBaseComponent) viewTreeObserverOnPreDrawListenerC1265970j35.l1).LLJL.getValue()).intValue()) {
                return true;
            }
            if (lineCount < ((Number) ((ProfileHeaderBioBaseComponent) viewTreeObserverOnPreDrawListenerC1265970j35.l1).LLJL.getValue()).intValue()) {
                iIntValue = ((Number) ((ProfileHeaderBioBaseComponent) viewTreeObserverOnPreDrawListenerC1265970j35.l1).LLJL.getValue()).intValue() - lineCount;
            }
            AssemSupervisor assemSupervisorLJ2 = C724240Sb0.LJ((ProfileHeaderBioBaseComponent) viewTreeObserverOnPreDrawListenerC1265970j35.l1);
            if (assemSupervisorLJ2 != null && (copyOnWriteArrayList = assemSupervisorLJ2.LLJILLL) != null) {
                ProfileHeaderBioBaseComponent profileHeaderBioBaseComponent = (ProfileHeaderBioBaseComponent) viewTreeObserverOnPreDrawListenerC1265970j35.l1;
                for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
                    C1242470iRB c1242470iRB = (C1242470iRB) profileHeaderBioBaseComponent.LLJLIL.getValue();
                    if (c1242470iRB != null) {
                        c1242470iRB.setFold(true);
                    }
                    C428150Gqb.LIZ((View) profileHeaderBioBaseComponent.LLJLIL.getValue(), EnumC428940Grs.ALPHA, 0.0f);
                    if (interfaceC665370Q7z instanceof InterfaceC1248320iac) {
                        InterfaceC1248320iac interfaceC1248320iac = (InterfaceC1248320iac) interfaceC665370Q7z;
                        if (iIntValue == interfaceC1248320iac.a()) {
                            enumC1248450iap = EnumC1248450iap.SHOW_MORE;
                        } else if (iIntValue > interfaceC1248320iac.a()) {
                            enumC1248450iap = EnumC1248450iap.UNFOLD;
                        } else {
                            enumC1248450iap = EnumC1248450iap.FOLD;
                        }
                        if (enumC1248450iap != interfaceC1248320iac.h()) {
                            interfaceC1248320iac.Bk(enumC1248450iap);
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1265970j35 viewTreeObserverOnPreDrawListenerC1265970j35) {
        C786410Ut5.D3(((C1248160iaM) viewTreeObserverOnPreDrawListenerC1265970j35.l0).LLILZLL.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1265970j35);
        int height = ((C1248160iaM) viewTreeObserverOnPreDrawListenerC1265970j35.l0).LLILZLL.getHeight();
        C1248150iaL c1248150iaL = (C1248150iaL) viewTreeObserverOnPreDrawListenerC1265970j35.l1;
        int i = c1248150iaL.LLILLL;
        if (height < i) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((C1248160iaM) viewTreeObserverOnPreDrawListenerC1265970j35.l0).LLILZLL.getLayoutParams();
            marginLayoutParams.height = ((C1248150iaL) viewTreeObserverOnPreDrawListenerC1265970j35.l1).LLILLL;
            C786410Ut5.m6(((C1248160iaM) viewTreeObserverOnPreDrawListenerC1265970j35.l0).LLILZLL, marginLayoutParams);
            ((C1248150iaL) viewTreeObserverOnPreDrawListenerC1265970j35.l1).LLLFZ((C1248160iaM) viewTreeObserverOnPreDrawListenerC1265970j35.l0);
            return false;
        }
        if (height > i) {
            c1248150iaL.LLILLL = height;
            c1248150iaL.notifyDataSetChanged();
            return false;
        }
        if (height == i) {
            ((C1248150iaL) viewTreeObserverOnPreDrawListenerC1265970j35.l1).LLLFZ((C1248160iaM) viewTreeObserverOnPreDrawListenerC1265970j35.l0);
            C786410Ut5.D3(((C1248160iaM) viewTreeObserverOnPreDrawListenerC1265970j35.l0).LLILZLL.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1265970j35);
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1265970j35(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
