package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1906970zix {
    public static final EnumC1906970zix FOLLOW_REQUEST;
    public static final EnumC1906970zix INBOX;
    public static final /* synthetic */ EnumC1906970zix[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public EnumC1906970zix() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1906970zix> getEntries() {
        return LLILLJJLI;
    }

    public abstract String getEnterFrom();

    static {
        EnumC1906970zix enumC1906970zix = new EnumC1906970zix() { // from class: X.0ziy
            public final String LLILLL = "notification_page";

            @Override // X.EnumC1906970zix
            public final String getEnterFrom() {
                return this.LLILLL;
            }
        };
        INBOX = enumC1906970zix;
        EnumC1906970zix enumC1906970zix2 = new EnumC1906970zix() { // from class: X.0ziz
            public final String LLILLL = "follow_request";

            @Override // X.EnumC1906970zix
            public final String getEnterFrom() {
                return this.LLILLL;
            }
        };
        FOLLOW_REQUEST = enumC1906970zix2;
        EnumC1906970zix[] enumC1906970zixArr = {enumC1906970zix, enumC1906970zix2};
        LL = enumC1906970zixArr;
        LLILLJJLI = new C2254308sP(enumC1906970zixArr);
    }

    public static EnumC1906970zix[] values() {
        return (EnumC1906970zix[]) LL.clone();
    }

    public static EnumC1906970zix valueOf(String str) {
        return (EnumC1906970zix) C08FF.LIZ(EnumC1906970zix.class, str);
    }

    public EnumC1906970zix(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
