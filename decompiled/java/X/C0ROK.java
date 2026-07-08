package X;

import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS129S0110000_11;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ROK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0ROK {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(C0ROM c0rom, C694940RNs c694940RNs) {
        ReusedUIAssem<?> reusedUIAssem;
        Object objNewInstance;
        ReusedUISlotAssem reusedUISlotAssem;
        C0ROU c0rou;
        AbstractC738140SxQ next;
        boolean z = c0rom.LIZIZ;
        List listLJ = c0rom.LJ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJ) {
            if (((C0ROM) obj).LIZIZ) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C0ROM) it2.next()).LJI());
        }
        c0rom.LIZJ(z, arrayList2, c694940RNs, new AwS412S0200000_11(c0rom, (C0ROM<VideoItemParams, C690870R8b>) c694940RNs, (C694940RNs) 77));
        Iterator it3 = c0rom.LJ().iterator();
        while (it3.hasNext()) {
            LIZ((C0ROM) it3.next(), c694940RNs);
        }
        if (c0rom instanceof C0ROL) {
            C0ROL c0rol = (C0ROL) c0rom;
            boolean z2 = c0rol.LIZIZ;
            if (c694940RNs != null && (reusedUIAssem = c694940RNs.LIZ) != null) {
                List<AbstractC738140SxQ> children = reusedUIAssem.getChildren();
                if (children != null) {
                    Iterator<AbstractC738140SxQ> it4 = children.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            C13IQ<?> c13iqLJFF = c0rol.LJFF();
                            if (c13iqLJFF != null) {
                                if (next.getClass().isAssignableFrom(C09R7.LIZ(c13iqLJFF))) {
                                    break;
                                }
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    AbstractC738140SxQ abstractC738140SxQ = next;
                    if (abstractC738140SxQ != null) {
                        c0rol.LJIIIIZZ(abstractC738140SxQ, z2, c694940RNs);
                        return;
                    }
                }
                if (!z2) {
                    return;
                }
                ViewGroup viewGroup = c694940RNs.LIZJ.get(c0rol.LJI());
                C13IQ<?> c13iqLJFF2 = c0rol.LJFF();
                if (c13iqLJFF2 != null) {
                    objNewInstance = C09R7.LIZ(c13iqLJFF2).newInstance();
                } else {
                    objNewInstance = null;
                }
                if (!(objNewInstance instanceof ReusedUISlotAssem) || (reusedUISlotAssem = (ReusedUISlotAssem) objNewInstance) == 0) {
                    return;
                }
                new AwS547S0100000_3(objNewInstance, 144);
                C0T6L.LIZLLL();
                if ((reusedUISlotAssem instanceof C0ROU) && (c0rou = (C0ROU) reusedUISlotAssem) != null) {
                    c0rou.pl(true);
                }
                C723830SaL.LIZ(reusedUIAssem, null, new AwS220S0300000_11((ReusedUIAssem) reusedUIAssem, (ReusedUIAssem<?>) reusedUISlotAssem, (ReusedUISlotAssem<? extends C03H5>) viewGroup, (ViewGroup) 26));
            }
        }
    }

    public static final C0ROM<VideoItemParams, C690870R8b> LIZIZ(C0ROM<VideoItemParams, C690870R8b> c0rom, String str) {
        if (Intrinsics.LJFF(c0rom.LJI(), str)) {
            return c0rom;
        }
        Iterator<C0ROM<VideoItemParams, C690870R8b>> it2 = c0rom.LJ().iterator();
        while (it2.hasNext()) {
            C0ROM<VideoItemParams, C690870R8b> c0romLIZIZ = LIZIZ(it2.next(), str);
            if (c0romLIZIZ != null) {
                return c0romLIZIZ;
            }
        }
        return null;
    }

    public static final boolean LIZJ(C0ROM<VideoItemParams, C690870R8b> c0rom, List<String> list) {
        boolean z = false;
        if (list == null) {
            return false;
        }
        boolean zContains = list.contains(c0rom.LJI());
        List<C0ROM<VideoItemParams, C690870R8b>> listLJ = c0rom.LJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
        Iterator<C0ROM<VideoItemParams, C690870R8b>> it2 = listLJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(LIZJ(it2.next(), list)));
        }
        if (!zContains) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((Boolean) it3.next()).booleanValue()) {
                        z = true;
                        break;
                    }
                }
            }
        } else {
            z = true;
            break;
        }
        c0rom.LIZIZ = z;
        return z;
    }

    public static final void LJ(C0ROM<VideoItemParams, C690870R8b> c0rom, C694940RNs c694940RNs) {
        c0rom.LJII(c694940RNs);
        Iterator<C0ROM<VideoItemParams, C690870R8b>> it2 = c0rom.LJ().iterator();
        while (it2.hasNext()) {
            LJ(it2.next(), c694940RNs);
        }
    }

    public static final void LIZLLL(C0ROP c0rop, C700950ReX c700950ReX, C694940RNs c694940RNs, VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        ViewGroup viewGroup;
        if (c700950ReX == null) {
            return;
        }
        Iterator<C700970ReZ> it2 = c700950ReX.LIZIZ.iterator();
        while (it2.hasNext()) {
            C0ROM<VideoItemParams, C690870R8b> c0romLIZIZ = LIZIZ(c0rop, it2.next().LIZJ);
            if (c0romLIZIZ != null && (viewGroup = c694940RNs.LIZJ.get(c0romLIZIZ.LJI())) != null) {
                boolean zLIZ = c0romLIZIZ.LIZ(videoItemParams, c690870R8b);
                new AwS129S0110000_11((C0ROM) c0romLIZIZ, (C0ROM<VideoItemParams, C690870R8b>) zLIZ, true);
                C0T6L.LIZLLL();
                C0ROR.LIZ(viewGroup, zLIZ, c0romLIZIZ.LIZLLL());
            }
        }
    }
}
