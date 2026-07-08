package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: X.0ILe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464960ILe implements WeakHandler.IHandler, InterfaceC465000ILi {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final LiveMode LLILZIL;
    public C463990IHl LLILZLL;
    public final InterfaceC463940IHg LLIZLLLIL;
    public final long LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public String LLJJI;
    public final String LLJJIII;
    public final boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public C463950IHh LLJJJJ;
    public String LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final long LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public C463950IHh LLJLL;
    public final HashMap<String, String> LLJLLIL;
    public final HashMap<String, String> LLJLLL;
    public final String LLJZ;
    public final boolean LLJZIJLIL;
    public final Queue<BaseMessage> LLJL = new LinkedList();
    public boolean LLJLIL = false;
    public boolean LLJLILLLLZIIL = false;
    public final List<Long> LLJJIJIL = null;
    public final WeakHandler LLIZ = new WeakHandler(Looper.getMainLooper(), this);

    public final void LIZJ() {
        this.LLJLILLLLZIIL = false;
        this.LLJLIL = true;
        this.LLJLL = null;
        this.LLIZ.removeCallbacksAndMessages(null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterRoomController stop roomid :");
        sbLIZ.append(this.LLJ);
        C20441214yg.LJIIIZ("PreFetchRoomInfoManager", C2188811AlT.LIZIZ(sbLIZ));
        ((LinkedList) this.LLJL).clear();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String str;
        Room room;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        this.LLJJ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMsg roomid :");
        sbLIZ.append(this.LLJ);
        C20441214yg.LJIIIZ("PreFetchRoomInfoManager", C2188811AlT.LIZIZ(sbLIZ));
        int i = message.what;
        boolean z = true;
        if (i == 57) {
            if (message.arg1 != 1) {
                z = false;
            }
            this.LLJLILLLLZIIL = z;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("set mIsFetching to ");
            sbLIZ2.append(this.LLJLILLLLZIIL);
            sbLIZ2.append(" for notifyEnterRoomToRemote, roomid: ");
            sbLIZ2.append(this.LLJ);
            C20441214yg.LJIIIZ("PreFetchRoomInfoManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (i == 32) {
            if (!this.LLJLIL) {
                if (HandlerHook.getMessageObj(message.obj) instanceof Throwable) {
                    LIZ(0, "finish_abnormal fail", null, null);
                    return;
                } else {
                    LIZIZ(this.LLJJI, null, true, false);
                    return;
                }
            }
            return;
        }
        if (i == 4 && this.LLJLILLLLZIIL) {
            if (HandlerHook.getMessageObj(message.obj) instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) HandlerHook.getMessageObj(message.obj);
                C476730Iml.LIZ(HandlerHook.getMessageObj(message.obj), Long.valueOf(this.LLJ), this.LLJIJIL, this.LL, this.LLJZ);
                LIZ(c501470JlZ.getErrorCode(), c501470JlZ.getErrorMsg(), c501470JlZ.getPrompt(), c501470JlZ.getExtra());
                return;
            }
            if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
                C476730Iml.LIZ(HandlerHook.getMessageObj(message.obj), Long.valueOf(this.LLJ), this.LLJIJIL, this.LL, this.LLJZ);
                LIZ(0, HandlerHook.getMessageObj(message.obj).toString(), null, null);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleMsg success roomid :");
            sbLIZ3.append(this.LLJ);
            C20441214yg.LJIIIZ("PreFetchRoomInfoManager", C2188811AlT.LIZIZ(sbLIZ3));
            if ((HandlerHook.getMessageObj(message.obj) instanceof C463950IHh) && ((C463950IHh) HandlerHook.getMessageObj(message.obj)).LIZ != null && Room.isValid(((C463950IHh) HandlerHook.getMessageObj(message.obj)).LIZ)) {
                C463950IHh c463950IHh = (C463950IHh) HandlerHook.getMessageObj(message.obj);
                boolean zLJI = MethodIDManager.LJI(71742);
                this.LLJLL = c463950IHh;
                this.LLJLILLLLZIIL = false;
                this.LLIZLLLIL.LIZJ(c463950IHh);
                if (c463950IHh != null && (room = c463950IHh.LIZ) != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) != null) {
                    C924810aAp.LJ().LJJIIJ = (int) multiLiveUserApplyPermission.multiGuestResetPointAfterLeave;
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            if (!(HandlerHook.getMessageObj(message.obj) instanceof C463950IHh)) {
                str = "response unexpected";
            } else if (((C463950IHh) HandlerHook.getMessageObj(message.obj)).LIZ == null) {
                str = "room is null";
            } else {
                str = "invalid room data";
            }
            LIZ(0, str, null, null);
        }
    }

    public final void LIZ(int i, String str, String str2, String str3) {
        this.LLILZLL = new C463990IHl(i, str, str2);
        this.LLJLILLLLZIIL = false;
        this.LLIZLLLIL.LIZLLL(i, str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x045d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final void LIZIZ(java.lang.String r60, java.lang.String r61, final boolean r62, boolean r63) {
        /*
            Method dump skipped, instruction units count: 1640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464960ILe.LIZIZ(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public C464960ILe(InterfaceC463940IHg interfaceC463940IHg, long j, String str, String str2, String str3, String str4, String str5, String str6, HashMap map, String str7, String str8, HashMap map2, String str9, boolean z, String str10, String str11, LiveMode liveMode, boolean z2, String str12, String str13, int i, long j2) {
        this.LLJZIJLIL = false;
        this.LLIZLLLIL = interfaceC463940IHg;
        this.LLJ = j;
        this.LLJI = str;
        this.LLJIJIL = str2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = str4;
        this.LLJJLIIIJLLLLLLLZ = str5;
        this.LLJJIII = str6;
        this.LLJLLIL = map;
        this.LL = str7;
        this.LLILLJJLI = str8;
        this.LLJLLL = map2;
        this.LLJZ = str9;
        this.LLJZIJLIL = z;
        this.LLILLL = str10;
        this.LLILZ = str11;
        this.LLILZIL = liveMode;
        this.LLJJIJI = z2;
        this.LLJJJ = str12;
        this.LLJJJIL = str13;
        this.LLJJJJLIIL = i;
        this.LLJJL = j2;
    }
}
