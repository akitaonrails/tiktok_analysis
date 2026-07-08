package X;

import android.view.View;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082650eHP extends ElementSpecImpl {
    public final LayeredElementContext LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public View LLILZ;
    public ViewOnLayoutChangeListenerC1151610g4d LLILZIL;

    public final void LIZ() {
        boolean z = this.LLILLL | this.LLILLJJLI;
        if (Intrinsics.LJFF(Boolean.valueOf(z), this.LL.getDataChannel().gg0(PublicScreenShrinkChannel.class))) {
            return;
        }
        this.LL.getDataChannel().zW(PublicScreenShrinkChannel.class, Boolean.valueOf(z));
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void dispose() {
        super.dispose();
        View view = this.LLILZ;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLILZIL);
        }
    }

    public C1082650eHP(LayeredElementContext layeredElementContext) {
        super(R.id.kwd);
        this.LL = layeredElementContext;
        if (C500260Jjc.LJIJI(layeredElementContext.getDataChannel())) {
            addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eHZ
                {
                    super(R.id.cga);
                }

                @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
                public final void onHiddenChanged(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, boolean z) {
                    C1082650eHP c1082650eHP = this.LIZ;
                    c1082650eHP.LLILLL = !z;
                    c1082650eHP.LIZ();
                }
            });
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void attach(ConstraintProperty constraintProperty) {
        super.attach(constraintProperty);
        this.LLILLJJLI = false;
        this.LLILLL = false;
        View view = constraintProperty.getView();
        this.LLILZ = view;
        ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d = new ViewOnLayoutChangeListenerC1151610g4d(this, 13);
        this.LLILZIL = viewOnLayoutChangeListenerC1151610g4d;
        if (view != null) {
            view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
        }
    }
}
