package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652320PiI extends AbstractC652910PjF {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public final InterfaceC641090PCp LLJI;
    public final int LLJIJIL;
    public final String LLJILJIL;
    public final C21415918rV LLJILJILJ;
    public final View LLJILLL;
    public final View LLJJ;
    public ViewGroup LLJJI;
    public C0PUF LLJJIII;
    public final C01GW LLJJIJI;

    @Override // X.AbstractC652910PjF
    public final boolean LJIIJ() {
        return C293130BeJ.LIZ();
    }

    public C652320PiI(C652390PiP c652390PiP, InterfaceC641090PCp interfaceC641090PCp, InterfaceC652950PjJ interfaceC652950PjJ, View view, int i, String str) {
        Integer numValueOf;
        super(c652390PiP, interfaceC641090PCp, interfaceC652950PjJ);
        this.LLJI = interfaceC641090PCp;
        this.LLJIJIL = i;
        this.LLJILJIL = str;
        this.LLJJ = c652390PiP.itemView.findViewById(R.id.jhz);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 508));
        C21415918rV c21415918rV = (C21415918rV) view.findViewById(R.id.u2w);
        if (C301190BrJ.LIZ()) {
            int visibility = c21415918rV.getVisibility();
            c21415918rV.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c21415918rV);
        }
        this.LLJILJILJ = c21415918rV;
        this.LLJILLL = view.findViewById(R.id.view_blank_for_scroll);
        Integer numValueOf2 = Integer.valueOf(C1913107eT.LJFF());
        if (numValueOf2.intValue() > 0) {
            if (1 != 0) {
                int iIntValue = numValueOf2.intValue();
                View viewFindViewById = view.findViewById(R.id.df_);
                if (viewFindViewById != null) {
                    Integer numValueOf3 = Integer.valueOf(C1913107eT.LJ());
                    int iIntValue2 = numValueOf3.intValue();
                    if (iIntValue2 > 0 && iIntValue - iIntValue2 > 0) {
                        numValueOf = Integer.valueOf(iIntValue - numValueOf3.intValue());
                    } else {
                        numValueOf = null;
                    }
                    C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)))), null, numValueOf != null ? Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numValueOf))) : null, null, 26);
                }
            }
        }
        if (C301200BrK.LIZ()) {
            c652390PiP.LLILLJJLI.addOnAttachStateChangeListener(new C0R48(c652390PiP, 4));
        }
    }
}
