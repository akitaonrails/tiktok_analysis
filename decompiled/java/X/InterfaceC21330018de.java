package X;

import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.MynaTemplateMeta;
import com.tiktok.myna.render.render.elements.MynaTypeAdapterFactory;
import com.tiktok.myna.render.render.widget.animation.MynaAnimationKeyframe;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09CS(MynaTypeAdapterFactory.class)
public interface InterfaceC21330018de extends Serializable {
    Map<String, InterfaceC1547330qMt> getAction();

    Map<String, Object> getActiveStyle();

    Map<String, List<MynaAnimationKeyframe>> getAnimations();

    Map<String, Object> getAttr();

    List<MynaElement> getElements();

    MynaTemplateMeta getMeta();

    Map<String, Object> getProps();

    Map<String, Object> getStyle();

    String getType();
}
