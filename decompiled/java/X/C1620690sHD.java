package X;

import android.view.View;
import com.ss.android.ugc.aweme.ogc.declaration.page.AddDateAndLocationPage;

/* JADX INFO: renamed from: X.0sHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620690sHD extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620690sHD(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1620690sHD c1620690sHD, View view) {
        if (view != null) {
            ((AddDateAndLocationPage) c1620690sHD.l0).SR().wQ2(C1576250r7X.LIZ);
        }
    }

    public static final void LIZ$1(C1620690sHD c1620690sHD, View view) {
        InterfaceC1576290r7b callback;
        if (view != null && (callback = ((C1576270r7Z) c1620690sHD.l0).getCallback()) != null) {
            callback.LIZ();
        }
    }

    public static final void LIZ$2(C1620690sHD c1620690sHD, View view) {
        if (view != null) {
            C1576270r7Z c1576270r7Z = (C1576270r7Z) c1620690sHD.l0;
            if (c1576270r7Z.LLILLJJLI == EnumC1576280r7a.CLEAR) {
                InterfaceC1576290r7b callback = c1576270r7Z.getCallback();
                if (callback != null) {
                    callback.LJJJLIIL();
                    return;
                }
                return;
            }
            InterfaceC1576290r7b callback2 = c1576270r7Z.getCallback();
            if (callback2 == null) {
                return;
            }
            callback2.LIZ();
        }
    }
}
