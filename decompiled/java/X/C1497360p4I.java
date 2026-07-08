package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0p4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1497360p4I extends C1497100p3s {
    public C1497360p4I(C1497390p4L c1497390p4L) {
        super(c1497390p4L);
    }

    public C1497360p4I(Context context, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            linkedHashSet.add(context.getClassLoader().loadClass("com.ttnet.org.chromium.net.impl.NativeCronetProvider").asSubclass(AbstractC1497370p4J.class).getConstructor(Context.class).newInstance(context));
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (InstantiationException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (NoSuchMethodException e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (InvocationTargetException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(new ArrayList(linkedHashSet)));
        if (arrayList.size() != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbstractC1497370p4J) it2.next()).LIZLLL();
            }
            if (arrayList.size() != 0) {
                Collections.sort(arrayList, new Comparator<AbstractC1497370p4J>() { // from class: X.0p4K
                    @Override // java.util.Comparator
                    public final int compare(AbstractC1497370p4J abstractC1497370p4J, AbstractC1497370p4J abstractC1497370p4J2) {
                        int iSignum;
                        AbstractC1497370p4J abstractC1497370p4J3 = abstractC1497370p4J;
                        AbstractC1497370p4J abstractC1497370p4J4 = abstractC1497370p4J2;
                        abstractC1497370p4J3.LIZIZ();
                        abstractC1497370p4J4.LIZIZ();
                        abstractC1497370p4J3.LIZJ();
                        abstractC1497370p4J4.LIZJ();
                        String[] strArrSplit = "107.0.5273.2".split("\\.");
                        String[] strArrSplit2 = "107.0.5273.2".split("\\.");
                        for (int i = 0; i < strArrSplit.length && i < strArrSplit2.length; i++) {
                            try {
                                int i2 = CastIntegerProtector.parseInt(strArrSplit[i]);
                                int i3 = CastIntegerProtector.parseInt(strArrSplit2[i]);
                                if (i2 != i3) {
                                    iSignum = Integer.signum(i2 - i3);
                                    break;
                                }
                            } catch (NumberFormatException e6) {
                                TryCatchGuardChecker.doCheck(e6);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unable to convert version segments into integers: ");
                                sbLIZ.append(strArrSplit[i]);
                                sbLIZ.append(" & ");
                                sbLIZ.append(strArrSplit2[i]);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e6);
                            }
                        }
                        iSignum = Integer.signum(strArrSplit.length - strArrSplit2.length);
                        return -iSignum;
                    }
                });
                super(((AbstractC1497370p4J) ListProtector.get(arrayList, 0)).LIZ(z).LIZ);
                return;
            }
            throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
        }
        throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
    }
}
