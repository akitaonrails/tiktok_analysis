package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0Eee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369780Eee {
    public static final C369780Eee LIZ = new C369780Eee();

    static {
        C369140Edc.LIZ = AFwS191S0000000_5.get$arr$(358);
    }

    public static boolean LIZIZ() {
        return ((Boolean) C273460Ang.LIZ.getValue()).booleanValue();
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C379370Eu7.LIZIZ(videoPublishEditModel) && C0CHQ.LIZ().getAccountService().isLogin() && !((AccountUserService) C0XQ7.LJFF()).LIZ() && ((Boolean) C273470Anh.LIZ.getValue()).booleanValue() && videoPublishEditModel != null && !videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return true;
        }
        return false;
    }

    public static C380190EvR LIZJ(EnumC378720Et4 enumC378720Et4, List list) {
        ArrayList arrayList;
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        int i = C369790Eef.LIZ[enumC378720Et4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((C380190EvR) obj2).LJIIJ != null) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((C380190EvR) obj3).LJIIIZ != null) {
                            arrayList.add(obj3);
                        }
                    }
                }
            } else {
                arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((C380190EvR) obj4).LJIIIZ != null) {
                        arrayList.add(obj4);
                    }
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj5 : list) {
                if (((C380190EvR) obj5).LJIIJ != null) {
                    arrayList.add(obj5);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (C380190EvR) C13LP.LJJJJZI(arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!((C380190EvR) next).LJII) {
                obj = next;
                break;
            }
        }
        C380190EvR c380190EvR = (C380190EvR) obj;
        if (c380190EvR == null) {
            return (C380190EvR) C13LP.LJJJLL(arrayList);
        }
        return c380190EvR;
    }
}
