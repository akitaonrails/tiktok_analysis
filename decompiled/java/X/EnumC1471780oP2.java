package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1471780oP2 {
    public static final EnumC1471780oP2 INS;
    public static final /* synthetic */ EnumC1471780oP2[] LLILZLL;
    public boolean LL = true;
    public final Map<C1474420oTI, C1471810oP5> LLILLJJLI = new HashMap();
    public final Map<C1474420oTI, C1471810oP5> LLILLL = new HashMap();
    public final Queue<C1474420oTI> LLILZ = new LinkedList();
    public final Queue<C1474420oTI> LLILZIL = new LinkedList();

    public synchronized List<C1471810oP5> getTraceInfoList() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        while (!this.LLILZ.isEmpty()) {
            arrayList.add(((HashMap) this.LLILLJJLI).remove(((LinkedList) this.LLILZ).poll()));
        }
        return arrayList;
    }

    static {
        EnumC1471780oP2 enumC1471780oP2 = new EnumC1471780oP2();
        INS = enumC1471780oP2;
        LLILZLL = new EnumC1471780oP2[]{enumC1471780oP2};
    }

    public static EnumC1471780oP2[] values() {
        return (EnumC1471780oP2[]) LLILZLL.clone();
    }

    public boolean isEnable() {
        return this.LL;
    }

    public static EnumC1471780oP2 valueOf(String str) {
        return (EnumC1471780oP2) C08FF.LIZ(EnumC1471780oP2.class, str);
    }

    public final C1471810oP5 LJFF(C1474420oTI c1474420oTI) {
        if (((HashMap) this.LLILLJJLI).containsKey(c1474420oTI)) {
            return (C1471810oP5) ((HashMap) this.LLILLJJLI).get(c1474420oTI);
        }
        if (((HashMap) this.LLILLL).containsKey(c1474420oTI)) {
            return (C1471810oP5) ((HashMap) this.LLILLL).get(c1474420oTI);
        }
        return null;
    }

    public void setEnable(boolean z) {
        this.LL = z;
    }

    public final boolean LJI(C1474420oTI c1474420oTI, EnumC1474270oT3 enumC1474270oT3) {
        Object objPoll;
        if (c1474420oTI == null) {
            return false;
        }
        if (!this.LL) {
            ((HashMap) this.LLILLJJLI).clear();
            ((LinkedList) this.LLILZ).clear();
            ((LinkedList) this.LLILZIL).clear();
            ((HashMap) this.LLILLL).clear();
            return false;
        }
        if (!((LinkedList) this.LLILZ).contains(c1474420oTI)) {
            if (!((LinkedList) this.LLILZIL).contains(c1474420oTI)) {
                if (((LinkedList) this.LLILZIL).size() >= 5) {
                    ((HashMap) this.LLILLL).remove(((LinkedList) this.LLILZIL).poll());
                }
                ((LinkedList) this.LLILZIL).offer(c1474420oTI);
                ((HashMap) this.LLILLL).put(c1474420oTI, new C1471810oP5());
            }
            if (enumC1474270oT3 == EnumC1474270oT3.LAYER_HOST_PLAY && (objPoll = ((LinkedList) this.LLILZIL).poll()) != null) {
                if (((LinkedList) this.LLILZ).size() >= 3) {
                    ((HashMap) this.LLILLJJLI).remove(((LinkedList) this.LLILZ).poll());
                }
                ((LinkedList) this.LLILZ).offer(objPoll);
                ((HashMap) this.LLILLJJLI).put(objPoll, ((HashMap) this.LLILLL).remove(objPoll));
            }
        }
        if (!((HashMap) this.LLILLJJLI).containsKey(c1474420oTI) && !((HashMap) this.LLILLL).containsKey(c1474420oTI)) {
            return false;
        }
        return true;
    }

    public synchronized void updateVolume(C1474420oTI c1474420oTI, float f, float f2) {
        if (!LJI(c1474420oTI, null)) {
            return;
        }
        LJFF(c1474420oTI);
    }

    public static void LIZJ(C1471810oP5 c1471810oP5, C1474420oTI c1474420oTI, EnumC1474270oT3 enumC1474270oT3, InterfaceC1471800oP4 interfaceC1471800oP4) {
        if (c1474420oTI != null) {
            int i = C1471790oP3.LIZ[enumC1474270oT3.ordinal()];
            if (i != 1) {
                if (i == 2 && interfaceC1471800oP4 != null) {
                    C1474520oTS c1474520oTSLIZ = interfaceC1471800oP4.LIZ();
                    if (c1474520oTSLIZ != null) {
                        c1474520oTSLIZ.LIZ(7);
                        c1474520oTSLIZ.LIZ(8);
                        c1474520oTSLIZ.LIZ(6);
                    }
                    interfaceC1471800oP4.getResolution();
                    return;
                }
                return;
            }
            if (c1474420oTI.LIZLLL != null) {
                new Pair("video_model", c1474420oTI.LIZ);
                return;
            }
            if (!TextUtils.isEmpty(null)) {
                new Pair("local_url", null);
            } else if (!TextUtils.isEmpty(c1474420oTI.LJ)) {
                new Pair("video_url", c1474420oTI.LJ);
            } else {
                new Pair("vid", c1474420oTI.LIZ);
            }
        }
    }

    public synchronized void trace(C1474420oTI c1474420oTI, EnumC1474270oT3 enumC1474270oT3, String str, Object obj, InterfaceC1471800oP4 interfaceC1471800oP4) {
        if (!LJI(c1474420oTI, enumC1474270oT3)) {
            return;
        }
        C1471810oP5 c1471810oP5LJFF = LJFF(c1474420oTI);
        if (c1471810oP5LJFF != null) {
            List arrayList = c1471810oP5LJFF.LIZ;
            LIZJ(c1471810oP5LJFF, c1474420oTI, enumC1474270oT3, interfaceC1471800oP4);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1471810oP5LJFF.LIZ = arrayList;
            }
            arrayList.add(new C08F7(enumC1474270oT3, str, obj));
        }
    }

    public synchronized void updateTextureSize(C1474420oTI c1474420oTI, int i, int i2, int i3, int i4, float f, Context context) {
        EnumC1474270oT3 enumC1474270oT3 = EnumC1474270oT3.TEXTURE_SIZE;
        if (!LJI(c1474420oTI, enumC1474270oT3)) {
            return;
        }
        C1471810oP5 c1471810oP5LJFF = LJFF(c1474420oTI);
        if (c1471810oP5LJFF != null) {
            List arrayList = c1471810oP5LJFF.LIZ;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1471810oP5LJFF.LIZ = arrayList;
            }
            int iLIZLLL = C1486280omQ.LIZLLL(context);
            int iLIZJ = C1486280omQ.LIZJ(context);
            int iLIZIZ = C1486280omQ.LIZIZ(context);
            if (i <= i3 && i2 <= i4 && iLIZIZ != 1 && iLIZIZ != 9 && iLIZIZ != 0 && iLIZIZ != 8) {
                Math.max(i3, i4);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("texture:[");
            sbLIZ.append(i);
            sbLIZ.append(",");
            sbLIZ.append(i2);
            sbLIZ.append("];parent:[");
            sbLIZ.append(i3);
            sbLIZ.append(",");
            sbLIZ.append(i4);
            sbLIZ.append("];screen:[");
            sbLIZ.append(iLIZLLL);
            sbLIZ.append(",");
            sbLIZ.append(iLIZJ);
            sbLIZ.append("];scale:");
            sbLIZ.append(f);
            arrayList.add(new C08F7(enumC1474270oT3, C2188811AlT.LIZIZ(sbLIZ), null));
        }
    }
}
