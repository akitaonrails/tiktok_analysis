package X;

import Y.AcS498S0100000_27;
import android.content.Context;
import com.bytedance.android.live.NativeDecorationOperationEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS129S0400000_35;
import kotlin.jvm.internal.AwS244S0300000_35;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0xhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1828990xhB {
    public static final C1828990xhB LIZ = new C1828990xhB();

    public static void LIZJ(DataChannel dataChannel) {
        AbstractC1700910uMb abstractC1700910uMb;
        String string;
        InterfaceC390601fU effectBoardService;
        C1700890uMZ c1700890uMZ;
        AnonymousClass0951 anonymousClass0951LJIIL;
        InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
        Board board = null;
        if (boardsDisplayStateManager != null && (anonymousClass0951LJIIL = boardsDisplayStateManager.LJIIL()) != null) {
            abstractC1700910uMb = (AbstractC1700910uMb) anonymousClass0951LJIIL.getValue();
        } else {
            abstractC1700910uMb = null;
        }
        if ((abstractC1700910uMb instanceof C1700890uMZ) && (c1700890uMZ = (C1700890uMZ) abstractC1700910uMb) != null) {
            board = c1700890uMZ.LIZ;
        }
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        String str = "";
        if (iEffectService != null && (effectBoardService = iEffectService.getEffectBoardService("anchor", "")) != null) {
            effectBoardService.LJII(false);
        }
        if (boardsDisplayStateManager != null) {
            boardsDisplayStateManager.LJIIJJI();
        }
        if (board != null && dataChannel != null) {
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            if (roomLJJLIIIIJ != null && (string = Long.valueOf(roomLJJLIIIIJ.getId()).toString()) != null) {
                str = string;
            }
            dataChannel.LC0(NativeDecorationOperationEvent.class, new C443120HZe(board, str, 3));
        }
    }

    public static void LIZLLL(DataChannel dataChannel, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_background_conflict_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "conflict_function");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(DataChannel dataChannel, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sticker_conflict_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str2, "conflict_function");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(Context context, DataChannel dataChannel, String str, LiveEffect liveEffect, Function0 function0, Function0 function02) {
        switch (str.hashCode()) {
            case -1890252483:
                if (str.equals("sticker")) {
                    C0UFH.LIZ(str, liveEffect, new AwS244S0300000_35(context, dataChannel, function0, 2), new AwS571S0100000_27(function0, (Function0<Unit>) 38));
                }
                break;
            case -1527670528:
                if (str.equals("live_boards")) {
                    C0UFH.LIZ(str, liveEffect, new AwS129S0400000_35(context, (Context) dataChannel, (DataChannel) function02, (Function0<Unit>) function0, (Function0<Unit>) 1), new AwS571S0100000_27(function0, (Function0<Unit>) 40));
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    C0UFH.LIZ(str, liveEffect, new AwS244S0300000_35(context, dataChannel, function0, 3), new AwS571S0100000_27(function0, (Function0<Unit>) 39));
                }
                break;
            case 1008614022:
                if (str.equals("live_goal")) {
                    C0UFH.LIZ(str, liveEffect, new AwS244S0300000_35(context, dataChannel, function0, 4), new AwS571S0100000_27(function0, (Function0<Unit>) 37));
                }
                break;
        }
    }

    public static void LJFF(Context context, int i, int i2, int i3, int i4, Function0 function0, Function0 function02) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(i);
        c782110Um9.LJII(i2);
        c782110Um9.LJIILIIL(i3, new AcS498S0100000_27(function0, 0));
        c782110Um9.LJIIJ(i4, new AcS498S0100000_27(function02, 1));
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }
}
