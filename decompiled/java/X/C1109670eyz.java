package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109670eyz extends AbstractC1112930f4F<C1109630eyv> {
    public final long LJIILLIIL;
    public final C1110250ezv LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1112930f4F
    public final boolean LIZ(C1109630eyv c1109630eyv) {
        C1109630eyv c1109630eyv2 = c1109630eyv;
        AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = c1109630eyv2.LIZIZ;
        boolean zLJIIIIZZ = LJIIIIZZ(c1109630eyv2.LIZ.LJFF, abstractC1110800f0o);
        if (super.LIZ(c1109630eyv2) && zLJIIIIZZ) {
            if (abstractC1110800f0o instanceof InterfaceC1109660eyy) {
                InterfaceC1109660eyy interfaceC1109660eyy = (InterfaceC1109660eyy) abstractC1110800f0o;
                interfaceC1109660eyy.LJJIII(true);
                interfaceC1109660eyy.LJIIJJI();
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1112930f4F
    public final MGetTranslationRequest.Text LJ(C1109630eyv c1109630eyv) {
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) c1109630eyv.LIZ.LIZ();
        if (interfaceC1112060f2q instanceof C1110310f01) {
            this.LJIIZILJ.getClass();
            return C1110250ezv.LIZ((C1110310f01) interfaceC1112060f2q);
        }
        if (interfaceC1112060f2q instanceof InterfaceC1109680ez0) {
            return ((InterfaceC1109680ez0) interfaceC1112060f2q).LJJLIIIJLJLI();
        }
        return null;
    }

    @Override // X.AbstractC1112930f4F
    public final List LIZLLL(List list, Map map) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) ((C1109630eyv) it2.next()).LIZ.LIZ();
            if (interfaceC1112060f2q instanceof InterfaceC759280TqQ) {
                if (interfaceC1112060f2q instanceof InterfaceC1109660eyy) {
                    ((InterfaceC1109660eyy) interfaceC1112060f2q).LJJIII(false);
                }
                if (interfaceC1112060f2q instanceof C1110310f01) {
                    this.LJIIZILJ.getClass();
                    C1110250ezv.LIZIZ(map, (C1110310f01) interfaceC1112060f2q);
                } else if (interfaceC1112060f2q instanceof InterfaceC1109680ez0) {
                    ((InterfaceC1109680ez0) interfaceC1112060f2q).LJJLIIIJJI(map);
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIIIZZ(boolean z, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o) {
        if (abstractC1110800f0o instanceof C1110310f01) {
            if (z) {
                return false;
            }
            C1110310f01 c1110310f01 = (C1110310f01) abstractC1110800f0o;
            if (c1110310f01.LJJIJIL || c1110310f01.LJJIJIIJIL || ((ChatMessage) c1110310f01.LJIL).contentLanguage.length() <= 0 || Intrinsics.LJFF(((ChatMessage) c1110310f01.LJIL).contentLanguage, "un") || Intrinsics.LJFF(((ChatMessage) c1110310f01.LJIL).contentLanguage, this.LJIIL) || !LIZJ(((ChatMessage) c1110310f01.LJIL).contentLanguage) || ((ChatMessage) c1110310f01.LJIL).userInfo.getId() == this.LJIILLIIL) {
                return false;
            }
            return true;
        }
        if (!(abstractC1110800f0o instanceof InterfaceC1109660eyy)) {
            return false;
        }
        return ((InterfaceC1109660eyy) abstractC1110800f0o).LJJLJLI();
    }

    public C1109670eyz(LifecycleOwner lifecycleOwner, long j, long j2, String str, boolean z) {
        super(lifecycleOwner, j, j2, str, true, z, null);
        this.LJIILLIIL = UserService.getInstance().user().getCurrentUserId();
        this.LJIIZILJ = new C1110250ezv();
    }
}
