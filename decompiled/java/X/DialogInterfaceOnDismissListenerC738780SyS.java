package X;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aigc.aiinfopanel.AIInfoPanelFragment;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareExtService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class DialogInterfaceOnDismissListenerC738780SyS implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC738780SyS dialogInterfaceOnDismissListenerC738780SyS, DialogInterface dialogInterface) {
        DetailPageComponent detailPageComponent = (DetailPageComponent) dialogInterfaceOnDismissListenerC738780SyS.l0;
        C19EG activity = detailPageComponent.getActivity();
        if (activity == null) {
            detailPageComponent.LLLI.LJIILL("[exitFullScreenCleanMode] activity null");
        } else {
            detailPageComponent.op();
            C1440005kM.LIZ(new C1372310lob(false, 2, 1, activity.hashCode()));
            C0S4J c0s4j = detailPageComponent.LLLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[exitFullScreenCleanMode] ");
            sbLIZ.append(true);
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        ((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJIIJ((Aweme) dialogInterfaceOnDismissListenerC738780SyS.l1);
        ((DetailPageComponent) dialogInterfaceOnDismissListenerC738780SyS.l0).getClass();
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC738780SyS dialogInterfaceOnDismissListenerC738780SyS, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        C720800SPe c720800SPe = null;
        if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C0SRT) {
            C720820SPg c720820SPg = C720820SPg.LIZ;
            C0SRP c0srp = ((AIInfoPanelFragment) dialogInterfaceOnDismissListenerC738780SyS.l0).LLJJ;
            if (c0srp != null) {
                c720800SPe = c0srp.LJ;
            }
            c720820SPg.getClass();
            C720820SPg.LIZ(c720800SPe, "Click X Button");
        } else {
            C720820SPg c720820SPg2 = C720820SPg.LIZ;
            C0SRP c0srp2 = ((AIInfoPanelFragment) dialogInterfaceOnDismissListenerC738780SyS.l0).LLJJ;
            if (c0srp2 != null) {
                c720800SPe = c0srp2.LJ;
            }
            c720820SPg2.getClass();
            C720820SPg.LIZ(c720800SPe, "others");
        }
        Function0<Unit> function0 = ((C0SRP) dialogInterfaceOnDismissListenerC738780SyS.l1).LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC738780SyS dialogInterfaceOnDismissListenerC738780SyS, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC738780SyS.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((C20623915n3) dialogInterfaceOnDismissListenerC738780SyS.l1).LJI.reset();
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC738780SyS dialogInterfaceOnDismissListenerC738780SyS, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC738780SyS.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((C20623915n3) dialogInterfaceOnDismissListenerC738780SyS.l1).LJI.reset();
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC738780SyS dialogInterfaceOnDismissListenerC738780SyS, DialogInterface dialogInterface) {
        ((C698100RZw) dialogInterfaceOnDismissListenerC738780SyS.l0).LIZIZ((View) dialogInterfaceOnDismissListenerC738780SyS.l1);
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC738780SyS dialogInterfaceOnDismissListenerC738780SyS, DialogInterface dialogInterface) {
        ((C698100RZw) dialogInterfaceOnDismissListenerC738780SyS.l0).LIZIZ((View) dialogInterfaceOnDismissListenerC738780SyS.l1);
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC738780SyS dialogInterfaceOnDismissListenerC738780SyS, DialogInterface dialogInterface) {
        ((C698100RZw) dialogInterfaceOnDismissListenerC738780SyS.l0).LIZIZ((View) dialogInterfaceOnDismissListenerC738780SyS.l1);
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC738780SyS dialogInterfaceOnDismissListenerC738780SyS, DialogInterface dialogInterface) {
        ((C698100RZw) dialogInterfaceOnDismissListenerC738780SyS.l0).LIZIZ((View) dialogInterfaceOnDismissListenerC738780SyS.l1);
    }

    public DialogInterfaceOnDismissListenerC738780SyS(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
