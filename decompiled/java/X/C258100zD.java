package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.livesdk.game.model.GuessOptions;
import com.bytedance.android.livesdk.game.model.GuessRankUserInfo;
import com.bytedance.android.livesdk.game.model.GuessRound;
import com.bytedance.android.livesdk.game.model.GuessText;
import com.bytedance.android.livesdk.game.model.GuessWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.host_board.BoardCell;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.ImageStyle;
import webcast.data.host_board.Padding;

/* JADX INFO: renamed from: X.00zD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C258100zD implements InterfaceC259900zV {
    public final boolean LIZ;
    public DataChannel LIZIZ;
    public String LIZJ = "INVALID";
    public InterfaceC420801kM LIZLLL;
    public InterfaceC420801kM LJ;
    public C258200zE LJFF;
    public C11JF LJI;
    public boolean LJII;
    public HostBoard LJIIIIZZ;
    public long LJIIIZ;
    public EnumC258900zL LJIIJ;
    public GuessRankUserInfo LJIIJJI;

    public final void LJI() {
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZJ = "INVALID";
        this.LJII = false;
        InterfaceC420801kM interfaceC420801kM = this.LIZLLL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        InterfaceC420801kM interfaceC420801kM2 = this.LJ;
        if (interfaceC420801kM2 != null) {
            interfaceC420801kM2.dispose();
        }
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C258200zE c258200zE = this.LJFF;
        if (c258200zE != null) {
            C466310IQj c466310IQj = c258200zE.LJFF;
            if (c466310IQj != null) {
                c466310IQj.LIZ();
            }
            C466310IQj c466310IQj2 = c258200zE.LJI;
            if (c466310IQj2 != null) {
                c466310IQj2.LIZ();
            }
            C466310IQj c466310IQj3 = c258200zE.LJII;
            if (c466310IQj3 != null) {
                c466310IQj3.LIZ();
            }
            c258200zE.LJI = null;
            c258200zE.LJII = null;
            c258200zE.LJFF = null;
            c258200zE.LIZJ = EnumC258900zL.IDLE;
            c258200zE.LIZLLL = false;
            c258200zE.LJ.clear();
            c258200zE.LJIIJ = null;
            c258200zE.LJIIIIZZ = null;
            c258200zE.LJIIIZ = null;
        }
        this.LJIIIIZZ = null;
        this.LJIIIZ = 0L;
        this.LJIIJ = null;
        this.LJIIJJI = null;
    }

    public C258100zD(boolean z) {
        this.LIZ = z;
    }

    public static String LIZIZ(GuessWidget guessWidget) {
        GuessRound guessRound;
        GuessOptions next;
        String strLIZIZ;
        if (guessWidget == null || (guessRound = guessWidget.guessRound) == null) {
            return "";
        }
        if (guessRound.guessStatus == 20) {
            return C497740JfY.LJIJI(2131852802);
        }
        String str = guessRound.correctedOption;
        if (a0.LJJJIL(str)) {
            str = guessRound.winOption;
        }
        if (str != null && !a0.LJJJIL(str)) {
            String str2 = null;
            if ((!false) && str != null) {
                Iterator<GuessOptions> it2 = guessRound.guessOptions.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.optionIdStr, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                GuessOptions guessOptions = next;
                if (guessOptions == null) {
                    return "";
                }
                GuessText guessText = guessOptions.text;
                if (guessText != null) {
                    strLIZIZ = guessText.desc;
                } else {
                    strLIZIZ = null;
                }
                if (!C123100dR.LIZ(strLIZIZ) || strLIZIZ == null) {
                    C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                    GuessText guessText2 = guessOptions.text;
                    if (guessText2 != null) {
                        str2 = guessText2.key;
                    }
                    c1124870fNVLIZJ.getClass();
                    strLIZIZ = C1124870fNV.LIZIZ(str2);
                    if (strLIZIZ == null) {
                        return "";
                    }
                }
                return strLIZIZ;
            }
        }
        return "";
    }

    public final void LJFF(DataChannel dataChannel) {
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZIZ = dataChannel;
        this.LJII = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02bd  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdk.game.model.GuessWidgets r18, com.bytedance.android.livesdk.game.model.GuessWidgets r19) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258100zD.LJ(com.bytedance.android.livesdk.game.model.GuessWidgets, com.bytedance.android.livesdk.game.model.GuessWidgets):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C258100zD r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258100zD.LIZJ(X.00zD, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071 A[PHI: r2
      0x0071: PHI (r2v71 java.lang.String) = (r2v70 java.lang.String), (r2v75 java.lang.String) binds: [B:28:0x004d, B:37:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4 A[PHI: r2
      0x00f4: PHI (r2v55 long) = (r2v54 long), (r2v61 long) binds: [B:71:0x00f1, B:62:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v81 */
    @Override // X.InterfaceC259900zV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.EnumC258900zL r23, boolean r24, com.bytedance.android.livesdk.game.model.GuessWidget r25, com.bytedance.android.livesdk.game.model.GuessWidget r26, com.bytedance.android.livesdk.game.model.GuessRankUserInfo r27) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258100zD.LIZ(X.00zL, boolean, com.bytedance.android.livesdk.game.model.GuessWidget, com.bytedance.android.livesdk.game.model.GuessWidget, com.bytedance.android.livesdk.game.model.GuessRankUserInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C258100zD r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.bytedance.android.livesdk.game.model.GuessRankUserInfo r11, int r12) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258100zD.LIZLLL(X.00zD, java.lang.String, java.lang.String, java.lang.String, com.bytedance.android.livesdk.game.model.GuessRankUserInfo, int):void");
    }

    public static void LJII(C258100zD c258100zD, String str, GuessRankUserInfo guessRankUserInfo, String str2, Long l, int i) {
        C011V c011v;
        long jLJJLIIIJ;
        LifecycleOwner lifecycleOwner;
        LifecycleOwner lifecycleOwner2;
        GuessRankUserInfo guessRankUserInfo2 = guessRankUserInfo;
        String str3 = str2;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            guessRankUserInfo2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            l = null;
        }
        c258100zD.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (c258100zD.LIZ) {
            c011v = C011V.BROADCAST;
        } else {
            c011v = C011V.AUDIENCE;
        }
        DataChannel dataChannel = c258100zD.LIZIZ;
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        IBillboardService iBillboardService = (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
        final HostBoard hostBoard = new HostBoard();
        hostBoard.boardId = "game_guess";
        hostBoard.bizType = "game";
        hostBoard.subBizType = "game_guess";
        List<BoardCell> list = hostBoard.cellList;
        BoardCell boardCell = new BoardCell();
        boardCell.type = "title";
        boardCell.text = C20642515q3.LJI(2131852519);
        boardCell.alignment = 2;
        boardCell.id = "guess_title";
        list.add(boardCell);
        BoardCell boardCell2 = new BoardCell();
        boardCell2.type = "divider_line";
        boardCell2.alignment = 2;
        Padding padding = new Padding();
        padding.paddingTop = 8;
        boardCell2.padding = padding;
        boardCell2.id = "guess_divider";
        list.add(boardCell2);
        if (str != null) {
            BoardCell boardCell3 = new BoardCell();
            boardCell3.type = "text";
            boardCell3.text = str;
            boardCell3.alignment = 2;
            Padding padding2 = new Padding();
            padding2.paddingTop = 8;
            boardCell3.padding = padding2;
            boardCell3.id = "guess_content";
            list.add(boardCell3);
        }
        if (guessRankUserInfo2 != null) {
            BoardCell boardCell4 = new BoardCell();
            boardCell4.type = "image";
            ImageStyle imageStyle = new ImageStyle();
            imageStyle.round = true;
            boardCell4.imageStyle = imageStyle;
            boardCell4.alignment = 2;
            ImageModel imageModel = new ImageModel();
            C842240X2g.LIZ(imageModel).add(guessRankUserInfo2.avatarUri);
            imageModel.width = 28;
            imageModel.height = 28;
            boardCell4.image = imageModel;
            Padding padding3 = new Padding();
            padding3.paddingTop = 8;
            boardCell4.padding = padding3;
            boardCell4.id = "guess_image";
            list.add(boardCell4);
        }
        if (l != null) {
            BoardCell boardCell5 = new BoardCell();
            boardCell5.type = "text_trailing_image";
            boardCell5.text = l.toString();
            Padding padding4 = new Padding();
            padding4.paddingTop = 6;
            boardCell5.padding = padding4;
            boardCell5.alignment = 2;
            boardCell5.id = "guess_one_settle_text";
            list.add(boardCell5);
        }
        if (str3 != null) {
            BoardCell boardCell6 = new BoardCell();
            boardCell6.type = "text";
            boardCell6.text = str3;
            Padding padding5 = new Padding();
            padding5.paddingTop = 6;
            boardCell6.padding = padding5;
            boardCell6.alignment = 2;
            boardCell6.id = "guess_sub_text";
            list.add(boardCell6);
        }
        Padding padding6 = new Padding();
        padding6.paddingLeft = 8;
        padding6.paddingRight = 8;
        padding6.paddingTop = 8;
        padding6.paddingBottom = 8;
        hostBoard.padding = padding6;
        c258100zD.LJIIIIZZ = hostBoard;
        if (Intrinsics.LJFF(c258100zD.LIZJ, "INVALID")) {
            c258100zD.LIZJ = iBillboardService.r92(new InterfaceC201500q5() { // from class: X.00zY
                @Override // X.InterfaceC201500q5
                public final HostBoard LIZ() {
                    return hostBoard;
                }
            }, c011v, Long.valueOf(jLJJLIIIJ), null);
            DataChannel dataChannel2 = c258100zD.LIZIZ;
            if (dataChannel2 != null && (lifecycleOwner2 = dataChannel2.LLILZ) != null) {
                InterfaceC420801kM interfaceC420801kM = c258100zD.LIZLLL;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                c258100zD.LIZLLL = C784440Upu.LIZ().LIZJ(lifecycleOwner2, C260100zX.class).LIZJ(new C516201zk(c258100zD, 323));
            }
            DataChannel dataChannel3 = c258100zD.LIZIZ;
            if (dataChannel3 != null && (lifecycleOwner = dataChannel3.LLILZ) != null) {
                InterfaceC420801kM interfaceC420801kM2 = c258100zD.LJ;
                if (interfaceC420801kM2 != null) {
                    interfaceC420801kM2.dispose();
                }
                c258100zD.LJ = C784440Upu.LIZ().LIZJ(lifecycleOwner, C260600zc.class).LIZJ(new C516201zk(c258100zD, 322));
                return;
            }
            return;
        }
        hostBoard.boardId = c258100zD.LIZJ;
        iBillboardService.Ox1(new InterfaceC201500q5() { // from class: X.00zZ
            @Override // X.InterfaceC201500q5
            public final HostBoard LIZ() {
                return hostBoard;
            }
        }, c011v, Long.valueOf(jLJJLIIIJ));
    }
}
