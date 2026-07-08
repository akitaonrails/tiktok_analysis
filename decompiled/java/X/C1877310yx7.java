package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877310yx7 extends AbstractC1877280yx4 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Fragment fragment;
        Context context;
        View view;
        Object c098200Yq;
        InterfaceC1877300yx6 interfaceC1877300yx6 = (InterfaceC1877300yx6) xBaseParamModel;
        Map<String, Object> music = interfaceC1877300yx6.getMusic();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Context context2 = null;
        String containerID = null;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
            try {
                c098200Yq = FragmentManager.LJJJJLL(view);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            fragment = (Fragment) c098200Yq;
        } else {
            fragment = null;
        }
        if (music == null) {
            C20501815Ke c20501815Ke = C20501715Kd.LIZ;
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                context = interfaceC634840OvC2.getContext();
            } else {
                context = null;
            }
            Pair pairLIZIZ = C20501715Kd.LIZIZ(C1871830yoH.LIZ(context), fragment, new C1877320yx8(null, interfaceC1877300yx6.getSourceId(), interfaceC1877300yx6.getExtra()));
            if (pairLIZIZ != null) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID = interfaceC634840OvC3.getContainerID();
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1877270yx3.class, containerID);
                InterfaceC1877270yx3 interfaceC1877270yx3 = (InterfaceC1877270yx3) xBaseModelLIZJ;
                Number number = (Number) pairLIZIZ.getSecond();
                if (number == null) {
                    number = 0;
                }
                interfaceC1877270yx3.setStatus(number);
                interfaceC1877270yx3.setSourceId(interfaceC1877300yx6.getSourceId());
                Map<String, ? extends Object> extra = interfaceC1877300yx6.getExtra();
                if (extra == null) {
                    extra = C2097608Jq.LJ();
                }
                interfaceC1877270yx3.setExtra(extra);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            return;
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, Object> music2 = interfaceC1877300yx6.getMusic();
            c1227904rF.getClass();
            Music music3 = (Music) C1227904rF.LIZIZ(C1227904rF.LJI(music2), Music.class);
            C20501815Ke c20501815Ke2 = C20501715Kd.LIZ;
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                context2 = interfaceC634840OvC4.getContext();
            }
            C20501715Kd.LIZIZ(C1871830yoH.LIZ(context2), fragment, new C1877320yx8(music3, interfaceC1877300yx6.getSourceId(), interfaceC1877300yx6.getExtra()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
