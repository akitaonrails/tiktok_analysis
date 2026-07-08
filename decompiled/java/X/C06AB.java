package X;

import com.bytedance.im.core.proto.MediaURLStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06AB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06AB implements C05GJ {
    public final List<String> LIZ = Collections.singletonList("load_message");
    public final C05GR LIZIZ = new C05GR(5);

    @Override // X.C05GJ
    public final void LIZIZ() {
    }

    @Override // X.C05GJ
    public final String getId() {
        return "chat_video_preload";
    }

    @Override // X.C05GJ
    public final C05GR LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C05GJ
    public final List<String> LIZJ() {
        return this.LIZ;
    }

    public static InterfaceC1329505If LJ(C869590Y9l c869590Y9l) {
        C0YC6 next;
        MediaURLStruct mediaURLStruct;
        List<String> list;
        if (c869590Y9l.getMsgType() == 1803) {
            Iterator<C0YC6> it2 = c869590Y9l.getAttachments().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.displayType, "play")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0YC6 c0yc6 = next;
            if (c0yc6 != null && (mediaURLStruct = c0yc6.mediaUrlStruct) != null && (list = mediaURLStruct.url_list) != null && C866950Xzh.LIZIZ(list)) {
                return new C047800Fg(String.valueOf(c869590Y9l.getMsgId()), C2097908Jt.LIZJ(new Pair("AWEME", C911220Zou.LJ(c869590Y9l, null))));
            }
        }
        String strLIZ = C0ZDX.LIZ(c869590Y9l);
        if (strLIZ == null) {
            return null;
        }
        return new C047700Ff(strLIZ, C2097908Jt.LIZJ(new Pair("MESSAGE", c869590Y9l)));
    }

    @Override // X.C05GJ
    public final Object LIZLLL(Object obj) {
        InterfaceC1329505If interfaceC1329505IfLJ;
        InterfaceC1329505If interfaceC1329505IfLJ2;
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (Iterable) obj) {
                if ((obj2 instanceof C869590Y9l) && (interfaceC1329505IfLJ2 = LJ((C869590Y9l) obj2)) != null) {
                    arrayList.add(interfaceC1329505IfLJ2);
                    if (arrayList.size() >= this.LIZIZ.LIZ) {
                        return arrayList;
                    }
                }
            }
        } else if ((obj instanceof C869590Y9l) && (interfaceC1329505IfLJ = LJ((C869590Y9l) obj)) != null) {
            arrayList.add(interfaceC1329505IfLJ);
            arrayList.size();
        }
        return arrayList;
    }
}
