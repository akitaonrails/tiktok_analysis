package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.dataChannel.TurnOnVisualRelatedFunctionEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0UFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class ViewOnLayoutChangeListenerC769370UFz extends AbstractC785360UrO implements View.OnLayoutChangeListener {
    public int LLILLL;
    public C09AY LLILZ;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.LLILLJJLI.removeOnLayoutChangeListener(this);
        this.LL.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_FIRSTLY_EFFECT_PANEL));
        onDismiss();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final void onDismiss() {
        C771670UOv.LIZIZ().LIZ = false;
        if (C0UID.LJIIJ(this.LL)) {
            TryModeGuidanceSetting tryModeGuidanceSetting = TryModeGuidanceSetting.INSTANCE;
            if (tryModeGuidanceSetting.isV2NormalBubble()) {
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_TRY_MODE_EFFECT_GUIDE);
                C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_TRY_MODE_MUSIC_GUIDE);
            } else if (tryModeGuidanceSetting.isV2EnhancedBubble()) {
                C785290UrH.LIZ(EnumC785300UrI.ANCHOR_TRY_MODE_EFFECT_GUIDE);
                C785290UrH.LIZ(EnumC785300UrI.ANCHOR_TRY_MODE_MUSIC_GUIDE);
            }
        }
        ?? r0 = this.LLILZ;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    @Override // X.AbstractC785360UrO
    public final void LJJIIJ(boolean z) {
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 234);
        LiveGiftTrayPublicScreenTranslateSetting.enable(EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL);
        HandlerHook.viewPostDelay(this.LLILLJJLI, aRunnableS112S0100000_12, 200L);
        this.LL.LC0(TurnOnVisualRelatedFunctionEvent.class, Boolean.FALSE);
        this.LLILLJJLI.removeOnLayoutChangeListener(this);
        super.dismiss();
        onDismiss();
    }

    public final View LJJIIJZLJL(String str) {
        ViewGroup viewGroup = (ViewGroup) this.LLILLJJLI.findViewById(R.id.y6v);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            try {
                try {
                    if (((C20743416Fc) viewGroup.getChildAt(i).findViewById(R.id.y7s)).getText().equals(str)) {
                        return viewGroup.getChildAt(i);
                    }
                    continue;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return null;
    }

    public final void LJJIIZ(boolean z) {
        if (z) {
            C786410Ut5.LJLLLLLL(0, this.LLILLJJLI.findViewById(R.id.visual_toast));
        } else {
            C786410Ut5.LJLLLLLL(4, this.LLILLJJLI.findViewById(R.id.visual_toast));
        }
    }

    public final void LJJIJ(View view) {
        showAtLocation(view, 80, 0, 0);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJI(this);
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
        this.LLILLJJLI.addOnLayoutChangeListener(this);
        String str = C924810aAp.LJ().LJIILJJIL;
        LJJIIZ(false);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 290), this.LLILLJJLI.findViewById(R.id.y56));
        if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).rl2(str) && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
            LJJIIZ(true);
            C786410Ut5.LJLLLLLL(4, this.LLILLJJLI.findViewById(R.id.y56));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tips_shortcut_show");
            c474500IjALIZ.LJIJJLI(this.LL);
            c474500IjALIZ.LJIILJJIL("live_take_detail");
            c474500IjALIZ.LJJII("turn_on_camera", "action_name");
            c474500IjALIZ.LIZ();
        }
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 291), this.LLILLJJLI.findViewById(R.id.y59));
    }

    public ViewOnLayoutChangeListenerC769370UFz(Context context, DataChannel dataChannel, List list) {
        super(context, dataChannel, list);
        setHeight(-1);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LLILLL != this.LLILLJJLI.getHeight()) {
            int height = this.LLILLJJLI.getHeight();
            this.LLILLL = height;
            this.LL.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height, hashCode(), EnumC761940Tui.DIALOG_BIZ_FIRSTLY_EFFECT_PANEL));
        }
    }
}
