package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.assem.PcsServiceBioContentAssemV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822360xWU extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ PcsServiceBioContentAssemV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822360xWU(PcsServiceBioContentAssemV2 pcsServiceBioContentAssemV2) {
        super(1);
        this.LL = pcsServiceBioContentAssemV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        C20600815jK<InterfaceC1891350zJl> state;
        InterfaceC1785270wYf interfaceC1785270wYf;
        long jLongValue = l.longValue();
        PcsServiceBioContentAssemV2 pcsServiceBioContentAssemV2 = this.LL;
        ViewOnAttachStateChangeListenerC20604515jv powerList = pcsServiceBioContentAssemV2.getPowerList();
        View viewFindViewById = null;
        if (powerList != null && (state = powerList.getState()) != null) {
            for (Object obj : (ArrayList) state.LJII()) {
                if (obj instanceof InterfaceC1785270wYf) {
                    if ((obj instanceof InterfaceC1785270wYf) && (interfaceC1785270wYf = (InterfaceC1785270wYf) obj) != null && interfaceC1785270wYf.getItemType() == EnumC1785280wYg.COURSE && interfaceC1785270wYf.LIZ() == jLongValue) {
                        if (pcsServiceBioContentAssemV2.lp().getState().LIZ()) {
                            View view = pcsServiceBioContentAssemV2.LLL;
                            if (view == null) {
                                View viewLJJIJL = pcsServiceBioContentAssemV2.LJJIJL();
                                if (viewLJJIJL != null) {
                                    viewFindViewById = viewLJJIJL.findViewById(R.id.vcp);
                                }
                                pcsServiceBioContentAssemV2.LLL = (C16F5) viewFindViewById;
                                view = viewFindViewById;
                            }
                            TextView textView = (TextView) view;
                            if (textView != null) {
                                textView.setText(C497740JfY.LJIJI(2131855826));
                            }
                        } else {
                            View view2 = pcsServiceBioContentAssemV2.LLJLILLLLZIIL;
                            if (view2 == null) {
                                View viewLJJIJL2 = pcsServiceBioContentAssemV2.LJJIJL();
                                if (viewLJJIJL2 != null) {
                                    viewFindViewById = viewLJJIJL2.findViewById(R.id.who);
                                }
                                pcsServiceBioContentAssemV2.LLJLILLLLZIIL = (C16F5) viewFindViewById;
                                view2 = viewFindViewById;
                            }
                            TextView textView2 = (TextView) view2;
                            if (textView2 != null) {
                                textView2.setText(C497740JfY.LJIJI(2131855826));
                            }
                        }
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return Unit.LIZ;
    }
}
