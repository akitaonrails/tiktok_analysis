package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919910a2v {
    public static final EnumC919910a2v FROM_AUTO_SHRINK_GUEST_WHEN_GUEST_LEAVE;
    public static final EnumC919910a2v FROM_DRAW_AND_GUESS;
    public static final EnumC919910a2v FROM_GUEST_MEDIA_MANAGE_FRAGMENT;
    public static final EnumC919910a2v FROM_HOST_ZOOM_SELF;
    public static final EnumC919910a2v FROM_MULTI_GUEST_GIFT_LEAF;
    public static final EnumC919910a2v FROM_MULTI_GUEST_LINKED_PREVIEW_FRAGMENT;
    public static final EnumC919910a2v FROM_MULTI_GUEST_MANAGE_PANEL;
    public static final EnumC919910a2v FROM_PLAYBOOK;
    public static final EnumC919910a2v FROM_RECEIVE_GUEST_SHRINK_IM;
    public static final /* synthetic */ EnumC919910a2v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC919910a2v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC919910a2v enumC919910a2v = new EnumC919910a2v("FROM_GUEST_MEDIA_MANAGE_FRAGMENT", 0);
        FROM_GUEST_MEDIA_MANAGE_FRAGMENT = enumC919910a2v;
        EnumC919910a2v enumC919910a2v2 = new EnumC919910a2v("FROM_MULTI_GUEST_GIFT_LEAF", 1);
        FROM_MULTI_GUEST_GIFT_LEAF = enumC919910a2v2;
        EnumC919910a2v enumC919910a2v3 = new EnumC919910a2v("FROM_AUTO_SHRINK_GUEST_WHEN_GUEST_LEAVE", 2);
        FROM_AUTO_SHRINK_GUEST_WHEN_GUEST_LEAVE = enumC919910a2v3;
        EnumC919910a2v enumC919910a2v4 = new EnumC919910a2v("FROM_RECEIVE_GUEST_SHRINK_IM", 3);
        FROM_RECEIVE_GUEST_SHRINK_IM = enumC919910a2v4;
        EnumC919910a2v enumC919910a2v5 = new EnumC919910a2v("FROM_HOST_ZOOM_SELF", 4);
        FROM_HOST_ZOOM_SELF = enumC919910a2v5;
        EnumC919910a2v enumC919910a2v6 = new EnumC919910a2v("FROM_MULTI_GUEST_LINKED_PREVIEW_FRAGMENT", 5);
        FROM_MULTI_GUEST_LINKED_PREVIEW_FRAGMENT = enumC919910a2v6;
        EnumC919910a2v enumC919910a2v7 = new EnumC919910a2v("FROM_DRAW_AND_GUESS", 6);
        FROM_DRAW_AND_GUESS = enumC919910a2v7;
        EnumC919910a2v enumC919910a2v8 = new EnumC919910a2v("FROM_MULTI_GUEST_MANAGE_PANEL", 7);
        FROM_MULTI_GUEST_MANAGE_PANEL = enumC919910a2v8;
        EnumC919910a2v enumC919910a2v9 = new EnumC919910a2v("FROM_PLAYBOOK", 8);
        FROM_PLAYBOOK = enumC919910a2v9;
        EnumC919910a2v[] enumC919910a2vArr = {enumC919910a2v, enumC919910a2v2, enumC919910a2v3, enumC919910a2v4, enumC919910a2v5, enumC919910a2v6, enumC919910a2v7, enumC919910a2v8, enumC919910a2v9};
        LL = enumC919910a2vArr;
        LLILLJJLI = new C2254308sP(enumC919910a2vArr);
    }

    public static EnumC919910a2v[] values() {
        return (EnumC919910a2v[]) LL.clone();
    }

    public static EnumC919910a2v valueOf(String str) {
        return (EnumC919910a2v) C08FF.LIZ(EnumC919910a2v.class, str);
    }

    public EnumC919910a2v(String str, int i) {
    }
}
