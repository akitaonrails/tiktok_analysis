package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.NoticeboardStateChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0avK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class EnumC953640avK {
    public static final EnumC953640avK APPLIED;
    public static final EnumC953640avK END;
    public static final /* synthetic */ EnumC953640avK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC953640avK PENDING;
    public static final EnumC953640avK READY;
    public static final EnumC953640avK REVIEWING;
    public static final EnumC953640avK UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC953640avK> getEntries() {
        return LLILLL;
    }

    public void onStateDidChanged(Function0<Unit> function0) {
    }

    public void onStateWillChanged(int i) {
    }

    static {
        EnumC953640avK enumC953640avK = new EnumC953640avK("UNKNOWN", 0, 0);
        UNKNOWN = enumC953640avK;
        EnumC953640avK enumC953640avK2 = new EnumC953640avK("PENDING", 1, 1);
        PENDING = enumC953640avK2;
        EnumC953640avK enumC953640avK3 = new EnumC953640avK("APPLIED", 2, 2);
        APPLIED = enumC953640avK3;
        EnumC953640avK enumC953640avK4 = new EnumC953640avK("END", 3, 3);
        END = enumC953640avK4;
        EnumC953640avK enumC953640avK5 = new EnumC953640avK() { // from class: X.0avO
            @Override // X.EnumC953640avK
            public final void onStateDidChanged(Function0<Unit> function0) {
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // X.EnumC953640avK
            public final void onStateWillChanged(int i) {
                if (i == 3) {
                    Map mapLIZJ = C946850akN.LIZJ();
                    mapLIZJ.put("reason", "ready_time_out");
                    C946850akN.LJIILIIL("livesdk_multi_anchor_noticeboard_exception_end", mapLIZJ);
                }
            }
        };
        READY = enumC953640avK5;
        EnumC953640avK enumC953640avK6 = new EnumC953640avK() { // from class: X.0avP
            @Override // X.EnumC953640avK
            public final void onStateWillChanged(int i) {
                if (i == 3) {
                    Map mapLIZJ = C946850akN.LIZJ();
                    mapLIZJ.put("reason", "review_time_out");
                    C946850akN.LJIILIIL("livesdk_multi_anchor_noticeboard_exception_end", mapLIZJ);
                }
            }
        };
        REVIEWING = enumC953640avK6;
        EnumC953640avK[] enumC953640avKArr = {enumC953640avK, enumC953640avK2, enumC953640avK3, enumC953640avK4, enumC953640avK5, enumC953640avK6};
        LLILLJJLI = enumC953640avKArr;
        LLILLL = new C2254308sP(enumC953640avKArr);
    }

    public static EnumC953640avK[] values() {
        return (EnumC953640avK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC953640avK valueOf(String str) {
        return (EnumC953640avK) C08FF.LIZ(EnumC953640avK.class, str);
    }

    public EnumC953640avK(String str, int i, int i2) {
        this.LL = i2;
    }

    public final void trans(int i, DataChannel dataChannel, Function1<? super EnumC953640avK, Unit> function1, Function0<Unit> function0) {
        EnumC953640avK enumC953640avK;
        if (this.LL == i) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                enumC953640avK = UNKNOWN;
                            } else {
                                enumC953640avK = REVIEWING;
                            }
                        } else {
                            enumC953640avK = READY;
                        }
                    } else {
                        enumC953640avK = END;
                    }
                } else {
                    enumC953640avK = APPLIED;
                }
            } else {
                enumC953640avK = PENDING;
            }
        } else {
            enumC953640avK = UNKNOWN;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trans nowState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newState=");
        sbLIZ.append(enumC953640avK.LL);
        C20441214yg.LIZIZ("NoticeboardState", C2188811AlT.LIZIZ(sbLIZ));
        onStateWillChanged(enumC953640avK.LL);
        if (function1 != null) {
            function1.invoke(enumC953640avK);
        }
        if (dataChannel != null) {
            dataChannel.LC0(NoticeboardStateChangeEvent.class, Integer.valueOf(enumC953640avK.LL));
        }
        enumC953640avK.onStateDidChanged(function0);
    }
}
