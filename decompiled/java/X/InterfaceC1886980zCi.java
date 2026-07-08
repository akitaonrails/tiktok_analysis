package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0zCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1886980zCi extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "campaignInfo", nestedClassType = InterfaceC1887010zCl.class, required = true)
    InterfaceC1887010zCl getCampaignInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameplays", nestedClassType = InterfaceC1886990zCj.class, required = false)
    List<InterfaceC1886990zCj> getGameplays();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tasks", nestedClassType = InterfaceC1887000zCk.class, required = false)
    List<InterfaceC1887000zCk> getTasks();
}
