package X;

import Y.AsS35S0100000_8;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.aiuikit.impl.mentionlist.scene.MentionCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554270LoX extends AbstractC1664490tPr<C554170LoN, C554210LoR> {
    public static Bitmap LLJJJJLIIL;
    public final C553990Lo5 LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;

    public C554270LoX() {
        this(null);
    }

    public final ViewOnAttachStateChangeListenerC20604515jv LLLLLJIL() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJJJJIL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        Bitmap bitmap = LLJJJJLIIL;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        LLJJJJLIIL = null;
    }

    public C554270LoX(C553990Lo5 c553990Lo5) {
        this.LLJJJIL = c553990Lo5;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 113));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C20600815jK<InterfaceC1891350zJl> state;
        super.onViewCreated(view, bundle);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL = LLLLLJIL();
        int i = 1;
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLJIL != null) {
            viewOnAttachStateChangeListenerC20604515jvLLLLLJIL.LJIILJJIL(MentionCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL2 = LLLLLJIL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLJIL2 != null) {
            viewOnAttachStateChangeListenerC20604515jvLLLLLJIL2.setItemAnimator(null);
        }
        C553990Lo5 c553990Lo5 = this.LLJJJIL;
        if (c553990Lo5 == null || c553990Lo5.isHorizontalScroll$tools_ai_uikit_df_release()) {
            i = 0;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL3 = LLLLLJIL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLJIL3 != null) {
            viewOnAttachStateChangeListenerC20604515jvLLLLLJIL3.setOrientation(i);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL4 = LLLLLJIL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLJIL4 != null && (state = viewOnAttachStateChangeListenerC20604515jvLLLLLJIL4.getState()) != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        C553990Lo5 c553990Lo52 = this.LLJJJIL;
        if (c553990Lo52 != null && c553990Lo52.getLifecycleOwnerSetter$tools_ai_uikit_df_release() != null) {
            Function1<Function0<Unit>, Unit> lifecycleOwnerSetter$tools_ai_uikit_df_release = this.LLJJJIL.getLifecycleOwnerSetter$tools_ai_uikit_df_release();
            if (lifecycleOwnerSetter$tools_ai_uikit_df_release != null) {
                lifecycleOwnerSetter$tools_ai_uikit_df_release.invoke(new AwS552S0100000_8(this, 1012));
            }
        } else {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL5 = LLLLLJIL();
            if (viewOnAttachStateChangeListenerC20604515jvLLLLLJIL5 != null) {
                viewOnAttachStateChangeListenerC20604515jvLLLLLJIL5.setLifecycleOwner(this);
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL6 = LLLLLJIL();
        if (viewOnAttachStateChangeListenerC20604515jvLLLLLJIL6 != null) {
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            viewOnAttachStateChangeListenerC20604515jvLLLLLJIL6.addItemDecoration(new C0DXR(iLIZIZ2, iLIZIZ) { // from class: X.03Iq
                public final int LL;
                public final int LLILLJJLI;

                {
                    this.LL = iLIZIZ2;
                    this.LLILLJJLI = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    if (childAdapterPosition == 0) {
                        if (C426750GoL.LIZLLL(view2.getContext())) {
                            rect.left = this.LL / 2;
                            rect.right = this.LLILLJJLI;
                            return;
                        } else {
                            rect.left = this.LLILLJJLI;
                            rect.right = this.LL / 2;
                            return;
                        }
                    }
                    if (recyclerView.getAdapter() != null && childAdapterPosition == r0.getItemCount() - 1) {
                        if (C426750GoL.LIZLLL(view2.getContext())) {
                            rect.left = this.LLILLJJLI;
                            rect.right = this.LL / 2;
                            return;
                        } else {
                            rect.left = this.LL / 2;
                            rect.right = this.LLILLJJLI;
                            return;
                        }
                    }
                    int i2 = this.LL / 2;
                    rect.left = i2;
                    rect.right = i2;
                }
            });
        }
        C473001sm c473001sm = new C473001sm(LLLLLJIL(), new AwS552S0100000_8(this, 1013), AFwS239S0000000_8.get$arr$(323), AFwS239S0000000_8.get$arr$(324), AFwS239S0000000_8.get$arr$(325));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = c473001sm.LIZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS35S0100000_8(c473001sm, 6));
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new RunnableC514801zW(c473001sm, 158));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0LoZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C554170LoN) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 691));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0LoY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C554170LoN) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 692));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0LoO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C554170LoN) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 693));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.o_, viewGroup, false);
    }
}
