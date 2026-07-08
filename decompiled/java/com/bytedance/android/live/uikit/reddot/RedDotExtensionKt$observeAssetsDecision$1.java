package com.bytedance.android.live.uikit.reddot;

import X.C09AJ;
import X.C09JN;
import X.C0UX6;
import X.C11JF;
import X.C11O8;
import X.C1701940uOG;
import X.C356901a3;
import X.C480460Ism;
import X.C782850UnL;
import X.InterfaceC1487280oo2;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.uikit.uisetting.MessageNotifyConfig;
import com.bytedance.android.live.uikit.uisetting.api.LiveMessageConfigApiService;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class RedDotExtensionKt$observeAssetsDecision$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public C11JF LL;
    public final /* synthetic */ C0UX6 LLILLJJLI;
    public final /* synthetic */ C0UX6 LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        boolean zLJI = MethodIDManager.LJI(202264);
        LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
        C0UX6 c0ux6 = this.LLILLJJLI;
        LiveMessageConfigApiService.LIZ.getClass();
        C480460Ism.LIZ().getClass();
        C11O8 c11o8LJJJLZIJ = ((LiveMessageConfigApiService) C480460Ism.LIZLLL(LiveMessageConfigApiService.class)).requestSetting(C782850UnL.LJ, new String[]{c0ux6.getCurrentId()}[0]).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0UnF
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Map<String, LiveMessagePlatformRedDotConfig> map;
                MessageNotifyConfig messageNotifyConfig = (MessageNotifyConfig) ((BaseResponse) obj).data;
                if (messageNotifyConfig == null || (map = messageNotifyConfig.redDotConfig) == null) {
                    return new HashMap();
                }
                return map;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ());
        final C0UX6 c0ux62 = this.LLILLJJLI;
        final C0UX6 c0ux63 = this.LLILLL;
        final LifecycleOwner lifecycleOwner2 = this.LLILZ;
        final View view = this.LLILZIL;
        final Function1<Boolean, Unit> function1 = this.LLILZLL;
        final String str = this.LLIZ;
        this.LL = (C11JF) c11o8LJJJLZIJ.LJJLJLI(new C09JN(this, c0ux63, lifecycleOwner2, view, function1, str) { // from class: X.0UnA
            public final /* synthetic */ C0UX6 LLILLJJLI;
            public final /* synthetic */ LifecycleOwner LLILLL;
            public final /* synthetic */ View LLILZ;
            public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
            public final /* synthetic */ String LLILZLL;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LLILLJJLI = c0ux63;
                this.LLILLL = lifecycleOwner2;
                this.LLILZ = view;
                this.LLILZIL = function1;
                this.LLILZLL = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r26) {
                /*
                    Method dump skipped, instruction units count: 205
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C782740UnA.accept(java.lang.Object):void");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLILLJJLI.setShowing(false);
        C11JF c11jf = this.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public RedDotExtensionKt$observeAssetsDecision$1(View view, LifecycleOwner lifecycleOwner, C0UX6 c0ux6, C0UX6 c0ux62, String str, Function1 function1) {
        this.LLILLJJLI = c0ux6;
        this.LLILLL = c0ux62;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = view;
        this.LLILZLL = function1;
        this.LLIZ = str;
    }
}
