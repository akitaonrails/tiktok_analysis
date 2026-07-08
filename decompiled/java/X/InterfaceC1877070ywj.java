package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ywj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1877070ywj extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "battleEnable", required = true)
    Number getBattleEnable();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "directBattleEnable", required = true)
    Number getDirectBattleEnable();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "battleEnable", required = true)
    void setBattleEnable(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "directBattleEnable", required = true)
    void setDirectBattleEnable(Number number);
}
