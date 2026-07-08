package com.bytedance.android.live.effect;

import X.C0U5V;
import X.C0UAO;
import X.C500980Jkm;
import X.C766290U4d;
import X.C786410Ut5;
import X.InterfaceC767260U7w;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveEffectContainerDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1HELIOSLSY4ZwM6PiAJLyk2KzEPJiEnKSwiLD0XISQgJig=";
    public ViewGroup LL;
    public C0U5V LLILLJJLI;
    public InterfaceC767260U7w LLILLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.ge9);
        C766290U4d.LIZ(c500980Jkm);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        boolean z = this.LLILLJJLI instanceof C0UAO;
        return super.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C0U5V c0u5v = this.LLILLJJLI;
            C786410Ut5.LJJJLZIJ(c0u5v != null ? c0u5v.getView() : null, viewGroup);
        }
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 != null) {
            InterfaceC767260U7w interfaceC767260U7w = this.LLILLL;
            C786410Ut5.LJJJLZIJ(interfaceC767260U7w != null ? interfaceC767260U7w.getView() : null, viewGroup2);
        }
        C0U5V c0u5v2 = this.LLILLJJLI;
        if (c0u5v2 != null) {
            c0u5v2.LIZIZ();
        }
        this.LLILLJJLI = null;
        InterfaceC767260U7w interfaceC767260U7w2 = this.LLILLL;
        if (interfaceC767260U7w2 != null) {
            interfaceC767260U7w2.LIZIZ();
        }
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        View view;
        InterfaceC767260U7w interfaceC767260U7w;
        super.onStart();
        C766290U4d.LIZIZ(this);
        C0U5V c0u5v = this.LLILLJJLI;
        if (c0u5v != null) {
            c0u5v.onDialogForeground();
        }
        InterfaceC767260U7w interfaceC767260U7w2 = this.LLILLL;
        if (interfaceC767260U7w2 != null && (view = interfaceC767260U7w2.getView()) != null && view.getParent() != null && (interfaceC767260U7w = this.LLILLL) != null) {
            interfaceC767260U7w.onDialogForeground();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        View view;
        InterfaceC767260U7w interfaceC767260U7w;
        super.onStop();
        C0U5V c0u5v = this.LLILLJJLI;
        if (c0u5v != null) {
            c0u5v.onDialogBackground();
        }
        InterfaceC767260U7w interfaceC767260U7w2 = this.LLILLL;
        if (interfaceC767260U7w2 == null || (view = interfaceC767260U7w2.getView()) == null || view.getParent() == null || (interfaceC767260U7w = this.LLILLL) == null) {
            return;
        }
        interfaceC767260U7w.onDialogBackground();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 202258(0x31612, float:2.83424E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            super.onViewCreated(r6, r7)
            r0 = 2131370098(0x7f0a2072, float:1.8360193E38)
            android.view.View r2 = r6.findViewById(r0)
            Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
            r0 = 45
            r1.<init>(r5, r0)
            X.C786410Ut5.I7(r1, r2)
            r0 = 2131371375(0x7f0a256f, float:1.8362783E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.LL = r0
            X.0U5V r0 = r5.LLILLJJLI
            if (r0 == 0) goto L6f
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L70
            android.view.ViewParent r0 = r1.getParent()
            if (r0 != 0) goto L70
            android.view.ViewGroup r0 = r5.LL
            if (r0 == 0) goto L3d
            r0.addView(r1)
        L3d:
            X.0U5V r0 = r5.LLILLJJLI
            if (r0 == 0) goto L44
            r0.LIZLLL(r5)
        L44:
            if (r1 == 0) goto L49
            X.C500260Jjc.LLFFF(r1)
        L49:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r5.dataChannel
            if (r3 == 0) goto L59
            java.lang.Class<com.bytedance.android.live.effect.StickerSearchDialogEvent> r2 = com.bytedance.android.live.effect.StickerSearchDialogEvent.class
            kotlin.jvm.internal.AwS591S0100000_12 r1 = new kotlin.jvm.internal.AwS591S0100000_12
            r0 = 58
            r1.<init>(r5, r0)
            r3.BQ2(r5, r2, r1)
        L59:
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r5.dataChannel
            if (r3 == 0) goto L69
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastBgClearMemory> r2 = com.bytedance.android.livesdk.dataChannel.BroadcastBgClearMemory.class
            kotlin.jvm.internal.AwS591S0100000_12 r1 = new kotlin.jvm.internal.AwS591S0100000_12
            r0 = 59
            r1.<init>(r5, r0)
            r3.BQ2(r5, r2, r1)
        L69:
            if (r4 == 0) goto L6e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L6e:
            return
        L6f:
            r1 = 0
        L70:
            r5.dismiss()
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.LiveEffectContainerDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
