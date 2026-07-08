package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7O {
    public static final C0N7O IC_VISUAL_POET;
    public static final C0N7O IM_CHATROOM;
    public static final C0N7O IM_CHATROOM_PLAYGROUND;
    public static final /* synthetic */ C0N7O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0N7O> getEntries() {
        return LLILLL;
    }

    static {
        C0N7O c0n7o = new C0N7O("IM_CHATROOM", 0, "im_chatroom");
        IM_CHATROOM = c0n7o;
        C0N7O c0n7o2 = new C0N7O("IM_CHATROOM_PLAYGROUND", 1, "im_chatroom_playground");
        IM_CHATROOM_PLAYGROUND = c0n7o2;
        C0N7O c0n7o3 = new C0N7O("IC_VISUAL_POET", 2, "ic_visual_poet");
        IC_VISUAL_POET = c0n7o3;
        C0N7O[] c0n7oArr = {c0n7o, c0n7o2, c0n7o3};
        LLILLJJLI = c0n7oArr;
        LLILLL = new C2254308sP(c0n7oArr);
    }

    public static C0N7O[] values() {
        return (C0N7O[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static C0N7O valueOf(String str) {
        return (C0N7O) C08FF.LIZ(C0N7O.class, str);
    }

    public C0N7O(String str, int i, String str2) {
        this.LL = str2;
    }
}
