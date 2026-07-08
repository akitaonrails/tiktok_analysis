package X;

import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ZtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914110ZtZ implements InterfaceC863600XuI {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
            case 3:
                LIZIZ$3(this, c0ymw);
                break;
            case 4:
                LIZIZ$4(this, c0ymw);
                break;
            case 5:
                LIZIZ$5(this, c0ymw);
                break;
            case 6:
                LIZIZ$6(this, c0ymw);
                break;
            case 7:
                LIZIZ$7(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
            case 4:
                onSuccess$4(this, obj);
                break;
            case 5:
                onSuccess$5(this, obj);
                break;
            case 6:
                onSuccess$6(this, obj);
                break;
            case 7:
                onSuccess$7(this, obj);
                break;
        }
    }

    public static final void LIZIZ$0(C914110ZtZ c914110ZtZ, C0YMW c0ymw) {
        String statusMsg;
        CompletionBlock completionBlock = (CompletionBlock) c914110ZtZ.l1;
        if (c0ymw == null || (statusMsg = c0ymw.getStatusMsg()) == null) {
            statusMsg = "unknown error";
        }
        C2382909Vj.LIZ(completionBlock, 9999, statusMsg, null, 4);
    }

    public static final void LIZIZ$1(C914110ZtZ c914110ZtZ, C0YMW c0ymw) {
        String statusMsg;
        String logId;
        String string;
        String string2;
        String checkMsg;
        String ext;
        CompletionBlock completionBlock = (CompletionBlock) c914110ZtZ.l1;
        if (c0ymw == null || (statusMsg = c0ymw.getStatusMsg()) == null) {
            statusMsg = "unknown error";
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC875750YXd.class, c914110ZtZ.s0);
        InterfaceC875750YXd interfaceC875750YXd = (InterfaceC875750YXd) xBaseModelLIZJ;
        interfaceC875750YXd.setSuccess(Boolean.FALSE);
        String statusMsg2 = null;
        if (c0ymw != null) {
            logId = c0ymw.getLogId();
        } else {
            logId = null;
        }
        interfaceC875750YXd.setLogId(logId);
        if (c0ymw != null) {
            string = Integer.valueOf(c0ymw.getStatus()).toString();
        } else {
            string = null;
        }
        interfaceC875750YXd.setStatusCode(string);
        if (c0ymw != null) {
            string2 = Long.valueOf(c0ymw.getCheck()).toString();
        } else {
            string2 = null;
        }
        interfaceC875750YXd.setCheckCode(string2);
        if (c0ymw != null) {
            checkMsg = c0ymw.getCheckMsg();
        } else {
            checkMsg = null;
        }
        interfaceC875750YXd.setCheckMsg(checkMsg);
        if (c0ymw != null) {
            ext = c0ymw.getExt();
        } else {
            ext = null;
        }
        interfaceC875750YXd.setExtraMsg(ext);
        if (c0ymw != null) {
            statusMsg2 = c0ymw.getStatusMsg();
        }
        interfaceC875750YXd.setErrorMsg(statusMsg2);
        completionBlock.onFailure(9999, statusMsg, (XBaseResultModel) xBaseModelLIZJ);
    }

    public static final void LIZIZ$2(C914110ZtZ c914110ZtZ, C0YMW c0ymw) {
        String statusMsg;
        CompletionBlock completionBlock = (CompletionBlock) c914110ZtZ.l1;
        if (c0ymw == null || (statusMsg = c0ymw.getStatusMsg()) == null) {
            statusMsg = "unknown error";
        }
        C2382909Vj.LIZ(completionBlock, 9999, statusMsg, null, 4);
    }

    public static final void LIZIZ$3(C914110ZtZ c914110ZtZ, C0YMW c0ymw) {
        String statusMsg;
        String logId;
        String string;
        String string2;
        String checkMsg;
        String ext;
        CompletionBlock completionBlock = (CompletionBlock) c914110ZtZ.l1;
        if (c0ymw == null || (statusMsg = c0ymw.getStatusMsg()) == null) {
            statusMsg = "unknown error";
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC875730YXb.class, c914110ZtZ.s0);
        InterfaceC875730YXb interfaceC875730YXb = (InterfaceC875730YXb) xBaseModelLIZJ;
        interfaceC875730YXb.setSuccess(Boolean.FALSE);
        String statusMsg2 = null;
        if (c0ymw != null) {
            logId = c0ymw.getLogId();
        } else {
            logId = null;
        }
        interfaceC875730YXb.setLogId(logId);
        if (c0ymw != null) {
            string = Integer.valueOf(c0ymw.getStatus()).toString();
        } else {
            string = null;
        }
        interfaceC875730YXb.setStatusCode(string);
        if (c0ymw != null) {
            string2 = Long.valueOf(c0ymw.getCheck()).toString();
        } else {
            string2 = null;
        }
        interfaceC875730YXb.setCheckCode(string2);
        if (c0ymw != null) {
            checkMsg = c0ymw.getCheckMsg();
        } else {
            checkMsg = null;
        }
        interfaceC875730YXb.setCheckMsg(checkMsg);
        if (c0ymw != null) {
            ext = c0ymw.getExt();
        } else {
            ext = null;
        }
        interfaceC875730YXb.setExtraMsg(ext);
        if (c0ymw != null) {
            statusMsg2 = c0ymw.getStatusMsg();
        }
        interfaceC875730YXb.setErrorMsg(statusMsg2);
        completionBlock.onFailure(9999, statusMsg, (XBaseResultModel) xBaseModelLIZJ);
    }

    public static final void LIZIZ$4(C914110ZtZ c914110ZtZ, C0YMW c0ymw) {
        String statusMsg;
        CompletionBlock completionBlock = (CompletionBlock) c914110ZtZ.l1;
        if (c0ymw == null || (statusMsg = c0ymw.getStatusMsg()) == null) {
            statusMsg = "unknown error";
        }
        C2382909Vj.LIZ(completionBlock, 9999, statusMsg, null, 4);
    }

    public static final void LIZIZ$5(C914110ZtZ c914110ZtZ, C0YMW c0ymw) {
        C0Y2D c0y2d = (C0Y2D) c914110ZtZ.l1;
        if (c0y2d.LJ && c0y2d.LJIIIZ != null) {
            C0Y2J c0y2jLIZJ = c0y2d.LIZJ.LJIIZILJ().LIZLLL().LIZJ();
            C0Y2D c0y2d2 = (C0Y2D) c914110ZtZ.l1;
            int i = c0y2d2.LJIIIIZZ;
            String str = c914110ZtZ.s0;
            DeleteConversationRequestBody deleteConversationRequestBody = c0y2d2.LJIIIZ.delete_conversation_body;
            C0Y2H c0y2h = c0y2jLIZJ.LIZIZ;
            if (c0y2h != null) {
                c0y2h.LIZIZ(i, str, deleteConversationRequestBody);
            }
        } else {
            c0y2d.LIZ(C0YIN.LJFF(c0y2d.LIZJ, -9999));
        }
        C870460YCu c870460YCuLIZ = ((C0Y2D) c914110ZtZ.l1).LIZJ.LJIIZILJ().LJFF().LIZ();
        String str2 = c914110ZtZ.s0;
        C0Y2D c0y2d3 = (C0Y2D) c914110ZtZ.l1;
        c870460YCuLIZ.LJI(str2, c0y2d3.LJ, c0y2d3.LJFF, c0y2d3.LJII, c0y2d3.LJI, false, true, c0ymw);
    }

    public static final void LIZIZ$6(C914110ZtZ c914110ZtZ, C0YMW c0ymw) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create onFailure[");
        sbLIZ.append(c914110ZtZ.s0);
        sbLIZ.append("]: ");
        sbLIZ.append(c0ymw);
        C882690Yjz.LJFF("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ));
        ((C874760YTi) c914110ZtZ.l1).LIZIZ(c914110ZtZ.s0);
        ((C874760YTi) c914110ZtZ.l1).LL.LJFF(c914110ZtZ.s0, true, c0ymw);
    }

    public static final void LIZIZ$7(C914110ZtZ c914110ZtZ, C0YMW c0ymw) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pull conversation[");
        sbLIZ.append(c914110ZtZ.s0);
        sbLIZ.append("]: ");
        sbLIZ.append(c0ymw);
        C882690Yjz.LJFF("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ));
        ((C874760YTi) c914110ZtZ.l1).LIZIZ(c914110ZtZ.s0);
        ((C874760YTi) c914110ZtZ.l1).LL.LJFF(c914110ZtZ.s0, true, c0ymw);
    }

    public static final void onSuccess$0(C914110ZtZ c914110ZtZ, Object obj) {
        ((CompletionBlock) c914110ZtZ.l1).onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0YYV.class, c914110ZtZ.s0), "");
    }

    public static final void onSuccess$1(C914110ZtZ c914110ZtZ, Object obj) {
        CompletionBlock completionBlock = (CompletionBlock) c914110ZtZ.l1;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC875750YXd.class, c914110ZtZ.s0);
        ((InterfaceC875750YXd) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void onSuccess$2(C914110ZtZ c914110ZtZ, Object obj) {
        CompletionBlock completionBlock = (CompletionBlock) c914110ZtZ.l1;
        XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(c914110ZtZ.s0, C13LE.LIZ(C0YYO.class));
        C0YYO c0yyo = (C0YYO) xBaseModelLIZJ;
        c0yyo.setCode(1);
        c0yyo.setMsg("success");
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void onSuccess$3(C914110ZtZ c914110ZtZ, Object obj) {
        CompletionBlock completionBlock = (CompletionBlock) c914110ZtZ.l1;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC875730YXb.class, c914110ZtZ.s0);
        ((InterfaceC875730YXb) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void onSuccess$4(C914110ZtZ c914110ZtZ, Object obj) {
        ((CompletionBlock) c914110ZtZ.l1).onSuccess((XBaseResultModel) C1549500qQO.LIZJ(c914110ZtZ.s0, C13LE.LIZ(InterfaceC2399309ah.class)), "");
    }

    public static final void onSuccess$5(C914110ZtZ c914110ZtZ, Object obj) {
        C0Y2D c0y2d = (C0Y2D) c914110ZtZ.l1;
        c0y2d.LJFF = true;
        c0y2d.LJIIJ = true;
        ((C0Y2D) c914110ZtZ.l1).LJIIJJI(c914110ZtZ.s0, false);
    }

    public static final void onSuccess$6(C914110ZtZ c914110ZtZ, Object obj) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create onSuccess[");
        sbLIZ.append(c914110ZtZ.s0);
        sbLIZ.append(']');
        C882690Yjz.LJIIIZ("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ));
        ((C874760YTi) c914110ZtZ.l1).LLILLJJLI.LIZ().LJFF(c914110ZtZ.s0);
        ((C874760YTi) c914110ZtZ.l1).LIZIZ(c914110ZtZ.s0);
        ((C874760YTi) c914110ZtZ.l1).LL.LJFF(c914110ZtZ.s0, false, null);
    }

    public static final void onSuccess$7(C914110ZtZ c914110ZtZ, Object obj) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pull conversation onSuccess[");
        sbLIZ.append(c914110ZtZ.s0);
        sbLIZ.append(']');
        C882690Yjz.LJIIIZ("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ));
        ((C874760YTi) c914110ZtZ.l1).LIZIZ(c914110ZtZ.s0);
        ((C874760YTi) c914110ZtZ.l1).LL.LJFF(c914110ZtZ.s0, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C914110ZtZ(Object obj, CompletionBlock<C0YYV> completionBlock, String str) {
        this.$t = str;
        this.l1 = obj;
        this.s0 = completionBlock;
    }
}
