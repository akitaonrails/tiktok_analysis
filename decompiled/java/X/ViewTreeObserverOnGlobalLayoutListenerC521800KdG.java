package X;

import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC521800KdG implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG) {
        Object parent;
        View viewFindViewById;
        View view;
        ViewTreeObserver viewTreeObserver;
        C20441214yg.LIZIZ("PreviewLiveVoiceMicListWidget", "onGlobalLayout");
        PreviewLiveVoiceMicListWidget previewLiveVoiceMicListWidget = (PreviewLiveVoiceMicListWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0;
        View view2 = previewLiveVoiceMicListWidget.getView();
        Object parent2 = null;
        if (view2 != null) {
            parent = view2.getParent();
        } else {
            parent = null;
        }
        View view3 = (View) parent;
        int iMin = 0;
        if (view3 != null) {
            View view4 = previewLiveVoiceMicListWidget.getView();
            if (view4 != null) {
                parent2 = view4.getParent();
            }
            View view5 = (View) parent2;
            if (view5 != null && (viewFindViewById = view5.findViewById(R.id.view_for_layout_measure)) != null) {
                int height = (int) (viewFindViewById.getHeight() / 1.2f);
                int iMax = Math.max(viewFindViewById.getWidth(), height);
                iMin = Math.min(iMax, view3.getWidth());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PreviewLiveVoiceMicListWidget");
                sbLIZ.append("_getOriginalWidth originalWidth:");
                sbLIZ.append(height);
                sbLIZ.append(" minValue:");
                sbLIZ.append(iMin);
                sbLIZ.append(" maxValue:");
                sbLIZ.append(iMax);
                C20441214yg.LIZIZ("voice_chat", C2188811AlT.LIZIZ(sbLIZ));
                if (iMin > 0 && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().optPreviewWidget && (view = ((PreviewLiveVoiceMicListWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getView()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521800KdG);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521800KdG, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
            }
        }
        Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(iMin), Integer.valueOf((int) (iMin / 1.2f)));
        if (Intrinsics.LJFF(pair, ((PreviewLiveVoiceMicListWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LLJ)) {
            return;
        }
        ((PreviewLiveVoiceMicListWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LLJ = pair;
        PreviewLiveVoiceMicListWidget previewLiveVoiceMicListWidget2 = (PreviewLiveVoiceMicListWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0;
        previewLiveVoiceMicListWidget2.H1(previewLiveVoiceMicListWidget2.LLIZLLLIL);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG) {
        if (((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getView() == null) {
            return;
        }
        C786410Ut5.C3(((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521800KdG);
        ((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getView().getLocationOnScreen(new int[2]);
        ((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getView().getHeight();
        if (C497740JfY.LJII() != null) {
            C497740JfY.LJIJ();
            C497740JfY.LIZIZ(52.0f);
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG) {
        int width;
        int width2;
        ViewTreeObserver viewTreeObserver;
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        int iLJFF = C14KS.LJFF();
        C1826520xdC c1826520xdC = ((AutoPostLivingPanelDialog) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LLLF;
        if (c1826520xdC != null) {
            width = c1826520xdC.getWidth();
        } else {
            width = 0;
        }
        ViewGroup viewGroup = ((AutoPostLivingPanelDialog) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LLLFFI;
        if (viewGroup != null) {
            width2 = viewGroup.getWidth();
        } else {
            width2 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeAutoPostSwitchLayout screenWidth ");
        sbLIZ.append(iLJFF);
        sbLIZ.append(" autoPostTabWidth ");
        sbLIZ.append(width);
        sbLIZ.append(" switchContainerWidth ");
        sbLIZ.append(width2);
        C20441214yg.LIZIZ("AutoPostLivingPanelDialog", C2188811AlT.LIZIZ(sbLIZ));
        if (iLJFF != 0 && width != 0 && width2 != 0) {
            if (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + width + width2 >= iLJFF) {
                AutoPostLivingPanelDialog autoPostLivingPanelDialog = (AutoPostLivingPanelDialog) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0;
                C1826520xdC c1826520xdC2 = autoPostLivingPanelDialog.LLLF;
                C19ME c19me4 = null;
                if (c1826520xdC2 != null) {
                    ViewGroup.LayoutParams layoutParams = c1826520xdC2.getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (c19me3 = (C19ME) layoutParams) != null) {
                        c19me3.bottomToTop = R.id.bg6;
                    } else {
                        c19me3 = null;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1826520xdC2);
                    c1826520xdC2.setLayoutParams(c19me3);
                }
                ViewGroup viewGroup2 = autoPostLivingPanelDialog.LLLFFI;
                if (viewGroup2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if ((layoutParams2 instanceof C19ME) && (c19me2 = (C19ME) layoutParams2) != null) {
                        c19me2.topToTop = -1;
                        c19me2.bottomToBottom = -1;
                        c19me2.endToEnd = -1;
                        c19me2.startToStart = 0;
                        c19me2.topToBottom = R.id.bg7;
                        c19me2.bottomToTop = R.id.msd;
                        c19me2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    } else {
                        c19me2 = null;
                    }
                    C786410Ut5.X5(c19me2, viewGroup2);
                }
                FrameLayout frameLayout = autoPostLivingPanelDialog.LLJZIJLIL;
                if (frameLayout != null) {
                    ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                    if ((layoutParams3 instanceof C19ME) && (c19me = (C19ME) layoutParams3) != null) {
                        c19me.topToBottom = R.id.bg6;
                        ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c19me4 = c19me;
                    }
                    C786410Ut5.a6(frameLayout, c19me4);
                }
            }
            C1826520xdC c1826520xdC3 = ((AutoPostLivingPanelDialog) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LLLF;
            if (c1826520xdC3 != null && (viewTreeObserver = c1826520xdC3.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521800KdG);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521800KdG, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        C786410Ut5.C3(((C519470KYv) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LIZ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521800KdG);
        View viewFindViewById = ((C519470KYv) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LIZ.findViewById(R.id.nek);
        C519470KYv c519470KYv = (C519470KYv) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0;
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        int measuredHeight = viewFindViewById.getMeasuredHeight();
        int measuredHeight2 = c519470KYv.LIZ.getMeasuredHeight();
        boolean z = C14LC.LJIIIZ;
        if (!C309690CBz.LIZ.LJFF) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        } else {
            iLIZIZ = 0;
        }
        int iLIZIZ5 = (measuredHeight2 - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        Context context = viewFindViewById.getContext();
        if (context != null) {
            iLIZIZ2 = C497820Jfg.LIZJ(context);
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        }
        int i = (int) (((iLIZIZ5 - iLIZIZ2) - measuredHeight) / 2.3f);
        if (i < iLIZIZ4) {
            ViewGroup viewGroup = (ViewGroup) c519470KYv.LIZ.findViewById(R.id.f4y);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height - ((iLIZIZ4 - i) * 2.3f));
            C786410Ut5.X5(layoutParams, viewGroup);
        } else {
            iLIZIZ4 = i;
        }
        int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        Context context2 = viewFindViewById.getContext();
        if (context2 != null) {
            iLIZIZ3 = C497820Jfg.LIZJ(context2);
        } else {
            iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        }
        C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(iLIZIZ6 + iLIZIZ3 + iLIZIZ4), null, null, false, 29);
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        C786410Ut5.C3(((C1575450r6F) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LIZ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521800KdG);
        View viewFindViewById = ((C1575450r6F) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).LIZ.findViewById(R.id.neg);
        C1575450r6F c1575450r6F = (C1575450r6F) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0;
        int measuredHeight = viewFindViewById.getMeasuredHeight();
        int measuredHeight2 = c1575450r6F.LIZ.findViewById(R.id.i3n).getMeasuredHeight();
        if (measuredHeight > 0 && measuredHeight2 > 0) {
            int measuredHeight3 = c1575450r6F.LIZ.getMeasuredHeight();
            boolean z = C14LC.LJIIIZ;
            if (!C309690CBz.LIZ.LJFF) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            } else {
                iLIZIZ = 0;
            }
            int iLIZIZ4 = (measuredHeight3 - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            Context context = viewFindViewById.getContext();
            if (context != null) {
                iLIZIZ2 = C497820Jfg.LIZJ(context);
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            }
            if (((int) ((((iLIZIZ4 - iLIZIZ2) - measuredHeight) - measuredHeight2) / 2.0f)) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) {
                float fLIZIZ = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) - r2) * 2.0f;
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                ViewGroup viewGroup = (ViewGroup) c1575450r6F.LIZ.findViewById(R.id.wp_);
                if (viewGroup.getMeasuredHeight() <= 0) {
                    return;
                }
                float measuredHeight4 = (viewGroup.getMeasuredHeight() - fLIZIZ) / viewGroup.getMeasuredHeight();
                C786410Ut5.mc(measuredHeight4, viewGroup);
                C786410Ut5.Lb(measuredHeight4, viewGroup);
                C786410Ut5.bd(((-viewGroup.getMeasuredHeight()) * (1 - measuredHeight4)) / 2, viewGroup);
            }
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            Context context2 = viewFindViewById.getContext();
            if (context2 != null) {
                iLIZIZ3 = C497820Jfg.LIZJ(context2);
            } else {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            }
            C426750GoL.LJIIIZ(viewFindViewById, null, Integer.valueOf(iLIZIZ5 + iLIZIZ3), null, null, false, 29);
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG) {
        ViewTreeObserver viewTreeObserver;
        View videoContainer = ((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getVideoContainer();
        if (videoContainer != null && (viewTreeObserver = videoContainer.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521800KdG);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521800KdG, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        View videoContainer2 = ((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getVideoContainer();
        if (videoContainer2 != null) {
            int width = videoContainer2.getWidth();
            View videoContainer3 = ((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getVideoContainer();
            if (videoContainer3 != null) {
                int height = videoContainer3.getHeight();
                C0JSE c0jse = new C0JSE(((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getPlayerChannel().LIZ.getWidth(), ((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getPlayerChannel().LIZ.getHeight());
                C0JSE c0jse2 = new C0JSE(width, height);
                C0JSD.LIZ(((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getVideoTexture(), c0jse, c0jse2);
                C0JSD.LIZ(((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getCover(), c0jse, c0jse2);
                TextureView videoTexture = ((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).getVideoTexture();
                if (videoTexture != null) {
                    HandlerHook.viewPost(videoTexture, new ARunnableS107S0100000_7((C0JNZ) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0, 196));
                }
            }
        }
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC521800KdG viewTreeObserverOnGlobalLayoutListenerC521800KdG) {
        ((SubscriptionPrivilegeDetailFragment) viewTreeObserverOnGlobalLayoutListenerC521800KdG.l0).FS();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC521800KdG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
