package X;

import Y.ACallableS63S1100000_11;
import android.content.DialogInterface;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.series.commonfeed.component.playnext.IAutoPlayNextConflictAbility;
import com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p0.StoryRelationLabelInfoComponent;
import com.ss.android.ugc.aweme.translation.ui.AutoDubbingConsumptionLabelAssemV1;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class DialogInterfaceOnDismissListenerC738790SyT implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

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
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onDismiss$10(this, dialogInterface);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onDismiss$11(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC738790SyT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        ((C0S5A) dialogInterfaceOnDismissListenerC738790SyT.l0).LLJJIJI = false;
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        ((C0SUG) dialogInterfaceOnDismissListenerC738790SyT.l0).LLILLL.invoke();
    }

    public static final void onDismiss$10(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        ((StoryRelationLabelInfoComponent) dialogInterfaceOnDismissListenerC738790SyT.l0).Ep(false);
    }

    public static final void onDismiss$11(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        IAutoPlayNextConflictAbility iAutoPlayNextConflictAbility = (IAutoPlayNextConflictAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((PaidContentVideoViewHolder) dialogInterfaceOnDismissListenerC738790SyT.l0), IAutoPlayNextConflictAbility.class, null);
        if (iAutoPlayNextConflictAbility != null) {
            iAutoPlayNextConflictAbility.xI0(false);
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        ((C0S11) dialogInterfaceOnDismissListenerC738790SyT.l0).LLILZ.invoke();
        C0S11 c0s11 = (C0S11) dialogInterfaceOnDismissListenerC738790SyT.l0;
        if (c0s11.LLIZ) {
            C15O7.LIZJ(new ACallableS63S1100000_11("close", c0s11, 0));
        }
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        TuxTag tuxTag = ((AutoDubbingConsumptionLabelAssemV1) dialogInterfaceOnDismissListenerC738790SyT.l0).LLJZIJLIL;
        if (tuxTag != null) {
            tuxTag.setTagIcon(null);
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        TuxTag tuxTag = ((AutoDubbingConsumptionLabelAssemV1) dialogInterfaceOnDismissListenerC738790SyT.l0).LLJZIJLIL;
        if (tuxTag != null) {
            tuxTag.setTagIcon(null);
        }
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        TuxTag tuxTag = ((AutoDubbingConsumptionLabelAssemV1) dialogInterfaceOnDismissListenerC738790SyT.l0).LLJZIJLIL;
        if (tuxTag != null) {
            tuxTag.setTagIcon(null);
        }
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        TuxTag tuxTag = ((AutoDubbingConsumptionLabelAssemV1) dialogInterfaceOnDismissListenerC738790SyT.l0).LLJZIJLIL;
        if (tuxTag != null) {
            tuxTag.setTagIcon(null);
        }
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC738790SyT.l0).invoke();
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        ((C20623915n3) dialogInterfaceOnDismissListenerC738790SyT.l0).LJI.reset();
    }

    public static final void onDismiss$9(DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT, DialogInterface dialogInterface) {
        ((C20623915n3) dialogInterfaceOnDismissListenerC738790SyT.l0).LJI.reset();
    }
}
