package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.SessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* JADX INFO: renamed from: X.0aDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926770aDz {
    public static final InterfaceC665370Q7z LIZIZ(Object obj) {
        Fragment fragmentLIZ;
        if (!(obj instanceof LiveWidget)) {
            return null;
        }
        Widget widget = (Widget) obj;
        InterfaceC1097170eep interfaceC1097170eep = widget.widgetCallback;
        if ((interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) && (fragmentLIZ = C946803n0.LIZ(widget.getView())) == null) {
            return null;
        }
        return C1558360qeg.LJFF(fragmentLIZ, "linkMicScope");
    }

    public static final ILinkStateAbility LIZJ(View view) {
        InterfaceC494301wD interfaceC494301wDLIZIZ;
        Object tag;
        InterfaceC665370Q7z interfaceC665370Q7z;
        ViewOnAttachStateChangeListenerC1555570qaB.LLILZIL.getClass();
        while (true) {
            interfaceC494301wDLIZIZ = null;
            if (view != null) {
                if (view.getTag(ViewOnAttachStateChangeListenerC1555570qaB.LLIZ) == null) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    tag = view.getTag(ViewOnAttachStateChangeListenerC1555570qaB.LLIZ);
                    break;
                }
            } else {
                tag = null;
                break;
            }
        }
        if ((tag instanceof InterfaceC665370Q7z) && (interfaceC665370Q7z = (InterfaceC665370Q7z) tag) != null) {
            interfaceC494301wDLIZIZ = C1555540qa8.LIZIZ(interfaceC665370Q7z, ILinkStateAbility.class, null);
        }
        return (ILinkStateAbility) interfaceC494301wDLIZIZ;
    }

    public static final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z) {
        if (z) {
            C1555540qa8.LIZ(interfaceC665370Q7z, new SessionAbility(), ISessionAbility.class, null);
        } else {
            if (C1555540qa8.LIZIZ(interfaceC665370Q7z, ISessionAbility.class, null) == null) {
                return;
            }
            C1555540qa8.LJI(interfaceC665370Q7z, ISessionAbility.class);
        }
    }
}
