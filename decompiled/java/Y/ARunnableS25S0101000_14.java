package Y;

import X.AbstractRunnableC874200YRe;
import X.C06MM;
import X.C0PEM;
import X.C0YRZ;
import X.C1390380mHk;
import X.C19EG;
import X.C1C7U;
import X.C2296808zG;
import X.C23250099c;
import X.C885830Yp3;
import X.C885870Yp7;
import X.C904030ZdJ;
import X.C904200Zda;
import X.C904220Zdc;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarUIAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent;

/* JADX INFO: loaded from: classes15.dex */
public class ARunnableS25S0101000_14 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        C1C7U.LIZ("BaseUploadTask@e3e1.onProgressUpdated$1");
        try {
            C0YRZ c0yrz = ((AbstractRunnableC874200YRe) aRunnableS25S0101000_14.l0).LLILLJJLI;
            if (c0yrz != null) {
                c0yrz.LIZ(aRunnableS25S0101000_14.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseUploadTask@e3e1.onProgressUpdated$1");
    }

    public static final void run$1(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        Window window;
        C1C7U.LIZ("BaseChatRoomFragment@7e2c.initChatPanel$1$setLightTheme$1$1");
        try {
            Activity activityLIZ = C06MM.LIZ(((BaseChatRoomFragment) aRunnableS25S0101000_14.l0).getRootView().getContext());
            if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
                window.setNavigationBarColor(aRunnableS25S0101000_14.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseChatRoomFragment@7e2c.initChatPanel$1$setLightTheme$1$1");
    }

    public static final void run$2(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        C1C7U.LIZ("TTEPPreviewEffectLogicComponent@5edf.handleEffectIdPreview$3$onFail$2");
        try {
            C19EG c19eg = ((TTEPPreviewEffectLogicComponent) aRunnableS25S0101000_14.l0).activity;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(aRunnableS25S0101000_14.i1);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(c19eg, 5009, creativeToastBuilder);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTEPPreviewEffectLogicComponent@5edf.handleEffectIdPreview$3$onFail$2");
    }

    public static final void run$3(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        C1C7U.LIZ("AiChatMessageInfraComponent@acdf.highlightMessageAtPosition$1$1");
        try {
            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(aRunnableS25S0101000_14.i1, 0);
            valueAnimatorOfArgb.setDuration(200L);
            valueAnimatorOfArgb.addUpdateListener(new AUListenerS263S0100000_14((View) aRunnableS25S0101000_14.l0, 2));
            valueAnimatorOfArgb.start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AiChatMessageInfraComponent@acdf.highlightMessageAtPosition$1$1");
    }

    public static final void run$4(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        C1C7U.LIZ("AiChatMessageInfraComponent@acdf.highlightMessageAtPosition$1");
        try {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS25S0101000_14.l0).findViewHolderForAdapterPosition(aRunnableS25S0101000_14.i1);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                int color = ColorProtector.parseColor("#1F20D5EC");
                view.setBackgroundColor(color);
                HandlerHook.viewPostDelay(view, new ARunnableS25S0101000_14(color, view, 3), 3000L);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AiChatMessageInfraComponent@acdf.highlightMessageAtPosition$1");
    }

    public static final void run$5(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        C1C7U.LIZ("ActionBarUIAssem@82b0.scrollToPosition$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((ActionBarUIAssem) aRunnableS25S0101000_14.l0).LLJJI;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(aRunnableS25S0101000_14.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ActionBarUIAssem@82b0.scrollToPosition$1");
    }

    public static final void run$6(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMConvLoadAnalytics@9541.notifyBindForPosition$1");
        try {
            if (!C885830Yp3.LLIZ) {
                RecyclerView.LayoutManager layoutManager = (RecyclerView.LayoutManager) aRunnableS25S0101000_14.l0;
                if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition() == aRunnableS25S0101000_14.i1) {
                    C885830Yp3.LLIZ = true;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C885870Yp7(null), 3);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMConvLoadAnalytics@9541.notifyBindForPosition$1");
    }

    public static final void run$7(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMReactionAdapter@1443.hideDataV2Animation$1$1");
        try {
            ((C904030ZdJ) aRunnableS25S0101000_14.l0).notifyItemChanged(aRunnableS25S0101000_14.i1, C904200Zda.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMReactionAdapter@1443.hideDataV2Animation$1$1");
    }

    public static final void run$8(ARunnableS25S0101000_14 aRunnableS25S0101000_14) {
        boolean zLIZ;
        C1C7U.LIZ("IMReactionAdapter@1443.setDataV2Animation$1$3$2$1");
        try {
            ((C904030ZdJ) aRunnableS25S0101000_14.l0).notifyItemChanged(aRunnableS25S0101000_14.i1, C904220Zdc.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMReactionAdapter@1443.setDataV2Animation$1$3$2$1");
    }

    public ARunnableS25S0101000_14(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
