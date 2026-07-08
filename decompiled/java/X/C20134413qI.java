package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.13qI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20134413qI extends C20131713pr implements InterfaceC20135213qQ {
    public String LLJIJIL;

    public C20134413qI(AbstractC20133313q7<? extends C20134413qI> abstractC20133313q7) {
        super(abstractC20133313q7);
    }

    @Override // X.C20131713pr
    public final void LJIIL(Context context, AttributeSet attributeSet) {
        super.LJIIL(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.DialogFragmentNavigator);
        String strXd = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.DialogFragmentNavigator_android_name);
        if (strXd != null) {
            this.LLJIJIL = strXd;
        }
        typedArrayObtainAttributes.recycle();
    }
}
