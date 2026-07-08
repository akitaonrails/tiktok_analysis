package com.bytedance.amg.minigameruntime.api;

import X.C1288290jd5;
import X.C1304040k2U;
import X.InterfaceC1304030k2T;
import android.app.Activity;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes21.dex */
public final class MiniGameRuntimeManager {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        public final void destroyMiniGameRuntime(IMiniGameRuntimeAPI iMiniGameRuntimeAPI) {
        }

        public final IMiniGameRuntimeAPI createMiniGameRuntimeWithCustomView(InitParams initParams, InterfaceC1304030k2T interfaceC1304030k2T) {
            C1304040k2U c1304040k2U = new C1304040k2U(initParams);
            c1304040k2U.LJIIIIZZ = interfaceC1304030k2T;
            return c1304040k2U;
        }

        public final IMiniGameRuntimeAPI createMiniGameRuntime(InitParams initParams, Activity activity, SurfaceView surfaceView) {
            C1304040k2U c1304040k2U = new C1304040k2U(initParams);
            c1304040k2U.LJIIIIZZ = new C1288290jd5(activity, surfaceView);
            return c1304040k2U;
        }
    }
}
