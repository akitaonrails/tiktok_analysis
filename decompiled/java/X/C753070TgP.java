package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.CppUnlockGuideDialogV2;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753070TgP {
    public static final /* synthetic */ int LIZ = 0;

    public static C0UFE LIZ(DataChannel dataChannel) {
        return LJFF(dataChannel, AFwS245S0000000_12.get$arr$(130), null);
    }

    public static C0UFE LIZIZ(DataChannel dataChannel) {
        return LJFF(dataChannel, AFwS245S0000000_12.get$arr$(131), null);
    }

    public static C0UFE LJFF(DataChannel dataChannel, Function1 function1, Function1 function12) {
        Boolean boolValueOf = null;
        if (dataChannel != null && dataChannel.gg0(LiveModeChannel.class) != null) {
            Room roomLIZ = C162100jj.LIZ(dataChannel);
            if (roomLIZ != null && roomLIZ.cppVersion == 1) {
                LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
                if (liveMode != null) {
                    boolValueOf = Boolean.valueOf(liveMode.isUsingCamera);
                }
                if (C500260Jjc.LJJIFFI(boolValueOf) || dataChannel.gg0(LiveModeChannel.class) == LiveMode.LIVE_VOICE) {
                    if (function12 != null) {
                        function12.invoke(C0UFE.ON);
                    }
                    return C0UFE.ON;
                }
            }
            Room roomLIZ2 = C162100jj.LIZ(dataChannel);
            if (roomLIZ2 != null && roomLIZ2.cppVersion == 2 && (dataChannel.gg0(LiveModeChannel.class) == LiveMode.LIVE_VOICE || dataChannel.gg0(LiveModeChannel.class) == LiveMode.THIRD_PARTY || dataChannel.gg0(LiveModeChannel.class) == LiveMode.LIVE_STUDIO)) {
                if (function12 != null) {
                    function12.invoke(C0UFE.ON);
                }
                return C0UFE.ON;
            }
            Object objGg0 = DataChannelGlobal.LLILZ.gg0(C931320aLK.class);
            if (objGg0 != null) {
                C0UFE c0ufe = (C0UFE) function1.invoke(objGg0);
                if (function12 != null) {
                    function12.invoke(c0ufe);
                }
                return c0ufe;
            }
            if (function12 != null) {
                function12.invoke(C0UFE.ON);
            }
            return C0UFE.ON;
        }
        if (function12 != null) {
            function12.invoke(C0UFE.ON);
        }
        return C0UFE.ON;
    }

    public static final C0UFE LIZJ(DataChannel dataChannel, Function1<? super AnchorLevelPermission, ? extends C0UFE> function1, Function1<? super C0UFE, Unit> function12, Function1<? super C474500IjA, C474500IjA> function13, String str, Boolean bool) {
        return LIZLLL(dataChannel, function1, function12, function13, str, bool, null, true);
    }

    public static final C0UFE LIZLLL(DataChannel dataChannel, Function1<? super AnchorLevelPermission, ? extends C0UFE> function1, Function1<? super C0UFE, Unit> function12, Function1<? super C474500IjA, C474500IjA> function13, String str, Boolean bool, WeakReference<InterfaceC978780bZs> weakReference, boolean z) {
        C0UFE c0ufeInvoke;
        boolean z2;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
            c0ufeInvoke = function1.invoke(anchorLevelPermission);
        } else {
            c0ufeInvoke = C0UFE.ON;
        }
        if (c0ufeInvoke == C0UFE.OFF) {
            Room roomLIZ = C162100jj.LIZ(dataChannel);
            if (roomLIZ != null && roomLIZ.cppVersion == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !Intrinsics.LJFF(str, C497740JfY.LJIJI(2131840781)) && !Intrinsics.LJFF(str, C497740JfY.LJIJI(2131840772)) && z) {
                if (dataChannel != null && (fragmentManager2 = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                    CppUnlockGuideDialogV2 cppUnlockGuideDialogV2 = new CppUnlockGuideDialogV2();
                    if (str != null) {
                        cppUnlockGuideDialogV2.LL = str;
                    }
                    cppUnlockGuideDialogV2.LLILLJJLI = null;
                    if (bool != null) {
                        cppUnlockGuideDialogV2.LLILZ = bool.booleanValue();
                    }
                    cppUnlockGuideDialogV2.LLILLL = function13;
                    cppUnlockGuideDialogV2.LLILZIL = weakReference;
                    cppUnlockGuideDialogV2.show(fragmentManager2, "");
                }
            } else {
                Room roomLIZ2 = C162100jj.LIZ(dataChannel);
                if (roomLIZ2 != null && roomLIZ2.cppVersion == 1 && z && dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                    C0TIH.LIZ(str, function13, bool, weakReference).show(fragmentManager, "");
                }
            }
        }
        if (function12 != null) {
            function12.invoke(c0ufeInvoke);
        }
        return c0ufeInvoke;
    }
}
