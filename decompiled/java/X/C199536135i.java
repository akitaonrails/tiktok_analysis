package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.AbstractMap;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: X.135i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199536135i extends AbstractMap<String, Object> implements Cloneable {
    public Map<String, Object> LL;
    public final C199544135q LLILLJJLI;

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.LLILLJJLI);
    }

    public C199536135i() {
        this(EnumSet.noneOf(EnumC1528570psd.class));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return new C199538135k(this);
    }

    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public C199536135i clone() {
        try {
            C199536135i c199536135i = (C199536135i) super.clone();
            C199533135f.LIZIZ(this, c199536135i);
            c199536135i.LL = (Map) C199533135f.LIZ(this.LL);
            return c199536135i;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException(e);
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenericData{classInfo=");
        sbLIZ.append(this.LLILLJJLI.LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append(super.toString());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C199536135i(EnumSet<EnumC1528570psd> enumSet) {
        this.LL = new C19899212tS();
        this.LLILLJJLI = C199544135q.LIZIZ(getClass(), enumSet.contains(EnumC1528570psd.IGNORE_CASE));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C199536135i)) {
            return false;
        }
        C199536135i c199536135i = (C199536135i) obj;
        if (super.equals(c199536135i) && Objects.equals(this.LLILLJJLI, c199536135i.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String lowerCase = (String) obj;
        C199545135r c199545135rLIZ = this.LLILLJJLI.LIZ(lowerCase);
        if (c199545135rLIZ != null) {
            return c199545135rLIZ.LIZ(this);
        }
        if (this.LLILLJJLI.LIZ) {
            lowerCase = lowerCase.toLowerCase(Locale.US);
        }
        return this.LL.get(lowerCase);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            LIZIZ(entry.getValue(), entry.getKey());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String lowerCase = (String) obj;
        if (this.LLILLJJLI.LIZ(lowerCase) == null) {
            if (this.LLILLJJLI.LIZ) {
                lowerCase = lowerCase.toLowerCase(Locale.US);
            }
            return this.LL.remove(lowerCase);
        }
        throw new UnsupportedOperationException();
    }

    public void LIZIZ(Object obj, String str) {
        C199545135r c199545135rLIZ = this.LLILLJJLI.LIZ(str);
        if (c199545135rLIZ != null) {
            c199545135rLIZ.LIZLLL(this, obj);
            return;
        }
        if (this.LLILLJJLI.LIZ) {
            str = str.toLowerCase(Locale.US);
        }
        this.LL.put(str, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String lowerCase = (String) obj;
        C199545135r c199545135rLIZ = this.LLILLJJLI.LIZ(lowerCase);
        if (c199545135rLIZ != null) {
            Object objLIZ = c199545135rLIZ.LIZ(this);
            c199545135rLIZ.LIZLLL(this, obj2);
            return objLIZ;
        }
        if (this.LLILLJJLI.LIZ) {
            lowerCase = lowerCase.toLowerCase(Locale.US);
        }
        return this.LL.put(lowerCase, obj2);
    }
}
