package X;

import com.tiktok.myna.render.render.elements.MynaTypeAdapterFactory;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09CS(MynaTypeAdapterFactory.class)
public interface InterfaceC1547330qMt extends Serializable {
    List<InterfaceC1547330qMt> getActions();

    boolean getDisable();

    boolean getExposureDeduplicate();

    boolean getExposureLost();

    float getExposureThreshold();

    String getNodeName();

    Map<String, Object> getParams();

    InterfaceC1547330qMt getParent();

    String getType();

    InterfaceC1547330qMt root();
}
