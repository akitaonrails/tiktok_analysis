package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KjD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525490KjD {
    public static final Map<String, Boolean> LIZ = new LinkedHashMap();

    public static final boolean LIZIZ(MediaModel mediaModel, boolean z) {
        if (mediaModel != null) {
            if (mediaModel.LJIIL() && mediaModel.onlineVideoUrl != null) {
                return true;
            }
            String strLJFF = mediaModel.LJFF();
            if (strLJFF != null) {
                if (z) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                    Object objValueOf = linkedHashMap.get(strLJFF);
                    if (objValueOf == null) {
                        objValueOf = Boolean.valueOf(C2286708xd.LIZJ(strLJFF));
                        linkedHashMap.put(strLJFF, objValueOf);
                    }
                    return ((Boolean) objValueOf).booleanValue();
                }
                boolean zLIZJ = C2286708xd.LIZJ(strLJFF);
                LIZ.put(strLJFF, Boolean.valueOf(zLIZJ));
                return zLIZJ;
            }
            return false;
        }
        return false;
    }

    public static final void LIZ(MediaModel mediaModel, boolean z, final Function1<? super Boolean, Unit> function1) {
        boolean zBooleanValue;
        if (mediaModel != null) {
            if (mediaModel.LJIIL() && mediaModel.onlineVideoUrl != null) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            final String strLJFF = mediaModel.LJFF();
            if (strLJFF != null) {
                if (z) {
                    Map<String, Boolean> map = LIZ;
                    if (map.containsKey(strLJFF)) {
                        Boolean bool = (Boolean) ((LinkedHashMap) map).get(strLJFF);
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        function1.invoke(Boolean.valueOf(zBooleanValue));
                        return;
                    }
                }
                C2286708xd.LIZIZ(new InterfaceC2286808xe() { // from class: X.0KjE
                    @Override // X.InterfaceC2286808xe
                    public final void LIZ(Object obj) {
                        boolean zBooleanValue2;
                        Boolean bool2;
                        if ((obj instanceof Boolean) && (bool2 = (Boolean) obj) != null) {
                            zBooleanValue2 = bool2.booleanValue();
                        } else {
                            zBooleanValue2 = false;
                        }
                        C525490KjD.LIZ.put(strLJFF, Boolean.valueOf(zBooleanValue2));
                        function1.invoke(Boolean.valueOf(zBooleanValue2));
                    }
                }, strLJFF, C289360BVu.LIZ());
                return;
            }
        }
        function1.invoke(Boolean.FALSE);
    }
}
