package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0NbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597010NbH extends AbstractC597020NbI {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public final C596940NbA LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C597010NbH.class, "enterFrom", "getEnterFrom()Ljava/lang/String;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C597010NbH.class, "enterMethod", "getEnterMethod()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C597010NbH.class, "processId", "getProcessId()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C597010NbH.class, "takoSessionId", "getTakoSessionId()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C597010NbH.class, "videoSessionId", "getVideoSessionId()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR = new C2217371BqR(C597010NbH.class, "groupId", "getGroupId()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C597010NbH.class, "commandId", "getCommandId()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C597010NbH.class, "command", "getCommand()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C597010NbH.class, "result", "getResult()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C597010NbH.class, "commandSuccess", "getCommandSuccess()Z", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C597010NbH.class, "commandMessage", "getCommandMessage()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C597010NbH.class, "time", "getTime()I", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C597010NbH.class, "fromChannel", "getFromChannel()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(C597010NbH.class, "subCommand", "getSubCommand()Ljava/lang/String;", 0);
        c09r3.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217371BqR, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217371BqR2};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C597010NbH(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, int i, String str11) {
        super("tikbot_video_command_report");
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str, "enter_from", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str2, "enter_method", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str3, "process_id", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str4, "tako_session_id", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str5, "video_session_id", true));
        C596940NbA c596940NbA = new C596940NbA(null, "group_id", false);
        ((ArrayList) this.LIZIZ).add(c596940NbA);
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str7, "command_id", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str8, "command", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str9, "result", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(Boolean.valueOf(z), "command_success", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str10, "command_message", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(Integer.valueOf(i), "time", true));
        ((ArrayList) this.LIZIZ).add(new C596940NbA(str11, "from_channel", true));
        C596940NbA c596940NbA2 = new C596940NbA(null, "sub_command", false);
        ((ArrayList) this.LIZIZ).add(c596940NbA2);
        this.LIZJ = c596940NbA2;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZLLL;
        c596940NbA.LLILLL = str6;
    }
}
