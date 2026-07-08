package X;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Pzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663190Pzp extends C20094213jo {
    public final /* synthetic */ CharSequence LIZ;
    public final /* synthetic */ C661470Px3 LIZIZ;
    public final /* synthetic */ C663070Pzd LIZJ;
    public final /* synthetic */ Function0<Unit> LIZLLL;

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setContentDescription(this.LIZ);
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (C301290BrT.LIZ() && i == 64) {
            C663180Pzo.LIZJ = true;
            C659080PtC.LIZJ(1);
            C661470Px3 c661470Px3 = this.LIZIZ;
            if (c661470Px3 != null) {
                c661470Px3.setMute(true);
            }
            C663070Pzd c663070Pzd = this.LIZJ;
            if (c663070Pzd != null) {
                c663070Pzd.setMute(true);
            }
            Function0<Unit> function0 = this.LIZLLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    public C663190Pzp(CharSequence charSequence, C661470Px3 c661470Px3, C663070Pzd c663070Pzd, Function0<Unit> function0) {
        this.LIZ = charSequence;
        this.LIZIZ = c661470Px3;
        this.LIZJ = c663070Pzd;
        this.LIZLLL = function0;
    }
}
