package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC046700Ev {
    public static final EnumC046700Ev DEFAULT;
    public static final /* synthetic */ EnumC046700Ev[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC046700Ev NEED_POLL;
    public static final EnumC046700Ev NO_NEED_POLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC046700Ev> getEntries() {
        return LLILLL;
    }

    static {
        EnumC046700Ev enumC046700Ev = new EnumC046700Ev(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC046700Ev;
        EnumC046700Ev enumC046700Ev2 = new EnumC046700Ev("NO_NEED_POLL", 1, 1);
        NO_NEED_POLL = enumC046700Ev2;
        EnumC046700Ev enumC046700Ev3 = new EnumC046700Ev("NEED_POLL", 2, 2);
        NEED_POLL = enumC046700Ev3;
        EnumC046700Ev[] enumC046700EvArr = {enumC046700Ev, enumC046700Ev2, enumC046700Ev3};
        LLILLJJLI = enumC046700EvArr;
        LLILLL = new C2254308sP(enumC046700EvArr);
    }

    public static EnumC046700Ev[] values() {
        return (EnumC046700Ev[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC046700Ev valueOf(String str) {
        return (EnumC046700Ev) C08FF.LIZ(EnumC046700Ev.class, str);
    }

    public EnumC046700Ev(String str, int i, int i2) {
        this.LL = i2;
    }
}
