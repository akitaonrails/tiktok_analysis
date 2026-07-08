package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC986300bm0 {
    public static final EnumC986300bm0 DID_CLICK_GO_BACK;
    public static final EnumC986300bm0 DID_REMOVE_PLAYBOOK_CANCEL;
    public static final EnumC986300bm0 DID_REMOVE_PLAYBOOK_CONFIRM;
    public static final EnumC986300bm0 DID_REMOVE_PLAYBOOK_SHOW;
    public static final EnumC986300bm0 DID_START_PLAYBOOK_CANCEL;
    public static final EnumC986300bm0 DID_START_PLAYBOOK_CONFIRM;
    public static final EnumC986300bm0 DID_START_PLAYBOOK_SHOW;
    public static final /* synthetic */ EnumC986300bm0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC986300bm0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC986300bm0 enumC986300bm0 = new EnumC986300bm0("DID_START_PLAYBOOK_SHOW", 0);
        DID_START_PLAYBOOK_SHOW = enumC986300bm0;
        EnumC986300bm0 enumC986300bm02 = new EnumC986300bm0("DID_START_PLAYBOOK_CONFIRM", 1);
        DID_START_PLAYBOOK_CONFIRM = enumC986300bm02;
        EnumC986300bm0 enumC986300bm03 = new EnumC986300bm0("DID_START_PLAYBOOK_CANCEL", 2);
        DID_START_PLAYBOOK_CANCEL = enumC986300bm03;
        EnumC986300bm0 enumC986300bm04 = new EnumC986300bm0("DID_REMOVE_PLAYBOOK_SHOW", 3);
        DID_REMOVE_PLAYBOOK_SHOW = enumC986300bm04;
        EnumC986300bm0 enumC986300bm05 = new EnumC986300bm0("DID_REMOVE_PLAYBOOK_CONFIRM", 4);
        DID_REMOVE_PLAYBOOK_CONFIRM = enumC986300bm05;
        EnumC986300bm0 enumC986300bm06 = new EnumC986300bm0("DID_REMOVE_PLAYBOOK_CANCEL", 5);
        DID_REMOVE_PLAYBOOK_CANCEL = enumC986300bm06;
        EnumC986300bm0 enumC986300bm07 = new EnumC986300bm0("DID_CLICK_GO_BACK", 6);
        DID_CLICK_GO_BACK = enumC986300bm07;
        EnumC986300bm0[] enumC986300bm0Arr = {enumC986300bm0, enumC986300bm02, enumC986300bm03, enumC986300bm04, enumC986300bm05, enumC986300bm06, enumC986300bm07};
        LL = enumC986300bm0Arr;
        LLILLJJLI = new C2254308sP(enumC986300bm0Arr);
    }

    public static EnumC986300bm0[] values() {
        return (EnumC986300bm0[]) LL.clone();
    }

    public static EnumC986300bm0 valueOf(String str) {
        return (EnumC986300bm0) C08FF.LIZ(EnumC986300bm0.class, str);
    }

    public EnumC986300bm0(String str, int i) {
    }
}
