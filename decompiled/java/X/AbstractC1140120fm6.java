package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0fm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1140120fm6<O> {
    public final O LIZ;

    public AbstractC1140120fm6() {
        throw null;
    }

    public final Throwable LIZ() {
        C1140190fmD c1140190fmD;
        if (!(this instanceof C1140190fmD) || (c1140190fmD = (C1140190fmD) this) == null) {
            return null;
        }
        return c1140190fmD.LIZIZ;
    }

    public final String LIZIZ() {
        String str;
        String str2;
        if (this instanceof C1140240fmI) {
            C1140240fmI c1140240fmI = (C1140240fmI) this;
            return (c1140240fmI == null || (str2 = c1140240fmI.LIZJ) == null) ? "" : str2;
        }
        if (!(this instanceof C1140190fmD)) {
            return "";
        }
        C1140190fmD c1140190fmD = (C1140190fmD) this;
        if (c1140190fmD != null && (str = c1140190fmD.LIZJ) != null) {
            return str;
        }
        Map<Integer, String> map = C1138350fjF.LIZ;
        return C1138350fjF.LIZJ(LIZ());
    }

    public O LIZJ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1140120fm6(Object obj) {
        this.LIZ = obj;
    }
}
