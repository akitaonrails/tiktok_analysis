package X;

import com.tiktok.myna.render.render.elements.MynaTypeAdapterFactory;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09CS(MynaTypeAdapterFactory.class)
public final class C1547320qMs implements InterfaceC1547330qMt {
    public static final C1547340qMu Companion = new C1547340qMu();
    public final Map<String, Object> LL;
    public final List<InterfaceC1547330qMt> LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC1547330qMt LLILZ;

    @Override // X.InterfaceC1547330qMt
    public InterfaceC1547330qMt root() {
        InterfaceC1547330qMt parent = this;
        while (parent != null && parent.getParent() != null) {
            parent = parent.getParent();
        }
        return parent;
    }

    @Override // X.InterfaceC1547330qMt
    public boolean getDisable() {
        Object obj = this.LL.get("disable");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return Intrinsics.LJFF(obj, Boolean.TRUE);
    }

    @Override // X.InterfaceC1547330qMt
    public boolean getExposureDeduplicate() {
        Object obj = this.LL.get("exposure_deduplicate");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return !Intrinsics.LJFF(obj, Boolean.FALSE);
    }

    @Override // X.InterfaceC1547330qMt
    public boolean getExposureLost() {
        Object obj = this.LL.get("exposure_lost");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return Intrinsics.LJFF(obj, Boolean.TRUE);
    }

    @Override // X.InterfaceC1547330qMt
    public float getExposureThreshold() {
        return C1337850kv1.LIZIZ(0.0f, this.LL.get("exposure_threshold"));
    }

    @Override // X.InterfaceC1547330qMt
    public String getNodeName() {
        String str;
        Object obj = this.LL.get("node_name");
        return (!(obj instanceof String) || (str = (String) obj) == null) ? "__MYNA_UNKNOWN__" : str;
    }

    @Override // X.InterfaceC1547330qMt
    public Map<String, Object> getParams() {
        Object obj = this.LL.get("params");
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // X.InterfaceC1547330qMt
    public String getType() {
        String str;
        String str2;
        Object obj = this.LL.get("name");
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            return str2;
        }
        Object obj2 = this.LL.get("type");
        return (!(obj2 instanceof String) || (str = (String) obj2) == null) ? "__MYNA_UNKNOWN__" : str;
    }

    @Override // X.InterfaceC1547330qMt
    public List<InterfaceC1547330qMt> getActions() {
        return this.LLILLJJLI;
    }

    public final Map<String, Object> getData() {
        return this.LL;
    }

    public final boolean getHasDynamicProp() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1547330qMt
    public InterfaceC1547330qMt getParent() {
        return this.LLILZ;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1547320qMs.class, cls)) {
            return false;
        }
        C1547320qMs c1547320qMs = (C1547320qMs) obj;
        if (Intrinsics.LJFF(this.LL, c1547320qMs.LL) && Intrinsics.LJFF(getActions(), c1547320qMs.getActions()) && this.LLILLL == c1547320qMs.LLILLL) {
            return true;
        }
        return false;
    }

    public final void setHasDynamicProp(boolean z) {
        this.LLILLL = z;
    }

    public final void setParentNode(InterfaceC1547330qMt interfaceC1547330qMt) {
        this.LLILZ = interfaceC1547330qMt;
    }

    public C1547320qMs(String str, Map<String, ? extends Object> map, String str2) {
        this((List) null, C2097608Jq.LJI(new Pair("type", str), new Pair("params", map), new Pair("next", str2)), 6);
    }

    public /* synthetic */ C1547320qMs(List list, Map map, int i) {
        this(false, (i & 2) != 0 ? null : list, (i & 1) != 0 ? new LinkedHashMap() : map);
    }

    public C1547320qMs(boolean z, List list, Map map) {
        this.LL = map;
        this.LLILLJJLI = list;
        this.LLILLL = z;
    }
}
