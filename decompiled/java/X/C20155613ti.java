package X;

import android.net.Uri;
import android.util.LruCache;
import android.util.Size;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImageXConfigModel;
import com.ss.android.ugc.aweme.ecommerce.image.TemplateParamBean;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20155613ti {
    public static final LruCache<String, C20155613ti> LJIIL;
    public static final ConcurrentHashMap<String, C20155613ti> LJIILIIL;
    public final Uri LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<String> LJ;
    public final String LJFF;
    public final boolean LJI;
    public final EcomImageXConfigModel LJII;
    public final EcomImageAdaptSizeConfigModel LJIIIIZZ;
    public C1334140kp2 LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public C20155613ti() {
        throw null;
    }

    static {
        final LruCache<String, C20155613ti> lruCache = new LruCache<>(896);
        if (C1773900wGK.LIZIZ()) {
            C687360Qxi.LIZ(new InterfaceC687370Qxj() { // from class: X.13th
                @Override // X.InterfaceC687370Qxj
                public final void onLowMemory() {
                    lruCache.trimToSize(400);
                }
            });
        }
        LJIIL = lruCache;
        LJIILIIL = new ConcurrentHashMap<>();
        new LinkedHashMap();
    }

    public final Integer LIZIZ() {
        C20157013tw.LIZIZ.getClass();
        TemplateParamBean templateParamBean = (TemplateParamBean) ((Map) C20157013tw.LJI.getValue()).get(this.LIZLLL);
        Integer numValueOf = null;
        if (templateParamBean != null) {
            try {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(u.LJJIFFI(this.LJ.get(templateParamBean.quality), "q", "", false)));
                return numValueOf;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return numValueOf;
            }
        }
        if (!this.LJ.isEmpty()) {
            try {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(u.LJJIFFI((String) C13LP.LJJLIIIJJI(this.LJ), "q", "", false)));
                return numValueOf;
            } catch (CancellationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return numValueOf;
    }

    public final Size LIZJ() {
        C20157013tw.LIZIZ.getClass();
        TemplateParamBean templateParamBean = (TemplateParamBean) ((Map) C20157013tw.LJI.getValue()).get(this.LIZLLL);
        if (templateParamBean != null) {
            try {
                return new Size(CastIntegerProtector.parseInt(this.LJ.get(((Number) C13LP.LJJJJZI(templateParamBean.width)).intValue())), CastIntegerProtector.parseInt(this.LJ.get(((Number) C13LP.LJJJJZI(templateParamBean.height)).intValue())));
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        if (this.LJ.size() >= 2) {
            try {
                return new Size(CastIntegerProtector.parseInt(this.LJ.get(0)), CastIntegerProtector.parseInt(this.LJ.get(1)));
            } catch (CancellationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return null;
    }

    public final int hashCode() {
        return Objects.hashCode(this.LJIIJ);
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("~tplv-");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        return this.LJIIJ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        C20155613ti c20155613ti;
        String str = null;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C20155613ti.class, cls)) {
            return false;
        }
        String str2 = this.LJIIJ;
        if ((obj instanceof C20155613ti) && (c20155613ti = (C20155613ti) obj) != null) {
            str = c20155613ti.LJIIJ;
        }
        if (!Intrinsics.LJFF(str2, str)) {
            return false;
        }
        return true;
    }

    public C20155613ti(Uri uri, String str, String str2, String str3, List list, String str4, boolean z, EcomImageXConfigModel ecomImageXConfigModel, EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel, C1334140kp2 c1334140kp2) {
        this.LIZ = uri;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = list;
        this.LJFF = str4;
        this.LJI = z;
        this.LJII = ecomImageXConfigModel;
        this.LJIIIIZZ = ecomImageAdaptSizeConfigModel;
        this.LJIIIZ = c1334140kp2;
        String string = uri.toString();
        this.LJIIJ = string;
        this.LJIIJJI = C1334160kp4.LIZ(string);
    }
}
