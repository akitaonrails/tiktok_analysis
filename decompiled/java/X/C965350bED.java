package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0bED, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965350bED implements InterfaceC2181441AZa {
    public final /* synthetic */ C965340bEC LIZ;

    @Override // X.InterfaceC2181441AZa
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC2181441AZa
    public final String LIZ() {
        C955320ay2 c955320ay2LJJLIIIJL;
        String str;
        InterfaceC964790bDJ interfaceC964790bDJLLJLILLLLZIIL = this.LIZ.LLJLILLLLZIIL();
        if (!(interfaceC964790bDJLLJLILLLLZIIL instanceof C1AXM)) {
            return (!(interfaceC964790bDJLLJLILLLLZIIL instanceof C2181461AZc) || (c955320ay2LJJLIIIJL = ((C2181461AZc) interfaceC964790bDJLLJLILLLLZIIL).LJJLIIIJL()) == null || (str = c955320ay2LJJLIIIJL.LIZIZ) == null) ? "" : str;
        }
        String layoutName = ((C1AXM) interfaceC964790bDJLLJLILLLLZIIL).LJLI().getLayoutName();
        return layoutName != null ? layoutName : "";
    }

    @Override // X.InterfaceC2181441AZa
    public final String getChannelId() {
        return String.valueOf(this.LIZ.LJFF.LIZLLL);
    }

    @Override // X.InterfaceC2181441AZa
    public final String getLinkMicId() {
        return this.LIZ.LJFF.LJJIJIIJI();
    }

    @Override // X.InterfaceC2181441AZa
    public final String getRoomId() {
        return String.valueOf(this.LIZ.LIZLLL.getId());
    }

    @Override // X.InterfaceC2181441AZa
    public final int getScene() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC2181441AZa
    public final int zt() {
        C965340bEC c965340bEC = this.LIZ;
        if (c965340bEC.LJ) {
            return 2;
        }
        int i = c965340bEC.LJFF.LJIIIIZZ;
        if (!this.LIZ.LJIILIIL()) {
            return LinkMicState.Companion.isJoiningOrJoinedOrLinked(i) ? 1 : 0;
        }
        C914780Zue c914780Zue = this.LIZ.LJFF.LJIIIZ;
        return (C954950axR.LIZJ(c914780Zue.LIZ) || C954950axR.LIZIZ(c914780Zue.LIZIZ)) ? 1 : 0;
    }

    @Override // X.InterfaceC2181441AZa
    public final String getUserId() {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public C965350bED(C965340bEC c965340bEC) {
        this.LIZ = c965340bEC;
    }

    public static final String LIZJ(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Scene[");
                    sbLIZ.append(i);
                    sbLIZ.append(']');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return "Multi";
            }
            return "Cross";
        }
        return "Union";
    }
}
