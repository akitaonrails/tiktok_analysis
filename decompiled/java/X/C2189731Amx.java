package X;

import com.ss.android.ugc.aweme.feed.assem.digg.LongPressDiggAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.create.BulletinBoardCreateAnimAssem;
import com.ss.android.ugc.feed.platform.cell.ability.VideoDiggAssemAbility;

/* JADX INFO: renamed from: X.1Amx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189731Amx implements InterfaceC21641019mi {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$0(C2189731Amx c2189731Amx, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$1(C2189731Amx c2189731Amx, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    public static final void LIZIZ$3(C2189731Amx c2189731Amx, InterfaceC1844880y6o interfaceC1844880y6o) {
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZ$2(this, interfaceC1844880y6o);
                break;
            case 3:
                LIZ$3(this, interfaceC1844880y6o);
                break;
        }
    }

    @Override // X.InterfaceC21641019mi
    public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, interfaceC1844880y6o);
                break;
            case 1:
                LIZIZ$1(this, interfaceC1844880y6o);
                break;
            case 2:
                LIZIZ$2(this, interfaceC1844880y6o);
                break;
            case 3:
                LIZIZ$3(this, interfaceC1844880y6o);
                break;
        }
    }

    public C2189731Amx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C2189731Amx c2189731Amx, InterfaceC1844880y6o interfaceC1844880y6o) {
        LongPressDiggAssem longPressDiggAssem = (LongPressDiggAssem) c2189731Amx.l0;
        if (longPressDiggAssem.LLLIIIIL == 2) {
            longPressDiggAssem.Ep();
        }
        ((LongPressDiggAssem) c2189731Amx.l0).reset();
    }

    public static final void LIZ$1(C2189731Amx c2189731Amx, InterfaceC1844880y6o interfaceC1844880y6o) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animation finish, current aid = ");
        sbLIZ.append(((LongPressDiggAssem) c2189731Amx.l0).LLJLL);
        sbLIZ.append(", perform repost & reset");
        C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
        ((LongPressDiggAssem) c2189731Amx.l0).Ep();
        ((LongPressDiggAssem) c2189731Amx.l0).reset();
    }

    public static final void LIZ$2(C2189731Amx c2189731Amx, InterfaceC1844880y6o interfaceC1844880y6o) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((LongPressDiggAssem) c2189731Amx.l0).LLJLL);
        sbLIZ.append(" process end, current state = ");
        sbLIZ.append(((LongPressDiggAssem) c2189731Amx.l0).LLLIIIIL);
        sbLIZ.append(", progress = ");
        sbLIZ.append(interfaceC1844880y6o.getProgress());
        C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
        LongPressDiggAssem longPressDiggAssem = (LongPressDiggAssem) c2189731Amx.l0;
        if (!longPressDiggAssem.LLLIIIL && longPressDiggAssem.LLLIIIIL == 1 && interfaceC1844880y6o.getProgress() >= ((Number) C1EAU.LJIIIIZZ.getValue()).floatValue()) {
            LongPressDiggAssem longPressDiggAssem2 = (LongPressDiggAssem) c2189731Amx.l0;
            longPressDiggAssem2.LLLIIIL = true;
            longPressDiggAssem2.LLLIIIIL = 2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(((LongPressDiggAssem) c2189731Amx.l0).LLJLL);
            sbLIZ2.append(" perform success in onEnd, current state = ");
            sbLIZ2.append(((LongPressDiggAssem) c2189731Amx.l0).LLLIIIIL);
            C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ2));
            VideoDiggAssemAbility videoDiggAssemAbility = (VideoDiggAssemAbility) ((LongPressDiggAssem) c2189731Amx.l0).LLJL.getValue();
            if (videoDiggAssemAbility != null) {
                videoDiggAssemAbility.Yy0();
            }
            ((LongPressDiggAssem) c2189731Amx.l0).tp();
        }
    }

    public static final void LIZ$3(C2189731Amx c2189731Amx, InterfaceC1844880y6o interfaceC1844880y6o) {
        ((BulletinBoardCreateAnimAssem) c2189731Amx.l0).LLJLIL++;
    }

    public static final void LIZIZ$2(C2189731Amx c2189731Amx, InterfaceC1844880y6o interfaceC1844880y6o) {
        LongPressDiggAssem longPressDiggAssem = (LongPressDiggAssem) c2189731Amx.l0;
        if (!longPressDiggAssem.LLLIIIL && longPressDiggAssem.LLLIIIIL == 1 && interfaceC1844880y6o.getProgress() >= ((Number) C1EAU.LJIIIIZZ.getValue()).floatValue()) {
            LongPressDiggAssem longPressDiggAssem2 = (LongPressDiggAssem) c2189731Amx.l0;
            longPressDiggAssem2.LLLIIIL = true;
            longPressDiggAssem2.LLLIIIIL = 2;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((LongPressDiggAssem) c2189731Amx.l0).LLJLL);
            sbLIZ.append(" perform success at progress ");
            sbLIZ.append(interfaceC1844880y6o.getProgress());
            sbLIZ.append(", current state = ");
            sbLIZ.append(((LongPressDiggAssem) c2189731Amx.l0).LLLIIIIL);
            C1720106oR.LJI("LongPressDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
            VideoDiggAssemAbility videoDiggAssemAbility = (VideoDiggAssemAbility) ((LongPressDiggAssem) c2189731Amx.l0).LLJL.getValue();
            if (videoDiggAssemAbility != null) {
                videoDiggAssemAbility.Yy0();
            }
            ((LongPressDiggAssem) c2189731Amx.l0).tp();
        }
    }
}
