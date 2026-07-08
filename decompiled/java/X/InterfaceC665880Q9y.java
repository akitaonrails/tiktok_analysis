package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.0Q9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC665880Q9y extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "backtrace", required = false)
    String getBacktrace();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "count", required = true)
    Number getCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "curListLength", required = true)
    Number getCurListLength();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraRequest", required = false)
    Map<String, Object> getExtraRequest();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = false)
    String getKeyword();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logid", required = false)
    String getLogid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageContextHashCode", required = true)
    String getPageContextHashCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = fe.e, required = true)
    String getSessionid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uniqueId", required = false)
    String getUniqueId();
}
