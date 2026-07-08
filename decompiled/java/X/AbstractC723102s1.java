package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC723102s1 implements InterfaceC1891350zJl {
    public static final int $stable = 8;
    public Map<String, ? extends Object> extraInfo = new LinkedHashMap();
    public int renderMode;

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public abstract String getGroupId();

    public abstract String getItemId();

    public final boolean isOnlineMode() {
        return this.renderMode == 0;
    }

    public final Map<String, Object> getExtraInfo() {
        return this.extraInfo;
    }

    public final int getRenderMode() {
        return this.renderMode;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final void initRenderMode(int i) {
        this.renderMode = i;
    }

    public final void setExtraInfo(Map<String, ? extends Object> map) {
        this.extraInfo = map;
    }
}
