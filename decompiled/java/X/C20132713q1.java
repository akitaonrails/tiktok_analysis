package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13q1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20132713q1 extends C20131713pr {
    public Intent LLJIJIL;
    public String LLJILJIL;

    @Override // X.C20131713pr
    public final String toString() {
        String action;
        Intent intent = this.LLJIJIL;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(C2204961BRm.LJJIJIIJIL(component, new C0WZX("dTF6Tg0zW9KSW1Y3TBWFcmI9K9q6lf3Sae8bpdUtlqWx/i0jKw==", new String[]{"01789"})));
        } else {
            Intent intent2 = this.LLJIJIL;
            if (intent2 != null && (action = intent2.getAction()) != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }

    @Override // X.C20131713pr
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.LLJIJIL;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.LLJILJIL;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    public C20132713q1(AbstractC20133313q7<? extends C20132713q1> abstractC20133313q7) {
        super(abstractC20133313q7);
    }

    @Override // X.C20131713pr
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20132713q1) || !super.equals(obj)) {
            return false;
        }
        Intent intent = this.LLJIJIL;
        if (intent != null) {
            if (!intent.filterEquals(((C20132713q1) obj).LLJIJIL)) {
                return false;
            }
        } else if (((C20132713q1) obj).LLJIJIL != null) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LLJILJIL, ((C20132713q1) obj).LLJILJIL)) {
            return false;
        }
        return true;
    }

    @Override // X.C20131713pr
    public final void LJIIL(Context context, AttributeSet attributeSet) {
        super.LJIIL(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.ActivityNavigator);
        String strXd = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.ActivityNavigator_targetPackage);
        if (strXd != null) {
            strXd = u.LJJIFFI(strXd, "${applicationId}", context.getPackageName(), false);
        }
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new Intent();
        }
        this.LLJIJIL.setPackage(strXd);
        String strXd2 = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.ActivityNavigator_android_name);
        if (strXd2 != null) {
            if (strXd2.charAt(0) == '.') {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(context.getPackageName());
                sbLIZ.append(strXd2);
                strXd2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            ComponentName componentName = new ComponentName(context, strXd2);
            if (this.LLJIJIL == null) {
                this.LLJIJIL = new Intent();
            }
            this.LLJIJIL.setComponent(componentName);
        }
        String strXd3 = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.ActivityNavigator_action);
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new Intent();
        }
        this.LLJIJIL.setAction(strXd3);
        String strXd4 = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.ActivityNavigator_data);
        if (strXd4 != null) {
            Uri uri = UriProtector.parse(strXd4);
            if (this.LLJIJIL == null) {
                this.LLJIJIL = new Intent();
            }
            this.LLJIJIL.setData(uri);
        }
        this.LLJILJIL = C786410Ut5.Xd(typedArrayObtainAttributes, R$styleable.ActivityNavigator_dataPattern);
        typedArrayObtainAttributes.recycle();
    }
}
