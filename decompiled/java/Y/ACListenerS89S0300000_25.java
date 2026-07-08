package Y;

import X.C0P0T;
import X.C1635800sfa;
import X.C1642630sqb;
import X.C1642700sqi;
import X.C1642710sqj;
import X.C1643970ssl;
import X.C1650980t44;
import X.C1651640t58;
import X.C1651660t5A;
import X.C19EG;
import X.C259800zU;
import X.InterfaceC1628180sTI;
import X.InterfaceC1651630t57;
import X.InterfaceC1651650t59;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public class ACListenerS89S0300000_25 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS89S0300000_25 aCListenerS89S0300000_25, View view) {
        if (((C1642700sqi) aCListenerS89S0300000_25.l0).getAdapterPosition() >= 0) {
            EffectCategoryModel effectCategoryModelLLLFZ = ((C1642710sqj) aCListenerS89S0300000_25.l1).LLLFZ(((C1642700sqi) aCListenerS89S0300000_25.l0).getAdapterPosition());
            C1642630sqb c1642630sqb = (C1642630sqb) aCListenerS89S0300000_25.l2;
            c1642630sqb.LJFF(effectCategoryModelLLLFZ);
            HandlerHook.viewPostDelay(c1642630sqb, new ARunnableS125S0100000_25(c1642630sqb, 86), 250L);
            ((C1642710sqj) aCListenerS89S0300000_25.l1).LLILLJJLI = effectCategoryModelLLLFZ.getName();
            ((C1642710sqj) aCListenerS89S0300000_25.l1).notifyDataSetChanged();
        }
    }

    public static final void onClick$1(ACListenerS89S0300000_25 aCListenerS89S0300000_25, View view) {
        int adapterPosition = ((C1651640t58) aCListenerS89S0300000_25.l0).getAdapterPosition();
        if (adapterPosition == -1) {
            return;
        }
        C1650980t44 c1650980t44 = (C1650980t44) ListProtector.get(((C1651660t5A) aCListenerS89S0300000_25.l1).LL, adapterPosition);
        InterfaceC1651630t57 interfaceC1651630t57 = c1650980t44.LLJIJIL;
        if (!c1650980t44.LLILZLL) {
            if (interfaceC1651630t57 != null) {
                interfaceC1651630t57.LIZJ(c1650980t44);
                return;
            }
            return;
        }
        InterfaceC1651650t59 interfaceC1651650t59 = c1650980t44.LLJJIII;
        if (interfaceC1651650t59 != null) {
            interfaceC1651650t59.LIZ(((C1651640t58) aCListenerS89S0300000_25.l0).LL);
        }
        if (interfaceC1651630t57 != null) {
            interfaceC1651630t57.LIZIZ((View) aCListenerS89S0300000_25.l2, c1650980t44);
            if (c1650980t44.LLJJ) {
                ((C1651640t58) aCListenerS89S0300000_25.l0).LL.setImageResource(c1650980t44.LLILLJJLI);
                c1650980t44.LLJJ = false;
            }
        }
    }

    public static final void onClick$2(ACListenerS89S0300000_25 aCListenerS89S0300000_25, View view) {
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS89S0300000_25.l0).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        ((StoryEditToolbarComponent) aCListenerS89S0300000_25.l1).LLJILJILJ = null;
        ((Function0) aCListenerS89S0300000_25.l2).invoke();
    }

    public static final void onClick$3(ACListenerS89S0300000_25 aCListenerS89S0300000_25, View view) {
        C1643970ssl c1643970ssl = (C1643970ssl) aCListenerS89S0300000_25.l0;
        c1643970ssl.LJIIIIZZ.onNext(aCListenerS89S0300000_25.l2);
    }

    public static final void onClick$4(ACListenerS89S0300000_25 aCListenerS89S0300000_25, View view) {
        if (!((C1635800sfa) aCListenerS89S0300000_25.l0).LIZIZ.isLogin()) {
            InterfaceC1628180sTI interfaceC1628180sTI = ((C1635800sfa) aCListenerS89S0300000_25.l0).LIZIZ;
            C19EG c19eg = (C19EG) aCListenerS89S0300000_25.l1;
            interfaceC1628180sTI.LIZJ();
            interfaceC1628180sTI.LIZ(c19eg, "", 241, null, new AwS569S0100000_25((C1635800sfa) aCListenerS89S0300000_25.l0, 1110));
            return;
        }
        ((Function0) aCListenerS89S0300000_25.l2).invoke();
    }

    public static final void onClick$5(ACListenerS89S0300000_25 aCListenerS89S0300000_25, View view) {
        if (!((C1635800sfa) aCListenerS89S0300000_25.l0).LIZIZ.isLogin()) {
            InterfaceC1628180sTI interfaceC1628180sTI = ((C1635800sfa) aCListenerS89S0300000_25.l0).LIZIZ;
            C19EG c19eg = (C19EG) aCListenerS89S0300000_25.l1;
            interfaceC1628180sTI.LIZJ();
            interfaceC1628180sTI.LIZ(c19eg, "", 241, null, new AwS569S0100000_25((C1635800sfa) aCListenerS89S0300000_25.l0, 1111));
            return;
        }
        ((Function0) aCListenerS89S0300000_25.l2).invoke();
    }

    public ACListenerS89S0300000_25(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
