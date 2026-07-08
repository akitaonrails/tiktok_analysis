package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460830o7N {
    public static final C1460830o7N LIZ = new C1460830o7N();
    public static List<? extends Effect> LIZIZ = new ArrayList(0);

    public static boolean LIZJ() {
        if (LIZIZ.isEmpty()) {
            return false;
        }
        List<? extends Effect> list = LIZIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<? extends Effect> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!C2354709Kn.LIZIZ(it2.next().getUnzipPath())) {
                return false;
            }
        }
        return true;
    }

    public static String LIZ(String str) {
        String str2;
        Effect next;
        Object objLJJJLZIJ;
        if (Intrinsics.LJFF(str, "adjust_item_enhance")) {
            str2 = "color_enhance";
        } else {
            str2 = "basic";
        }
        Iterator<? extends Effect> it2 = LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                List<String> tags = next.getTags();
                if (tags != null) {
                    objLJJJLZIJ = C13LP.LJJJLZIJ(0, tags);
                } else {
                    objLJJJLZIJ = null;
                }
                if (Intrinsics.LJFF(objLJJJLZIJ, str2)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Effect effect = next;
        if (effect == null || !C2354709Kn.LIZIZ(effect.getUnzipPath())) {
            return null;
        }
        return effect.getUnzipPath();
    }

    public static boolean LIZIZ(EffectChannelResponse effectChannelResponse, InterfaceC1460950o7Z interfaceC1460950o7Z) {
        String str;
        List<Effect> allCategoryEffects = effectChannelResponse.getAllCategoryEffects();
        LIZIZ = allCategoryEffects;
        if (allCategoryEffects.isEmpty()) {
            return false;
        }
        for (Effect effect : LIZIZ) {
            LIZ.getClass();
            if (C2354709Kn.LIZIZ(effect.getUnzipPath())) {
                List<String> tags = effect.getTags();
                if (tags != null && (str = (String) C13LP.LJJJLZIJ(0, tags)) != null && interfaceC1460950o7Z != null) {
                    interfaceC1460950o7Z.onSuccess(str);
                }
            } else {
                C1633850scR.LIZ(C0CHQ.LIZ, null).LIZJ(effect, new C1466750oGv(effect, interfaceC1460950o7Z, 0));
            }
        }
        return true;
    }
}
